package ru.ozon.app.android.atoms.data.deprecated;

import Bi.a;
import Bi.b;
import Bl.C2639a;
import C.J;
import De.C2859b;
import Sc.InterfaceC3999a;
import Tz.C4055a;
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

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0016HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lru/ozon/app/android/atoms/data/deprecated/HorizontalContainer;", "Lru/ozon/uni/atoms/data/AtomDTO;", "items", "", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItemType", "", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HorizontalContainer extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<HorizontalContainer> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<AtomDTO> items;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<HorizontalContainer> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalContainer createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(HorizontalContainer.class, parcel, arrayList, i11, 1);
            }
            String readString = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(HorizontalContainer.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    i12 = C2859b.a(HorizontalContainer.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new HorizontalContainer(arrayList, readString, testInfo, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalContainer[] newArray(int i11) {
            return new HorizontalContainer[i11];
        }
    }

    public /* synthetic */ HorizontalContainer(List list, String str, TestInfo testInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : testInfo, (i11 & 8) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HorizontalContainer copy$default(HorizontalContainer horizontalContainer, List list, String str, TestInfo testInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = horizontalContainer.items;
        }
        if ((i11 & 2) != 0) {
            str = horizontalContainer.context;
        }
        if ((i11 & 4) != 0) {
            testInfo = horizontalContainer.testInfo;
        }
        if ((i11 & 8) != 0) {
            map = horizontalContainer.trackingInfo;
        }
        return horizontalContainer.copy(list, str, testInfo, map);
    }

    @NotNull
    public final List<AtomDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component3, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final HorizontalContainer copy(@NotNull List<? extends AtomDTO> items, String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new HorizontalContainer(items, context, testInfo, trackingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalContainer)) {
            return false;
        }
        HorizontalContainer horizontalContainer = (HorizontalContainer) other;
        return Intrinsics.d(this.items, horizontalContainer.items) && Intrinsics.d(this.context, horizontalContainer.context) && Intrinsics.d(this.testInfo, horizontalContainer.testInfo) && Intrinsics.d(this.trackingInfo, horizontalContainer.trackingInfo);
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_horizontal_container;
    }

    @NotNull
    public final List<AtomDTO> getItems() {
        return this.items;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public TestInfo getTestInfo() {
        return this.testInfo;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.context;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<AtomDTO> list = this.items;
        String str = this.context;
        TestInfo testInfo = this.testInfo;
        return C2639a.a(", trackingInfo=", ")", C4055a.a("HorizontalContainer(items=", ", context=", str, ", testInfo=", list), this.trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), flags);
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
    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalContainer(@NotNull List<? extends AtomDTO> items, String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        super(Type.HORIZONTAL_CONTAINER, str, map, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
    }
}
