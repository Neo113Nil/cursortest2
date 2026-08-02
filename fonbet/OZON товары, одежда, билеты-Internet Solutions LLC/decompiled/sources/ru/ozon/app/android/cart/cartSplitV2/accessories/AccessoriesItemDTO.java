package ru.ozon.app.android.cart.cartSplitV2.accessories;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0001,BW\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jf\u0010%\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "stateElements", "", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "showBorder", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTrackingInfo", "()Ljava/util/Map;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getStateElements", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getShowBorder", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemDTO;", "equals", "other", "hashCode", "", "toString", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AccessoriesItemDTO {

    @Deprecated
    @NotNull
    public static final String ICON_BUTTON = "iconButton";

    @Deprecated
    @NotNull
    public static final String LABEL_LIST_V2 = "labelListV2";

    @Deprecated
    @NotNull
    public static final String PRICE = "price";

    @Deprecated
    @NotNull
    public static final String TEXT = "text";
    private final AtomActionDTO action;
    private final IconButtonV3DTO button;
    private final IconDTO icon;
    private final Boolean showBorder;

    @NotNull
    private final List<Object> stateElements;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemDTO$Companion;", "", "<init>", "()V", "TEXT", "", "PRICE", "LABEL_LIST_V2", "ICON_BUTTON", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AccessoriesItemDTO(Map<String, TokenizedTrackingInfo> map, IconDTO iconDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> stateElements, @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class) @ProtoOneOf(label = "type") IconButtonV3DTO iconButtonV3DTO, Boolean bool, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(stateElements, "stateElements");
        this.trackingInfo = map;
        this.icon = iconDTO;
        this.stateElements = stateElements;
        this.button = iconButtonV3DTO;
        this.showBorder = bool;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ AccessoriesItemDTO copy$default(AccessoriesItemDTO accessoriesItemDTO, Map map, IconDTO iconDTO, List list, IconButtonV3DTO iconButtonV3DTO, Boolean bool, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = accessoriesItemDTO.trackingInfo;
        }
        if ((i11 & 2) != 0) {
            iconDTO = accessoriesItemDTO.icon;
        }
        if ((i11 & 4) != 0) {
            list = accessoriesItemDTO.stateElements;
        }
        if ((i11 & 8) != 0) {
            iconButtonV3DTO = accessoriesItemDTO.button;
        }
        if ((i11 & 16) != 0) {
            bool = accessoriesItemDTO.showBorder;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = accessoriesItemDTO.action;
        }
        Boolean bool2 = bool;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return accessoriesItemDTO.copy(map, iconDTO, list, iconButtonV3DTO, bool2, atomActionDTO2);
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
    public final IconButtonV3DTO getButton() {
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

    @NotNull
    public final AccessoriesItemDTO copy(Map<String, TokenizedTrackingInfo> trackingInfo, IconDTO icon, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> stateElements, @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class) @ProtoOneOf(label = "type") IconButtonV3DTO button, Boolean showBorder, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(stateElements, "stateElements");
        return new AccessoriesItemDTO(trackingInfo, icon, stateElements, button, showBorder, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessoriesItemDTO)) {
            return false;
        }
        AccessoriesItemDTO accessoriesItemDTO = (AccessoriesItemDTO) other;
        return Intrinsics.d(this.trackingInfo, accessoriesItemDTO.trackingInfo) && Intrinsics.d(this.icon, accessoriesItemDTO.icon) && Intrinsics.d(this.stateElements, accessoriesItemDTO.stateElements) && Intrinsics.d(this.button, accessoriesItemDTO.button) && Intrinsics.d(this.showBorder, accessoriesItemDTO.showBorder) && Intrinsics.d(this.action, accessoriesItemDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final IconButtonV3DTO getButton() {
        return this.button;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final Boolean getShowBorder() {
        return this.showBorder;
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
        IconButtonV3DTO iconButtonV3DTO = this.button;
        int hashCode2 = (b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        Boolean bool = this.showBorder;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode3 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AccessoriesItemDTO(trackingInfo=" + this.trackingInfo + ", icon=" + this.icon + ", stateElements=" + this.stateElements + ", button=" + this.button + ", showBorder=" + this.showBorder + ", action=" + this.action + ")";
    }
}
