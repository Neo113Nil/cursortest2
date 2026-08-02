package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConStoriesStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsConStoriesStat$SeenMediaInfo {

    @pmi0("cold_start")
    private final boolean coldStart;

    @pmi0("content_type")
    private final ContentType contentType;

    @pmi0("height")
    private final Integer height;

    @pmi0("size")
    private final Integer size;

    @pmi0("time_from_open")
    private final Integer timeFromOpen;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConStoriesStat.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @pmi0("DASH")
        public static final ContentType DASH;

        @pmi0("DASH_WEBM")
        public static final ContentType DASH_WEBM;

        @pmi0("DASH_WEBM_AV1")
        public static final ContentType DASH_WEBM_AV1;

        @pmi0("HLS")
        public static final ContentType HLS;

        @pmi0("MP4")
        public static final ContentType MP4;

        @pmi0(NativeAdContent.ViewTag.OTHER)
        public static final ContentType OTHER;

        @pmi0("PHOTO")
        public static final ContentType PHOTO;

        static {
            ContentType contentType = new ContentType("HLS", 0);
            HLS = contentType;
            ContentType contentType2 = new ContentType("MP4", 1);
            MP4 = contentType2;
            ContentType contentType3 = new ContentType("DASH", 2);
            DASH = contentType3;
            ContentType contentType4 = new ContentType("DASH_WEBM", 3);
            DASH_WEBM = contentType4;
            ContentType contentType5 = new ContentType("DASH_WEBM_AV1", 4);
            DASH_WEBM_AV1 = contentType5;
            ContentType contentType6 = new ContentType("PHOTO", 5);
            PHOTO = contentType6;
            ContentType contentType7 = new ContentType(NativeAdContent.ViewTag.OTHER, 6);
            OTHER = contentType7;
            ContentType[] contentTypeArr = {contentType, contentType2, contentType3, contentType4, contentType5, contentType6, contentType7};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        private ContentType(String str, int i) {
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsConStoriesStat$SeenMediaInfo(ContentType contentType, boolean z, Integer num, Integer num2, Integer num3, Integer num4) {
        this.contentType = contentType;
        this.coldStart = z;
        this.height = num;
        this.width = num2;
        this.size = num3;
        this.timeFromOpen = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConStoriesStat$SeenMediaInfo)) {
            return false;
        }
        MobileOfficialAppsConStoriesStat$SeenMediaInfo mobileOfficialAppsConStoriesStat$SeenMediaInfo = (MobileOfficialAppsConStoriesStat$SeenMediaInfo) obj;
        return this.contentType == mobileOfficialAppsConStoriesStat$SeenMediaInfo.contentType && this.coldStart == mobileOfficialAppsConStoriesStat$SeenMediaInfo.coldStart && epx.f(this.height, mobileOfficialAppsConStoriesStat$SeenMediaInfo.height) && epx.f(this.width, mobileOfficialAppsConStoriesStat$SeenMediaInfo.width) && epx.f(this.size, mobileOfficialAppsConStoriesStat$SeenMediaInfo.size) && epx.f(this.timeFromOpen, mobileOfficialAppsConStoriesStat$SeenMediaInfo.timeFromOpen);
    }

    public final int hashCode() {
        int b = qoy.b(this.contentType.hashCode() * 31, 31, this.coldStart);
        Integer num = this.height;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.size;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.timeFromOpen;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeenMediaInfo(contentType=");
        sb.append(this.contentType);
        sb.append(", coldStart=");
        sb.append(this.coldStart);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", timeFromOpen=");
        return uqi.b(sb, this.timeFromOpen, ')');
    }

    public /* synthetic */ MobileOfficialAppsConStoriesStat$SeenMediaInfo(ContentType contentType, boolean z, Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this(contentType, z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4);
    }
}
