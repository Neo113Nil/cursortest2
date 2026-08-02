package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pdd {
    public wtc a;
    public int b;
    public i1d c;
    public i1d d;
    public boolean e;
    public final /* synthetic */ c40 f;

    public pdd(c40 c40Var, wtc wtcVar, int i, i1d i1dVar, i1d i1dVar2, boolean z) {
        this.f = c40Var;
        this.a = wtcVar;
        this.b = i;
        this.c = i1dVar;
        this.d = i1dVar2;
        this.e = z;
    }

    public final boolean a(int i, int i2) {
        i1d i1dVar = this.c;
        int i3 = this.b;
        vtc vtcVar = (vtc) i1dVar.a[i + i3];
        vtc vtcVar2 = (vtc) this.d.a[i3 + i2];
        return Intrinsics.c(vtcVar, vtcVar2) || vtcVar.getClass() == vtcVar2.getClass();
    }
}
