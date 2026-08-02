package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC2185j;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f20005a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20006b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20007c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20008d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20009e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20010f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20011g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20012h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20013i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f20014j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20015k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20016l;

    /* renamed from: m, reason: collision with root package name */
    public final String f20017m;

    /* renamed from: n, reason: collision with root package name */
    public final int f20018n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20019o;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(Fragment fragment) {
        this.f20005a = fragment.getClass().getName();
        this.f20006b = fragment.mWho;
        this.f20007c = fragment.mFromLayout;
        this.f20008d = fragment.mInDynamicContainer;
        this.f20009e = fragment.mFragmentId;
        this.f20010f = fragment.mContainerId;
        this.f20011g = fragment.mTag;
        this.f20012h = fragment.mRetainInstance;
        this.f20013i = fragment.mRemoving;
        this.f20014j = fragment.mDetached;
        this.f20015k = fragment.mHidden;
        this.f20016l = fragment.mMaxState.ordinal();
        this.f20017m = fragment.mTargetWho;
        this.f20018n = fragment.mTargetRequestCode;
        this.f20019o = fragment.mUserVisibleHint;
    }

    public Fragment a(AbstractC2172w abstractC2172w, ClassLoader classLoader) {
        Fragment a10 = abstractC2172w.a(classLoader, this.f20005a);
        a10.mWho = this.f20006b;
        a10.mFromLayout = this.f20007c;
        a10.mInDynamicContainer = this.f20008d;
        a10.mRestored = true;
        a10.mFragmentId = this.f20009e;
        a10.mContainerId = this.f20010f;
        a10.mTag = this.f20011g;
        a10.mRetainInstance = this.f20012h;
        a10.mRemoving = this.f20013i;
        a10.mDetached = this.f20014j;
        a10.mHidden = this.f20015k;
        a10.mMaxState = AbstractC2185j.b.values()[this.f20016l];
        a10.mTargetWho = this.f20017m;
        a10.mTargetRequestCode = this.f20018n;
        a10.mUserVisibleHint = this.f20019o;
        return a10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f20005a);
        sb2.append(" (");
        sb2.append(this.f20006b);
        sb2.append(")}:");
        if (this.f20007c) {
            sb2.append(" fromLayout");
        }
        if (this.f20008d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f20010f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f20010f));
        }
        String str = this.f20011g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f20011g);
        }
        if (this.f20012h) {
            sb2.append(" retainInstance");
        }
        if (this.f20013i) {
            sb2.append(" removing");
        }
        if (this.f20014j) {
            sb2.append(" detached");
        }
        if (this.f20015k) {
            sb2.append(" hidden");
        }
        if (this.f20017m != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f20017m);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f20018n);
        }
        if (this.f20019o) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20005a);
        parcel.writeString(this.f20006b);
        parcel.writeInt(this.f20007c ? 1 : 0);
        parcel.writeInt(this.f20008d ? 1 : 0);
        parcel.writeInt(this.f20009e);
        parcel.writeInt(this.f20010f);
        parcel.writeString(this.f20011g);
        parcel.writeInt(this.f20012h ? 1 : 0);
        parcel.writeInt(this.f20013i ? 1 : 0);
        parcel.writeInt(this.f20014j ? 1 : 0);
        parcel.writeInt(this.f20015k ? 1 : 0);
        parcel.writeInt(this.f20016l);
        parcel.writeString(this.f20017m);
        parcel.writeInt(this.f20018n);
        parcel.writeInt(this.f20019o ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.f20005a = parcel.readString();
        this.f20006b = parcel.readString();
        this.f20007c = parcel.readInt() != 0;
        this.f20008d = parcel.readInt() != 0;
        this.f20009e = parcel.readInt();
        this.f20010f = parcel.readInt();
        this.f20011g = parcel.readString();
        this.f20012h = parcel.readInt() != 0;
        this.f20013i = parcel.readInt() != 0;
        this.f20014j = parcel.readInt() != 0;
        this.f20015k = parcel.readInt() != 0;
        this.f20016l = parcel.readInt();
        this.f20017m = parcel.readString();
        this.f20018n = parcel.readInt();
        this.f20019o = parcel.readInt() != 0;
    }
}
