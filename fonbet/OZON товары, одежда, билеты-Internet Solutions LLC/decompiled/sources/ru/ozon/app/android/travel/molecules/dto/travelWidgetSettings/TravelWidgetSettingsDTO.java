package ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings;

import B3.p;
import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "", "backgroundColor", "", "corners", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$CornersSetting;", "paddings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$CornersSetting;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCorners", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$CornersSetting;", "getPaddings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "CornersSetting", "PaddingsSetting", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelWidgetSettingsDTO {
    private final String backgroundColor;
    private final CornersSetting corners;
    private final PaddingsSetting paddings;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$CornersSetting;", "", "topRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "bottomRadius", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTopRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottomRadius", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornersSetting {

        @EnumNullFallback
        @NotNull
        private final CornerRadius bottomRadius;

        @EnumNullFallback
        @NotNull
        private final CornerRadius topRadius;

        /* JADX WARN: Multi-variable type inference failed */
        public CornersSetting() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ CornersSetting copy$default(CornersSetting cornersSetting, CornerRadius cornerRadius, CornerRadius cornerRadius2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cornerRadius = cornersSetting.topRadius;
            }
            if ((i11 & 2) != 0) {
                cornerRadius2 = cornersSetting.bottomRadius;
            }
            return cornersSetting.copy(cornerRadius, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CornerRadius getTopRadius() {
            return this.topRadius;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CornerRadius getBottomRadius() {
            return this.bottomRadius;
        }

        @NotNull
        public final CornersSetting copy(@NotNull CornerRadius topRadius, @NotNull CornerRadius bottomRadius) {
            Intrinsics.checkNotNullParameter(topRadius, "topRadius");
            Intrinsics.checkNotNullParameter(bottomRadius, "bottomRadius");
            return new CornersSetting(topRadius, bottomRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CornersSetting)) {
                return false;
            }
            CornersSetting cornersSetting = (CornersSetting) other;
            return this.topRadius == cornersSetting.topRadius && this.bottomRadius == cornersSetting.bottomRadius;
        }

        @NotNull
        public final CornerRadius getBottomRadius() {
            return this.bottomRadius;
        }

        @NotNull
        public final CornerRadius getTopRadius() {
            return this.topRadius;
        }

        public int hashCode() {
            return this.bottomRadius.hashCode() + (this.topRadius.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CornersSetting(topRadius=" + this.topRadius + ", bottomRadius=" + this.bottomRadius + ")";
        }

        public CornersSetting(@NotNull CornerRadius topRadius, @NotNull CornerRadius bottomRadius) {
            Intrinsics.checkNotNullParameter(topRadius, "topRadius");
            Intrinsics.checkNotNullParameter(bottomRadius, "bottomRadius");
            this.topRadius = topRadius;
            this.bottomRadius = bottomRadius;
        }

        public /* synthetic */ CornersSetting(CornerRadius cornerRadius, CornerRadius cornerRadius2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 2) != 0 ? CornerRadius.NO_RADIUS : cornerRadius2);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "", "leftPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsSetting {

        @EnumNullFallback
        @NotNull
        private final Paddings bottomPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings leftPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings rightPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings topPadding;

        public PaddingsSetting() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PaddingsSetting copy$default(PaddingsSetting paddingsSetting, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsSetting.leftPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsSetting.rightPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsSetting.topPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsSetting.bottomPadding;
            }
            return paddingsSetting.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final PaddingsSetting copy(@NotNull Paddings leftPadding, @NotNull Paddings rightPadding, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            return new PaddingsSetting(leftPadding, rightPadding, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsSetting)) {
                return false;
            }
            PaddingsSetting paddingsSetting = (PaddingsSetting) other;
            return this.leftPadding == paddingsSetting.leftPadding && this.rightPadding == paddingsSetting.rightPadding && this.topPadding == paddingsSetting.topPadding && this.bottomPadding == paddingsSetting.bottomPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.bottomPadding.hashCode() + b.b(this.topPadding, b.b(this.rightPadding, this.leftPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.leftPadding;
            Paddings paddings2 = this.rightPadding;
            return b.e(p.b("PaddingsSetting(leftPadding=", paddings, ", rightPadding=", paddings2, ", topPadding="), this.topPadding, ", bottomPadding=", this.bottomPadding, ")");
        }

        public PaddingsSetting(@NotNull Paddings leftPadding, @NotNull Paddings rightPadding, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding) {
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
        }

        public /* synthetic */ PaddingsSetting(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    public TravelWidgetSettingsDTO(String str, CornersSetting cornersSetting, PaddingsSetting paddingsSetting) {
        this.backgroundColor = str;
        this.corners = cornersSetting;
        this.paddings = paddingsSetting;
    }

    public static /* synthetic */ TravelWidgetSettingsDTO copy$default(TravelWidgetSettingsDTO travelWidgetSettingsDTO, String str, CornersSetting cornersSetting, PaddingsSetting paddingsSetting, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = travelWidgetSettingsDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            cornersSetting = travelWidgetSettingsDTO.corners;
        }
        if ((i11 & 4) != 0) {
            paddingsSetting = travelWidgetSettingsDTO.paddings;
        }
        return travelWidgetSettingsDTO.copy(str, cornersSetting, paddingsSetting);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final CornersSetting getCorners() {
        return this.corners;
    }

    /* renamed from: component3, reason: from getter */
    public final PaddingsSetting getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final TravelWidgetSettingsDTO copy(String backgroundColor, CornersSetting corners, PaddingsSetting paddings) {
        return new TravelWidgetSettingsDTO(backgroundColor, corners, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelWidgetSettingsDTO)) {
            return false;
        }
        TravelWidgetSettingsDTO travelWidgetSettingsDTO = (TravelWidgetSettingsDTO) other;
        return Intrinsics.d(this.backgroundColor, travelWidgetSettingsDTO.backgroundColor) && Intrinsics.d(this.corners, travelWidgetSettingsDTO.corners) && Intrinsics.d(this.paddings, travelWidgetSettingsDTO.paddings);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornersSetting getCorners() {
        return this.corners;
    }

    public final PaddingsSetting getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CornersSetting cornersSetting = this.corners;
        int hashCode2 = (hashCode + (cornersSetting == null ? 0 : cornersSetting.hashCode())) * 31;
        PaddingsSetting paddingsSetting = this.paddings;
        return hashCode2 + (paddingsSetting != null ? paddingsSetting.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TravelWidgetSettingsDTO(backgroundColor=" + this.backgroundColor + ", corners=" + this.corners + ", paddings=" + this.paddings + ")";
    }
}
