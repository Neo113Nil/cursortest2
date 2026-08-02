package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes13.dex */
public final class Z9 {
    public static final Z9 a = new Z9();

    private Z9() {
    }

    public static final <T> T a(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static final boolean a(Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(Object obj, String str) {
        return a(obj, str, false, 4, null);
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return a(obj, str, z);
    }

    public static final boolean a(Object obj, String str, boolean z) {
        if (obj != null) {
            return true;
        }
        if (z) {
            throw new NullPointerException(str);
        }
        if (!z) {
            IronLog.API.error(str);
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
