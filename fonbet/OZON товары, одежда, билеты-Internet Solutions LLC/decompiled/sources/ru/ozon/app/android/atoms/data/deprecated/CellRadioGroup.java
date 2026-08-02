package ru.ozon.app.android.atoms.data.deprecated;

import Ak.b;
import Bi.a;
import Bl.C2639a;
import C.J;
import Cm.e;
import De.C2859b;
import G.g;
import Sc.InterfaceC3999a;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010%\u001a\u00020\u001dJ\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u001dHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001dR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/CellRadioGroup;", "Lru/ozon/uni/atoms/data/AtomDTO;", "type", "Lru/ozon/uni/atoms/data/Type;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "radioList", "", "Lru/ozon/app/android/atoms/data/deprecated/Cell$CellRadio;", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/Type;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getType", "()Lru/ozon/uni/atoms/data/Type;", "getTitle", "()Ljava/lang/String;", "getRadioList", "()Ljava/util/List;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CellRadioGroup extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<CellRadioGroup> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<Cell.CellRadio> radioList;
    private final TestInfo testInfo;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<CellRadioGroup> {
        @Override // android.os.Parcelable.Creator
        public final CellRadioGroup createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Type valueOf = Type.valueOf(parcel.readString());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(Cell.CellRadio.CREATOR, parcel, arrayList, i11, 1);
            }
            String readString2 = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(CellRadioGroup.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(CellRadioGroup.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CellRadioGroup(valueOf, readString, arrayList, readString2, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CellRadioGroup[] newArray(int i11) {
            return new CellRadioGroup[i11];
        }
    }

    public /* synthetic */ CellRadioGroup(Type type, String str, List list, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, list, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : map);
    }

    public static /* synthetic */ CellRadioGroup copy$default(CellRadioGroup cellRadioGroup, Type type, String str, List list, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            type = cellRadioGroup.type;
        }
        if ((i11 & 2) != 0) {
            str = cellRadioGroup.title;
        }
        if ((i11 & 4) != 0) {
            list = cellRadioGroup.radioList;
        }
        if ((i11 & 8) != 0) {
            str2 = cellRadioGroup.context;
        }
        if ((i11 & 16) != 0) {
            testInfo = cellRadioGroup.testInfo;
        }
        if ((i11 & 32) != 0) {
            map = cellRadioGroup.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        return cellRadioGroup.copy(type, str, list, str2, testInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Cell.CellRadio> component3() {
        return this.radioList;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final CellRadioGroup copy(@NotNull Type type, @NotNull String title, @NotNull List<Cell.CellRadio> radioList, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(radioList, "radioList");
        return new CellRadioGroup(type, title, radioList, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellRadioGroup)) {
            return false;
        }
        CellRadioGroup cellRadioGroup = (CellRadioGroup) other;
        return this.type == cellRadioGroup.type && Intrinsics.d(this.title, cellRadioGroup.title) && Intrinsics.d(this.radioList, cellRadioGroup.radioList) && Intrinsics.d(this.context, cellRadioGroup.context) && Intrinsics.d(this.testInfo, cellRadioGroup.testInfo) && Intrinsics.d(this.trackingInfo, cellRadioGroup.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_cell_radio_group;
    }

    @NotNull
    public final List<Cell.CellRadio> getRadioList() {
        return this.radioList;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(g.a(this.type.hashCode() * 31, 31, this.title), 31, this.radioList);
        String str = this.context;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Type type = this.type;
        String str = this.title;
        List<Cell.CellRadio> list = this.radioList;
        String str2 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CellRadioGroup(type=");
        sb2.append(type);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", radioList=");
        e.i(", context=", str2, ", testInfo=", sb2, list);
        return C2639a.a(", trackingInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.type.name());
        dest.writeString(this.title);
        Iterator c11 = a.c(this.radioList, dest);
        while (c11.hasNext()) {
            ((Cell.CellRadio) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
        dest.writeParcelable(this.testInfo, flags);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator e11 = J.e(map, dest, 1);
        while (e11.hasNext()) {
            Map.Entry entry = (Map.Entry) e11.next();
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), flags);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellRadioGroup(@NotNull Type type, @NotNull String title, @NotNull List<Cell.CellRadio> radioList, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.CELL_RADIO_GROUP, str, map, testInfo);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(radioList, "radioList");
        this.type = type;
        this.title = title;
        this.radioList = radioList;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    @NotNull
    public Type getType() {
        return this.type;
    }
}
