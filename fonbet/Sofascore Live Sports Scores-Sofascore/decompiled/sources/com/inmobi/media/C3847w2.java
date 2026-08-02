package com.inmobi.media;

import defpackage.a70;
import defpackage.ct8;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3847w2 extends hoi implements ct8 {
    public int a;
    public final /* synthetic */ AbstractC3873x2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3847w2(AbstractC3873x2 abstractC3873x2, rq3 rq3Var) {
        super(3, rq3Var);
        this.b = abstractC3873x2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C3847w2(this.b, (rq3) obj3).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            AbstractC3873x2 abstractC3873x2 = this.b;
            this.a = 1;
            if (AbstractC3873x2.a(abstractC3873x2, this) == lu3Var) {
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
