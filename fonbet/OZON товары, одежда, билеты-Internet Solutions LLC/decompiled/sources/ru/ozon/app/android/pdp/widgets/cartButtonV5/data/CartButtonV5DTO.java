package ru.ozon.app.android.pdp.widgets.cartButtonV5.data;

import B0.C2454a;
import D3.g;
import D40.d;
import Kk.C3532b;
import Nh.a;
import T7.P;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.domain.CartTypeKt;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 62\u00020\u0001:\u0003678Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u0080\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0013\u0010$¨\u00069"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO;", "", "isStickyTransparent", "", "stickyCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "firstButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;", "secondButton", "asyncAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notificationBar", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;", "relatedProductsCurtain", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$RelatedProductsCurtain;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isInModal", "<init>", "(ZLru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$RelatedProductsCurtain;Ljava/util/Map;Ljava/lang/Boolean;)V", "()Z", "getStickyCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getFirstButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;", "getSecondButton", "getAsyncAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotificationBar", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;", "getRelatedProductsCurtain", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$RelatedProductsCurtain;", "getTrackingInfo", "()Ljava/util/Map;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$NotificationBar;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$RelatedProductsCurtain;Ljava/util/Map;Ljava/lang/Boolean;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO;", "equals", "other", "hashCode", "", "toString", "Companion", "CartButton", "RelatedProductsCurtain", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CartButtonV5DTO {

    @NotNull
    private static final String FOR_STARS = "forStars";

    @NotNull
    public static final String SUBSCRIBE_TO_STOCK = "subscribeToStock";

    @NotNull
    public static final String UNSUBSCRIBE_FROM_STOCK = "unsubscribeFromStock";
    private final AtomActionDTO asyncAction;

    @NotNull
    private final CartButton firstButton;
    private final Boolean isInModal;
    private final boolean isStickyTransparent;
    private final CartButtonV4Dto.NotificationBar notificationBar;
    private final RelatedProductsCurtain relatedProductsCurtain;
    private final CartButton secondButton;

    @NotNull
    private final CornerRadius stickyCornerRadius;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$RelatedProductsCurtain;", "", "link", "", "trackingInfo", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;)V", "getLink", "()Ljava/lang/String;", "getTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartButtonV4Dto$CurtainTrackingInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RelatedProductsCurtain {
        public static final int $stable = 8;

        @NotNull
        private final String link;
        private final CartButtonV4Dto.CurtainTrackingInfo trackingInfo;

        public RelatedProductsCurtain(@NotNull String link, CartButtonV4Dto.CurtainTrackingInfo curtainTrackingInfo) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.trackingInfo = curtainTrackingInfo;
        }

        public static /* synthetic */ RelatedProductsCurtain copy$default(RelatedProductsCurtain relatedProductsCurtain, String str, CartButtonV4Dto.CurtainTrackingInfo curtainTrackingInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = relatedProductsCurtain.link;
            }
            if ((i11 & 2) != 0) {
                curtainTrackingInfo = relatedProductsCurtain.trackingInfo;
            }
            return relatedProductsCurtain.copy(str, curtainTrackingInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final CartButtonV4Dto.CurtainTrackingInfo getTrackingInfo() {
            return this.trackingInfo;
        }

        @NotNull
        public final RelatedProductsCurtain copy(@NotNull String link, CartButtonV4Dto.CurtainTrackingInfo trackingInfo) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new RelatedProductsCurtain(link, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelatedProductsCurtain)) {
                return false;
            }
            RelatedProductsCurtain relatedProductsCurtain = (RelatedProductsCurtain) other;
            return Intrinsics.d(this.link, relatedProductsCurtain.link) && Intrinsics.d(this.trackingInfo, relatedProductsCurtain.trackingInfo);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final CartButtonV4Dto.CurtainTrackingInfo getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.link.hashCode() * 31;
            CartButtonV4Dto.CurtainTrackingInfo curtainTrackingInfo = this.trackingInfo;
            return hashCode + (curtainTrackingInfo == null ? 0 : curtainTrackingInfo.hashCode());
        }

        @NotNull
        public String toString() {
            return "RelatedProductsCurtain(link=" + this.link + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public CartButtonV5DTO(boolean z11, @NotNull CornerRadius stickyCornerRadius, @NotNull CartButton firstButton, CartButton cartButton, AtomActionDTO atomActionDTO, CartButtonV4Dto.NotificationBar notificationBar, RelatedProductsCurtain relatedProductsCurtain, Map<String, TokenizedTrackingInfo> map, Boolean bool) {
        Intrinsics.checkNotNullParameter(stickyCornerRadius, "stickyCornerRadius");
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        this.isStickyTransparent = z11;
        this.stickyCornerRadius = stickyCornerRadius;
        this.firstButton = firstButton;
        this.secondButton = cartButton;
        this.asyncAction = atomActionDTO;
        this.notificationBar = notificationBar;
        this.relatedProductsCurtain = relatedProductsCurtain;
        this.trackingInfo = map;
        this.isInModal = bool;
    }

    public static /* synthetic */ CartButtonV5DTO copy$default(CartButtonV5DTO cartButtonV5DTO, boolean z11, CornerRadius cornerRadius, CartButton cartButton, CartButton cartButton2, AtomActionDTO atomActionDTO, CartButtonV4Dto.NotificationBar notificationBar, RelatedProductsCurtain relatedProductsCurtain, Map map, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = cartButtonV5DTO.isStickyTransparent;
        }
        if ((i11 & 2) != 0) {
            cornerRadius = cartButtonV5DTO.stickyCornerRadius;
        }
        if ((i11 & 4) != 0) {
            cartButton = cartButtonV5DTO.firstButton;
        }
        if ((i11 & 8) != 0) {
            cartButton2 = cartButtonV5DTO.secondButton;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = cartButtonV5DTO.asyncAction;
        }
        if ((i11 & 32) != 0) {
            notificationBar = cartButtonV5DTO.notificationBar;
        }
        if ((i11 & 64) != 0) {
            relatedProductsCurtain = cartButtonV5DTO.relatedProductsCurtain;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = cartButtonV5DTO.trackingInfo;
        }
        if ((i11 & 256) != 0) {
            bool = cartButtonV5DTO.isInModal;
        }
        Map map2 = map;
        Boolean bool2 = bool;
        CartButtonV4Dto.NotificationBar notificationBar2 = notificationBar;
        RelatedProductsCurtain relatedProductsCurtain2 = relatedProductsCurtain;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        CartButton cartButton3 = cartButton;
        return cartButtonV5DTO.copy(z11, cornerRadius, cartButton3, cartButton2, atomActionDTO2, notificationBar2, relatedProductsCurtain2, map2, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsStickyTransparent() {
        return this.isStickyTransparent;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CornerRadius getStickyCornerRadius() {
        return this.stickyCornerRadius;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CartButton getFirstButton() {
        return this.firstButton;
    }

    /* renamed from: component4, reason: from getter */
    public final CartButton getSecondButton() {
        return this.secondButton;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAsyncAction() {
        return this.asyncAction;
    }

    /* renamed from: component6, reason: from getter */
    public final CartButtonV4Dto.NotificationBar getNotificationBar() {
        return this.notificationBar;
    }

    /* renamed from: component7, reason: from getter */
    public final RelatedProductsCurtain getRelatedProductsCurtain() {
        return this.relatedProductsCurtain;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsInModal() {
        return this.isInModal;
    }

    @NotNull
    public final CartButtonV5DTO copy(boolean isStickyTransparent, @NotNull CornerRadius stickyCornerRadius, @NotNull CartButton firstButton, CartButton secondButton, AtomActionDTO asyncAction, CartButtonV4Dto.NotificationBar notificationBar, RelatedProductsCurtain relatedProductsCurtain, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean isInModal) {
        Intrinsics.checkNotNullParameter(stickyCornerRadius, "stickyCornerRadius");
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        return new CartButtonV5DTO(isStickyTransparent, stickyCornerRadius, firstButton, secondButton, asyncAction, notificationBar, relatedProductsCurtain, trackingInfo, isInModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonV5DTO)) {
            return false;
        }
        CartButtonV5DTO cartButtonV5DTO = (CartButtonV5DTO) other;
        return this.isStickyTransparent == cartButtonV5DTO.isStickyTransparent && this.stickyCornerRadius == cartButtonV5DTO.stickyCornerRadius && Intrinsics.d(this.firstButton, cartButtonV5DTO.firstButton) && Intrinsics.d(this.secondButton, cartButtonV5DTO.secondButton) && Intrinsics.d(this.asyncAction, cartButtonV5DTO.asyncAction) && Intrinsics.d(this.notificationBar, cartButtonV5DTO.notificationBar) && Intrinsics.d(this.relatedProductsCurtain, cartButtonV5DTO.relatedProductsCurtain) && Intrinsics.d(this.trackingInfo, cartButtonV5DTO.trackingInfo) && Intrinsics.d(this.isInModal, cartButtonV5DTO.isInModal);
    }

    public final AtomActionDTO getAsyncAction() {
        return this.asyncAction;
    }

    @NotNull
    public final CartButton getFirstButton() {
        return this.firstButton;
    }

    public final CartButtonV4Dto.NotificationBar getNotificationBar() {
        return this.notificationBar;
    }

    public final RelatedProductsCurtain getRelatedProductsCurtain() {
        return this.relatedProductsCurtain;
    }

    public final CartButton getSecondButton() {
        return this.secondButton;
    }

    @NotNull
    public final CornerRadius getStickyCornerRadius() {
        return this.stickyCornerRadius;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.firstButton.hashCode() + b.b(this.stickyCornerRadius, Boolean.hashCode(this.isStickyTransparent) * 31, 31)) * 31;
        CartButton cartButton = this.secondButton;
        int hashCode2 = (hashCode + (cartButton == null ? 0 : cartButton.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.asyncAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        CartButtonV4Dto.NotificationBar notificationBar = this.notificationBar;
        int hashCode4 = (hashCode3 + (notificationBar == null ? 0 : notificationBar.hashCode())) * 31;
        RelatedProductsCurtain relatedProductsCurtain = this.relatedProductsCurtain;
        int hashCode5 = (hashCode4 + (relatedProductsCurtain == null ? 0 : relatedProductsCurtain.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.isInModal;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isInModal() {
        return this.isInModal;
    }

    public final boolean isStickyTransparent() {
        return this.isStickyTransparent;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isStickyTransparent;
        CornerRadius cornerRadius = this.stickyCornerRadius;
        CartButton cartButton = this.firstButton;
        CartButton cartButton2 = this.secondButton;
        AtomActionDTO atomActionDTO = this.asyncAction;
        CartButtonV4Dto.NotificationBar notificationBar = this.notificationBar;
        RelatedProductsCurtain relatedProductsCurtain = this.relatedProductsCurtain;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Boolean bool = this.isInModal;
        StringBuilder sb2 = new StringBuilder("CartButtonV5DTO(isStickyTransparent=");
        sb2.append(z11);
        sb2.append(", stickyCornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", firstButton=");
        sb2.append(cartButton);
        sb2.append(", secondButton=");
        sb2.append(cartButton2);
        sb2.append(", asyncAction=");
        sb2.append(atomActionDTO);
        sb2.append(", notificationBar=");
        sb2.append(notificationBar);
        sb2.append(", relatedProductsCurtain=");
        sb2.append(relatedProductsCurtain);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", isInModal=");
        return g.d(sb2, bool, ")");
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001:\u000267Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010#J\u0086\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00032\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\rHÖ\u0001J\t\u00105\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;", "", "isInCart", "", "toCart", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "inCart", "additionalButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "sku", "", "deliverySchema", "freeRest", "", "minAddToCartQuantity", "inCartQuantity", "multiplicityValue", "quantMultiplicityValue", "<init>", "(ZLru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/Integer;)V", "()Z", "getToCart", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "getInCart", "getAdditionalButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "getSku", "()Ljava/lang/String;", "getDeliverySchema", "getFreeRest", "()I", "getMinAddToCartQuantity", "getInCartQuantity", "getMultiplicityValue", "getQuantMultiplicityValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(ZLru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton;", "equals", "other", "hashCode", "toString", "Button", "AdditionalButton", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CartButton {
        public static final int $stable = 8;
        private final AdditionalButton additionalButton;
        private final String deliverySchema;
        private final int freeRest;
        private final Button inCart;
        private final int inCartQuantity;
        private final boolean isInCart;
        private final int minAddToCartQuantity;
        private final int multiplicityValue;
        private final Integer quantMultiplicityValue;
        private final String sku;

        @NotNull
        private final Button toCart;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "", "incrementButton", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton$ChangeQuantityButton;", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/uni/atoms/data/text/TextDTO;", "decrementButton", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton$ChangeQuantityButton;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton$ChangeQuantityButton;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getIncrementButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton$ChangeQuantityButton;", "getPlaceholder", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDecrementButton", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ChangeQuantityButton", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class AdditionalButton {
            public static final int $stable = 8;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final CornerRadius cornerRadius;

            @NotNull
            private final ChangeQuantityButton decrementButton;

            @NotNull
            private final ChangeQuantityButton incrementButton;

            @NotNull
            private final TextDTO placeholder;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton$ChangeQuantityButton;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ChangeQuantityButton {
                public static final int $stable = 8;
                private final AtomActionDTO action;

                @NotNull
                private final Icon icon;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public ChangeQuantityButton(@NotNull Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    this.icon = icon;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ ChangeQuantityButton copy$default(ChangeQuantityButton changeQuantityButton, Icon icon, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        icon = changeQuantityButton.icon;
                    }
                    if ((i11 & 2) != 0) {
                        atomActionDTO = changeQuantityButton.action;
                    }
                    if ((i11 & 4) != 0) {
                        map = changeQuantityButton.trackingInfo;
                    }
                    return changeQuantityButton.copy(icon, atomActionDTO, map);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final Icon getIcon() {
                    return this.icon;
                }

                /* renamed from: component2, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component3() {
                    return this.trackingInfo;
                }

                @NotNull
                public final ChangeQuantityButton copy(@NotNull Icon icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    return new ChangeQuantityButton(icon, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ChangeQuantityButton)) {
                        return false;
                    }
                    ChangeQuantityButton changeQuantityButton = (ChangeQuantityButton) other;
                    return Intrinsics.d(this.icon, changeQuantityButton.icon) && Intrinsics.d(this.action, changeQuantityButton.action) && Intrinsics.d(this.trackingInfo, changeQuantityButton.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                @NotNull
                public final Icon getIcon() {
                    return this.icon;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int hashCode = this.icon.hashCode() * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode2 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    Icon icon = this.icon;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder sb2 = new StringBuilder("ChangeQuantityButton(icon=");
                    sb2.append(icon);
                    sb2.append(", action=");
                    sb2.append(atomActionDTO);
                    sb2.append(", trackingInfo=");
                    return P.f(sb2, map, ")");
                }
            }

            public AdditionalButton(@NotNull ChangeQuantityButton incrementButton, @NotNull TextDTO placeholder, @NotNull ChangeQuantityButton decrementButton, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(incrementButton, "incrementButton");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(decrementButton, "decrementButton");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
                this.incrementButton = incrementButton;
                this.placeholder = placeholder;
                this.decrementButton = decrementButton;
                this.backgroundColor = backgroundColor;
                this.cornerRadius = cornerRadius;
            }

            public static /* synthetic */ AdditionalButton copy$default(AdditionalButton additionalButton, ChangeQuantityButton changeQuantityButton, TextDTO textDTO, ChangeQuantityButton changeQuantityButton2, String str, CornerRadius cornerRadius, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    changeQuantityButton = additionalButton.incrementButton;
                }
                if ((i11 & 2) != 0) {
                    textDTO = additionalButton.placeholder;
                }
                if ((i11 & 4) != 0) {
                    changeQuantityButton2 = additionalButton.decrementButton;
                }
                if ((i11 & 8) != 0) {
                    str = additionalButton.backgroundColor;
                }
                if ((i11 & 16) != 0) {
                    cornerRadius = additionalButton.cornerRadius;
                }
                CornerRadius cornerRadius2 = cornerRadius;
                ChangeQuantityButton changeQuantityButton3 = changeQuantityButton2;
                return additionalButton.copy(changeQuantityButton, textDTO, changeQuantityButton3, str, cornerRadius2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ChangeQuantityButton getIncrementButton() {
                return this.incrementButton;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getPlaceholder() {
                return this.placeholder;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final ChangeQuantityButton getDecrementButton() {
                return this.decrementButton;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final AdditionalButton copy(@NotNull ChangeQuantityButton incrementButton, @NotNull TextDTO placeholder, @NotNull ChangeQuantityButton decrementButton, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius) {
                Intrinsics.checkNotNullParameter(incrementButton, "incrementButton");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                Intrinsics.checkNotNullParameter(decrementButton, "decrementButton");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
                return new AdditionalButton(incrementButton, placeholder, decrementButton, backgroundColor, cornerRadius);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AdditionalButton)) {
                    return false;
                }
                AdditionalButton additionalButton = (AdditionalButton) other;
                return Intrinsics.d(this.incrementButton, additionalButton.incrementButton) && Intrinsics.d(this.placeholder, additionalButton.placeholder) && Intrinsics.d(this.decrementButton, additionalButton.decrementButton) && Intrinsics.d(this.backgroundColor, additionalButton.backgroundColor) && this.cornerRadius == additionalButton.cornerRadius;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final ChangeQuantityButton getDecrementButton() {
                return this.decrementButton;
            }

            @NotNull
            public final ChangeQuantityButton getIncrementButton() {
                return this.incrementButton;
            }

            @NotNull
            public final TextDTO getPlaceholder() {
                return this.placeholder;
            }

            public int hashCode() {
                return this.cornerRadius.hashCode() + G.g.a((this.decrementButton.hashCode() + Ns.b.a(this.placeholder, this.incrementButton.hashCode() * 31, 31)) * 31, 31, this.backgroundColor);
            }

            @NotNull
            public String toString() {
                return "AdditionalButton(incrementButton=" + this.incrementButton + ", placeholder=" + this.placeholder + ", decrementButton=" + this.decrementButton + ", backgroundColor=" + this.backgroundColor + ", cornerRadius=" + this.cornerRadius + ")";
            }
        }

        public CartButton(boolean z11, @NotNull Button toCart, Button button, AdditionalButton additionalButton, String str, String str2, int i11, int i12, int i13, int i14, Integer num) {
            Intrinsics.checkNotNullParameter(toCart, "toCart");
            this.isInCart = z11;
            this.toCart = toCart;
            this.inCart = button;
            this.additionalButton = additionalButton;
            this.sku = str;
            this.deliverySchema = str2;
            this.freeRest = i11;
            this.minAddToCartQuantity = i12;
            this.inCartQuantity = i13;
            this.multiplicityValue = i14;
            this.quantMultiplicityValue = num;
        }

        public static /* synthetic */ CartButton copy$default(CartButton cartButton, boolean z11, Button button, Button button2, AdditionalButton additionalButton, String str, String str2, int i11, int i12, int i13, int i14, Integer num, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                z11 = cartButton.isInCart;
            }
            if ((i15 & 2) != 0) {
                button = cartButton.toCart;
            }
            if ((i15 & 4) != 0) {
                button2 = cartButton.inCart;
            }
            if ((i15 & 8) != 0) {
                additionalButton = cartButton.additionalButton;
            }
            if ((i15 & 16) != 0) {
                str = cartButton.sku;
            }
            if ((i15 & 32) != 0) {
                str2 = cartButton.deliverySchema;
            }
            if ((i15 & 64) != 0) {
                i11 = cartButton.freeRest;
            }
            if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i12 = cartButton.minAddToCartQuantity;
            }
            if ((i15 & 256) != 0) {
                i13 = cartButton.inCartQuantity;
            }
            if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i14 = cartButton.multiplicityValue;
            }
            if ((i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                num = cartButton.quantMultiplicityValue;
            }
            int i16 = i14;
            Integer num2 = num;
            int i17 = i12;
            int i18 = i13;
            String str3 = str2;
            int i19 = i11;
            String str4 = str;
            Button button3 = button2;
            return cartButton.copy(z11, button, button3, additionalButton, str4, str3, i19, i17, i18, i16, num2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsInCart() {
            return this.isInCart;
        }

        /* renamed from: component10, reason: from getter */
        public final int getMultiplicityValue() {
            return this.multiplicityValue;
        }

        /* renamed from: component11, reason: from getter */
        public final Integer getQuantMultiplicityValue() {
            return this.quantMultiplicityValue;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Button getToCart() {
            return this.toCart;
        }

        /* renamed from: component3, reason: from getter */
        public final Button getInCart() {
            return this.inCart;
        }

        /* renamed from: component4, reason: from getter */
        public final AdditionalButton getAdditionalButton() {
            return this.additionalButton;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSku() {
            return this.sku;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDeliverySchema() {
            return this.deliverySchema;
        }

        /* renamed from: component7, reason: from getter */
        public final int getFreeRest() {
            return this.freeRest;
        }

        /* renamed from: component8, reason: from getter */
        public final int getMinAddToCartQuantity() {
            return this.minAddToCartQuantity;
        }

        /* renamed from: component9, reason: from getter */
        public final int getInCartQuantity() {
            return this.inCartQuantity;
        }

        @NotNull
        public final CartButton copy(boolean isInCart, @NotNull Button toCart, Button inCart, AdditionalButton additionalButton, String sku, String deliverySchema, int freeRest, int minAddToCartQuantity, int inCartQuantity, int multiplicityValue, Integer quantMultiplicityValue) {
            Intrinsics.checkNotNullParameter(toCart, "toCart");
            return new CartButton(isInCart, toCart, inCart, additionalButton, sku, deliverySchema, freeRest, minAddToCartQuantity, inCartQuantity, multiplicityValue, quantMultiplicityValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartButton)) {
                return false;
            }
            CartButton cartButton = (CartButton) other;
            return this.isInCart == cartButton.isInCart && Intrinsics.d(this.toCart, cartButton.toCart) && Intrinsics.d(this.inCart, cartButton.inCart) && Intrinsics.d(this.additionalButton, cartButton.additionalButton) && Intrinsics.d(this.sku, cartButton.sku) && Intrinsics.d(this.deliverySchema, cartButton.deliverySchema) && this.freeRest == cartButton.freeRest && this.minAddToCartQuantity == cartButton.minAddToCartQuantity && this.inCartQuantity == cartButton.inCartQuantity && this.multiplicityValue == cartButton.multiplicityValue && Intrinsics.d(this.quantMultiplicityValue, cartButton.quantMultiplicityValue);
        }

        public final AdditionalButton getAdditionalButton() {
            return this.additionalButton;
        }

        public final String getDeliverySchema() {
            return this.deliverySchema;
        }

        public final int getFreeRest() {
            return this.freeRest;
        }

        public final Button getInCart() {
            return this.inCart;
        }

        public final int getInCartQuantity() {
            return this.inCartQuantity;
        }

        public final int getMinAddToCartQuantity() {
            return this.minAddToCartQuantity;
        }

        public final int getMultiplicityValue() {
            return this.multiplicityValue;
        }

        public final Integer getQuantMultiplicityValue() {
            return this.quantMultiplicityValue;
        }

        public final String getSku() {
            return this.sku;
        }

        @NotNull
        public final Button getToCart() {
            return this.toCart;
        }

        public int hashCode() {
            int hashCode = (this.toCart.hashCode() + (Boolean.hashCode(this.isInCart) * 31)) * 31;
            Button button = this.inCart;
            int hashCode2 = (hashCode + (button == null ? 0 : button.hashCode())) * 31;
            AdditionalButton additionalButton = this.additionalButton;
            int hashCode3 = (hashCode2 + (additionalButton == null ? 0 : additionalButton.hashCode())) * 31;
            String str = this.sku;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deliverySchema;
            int a11 = C2454a.a(this.multiplicityValue, C2454a.a(this.inCartQuantity, C2454a.a(this.minAddToCartQuantity, C2454a.a(this.freeRest, (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31);
            Integer num = this.quantMultiplicityValue;
            return a11 + (num != null ? num.hashCode() : 0);
        }

        public final boolean isInCart() {
            return this.isInCart;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isInCart;
            Button button = this.toCart;
            Button button2 = this.inCart;
            AdditionalButton additionalButton = this.additionalButton;
            String str = this.sku;
            String str2 = this.deliverySchema;
            int i11 = this.freeRest;
            int i12 = this.minAddToCartQuantity;
            int i13 = this.inCartQuantity;
            int i14 = this.multiplicityValue;
            Integer num = this.quantMultiplicityValue;
            StringBuilder sb2 = new StringBuilder("CartButton(isInCart=");
            sb2.append(z11);
            sb2.append(", toCart=");
            sb2.append(button);
            sb2.append(", inCart=");
            sb2.append(button2);
            sb2.append(", additionalButton=");
            sb2.append(additionalButton);
            sb2.append(", sku=");
            a.h(sb2, str, ", deliverySchema=", str2, ", freeRest=");
            Ek.a.f(i11, i12, ", minAddToCartQuantity=", ", inCartQuantity=", sb2);
            Ek.a.f(i13, i14, ", multiplicityValue=", ", quantMultiplicityValue=", sb2);
            return Ep.a.c(sb2, num, ")");
        }

        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002MNB\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u00104\u001a\u00020\fJ\r\u00105\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u00106J\u0006\u00107\u001a\u000208J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u001aHÆ\u0003J¯\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001J\u0013\u0010H\u001a\u00020\f2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006O"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "isNonIcon", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "animationSubtitle", "asyncFetchType", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$AsyncFetchType;", "borderColor", "showBorder", "tooltip", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/button/Icon;ZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$AsyncFetchType;Ljava/lang/String;ZLru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "()Z", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getAnimationSubtitle", "getAsyncFetchType", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$AsyncFetchType;", "getBorderColor", "getShowBorder", "getTooltip", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;", "isSubscribeButton", "getForStars", "()Ljava/lang/Boolean;", "getCartType", "Lru/ozon/app/android/cart/common/domain/CartType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "Tooltip", "AsyncFetchType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Button {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final TextDTO animationSubtitle;

            @NotNull
            private final AsyncFetchType asyncFetchType;

            @NotNull
            private final String backgroundColor;
            private final BadgeDTO badge;

            @NotNull
            private final String borderColor;

            @NotNull
            private final CornerRadius cornerRadius;
            private final Icon icon;
            private final boolean isNonIcon;
            private final boolean showBorder;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final Tooltip tooltip;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$AsyncFetchType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_FETCH_TYPE", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class AsyncFetchType {
                private static final /* synthetic */ Xc.a $ENTRIES;
                private static final /* synthetic */ AsyncFetchType[] $VALUES;

                @i(name = "NO_FETCH_TYPE")
                public static final AsyncFetchType NO_FETCH_TYPE = new AsyncFetchType("NO_FETCH_TYPE", 0);

                @i(name = SelectionItemDescriptionDTO.TITLE)
                public static final AsyncFetchType TITLE = new AsyncFetchType(SelectionItemDescriptionDTO.TITLE, 1);

                @i(name = "SUBTITLE")
                public static final AsyncFetchType SUBTITLE = new AsyncFetchType("SUBTITLE", 2);

                private static final /* synthetic */ AsyncFetchType[] $values() {
                    return new AsyncFetchType[]{NO_FETCH_TYPE, TITLE, SUBTITLE};
                }

                static {
                    AsyncFetchType[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Xc.b.a($values);
                }

                private AsyncFetchType(String str, int i11) {
                }

                public static AsyncFetchType valueOf(String str) {
                    return (AsyncFetchType) Enum.valueOf(AsyncFetchType.class, str);
                }

                public static AsyncFetchType[] values() {
                    return (AsyncFetchType[]) $VALUES.clone();
                }
            }

            public Button(@NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull TextDTO title, TextDTO textDTO, Icon icon, boolean z11, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TextDTO textDTO2, @NotNull AsyncFetchType asyncFetchType, @NotNull String borderColor, boolean z12, Tooltip tooltip) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(asyncFetchType, "asyncFetchType");
                Intrinsics.checkNotNullParameter(borderColor, "borderColor");
                this.backgroundColor = backgroundColor;
                this.cornerRadius = cornerRadius;
                this.title = title;
                this.subtitle = textDTO;
                this.icon = icon;
                this.isNonIcon = z11;
                this.badge = badgeDTO;
                this.action = atomActionDTO;
                this.trackingInfo = map;
                this.animationSubtitle = textDTO2;
                this.asyncFetchType = asyncFetchType;
                this.borderColor = borderColor;
                this.showBorder = z12;
                this.tooltip = tooltip;
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component10, reason: from getter */
            public final TextDTO getAnimationSubtitle() {
                return this.animationSubtitle;
            }

            @NotNull
            /* renamed from: component11, reason: from getter */
            public final AsyncFetchType getAsyncFetchType() {
                return this.asyncFetchType;
            }

            @NotNull
            /* renamed from: component12, reason: from getter */
            public final String getBorderColor() {
                return this.borderColor;
            }

            /* renamed from: component13, reason: from getter */
            public final boolean getShowBorder() {
                return this.showBorder;
            }

            /* renamed from: component14, reason: from getter */
            public final Tooltip getTooltip() {
                return this.tooltip;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component4, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component5, reason: from getter */
            public final Icon getIcon() {
                return this.icon;
            }

            /* renamed from: component6, reason: from getter */
            public final boolean getIsNonIcon() {
                return this.isNonIcon;
            }

            /* renamed from: component7, reason: from getter */
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            /* renamed from: component8, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component9() {
                return this.trackingInfo;
            }

            @NotNull
            public final Button copy(@NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull TextDTO title, TextDTO subtitle, Icon icon, boolean isNonIcon, BadgeDTO badge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TextDTO animationSubtitle, @NotNull AsyncFetchType asyncFetchType, @NotNull String borderColor, boolean showBorder, Tooltip tooltip) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(asyncFetchType, "asyncFetchType");
                Intrinsics.checkNotNullParameter(borderColor, "borderColor");
                return new Button(backgroundColor, cornerRadius, title, subtitle, icon, isNonIcon, badge, action, trackingInfo, animationSubtitle, asyncFetchType, borderColor, showBorder, tooltip);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.d(this.backgroundColor, button.backgroundColor) && this.cornerRadius == button.cornerRadius && Intrinsics.d(this.title, button.title) && Intrinsics.d(this.subtitle, button.subtitle) && Intrinsics.d(this.icon, button.icon) && this.isNonIcon == button.isNonIcon && Intrinsics.d(this.badge, button.badge) && Intrinsics.d(this.action, button.action) && Intrinsics.d(this.trackingInfo, button.trackingInfo) && Intrinsics.d(this.animationSubtitle, button.animationSubtitle) && this.asyncFetchType == button.asyncFetchType && Intrinsics.d(this.borderColor, button.borderColor) && this.showBorder == button.showBorder && Intrinsics.d(this.tooltip, button.tooltip);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final TextDTO getAnimationSubtitle() {
                return this.animationSubtitle;
            }

            @NotNull
            public final AsyncFetchType getAsyncFetchType() {
                return this.asyncFetchType;
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            @NotNull
            public final String getBorderColor() {
                return this.borderColor;
            }

            @NotNull
            public final CartType getCartType() {
                AtomActionDTO atomActionDTO = this.action;
                return CartTypeKt.getCartType(atomActionDTO != null ? atomActionDTO.getParams() : null);
            }

            @NotNull
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final Boolean getForStars() {
                Map<String, String> params;
                String str;
                AtomActionDTO atomActionDTO = this.action;
                if (atomActionDTO == null || (params = atomActionDTO.getParams()) == null || (str = params.get(CartButtonV5DTO.FOR_STARS)) == null) {
                    return null;
                }
                return h.t0(str);
            }

            public final Icon getIcon() {
                return this.icon;
            }

            public final boolean getShowBorder() {
                return this.showBorder;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Tooltip getTooltip() {
                return this.tooltip;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.title, b.b(this.cornerRadius, this.backgroundColor.hashCode() * 31, 31), 31);
                TextDTO textDTO = this.subtitle;
                int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                Icon icon = this.icon;
                int a12 = C3532b.a((hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.isNonIcon);
                BadgeDTO badgeDTO = this.badge;
                int hashCode2 = (a12 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                TextDTO textDTO2 = this.animationSubtitle;
                int a13 = C3532b.a(G.g.a((this.asyncFetchType.hashCode() + ((hashCode4 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31, 31, this.borderColor), 31, this.showBorder);
                Tooltip tooltip = this.tooltip;
                return a13 + (tooltip != null ? tooltip.hashCode() : 0);
            }

            public final boolean isNonIcon() {
                return this.isNonIcon;
            }

            public final boolean isSubscribeButton() {
                AtomActionDTO atomActionDTO = this.action;
                return Intrinsics.d(atomActionDTO != null ? atomActionDTO.getId() : null, "subscribeToStock");
            }

            @NotNull
            public String toString() {
                String str = this.backgroundColor;
                CornerRadius cornerRadius = this.cornerRadius;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                Icon icon = this.icon;
                boolean z11 = this.isNonIcon;
                BadgeDTO badgeDTO = this.badge;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                TextDTO textDTO3 = this.animationSubtitle;
                AsyncFetchType asyncFetchType = this.asyncFetchType;
                String str2 = this.borderColor;
                boolean z12 = this.showBorder;
                Tooltip tooltip = this.tooltip;
                StringBuilder sb2 = new StringBuilder("Button(backgroundColor=");
                sb2.append(str);
                sb2.append(", cornerRadius=");
                sb2.append(cornerRadius);
                sb2.append(", title=");
                d.e(", subtitle=", ", icon=", sb2, textDTO, textDTO2);
                sb2.append(icon);
                sb2.append(", isNonIcon=");
                sb2.append(z11);
                sb2.append(", badge=");
                sb2.append(badgeDTO);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(", animationSubtitle=");
                sb2.append(textDTO3);
                sb2.append(", asyncFetchType=");
                sb2.append(asyncFetchType);
                sb2.append(", borderColor=");
                sb2.append(str2);
                sb2.append(", showBorder=");
                sb2.append(z12);
                sb2.append(", tooltip=");
                sb2.append(tooltip);
                sb2.append(")");
                return sb2.toString();
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;", "", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "tooltipKey", "", "tooltipDuration", "", "tooltipDelay", "animationDuration", "<init>", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;III)V", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getTooltipKey", "()Ljava/lang/String;", "getTooltipDuration", "()I", "getTooltipDelay", "getAnimationDuration", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Tooltip {
                public static final int $stable = TooltipDTO.$stable;
                private final int animationDuration;

                @NotNull
                private final TooltipDTO tooltip;
                private final int tooltipDelay;
                private final int tooltipDuration;

                @NotNull
                private final String tooltipKey;

                public Tooltip(@NotNull TooltipDTO tooltip, @NotNull String tooltipKey, int i11, int i12, int i13) {
                    Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                    Intrinsics.checkNotNullParameter(tooltipKey, "tooltipKey");
                    this.tooltip = tooltip;
                    this.tooltipKey = tooltipKey;
                    this.tooltipDuration = i11;
                    this.tooltipDelay = i12;
                    this.animationDuration = i13;
                }

                public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, TooltipDTO tooltipDTO, String str, int i11, int i12, int i13, int i14, Object obj) {
                    if ((i14 & 1) != 0) {
                        tooltipDTO = tooltip.tooltip;
                    }
                    if ((i14 & 2) != 0) {
                        str = tooltip.tooltipKey;
                    }
                    if ((i14 & 4) != 0) {
                        i11 = tooltip.tooltipDuration;
                    }
                    if ((i14 & 8) != 0) {
                        i12 = tooltip.tooltipDelay;
                    }
                    if ((i14 & 16) != 0) {
                        i13 = tooltip.animationDuration;
                    }
                    int i15 = i13;
                    int i16 = i11;
                    return tooltip.copy(tooltipDTO, str, i16, i12, i15);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TooltipDTO getTooltip() {
                    return this.tooltip;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getTooltipKey() {
                    return this.tooltipKey;
                }

                /* renamed from: component3, reason: from getter */
                public final int getTooltipDuration() {
                    return this.tooltipDuration;
                }

                /* renamed from: component4, reason: from getter */
                public final int getTooltipDelay() {
                    return this.tooltipDelay;
                }

                /* renamed from: component5, reason: from getter */
                public final int getAnimationDuration() {
                    return this.animationDuration;
                }

                @NotNull
                public final Tooltip copy(@NotNull TooltipDTO tooltip, @NotNull String tooltipKey, int tooltipDuration, int tooltipDelay, int animationDuration) {
                    Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                    Intrinsics.checkNotNullParameter(tooltipKey, "tooltipKey");
                    return new Tooltip(tooltip, tooltipKey, tooltipDuration, tooltipDelay, animationDuration);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Tooltip)) {
                        return false;
                    }
                    Tooltip tooltip = (Tooltip) other;
                    return Intrinsics.d(this.tooltip, tooltip.tooltip) && Intrinsics.d(this.tooltipKey, tooltip.tooltipKey) && this.tooltipDuration == tooltip.tooltipDuration && this.tooltipDelay == tooltip.tooltipDelay && this.animationDuration == tooltip.animationDuration;
                }

                public final int getAnimationDuration() {
                    return this.animationDuration;
                }

                @NotNull
                public final TooltipDTO getTooltip() {
                    return this.tooltip;
                }

                public final int getTooltipDelay() {
                    return this.tooltipDelay;
                }

                public final int getTooltipDuration() {
                    return this.tooltipDuration;
                }

                @NotNull
                public final String getTooltipKey() {
                    return this.tooltipKey;
                }

                public int hashCode() {
                    return Integer.hashCode(this.animationDuration) + C2454a.a(this.tooltipDelay, C2454a.a(this.tooltipDuration, G.g.a(this.tooltip.hashCode() * 31, 31, this.tooltipKey), 31), 31);
                }

                @NotNull
                public String toString() {
                    TooltipDTO tooltipDTO = this.tooltip;
                    String str = this.tooltipKey;
                    int i11 = this.tooltipDuration;
                    int i12 = this.tooltipDelay;
                    int i13 = this.animationDuration;
                    StringBuilder sb2 = new StringBuilder("Tooltip(tooltip=");
                    sb2.append(tooltipDTO);
                    sb2.append(", tooltipKey=");
                    sb2.append(str);
                    sb2.append(", tooltipDuration=");
                    Ek.a.f(i11, i12, ", tooltipDelay=", ", animationDuration=", sb2);
                    return K00.b.e(i13, ")", sb2);
                }

                public /* synthetic */ Tooltip(TooltipDTO tooltipDTO, String str, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                    this(tooltipDTO, str, (i14 & 4) != 0 ? 5000 : i11, (i14 & 8) != 0 ? 1000 : i12, (i14 & 16) != 0 ? 300 : i13);
                }
            }

            public /* synthetic */ Button(String str, CornerRadius cornerRadius, TextDTO textDTO, TextDTO textDTO2, Icon icon, boolean z11, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, TextDTO textDTO3, AsyncFetchType asyncFetchType, String str2, boolean z12, Tooltip tooltip, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, cornerRadius, textDTO, textDTO2, icon, (i11 & 32) != 0 ? false : z11, badgeDTO, atomActionDTO, map, textDTO3, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? AsyncFetchType.NO_FETCH_TYPE : asyncFetchType, (i11 & 2048) != 0 ? UniColors.GRAPHIC_LIGHT_KEY.getToken() : str2, (i11 & 4096) != 0 ? false : z12, tooltip);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ CartButton(boolean z11, Button button, Button button2, AdditionalButton additionalButton, String str, String str2, int i11, int i12, int i13, int i14, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, button, button2, additionalButton, str, str2, i11, i12, i13, r13, r14);
            Integer num2;
            int i16;
            i11 = (i15 & 64) != 0 ? 0 : i11;
            i12 = (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 1 : i12;
            i13 = (i15 & 256) != 0 ? 0 : i13;
            if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                num2 = num;
                i16 = 1;
            } else {
                num2 = num;
                i16 = i14;
            }
        }
    }

    public /* synthetic */ CartButtonV5DTO(boolean z11, CornerRadius cornerRadius, CartButton cartButton, CartButton cartButton2, AtomActionDTO atomActionDTO, CartButtonV4Dto.NotificationBar notificationBar, RelatedProductsCurtain relatedProductsCurtain, Map map, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, cornerRadius, cartButton, cartButton2, atomActionDTO, notificationBar, relatedProductsCurtain, map, bool);
    }
}
