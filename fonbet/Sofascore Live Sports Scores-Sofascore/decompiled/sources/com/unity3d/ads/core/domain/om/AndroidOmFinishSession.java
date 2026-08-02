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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmFinishSession;", "Lcom/unity3d/ads/core/domain/om/OmFinishSession;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidOmFinishSession implements OmFinishSession {

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmFinishSession(@NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        openMeasurementRepository.getClass();
        sendDiagnosticEvent.getClass();
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.om.OmFinishSession
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull AdObject adObject, @NotNull rq3<? super Unit> rq3Var) {
        AndroidOmFinishSession$invoke$1 androidOmFinishSession$invoke$1;
        int i;
        AdObject adObject2;
        OMResult oMResult;
        if (rq3Var instanceof AndroidOmFinishSession$invoke$1) {
            androidOmFinishSession$invoke$1 = (AndroidOmFinishSession$invoke$1) rq3Var;
            int i2 = androidOmFinishSession$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidOmFinishSession$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidOmFinishSession$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidOmFinishSession$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
                    ByteString opportunityId = adObject.getOpportunityId();
                    androidOmFinishSession$invoke$1.L$0 = adObject;
                    androidOmFinishSession$invoke$1.label = 1;
                    obj = openMeasurementRepository.finishSession(opportunityId, androidOmFinishSession$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    adObject2 = adObject;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AdObject adObject3 = (AdObject) androidOmFinishSession$invoke$1.L$0;
                    y6a.M(obj);
                    adObject2 = adObject3;
                }
                oMResult = (OMResult) obj;
                if (!(oMResult instanceof OMResult.Success)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_session_finish_success", (Double) null, (Map) null, (Map) null, adObject2, (Integer) null, (ByteString) null, 110, (Object) null);
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
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_session_finish_failure", (Double) null, ltbVar.d(), (Map) null, adObject2, (Integer) null, (ByteString) null, 106, (Object) null);
                }
                return Unit.a;
            }
        }
        androidOmFinishSession$invoke$1 = new AndroidOmFinishSession$invoke$1(this, rq3Var);
        Object obj2 = androidOmFinishSession$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidOmFinishSession$invoke$1.label;
        if (i != 0) {
        }
        oMResult = (OMResult) obj2;
        if (!(oMResult instanceof OMResult.Success)) {
        }
        return Unit.a;
    }
}
