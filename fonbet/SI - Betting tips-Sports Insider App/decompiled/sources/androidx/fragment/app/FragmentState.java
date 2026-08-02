package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f1845a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1846b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1847c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1848d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1849e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1850f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1851g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1852h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1853i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1854k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1855l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1856m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1857n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1858o;

    public FragmentState(Fragment fragment) {
        this.f1845a = fragment.getClass().getName();
        this.f1846b = fragment.mWho;
        this.f1847c = fragment.mFromLayout;
        this.f1848d = fragment.mInDynamicContainer;
        this.f1849e = fragment.mFragmentId;
        this.f1850f = fragment.mContainerId;
        this.f1851g = fragment.mTag;
        this.f1852h = fragment.mRetainInstance;
        this.f1853i = fragment.mRemoving;
        this.j = fragment.mDetached;
        this.f1854k = fragment.mHidden;
        this.f1855l = fragment.mMaxState.ordinal();
        this.f1856m = fragment.mTargetWho;
        this.f1857n = fragment.mTargetRequestCode;
        this.f1858o = fragment.mUserVisibleHint;
    }

    public final Fragment a(b1 b1Var) {
        Fragment a7 = b1Var.a(this.f1845a);
        a7.mWho = this.f1846b;
        a7.mFromLayout = this.f1847c;
        a7.mInDynamicContainer = this.f1848d;
        a7.mRestored = true;
        a7.mFragmentId = this.f1849e;
        a7.mContainerId = this.f1850f;
        a7.mTag = this.f1851g;
        a7.mRetainInstance = this.f1852h;
        a7.mRemoving = this.f1853i;
        a7.mDetached = this.j;
        a7.mHidden = this.f1854k;
        a7.mMaxState = androidx.lifecycle.x.values()[this.f1855l];
        a7.mTargetWho = this.f1856m;
        a7.mTargetRequestCode = this.f1857n;
        a7.mUserVisibleHint = this.f1858o;
        return a7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1845a);
        sb2.append(" (");
        sb2.append(this.f1846b);
        sb2.append(")}:");
        if (this.f1847c) {
            sb2.append(" fromLayout");
        }
        if (this.f1848d) {
            sb2.append(" dynamicContainer");
        }
        int i5 = this.f1850f;
        if (i5 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i5));
        }
        String str = this.f1851g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f1852h) {
            sb2.append(" retainInstance");
        }
        if (this.f1853i) {
            sb2.append(" removing");
        }
        if (this.j) {
            sb2.append(" detached");
        }
        if (this.f1854k) {
            sb2.append(" hidden");
        }
        String str2 = this.f1856m;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f1857n);
        }
        if (this.f1858o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f1845a);
        parcel.writeString(this.f1846b);
        parcel.writeInt(this.f1847c ? 1 : 0);
        parcel.writeInt(this.f1848d ? 1 : 0);
        parcel.writeInt(this.f1849e);
        parcel.writeInt(this.f1850f);
        parcel.writeString(this.f1851g);
        parcel.writeInt(this.f1852h ? 1 : 0);
        parcel.writeInt(this.f1853i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.f1854k ? 1 : 0);
        parcel.writeInt(this.f1855l);
        parcel.writeString(this.f1856m);
        parcel.writeInt(this.f1857n);
        parcel.writeInt(this.f1858o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f1845a = parcel.readString();
        this.f1846b = parcel.readString();
        this.f1847c = parcel.readInt() != 0;
        this.f1848d = parcel.readInt() != 0;
        this.f1849e = parcel.readInt();
        this.f1850f = parcel.readInt();
        this.f1851g = parcel.readString();
        this.f1852h = parcel.readInt() != 0;
        this.f1853i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.f1854k = parcel.readInt() != 0;
        this.f1855l = parcel.readInt();
        this.f1856m = parcel.readString();
        this.f1857n = parcel.readInt();
        this.f1858o = parcel.readInt() != 0;
    }
}
