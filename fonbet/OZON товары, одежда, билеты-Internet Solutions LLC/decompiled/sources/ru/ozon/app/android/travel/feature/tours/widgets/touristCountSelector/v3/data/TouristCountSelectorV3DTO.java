package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data;

import B0.A0;
import B0.C2454a;
import Co.a;
import D3.g;
import De.C2859b;
import Gl.C3124a;
import Kk.C3532b;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u00056789:Bm\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0013HÆ\u0003J\u0083\u0001\u0010/\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0013HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;", "", "roomCells", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$QuantityCellDTO;", "childForm", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;", "rooms", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$RoomDTO;", "deleteRoomButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addRoomButton", "applyButton", "decreaseButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "increaseButton", "alerts", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO;", "roomsMaxCount", "", "<init>", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;I)V", "getRoomCells", "()Ljava/util/List;", "getChildForm", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;", "getRooms", "getDeleteRoomButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddRoomButton", "getApplyButton", "getDecreaseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIncreaseButton", "getAlerts", "getRoomsMaxCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "RoomDTO", "QuantityCellDTO", "AlertDTO", "ChildFormConfigDTO", "ChildFormDTO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TouristCountSelectorV3DTO {
    public static final int $stable = 8;
    private final ButtonV3DTO addRoomButton;

    @NotNull
    private final List<AlertDTO> alerts;

    @NotNull
    private final ButtonV3DTO applyButton;

    @NotNull
    private final ChildFormDTO childForm;

    @NotNull
    private final IconButtonV3DTO decreaseButton;
    private final ButtonV3DTO deleteRoomButton;

    @NotNull
    private final IconButtonV3DTO increaseButton;

    @NotNull
    private final List<QuantityCellDTO> roomCells;

    @NotNull
    private final List<RoomDTO> rooms;
    private final int roomsMaxCount;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormConfigDTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChildFormConfigDTO {
        public static final int $stable = 0;

        @NotNull
        private final String value;

        public ChildFormConfigDTO(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ ChildFormConfigDTO copy$default(ChildFormConfigDTO childFormConfigDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = childFormConfigDTO.value;
            }
            return childFormConfigDTO.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final ChildFormConfigDTO copy(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ChildFormConfigDTO(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChildFormConfigDTO) && Intrinsics.d(this.value, ((ChildFormConfigDTO) other).value);
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("ChildFormConfigDTO(value=", this.value, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "ageBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "ageCategories", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAgeBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAgeCategories", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChildFormDTO {
        public static final int $stable = 8;

        @NotNull
        private final BadgeDTO ageBadge;

        @NotNull
        private final List<ChipDTO> ageCategories;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public ChildFormDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull BadgeDTO ageBadge, @NotNull List<ChipDTO> ageCategories) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(ageBadge, "ageBadge");
            Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
            this.title = title;
            this.subtitle = subtitle;
            this.ageBadge = ageBadge;
            this.ageCategories = ageCategories;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChildFormDTO copy$default(ChildFormDTO childFormDTO, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = childFormDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = childFormDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = childFormDTO.ageBadge;
            }
            if ((i11 & 8) != 0) {
                list = childFormDTO.ageCategories;
            }
            return childFormDTO.copy(textDTO, textDTO2, badgeDTO, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getAgeBadge() {
            return this.ageBadge;
        }

        @NotNull
        public final List<ChipDTO> component4() {
            return this.ageCategories;
        }

        @NotNull
        public final ChildFormDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull BadgeDTO ageBadge, @NotNull List<ChipDTO> ageCategories) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(ageBadge, "ageBadge");
            Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
            return new ChildFormDTO(title, subtitle, ageBadge, ageCategories);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChildFormDTO)) {
                return false;
            }
            ChildFormDTO childFormDTO = (ChildFormDTO) other;
            return Intrinsics.d(this.title, childFormDTO.title) && Intrinsics.d(this.subtitle, childFormDTO.subtitle) && Intrinsics.d(this.ageBadge, childFormDTO.ageBadge) && Intrinsics.d(this.ageCategories, childFormDTO.ageCategories);
        }

        @NotNull
        public final BadgeDTO getAgeBadge() {
            return this.ageBadge;
        }

        @NotNull
        public final List<ChipDTO> getAgeCategories() {
            return this.ageCategories;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.ageCategories.hashCode() + C3124a.c(this.ageBadge, b.a(this.subtitle, this.title.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.ageBadge;
            List<ChipDTO> list = this.ageCategories;
            StringBuilder g10 = g.g("ChildFormDTO(title=", textDTO, ", subtitle=", textDTO2, ", ageBadge=");
            g10.append(badgeDTO);
            g10.append(", ageCategories=");
            g10.append(list);
            g10.append(")");
            return g10.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$QuantityCellDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "minValue", "maxValue", "maxValueRestriction", "Lru/ozon/uni/android/flashbar/model/Restriction;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;IIILru/ozon/uni/android/flashbar/model/Restriction;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getValue", "()I", "getMinValue", "getMaxValue", "getMaxValueRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuantityCellDTO {
        public static final int $stable = Restriction.$stable;

        @NotNull
        private final String id;
        private final int maxValue;
        private final Restriction maxValueRestriction;
        private final int minValue;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final int value;

        public QuantityCellDTO(@NotNull String id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, int i11, int i12, int i13, Restriction restriction) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.id = id2;
            this.title = title;
            this.subtitle = subtitle;
            this.value = i11;
            this.minValue = i12;
            this.maxValue = i13;
            this.maxValueRestriction = restriction;
        }

        public static /* synthetic */ QuantityCellDTO copy$default(QuantityCellDTO quantityCellDTO, String str, TextDTO textDTO, TextDTO textDTO2, int i11, int i12, int i13, Restriction restriction, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = quantityCellDTO.id;
            }
            if ((i14 & 2) != 0) {
                textDTO = quantityCellDTO.title;
            }
            if ((i14 & 4) != 0) {
                textDTO2 = quantityCellDTO.subtitle;
            }
            if ((i14 & 8) != 0) {
                i11 = quantityCellDTO.value;
            }
            if ((i14 & 16) != 0) {
                i12 = quantityCellDTO.minValue;
            }
            if ((i14 & 32) != 0) {
                i13 = quantityCellDTO.maxValue;
            }
            if ((i14 & 64) != 0) {
                restriction = quantityCellDTO.maxValueRestriction;
            }
            int i15 = i13;
            Restriction restriction2 = restriction;
            int i16 = i12;
            TextDTO textDTO3 = textDTO2;
            return quantityCellDTO.copy(str, textDTO, textDTO3, i11, i16, i15, restriction2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMinValue() {
            return this.minValue;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMaxValue() {
            return this.maxValue;
        }

        /* renamed from: component7, reason: from getter */
        public final Restriction getMaxValueRestriction() {
            return this.maxValueRestriction;
        }

        @NotNull
        public final QuantityCellDTO copy(@NotNull String id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, int value, int minValue, int maxValue, Restriction maxValueRestriction) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new QuantityCellDTO(id2, title, subtitle, value, minValue, maxValue, maxValueRestriction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuantityCellDTO)) {
                return false;
            }
            QuantityCellDTO quantityCellDTO = (QuantityCellDTO) other;
            return Intrinsics.d(this.id, quantityCellDTO.id) && Intrinsics.d(this.title, quantityCellDTO.title) && Intrinsics.d(this.subtitle, quantityCellDTO.subtitle) && this.value == quantityCellDTO.value && this.minValue == quantityCellDTO.minValue && this.maxValue == quantityCellDTO.maxValue && Intrinsics.d(this.maxValueRestriction, quantityCellDTO.maxValueRestriction);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public final int getMaxValue() {
            return this.maxValue;
        }

        public final Restriction getMaxValueRestriction() {
            return this.maxValueRestriction;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.maxValue, C2454a.a(this.minValue, C2454a.a(this.value, b.a(this.subtitle, b.a(this.title, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
            Restriction restriction = this.maxValueRestriction;
            return a11 + (restriction == null ? 0 : restriction.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.id;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            int i11 = this.value;
            int i12 = this.minValue;
            int i13 = this.maxValue;
            Restriction restriction = this.maxValueRestriction;
            StringBuilder b11 = a.b("QuantityCellDTO(id=", textDTO, str, ", title=", ", subtitle=");
            b11.append(textDTO2);
            b11.append(", value=");
            b11.append(i11);
            b11.append(", minValue=");
            Ek.a.f(i12, i13, ", maxValue=", ", maxValueRestriction=", b11);
            b11.append(restriction);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$RoomDTO;", "", "values", "", "", "", "childForms", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormConfigDTO;", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getValues", "()Ljava/util/Map;", "getChildForms", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RoomDTO {
        public static final int $stable = 8;
        private final List<ChildFormConfigDTO> childForms;

        @NotNull
        private final Map<String, Integer> values;

        public RoomDTO(@NotNull Map<String, Integer> values, List<ChildFormConfigDTO> list) {
            Intrinsics.checkNotNullParameter(values, "values");
            this.values = values;
            this.childForms = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RoomDTO copy$default(RoomDTO roomDTO, Map map, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = roomDTO.values;
            }
            if ((i11 & 2) != 0) {
                list = roomDTO.childForms;
            }
            return roomDTO.copy(map, list);
        }

        @NotNull
        public final Map<String, Integer> component1() {
            return this.values;
        }

        public final List<ChildFormConfigDTO> component2() {
            return this.childForms;
        }

        @NotNull
        public final RoomDTO copy(@NotNull Map<String, Integer> values, List<ChildFormConfigDTO> childForms) {
            Intrinsics.checkNotNullParameter(values, "values");
            return new RoomDTO(values, childForms);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoomDTO)) {
                return false;
            }
            RoomDTO roomDTO = (RoomDTO) other;
            return Intrinsics.d(this.values, roomDTO.values) && Intrinsics.d(this.childForms, roomDTO.childForms);
        }

        public final List<ChildFormConfigDTO> getChildForms() {
            return this.childForms;
        }

        @NotNull
        public final Map<String, Integer> getValues() {
            return this.values;
        }

        public int hashCode() {
            int hashCode = this.values.hashCode() * 31;
            List<ChildFormConfigDTO> list = this.childForms;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "RoomDTO(values=" + this.values + ", childForms=" + this.childForms + ")";
        }
    }

    public TouristCountSelectorV3DTO(@NotNull List<QuantityCellDTO> roomCells, @NotNull ChildFormDTO childForm, @NotNull List<RoomDTO> rooms, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, @NotNull ButtonV3DTO applyButton, @NotNull IconButtonV3DTO decreaseButton, @NotNull IconButtonV3DTO increaseButton, @NotNull List<AlertDTO> alerts, int i11) {
        Intrinsics.checkNotNullParameter(roomCells, "roomCells");
        Intrinsics.checkNotNullParameter(childForm, "childForm");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        Intrinsics.checkNotNullParameter(decreaseButton, "decreaseButton");
        Intrinsics.checkNotNullParameter(increaseButton, "increaseButton");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        this.roomCells = roomCells;
        this.childForm = childForm;
        this.rooms = rooms;
        this.deleteRoomButton = buttonV3DTO;
        this.addRoomButton = buttonV3DTO2;
        this.applyButton = applyButton;
        this.decreaseButton = decreaseButton;
        this.increaseButton = increaseButton;
        this.alerts = alerts;
        this.roomsMaxCount = i11;
    }

    public static /* synthetic */ TouristCountSelectorV3DTO copy$default(TouristCountSelectorV3DTO touristCountSelectorV3DTO, List list, ChildFormDTO childFormDTO, List list2, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, ButtonV3DTO buttonV3DTO3, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, List list3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = touristCountSelectorV3DTO.roomCells;
        }
        if ((i12 & 2) != 0) {
            childFormDTO = touristCountSelectorV3DTO.childForm;
        }
        if ((i12 & 4) != 0) {
            list2 = touristCountSelectorV3DTO.rooms;
        }
        if ((i12 & 8) != 0) {
            buttonV3DTO = touristCountSelectorV3DTO.deleteRoomButton;
        }
        if ((i12 & 16) != 0) {
            buttonV3DTO2 = touristCountSelectorV3DTO.addRoomButton;
        }
        if ((i12 & 32) != 0) {
            buttonV3DTO3 = touristCountSelectorV3DTO.applyButton;
        }
        if ((i12 & 64) != 0) {
            iconButtonV3DTO = touristCountSelectorV3DTO.decreaseButton;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO2 = touristCountSelectorV3DTO.increaseButton;
        }
        if ((i12 & 256) != 0) {
            list3 = touristCountSelectorV3DTO.alerts;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            i11 = touristCountSelectorV3DTO.roomsMaxCount;
        }
        List list4 = list3;
        int i13 = i11;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO2;
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO2;
        ButtonV3DTO buttonV3DTO5 = buttonV3DTO3;
        return touristCountSelectorV3DTO.copy(list, childFormDTO, list2, buttonV3DTO, buttonV3DTO4, buttonV3DTO5, iconButtonV3DTO3, iconButtonV3DTO4, list4, i13);
    }

    @NotNull
    public final List<QuantityCellDTO> component1() {
        return this.roomCells;
    }

    /* renamed from: component10, reason: from getter */
    public final int getRoomsMaxCount() {
        return this.roomsMaxCount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ChildFormDTO getChildForm() {
        return this.childForm;
    }

    @NotNull
    public final List<RoomDTO> component3() {
        return this.rooms;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getDeleteRoomButton() {
        return this.deleteRoomButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getAddRoomButton() {
        return this.addRoomButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final IconButtonV3DTO getDecreaseButton() {
        return this.decreaseButton;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getIncreaseButton() {
        return this.increaseButton;
    }

    @NotNull
    public final List<AlertDTO> component9() {
        return this.alerts;
    }

    @NotNull
    public final TouristCountSelectorV3DTO copy(@NotNull List<QuantityCellDTO> roomCells, @NotNull ChildFormDTO childForm, @NotNull List<RoomDTO> rooms, ButtonV3DTO deleteRoomButton, ButtonV3DTO addRoomButton, @NotNull ButtonV3DTO applyButton, @NotNull IconButtonV3DTO decreaseButton, @NotNull IconButtonV3DTO increaseButton, @NotNull List<AlertDTO> alerts, int roomsMaxCount) {
        Intrinsics.checkNotNullParameter(roomCells, "roomCells");
        Intrinsics.checkNotNullParameter(childForm, "childForm");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        Intrinsics.checkNotNullParameter(decreaseButton, "decreaseButton");
        Intrinsics.checkNotNullParameter(increaseButton, "increaseButton");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        return new TouristCountSelectorV3DTO(roomCells, childForm, rooms, deleteRoomButton, addRoomButton, applyButton, decreaseButton, increaseButton, alerts, roomsMaxCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorV3DTO)) {
            return false;
        }
        TouristCountSelectorV3DTO touristCountSelectorV3DTO = (TouristCountSelectorV3DTO) other;
        return Intrinsics.d(this.roomCells, touristCountSelectorV3DTO.roomCells) && Intrinsics.d(this.childForm, touristCountSelectorV3DTO.childForm) && Intrinsics.d(this.rooms, touristCountSelectorV3DTO.rooms) && Intrinsics.d(this.deleteRoomButton, touristCountSelectorV3DTO.deleteRoomButton) && Intrinsics.d(this.addRoomButton, touristCountSelectorV3DTO.addRoomButton) && Intrinsics.d(this.applyButton, touristCountSelectorV3DTO.applyButton) && Intrinsics.d(this.decreaseButton, touristCountSelectorV3DTO.decreaseButton) && Intrinsics.d(this.increaseButton, touristCountSelectorV3DTO.increaseButton) && Intrinsics.d(this.alerts, touristCountSelectorV3DTO.alerts) && this.roomsMaxCount == touristCountSelectorV3DTO.roomsMaxCount;
    }

    public final ButtonV3DTO getAddRoomButton() {
        return this.addRoomButton;
    }

    @NotNull
    public final List<AlertDTO> getAlerts() {
        return this.alerts;
    }

    @NotNull
    public final ButtonV3DTO getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final ChildFormDTO getChildForm() {
        return this.childForm;
    }

    @NotNull
    public final IconButtonV3DTO getDecreaseButton() {
        return this.decreaseButton;
    }

    public final ButtonV3DTO getDeleteRoomButton() {
        return this.deleteRoomButton;
    }

    @NotNull
    public final IconButtonV3DTO getIncreaseButton() {
        return this.increaseButton;
    }

    @NotNull
    public final List<QuantityCellDTO> getRoomCells() {
        return this.roomCells;
    }

    @NotNull
    public final List<RoomDTO> getRooms() {
        return this.rooms;
    }

    public final int getRoomsMaxCount() {
        return this.roomsMaxCount;
    }

    public int hashCode() {
        int b11 = G.g.b((this.childForm.hashCode() + (this.roomCells.hashCode() * 31)) * 31, 31, this.rooms);
        ButtonV3DTO buttonV3DTO = this.deleteRoomButton;
        int hashCode = (b11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO2 = this.addRoomButton;
        return Integer.hashCode(this.roomsMaxCount) + G.g.b(GR.b.c(this.increaseButton, GR.b.c(this.decreaseButton, C2859b.c(this.applyButton, (hashCode + (buttonV3DTO2 != null ? buttonV3DTO2.hashCode() : 0)) * 31, 31), 31), 31), 31, this.alerts);
    }

    @NotNull
    public String toString() {
        return "TouristCountSelectorV3DTO(roomCells=" + this.roomCells + ", childForm=" + this.childForm + ", rooms=" + this.rooms + ", deleteRoomButton=" + this.deleteRoomButton + ", addRoomButton=" + this.addRoomButton + ", applyButton=" + this.applyButton + ", decreaseButton=" + this.decreaseButton + ", increaseButton=" + this.increaseButton + ", alerts=" + this.alerts + ", roomsMaxCount=" + this.roomsMaxCount + ")";
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO;", "", "brokenRule", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO$BrokenRuleDTO;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "showAlertNow", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO$BrokenRuleDTO;Lru/ozon/uni/android/flashbar/model/Restriction;ZLjava/lang/Integer;)V", "getBrokenRule", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO$BrokenRuleDTO;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "getShowAlertNow", "()Z", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO$BrokenRuleDTO;Lru/ozon/uni/android/flashbar/model/Restriction;ZLjava/lang/Integer;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO;", "equals", "other", "hashCode", "toString", "", "BrokenRuleDTO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AlertDTO {
        public static final int $stable = Restriction.$stable;

        @EnumNullFallback
        @NotNull
        private final BrokenRuleDTO brokenRule;

        @NotNull
        private final Restriction restriction;
        private final boolean showAlertNow;
        private final Integer value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO$BrokenRuleDTO;", "", "<init>", "(Ljava/lang/String;I)V", "BROKEN_RULE_UNSPECIFIED", "BROKEN_RULE_ROOM_TOURISTS_SUM", "BROKEN_RULE_TOTAL_TOURISTS_SUM", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BrokenRuleDTO {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ BrokenRuleDTO[] $VALUES;

            @i(name = "BROKEN_RULE_UNSPECIFIED")
            public static final BrokenRuleDTO BROKEN_RULE_UNSPECIFIED = new BrokenRuleDTO("BROKEN_RULE_UNSPECIFIED", 0);

            @i(name = "BROKEN_RULE_ROOM_TOURISTS_SUM")
            public static final BrokenRuleDTO BROKEN_RULE_ROOM_TOURISTS_SUM = new BrokenRuleDTO("BROKEN_RULE_ROOM_TOURISTS_SUM", 1);

            @i(name = "BROKEN_RULE_TOTAL_TOURISTS_SUM")
            public static final BrokenRuleDTO BROKEN_RULE_TOTAL_TOURISTS_SUM = new BrokenRuleDTO("BROKEN_RULE_TOTAL_TOURISTS_SUM", 2);

            private static final /* synthetic */ BrokenRuleDTO[] $values() {
                return new BrokenRuleDTO[]{BROKEN_RULE_UNSPECIFIED, BROKEN_RULE_ROOM_TOURISTS_SUM, BROKEN_RULE_TOTAL_TOURISTS_SUM};
            }

            static {
                BrokenRuleDTO[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private BrokenRuleDTO(String str, int i11) {
            }

            public static BrokenRuleDTO valueOf(String str) {
                return (BrokenRuleDTO) Enum.valueOf(BrokenRuleDTO.class, str);
            }

            public static BrokenRuleDTO[] values() {
                return (BrokenRuleDTO[]) $VALUES.clone();
            }
        }

        public AlertDTO(@NotNull BrokenRuleDTO brokenRule, @NotNull Restriction restriction, boolean z11, Integer num) {
            Intrinsics.checkNotNullParameter(brokenRule, "brokenRule");
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            this.brokenRule = brokenRule;
            this.restriction = restriction;
            this.showAlertNow = z11;
            this.value = num;
        }

        public static /* synthetic */ AlertDTO copy$default(AlertDTO alertDTO, BrokenRuleDTO brokenRuleDTO, Restriction restriction, boolean z11, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                brokenRuleDTO = alertDTO.brokenRule;
            }
            if ((i11 & 2) != 0) {
                restriction = alertDTO.restriction;
            }
            if ((i11 & 4) != 0) {
                z11 = alertDTO.showAlertNow;
            }
            if ((i11 & 8) != 0) {
                num = alertDTO.value;
            }
            return alertDTO.copy(brokenRuleDTO, restriction, z11, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BrokenRuleDTO getBrokenRule() {
            return this.brokenRule;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Restriction getRestriction() {
            return this.restriction;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowAlertNow() {
            return this.showAlertNow;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        @NotNull
        public final AlertDTO copy(@NotNull BrokenRuleDTO brokenRule, @NotNull Restriction restriction, boolean showAlertNow, Integer value) {
            Intrinsics.checkNotNullParameter(brokenRule, "brokenRule");
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            return new AlertDTO(brokenRule, restriction, showAlertNow, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertDTO)) {
                return false;
            }
            AlertDTO alertDTO = (AlertDTO) other;
            return this.brokenRule == alertDTO.brokenRule && Intrinsics.d(this.restriction, alertDTO.restriction) && this.showAlertNow == alertDTO.showAlertNow && Intrinsics.d(this.value, alertDTO.value);
        }

        @NotNull
        public final BrokenRuleDTO getBrokenRule() {
            return this.brokenRule;
        }

        @NotNull
        public final Restriction getRestriction() {
            return this.restriction;
        }

        public final boolean getShowAlertNow() {
            return this.showAlertNow;
        }

        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            int a11 = C3532b.a((this.restriction.hashCode() + (this.brokenRule.hashCode() * 31)) * 31, 31, this.showAlertNow);
            Integer num = this.value;
            return a11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "AlertDTO(brokenRule=" + this.brokenRule + ", restriction=" + this.restriction + ", showAlertNow=" + this.showAlertNow + ", value=" + this.value + ")";
        }

        public /* synthetic */ AlertDTO(BrokenRuleDTO brokenRuleDTO, Restriction restriction, boolean z11, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? BrokenRuleDTO.BROKEN_RULE_UNSPECIFIED : brokenRuleDTO, restriction, z11, num);
        }
    }
}
