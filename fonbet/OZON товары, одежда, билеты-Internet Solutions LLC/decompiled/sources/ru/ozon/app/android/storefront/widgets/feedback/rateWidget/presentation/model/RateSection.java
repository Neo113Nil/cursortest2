package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model;

import Cm.e;
import G.g;
import K00.b;
import Kk.C3532b;
import c8.C5766e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.rateAdapter.ViewType;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "", "id", "", "viewType", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;", "<init>", "(ILru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;)V", "getId", "()I", "getViewType", "()Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;", "RequiredSection", "HeaderText", "SectionText", "SectionIcon", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$HeaderText;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$SectionIcon;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$SectionText;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RateSection {
    private final int id;

    @NotNull
    private final ViewType viewType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$HeaderText;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderText extends RateSection {
        public static final int $stable = TextAtom.$stable;
        private final int id;

        @NotNull
        private final TextAtom text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderText(int i11, @NotNull TextAtom text) {
            super(i11, ViewType.SECTION_TYPE_HEADER, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderText)) {
                return false;
            }
            HeaderText headerText = (HeaderText) other;
            return this.id == headerText.id && Intrinsics.d(this.text, headerText.text);
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection
        public int getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "HeaderText(id=" + this.id + ", text=" + this.text + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB3\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\u0082\u0001\u0003\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "", "id", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;", "viewType", "", "key", "", "isRequired", "cellIndex", "<init>", "(ILru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;Ljava/lang/String;ZLjava/lang/String;)V", "I", "getId", "()I", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;", "getViewType", "()Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/rateAdapter/ViewType;", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Z", "()Z", "getCellIndex", "SectionTextInput", "SectionCheckboxIcon", "SectionCheckbox", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionCheckbox;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionCheckboxIcon;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionTextInput;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RequiredSection extends RateSection {
        private final String cellIndex;
        private final int id;
        private final boolean isRequired;

        @NotNull
        private final String key;

        @NotNull
        private final ViewType viewType;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionCheckbox;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection;", "", "id", "", "key", "", "isRequired", "cellIndex", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "cell", "<init>", "(ILjava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;)V", "copy", "(ILjava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;)Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionCheckbox;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getKey", "Z", "()Z", "getCellIndex", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SectionCheckbox extends RequiredSection {

            @NotNull
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell;

            @NotNull
            private final String cellIndex;
            private final int id;
            private final boolean isRequired;

            @NotNull
            private final String key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionCheckbox(int i11, @NotNull String key, boolean z11, @NotNull String cellIndex, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell) {
                super(i11, ViewType.SECTION_TYPE_CELL_CHECKBOX, key, z11, cellIndex, null);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(cellIndex, "cellIndex");
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.id = i11;
                this.key = key;
                this.isRequired = z11;
                this.cellIndex = cellIndex;
                this.cell = cell;
            }

            public static /* synthetic */ SectionCheckbox copy$default(SectionCheckbox sectionCheckbox, int i11, String str, boolean z11, String str2, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = sectionCheckbox.id;
                }
                if ((i12 & 2) != 0) {
                    str = sectionCheckbox.key;
                }
                if ((i12 & 4) != 0) {
                    z11 = sectionCheckbox.isRequired;
                }
                if ((i12 & 8) != 0) {
                    str2 = sectionCheckbox.cellIndex;
                }
                if ((i12 & 16) != 0) {
                    cellWithSubtitleCheckboxRadio = sectionCheckbox.cell;
                }
                CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio2 = cellWithSubtitleCheckboxRadio;
                boolean z12 = z11;
                return sectionCheckbox.copy(i11, str, z12, str2, cellWithSubtitleCheckboxRadio2);
            }

            @NotNull
            public final SectionCheckbox copy(int id2, @NotNull String key, boolean isRequired, @NotNull String cellIndex, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(cellIndex, "cellIndex");
                Intrinsics.checkNotNullParameter(cell, "cell");
                return new SectionCheckbox(id2, key, isRequired, cellIndex, cell);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SectionCheckbox)) {
                    return false;
                }
                SectionCheckbox sectionCheckbox = (SectionCheckbox) other;
                return this.id == sectionCheckbox.id && Intrinsics.d(this.key, sectionCheckbox.key) && this.isRequired == sectionCheckbox.isRequired && Intrinsics.d(this.cellIndex, sectionCheckbox.cellIndex) && Intrinsics.d(this.cell, sectionCheckbox.cell);
            }

            @NotNull
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio getCell() {
                return this.cell;
            }

            @NotNull
            public String getCellIndex() {
                return this.cellIndex;
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection, ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection
            public int getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection
            @NotNull
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                return this.cell.hashCode() + g.a(C3532b.a(g.a(Integer.hashCode(this.id) * 31, 31, this.key), 31, this.isRequired), 31, this.cellIndex);
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection
            /* renamed from: isRequired, reason: from getter */
            public boolean getIsRequired() {
                return this.isRequired;
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                String str = this.key;
                boolean z11 = this.isRequired;
                String str2 = this.cellIndex;
                CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio = this.cell;
                StringBuilder g10 = e.g(i11, "SectionCheckbox(id=", ", key=", str, ", isRequired=");
                C5766e.a(", cellIndex=", str2, ", cell=", g10, z11);
                g10.append(cellWithSubtitleCheckboxRadio);
                g10.append(")");
                return g10.toString();
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionCheckboxIcon;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection;", "", "id", "", "key", "", "isRequired", "cellIndex", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "cell", "<init>", "(ILjava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;)V", "copy", "(ILjava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;)Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionCheckboxIcon;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getKey", "Z", "()Z", "getCellIndex", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40IconCheckboxRadio;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SectionCheckboxIcon extends RequiredSection {

            @NotNull
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell;

            @NotNull
            private final String cellIndex;
            private final int id;
            private final boolean isRequired;

            @NotNull
            private final String key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionCheckboxIcon(int i11, @NotNull String key, boolean z11, @NotNull String cellIndex, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell) {
                super(i11, ViewType.SECTION_TYPE_CELL_CHECKBOX_ICON, key, z11, cellIndex, null);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(cellIndex, "cellIndex");
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.id = i11;
                this.key = key;
                this.isRequired = z11;
                this.cellIndex = cellIndex;
                this.cell = cell;
            }

            public static /* synthetic */ SectionCheckboxIcon copy$default(SectionCheckboxIcon sectionCheckboxIcon, int i11, String str, boolean z11, String str2, CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = sectionCheckboxIcon.id;
                }
                if ((i12 & 2) != 0) {
                    str = sectionCheckboxIcon.key;
                }
                if ((i12 & 4) != 0) {
                    z11 = sectionCheckboxIcon.isRequired;
                }
                if ((i12 & 8) != 0) {
                    str2 = sectionCheckboxIcon.cellIndex;
                }
                if ((i12 & 16) != 0) {
                    cellWithSubtitle40IconCheckboxRadio = sectionCheckboxIcon.cell;
                }
                CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio2 = cellWithSubtitle40IconCheckboxRadio;
                boolean z12 = z11;
                return sectionCheckboxIcon.copy(i11, str, z12, str2, cellWithSubtitle40IconCheckboxRadio2);
            }

            @NotNull
            public final SectionCheckboxIcon copy(int id2, @NotNull String key, boolean isRequired, @NotNull String cellIndex, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cell) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(cellIndex, "cellIndex");
                Intrinsics.checkNotNullParameter(cell, "cell");
                return new SectionCheckboxIcon(id2, key, isRequired, cellIndex, cell);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SectionCheckboxIcon)) {
                    return false;
                }
                SectionCheckboxIcon sectionCheckboxIcon = (SectionCheckboxIcon) other;
                return this.id == sectionCheckboxIcon.id && Intrinsics.d(this.key, sectionCheckboxIcon.key) && this.isRequired == sectionCheckboxIcon.isRequired && Intrinsics.d(this.cellIndex, sectionCheckboxIcon.cellIndex) && Intrinsics.d(this.cell, sectionCheckboxIcon.cell);
            }

            @NotNull
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio getCell() {
                return this.cell;
            }

            @NotNull
            public String getCellIndex() {
                return this.cellIndex;
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection, ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection
            public int getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection
            @NotNull
            public String getKey() {
                return this.key;
            }

            public int hashCode() {
                return this.cell.hashCode() + g.a(C3532b.a(g.a(Integer.hashCode(this.id) * 31, 31, this.key), 31, this.isRequired), 31, this.cellIndex);
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection
            /* renamed from: isRequired, reason: from getter */
            public boolean getIsRequired() {
                return this.isRequired;
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                String str = this.key;
                boolean z11 = this.isRequired;
                String str2 = this.cellIndex;
                CellAtom.CellAtomWithSubtitle.CellWithSubtitle40IconCheckboxRadio cellWithSubtitle40IconCheckboxRadio = this.cell;
                StringBuilder g10 = e.g(i11, "SectionCheckboxIcon(id=", ", key=", str, ", isRequired=");
                C5766e.a(", cellIndex=", str2, ", cell=", g10, z11);
                g10.append(cellWithSubtitle40IconCheckboxRadio);
                g10.append(")");
                return g10.toString();
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection$SectionTextInput;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$RequiredSection;", "", "id", "", "key", "", "isRequired", HammersV3BodyDTO.PLACEHOLDER, "maxCharactersNumber", "<init>", "(ILjava/lang/String;ZLjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getKey", "Z", "()Z", "getPlaceholder", "getMaxCharactersNumber", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SectionTextInput extends RequiredSection {
            private final int id;
            private final boolean isRequired;

            @NotNull
            private final String key;
            private final int maxCharactersNumber;

            @NotNull
            private final String placeholder;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionTextInput(int i11, @NotNull String key, boolean z11, @NotNull String placeholder, int i12) {
                super(i11, ViewType.SECTION_TYPE_INPUT, key, z11, null, null);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                this.id = i11;
                this.key = key;
                this.isRequired = z11;
                this.placeholder = placeholder;
                this.maxCharactersNumber = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SectionTextInput)) {
                    return false;
                }
                SectionTextInput sectionTextInput = (SectionTextInput) other;
                return this.id == sectionTextInput.id && Intrinsics.d(this.key, sectionTextInput.key) && this.isRequired == sectionTextInput.isRequired && Intrinsics.d(this.placeholder, sectionTextInput.placeholder) && this.maxCharactersNumber == sectionTextInput.maxCharactersNumber;
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection, ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection
            public int getId() {
                return this.id;
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection
            @NotNull
            public String getKey() {
                return this.key;
            }

            public final int getMaxCharactersNumber() {
                return this.maxCharactersNumber;
            }

            @NotNull
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public int hashCode() {
                return Integer.hashCode(this.maxCharactersNumber) + g.a(C3532b.a(g.a(Integer.hashCode(this.id) * 31, 31, this.key), 31, this.isRequired), 31, this.placeholder);
            }

            @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection.RequiredSection
            /* renamed from: isRequired, reason: from getter */
            public boolean getIsRequired() {
                return this.isRequired;
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                String str = this.key;
                boolean z11 = this.isRequired;
                String str2 = this.placeholder;
                int i12 = this.maxCharactersNumber;
                StringBuilder g10 = e.g(i11, "SectionTextInput(id=", ", key=", str, ", isRequired=");
                C5766e.a(", placeholder=", str2, ", maxCharactersNumber=", g10, z11);
                return b.e(i12, ")", g10);
            }
        }

        public /* synthetic */ RequiredSection(int i11, ViewType viewType, String str, boolean z11, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, viewType, str, z11, str2);
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection
        public int getId() {
            return this.id;
        }

        @NotNull
        public String getKey() {
            return this.key;
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection
        @NotNull
        public ViewType getViewType() {
            return this.viewType;
        }

        /* renamed from: isRequired, reason: from getter */
        public boolean getIsRequired() {
            return this.isRequired;
        }

        private RequiredSection(int i11, ViewType viewType, String str, boolean z11, String str2) {
            super(i11, viewType, null);
            this.id = i11;
            this.viewType = viewType;
            this.key = str;
            this.isRequired = z11;
            this.cellIndex = str2;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$SectionIcon;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "", "id", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "cell", "<init>", "(ILru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle40Icon;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionIcon extends RateSection {

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cell;
        private final int id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionIcon(int i11, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon cell) {
            super(i11, ViewType.SECTION_TYPE_CELL_ICON, null);
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = i11;
            this.cell = cell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionIcon)) {
                return false;
            }
            SectionIcon sectionIcon = (SectionIcon) other;
            return this.id == sectionIcon.id && Intrinsics.d(this.cell, sectionIcon.cell);
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle40Icon getCell() {
            return this.cell;
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.cell.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "SectionIcon(id=" + this.id + ", cell=" + this.cell + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection$SectionText;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateSection;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionText extends RateSection {
        public static final int $stable = TextAtom.$stable;
        private final int id;

        @NotNull
        private final TextAtom text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionText(int i11, @NotNull TextAtom text) {
            super(i11, ViewType.SECTION_TYPE_TEXT, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = i11;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SectionText)) {
                return false;
            }
            SectionText sectionText = (SectionText) other;
            return this.id == sectionText.id && Intrinsics.d(this.text, sectionText.text);
        }

        @Override // ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateSection
        public int getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "SectionText(id=" + this.id + ", text=" + this.text + ")";
        }
    }

    public /* synthetic */ RateSection(int i11, ViewType viewType, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, viewType);
    }

    public int getId() {
        return this.id;
    }

    @NotNull
    public ViewType getViewType() {
        return this.viewType;
    }

    private RateSection(int i11, ViewType viewType) {
        this.id = i11;
        this.viewType = viewType;
    }
}
