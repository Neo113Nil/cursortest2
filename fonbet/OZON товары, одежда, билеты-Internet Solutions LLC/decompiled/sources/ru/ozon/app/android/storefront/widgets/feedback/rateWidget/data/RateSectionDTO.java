package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data;

import B90.C2618u;
import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO;", "", "key", "", "isRequired", "", "body", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBody", "()Ljava/lang/Object;", "Companion", "CheckboxIconSection", "CheckboxIconValue", "IconSection", "CheckboxSection", "CheckboxValue", "TextInputSection", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateSectionDTO {

    @NotNull
    public static final String CELL_ICON_SECTION = "iconSection";

    @NotNull
    public static final String CELL_RADIO_ICON_SECTION = "radioIconSection";

    @NotNull
    public static final String CELL_RADIO_SECTION = "radioSection";

    @NotNull
    public static final String TEXT_HEADER = "textPageHeader";

    @NotNull
    public static final String TEXT_INPUT_SECTION = "textInputSection";

    @NotNull
    public static final String TEXT_SECTION = "textHeader";

    @NotNull
    private final Object body;
    private final Boolean isRequired;

    @NotNull
    private final String key;
    public static final int $stable = 8;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO$CheckboxIconSection;", "", "cells", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO$CheckboxIconValue;", "<init>", "(Ljava/util/List;)V", "getCells", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckboxIconSection {
        public static final int $stable = 8;

        @NotNull
        private final List<CheckboxIconValue> cells;

        public CheckboxIconSection(@NotNull List<CheckboxIconValue> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.cells = cells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CheckboxIconSection copy$default(CheckboxIconSection checkboxIconSection, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = checkboxIconSection.cells;
            }
            return checkboxIconSection.copy(list);
        }

        @NotNull
        public final List<CheckboxIconValue> component1() {
            return this.cells;
        }

        @NotNull
        public final CheckboxIconSection copy(@NotNull List<CheckboxIconValue> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CheckboxIconSection(cells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckboxIconSection) && Intrinsics.d(this.cells, ((CheckboxIconSection) other).cells);
        }

        @NotNull
        public final List<CheckboxIconValue> getCells() {
            return this.cells;
        }

        public int hashCode() {
            return this.cells.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("CheckboxIconSection(cells=", ")", this.cells);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO$CheckboxIconValue;", "", "index", "", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;)V", "getIndex", "()Ljava/lang/String;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckboxIconValue {
        public static final int $stable = 8;

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell;

        @NotNull
        private final String index;

        public CheckboxIconValue(@NotNull String index, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell) {
            Intrinsics.checkNotNullParameter(index, "index");
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.index = index;
            this.cell = cell;
        }

        public static /* synthetic */ CheckboxIconValue copy$default(CheckboxIconValue checkboxIconValue, String str, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = checkboxIconValue.index;
            }
            if ((i11 & 2) != 0) {
                cellWithSubtitle40IconCheckboxRadio = checkboxIconValue.cell;
            }
            return checkboxIconValue.copy(str, cellWithSubtitle40IconCheckboxRadio);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio getCell() {
            return this.cell;
        }

        @NotNull
        public final CheckboxIconValue copy(@NotNull String index, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell) {
            Intrinsics.checkNotNullParameter(index, "index");
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new CheckboxIconValue(index, cell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckboxIconValue)) {
                return false;
            }
            CheckboxIconValue checkboxIconValue = (CheckboxIconValue) other;
            return Intrinsics.d(this.index, checkboxIconValue.index) && Intrinsics.d(this.cell, checkboxIconValue.cell);
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio getCell() {
            return this.cell;
        }

        @NotNull
        public final String getIndex() {
            return this.index;
        }

        public int hashCode() {
            return this.cell.hashCode() + (this.index.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CheckboxIconValue(index=" + this.index + ", cell=" + this.cell + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO$CheckboxSection;", "", "cells", "", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO$CheckboxValue;", "<init>", "(Ljava/util/List;)V", "getCells", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckboxSection {
        public static final int $stable = 8;

        @NotNull
        private final List<CheckboxValue> cells;

        public CheckboxSection(@NotNull List<CheckboxValue> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.cells = cells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CheckboxSection copy$default(CheckboxSection checkboxSection, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = checkboxSection.cells;
            }
            return checkboxSection.copy(list);
        }

        @NotNull
        public final List<CheckboxValue> component1() {
            return this.cells;
        }

        @NotNull
        public final CheckboxSection copy(@NotNull List<CheckboxValue> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new CheckboxSection(cells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckboxSection) && Intrinsics.d(this.cells, ((CheckboxSection) other).cells);
        }

        @NotNull
        public final List<CheckboxValue> getCells() {
            return this.cells;
        }

        public int hashCode() {
            return this.cells.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("CheckboxSection(cells=", ")", this.cells);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO$CheckboxValue;", "", "index", "", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;)V", "getIndex", "()Ljava/lang/String;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckboxValue {
        public static final int $stable = 8;

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell;

        @NotNull
        private final String index;

        public CheckboxValue(@NotNull String index, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell) {
            Intrinsics.checkNotNullParameter(index, "index");
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.index = index;
            this.cell = cell;
        }

        public static /* synthetic */ CheckboxValue copy$default(CheckboxValue checkboxValue, String str, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = checkboxValue.index;
            }
            if ((i11 & 2) != 0) {
                cellWithSubtitleCheckboxRadio = checkboxValue.cell;
            }
            return checkboxValue.copy(str, cellWithSubtitleCheckboxRadio);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio getCell() {
            return this.cell;
        }

        @NotNull
        public final CheckboxValue copy(@NotNull String index, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell) {
            Intrinsics.checkNotNullParameter(index, "index");
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new CheckboxValue(index, cell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckboxValue)) {
                return false;
            }
            CheckboxValue checkboxValue = (CheckboxValue) other;
            return Intrinsics.d(this.index, checkboxValue.index) && Intrinsics.d(this.cell, checkboxValue.cell);
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio getCell() {
            return this.cell;
        }

        @NotNull
        public final String getIndex() {
            return this.index;
        }

        public int hashCode() {
            return this.cell.hashCode() + (this.index.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CheckboxValue(index=" + this.index + ", cell=" + this.cell + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO$IconSection;", "", "cells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "<init>", "(Ljava/util/List;)V", "getCells", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconSection {
        public static final int $stable = 8;

        @NotNull
        private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon> cells;

        public IconSection(@NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            this.cells = cells;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IconSection copy$default(IconSection iconSection, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = iconSection.cells;
            }
            return iconSection.copy(list);
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon> component1() {
            return this.cells;
        }

        @NotNull
        public final IconSection copy(@NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon> cells) {
            Intrinsics.checkNotNullParameter(cells, "cells");
            return new IconSection(cells);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IconSection) && Intrinsics.d(this.cells, ((IconSection) other).cells);
        }

        @NotNull
        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon> getCells() {
            return this.cells;
        }

        public int hashCode() {
            return this.cells.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("IconSection(cells=", ")", this.cells);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateSectionDTO$TextInputSection;", "", HammersV3BodyDTO.PLACEHOLDER, "", "maxCharactersNumber", "", "<init>", "(Ljava/lang/String;I)V", "getPlaceholder", "()Ljava/lang/String;", "getMaxCharactersNumber", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextInputSection {
        public static final int $stable = 0;
        private final int maxCharactersNumber;

        @NotNull
        private final String placeholder;

        public TextInputSection(@NotNull String placeholder, int i11) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.placeholder = placeholder;
            this.maxCharactersNumber = i11;
        }

        public static /* synthetic */ TextInputSection copy$default(TextInputSection textInputSection, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textInputSection.placeholder;
            }
            if ((i12 & 2) != 0) {
                i11 = textInputSection.maxCharactersNumber;
            }
            return textInputSection.copy(str, i11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxCharactersNumber() {
            return this.maxCharactersNumber;
        }

        @NotNull
        public final TextInputSection copy(@NotNull String placeholder, int maxCharactersNumber) {
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new TextInputSection(placeholder, maxCharactersNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextInputSection)) {
                return false;
            }
            TextInputSection textInputSection = (TextInputSection) other;
            return Intrinsics.d(this.placeholder, textInputSection.placeholder) && this.maxCharactersNumber == textInputSection.maxCharactersNumber;
        }

        public final int getMaxCharactersNumber() {
            return this.maxCharactersNumber;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxCharactersNumber) + (this.placeholder.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.maxCharactersNumber, "TextInputSection(placeholder=", this.placeholder, ", maxCharactersNumber=", ")");
        }
    }

    public RateSectionDTO(@NotNull String key, Boolean bool, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "radioIconSection", type = CheckboxIconSection.class), @ProtoOneOfSignature(name = "iconSection", type = IconSection.class), @ProtoOneOfSignature(name = "radioSection", type = CheckboxSection.class), @ProtoOneOfSignature(name = "textInputSection", type = TextInputSection.class), @ProtoOneOfSignature(name = "textHeader", type = TextAtom.class)}) @NotNull @ProtoOneOf(label = "type") Object body) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(body, "body");
        this.key = key;
        this.isRequired = bool;
        this.body = body;
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    /* renamed from: isRequired, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }
}
