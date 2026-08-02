package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.unity3d.ads.core.data.model.OMResult;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidOpenMeasurementRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidOpenMeasurementRepository$finishSession$2 extends SuspendLambda implements wzs<yvj, spj<? super OMResult>, Object> {
    final /* synthetic */ ByteString $opportunityId;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$finishSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, spj<? super AndroidOpenMeasurementRepository$finishSession$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidOpenMeasurementRepository$finishSession$2(this.this$0, this.$opportunityId, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdSession session;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        if (!this.this$0.isOMActive()) {
            return new OMResult.Failure("om_not_active", null, 2, null);
        }
        session = this.this$0.getSession(this.$opportunityId);
        if (session == null) {
            return new OMResult.Failure("om_session_not_found", null, 2, null);
        }
        session.finish();
        this.this$0.sessionFinished(this.$opportunityId);
        return OMResult.Success.INSTANCE;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super OMResult> spjVar) {
        return ((AndroidOpenMeasurementRepository$finishSession$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
