package ya0;

import A30.m;
import H30.e;
import H30.s;
import L30.j;
import Q90.c;
import android.content.Context;
import android.os.Build;
import c90.InterfaceC5773a;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import v30.d;

/* renamed from: ya0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10877b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f106445a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final O30.b f106446b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f106447c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f106448d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final S30.a f106449e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final d f106450f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final m f106451g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Ib.a<InterfaceC5773a> f106452h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Moshi f106453i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f106454j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f106455k;

    public C10877b(@NotNull c featureToggles, @NotNull O30.b fintechLibType, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull S30.a applicationInfoDataSource, @NotNull d fintechAntiFraudInteractor, @NotNull m fintechAuthInteractor, @NotNull Ib.a<InterfaceC5773a> testEnvironmentManagerLazy, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(testEnvironmentManagerLazy, "testEnvironmentManagerLazy");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f106445a = featureToggles;
        this.f106446b = fintechLibType;
        this.f106447c = fintechSettings;
        this.f106448d = fintechAnalyticInteractor;
        this.f106449e = applicationInfoDataSource;
        this.f106450f = fintechAntiFraudInteractor;
        this.f106451g = fintechAuthInteractor;
        this.f106452h = testEnvironmentManagerLazy;
        this.f106453i = moshi;
    }

    @NotNull
    public final C10876a a(Context context, @NotNull String url, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        m mVar;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        Intrinsics.checkNotNullParameter(url, "url");
        int i11 = R80.a.f24791c;
        ru.ozon.fintech.settings.domain.a aVar = this.f106447c;
        if (!R80.a.a(url, aVar)) {
            return new C10876a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, U.c());
        }
        String str32 = context == null ? null : e.d(context) ? "dark" : "light";
        String str33 = str32 == null ? "" : str32;
        String appVersionCombined = aVar.getAppVersionCombined();
        String j11 = aVar.j();
        String h11 = ru.ozon.fintech.settings.domain.a.h();
        String valueOf = String.valueOf(aVar.getAppO3Name());
        String e11 = ExternalFintechSettings.b.e(aVar);
        S30.a aVar2 = this.f106449e;
        String uniqueApplicationId = aVar2.getUniqueApplicationId();
        String c11 = this.f106450f.c();
        String c12 = aVar2.c();
        String str34 = Build.VERSION.RELEASE;
        LinkedHashMap l11 = U.l(new Pair("x-ob-new-arch", "true"), new Pair("x-ob-theme", str33), new Pair("x-requested-with", "ru.ozon.app"), new Pair("x-app-version", appVersionCombined), new Pair("Sec-CH-Prefers-Color-Scheme", str33), new Pair("x-ob-sessionid", j11), new Pair("x-ob-model-device", h11), new Pair("x-o3-app-name", valueOf), new Pair("x-o3-app-version", e11), new Pair("x-o3-device-type", "mobile"), new Pair("x-app-uuid", uniqueApplicationId), new Pair("x-device-status", c11), new Pair("x-ob-fullscreen-enabled", "true"), new Pair("x-ob-ozon-payment-fullscreen", "true"), new Pair("x-o3-device-language", c12), new Pair("x-ob-osver", str34));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Tl.a.f(this.f106445a, S90.c.MOB_INTERFACE_SCALE)) {
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "<this>");
                str2 = c12;
                str31 = String.format(Locale.US, "%.1f:%.1f", Arrays.copyOf(new Object[]{Float.valueOf(context.getResources().getConfiguration().fontScale), Float.valueOf(context.getResources().getDisplayMetrics().density)}, 2));
                Intrinsics.checkNotNullExpressionValue(str31, "format(...)");
            } else {
                str2 = c12;
                str31 = null;
            }
            if (str31 == null) {
                str31 = "";
            }
            linkedHashMap.put("x-ob-interface-scale", str31);
            str3 = str31;
        } else {
            str2 = c12;
            str3 = null;
        }
        String b11 = j.b(context, this.f106446b);
        linkedHashMap.put("x-ob-insets", b11);
        boolean z11 = this.f106455k;
        m mVar2 = this.f106451g;
        if (z11) {
            String valueOf2 = String.valueOf(mVar2.n());
            linkedHashMap.put("x-ob-cold-start", valueOf2);
            str4 = valueOf2;
        } else {
            str4 = null;
        }
        if (mVar2.t()) {
            boolean u11 = mVar2.u();
            if (this.f106455k) {
                str30 = mVar2.m();
                if (str30 != null) {
                    if (!u11) {
                        str30 = null;
                    }
                    if (str30 != null) {
                        linkedHashMap.put("x-ob-biometry-token", str30);
                        Unit unit = Unit.f71690a;
                        u11 = mVar2.u();
                    }
                }
                str30 = null;
                u11 = mVar2.u();
            } else {
                str30 = null;
            }
            String str35 = u11 ? "1" : "0";
            str5 = b11;
            linkedHashMap.put("x-ob-fast-entry", str35);
            str7 = str35;
            str6 = str30;
        } else {
            str5 = b11;
            str6 = null;
            str7 = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (aVar.isQa()) {
            InterfaceC5773a interfaceC5773a = this.f106452h.get();
            String c13 = s.c(interfaceC5773a.getMeshHeader());
            if (c13 != null) {
                linkedHashMap2.put("x-o3-meshversion", c13);
                Unit unit2 = Unit.f71690a;
            } else {
                c13 = null;
            }
            String c14 = s.c(interfaceC5773a.getTestingFeaturesHeader());
            if (c14 != null) {
                linkedHashMap2.put("ob-testing-features", c14);
                Unit unit3 = Unit.f71690a;
            } else {
                c14 = null;
            }
            String c15 = s.c(interfaceC5773a.n());
            String str36 = c14;
            if (c15 != null) {
                linkedHashMap2.put("ob-testing-features-v2", c15);
                Unit unit4 = Unit.f71690a;
            } else {
                c15 = null;
            }
            String c16 = s.c(interfaceC5773a.getLoginHeader());
            String str37 = c15;
            if (c16 != null) {
                linkedHashMap2.put("x-ob-test-login", c16);
                Unit unit5 = Unit.f71690a;
            } else {
                c16 = null;
            }
            String c17 = s.c(interfaceC5773a.getPasswordHeader());
            String str38 = c16;
            if (c17 != null) {
                linkedHashMap2.put("x-ob-test-password", c17);
                Unit unit6 = Unit.f71690a;
            } else {
                c17 = null;
            }
            String c18 = s.c(interfaceC5773a.d());
            String str39 = c17;
            if (c18 != null) {
                linkedHashMap2.put("x-o3-sample-trace", c18);
                Unit unit7 = Unit.f71690a;
            } else {
                c18 = null;
            }
            if (s.c(interfaceC5773a.getHeaderToken()) != null) {
                str29 = interfaceC5773a.getHeaderToken();
                str28 = c18;
                linkedHashMap2.put("x-o3-internal-headers-token", str29);
                Unit unit8 = Unit.f71690a;
            } else {
                str28 = c18;
                str29 = null;
            }
            String valueOf3 = String.valueOf(interfaceC5773a.getIsAutotestsHeader());
            String str40 = str29;
            linkedHashMap2.put("is-mobile-autotests", valueOf3);
            Unit unit9 = Unit.f71690a;
            String c19 = s.c(interfaceC5773a.s());
            if (c19 != null) {
                linkedHashMap2.put("x-o3-test-name", c19);
            } else {
                c19 = null;
            }
            String c21 = s.c(interfaceC5773a.getABVariantsHeader());
            String str41 = c19;
            if (c21 != null) {
                linkedHashMap2.put("x-o3-ab-variants", c21);
            } else {
                c21 = null;
            }
            String c22 = s.c(interfaceC5773a.b());
            String str42 = c21;
            if (c22 != null) {
                linkedHashMap2.put("x-o3-ob-testing-auth-ttl", c22);
            } else {
                c22 = null;
            }
            String c23 = s.c(interfaceC5773a.r());
            String str43 = c22;
            if (c23 != null) {
                linkedHashMap2.put("x-fe-ob-features-mock", c23);
            } else {
                c23 = null;
            }
            str20 = str43;
            str21 = c23;
            str14 = str37;
            str13 = str38;
            str24 = str28;
            str22 = valueOf3;
            str23 = str41;
            str12 = "true";
            str15 = c13;
            str8 = c11;
            str9 = "ru.ozon.app";
            mVar = mVar2;
            str19 = str42;
            str10 = e11;
            str11 = "mobile";
            str16 = str36;
            str17 = str39;
            str18 = str40;
        } else {
            mVar = mVar2;
            str8 = c11;
            str9 = "ru.ozon.app";
            str10 = e11;
            str11 = "mobile";
            str12 = "true";
            str13 = null;
            str14 = null;
            str15 = null;
            str16 = null;
            str17 = null;
            str18 = null;
            str19 = null;
            str20 = null;
            str21 = null;
            str22 = null;
            str23 = null;
            str24 = null;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        String str44 = str14;
        InterfaceC6618a interfaceC6618a = this.f106448d;
        m mVar3 = mVar;
        String b12 = interfaceC6618a.b();
        if (b12 != null) {
            linkedHashMap3.put("x-ob-user-appsflyer-id", b12);
            Unit unit10 = Unit.f71690a;
            str25 = b12;
        } else {
            str25 = null;
        }
        if (str != null) {
            linkedHashMap3.put("x-ob-tab-id", str);
            Unit unit11 = Unit.f71690a;
            str26 = str;
        } else {
            str26 = null;
        }
        LinkedHashMap u12 = U.u(U.m(U.m(U.m(l11, linkedHashMap), linkedHashMap2), linkedHashMap3));
        if (this.f106454j) {
            Iterator<T> it = mVar3.l().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                u12.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : mVar3.o().entrySet()) {
            u12.put(entry2.getKey(), entry2.getValue());
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(U.h(u12.size()));
        for (Map.Entry entry3 : u12.entrySet()) {
            Object key = entry3.getKey();
            String str45 = (String) entry3.getValue();
            linkedHashMap4.put(key, str45 != null ? Integer.valueOf(str45.length()) : null);
        }
        try {
            str27 = this.f106453i.c(Map.class).toJson(linkedHashMap4);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str27 = "";
        }
        interfaceC6618a.p1(str, str27);
        return new C10876a("true", str33, str9, appVersionCombined, str33, j11, h11, valueOf, str10, str11, uniqueApplicationId, str8, str12, "true", str2, str34, str3, str5, str4, str6, str7, str25, str26, str15, str16, str44, str13, str17, str18, str19, str20, str21, str22, str23, str24, u12);
    }

    public final void b(boolean z11) {
        this.f106454j = z11;
    }

    public final void c(boolean z11) {
        this.f106455k = z11;
    }
}
