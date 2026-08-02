package org.chromium.base;

import internal.org.chromium.build.NullUtil;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;

/* loaded from: classes10.dex */
public final class UserDataHost {
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();
    private HashMap<Class<? extends UserData>, UserData> mUserDataMap = new HashMap<>();

    private void checkThreadAndState() {
        this.mThreadChecker.assertOnValidThread();
        if (this.mUserDataMap == null) {
            throw new IllegalStateException("Operation is not allowed after destroy().");
        }
    }

    public <T extends UserData> T setUserData(Class<T> key, T object) {
        checkThreadAndState();
        if (key == null || object == null) {
            throw new IllegalArgumentException();
        }
        this.mUserDataMap.put(key, object);
        return (T) NullUtil.assumeNonNull(getUserData(key));
    }

    public <T extends UserData> T getUserData(Class<T> key) {
        checkThreadAndState();
        if (key == null) {
            throw new IllegalArgumentException();
        }
        return key.cast(this.mUserDataMap.get(key));
    }

    public <T extends UserData> T removeUserData(Class<T> key) {
        checkThreadAndState();
        if (key == null) {
            throw new IllegalArgumentException();
        }
        UserData remove = this.mUserDataMap.remove(key);
        if (remove == null) {
            throw new IllegalStateException("UserData for the key is not present.");
        }
        return key.cast(remove);
    }

    public void destroy() {
        checkThreadAndState();
        HashMap<Class<? extends UserData>, UserData> hashMap = this.mUserDataMap;
        this.mUserDataMap = null;
        Iterator<UserData> it = hashMap.values().iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }
}
