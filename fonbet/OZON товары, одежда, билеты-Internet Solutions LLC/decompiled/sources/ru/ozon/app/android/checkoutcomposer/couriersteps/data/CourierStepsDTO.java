package ru.ozon.app.android.checkoutcomposer.couriersteps.data;

import Ef0.c;
import G.g;
import Nh.a;
import Tl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cBA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleIcon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "steps", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;", "settings", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSteps", "()Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;", "getSettings", "()Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "StepsDTO", "SettingsDTO", "Padding", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierStepsDTO {
    public static final int $stable = 8;
    private final SettingsDTO settings;

    @NotNull
    private final StepsDTO steps;

    @NotNull
    private final TextDTO title;
    private final IconButtonV3DTO titleIcon;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;", "", "top", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTop", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Padding {
        public static final int $stable = 0;

        @NotNull
        private final CommonCellSettings.LayoutPadding bottom;

        @NotNull
        private final CommonCellSettings.LayoutPadding left;

        @NotNull
        private final CommonCellSettings.LayoutPadding right;

        @NotNull
        private final CommonCellSettings.LayoutPadding top;

        public Padding(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom, @NotNull CommonCellSettings.LayoutPadding left, @NotNull CommonCellSettings.LayoutPadding right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
        }

        public static /* synthetic */ Padding copy$default(Padding padding, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = padding.top;
            }
            if ((i11 & 2) != 0) {
                layoutPadding2 = padding.bottom;
            }
            if ((i11 & 4) != 0) {
                layoutPadding3 = padding.left;
            }
            if ((i11 & 8) != 0) {
                layoutPadding4 = padding.right;
            }
            return padding.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRight() {
            return this.right;
        }

        @NotNull
        public final Padding copy(@NotNull CommonCellSettings.LayoutPadding top, @NotNull CommonCellSettings.LayoutPadding bottom, @NotNull CommonCellSettings.LayoutPadding left, @NotNull CommonCellSettings.LayoutPadding right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return new Padding(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Padding)) {
                return false;
            }
            Padding padding = (Padding) other;
            return this.top == padding.top && this.bottom == padding.bottom && this.left == padding.left && this.right == padding.right;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getBottom() {
            return this.bottom;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getLeft() {
            return this.left;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getRight() {
            return this.right;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.right.hashCode() + c.a(this.left, c.a(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "Padding(top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$SettingsDTO;", "", "bgColor", "", "padding", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;", "outerBgColor", "outerPadding", "topCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topBorderColor", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;)V", "getBgColor", "()Ljava/lang/String;", "getPadding", "()Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$Padding;", "getOuterBgColor", "getOuterPadding", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopBorderColor", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        public static final int $stable = 0;

        @NotNull
        private final String bgColor;

        @NotNull
        private final String outerBgColor;

        @NotNull
        private final Padding outerPadding;

        @NotNull
        private final Padding padding;

        @NotNull
        private final String topBorderColor;

        @NotNull
        private final CornerRadius topCornerRadius;

        public SettingsDTO(@NotNull String bgColor, @NotNull Padding padding, @NotNull String outerBgColor, @NotNull Padding outerPadding, @NotNull CornerRadius topCornerRadius, @NotNull String topBorderColor) {
            Intrinsics.checkNotNullParameter(bgColor, "bgColor");
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(outerBgColor, "outerBgColor");
            Intrinsics.checkNotNullParameter(outerPadding, "outerPadding");
            Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
            Intrinsics.checkNotNullParameter(topBorderColor, "topBorderColor");
            this.bgColor = bgColor;
            this.padding = padding;
            this.outerBgColor = outerBgColor;
            this.outerPadding = outerPadding;
            this.topCornerRadius = topCornerRadius;
            this.topBorderColor = topBorderColor;
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, String str, Padding padding, String str2, Padding padding2, CornerRadius cornerRadius, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = settingsDTO.bgColor;
            }
            if ((i11 & 2) != 0) {
                padding = settingsDTO.padding;
            }
            if ((i11 & 4) != 0) {
                str2 = settingsDTO.outerBgColor;
            }
            if ((i11 & 8) != 0) {
                padding2 = settingsDTO.outerPadding;
            }
            if ((i11 & 16) != 0) {
                cornerRadius = settingsDTO.topCornerRadius;
            }
            if ((i11 & 32) != 0) {
                str3 = settingsDTO.topBorderColor;
            }
            CornerRadius cornerRadius2 = cornerRadius;
            String str4 = str3;
            return settingsDTO.copy(str, padding, str2, padding2, cornerRadius2, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Padding getPadding() {
            return this.padding;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getOuterBgColor() {
            return this.outerBgColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Padding getOuterPadding() {
            return this.outerPadding;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CornerRadius getTopCornerRadius() {
            return this.topCornerRadius;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getTopBorderColor() {
            return this.topBorderColor;
        }

        @NotNull
        public final SettingsDTO copy(@NotNull String bgColor, @NotNull Padding padding, @NotNull String outerBgColor, @NotNull Padding outerPadding, @NotNull CornerRadius topCornerRadius, @NotNull String topBorderColor) {
            Intrinsics.checkNotNullParameter(bgColor, "bgColor");
            Intrinsics.checkNotNullParameter(padding, "padding");
            Intrinsics.checkNotNullParameter(outerBgColor, "outerBgColor");
            Intrinsics.checkNotNullParameter(outerPadding, "outerPadding");
            Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
            Intrinsics.checkNotNullParameter(topBorderColor, "topBorderColor");
            return new SettingsDTO(bgColor, padding, outerBgColor, outerPadding, topCornerRadius, topBorderColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsDTO)) {
                return false;
            }
            SettingsDTO settingsDTO = (SettingsDTO) other;
            return Intrinsics.d(this.bgColor, settingsDTO.bgColor) && Intrinsics.d(this.padding, settingsDTO.padding) && Intrinsics.d(this.outerBgColor, settingsDTO.outerBgColor) && Intrinsics.d(this.outerPadding, settingsDTO.outerPadding) && this.topCornerRadius == settingsDTO.topCornerRadius && Intrinsics.d(this.topBorderColor, settingsDTO.topBorderColor);
        }

        @NotNull
        public final String getBgColor() {
            return this.bgColor;
        }

        @NotNull
        public final String getOuterBgColor() {
            return this.outerBgColor;
        }

        @NotNull
        public final Padding getOuterPadding() {
            return this.outerPadding;
        }

        @NotNull
        public final Padding getPadding() {
            return this.padding;
        }

        @NotNull
        public final String getTopBorderColor() {
            return this.topBorderColor;
        }

        @NotNull
        public final CornerRadius getTopCornerRadius() {
            return this.topCornerRadius;
        }

        public int hashCode() {
            return this.topBorderColor.hashCode() + b.b(this.topCornerRadius, (this.outerPadding.hashCode() + g.a((this.padding.hashCode() + (this.bgColor.hashCode() * 31)) * 31, 31, this.outerBgColor)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "SettingsDTO(bgColor=" + this.bgColor + ", padding=" + this.padding + ", outerBgColor=" + this.outerBgColor + ", outerPadding=" + this.outerPadding + ", topCornerRadius=" + this.topCornerRadius + ", topBorderColor=" + this.topBorderColor + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO;", "", "total", "Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO$StepsGroupDTO;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO$StepsGroupDTO;Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO$StepsGroupDTO;)V", "getTotal", "()Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO$StepsGroupDTO;", "getActive", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "StepsGroupDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class StepsDTO {
        public static final int $stable = 0;

        @NotNull
        private final StepsGroupDTO active;

        @NotNull
        private final StepsGroupDTO total;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/couriersteps/data/CourierStepsDTO$StepsDTO$StepsGroupDTO;", "", "count", "", "bgColor", "", "<init>", "(ILjava/lang/String;)V", "getCount", "()I", "getBgColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StepsGroupDTO {
            public static final int $stable = 0;

            @NotNull
            private final String bgColor;
            private final int count;

            public StepsGroupDTO(int i11, @NotNull String bgColor) {
                Intrinsics.checkNotNullParameter(bgColor, "bgColor");
                this.count = i11;
                this.bgColor = bgColor;
            }

            public static /* synthetic */ StepsGroupDTO copy$default(StepsGroupDTO stepsGroupDTO, int i11, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = stepsGroupDTO.count;
                }
                if ((i12 & 2) != 0) {
                    str = stepsGroupDTO.bgColor;
                }
                return stepsGroupDTO.copy(i11, str);
            }

            /* renamed from: component1, reason: from getter */
            public final int getCount() {
                return this.count;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getBgColor() {
                return this.bgColor;
            }

            @NotNull
            public final StepsGroupDTO copy(int count, @NotNull String bgColor) {
                Intrinsics.checkNotNullParameter(bgColor, "bgColor");
                return new StepsGroupDTO(count, bgColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StepsGroupDTO)) {
                    return false;
                }
                StepsGroupDTO stepsGroupDTO = (StepsGroupDTO) other;
                return this.count == stepsGroupDTO.count && Intrinsics.d(this.bgColor, stepsGroupDTO.bgColor);
            }

            @NotNull
            public final String getBgColor() {
                return this.bgColor;
            }

            public final int getCount() {
                return this.count;
            }

            public int hashCode() {
                return this.bgColor.hashCode() + (Integer.hashCode(this.count) * 31);
            }

            @NotNull
            public String toString() {
                return a.c(this.count, "StepsGroupDTO(count=", ", bgColor=", this.bgColor, ")");
            }
        }

        public StepsDTO(@NotNull StepsGroupDTO total, @NotNull StepsGroupDTO active) {
            Intrinsics.checkNotNullParameter(total, "total");
            Intrinsics.checkNotNullParameter(active, "active");
            this.total = total;
            this.active = active;
        }

        public static /* synthetic */ StepsDTO copy$default(StepsDTO stepsDTO, StepsGroupDTO stepsGroupDTO, StepsGroupDTO stepsGroupDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                stepsGroupDTO = stepsDTO.total;
            }
            if ((i11 & 2) != 0) {
                stepsGroupDTO2 = stepsDTO.active;
            }
            return stepsDTO.copy(stepsGroupDTO, stepsGroupDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final StepsGroupDTO getTotal() {
            return this.total;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final StepsGroupDTO getActive() {
            return this.active;
        }

        @NotNull
        public final StepsDTO copy(@NotNull StepsGroupDTO total, @NotNull StepsGroupDTO active) {
            Intrinsics.checkNotNullParameter(total, "total");
            Intrinsics.checkNotNullParameter(active, "active");
            return new StepsDTO(total, active);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepsDTO)) {
                return false;
            }
            StepsDTO stepsDTO = (StepsDTO) other;
            return Intrinsics.d(this.total, stepsDTO.total) && Intrinsics.d(this.active, stepsDTO.active);
        }

        @NotNull
        public final StepsGroupDTO getActive() {
            return this.active;
        }

        @NotNull
        public final StepsGroupDTO getTotal() {
            return this.total;
        }

        public int hashCode() {
            return this.active.hashCode() + (this.total.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "StepsDTO(total=" + this.total + ", active=" + this.active + ")";
        }
    }

    public CourierStepsDTO(@NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, @NotNull StepsDTO steps, SettingsDTO settingsDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.title = title;
        this.titleIcon = iconButtonV3DTO;
        this.steps = steps;
        this.settings = settingsDTO;
        this.trackingInfo = map;
    }

    public final SettingsDTO getSettings() {
        return this.settings;
    }

    @NotNull
    public final StepsDTO getSteps() {
        return this.steps;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final IconButtonV3DTO getTitleIcon() {
        return this.titleIcon;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }
}
