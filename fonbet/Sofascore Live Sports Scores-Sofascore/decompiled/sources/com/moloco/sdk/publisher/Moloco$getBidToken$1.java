package com.moloco.sdk.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.bidtoken.i;
import com.moloco.sdk.internal.services.bidtoken.k;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 0, 0})
@il4(c = "com.moloco.sdk.publisher.Moloco$getBidToken$1", f = "Moloco.kt", l = {224}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class Moloco$getBidToken$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ MolocoBidTokenListener $listener;
    final /* synthetic */ MediationInfo $mediationInfo;
    final /* synthetic */ com.moloco.sdk.acm.recorder.b $metricsRecorder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$getBidToken$1(com.moloco.sdk.acm.recorder.b bVar, MediationInfo mediationInfo, MolocoBidTokenListener molocoBidTokenListener, rq3<? super Moloco$getBidToken$1> rq3Var) {
        super(2, rq3Var);
        this.$metricsRecorder = bVar;
        this.$mediationInfo = mediationInfo;
        this.$listener = molocoBidTokenListener;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new Moloco$getBidToken$1(this.$metricsRecorder, this.$mediationInfo, this.$listener, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((Moloco$getBidToken$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        i bidTokenHandler;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Handling bid token request", null, false, 12, null);
            bidTokenHandler = Moloco.INSTANCE.getBidTokenHandler();
            com.moloco.sdk.acm.recorder.b bVar = this.$metricsRecorder;
            MediationInfo mediationInfo = this.$mediationInfo;
            MolocoBidTokenListener molocoBidTokenListener = this.$listener;
            this.label = 1;
            if (((k) bidTokenHandler).a(bVar, mediationInfo, molocoBidTokenListener, this) == lu3Var) {
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
