package ru.ozon.app.android.cart.installment.data;

import B3.p;
import C.o0;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/installment/data/InstallmentDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "margins", "Lru/ozon/app/android/cart/installment/data/InstallmentDTO$WidgetMargins;", "widgetContainerSettings", "Lru/ozon/app/android/cart/installment/data/InstallmentDTO$ContainerSettings;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/cart/installment/data/InstallmentDTO$WidgetMargins;Lru/ozon/app/android/cart/installment/data/InstallmentDTO$ContainerSettings;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getMargins", "()Lru/ozon/app/android/cart/installment/data/InstallmentDTO$WidgetMargins;", "getWidgetContainerSettings", "()Lru/ozon/app/android/cart/installment/data/InstallmentDTO$ContainerSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WidgetMargins", "ContainerSettings", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstallmentDTO {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;
    private final WidgetMargins margins;
    private final ContainerSettings widgetContainerSettings;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/installment/data/InstallmentDTO$ContainerSettings;", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "horizontalMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;)V", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getHorizontalMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContainerSettings {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final CornerRadius cornerRadius;
        private final Paddings horizontalMargin;

        public ContainerSettings(CornerRadius cornerRadius, Paddings paddings, String str) {
            this.cornerRadius = cornerRadius;
            this.horizontalMargin = paddings;
            this.backgroundColor = str;
        }

        public static /* synthetic */ ContainerSettings copy$default(ContainerSettings containerSettings, CornerRadius cornerRadius, Paddings paddings, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cornerRadius = containerSettings.cornerRadius;
            }
            if ((i11 & 2) != 0) {
                paddings = containerSettings.horizontalMargin;
            }
            if ((i11 & 4) != 0) {
                str = containerSettings.backgroundColor;
            }
            return containerSettings.copy(cornerRadius, paddings, str);
        }

        /* renamed from: component1, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getHorizontalMargin() {
            return this.horizontalMargin;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ContainerSettings copy(CornerRadius cornerRadius, Paddings horizontalMargin, String backgroundColor) {
            return new ContainerSettings(cornerRadius, horizontalMargin, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContainerSettings)) {
                return false;
            }
            ContainerSettings containerSettings = (ContainerSettings) other;
            return this.cornerRadius == containerSettings.cornerRadius && this.horizontalMargin == containerSettings.horizontalMargin && Intrinsics.d(this.backgroundColor, containerSettings.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final Paddings getHorizontalMargin() {
            return this.horizontalMargin;
        }

        public int hashCode() {
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode = (cornerRadius == null ? 0 : cornerRadius.hashCode()) * 31;
            Paddings paddings = this.horizontalMargin;
            int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CornerRadius cornerRadius = this.cornerRadius;
            Paddings paddings = this.horizontalMargin;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("ContainerSettings(cornerRadius=");
            sb2.append(cornerRadius);
            sb2.append(", horizontalMargin=");
            sb2.append(paddings);
            sb2.append(", backgroundColor=");
            return o0.c(sb2, str, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/installment/data/InstallmentDTO$WidgetMargins;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetMargins {
        public static final int $stable = 0;
        private final Paddings bottom;
        private final Paddings left;
        private final Paddings right;
        private final Paddings top;

        public WidgetMargins(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.top = paddings;
            this.bottom = paddings2;
            this.left = paddings3;
            this.right = paddings4;
        }

        public static /* synthetic */ WidgetMargins copy$default(WidgetMargins widgetMargins, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = widgetMargins.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = widgetMargins.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = widgetMargins.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = widgetMargins.right;
            }
            return widgetMargins.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final WidgetMargins copy(Paddings top, Paddings bottom, Paddings left, Paddings right) {
            return new WidgetMargins(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetMargins)) {
                return false;
            }
            WidgetMargins widgetMargins = (WidgetMargins) other;
            return this.top == widgetMargins.top && this.bottom == widgetMargins.bottom && this.left == widgetMargins.left && this.right == widgetMargins.right;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.top;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottom;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.left;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.right;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("WidgetMargins(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }
    }

    public InstallmentDTO(@NotNull CellDTO cell, WidgetMargins widgetMargins, ContainerSettings containerSettings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
        this.margins = widgetMargins;
        this.widgetContainerSettings = containerSettings;
    }

    public static /* synthetic */ InstallmentDTO copy$default(InstallmentDTO installmentDTO, CellDTO cellDTO, WidgetMargins widgetMargins, ContainerSettings containerSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = installmentDTO.cell;
        }
        if ((i11 & 2) != 0) {
            widgetMargins = installmentDTO.margins;
        }
        if ((i11 & 4) != 0) {
            containerSettings = installmentDTO.widgetContainerSettings;
        }
        return installmentDTO.copy(cellDTO, widgetMargins, containerSettings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component2, reason: from getter */
    public final WidgetMargins getMargins() {
        return this.margins;
    }

    /* renamed from: component3, reason: from getter */
    public final ContainerSettings getWidgetContainerSettings() {
        return this.widgetContainerSettings;
    }

    @NotNull
    public final InstallmentDTO copy(@NotNull CellDTO cell, WidgetMargins margins, ContainerSettings widgetContainerSettings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new InstallmentDTO(cell, margins, widgetContainerSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentDTO)) {
            return false;
        }
        InstallmentDTO installmentDTO = (InstallmentDTO) other;
        return Intrinsics.d(this.cell, installmentDTO.cell) && Intrinsics.d(this.margins, installmentDTO.margins) && Intrinsics.d(this.widgetContainerSettings, installmentDTO.widgetContainerSettings);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final WidgetMargins getMargins() {
        return this.margins;
    }

    public final ContainerSettings getWidgetContainerSettings() {
        return this.widgetContainerSettings;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        WidgetMargins widgetMargins = this.margins;
        int hashCode2 = (hashCode + (widgetMargins == null ? 0 : widgetMargins.hashCode())) * 31;
        ContainerSettings containerSettings = this.widgetContainerSettings;
        return hashCode2 + (containerSettings != null ? containerSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InstallmentDTO(cell=" + this.cell + ", margins=" + this.margins + ", widgetContainerSettings=" + this.widgetContainerSettings + ")";
    }
}
