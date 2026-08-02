package ru.ozon.app.android.ads.widgets.advVideoBannerV2.data;

import B4.V;
import B90.C2619v;
import Ep.a;
import Fm.C3051a;
import Gl.C3124a;
import Kk.c;
import N3.C3660k;
import Pk0.g;
import T7.P;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006GHIJKLB\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010+J\u0010\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010=\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u009e\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006M"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO;", "", "video", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;", "pixel", "", "Lru/ozon/app/android/ads/common/pixel/data/PixelDTO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$InternalProductDTO;", "externalProduct", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$ExternalProductDTO;", "productType", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;", "badgeV2", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "legalInformation", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "videoCoverDisabled", "", "disableOverlayDisclaimer", "packshotOptions", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$PackshotOptions;", "backgroundColor", "", "designOptions", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;", "<init>", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;Ljava/util/List;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$InternalProductDTO;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$ExternalProductDTO;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$PackshotOptions;Ljava/lang/String;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;)V", "getVideo", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;", "getPixel", "()Ljava/util/List;", "getProduct", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$InternalProductDTO;", "getExternalProduct", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$ExternalProductDTO;", "getProductType", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;", "getBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getLegalInformation", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getVideoCoverDisabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDisableOverlayDisclaimer", "getPackshotOptions", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$PackshotOptions;", "getBackgroundColor", "()Ljava/lang/String;", "getDesignOptions", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;Ljava/util/List;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$InternalProductDTO;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$ExternalProductDTO;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/ProductType;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$PackshotOptions;Ljava/lang/String;Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO;", "equals", "other", "hashCode", "", "toString", "VideoDTO", "TrackingInfos", "InternalProductDTO", "ExternalProductDTO", "PackshotOptions", "DesignOptions", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdvVideoBannerV2DTO {
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badgeV2;
    private final DesignOptions designOptions;
    private final Boolean disableOverlayDisclaimer;
    private final ExternalProductDTO externalProduct;
    private final TextAtom legalInformation;
    private final PackshotOptions packshotOptions;
    private final List<PixelDTO> pixel;
    private final InternalProductDTO product;

    @NotNull
    private final ProductType productType;

    @NotNull
    private final VideoDTO video;
    private final Boolean videoCoverDisabled;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;", "", "marginTop", "", "marginBottom", "marginHorizontal", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMarginTop", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginBottom", "getMarginHorizontal", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$DesignOptions;", "equals", "", "other", "hashCode", "toString", "", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DesignOptions {
        private final Integer marginBottom;
        private final Integer marginHorizontal;
        private final Integer marginTop;

        public DesignOptions() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ DesignOptions copy$default(DesignOptions designOptions, Integer num, Integer num2, Integer num3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = designOptions.marginTop;
            }
            if ((i11 & 2) != 0) {
                num2 = designOptions.marginBottom;
            }
            if ((i11 & 4) != 0) {
                num3 = designOptions.marginHorizontal;
            }
            return designOptions.copy(num, num2, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getMarginTop() {
            return this.marginTop;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getMarginBottom() {
            return this.marginBottom;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getMarginHorizontal() {
            return this.marginHorizontal;
        }

        @NotNull
        public final DesignOptions copy(Integer marginTop, Integer marginBottom, Integer marginHorizontal) {
            return new DesignOptions(marginTop, marginBottom, marginHorizontal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DesignOptions)) {
                return false;
            }
            DesignOptions designOptions = (DesignOptions) other;
            return Intrinsics.d(this.marginTop, designOptions.marginTop) && Intrinsics.d(this.marginBottom, designOptions.marginBottom) && Intrinsics.d(this.marginHorizontal, designOptions.marginHorizontal);
        }

        public final Integer getMarginBottom() {
            return this.marginBottom;
        }

        public final Integer getMarginHorizontal() {
            return this.marginHorizontal;
        }

        public final Integer getMarginTop() {
            return this.marginTop;
        }

        public int hashCode() {
            Integer num = this.marginTop;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.marginBottom;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.marginHorizontal;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.marginTop;
            Integer num2 = this.marginBottom;
            return a.c(c.f("DesignOptions(marginTop=", ", marginBottom=", num, num2, ", marginHorizontal="), this.marginHorizontal, ")");
        }

        public DesignOptions(Integer num, Integer num2, Integer num3) {
            this.marginTop = num;
            this.marginBottom = num2;
            this.marginHorizontal = num3;
        }

        public /* synthetic */ DesignOptions(Integer num, Integer num2, Integer num3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$ExternalProductDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExternalProductDTO {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ExternalProductDTO(@NotNull ImageDTO image, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(action, "action");
            this.image = image;
            this.title = title;
            this.subtitle = subtitle;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ExternalProductDTO copy$default(ExternalProductDTO externalProductDTO, ImageDTO imageDTO, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = externalProductDTO.image;
            }
            if ((i11 & 2) != 0) {
                textAtom = externalProductDTO.title;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = externalProductDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = externalProductDTO.action;
            }
            if ((i11 & 16) != 0) {
                map = externalProductDTO.trackingInfo;
            }
            Map map2 = map;
            TextAtom textAtom3 = textAtom2;
            return externalProductDTO.copy(imageDTO, textAtom, textAtom3, atomActionDTO, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ExternalProductDTO copy(@NotNull ImageDTO image, @NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ExternalProductDTO(image, title, subtitle, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExternalProductDTO)) {
                return false;
            }
            ExternalProductDTO externalProductDTO = (ExternalProductDTO) other;
            return Intrinsics.d(this.image, externalProductDTO.image) && Intrinsics.d(this.title, externalProductDTO.title) && Intrinsics.d(this.subtitle, externalProductDTO.subtitle) && Intrinsics.d(this.action, externalProductDTO.action) && Intrinsics.d(this.trackingInfo, externalProductDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = Ih.a.b(this.action, C2619v.b(C2619v.b(this.image.hashCode() * 31, 31, this.title), 31, this.subtitle), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ExternalProductDTO(image=");
            sb2.append(imageDTO);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", subtitle=");
            sb2.append(textAtom2);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$InternalProductDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InternalProductDTO {

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextAtom name;

        @NotNull
        private final Price price;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public InternalProductDTO(@NotNull ImageDTO image, @NotNull TextAtom name, @NotNull Price price, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            this.image = image;
            this.name = name;
            this.price = price;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InternalProductDTO copy$default(InternalProductDTO internalProductDTO, ImageDTO imageDTO, TextAtom textAtom, Price price, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = internalProductDTO.image;
            }
            if ((i11 & 2) != 0) {
                textAtom = internalProductDTO.name;
            }
            if ((i11 & 4) != 0) {
                price = internalProductDTO.price;
            }
            if ((i11 & 8) != 0) {
                map = internalProductDTO.trackingInfo;
            }
            return internalProductDTO.copy(imageDTO, textAtom, price, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final InternalProductDTO copy(@NotNull ImageDTO image, @NotNull TextAtom name, @NotNull Price price, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            return new InternalProductDTO(image, name, price, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternalProductDTO)) {
                return false;
            }
            InternalProductDTO internalProductDTO = (InternalProductDTO) other;
            return Intrinsics.d(this.image, internalProductDTO.image) && Intrinsics.d(this.name, internalProductDTO.name) && Intrinsics.d(this.price, internalProductDTO.price) && Intrinsics.d(this.trackingInfo, internalProductDTO.trackingInfo);
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3051a.a(this.price, C2619v.b(this.image.hashCode() * 31, 31, this.name), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "InternalProductDTO(image=" + this.image + ", name=" + this.name + ", price=" + this.price + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$PackshotOptions;", "", "lastFrameUrl", "", "isLastFrameBlurred", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getLastFrameUrl", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$PackshotOptions;", "equals", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PackshotOptions {
        private final Boolean isLastFrameBlurred;
        private final String lastFrameUrl;

        public PackshotOptions(String str, Boolean bool) {
            this.lastFrameUrl = str;
            this.isLastFrameBlurred = bool;
        }

        public static /* synthetic */ PackshotOptions copy$default(PackshotOptions packshotOptions, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = packshotOptions.lastFrameUrl;
            }
            if ((i11 & 2) != 0) {
                bool = packshotOptions.isLastFrameBlurred;
            }
            return packshotOptions.copy(str, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLastFrameUrl() {
            return this.lastFrameUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsLastFrameBlurred() {
            return this.isLastFrameBlurred;
        }

        @NotNull
        public final PackshotOptions copy(String lastFrameUrl, Boolean isLastFrameBlurred) {
            return new PackshotOptions(lastFrameUrl, isLastFrameBlurred);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackshotOptions)) {
                return false;
            }
            PackshotOptions packshotOptions = (PackshotOptions) other;
            return Intrinsics.d(this.lastFrameUrl, packshotOptions.lastFrameUrl) && Intrinsics.d(this.isLastFrameBlurred, packshotOptions.isLastFrameBlurred);
        }

        public final String getLastFrameUrl() {
            return this.lastFrameUrl;
        }

        public int hashCode() {
            String str = this.lastFrameUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLastFrameBlurred;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final Boolean isLastFrameBlurred() {
            return this.isLastFrameBlurred;
        }

        @NotNull
        public String toString() {
            return "PackshotOptions(lastFrameUrl=" + this.lastFrameUrl + ", isLastFrameBlurred=" + this.isLastFrameBlurred + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003Jå\u0001\u0010&\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012¨\u0006-"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;", "", "videoView", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "videoStart", "videoClick", "videoSoundOn", "videoSoundOff", "videoQ1", "videoQ2", "videoQ3", "videoEnd", "videoViewableImpressions", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getVideoView", "()Ljava/util/Map;", "getVideoStart", "getVideoClick", "getVideoSoundOn", "getVideoSoundOff", "getVideoQ1", "getVideoQ2", "getVideoQ3", "getVideoEnd", "getVideoViewableImpressions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingInfos {

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoClick;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoEnd;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoQ1;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoQ2;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoQ3;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoSoundOff;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoSoundOn;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoStart;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoView;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> videoViewableImpressions;

        public TrackingInfos(@NotNull Map<String, TokenizedTrackingInfo> videoView, @NotNull Map<String, TokenizedTrackingInfo> videoStart, @NotNull Map<String, TokenizedTrackingInfo> videoClick, @NotNull Map<String, TokenizedTrackingInfo> videoSoundOn, @NotNull Map<String, TokenizedTrackingInfo> videoSoundOff, @NotNull Map<String, TokenizedTrackingInfo> videoQ1, @NotNull Map<String, TokenizedTrackingInfo> videoQ2, @NotNull Map<String, TokenizedTrackingInfo> videoQ3, @NotNull Map<String, TokenizedTrackingInfo> videoEnd, @NotNull Map<String, TokenizedTrackingInfo> videoViewableImpressions) {
            Intrinsics.checkNotNullParameter(videoView, "videoView");
            Intrinsics.checkNotNullParameter(videoStart, "videoStart");
            Intrinsics.checkNotNullParameter(videoClick, "videoClick");
            Intrinsics.checkNotNullParameter(videoSoundOn, "videoSoundOn");
            Intrinsics.checkNotNullParameter(videoSoundOff, "videoSoundOff");
            Intrinsics.checkNotNullParameter(videoQ1, "videoQ1");
            Intrinsics.checkNotNullParameter(videoQ2, "videoQ2");
            Intrinsics.checkNotNullParameter(videoQ3, "videoQ3");
            Intrinsics.checkNotNullParameter(videoEnd, "videoEnd");
            Intrinsics.checkNotNullParameter(videoViewableImpressions, "videoViewableImpressions");
            this.videoView = videoView;
            this.videoStart = videoStart;
            this.videoClick = videoClick;
            this.videoSoundOn = videoSoundOn;
            this.videoSoundOff = videoSoundOff;
            this.videoQ1 = videoQ1;
            this.videoQ2 = videoQ2;
            this.videoQ3 = videoQ3;
            this.videoEnd = videoEnd;
            this.videoViewableImpressions = videoViewableImpressions;
        }

        public static /* synthetic */ TrackingInfos copy$default(TrackingInfos trackingInfos, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, Map map7, Map map8, Map map9, Map map10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = trackingInfos.videoView;
            }
            if ((i11 & 2) != 0) {
                map2 = trackingInfos.videoStart;
            }
            if ((i11 & 4) != 0) {
                map3 = trackingInfos.videoClick;
            }
            if ((i11 & 8) != 0) {
                map4 = trackingInfos.videoSoundOn;
            }
            if ((i11 & 16) != 0) {
                map5 = trackingInfos.videoSoundOff;
            }
            if ((i11 & 32) != 0) {
                map6 = trackingInfos.videoQ1;
            }
            if ((i11 & 64) != 0) {
                map7 = trackingInfos.videoQ2;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map8 = trackingInfos.videoQ3;
            }
            if ((i11 & 256) != 0) {
                map9 = trackingInfos.videoEnd;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map10 = trackingInfos.videoViewableImpressions;
            }
            Map map11 = map9;
            Map map12 = map10;
            Map map13 = map7;
            Map map14 = map8;
            Map map15 = map5;
            Map map16 = map6;
            return trackingInfos.copy(map, map2, map3, map4, map15, map16, map13, map14, map11, map12);
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.videoView;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.videoViewableImpressions;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.videoStart;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.videoClick;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.videoSoundOn;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.videoSoundOff;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.videoQ1;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.videoQ2;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.videoQ3;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.videoEnd;
        }

        @NotNull
        public final TrackingInfos copy(@NotNull Map<String, TokenizedTrackingInfo> videoView, @NotNull Map<String, TokenizedTrackingInfo> videoStart, @NotNull Map<String, TokenizedTrackingInfo> videoClick, @NotNull Map<String, TokenizedTrackingInfo> videoSoundOn, @NotNull Map<String, TokenizedTrackingInfo> videoSoundOff, @NotNull Map<String, TokenizedTrackingInfo> videoQ1, @NotNull Map<String, TokenizedTrackingInfo> videoQ2, @NotNull Map<String, TokenizedTrackingInfo> videoQ3, @NotNull Map<String, TokenizedTrackingInfo> videoEnd, @NotNull Map<String, TokenizedTrackingInfo> videoViewableImpressions) {
            Intrinsics.checkNotNullParameter(videoView, "videoView");
            Intrinsics.checkNotNullParameter(videoStart, "videoStart");
            Intrinsics.checkNotNullParameter(videoClick, "videoClick");
            Intrinsics.checkNotNullParameter(videoSoundOn, "videoSoundOn");
            Intrinsics.checkNotNullParameter(videoSoundOff, "videoSoundOff");
            Intrinsics.checkNotNullParameter(videoQ1, "videoQ1");
            Intrinsics.checkNotNullParameter(videoQ2, "videoQ2");
            Intrinsics.checkNotNullParameter(videoQ3, "videoQ3");
            Intrinsics.checkNotNullParameter(videoEnd, "videoEnd");
            Intrinsics.checkNotNullParameter(videoViewableImpressions, "videoViewableImpressions");
            return new TrackingInfos(videoView, videoStart, videoClick, videoSoundOn, videoSoundOff, videoQ1, videoQ2, videoQ3, videoEnd, videoViewableImpressions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingInfos)) {
                return false;
            }
            TrackingInfos trackingInfos = (TrackingInfos) other;
            return Intrinsics.d(this.videoView, trackingInfos.videoView) && Intrinsics.d(this.videoStart, trackingInfos.videoStart) && Intrinsics.d(this.videoClick, trackingInfos.videoClick) && Intrinsics.d(this.videoSoundOn, trackingInfos.videoSoundOn) && Intrinsics.d(this.videoSoundOff, trackingInfos.videoSoundOff) && Intrinsics.d(this.videoQ1, trackingInfos.videoQ1) && Intrinsics.d(this.videoQ2, trackingInfos.videoQ2) && Intrinsics.d(this.videoQ3, trackingInfos.videoQ3) && Intrinsics.d(this.videoEnd, trackingInfos.videoEnd) && Intrinsics.d(this.videoViewableImpressions, trackingInfos.videoViewableImpressions);
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoClick() {
            return this.videoClick;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoEnd() {
            return this.videoEnd;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoQ1() {
            return this.videoQ1;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoQ2() {
            return this.videoQ2;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoQ3() {
            return this.videoQ3;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoSoundOff() {
            return this.videoSoundOff;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoSoundOn() {
            return this.videoSoundOn;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoStart() {
            return this.videoStart;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoView() {
            return this.videoView;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getVideoViewableImpressions() {
            return this.videoViewableImpressions;
        }

        public int hashCode() {
            return this.videoViewableImpressions.hashCode() + D40.c.a(this.videoEnd, D40.c.a(this.videoQ3, D40.c.a(this.videoQ2, D40.c.a(this.videoQ1, D40.c.a(this.videoSoundOff, D40.c.a(this.videoSoundOn, D40.c.a(this.videoClick, D40.c.a(this.videoStart, this.videoView.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Map<String, TokenizedTrackingInfo> map = this.videoView;
            Map<String, TokenizedTrackingInfo> map2 = this.videoStart;
            Map<String, TokenizedTrackingInfo> map3 = this.videoClick;
            Map<String, TokenizedTrackingInfo> map4 = this.videoSoundOn;
            Map<String, TokenizedTrackingInfo> map5 = this.videoSoundOff;
            Map<String, TokenizedTrackingInfo> map6 = this.videoQ1;
            Map<String, TokenizedTrackingInfo> map7 = this.videoQ2;
            Map<String, TokenizedTrackingInfo> map8 = this.videoQ3;
            Map<String, TokenizedTrackingInfo> map9 = this.videoEnd;
            Map<String, TokenizedTrackingInfo> map10 = this.videoViewableImpressions;
            StringBuilder sb2 = new StringBuilder("TrackingInfos(videoView=");
            sb2.append(map);
            sb2.append(", videoStart=");
            sb2.append(map2);
            sb2.append(", videoClick=");
            b.g(sb2, map3, ", videoSoundOn=", map4, ", videoSoundOff=");
            b.g(sb2, map5, ", videoQ1=", map6, ", videoQ2=");
            b.g(sb2, map7, ", videoQ3=", map8, ", videoEnd=");
            return V.c(sb2, map9, ", videoViewableImpressions=", map10, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$VideoDTO;", "", "playlistUrl", "", "previewUrl", "deeplink", "initialVolume", "", "trackingInfos", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;)V", "getPlaylistUrl", "()Ljava/lang/String;", "getPreviewUrl", "getDeeplink", "getInitialVolume", "()D", "getTrackingInfos", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2DTO$TrackingInfos;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoDTO {

        @NotNull
        private final String deeplink;
        private final double initialVolume;

        @NotNull
        private final String playlistUrl;

        @NotNull
        private final String previewUrl;

        @NotNull
        private final TrackingInfos trackingInfos;

        public VideoDTO(@NotNull String playlistUrl, @NotNull String previewUrl, @NotNull String deeplink, double d11, @NotNull TrackingInfos trackingInfos) {
            Intrinsics.checkNotNullParameter(playlistUrl, "playlistUrl");
            Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(trackingInfos, "trackingInfos");
            this.playlistUrl = playlistUrl;
            this.previewUrl = previewUrl;
            this.deeplink = deeplink;
            this.initialVolume = d11;
            this.trackingInfos = trackingInfos;
        }

        public static /* synthetic */ VideoDTO copy$default(VideoDTO videoDTO, String str, String str2, String str3, double d11, TrackingInfos trackingInfos, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = videoDTO.playlistUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = videoDTO.previewUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = videoDTO.deeplink;
            }
            if ((i11 & 8) != 0) {
                d11 = videoDTO.initialVolume;
            }
            if ((i11 & 16) != 0) {
                trackingInfos = videoDTO.trackingInfos;
            }
            TrackingInfos trackingInfos2 = trackingInfos;
            String str4 = str3;
            return videoDTO.copy(str, str2, str4, d11, trackingInfos2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaylistUrl() {
            return this.playlistUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component4, reason: from getter */
        public final double getInitialVolume() {
            return this.initialVolume;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TrackingInfos getTrackingInfos() {
            return this.trackingInfos;
        }

        @NotNull
        public final VideoDTO copy(@NotNull String playlistUrl, @NotNull String previewUrl, @NotNull String deeplink, double initialVolume, @NotNull TrackingInfos trackingInfos) {
            Intrinsics.checkNotNullParameter(playlistUrl, "playlistUrl");
            Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(trackingInfos, "trackingInfos");
            return new VideoDTO(playlistUrl, previewUrl, deeplink, initialVolume, trackingInfos);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoDTO)) {
                return false;
            }
            VideoDTO videoDTO = (VideoDTO) other;
            return Intrinsics.d(this.playlistUrl, videoDTO.playlistUrl) && Intrinsics.d(this.previewUrl, videoDTO.previewUrl) && Intrinsics.d(this.deeplink, videoDTO.deeplink) && Double.compare(this.initialVolume, videoDTO.initialVolume) == 0 && Intrinsics.d(this.trackingInfos, videoDTO.trackingInfos);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final double getInitialVolume() {
            return this.initialVolume;
        }

        @NotNull
        public final String getPlaylistUrl() {
            return this.playlistUrl;
        }

        @NotNull
        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        @NotNull
        public final TrackingInfos getTrackingInfos() {
            return this.trackingInfos;
        }

        public int hashCode() {
            return this.trackingInfos.hashCode() + g.a(G.g.a(G.g.a(this.playlistUrl.hashCode() * 31, 31, this.previewUrl), 31, this.deeplink), 31, this.initialVolume);
        }

        @NotNull
        public String toString() {
            String str = this.playlistUrl;
            String str2 = this.previewUrl;
            String str3 = this.deeplink;
            double d11 = this.initialVolume;
            TrackingInfos trackingInfos = this.trackingInfos;
            StringBuilder d12 = C3660k.d("VideoDTO(playlistUrl=", str, ", previewUrl=", str2, ", deeplink=");
            d12.append(str3);
            d12.append(", initialVolume=");
            d12.append(d11);
            d12.append(", trackingInfos=");
            d12.append(trackingInfos);
            d12.append(")");
            return d12.toString();
        }
    }

    public AdvVideoBannerV2DTO(@NotNull VideoDTO video, List<PixelDTO> list, InternalProductDTO internalProductDTO, ExternalProductDTO externalProductDTO, @NotNull ProductType productType, @NotNull BadgeDTO badgeV2, TextAtom textAtom, Boolean bool, Boolean bool2, PackshotOptions packshotOptions, String str, DesignOptions designOptions) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(badgeV2, "badgeV2");
        this.video = video;
        this.pixel = list;
        this.product = internalProductDTO;
        this.externalProduct = externalProductDTO;
        this.productType = productType;
        this.badgeV2 = badgeV2;
        this.legalInformation = textAtom;
        this.videoCoverDisabled = bool;
        this.disableOverlayDisclaimer = bool2;
        this.packshotOptions = packshotOptions;
        this.backgroundColor = str;
        this.designOptions = designOptions;
    }

    public static /* synthetic */ AdvVideoBannerV2DTO copy$default(AdvVideoBannerV2DTO advVideoBannerV2DTO, VideoDTO videoDTO, List list, InternalProductDTO internalProductDTO, ExternalProductDTO externalProductDTO, ProductType productType, BadgeDTO badgeDTO, TextAtom textAtom, Boolean bool, Boolean bool2, PackshotOptions packshotOptions, String str, DesignOptions designOptions, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            videoDTO = advVideoBannerV2DTO.video;
        }
        if ((i11 & 2) != 0) {
            list = advVideoBannerV2DTO.pixel;
        }
        if ((i11 & 4) != 0) {
            internalProductDTO = advVideoBannerV2DTO.product;
        }
        if ((i11 & 8) != 0) {
            externalProductDTO = advVideoBannerV2DTO.externalProduct;
        }
        if ((i11 & 16) != 0) {
            productType = advVideoBannerV2DTO.productType;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = advVideoBannerV2DTO.badgeV2;
        }
        if ((i11 & 64) != 0) {
            textAtom = advVideoBannerV2DTO.legalInformation;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = advVideoBannerV2DTO.videoCoverDisabled;
        }
        if ((i11 & 256) != 0) {
            bool2 = advVideoBannerV2DTO.disableOverlayDisclaimer;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            packshotOptions = advVideoBannerV2DTO.packshotOptions;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str = advVideoBannerV2DTO.backgroundColor;
        }
        if ((i11 & 2048) != 0) {
            designOptions = advVideoBannerV2DTO.designOptions;
        }
        String str2 = str;
        DesignOptions designOptions2 = designOptions;
        Boolean bool3 = bool2;
        PackshotOptions packshotOptions2 = packshotOptions;
        TextAtom textAtom2 = textAtom;
        Boolean bool4 = bool;
        ProductType productType2 = productType;
        BadgeDTO badgeDTO2 = badgeDTO;
        return advVideoBannerV2DTO.copy(videoDTO, list, internalProductDTO, externalProductDTO, productType2, badgeDTO2, textAtom2, bool4, bool3, packshotOptions2, str2, designOptions2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VideoDTO getVideo() {
        return this.video;
    }

    /* renamed from: component10, reason: from getter */
    public final PackshotOptions getPackshotOptions() {
        return this.packshotOptions;
    }

    /* renamed from: component11, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component12, reason: from getter */
    public final DesignOptions getDesignOptions() {
        return this.designOptions;
    }

    public final List<PixelDTO> component2() {
        return this.pixel;
    }

    /* renamed from: component3, reason: from getter */
    public final InternalProductDTO getProduct() {
        return this.product;
    }

    /* renamed from: component4, reason: from getter */
    public final ExternalProductDTO getExternalProduct() {
        return this.externalProduct;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ProductType getProductType() {
        return this.productType;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getBadgeV2() {
        return this.badgeV2;
    }

    /* renamed from: component7, reason: from getter */
    public final TextAtom getLegalInformation() {
        return this.legalInformation;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getVideoCoverDisabled() {
        return this.videoCoverDisabled;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getDisableOverlayDisclaimer() {
        return this.disableOverlayDisclaimer;
    }

    @NotNull
    public final AdvVideoBannerV2DTO copy(@NotNull VideoDTO video, List<PixelDTO> pixel, InternalProductDTO product, ExternalProductDTO externalProduct, @NotNull ProductType productType, @NotNull BadgeDTO badgeV2, TextAtom legalInformation, Boolean videoCoverDisabled, Boolean disableOverlayDisclaimer, PackshotOptions packshotOptions, String backgroundColor, DesignOptions designOptions) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(badgeV2, "badgeV2");
        return new AdvVideoBannerV2DTO(video, pixel, product, externalProduct, productType, badgeV2, legalInformation, videoCoverDisabled, disableOverlayDisclaimer, packshotOptions, backgroundColor, designOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvVideoBannerV2DTO)) {
            return false;
        }
        AdvVideoBannerV2DTO advVideoBannerV2DTO = (AdvVideoBannerV2DTO) other;
        return Intrinsics.d(this.video, advVideoBannerV2DTO.video) && Intrinsics.d(this.pixel, advVideoBannerV2DTO.pixel) && Intrinsics.d(this.product, advVideoBannerV2DTO.product) && Intrinsics.d(this.externalProduct, advVideoBannerV2DTO.externalProduct) && this.productType == advVideoBannerV2DTO.productType && Intrinsics.d(this.badgeV2, advVideoBannerV2DTO.badgeV2) && Intrinsics.d(this.legalInformation, advVideoBannerV2DTO.legalInformation) && Intrinsics.d(this.videoCoverDisabled, advVideoBannerV2DTO.videoCoverDisabled) && Intrinsics.d(this.disableOverlayDisclaimer, advVideoBannerV2DTO.disableOverlayDisclaimer) && Intrinsics.d(this.packshotOptions, advVideoBannerV2DTO.packshotOptions) && Intrinsics.d(this.backgroundColor, advVideoBannerV2DTO.backgroundColor) && Intrinsics.d(this.designOptions, advVideoBannerV2DTO.designOptions);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadgeV2() {
        return this.badgeV2;
    }

    public final DesignOptions getDesignOptions() {
        return this.designOptions;
    }

    public final Boolean getDisableOverlayDisclaimer() {
        return this.disableOverlayDisclaimer;
    }

    public final ExternalProductDTO getExternalProduct() {
        return this.externalProduct;
    }

    public final TextAtom getLegalInformation() {
        return this.legalInformation;
    }

    public final PackshotOptions getPackshotOptions() {
        return this.packshotOptions;
    }

    public final List<PixelDTO> getPixel() {
        return this.pixel;
    }

    public final InternalProductDTO getProduct() {
        return this.product;
    }

    @NotNull
    public final ProductType getProductType() {
        return this.productType;
    }

    @NotNull
    public final VideoDTO getVideo() {
        return this.video;
    }

    public final Boolean getVideoCoverDisabled() {
        return this.videoCoverDisabled;
    }

    public int hashCode() {
        int hashCode = this.video.hashCode() * 31;
        List<PixelDTO> list = this.pixel;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        InternalProductDTO internalProductDTO = this.product;
        int hashCode3 = (hashCode2 + (internalProductDTO == null ? 0 : internalProductDTO.hashCode())) * 31;
        ExternalProductDTO externalProductDTO = this.externalProduct;
        int c11 = C3124a.c(this.badgeV2, (this.productType.hashCode() + ((hashCode3 + (externalProductDTO == null ? 0 : externalProductDTO.hashCode())) * 31)) * 31, 31);
        TextAtom textAtom = this.legalInformation;
        int hashCode4 = (c11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        Boolean bool = this.videoCoverDisabled;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.disableOverlayDisclaimer;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PackshotOptions packshotOptions = this.packshotOptions;
        int hashCode7 = (hashCode6 + (packshotOptions == null ? 0 : packshotOptions.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        DesignOptions designOptions = this.designOptions;
        return hashCode8 + (designOptions != null ? designOptions.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdvVideoBannerV2DTO(video=" + this.video + ", pixel=" + this.pixel + ", product=" + this.product + ", externalProduct=" + this.externalProduct + ", productType=" + this.productType + ", badgeV2=" + this.badgeV2 + ", legalInformation=" + this.legalInformation + ", videoCoverDisabled=" + this.videoCoverDisabled + ", disableOverlayDisclaimer=" + this.disableOverlayDisclaimer + ", packshotOptions=" + this.packshotOptions + ", backgroundColor=" + this.backgroundColor + ", designOptions=" + this.designOptions + ")";
    }
}
