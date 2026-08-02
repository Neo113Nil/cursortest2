package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f2307a = parcel.readInt();
        savedState.f2308b = parcel.readInt();
        int readInt = parcel.readInt();
        savedState.f2309c = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            savedState.f2310d = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        savedState.f2311e = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            savedState.f2312f = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f2314h = parcel.readInt() == 1;
        savedState.f2315i = parcel.readInt() == 1;
        savedState.j = parcel.readInt() == 1;
        savedState.f2313g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new StaggeredGridLayoutManager.SavedState[i5];
    }
}
