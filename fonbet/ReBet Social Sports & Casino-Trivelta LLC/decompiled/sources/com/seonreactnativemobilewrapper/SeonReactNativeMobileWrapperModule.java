package com.seonreactnativemobilewrapper;

import Jh.b;
import Kh.d;
import android.content.Context;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import io.seon.androidsdk.service.C4902d;
import io.seon.androidsdk.service.InterfaceC4894c;
import io.seon.androidsdk.service.InterfaceC4910e;
import io.seon.androidsdk.service.InterfaceC4918f;
import java.util.Objects;
import java.util.UUID;

@ReactModule(name = "SeonReactNativeMobileWrapperSpec")
/* loaded from: classes4.dex */
public class SeonReactNativeMobileWrapperModule extends NativeSeonReactNativeMobileWrapperSpec {
    public static final String NAME = "SeonReactNativeMobileWrapperSpec";
    private Context context;
    private Jh.a mGeoConfig;
    private InterfaceC4894c m_seon;
    private String sessionID;

    public class a implements InterfaceC4918f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f41482a;

        public a(Promise promise) {
            this.f41482a = promise;
        }

        @Override // io.seon.androidsdk.service.InterfaceC4918f
        public void a(String str, int i10) {
            this.f41482a.reject("SEON_GEO_FAILURE_CODE:" + String.valueOf(i10), "SEON_GEO_FAILURE_CODE: " + String.valueOf(i10) + " RESPONSE:" + str);
        }

        @Override // io.seon.androidsdk.service.InterfaceC4910e
        public void b(String str) {
            this.f41482a.resolve(str);
        }
    }

    public SeonReactNativeMobileWrapperModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.sessionID = UUID.randomUUID().toString();
        this.context = reactApplicationContext.getApplicationContext();
        this.m_seon = new C4902d().b(this.context).d(this.sessionID).a();
        this.mGeoConfig = new b().a();
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec
    public void getFingerprintBase64(final Promise promise) {
        Jh.a aVar = this.mGeoConfig;
        if (aVar != null && aVar.c()) {
            try {
                this.m_seon.g(new a(promise));
                return;
            } catch (Exception e10) {
                promise.reject("SEON_ERROR", e10);
                return;
            }
        }
        try {
            InterfaceC4894c interfaceC4894c = this.m_seon;
            Objects.requireNonNull(promise);
            interfaceC4894c.g(new InterfaceC4910e() { // from class: yc.a
                @Override // io.seon.androidsdk.service.InterfaceC4910e
                public final void b(String str) {
                    Promise.this.resolve(str);
                }
            });
        } catch (Exception e11) {
            promise.reject("SEON_ERROR", e11);
        }
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "SeonReactNativeMobileWrapperSpec";
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec
    public void setDnsTimeout(double d10, Promise promise) {
        this.m_seon = new C4902d().b(this.context).d(this.sessionID).c((int) Math.floor(d10)).a();
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec
    public void setGeoLocationConfig(ReadableMap readableMap, Promise promise) {
        b bVar = new b();
        if (readableMap.hasKey("geolocationEnabled")) {
            bVar.f(readableMap.getBoolean("geolocationEnabled"));
        }
        if (readableMap.hasKey("prefetchEnabled")) {
            bVar.i(readableMap.getBoolean("prefetchEnabled"));
        }
        if (readableMap.hasKey("geolocationServiceTimeoutMs")) {
            bVar.g(readableMap.getInt("geolocationServiceTimeoutMs"));
        }
        if (readableMap.hasKey("maxGeoLocationCacheAgeSec")) {
            bVar.h(readableMap.getInt("maxGeoLocationCacheAgeSec"));
        }
        Jh.a a10 = bVar.a();
        this.m_seon.f(a10);
        this.mGeoConfig = a10;
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec
    public void setGeolocationEnabled(boolean z10, Promise promise) {
        this.m_seon.d(z10);
        promise.resolve(Boolean.TRUE);
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec
    public void setLoggingEnabled(boolean z10, Promise promise) {
        try {
            this.m_seon.b(Boolean.valueOf(z10));
            promise.resolve(null);
        } catch (Exception e10) {
            promise.reject("setLoggingEnabled", e10);
        }
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec
    public void setSessionId(String str, Promise promise) {
        try {
            this.m_seon.c(str);
            promise.resolve(null);
        } catch (Exception e10) {
            promise.reject("setSessionId", e10);
        }
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec
    public void startBehaviourMonitoring(Promise promise) {
        try {
            this.m_seon.e();
            promise.resolve(null);
        } catch (Exception e10) {
            promise.reject("BEHAVIOUR_ERROR", e10);
        }
    }

    @Override // com.seonreactnativemobilewrapper.NativeSeonReactNativeMobileWrapperSpec
    public void stopBehaviourMonitoring(final Promise promise) {
        try {
            this.m_seon.a(new InterfaceC4910e() { // from class: yc.b
                @Override // io.seon.androidsdk.service.InterfaceC4910e
                public final void b(String str) {
                    Promise.this.resolve(str);
                }
            });
        } catch (Kh.a e10) {
            promise.reject("BEHAVIOUR_ERROR", e10);
        } catch (d e11) {
            promise.reject("BEHAVIOUR_ERROR", e11);
        }
    }
}
