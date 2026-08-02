package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data;

import B90.C2616s;
import B90.C2619v;
import G.g;
import HY.a;
import J.d;
import T7.P;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.molecules.dto.travelTab.v2.TravelTabDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001,B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "filterTabs", "", "Lru/ozon/app/android/travel/molecules/dto/travelTab/v2/TravelTabDTO;", "blocks", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO$CellsBlockDTO;", "selectButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "returnButton", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getFilterTabs", "()Ljava/util/List;", "getBlocks", "getSelectButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getReturnButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "CellsBlockDTO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursMealDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<CellsBlockDTO> blocks;

    @NotNull
    private final List<TravelTabDTO> filterTabs;

    @NotNull
    private final ButtonV3Atom.LargeButton returnButton;

    @NotNull
    private final ButtonV3Atom.LargeButton selectButton;

    @NotNull
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO$CellsBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "cells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCells", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellsBlockDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter> cells;

        @NotNull
        private final TextAtom title;

        public CellsBlockDTO(@NotNull TextAtom title, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter> cells) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.title = title;
            this.cells = cells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CellsBlockDTO copy$default(CellsBlockDTO cellsBlockDTO, TextAtom textAtom, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = cellsBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = cellsBlockDTO.cells;
            }
            return cellsBlockDTO.copy(textAtom, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter> component2() {
            return this.cells;
        }

        @NotNull
        public final CellsBlockDTO copy(@NotNull TextAtom title, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter> cells) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CellsBlockDTO(title, cells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellsBlockDTO)) {
                return false;
            }
            CellsBlockDTO cellsBlockDTO = (CellsBlockDTO) other;
            return Intrinsics.d(this.title, cellsBlockDTO.title) && Intrinsics.d(this.cells, cellsBlockDTO.cells);
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter> getCells() {
            return this.cells;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.cells.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.c("CellsBlockDTO(title=", this.title, ", cells=", this.cells, ")");
        }
    }

    public ToursMealDTO(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull List<TravelTabDTO> filterTabs, @NotNull List<CellsBlockDTO> blocks, @NotNull ButtonV3Atom.LargeButton selectButton, @NotNull ButtonV3Atom.LargeButton returnButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(filterTabs, "filterTabs");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        Intrinsics.checkNotNullParameter(returnButton, "returnButton");
        this.title = title;
        this.subtitle = subtitle;
        this.filterTabs = filterTabs;
        this.blocks = blocks;
        this.selectButton = selectButton;
        this.returnButton = returnButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ToursMealDTO copy$default(ToursMealDTO toursMealDTO, TextAtom textAtom, TextAtom textAtom2, List list, List list2, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = toursMealDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = toursMealDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = toursMealDTO.filterTabs;
        }
        if ((i11 & 8) != 0) {
            list2 = toursMealDTO.blocks;
        }
        if ((i11 & 16) != 0) {
            largeButton = toursMealDTO.selectButton;
        }
        if ((i11 & 32) != 0) {
            largeButton2 = toursMealDTO.returnButton;
        }
        if ((i11 & 64) != 0) {
            map = toursMealDTO.trackingInfo;
        }
        ButtonV3Atom.LargeButton largeButton3 = largeButton2;
        Map map2 = map;
        ButtonV3Atom.LargeButton largeButton4 = largeButton;
        List list3 = list;
        return toursMealDTO.copy(textAtom, textAtom2, list3, list2, largeButton4, largeButton3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<TravelTabDTO> component3() {
        return this.filterTabs;
    }

    @NotNull
    public final List<CellsBlockDTO> component4() {
        return this.blocks;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeButton getSelectButton() {
        return this.selectButton;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.LargeButton getReturnButton() {
        return this.returnButton;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final ToursMealDTO copy(@NotNull TextAtom title, @NotNull TextAtom subtitle, @NotNull List<TravelTabDTO> filterTabs, @NotNull List<CellsBlockDTO> blocks, @NotNull ButtonV3Atom.LargeButton selectButton, @NotNull ButtonV3Atom.LargeButton returnButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(filterTabs, "filterTabs");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        Intrinsics.checkNotNullParameter(returnButton, "returnButton");
        return new ToursMealDTO(title, subtitle, filterTabs, blocks, selectButton, returnButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursMealDTO)) {
            return false;
        }
        ToursMealDTO toursMealDTO = (ToursMealDTO) other;
        return Intrinsics.d(this.title, toursMealDTO.title) && Intrinsics.d(this.subtitle, toursMealDTO.subtitle) && Intrinsics.d(this.filterTabs, toursMealDTO.filterTabs) && Intrinsics.d(this.blocks, toursMealDTO.blocks) && Intrinsics.d(this.selectButton, toursMealDTO.selectButton) && Intrinsics.d(this.returnButton, toursMealDTO.returnButton) && Intrinsics.d(this.trackingInfo, toursMealDTO.trackingInfo);
    }

    @NotNull
    public final List<CellsBlockDTO> getBlocks() {
        return this.blocks;
    }

    @NotNull
    public final List<TravelTabDTO> getFilterTabs() {
        return this.filterTabs;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getReturnButton() {
        return this.returnButton;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getSelectButton() {
        return this.selectButton;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.returnButton, b.a(this.selectButton, g.b(g.b(C2619v.b(this.title.hashCode() * 31, 31, this.subtitle), 31, this.filterTabs), 31, this.blocks), 31), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<TravelTabDTO> list = this.filterTabs;
        List<CellsBlockDTO> list2 = this.blocks;
        ButtonV3Atom.LargeButton largeButton = this.selectButton;
        ButtonV3Atom.LargeButton largeButton2 = this.returnButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("ToursMealDTO(title=", textAtom, ", subtitle=", textAtom2, ", filterTabs=");
        C2616s.g(", blocks=", ", selectButton=", a11, list, list2);
        a11.append(largeButton);
        a11.append(", returnButton=");
        a11.append(largeButton2);
        a11.append(", trackingInfo=");
        return P.f(a11, map, ")");
    }

    public ToursMealDTO(TextAtom textAtom, TextAtom textAtom2, List list, List list2, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.LargeButton largeButton2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textAtom, textAtom2, (i11 & 4) != 0 ? K.f71697a : list, list2, largeButton, largeButton2, map);
    }
}
