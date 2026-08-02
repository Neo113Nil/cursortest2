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
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.jvo0;
import xsna.k830;
import xsna.s3q0;
import xsna.spj;

/* compiled from: AndroidInitializeOMSDK.kt */
/* loaded from: classes14.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {
    private final Context context;
    private final OpenMeasurementRepository omRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public AndroidInitializeOMSDK(Context context, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository) {
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = openMeasurementRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super s3q0> spjVar) {
        AndroidInitializeOMSDK$invoke$1 androidInitializeOMSDK$invoke$1;
        int i;
        long j;
        OMResult oMResult;
        if (spjVar instanceof AndroidInitializeOMSDK$invoke$1) {
            androidInitializeOMSDK$invoke$1 = (AndroidInitializeOMSDK$invoke$1) spjVar;
            int i2 = androidInitializeOMSDK$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidInitializeOMSDK$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidInitializeOMSDK$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidInitializeOMSDK$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    if (this.sessionRepository.isOmEnabled()) {
                        long b = k830.b();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                        OpenMeasurementRepository openMeasurementRepository = this.omRepository;
                        Context context = this.context;
                        androidInitializeOMSDK$invoke$1.J$0 = b;
                        androidInitializeOMSDK$invoke$1.label = 1;
                        obj = openMeasurementRepository.activateOM(context, androidInitializeOMSDK$invoke$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        j = b;
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = androidInitializeOMSDK$invoke$1.J$0;
                a.a(obj);
                oMResult = (OMResult) obj;
                if (!(oMResult instanceof OMResult.Success)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_success_time", new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                } else {
                    if (!(oMResult instanceof OMResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    Double d = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j)));
                    MapBuilder mapBuilder = new MapBuilder();
                    OMResult.Failure failure = (OMResult.Failure) oMResult;
                    mapBuilder.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        mapBuilder.put("reason_debug", failure.getReasonDebug());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_activate_failure_time", d, mapBuilder.h(), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                }
                return s3q0.a;
            }
        }
        androidInitializeOMSDK$invoke$1 = new AndroidInitializeOMSDK$invoke$1(this, spjVar);
        Object obj2 = androidInitializeOMSDK$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidInitializeOMSDK$invoke$1.label;
        if (i != 0) {
        }
        oMResult = (OMResult) obj2;
        if (!(oMResult instanceof OMResult.Success)) {
        }
        return s3q0.a;
    }
}
