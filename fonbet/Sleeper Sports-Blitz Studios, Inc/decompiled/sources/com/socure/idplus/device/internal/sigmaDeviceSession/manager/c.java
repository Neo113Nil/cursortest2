package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateCustomerSession;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c implements SessionTokenCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f887a;
    public final /* synthetic */ CreateCustomerSession b;
    public final /* synthetic */ SessionTokenCallback c;

    public c(j jVar, CreateCustomerSession createCustomerSession, SessionTokenCallback sessionTokenCallback) {
        this.f887a = jVar;
        this.b = createCustomerSession;
        this.c = sessionTokenCallback;
    }

    @Override // com.socure.idplus.device.callback.SessionTokenCallback
    public final void onComplete(String sessionToken) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        j jVar = this.f887a;
        com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.c cVar = jVar.d;
        com.socure.idplus.device.internal.api.b bVar = jVar.f894a;
        com.socure.idplus.device.internal.api.a api = bVar.d;
        if (api == null) {
            String str = bVar.f841a;
            if (str == null) {
                str = bVar.b ? "https://ingestion.dv.socure.us/" : "https://ingestion.dv.socure.io/";
            }
            api = bVar.a(str);
            bVar.d = api;
        }
        CreateCustomerSession createCustomerSession = this.b;
        a onSuccess = new a(sessionToken, this.c);
        b onError = new b(this.c);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(createCustomerSession, "createCustomerSession");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        com.socure.idplus.device.internal.network.c.a(new com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.a(api, com.socure.idplus.device.internal.common.utils.a.a(sessionToken), createCustomerSession), onSuccess, onError);
    }

    @Override // com.socure.idplus.device.callback.DeviceIntelligenceCallback
    public final void onError(SigmaDeviceError errorType, String str) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        SessionTokenCallback sessionTokenCallback = this.c;
        if (sessionTokenCallback != null) {
            sessionTokenCallback.onError(SigmaDeviceError.DataFetchError, str);
        }
    }
}
