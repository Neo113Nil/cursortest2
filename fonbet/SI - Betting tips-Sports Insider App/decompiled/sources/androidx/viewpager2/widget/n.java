package androidx.viewpager2.widget;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ViewPager2.SavedState(parcel, null);
        }
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel);
        savedState.f2884a = parcel.readInt();
        savedState.f2885b = parcel.readInt();
        savedState.f2886c = parcel.readParcelable(null);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        return new ViewPager2.SavedState[i5];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ViewPager2.SavedState(parcel, classLoader);
        }
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel);
        savedState.f2884a = parcel.readInt();
        savedState.f2885b = parcel.readInt();
        savedState.f2886c = parcel.readParcelable(null);
        return savedState;
    }
}
