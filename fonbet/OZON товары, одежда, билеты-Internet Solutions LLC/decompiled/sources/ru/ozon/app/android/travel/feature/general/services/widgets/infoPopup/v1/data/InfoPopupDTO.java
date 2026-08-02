package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.data;

import B90.C2616s;
import T7.P;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellsDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001&BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO;", "", "image", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO$InfoPopupImageDTO;", "textInfoCells", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellsDTO;", "cells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "buttons", "Lru/ozon/uni/atoms/data/AtomDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO$InfoPopupImageDTO;Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellsDTO;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getImage", "()Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO$InfoPopupImageDTO;", "getTextInfoCells", "()Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellsDTO;", "getCells", "()Ljava/util/List;", "getButtons", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "InfoPopupImageDTO", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class InfoPopupDTO {
    public static final int $stable = 8;
    private final List<AtomDTO> buttons;
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells;
    private final InfoPopupImageDTO image;
    private final TextInfoCellsDTO textInfoCells;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO$InfoPopupImageDTO;", "", "src", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSrc", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfoPopupImageDTO {
        public static final int $stable = 0;
        private final String backgroundColor;

        @NotNull
        private final String src;

        public InfoPopupImageDTO(@NotNull String src, String str) {
            Intrinsics.checkNotNullParameter(src, "src");
            this.src = src;
            this.backgroundColor = str;
        }

        public static /* synthetic */ InfoPopupImageDTO copy$default(InfoPopupImageDTO infoPopupImageDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = infoPopupImageDTO.src;
            }
            if ((i11 & 2) != 0) {
                str2 = infoPopupImageDTO.backgroundColor;
            }
            return infoPopupImageDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getSrc() {
            return this.src;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final InfoPopupImageDTO copy(@NotNull String src, String backgroundColor) {
            Intrinsics.checkNotNullParameter(src, "src");
            return new InfoPopupImageDTO(src, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoPopupImageDTO)) {
                return false;
            }
            InfoPopupImageDTO infoPopupImageDTO = (InfoPopupImageDTO) other;
            return Intrinsics.d(this.src, infoPopupImageDTO.src) && Intrinsics.d(this.backgroundColor, infoPopupImageDTO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getSrc() {
            return this.src;
        }

        public int hashCode() {
            int hashCode = this.src.hashCode() * 31;
            String str = this.backgroundColor;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("InfoPopupImageDTO(src=", this.src, ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InfoPopupDTO(InfoPopupImageDTO infoPopupImageDTO, TextInfoCellsDTO textInfoCellsDTO, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list, List<? extends AtomDTO> list2, Map<String, TokenizedTrackingInfo> map) {
        this.image = infoPopupImageDTO;
        this.textInfoCells = textInfoCellsDTO;
        this.cells = list;
        this.buttons = list2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ InfoPopupDTO copy$default(InfoPopupDTO infoPopupDTO, InfoPopupImageDTO infoPopupImageDTO, TextInfoCellsDTO textInfoCellsDTO, List list, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            infoPopupImageDTO = infoPopupDTO.image;
        }
        if ((i11 & 2) != 0) {
            textInfoCellsDTO = infoPopupDTO.textInfoCells;
        }
        if ((i11 & 4) != 0) {
            list = infoPopupDTO.cells;
        }
        if ((i11 & 8) != 0) {
            list2 = infoPopupDTO.buttons;
        }
        if ((i11 & 16) != 0) {
            map = infoPopupDTO.trackingInfo;
        }
        Map map2 = map;
        List list3 = list;
        return infoPopupDTO.copy(infoPopupImageDTO, textInfoCellsDTO, list3, list2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final InfoPopupImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final TextInfoCellsDTO getTextInfoCells() {
        return this.textInfoCells;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> component3() {
        return this.cells;
    }

    public final List<AtomDTO> component4() {
        return this.buttons;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final InfoPopupDTO copy(InfoPopupImageDTO image, TextInfoCellsDTO textInfoCells, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells, List<? extends AtomDTO> buttons, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new InfoPopupDTO(image, textInfoCells, cells, buttons, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoPopupDTO)) {
            return false;
        }
        InfoPopupDTO infoPopupDTO = (InfoPopupDTO) other;
        return Intrinsics.d(this.image, infoPopupDTO.image) && Intrinsics.d(this.textInfoCells, infoPopupDTO.textInfoCells) && Intrinsics.d(this.cells, infoPopupDTO.cells) && Intrinsics.d(this.buttons, infoPopupDTO.buttons) && Intrinsics.d(this.trackingInfo, infoPopupDTO.trackingInfo);
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> getCells() {
        return this.cells;
    }

    public final InfoPopupImageDTO getImage() {
        return this.image;
    }

    public final TextInfoCellsDTO getTextInfoCells() {
        return this.textInfoCells;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        InfoPopupImageDTO infoPopupImageDTO = this.image;
        int hashCode = (infoPopupImageDTO == null ? 0 : infoPopupImageDTO.hashCode()) * 31;
        TextInfoCellsDTO textInfoCellsDTO = this.textInfoCells;
        int hashCode2 = (hashCode + (textInfoCellsDTO == null ? 0 : textInfoCellsDTO.hashCode())) * 31;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = this.cells;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<AtomDTO> list2 = this.buttons;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        InfoPopupImageDTO infoPopupImageDTO = this.image;
        TextInfoCellsDTO textInfoCellsDTO = this.textInfoCells;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = this.cells;
        List<AtomDTO> list2 = this.buttons;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("InfoPopupDTO(image=");
        sb2.append(infoPopupImageDTO);
        sb2.append(", textInfoCells=");
        sb2.append(textInfoCellsDTO);
        sb2.append(", cells=");
        C2616s.g(", buttons=", ", trackingInfo=", sb2, list, list2);
        return P.f(sb2, map, ")");
    }
}
