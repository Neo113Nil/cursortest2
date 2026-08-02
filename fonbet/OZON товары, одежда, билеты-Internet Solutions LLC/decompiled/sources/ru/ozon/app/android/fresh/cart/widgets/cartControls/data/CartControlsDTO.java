package ru.ozon.app.android.fresh.cart.widgets.cartControls.data;

import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001a¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/CartControlsDTO;", "", "selectionControls", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "binButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "spacers", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/SpacersDTO;", "isTopCornersRounded", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "moveItemsButton", "tooltipData", "Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/TooltipData;", "isAnimationEnabled", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/SpacersDTO;ZLjava/util/Map;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/TooltipData;Z)V", "getSelectionControls", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBinButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/SpacersDTO;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "getMoveItemsButton", "getTooltipData", "()Lru/ozon/app/android/fresh/cart/widgets/cartControls/data/TooltipData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartControlsDTO {
    public static final int $stable = 8;
    private final IconButtonV3DTO binButton;
    private final boolean isAnimationEnabled;
    private final boolean isTopCornersRounded;
    private final IconButtonV3DTO moveItemsButton;

    @NotNull
    private final CellDTO selectionControls;

    @NotNull
    private final SpacersDTO spacers;
    private final TooltipData tooltipData;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CartControlsDTO(@NotNull CellDTO selectionControls, IconButtonV3DTO iconButtonV3DTO, @NotNull SpacersDTO spacers, boolean z11, Map<String, TokenizedTrackingInfo> map, IconButtonV3DTO iconButtonV3DTO2, TooltipData tooltipData, boolean z12) {
        Intrinsics.checkNotNullParameter(selectionControls, "selectionControls");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.selectionControls = selectionControls;
        this.binButton = iconButtonV3DTO;
        this.spacers = spacers;
        this.isTopCornersRounded = z11;
        this.trackingInfo = map;
        this.moveItemsButton = iconButtonV3DTO2;
        this.tooltipData = tooltipData;
        this.isAnimationEnabled = z12;
    }

    public static /* synthetic */ CartControlsDTO copy$default(CartControlsDTO cartControlsDTO, CellDTO cellDTO, IconButtonV3DTO iconButtonV3DTO, SpacersDTO spacersDTO, boolean z11, Map map, IconButtonV3DTO iconButtonV3DTO2, TooltipData tooltipData, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = cartControlsDTO.selectionControls;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = cartControlsDTO.binButton;
        }
        if ((i11 & 4) != 0) {
            spacersDTO = cartControlsDTO.spacers;
        }
        if ((i11 & 8) != 0) {
            z11 = cartControlsDTO.isTopCornersRounded;
        }
        if ((i11 & 16) != 0) {
            map = cartControlsDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            iconButtonV3DTO2 = cartControlsDTO.moveItemsButton;
        }
        if ((i11 & 64) != 0) {
            tooltipData = cartControlsDTO.tooltipData;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z12 = cartControlsDTO.isAnimationEnabled;
        }
        TooltipData tooltipData2 = tooltipData;
        boolean z13 = z12;
        Map map2 = map;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO2;
        return cartControlsDTO.copy(cellDTO, iconButtonV3DTO, spacersDTO, z11, map2, iconButtonV3DTO3, tooltipData2, z13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getSelectionControls() {
        return this.selectionControls;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getBinButton() {
        return this.binButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SpacersDTO getSpacers() {
        return this.spacers;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsTopCornersRounded() {
        return this.isTopCornersRounded;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final IconButtonV3DTO getMoveItemsButton() {
        return this.moveItemsButton;
    }

    /* renamed from: component7, reason: from getter */
    public final TooltipData getTooltipData() {
        return this.tooltipData;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsAnimationEnabled() {
        return this.isAnimationEnabled;
    }

    @NotNull
    public final CartControlsDTO copy(@NotNull CellDTO selectionControls, IconButtonV3DTO binButton, @NotNull SpacersDTO spacers, boolean isTopCornersRounded, Map<String, TokenizedTrackingInfo> trackingInfo, IconButtonV3DTO moveItemsButton, TooltipData tooltipData, boolean isAnimationEnabled) {
        Intrinsics.checkNotNullParameter(selectionControls, "selectionControls");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        return new CartControlsDTO(selectionControls, binButton, spacers, isTopCornersRounded, trackingInfo, moveItemsButton, tooltipData, isAnimationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartControlsDTO)) {
            return false;
        }
        CartControlsDTO cartControlsDTO = (CartControlsDTO) other;
        return Intrinsics.d(this.selectionControls, cartControlsDTO.selectionControls) && Intrinsics.d(this.binButton, cartControlsDTO.binButton) && Intrinsics.d(this.spacers, cartControlsDTO.spacers) && this.isTopCornersRounded == cartControlsDTO.isTopCornersRounded && Intrinsics.d(this.trackingInfo, cartControlsDTO.trackingInfo) && Intrinsics.d(this.moveItemsButton, cartControlsDTO.moveItemsButton) && Intrinsics.d(this.tooltipData, cartControlsDTO.tooltipData) && this.isAnimationEnabled == cartControlsDTO.isAnimationEnabled;
    }

    public final IconButtonV3DTO getBinButton() {
        return this.binButton;
    }

    public final IconButtonV3DTO getMoveItemsButton() {
        return this.moveItemsButton;
    }

    @NotNull
    public final CellDTO getSelectionControls() {
        return this.selectionControls;
    }

    @NotNull
    public final SpacersDTO getSpacers() {
        return this.spacers;
    }

    public final TooltipData getTooltipData() {
        return this.tooltipData;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.selectionControls.hashCode() * 31;
        IconButtonV3DTO iconButtonV3DTO = this.binButton;
        int a11 = C3532b.a((this.spacers.hashCode() + ((hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31)) * 31, 31, this.isTopCornersRounded);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.moveItemsButton;
        int hashCode3 = (hashCode2 + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
        TooltipData tooltipData = this.tooltipData;
        return Boolean.hashCode(this.isAnimationEnabled) + ((hashCode3 + (tooltipData != null ? tooltipData.hashCode() : 0)) * 31);
    }

    public final boolean isAnimationEnabled() {
        return this.isAnimationEnabled;
    }

    public final boolean isTopCornersRounded() {
        return this.isTopCornersRounded;
    }

    @NotNull
    public String toString() {
        return "CartControlsDTO(selectionControls=" + this.selectionControls + ", binButton=" + this.binButton + ", spacers=" + this.spacers + ", isTopCornersRounded=" + this.isTopCornersRounded + ", trackingInfo=" + this.trackingInfo + ", moveItemsButton=" + this.moveItemsButton + ", tooltipData=" + this.tooltipData + ", isAnimationEnabled=" + this.isAnimationEnabled + ")";
    }

    public /* synthetic */ CartControlsDTO(CellDTO cellDTO, IconButtonV3DTO iconButtonV3DTO, SpacersDTO spacersDTO, boolean z11, Map map, IconButtonV3DTO iconButtonV3DTO2, TooltipData tooltipData, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cellDTO, iconButtonV3DTO, (i11 & 4) != 0 ? new SpacersDTO(null, null, null, null, 15, null) : spacersDTO, (i11 & 8) != 0 ? false : z11, map, iconButtonV3DTO2, tooltipData, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? true : z12);
    }
}
