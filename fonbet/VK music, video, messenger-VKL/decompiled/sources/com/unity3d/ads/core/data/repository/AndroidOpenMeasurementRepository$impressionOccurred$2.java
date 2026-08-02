package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.unity3d.ads.core.data.manager.OmidManager;
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
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidOpenMeasurementRepository$impressionOccurred$2 extends SuspendLambda implements wzs<yvj, spj<? super OMResult>, Object> {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ boolean $signalLoaded;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$impressionOccurred$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, boolean z, spj<? super AndroidOpenMeasurementRepository$impressionOccurred$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$signalLoaded = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidOpenMeasurementRepository$impressionOccurred$2(this.this$0, this.$opportunityId, this.$signalLoaded, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdSession session;
        OmidManager omidManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        session = this.this$0.getSession(this.$opportunityId);
        if (session == null) {
            return new OMResult.Failure("om_session_not_found", null, 2, null);
        }
        omidManager = this.this$0.omidManager;
        AdEvents createAdEvents = omidManager.createAdEvents(session);
        if (this.$signalLoaded) {
            createAdEvents.loaded();
        }
        createAdEvents.impressionOccurred();
        return OMResult.Success.INSTANCE;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super OMResult> spjVar) {
        return ((AndroidOpenMeasurementRepository$impressionOccurred$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
