package ru.ozon.uni.core;

import Bi.a;
import G.g;
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
import ru.ozon.uni.core.models.GradientDirection;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003JG\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006$"}, d2 = {"Lru/ozon/uni/core/UniGradient;", "Landroid/os/Parcelable;", "gradientDirection", "Lru/ozon/uni/core/models/GradientDirection;", "lightColorTokens", "", "", "darkColorTokens", "positions", "", "<init>", "(Lru/ozon/uni/core/models/GradientDirection;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getGradientDirection", "()Lru/ozon/uni/core/models/GradientDirection;", "getLightColorTokens", "()Ljava/util/List;", "getDarkColorTokens", "getPositions", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UniGradient implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UniGradient> CREATOR = new Creator();
    private final List<String> darkColorTokens;
    private final GradientDirection gradientDirection;

    @NotNull
    private final List<String> lightColorTokens;

    @NotNull
    private final List<Float> positions;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniGradient> {
        @Override // android.os.Parcelable.Creator
        public final UniGradient createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            GradientDirection valueOf = parcel.readInt() == 0 ? null : GradientDirection.valueOf(parcel.readString());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Float.valueOf(parcel.readFloat()));
            }
            return new UniGradient(valueOf, createStringArrayList, createStringArrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UniGradient[] newArray(int i11) {
            return new UniGradient[i11];
        }
    }

    public UniGradient(@i(name = "direction") GradientDirection gradientDirection, @i(name = "lightValues") @NotNull List<String> lightColorTokens, @i(name = "darkValues") List<String> list, @NotNull List<Float> positions) {
        Intrinsics.checkNotNullParameter(lightColorTokens, "lightColorTokens");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.gradientDirection = gradientDirection;
        this.lightColorTokens = lightColorTokens;
        this.darkColorTokens = list;
        this.positions = positions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniGradient copy$default(UniGradient uniGradient, GradientDirection gradientDirection, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gradientDirection = uniGradient.gradientDirection;
        }
        if ((i11 & 2) != 0) {
            list = uniGradient.lightColorTokens;
        }
        if ((i11 & 4) != 0) {
            list2 = uniGradient.darkColorTokens;
        }
        if ((i11 & 8) != 0) {
            list3 = uniGradient.positions;
        }
        return uniGradient.copy(gradientDirection, list, list2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final GradientDirection getGradientDirection() {
        return this.gradientDirection;
    }

    @NotNull
    public final List<String> component2() {
        return this.lightColorTokens;
    }

    public final List<String> component3() {
        return this.darkColorTokens;
    }

    @NotNull
    public final List<Float> component4() {
        return this.positions;
    }

    @NotNull
    public final UniGradient copy(@i(name = "direction") GradientDirection gradientDirection, @i(name = "lightValues") @NotNull List<String> lightColorTokens, @i(name = "darkValues") List<String> darkColorTokens, @NotNull List<Float> positions) {
        Intrinsics.checkNotNullParameter(lightColorTokens, "lightColorTokens");
        Intrinsics.checkNotNullParameter(positions, "positions");
        return new UniGradient(gradientDirection, lightColorTokens, darkColorTokens, positions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniGradient)) {
            return false;
        }
        UniGradient uniGradient = (UniGradient) other;
        return this.gradientDirection == uniGradient.gradientDirection && Intrinsics.d(this.lightColorTokens, uniGradient.lightColorTokens) && Intrinsics.d(this.darkColorTokens, uniGradient.darkColorTokens) && Intrinsics.d(this.positions, uniGradient.positions);
    }

    public final List<String> getDarkColorTokens() {
        return this.darkColorTokens;
    }

    public final GradientDirection getGradientDirection() {
        return this.gradientDirection;
    }

    @NotNull
    public final List<String> getLightColorTokens() {
        return this.lightColorTokens;
    }

    @NotNull
    public final List<Float> getPositions() {
        return this.positions;
    }

    public int hashCode() {
        GradientDirection gradientDirection = this.gradientDirection;
        int b11 = g.b((gradientDirection == null ? 0 : gradientDirection.hashCode()) * 31, 31, this.lightColorTokens);
        List<String> list = this.darkColorTokens;
        return this.positions.hashCode() + ((b11 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "UniGradient(gradientDirection=" + this.gradientDirection + ", lightColorTokens=" + this.lightColorTokens + ", darkColorTokens=" + this.darkColorTokens + ", positions=" + this.positions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        GradientDirection gradientDirection = this.gradientDirection;
        if (gradientDirection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gradientDirection.name());
        }
        dest.writeStringList(this.lightColorTokens);
        dest.writeStringList(this.darkColorTokens);
        Iterator c11 = a.c(this.positions, dest);
        while (c11.hasNext()) {
            dest.writeFloat(((Number) c11.next()).floatValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UniGradient(GradientDirection gradientDirection, List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(gradientDirection, list, list2, list3);
        gradientDirection = (i11 & 1) != 0 ? GradientDirection.TOP_BOTTOM : gradientDirection;
        list2 = (i11 & 4) != 0 ? list : list2;
        if ((i11 & 8) != 0) {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(Float.valueOf(i12 / (list.size() - 1)));
            }
            list3 = arrayList;
        }
    }
}
