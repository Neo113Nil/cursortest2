package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new b(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1828a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1829b;

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f1828a = arrayList;
        this.f1829b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f1828a);
        parcel.writeTypedList(this.f1829b);
    }

    public BackStackState(Parcel parcel) {
        this.f1828a = parcel.createStringArrayList();
        this.f1829b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }
}
