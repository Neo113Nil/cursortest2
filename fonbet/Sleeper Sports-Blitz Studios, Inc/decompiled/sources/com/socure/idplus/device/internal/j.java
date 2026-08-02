package com.socure.idplus.device.internal;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.Window;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.socure.idplus.device.SigmaDeviceOptions;
import com.socure.idplus.device.callback.DeviceIntelligenceCallback;
import com.socure.idplus.device.callback.SessionTokenCallback;
import com.socure.idplus.device.callback.SigmaDeviceCallback;
import com.socure.idplus.device.context.SigmaDeviceContext;
import com.socure.idplus.device.internal.behavior.model.LifeCycleEvent;
import com.socure.idplus.device.internal.behavior.model.LifeCycleType;
import com.socure.idplus.device.internal.input.k;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.CreateSessionWindowRequest;
import com.socure.idplus.device.internal.sigmaDeviceV2.model.DeviceMetadata;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f869a;
    public final SigmaDeviceOptions b;
    public SigmaDeviceCallback c;
    public final k d;
    public final com.socure.idplus.device.internal.api.b e;
    public final com.socure.idplus.device.internal.sigmaDeviceSession.manager.j f;
    public final WeakReference g;
    public final com.socure.idplus.device.internal.behavior.manager.f h;
    public final b i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ j(Context context, String str, SigmaDeviceOptions sigmaDeviceOptions, SigmaDeviceCallback sigmaDeviceCallback) {
        this(context, str, sigmaDeviceOptions, sigmaDeviceCallback, r5, r6, r7, new com.socure.idplus.device.internal.sigmaDeviceSession.manager.j(r7, r5, sigmaDeviceOptions));
        com.socure.idplus.device.internal.sharedPrefs.a aVar = new com.socure.idplus.device.internal.sharedPrefs.a(context);
        k kVar = new k();
        com.socure.idplus.device.internal.api.b bVar = new com.socure.idplus.device.internal.api.b(sigmaDeviceOptions.getConfigBaseUrl(), sigmaDeviceOptions.getUseSocureGov(), new com.socure.idplus.device.internal.api.d());
    }

    public final void c(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        if (window != null) {
            k kVar = this.d;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(window, "window");
            if (kVar.c && !kVar.f861a.containsKey(window)) {
                kVar.f861a.put(window, Boolean.TRUE);
                com.socure.idplus.device.internal.input.j jVar = kVar.b;
                if (jVar != null) {
                    ((com.socure.idplus.device.internal.behavior.manager.f) jVar).a(window);
                }
            }
        }
    }

    public final void d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Window window = activity.getWindow();
        if (window != null) {
            k kVar = this.d;
            kVar.getClass();
            Intrinsics.checkNotNullParameter(window, "window");
            if (kVar.c && kVar.f861a.containsKey(window)) {
                kVar.f861a.remove(window);
                com.socure.idplus.device.internal.input.j jVar = kVar.b;
                if (jVar != null) {
                    ((com.socure.idplus.device.internal.behavior.manager.f) jVar).b(window);
                }
            }
        }
    }

    public j(Context context, String sdkKey, SigmaDeviceOptions sigmaDeviceOptions, SigmaDeviceCallback sigmaDeviceCallback, com.socure.idplus.device.internal.sharedPrefs.a socureSharedPref, k windowManager, com.socure.idplus.device.internal.api.b apiClient, com.socure.idplus.device.internal.sigmaDeviceSession.manager.j sessionManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(sigmaDeviceOptions, "sigmaDeviceOptions");
        Intrinsics.checkNotNullParameter(sigmaDeviceCallback, "sigmaDeviceCallback");
        Intrinsics.checkNotNullParameter(socureSharedPref, "socureSharedPref");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        this.f869a = sdkKey;
        this.b = sigmaDeviceOptions;
        this.c = sigmaDeviceCallback;
        this.d = windowManager;
        this.e = apiClient;
        this.f = sessionManager;
        this.h = new com.socure.idplus.device.internal.behavior.manager.f(context, sigmaDeviceOptions, apiClient, socureSharedPref, windowManager);
        this.i = new b(this);
        this.g = new WeakReference(context);
        a(context, null);
    }

    public final void a(DeviceIntelligenceCallback deviceIntelligenceCallback) {
        Intrinsics.checkNotNullParameter(deviceIntelligenceCallback, "deviceIntelligenceCallback");
        if (deviceIntelligenceCallback instanceof SigmaDeviceCallback) {
            this.c = (SigmaDeviceCallback) deviceIntelligenceCallback;
            this.f.a(this.i);
            return;
        }
        if (deviceIntelligenceCallback instanceof SessionTokenCallback) {
            this.f.a((SessionTokenCallback) deviceIntelligenceCallback);
            return;
        }
        Intrinsics.checkNotNullParameter("SocureInternal", "tag");
        Intrinsics.checkNotNullParameter("Invalid callback type", "msg");
        int ordinal = com.socure.idplus.device.internal.logger.a.f870a.ordinal();
        if (ordinal == 0) {
            Log.e("SocureInternal", "Invalid callback type");
        } else {
            if (ordinal != 1) {
                return;
            }
            Log.i("SocureInternal", "Invalid callback type");
        }
    }

    public final void b(Activity context) {
        Intrinsics.checkNotNullParameter(context, "activity");
        com.socure.idplus.device.internal.behavior.manager.f fVar = this.h;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(context, "activity");
        com.socure.idplus.device.internal.sigmaDeviceLocation.manager.e eVar = fVar.d;
        if (eVar != null) {
            Intrinsics.checkNotNullParameter(context, "context");
            com.socure.idplus.device.internal.sigmaDeviceLocation.monitor.a aVar = eVar.b;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            if (aVar.f880a && com.socure.idplus.device.internal.permission.a.a(com.socure.idplus.device.internal.permission.b.f873a, context)) {
                aVar.f880a = false;
                Intrinsics.checkNotNullParameter(context, "context");
                com.socure.idplus.device.internal.sigmaDeviceLocation.manager.d dVar = new com.socure.idplus.device.internal.sigmaDeviceLocation.manager.d(eVar);
                FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Context) context);
                Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
                com.socure.idplus.device.internal.viewModel.location.c.a(context, fusedLocationProviderClient, dVar);
            }
        }
        fVar.f.a(context);
    }

    public final void c() {
        Intrinsics.checkNotNullParameter("SocureInternal", "tag");
        Intrinsics.checkNotNullParameter("onForeground()", "msg");
        int ordinal = com.socure.idplus.device.internal.logger.a.f870a.ordinal();
        if (ordinal == 0) {
            Log.e("SocureInternal", "onForeground()");
        } else if (ordinal == 1) {
            Log.i("SocureInternal", "onForeground()");
        }
        this.h.b(false);
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void a() {
        Intrinsics.checkNotNullParameter("SocureInternal", "tag");
        Intrinsics.checkNotNullParameter("onBackground()", "msg");
        int ordinal = com.socure.idplus.device.internal.logger.a.f870a.ordinal();
        if (ordinal == 0) {
            Log.e("SocureInternal", "onBackground()");
        } else if (ordinal == 1) {
            Log.i("SocureInternal", "onBackground()");
        }
        this.h.a(false);
    }

    public final void b() {
        Intrinsics.checkNotNullParameter("SocureInternal", "tag");
        Intrinsics.checkNotNullParameter("onDestroy()", "msg");
        com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.f870a;
        k kVar = this.d;
        kVar.c = false;
        kVar.f861a.clear();
        com.socure.idplus.device.internal.sigmaDeviceSession.manager.j jVar = this.f;
        jVar.h = null;
        jVar.i = null;
        jVar.g.clear();
        jVar.f = com.socure.idplus.device.internal.sigmaDeviceSession.a.c;
        com.socure.idplus.device.internal.behavior.manager.f fVar = this.h;
        com.socure.idplus.device.internal.input.f fVar2 = fVar.g;
        fVar2.getClass();
        LifeCycleType lifeCycleType = LifeCycleType.DESTROYED;
        Intrinsics.checkNotNullParameter(lifeCycleType, "lifeCycleType");
        fVar2.a(new LifeCycleEvent(SystemClock.uptimeMillis(), lifeCycleType));
        fVar.b();
        com.socure.idplus.device.internal.input.manager.a aVar2 = fVar.e;
        if (aVar2 != null) {
            aVar2.c();
            Iterator it = aVar2.g.iterator();
            while (it.hasNext()) {
                ((com.socure.idplus.device.internal.input.manager.b) it.next()).b();
            }
        }
        fVar.l = 0L;
        fVar.c.a();
        com.socure.idplus.device.internal.api.b bVar = this.e;
        bVar.d = null;
        bVar.e = null;
    }

    public final void a(Context context, SigmaDeviceContext sigmaDeviceContext, Function2 onSuccess, Function2 onError) {
        com.socure.idplus.device.internal.sigmaDeviceSession.manager.j jVar = this.f;
        String sdkKey = this.f869a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sigmaDeviceContext, "sigmaDeviceContext");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        jVar.f = com.socure.idplus.device.internal.sigmaDeviceSession.a.b;
        com.socure.idplus.device.internal.sigmaDeviceSession.manager.f fVar = new com.socure.idplus.device.internal.sigmaDeviceSession.manager.f(jVar, onSuccess);
        com.socure.idplus.device.internal.sigmaDeviceSession.manager.g gVar = new com.socure.idplus.device.internal.sigmaDeviceSession.manager.g(jVar, onError);
        DeviceMetadata a2 = com.socure.idplus.device.internal.viewModel.deviceV2.a.a(context, sigmaDeviceContext, jVar.c);
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
        com.socure.idplus.device.internal.sharedPrefs.a aVar = jVar.b;
        String str2 = null;
        String string = aVar.f874a.getString("socure_customer_session", null);
        if (string != null && !StringsKt.isBlank(string)) {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("deviceId")) {
                str2 = jSONObject.getString("deviceId");
            }
        }
        if (str2 == null && (str2 = aVar.f874a.getString("SocureDeviceRiskUUID", "")) == null) {
            str2 = "";
        }
        String str3 = jVar.i;
        CreateSessionWindowRequest createSessionWindowRequest = new CreateSessionWindowRequest(str2, str3 != null ? str3 : "", jVar.c.getCustomerSessionId(), a2);
        com.socure.idplus.device.internal.sigmaDeviceSession.manager.h onSuccess2 = new com.socure.idplus.device.internal.sigmaDeviceSession.manager.h(jVar, fVar, gVar);
        com.socure.idplus.device.internal.sigmaDeviceSession.manager.i onError2 = new com.socure.idplus.device.internal.sigmaDeviceSession.manager.i(gVar);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(createSessionWindowRequest, "createSessionWindowRequest");
        Intrinsics.checkNotNullParameter(onSuccess2, "onSuccess");
        Intrinsics.checkNotNullParameter(onError2, "onError");
        com.socure.idplus.device.internal.network.c.a(new com.socure.idplus.device.internal.sigmaDeviceSession.dataHandler.b(api, com.socure.idplus.device.internal.common.utils.a.a(sdkKey), createSessionWindowRequest), onSuccess2, onError2);
    }

    public final void a(Context context, SessionTokenCallback sessionTokenCallback) {
        a(context, new SigmaDeviceContext.Default(), new h(sessionTokenCallback, this, context), new i(this, sessionTokenCallback));
    }
}
