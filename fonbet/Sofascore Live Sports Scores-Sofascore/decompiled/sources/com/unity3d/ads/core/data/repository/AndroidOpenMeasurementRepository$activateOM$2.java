package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/ads/core/data/model/OMResult;", "<anonymous>", "(Lku3;)Lcom/unity3d/ads/core/data/model/OMResult;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidOpenMeasurementRepository$activateOM$2 extends hoi implements Function2<ku3, rq3<? super OMResult>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$activateOM$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, Context context, rq3<? super AndroidOpenMeasurementRepository$activateOM$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidOpenMeasurementRepository;
        this.$context = context;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidOpenMeasurementRepository$activateOM$2(this.this$0, this.$context, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super OMResult> rq3Var) {
        return ((AndroidOpenMeasurementRepository$activateOM$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        OmidManager omidManager;
        OmidManager omidManager2;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
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
}
