package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import F3.G;
import I0.C3173b;
import Pk0.b;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;", "", "Button", "IconButton", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$Button;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$IconButton;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeShareButton {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$Button;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Button implements BarcodeShareButton {

        @NotNull
        private final ButtonV3DTO button;

        public Button(@NotNull ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Button) && Intrinsics.d(this.button, ((Button) other).button);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public int hashCode() {
            return this.button.hashCode();
        }

        @NotNull
        public String toString() {
            return G.b(this.button, "Button(button=", ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton$IconButton;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "LZ1/h;", "cutoutCornerRadius", "cutoutFilletRadius", "contentPadding", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "F", "getCutoutCornerRadius-D9Ej5fM", "()F", "getCutoutFilletRadius-D9Ej5fM", "getContentPadding-D9Ej5fM", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconButton implements BarcodeShareButton {
        public static final int $stable = IconButtonV3DTO.$stable;
        private final float contentPadding;
        private final float cutoutCornerRadius;
        private final float cutoutFilletRadius;

        @NotNull
        private final IconButtonV3DTO iconButton;

        public /* synthetic */ IconButton(IconButtonV3DTO iconButtonV3DTO, float f7, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
            this(iconButtonV3DTO, f7, f11, f12);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconButton)) {
                return false;
            }
            IconButton iconButton = (IconButton) other;
            return Intrinsics.d(this.iconButton, iconButton.iconButton) && h.b(this.cutoutCornerRadius, iconButton.cutoutCornerRadius) && h.b(this.cutoutFilletRadius, iconButton.cutoutFilletRadius) && h.b(this.contentPadding, iconButton.contentPadding);
        }

        /* renamed from: getContentPadding-D9Ej5fM, reason: not valid java name and from getter */
        public final float getContentPadding() {
            return this.contentPadding;
        }

        /* renamed from: getCutoutCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCutoutCornerRadius() {
            return this.cutoutCornerRadius;
        }

        /* renamed from: getCutoutFilletRadius-D9Ej5fM, reason: not valid java name and from getter */
        public final float getCutoutFilletRadius() {
            return this.cutoutFilletRadius;
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public int hashCode() {
            return Float.hashCode(this.contentPadding) + b.a(this.cutoutFilletRadius, b.a(this.cutoutCornerRadius, this.iconButton.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            String c11 = h.c(this.cutoutCornerRadius);
            String c12 = h.c(this.cutoutFilletRadius);
            String c13 = h.c(this.contentPadding);
            StringBuilder sb2 = new StringBuilder("IconButton(iconButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", cutoutCornerRadius=");
            sb2.append(c11);
            sb2.append(", cutoutFilletRadius=");
            return C3173b.c(sb2, c12, ", contentPadding=", c13, ")");
        }

        private IconButton(IconButtonV3DTO iconButton, float f7, float f11, float f12) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            this.iconButton = iconButton;
            this.cutoutCornerRadius = f7;
            this.cutoutFilletRadius = f11;
            this.contentPadding = f12;
        }
    }
}
