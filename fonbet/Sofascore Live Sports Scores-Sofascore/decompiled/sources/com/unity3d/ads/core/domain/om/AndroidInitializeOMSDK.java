package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.whj;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import defpackage.zzl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidInitializeOMSDK;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "omRepository", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "", "invoke", "(Lrq3;)Ljava/lang/Object;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {

    @NotNull
    private final Context context;

    @NotNull
    private final OpenMeasurementRepository omRepository;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidInitializeOMSDK(@NotNull Context context, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SessionRepository sessionRepository, @NotNull OpenMeasurementRepository openMeasurementRepository) {
        context.getClass();
        sendDiagnosticEvent.getClass();
        sessionRepository.getClass();
        openMeasurementRepository.getClass();
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = openMeasurementRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super Unit> rq3Var) {
        AndroidInitializeOMSDK$invoke$1 androidInitializeOMSDK$invoke$1;
        int i;
        long j;
        OMResult oMResult;
        if (rq3Var instanceof AndroidInitializeOMSDK$invoke$1) {
            androidInitializeOMSDK$invoke$1 = (AndroidInitializeOMSDK$invoke$1) rq3Var;
            int i2 = androidInitializeOMSDK$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidInitializeOMSDK$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidInitializeOMSDK$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidInitializeOMSDK$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.sessionRepository.isOmEnabled()) {
                        xhj.a.getClass();
                        xuc.a.getClass();
                        long b = xuc.b();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                        OpenMeasurementRepository openMeasurementRepository = this.omRepository;
                        Context context = this.context;
                        androidInitializeOMSDK$invoke$1.J$0 = b;
                        androidInitializeOMSDK$invoke$1.label = 1;
                        obj = openMeasurementRepository.activateOM(context, androidInitializeOMSDK$invoke$1);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        j = b;
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = androidInitializeOMSDK$invoke$1.J$0;
                y6a.M(obj);
                oMResult = (OMResult) obj;
                if (!(oMResult instanceof OMResult.Success)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_success_time", new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                } else {
                    if (!(oMResult instanceof OMResult.Failure)) {
                        zzl.b();
                        return null;
                    }
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    Double d = new Double(TimeExtensionsKt.elapsedMillis(new whj(j)));
                    ltb ltbVar = new ltb();
                    OMResult.Failure failure = (OMResult.Failure) oMResult;
                    ltbVar.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        ltbVar.put("reason_debug", failure.getReasonDebug());
                    }
                    Unit unit = Unit.a;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_activate_failure_time", d, ltbVar.d(), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                }
                return Unit.a;
            }
        }
        androidInitializeOMSDK$invoke$1 = new AndroidInitializeOMSDK$invoke$1(this, rq3Var);
        Object obj2 = androidInitializeOMSDK$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidInitializeOMSDK$invoke$1.label;
        if (i != 0) {
        }
        oMResult = (OMResult) obj2;
        if (!(oMResult instanceof OMResult.Success)) {
        }
        return Unit.a;
    }
}
