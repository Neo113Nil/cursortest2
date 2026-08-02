package com.inmobi.media;

import defpackage.a70;
import defpackage.h2d;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Cj extends hoi implements Function2 {
    public h2d a;
    public Ej b;
    public Bj c;
    public Bj d;
    public int e;
    public final /* synthetic */ Ej f;
    public final /* synthetic */ Bj g;
    public final /* synthetic */ Bj h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cj(Ej ej, Bj bj, Bj bj2, rq3 rq3Var) {
        super(2, rq3Var);
        this.f = ej;
        this.g = bj;
        this.h = bj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Cj(this.f, this.g, this.h, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Cj) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Ej ej;
        h2d h2dVar;
        Bj bj;
        Bj bj2;
        lu3 lu3Var = lu3.a;
        int i = this.e;
        if (i == 0) {
            y6a.M(obj);
            Ej ej2 = this.f;
            h2d h2dVar2 = ej2.b;
            Bj bj3 = this.g;
            Bj bj4 = this.h;
            this.a = h2dVar2;
            this.b = ej2;
            this.c = bj3;
            this.d = bj4;
            this.e = 1;
            if (h2dVar2.e(this) == lu3Var) {
                return lu3Var;
            }
            ej = ej2;
            h2dVar = h2dVar2;
            bj = bj3;
            bj2 = bj4;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bj2 = this.d;
            bj = this.c;
            ej = this.b;
            h2dVar = this.a;
            y6a.M(obj);
        }
        try {
            ej.b(bj, bj2);
            return Unit.a;
        } finally {
            h2dVar.f(null);
        }
    }
}
