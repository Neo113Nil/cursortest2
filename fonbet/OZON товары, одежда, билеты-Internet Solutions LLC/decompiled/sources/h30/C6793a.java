package h30;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6793a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f64741a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AppsFlyerLib f64742b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f64743c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6794b f64744d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C1051a f64745e;

    /* renamed from: h30.a$a, reason: collision with other inner class name */
    public static final class C1051a implements AppsFlyerConversionListener {
        C1051a() {
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public final void onAppOpenAttribution(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            String str = map.get("deep_link_value");
            if (str == null) {
                str = map.get("af_dp");
            }
            InterfaceC6794b interfaceC6794b = C6793a.this.f64744d;
            if (interfaceC6794b != null) {
                interfaceC6794b.b(str);
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public final void onAttributionFailure(String s11) {
            Intrinsics.checkNotNullParameter(s11, "s");
            L80.a.a("AppsFlyerPlugin", "onAttributionFailure: " + s11);
            InterfaceC6794b interfaceC6794b = C6793a.this.f64744d;
            if (interfaceC6794b != null) {
                interfaceC6794b.a(s11);
            }
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public final void onConversionDataFail(String s11) {
            Intrinsics.checkNotNullParameter(s11, "s");
            L80.a.a("AppsFlyerPlugin", "onConversionDataFail: " + s11);
        }

        @Override // com.appsflyer.AppsFlyerConversionListener
        public final void onConversionDataSuccess(Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            L80.a.a("AppsFlyerPlugin", "onConversionDataSuccess: " + map);
            C6793a c6793a = C6793a.this;
            boolean z11 = c6793a.f64743c.getBoolean("called_before", false);
            L80.a.a("AppsFlyerPlugin", "calledBefore = " + z11);
            SharedPreferences.Editor edit = c6793a.f64743c.edit();
            edit.putBoolean("called_before", true);
            edit.apply();
            Object obj = map.get("af_status");
            String str = null;
            String str2 = obj instanceof String ? (String) obj : null;
            L80.a.a("AppsFlyerPlugin", "status = " + str2);
            if (Intrinsics.d(str2, "Organic")) {
                return;
            }
            Object obj2 = map.get("is_first_launch");
            Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            L80.a.a("AppsFlyerPlugin", "isFirstLaunch = " + bool);
            if (Intrinsics.d(bool, Boolean.FALSE) || z11) {
                return;
            }
            Object obj3 = map.get("deep_link_value");
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 == null) {
                Object obj4 = map.get("af_dp");
                if (obj4 instanceof String) {
                    str = (String) obj4;
                }
            } else {
                str = str3;
            }
            L80.a.a("AppsFlyerPlugin", "deeplink = " + str);
            InterfaceC6794b interfaceC6794b = c6793a.f64744d;
            if (interfaceC6794b != null) {
                interfaceC6794b.b(str);
            }
        }
    }

    public C6793a(@NotNull Context context, @NotNull AppsFlyerLib appsFlyerLib, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f64741a = context;
        this.f64742b = appsFlyerLib;
        this.f64743c = sharedPreferences;
        this.f64745e = new C1051a();
    }

    public final void c(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f64742b.performOnDeepLinking(intent, this.f64741a);
    }

    public final void d(@NotNull String devKey) {
        Intrinsics.checkNotNullParameter(devKey, "devKey");
        AppsFlyerLib appsFlyerLib = this.f64742b;
        appsFlyerLib.setDebugLog(false);
        appsFlyerLib.setHost("", "appsflyersdk.com");
        C1051a c1051a = this.f64745e;
        Context context = this.f64741a;
        appsFlyerLib.init(devKey, c1051a, context);
        appsFlyerLib.start(context);
    }

    @NotNull
    public final String e() {
        String appsFlyerUID = this.f64742b.getAppsFlyerUID(this.f64741a);
        return appsFlyerUID == null ? "" : appsFlyerUID;
    }

    public final void f(@NotNull InterfaceC6794b linkListener) {
        Intrinsics.checkNotNullParameter(linkListener, "linkListener");
        this.f64744d = linkListener;
    }

    public final void g() {
        this.f64744d = null;
    }

    public final void h(@NotNull String storeName) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        this.f64742b.setOutOfStore(storeName);
    }
}
