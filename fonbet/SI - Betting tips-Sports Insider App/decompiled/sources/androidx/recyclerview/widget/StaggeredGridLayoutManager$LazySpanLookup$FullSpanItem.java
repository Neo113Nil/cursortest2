package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new k2();

    /* renamed from: a, reason: collision with root package name */
    public int f2303a;

    /* renamed from: b, reason: collision with root package name */
    public int f2304b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2305c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2306d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2303a + ", mGapDir=" + this.f2304b + ", mHasUnwantedGapAfter=" + this.f2306d + ", mGapPerSpan=" + Arrays.toString(this.f2305c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f2303a);
        parcel.writeInt(this.f2304b);
        parcel.writeInt(this.f2306d ? 1 : 0);
        int[] iArr = this.f2305c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2305c);
        }
    }
}
