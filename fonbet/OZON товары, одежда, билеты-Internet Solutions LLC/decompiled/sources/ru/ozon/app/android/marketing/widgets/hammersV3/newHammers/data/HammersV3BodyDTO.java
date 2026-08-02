package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

import Kk.C3532b;
import Sh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.data.HammersV3HammerPriceDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.data.HammersV3PlaceholderDTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u008d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010<\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0001HÆ\u0003J¨\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\n2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\u0012\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006G"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3BodyDTO;", "", "skuId", "", "mainImage", "", "mainImageAlpha", "", "imageOverlayPicture", "imageIsFaded", "", "dsBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "hammerPrice", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;", "hasHeader", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.PRODUCT_INFO_FIELD_NAME, "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Boolean;Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;ZLjava/lang/Object;)V", "getSkuId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMainImage", "()Ljava/lang/String;", "getMainImageAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getImageOverlayPicture", "getImageIsFaded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDsBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getHammerPrice", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;", "getHasHeader", "()Z", "setHasHeader", "(Z)V", "getProductInfo", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Boolean;Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammerPriceV3DTO;ZLjava/lang/Object;)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3BodyDTO;", "equals", "other", "hashCode", "", "toString", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HammersV3BodyDTO {

    @Deprecated
    @NotNull
    public static final String HAMMER_PRICE = "hammerPriceV2";

    @Deprecated
    @NotNull
    public static final String PLACEHOLDER = "placeholder";
    private final AtomActionDTO action;
    private final BadgeDTO dsBadge;
    private final HammerPriceV3DTO hammerPrice;
    private boolean hasHeader;
    private final Boolean imageIsFaded;
    private final String imageOverlayPicture;
    private final Boolean isAdult;
    private final String mainImage;
    private final Float mainImageAlpha;
    private final Object productInfo;
    private final Long skuId;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3BodyDTO$Companion;", "", "<init>", "()V", "PLACEHOLDER", "", "HAMMER_PRICE", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HammersV3BodyDTO(Long l11, String str, Float f7, String str2, Boolean bool, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Boolean bool2, HammerPriceV3DTO hammerPriceV3DTO, boolean z11, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "placeholder", type = HammersV3PlaceholderDTO.class), @ProtoOneOfSignature(name = "hammerPriceV2", type = HammersV3HammerPriceDTO.class)}) @ProtoOneOf(label = "type") Object obj) {
        this.skuId = l11;
        this.mainImage = str;
        this.mainImageAlpha = f7;
        this.imageOverlayPicture = str2;
        this.imageIsFaded = bool;
        this.dsBadge = badgeDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.isAdult = bool2;
        this.hammerPrice = hammerPriceV3DTO;
        this.hasHeader = z11;
        this.productInfo = obj;
    }

    public static /* synthetic */ HammersV3BodyDTO copy$default(HammersV3BodyDTO hammersV3BodyDTO, Long l11, String str, Float f7, String str2, Boolean bool, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, Boolean bool2, HammerPriceV3DTO hammerPriceV3DTO, boolean z11, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            l11 = hammersV3BodyDTO.skuId;
        }
        if ((i11 & 2) != 0) {
            str = hammersV3BodyDTO.mainImage;
        }
        if ((i11 & 4) != 0) {
            f7 = hammersV3BodyDTO.mainImageAlpha;
        }
        if ((i11 & 8) != 0) {
            str2 = hammersV3BodyDTO.imageOverlayPicture;
        }
        if ((i11 & 16) != 0) {
            bool = hammersV3BodyDTO.imageIsFaded;
        }
        if ((i11 & 32) != 0) {
            badgeDTO = hammersV3BodyDTO.dsBadge;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = hammersV3BodyDTO.action;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = hammersV3BodyDTO.trackingInfo;
        }
        if ((i11 & 256) != 0) {
            bool2 = hammersV3BodyDTO.isAdult;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            hammerPriceV3DTO = hammersV3BodyDTO.hammerPrice;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            z11 = hammersV3BodyDTO.hasHeader;
        }
        if ((i11 & 2048) != 0) {
            obj = hammersV3BodyDTO.productInfo;
        }
        boolean z12 = z11;
        Object obj3 = obj;
        Boolean bool3 = bool2;
        HammerPriceV3DTO hammerPriceV3DTO2 = hammerPriceV3DTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        Boolean bool4 = bool;
        BadgeDTO badgeDTO2 = badgeDTO;
        return hammersV3BodyDTO.copy(l11, str, f7, str2, bool4, badgeDTO2, atomActionDTO2, map2, bool3, hammerPriceV3DTO2, z12, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getSkuId() {
        return this.skuId;
    }

    /* renamed from: component10, reason: from getter */
    public final HammerPriceV3DTO getHammerPrice() {
        return this.hammerPrice;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHasHeader() {
        return this.hasHeader;
    }

    /* renamed from: component12, reason: from getter */
    public final Object getProductInfo() {
        return this.productInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMainImage() {
        return this.mainImage;
    }

    /* renamed from: component3, reason: from getter */
    public final Float getMainImageAlpha() {
        return this.mainImageAlpha;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageOverlayPicture() {
        return this.imageOverlayPicture;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getImageIsFaded() {
        return this.imageIsFaded;
    }

    /* renamed from: component6, reason: from getter */
    public final BadgeDTO getDsBadge() {
        return this.dsBadge;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsAdult() {
        return this.isAdult;
    }

    @NotNull
    public final HammersV3BodyDTO copy(Long skuId, String mainImage, Float mainImageAlpha, String imageOverlayPicture, Boolean imageIsFaded, BadgeDTO dsBadge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean isAdult, HammerPriceV3DTO hammerPrice, boolean hasHeader, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "placeholder", type = HammersV3PlaceholderDTO.class), @ProtoOneOfSignature(name = "hammerPriceV2", type = HammersV3HammerPriceDTO.class)}) @ProtoOneOf(label = "type") Object productInfo) {
        return new HammersV3BodyDTO(skuId, mainImage, mainImageAlpha, imageOverlayPicture, imageIsFaded, dsBadge, action, trackingInfo, isAdult, hammerPrice, hasHeader, productInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HammersV3BodyDTO)) {
            return false;
        }
        HammersV3BodyDTO hammersV3BodyDTO = (HammersV3BodyDTO) other;
        return Intrinsics.d(this.skuId, hammersV3BodyDTO.skuId) && Intrinsics.d(this.mainImage, hammersV3BodyDTO.mainImage) && Intrinsics.d(this.mainImageAlpha, hammersV3BodyDTO.mainImageAlpha) && Intrinsics.d(this.imageOverlayPicture, hammersV3BodyDTO.imageOverlayPicture) && Intrinsics.d(this.imageIsFaded, hammersV3BodyDTO.imageIsFaded) && Intrinsics.d(this.dsBadge, hammersV3BodyDTO.dsBadge) && Intrinsics.d(this.action, hammersV3BodyDTO.action) && Intrinsics.d(this.trackingInfo, hammersV3BodyDTO.trackingInfo) && Intrinsics.d(this.isAdult, hammersV3BodyDTO.isAdult) && Intrinsics.d(this.hammerPrice, hammersV3BodyDTO.hammerPrice) && this.hasHeader == hammersV3BodyDTO.hasHeader && Intrinsics.d(this.productInfo, hammersV3BodyDTO.productInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BadgeDTO getDsBadge() {
        return this.dsBadge;
    }

    public final HammerPriceV3DTO getHammerPrice() {
        return this.hammerPrice;
    }

    public final boolean getHasHeader() {
        return this.hasHeader;
    }

    public final Boolean getImageIsFaded() {
        return this.imageIsFaded;
    }

    public final String getImageOverlayPicture() {
        return this.imageOverlayPicture;
    }

    public final String getMainImage() {
        return this.mainImage;
    }

    public final Float getMainImageAlpha() {
        return this.mainImageAlpha;
    }

    public final Object getProductInfo() {
        return this.productInfo;
    }

    public final Long getSkuId() {
        return this.skuId;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Long l11 = this.skuId;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.mainImage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f7 = this.mainImageAlpha;
        int hashCode3 = (hashCode2 + (f7 == null ? 0 : f7.hashCode())) * 31;
        String str2 = this.imageOverlayPicture;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.imageIsFaded;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        BadgeDTO badgeDTO = this.dsBadge;
        int hashCode6 = (hashCode5 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool2 = this.isAdult;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        HammerPriceV3DTO hammerPriceV3DTO = this.hammerPrice;
        int a11 = C3532b.a((hashCode9 + (hammerPriceV3DTO == null ? 0 : hammerPriceV3DTO.hashCode())) * 31, 31, this.hasHeader);
        Object obj = this.productInfo;
        return a11 + (obj != null ? obj.hashCode() : 0);
    }

    public final Boolean isAdult() {
        return this.isAdult;
    }

    public final void setHasHeader(boolean z11) {
        this.hasHeader = z11;
    }

    @NotNull
    public String toString() {
        Long l11 = this.skuId;
        String str = this.mainImage;
        Float f7 = this.mainImageAlpha;
        String str2 = this.imageOverlayPicture;
        Boolean bool = this.imageIsFaded;
        BadgeDTO badgeDTO = this.dsBadge;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Boolean bool2 = this.isAdult;
        HammerPriceV3DTO hammerPriceV3DTO = this.hammerPrice;
        boolean z11 = this.hasHeader;
        Object obj = this.productInfo;
        StringBuilder sb2 = new StringBuilder("HammersV3BodyDTO(skuId=");
        sb2.append(l11);
        sb2.append(", mainImage=");
        sb2.append(str);
        sb2.append(", mainImageAlpha=");
        sb2.append(f7);
        sb2.append(", imageOverlayPicture=");
        sb2.append(str2);
        sb2.append(", imageIsFaded=");
        sb2.append(bool);
        sb2.append(", dsBadge=");
        sb2.append(badgeDTO);
        sb2.append(", action=");
        b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", isAdult=");
        sb2.append(bool2);
        sb2.append(", hammerPrice=");
        sb2.append(hammerPriceV3DTO);
        sb2.append(", hasHeader=");
        sb2.append(z11);
        sb2.append(", productInfo=");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ HammersV3BodyDTO(Long l11, String str, Float f7, String str2, Boolean bool, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, Boolean bool2, HammerPriceV3DTO hammerPriceV3DTO, boolean z11, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(l11, str, f7, str2, bool, badgeDTO, atomActionDTO, map, bool2, hammerPriceV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z11, obj);
    }
}
