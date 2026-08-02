package ru.ozon.app.android.cart.ui.tooltip;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "", "Companion", "TopCenter", "BottomCenter", "TopCustom", "BottomCustom", "Left", "Right", "Vertical", "Horizontal", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Horizontal;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CartTooltipBeakPosition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$BottomCenter;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical$Bottom;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomCenter implements Vertical.Bottom {

        @NotNull
        public static final BottomCenter INSTANCE = new BottomCenter();

        private BottomCenter() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BottomCenter);
        }

        public int hashCode() {
            return 1479150385;
        }

        @NotNull
        public String toString() {
            return "BottomCenter";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$BottomCustom;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical$Bottom;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BottomCustom implements Vertical.Bottom {

        @NotNull
        public static final BottomCustom INSTANCE = new BottomCustom();

        private BottomCustom() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof BottomCustom);
        }

        public int hashCode() {
            return 1494075981;
        }

        @NotNull
        public String toString() {
            return "BottomCustom";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Companion;", "", "<init>", "()V", "defaultCartTooltipBeakPosition", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$BottomCenter;", "getDefaultCartTooltipBeakPosition", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$BottomCenter;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final BottomCenter defaultCartTooltipBeakPosition = BottomCenter.INSTANCE;

        private Companion() {
        }

        @NotNull
        public final BottomCenter getDefaultCartTooltipBeakPosition() {
            return defaultCartTooltipBeakPosition;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Horizontal;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Left;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Right;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Horizontal extends CartTooltipBeakPosition {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Left;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Horizontal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Left implements Horizontal {

        @NotNull
        public static final Left INSTANCE = new Left();

        private Left() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Left);
        }

        public int hashCode() {
            return -256031272;
        }

        @NotNull
        public String toString() {
            return "Left";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Right;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Horizontal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Right implements Horizontal {

        @NotNull
        public static final Right INSTANCE = new Right();

        private Right() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Right);
        }

        public int hashCode() {
            return 658626155;
        }

        @NotNull
        public String toString() {
            return "Right";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$TopCenter;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical$Top;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopCenter implements Vertical.Top {

        @NotNull
        public static final TopCenter INSTANCE = new TopCenter();

        private TopCenter() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TopCenter);
        }

        public int hashCode() {
            return -1603290407;
        }

        @NotNull
        public String toString() {
            return "TopCenter";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$TopCustom;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical$Top;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TopCustom implements Vertical.Top {

        @NotNull
        public static final TopCustom INSTANCE = new TopCustom();

        private TopCustom() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TopCustom);
        }

        public int hashCode() {
            return -1588364811;
        }

        @NotNull
        public String toString() {
            return "TopCustom";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "Top", "Bottom", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical$Bottom;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical$Top;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Vertical extends CartTooltipBeakPosition {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical$Bottom;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$BottomCenter;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$BottomCustom;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Bottom extends Vertical {
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical$Top;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$Vertical;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$TopCenter;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition$TopCustom;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Top extends Vertical {
        }
    }
}
