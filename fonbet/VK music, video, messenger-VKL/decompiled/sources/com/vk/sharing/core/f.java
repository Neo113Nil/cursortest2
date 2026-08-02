package com.vk.sharing.core;

import androidx.annotation.NonNull;

/* compiled from: PresenterDelegateToIntAdapter.java */
/* loaded from: classes5.dex */
public final class f {
    public static int a(@NonNull a aVar) {
        Class<?> cls = aVar.getClass();
        if (c.class.equals(cls)) {
            return 2;
        }
        if (h.class.equals(cls)) {
            return 3;
        }
        if (d.class.equals(cls)) {
            return 4;
        }
        if (e.class.equals(cls)) {
            return 5;
        }
        return i.class.equals(cls) ? 6 : 1;
    }

    @NonNull
    public static a b(@NonNull BaseSharingActivity baseSharingActivity, int i) {
        if (i == 2) {
            return new c(baseSharingActivity);
        }
        if (i == 3) {
            return new h(baseSharingActivity, false);
        }
        if (i != 4) {
            return i != 5 ? i != 6 ? new b(baseSharingActivity) : new i(baseSharingActivity) : new e(baseSharingActivity);
        }
        d dVar = new d(baseSharingActivity, null);
        dVar.l = false;
        dVar.f();
        return dVar;
    }
}
