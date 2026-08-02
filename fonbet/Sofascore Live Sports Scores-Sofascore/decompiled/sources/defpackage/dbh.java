package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dbh implements gp3 {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final r50 d;
    public final r50 e;
    public final boolean f;

    public dbh(String str, boolean z, Path.FillType fillType, r50 r50Var, r50 r50Var2, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = r50Var;
        this.e = r50Var2;
        this.f = z2;
    }

    @Override // defpackage.gp3
    public final fo3 a(gmb gmbVar, plb plbVar, p41 p41Var) {
        return new f28(gmbVar, p41Var, this);
    }

    public final String toString() {
        return lnb.r(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
