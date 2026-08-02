package ru.ozon.app.android.atoms.data.labelList;

import B0.C2454a;
import C.o0;
import G.g;
import Pk0.h;
import T7.P;
import Tz.C4055a;
import Xc.a;
import Xc.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0019\u001a\u00020\bH\u0016J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010 \u001a\u00020\bJ\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, d2 = {"Lru/ozon/app/android/atoms/data/labelList/LabelListAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "items", "", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom$Label;", "textStyle", "", "maxLines", "", "align", "Lru/ozon/app/android/atoms/data/labelList/LabelListAtom$AlignType;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;ILru/ozon/app/android/atoms/data/labelList/LabelListAtom$AlignType;Lru/ozon/uni/atoms/data/TestInfo;)V", "getItems", "()Ljava/util/List;", "getTextStyle", "()Ljava/lang/String;", "getMaxLines", "()I", "getAlign", "()Lru/ozon/app/android/atoms/data/labelList/LabelListAtom$AlignType;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Label", "AlignType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LabelListAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<LabelListAtom> CREATOR = new Creator();

    @NotNull
    private final AlignType align;

    @NotNull
    private final List<Label> items;
    private final int maxLines;
    private final TestInfo testInfo;

    @NotNull
    private final String textStyle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/atoms/data/labelList/LabelListAtom$AlignType;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGN_LEFT", "ALIGN_CENTER", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class AlignType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AlignType[] $VALUES;

        @i(name = "ALIGN_LEFT")
        public static final AlignType ALIGN_LEFT = new AlignType("ALIGN_LEFT", 0);

        @i(name = "ALIGN_CENTER")
        public static final AlignType ALIGN_CENTER = new AlignType("ALIGN_CENTER", 1);

        private static final /* synthetic */ AlignType[] $values() {
            return new AlignType[]{ALIGN_LEFT, ALIGN_CENTER};
        }

        static {
            AlignType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AlignType(String str, int i11) {
        }

        @NotNull
        public static a<AlignType> getEntries() {
            return $ENTRIES;
        }

        public static AlignType valueOf(String str) {
            return (AlignType) Enum.valueOf(AlignType.class, str);
        }

        public static AlignType[] values() {
            return (AlignType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<LabelListAtom> {
        @Override // android.os.Parcelable.Creator
        public final LabelListAtom createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = Ak.b.b(Label.CREATOR, parcel, arrayList, i11, 1);
            }
            return new LabelListAtom(arrayList, parcel.readString(), parcel.readInt(), AlignType.valueOf(parcel.readString()), (TestInfo) parcel.readParcelable(LabelListAtom.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LabelListAtom[] newArray(int i11) {
            return new LabelListAtom[i11];
        }
    }

    public /* synthetic */ LabelListAtom(List list, String str, int i11, AlignType alignType, TestInfo testInfo, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i12 & 2) != 0 ? StyleParser.TextStyle.CAPTION.getStyleName() : str, (i12 & 4) != 0 ? Integer.MAX_VALUE : i11, (i12 & 8) != 0 ? AlignType.ALIGN_LEFT : alignType, testInfo);
    }

    public static /* synthetic */ LabelListAtom copy$default(LabelListAtom labelListAtom, List list, String str, int i11, AlignType alignType, TestInfo testInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = labelListAtom.items;
        }
        if ((i12 & 2) != 0) {
            str = labelListAtom.textStyle;
        }
        if ((i12 & 4) != 0) {
            i11 = labelListAtom.maxLines;
        }
        if ((i12 & 8) != 0) {
            alignType = labelListAtom.align;
        }
        if ((i12 & 16) != 0) {
            testInfo = labelListAtom.testInfo;
        }
        TestInfo testInfo2 = testInfo;
        int i13 = i11;
        return labelListAtom.copy(list, str, i13, alignType, testInfo2);
    }

    @NotNull
    public final List<Label> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AlignType getAlign() {
        return this.align;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final LabelListAtom copy(@NotNull List<Label> items, @NotNull String textStyle, int maxLines, @NotNull AlignType align, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(align, "align");
        return new LabelListAtom(items, textStyle, maxLines, align, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelListAtom)) {
            return false;
        }
        LabelListAtom labelListAtom = (LabelListAtom) other;
        return Intrinsics.d(this.items, labelListAtom.items) && Intrinsics.d(this.textStyle, labelListAtom.textStyle) && this.maxLines == labelListAtom.maxLines && this.align == labelListAtom.align && Intrinsics.d(this.testInfo, labelListAtom.testInfo);
    }

    @NotNull
    public final AlignType getAlign() {
        return this.align;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_label_list;
    }

    @NotNull
    public final List<Label> getItems() {
        return this.items;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int hashCode = (this.align.hashCode() + C2454a.a(this.maxLines, g.a(this.items.hashCode() * 31, 31, this.textStyle), 31)) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo == null ? 0 : testInfo.hashCode());
    }

    @NotNull
    public String toString() {
        List<Label> list = this.items;
        String str = this.textStyle;
        int i11 = this.maxLines;
        AlignType alignType = this.align;
        TestInfo testInfo = this.testInfo;
        StringBuilder a11 = C4055a.a("LabelListAtom(items=", ", textStyle=", str, ", maxLines=", list);
        a11.append(i11);
        a11.append(", align=");
        a11.append(alignType);
        a11.append(", testInfo=");
        return h.c(a11, testInfo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.items, dest);
        while (c11.hasNext()) {
            ((Label) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.textStyle);
        dest.writeInt(this.maxLines);
        dest.writeString(this.align.name());
        dest.writeParcelable(this.testInfo, flags);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/app/android/atoms/data/labelList/LabelListAtom$Label;", "Landroid/os/Parcelable;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "titleColor", "", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTitleColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Label implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Label> CREATOR = new Creator();
        private final Icon icon;

        @NotNull
        private final OzonSpannableString title;

        @NotNull
        private final String titleColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Label> {
            @Override // android.os.Parcelable.Creator
            public final Label createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Label((Icon) parcel.readParcelable(Label.class.getClassLoader()), OzonSpannableStringParceler.INSTANCE.create(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Label[] newArray(int i11) {
                return new Label[i11];
            }
        }

        public Label(Icon icon, @NotNull OzonSpannableString title, @NotNull String titleColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleColor, "titleColor");
            this.icon = icon;
            this.title = title;
            this.titleColor = titleColor;
        }

        public static /* synthetic */ Label copy$default(Label label, Icon icon, OzonSpannableString ozonSpannableString, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = label.icon;
            }
            if ((i11 & 2) != 0) {
                ozonSpannableString = label.title;
            }
            if ((i11 & 4) != 0) {
                str = label.titleColor;
            }
            return label.copy(icon, ozonSpannableString, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitleColor() {
            return this.titleColor;
        }

        @NotNull
        public final Label copy(Icon icon, @NotNull OzonSpannableString title, @NotNull String titleColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleColor, "titleColor");
            return new Label(icon, title, titleColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Label)) {
                return false;
            }
            Label label = (Label) other;
            return Intrinsics.d(this.icon, label.icon) && Intrinsics.d(this.title, label.title) && Intrinsics.d(this.titleColor, label.titleColor);
        }

        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        public final String getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            Icon icon = this.icon;
            return this.titleColor.hashCode() + P.c(this.title, (icon == null ? 0 : icon.hashCode()) * 31, 31);
        }

        @NotNull
        public String toString() {
            Icon icon = this.icon;
            OzonSpannableString ozonSpannableString = this.title;
            String str = this.titleColor;
            StringBuilder sb2 = new StringBuilder("Label(icon=");
            sb2.append(icon);
            sb2.append(", title=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", titleColor=");
            return o0.c(sb2, str, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.icon, flags);
            OzonSpannableStringParceler.INSTANCE.write(this.title, dest, flags);
            dest.writeString(this.titleColor);
        }

        public /* synthetic */ Label(Icon icon, OzonSpannableString ozonSpannableString, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(icon, ozonSpannableString, (i11 & 4) != 0 ? StyleParser.OzColor.OZ_SEMANTIC_COLOR_TEXT_PRIMARY.getValue() : str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelListAtom(@NotNull List<Label> items, @NotNull String textStyle, int i11, @NotNull AlignType align, TestInfo testInfo) {
        super(Type.LABEL_LIST, null, null, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(align, "align");
        this.items = items;
        this.textStyle = textStyle;
        this.maxLines = i11;
        this.align = align;
        this.testInfo = testInfo;
    }
}
