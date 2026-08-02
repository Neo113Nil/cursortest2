package ru.ozon.android.ozonuikitcore;

import Fj.c;
import G.g;
import Sc.InterfaceC3999a;
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

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\f\u0010\rB5\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u000eJ=\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJn\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b3\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b4\u0010\u001bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b5\u0010\u001b¨\u00066"}, d2 = {"Lru/ozon/android/ozonuikitcore/OzonGradient;", "Landroid/os/Parcelable;", "", "", "lightValues", "darkValues", "LFj/a;", "gradientDirection", "lightColorTokens", "darkColorTokens", "", "positions", "<init>", "(Ljava/util/List;Ljava/util/List;LFj/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/util/List;Ljava/util/List;LFj/a;)V", "copy", "(Ljava/util/List;Ljava/util/List;LFj/a;)Lru/ozon/android/ozonuikitcore/OzonGradient;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "component3", "()LFj/a;", "component4", "component5", "component6", "(Ljava/util/List;Ljava/util/List;LFj/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/ozon/android/ozonuikitcore/OzonGradient;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLightValues", "getLightValues$annotations", "()V", "getDarkValues", "getDarkValues$annotations", "LFj/a;", "getGradientDirection", "getLightColorTokens", "getDarkColorTokens", "getPositions", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OzonGradient implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OzonGradient> CREATOR = new a();

    @NotNull
    private final transient List<String> darkColorTokens;
    private final List<String> darkValues;
    private final Fj.a gradientDirection;

    @NotNull
    private final transient List<String> lightColorTokens;

    @NotNull
    private final List<String> lightValues;

    @NotNull
    private final List<Float> positions;

    public static final class a implements Parcelable.Creator<OzonGradient> {
        @Override // android.os.Parcelable.Creator
        public final OzonGradient createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            Fj.a valueOf = parcel.readInt() == 0 ? null : Fj.a.valueOf(parcel.readString());
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            return new OzonGradient(createStringArrayList, createStringArrayList2, valueOf, createStringArrayList3, createStringArrayList4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OzonGradient[] newArray(int i11) {
            return new OzonGradient[i11];
        }
    }

    public OzonGradient(@NotNull List<String> lightValues, List<String> list, @i(name = "direction") Fj.a aVar, @NotNull List<String> lightColorTokens, @NotNull List<String> darkColorTokens, @NotNull List<Float> positions) {
        Intrinsics.checkNotNullParameter(lightValues, "lightValues");
        Intrinsics.checkNotNullParameter(lightColorTokens, "lightColorTokens");
        Intrinsics.checkNotNullParameter(darkColorTokens, "darkColorTokens");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.lightValues = lightValues;
        this.darkValues = list;
        this.gradientDirection = aVar;
        this.lightColorTokens = lightColorTokens;
        this.darkColorTokens = darkColorTokens;
        this.positions = positions;
    }

    public static /* synthetic */ OzonGradient copy$default(OzonGradient ozonGradient, List list, List list2, Fj.a aVar, List list3, List list4, List list5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = ozonGradient.lightValues;
        }
        if ((i11 & 2) != 0) {
            list2 = ozonGradient.darkValues;
        }
        if ((i11 & 4) != 0) {
            aVar = ozonGradient.gradientDirection;
        }
        if ((i11 & 8) != 0) {
            list3 = ozonGradient.lightColorTokens;
        }
        if ((i11 & 16) != 0) {
            list4 = ozonGradient.darkColorTokens;
        }
        if ((i11 & 32) != 0) {
            list5 = ozonGradient.positions;
        }
        List list6 = list4;
        List list7 = list5;
        return ozonGradient.copy(list, list2, aVar, list3, list6, list7);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getDarkValues$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getLightValues$annotations() {
    }

    @NotNull
    public final List<String> component1() {
        return this.lightValues;
    }

    public final List<String> component2() {
        return this.darkValues;
    }

    /* renamed from: component3, reason: from getter */
    public final Fj.a getGradientDirection() {
        return this.gradientDirection;
    }

    @NotNull
    public final List<String> component4() {
        return this.lightColorTokens;
    }

    @NotNull
    public final List<String> component5() {
        return this.darkColorTokens;
    }

    @NotNull
    public final List<Float> component6() {
        return this.positions;
    }

    @NotNull
    public final OzonGradient copy(@NotNull List<String> lightValues, List<String> darkValues, @i(name = "direction") Fj.a gradientDirection, @NotNull List<String> lightColorTokens, @NotNull List<String> darkColorTokens, @NotNull List<Float> positions) {
        Intrinsics.checkNotNullParameter(lightValues, "lightValues");
        Intrinsics.checkNotNullParameter(lightColorTokens, "lightColorTokens");
        Intrinsics.checkNotNullParameter(darkColorTokens, "darkColorTokens");
        Intrinsics.checkNotNullParameter(positions, "positions");
        return new OzonGradient(lightValues, darkValues, gradientDirection, lightColorTokens, darkColorTokens, positions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OzonGradient)) {
            return false;
        }
        OzonGradient ozonGradient = (OzonGradient) other;
        return Intrinsics.d(this.lightValues, ozonGradient.lightValues) && Intrinsics.d(this.darkValues, ozonGradient.darkValues) && this.gradientDirection == ozonGradient.gradientDirection && Intrinsics.d(this.lightColorTokens, ozonGradient.lightColorTokens) && Intrinsics.d(this.darkColorTokens, ozonGradient.darkColorTokens) && Intrinsics.d(this.positions, ozonGradient.positions);
    }

    @NotNull
    public final List<String> getDarkColorTokens() {
        return this.darkColorTokens;
    }

    public final List<String> getDarkValues() {
        return this.darkValues;
    }

    public final Fj.a getGradientDirection() {
        return this.gradientDirection;
    }

    @NotNull
    public final List<String> getLightColorTokens() {
        return this.lightColorTokens;
    }

    @NotNull
    public final List<String> getLightValues() {
        return this.lightValues;
    }

    @NotNull
    public final List<Float> getPositions() {
        return this.positions;
    }

    public int hashCode() {
        int hashCode = this.lightValues.hashCode() * 31;
        List<String> list = this.darkValues;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Fj.a aVar = this.gradientDirection;
        return this.positions.hashCode() + g.b(g.b((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.lightColorTokens), 31, this.darkColorTokens);
    }

    @NotNull
    public String toString() {
        List<String> list = this.lightValues;
        List<String> list2 = this.darkValues;
        Fj.a aVar = this.gradientDirection;
        List<String> list3 = this.lightColorTokens;
        List<String> list4 = this.darkColorTokens;
        List<Float> list5 = this.positions;
        StringBuilder d11 = c.d("OzonGradient(lightValues=", list, ", darkValues=", ", gradientDirection=", list2);
        d11.append(aVar);
        d11.append(", lightColorTokens=");
        d11.append(list3);
        d11.append(", darkColorTokens=");
        d11.append(list4);
        d11.append(", positions=");
        d11.append(list5);
        d11.append(")");
        return d11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.lightValues);
        dest.writeStringList(this.darkValues);
        Fj.a aVar = this.gradientDirection;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeStringList(this.lightColorTokens);
        dest.writeStringList(this.darkColorTokens);
        Iterator c11 = Bi.a.c(this.positions, dest);
        while (c11.hasNext()) {
            dest.writeFloat(((Number) c11.next()).floatValue());
        }
    }

    public static /* synthetic */ OzonGradient copy$default(OzonGradient ozonGradient, List list, List list2, Fj.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = ozonGradient.lightValues;
        }
        if ((i11 & 2) != 0) {
            list2 = ozonGradient.darkValues;
        }
        if ((i11 & 4) != 0) {
            aVar = ozonGradient.gradientDirection;
        }
        return ozonGradient.copy(list, list2, aVar);
    }

    @InterfaceC3999a
    public final /* synthetic */ OzonGradient copy(List lightValues, List darkValues, Fj.a gradientDirection) {
        Intrinsics.checkNotNullParameter(lightValues, "lightValues");
        return copy(lightValues, darkValues, gradientDirection, this.lightColorTokens, this.darkColorTokens, this.positions);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OzonGradient(List list, List list2, Fj.a aVar, List list3, List list4, List list5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, r2, r3, r4, r5, list5);
        List list6 = (i11 & 2) != 0 ? null : list2;
        Fj.a aVar2 = (i11 & 4) != 0 ? Fj.a.TOP_BOTTOM : aVar;
        List list7 = (i11 & 8) != 0 ? list : list3;
        List list8 = (i11 & 16) != 0 ? list6 == null ? list7 : list6 : list4;
        if ((i11 & 32) != 0) {
            int size = list7.size();
            list5 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                list5.add(Float.valueOf(i12 / (list7.size() - 1)));
            }
        }
    }

    public /* synthetic */ OzonGradient(List list, List list2, Fj.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? Fj.a.TOP_BOTTOM : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC3999a
    public /* synthetic */ OzonGradient(List lightValues, List list, Fj.a aVar) {
        this(lightValues, list, aVar, lightValues, list == null ? lightValues : list, null, 32, null);
        Intrinsics.checkNotNullParameter(lightValues, "lightValues");
    }
}
