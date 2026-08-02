package org.chromium.base;

import internal.org.chromium.build.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.base.UnownedUserData;

/* loaded from: classes10.dex */
public final class UnownedUserDataKey<T extends UnownedUserData> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Class<T> mClazz;
    private final Set<UnownedUserDataHost> mWeakHostAttachments = Collections.newSetFromMap(new WeakHashMap());

    public UnownedUserDataKey(Class<T> clazz) {
        this.mClazz = clazz;
    }

    final Class<T> getValueClass() {
        return this.mClazz;
    }

    public final void attachToHost(UnownedUserDataHost host, T object) {
        Objects.requireNonNull(object);
        host.set(this, object);
        if (isAttachedToHost(host)) {
            return;
        }
        this.mWeakHostAttachments.add(host);
    }

    public final T retrieveDataFromHost(UnownedUserDataHost unownedUserDataHost) {
        assertNoDestroyedAttachments();
        Iterator<UnownedUserDataHost> it = this.mWeakHostAttachments.iterator();
        while (it.hasNext()) {
            if (unownedUserDataHost.equals(it.next())) {
                return (T) unownedUserDataHost.get(this);
            }
        }
        return null;
    }

    public final void detachFromHost(UnownedUserDataHost host) {
        assertNoDestroyedAttachments();
        Iterator it = new ArrayList(this.mWeakHostAttachments).iterator();
        while (it.hasNext()) {
            UnownedUserDataHost unownedUserDataHost = (UnownedUserDataHost) it.next();
            if (host.equals(unownedUserDataHost)) {
                removeHostAttachment(unownedUserDataHost);
            }
        }
    }

    public final void detachFromAllHosts(T object) {
        assertNoDestroyedAttachments();
        Iterator it = new ArrayList(this.mWeakHostAttachments).iterator();
        while (it.hasNext()) {
            UnownedUserDataHost unownedUserDataHost = (UnownedUserDataHost) it.next();
            if (object.equals(unownedUserDataHost.get(this))) {
                removeHostAttachment(unownedUserDataHost);
            }
        }
    }

    public final boolean isAttachedToHost(UnownedUserDataHost host) {
        return retrieveDataFromHost(host) != null;
    }

    public final boolean isAttachedToAnyHost(T object) {
        return getHostAttachmentCount(object) > 0;
    }

    int getHostAttachmentCount(T object) {
        assertNoDestroyedAttachments();
        Iterator<UnownedUserDataHost> it = this.mWeakHostAttachments.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (object.equals(it.next().get(this))) {
                i++;
            }
        }
        return i;
    }

    private void removeHostAttachment(UnownedUserDataHost host) {
        host.remove(this);
        this.mWeakHostAttachments.remove(host);
    }

    private void assertNoDestroyedAttachments() {
        if (BuildConfig.ENABLE_ASSERTS) {
            Iterator<UnownedUserDataHost> it = this.mWeakHostAttachments.iterator();
            while (it.hasNext()) {
                if (it.next().isDestroyed()) {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
