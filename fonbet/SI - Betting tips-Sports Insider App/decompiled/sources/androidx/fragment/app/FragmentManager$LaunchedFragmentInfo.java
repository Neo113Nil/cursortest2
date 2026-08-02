package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public String f1835a;

    /* renamed from: b, reason: collision with root package name */
    public int f1836b;

    public FragmentManager$LaunchedFragmentInfo(String str, int i5) {
        this.f1835a = str;
        this.f1836b = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f1835a);
        parcel.writeInt(this.f1836b);
    }
}
