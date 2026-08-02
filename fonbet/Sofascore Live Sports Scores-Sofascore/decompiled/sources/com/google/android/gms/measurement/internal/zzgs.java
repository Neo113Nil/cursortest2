package com.google.android.gms.measurement.internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgs {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ zzgu d;

    public zzgs(zzgu zzguVar, int i, boolean z, boolean z2) {
        this.d = zzguVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final void a(String str) {
        this.d.V(this.a, this.b, this.c, str, null, null, null);
    }

    public final void b(Object obj, String str) {
        this.d.V(this.a, this.b, this.c, str, obj, null, null);
    }

    public final void c(Object obj, Object obj2, String str) {
        this.d.V(this.a, this.b, this.c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.d.V(this.a, this.b, this.c, str, obj, obj2, obj3);
    }
}
