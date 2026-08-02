package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Xl implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final C0179ge f13197a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0381od f13198b;

    /* renamed from: c, reason: collision with root package name */
    public final Hb f13199c = new Hb();

    public Xl(@NonNull C0179ge c0179ge, @NonNull InterfaceC0381od interfaceC0381od) {
        this.f13197a = c0179ge;
        this.f13198b = interfaceC0381od;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C0058bm c0058bm) {
        C0359ng c0359ng;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.DEVICE_ID), c0058bm.getDeviceId());
        a(builder, C0353na.I.h(), this.f13199c);
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.APP_SET_ID), c0058bm.getAppSetId());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.APP_SET_ID_SCOPE), c0058bm.getAppSetIdScope());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.APP_PLATFORM), c0058bm.getAppPlatform());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.PROTOCOL_VERSION), c0058bm.getProtocolVersion());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c0058bm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.MODEL), c0058bm.getModel());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.MANUFACTURER), c0058bm.getManufacturer());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.OS_VERSION), c0058bm.getOsVersion());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c0058bm.getScreenWidth()));
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c0058bm.getScreenHeight()));
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c0058bm.getScreenDpi()));
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c0058bm.getScaleFactor()));
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.LOCALE), c0058bm.getLocale());
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.DEVICE_TYPE), c0058bm.getDeviceType());
        builder.appendQueryParameter(this.f13197a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f13197a.a("query_hosts"), String.valueOf(2));
        String a7 = this.f13197a.a("features");
        List<String> h10 = ((C0612xk) this.f13198b).h();
        String[] strArr = {this.f13197a.a("permissions_collecting"), this.f13197a.a("features_collecting"), this.f13197a.a("google_aid"), this.f13197a.a("huawei_oaid"), this.f13197a.a("sim_info"), this.f13197a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(h10);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(a7, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.APP_ID), c0058bm.getPackageName());
        builder.appendQueryParameter(this.f13197a.a("app_debuggable"), ((N5) c0058bm).f12626a);
        if (c0058bm.f13470l) {
            String str = c0058bm.f13471m;
            if (!TextUtils.isEmpty(str)) {
                builder.appendQueryParameter(this.f13197a.a("country_init"), str);
            }
        } else {
            builder.appendQueryParameter(this.f13197a.a("detect_locale"), String.valueOf(1));
        }
        C0445r3 c0445r3 = c0058bm.f13468i;
        if (!lo.a(c0445r3.f14541a)) {
            builder.appendQueryParameter(this.f13197a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f13197a.a("clids_set"), Fm.a(c0445r3.f14541a));
            int ordinal = c0445r3.f14542b.ordinal();
            builder.appendQueryParameter(this.f13197a.a("clids_set_source"), ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "retail" : "satellite" : "api");
            String str2 = c0058bm.f13465f;
            String str3 = c0058bm.f13466g;
            if (TextUtils.isEmpty(str2) && (c0359ng = c0058bm.f13473o.f14204b) != null) {
                str2 = c0359ng.f14361a;
                str3 = c0359ng.f14364d.f14270a;
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f13197a.a("install_referrer"), str2);
                if (str3 == null) {
                    str3 = "null";
                }
                builder.appendQueryParameter(this.f13197a.a("install_referrer_source"), str3);
            }
        }
        String uuid = c0058bm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f13197a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f13197a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f13197a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f13197a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f13197a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f13197a.a("app_system_flag"), ((N5) c0058bm).f12627b);
        builder.appendQueryParameter(this.f13197a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f13197a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f13197a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> d10 = ((C0612xk) this.f13198b).d();
        for (String str4 : d10.keySet()) {
            builder.appendQueryParameter(str4, String.valueOf(d10.get(str4)));
        }
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController dataSendingRestrictionController, @NonNull Hb hb2) {
        hb2.getClass();
        AdvertisingIdsHolder identifiers = C0353na.I.c().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f13197a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
