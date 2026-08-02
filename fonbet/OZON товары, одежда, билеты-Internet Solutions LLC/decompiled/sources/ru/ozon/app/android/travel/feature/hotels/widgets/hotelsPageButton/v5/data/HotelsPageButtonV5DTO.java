package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.data;

import Kk.C3532b;
import Sh.a;
import V.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001>B\u0087\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00106\u001a\u0004\u0018\u00010\u0015HÆ\u0003J \u0001\u00107\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001cR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010&\u001a\u0004\b)\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "dsCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "isUpdateRequired", "", "asyncParameters", "", "", "widgetScrollAnchors", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;", "cellScrollAnchors", "backgroundColor", "hasTopBorder", "topCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "hasTopShadow", "buttonGroupPaddings", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/util/Map;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/Boolean;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;)V", "getButtons", "()Ljava/util/List;", "getDsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "()Z", "getAsyncParameters", "()Ljava/util/Map;", "getWidgetScrollAnchors", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;", "getCellScrollAnchors", "getBackgroundColor", "()Ljava/lang/String;", "getHasTopBorder", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getHasTopShadow", "getButtonGroupPaddings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLjava/util/Map;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/Boolean;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO$PaddingsSetting;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO;", "equals", "other", "hashCode", "", "toString", "WidgetsBlockAnchors", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageButtonV5DTO {
    public static final int $stable = 8;
    private final Map<String, Object> asyncParameters;
    private final String backgroundColor;
    private final TravelWidgetSettingsDTO.PaddingsSetting buttonGroupPaddings;

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final WidgetsBlockAnchors cellScrollAnchors;
    private final CellDTO dsCell;
    private final Boolean hasTopBorder;
    private final Boolean hasTopShadow;
    private final boolean isUpdateRequired;
    private final CornerRadius topCornerRadius;
    private final WidgetsBlockAnchors widgetScrollAnchors;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/data/HotelsPageButtonV5DTO$WidgetsBlockAnchors;", "", "startId", "", "endId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartId", "()Ljava/lang/String;", "getEndId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetsBlockAnchors {
        public static final int $stable = 0;

        @NotNull
        private final String endId;

        @NotNull
        private final String startId;

        public WidgetsBlockAnchors(@NotNull String startId, @NotNull String endId) {
            Intrinsics.checkNotNullParameter(startId, "startId");
            Intrinsics.checkNotNullParameter(endId, "endId");
            this.startId = startId;
            this.endId = endId;
        }

        public static /* synthetic */ WidgetsBlockAnchors copy$default(WidgetsBlockAnchors widgetsBlockAnchors, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = widgetsBlockAnchors.startId;
            }
            if ((i11 & 2) != 0) {
                str2 = widgetsBlockAnchors.endId;
            }
            return widgetsBlockAnchors.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStartId() {
            return this.startId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getEndId() {
            return this.endId;
        }

        @NotNull
        public final WidgetsBlockAnchors copy(@NotNull String startId, @NotNull String endId) {
            Intrinsics.checkNotNullParameter(startId, "startId");
            Intrinsics.checkNotNullParameter(endId, "endId");
            return new WidgetsBlockAnchors(startId, endId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetsBlockAnchors)) {
                return false;
            }
            WidgetsBlockAnchors widgetsBlockAnchors = (WidgetsBlockAnchors) other;
            return Intrinsics.d(this.startId, widgetsBlockAnchors.startId) && Intrinsics.d(this.endId, widgetsBlockAnchors.endId);
        }

        @NotNull
        public final String getEndId() {
            return this.endId;
        }

        @NotNull
        public final String getStartId() {
            return this.startId;
        }

        public int hashCode() {
            return this.endId.hashCode() + (this.startId.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("WidgetsBlockAnchors(startId=", this.startId, ", endId=", this.endId, ")");
        }
    }

    public HotelsPageButtonV5DTO(@NotNull List<ButtonV3DTO> buttons, CellDTO cellDTO, boolean z11, Map<String, ? extends Object> map, WidgetsBlockAnchors widgetsBlockAnchors, WidgetsBlockAnchors widgetsBlockAnchors2, String str, Boolean bool, CornerRadius cornerRadius, Boolean bool2, TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.buttons = buttons;
        this.dsCell = cellDTO;
        this.isUpdateRequired = z11;
        this.asyncParameters = map;
        this.widgetScrollAnchors = widgetsBlockAnchors;
        this.cellScrollAnchors = widgetsBlockAnchors2;
        this.backgroundColor = str;
        this.hasTopBorder = bool;
        this.topCornerRadius = cornerRadius;
        this.hasTopShadow = bool2;
        this.buttonGroupPaddings = paddingsSetting;
    }

    public static /* synthetic */ HotelsPageButtonV5DTO copy$default(HotelsPageButtonV5DTO hotelsPageButtonV5DTO, List list, CellDTO cellDTO, boolean z11, Map map, WidgetsBlockAnchors widgetsBlockAnchors, WidgetsBlockAnchors widgetsBlockAnchors2, String str, Boolean bool, CornerRadius cornerRadius, Boolean bool2, TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsPageButtonV5DTO.buttons;
        }
        if ((i11 & 2) != 0) {
            cellDTO = hotelsPageButtonV5DTO.dsCell;
        }
        if ((i11 & 4) != 0) {
            z11 = hotelsPageButtonV5DTO.isUpdateRequired;
        }
        if ((i11 & 8) != 0) {
            map = hotelsPageButtonV5DTO.asyncParameters;
        }
        if ((i11 & 16) != 0) {
            widgetsBlockAnchors = hotelsPageButtonV5DTO.widgetScrollAnchors;
        }
        if ((i11 & 32) != 0) {
            widgetsBlockAnchors2 = hotelsPageButtonV5DTO.cellScrollAnchors;
        }
        if ((i11 & 64) != 0) {
            str = hotelsPageButtonV5DTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool = hotelsPageButtonV5DTO.hasTopBorder;
        }
        if ((i11 & 256) != 0) {
            cornerRadius = hotelsPageButtonV5DTO.topCornerRadius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            bool2 = hotelsPageButtonV5DTO.hasTopShadow;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            paddingsSetting = hotelsPageButtonV5DTO.buttonGroupPaddings;
        }
        Boolean bool3 = bool2;
        TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting2 = paddingsSetting;
        Boolean bool4 = bool;
        CornerRadius cornerRadius2 = cornerRadius;
        WidgetsBlockAnchors widgetsBlockAnchors3 = widgetsBlockAnchors2;
        String str2 = str;
        WidgetsBlockAnchors widgetsBlockAnchors4 = widgetsBlockAnchors;
        boolean z12 = z11;
        return hotelsPageButtonV5DTO.copy(list, cellDTO, z12, map, widgetsBlockAnchors4, widgetsBlockAnchors3, str2, bool4, cornerRadius2, bool3, paddingsSetting2);
    }

    @NotNull
    public final List<ButtonV3DTO> component1() {
        return this.buttons;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getHasTopShadow() {
        return this.hasTopShadow;
    }

    /* renamed from: component11, reason: from getter */
    public final TravelWidgetSettingsDTO.PaddingsSetting getButtonGroupPaddings() {
        return this.buttonGroupPaddings;
    }

    /* renamed from: component2, reason: from getter */
    public final CellDTO getDsCell() {
        return this.dsCell;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsUpdateRequired() {
        return this.isUpdateRequired;
    }

    public final Map<String, Object> component4() {
        return this.asyncParameters;
    }

    /* renamed from: component5, reason: from getter */
    public final WidgetsBlockAnchors getWidgetScrollAnchors() {
        return this.widgetScrollAnchors;
    }

    /* renamed from: component6, reason: from getter */
    public final WidgetsBlockAnchors getCellScrollAnchors() {
        return this.cellScrollAnchors;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getHasTopBorder() {
        return this.hasTopBorder;
    }

    /* renamed from: component9, reason: from getter */
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    @NotNull
    public final HotelsPageButtonV5DTO copy(@NotNull List<ButtonV3DTO> buttons, CellDTO dsCell, boolean isUpdateRequired, Map<String, ? extends Object> asyncParameters, WidgetsBlockAnchors widgetScrollAnchors, WidgetsBlockAnchors cellScrollAnchors, String backgroundColor, Boolean hasTopBorder, CornerRadius topCornerRadius, Boolean hasTopShadow, TravelWidgetSettingsDTO.PaddingsSetting buttonGroupPaddings) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new HotelsPageButtonV5DTO(buttons, dsCell, isUpdateRequired, asyncParameters, widgetScrollAnchors, cellScrollAnchors, backgroundColor, hasTopBorder, topCornerRadius, hasTopShadow, buttonGroupPaddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageButtonV5DTO)) {
            return false;
        }
        HotelsPageButtonV5DTO hotelsPageButtonV5DTO = (HotelsPageButtonV5DTO) other;
        return Intrinsics.d(this.buttons, hotelsPageButtonV5DTO.buttons) && Intrinsics.d(this.dsCell, hotelsPageButtonV5DTO.dsCell) && this.isUpdateRequired == hotelsPageButtonV5DTO.isUpdateRequired && Intrinsics.d(this.asyncParameters, hotelsPageButtonV5DTO.asyncParameters) && Intrinsics.d(this.widgetScrollAnchors, hotelsPageButtonV5DTO.widgetScrollAnchors) && Intrinsics.d(this.cellScrollAnchors, hotelsPageButtonV5DTO.cellScrollAnchors) && Intrinsics.d(this.backgroundColor, hotelsPageButtonV5DTO.backgroundColor) && Intrinsics.d(this.hasTopBorder, hotelsPageButtonV5DTO.hasTopBorder) && this.topCornerRadius == hotelsPageButtonV5DTO.topCornerRadius && Intrinsics.d(this.hasTopShadow, hotelsPageButtonV5DTO.hasTopShadow) && Intrinsics.d(this.buttonGroupPaddings, hotelsPageButtonV5DTO.buttonGroupPaddings);
    }

    public final Map<String, Object> getAsyncParameters() {
        return this.asyncParameters;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TravelWidgetSettingsDTO.PaddingsSetting getButtonGroupPaddings() {
        return this.buttonGroupPaddings;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final WidgetsBlockAnchors getCellScrollAnchors() {
        return this.cellScrollAnchors;
    }

    public final CellDTO getDsCell() {
        return this.dsCell;
    }

    public final Boolean getHasTopBorder() {
        return this.hasTopBorder;
    }

    public final Boolean getHasTopShadow() {
        return this.hasTopShadow;
    }

    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    public final WidgetsBlockAnchors getWidgetScrollAnchors() {
        return this.widgetScrollAnchors;
    }

    public int hashCode() {
        int hashCode = this.buttons.hashCode() * 31;
        CellDTO cellDTO = this.dsCell;
        int a11 = C3532b.a((hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31, 31, this.isUpdateRequired);
        Map<String, Object> map = this.asyncParameters;
        int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        WidgetsBlockAnchors widgetsBlockAnchors = this.widgetScrollAnchors;
        int hashCode3 = (hashCode2 + (widgetsBlockAnchors == null ? 0 : widgetsBlockAnchors.hashCode())) * 31;
        WidgetsBlockAnchors widgetsBlockAnchors2 = this.cellScrollAnchors;
        int hashCode4 = (hashCode3 + (widgetsBlockAnchors2 == null ? 0 : widgetsBlockAnchors2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasTopBorder;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        CornerRadius cornerRadius = this.topCornerRadius;
        int hashCode7 = (hashCode6 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Boolean bool2 = this.hasTopShadow;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting = this.buttonGroupPaddings;
        return hashCode8 + (paddingsSetting != null ? paddingsSetting.hashCode() : 0);
    }

    public final boolean isUpdateRequired() {
        return this.isUpdateRequired;
    }

    @NotNull
    public String toString() {
        List<ButtonV3DTO> list = this.buttons;
        CellDTO cellDTO = this.dsCell;
        boolean z11 = this.isUpdateRequired;
        Map<String, Object> map = this.asyncParameters;
        WidgetsBlockAnchors widgetsBlockAnchors = this.widgetScrollAnchors;
        WidgetsBlockAnchors widgetsBlockAnchors2 = this.cellScrollAnchors;
        String str = this.backgroundColor;
        Boolean bool = this.hasTopBorder;
        CornerRadius cornerRadius = this.topCornerRadius;
        Boolean bool2 = this.hasTopShadow;
        TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting = this.buttonGroupPaddings;
        StringBuilder sb2 = new StringBuilder("HotelsPageButtonV5DTO(buttons=");
        sb2.append(list);
        sb2.append(", dsCell=");
        sb2.append(cellDTO);
        sb2.append(", isUpdateRequired=");
        sb2.append(z11);
        sb2.append(", asyncParameters=");
        sb2.append(map);
        sb2.append(", widgetScrollAnchors=");
        sb2.append(widgetsBlockAnchors);
        sb2.append(", cellScrollAnchors=");
        sb2.append(widgetsBlockAnchors2);
        sb2.append(", backgroundColor=");
        a.d(bool, str, ", hasTopBorder=", ", topCornerRadius=", sb2);
        sb2.append(cornerRadius);
        sb2.append(", hasTopShadow=");
        sb2.append(bool2);
        sb2.append(", buttonGroupPaddings=");
        sb2.append(paddingsSetting);
        sb2.append(")");
        return sb2.toString();
    }

    public HotelsPageButtonV5DTO(List list, CellDTO cellDTO, boolean z11, Map map, WidgetsBlockAnchors widgetsBlockAnchors, WidgetsBlockAnchors widgetsBlockAnchors2, String str, Boolean bool, CornerRadius cornerRadius, Boolean bool2, TravelWidgetSettingsDTO.PaddingsSetting paddingsSetting, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, cellDTO, (i11 & 4) != 0 ? false : z11, map, widgetsBlockAnchors, widgetsBlockAnchors2, str, bool, cornerRadius, bool2, paddingsSetting);
    }
}
