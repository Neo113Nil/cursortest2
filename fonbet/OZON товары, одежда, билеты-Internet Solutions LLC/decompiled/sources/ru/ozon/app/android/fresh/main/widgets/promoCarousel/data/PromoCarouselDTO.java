package ru.ozon.app.android.fresh.main.widgets.promoCarousel.data;

import Ql.c;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002 !B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JN\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "", "sections", "", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO;", "hasAnimation", "", "isSmallCarousel", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)V", "getSections", "()Ljava/util/List;", "getHasAnimation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "equals", "other", "hashCode", "", "toString", "SectionDTO", "DtoFieldName", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PromoCarouselDTO {
    private final Boolean hasAnimation;
    private final Boolean isSmallCarousel;

    @NotNull
    private final List<SectionDTO> sections;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$DtoFieldName;", "", "jsonName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsonName", "()Ljava/lang/String;", "SECTIONS", "HAS_ANIMATION", "IS_SMALL_CAROUSEL", "TRACKING_INFO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DtoFieldName {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DtoFieldName[] $VALUES;

        @NotNull
        private final String jsonName;
        public static final DtoFieldName SECTIONS = new DtoFieldName("SECTIONS", 0, "sections");
        public static final DtoFieldName HAS_ANIMATION = new DtoFieldName("HAS_ANIMATION", 1, "hasAnimation");
        public static final DtoFieldName IS_SMALL_CAROUSEL = new DtoFieldName("IS_SMALL_CAROUSEL", 2, "isSmallCarousel");
        public static final DtoFieldName TRACKING_INFO = new DtoFieldName("TRACKING_INFO", 3, "trackingInfo");

        private static final /* synthetic */ DtoFieldName[] $values() {
            return new DtoFieldName[]{SECTIONS, HAS_ANIMATION, IS_SMALL_CAROUSEL, TRACKING_INFO};
        }

        static {
            DtoFieldName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DtoFieldName(String str, int i11, String str2) {
            this.jsonName = str2;
        }

        @NotNull
        public static a<DtoFieldName> getEntries() {
            return $ENTRIES;
        }

        public static DtoFieldName valueOf(String str) {
            return (DtoFieldName) Enum.valueOf(DtoFieldName.class, str);
        }

        public static DtoFieldName[] values() {
            return (DtoFieldName[]) $VALUES.clone();
        }

        @NotNull
        public final String getJsonName() {
            return this.jsonName;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO;", "", "", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO$BannerDTO;", "banners", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBanners", "BannerDTO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SectionDTO {

        @NotNull
        private final List<BannerDTO> banners;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO$BannerDTO;", "", "image", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "advBadgeV2", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAdvBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BannerDTO {

            @NotNull
            private final AtomActionDTO action;
            private final BadgeDTO advBadgeV2;

            @NotNull
            private final String image;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public BannerDTO(@NotNull String image, @NotNull AtomActionDTO action, BadgeDTO badgeDTO, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(action, "action");
                this.image = image;
                this.action = action;
                this.advBadgeV2 = badgeDTO;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ BannerDTO copy$default(BannerDTO bannerDTO, String str, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = bannerDTO.image;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = bannerDTO.action;
                }
                if ((i11 & 4) != 0) {
                    badgeDTO = bannerDTO.advBadgeV2;
                }
                if ((i11 & 8) != 0) {
                    map = bannerDTO.trackingInfo;
                }
                return bannerDTO.copy(str, atomActionDTO, badgeDTO, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component3, reason: from getter */
            public final BadgeDTO getAdvBadgeV2() {
                return this.advBadgeV2;
            }

            public final Map<String, TokenizedTrackingInfo> component4() {
                return this.trackingInfo;
            }

            @NotNull
            public final BannerDTO copy(@NotNull String image, @NotNull AtomActionDTO action, BadgeDTO advBadgeV2, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(action, "action");
                return new BannerDTO(image, action, advBadgeV2, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BannerDTO)) {
                    return false;
                }
                BannerDTO bannerDTO = (BannerDTO) other;
                return Intrinsics.d(this.image, bannerDTO.image) && Intrinsics.d(this.action, bannerDTO.action) && Intrinsics.d(this.advBadgeV2, bannerDTO.advBadgeV2) && Intrinsics.d(this.trackingInfo, bannerDTO.trackingInfo);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final BadgeDTO getAdvBadgeV2() {
                return this.advBadgeV2;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int b11 = Ih.a.b(this.action, this.image.hashCode() * 31, 31);
                BadgeDTO badgeDTO = this.advBadgeV2;
                int hashCode = (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.image;
                AtomActionDTO atomActionDTO = this.action;
                BadgeDTO badgeDTO = this.advBadgeV2;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder c11 = c.c("BannerDTO(image=", str, ", action=", atomActionDTO, ", advBadgeV2=");
                c11.append(badgeDTO);
                c11.append(", trackingInfo=");
                c11.append(map);
                c11.append(")");
                return c11.toString();
            }
        }

        public SectionDTO(@NotNull List<BannerDTO> banners) {
            Intrinsics.checkNotNullParameter(banners, "banners");
            this.banners = banners;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SectionDTO copy$default(SectionDTO sectionDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = sectionDTO.banners;
            }
            return sectionDTO.copy(list);
        }

        @NotNull
        public final List<BannerDTO> component1() {
            return this.banners;
        }

        @NotNull
        public final SectionDTO copy(@NotNull List<BannerDTO> banners) {
            Intrinsics.checkNotNullParameter(banners, "banners");
            return new SectionDTO(banners);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SectionDTO) && Intrinsics.d(this.banners, ((SectionDTO) other).banners);
        }

        @NotNull
        public final List<BannerDTO> getBanners() {
            return this.banners;
        }

        public int hashCode() {
            return this.banners.hashCode();
        }

        @NotNull
        public String toString() {
            return H3.c.a("SectionDTO(banners=", ")", this.banners);
        }
    }

    public PromoCarouselDTO(@NotNull List<SectionDTO> sections, Boolean bool, Boolean bool2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
        this.hasAnimation = bool;
        this.isSmallCarousel = bool2;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoCarouselDTO copy$default(PromoCarouselDTO promoCarouselDTO, List list, Boolean bool, Boolean bool2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = promoCarouselDTO.sections;
        }
        if ((i11 & 2) != 0) {
            bool = promoCarouselDTO.hasAnimation;
        }
        if ((i11 & 4) != 0) {
            bool2 = promoCarouselDTO.isSmallCarousel;
        }
        if ((i11 & 8) != 0) {
            map = promoCarouselDTO.trackingInfo;
        }
        return promoCarouselDTO.copy(list, bool, bool2, map);
    }

    @NotNull
    public final List<SectionDTO> component1() {
        return this.sections;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getHasAnimation() {
        return this.hasAnimation;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSmallCarousel() {
        return this.isSmallCarousel;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final PromoCarouselDTO copy(@NotNull List<SectionDTO> sections, Boolean hasAnimation, Boolean isSmallCarousel, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new PromoCarouselDTO(sections, hasAnimation, isSmallCarousel, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCarouselDTO)) {
            return false;
        }
        PromoCarouselDTO promoCarouselDTO = (PromoCarouselDTO) other;
        return Intrinsics.d(this.sections, promoCarouselDTO.sections) && Intrinsics.d(this.hasAnimation, promoCarouselDTO.hasAnimation) && Intrinsics.d(this.isSmallCarousel, promoCarouselDTO.isSmallCarousel) && Intrinsics.d(this.trackingInfo, promoCarouselDTO.trackingInfo);
    }

    public final Boolean getHasAnimation() {
        return this.hasAnimation;
    }

    @NotNull
    public final List<SectionDTO> getSections() {
        return this.sections;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.sections.hashCode() * 31;
        Boolean bool = this.hasAnimation;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSmallCarousel;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isSmallCarousel() {
        return this.isSmallCarousel;
    }

    @NotNull
    public String toString() {
        return "PromoCarouselDTO(sections=" + this.sections + ", hasAnimation=" + this.hasAnimation + ", isSmallCarousel=" + this.isSmallCarousel + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
