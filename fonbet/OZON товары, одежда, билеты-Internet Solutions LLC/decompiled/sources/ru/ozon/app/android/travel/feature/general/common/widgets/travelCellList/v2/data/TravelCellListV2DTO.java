package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.data;

import B0.C2454a;
import B90.C2618u;
import Bk.C2638a;
import G.g;
import HY.a;
import J0.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u00014B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u0087\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000eHÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001f¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cellBlocks", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2DTO$CellBlockDTO;", "topRadius", "", "bottomRadius", "cellsTopMargin", "blockBottomMargin", "blockTitleBottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;IIIII)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getCellBlocks", "()Ljava/util/List;", "getTopRadius", "()I", "getBottomRadius", "getCellsTopMargin", "getBlockBottomMargin", "getBlockTitleBottomMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "CellBlockDTO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCellListV2DTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final int blockBottomMargin;
    private final int blockTitleBottomMargin;
    private final int bottomRadius;

    @NotNull
    private final List<CellBlockDTO> cellBlocks;
    private final int cellsTopMargin;
    private final TextAtom description;
    private final TextAtom title;
    private final int topRadius;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public TravelCellListV2DTO(TextAtom textAtom, TextAtom textAtom2, String str, Map<String, TokenizedTrackingInfo> map, @NotNull List<CellBlockDTO> cellBlocks, int i11, int i12, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
        this.title = textAtom;
        this.description = textAtom2;
        this.backgroundColor = str;
        this.trackingInfo = map;
        this.cellBlocks = cellBlocks;
        this.topRadius = i11;
        this.bottomRadius = i12;
        this.cellsTopMargin = i13;
        this.blockBottomMargin = i14;
        this.blockTitleBottomMargin = i15;
    }

    public static /* synthetic */ TravelCellListV2DTO copy$default(TravelCellListV2DTO travelCellListV2DTO, TextAtom textAtom, TextAtom textAtom2, String str, Map map, List list, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            textAtom = travelCellListV2DTO.title;
        }
        if ((i16 & 2) != 0) {
            textAtom2 = travelCellListV2DTO.description;
        }
        if ((i16 & 4) != 0) {
            str = travelCellListV2DTO.backgroundColor;
        }
        if ((i16 & 8) != 0) {
            map = travelCellListV2DTO.trackingInfo;
        }
        if ((i16 & 16) != 0) {
            list = travelCellListV2DTO.cellBlocks;
        }
        if ((i16 & 32) != 0) {
            i11 = travelCellListV2DTO.topRadius;
        }
        if ((i16 & 64) != 0) {
            i12 = travelCellListV2DTO.bottomRadius;
        }
        if ((i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            i13 = travelCellListV2DTO.cellsTopMargin;
        }
        if ((i16 & 256) != 0) {
            i14 = travelCellListV2DTO.blockBottomMargin;
        }
        if ((i16 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            i15 = travelCellListV2DTO.blockTitleBottomMargin;
        }
        int i17 = i14;
        int i18 = i15;
        int i19 = i12;
        int i21 = i13;
        List list2 = list;
        int i22 = i11;
        return travelCellListV2DTO.copy(textAtom, textAtom2, str, map, list2, i22, i19, i21, i17, i18);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final int getBlockTitleBottomMargin() {
        return this.blockTitleBottomMargin;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<CellBlockDTO> component5() {
        return this.cellBlocks;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTopRadius() {
        return this.topRadius;
    }

    /* renamed from: component7, reason: from getter */
    public final int getBottomRadius() {
        return this.bottomRadius;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCellsTopMargin() {
        return this.cellsTopMargin;
    }

    /* renamed from: component9, reason: from getter */
    public final int getBlockBottomMargin() {
        return this.blockBottomMargin;
    }

    @NotNull
    public final TravelCellListV2DTO copy(TextAtom title, TextAtom description, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<CellBlockDTO> cellBlocks, int topRadius, int bottomRadius, int cellsTopMargin, int blockBottomMargin, int blockTitleBottomMargin) {
        Intrinsics.checkNotNullParameter(cellBlocks, "cellBlocks");
        return new TravelCellListV2DTO(title, description, backgroundColor, trackingInfo, cellBlocks, topRadius, bottomRadius, cellsTopMargin, blockBottomMargin, blockTitleBottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCellListV2DTO)) {
            return false;
        }
        TravelCellListV2DTO travelCellListV2DTO = (TravelCellListV2DTO) other;
        return Intrinsics.d(this.title, travelCellListV2DTO.title) && Intrinsics.d(this.description, travelCellListV2DTO.description) && Intrinsics.d(this.backgroundColor, travelCellListV2DTO.backgroundColor) && Intrinsics.d(this.trackingInfo, travelCellListV2DTO.trackingInfo) && Intrinsics.d(this.cellBlocks, travelCellListV2DTO.cellBlocks) && this.topRadius == travelCellListV2DTO.topRadius && this.bottomRadius == travelCellListV2DTO.bottomRadius && this.cellsTopMargin == travelCellListV2DTO.cellsTopMargin && this.blockBottomMargin == travelCellListV2DTO.blockBottomMargin && this.blockTitleBottomMargin == travelCellListV2DTO.blockTitleBottomMargin;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBlockBottomMargin() {
        return this.blockBottomMargin;
    }

    public final int getBlockTitleBottomMargin() {
        return this.blockTitleBottomMargin;
    }

    public final int getBottomRadius() {
        return this.bottomRadius;
    }

    @NotNull
    public final List<CellBlockDTO> getCellBlocks() {
        return this.cellBlocks;
    }

    public final int getCellsTopMargin() {
        return this.cellsTopMargin;
    }

    public final TextAtom getDescription() {
        return this.description;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final int getTopRadius() {
        return this.topRadius;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        TextAtom textAtom2 = this.description;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return Integer.hashCode(this.blockTitleBottomMargin) + C2454a.a(this.blockBottomMargin, C2454a.a(this.cellsTopMargin, C2454a.a(this.bottomRadius, C2454a.a(this.topRadius, g.b((hashCode3 + (map != null ? map.hashCode() : 0)) * 31, 31, this.cellBlocks), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.description;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<CellBlockDTO> list = this.cellBlocks;
        int i11 = this.topRadius;
        int i12 = this.bottomRadius;
        int i13 = this.cellsTopMargin;
        int i14 = this.blockBottomMargin;
        int i15 = this.blockTitleBottomMargin;
        StringBuilder a11 = a.a("TravelCellListV2DTO(title=", textAtom, ", description=", textAtom2, ", backgroundColor=");
        C2638a.e(a11, str, ", trackingInfo=", map, ", cellBlocks=");
        a11.append(list);
        a11.append(", topRadius=");
        a11.append(i11);
        a11.append(", bottomRadius=");
        Ek.a.f(i12, i13, ", cellsTopMargin=", ", blockBottomMargin=", a11);
        return P.a(i14, i15, ", blockTitleBottomMargin=", ")", a11);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/data/TravelCellListV2DTO$CellBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "cells", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCells", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellBlockDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<AtomDTO> cells;
        private final TextDTO subtitle;
        private final TextAtom title;

        /* JADX WARN: Multi-variable type inference failed */
        public CellBlockDTO(TextAtom textAtom, TextDTO textDTO, @NotNull List<? extends AtomDTO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.title = textAtom;
            this.subtitle = textDTO;
            this.cells = cells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CellBlockDTO copy$default(CellBlockDTO cellBlockDTO, TextAtom textAtom, TextDTO textDTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = cellBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO = cellBlockDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                list = cellBlockDTO.cells;
            }
            return cellBlockDTO.copy(textAtom, textDTO, list);
        }

        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final List<AtomDTO> component3() {
            return this.cells;
        }

        @NotNull
        public final CellBlockDTO copy(TextAtom title, TextDTO subtitle, @NotNull List<? extends AtomDTO> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CellBlockDTO(title, subtitle, cells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellBlockDTO)) {
                return false;
            }
            CellBlockDTO cellBlockDTO = (CellBlockDTO) other;
            return Intrinsics.d(this.title, cellBlockDTO.title) && Intrinsics.d(this.subtitle, cellBlockDTO.subtitle) && Intrinsics.d(this.cells, cellBlockDTO.cells);
        }

        @NotNull
        public final List<AtomDTO> getCells() {
            return this.cells;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            TextDTO textDTO = this.subtitle;
            return this.cells.hashCode() + ((hashCode + (textDTO != null ? textDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextDTO textDTO = this.subtitle;
            List<AtomDTO> list = this.cells;
            StringBuilder sb2 = new StringBuilder("CellBlockDTO(title=");
            sb2.append(textAtom);
            sb2.append(", subtitle=");
            sb2.append(textDTO);
            sb2.append(", cells=");
            return C2618u.h(sb2, list, ")");
        }

        public CellBlockDTO(TextAtom textAtom, TextDTO textDTO, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtom, textDTO, (i11 & 4) != 0 ? K.f71697a : list);
        }
    }

    public TravelCellListV2DTO(TextAtom textAtom, TextAtom textAtom2, String str, Map map, List list, int i11, int i12, int i13, int i14, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, str, map, (i16 & 16) != 0 ? K.f71697a : list, (i16 & 32) != 0 ? CornerRadius.NO_RADIUS.getPx() : i11, (i16 & 64) != 0 ? CornerRadius.NO_RADIUS.getPx() : i12, (i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Paddings.NONE.getPx() : i13, (i16 & 256) != 0 ? Paddings.PADDING_300.getPx() : i14, (i16 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? Paddings.PADDING_200.getPx() : i15);
    }
}
