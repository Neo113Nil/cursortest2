package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation;

import G.g;
import Lh.b;
import N3.C3660k;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002'(B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "leftButtons", "rightButtons", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$ButtonsColors;", "buttonsColors", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$WidgetBackground;", "background", "<init>", "(JLjava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$ButtonsColors;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$WidgetBackground;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$ButtonsColors;", "getButtonsColors", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$ButtonsColors;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$WidgetBackground;", "getBackground", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$WidgetBackground;", "ButtonsColors", "WidgetBackground", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderNavBarVO implements c {

    @NotNull
    private final WidgetBackground background;

    @NotNull
    private final ButtonsColors buttonsColors;
    private final long id;

    @NotNull
    private final List<IconButtonV3DTO> leftButtons;

    @NotNull
    private final List<IconButtonV3DTO> rightButtons;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$ButtonsColors;", "", "", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "collapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExpanded", "getCollapsed", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsColors {

        @NotNull
        private final String collapsed;

        @NotNull
        private final String expanded;

        public ButtonsColors(@NotNull String expanded, @NotNull String collapsed) {
            Intrinsics.checkNotNullParameter(expanded, "expanded");
            Intrinsics.checkNotNullParameter(collapsed, "collapsed");
            this.expanded = expanded;
            this.collapsed = collapsed;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonsColors)) {
                return false;
            }
            ButtonsColors buttonsColors = (ButtonsColors) other;
            return Intrinsics.d(this.expanded, buttonsColors.expanded) && Intrinsics.d(this.collapsed, buttonsColors.collapsed);
        }

        @NotNull
        public final String getCollapsed() {
            return this.collapsed;
        }

        @NotNull
        public final String getExpanded() {
            return this.expanded;
        }

        public int hashCode() {
            return this.collapsed.hashCode() + (this.expanded.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ButtonsColors(expanded=", this.expanded, ", collapsed=", this.collapsed, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/presentation/OrderNavBarVO$WidgetBackground;", "", "", "image", "token", "Lru/ozon/uni/core/UniGradient;", "customGradient", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/core/UniGradient;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getToken", "Lru/ozon/uni/core/UniGradient;", "getCustomGradient", "()Lru/ozon/uni/core/UniGradient;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetBackground {
        public static final int $stable = UniGradient.$stable;
        private final UniGradient customGradient;
        private final String image;
        private final String token;

        public WidgetBackground(String str, String str2, UniGradient uniGradient) {
            this.image = str;
            this.token = str2;
            this.customGradient = uniGradient;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetBackground)) {
                return false;
            }
            WidgetBackground widgetBackground = (WidgetBackground) other;
            return Intrinsics.d(this.image, widgetBackground.image) && Intrinsics.d(this.token, widgetBackground.token) && Intrinsics.d(this.customGradient, widgetBackground.customGradient);
        }

        public final UniGradient getCustomGradient() {
            return this.customGradient;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            String str = this.image;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.token;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniGradient uniGradient = this.customGradient;
            return hashCode2 + (uniGradient != null ? uniGradient.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            String str2 = this.token;
            UniGradient uniGradient = this.customGradient;
            StringBuilder d11 = C3660k.d("WidgetBackground(image=", str, ", token=", str2, ", customGradient=");
            d11.append(uniGradient);
            d11.append(")");
            return d11.toString();
        }
    }

    public OrderNavBarVO(long j11, @NotNull List<IconButtonV3DTO> leftButtons, @NotNull List<IconButtonV3DTO> rightButtons, @NotNull ButtonsColors buttonsColors, @NotNull WidgetBackground background) {
        Intrinsics.checkNotNullParameter(leftButtons, "leftButtons");
        Intrinsics.checkNotNullParameter(rightButtons, "rightButtons");
        Intrinsics.checkNotNullParameter(buttonsColors, "buttonsColors");
        Intrinsics.checkNotNullParameter(background, "background");
        this.id = j11;
        this.leftButtons = leftButtons;
        this.rightButtons = rightButtons;
        this.buttonsColors = buttonsColors;
        this.background = background;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderNavBarVO)) {
            return false;
        }
        OrderNavBarVO orderNavBarVO = (OrderNavBarVO) other;
        return this.id == orderNavBarVO.id && Intrinsics.d(this.leftButtons, orderNavBarVO.leftButtons) && Intrinsics.d(this.rightButtons, orderNavBarVO.rightButtons) && Intrinsics.d(this.buttonsColors, orderNavBarVO.buttonsColors) && Intrinsics.d(this.background, orderNavBarVO.background);
    }

    @NotNull
    public final WidgetBackground getBackground() {
        return this.background;
    }

    @NotNull
    public final ButtonsColors getButtonsColors() {
        return this.buttonsColors;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<IconButtonV3DTO> getLeftButtons() {
        return this.leftButtons;
    }

    @NotNull
    public final List<IconButtonV3DTO> getRightButtons() {
        return this.rightButtons;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.background.hashCode() + ((this.buttonsColors.hashCode() + g.b(g.b(Long.hashCode(this.id) * 31, 31, this.leftButtons), 31, this.rightButtons)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<IconButtonV3DTO> list = this.leftButtons;
        List<IconButtonV3DTO> list2 = this.rightButtons;
        ButtonsColors buttonsColors = this.buttonsColors;
        WidgetBackground widgetBackground = this.background;
        StringBuilder b11 = b.b(j11, "OrderNavBarVO(id=", ", leftButtons=", list);
        b11.append(", rightButtons=");
        b11.append(list2);
        b11.append(", buttonsColors=");
        b11.append(buttonsColors);
        b11.append(", background=");
        b11.append(widgetBackground);
        b11.append(")");
        return b11.toString();
    }
}
