package com.socure.idplus.device.internal.sigmaDeviceSession.manager;

import com.socure.idplus.device.SigmaDeviceOptions;
import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.error.SigmaDeviceError;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.socure.idplus.device.internal.api.b f894a;
    public final com.socure.idplus.device.internal.sharedPrefs.a b;
    public final SigmaDeviceOptions c;
    public final com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.c d;
    public final com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.c e;
    public com.socure.idplus.device.internal.sigmaDeviceSession.a f;
    public final ArrayList g;
    public String h;
    public String i;

    public /* synthetic */ j(com.socure.idplus.device.internal.api.b bVar, com.socure.idplus.device.internal.sharedPrefs.a aVar, SigmaDeviceOptions sigmaDeviceOptions) {
        this(bVar, aVar, sigmaDeviceOptions, new com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.c());
    }

    public final void a(SessionTokenCallback sessionTokenCallback) {
        Intrinsics.checkNotNullParameter(sessionTokenCallback, "sessionTokenCallback");
        com.socure.idplus.device.internal.sigmaDeviceSession.a aVar = this.f;
        if (aVar == com.socure.idplus.device.internal.sigmaDeviceSession.a.f881a || aVar == com.socure.idplus.device.internal.sigmaDeviceSession.a.b) {
            this.g.add(sessionTokenCallback);
            return;
        }
        String str = this.h;
        if (str != null) {
            sessionTokenCallback.onComplete(str);
        } else {
            sessionTokenCallback.onError(SigmaDeviceError.DataFetchError, "Unable to fetch session");
        }
    }

    public j(com.socure.idplus.device.internal.api.b apiClient, com.socure.idplus.device.internal.sharedPrefs.a socureSharedPref, SigmaDeviceOptions sigmaDeviceOptions, com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.c sessionDataHandler) {
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(socureSharedPref, "socureSharedPref");
        Intrinsics.checkNotNullParameter(sigmaDeviceOptions, "sigmaDeviceOptions");
        Intrinsics.checkNotNullParameter(sessionDataHandler, "sessionDataHandler");
        this.f894a = apiClient;
        this.b = socureSharedPref;
        this.c = sigmaDeviceOptions;
        this.d = sessionDataHandler;
        this.e = new com.socure.idplus.device.internal.sigmaNetworkAnalyzer.manager.c();
        this.f = com.socure.idplus.device.internal.sigmaDeviceSession.a.f881a;
        this.g = new ArrayList();
    }
}
