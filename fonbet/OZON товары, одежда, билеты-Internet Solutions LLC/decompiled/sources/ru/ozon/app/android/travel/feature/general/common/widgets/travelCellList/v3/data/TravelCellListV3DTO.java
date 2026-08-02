package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data;

import B0.C2454a;
import B3.p;
import G.g;
import GR.b;
import Kk.C3532b;
import T7.P;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.BadgeIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "cellBlocks", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$CellBlockDTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getCellBlocks", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CellBlockDTO", "ElementMargins", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCellListV3DTO implements TrackingInfoHolder {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<CellBlockDTO> cellBlocks;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins;", "", "leading", "Lru/ozon/uni/atoms/data/common/Paddings;", "top", "trailing", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeading", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "getTrailing", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ElementMargins {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final ElementMargins EMPTY = new ElementMargins(null, null, null, null, 15, null);

        @EnumNullFallback
        @NotNull
        private final Paddings bottom;

        @EnumNullFallback
        @NotNull
        private final Paddings leading;

        @EnumNullFallback
        @NotNull
        private final Paddings top;

        @EnumNullFallback
        @NotNull
        private final Paddings trailing;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins$Companion;", "", "<init>", "()V", "EMPTY", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins;", "getEMPTY", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ElementMargins getEMPTY() {
                return ElementMargins.EMPTY;
            }

            private Companion() {
            }
        }

        public ElementMargins() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ ElementMargins copy$default(ElementMargins elementMargins, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = elementMargins.leading;
            }
            if ((i11 & 2) != 0) {
                paddings2 = elementMargins.top;
            }
            if ((i11 & 4) != 0) {
                paddings3 = elementMargins.trailing;
            }
            if ((i11 & 8) != 0) {
                paddings4 = elementMargins.bottom;
            }
            return elementMargins.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getLeading() {
            return this.leading;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTrailing() {
            return this.trailing;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final ElementMargins copy(@NotNull Paddings leading, @NotNull Paddings top, @NotNull Paddings trailing, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            return new ElementMargins(leading, top, trailing, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ElementMargins)) {
                return false;
            }
            ElementMargins elementMargins = (ElementMargins) other;
            return this.leading == elementMargins.leading && this.top == elementMargins.top && this.trailing == elementMargins.trailing && this.bottom == elementMargins.bottom;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeading() {
            return this.leading;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        public final Paddings getTrailing() {
            return this.trailing;
        }

        public int hashCode() {
            return this.bottom.hashCode() + b.b(this.trailing, b.b(this.top, this.leading.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.leading;
            Paddings paddings2 = this.top;
            return b.e(p.b("ElementMargins(leading=", paddings, ", top=", paddings2, ", trailing="), this.trailing, ", bottom=", this.bottom, ")");
        }

        public ElementMargins(@NotNull Paddings leading, @NotNull Paddings top, @NotNull Paddings trailing, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(leading, "leading");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(trailing, "trailing");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.leading = leading;
            this.top = top;
            this.trailing = trailing;
            this.bottom = bottom;
        }

        public /* synthetic */ ElementMargins(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    public TravelCellListV3DTO(@NotNull List<CellBlockDTO> cellBlocks, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
        this.cellBlocks = cellBlocks;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelCellListV3DTO copy$default(TravelCellListV3DTO travelCellListV3DTO, List list, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelCellListV3DTO.cellBlocks;
        }
        if ((i11 & 2) != 0) {
            str = travelCellListV3DTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            map = travelCellListV3DTO.trackingInfo;
        }
        return travelCellListV3DTO.copy(list, str, map);
    }

    @NotNull
    public final List<CellBlockDTO> component1() {
        return this.cellBlocks;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelCellListV3DTO copy(@NotNull List<CellBlockDTO> cellBlocks, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
        return new TravelCellListV3DTO(cellBlocks, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCellListV3DTO)) {
            return false;
        }
        TravelCellListV3DTO travelCellListV3DTO = (TravelCellListV3DTO) other;
        return Intrinsics.d(this.cellBlocks, travelCellListV3DTO.cellBlocks) && Intrinsics.d(this.backgroundColor, travelCellListV3DTO.backgroundColor) && Intrinsics.d(this.trackingInfo, travelCellListV3DTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<CellBlockDTO> getCellBlocks() {
        return this.cellBlocks;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.cellBlocks.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<CellBlockDTO> list = this.cellBlocks;
        String str = this.backgroundColor;
        return P.f(C4055a.a("TravelCellListV3DTO(cellBlocks=", ", backgroundColor=", str, ", trackingInfo=", list), this.trackingInfo, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jq\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0011HÖ\u0001J\t\u00104\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$CellBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "margins", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins;", "cells", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "enableHtmlTags", "", "onboardingIndex", "", "onboardingApp", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins;Ljava/util/List;ZILru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getMargins", "()Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v3/data/TravelCellListV3DTO$ElementMargins;", "getCells", "()Ljava/util/List;", "getEnableHtmlTags", "()Z", "getOnboardingIndex", "()I", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlockDTO {
        public static final int $stable = 8;
        private final String backgroundColor;

        @NotNull
        private final List<AtomDTO> cells;

        @EnumNullFallback
        @NotNull
        private final CornerRadius cornerRadius;
        private final boolean enableHtmlTags;

        @NotNull
        private final ElementMargins margins;
        private final OnBoardingDTO onboardingApp;
        private final int onboardingIndex;
        private final TextDTO subtitle;
        private final TextDTO title;

        /* JADX WARN: Multi-variable type inference failed */
        public CellBlockDTO(TextDTO textDTO, TextDTO textDTO2, String str, @NotNull CornerRadius cornerRadius, @NotNull ElementMargins margins, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconTitleSubtitleCell", type = IconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "badgeIconTitleSubtitleCell", type = BadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "dsCell", type = CellDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> cells, boolean z11, int i11, OnBoardingDTO onBoardingDTO) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(margins, "margins");
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.margins = margins;
            this.cells = cells;
            this.enableHtmlTags = z11;
            this.onboardingIndex = i11;
            this.onboardingApp = onBoardingDTO;
        }

        public static /* synthetic */ CellBlockDTO copy$default(CellBlockDTO cellBlockDTO, TextDTO textDTO, TextDTO textDTO2, String str, CornerRadius cornerRadius, ElementMargins elementMargins, List list, boolean z11, int i11, OnBoardingDTO onBoardingDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textDTO = cellBlockDTO.title;
            }
            if ((i12 & 2) != 0) {
                textDTO2 = cellBlockDTO.subtitle;
            }
            if ((i12 & 4) != 0) {
                str = cellBlockDTO.backgroundColor;
            }
            if ((i12 & 8) != 0) {
                cornerRadius = cellBlockDTO.cornerRadius;
            }
            if ((i12 & 16) != 0) {
                elementMargins = cellBlockDTO.margins;
            }
            if ((i12 & 32) != 0) {
                list = cellBlockDTO.cells;
            }
            if ((i12 & 64) != 0) {
                z11 = cellBlockDTO.enableHtmlTags;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i11 = cellBlockDTO.onboardingIndex;
            }
            if ((i12 & 256) != 0) {
                onBoardingDTO = cellBlockDTO.onboardingApp;
            }
            int i13 = i11;
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            List list2 = list;
            boolean z12 = z11;
            ElementMargins elementMargins2 = elementMargins;
            String str2 = str;
            return cellBlockDTO.copy(textDTO, textDTO2, str2, cornerRadius, elementMargins2, list2, z12, i13, onBoardingDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ElementMargins getMargins() {
            return this.margins;
        }

        @NotNull
        public final List<AtomDTO> component6() {
            return this.cells;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getEnableHtmlTags() {
            return this.enableHtmlTags;
        }

        /* renamed from: component8, reason: from getter */
        public final int getOnboardingIndex() {
            return this.onboardingIndex;
        }

        /* renamed from: component9, reason: from getter */
        public final OnBoardingDTO getOnboardingApp() {
            return this.onboardingApp;
        }

        @NotNull
        public final CellBlockDTO copy(TextDTO title, TextDTO subtitle, String backgroundColor, @NotNull CornerRadius cornerRadius, @NotNull ElementMargins margins, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconTitleSubtitleCell", type = IconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "badgeIconTitleSubtitleCell", type = BadgeIconTitleSubtitleCellDTO.class), @ProtoOneOfSignature(name = "dsCell", type = CellDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> cells, boolean enableHtmlTags, int onboardingIndex, OnBoardingDTO onboardingApp) {
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            Intrinsics.checkNotNullParameter(margins, "margins");
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CellBlockDTO(title, subtitle, backgroundColor, cornerRadius, margins, cells, enableHtmlTags, onboardingIndex, onboardingApp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlockDTO)) {
                return false;
            }
            CellBlockDTO cellBlockDTO = (CellBlockDTO) other;
            return Intrinsics.d(this.title, cellBlockDTO.title) && Intrinsics.d(this.subtitle, cellBlockDTO.subtitle) && Intrinsics.d(this.backgroundColor, cellBlockDTO.backgroundColor) && this.cornerRadius == cellBlockDTO.cornerRadius && Intrinsics.d(this.margins, cellBlockDTO.margins) && Intrinsics.d(this.cells, cellBlockDTO.cells) && this.enableHtmlTags == cellBlockDTO.enableHtmlTags && this.onboardingIndex == cellBlockDTO.onboardingIndex && Intrinsics.d(this.onboardingApp, cellBlockDTO.onboardingApp);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<AtomDTO> getCells() {
            return this.cells;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        public final boolean getEnableHtmlTags() {
            return this.enableHtmlTags;
        }

        @NotNull
        public final ElementMargins getMargins() {
            return this.margins;
        }

        public final OnBoardingDTO getOnboardingApp() {
            return this.onboardingApp;
        }

        public final int getOnboardingIndex() {
            return this.onboardingIndex;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            String str = this.backgroundColor;
            int a11 = C2454a.a(this.onboardingIndex, C3532b.a(g.b((this.margins.hashCode() + Tl.b.b(this.cornerRadius, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.cells), 31, this.enableHtmlTags), 31);
            OnBoardingDTO onBoardingDTO = this.onboardingApp;
            return a11 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            ElementMargins elementMargins = this.margins;
            List<AtomDTO> list = this.cells;
            boolean z11 = this.enableHtmlTags;
            int i11 = this.onboardingIndex;
            OnBoardingDTO onBoardingDTO = this.onboardingApp;
            StringBuilder g10 = D3.g.g("CellBlockDTO(title=", textDTO, ", subtitle=", textDTO2, ", backgroundColor=");
            g10.append(str);
            g10.append(", cornerRadius=");
            g10.append(cornerRadius);
            g10.append(", margins=");
            g10.append(elementMargins);
            g10.append(", cells=");
            g10.append(list);
            g10.append(", enableHtmlTags=");
            g10.append(z11);
            g10.append(", onboardingIndex=");
            g10.append(i11);
            g10.append(", onboardingApp=");
            g10.append(onBoardingDTO);
            g10.append(")");
            return g10.toString();
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ CellBlockDTO(ru.ozon.uni.atoms.data.text.TextDTO r13, ru.ozon.uni.atoms.data.text.TextDTO r14, java.lang.String r15, ru.ozon.uni.atoms.data.common.CornerRadius r16, ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data.TravelCellListV3DTO.ElementMargins r17, java.util.List r18, boolean r19, int r20, ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 8
                if (r1 == 0) goto La
                ru.ozon.uni.atoms.data.common.CornerRadius r1 = ru.ozon.uni.atoms.data.common.CornerRadius.NO_RADIUS
                r6 = r1
                goto Lc
            La:
                r6 = r16
            Lc:
                r1 = r0 & 16
                if (r1 == 0) goto L18
                ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data.TravelCellListV3DTO$ElementMargins$Companion r1 = ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data.TravelCellListV3DTO.ElementMargins.INSTANCE
                ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data.TravelCellListV3DTO$ElementMargins r1 = r1.getEMPTY()
                r7 = r1
                goto L1a
            L18:
                r7 = r17
            L1a:
                r1 = r0 & 64
                r2 = 0
                if (r1 == 0) goto L21
                r9 = r2
                goto L23
            L21:
                r9 = r19
            L23:
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L31
                r10 = r2
                r3 = r13
                r4 = r14
                r5 = r15
                r8 = r18
                r11 = r21
                r2 = r12
                goto L3b
            L31:
                r10 = r20
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r8 = r18
                r11 = r21
            L3b:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data.TravelCellListV3DTO.CellBlockDTO.<init>(ru.ozon.uni.atoms.data.text.TextDTO, ru.ozon.uni.atoms.data.text.TextDTO, java.lang.String, ru.ozon.uni.atoms.data.common.CornerRadius, ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.data.TravelCellListV3DTO$ElementMargins, java.util.List, boolean, int, ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
