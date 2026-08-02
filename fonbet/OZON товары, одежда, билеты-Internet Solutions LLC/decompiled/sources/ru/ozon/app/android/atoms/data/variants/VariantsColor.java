package ru.ozon.app.android.atoms.data.variants;

import Ak.b;
import Bi.a;
import C.J;
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
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.Type;

@j(generateAdapter = true)
@InterfaceC3999a
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001a\u001a\u00020\rH\u0016J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003JS\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010!\u001a\u00020\rJ\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/app/android/atoms/data/variants/VariantsColor;", "Lru/ozon/uni/atoms/data/AtomDTO;", "context", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "items", "", "Lru/ozon/app/android/atoms/data/variants/VariantsColor$VariantColor;", "visibleItemsCount", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;Ljava/util/List;I)V", "getContext", "()Ljava/lang/String;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getItems", "()Ljava/util/List;", "getVisibleItemsCount", "()I", "getItemType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "VariantColor", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class VariantsColor extends AtomDTO {

    @NotNull
    public static final Parcelable.Creator<VariantsColor> CREATOR = new Creator();
    private final String context;

    @NotNull
    private final List<VariantColor> items;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final int visibleItemsCount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VariantsColor> {
        @Override // android.os.Parcelable.Creator
        public final VariantsColor createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            TestInfo testInfo = (TestInfo) parcel.readParcelable(VariantsColor.class.getClassLoader());
            int i11 = 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i12 = 0;
                while (i12 != readInt) {
                    i12 = C2859b.a(VariantsColor.class, parcel, linkedHashMap2, parcel.readString(), i12, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i11 != readInt2) {
                i11 = b.b(VariantColor.CREATOR, parcel, arrayList, i11, 1);
            }
            return new VariantsColor(readString, testInfo, linkedHashMap, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VariantsColor[] newArray(int i11) {
            return new VariantsColor[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/atoms/data/variants/VariantsColor$VariantColor;", "Landroid/os/Parcelable;", "colors", "", "", "isActive", "", "<init>", "(Ljava/util/List;Z)V", "getColors", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VariantColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<VariantColor> CREATOR = new Creator();

        @NotNull
        private final List<String> colors;
        private final boolean isActive;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VariantColor> {
            @Override // android.os.Parcelable.Creator
            public final VariantColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VariantColor(parcel.createStringArrayList(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final VariantColor[] newArray(int i11) {
                return new VariantColor[i11];
            }
        }

        public VariantColor(@NotNull List<String> colors, boolean z11) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            this.colors = colors;
            this.isActive = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VariantColor copy$default(VariantColor variantColor, List list, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = variantColor.colors;
            }
            if ((i11 & 2) != 0) {
                z11 = variantColor.isActive;
            }
            return variantColor.copy(list, z11);
        }

        @NotNull
        public final List<String> component1() {
            return this.colors;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public final VariantColor copy(@NotNull List<String> colors, boolean isActive) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new VariantColor(colors, isActive);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VariantColor)) {
                return false;
            }
            VariantColor variantColor = (VariantColor) other;
            return Intrinsics.d(this.colors, variantColor.colors) && this.isActive == variantColor.isActive;
        }

        @NotNull
        public final List<String> getColors() {
            return this.colors;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isActive) + (this.colors.hashCode() * 31);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            return "VariantColor(colors=" + this.colors + ", isActive=" + this.isActive + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.colors);
            dest.writeInt(this.isActive ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ VariantsColor(String str, TestInfo testInfo, Map map, List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, testInfo, r5, r6, r7);
        int i13;
        List list2;
        Map map2;
        str = (i12 & 1) != 0 ? null : str;
        testInfo = (i12 & 2) != 0 ? null : testInfo;
        if ((i12 & 4) != 0) {
            i13 = i11;
            list2 = list;
            map2 = null;
        } else {
            i13 = i11;
            list2 = list;
            map2 = map;
        }
    }

    public static /* synthetic */ VariantsColor copy$default(VariantsColor variantsColor, String str, TestInfo testInfo, Map map, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = variantsColor.context;
        }
        if ((i12 & 2) != 0) {
            testInfo = variantsColor.testInfo;
        }
        if ((i12 & 4) != 0) {
            map = variantsColor.trackingInfo;
        }
        if ((i12 & 8) != 0) {
            list = variantsColor.items;
        }
        if ((i12 & 16) != 0) {
            i11 = variantsColor.visibleItemsCount;
        }
        int i13 = i11;
        Map map2 = map;
        return variantsColor.copy(str, testInfo, map2, list, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<VariantColor> component4() {
        return this.items;
    }

    /* renamed from: component5, reason: from getter */
    public final int getVisibleItemsCount() {
        return this.visibleItemsCount;
    }

    @NotNull
    public final VariantsColor copy(String context, TestInfo testInfo, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<VariantColor> items, int visibleItemsCount) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new VariantsColor(context, testInfo, trackingInfo, items, visibleItemsCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariantsColor)) {
            return false;
        }
        VariantsColor variantsColor = (VariantsColor) other;
        return Intrinsics.d(this.context, variantsColor.context) && Intrinsics.d(this.testInfo, variantsColor.testInfo) && Intrinsics.d(this.trackingInfo, variantsColor.trackingInfo) && Intrinsics.d(this.items, variantsColor.items) && this.visibleItemsCount == variantsColor.visibleItemsCount;
    }

    @Override // ru.ozon.uni.atoms.data.AtomDTO
    public String getContext() {
        return this.context;
    }

    @Override // lk0.InterfaceC7968a
    public int getItemType() {
        return R$id.atom_type_variants_color;
    }

    @NotNull
    public final List<VariantColor> getItems() {
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

    public final int getVisibleItemsCount() {
        return this.visibleItemsCount;
    }

    public int hashCode() {
        String str = this.context;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (hashCode + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return Integer.hashCode(this.visibleItemsCount) + g.b((hashCode2 + (map != null ? map.hashCode() : 0)) * 31, 31, this.items);
    }

    @NotNull
    public String toString() {
        String str = this.context;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<VariantColor> list = this.items;
        int i11 = this.visibleItemsCount;
        StringBuilder sb2 = new StringBuilder("VariantsColor(context=");
        sb2.append(str);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", visibleItemsCount=");
        return K00.b.e(i11, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.context);
        dest.writeParcelable(this.testInfo, flags);
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
        Iterator c11 = a.c(this.items, dest);
        while (c11.hasNext()) {
            ((VariantColor) c11.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.visibleItemsCount);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariantsColor(String str, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map, @NotNull List<VariantColor> items, int i11) {
        super(Type.VARIANTS_COLOR, str, map, testInfo);
        Intrinsics.checkNotNullParameter(items, "items");
        this.context = str;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.items = items;
        this.visibleItemsCount = i11;
    }
}
