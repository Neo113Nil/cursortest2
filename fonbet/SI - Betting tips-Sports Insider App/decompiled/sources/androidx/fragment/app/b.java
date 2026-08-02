package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1866a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1866a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f1835a = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f1836b = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f1841e = null;
                fragmentManagerState.f1842f = new ArrayList();
                fragmentManagerState.f1843g = new ArrayList();
                fragmentManagerState.f1837a = parcel.createStringArrayList();
                fragmentManagerState.f1838b = parcel.createStringArrayList();
                fragmentManagerState.f1839c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f1840d = parcel.readInt();
                fragmentManagerState.f1841e = parcel.readString();
                fragmentManagerState.f1842f = parcel.createStringArrayList();
                fragmentManagerState.f1843g = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.f1844h = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            case 4:
                return new FragmentState(parcel);
            default:
                FragmentTabHost$SavedState fragmentTabHost$SavedState = new FragmentTabHost$SavedState(parcel);
                fragmentTabHost$SavedState.f1859a = parcel.readString();
                return fragmentTabHost$SavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f1866a) {
            case 0:
                return new BackStackRecordState[i5];
            case 1:
                return new BackStackState[i5];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i5];
            case 3:
                return new FragmentManagerState[i5];
            case 4:
                return new FragmentState[i5];
            default:
                return new FragmentTabHost$SavedState[i5];
        }
    }
}
