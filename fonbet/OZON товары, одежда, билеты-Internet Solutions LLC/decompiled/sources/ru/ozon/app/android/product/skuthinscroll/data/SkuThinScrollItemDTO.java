package ru.ozon.app.android.product.skuthinscroll.data;

import G.g;
import GR.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000267Bu\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u008a\u0001\u0010/\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u0012\u0010\u001e¨\u00068"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "stateElements", "", "button", "showBorder", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "skuId", "blurItem", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "isTextTagSupported", "<init>", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;Ljava/lang/Boolean;)V", "getTrackingInfo", "()Ljava/util/Map;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getStateElements", "()Ljava/util/List;", "getButton", "()Ljava/lang/Object;", "getShowBorder", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSkuId", "()Ljava/lang/String;", "getBlurItem", "()Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;Ljava/lang/Boolean;)Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO;", "equals", "other", "hashCode", "", "toString", "Companion", "AddToCartButton", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SkuThinScrollItemDTO {

    @Deprecated
    @NotNull
    public static final String ADD_TO_CART_BUTTON = "addToCartButton";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String ICON_BUTTON = "iconButton";

    @Deprecated
    @NotNull
    public static final String LABEL_LIST = "labelList";

    @Deprecated
    @NotNull
    public static final String LABEL_LIST_V2 = "labelListV2";

    @Deprecated
    @NotNull
    public static final String PRICE = "price";

    @Deprecated
    @NotNull
    public static final String TEXT = "text";

    @Deprecated
    @NotNull
    public static final String TEXT_V2 = "textDS";
    private final AtomActionDTO action;
    private final BlurMoleculeDTO blurItem;
    private final Object button;
    private final IconDTO icon;
    private final Boolean isTextTagSupported;
    private final Boolean showBorder;
    private final String skuId;

    @NotNull
    private final List<Object> stateElements;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO$AddToCartButton;", "", "isInCart", "", "addToCart", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "removeFromCart", "<init>", "(ZLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "()Z", "getAddToCart", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRemoveFromCart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddToCartButton {

        @NotNull
        private final IconButtonV3DTO addToCart;
        private final boolean isInCart;

        @NotNull
        private final IconButtonV3DTO removeFromCart;

        public AddToCartButton(boolean z11, @NotNull IconButtonV3DTO addToCart, @NotNull IconButtonV3DTO removeFromCart) {
            Intrinsics.checkNotNullParameter(addToCart, "addToCart");
            Intrinsics.checkNotNullParameter(removeFromCart, "removeFromCart");
            this.isInCart = z11;
            this.addToCart = addToCart;
            this.removeFromCart = removeFromCart;
        }

        public static /* synthetic */ AddToCartButton copy$default(AddToCartButton addToCartButton, boolean z11, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = addToCartButton.isInCart;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = addToCartButton.addToCart;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO2 = addToCartButton.removeFromCart;
            }
            return addToCartButton.copy(z11, iconButtonV3DTO, iconButtonV3DTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsInCart() {
            return this.isInCart;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getAddToCart() {
            return this.addToCart;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getRemoveFromCart() {
            return this.removeFromCart;
        }

        @NotNull
        public final AddToCartButton copy(boolean isInCart, @NotNull IconButtonV3DTO addToCart, @NotNull IconButtonV3DTO removeFromCart) {
            Intrinsics.checkNotNullParameter(addToCart, "addToCart");
            Intrinsics.checkNotNullParameter(removeFromCart, "removeFromCart");
            return new AddToCartButton(isInCart, addToCart, removeFromCart);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddToCartButton)) {
                return false;
            }
            AddToCartButton addToCartButton = (AddToCartButton) other;
            return this.isInCart == addToCartButton.isInCart && Intrinsics.d(this.addToCart, addToCartButton.addToCart) && Intrinsics.d(this.removeFromCart, addToCartButton.removeFromCart);
        }

        @NotNull
        public final IconButtonV3DTO getAddToCart() {
            return this.addToCart;
        }

        @NotNull
        public final IconButtonV3DTO getRemoveFromCart() {
            return this.removeFromCart;
        }

        public int hashCode() {
            return this.removeFromCart.hashCode() + b.c(this.addToCart, Boolean.hashCode(this.isInCart) * 31, 31);
        }

        public final boolean isInCart() {
            return this.isInCart;
        }

        @NotNull
        public String toString() {
            return "AddToCartButton(isInCart=" + this.isInCart + ", addToCart=" + this.addToCart + ", removeFromCart=" + this.removeFromCart + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO$Companion;", "", "<init>", "()V", "TEXT", "", "TEXT_V2", "PRICE", "ICON_BUTTON", "ADD_TO_CART_BUTTON", "LABEL_LIST", "LABEL_LIST_V2", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SkuThinScrollItemDTO(Map<String, TokenizedTrackingInfo> map, IconDTO iconDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "textDS", type = TextDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> stateElements, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "addToCartButton", type = AddToCartButton.class)}) @ProtoOneOf(label = "type") Object obj, Boolean bool, AtomActionDTO atomActionDTO, String str, BlurMoleculeDTO blurMoleculeDTO, Boolean bool2) {
        Intrinsics.checkNotNullParameter(stateElements, "stateElements");
        this.trackingInfo = map;
        this.icon = iconDTO;
        this.stateElements = stateElements;
        this.button = obj;
        this.showBorder = bool;
        this.action = atomActionDTO;
        this.skuId = str;
        this.blurItem = blurMoleculeDTO;
        this.isTextTagSupported = bool2;
    }

    public static /* synthetic */ SkuThinScrollItemDTO copy$default(SkuThinScrollItemDTO skuThinScrollItemDTO, Map map, IconDTO iconDTO, List list, Object obj, Boolean bool, AtomActionDTO atomActionDTO, String str, BlurMoleculeDTO blurMoleculeDTO, Boolean bool2, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            map = skuThinScrollItemDTO.trackingInfo;
        }
        if ((i11 & 2) != 0) {
            iconDTO = skuThinScrollItemDTO.icon;
        }
        if ((i11 & 4) != 0) {
            list = skuThinScrollItemDTO.stateElements;
        }
        if ((i11 & 8) != 0) {
            obj = skuThinScrollItemDTO.button;
        }
        if ((i11 & 16) != 0) {
            bool = skuThinScrollItemDTO.showBorder;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = skuThinScrollItemDTO.action;
        }
        if ((i11 & 64) != 0) {
            str = skuThinScrollItemDTO.skuId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            blurMoleculeDTO = skuThinScrollItemDTO.blurItem;
        }
        if ((i11 & 256) != 0) {
            bool2 = skuThinScrollItemDTO.isTextTagSupported;
        }
        BlurMoleculeDTO blurMoleculeDTO2 = blurMoleculeDTO;
        Boolean bool3 = bool2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str2 = str;
        Boolean bool4 = bool;
        List list2 = list;
        return skuThinScrollItemDTO.copy(map, iconDTO, list2, obj, bool4, atomActionDTO2, str2, blurMoleculeDTO2, bool3);
    }

    public final Map<String, TokenizedTrackingInfo> component1() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final List<Object> component3() {
        return this.stateElements;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getButton() {
        return this.button;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getShowBorder() {
        return this.showBorder;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    /* renamed from: component8, reason: from getter */
    public final BlurMoleculeDTO getBlurItem() {
        return this.blurItem;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getIsTextTagSupported() {
        return this.isTextTagSupported;
    }

    @NotNull
    public final SkuThinScrollItemDTO copy(Map<String, TokenizedTrackingInfo> trackingInfo, IconDTO icon, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "textDS", type = TextDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> stateElements, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "addToCartButton", type = AddToCartButton.class)}) @ProtoOneOf(label = "type") Object button, Boolean showBorder, AtomActionDTO action, String skuId, BlurMoleculeDTO blurItem, Boolean isTextTagSupported) {
        Intrinsics.checkNotNullParameter(stateElements, "stateElements");
        return new SkuThinScrollItemDTO(trackingInfo, icon, stateElements, button, showBorder, action, skuId, blurItem, isTextTagSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuThinScrollItemDTO)) {
            return false;
        }
        SkuThinScrollItemDTO skuThinScrollItemDTO = (SkuThinScrollItemDTO) other;
        return Intrinsics.d(this.trackingInfo, skuThinScrollItemDTO.trackingInfo) && Intrinsics.d(this.icon, skuThinScrollItemDTO.icon) && Intrinsics.d(this.stateElements, skuThinScrollItemDTO.stateElements) && Intrinsics.d(this.button, skuThinScrollItemDTO.button) && Intrinsics.d(this.showBorder, skuThinScrollItemDTO.showBorder) && Intrinsics.d(this.action, skuThinScrollItemDTO.action) && Intrinsics.d(this.skuId, skuThinScrollItemDTO.skuId) && Intrinsics.d(this.blurItem, skuThinScrollItemDTO.blurItem) && Intrinsics.d(this.isTextTagSupported, skuThinScrollItemDTO.isTextTagSupported);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final BlurMoleculeDTO getBlurItem() {
        return this.blurItem;
    }

    public final Object getButton() {
        return this.button;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final Boolean getShowBorder() {
        return this.showBorder;
    }

    public final String getSkuId() {
        return this.skuId;
    }

    @NotNull
    public final List<Object> getStateElements() {
        return this.stateElements;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        IconDTO iconDTO = this.icon;
        int b11 = g.b((hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.stateElements);
        Object obj = this.button;
        int hashCode2 = (b11 + (obj == null ? 0 : obj.hashCode())) * 31;
        Boolean bool = this.showBorder;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.skuId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        BlurMoleculeDTO blurMoleculeDTO = this.blurItem;
        int hashCode6 = (hashCode5 + (blurMoleculeDTO == null ? 0 : blurMoleculeDTO.hashCode())) * 31;
        Boolean bool2 = this.isTextTagSupported;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isTextTagSupported() {
        return this.isTextTagSupported;
    }

    @NotNull
    public String toString() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        IconDTO iconDTO = this.icon;
        List<Object> list = this.stateElements;
        Object obj = this.button;
        Boolean bool = this.showBorder;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.skuId;
        BlurMoleculeDTO blurMoleculeDTO = this.blurItem;
        Boolean bool2 = this.isTextTagSupported;
        StringBuilder sb2 = new StringBuilder("SkuThinScrollItemDTO(trackingInfo=");
        sb2.append(map);
        sb2.append(", icon=");
        sb2.append(iconDTO);
        sb2.append(", stateElements=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(obj);
        sb2.append(", showBorder=");
        sb2.append(bool);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", skuId=");
        sb2.append(str);
        sb2.append(", blurItem=");
        sb2.append(blurMoleculeDTO);
        sb2.append(", isTextTagSupported=");
        return D3.g.d(sb2, bool2, ")");
    }
}
