package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.lf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3575lf extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3705qf b;
    public final /* synthetic */ C3473hg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3575lf(C3705qf c3705qf, C3473hg c3473hg, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3705qf;
        this.c = c3473hg;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3575lf(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3575lf(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            C3705qf c3705qf = this.b;
            C3473hg c3473hg = this.c;
            C3549kf c3549kf = new C3549kf(c3705qf, null);
            this.a = 1;
            if (c3705qf.a(c3473hg, c3549kf, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
