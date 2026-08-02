package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, null);
        savedState.a = parcel.readInt();
        savedState.b = parcel.readInt();
        savedState.c = parcel.readParcelable(null);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ViewPager2.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, classLoader);
        savedState.a = parcel.readInt();
        savedState.b = parcel.readInt();
        savedState.c = parcel.readParcelable(classLoader);
        return savedState;
    }
}
