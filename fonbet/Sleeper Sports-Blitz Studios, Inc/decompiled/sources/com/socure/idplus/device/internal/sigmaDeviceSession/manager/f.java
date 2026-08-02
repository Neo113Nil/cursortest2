package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import com.socure.idplus.device.internal.sigmaDeviceConfig.model.SigmaDeviceConfigResponse;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateSessionWindowResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f890a;
    public final /* synthetic */ Function2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Function2 function2) {
        super(1);
        this.f890a = jVar;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CreateSessionWindowResponse createSessionWindowResponse = (CreateSessionWindowResponse) obj;
        Intrinsics.checkNotNullParameter(createSessionWindowResponse, "createSessionWindowResponse");
        String sessionToken = createSessionWindowResponse.getSessionMetadata().getSessionWindowToken();
        SigmaDeviceConfigResponse config = createSessionWindowResponse.getSigmaDeviceConfigResponse();
        j jVar = this.f890a;
        jVar.f = com.socure.idplus.device.internal.sigmaDeviceSession.a.c;
        String str = jVar.h;
        if (str == null) {
            str = sessionToken;
        }
        com.socure.idplus.device.internal.sigmaDeviceSession.b bVar = new com.socure.idplus.device.internal.sigmaDeviceSession.b(str, sessionToken);
        j jVar2 = this.f890a;
        if (jVar2.h == null) {
            jVar2.h = sessionToken;
        }
        jVar2.i = sessionToken;
        if (config.isNetworkAnalyzerEnabled()) {
            com.socure.idplus.device.internal.api.b bVar2 = jVar2.f894a;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            com.socure.idplus.device.internal.api.a api = bVar2.f;
            if (api == null) {
                api = bVar2.a(config.getNetwork().getHost());
                bVar2.f = api;
            }
            com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.c cVar = jVar2.e;
            d onSuccess = d.f888a;
            e onError = e.f889a;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onError, "onError");
            com.socure.idplus.device.internal.sigmaNetworkAnalyzer.dataHandler.b bVar3 = cVar.f898a;
            com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.a onSuccess2 = new com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.a(onSuccess);
            com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.b onError2 = new com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.b(onError);
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(onSuccess2, "onSuccess");
            Intrinsics.checkNotNullParameter(onError2, "onError");
            com.socure.idplus.device.internal.network.c.a(new com.socure.idplus.device.internal.sigmaNetworkAnalyzer.dataHandler.a(api, com.socure.idplus.device.internal.common.utils.a.a(sessionToken)), onSuccess2, onError2);
        }
        j jVar3 = this.f890a;
        String str2 = jVar3.h;
        Iterator it = new ArrayList(jVar3.g).iterator();
        while (it.hasNext()) {
            SessionTokenCallback sessionTokenCallback = (SessionTokenCallback) it.next();
            Intrinsics.checkNotNull(sessionTokenCallback);
            if (str2 != null) {
                sessionTokenCallback.onComplete(str2);
            } else {
                sessionTokenCallback.onError(SigmaDeviceError.DataFetchError, "Unable to fetch session");
            }
        }
        jVar3.g.clear();
        this.b.invoke(bVar, config);
        return Unit.INSTANCE;
    }
}
