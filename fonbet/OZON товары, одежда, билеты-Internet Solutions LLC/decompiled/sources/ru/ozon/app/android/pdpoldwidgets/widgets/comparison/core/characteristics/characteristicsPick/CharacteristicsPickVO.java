package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick;

import Ak.b;
import B0.A0;
import C.J;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "cell", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;", "cellData", "<init>", "(JLru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;", "getCellData", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;", "CellData", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CharacteristicsPickVO implements c {

    @NotNull
    private final CellAtom.CellAtomWithSubtitle cell;

    @NotNull
    private final CellData cellData;
    private final long id;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;", "Landroid/os/Parcelable;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;", "values", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "LWZ/t;", "tokenizedViewEvent", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;LWZ/t;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header;", "getHeader", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header;", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "LWZ/t;", "getTokenizedViewEvent", "()LWZ/t;", "Header", "CellDataValue", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CellData> CREATOR = new Creator();

        @NotNull
        private final ButtonV3Atom.LargeButton button;

        @NotNull
        private final Header header;
        private final t tokenizedViewEvent;
        private final List<CellDataValue> values;

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;", "Landroid/os/Parcelable;", "", "id", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "cell", "LWZ/t;", "tokenizedSelectEvent", "tokenizedUnselectEvent", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;LWZ/t;LWZ/t;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;LWZ/t;LWZ/t;)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$CellDataValue;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "LWZ/t;", "getTokenizedSelectEvent", "()LWZ/t;", "getTokenizedUnselectEvent", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellDataValue implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CellDataValue> CREATOR = new Creator();

            @NotNull
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell;

            @NotNull
            private final String id;
            private final t tokenizedSelectEvent;
            private final t tokenizedUnselectEvent;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CellDataValue> {
                @Override // android.os.Parcelable.Creator
                public final CellDataValue createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CellDataValue(parcel.readString(), (CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio) parcel.readParcelable(CellDataValue.class.getClassLoader()), (t) parcel.readParcelable(CellDataValue.class.getClassLoader()), (t) parcel.readParcelable(CellDataValue.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final CellDataValue[] newArray(int i11) {
                    return new CellDataValue[i11];
                }
            }

            public CellDataValue(@NotNull String id2, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell, t tVar, t tVar2) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.id = id2;
                this.cell = cell;
                this.tokenizedSelectEvent = tVar;
                this.tokenizedUnselectEvent = tVar2;
            }

            public static /* synthetic */ CellDataValue copy$default(CellDataValue cellDataValue, String str, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio, t tVar, t tVar2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = cellDataValue.id;
                }
                if ((i11 & 2) != 0) {
                    cellWithSubtitleCheckboxRadio = cellDataValue.cell;
                }
                if ((i11 & 4) != 0) {
                    tVar = cellDataValue.tokenizedSelectEvent;
                }
                if ((i11 & 8) != 0) {
                    tVar2 = cellDataValue.tokenizedUnselectEvent;
                }
                return cellDataValue.copy(str, cellWithSubtitleCheckboxRadio, tVar, tVar2);
            }

            @NotNull
            public final CellDataValue copy(@NotNull String id2, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cell, t tokenizedSelectEvent, t tokenizedUnselectEvent) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(cell, "cell");
                return new CellDataValue(id2, cell, tokenizedSelectEvent, tokenizedUnselectEvent);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellDataValue)) {
                    return false;
                }
                CellDataValue cellDataValue = (CellDataValue) other;
                return Intrinsics.d(this.id, cellDataValue.id) && Intrinsics.d(this.cell, cellDataValue.cell) && Intrinsics.d(this.tokenizedSelectEvent, cellDataValue.tokenizedSelectEvent) && Intrinsics.d(this.tokenizedUnselectEvent, cellDataValue.tokenizedUnselectEvent);
            }

            @NotNull
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio getCell() {
                return this.cell;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public final t getTokenizedSelectEvent() {
                return this.tokenizedSelectEvent;
            }

            public final t getTokenizedUnselectEvent() {
                return this.tokenizedUnselectEvent;
            }

            public int hashCode() {
                int hashCode = (this.cell.hashCode() + (this.id.hashCode() * 31)) * 31;
                t tVar = this.tokenizedSelectEvent;
                int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
                t tVar2 = this.tokenizedUnselectEvent;
                return hashCode2 + (tVar2 != null ? tVar2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "CellDataValue(id=" + this.id + ", cell=" + this.cell + ", tokenizedSelectEvent=" + this.tokenizedSelectEvent + ", tokenizedUnselectEvent=" + this.tokenizedUnselectEvent + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.id);
                dest.writeParcelable(this.cell, flags);
                dest.writeParcelable(this.tokenizedSelectEvent, flags);
                dest.writeParcelable(this.tokenizedUnselectEvent, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CellData> {
            @Override // android.os.Parcelable.Creator
            public final CellData createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Header createFromParcel = Header.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i11 = 0;
                    while (i11 != readInt) {
                        i11 = b.b(CellDataValue.CREATOR, parcel, arrayList2, i11, 1);
                    }
                    arrayList = arrayList2;
                }
                return new CellData(createFromParcel, arrayList, (ButtonV3Atom.LargeButton) parcel.readParcelable(CellData.class.getClassLoader()), (t) parcel.readParcelable(CellData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CellData[] newArray(int i11) {
                return new CellData[i11];
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header;", "Landroid/os/Parcelable;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header$HeaderSearch;", "search", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header$HeaderSearch;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header$HeaderSearch;", "getSearch", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header$HeaderSearch;", "HeaderSearch", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Header implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Header> CREATOR = new Creator();

            @NotNull
            private final HeaderSearch search;

            @NotNull
            private final String title;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Header> {
                @Override // android.os.Parcelable.Creator
                public final Header createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Header(parcel.readString(), HeaderSearch.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Header[] newArray(int i11) {
                    return new Header[i11];
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData$Header$HeaderSearch;", "Landroid/os/Parcelable;", "", HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlaceholder", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class HeaderSearch implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<HeaderSearch> CREATOR = new Creator();

                @NotNull
                private final String placeholder;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<HeaderSearch> {
                    @Override // android.os.Parcelable.Creator
                    public final HeaderSearch createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new HeaderSearch(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final HeaderSearch[] newArray(int i11) {
                        return new HeaderSearch[i11];
                    }
                }

                public HeaderSearch(@NotNull String placeholder) {
                    Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                    this.placeholder = placeholder;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof HeaderSearch) && Intrinsics.d(this.placeholder, ((HeaderSearch) other).placeholder);
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public int hashCode() {
                    return this.placeholder.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("HeaderSearch(placeholder=", this.placeholder, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.placeholder);
                }
            }

            public Header(@NotNull String title, @NotNull HeaderSearch search) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(search, "search");
                this.title = title;
                this.search = search;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.search, header.search);
            }

            @NotNull
            public final HeaderSearch getSearch() {
                return this.search;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.search.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Header(title=" + this.title + ", search=" + this.search + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                this.search.writeToParcel(dest, flags);
            }
        }

        public CellData(@NotNull Header header, List<CellDataValue> list, @NotNull ButtonV3Atom.LargeButton button, t tVar) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(button, "button");
            this.header = header;
            this.values = list;
            this.button = button;
            this.tokenizedViewEvent = tVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellData)) {
                return false;
            }
            CellData cellData = (CellData) other;
            return Intrinsics.d(this.header, cellData.header) && Intrinsics.d(this.values, cellData.values) && Intrinsics.d(this.button, cellData.button) && Intrinsics.d(this.tokenizedViewEvent, cellData.tokenizedViewEvent);
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        @NotNull
        public final Header getHeader() {
            return this.header;
        }

        public final t getTokenizedViewEvent() {
            return this.tokenizedViewEvent;
        }

        public final List<CellDataValue> getValues() {
            return this.values;
        }

        public int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            List<CellDataValue> list = this.values;
            int a11 = Tl.b.a(this.button, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
            t tVar = this.tokenizedViewEvent;
            return a11 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CellData(header=" + this.header + ", values=" + this.values + ", button=" + this.button + ", tokenizedViewEvent=" + this.tokenizedViewEvent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.header.writeToParcel(dest, flags);
            List<CellDataValue> list = this.values;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator c11 = J.c(dest, 1, list);
                while (c11.hasNext()) {
                    ((CellDataValue) c11.next()).writeToParcel(dest, flags);
                }
            }
            dest.writeParcelable(this.button, flags);
            dest.writeParcelable(this.tokenizedViewEvent, flags);
        }
    }

    public CharacteristicsPickVO(long j11, @NotNull CellAtom.CellAtomWithSubtitle cell, @NotNull CellData cellData) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(cellData, "cellData");
        this.id = j11;
        this.cell = cell;
        this.cellData = cellData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CharacteristicsPickVO)) {
            return false;
        }
        CharacteristicsPickVO characteristicsPickVO = (CharacteristicsPickVO) other;
        return this.id == characteristicsPickVO.id && Intrinsics.d(this.cell, characteristicsPickVO.cell) && Intrinsics.d(this.cellData, characteristicsPickVO.cellData);
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle getCell() {
        return this.cell;
    }

    @NotNull
    public final CellData getCellData() {
        return this.cellData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.cellData.hashCode() + ((this.cell.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CharacteristicsPickVO(id=" + this.id + ", cell=" + this.cell + ", cellData=" + this.cellData + ")";
    }
}
