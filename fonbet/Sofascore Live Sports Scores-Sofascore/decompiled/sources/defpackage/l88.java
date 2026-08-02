package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l88 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final q50 e;
    public i7a f;
    public i7a g;

    public l88(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new q50(new p75(f), lz.h, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(i7a i7aVar, sq3 sq3Var) {
        j88 j88Var;
        int i;
        q50 q50Var = this.e;
        try {
            if (sq3Var instanceof j88) {
                j88Var = (j88) sq3Var;
                int i2 = j88Var.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    j88Var.u = i2 - Integer.MIN_VALUE;
                    Object obj = j88Var.s;
                    lu3 lu3Var = lu3.a;
                    i = j88Var.u;
                    if (i != 0) {
                        y6a.M(obj);
                        float f = i7aVar instanceof l6f ? this.b : i7aVar instanceof sf9 ? this.c : i7aVar instanceof rd8 ? this.d : this.a;
                        this.g = i7aVar;
                        if (!p75.b(((p75) ((eoh) q50Var.e).getValue()).a, f)) {
                            i7a i7aVar2 = this.f;
                            j88Var.r = i7aVar;
                            j88Var.u = 1;
                            if (aj5.a(q50Var, f, i7aVar2, i7aVar, j88Var) == lu3Var) {
                                return lu3Var;
                            }
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i7aVar = j88Var.r;
                        y6a.M(obj);
                    }
                    this.f = i7aVar;
                    this = Unit.a;
                    return this;
                }
            }
            if (i != 0) {
            }
            this.f = i7aVar;
            this = Unit.a;
            return this;
        } catch (Throwable th) {
            this.f = i7aVar;
            throw th;
        }
        j88Var = new j88(this, sq3Var);
        Object obj2 = j88Var.s;
        lu3 lu3Var2 = lu3.a;
        i = j88Var.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        k88 k88Var;
        int i;
        try {
            if (sq3Var instanceof k88) {
                k88Var = (k88) sq3Var;
                int i2 = k88Var.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    k88Var.t = i2 - Integer.MIN_VALUE;
                    Object obj = k88Var.r;
                    lu3 lu3Var = lu3.a;
                    i = k88Var.t;
                    if (i != 0) {
                        y6a.M(obj);
                        i7a i7aVar = this.g;
                        float f = i7aVar instanceof l6f ? this.b : i7aVar instanceof sf9 ? this.c : i7aVar instanceof rd8 ? this.d : this.a;
                        q50 q50Var = this.e;
                        if (!p75.b(((p75) ((eoh) q50Var.e).getValue()).a, f)) {
                            p75 p75Var = new p75(f);
                            k88Var.t = 1;
                            if (q50Var.f(k88Var, p75Var) == lu3Var) {
                                return lu3Var;
                            }
                        }
                        return Unit.a;
                    }
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    return Unit.a;
                }
            }
            if (i != 0) {
            }
            return Unit.a;
        } finally {
            this.f = this.g;
        }
        k88Var = new k88(this, sq3Var);
        Object obj2 = k88Var.r;
        lu3 lu3Var2 = lu3.a;
        i = k88Var.t;
    }
}
