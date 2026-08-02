package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1837a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1838b;

    /* renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f1839c;

    /* renamed from: d, reason: collision with root package name */
    public int f1840d;

    /* renamed from: e, reason: collision with root package name */
    public String f1841e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1842f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1843g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1844h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeStringList(this.f1837a);
        parcel.writeStringList(this.f1838b);
        parcel.writeTypedArray(this.f1839c, i5);
        parcel.writeInt(this.f1840d);
        parcel.writeString(this.f1841e);
        parcel.writeStringList(this.f1842f);
        parcel.writeTypedList(this.f1843g);
        parcel.writeTypedList(this.f1844h);
    }
}
