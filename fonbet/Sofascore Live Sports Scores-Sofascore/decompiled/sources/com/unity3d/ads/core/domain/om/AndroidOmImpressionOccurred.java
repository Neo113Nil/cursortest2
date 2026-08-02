package com.unity3d.ads.core.domain.om;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import defpackage.a70;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmImpressionOccurred;", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "signalLoaded", "", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;ZLrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidOmImpressionOccurred implements OmImpressionOccurred {

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmImpressionOccurred(@NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        openMeasurementRepository.getClass();
        sendDiagnosticEvent.getClass();
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.om.OmImpressionOccurred
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull AdObject adObject, boolean z, @NotNull rq3<? super Unit> rq3Var) {
        AndroidOmImpressionOccurred$invoke$1 androidOmImpressionOccurred$invoke$1;
        int i;
        AdObject adObject2;
        OMResult oMResult;
        if (rq3Var instanceof AndroidOmImpressionOccurred$invoke$1) {
            androidOmImpressionOccurred$invoke$1 = (AndroidOmImpressionOccurred$invoke$1) rq3Var;
            int i2 = androidOmImpressionOccurred$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidOmImpressionOccurred$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidOmImpressionOccurred$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidOmImpressionOccurred$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
                    ByteString opportunityId = adObject.getOpportunityId();
                    androidOmImpressionOccurred$invoke$1.L$0 = adObject;
                    androidOmImpressionOccurred$invoke$1.label = 1;
                    obj = openMeasurementRepository.impressionOccurred(opportunityId, z, androidOmImpressionOccurred$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    adObject2 = adObject;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AdObject adObject3 = (AdObject) androidOmImpressionOccurred$invoke$1.L$0;
                    y6a.M(obj);
                    adObject2 = adObject3;
                }
                oMResult = (OMResult) obj;
                if (!(oMResult instanceof OMResult.Success)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_impression_occurred_success", (Double) null, (Map) null, (Map) null, adObject2, (Integer) null, (ByteString) null, 110, (Object) null);
                } else {
                    if (!(oMResult instanceof OMResult.Failure)) {
                        zzl.b();
                        return null;
                    }
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    ltb ltbVar = new ltb();
                    OMResult.Failure failure = (OMResult.Failure) oMResult;
                    ltbVar.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        ltbVar.put("reason_debug", failure.getReasonDebug());
                    }
                    Unit unit = Unit.a;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_impression_occurred_failure", (Double) null, ltbVar.d(), (Map) null, adObject2, (Integer) null, (ByteString) null, 106, (Object) null);
                }
                return Unit.a;
            }
        }
        androidOmImpressionOccurred$invoke$1 = new AndroidOmImpressionOccurred$invoke$1(this, rq3Var);
        Object obj2 = androidOmImpressionOccurred$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidOmImpressionOccurred$invoke$1.label;
        if (i != 0) {
        }
        oMResult = (OMResult) obj2;
        if (!(oMResult instanceof OMResult.Success)) {
        }
        return Unit.a;
    }
}
