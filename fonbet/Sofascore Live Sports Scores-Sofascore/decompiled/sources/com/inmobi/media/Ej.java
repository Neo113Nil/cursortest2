package com.inmobi.media;

import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Ej {
    public final ku3 a;
    public final h2d b;

    public Ej(ku3 ku3Var) {
        ku3Var.getClass();
        this.a = ku3Var;
        this.b = new j2d();
    }

    public abstract Bj a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.inmobi.media.Bj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C3496id c3496id, Bj bj, sq3 sq3Var) {
        Dj dj;
        int i;
        h2d h2dVar;
        try {
            if (sq3Var instanceof Dj) {
                dj = (Dj) sq3Var;
                int i2 = dj.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dj.f = i2 - Integer.MIN_VALUE;
                    Object obj = dj.d;
                    lu3 lu3Var = lu3.a;
                    i = dj.f;
                    if (i != 0) {
                        y6a.M(obj);
                        h2dVar = this.b;
                        dj.a = c3496id;
                        dj.b = bj;
                        dj.c = h2dVar;
                        dj.f = 1;
                        if (h2dVar.e(dj) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2d h2dVar2 = dj.c;
                        bj = dj.b;
                        ?? r0 = dj.a;
                        y6a.M(obj);
                        h2dVar = h2dVar2;
                        c3496id = r0;
                    }
                    b(c3496id, bj);
                    return Unit.a;
                }
            }
            b(c3496id, bj);
            return Unit.a;
        } finally {
            h2dVar.f(null);
        }
        dj = new Dj(this, sq3Var);
        Object obj2 = dj.d;
        lu3 lu3Var2 = lu3.a;
        i = dj.f;
        if (i != 0) {
        }
    }

    public abstract void a(Bj bj);

    public final void b(Bj bj, Bj bj2) {
        if (Intrinsics.c(a(), bj2) && !Intrinsics.c(a(), bj)) {
            a().getClass();
            bj.getClass();
            a().c();
            a(bj);
            a().a();
        }
    }

    public final void a(Bj bj, Bj bj2) {
        bj.getClass();
        bj2.getClass();
        xw3.L(this.a, null, null, new Cj(this, bj, bj2, null), 3);
    }
}
