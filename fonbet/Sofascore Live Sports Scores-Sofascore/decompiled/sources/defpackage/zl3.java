package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zl3 extends h5a implements c9e {
    public final ll3 i;
    public final Function1 j;

    public zl3(ll3 ll3Var, Function1 function1) {
        this.i = ll3Var;
        this.j = function1;
    }

    @Override // defpackage.c9e
    public final Object d(kx4 kx4Var, Object obj) {
        return new yl3(this.i, this.j);
    }

    public final boolean equals(Object obj) {
        zl3 zl3Var = obj instanceof zl3 ? (zl3) obj : null;
        return this.j == (zl3Var != null ? zl3Var.j : null);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }
}
