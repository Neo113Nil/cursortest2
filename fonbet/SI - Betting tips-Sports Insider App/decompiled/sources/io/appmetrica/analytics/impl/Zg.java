package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Zg implements IParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f13308a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f13309b;

    /* renamed from: c, reason: collision with root package name */
    public C0300l7 f13310c;

    /* renamed from: d, reason: collision with root package name */
    public final Hb f13311d;

    /* renamed from: e, reason: collision with root package name */
    public long f13312e;

    public Zg(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new Hb());
    }

    public final void a(@NonNull C0300l7 c0300l7) {
        this.f13310c = c0300l7;
    }

    public Zg(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, Hb hb2) {
        this.f13308a = advIdWithLimitedAppender;
        this.f13309b = networkTaskForSendingDataParamsAppender;
        this.f13311d = hb2;
    }

    public final void a(long j) {
        this.f13312e = j;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(@NonNull Uri.Builder builder, @NonNull C0285kh c0285kh) {
        builder.path("report");
        this.f13309b.appendEncryptedData(builder);
        C0300l7 c0300l7 = this.f13310c;
        if (c0300l7 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(c0300l7.f14174a, c0285kh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f13310c.f14175b, c0285kh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f13310c.f14176c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f13310c.f14179f, c0285kh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f13310c.f14181h, c0285kh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f13310c.f14182i, c0285kh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f13310c.j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f13310c.f14177d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f13310c.f14178e);
            a(builder, "app_debuggable", this.f13310c.f14180g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f13310c.f14183k, c0285kh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f13310c.f14184l, c0285kh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f13310c.f14185m, c0285kh.getAppFramework()));
            a(builder, "attribution_id", this.f13310c.f14186n);
        }
        builder.appendQueryParameter("api_key_128", c0285kh.f14133m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c0285kh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c0285kh.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c0285kh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c0285kh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c0285kh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c0285kh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c0285kh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c0285kh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c0285kh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c0285kh.f14136p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c0285kh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c0285kh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f13308a;
        this.f13311d.getClass();
        advIdWithLimitedAppender.appendParams(builder, C0353na.I.c().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f13312e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
