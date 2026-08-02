package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.data;

import C.o0;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutgeo.checkout.views.totalButton.TotalButtonDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003'()BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO;", "", "additionalInfo", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "totalButton", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;", "showRoundedHeader", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "widgetContainerSettings", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;)V", "getAdditionalInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getTotalButton", "()Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;", "getShowRoundedHeader", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "getWidgetContainerSettings", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;Ljava/lang/Boolean;Ljava/util/Map;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO;", "equals", "other", "hashCode", "", "toString", "ContainerSettings", "ContainerCornerRadius", "Paddings", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalStickyV3DTO {
    public static final int $stable = 8;
    private final CellDTO additionalInfo;
    private final Boolean showRoundedHeader;
    private final TotalButtonDTO totalButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final ContainerSettings widgetContainerSettings;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerCornerRadius;", "", "top", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottom", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContainerCornerRadius {
        public static final int $stable = 0;
        private final CornerRadius bottom;
        private final CornerRadius top;

        public ContainerCornerRadius(CornerRadius cornerRadius, CornerRadius cornerRadius2) {
            this.top = cornerRadius;
            this.bottom = cornerRadius2;
        }

        public static /* synthetic */ ContainerCornerRadius copy$default(ContainerCornerRadius containerCornerRadius, CornerRadius cornerRadius, CornerRadius cornerRadius2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cornerRadius = containerCornerRadius.top;
            }
            if ((i11 & 2) != 0) {
                cornerRadius2 = containerCornerRadius.bottom;
            }
            return containerCornerRadius.copy(cornerRadius, cornerRadius2);
        }

        /* renamed from: component1, reason: from getter */
        public final CornerRadius getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final CornerRadius getBottom() {
            return this.bottom;
        }

        @NotNull
        public final ContainerCornerRadius copy(CornerRadius top, CornerRadius bottom) {
            return new ContainerCornerRadius(top, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContainerCornerRadius)) {
                return false;
            }
            ContainerCornerRadius containerCornerRadius = (ContainerCornerRadius) other;
            return this.top == containerCornerRadius.top && this.bottom == containerCornerRadius.bottom;
        }

        public final CornerRadius getBottom() {
            return this.bottom;
        }

        public final CornerRadius getTop() {
            return this.top;
        }

        public int hashCode() {
            CornerRadius cornerRadius = this.top;
            int hashCode = (cornerRadius == null ? 0 : cornerRadius.hashCode()) * 31;
            CornerRadius cornerRadius2 = this.bottom;
            return hashCode + (cornerRadius2 != null ? cornerRadius2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ContainerCornerRadius(top=" + this.top + ", bottom=" + this.bottom + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;", "", "cornerRadius", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerCornerRadius;", "paddings", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$Paddings;", "backgroundColor", "", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerCornerRadius;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$Paddings;Ljava/lang/String;)V", "getCornerRadius", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerCornerRadius;", "getPaddings", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$Paddings;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContainerSettings {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final ContainerCornerRadius cornerRadius;
        private final Paddings paddings;

        public ContainerSettings(ContainerCornerRadius containerCornerRadius, Paddings paddings, String str) {
            this.cornerRadius = containerCornerRadius;
            this.paddings = paddings;
            this.backgroundColor = str;
        }

        public static /* synthetic */ ContainerSettings copy$default(ContainerSettings containerSettings, ContainerCornerRadius containerCornerRadius, Paddings paddings, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                containerCornerRadius = containerSettings.cornerRadius;
            }
            if ((i11 & 2) != 0) {
                paddings = containerSettings.paddings;
            }
            if ((i11 & 4) != 0) {
                str = containerSettings.backgroundColor;
            }
            return containerSettings.copy(containerCornerRadius, paddings, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ContainerCornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ContainerSettings copy(ContainerCornerRadius cornerRadius, Paddings paddings, String backgroundColor) {
            return new ContainerSettings(cornerRadius, paddings, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContainerSettings)) {
                return false;
            }
            ContainerSettings containerSettings = (ContainerSettings) other;
            return Intrinsics.d(this.cornerRadius, containerSettings.cornerRadius) && Intrinsics.d(this.paddings, containerSettings.paddings) && Intrinsics.d(this.backgroundColor, containerSettings.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final ContainerCornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final Paddings getPaddings() {
            return this.paddings;
        }

        public int hashCode() {
            ContainerCornerRadius containerCornerRadius = this.cornerRadius;
            int hashCode = (containerCornerRadius == null ? 0 : containerCornerRadius.hashCode()) * 31;
            Paddings paddings = this.paddings;
            int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ContainerCornerRadius containerCornerRadius = this.cornerRadius;
            Paddings paddings = this.paddings;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("ContainerSettings(cornerRadius=");
            sb2.append(containerCornerRadius);
            sb2.append(", paddings=");
            sb2.append(paddings);
            sb2.append(", backgroundColor=");
            return o0.c(sb2, str, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$Paddings;", "", "left", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "right", "top", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getLeft", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRight", "getTop", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paddings {
        public static final int $stable = 0;
        private final CommonCellSettings.LayoutPadding bottom;
        private final CommonCellSettings.LayoutPadding left;
        private final CommonCellSettings.LayoutPadding right;
        private final CommonCellSettings.LayoutPadding top;

        public Paddings(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4) {
            this.left = layoutPadding;
            this.right = layoutPadding2;
            this.top = layoutPadding3;
            this.bottom = layoutPadding4;
        }

        public static /* synthetic */ Paddings copy$default(Paddings paddings, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = paddings.left;
            }
            if ((i11 & 2) != 0) {
                layoutPadding2 = paddings.right;
            }
            if ((i11 & 4) != 0) {
                layoutPadding3 = paddings.top;
            }
            if ((i11 & 8) != 0) {
                layoutPadding4 = paddings.bottom;
            }
            return paddings.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRight() {
            return this.right;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTop() {
            return this.top;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings copy(CommonCellSettings.LayoutPadding left, CommonCellSettings.LayoutPadding right, CommonCellSettings.LayoutPadding top, CommonCellSettings.LayoutPadding bottom) {
            return new Paddings(left, right, top, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return this.left == paddings.left && this.right == paddings.right && this.top == paddings.top && this.bottom == paddings.bottom;
        }

        public final CommonCellSettings.LayoutPadding getBottom() {
            return this.bottom;
        }

        public final CommonCellSettings.LayoutPadding getLeft() {
            return this.left;
        }

        public final CommonCellSettings.LayoutPadding getRight() {
            return this.right;
        }

        public final CommonCellSettings.LayoutPadding getTop() {
            return this.top;
        }

        public int hashCode() {
            CommonCellSettings.LayoutPadding layoutPadding = this.left;
            int hashCode = (layoutPadding == null ? 0 : layoutPadding.hashCode()) * 31;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.right;
            int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.top;
            int hashCode3 = (hashCode2 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding4 = this.bottom;
            return hashCode3 + (layoutPadding4 != null ? layoutPadding4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Paddings(left=" + this.left + ", right=" + this.right + ", top=" + this.top + ", bottom=" + this.bottom + ")";
        }
    }

    public TotalStickyV3DTO(CellDTO cellDTO, TotalButtonDTO totalButtonDTO, Boolean bool, Map<String, TokenizedTrackingInfo> map, ContainerSettings containerSettings) {
        this.additionalInfo = cellDTO;
        this.totalButton = totalButtonDTO;
        this.showRoundedHeader = bool;
        this.trackingInfo = map;
        this.widgetContainerSettings = containerSettings;
    }

    public static /* synthetic */ TotalStickyV3DTO copy$default(TotalStickyV3DTO totalStickyV3DTO, CellDTO cellDTO, TotalButtonDTO totalButtonDTO, Boolean bool, Map map, ContainerSettings containerSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = totalStickyV3DTO.additionalInfo;
        }
        if ((i11 & 2) != 0) {
            totalButtonDTO = totalStickyV3DTO.totalButton;
        }
        if ((i11 & 4) != 0) {
            bool = totalStickyV3DTO.showRoundedHeader;
        }
        if ((i11 & 8) != 0) {
            map = totalStickyV3DTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            containerSettings = totalStickyV3DTO.widgetContainerSettings;
        }
        ContainerSettings containerSettings2 = containerSettings;
        Boolean bool2 = bool;
        return totalStickyV3DTO.copy(cellDTO, totalButtonDTO, bool2, map, containerSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final CellDTO getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final TotalButtonDTO getTotalButton() {
        return this.totalButton;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getShowRoundedHeader() {
        return this.showRoundedHeader;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final ContainerSettings getWidgetContainerSettings() {
        return this.widgetContainerSettings;
    }

    @NotNull
    public final TotalStickyV3DTO copy(CellDTO additionalInfo, TotalButtonDTO totalButton, Boolean showRoundedHeader, Map<String, TokenizedTrackingInfo> trackingInfo, ContainerSettings widgetContainerSettings) {
        return new TotalStickyV3DTO(additionalInfo, totalButton, showRoundedHeader, trackingInfo, widgetContainerSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalStickyV3DTO)) {
            return false;
        }
        TotalStickyV3DTO totalStickyV3DTO = (TotalStickyV3DTO) other;
        return Intrinsics.d(this.additionalInfo, totalStickyV3DTO.additionalInfo) && Intrinsics.d(this.totalButton, totalStickyV3DTO.totalButton) && Intrinsics.d(this.showRoundedHeader, totalStickyV3DTO.showRoundedHeader) && Intrinsics.d(this.trackingInfo, totalStickyV3DTO.trackingInfo) && Intrinsics.d(this.widgetContainerSettings, totalStickyV3DTO.widgetContainerSettings);
    }

    public final CellDTO getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final Boolean getShowRoundedHeader() {
        return this.showRoundedHeader;
    }

    public final TotalButtonDTO getTotalButton() {
        return this.totalButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final ContainerSettings getWidgetContainerSettings() {
        return this.widgetContainerSettings;
    }

    public int hashCode() {
        CellDTO cellDTO = this.additionalInfo;
        int hashCode = (cellDTO == null ? 0 : cellDTO.hashCode()) * 31;
        TotalButtonDTO totalButtonDTO = this.totalButton;
        int hashCode2 = (hashCode + (totalButtonDTO == null ? 0 : totalButtonDTO.hashCode())) * 31;
        Boolean bool = this.showRoundedHeader;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        ContainerSettings containerSettings = this.widgetContainerSettings;
        return hashCode4 + (containerSettings != null ? containerSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TotalStickyV3DTO(additionalInfo=" + this.additionalInfo + ", totalButton=" + this.totalButton + ", showRoundedHeader=" + this.showRoundedHeader + ", trackingInfo=" + this.trackingInfo + ", widgetContainerSettings=" + this.widgetContainerSettings + ")";
    }
}
