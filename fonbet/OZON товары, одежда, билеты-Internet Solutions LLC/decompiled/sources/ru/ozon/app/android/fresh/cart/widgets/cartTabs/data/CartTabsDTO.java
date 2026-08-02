package ru.ozon.app.android.fresh.cart.widgets.cartTabs.data;

import B3.p;
import GR.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO;", "", "items", "", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$CartTabItem;", "spacers", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$Spacers;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$Spacers;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$Spacers;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "CartTabItem", "Spacers", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartTabsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<CartTabItem> items;
    private final Spacers spacers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$Spacers;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        public static final int $stable = 0;

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings left;

        @NotNull
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public Spacers() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacers.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacers.right;
            }
            return spacers.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Spacers copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return new Spacers(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.top == spacers.top && this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.right.hashCode() + b.b(this.left, b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("Spacers(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }

        public Spacers(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
        }

        public /* synthetic */ Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_500 : paddings4);
        }
    }

    public CartTabsDTO(@NotNull List<CartTabItem> items, Spacers spacers, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.spacers = spacers;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartTabsDTO copy$default(CartTabsDTO cartTabsDTO, List list, Spacers spacers, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cartTabsDTO.items;
        }
        if ((i11 & 2) != 0) {
            spacers = cartTabsDTO.spacers;
        }
        if ((i11 & 4) != 0) {
            map = cartTabsDTO.trackingInfo;
        }
        return cartTabsDTO.copy(list, spacers, map);
    }

    @NotNull
    public final List<CartTabItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final CartTabsDTO copy(@NotNull List<CartTabItem> items, Spacers spacers, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new CartTabsDTO(items, spacers, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartTabsDTO)) {
            return false;
        }
        CartTabsDTO cartTabsDTO = (CartTabsDTO) other;
        return Intrinsics.d(this.items, cartTabsDTO.items) && Intrinsics.d(this.spacers, cartTabsDTO.spacers) && Intrinsics.d(this.trackingInfo, cartTabsDTO.trackingInfo);
    }

    @NotNull
    public final List<CartTabItem> getItems() {
        return this.items;
    }

    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Spacers spacers = this.spacers;
        int hashCode2 = (hashCode + (spacers == null ? 0 : spacers.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<CartTabItem> list = this.items;
        Spacers spacers = this.spacers;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CartTabsDTO(items=");
        sb2.append(list);
        sb2.append(", spacers=");
        sb2.append(spacers);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTabs/data/CartTabsDTO$CartTabItem;", "", "wrapper", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "aspectPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getAspectPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartTabItem {
        public static final int $stable = AspectDTO.$stable;

        @NotNull
        private final Paddings aspectPadding;

        @NotNull
        private final IndicatorDTO indicator;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        public CartTabItem(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull IndicatorDTO indicator, @NotNull Paddings aspectPadding) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            Intrinsics.checkNotNullParameter(aspectPadding, "aspectPadding");
            this.wrapper = wrapper;
            this.title = title;
            this.indicator = indicator;
            this.aspectPadding = aspectPadding;
        }

        public static /* synthetic */ CartTabItem copy$default(CartTabItem cartTabItem, AspectDTO aspectDTO, TextDTO textDTO, IndicatorDTO indicatorDTO, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aspectDTO = cartTabItem.wrapper;
            }
            if ((i11 & 2) != 0) {
                textDTO = cartTabItem.title;
            }
            if ((i11 & 4) != 0) {
                indicatorDTO = cartTabItem.indicator;
            }
            if ((i11 & 8) != 0) {
                paddings = cartTabItem.aspectPadding;
            }
            return cartTabItem.copy(aspectDTO, textDTO, indicatorDTO, paddings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getAspectPadding() {
            return this.aspectPadding;
        }

        @NotNull
        public final CartTabItem copy(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull IndicatorDTO indicator, @NotNull Paddings aspectPadding) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            Intrinsics.checkNotNullParameter(aspectPadding, "aspectPadding");
            return new CartTabItem(wrapper, title, indicator, aspectPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartTabItem)) {
                return false;
            }
            CartTabItem cartTabItem = (CartTabItem) other;
            return Intrinsics.d(this.wrapper, cartTabItem.wrapper) && Intrinsics.d(this.title, cartTabItem.title) && Intrinsics.d(this.indicator, cartTabItem.indicator) && this.aspectPadding == cartTabItem.aspectPadding;
        }

        @NotNull
        public final Paddings getAspectPadding() {
            return this.aspectPadding;
        }

        @NotNull
        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        public int hashCode() {
            return this.aspectPadding.hashCode() + ((this.indicator.hashCode() + Ns.b.a(this.title, this.wrapper.hashCode() * 31, 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "CartTabItem(wrapper=" + this.wrapper + ", title=" + this.title + ", indicator=" + this.indicator + ", aspectPadding=" + this.aspectPadding + ")";
        }

        public /* synthetic */ CartTabItem(AspectDTO aspectDTO, TextDTO textDTO, IndicatorDTO indicatorDTO, Paddings paddings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aspectDTO, textDTO, indicatorDTO, (i11 & 8) != 0 ? Paddings.PADDING_300 : paddings);
        }
    }
}
