package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z19 implements gp3 {
    public final int a;
    public final Path.FillType b;
    public final r50 c;
    public final r50 d;
    public final r50 e;
    public final r50 f;
    public final String g;
    public final boolean h;

    public z19(String str, int i, Path.FillType fillType, r50 r50Var, r50 r50Var2, r50 r50Var3, r50 r50Var4, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = r50Var;
        this.d = r50Var2;
        this.e = r50Var3;
        this.f = r50Var4;
        this.g = str;
        this.h = z;
    }

    @Override // defpackage.gp3
    public final fo3 a(gmb gmbVar, plb plbVar, p41 p41Var) {
        return new a29(gmbVar, plbVar, p41Var, this);
    }
}
