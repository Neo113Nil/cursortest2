package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.presentation;

import Am.C2438a;
import B0.C2454a;
import G.g;
import J0.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonebuttonbar.data.OrderDoneButtonBarDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0001.BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttons", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;", "padding", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;", "buttonsLayout", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;", "getPadding", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;", "getButtonsLayout", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/data/OrderDoneButtonBarDTO$ButtonsLayout;", "PaddingVO", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDoneButtonBarVO implements c {
    private final BadgeDTO badge;

    @NotNull
    private final List<AtomDTO> buttons;

    @NotNull
    private final OrderDoneButtonBarDTO.ButtonsLayout buttonsLayout;
    private final long id;

    @NotNull
    private final PaddingVO padding;
    private final TextDTO subtitle;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonebuttonbar/presentation/OrderDoneButtonBarVO$PaddingVO;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getTop", "getRight", "getBottom", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingVO {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public PaddingVO(int i11, int i12, int i13, int i14) {
            this.left = i11;
            this.top = i12;
            this.right = i13;
            this.bottom = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingVO)) {
                return false;
            }
            PaddingVO paddingVO = (PaddingVO) other;
            return this.left == paddingVO.left && this.top == paddingVO.top && this.right == paddingVO.right && this.bottom == paddingVO.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.right, C2454a.a(this.top, Integer.hashCode(this.left) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.right, this.bottom, ", bottom=", ")", C2438a.a("PaddingVO(left=", this.left, ", top=", ", right=", this.top));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderDoneButtonBarVO(long j11, BadgeDTO badgeDTO, @NotNull List<? extends AtomDTO> buttons, TextDTO textDTO, @NotNull PaddingVO padding, @NotNull OrderDoneButtonBarDTO.ButtonsLayout buttonsLayout) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(buttonsLayout, "buttonsLayout");
        this.id = j11;
        this.badge = badgeDTO;
        this.buttons = buttons;
        this.subtitle = textDTO;
        this.padding = padding;
        this.buttonsLayout = buttonsLayout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDoneButtonBarVO)) {
            return false;
        }
        OrderDoneButtonBarVO orderDoneButtonBarVO = (OrderDoneButtonBarVO) other;
        return this.id == orderDoneButtonBarVO.id && Intrinsics.d(this.badge, orderDoneButtonBarVO.badge) && Intrinsics.d(this.buttons, orderDoneButtonBarVO.buttons) && Intrinsics.d(this.subtitle, orderDoneButtonBarVO.subtitle) && Intrinsics.d(this.padding, orderDoneButtonBarVO.padding) && this.buttonsLayout == orderDoneButtonBarVO.buttonsLayout;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final OrderDoneButtonBarDTO.ButtonsLayout getButtonsLayout() {
        return this.buttonsLayout;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PaddingVO getPadding() {
        return this.padding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        BadgeDTO badgeDTO = this.badge;
        int b11 = g.b((hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.buttons);
        TextDTO textDTO = this.subtitle;
        return this.buttonsLayout.hashCode() + ((this.padding.hashCode() + ((b11 + (textDTO != null ? textDTO.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "OrderDoneButtonBarVO(id=" + this.id + ", badge=" + this.badge + ", buttons=" + this.buttons + ", subtitle=" + this.subtitle + ", padding=" + this.padding + ", buttonsLayout=" + this.buttonsLayout + ")";
    }
}
