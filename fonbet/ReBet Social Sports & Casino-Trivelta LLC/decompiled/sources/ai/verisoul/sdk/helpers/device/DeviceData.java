package ai.verisoul.sdk.helpers.device;

import Gb.c;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B³\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u001fJ\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010I\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010L\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010M\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010N\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010O\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010P\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J¾\u0002\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\fHÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b-\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b2\u0010*R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b3\u0010$R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b5\u0010$R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b6\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b9\u0010$R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b:\u0010$R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b=\u0010*R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b>\u0010*¨\u0006_"}, d2 = {"Lai/verisoul/sdk/helpers/device/DeviceData;", "", "brand", "", "model", "manufacturer", "device", "hardware", "product", "buildBoard", "osVersionName", "osApiLevel", "", "supportedAbis", "", "fingerprint", "localeLanguage", "localeCountry", "systemUptimeMs", "", "lastBootReason", "displayName", "screenWidthPx", "screenHeightPx", "densityDpi", "orientation", "totalInternalStorageBytes", "freeInternalStorageBytes", "memoryClassMb", "largeMemoryClassMb", "maxHeapSizeBytes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "getBrand", "()Ljava/lang/String;", "getBuildBoard", "getDensityDpi", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDevice", "getDisplayName", "getFingerprint", "getFreeInternalStorageBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHardware", "getLargeMemoryClassMb", "getLastBootReason", "getLocaleCountry", "getLocaleLanguage", "getManufacturer", "getMaxHeapSizeBytes", "getMemoryClassMb", "getModel", "getOrientation", "getOsApiLevel", "getOsVersionName", "getProduct", "getScreenHeightPx", "getScreenWidthPx", "getSupportedAbis", "()Ljava/util/List;", "getSystemUptimeMs", "getTotalInternalStorageBytes", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lai/verisoul/sdk/helpers/device/DeviceData;", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DeviceData {

    @c("brand")
    @Nullable
    private final String brand;

    @c("buildBoard")
    @NotNull
    private final String buildBoard;

    @c("densityDpi")
    @Nullable
    private final Integer densityDpi;

    @c("device")
    @Nullable
    private final String device;

    @c("displayName")
    @Nullable
    private final String displayName;

    @c("fingerprint")
    @Nullable
    private final String fingerprint;

    @c("freeInternalStorageBytes")
    @Nullable
    private final Long freeInternalStorageBytes;

    @c("hardware")
    @Nullable
    private final String hardware;

    @c("largeMemoryClassMb")
    @Nullable
    private final Integer largeMemoryClassMb;

    @c("lastBootReason")
    @Nullable
    private final String lastBootReason;

    @c("localeCountry")
    @Nullable
    private final String localeCountry;

    @c("localeLanguage")
    @Nullable
    private final String localeLanguage;

    @c("manufacturer")
    @Nullable
    private final String manufacturer;

    @c("maxHeapSizeBytes")
    @Nullable
    private final Long maxHeapSizeBytes;

    @c("memoryClassMb")
    @Nullable
    private final Integer memoryClassMb;

    @c("model")
    @Nullable
    private final String model;

    @c("orientation")
    @Nullable
    private final Integer orientation;

    @c("osApiLevel")
    @Nullable
    private final Integer osApiLevel;

    @c("osVersionName")
    @Nullable
    private final String osVersionName;

    @c("product")
    @Nullable
    private final String product;

    @c("screenHeightPx")
    @Nullable
    private final Integer screenHeightPx;

    @c("screenWidthPx")
    @Nullable
    private final Integer screenWidthPx;

    @c("supportedAbis")
    @Nullable
    private final List<String> supportedAbis;

    @c("systemUptimeMs")
    @Nullable
    private final Long systemUptimeMs;

    @c("totalInternalStorageBytes")
    @Nullable
    private final Long totalInternalStorageBytes;

    public DeviceData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull String buildBoard, @Nullable String str7, @Nullable Integer num, @Nullable List<String> list, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Long l10, @Nullable String str11, @Nullable String str12, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Long l11, @Nullable Long l12, @Nullable Integer num6, @Nullable Integer num7, @Nullable Long l13) {
        Intrinsics.checkNotNullParameter(buildBoard, "buildBoard");
        this.brand = str;
        this.model = str2;
        this.manufacturer = str3;
        this.device = str4;
        this.hardware = str5;
        this.product = str6;
        this.buildBoard = buildBoard;
        this.osVersionName = str7;
        this.osApiLevel = num;
        this.supportedAbis = list;
        this.fingerprint = str8;
        this.localeLanguage = str9;
        this.localeCountry = str10;
        this.systemUptimeMs = l10;
        this.lastBootReason = str11;
        this.displayName = str12;
        this.screenWidthPx = num2;
        this.screenHeightPx = num3;
        this.densityDpi = num4;
        this.orientation = num5;
        this.totalInternalStorageBytes = l11;
        this.freeInternalStorageBytes = l12;
        this.memoryClassMb = num6;
        this.largeMemoryClassMb = num7;
        this.maxHeapSizeBytes = l13;
    }

    public static /* synthetic */ DeviceData copy$default(DeviceData deviceData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, List list, String str9, String str10, String str11, Long l10, String str12, String str13, Integer num2, Integer num3, Integer num4, Integer num5, Long l11, Long l12, Integer num6, Integer num7, Long l13, int i10, Object obj) {
        Long l14;
        Integer num8;
        String str14 = (i10 & 1) != 0 ? deviceData.brand : str;
        String str15 = (i10 & 2) != 0 ? deviceData.model : str2;
        String str16 = (i10 & 4) != 0 ? deviceData.manufacturer : str3;
        String str17 = (i10 & 8) != 0 ? deviceData.device : str4;
        String str18 = (i10 & 16) != 0 ? deviceData.hardware : str5;
        String str19 = (i10 & 32) != 0 ? deviceData.product : str6;
        String str20 = (i10 & 64) != 0 ? deviceData.buildBoard : str7;
        String str21 = (i10 & 128) != 0 ? deviceData.osVersionName : str8;
        Integer num9 = (i10 & 256) != 0 ? deviceData.osApiLevel : num;
        List list2 = (i10 & 512) != 0 ? deviceData.supportedAbis : list;
        String str22 = (i10 & 1024) != 0 ? deviceData.fingerprint : str9;
        String str23 = (i10 & 2048) != 0 ? deviceData.localeLanguage : str10;
        String str24 = (i10 & 4096) != 0 ? deviceData.localeCountry : str11;
        Long l15 = (i10 & 8192) != 0 ? deviceData.systemUptimeMs : l10;
        String str25 = str14;
        String str26 = (i10 & 16384) != 0 ? deviceData.lastBootReason : str12;
        String str27 = (i10 & 32768) != 0 ? deviceData.displayName : str13;
        Integer num10 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? deviceData.screenWidthPx : num2;
        Integer num11 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? deviceData.screenHeightPx : num3;
        Integer num12 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? deviceData.densityDpi : num4;
        Integer num13 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? deviceData.orientation : num5;
        Long l16 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? deviceData.totalInternalStorageBytes : l11;
        Long l17 = (i10 & PKIFailureInfo.badSenderNonce) != 0 ? deviceData.freeInternalStorageBytes : l12;
        Integer num14 = (i10 & 4194304) != 0 ? deviceData.memoryClassMb : num6;
        Integer num15 = (i10 & 8388608) != 0 ? deviceData.largeMemoryClassMb : num7;
        if ((i10 & 16777216) != 0) {
            num8 = num15;
            l14 = deviceData.maxHeapSizeBytes;
        } else {
            l14 = l13;
            num8 = num15;
        }
        return deviceData.copy(str25, str15, str16, str17, str18, str19, str20, str21, num9, list2, str22, str23, str24, l15, str26, str27, num10, num11, num12, num13, l16, l17, num14, num8, l14);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final List<String> component10() {
        return this.supportedAbis;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getLocaleLanguage() {
        return this.localeLanguage;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getLocaleCountry() {
        return this.localeCountry;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Long getSystemUptimeMs() {
        return this.systemUptimeMs;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getLastBootReason() {
        return this.lastBootReason;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getScreenWidthPx() {
        return this.screenWidthPx;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getScreenHeightPx() {
        return this.screenHeightPx;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getDensityDpi() {
        return this.densityDpi;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getOrientation() {
        return this.orientation;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Long getTotalInternalStorageBytes() {
        return this.totalInternalStorageBytes;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Long getFreeInternalStorageBytes() {
        return this.freeInternalStorageBytes;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getMemoryClassMb() {
        return this.memoryClassMb;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getLargeMemoryClassMb() {
        return this.largeMemoryClassMb;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Long getMaxHeapSizeBytes() {
        return this.maxHeapSizeBytes;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getHardware() {
        return this.hardware;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getBuildBoard() {
        return this.buildBoard;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getOsVersionName() {
        return this.osVersionName;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getOsApiLevel() {
        return this.osApiLevel;
    }

    @NotNull
    public final DeviceData copy(@Nullable String brand, @Nullable String model, @Nullable String manufacturer, @Nullable String device, @Nullable String hardware, @Nullable String product, @NotNull String buildBoard, @Nullable String osVersionName, @Nullable Integer osApiLevel, @Nullable List<String> supportedAbis, @Nullable String fingerprint, @Nullable String localeLanguage, @Nullable String localeCountry, @Nullable Long systemUptimeMs, @Nullable String lastBootReason, @Nullable String displayName, @Nullable Integer screenWidthPx, @Nullable Integer screenHeightPx, @Nullable Integer densityDpi, @Nullable Integer orientation, @Nullable Long totalInternalStorageBytes, @Nullable Long freeInternalStorageBytes, @Nullable Integer memoryClassMb, @Nullable Integer largeMemoryClassMb, @Nullable Long maxHeapSizeBytes) {
        Intrinsics.checkNotNullParameter(buildBoard, "buildBoard");
        return new DeviceData(brand, model, manufacturer, device, hardware, product, buildBoard, osVersionName, osApiLevel, supportedAbis, fingerprint, localeLanguage, localeCountry, systemUptimeMs, lastBootReason, displayName, screenWidthPx, screenHeightPx, densityDpi, orientation, totalInternalStorageBytes, freeInternalStorageBytes, memoryClassMb, largeMemoryClassMb, maxHeapSizeBytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceData)) {
            return false;
        }
        DeviceData deviceData = (DeviceData) other;
        return Intrinsics.areEqual(this.brand, deviceData.brand) && Intrinsics.areEqual(this.model, deviceData.model) && Intrinsics.areEqual(this.manufacturer, deviceData.manufacturer) && Intrinsics.areEqual(this.device, deviceData.device) && Intrinsics.areEqual(this.hardware, deviceData.hardware) && Intrinsics.areEqual(this.product, deviceData.product) && Intrinsics.areEqual(this.buildBoard, deviceData.buildBoard) && Intrinsics.areEqual(this.osVersionName, deviceData.osVersionName) && Intrinsics.areEqual(this.osApiLevel, deviceData.osApiLevel) && Intrinsics.areEqual(this.supportedAbis, deviceData.supportedAbis) && Intrinsics.areEqual(this.fingerprint, deviceData.fingerprint) && Intrinsics.areEqual(this.localeLanguage, deviceData.localeLanguage) && Intrinsics.areEqual(this.localeCountry, deviceData.localeCountry) && Intrinsics.areEqual(this.systemUptimeMs, deviceData.systemUptimeMs) && Intrinsics.areEqual(this.lastBootReason, deviceData.lastBootReason) && Intrinsics.areEqual(this.displayName, deviceData.displayName) && Intrinsics.areEqual(this.screenWidthPx, deviceData.screenWidthPx) && Intrinsics.areEqual(this.screenHeightPx, deviceData.screenHeightPx) && Intrinsics.areEqual(this.densityDpi, deviceData.densityDpi) && Intrinsics.areEqual(this.orientation, deviceData.orientation) && Intrinsics.areEqual(this.totalInternalStorageBytes, deviceData.totalInternalStorageBytes) && Intrinsics.areEqual(this.freeInternalStorageBytes, deviceData.freeInternalStorageBytes) && Intrinsics.areEqual(this.memoryClassMb, deviceData.memoryClassMb) && Intrinsics.areEqual(this.largeMemoryClassMb, deviceData.largeMemoryClassMb) && Intrinsics.areEqual(this.maxHeapSizeBytes, deviceData.maxHeapSizeBytes);
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final String getBuildBoard() {
        return this.buildBoard;
    }

    @Nullable
    public final Integer getDensityDpi() {
        return this.densityDpi;
    }

    @Nullable
    public final String getDevice() {
        return this.device;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @Nullable
    public final Long getFreeInternalStorageBytes() {
        return this.freeInternalStorageBytes;
    }

    @Nullable
    public final String getHardware() {
        return this.hardware;
    }

    @Nullable
    public final Integer getLargeMemoryClassMb() {
        return this.largeMemoryClassMb;
    }

    @Nullable
    public final String getLastBootReason() {
        return this.lastBootReason;
    }

    @Nullable
    public final String getLocaleCountry() {
        return this.localeCountry;
    }

    @Nullable
    public final String getLocaleLanguage() {
        return this.localeLanguage;
    }

    @Nullable
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    public final Long getMaxHeapSizeBytes() {
        return this.maxHeapSizeBytes;
    }

    @Nullable
    public final Integer getMemoryClassMb() {
        return this.memoryClassMb;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final Integer getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final Integer getOsApiLevel() {
        return this.osApiLevel;
    }

    @Nullable
    public final String getOsVersionName() {
        return this.osVersionName;
    }

    @Nullable
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    public final Integer getScreenHeightPx() {
        return this.screenHeightPx;
    }

    @Nullable
    public final Integer getScreenWidthPx() {
        return this.screenWidthPx;
    }

    @Nullable
    public final List<String> getSupportedAbis() {
        return this.supportedAbis;
    }

    @Nullable
    public final Long getSystemUptimeMs() {
        return this.systemUptimeMs;
    }

    @Nullable
    public final Long getTotalInternalStorageBytes() {
        return this.totalInternalStorageBytes;
    }

    public int hashCode() {
        String str = this.brand;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.manufacturer;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.device;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hardware;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.product;
        int hashCode6 = (((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.buildBoard.hashCode()) * 31;
        String str7 = this.osVersionName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.osApiLevel;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.supportedAbis;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.fingerprint;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.localeLanguage;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.localeCountry;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l10 = this.systemUptimeMs;
        int hashCode13 = (hashCode12 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str11 = this.lastBootReason;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.displayName;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.screenWidthPx;
        int hashCode16 = (hashCode15 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.screenHeightPx;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.densityDpi;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.orientation;
        int hashCode19 = (hashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l11 = this.totalInternalStorageBytes;
        int hashCode20 = (hashCode19 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.freeInternalStorageBytes;
        int hashCode21 = (hashCode20 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num6 = this.memoryClassMb;
        int hashCode22 = (hashCode21 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.largeMemoryClassMb;
        int hashCode23 = (hashCode22 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Long l13 = this.maxHeapSizeBytes;
        return hashCode23 + (l13 != null ? l13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceData(brand=" + this.brand + ", model=" + this.model + ", manufacturer=" + this.manufacturer + ", device=" + this.device + ", hardware=" + this.hardware + ", product=" + this.product + ", buildBoard=" + this.buildBoard + ", osVersionName=" + this.osVersionName + ", osApiLevel=" + this.osApiLevel + ", supportedAbis=" + this.supportedAbis + ", fingerprint=" + this.fingerprint + ", localeLanguage=" + this.localeLanguage + ", localeCountry=" + this.localeCountry + ", systemUptimeMs=" + this.systemUptimeMs + ", lastBootReason=" + this.lastBootReason + ", displayName=" + this.displayName + ", screenWidthPx=" + this.screenWidthPx + ", screenHeightPx=" + this.screenHeightPx + ", densityDpi=" + this.densityDpi + ", orientation=" + this.orientation + ", totalInternalStorageBytes=" + this.totalInternalStorageBytes + ", freeInternalStorageBytes=" + this.freeInternalStorageBytes + ", memoryClassMb=" + this.memoryClassMb + ", largeMemoryClassMb=" + this.largeMemoryClassMb + ", maxHeapSizeBytes=" + this.maxHeapSizeBytes + ")";
    }

    public /* synthetic */ DeviceData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, List list, String str9, String str10, String str11, Long l10, String str12, String str13, Integer num2, Integer num3, Integer num4, Integer num5, Long l11, Long l12, Integer num6, Integer num7, Long l13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : num, (i10 & 512) != 0 ? null : list, (i10 & 1024) != 0 ? null : str9, (i10 & 2048) != 0 ? null : str10, (i10 & 4096) != 0 ? null : str11, (i10 & 8192) != 0 ? null : l10, (i10 & 16384) != 0 ? null : str12, (32768 & i10) != 0 ? null : str13, (65536 & i10) != 0 ? null : num2, (131072 & i10) != 0 ? null : num3, (262144 & i10) != 0 ? null : num4, (524288 & i10) != 0 ? null : num5, (1048576 & i10) != 0 ? null : l11, (2097152 & i10) != 0 ? null : l12, (4194304 & i10) != 0 ? null : num6, (8388608 & i10) != 0 ? null : num7, (i10 & 16777216) != 0 ? null : l13);
    }
}
