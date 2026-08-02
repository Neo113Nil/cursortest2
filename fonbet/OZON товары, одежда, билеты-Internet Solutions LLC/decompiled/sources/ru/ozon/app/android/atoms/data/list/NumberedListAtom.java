package ru.ozon.app.android.atoms.data.list;

import Ak.b;
import Bi.a;
import C.J;
import De.C2859b;
import G.g;
import Kk.C3532b;
import T7.P;
import Ul.C4070a;
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
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010!\u001a\u00020\nH\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jp\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\nJ\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00066"}, d2 = {"Lru/ozon/app/android/atoms/data/list/NumberedListAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "textColor", "", "items", "", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$NumberedListElement;", "separated", "", "startIndex", "", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTextColor", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getSeparated", "()Z", "getStartIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)Lru/ozon/app/android/atoms/data/list/NumberedListAtom;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class NumberedListAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<NumberedListAtom> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<ListElementAtom.NumberedListElement> items;
    private final boolean separated;
    private final Integer startIndex;
    private final TestInfo testInfo;
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<NumberedListAtom> {
        @Override // android.os.Parcelable.Creator
        public final NumberedListAtom createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(ListElementAtom.NumberedListElement.CREATOR, parcel, arrayList, i11, 1);
            }
            boolean z11 = parcel.readInt() != 0;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(NumberedListAtom.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(NumberedListAtom.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new NumberedListAtom(readString, arrayList, z11, valueOf, readString2, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final NumberedListAtom[] newArray(int i11) {
            return new NumberedListAtom[i11];
        }
    }

    public /* synthetic */ NumberedListAtom(String str, List list, boolean z11, Integer num, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, list, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : testInfo, (i11 & 64) != 0 ? null : map);
    }

    public static /* synthetic */ NumberedListAtom copy$default(NumberedListAtom numberedListAtom, String str, List list, boolean z11, Integer num, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = numberedListAtom.textColor;
        }
        if ((i11 & 2) != 0) {
            list = numberedListAtom.items;
        }
        if ((i11 & 4) != 0) {
            z11 = numberedListAtom.separated;
        }
        if ((i11 & 8) != 0) {
            num = numberedListAtom.startIndex;
        }
        if ((i11 & 16) != 0) {
            str2 = numberedListAtom.context;
        }
        if ((i11 & 32) != 0) {
            testInfo = numberedListAtom.testInfo;
        }
        if ((i11 & 64) != 0) {
            map = numberedListAtom.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        String str3 = str2;
        boolean z12 = z11;
        return numberedListAtom.copy(str, list, z12, num, str3, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final List<ListElementAtom.NumberedListElement> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSeparated() {
        return this.separated;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getStartIndex() {
        return this.startIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final NumberedListAtom copy(String textColor, @NotNull List<ListElementAtom.NumberedListElement> items, boolean separated, Integer startIndex, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new NumberedListAtom(textColor, items, separated, startIndex, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumberedListAtom)) {
            return false;
        }
        NumberedListAtom numberedListAtom = (NumberedListAtom) other;
        return Intrinsics.d(this.textColor, numberedListAtom.textColor) && Intrinsics.d(this.items, numberedListAtom.items) && this.separated == numberedListAtom.separated && Intrinsics.d(this.startIndex, numberedListAtom.startIndex) && Intrinsics.d(this.context, numberedListAtom.context) && Intrinsics.d(this.testInfo, numberedListAtom.testInfo) && Intrinsics.d(this.trackingInfo, numberedListAtom.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_numbered_list_atom;
    }

    @NotNull
    public final List<ListElementAtom.NumberedListElement> getItems() {
        return this.items;
    }

    public final boolean getSeparated() {
        return this.separated;
    }

    public final Integer getStartIndex() {
        return this.startIndex;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.textColor;
        int a11 = C3532b.a(g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.items), 31, this.separated);
        Integer num = this.startIndex;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.context;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.textColor;
        List<ListElementAtom.NumberedListElement> list = this.items;
        boolean z11 = this.separated;
        Integer num = this.startIndex;
        String str2 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = Tl.b.f("NumberedListAtom(textColor=", str, ", items=", ", separated=", list);
        f7.append(z11);
        f7.append(", startIndex=");
        f7.append(num);
        f7.append(", context=");
        C4070a.b(f7, str2, ", testInfo=", testInfo, ", trackingInfo=");
        return P.f(f7, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.textColor);
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            ((ListElementAtom.NumberedListElement) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.separated ? 1 : 0);
        Integer num = this.startIndex;
        if (num == null) {
            dest.writeInt(0);
        } else {
            Nh.a.f(dest, 1, num);
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
    public NumberedListAtom(String str, @NotNull List<ListElementAtom.NumberedListElement> items, boolean z11, Integer num, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.NUMBERED_LIST, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        this.textColor = str;
        this.items = items;
        this.separated = z11;
        this.startIndex = num;
        this.context = str2;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
