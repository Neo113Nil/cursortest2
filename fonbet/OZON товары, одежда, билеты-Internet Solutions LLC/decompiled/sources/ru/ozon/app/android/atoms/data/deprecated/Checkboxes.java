package ru.ozon.app.android.atoms.data.deprecated;

import Ak.b;
import Bi.a;
import Bk.C2638a;
import C.J;
import De.C2859b;
import G.g;
import Pk0.h;
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
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringParceler;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JU\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010\"\u001a\u00020\u001bJ\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u001bHÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/Checkboxes;", "Lru/ozon/uni/atoms/data/AtomDTO;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "items", "", "Lru/ozon/app/android/atoms/data/deprecated/Checkbox;", "context", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getItems", "()Ljava/util/List;", "getContext", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getItemType", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Checkboxes extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<Checkboxes> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<Checkbox> items;
    private final TestInfo testInfo;
    private final OzonSpannableString text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<Checkboxes> {
        @Override // android.os.Parcelable.Creator
        public final Checkboxes createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OzonSpannableString create = OzonSpannableStringParceler.INSTANCE.create(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.b(Checkbox.CREATOR, parcel, arrayList, i11, 1);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(Checkboxes.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new Checkboxes(create, arrayList, readString, linkedHashMap, (TestInfo) parcel.readParcelable(Checkboxes.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Checkboxes[] newArray(int i11) {
            return new Checkboxes[i11];
        }
    }

    public /* synthetic */ Checkboxes(OzonSpannableString ozonSpannableString, List list, String str, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : ozonSpannableString, list, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : map, (i11 & 16) != 0 ? null : testInfo);
    }

    public static /* synthetic */ Checkboxes copy$default(Checkboxes checkboxes, OzonSpannableString ozonSpannableString, List list, String str, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = checkboxes.text;
        }
        if ((i11 & 2) != 0) {
            list = checkboxes.items;
        }
        if ((i11 & 4) != 0) {
            str = checkboxes.context;
        }
        if ((i11 & 8) != 0) {
            map = checkboxes.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            testInfo = checkboxes.testInfo;
        }
        TestInfo testInfo2 = testInfo;
        String str2 = str;
        return checkboxes.copy(ozonSpannableString, list, str2, map, testInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getText() {
        return this.text;
    }

    @NotNull
    public final List<Checkbox> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final Checkboxes copy(OzonSpannableString text, @NotNull List<Checkbox> items, String context, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new Checkboxes(text, items, context, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Checkboxes)) {
            return false;
        }
        Checkboxes checkboxes = (Checkboxes) other;
        return Intrinsics.d(this.text, checkboxes.text) && Intrinsics.d(this.items, checkboxes.items) && Intrinsics.d(this.context, checkboxes.context) && Intrinsics.d(this.trackingInfo, checkboxes.trackingInfo) && Intrinsics.d(this.testInfo, checkboxes.testInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_checkboxes;
    }

    @NotNull
    public final List<Checkbox> getItems() {
        return this.items;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final OzonSpannableString getText() {
        return this.text;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        OzonSpannableString ozonSpannableString = this.text;
        int b11 = g.b((ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31, 31, this.items);
        String str = this.context;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.text;
        List<Checkbox> list = this.items;
        String str = this.context;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("Checkboxes(text=");
        sb2.append((Object) ozonSpannableString);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", context=");
        C2638a.e(sb2, str, ", trackingInfo=", map, ", testInfo=");
        return h.c(sb2, testInfo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        OzonSpannableStringParceler.INSTANCE.write(this.text, dest, flags);
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            ((Checkbox) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.context);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeParcelable(this.testInfo, flags);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Checkboxes(OzonSpannableString ozonSpannableString, @NotNull List<Checkbox> items, String str, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        super(Type.CHECKBOXES, str, map, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        this.text = ozonSpannableString;
        this.items = items;
        this.context = str;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }
}
