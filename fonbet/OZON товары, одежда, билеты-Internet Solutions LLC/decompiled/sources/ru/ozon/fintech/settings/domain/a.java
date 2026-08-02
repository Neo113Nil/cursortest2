package ru.ozon.fintech.settings.domain;

import Ae.O0;
import Ae.x0;
import C.C2702w;
import O30.b;
import Q90.c;
import Q90.l;
import Q90.o;
import R90.e;
import Sc.InterfaceC4008j;
import Sc.k;
import T90.g;
import U7.d;
import We.B;
import We.E;
import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import g30.InterfaceC6618a;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.settings.models.Pins;

/* loaded from: classes3.dex */
public final class a implements ExternalFintechSettings {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f97021a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f97022b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final o f97023c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f97024d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f97025e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ExternalFintechSettings f97026f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final c f97027g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97028h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f97029i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f97030j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f97031k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final x0<String> f97032l;

    /* renamed from: ru.ozon.fintech.settings.domain.a$a, reason: collision with other inner class name */
    public static final class C2128a {

        /* renamed from: a, reason: collision with root package name */
        private final long f97033a;

        /* renamed from: b, reason: collision with root package name */
        private final int f97034b;

        public C2128a(long j11, int i11) {
            this.f97033a = j11;
            this.f97034b = i11;
        }

        public final int a() {
            return this.f97034b;
        }

        public final long b() {
            return this.f97033a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2128a)) {
                return false;
            }
            C2128a c2128a = (C2128a) obj;
            return this.f97033a == c2128a.f97033a && this.f97034b == c2128a.f97034b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f97034b) + (Long.hashCode(this.f97033a) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateShowInfo(day=");
            sb2.append(this.f97033a);
            sb2.append(", count=");
            return K00.b.e(this.f97034b, ")", sb2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    public a(@NotNull Application application, @NotNull b fintechLibType, @NotNull o sessionIdProvider, @NotNull g settingsRepository, @NotNull SharedPreferences sharedPreferences, @NotNull ExternalFintechSettings externalFintechSettings, @NotNull c featureToggles, @NotNull E okHttpClient, @NotNull InterfaceC6618a fintechAnalyticInteractor) {
        R90.c cVar;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f97021a = application;
        this.f97022b = fintechLibType;
        this.f97023c = sessionIdProvider;
        this.f97024d = settingsRepository;
        this.f97025e = sharedPreferences;
        this.f97026f = externalFintechSettings;
        this.f97027g = featureToggles;
        this.f97028h = k.b(new l(this, 0));
        this.f97030j = sharedPreferences.getBoolean("fintech_feature_first_launch", true);
        this.f97031k = d.e(application.getPackageName(), ".fintechfileprovider");
        this.f97032l = O0.a(null);
        Iterator it = okHttpClient.u().iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = 0;
                break;
            } else {
                cVar = it.next();
                if (((B) cVar) instanceof R90.c) {
                    break;
                }
            }
        }
        R90.c cVar2 = cVar instanceof R90.c ? cVar : null;
        if (cVar2 != null) {
            cVar2.a(new e(fintechAnalyticInteractor, this, this.f97027g));
        }
        if (this.f97030j) {
            C2702w.e(this.f97025e, "fintech_feature_first_launch", false);
        }
    }

    public static boolean a(a aVar) {
        aVar.getClass();
        Application application = aVar.f97021a;
        try {
            application.getPackageManager().getPackageInfo("ru.ozon.app.android", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            try {
                application.getPackageManager().getPackageInfo("ru.ozon.app.android.qa", 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused2) {
                return false;
            }
        }
    }

    @NotNull
    public static String h() {
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return V.e.b(new Object[]{BRAND, MODEL}, 2, "%s %s", "format(...)");
    }

    public final void A() {
        SharedPreferences.Editor edit = this.f97025e.edit();
        edit.putLong("fintech_in_app_review", new Date().getTime());
        edit.apply();
    }

    public final void B() {
        this.f97029i = true;
    }

    public final void C(boolean z11) {
        this.f97025e.edit().putBoolean("fintech_suggest_bio_on_pin_pad_enter", z11).apply();
    }

    public final void D(int i11) {
        SharedPreferences.Editor edit = this.f97025e.edit();
        edit.putInt("fintech_theme_mode", i11);
        edit.apply();
    }

    public final boolean E() {
        try {
            return this.f97025e.getBoolean("video_muxer_error", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean F() {
        try {
            return this.f97025e.getBoolean("video_upload_video", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean b() {
        try {
            return this.f97025e.getBoolean("allow_webview_ssl_error", false);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT < 31 || !this.f97026f.isStandAloneIntegration()) {
            return false;
        }
        b bVar = b.FINANCE;
        b bVar2 = this.f97022b;
        return bVar2 == bVar || bVar2 == b.RKO;
    }

    public final Pins d() {
        return this.f97024d.a();
    }

    @NotNull
    public final String e() {
        boolean u11 = u();
        ExternalFintechSettings externalFintechSettings = this.f97026f;
        return u11 ? externalFintechSettings.getApiUrlStage() : externalFintechSettings.getApiUrlRelease();
    }

    @NotNull
    public final String f() {
        return ExternalFintechSettings.b.d(this, this.f97025e);
    }

    @NotNull
    public final x0<String> g() {
        return this.f97032l;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getApiUrlRelease() {
        return this.f97026f.getApiUrlRelease();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getApiUrlStage() {
        return this.f97026f.getApiUrlStage();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final String getAppName() {
        return this.f97026f.getAppName();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final String getAppO3Name() {
        return this.f97026f.getAppO3Name();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getAppVersionCombined() {
        return this.f97026f.getAppVersionCombined();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getBankApiUrl(@NotNull SharedPreferences sharedPreferences) {
        return ExternalFintechSettings.b.b(this, sharedPreferences);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getBankUrl(@NotNull SharedPreferences sharedPreferences) {
        return ExternalFintechSettings.b.d(this, sharedPreferences);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getBankUrlRelease() {
        return this.f97026f.getBankUrlRelease();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getBankUrlStage() {
        return this.f97026f.getBankUrlStage();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getBasePath() {
        return "/";
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final int getCommsAppId() {
        return this.f97026f.getCommsAppId();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getCommsBodyAppName() {
        return this.f97026f.getCommsBodyAppName();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getCommsHeaderAppName() {
        return this.f97026f.getCommsHeaderAppName();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final int getDefaultWalletIdRequestCode() {
        return this.f97026f.getDefaultWalletIdRequestCode();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final S90.b getFeatureFlagsConfig() {
        return this.f97026f.getFeatureFlagsConfig();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getFintechSdkVersionName() {
        return "19.27.0";
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final boolean getGlobalFlagSecured() {
        return this.f97026f.getGlobalFlagSecured();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final String getLocationUid() {
        return this.f97026f.getLocationUid();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final int getMinSupportedVersionWebView() {
        return 73;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final boolean getNeedOffline() {
        return this.f97026f.getNeedOffline();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final boolean getNeedOzonId() {
        return this.f97026f.getNeedOzonId();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getO3AppVersionCombined() {
        return ExternalFintechSettings.b.e(this);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final String getOzonSessionId() {
        return this.f97026f.getOzonSessionId();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getPackageName() {
        return this.f97026f.getPackageName();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getPinsUrl(@NotNull SharedPreferences sharedPreferences) {
        return ExternalFintechSettings.b.f(this, sharedPreferences);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getPinsUrlRelease() {
        return this.f97026f.getPinsUrlRelease();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getPinsUrlStage() {
        return this.f97026f.getPinsUrlStage();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final Integer getPushIcon() {
        return this.f97026f.getPushIcon();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final Integer getSplashBackColorRes() {
        return this.f97026f.getSplashBackColorRes();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final Integer getSplashTheme() {
        return this.f97026f.getSplashTheme();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final Integer getSplashUltraTheme() {
        return this.f97026f.getSplashUltraTheme();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final int getTokenizationRequestCode() {
        return this.f97026f.getTokenizationRequestCode();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getVersionCode() {
        return this.f97026f.getVersionCode();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    @NotNull
    public final String getVersionName() {
        return this.f97026f.getVersionName();
    }

    @NotNull
    public final String i() {
        return this.f97031k;
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final boolean isForceStage() {
        return this.f97026f.isForceStage();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final Boolean isOzonStage() {
        return this.f97026f.isOzonStage();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final boolean isQa() {
        return this.f97026f.isQa();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final Boolean isRooted() {
        return this.f97026f.isRooted();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final boolean isStandAloneIntegration() {
        return this.f97026f.isStandAloneIntegration();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final boolean isUnderAutotest() {
        return this.f97026f.isUnderAutotest();
    }

    @NotNull
    public final String j() {
        return this.f97023c.a();
    }

    public final int k() {
        return this.f97025e.getInt("fintech_theme_mode", -1);
    }

    @NotNull
    public final C2128a l() {
        SharedPreferences sharedPreferences = this.f97025e;
        return new C2128a(sharedPreferences.getLong("prefs_update_show_day", -1L), sharedPreferences.getInt("prefs_update_show_count", 0));
    }

    public final boolean m() {
        return this.f97025e.getBoolean("fintech_ignore_load_pending_tabs", false);
    }

    public final void n() {
        long epochDay = LocalDate.now().toEpochDay();
        SharedPreferences sharedPreferences = this.f97025e;
        long j11 = sharedPreferences.getLong("prefs_update_show_day", -1L);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (j11 == epochDay) {
            edit.putInt("prefs_update_show_count", sharedPreferences.getInt("prefs_update_show_count", 0) + 1);
        } else {
            edit.putLong("prefs_update_show_day", epochDay);
            edit.putInt("prefs_update_show_count", 1);
        }
        edit.apply();
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final boolean needShowNotificationRequest() {
        return this.f97026f.needShowNotificationRequest();
    }

    public final Boolean o() {
        int i11 = this.f97025e.getInt("fintech_allow_data_send", -1);
        if (i11 == 0) {
            return Boolean.FALSE;
        }
        if (i11 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final boolean p() {
        return ((Boolean) this.f97028h.getValue()).booleanValue();
    }

    public final boolean q() {
        return this.f97030j;
    }

    public final boolean r() {
        Long y02;
        long j11 = this.f97025e.getLong("fintech_in_app_review", 0L);
        String stringData = this.f97027g.q(S90.c.MOB_SHOW_REVIEW_APP).b().getStringData();
        return j11 != 0 && (new Date().getTime() - j11) / 86400000 < ((stringData == null || (y02 = h.y0(stringData)) == null) ? 30L : y02.longValue());
    }

    public final boolean s() {
        return this.f97025e.getBoolean("fintech_render_gone_key", false);
    }

    @Override // ru.ozon.fintech.settings.domain.ExternalFintechSettings
    public final void setGlobalFlagSecured(boolean z11) {
        this.f97026f.setGlobalFlagSecured(z11);
    }

    public final boolean t() {
        return this.f97029i;
    }

    public final boolean u() {
        ExternalFintechSettings externalFintechSettings = this.f97026f;
        Boolean isOzonStage = externalFintechSettings.isOzonStage();
        boolean isForceStage = externalFintechSettings.isForceStage();
        SharedPreferences sharedPreferences = this.f97025e;
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        String string = sharedPreferences.getString(ExternalFintechSettings.OZON_SP_SERVER_KEY, ExternalFintechSettings.OZON_SP_SERVER_VALUE_PROD);
        if (isForceStage) {
            return true;
        }
        if (isOzonStage == null || !isOzonStage.booleanValue()) {
            return (isOzonStage == null || isOzonStage.booleanValue()) && !Intrinsics.d(string, ExternalFintechSettings.OZON_SP_SERVER_VALUE_PROD);
        }
        return true;
    }

    public final boolean v() {
        return this.f97025e.getBoolean("fintech_suggest_bio_on_pin_pad_enter", true);
    }

    public final void w() {
        this.f97023c.b();
    }

    public final void x(String str) {
        this.f97032l.setValue(str);
    }

    public final void y(Boolean bool) {
        SharedPreferences.Editor edit = this.f97025e.edit();
        if (bool.equals(Boolean.TRUE)) {
            edit.putInt("fintech_allow_data_send", 1);
        } else if (bool.equals(Boolean.FALSE)) {
            edit.putInt("fintech_allow_data_send", 0);
        } else {
            edit.remove("fintech_allow_data_send");
        }
        edit.commit();
    }

    public final void z() {
        this.f97030j = false;
    }
}
