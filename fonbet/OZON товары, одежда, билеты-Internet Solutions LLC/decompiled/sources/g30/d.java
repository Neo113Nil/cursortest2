package g30;

import B0.C2454a;
import N3.C3660k;
import S30.a;
import Sc.C4001c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import c30.j;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.AppMeasurement;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import h30.C6793a;
import h30.InterfaceC6794b;
import io.sentry.C7230z2;
import io.sentry.E;
import io.sentry.K1;
import io.sentry.W2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.k0;
import io.sentry.protocol.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k30.C7478a;
import k30.g;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m90.C8110a;
import n30.C8437a;
import n30.C8438b;
import o30.EnumC8636a;
import org.jetbrains.annotations.NotNull;
import q30.c;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;
import ru.ozon.fintech.analytic.models.HealthData;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest;

/* loaded from: classes3.dex */
public final class d implements InterfaceC6618a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f63737a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6793a f63738b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AnalyticsConfig f63739c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C8438b f63740d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final S30.a f63741e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final j30.c f63742f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final g f63743g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final j f63744h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Moshi f63745i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f63746j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f63747k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f63748l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f63749m;

    public d(@NotNull Context context, @NotNull C6793a appsFlyer, @NotNull AnalyticsConfig analyticsConfig, @NotNull C8438b ozonTrackerPlugin, @NotNull S30.a applicationInfoDataSource, @NotNull j30.c graylogInteractor, @NotNull g mobileHealthInteractor, @NotNull j networkInfoProvider, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyer, "appsFlyer");
        Intrinsics.checkNotNullParameter(analyticsConfig, "analyticsConfig");
        Intrinsics.checkNotNullParameter(ozonTrackerPlugin, "ozonTrackerPlugin");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(graylogInteractor, "graylogInteractor");
        Intrinsics.checkNotNullParameter(mobileHealthInteractor, "mobileHealthInteractor");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f63737a = context;
        this.f63738b = appsFlyer;
        this.f63739c = analyticsConfig;
        this.f63740d = ozonTrackerPlugin;
        this.f63741e = applicationInfoDataSource;
        this.f63742f = graylogInteractor;
        this.f63743g = mobileHealthInteractor;
        this.f63744h = networkInfoProvider;
        this.f63745i = moshi;
        this.f63747k = k.b(new d70.g(this, 1));
        this.f63748l = k.b(new P70.a(this, 1));
        this.f63749m = new LinkedHashMap();
    }

    public static a.C0512a e2(d dVar) {
        return dVar.f63741e.a();
    }

    public static JsonAdapter f2(d dVar) {
        return dVar.f63745i.d(D.e(Map.class, String.class, Object.class));
    }

    public static void g2(d dVar, C7230z2 event, E hint) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (event.O() != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Enumeration<String> k11 = event.C().k();
            Intrinsics.checkNotNullExpressionValue(k11, "keys(...)");
            ArrayList<String> list = Collections.list(k11);
            Intrinsics.checkNotNullExpressionValue(list, "list(...)");
            for (String str : list) {
                Object c11 = event.C().c(str);
                if (c11 != null) {
                    linkedHashMap.put(str, c11);
                }
            }
            g gVar = dVar.f63743g;
            c.a aVar = c.a.ERROR;
            Throwable O11 = event.O();
            String arrays = Arrays.toString(O11 != null ? O11.getStackTrace() : null);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
            String valueOf = String.valueOf(event.G());
            m q02 = event.q0();
            String e11 = q02 != null ? q02.e() : null;
            if (e11 == null) {
                e11 = "";
            }
            LinkedHashMap m11 = U.m(U.j(new Pair("message", e11), new Pair("level", String.valueOf(event.p0())), new Pair("timestamp", event.t0())), linkedHashMap);
            List b02 = C7714v.b0("message", "level", "timestamp");
            Enumeration<String> k12 = event.C().k();
            Intrinsics.checkNotNullExpressionValue(k12, "keys(...)");
            ArrayList list2 = Collections.list(k12);
            Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
            g.f(gVar, aVar, "application", AppMeasurement.CRASH_ORIGIN, new HealthData(null, m11, arrays, null, valueOf, null, null, C7714v.p0(list2, b02), 105, null), null, null, 240);
        }
    }

    public static final void h2(d dVar, List list) {
        dVar.getClass();
        if (list.isEmpty()) {
            return;
        }
        JsonAdapter<Map<String, Object>> j22 = dVar.j2();
        List list2 = list;
        int h11 = U.h(C7714v.z(list2, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((C7478a) it.next()).getClass();
            Pair pair = new Pair(null, C4001c.b(null));
            linkedHashMap.put(pair.e(), pair.f());
        }
        n2(dVar, "fintech_mobile_health_event_warning", null, j22.toJson(linkedHashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 1023);
    }

    private static String i2(String str) {
        int hashCode = str.hashCode();
        return hashCode != -980110702 ? hashCode != -853258278 ? (hashCode == 360643487 && str.equals("finance_encrypted")) ? "encrypted" : "ordinary" : !str.equals("finance") ? "ordinary" : "secured" : !str.equals("prefix") ? "ordinary" : "secured";
    }

    private final JsonAdapter<Map<String, Object>> j2() {
        return (JsonAdapter) this.f63748l.getValue();
    }

    private static String k2(boolean z11) {
        return z11 ? "success" : "fail";
    }

    private final a.C0512a l2() {
        return (a.C0512a) this.f63747k.getValue();
    }

    private static String m2(String str) {
        switch (str.hashCode()) {
            case -97931078:
                return !str.equals("QR_AND_BARCODE") ? "photo" : "mix";
            case 2593:
                return !str.equals(TakePhotoRequest.QR_SCANNER_TYPE) ? "photo" : "qr";
            case 2571565:
                return !str.equals("TEXT") ? "photo" : "phone_scanner";
            case 384398432:
                return !str.equals(TakePhotoRequest.BARCODE_SCANNER_TYPE) ? "photo" : "barcode";
            case 1028436787:
                return !str.equals(TakePhotoRequest.BANK_CARD) ? "photo" : "bank_card_scanner";
            default:
                return "photo";
        }
    }

    static void n2(d dVar, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, Integer num2, String str9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str10, Boolean bool7, String str11, String str12, String str13, String str14, Boolean bool8, String str15, String str16, String str17, Integer num3, String str18, Integer num4, String str19, String str20, Boolean bool9, String str21, String str22, String str23, String str24, int i11, int i12) {
        String str25 = Build.MODEL;
        String str26 = Build.MANUFACTURER;
        dVar.f63742f.l(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : num2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str9, (i11 & 2048) != 0 ? null : bool, (i11 & 4096) != 0 ? null : str25, (i11 & 8192) != 0 ? null : str26, (i11 & 16384) != 0 ? null : bool2, (32768 & i11) != 0 ? null : bool3, (65536 & i11) != 0 ? null : bool4, (131072 & i11) != 0 ? null : bool5, (262144 & i11) != 0 ? null : bool6, (524288 & i11) != 0 ? null : str10, (8388608 & i11) != 0 ? null : bool7, (16777216 & i11) != 0 ? null : str11, (33554432 & i11) != 0 ? null : str12, (67108864 & i11) != 0 ? null : str13, (134217728 & i11) != 0 ? null : str14, (268435456 & i11) != 0 ? null : bool8, (536870912 & i11) != 0 ? null : str15, (1073741824 & i11) != 0 ? null : str16, (i11 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : str17, (i12 & 8) != 0 ? null : str19, (i12 & 1) != 0 ? null : num3, (i12 & 2) != 0 ? null : str18, (i12 & 4) != 0 ? null : num4, (i12 & 16) != 0 ? null : str20, (i12 & 32) != 0 ? null : bool9, (i12 & 64) != 0 ? null : str21, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str22, (i12 & 256) != 0 ? null : str23, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str24);
    }

    private static String o2(boolean z11) {
        return z11 ? "pinpad" : "web";
    }

    @Override // g30.InterfaceC6618a
    public final void A(String str, String str2) {
        n2(this, "fintech_webview_process_gone", null, null, null, str2, l2().a(), str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -114, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void A0(String str, boolean z11) {
        g.f(this.f63743g, c.a.EVENT, "webview", "go_back", new HealthData(null, null, null, null, null, str, null, null, 223, null), z11 ? "ok" : "not_performed", null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void A1(int i11, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_page_load_delay", null, null, Integer.valueOf(i11), null, null, url, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -74, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void B(String str, String str2, String str3, boolean z11) {
        n2(this, "fintech_push_get_jwt_back", null, str2, null, null, null, null, null, null, null, k2(z11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1030, 1023);
        c.a aVar = z11 ? c.a.EVENT : c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("jwttoken", str);
        }
        if (str2 != null) {
            linkedHashMap.put("error_message", str2);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "push", "get_jwt_token", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.a0("error_message"), 125, null), str3, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void B0(@NotNull InterfaceC6618a.b data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f63743g.h(data);
    }

    @Override // g30.InterfaceC6618a
    public final void B1(int i11, boolean z11) {
        n2(this, "fintech_cho_sp_get", null, String.valueOf(i11), null, null, null, null, null, null, null, z11 ? "success" : "error", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1030, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void C() {
        this.f63740d.f();
    }

    @Override // g30.InterfaceC6618a
    public final void C0(String str, String str2, String str3, String str4, boolean z11, boolean z12) {
        String str5 = z12 ? "success" : str != null ? "error" : "fail";
        String valueOf = String.valueOf(z11);
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 != null) {
            linkedHashMap.put("token_key", str3);
        }
        if (str2 != null) {
            linkedHashMap.put("stack_trace", str2);
        }
        if (str4 != null) {
            linkedHashMap.put("method", str4);
        }
        n2(this, "fintech_fast_entry_result", valueOf, j22.toJson(linkedHashMap), null, null, null, null, null, str, null, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1288, 1023);
        if (z12) {
            c.a aVar = c.a.EVENT;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (str3 != null) {
                linkedHashMap2.put("token_id", str3);
            }
            Unit unit = Unit.f71690a;
            g.f(this.f63743g, aVar, "fastentry", "set_state", new HealthData(null, linkedHashMap2, null, null, null, null, null, null, 253, null), z11 ? "enabled" : "disabled", null, 224);
            return;
        }
        c.a aVar2 = c.a.ERROR;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (str != null) {
            linkedHashMap3.put("error_desc", str);
        }
        if (str2 != null) {
            linkedHashMap3.put("stack_trace", str2);
        }
        Unit unit2 = Unit.f71690a;
        g.f(this.f63743g, aVar2, "fastentry", "error", new HealthData(null, linkedHashMap3, null, null, null, null, null, C7714v.b0("error_desc", "stack_trace"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void C1(String str, @NotNull LinkedHashMap cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cards", cards);
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "mirpay", "card_status", new HealthData(null, linkedHashMap, str, null, null, null, null, C7714v.a0("cards"), 121, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void D(@NotNull String url, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        C8438b.a(this.f63740d, url, z11, str, null, 8);
    }

    @Override // g30.InterfaceC6618a
    public final void D0(String str, String str2, String str3) {
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put("error_desc", str2);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "mirpay", "get_device_info", new HealthData(null, linkedHashMap, str, null, null, null, null, C7714v.a0("error_desc"), 121, null), str3, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void D1() {
        n2(this, "fintech_bio_auth_request", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void E(@NotNull String redirect, String str, String str2, boolean z11) {
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        n2(this, "fintech_pinpad_auth_network_result", "pinpad", str2, null, null, null, redirect, null, str, null, k2(z11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1352, 1023);
        c.a aVar = z11 ? c.a.RESULT : c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("error_desc", str);
        }
        if (str2 != null) {
            linkedHashMap.put("data", str2);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "pinpad", "auth_pinpad_network_result", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.b0("error_desc", "data"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void E0(String str, @NotNull ArrayList cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cards", cards);
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "mirpay", "get_all_cards", new HealthData(null, linkedHashMap, str, null, null, null, null, C7714v.a0("cards"), 121, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void E1(String str, String str2, String str3) {
        n2(this, "fintech_view_file_base64_error", null, (str == null && str2 == null) ? null : j2().toJson(U.j(new Pair("filename", str), new Pair("mimeType", str2))), null, null, null, null, null, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void F(int i11, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f63740d.b(url, "fintech_onborading_page_" + i11);
    }

    @Override // g30.InterfaceC6618a
    public final void F0(@NotNull String frameType) {
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        androidx.core.os.d.b(new Pair("with_frame", frameType));
    }

    @Override // g30.InterfaceC6618a
    public final void F1(Exception exc) {
        n2(this, "auto_sms_enabled_error", null, exc != null ? C4001c.b(exc) : null, null, null, null, null, null, "SmsRetriever.getClient(application).startSmsUserConsent(null)", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void G(@NotNull String rustoreStatus, @NotNull String gmsStatus, @NotNull String ozonSdkStatus, boolean z11) {
        Intrinsics.checkNotNullParameter(rustoreStatus, "rustoreStatus");
        Intrinsics.checkNotNullParameter(gmsStatus, "gmsStatus");
        Intrinsics.checkNotNullParameter(ozonSdkStatus, "ozonSdkStatus");
        n2(this, "in_app_update_available", null, null, null, null, null, null, null, null, null, z11 ? "hard" : "soft", null, null, null, null, null, null, null, null, null, null, null, null, null, rustoreStatus, gmsStatus, ozonSdkStatus, null, null, null, null, null, null, null, null, null, null, 536869886, 1023);
        g.f(this.f63743g, c.a.EVENT, "inappupdate", "update_available", new HealthData(null, U.j(new Pair("rustore", rustoreStatus), new Pair("gms", gmsStatus), new Pair("ozon_sdk", ozonSdkStatus), new Pair("update_mode", z11 ? "hard" : "soft")), null, null, null, null, null, C7714v.b0("rustore", "gms", "ozon_sdk", "update_mode"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void G0(@NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f63742f.o(sessionId);
    }

    @Override // g30.InterfaceC6618a
    public final void G1(boolean z11) {
        Log.d("SSO20", "Analytics sendOzonIdStartEvent isWebAuthRequest=" + z11);
        AnalyticsConfig analyticsConfig = this.f63739c;
        Function0<String> getOzonIdSessionId = analyticsConfig.getGetOzonIdSessionId();
        String invoke = getOzonIdSessionId != null ? getOzonIdSessionId.invoke() : null;
        String str = !z11 ? "splash" : "web";
        JsonAdapter<Map<String, Object>> j22 = j2();
        Function0<Boolean> isOzonIdSigned = analyticsConfig.isOzonIdSigned();
        n2(this, "fintech_start_ozon_id", str, j22.toJson(U.l(new Pair("is_ozon_id_sign_in", isOzonIdSigned != null ? isOzonIdSigned.invoke() : null))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, invoke, null, null, null, null, null, -8, 1007);
    }

    @Override // g30.InterfaceC6618a
    public final void H(@NotNull String tag, boolean z11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        n2(this, "fintech_offline_refresh_cache", tag, null, null, null, null, null, null, null, null, k2(z11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1028, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void H0(String str) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("jwttoken", str);
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "push", "nb_set_jwt_token", new HealthData(null, linkedHashMap, null, null, null, null, null, null, 253, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void H1() {
        n2(this, "fintech_main_screen_start", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void I(String str, String str2, String str3) {
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put("cbottom_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("type", str3);
        }
        n2(this, "fintech_cbottom_error", null, j22.toJson(linkedHashMap), null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void I0() {
        n2(this, "fintech_audio_recording_started", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void I1() {
        Intrinsics.checkNotNullParameter("android.permission.WRITE_EXTERNAL_STORAGE", "permissionName");
        androidx.core.os.d.b(new Pair("permission_name", "android.permission.WRITE_EXTERNAL_STORAGE"));
    }

    @Override // g30.InterfaceC6618a
    public final void J(String str, String str2, boolean z11) {
        g.f(this.f63743g, c.a.EVENT, "webview", "can_open_url_schema", new HealthData(null, null, null, null, null, str, str2, null, 159, null), z11 ? "available" : "not_available", null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void J0(String str, String str2, String str3, boolean z11, boolean z12) {
        String str4 = z11 ? "success" : str != null ? "error" : "fail";
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put("stack_trace", str2);
        }
        n2(this, "fintech_fast_entry_read_token", null, j22.toJson(linkedHashMap), null, null, null, null, null, str, null, str4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1286, 1023);
        String str5 = z11 ? "ok" : str != null ? "bioauth_failed" : "not_found";
        if (str != null) {
            c.a aVar = c.a.ERROR;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("error_desc", str);
            if (str2 != null) {
                linkedHashMap2.put("stack_trace", str2);
            }
            Unit unit = Unit.f71690a;
            g.f(this.f63743g, aVar, "fastentry", "error", new HealthData(null, linkedHashMap2, null, null, null, null, null, C7714v.b0("error_desc", "stack_trace"), 125, null), str5, null, 224);
            return;
        }
        c.a aVar2 = c.a.EVENT;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (str3 != null) {
            linkedHashMap3.put("token_id", str3);
        }
        linkedHashMap3.put("enabled", Boolean.valueOf(z12));
        Unit unit2 = Unit.f71690a;
        g.f(this.f63743g, aVar2, "fastentry", "status", new HealthData(null, linkedHashMap3, null, null, null, null, null, C7714v.a0("enabled"), 125, null), str5, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void J1(String str, String str2) {
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put("stack_trace", str2);
        }
        n2(this, "fintech_open_bridge_error_event", null, j22.toJson(linkedHashMap), null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void K(@NotNull String phoneRegex, boolean z11, @NotNull List<String> result, String str, Long l11) {
        Intrinsics.checkNotNullParameter(phoneRegex, "phoneRegex");
        Intrinsics.checkNotNullParameter(result, "result");
        n2(this, "fintech_text_recognition_finished", null, j2().toJson(U.j(new Pair("text_recognition_elapsed_time", Long.valueOf(l11.longValue())), new Pair("text_recognition_regex", phoneRegex))), null, null, null, null, null, null, null, z11 ? "success" : (z11 || !(str == null || str.length() == 0)) ? "error" : "fail", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1030, 1023);
        c.a aVar = z11 ? c.a.EVENT : c.a.ERROR;
        Map b11 = C2454a.b("phone_regex", phoneRegex);
        Set Y02 = C7714v.Y0(result);
        ArrayList arrayList = new ArrayList(C7714v.z(Y02, 10));
        int i11 = 0;
        for (Object obj : Y02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(new Pair(Ej.b.a(i11, "result"), (String) obj));
            i11 = i12;
        }
        g.f(this.f63743g, aVar, "camera", "scan", new HealthData(null, U.m(b11, U.s(arrayList)), null, "phone_scanner", null, null, null, C7714v.a0("phone_regex"), 117, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void K0(int i11, String str) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("status", Integer.valueOf(i11));
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "af_staus", new HealthData(null, linkedHashMap, null, null, null, str, null, C7714v.a0("status"), 93, null), null, null, 112);
    }

    @Override // g30.InterfaceC6618a
    public final void K1(@NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_page_loading_start", null, null, null, str, l2().a(), url, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -114, 1023);
        g.f(this.f63743g, c.a.EVENT, "webview", "load_start", new HealthData(null, null, null, null, null, str, url, null, 159, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void L() {
        this.f63740d.c();
        j30.c.f(this.f63742f, 2);
        g.b(this.f63743g, 2);
    }

    @Override // g30.InterfaceC6618a
    public final void L0(String str, String str2) {
        n2(this, "in_app_update_soft", null, null, null, str, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -82, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void L1(Boolean bool, Integer num) {
        if (num != null) {
            n2(this, "screen_capture_init_value", "antifraud_log", num.toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8, 1023);
        } else if (bool != null) {
            n2(this, bool.booleanValue() ? "screen_capture_display_on" : "screen_capture_display_off", "antifraud_log", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, 1023);
        }
    }

    @Override // g30.InterfaceC6618a
    public final void M(@NotNull String storeName, String str) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        n2(this, "review_available_rate", null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, storeName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217986, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void M0(boolean z11, String str, String str2, String str3, String str4, Double d11, Double d12) {
        String str5 = z11 ? "offline" : "webview_error";
        String c11 = G.g.c(str2, "|", str3 == null ? "" : str3);
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (d11 != null) {
            linkedHashMap.put("latitude", Double.valueOf(d11.doubleValue()));
        }
        if (d12 != null) {
            linkedHashMap.put("longitude", Double.valueOf(d12.doubleValue()));
        }
        n2(this, "fintech_no_connection", str5, j22.toJson(linkedHashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, c11, str4, -8, 127);
    }

    @Override // g30.InterfaceC6618a
    public final void M1(String str, Exception exc) {
        n2(this, "auto_sms_broadcast_receiver", null, exc != null ? C4001c.b(exc) : null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void N(@NotNull String pushType, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(pushType, "pushType");
        String str4 = Build.MODEL;
        j jVar = this.f63744h;
        boolean f7 = jVar.f();
        n2(this, "fintech_push_arrived", null, (str2 == null && str3 == null) ? null : j2().toJson(U.j(new Pair("push_id", str2), new Pair("push_parent_id", str3))), null, null, null, str, null, null, null, null, null, null, null, null, null, null, pushType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(f7), jVar.b(), null, null, null, -528454, 927);
        g.f(this.f63743g, c.a.EVENT, "push", "received", new HealthData(null, null, str2, i2(pushType), null, null, null, null, 243, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void N0(long j11, boolean z11) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("params", Long.valueOf(j11));
        linkedHashMap.put("status", Boolean.valueOf(z11));
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "bankapps", "open_installed_app", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.b0("params", "status"), 125, null), null, null, 240);
        n2(this, "open_installed_bank_app", null, j2().toJson(U.j(new Pair("member_id", Long.valueOf(j11)), new Pair("is_open", Boolean.valueOf(z11)))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void N1(@NotNull String url, String str, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_http_error_received", null, null, null, str, null, url, null, str2, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -850, 1023);
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put("error_desc", str2);
        }
        if (num != null) {
            linkedHashMap.put("error_code", Integer.valueOf(num.intValue()));
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "load_failed", new HealthData(null, linkedHashMap, null, null, null, str, url, C7714v.b0("error_desc", "error_code"), 29, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void O(String str, String str2, Integer num, String str3) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            linkedHashMap.put("encrypted_card_data", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("reference_id", str2);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "mirpay", "add_card", new HealthData(null, linkedHashMap, str, null, null, null, null, null, 249, null), str3, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void O0(String str, String str2, String str3) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put("device_id", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("wallet_id", str3);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "mirpay", "get_device_info", new HealthData(null, linkedHashMap, str, null, null, null, null, C7714v.b0("device_id", "wallet_id"), 121, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void O1(Integer num) {
        g.f(this.f63743g, c.a.EVENT, "bankapps", "get_installed", new HealthData(null, U.i(new Pair("installed_apps_count", Integer.valueOf(num.intValue()))), null, null, null, null, null, C7714v.a0("installed_apps_count"), 125, null), null, null, 240);
        n2(this, "get_installed_bank_apps", null, j2().toJson(U.i(new Pair("installed_apps_count", num))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void P(@NotNull String tabName, @NotNull String tabTag) {
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(tabTag, "tabTag");
        androidx.core.os.d.b(new Pair("selected_name", tabName), new Pair("selected_tab_tag", tabTag));
    }

    @Override // g30.InterfaceC6618a
    public final void P0(int i11, String str, boolean z11) {
        n2(this, "fintech_video_upload_finish", null, null, Integer.valueOf(i11), null, null, null, null, str, null, k2(z11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1290, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void P1(String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "load_pending_tabs", new HealthData(null, null, null, null, null, str, null, null, 223, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void Q() {
        j30.c.f(this.f63742f, 2);
    }

    @Override // g30.InterfaceC6618a
    public final void Q0() {
        n2(this, "fintech_screen_flip", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
        g.f(this.f63743g, c.a.EVENT, "motion", "flip", null, null, null, 248);
    }

    @Override // g30.InterfaceC6618a
    public final void Q1(String str, @NotNull String request, boolean z11, String str2, @NotNull Map features) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(request, "request");
        String str3 = z11 ? "success" : "error";
        String json = j2().toJson(features);
        StringBuilder d11 = C3660k.d("xO3Trace=", str, " request=", request, " features=");
        d11.append(json);
        n2(this, "fintech_cho_network_source", null, d11.toString(), null, null, null, null, null, str2, null, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1286, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void R(@NotNull String storeName, boolean z11) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        n2(this, "in_app_update_start", null, null, null, null, null, null, null, null, null, z11 ? "hard" : "soft", null, null, null, null, null, null, null, null, null, null, null, storeName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134218754, 1023);
        g.f(this.f63743g, c.a.EVENT, "inappupdate", "open", new HealthData(null, U.j(new Pair("store_name", storeName), new Pair("update_mode", z11 ? "hard" : "soft")), null, null, null, null, null, C7714v.b0("store_name", "update_mode"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void R0(String str, String str2, String str3) {
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put("error_desc", str2);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "mirpay", "get_all_cards", new HealthData(null, linkedHashMap, str, null, null, null, null, C7714v.a0("error_desc"), 121, null), str3, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void R1(boolean z11) {
        g.f(this.f63743g, c.a.EVENT, "gosuslugi", "is_available", null, z11 ? "available" : "not_available", null, 232);
    }

    @Override // g30.InterfaceC6618a
    public final void S(int i11, @NotNull String tag, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        n2(this, "fintech_video_combine_finish", tag, null, Integer.valueOf(i11), null, null, null, null, str, null, k2(z11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1292, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void S0(@NotNull String sessionId, boolean z11, long j11, long j12, String str, InterfaceC6618a.b bVar, @NotNull D80.a brightnessCallback) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(brightnessCallback, "brightnessCallback");
        final AnalyticsConfig analyticsConfig = this.f63739c;
        if (analyticsConfig.isEnabledAnalytics()) {
            String appsFlyerAnalyticsKey = analyticsConfig.getAppsFlyerAnalyticsKey();
            if (appsFlyerAnalyticsKey != null) {
                C6793a c6793a = this.f63738b;
                c6793a.d(appsFlyerAnalyticsKey);
                this.f63746j = true;
                String appsFlyerStoreName = analyticsConfig.getAppsFlyerStoreName();
                if (appsFlyerStoreName != null) {
                    c6793a.h(appsFlyerStoreName);
                }
            }
            if (analyticsConfig.getSentryDsn() != null) {
                L80.a.i();
                final String str2 = (analyticsConfig.isDebug() || analyticsConfig.isStage()) ? "debug" : "production";
                k0.c(this.f63737a, new K1.a() { // from class: g30.b
                    @Override // io.sentry.K1.a
                    public final void a(W2 w22) {
                        SentryAndroidOptions options = (SentryAndroidOptions) w22;
                        Intrinsics.checkNotNullParameter(options, "options");
                        options.setAnrEnabled(true);
                        options.setAttachAnrThreadDump(true);
                        AnalyticsConfig analyticsConfig2 = AnalyticsConfig.this;
                        options.setAnrReportInDebug(analyticsConfig2.isDebug());
                        options.setDsn(analyticsConfig2.getSentryDsn());
                        options.setEnvironment(str2);
                        Double valueOf = Double.valueOf(1.0d);
                        options.setTracesSampleRate(valueOf);
                        options.setSampleRate(valueOf);
                        options.setBeforeSend(new AW.c(this));
                    }
                });
            }
        }
        this.f63742f.k();
        this.f63743g.g(sessionId, z11, j12, analyticsConfig.isStage(), bVar, brightnessCallback, new c(1, this, d.class, "mobileHealthEventWarnings", "mobileHealthEventWarnings(Ljava/util/List;)V", 0));
        c.a aVar = c.a.EVENT;
        Long valueOf = Long.valueOf(j11);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            String str3 = str.length() > 0 ? str : null;
            if (str3 != null) {
                linkedHashMap.put("push_jwt_token", str3);
            }
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "application", "launch", new HealthData(valueOf, linkedHashMap, null, null, null, null, null, null, 252, null), null, null, 208);
    }

    @Override // g30.InterfaceC6618a
    public final void S1(String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "apply_tab_config", new HealthData(null, null, null, null, null, str, null, null, 223, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void T() {
        this.f63740d.e();
    }

    @Override // g30.InterfaceC6618a
    public final void T0(String str, String str2) {
        g.f(this.f63743g, c.a.EVENT, "webview", "deeplink", new HealthData(null, null, null, null, null, str, str2, null, 159, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void T1(@NotNull String storeName, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        n2(this, "error_in_app_update_available", null, null, null, null, null, null, null, str, null, z11 ? "hard" : "soft", null, null, null, null, null, null, null, null, null, null, null, storeName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134219010, 1023);
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("store_name", storeName);
        linkedHashMap.put("update_mode", z11 ? "hard" : "soft");
        if (str != null) {
            linkedHashMap.put("error_message", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "inappupdate", "error", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.b0("store_name", "update_mode", "error_message"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void U(String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "refresh_tab", new HealthData(null, null, null, null, null, str, null, null, 223, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void U0(int i11, boolean z11) {
        n2(this, "fintech_cho_sp_put", null, String.valueOf(i11), null, null, null, null, null, null, null, z11 ? "success" : "error", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1030, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void U1(@NotNull String pinsType, @NotNull String pinsHashes, @NotNull String certsChain, @NotNull String url) {
        Intrinsics.checkNotNullParameter(pinsType, "pinsType");
        Intrinsics.checkNotNullParameter(pinsHashes, "pinsHashes");
        Intrinsics.checkNotNullParameter(certsChain, "certsChain");
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_ssl_pinning_validate_certificate", null, null, null, null, null, url, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, pinsType, pinsHashes, certsChain, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -125829186, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void V(long j11, String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "recreate", new HealthData(Long.valueOf(j11), null, null, null, null, str, null, null, 222, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void V0(int i11, String str, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C8110a.EnumC1263a enumC1263a = C8110a.EnumC1263a.VIEW;
        String valueOf = String.valueOf(i11);
        if (str == null) {
            str = "";
        }
        C8438b.d(this.f63740d, enumC1263a, valueOf, "view_frame", str);
    }

    @Override // g30.InterfaceC6618a
    public final void V1(String str, boolean z11) {
        g.f(this.f63743g, c.a.EVENT, "mirpay", "status", new HealthData(null, null, str, null, null, null, null, null, 251, null), z11 ? "available" : "not_available", null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void W(@NotNull String nameFile, Boolean bool, String str, Integer num) {
        Intrinsics.checkNotNullParameter(nameFile, "nameFile");
        n2(this, "fintech_audio_chunk_upload_finished", null, nameFile, null, null, null, null, null, str, num, bool.equals(Boolean.TRUE) ? "success" : "fail", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1798, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void W0(int i11) {
        n2(this, "fintech_app_container_recreate", null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void W1(String str, @NotNull Map features, boolean z11) {
        Intrinsics.checkNotNullParameter(features, "features");
        n2(this, "fintech_cho_sp_source", null, j2().toJson(features), null, null, null, null, null, str, null, z11 ? "success" : "error", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1286, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void X(@NotNull EnumC8636a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        n2(this, "fintech_app_state", state.a(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void X0(String str, String str2, boolean z11, boolean z12, boolean z13) {
        String k22 = k2(z11);
        String o22 = o2(z13);
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap l11 = U.l(new Pair("token_exist", Boolean.valueOf(z12)));
        if (str2 != null) {
            l11.put("token_key", str2);
        }
        n2(this, "fintech_bio_sec_storage_check_token", o22, j22.toJson(l11), null, null, null, null, null, str, null, k22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1288, 1023);
        g.f(this.f63743g, z11 ? c.a.EVENT : c.a.ERROR, "bioauth", "storage_status", new HealthData(null, null, str2, null, null, o2(z13), null, null, 219, null), z12 ? "ok" : "not_found", null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void X1(String str, String str2, boolean z11, String str3, String str4, String str5, String str6, String str7) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enabled", Boolean.valueOf(z11));
        if (str3 != null) {
            linkedHashMap.put("color", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("text", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("icon_url", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("icon_background_url", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("animation_type", str7);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "set_tab_badge", new HealthData(null, linkedHashMap, str2, null, null, str, null, C7714v.b0("enabled", "color", "text", "icon_url", "icon_background_url", "animation_type"), 89, null), null, null, 112);
    }

    @Override // g30.InterfaceC6618a
    public final void Y(String str) {
        g.f(this.f63743g, c.a.EVENT, "clipboard", "from_mobile", new HealthData(null, str != null ? C2454a.b("data", str) : null, null, null, null, null, null, null, 253, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void Y0(String str, String str2, Integer num, @NotNull String errorDesc, String str3) {
        boolean z11;
        String str4;
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        if (str != null) {
            LinkedHashMap linkedHashMap = this.f63749m;
            String str5 = (String) linkedHashMap.get(str);
            z11 = Intrinsics.d(str5, errorDesc);
            if (str5 == null) {
                linkedHashMap.put(str, errorDesc);
            }
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        n2(this, "fintech_js_console_error_received", null, (num == null && str3 == null) ? null : j2().toJson(U.j(new Pair("line_number", num), new Pair("source_id", str3))), null, str2, l2().a(), str, null, errorDesc, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -374, 1023);
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("error_desc", errorDesc);
        if (num != null) {
            str4 = "line_number";
            linkedHashMap2.put(str4, Integer.valueOf(num.intValue()));
        } else {
            str4 = "line_number";
        }
        if (str3 != null) {
            linkedHashMap2.put("source_id", str3);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "js_error", new HealthData(null, linkedHashMap2, null, null, null, str2, str, C7714v.b0("error_desc", str4, "source_id"), 29, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void Y1(long j11, @NotNull String source, int i11, @NotNull String typeName, int i12, boolean z11, boolean z12, boolean z13, String str, @NotNull String workingMode, String str2, String str3) {
        String str4;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        if (z11) {
            str4 = "success";
        } else {
            str4 = "error";
            if (!z12 && z13) {
                str4 = "fail";
            }
        }
        n2(this, "fintech_barcode_recognition_finished", typeName, j2().toJson(U.i(new Pair("barcode_recognition_elapsed_time", Long.valueOf(j11)))), null, null, null, null, null, str, null, str4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i11), source, Integer.valueOf(i12), null, null, null, null, null, null, null, -1288, 1016);
        if (z13) {
            return;
        }
        c.a aVar = z11 ? c.a.EVENT : c.a.ERROR;
        String m22 = m2(workingMode);
        LinkedHashMap l11 = U.l(new Pair("scanner_type", typeName));
        if (str2 != null) {
        }
        if (str3 != null) {
            l11.put("qr_raw", str3);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "camera", "scan", new HealthData(null, l11, null, m22, null, null, null, C7714v.b0("scanner_type", "qr", "qr_raw"), 117, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void Z(boolean z11) {
        n2(this, "fintech_offline_get_private_key", null, null, null, null, null, null, null, null, null, k2(z11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1026, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void Z0(@NotNull LinkedHashMap emulatorConfig) {
        Intrinsics.checkNotNullParameter(emulatorConfig, "emulatorConfig");
        String json = j2().toJson(emulatorConfig);
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        n2(this, "emulated_device", null, json, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -12294, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void Z1(Exception exc, boolean z11) {
        c.a aVar = z11 ? c.a.ERROR : c.a.EVENT;
        g.f(this.f63743g, aVar, "camera", "send_photo", new HealthData(null, null, null, "photo", null, null, null, null, 247, null), String.valueOf(exc != null ? Integer.valueOf(exc.hashCode()) : null), null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void a(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        androidx.core.os.d.b(new Pair("cbottom_id", id2));
    }

    @Override // g30.InterfaceC6618a
    public final void a0(@NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_stories_content_load", null, null, null, null, null, url, null, str, null, "fail", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1346, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void a1(long j11, @NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_page_js_loading_finished", null, null, null, str, l2().a(), url, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -114, 1023);
        g.f(this.f63743g, c.a.EVENT, "webview", "page_loaded", new HealthData(Long.valueOf(j11), null, null, null, null, str, url, null, 158, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void a2(@NotNull String screenName, boolean z11) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        androidx.core.os.d.b(new Pair("screen_name", screenName), new Pair("is_auth_flow", Boolean.valueOf(z11)));
        this.f63740d.g(new C8437a(screenName, 6));
    }

    @Override // g30.InterfaceC6618a
    public final String b() {
        if (this.f63746j) {
            return this.f63738b.e();
        }
        return null;
    }

    @Override // g30.InterfaceC6618a
    public final void b0(Integer num) {
        boolean z11 = false;
        if (num.intValue() == -1 ? (this.f63737a.getResources().getConfiguration().uiMode & 48) != 32 : num.intValue() == 1) {
            z11 = true;
        }
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z11) {
            linkedHashMap.put("new_theme", "light");
        } else {
            linkedHashMap.put("new_theme", "dark");
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "theme", "theme_select", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.a0("new_theme"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void b1() {
        g.f(this.f63743g, c.a.ERROR, "camera", "take_photo", new HealthData(null, null, null, "photo", null, null, null, null, 247, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void b2() {
        g.f(this.f63743g, c.a.EVENT, "appreview", "show_request", null, null, null, 248);
    }

    @Override // g30.InterfaceC6618a
    public final void c(Float f7, String str, String str2) {
        g.f(this.f63743g, c.a.EVENT, "screen", "set_brightness", new HealthData(null, U.i(new Pair("brightness", Float.valueOf(f7.floatValue()))), null, null, null, str, str2, C7714v.a0("brightness"), 29, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void c0(@NotNull String url, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        g.f(this.f63743g, c.a.EVENT, "webview", "attempt_nav", new HealthData(null, null, null, null, null, str, url, null, 159, null), z11 ? "ok" : "not_performed", null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void c1(@NotNull String url, @NotNull String targetUrl) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        g.f(this.f63743g, c.a.EVENT, "application", "deeplink", new HealthData(null, C2454a.b("targetUrl", targetUrl), null, null, null, null, url, C7714v.a0("targetUrl"), 61, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void c2(int i11, String str, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C8110a.EnumC1263a enumC1263a = C8110a.EnumC1263a.CLICK;
        String valueOf = String.valueOf(i11);
        if (str == null) {
            str = "";
        }
        C8438b.d(this.f63740d, enumC1263a, valueOf, "click_enter", str);
    }

    @Override // g30.InterfaceC6618a
    public final void d(String str, String str2) {
        g.f(this.f63743g, c.a.EVENT, "taptic", "call", new HealthData(null, null, null, null, null, str, str2, null, 159, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void d0(String str, @NotNull String workingMode) {
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        g.f(this.f63743g, c.a.ERROR, "camera", "open_error", new HealthData(null, str != null ? C2454a.b("error_message", str) : null, null, m2(workingMode), null, null, null, C7714v.a0("error_message"), 117, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void d1(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (this.f63746j) {
            this.f63738b.c(intent);
        }
    }

    @Override // g30.InterfaceC6618a
    public final void d2() {
        n2(this, "fintech_pinpad_screen_view", "pinpad", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, 1023);
        g.f(this.f63743g, c.a.EVENT, "pinpad", "open", null, null, null, 248);
    }

    @Override // g30.InterfaceC6618a
    public final void e(Boolean bool) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool.booleanValue()) {
            linkedHashMap.put("new_theme", "light");
        } else {
            linkedHashMap.put("new_theme", "dark");
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "theme", "system_theme_changed", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.a0("new_theme"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void e0(String str) {
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("error_desc", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "bioauth", "error", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.a0("error_desc"), 121, null), null, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void e1(boolean z11, boolean z12, boolean z13, String str, U30.d dVar, String str2) {
        if (z11) {
            n2(this, "fintech_share_file_success", null, dVar != null ? j2().toJson(U.i(new Pair("mimeType", dVar.d()))) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 1023);
            return;
        }
        if (z12) {
            n2(this, "fintech_unknown_mimetype_error", null, dVar != null ? dVar.d() : null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262, 1023);
        } else if (z13) {
            if (dVar != null || str != null) {
                r2 = j2().toJson(U.j(new Pair("base64", str), new Pair("mimeType", dVar != null ? dVar.d() : null)));
            }
            n2(this, "fintech_decode_base64_error", null, r2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 1023);
        }
    }

    @Override // g30.InterfaceC6618a
    public final void f() {
        g.f(this.f63743g, c.a.EVENT, "theme", "open_theme_screen", null, null, null, 248);
    }

    @Override // g30.InterfaceC6618a
    public final void f0(String str, String str2, String str3, boolean z11) {
        g.f(this.f63743g, c.a.EVENT, "webview", "go_tab", new HealthData(null, null, str3, null, null, str, str2, null, 155, null), z11 ? "ok" : "tab_not_found", null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void f1(String str, boolean z11) {
        g.f(this.f63743g, z11 ? c.a.EVENT : c.a.ERROR, "camera", "send_scan", str != null ? new HealthData(null, null, null, m2(str), null, null, null, null, 247, null) : null, null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void g(String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "clear_cache", new HealthData(null, null, null, null, null, str, null, null, 223, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void g0() {
        n2(this, "fintech_audio_recording_finished", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void g1(@NotNull String workingMode) {
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        g.f(this.f63743g, c.a.ERROR, "camera", "no_permission", new HealthData(null, null, null, m2(workingMode), null, null, null, null, 247, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void h(String str, String str2) {
        g.f(this.f63743g, c.a.EVENT, "screen", "set_lockable", new HealthData(null, null, null, null, null, str, str2, null, 159, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void h0(long j11, @NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_page_http_loading_finished", null, null, null, str, l2().a(), url, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -114, 1023);
        g.f(this.f63743g, c.a.EVENT, "webview", "html_loaded", new HealthData(Long.valueOf(j11), null, null, null, null, str, url, null, 158, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void h1(int i11, @NotNull String selectedTabName, @NotNull String selectedTabTag, @NotNull String previousTabName, @NotNull String previousTabTag) {
        Intrinsics.checkNotNullParameter(selectedTabName, "selectedTabName");
        Intrinsics.checkNotNullParameter(selectedTabTag, "selectedTabTag");
        Intrinsics.checkNotNullParameter(previousTabName, "previousTabName");
        Intrinsics.checkNotNullParameter(previousTabTag, "previousTabTag");
        this.f63740d.h(i11, selectedTabName);
    }

    @Override // g30.InterfaceC6618a
    public final void i(@NotNull String storeName, boolean z11) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        n2(this, "in_app_update_complete", null, null, null, null, null, null, null, null, null, z11 ? "hard" : "soft", null, null, null, null, null, null, null, null, null, null, null, storeName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134218754, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void i0(@NotNull String url, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_view_file", null, str, null, null, null, url, null, null, null, k2(z11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1094, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void i1(@NotNull LinkedHashMap flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        n2(this, "fintech_offline_flag_state", null, j2().toJson(flags), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void j(@NotNull String workingMode, int i11, boolean z11, boolean z12, @NotNull String qrAction, int i12, Integer num, List<String> list, Integer num2) {
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        Intrinsics.checkNotNullParameter(qrAction, "qrAction");
        boolean d11 = Intrinsics.d(workingMode, "PASSPORT");
        int i13 = 0;
        boolean z13 = Intrinsics.d(workingMode, TakePhotoRequest.BARCODE_SCANNER_TYPE) || Intrinsics.d(workingMode, TakePhotoRequest.QR_SCANNER_TYPE) || Intrinsics.d(workingMode, "QR_AND_BARCODE") || Intrinsics.d(workingMode, "TEXT");
        boolean d12 = Intrinsics.d(workingMode, "REGISTRATION");
        c.a aVar = c.a.EVENT;
        String m22 = m2(workingMode);
        LinkedHashMap l11 = U.l(new Pair("show_frame", Boolean.valueOf(d11)), new Pair("show_qr_frame", Boolean.valueOf(z13)), new Pair("reg_frame", Boolean.valueOf(d12)), new Pair("qr_action", qrAction), new Pair("qr_detect_autoclose", Boolean.valueOf(z11)), new Pair("is_back", Boolean.valueOf(z12)), new Pair("photo_confirm_title", Integer.valueOf(i11)), new Pair("preview_camera_title", Integer.valueOf(i12)));
        if (z13) {
            l11.put("scanner_type", m2(workingMode));
        }
        if (list != null) {
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                l11.put("barcode_formats" + i13, (String) obj);
                i13 = i14;
            }
        }
        if (num != null) {
            l11.put("tips_options", Integer.valueOf(num.intValue()));
        }
        if (num2 != null) {
            l11.put("qr_button_text", Integer.valueOf(num2.intValue()));
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "camera", "open", new HealthData(null, l11, null, m22, null, null, null, C7714v.b0("show_frame", "show_qr_frame", "reg_frame", "qr_action", "qr_detect_autoclose", "is_back", "photo_confirm_title", "preview_camera_title", "scanner_type", "barcode_formats", "tips_options", "qr_button_text"), 117, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void j0(@NotNull String storeName) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        n2(this, "review_show_rate", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null, storeName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -142606338, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void j1(String str) {
        this.f63743g.i(str);
        this.f63740d.i(str);
        this.f63742f.p(str);
        io.sentry.protocol.E e11 = new io.sentry.protocol.E();
        e11.n(str);
        if (K1.i()) {
            K1.d().d(e11);
        }
    }

    @Override // g30.InterfaceC6618a
    public final void k(Integer num) {
        g.f(this.f63743g, c.a.EVENT, "installedapps", "get_installed", new HealthData(null, U.i(new Pair("installed_apps_count", Integer.valueOf(num.intValue()))), null, null, null, null, null, C7714v.a0("installed_apps_count"), 125, null), null, null, 240);
        n2(this, "get_installed_apps", null, j2().toJson(U.i(new Pair("installed_apps_count", num))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void k0(String str, String str2) {
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("error_desc", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "mirpay", "error", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.a0("error_desc"), 125, null), str2, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void k1(String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "tab_info", new HealthData(null, null, null, null, null, str, null, null, 223, null), null, null, 112);
    }

    @Override // g30.InterfaceC6618a
    public final void l(Integer num, @NotNull String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        n2(this, "fintech_view_file_mime_error", null, null, null, null, null, url, null, str, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -834, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void l0(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        g.f(this.f63743g, c.a.EVENT, "bioauth", "authorize", null, result, null, 232);
    }

    @Override // g30.InterfaceC6618a
    public final void l1(int i11, String str, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C8110a.EnumC1263a enumC1263a = C8110a.EnumC1263a.CLICK;
        String valueOf = String.valueOf(i11);
        if (str == null) {
            str = "";
        }
        C8438b.d(this.f63740d, enumC1263a, valueOf, "click_swipe", str);
    }

    @Override // g30.InterfaceC6618a
    public final void m(String str, String str2) {
        n2(this, "fintech_web_content_did_terminate", null, str2, null, null, l2().a(), null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -294, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void m0(String str) {
        g.f(this.f63743g, c.a.ERROR, "bioauth", "authorize", null, str, null, 232);
    }

    @Override // g30.InterfaceC6618a
    public final void m1() {
        n2(this, "fintech_bank_login", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
        g.f(this.f63743g, c.a.EVENT, "webview", "bank_login", null, null, null, 216);
    }

    @Override // g30.InterfaceC6618a
    public final void n(@NotNull String storeName, String str) {
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        n2(this, "review_start_rate", null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, storeName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217986, 1023);
        c.a aVar = str == null ? c.a.EVENT : c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("store_name", storeName);
        if (str != null) {
            linkedHashMap.put("error_desc", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "appreview", "show", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.b0("error_desc", "store_name"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void n0(@NotNull String workingMode) {
        Intrinsics.checkNotNullParameter(workingMode, "workingMode");
        g.f(this.f63743g, c.a.EVENT, "camera", "close", new HealthData(null, null, null, m2(workingMode), null, null, null, null, 247, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void n1() {
        g.f(this.f63743g, c.a.EVENT, "mirpay", "start_update", null, null, null, 248);
    }

    @Override // g30.InterfaceC6618a
    public final void o(boolean z11) {
        n2(this, "in_app_update_hard", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z11), null, null, null, null, null, null, null, null, null, null, null, null, null, -268435458, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void o0(@NotNull String authResult, String str, boolean z11) {
        Intrinsics.checkNotNullParameter(authResult, "authResult");
        n2(this, "fintech_pinpad_do_after_login", "pinpad", j2().toJson(U.j(new Pair("authResult", authResult), new Pair("assetsPageLoaded", Boolean.valueOf(z11)))), null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -72, 1023);
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("asset_page_loaded", Boolean.valueOf(z11));
        linkedHashMap.put("auth_result", authResult);
        if (str != null) {
            linkedHashMap.put("targetUrl", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "pinpad", "do_after_login", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.b0("asset_page_loaded", "auth_result", "targetUrl"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void o1(@NotNull String source, String str, @NotNull Map features, boolean z11) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(source, "source");
        n2(this, "fintech_cho_parse", source, j2().toJson(features), null, null, null, null, null, str, null, z11 ? "success" : "error", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1288, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void p() {
        n2(this, "fintech_pinpad_close", "pinpad", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, 1023);
        g.f(this.f63743g, c.a.EVENT, "pinpad", "close", null, null, null, 248);
    }

    @Override // g30.InterfaceC6618a
    public final void p0(String str, String str2) {
        g.f(this.f63743g, c.a.EVENT, "screen", "reset_brightness", new HealthData(null, null, null, null, null, str, str2, null, 159, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void p1(String str, @NotNull String headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("headers", headers);
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "mobile_headers", new HealthData(null, linkedHashMap, null, null, null, str, null, C7714v.a0("headers"), 93, null), null, null, 112);
    }

    @Override // g30.InterfaceC6618a
    public final void q(long j11, String str, String str2) {
        g.f(this.f63743g, c.a.EVENT, "webview", "loading", new HealthData(Long.valueOf(j11), null, null, null, null, str, str2, null, 158, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void q0(boolean z11, boolean z12, String str, String str2, String str3, Integer num, String str4, boolean z13) {
        String str5;
        String str6 = z11 ? "cancel" : z12 ? "success" : str != null ? "error" : "fail";
        String o22 = o2(z13);
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 != null) {
            linkedHashMap.put("token_key", str3);
        }
        if (str2 != null) {
            linkedHashMap.put("stack_trace", str2);
        }
        if (str4 != null) {
            linkedHashMap.put("storage_log_data", str4);
        }
        n2(this, "fintech_bio_sec_storage_write", o22, j22.toJson(linkedHashMap), null, null, null, null, null, str, null, str6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1288, 1023);
        c.a aVar = (z12 || z11) ? c.a.EVENT : c.a.ERROR;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str3 != null) {
            linkedHashMap2.put("token_key", str3);
        }
        linkedHashMap2.put("storage_data", Integer.valueOf(num.intValue()));
        if (str2 != null) {
            linkedHashMap2.put("stack_trace", str2);
        }
        if (str4 != null) {
            str5 = "storage_log_data";
            linkedHashMap2.put(str5, str4);
        } else {
            str5 = "storage_log_data";
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "bioauth", "write_storage", new HealthData(null, linkedHashMap2, str3, null, null, o2(z13), null, C7714v.b0("storage_data", "stack_trace", str5, "token_key"), 89, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void q1() {
        Intrinsics.checkNotNullParameter("android.permission.WRITE_EXTERNAL_STORAGE", "permissionName");
        androidx.core.os.d.b(new Pair("permission_name", "android.permission.WRITE_EXTERNAL_STORAGE"), new Pair("permission_result", "settings"));
    }

    @Override // g30.InterfaceC6618a
    public final void r() {
        if (this.f63746j) {
            this.f63738b.g();
        }
    }

    @Override // g30.InterfaceC6618a
    public final void r0(String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "force_reload_webview", new HealthData(null, null, null, null, null, str, null, null, 223, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void r1(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        Function0<String> getOzonIdSessionId = this.f63739c.getGetOzonIdSessionId();
        n2(this, "fintech_context", null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14), Boolean.valueOf(z15), Boolean.valueOf(z16), null, null, null, null, null, null, null, null, null, null, null, null, null, valueOf, getOzonIdSessionId != null ? getOzonIdSessionId.invoke() : null, Boolean.valueOf(this.f63744h.f()), null, null, null, null, -522242, 967);
    }

    @Override // g30.InterfaceC6618a
    public final void s() {
        n2(this, "fintech_go_offline", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void s0(String str) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("tabs_config", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "set_tab_config", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.a0("tabs_config"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void s1() {
        n2(this, "fintech_video_upload_start", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void t(String str, String str2, boolean z11) {
        String k22 = k2(z11);
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 != null) {
            linkedHashMap.put("token_key", str2);
        }
        n2(this, "fintech_bio_sec_storage_clear_token", "web", j22.toJson(linkedHashMap), null, null, null, null, null, str, null, k22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1288, 1023);
        c.a aVar = z11 ? c.a.EVENT : c.a.ERROR;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str != null) {
            linkedHashMap2.put("error_desc", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "bioauth", "clear_token", new HealthData(null, linkedHashMap2, str2, null, null, "web", null, C7714v.a0("error_desc"), 89, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void t0(String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "close", new HealthData(null, null, null, null, null, str, null, null, 223, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void t1(boolean z11, boolean z12, String str, String str2, String str3, Integer num, String str4, boolean z13) {
        String str5 = z11 ? "cancel" : z12 ? "success" : str != null ? "error" : "fail";
        String o22 = o2(z13);
        JsonAdapter<Map<String, Object>> j22 = j2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 != null) {
            linkedHashMap.put("token_key", str3);
        }
        if (str2 != null) {
            linkedHashMap.put("stack_trace", str2);
        }
        if (str4 != null) {
            linkedHashMap.put("storage_log_data", str4);
        }
        n2(this, "fintech_bio_sec_storage_read", o22, j22.toJson(linkedHashMap), null, null, null, null, null, str, null, str5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1288, 1023);
        c.a aVar = (z12 || z11) ? c.a.EVENT : c.a.ERROR;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (str3 != null) {
            linkedHashMap2.put("token_key", str3);
        }
        if (num != null) {
            linkedHashMap2.put("storage_data", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            linkedHashMap2.put("stack_trace", str2);
        }
        if (str4 != null) {
            linkedHashMap2.put("storage_log_data", str4);
        }
        if (str != null) {
            linkedHashMap2.put("error_desc", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "bioauth", "read_storage", new HealthData(null, linkedHashMap2, str3, null, null, o2(z13), null, C7714v.b0("storage_data", "stack_trace", "storage_log_data", "error_desc", "token_key"), 89, null), z12 ? "ok" : z11 ? "not_found" : str, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void u(@NotNull String oldWebViewVersion) {
        Intrinsics.checkNotNullParameter(oldWebViewVersion, "oldWebViewVersion");
        androidx.core.os.d.b(new Pair("old_webview_version", oldWebViewVersion));
    }

    @Override // g30.InterfaceC6618a
    public final void u0(String str, String str2, Boolean bool, boolean z11) {
        c.a aVar = z11 ? c.a.EVENT : c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bool != null) {
            linkedHashMap.put("visibility", Boolean.valueOf(!bool.booleanValue()));
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "tabbar", "set_visibility", new HealthData(null, linkedHashMap, null, null, null, str, str2, C7714v.a0("visibility"), 29, null), z11 ? "ok" : "failed", null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void u1(String str, String str2, Integer num, String str3) {
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (num != null) {
            linkedHashMap.put("encrypted_card_data", Integer.valueOf(num.intValue()));
        }
        if (str3 != null) {
            linkedHashMap.put("error_desc", str3);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "mirpay", "add_card", new HealthData(null, linkedHashMap, str, null, null, null, null, C7714v.a0("error_desc"), 121, null), str2, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void v(@NotNull String updateStatus, @NotNull String storeName, boolean z11) {
        Intrinsics.checkNotNullParameter(updateStatus, "updateStatus");
        Intrinsics.checkNotNullParameter(storeName, "storeName");
        n2(this, "in_app_update_result", null, z11 ? "hard" : "soft", null, null, null, null, null, null, null, updateStatus, null, null, null, null, null, null, null, null, null, null, null, storeName, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134218758, 1023);
        g.f(this.f63743g, c.a.EVENT, "inappupdate", "update_action", new HealthData(null, U.j(new Pair("store_name", storeName), new Pair("update_status", updateStatus), new Pair("update_mode", z11 ? "hard" : "soft")), null, null, null, null, null, C7714v.b0("store_name", "update_status", "update_mode"), 125, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void v0(boolean z11) {
        n2(this, "fintech_esia_invoke_bridge_interface", null, j2().toJson(U.i(new Pair("is_available", Boolean.valueOf(z11)))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -6, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void v1(@NotNull String frameType) {
        Intrinsics.checkNotNullParameter(frameType, "frameType");
        g.f(this.f63743g, c.a.EVENT, "camera", "take_photo", new HealthData(null, null, null, "photo", null, null, null, null, 247, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void w(@NotNull InterfaceC6794b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f63746j) {
            this.f63738b.f(listener);
        }
    }

    @Override // g30.InterfaceC6618a
    public final void w0(String str, String str2, Integer num, String str3, @NotNull String errorDesc) {
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        n2(this, "fintech_resource_error", null, null, null, str3, l2().a(), str, str2, errorDesc, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1010, 1023);
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_desc", errorDesc);
        if (str2 != null) {
            linkedHashMap.put("asset_url", str2);
        }
        linkedHashMap.put("error_code", Integer.valueOf(num.intValue()));
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "error", new HealthData(null, linkedHashMap, null, null, null, str3, str, C7714v.b0("error_desc", "error_code", "asset_url"), 29, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void w1(String str) {
        g.f(this.f63743g, c.a.EVENT, "webview", "recreate_cancel", new HealthData(null, null, null, null, null, str, null, null, 223, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void x(String str) {
        g.f(this.f63743g, c.a.EVENT, "clipboard", "to_mobile", new HealthData(null, str != null ? C2454a.b("data", str) : null, null, null, null, null, null, null, 253, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void x0(boolean z11, String str, Long l11) {
        n2(this, "fintech_bank_card_recognition_finished", null, j2().toJson(U.i(new Pair("bank_card_recognition_elapsed_time", Long.valueOf(l11.longValue())))), null, null, null, null, null, null, null, z11 ? "success" : (z11 || !(str == null || str.length() == 0)) ? "error" : "fail", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1030, 1023);
        g.f(this.f63743g, z11 ? c.a.EVENT : c.a.ERROR, "camera", "scan", new HealthData(null, U.i(new Pair("scanner_recognition_time", Long.valueOf(l11.longValue()))), null, "bank_card_scanner", null, null, null, C7714v.a0("scanner_recognition_time"), 117, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void x1(int i11, String str, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C8110a.EnumC1263a enumC1263a = C8110a.EnumC1263a.CLICK;
        String valueOf = String.valueOf(i11);
        if (str == null) {
            str = "";
        }
        C8438b.d(this.f63740d, enumC1263a, valueOf, "click_next", str);
    }

    @Override // g30.InterfaceC6618a
    public final void y(@NotNull String pushType, String str, String str2, boolean z11, String str3, String str4, Integer num, Integer num2, Integer num3, Long l11) {
        Intrinsics.checkNotNullParameter(pushType, "pushType");
        String json = (str4 == null && str3 == null) ? null : j2().toJson(U.j(new Pair("push_id", str4), new Pair("extra_payload", str3), new Pair("repeat_count", num3)));
        String k22 = k2(z11);
        String str5 = Build.MODEL;
        j jVar = this.f63744h;
        String str6 = json;
        n2(this, "fintech_push_get_content", null, str6, null, null, null, null, null, str2, num2, k22, null, null, null, null, null, null, pushType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(jVar.f()), jVar.b(), null, null, null, -530182, 927);
        c.a aVar = z11 ? c.a.EVENT : c.a.ERROR;
        String str7 = Intrinsics.d(pushType, "finance_encrypted") ? "decrypt" : "get_push_body";
        String valueOf = z11 ? "ok" : String.valueOf(num2);
        String i22 = i2(pushType);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (pushType.equals("finance_encrypted")) {
            if (str != null) {
                linkedHashMap.put("jwttoken", str);
            }
        } else if (num != null) {
            linkedHashMap.put("body", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("error_message", str2);
        }
        if (num3 != null) {
            linkedHashMap.put("repeat_count", Integer.valueOf(num3.intValue()));
        }
        g.f(this.f63743g, aVar, "push", str7, new HealthData(l11, linkedHashMap, str4, i22, null, null, null, C7714v.b0("error_message", "body"), 112, null), valueOf, null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void y0(String str, boolean z11) {
        c.a aVar = c.a.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("error_desc", str);
        }
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "tab_config_error", new HealthData(null, linkedHashMap, null, null, null, null, null, C7714v.a0("error_desc"), 125, null), z11 ? "invalid_format" : "application_error", null, 224);
    }

    @Override // g30.InterfaceC6618a
    public final void y1(int i11) {
        n2(this, "fintech_app_container_recreate_call", null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void z() {
        n2(this, "fintech_offline_open_sms", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1023);
    }

    @Override // g30.InterfaceC6618a
    public final void z0(String str, String str2, @NotNull String newUrl) {
        Intrinsics.checkNotNullParameter(newUrl, "newUrl");
        g.f(this.f63743g, c.a.EVENT, "webview", "url_changed", new HealthData(null, null, null, null, str, str2, newUrl, null, 143, null), null, null, 240);
    }

    @Override // g30.InterfaceC6618a
    public final void z1(String str, boolean z11, boolean z12) {
        c.a aVar = c.a.EVENT;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("light_status", Boolean.valueOf(z11));
        linkedHashMap.put("light_navigation", Boolean.valueOf(z12));
        Unit unit = Unit.f71690a;
        g.f(this.f63743g, aVar, "webview", "system_bar_appearance", new HealthData(null, linkedHashMap, null, null, null, str, null, C7714v.b0("light_status", "light_navigation"), 93, null), null, null, 240);
    }
}
