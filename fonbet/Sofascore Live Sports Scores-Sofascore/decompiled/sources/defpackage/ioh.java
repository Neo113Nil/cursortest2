package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager$SavedState;
import com.google.android.material.stateful.ExtendableSavedState;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ioh implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ ioh(int i) {
        this.a = i;
    }

    public static SnapshotStateList a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = ioh.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new SnapshotStateList();
        }
        ife m = slh.b.m();
        for (int i = 0; i < readInt; i++) {
            m.add(parcel.readValue(classLoader));
        }
        return new SnapshotStateList(m.d());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.b;
                }
                a70.r("superState must be null");
                return null;
            case 2:
                return new ExtendableSavedState(parcel, classLoader);
            default:
                return new ViewPager$SavedState(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SnapshotStateList[i];
            case 1:
                return new AbsSavedState[i];
            case 2:
                return new ExtendableSavedState[i];
            default:
                return new ViewPager$SavedState[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.b;
                }
                a70.r("superState must be null");
                return null;
            case 2:
                return new ExtendableSavedState(parcel, null);
            default:
                return new ViewPager$SavedState(parcel, null);
        }
    }
}
