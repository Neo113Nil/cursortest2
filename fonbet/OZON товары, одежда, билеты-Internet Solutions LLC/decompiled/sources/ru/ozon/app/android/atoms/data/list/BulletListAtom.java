package ru.ozon.app.android.atoms.data.list;

import Ak.b;
import Bi.a;
import Bl.C2639a;
import C.J;
import De.C2859b;
import G.g;
import Kk.C3532b;
import android.os.Parcel;
import android.os.Parcelable;
import c8.C5766e;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J_\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0006\u0010%\u001a\u00020\u001dJ\u0013\u0010&\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u001dHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, d2 = {"Lru/ozon/app/android/atoms/data/list/BulletListAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "textColor", "", "items", "", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement;", "separated", "", "context", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getTextColor", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getSeparated", "()Z", "getContext", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BulletListAtom extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<BulletListAtom> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<ListElementAtom.BulletListElement> items;
    private final boolean separated;
    private final TestInfo testInfo;
    private final String textColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<BulletListAtom> {
        @Override // android.os.Parcelable.Creator
        public final BulletListAtom createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(ListElementAtom.BulletListElement.CREATOR, parcel, arrayList, i11, 1);
            }
            boolean z11 = parcel.readInt() != 0;
            String readString2 = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(BulletListAtom.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(BulletListAtom.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new BulletListAtom(readString, arrayList, z11, readString2, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BulletListAtom[] newArray(int i11) {
            return new BulletListAtom[i11];
        }
    }

    public /* synthetic */ BulletListAtom(String str, List list, boolean z11, String str2, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, list, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : testInfo, (i11 & 32) != 0 ? null : map);
    }

    public static /* synthetic */ BulletListAtom copy$default(BulletListAtom bulletListAtom, String str, List list, boolean z11, String str2, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bulletListAtom.textColor;
        }
        if ((i11 & 2) != 0) {
            list = bulletListAtom.items;
        }
        if ((i11 & 4) != 0) {
            z11 = bulletListAtom.separated;
        }
        if ((i11 & 8) != 0) {
            str2 = bulletListAtom.context;
        }
        if ((i11 & 16) != 0) {
            testInfo = bulletListAtom.testInfo;
        }
        if ((i11 & 32) != 0) {
            map = bulletListAtom.trackingInfo;
        }
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        return bulletListAtom.copy(str, list, z11, str2, testInfo2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final List<ListElementAtom.BulletListElement> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSeparated() {
        return this.separated;
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
    public final BulletListAtom copy(String textColor, @NotNull List<ListElementAtom.BulletListElement> items, boolean separated, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new BulletListAtom(textColor, items, separated, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletListAtom)) {
            return false;
        }
        BulletListAtom bulletListAtom = (BulletListAtom) other;
        return Intrinsics.d(this.textColor, bulletListAtom.textColor) && Intrinsics.d(this.items, bulletListAtom.items) && this.separated == bulletListAtom.separated && Intrinsics.d(this.context, bulletListAtom.context) && Intrinsics.d(this.testInfo, bulletListAtom.testInfo) && Intrinsics.d(this.trackingInfo, bulletListAtom.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_bullet_list_atom;
    }

    @NotNull
    public final List<ListElementAtom.BulletListElement> getItems() {
        return this.items;
    }

    public final boolean getSeparated() {
        return this.separated;
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
        String str2 = this.context;
        int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.textColor;
        List<ListElementAtom.BulletListElement> list = this.items;
        boolean z11 = this.separated;
        String str2 = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = Tl.b.f("BulletListAtom(textColor=", str, ", items=", ", separated=", list);
        C5766e.a(", context=", str2, ", testInfo=", f7, z11);
        return C2639a.a(", trackingInfo=", ")", f7, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.textColor);
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            ((ListElementAtom.BulletListElement) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.separated ? 1 : 0);
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
    public BulletListAtom(String str, @NotNull List<ListElementAtom.BulletListElement> items, boolean z11, String str2, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.BULLET_LIST, str2, map, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        this.textColor = str;
        this.items = items;
        this.separated = z11;
        this.context = str2;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
