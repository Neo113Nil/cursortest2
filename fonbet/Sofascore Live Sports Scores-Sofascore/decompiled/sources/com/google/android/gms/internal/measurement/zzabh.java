package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzabh {
    public final int a;
    public final zzza b;

    public zzabh(zzza zzzaVar, int i) {
        if (zzzaVar == null) {
            a70.p("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            a70.p(me4.g(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.a = i;
        this.b = zzzaVar;
    }

    public abstract void a(zzyy zzyyVar, Object obj);
}
