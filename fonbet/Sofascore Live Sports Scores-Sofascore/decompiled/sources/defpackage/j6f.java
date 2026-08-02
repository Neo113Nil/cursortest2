package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j6f implements g6f, kx4 {
    public final /* synthetic */ kx4 a;
    public boolean b;
    public boolean c;
    public final j2d d = new j2d();

    public j6f(kx4 kx4Var) {
        this.a = kx4Var;
    }

    @Override // defpackage.kx4
    public final float C(long j) {
        return this.a.C(j);
    }

    @Override // defpackage.kx4
    public final float C0(int i) {
        return this.a.C0(i);
    }

    @Override // defpackage.kx4
    public final float D0(float f) {
        return this.a.D0(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.g6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(sq3 sq3Var) {
        i6f i6fVar;
        int i;
        if (sq3Var instanceof i6f) {
            i6fVar = (i6f) sq3Var;
            int i2 = i6fVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i6fVar.t = i2 - Integer.MIN_VALUE;
                Object obj = i6fVar.r;
                lu3 lu3Var = lu3.a;
                i = i6fVar.t;
                j2d j2dVar = this.d;
                if (i != 0) {
                    y6a.M(obj);
                    if (!this.b && !this.c) {
                        i6fVar.t = 1;
                        if (j2dVar.e(i6fVar) == lu3Var) {
                            return lu3Var;
                        }
                    }
                    return Boolean.valueOf(this.b);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                j2dVar.f(null);
                return Boolean.valueOf(this.b);
            }
        }
        i6fVar = new i6f(this, sq3Var);
        Object obj2 = i6fVar.r;
        lu3 lu3Var2 = lu3.a;
        i = i6fVar.t;
        j2d j2dVar2 = this.d;
        if (i != 0) {
        }
        j2dVar2.f(null);
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.kx4
    public final float H0(float f) {
        return this.a.H0(f);
    }

    @Override // defpackage.kx4
    public final long N(int i) {
        return this.a.N(i);
    }

    @Override // defpackage.kx4
    public final long O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.kx4
    public final long R0(long j) {
        return this.a.R0(j);
    }

    public final void a() {
        this.c = true;
        j2d j2dVar = this.d;
        if (j2dVar.d()) {
            j2dVar.f(null);
        }
    }

    public final void b() {
        this.b = true;
        j2d j2dVar = this.d;
        if (j2dVar.d()) {
            j2dVar.f(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        h6f h6fVar;
        int i;
        if (sq3Var instanceof h6f) {
            h6fVar = (h6f) sq3Var;
            int i2 = h6fVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6fVar.t = i2 - Integer.MIN_VALUE;
                Object obj = h6fVar.r;
                lu3 lu3Var = lu3.a;
                i = h6fVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    h6fVar.t = 1;
                    if (this.d.e(h6fVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.b = false;
                this.c = false;
                return Unit.a;
            }
        }
        h6fVar = new h6f(this, sq3Var);
        Object obj2 = h6fVar.r;
        lu3 lu3Var2 = lu3.a;
        i = h6fVar.t;
        if (i != 0) {
        }
        this.b = false;
        this.c = false;
        return Unit.a;
    }

    @Override // defpackage.kx4
    public final int e0(float f) {
        return this.a.e0(f);
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.a.getFontScale();
    }

    @Override // defpackage.kx4
    public final float h0(long j) {
        return this.a.h0(j);
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a.j();
    }

    @Override // defpackage.kx4
    public final long u(float f) {
        return this.a.u(f);
    }

    @Override // defpackage.kx4
    public final long v(long j) {
        return this.a.v(j);
    }
}
