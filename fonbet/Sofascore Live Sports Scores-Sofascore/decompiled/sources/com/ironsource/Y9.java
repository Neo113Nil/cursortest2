package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.yhk;
import defpackage.zzl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y9 {

    @NotNull
    public static final Y9 a = new Y9();

    private Y9() {
    }

    public static final boolean a(@Nullable Object obj, @NotNull String str, boolean z) {
        str.getClass();
        if (obj != null) {
            return true;
        }
        if (z) {
            yhk.s(str);
            return false;
        }
        if (z) {
            zzl.b();
            return false;
        }
        IronLog.API.error(str);
        return false;
    }

    public static final boolean a(@Nullable Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(@Nullable Object obj, @NotNull String str) {
        str.getClass();
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

    public static final <T> T a(@Nullable T t, T t2) {
        return t == null ? t2 : t;
    }
}
