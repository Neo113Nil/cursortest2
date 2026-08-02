package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Pk0.b;
import WZ.t;
import Z1.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002*+B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$CartTabItem;", "items", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$Spacers;", "spacers", "LWZ/t;", "tokenizedEvent", "", "currentSelectedTab", "<init>", "(JLjava/util/List;Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$Spacers;LWZ/t;I)V", "copy", "(JLjava/util/List;Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$Spacers;LWZ/t;I)Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$Spacers;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "I", "getCurrentSelectedTab", "CartTabItem", "Spacers", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartTabsVO implements c {
    private final int currentSelectedTab;
    private final long id;

    @NotNull
    private final List<CartTabItem> items;

    @NotNull
    private final Spacers spacers;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$CartTabItem;", "", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "wrapper", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "LZ1/h;", "aspectPadding", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;FLWZ/t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-2lqI77k", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;FLWZ/t;)Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$CartTabItem;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "F", "getAspectPadding-D9Ej5fM", "()F", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartTabItem {
        private final float aspectPadding;

        @NotNull
        private final IndicatorDTO indicator;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        @NotNull
        private final AspectDTO wrapper;

        public /* synthetic */ CartTabItem(AspectDTO aspectDTO, TextDTO textDTO, IndicatorDTO indicatorDTO, float f7, t tVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aspectDTO, textDTO, indicatorDTO, f7, tVar);
        }

        /* renamed from: copy-2lqI77k$default, reason: not valid java name */
        public static /* synthetic */ CartTabItem m700copy2lqI77k$default(CartTabItem cartTabItem, AspectDTO aspectDTO, TextDTO textDTO, IndicatorDTO indicatorDTO, float f7, t tVar, int i11, Object obj) {
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
                f7 = cartTabItem.aspectPadding;
            }
            if ((i11 & 16) != 0) {
                tVar = cartTabItem.tokenizedEvent;
            }
            t tVar2 = tVar;
            IndicatorDTO indicatorDTO2 = indicatorDTO;
            return cartTabItem.m701copy2lqI77k(aspectDTO, textDTO, indicatorDTO2, f7, tVar2);
        }

        @NotNull
        /* renamed from: copy-2lqI77k, reason: not valid java name */
        public final CartTabItem m701copy2lqI77k(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull IndicatorDTO indicator, float aspectPadding, t tokenizedEvent) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            return new CartTabItem(wrapper, title, indicator, aspectPadding, tokenizedEvent, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartTabItem)) {
                return false;
            }
            CartTabItem cartTabItem = (CartTabItem) other;
            return Intrinsics.d(this.wrapper, cartTabItem.wrapper) && Intrinsics.d(this.title, cartTabItem.title) && Intrinsics.d(this.indicator, cartTabItem.indicator) && h.b(this.aspectPadding, cartTabItem.aspectPadding) && Intrinsics.d(this.tokenizedEvent, cartTabItem.tokenizedEvent);
        }

        /* renamed from: getAspectPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getAspectPadding() {
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

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @NotNull
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        public int hashCode() {
            int a11 = b.a(this.aspectPadding, (this.indicator.hashCode() + Ns.b.a(this.title, this.wrapper.hashCode() * 31, 31)) * 31, 31);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            AspectDTO aspectDTO = this.wrapper;
            TextDTO textDTO = this.title;
            IndicatorDTO indicatorDTO = this.indicator;
            String c11 = h.c(this.aspectPadding);
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("CartTabItem(wrapper=");
            sb2.append(aspectDTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", indicator=");
            sb2.append(indicatorDTO);
            sb2.append(", aspectPadding=");
            sb2.append(c11);
            sb2.append(", tokenizedEvent=");
            return Tl.b.d(sb2, tVar, ")");
        }

        private CartTabItem(AspectDTO wrapper, TextDTO title, IndicatorDTO indicator, float f7, t tVar) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(indicator, "indicator");
            this.wrapper = wrapper;
            this.title = title;
            this.indicator = indicator;
            this.aspectPadding = f7;
            this.tokenizedEvent = tVar;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTabs/presentation/CartTabsVO$Spacers;", "", "LZ1/h;", "top", "bottom", "left", "right", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getTop-D9Ej5fM", "()F", "getBottom-D9Ej5fM", "getLeft-D9Ej5fM", "getRight-D9Ej5fM", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        public /* synthetic */ Spacers(float f7, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
            this(f7, f11, f12, f13);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return h.b(this.top, spacers.top) && h.b(this.bottom, spacers.bottom) && h.b(this.left, spacers.left) && h.b(this.right, spacers.right);
        }

        /* renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
        public final float getBottom() {
            return this.bottom;
        }

        /* renamed from: getLeft-D9Ej5fM, reason: not valid java name and from getter */
        public final float getLeft() {
            return this.left;
        }

        /* renamed from: getRight-D9Ej5fM, reason: not valid java name and from getter */
        public final float getRight() {
            return this.right;
        }

        /* renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
        public final float getTop() {
            return this.top;
        }

        public int hashCode() {
            return Float.hashCode(this.right) + b.a(this.left, b.a(this.bottom, Float.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            String c11 = h.c(this.top);
            String c12 = h.c(this.bottom);
            return C3173b.c(C3660k.d("Spacers(top=", c11, ", bottom=", c12, ", left="), h.c(this.left), ", right=", h.c(this.right), ")");
        }

        private Spacers(float f7, float f11, float f12, float f13) {
            this.top = f7;
            this.bottom = f11;
            this.left = f12;
            this.right = f13;
        }
    }

    public CartTabsVO(long j11, @NotNull List<CartTabItem> items, @NotNull Spacers spacers, t tVar, int i11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.items = items;
        this.spacers = spacers;
        this.tokenizedEvent = tVar;
        this.currentSelectedTab = i11;
    }

    public static /* synthetic */ CartTabsVO copy$default(CartTabsVO cartTabsVO, long j11, List list, Spacers spacers, t tVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = cartTabsVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = cartTabsVO.items;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            spacers = cartTabsVO.spacers;
        }
        Spacers spacers2 = spacers;
        if ((i12 & 8) != 0) {
            tVar = cartTabsVO.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i12 & 16) != 0) {
            i11 = cartTabsVO.currentSelectedTab;
        }
        return cartTabsVO.copy(j12, list2, spacers2, tVar2, i11);
    }

    @NotNull
    public final CartTabsVO copy(long id2, @NotNull List<CartTabItem> items, @NotNull Spacers spacers, t tokenizedEvent, int currentSelectedTab) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        return new CartTabsVO(id2, items, spacers, tokenizedEvent, currentSelectedTab);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartTabsVO)) {
            return false;
        }
        CartTabsVO cartTabsVO = (CartTabsVO) other;
        return this.id == cartTabsVO.id && Intrinsics.d(this.items, cartTabsVO.items) && Intrinsics.d(this.spacers, cartTabsVO.spacers) && Intrinsics.d(this.tokenizedEvent, cartTabsVO.tokenizedEvent) && this.currentSelectedTab == cartTabsVO.currentSelectedTab;
    }

    public final int getCurrentSelectedTab() {
        return this.currentSelectedTab;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<CartTabItem> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.spacers.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.items)) * 31;
        t tVar = this.tokenizedEvent;
        return Integer.hashCode(this.currentSelectedTab) + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<CartTabItem> list = this.items;
        Spacers spacers = this.spacers;
        t tVar = this.tokenizedEvent;
        int i11 = this.currentSelectedTab;
        StringBuilder b11 = Lh.b.b(j11, "CartTabsVO(id=", ", items=", list);
        b11.append(", spacers=");
        b11.append(spacers);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        return D3.h.b(b11, ", currentSelectedTab=", i11, ")");
    }
}
