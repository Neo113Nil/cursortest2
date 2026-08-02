package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.a = parcel.readInt();
        savedState.b = parcel.readInt();
        int readInt = parcel.readInt();
        savedState.c = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            savedState.d = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        savedState.e = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            savedState.f = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.h = parcel.readInt() == 1;
        savedState.i = parcel.readInt() == 1;
        savedState.j = parcel.readInt() == 1;
        savedState.g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }
}
