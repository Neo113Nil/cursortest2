package ru.ozon.cdn.chooser.internal.data.dto;

import An.C2439a;
import B0.A0;
import C.o0;
import Fj.c;
import G.g;
import N3.C3660k;
import Tz.C4055a;
import V.e;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001f !\"BE\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse;", "", "imageRules", "", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$ImageRuleDto;", "videoRules", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$VideoRuleDto;", "imageWarmupList", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$ImageWarmUpDataDto;", "popStatsConfig", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto;)V", "getImageRules", "()Ljava/util/List;", "getVideoRules", "getImageWarmupList", "getPopStatsConfig", "()Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ImageRuleDto", "VideoRuleDto", "ImageWarmUpDataDto", "PopsConfigDto", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CdnConfigResponse {

    @NotNull
    private final List<ImageRuleDto> imageRules;
    private final List<ImageWarmUpDataDto> imageWarmupList;
    private final PopsConfigDto popStatsConfig;

    @NotNull
    private final List<VideoRuleDto> videoRules;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ<\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$ImageRuleDto;", "", "hostEquals", "", "hostToUse", "hostToUseOriginal", "canResize", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getHostEquals", "()Ljava/lang/String;", "getHostToUse", "getHostToUseOriginal", "getCanResize", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$ImageRuleDto;", "equals", "other", "hashCode", "", "toString", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageRuleDto {
        private final Boolean canResize;

        @NotNull
        private final String hostEquals;
        private final String hostToUse;
        private final String hostToUseOriginal;

        public ImageRuleDto(@i(name = "hostEquals") @NotNull String hostEquals, @i(name = "hostToUse") String str, @i(name = "hostToUseOriginal") String str2, @i(name = "resize") Boolean bool) {
            Intrinsics.checkNotNullParameter(hostEquals, "hostEquals");
            this.hostEquals = hostEquals;
            this.hostToUse = str;
            this.hostToUseOriginal = str2;
            this.canResize = bool;
        }

        public static /* synthetic */ ImageRuleDto copy$default(ImageRuleDto imageRuleDto, String str, String str2, String str3, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageRuleDto.hostEquals;
            }
            if ((i11 & 2) != 0) {
                str2 = imageRuleDto.hostToUse;
            }
            if ((i11 & 4) != 0) {
                str3 = imageRuleDto.hostToUseOriginal;
            }
            if ((i11 & 8) != 0) {
                bool = imageRuleDto.canResize;
            }
            return imageRuleDto.copy(str, str2, str3, bool);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHostEquals() {
            return this.hostEquals;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHostToUse() {
            return this.hostToUse;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHostToUseOriginal() {
            return this.hostToUseOriginal;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getCanResize() {
            return this.canResize;
        }

        @NotNull
        public final ImageRuleDto copy(@i(name = "hostEquals") @NotNull String hostEquals, @i(name = "hostToUse") String hostToUse, @i(name = "hostToUseOriginal") String hostToUseOriginal, @i(name = "resize") Boolean canResize) {
            Intrinsics.checkNotNullParameter(hostEquals, "hostEquals");
            return new ImageRuleDto(hostEquals, hostToUse, hostToUseOriginal, canResize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageRuleDto)) {
                return false;
            }
            ImageRuleDto imageRuleDto = (ImageRuleDto) other;
            return Intrinsics.d(this.hostEquals, imageRuleDto.hostEquals) && Intrinsics.d(this.hostToUse, imageRuleDto.hostToUse) && Intrinsics.d(this.hostToUseOriginal, imageRuleDto.hostToUseOriginal) && Intrinsics.d(this.canResize, imageRuleDto.canResize);
        }

        public final Boolean getCanResize() {
            return this.canResize;
        }

        @NotNull
        public final String getHostEquals() {
            return this.hostEquals;
        }

        public final String getHostToUse() {
            return this.hostToUse;
        }

        public final String getHostToUseOriginal() {
            return this.hostToUseOriginal;
        }

        public int hashCode() {
            int hashCode = this.hostEquals.hashCode() * 31;
            String str = this.hostToUse;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostToUseOriginal;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.canResize;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.hostEquals;
            String str2 = this.hostToUse;
            String str3 = this.hostToUseOriginal;
            Boolean bool = this.canResize;
            StringBuilder d11 = C3660k.d("ImageRuleDto(hostEquals=", str, ", hostToUse=", str2, ", hostToUseOriginal=");
            d11.append(str3);
            d11.append(", canResize=");
            d11.append(bool);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$ImageWarmUpDataDto;", "", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageWarmUpDataDto {

        @NotNull
        private final String url;

        public ImageWarmUpDataDto(@i(name = "url") @NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ ImageWarmUpDataDto copy$default(ImageWarmUpDataDto imageWarmUpDataDto, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageWarmUpDataDto.url;
            }
            return imageWarmUpDataDto.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final ImageWarmUpDataDto copy(@i(name = "url") @NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new ImageWarmUpDataDto(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ImageWarmUpDataDto) && Intrinsics.d(this.url, ((ImageWarmUpDataDto) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("ImageWarmUpDataDto(url=", this.url, ")");
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB+\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto;", "", "pops", "", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto$PointOfPresenceDto;", "timerFrequency", "", "jitter", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto$JitterDto;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto$JitterDto;)V", "getPops", "()Ljava/util/List;", "getTimerFrequency", "()Ljava/lang/String;", "getJitter", "()Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto$JitterDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PointOfPresenceDto", "JitterDto", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PopsConfigDto {

        @NotNull
        private final JitterDto jitter;

        @NotNull
        private final List<PointOfPresenceDto> pops;

        @NotNull
        private final String timerFrequency;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto$JitterDto;", "", "min", "", "max", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMin", "()Ljava/lang/String;", "getMax", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class JitterDto {

            @NotNull
            private final String max;

            @NotNull
            private final String min;

            public JitterDto(@i(name = "min") @NotNull String min, @i(name = "max") @NotNull String max) {
                Intrinsics.checkNotNullParameter(min, "min");
                Intrinsics.checkNotNullParameter(max, "max");
                this.min = min;
                this.max = max;
            }

            public static /* synthetic */ JitterDto copy$default(JitterDto jitterDto, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = jitterDto.min;
                }
                if ((i11 & 2) != 0) {
                    str2 = jitterDto.max;
                }
                return jitterDto.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getMin() {
                return this.min;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getMax() {
                return this.max;
            }

            @NotNull
            public final JitterDto copy(@i(name = "min") @NotNull String min, @i(name = "max") @NotNull String max) {
                Intrinsics.checkNotNullParameter(min, "min");
                Intrinsics.checkNotNullParameter(max, "max");
                return new JitterDto(min, max);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof JitterDto)) {
                    return false;
                }
                JitterDto jitterDto = (JitterDto) other;
                return Intrinsics.d(this.min, jitterDto.min) && Intrinsics.d(this.max, jitterDto.max);
            }

            @NotNull
            public final String getMax() {
                return this.max;
            }

            @NotNull
            public final String getMin() {
                return this.min;
            }

            public int hashCode() {
                return this.max.hashCode() + (this.min.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("JitterDto(min=", this.min, ", max=", this.max, ")");
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto$PointOfPresenceDto;", "", "id", "", "files", "", "Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto$PointOfPresenceDto$FileDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getFiles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "FileDto", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class PointOfPresenceDto {

            @NotNull
            private final List<FileDto> files;

            @NotNull
            private final String id;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$PopsConfigDto$PointOfPresenceDto$FileDto;", "", "id", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class FileDto {

                @NotNull
                private final String id;

                @NotNull
                private final String url;

                public FileDto(@i(name = "id") @NotNull String id2, @i(name = "url") @NotNull String url) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.id = id2;
                    this.url = url;
                }

                public static /* synthetic */ FileDto copy$default(FileDto fileDto, String str, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = fileDto.id;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = fileDto.url;
                    }
                    return fileDto.copy(str, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                @NotNull
                public final FileDto copy(@i(name = "id") @NotNull String id2, @i(name = "url") @NotNull String url) {
                    Intrinsics.checkNotNullParameter(id2, "id");
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new FileDto(id2, url);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FileDto)) {
                        return false;
                    }
                    FileDto fileDto = (FileDto) other;
                    return Intrinsics.d(this.id, fileDto.id) && Intrinsics.d(this.url, fileDto.url);
                }

                @NotNull
                public final String getId() {
                    return this.id;
                }

                @NotNull
                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.url.hashCode() + (this.id.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return e.a("FileDto(id=", this.id, ", url=", this.url, ")");
                }
            }

            public PointOfPresenceDto(@i(name = "id") @NotNull String id2, @i(name = "files") @NotNull List<FileDto> files) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(files, "files");
                this.id = id2;
                this.files = files;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PointOfPresenceDto copy$default(PointOfPresenceDto pointOfPresenceDto, String str, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = pointOfPresenceDto.id;
                }
                if ((i11 & 2) != 0) {
                    list = pointOfPresenceDto.files;
                }
                return pointOfPresenceDto.copy(str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final List<FileDto> component2() {
                return this.files;
            }

            @NotNull
            public final PointOfPresenceDto copy(@i(name = "id") @NotNull String id2, @i(name = "files") @NotNull List<FileDto> files) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(files, "files");
                return new PointOfPresenceDto(id2, files);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PointOfPresenceDto)) {
                    return false;
                }
                PointOfPresenceDto pointOfPresenceDto = (PointOfPresenceDto) other;
                return Intrinsics.d(this.id, pointOfPresenceDto.id) && Intrinsics.d(this.files, pointOfPresenceDto.files);
            }

            @NotNull
            public final List<FileDto> getFiles() {
                return this.files;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.files.hashCode() + (this.id.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2439a.a("PointOfPresenceDto(id=", this.id, ", files=", ")", this.files);
            }
        }

        public PopsConfigDto(@i(name = "pops") @NotNull List<PointOfPresenceDto> pops, @i(name = "timerFrequency") @NotNull String timerFrequency, @i(name = "jitter") @NotNull JitterDto jitter) {
            Intrinsics.checkNotNullParameter(pops, "pops");
            Intrinsics.checkNotNullParameter(timerFrequency, "timerFrequency");
            Intrinsics.checkNotNullParameter(jitter, "jitter");
            this.pops = pops;
            this.timerFrequency = timerFrequency;
            this.jitter = jitter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PopsConfigDto copy$default(PopsConfigDto popsConfigDto, List list, String str, JitterDto jitterDto, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = popsConfigDto.pops;
            }
            if ((i11 & 2) != 0) {
                str = popsConfigDto.timerFrequency;
            }
            if ((i11 & 4) != 0) {
                jitterDto = popsConfigDto.jitter;
            }
            return popsConfigDto.copy(list, str, jitterDto);
        }

        @NotNull
        public final List<PointOfPresenceDto> component1() {
            return this.pops;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTimerFrequency() {
            return this.timerFrequency;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final JitterDto getJitter() {
            return this.jitter;
        }

        @NotNull
        public final PopsConfigDto copy(@i(name = "pops") @NotNull List<PointOfPresenceDto> pops, @i(name = "timerFrequency") @NotNull String timerFrequency, @i(name = "jitter") @NotNull JitterDto jitter) {
            Intrinsics.checkNotNullParameter(pops, "pops");
            Intrinsics.checkNotNullParameter(timerFrequency, "timerFrequency");
            Intrinsics.checkNotNullParameter(jitter, "jitter");
            return new PopsConfigDto(pops, timerFrequency, jitter);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PopsConfigDto)) {
                return false;
            }
            PopsConfigDto popsConfigDto = (PopsConfigDto) other;
            return Intrinsics.d(this.pops, popsConfigDto.pops) && Intrinsics.d(this.timerFrequency, popsConfigDto.timerFrequency) && Intrinsics.d(this.jitter, popsConfigDto.jitter);
        }

        @NotNull
        public final JitterDto getJitter() {
            return this.jitter;
        }

        @NotNull
        public final List<PointOfPresenceDto> getPops() {
            return this.pops;
        }

        @NotNull
        public final String getTimerFrequency() {
            return this.timerFrequency;
        }

        public int hashCode() {
            return this.jitter.hashCode() + g.a(this.pops.hashCode() * 31, 31, this.timerFrequency);
        }

        @NotNull
        public String toString() {
            List<PointOfPresenceDto> list = this.pops;
            String str = this.timerFrequency;
            JitterDto jitterDto = this.jitter;
            StringBuilder a11 = C4055a.a("PopsConfigDto(pops=", ", timerFrequency=", str, ", jitter=", list);
            a11.append(jitterDto);
            a11.append(")");
            return a11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/cdn/chooser/internal/data/dto/CdnConfigResponse$VideoRuleDto;", "", "hostEquals", "", "hostToUse", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHostEquals", "()Ljava/lang/String;", "getHostToUse", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cdn-chooser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoRuleDto {

        @NotNull
        private final String hostEquals;
        private final String hostToUse;
        private final String type;

        public VideoRuleDto(@i(name = "hostEquals") @NotNull String hostEquals, @i(name = "hostToUse") String str, @i(name = "type") String str2) {
            Intrinsics.checkNotNullParameter(hostEquals, "hostEquals");
            this.hostEquals = hostEquals;
            this.hostToUse = str;
            this.type = str2;
        }

        public static /* synthetic */ VideoRuleDto copy$default(VideoRuleDto videoRuleDto, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = videoRuleDto.hostEquals;
            }
            if ((i11 & 2) != 0) {
                str2 = videoRuleDto.hostToUse;
            }
            if ((i11 & 4) != 0) {
                str3 = videoRuleDto.type;
            }
            return videoRuleDto.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHostEquals() {
            return this.hostEquals;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHostToUse() {
            return this.hostToUse;
        }

        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final VideoRuleDto copy(@i(name = "hostEquals") @NotNull String hostEquals, @i(name = "hostToUse") String hostToUse, @i(name = "type") String type) {
            Intrinsics.checkNotNullParameter(hostEquals, "hostEquals");
            return new VideoRuleDto(hostEquals, hostToUse, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoRuleDto)) {
                return false;
            }
            VideoRuleDto videoRuleDto = (VideoRuleDto) other;
            return Intrinsics.d(this.hostEquals, videoRuleDto.hostEquals) && Intrinsics.d(this.hostToUse, videoRuleDto.hostToUse) && Intrinsics.d(this.type, videoRuleDto.type);
        }

        @NotNull
        public final String getHostEquals() {
            return this.hostEquals;
        }

        public final String getHostToUse() {
            return this.hostToUse;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.hostEquals.hashCode() * 31;
            String str = this.hostToUse;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.type;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.hostEquals;
            String str2 = this.hostToUse;
            return o0.c(C3660k.d("VideoRuleDto(hostEquals=", str, ", hostToUse=", str2, ", type="), this.type, ")");
        }
    }

    public CdnConfigResponse(@i(name = "imageRules") @NotNull List<ImageRuleDto> imageRules, @i(name = "videoRules") @NotNull List<VideoRuleDto> videoRules, @i(name = "imageWarmupList") List<ImageWarmUpDataDto> list, @i(name = "popStatsConfig") PopsConfigDto popsConfigDto) {
        Intrinsics.checkNotNullParameter(imageRules, "imageRules");
        Intrinsics.checkNotNullParameter(videoRules, "videoRules");
        this.imageRules = imageRules;
        this.videoRules = videoRules;
        this.imageWarmupList = list;
        this.popStatsConfig = popsConfigDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CdnConfigResponse copy$default(CdnConfigResponse cdnConfigResponse, List list, List list2, List list3, PopsConfigDto popsConfigDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cdnConfigResponse.imageRules;
        }
        if ((i11 & 2) != 0) {
            list2 = cdnConfigResponse.videoRules;
        }
        if ((i11 & 4) != 0) {
            list3 = cdnConfigResponse.imageWarmupList;
        }
        if ((i11 & 8) != 0) {
            popsConfigDto = cdnConfigResponse.popStatsConfig;
        }
        return cdnConfigResponse.copy(list, list2, list3, popsConfigDto);
    }

    @NotNull
    public final List<ImageRuleDto> component1() {
        return this.imageRules;
    }

    @NotNull
    public final List<VideoRuleDto> component2() {
        return this.videoRules;
    }

    public final List<ImageWarmUpDataDto> component3() {
        return this.imageWarmupList;
    }

    /* renamed from: component4, reason: from getter */
    public final PopsConfigDto getPopStatsConfig() {
        return this.popStatsConfig;
    }

    @NotNull
    public final CdnConfigResponse copy(@i(name = "imageRules") @NotNull List<ImageRuleDto> imageRules, @i(name = "videoRules") @NotNull List<VideoRuleDto> videoRules, @i(name = "imageWarmupList") List<ImageWarmUpDataDto> imageWarmupList, @i(name = "popStatsConfig") PopsConfigDto popStatsConfig) {
        Intrinsics.checkNotNullParameter(imageRules, "imageRules");
        Intrinsics.checkNotNullParameter(videoRules, "videoRules");
        return new CdnConfigResponse(imageRules, videoRules, imageWarmupList, popStatsConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CdnConfigResponse)) {
            return false;
        }
        CdnConfigResponse cdnConfigResponse = (CdnConfigResponse) other;
        return Intrinsics.d(this.imageRules, cdnConfigResponse.imageRules) && Intrinsics.d(this.videoRules, cdnConfigResponse.videoRules) && Intrinsics.d(this.imageWarmupList, cdnConfigResponse.imageWarmupList) && Intrinsics.d(this.popStatsConfig, cdnConfigResponse.popStatsConfig);
    }

    @NotNull
    public final List<ImageRuleDto> getImageRules() {
        return this.imageRules;
    }

    public final List<ImageWarmUpDataDto> getImageWarmupList() {
        return this.imageWarmupList;
    }

    public final PopsConfigDto getPopStatsConfig() {
        return this.popStatsConfig;
    }

    @NotNull
    public final List<VideoRuleDto> getVideoRules() {
        return this.videoRules;
    }

    public int hashCode() {
        int b11 = g.b(this.imageRules.hashCode() * 31, 31, this.videoRules);
        List<ImageWarmUpDataDto> list = this.imageWarmupList;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        PopsConfigDto popsConfigDto = this.popStatsConfig;
        return hashCode + (popsConfigDto != null ? popsConfigDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ImageRuleDto> list = this.imageRules;
        List<VideoRuleDto> list2 = this.videoRules;
        List<ImageWarmUpDataDto> list3 = this.imageWarmupList;
        PopsConfigDto popsConfigDto = this.popStatsConfig;
        StringBuilder d11 = c.d("CdnConfigResponse(imageRules=", list, ", videoRules=", ", imageWarmupList=", list2);
        d11.append(list3);
        d11.append(", popStatsConfig=");
        d11.append(popsConfigDto);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ CdnConfigResponse(List list, List list2, List list3, PopsConfigDto popsConfigDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i11 & 8) != 0 ? null : popsConfigDto);
    }
}
