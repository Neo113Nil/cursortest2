package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.headers;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\bC\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jº\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u00020\u00172\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020[HÖ\u0001J\t\u0010\\\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00105\u001a\u0004\b\u0016\u00104R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!¨\u0006]"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/headers/GetHeadersRequest;", "", "appVersion", "", "o3DeviceType", "o3AppName", "o3AppVersion", "xDeviceStatus", "xObSessionId", "xObModelDevice", "xAppUuid", "xObTheme", "additionalTheme", "language", "xObOsVer", "interfaceScale", "insets", "xO3AppsflyerId", "o3InternalHeaderToken", "abVariants", "testingFeatures", "testingFeaturesV2", "isAutotests", "", "testingAuthTtl", "o3TestName", "xO3MeshVersion", "xFeObFeaturesMock", "sampleTraceHeader", "xAdParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "getO3DeviceType", "getO3AppName", "getO3AppVersion", "getXDeviceStatus", "getXObSessionId", "getXObModelDevice", "getXAppUuid", "getXObTheme", "getAdditionalTheme", "getLanguage", "getXObOsVer", "getInterfaceScale", "getInsets", "getXO3AppsflyerId", "getO3InternalHeaderToken", "getAbVariants", "getTestingFeatures", "getTestingFeaturesV2", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTestingAuthTtl", "getO3TestName", "getXO3MeshVersion", "getXFeObFeaturesMock", "getSampleTraceHeader", "getXAdParams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/headers/GetHeadersRequest;", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetHeadersRequest {

    @i(name = "x-o3-ab-variants")
    private final String abVariants;

    @i(name = "Sec-CH-Prefers-Color-Scheme")
    private final String additionalTheme;

    @i(name = "x-app-version")
    @NotNull
    private final String appVersion;

    @i(name = "x-ob-insets")
    private final String insets;

    @i(name = "x-ob-interface-scale")
    private final String interfaceScale;

    @i(name = "is-mobile-autotests")
    private final Boolean isAutotests;

    @i(name = "x-o3-device-language")
    private final String language;

    @i(name = "x-o3-app-name")
    @NotNull
    private final String o3AppName;

    @i(name = "x-o3-app-version")
    @NotNull
    private final String o3AppVersion;

    @i(name = "x-o3-device-type")
    @NotNull
    private final String o3DeviceType;

    @i(name = "x-o3-internal-headers-token")
    @NotNull
    private final String o3InternalHeaderToken;

    @i(name = "x-o3-test-name")
    private final String o3TestName;

    @i(name = "x-o3-sample-trace")
    private final String sampleTraceHeader;

    @i(name = "x-o3-ob-testing-auth-ttl")
    private final String testingAuthTtl;

    @i(name = "ob-testing-features")
    private final String testingFeatures;

    @i(name = "ob-testing-features-v2")
    private final String testingFeaturesV2;

    @i(name = "x-ad-params")
    private final String xAdParams;

    @i(name = "x-app-uuid")
    private final String xAppUuid;

    @i(name = "x-device-status")
    @NotNull
    private final String xDeviceStatus;

    @i(name = "x-fe-ob-features-mock")
    private final String xFeObFeaturesMock;

    @i(name = "x-ob-user-appsflyer-id")
    private final String xO3AppsflyerId;

    @i(name = "x-o3-meshversion")
    private final String xO3MeshVersion;

    @i(name = "x-ob-model-device")
    private final String xObModelDevice;

    @i(name = "x-ob-osver")
    private final String xObOsVer;

    @i(name = "x-ob-sessionid")
    private final String xObSessionId;

    @i(name = "x-ob-theme")
    private final String xObTheme;

    public GetHeadersRequest(@NotNull String appVersion, @NotNull String o3DeviceType, @NotNull String o3AppName, @NotNull String o3AppVersion, @NotNull String xDeviceStatus, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, @NotNull String o3InternalHeaderToken, String str11, String str12, String str13, Boolean bool, String str14, String str15, String str16, String str17, String str18, String str19) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(o3DeviceType, "o3DeviceType");
        Intrinsics.checkNotNullParameter(o3AppName, "o3AppName");
        Intrinsics.checkNotNullParameter(o3AppVersion, "o3AppVersion");
        Intrinsics.checkNotNullParameter(xDeviceStatus, "xDeviceStatus");
        Intrinsics.checkNotNullParameter(o3InternalHeaderToken, "o3InternalHeaderToken");
        this.appVersion = appVersion;
        this.o3DeviceType = o3DeviceType;
        this.o3AppName = o3AppName;
        this.o3AppVersion = o3AppVersion;
        this.xDeviceStatus = xDeviceStatus;
        this.xObSessionId = str;
        this.xObModelDevice = str2;
        this.xAppUuid = str3;
        this.xObTheme = str4;
        this.additionalTheme = str5;
        this.language = str6;
        this.xObOsVer = str7;
        this.interfaceScale = str8;
        this.insets = str9;
        this.xO3AppsflyerId = str10;
        this.o3InternalHeaderToken = o3InternalHeaderToken;
        this.abVariants = str11;
        this.testingFeatures = str12;
        this.testingFeaturesV2 = str13;
        this.isAutotests = bool;
        this.testingAuthTtl = str14;
        this.o3TestName = str15;
        this.xO3MeshVersion = str16;
        this.xFeObFeaturesMock = str17;
        this.sampleTraceHeader = str18;
        this.xAdParams = str19;
    }

    public static /* synthetic */ GetHeadersRequest copy$default(GetHeadersRequest getHeadersRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool, String str20, String str21, String str22, String str23, String str24, String str25, int i11, Object obj) {
        String str26;
        String str27;
        String str28 = (i11 & 1) != 0 ? getHeadersRequest.appVersion : str;
        String str29 = (i11 & 2) != 0 ? getHeadersRequest.o3DeviceType : str2;
        String str30 = (i11 & 4) != 0 ? getHeadersRequest.o3AppName : str3;
        String str31 = (i11 & 8) != 0 ? getHeadersRequest.o3AppVersion : str4;
        String str32 = (i11 & 16) != 0 ? getHeadersRequest.xDeviceStatus : str5;
        String str33 = (i11 & 32) != 0 ? getHeadersRequest.xObSessionId : str6;
        String str34 = (i11 & 64) != 0 ? getHeadersRequest.xObModelDevice : str7;
        String str35 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? getHeadersRequest.xAppUuid : str8;
        String str36 = (i11 & 256) != 0 ? getHeadersRequest.xObTheme : str9;
        String str37 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? getHeadersRequest.additionalTheme : str10;
        String str38 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? getHeadersRequest.language : str11;
        String str39 = (i11 & 2048) != 0 ? getHeadersRequest.xObOsVer : str12;
        String str40 = (i11 & 4096) != 0 ? getHeadersRequest.interfaceScale : str13;
        String str41 = (i11 & 8192) != 0 ? getHeadersRequest.insets : str14;
        String str42 = str28;
        String str43 = (i11 & 16384) != 0 ? getHeadersRequest.xO3AppsflyerId : str15;
        String str44 = (i11 & 32768) != 0 ? getHeadersRequest.o3InternalHeaderToken : str16;
        String str45 = (i11 & 65536) != 0 ? getHeadersRequest.abVariants : str17;
        String str46 = (i11 & 131072) != 0 ? getHeadersRequest.testingFeatures : str18;
        String str47 = (i11 & 262144) != 0 ? getHeadersRequest.testingFeaturesV2 : str19;
        Boolean bool2 = (i11 & 524288) != 0 ? getHeadersRequest.isAutotests : bool;
        String str48 = (i11 & 1048576) != 0 ? getHeadersRequest.testingAuthTtl : str20;
        String str49 = (i11 & 2097152) != 0 ? getHeadersRequest.o3TestName : str21;
        String str50 = (i11 & 4194304) != 0 ? getHeadersRequest.xO3MeshVersion : str22;
        String str51 = (i11 & 8388608) != 0 ? getHeadersRequest.xFeObFeaturesMock : str23;
        String str52 = (i11 & 16777216) != 0 ? getHeadersRequest.sampleTraceHeader : str24;
        if ((i11 & 33554432) != 0) {
            str27 = str52;
            str26 = getHeadersRequest.xAdParams;
        } else {
            str26 = str25;
            str27 = str52;
        }
        return getHeadersRequest.copy(str42, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str43, str44, str45, str46, str47, bool2, str48, str49, str50, str51, str27, str26);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAdditionalTheme() {
        return this.additionalTheme;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component12, reason: from getter */
    public final String getXObOsVer() {
        return this.xObOsVer;
    }

    /* renamed from: component13, reason: from getter */
    public final String getInterfaceScale() {
        return this.interfaceScale;
    }

    /* renamed from: component14, reason: from getter */
    public final String getInsets() {
        return this.insets;
    }

    /* renamed from: component15, reason: from getter */
    public final String getXO3AppsflyerId() {
        return this.xO3AppsflyerId;
    }

    @NotNull
    /* renamed from: component16, reason: from getter */
    public final String getO3InternalHeaderToken() {
        return this.o3InternalHeaderToken;
    }

    /* renamed from: component17, reason: from getter */
    public final String getAbVariants() {
        return this.abVariants;
    }

    /* renamed from: component18, reason: from getter */
    public final String getTestingFeatures() {
        return this.testingFeatures;
    }

    /* renamed from: component19, reason: from getter */
    public final String getTestingFeaturesV2() {
        return this.testingFeaturesV2;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getO3DeviceType() {
        return this.o3DeviceType;
    }

    /* renamed from: component20, reason: from getter */
    public final Boolean getIsAutotests() {
        return this.isAutotests;
    }

    /* renamed from: component21, reason: from getter */
    public final String getTestingAuthTtl() {
        return this.testingAuthTtl;
    }

    /* renamed from: component22, reason: from getter */
    public final String getO3TestName() {
        return this.o3TestName;
    }

    /* renamed from: component23, reason: from getter */
    public final String getXO3MeshVersion() {
        return this.xO3MeshVersion;
    }

    /* renamed from: component24, reason: from getter */
    public final String getXFeObFeaturesMock() {
        return this.xFeObFeaturesMock;
    }

    /* renamed from: component25, reason: from getter */
    public final String getSampleTraceHeader() {
        return this.sampleTraceHeader;
    }

    /* renamed from: component26, reason: from getter */
    public final String getXAdParams() {
        return this.xAdParams;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getO3AppName() {
        return this.o3AppName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getO3AppVersion() {
        return this.o3AppVersion;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getXDeviceStatus() {
        return this.xDeviceStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final String getXObSessionId() {
        return this.xObSessionId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getXObModelDevice() {
        return this.xObModelDevice;
    }

    /* renamed from: component8, reason: from getter */
    public final String getXAppUuid() {
        return this.xAppUuid;
    }

    /* renamed from: component9, reason: from getter */
    public final String getXObTheme() {
        return this.xObTheme;
    }

    @NotNull
    public final GetHeadersRequest copy(@NotNull String appVersion, @NotNull String o3DeviceType, @NotNull String o3AppName, @NotNull String o3AppVersion, @NotNull String xDeviceStatus, String xObSessionId, String xObModelDevice, String xAppUuid, String xObTheme, String additionalTheme, String language, String xObOsVer, String interfaceScale, String insets, String xO3AppsflyerId, @NotNull String o3InternalHeaderToken, String abVariants, String testingFeatures, String testingFeaturesV2, Boolean isAutotests, String testingAuthTtl, String o3TestName, String xO3MeshVersion, String xFeObFeaturesMock, String sampleTraceHeader, String xAdParams) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(o3DeviceType, "o3DeviceType");
        Intrinsics.checkNotNullParameter(o3AppName, "o3AppName");
        Intrinsics.checkNotNullParameter(o3AppVersion, "o3AppVersion");
        Intrinsics.checkNotNullParameter(xDeviceStatus, "xDeviceStatus");
        Intrinsics.checkNotNullParameter(o3InternalHeaderToken, "o3InternalHeaderToken");
        return new GetHeadersRequest(appVersion, o3DeviceType, o3AppName, o3AppVersion, xDeviceStatus, xObSessionId, xObModelDevice, xAppUuid, xObTheme, additionalTheme, language, xObOsVer, interfaceScale, insets, xO3AppsflyerId, o3InternalHeaderToken, abVariants, testingFeatures, testingFeaturesV2, isAutotests, testingAuthTtl, o3TestName, xO3MeshVersion, xFeObFeaturesMock, sampleTraceHeader, xAdParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetHeadersRequest)) {
            return false;
        }
        GetHeadersRequest getHeadersRequest = (GetHeadersRequest) other;
        return Intrinsics.d(this.appVersion, getHeadersRequest.appVersion) && Intrinsics.d(this.o3DeviceType, getHeadersRequest.o3DeviceType) && Intrinsics.d(this.o3AppName, getHeadersRequest.o3AppName) && Intrinsics.d(this.o3AppVersion, getHeadersRequest.o3AppVersion) && Intrinsics.d(this.xDeviceStatus, getHeadersRequest.xDeviceStatus) && Intrinsics.d(this.xObSessionId, getHeadersRequest.xObSessionId) && Intrinsics.d(this.xObModelDevice, getHeadersRequest.xObModelDevice) && Intrinsics.d(this.xAppUuid, getHeadersRequest.xAppUuid) && Intrinsics.d(this.xObTheme, getHeadersRequest.xObTheme) && Intrinsics.d(this.additionalTheme, getHeadersRequest.additionalTheme) && Intrinsics.d(this.language, getHeadersRequest.language) && Intrinsics.d(this.xObOsVer, getHeadersRequest.xObOsVer) && Intrinsics.d(this.interfaceScale, getHeadersRequest.interfaceScale) && Intrinsics.d(this.insets, getHeadersRequest.insets) && Intrinsics.d(this.xO3AppsflyerId, getHeadersRequest.xO3AppsflyerId) && Intrinsics.d(this.o3InternalHeaderToken, getHeadersRequest.o3InternalHeaderToken) && Intrinsics.d(this.abVariants, getHeadersRequest.abVariants) && Intrinsics.d(this.testingFeatures, getHeadersRequest.testingFeatures) && Intrinsics.d(this.testingFeaturesV2, getHeadersRequest.testingFeaturesV2) && Intrinsics.d(this.isAutotests, getHeadersRequest.isAutotests) && Intrinsics.d(this.testingAuthTtl, getHeadersRequest.testingAuthTtl) && Intrinsics.d(this.o3TestName, getHeadersRequest.o3TestName) && Intrinsics.d(this.xO3MeshVersion, getHeadersRequest.xO3MeshVersion) && Intrinsics.d(this.xFeObFeaturesMock, getHeadersRequest.xFeObFeaturesMock) && Intrinsics.d(this.sampleTraceHeader, getHeadersRequest.sampleTraceHeader) && Intrinsics.d(this.xAdParams, getHeadersRequest.xAdParams);
    }

    public final String getAbVariants() {
        return this.abVariants;
    }

    public final String getAdditionalTheme() {
        return this.additionalTheme;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getInsets() {
        return this.insets;
    }

    public final String getInterfaceScale() {
        return this.interfaceScale;
    }

    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    public final String getO3AppName() {
        return this.o3AppName;
    }

    @NotNull
    public final String getO3AppVersion() {
        return this.o3AppVersion;
    }

    @NotNull
    public final String getO3DeviceType() {
        return this.o3DeviceType;
    }

    @NotNull
    public final String getO3InternalHeaderToken() {
        return this.o3InternalHeaderToken;
    }

    public final String getO3TestName() {
        return this.o3TestName;
    }

    public final String getSampleTraceHeader() {
        return this.sampleTraceHeader;
    }

    public final String getTestingAuthTtl() {
        return this.testingAuthTtl;
    }

    public final String getTestingFeatures() {
        return this.testingFeatures;
    }

    public final String getTestingFeaturesV2() {
        return this.testingFeaturesV2;
    }

    public final String getXAdParams() {
        return this.xAdParams;
    }

    public final String getXAppUuid() {
        return this.xAppUuid;
    }

    @NotNull
    public final String getXDeviceStatus() {
        return this.xDeviceStatus;
    }

    public final String getXFeObFeaturesMock() {
        return this.xFeObFeaturesMock;
    }

    public final String getXO3AppsflyerId() {
        return this.xO3AppsflyerId;
    }

    public final String getXO3MeshVersion() {
        return this.xO3MeshVersion;
    }

    public final String getXObModelDevice() {
        return this.xObModelDevice;
    }

    public final String getXObOsVer() {
        return this.xObOsVer;
    }

    public final String getXObSessionId() {
        return this.xObSessionId;
    }

    public final String getXObTheme() {
        return this.xObTheme;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(g.a(this.appVersion.hashCode() * 31, 31, this.o3DeviceType), 31, this.o3AppName), 31, this.o3AppVersion), 31, this.xDeviceStatus);
        String str = this.xObSessionId;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.xObModelDevice;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xAppUuid;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.xObTheme;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.additionalTheme;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.language;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.xObOsVer;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.interfaceScale;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.insets;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.xO3AppsflyerId;
        int a12 = g.a((hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.o3InternalHeaderToken);
        String str11 = this.abVariants;
        int hashCode10 = (a12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.testingFeatures;
        int hashCode11 = (hashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.testingFeaturesV2;
        int hashCode12 = (hashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool = this.isAutotests;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str14 = this.testingAuthTtl;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.o3TestName;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.xO3MeshVersion;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.xFeObFeaturesMock;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.sampleTraceHeader;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.xAdParams;
        return hashCode18 + (str19 != null ? str19.hashCode() : 0);
    }

    public final Boolean isAutotests() {
        return this.isAutotests;
    }

    @NotNull
    public String toString() {
        String str = this.appVersion;
        String str2 = this.o3DeviceType;
        String str3 = this.o3AppName;
        String str4 = this.o3AppVersion;
        String str5 = this.xDeviceStatus;
        String str6 = this.xObSessionId;
        String str7 = this.xObModelDevice;
        String str8 = this.xAppUuid;
        String str9 = this.xObTheme;
        String str10 = this.additionalTheme;
        String str11 = this.language;
        String str12 = this.xObOsVer;
        String str13 = this.interfaceScale;
        String str14 = this.insets;
        String str15 = this.xO3AppsflyerId;
        String str16 = this.o3InternalHeaderToken;
        String str17 = this.abVariants;
        String str18 = this.testingFeatures;
        String str19 = this.testingFeaturesV2;
        Boolean bool = this.isAutotests;
        String str20 = this.testingAuthTtl;
        String str21 = this.o3TestName;
        String str22 = this.xO3MeshVersion;
        String str23 = this.xFeObFeaturesMock;
        String str24 = this.sampleTraceHeader;
        String str25 = this.xAdParams;
        StringBuilder d11 = C3660k.d("GetHeadersRequest(appVersion=", str, ", o3DeviceType=", str2, ", o3AppName=");
        a.h(d11, str3, ", o3AppVersion=", str4, ", xDeviceStatus=");
        a.h(d11, str5, ", xObSessionId=", str6, ", xObModelDevice=");
        a.h(d11, str7, ", xAppUuid=", str8, ", xObTheme=");
        a.h(d11, str9, ", additionalTheme=", str10, ", language=");
        a.h(d11, str11, ", xObOsVer=", str12, ", interfaceScale=");
        a.h(d11, str13, ", insets=", str14, ", xO3AppsflyerId=");
        a.h(d11, str15, ", o3InternalHeaderToken=", str16, ", abVariants=");
        a.h(d11, str17, ", testingFeatures=", str18, ", testingFeaturesV2=");
        Sh.a.d(bool, str19, ", isAutotests=", ", testingAuthTtl=", d11);
        a.h(d11, str20, ", o3TestName=", str21, ", xO3MeshVersion=");
        a.h(d11, str22, ", xFeObFeaturesMock=", str23, ", sampleTraceHeader=");
        return C3173b.c(d11, str24, ", xAdParams=", str25, ")");
    }
}
