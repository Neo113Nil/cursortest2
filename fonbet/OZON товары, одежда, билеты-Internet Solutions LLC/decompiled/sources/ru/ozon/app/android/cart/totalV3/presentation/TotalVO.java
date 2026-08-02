package ru.ozon.app.android.cart.totalV3.presentation;

import Am.C2438a;
import B0.C2454a;
import Cm.e;
import G.g;
import Kk.C3532b;
import T7.Z;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002%&B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "items", "", "showRoundedHeader", "prefetch", "<init>", "(JLjava/util/List;ZLjava/lang/Boolean;)V", "copy", "(JLjava/util/List;ZLjava/lang/Boolean;)Lru/ozon/app/android/cart/totalV3/presentation/TotalVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Z", "getShowRoundedHeader", "()Z", "Ljava/lang/Boolean;", "getPrefetch", "()Ljava/lang/Boolean;", "TotalItemVO", "HorizontalMarginsVO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalVO implements c {
    private final long id;

    @NotNull
    private final List<TotalItemVO> items;
    private final Boolean prefetch;
    private final boolean showRoundedHeader;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "", "", "marginLeft", "marginRight", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMarginLeft", "getMarginRight", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HorizontalMarginsVO {
        private final int marginLeft;
        private final int marginRight;

        public HorizontalMarginsVO(int i11, int i12) {
            this.marginLeft = i11;
            this.marginRight = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalMarginsVO)) {
                return false;
            }
            HorizontalMarginsVO horizontalMarginsVO = (HorizontalMarginsVO) other;
            return this.marginLeft == horizontalMarginsVO.marginLeft && this.marginRight == horizontalMarginsVO.marginRight;
        }

        public final int getMarginLeft() {
            return this.marginLeft;
        }

        public final int getMarginRight() {
            return this.marginRight;
        }

        public int hashCode() {
            return Integer.hashCode(this.marginRight) + (Integer.hashCode(this.marginLeft) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("HorizontalMarginsVO(marginLeft=", this.marginLeft, ", marginRight=", ")", this.marginRight);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "", "id", "", "getId", "()J", "TotalButtonVO", "TotalTextVO", "PriceBlockVO", "SpaceVO", "PriceLineVO", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$SpaceVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$TotalButtonVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$TotalTextVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TotalItemVO {

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0004%&'(B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "", "id", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$PriceCardVO;", "leftPriceCart", "rightPriceCart", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$DividerVO;", "divider", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "margins", "<init>", "(JLru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$PriceCardVO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$PriceCardVO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$DividerVO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$PriceCardVO;", "getLeftPriceCart", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$PriceCardVO;", "getRightPriceCart", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$DividerVO;", "getDivider", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$DividerVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "PriceCardVO", "DividerVO", "TextWithIconVO", "IconWithPositionVO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceBlockVO implements TotalItemVO {
            public static final int $stable;
            private final DividerVO divider;
            private final long id;

            @NotNull
            private final PriceCardVO leftPriceCart;
            private final HorizontalMarginsVO margins;
            private final PriceCardVO rightPriceCart;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$DividerVO;", "", "", "height", "width", "", "color", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "margins", "<init>", "(IILjava/lang/String;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHeight", "getWidth", "Ljava/lang/String;", "getColor", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class DividerVO {

                @NotNull
                private final String color;
                private final int height;

                @NotNull
                private final HorizontalMarginsVO margins;
                private final int width;

                public DividerVO(int i11, int i12, @NotNull String color, @NotNull HorizontalMarginsVO margins) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    Intrinsics.checkNotNullParameter(margins, "margins");
                    this.height = i11;
                    this.width = i12;
                    this.color = color;
                    this.margins = margins;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DividerVO)) {
                        return false;
                    }
                    DividerVO dividerVO = (DividerVO) other;
                    return this.height == dividerVO.height && this.width == dividerVO.width && Intrinsics.d(this.color, dividerVO.color) && Intrinsics.d(this.margins, dividerVO.margins);
                }

                @NotNull
                public final String getColor() {
                    return this.color;
                }

                public final int getHeight() {
                    return this.height;
                }

                @NotNull
                public final HorizontalMarginsVO getMargins() {
                    return this.margins;
                }

                public final int getWidth() {
                    return this.width;
                }

                public int hashCode() {
                    return this.margins.hashCode() + g.a(C2454a.a(this.width, Integer.hashCode(this.height) * 31, 31), 31, this.color);
                }

                @NotNull
                public String toString() {
                    int i11 = this.height;
                    int i12 = this.width;
                    String str = this.color;
                    HorizontalMarginsVO horizontalMarginsVO = this.margins;
                    StringBuilder a11 = C2438a.a("DividerVO(height=", i11, ", width=", ", color=", i12);
                    a11.append(str);
                    a11.append(", margins=");
                    a11.append(horizontalMarginsVO);
                    a11.append(")");
                    return a11.toString();
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO$PositionVO;", "position", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO$PositionVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO$PositionVO;", "getPosition", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO$PositionVO;", "PositionVO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class IconWithPositionVO {
                public static final int $stable = IconDTO.$stable;

                @NotNull
                private final IconDTO icon;

                @NotNull
                private final PositionVO position;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO$PositionVO;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class PositionVO {
                    private static final /* synthetic */ a $ENTRIES;
                    private static final /* synthetic */ PositionVO[] $VALUES;
                    public static final PositionVO START = new PositionVO("START", 0);
                    public static final PositionVO END = new PositionVO("END", 1);

                    private static final /* synthetic */ PositionVO[] $values() {
                        return new PositionVO[]{START, END};
                    }

                    static {
                        PositionVO[] $values = $values();
                        $VALUES = $values;
                        $ENTRIES = b.a($values);
                    }

                    private PositionVO(String str, int i11) {
                    }

                    public static PositionVO valueOf(String str) {
                        return (PositionVO) Enum.valueOf(PositionVO.class, str);
                    }

                    public static PositionVO[] values() {
                        return (PositionVO[]) $VALUES.clone();
                    }
                }

                public IconWithPositionVO(@NotNull IconDTO icon, @NotNull PositionVO position) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(position, "position");
                    this.icon = icon;
                    this.position = position;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof IconWithPositionVO)) {
                        return false;
                    }
                    IconWithPositionVO iconWithPositionVO = (IconWithPositionVO) other;
                    return Intrinsics.d(this.icon, iconWithPositionVO.icon) && this.position == iconWithPositionVO.position;
                }

                @NotNull
                public final IconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                public final PositionVO getPosition() {
                    return this.position;
                }

                public int hashCode() {
                    return this.position.hashCode() + (this.icon.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "IconWithPositionVO(icon=" + this.icon + ", position=" + this.position + ")";
                }
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b)\u0010&¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$PriceCardVO;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$TextWithIconVO;", "textWithIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "backgroundColor", "", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$TextWithIconVO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$TextWithIconVO;", "getTextWithIcon", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$TextWithIconVO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getBackgroundColor", "Ljava/lang/Integer;", "getTopPadding", "()Ljava/lang/Integer;", "getBottomPadding", "getLeftPadding", "getRightPadding", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PriceCardVO {
                public static final int $stable = (AtomAction.$stable | IconDTO.$stable) | PriceDTO.$stable;
                private final AtomAction action;
                private final String backgroundColor;
                private final Integer bottomPadding;
                private final Integer leftPadding;

                @NotNull
                private final PriceDTO price;
                private final Integer rightPadding;

                @NotNull
                private final TextWithIconVO textWithIcon;
                private final Integer topPadding;

                public PriceCardVO(@NotNull PriceDTO price, @NotNull TextWithIconVO textWithIcon, AtomAction atomAction, String str, Integer num, Integer num2, Integer num3, Integer num4) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    Intrinsics.checkNotNullParameter(textWithIcon, "textWithIcon");
                    this.price = price;
                    this.textWithIcon = textWithIcon;
                    this.action = atomAction;
                    this.backgroundColor = str;
                    this.topPadding = num;
                    this.bottomPadding = num2;
                    this.leftPadding = num3;
                    this.rightPadding = num4;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PriceCardVO)) {
                        return false;
                    }
                    PriceCardVO priceCardVO = (PriceCardVO) other;
                    return Intrinsics.d(this.price, priceCardVO.price) && Intrinsics.d(this.textWithIcon, priceCardVO.textWithIcon) && Intrinsics.d(this.action, priceCardVO.action) && Intrinsics.d(this.backgroundColor, priceCardVO.backgroundColor) && Intrinsics.d(this.topPadding, priceCardVO.topPadding) && Intrinsics.d(this.bottomPadding, priceCardVO.bottomPadding) && Intrinsics.d(this.leftPadding, priceCardVO.leftPadding) && Intrinsics.d(this.rightPadding, priceCardVO.rightPadding);
                }

                public final AtomAction getAction() {
                    return this.action;
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final Integer getBottomPadding() {
                    return this.bottomPadding;
                }

                public final Integer getLeftPadding() {
                    return this.leftPadding;
                }

                @NotNull
                public final PriceDTO getPrice() {
                    return this.price;
                }

                public final Integer getRightPadding() {
                    return this.rightPadding;
                }

                @NotNull
                public final TextWithIconVO getTextWithIcon() {
                    return this.textWithIcon;
                }

                public final Integer getTopPadding() {
                    return this.topPadding;
                }

                public int hashCode() {
                    int hashCode = (this.textWithIcon.hashCode() + (this.price.hashCode() * 31)) * 31;
                    AtomAction atomAction = this.action;
                    int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                    String str = this.backgroundColor;
                    int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num = this.topPadding;
                    int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.bottomPadding;
                    int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.leftPadding;
                    int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Integer num4 = this.rightPadding;
                    return hashCode6 + (num4 != null ? num4.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    PriceDTO priceDTO = this.price;
                    TextWithIconVO textWithIconVO = this.textWithIcon;
                    AtomAction atomAction = this.action;
                    String str = this.backgroundColor;
                    Integer num = this.topPadding;
                    Integer num2 = this.bottomPadding;
                    Integer num3 = this.leftPadding;
                    Integer num4 = this.rightPadding;
                    StringBuilder sb2 = new StringBuilder("PriceCardVO(price=");
                    sb2.append(priceDTO);
                    sb2.append(", textWithIcon=");
                    sb2.append(textWithIconVO);
                    sb2.append(", action=");
                    sb2.append(atomAction);
                    sb2.append(", backgroundColor=");
                    sb2.append(str);
                    sb2.append(", topPadding=");
                    Ef0.c.e(sb2, num, ", bottomPadding=", num2, ", leftPadding=");
                    return Z.c(sb2, num3, ", rightPadding=", num4, ")");
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$TextWithIconVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO;", "iconWithPosition", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO;", "getIconWithPosition", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TextWithIconVO {
                public static final int $stable = IconDTO.$stable;
                private final IconWithPositionVO iconWithPosition;

                @NotNull
                private final TextDTO text;

                public TextWithIconVO(@NotNull TextDTO text, IconWithPositionVO iconWithPositionVO) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.iconWithPosition = iconWithPositionVO;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TextWithIconVO)) {
                        return false;
                    }
                    TextWithIconVO textWithIconVO = (TextWithIconVO) other;
                    return Intrinsics.d(this.text, textWithIconVO.text) && Intrinsics.d(this.iconWithPosition, textWithIconVO.iconWithPosition);
                }

                public final IconWithPositionVO getIconWithPosition() {
                    return this.iconWithPosition;
                }

                @NotNull
                public final TextDTO getText() {
                    return this.text;
                }

                public int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    IconWithPositionVO iconWithPositionVO = this.iconWithPosition;
                    return hashCode + (iconWithPositionVO == null ? 0 : iconWithPositionVO.hashCode());
                }

                @NotNull
                public String toString() {
                    return "TextWithIconVO(text=" + this.text + ", iconWithPosition=" + this.iconWithPosition + ")";
                }
            }

            static {
                int i11 = AtomAction.$stable;
                int i12 = IconDTO.$stable;
                int i13 = PriceDTO.$stable;
                $stable = i11 | i11 | i12 | i13 | i12 | i13;
            }

            public PriceBlockVO(long j11, @NotNull PriceCardVO leftPriceCart, PriceCardVO priceCardVO, DividerVO dividerVO, HorizontalMarginsVO horizontalMarginsVO) {
                Intrinsics.checkNotNullParameter(leftPriceCart, "leftPriceCart");
                this.id = j11;
                this.leftPriceCart = leftPriceCart;
                this.rightPriceCart = priceCardVO;
                this.divider = dividerVO;
                this.margins = horizontalMarginsVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceBlockVO)) {
                    return false;
                }
                PriceBlockVO priceBlockVO = (PriceBlockVO) other;
                return this.id == priceBlockVO.id && Intrinsics.d(this.leftPriceCart, priceBlockVO.leftPriceCart) && Intrinsics.d(this.rightPriceCart, priceBlockVO.rightPriceCart) && Intrinsics.d(this.divider, priceBlockVO.divider) && Intrinsics.d(this.margins, priceBlockVO.margins);
            }

            public final DividerVO getDivider() {
                return this.divider;
            }

            @Override // ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO
            public long getId() {
                return this.id;
            }

            @NotNull
            public final PriceCardVO getLeftPriceCart() {
                return this.leftPriceCart;
            }

            public final HorizontalMarginsVO getMargins() {
                return this.margins;
            }

            public final PriceCardVO getRightPriceCart() {
                return this.rightPriceCart;
            }

            public int hashCode() {
                int hashCode = (this.leftPriceCart.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
                PriceCardVO priceCardVO = this.rightPriceCart;
                int hashCode2 = (hashCode + (priceCardVO == null ? 0 : priceCardVO.hashCode())) * 31;
                DividerVO dividerVO = this.divider;
                int hashCode3 = (hashCode2 + (dividerVO == null ? 0 : dividerVO.hashCode())) * 31;
                HorizontalMarginsVO horizontalMarginsVO = this.margins;
                return hashCode3 + (horizontalMarginsVO != null ? horizontalMarginsVO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "PriceBlockVO(id=" + this.id + ", leftPriceCart=" + this.leftPriceCart + ", rightPriceCart=" + this.rightPriceCart + ", divider=" + this.divider + ", margins=" + this.margins + ")";
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "", "id", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceLinePartVO;", "left", "right", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "margins", "<init>", "(JLru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceLinePartVO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceLinePartVO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceLinePartVO;", "getLeft", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceLinePartVO;", "getRight", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "PriceLinePartVO", "PriceWithCommonVO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceLineVO implements TotalItemVO {
            public static final int $stable;
            private final long id;
            private final PriceLinePartVO left;
            private final HorizontalMarginsVO margins;
            private final PriceLinePartVO right;

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceLinePartVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceWithCommonVO;", "priceWithCommon", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceWithCommonVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceWithCommonVO;", "getPriceWithCommon", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceWithCommonVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PriceLinePartVO {
                public static final int $stable = AtomAction.$stable | PriceDTO.$stable;
                private final PriceWithCommonVO priceWithCommon;
                private final TextDTO text;

                public PriceLinePartVO(TextDTO textDTO, PriceWithCommonVO priceWithCommonVO) {
                    this.text = textDTO;
                    this.priceWithCommon = priceWithCommonVO;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PriceLinePartVO)) {
                        return false;
                    }
                    PriceLinePartVO priceLinePartVO = (PriceLinePartVO) other;
                    return Intrinsics.d(this.text, priceLinePartVO.text) && Intrinsics.d(this.priceWithCommon, priceLinePartVO.priceWithCommon);
                }

                public final PriceWithCommonVO getPriceWithCommon() {
                    return this.priceWithCommon;
                }

                public final TextDTO getText() {
                    return this.text;
                }

                public int hashCode() {
                    TextDTO textDTO = this.text;
                    int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                    PriceWithCommonVO priceWithCommonVO = this.priceWithCommon;
                    return hashCode + (priceWithCommonVO != null ? priceWithCommonVO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PriceLinePartVO(text=" + this.text + ", priceWithCommon=" + this.priceWithCommon + ")";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceWithCommonVO;", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PriceWithCommonVO {
                public static final int $stable = AtomAction.$stable | PriceDTO.$stable;
                private final AtomAction action;

                @NotNull
                private final PriceDTO price;

                public PriceWithCommonVO(@NotNull PriceDTO price, AtomAction atomAction) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    this.price = price;
                    this.action = atomAction;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PriceWithCommonVO)) {
                        return false;
                    }
                    PriceWithCommonVO priceWithCommonVO = (PriceWithCommonVO) other;
                    return Intrinsics.d(this.price, priceWithCommonVO.price) && Intrinsics.d(this.action, priceWithCommonVO.action);
                }

                public final AtomAction getAction() {
                    return this.action;
                }

                @NotNull
                public final PriceDTO getPrice() {
                    return this.price;
                }

                public int hashCode() {
                    int hashCode = this.price.hashCode() * 31;
                    AtomAction atomAction = this.action;
                    return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
                }

                @NotNull
                public String toString() {
                    return "PriceWithCommonVO(price=" + this.price + ", action=" + this.action + ")";
                }
            }

            static {
                int i11 = AtomAction.$stable;
                int i12 = PriceDTO.$stable;
                $stable = i11 | i11 | i12 | i12;
            }

            public PriceLineVO(long j11, PriceLinePartVO priceLinePartVO, PriceLinePartVO priceLinePartVO2, HorizontalMarginsVO horizontalMarginsVO) {
                this.id = j11;
                this.left = priceLinePartVO;
                this.right = priceLinePartVO2;
                this.margins = horizontalMarginsVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceLineVO)) {
                    return false;
                }
                PriceLineVO priceLineVO = (PriceLineVO) other;
                return this.id == priceLineVO.id && Intrinsics.d(this.left, priceLineVO.left) && Intrinsics.d(this.right, priceLineVO.right) && Intrinsics.d(this.margins, priceLineVO.margins);
            }

            @Override // ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO
            public long getId() {
                return this.id;
            }

            public final PriceLinePartVO getLeft() {
                return this.left;
            }

            public final HorizontalMarginsVO getMargins() {
                return this.margins;
            }

            public final PriceLinePartVO getRight() {
                return this.right;
            }

            public int hashCode() {
                int hashCode = Long.hashCode(this.id) * 31;
                PriceLinePartVO priceLinePartVO = this.left;
                int hashCode2 = (hashCode + (priceLinePartVO == null ? 0 : priceLinePartVO.hashCode())) * 31;
                PriceLinePartVO priceLinePartVO2 = this.right;
                int hashCode3 = (hashCode2 + (priceLinePartVO2 == null ? 0 : priceLinePartVO2.hashCode())) * 31;
                HorizontalMarginsVO horizontalMarginsVO = this.margins;
                return hashCode3 + (horizontalMarginsVO != null ? horizontalMarginsVO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "PriceLineVO(id=" + this.id + ", left=" + this.left + ", right=" + this.right + ", margins=" + this.margins + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$SpaceVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "", "id", "", "height", "<init>", "(JI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getHeight", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SpaceVO implements TotalItemVO {
            private final int height;
            private final long id;

            public SpaceVO(long j11, int i11) {
                this.id = j11;
                this.height = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SpaceVO)) {
                    return false;
                }
                SpaceVO spaceVO = (SpaceVO) other;
                return this.id == spaceVO.id && this.height == spaceVO.height;
            }

            public final int getHeight() {
                return this.height;
            }

            @Override // ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO
            public long getId() {
                return this.id;
            }

            public int hashCode() {
                return Integer.hashCode(this.height) + (Long.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder b11 = Ql.c.b(this.id, "SpaceVO(id=", this.height, ", height=");
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$TotalButtonVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "button", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "margins", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/DataButtonDTO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TotalButtonVO implements TotalItemVO {
            public static final int $stable = DataButtonDTO.$stable;

            @NotNull
            private final DataButtonDTO button;
            private final long id;
            private final HorizontalMarginsVO margins;

            public TotalButtonVO(long j11, @NotNull DataButtonDTO button, HorizontalMarginsVO horizontalMarginsVO) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.id = j11;
                this.button = button;
                this.margins = horizontalMarginsVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TotalButtonVO)) {
                    return false;
                }
                TotalButtonVO totalButtonVO = (TotalButtonVO) other;
                return this.id == totalButtonVO.id && Intrinsics.d(this.button, totalButtonVO.button) && Intrinsics.d(this.margins, totalButtonVO.margins);
            }

            @NotNull
            public final DataButtonDTO getButton() {
                return this.button;
            }

            @Override // ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO
            public long getId() {
                return this.id;
            }

            public final HorizontalMarginsVO getMargins() {
                return this.margins;
            }

            public int hashCode() {
                int hashCode = (this.button.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
                HorizontalMarginsVO horizontalMarginsVO = this.margins;
                return hashCode + (horizontalMarginsVO == null ? 0 : horizontalMarginsVO.hashCode());
            }

            @NotNull
            public String toString() {
                return "TotalButtonVO(id=" + this.id + ", button=" + this.button + ", margins=" + this.margins + ")";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$TotalTextVO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "margins", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TotalTextVO implements TotalItemVO {
            private final long id;
            private final HorizontalMarginsVO margins;

            @NotNull
            private final TextDTO text;

            public TotalTextVO(long j11, @NotNull TextDTO text, HorizontalMarginsVO horizontalMarginsVO) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.id = j11;
                this.text = text;
                this.margins = horizontalMarginsVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TotalTextVO)) {
                    return false;
                }
                TotalTextVO totalTextVO = (TotalTextVO) other;
                return this.id == totalTextVO.id && Intrinsics.d(this.text, totalTextVO.text) && Intrinsics.d(this.margins, totalTextVO.margins);
            }

            @Override // ru.ozon.app.android.cart.totalV3.presentation.TotalVO.TotalItemVO
            public long getId() {
                return this.id;
            }

            public final HorizontalMarginsVO getMargins() {
                return this.margins;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.text, Long.hashCode(this.id) * 31, 31);
                HorizontalMarginsVO horizontalMarginsVO = this.margins;
                return a11 + (horizontalMarginsVO == null ? 0 : horizontalMarginsVO.hashCode());
            }

            @NotNull
            public String toString() {
                long j11 = this.id;
                TextDTO textDTO = this.text;
                HorizontalMarginsVO horizontalMarginsVO = this.margins;
                StringBuilder b11 = TY.a.b("TotalTextVO(id=", j11, ", text=", textDTO);
                b11.append(", margins=");
                b11.append(horizontalMarginsVO);
                b11.append(")");
                return b11.toString();
            }
        }

        long getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TotalVO(long j11, @NotNull List<? extends TotalItemVO> items, boolean z11, Boolean bool) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
        this.showRoundedHeader = z11;
        this.prefetch = bool;
    }

    public static /* synthetic */ TotalVO copy$default(TotalVO totalVO, long j11, List list, boolean z11, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = totalVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = totalVO.items;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            z11 = totalVO.showRoundedHeader;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            bool = totalVO.prefetch;
        }
        return totalVO.copy(j12, list2, z12, bool);
    }

    @NotNull
    public final TotalVO copy(long id2, @NotNull List<? extends TotalItemVO> items, boolean showRoundedHeader, Boolean prefetch) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new TotalVO(id2, items, showRoundedHeader, prefetch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalVO)) {
            return false;
        }
        TotalVO totalVO = (TotalVO) other;
        return this.id == totalVO.id && Intrinsics.d(this.items, totalVO.items) && this.showRoundedHeader == totalVO.showRoundedHeader && Intrinsics.d(this.prefetch, totalVO.prefetch);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<TotalItemVO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowRoundedHeader() {
        return this.showRoundedHeader;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.items), 31, this.showRoundedHeader);
        Boolean bool = this.prefetch;
        return a11 + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TotalItemVO> list = this.items;
        boolean z11 = this.showRoundedHeader;
        Boolean bool = this.prefetch;
        StringBuilder b11 = Lh.b.b(j11, "TotalVO(id=", ", items=", list);
        b11.append(", showRoundedHeader=");
        b11.append(z11);
        b11.append(", prefetch=");
        b11.append(bool);
        b11.append(")");
        return b11.toString();
    }
}
