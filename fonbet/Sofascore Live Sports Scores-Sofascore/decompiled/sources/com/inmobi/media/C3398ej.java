package com.inmobi.media;

import android.content.Context;
import defpackage.a70;
import defpackage.hoi;
import defpackage.joa;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3398ej extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ hoi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3398ej(Function1 function1, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = (hoi) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3398ej(this.b, rq3Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3398ej(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                ?? r4 = this.b;
                this.a = 1;
                if (r4.invoke(this) == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
            }
        } catch (Exception e) {
            Context context = AbstractC3424fj.a;
            e.getMessage();
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
        return Unit.a;
    }
}
