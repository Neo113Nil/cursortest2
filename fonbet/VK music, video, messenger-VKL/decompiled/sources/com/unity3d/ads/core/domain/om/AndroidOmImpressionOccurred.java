package com.unity3d.ads.core.domain.om;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;

/* compiled from: AndroidOmImpressionOccurred.kt */
/* loaded from: classes14.dex */
public final class AndroidOmImpressionOccurred implements OmImpressionOccurred {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmImpressionOccurred(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.om.OmImpressionOccurred
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(AdObject adObject, boolean z, spj<? super s3q0> spjVar) {
        AndroidOmImpressionOccurred$invoke$1 androidOmImpressionOccurred$invoke$1;
        int i;
        OMResult oMResult;
        if (spjVar instanceof AndroidOmImpressionOccurred$invoke$1) {
            androidOmImpressionOccurred$invoke$1 = (AndroidOmImpressionOccurred$invoke$1) spjVar;
            int i2 = androidOmImpressionOccurred$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidOmImpressionOccurred$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidOmImpressionOccurred$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidOmImpressionOccurred$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
                    ByteString opportunityId = adObject.getOpportunityId();
                    androidOmImpressionOccurred$invoke$1.L$0 = adObject;
                    androidOmImpressionOccurred$invoke$1.label = 1;
                    obj = openMeasurementRepository.impressionOccurred(opportunityId, z, androidOmImpressionOccurred$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adObject = (AdObject) androidOmImpressionOccurred$invoke$1.L$0;
                    a.a(obj);
                }
                AdObject adObject2 = adObject;
                oMResult = (OMResult) obj;
                if (!(oMResult instanceof OMResult.Success)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_impression_occurred_success", (Double) null, (Map) null, (Map) null, adObject2, (Integer) null, (ByteString) null, 110, (Object) null);
                } else {
                    if (!(oMResult instanceof OMResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    MapBuilder mapBuilder = new MapBuilder();
                    OMResult.Failure failure = (OMResult.Failure) oMResult;
                    mapBuilder.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        mapBuilder.put("reason_debug", failure.getReasonDebug());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_impression_occurred_failure", (Double) null, mapBuilder.h(), (Map) null, adObject2, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, (Object) null);
                }
                return s3q0.a;
            }
        }
        androidOmImpressionOccurred$invoke$1 = new AndroidOmImpressionOccurred$invoke$1(this, spjVar);
        Object obj2 = androidOmImpressionOccurred$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidOmImpressionOccurred$invoke$1.label;
        if (i != 0) {
        }
        AdObject adObject22 = adObject;
        oMResult = (OMResult) obj2;
        if (!(oMResult instanceof OMResult.Success)) {
        }
        return s3q0.a;
    }
}
