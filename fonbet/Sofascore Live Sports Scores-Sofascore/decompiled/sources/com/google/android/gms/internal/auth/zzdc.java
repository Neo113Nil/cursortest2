package com.google.android.gms.internal.auth;

import defpackage.a70;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzdc {
    public static final AtomicInteger b;
    public final Object a;

    static {
        new AtomicReference();
        int i = zzcu.a;
        b = new AtomicInteger();
    }

    public /* synthetic */ zzdc(zzcz zzczVar, Object obj) {
        if (zzczVar.a != null) {
            this.a = obj;
        } else {
            a70.p("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
    }
}
