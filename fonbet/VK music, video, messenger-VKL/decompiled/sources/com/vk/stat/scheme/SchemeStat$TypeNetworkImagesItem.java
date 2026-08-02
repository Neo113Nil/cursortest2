package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import ru.ok.android.api.core.ApiUris;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.uay;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeNetworkImagesItem implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("config_version")
    private final Integer configVersion;

    @pmi0("event_source")
    private final String eventSource;

    @pmi0("http_request_host")
    private final String httpRequestHost;

    @pmi0("http_response_code")
    private final Integer httpResponseCode;

    @pmi0("http_response_stat_key")
    private final Integer httpResponseStatKey;

    @pmi0("image_appearing_time")
    private final int imageAppearingTime;

    @pmi0("image_format")
    private final ImageFormat imageFormat;

    @pmi0("image_load_start_time")
    private final String imageLoadStartTime;

    @pmi0("image_processing_time")
    private final int imageProcessingTime;

    @pmi0("image_size_bytes")
    private final int imageSizeBytes;

    @pmi0("image_size_pixels")
    private final int imageSizePixels;

    @pmi0("image_width_pixels")
    private final Integer imageWidthPixels;

    @pmi0("is_cache")
    private final Boolean isCache;

    @pmi0("network_info")
    private final MobileOfficialAppsCoreDeviceStat$NetworkInfo networkInfo;

    @pmi0("protocol")
    private final Protocol protocol;

    @pmi0("response_time")
    private final int responseTime;

    @pmi0("response_ttfb")
    private final int responseTtfb;

    @pmi0("status")
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ImageFormat {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ImageFormat[] $VALUES;

        @pmi0("heif")
        public static final ImageFormat HEIF;

        @pmi0("jpeg")
        public static final ImageFormat JPEG;

        @pmi0("pjpeg")
        public static final ImageFormat PJPEG;

        @pmi0("webp")
        public static final ImageFormat WEBP;

        static {
            ImageFormat imageFormat = new ImageFormat("JPEG", 0);
            JPEG = imageFormat;
            ImageFormat imageFormat2 = new ImageFormat("PJPEG", 1);
            PJPEG = imageFormat2;
            ImageFormat imageFormat3 = new ImageFormat("HEIF", 2);
            HEIF = imageFormat3;
            ImageFormat imageFormat4 = new ImageFormat("WEBP", 3);
            WEBP = imageFormat4;
            ImageFormat[] imageFormatArr = {imageFormat, imageFormat2, imageFormat3, imageFormat4};
            $VALUES = imageFormatArr;
            $ENTRIES = new asp(imageFormatArr);
        }

        private ImageFormat(String str, int i) {
        }

        public static ImageFormat valueOf(String str) {
            return (ImageFormat) Enum.valueOf(ImageFormat.class, str);
        }

        public static ImageFormat[] values() {
            return (ImageFormat[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Protocol {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Protocol[] $VALUES;
        public static final Protocol H2;
        public static final Protocol HTTP_1_0;
        public static final Protocol HTTP_1_1;
        public static final Protocol QUIC;
        private final String value;

        /* compiled from: SchemeStat.kt */
        public static final class Serializer implements uay<Protocol> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(((Protocol) obj).value);
            }
        }

        static {
            Protocol protocol = new Protocol("HTTP_1_0", 0, "http/1.0");
            HTTP_1_0 = protocol;
            Protocol protocol2 = new Protocol("HTTP_1_1", 1, "http/1.1");
            HTTP_1_1 = protocol2;
            Protocol protocol3 = new Protocol("H2", 2, "h2");
            H2 = protocol3;
            Protocol protocol4 = new Protocol("QUIC", 3, "quic");
            QUIC = protocol4;
            Protocol[] protocolArr = {protocol, protocol2, protocol3, protocol4};
            $VALUES = protocolArr;
            $ENTRIES = new asp(protocolArr);
        }

        public Protocol(String str, int i, String str2) {
            this.value = str2;
        }

        public static Protocol valueOf(String str) {
            return (Protocol) Enum.valueOf(Protocol.class, str);
        }

        public static Protocol[] values() {
            return (Protocol[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;

        @pmi0(ApiUris.SCHEME_OK)
        public static final Status OK;

        @pmi0("processing_error")
        public static final Status PROCESSING_ERROR;

        @pmi0("request_error")
        public static final Status REQUEST_ERROR;

        @pmi0("timeout")
        public static final Status TIMEOUT;

        static {
            Status status = new Status("OK", 0);
            OK = status;
            Status status2 = new Status("TIMEOUT", 1);
            TIMEOUT = status2;
            Status status3 = new Status("REQUEST_ERROR", 2);
            REQUEST_ERROR = status3;
            Status status4 = new Status("PROCESSING_ERROR", 3);
            PROCESSING_ERROR = status4;
            Status[] statusArr = {status, status2, status3, status4};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        private Status(String str, int i) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeNetworkImagesItem(String str, int i, int i2, int i3, int i4, int i5, int i6, Status status, Integer num, ImageFormat imageFormat, String str2, Protocol protocol, Boolean bool, String str3, Integer num2, Integer num3, Integer num4, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo) {
        this.eventSource = str;
        this.imageSizeBytes = i;
        this.imageSizePixels = i2;
        this.imageAppearingTime = i3;
        this.imageProcessingTime = i4;
        this.responseTtfb = i5;
        this.responseTime = i6;
        this.status = status;
        this.imageWidthPixels = num;
        this.imageFormat = imageFormat;
        this.imageLoadStartTime = str2;
        this.protocol = protocol;
        this.isCache = bool;
        this.httpRequestHost = str3;
        this.httpResponseCode = num2;
        this.httpResponseStatKey = num3;
        this.configVersion = num4;
        this.networkInfo = mobileOfficialAppsCoreDeviceStat$NetworkInfo;
    }

    public final String a() {
        return this.eventSource;
    }

    public final String b() {
        return this.httpRequestHost;
    }

    public final Integer c() {
        return this.httpResponseCode;
    }

    public final int d() {
        return this.imageAppearingTime;
    }

    public final ImageFormat e() {
        return this.imageFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeNetworkImagesItem)) {
            return false;
        }
        SchemeStat$TypeNetworkImagesItem schemeStat$TypeNetworkImagesItem = (SchemeStat$TypeNetworkImagesItem) obj;
        return epx.f(this.eventSource, schemeStat$TypeNetworkImagesItem.eventSource) && this.imageSizeBytes == schemeStat$TypeNetworkImagesItem.imageSizeBytes && this.imageSizePixels == schemeStat$TypeNetworkImagesItem.imageSizePixels && this.imageAppearingTime == schemeStat$TypeNetworkImagesItem.imageAppearingTime && this.imageProcessingTime == schemeStat$TypeNetworkImagesItem.imageProcessingTime && this.responseTtfb == schemeStat$TypeNetworkImagesItem.responseTtfb && this.responseTime == schemeStat$TypeNetworkImagesItem.responseTime && this.status == schemeStat$TypeNetworkImagesItem.status && epx.f(this.imageWidthPixels, schemeStat$TypeNetworkImagesItem.imageWidthPixels) && this.imageFormat == schemeStat$TypeNetworkImagesItem.imageFormat && epx.f(this.imageLoadStartTime, schemeStat$TypeNetworkImagesItem.imageLoadStartTime) && this.protocol == schemeStat$TypeNetworkImagesItem.protocol && epx.f(this.isCache, schemeStat$TypeNetworkImagesItem.isCache) && epx.f(this.httpRequestHost, schemeStat$TypeNetworkImagesItem.httpRequestHost) && epx.f(this.httpResponseCode, schemeStat$TypeNetworkImagesItem.httpResponseCode) && epx.f(this.httpResponseStatKey, schemeStat$TypeNetworkImagesItem.httpResponseStatKey) && epx.f(this.configVersion, schemeStat$TypeNetworkImagesItem.configVersion) && epx.f(this.networkInfo, schemeStat$TypeNetworkImagesItem.networkInfo);
    }

    public final int f() {
        return this.imageProcessingTime;
    }

    public final int g() {
        return this.imageSizeBytes;
    }

    public final int h() {
        return this.imageSizePixels;
    }

    public final int hashCode() {
        int a = shy.a(this.responseTime, shy.a(this.responseTtfb, shy.a(this.imageProcessingTime, shy.a(this.imageAppearingTime, shy.a(this.imageSizePixels, shy.a(this.imageSizeBytes, this.eventSource.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        Status status = this.status;
        int hashCode = (a + (status == null ? 0 : status.hashCode())) * 31;
        Integer num = this.imageWidthPixels;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ImageFormat imageFormat = this.imageFormat;
        int hashCode3 = (hashCode2 + (imageFormat == null ? 0 : imageFormat.hashCode())) * 31;
        String str = this.imageLoadStartTime;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Protocol protocol = this.protocol;
        int hashCode5 = (hashCode4 + (protocol == null ? 0 : protocol.hashCode())) * 31;
        Boolean bool = this.isCache;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.httpRequestHost;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.httpResponseCode;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.httpResponseStatKey;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.configVersion;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo = this.networkInfo;
        return hashCode10 + (mobileOfficialAppsCoreDeviceStat$NetworkInfo != null ? mobileOfficialAppsCoreDeviceStat$NetworkInfo.hashCode() : 0);
    }

    public final Integer i() {
        return this.imageWidthPixels;
    }

    public final Protocol j() {
        return this.protocol;
    }

    public final int k() {
        return this.responseTime;
    }

    public final int l() {
        return this.responseTtfb;
    }

    public final Status m() {
        return this.status;
    }

    public final String toString() {
        return "TypeNetworkImagesItem(eventSource=" + this.eventSource + ", imageSizeBytes=" + this.imageSizeBytes + ", imageSizePixels=" + this.imageSizePixels + ", imageAppearingTime=" + this.imageAppearingTime + ", imageProcessingTime=" + this.imageProcessingTime + ", responseTtfb=" + this.responseTtfb + ", responseTime=" + this.responseTime + ", status=" + this.status + ", imageWidthPixels=" + this.imageWidthPixels + ", imageFormat=" + this.imageFormat + ", imageLoadStartTime=" + this.imageLoadStartTime + ", protocol=" + this.protocol + ", isCache=" + this.isCache + ", httpRequestHost=" + this.httpRequestHost + ", httpResponseCode=" + this.httpResponseCode + ", httpResponseStatKey=" + this.httpResponseStatKey + ", configVersion=" + this.configVersion + ", networkInfo=" + this.networkInfo + ')';
    }

    public /* synthetic */ SchemeStat$TypeNetworkImagesItem(String str, int i, int i2, int i3, int i4, int i5, int i6, Status status, Integer num, ImageFormat imageFormat, String str2, Protocol protocol, Boolean bool, String str3, Integer num2, Integer num3, Integer num4, MobileOfficialAppsCoreDeviceStat$NetworkInfo mobileOfficialAppsCoreDeviceStat$NetworkInfo, int i7, zcl zclVar) {
        this(str, i, i2, i3, i4, i5, i6, (i7 & 128) != 0 ? null : status, (i7 & 256) != 0 ? null : num, (i7 & 512) != 0 ? null : imageFormat, (i7 & 1024) != 0 ? null : str2, (i7 & 2048) != 0 ? null : protocol, (i7 & 4096) != 0 ? null : bool, (i7 & 8192) != 0 ? null : str3, (i7 & 16384) != 0 ? null : num2, (32768 & i7) != 0 ? null : num3, (65536 & i7) != 0 ? null : num4, (i7 & 131072) != 0 ? null : mobileOfficialAppsCoreDeviceStat$NetworkInfo);
    }
}
