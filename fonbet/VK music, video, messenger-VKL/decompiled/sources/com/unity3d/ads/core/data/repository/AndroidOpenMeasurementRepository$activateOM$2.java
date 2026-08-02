package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidOpenMeasurementRepository.kt */
@b6l(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidOpenMeasurementRepository$activateOM$2 extends SuspendLambda implements wzs<yvj, spj<? super OMResult>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$activateOM$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, Context context, spj<? super AndroidOpenMeasurementRepository$activateOM$2> spjVar) {
        super(2, spjVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidOpenMeasurementRepository$activateOM$2(this.this$0, this.$context, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OmidManager omidManager;
        OmidManager omidManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        if (this.this$0.isOMActive()) {
            return new OMResult.Failure("om_already_active", null, 2, null);
        }
        try {
            omidManager = this.this$0.omidManager;
            omidManager.activate(this.$context);
            AndroidOpenMeasurementRepository androidOpenMeasurementRepository = this.this$0;
            omidManager2 = androidOpenMeasurementRepository.omidManager;
            androidOpenMeasurementRepository.setOMActive(omidManager2.isActive());
            return this.this$0.isOMActive() ? OMResult.Success.INSTANCE : new OMResult.Failure("om_activate_failure_time", null, 2, null);
        } catch (Throwable th) {
            return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
        }
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super OMResult> spjVar) {
        return ((AndroidOpenMeasurementRepository$activateOM$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
