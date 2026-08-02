package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes12.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final String n;
    public final int o;
    public final boolean p;

    public class a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.b = fragment.getClass().getName();
        this.c = fragment.mWho;
        this.d = fragment.mFromLayout;
        this.e = fragment.mInDynamicContainer;
        this.f = fragment.mFragmentId;
        this.g = fragment.mContainerId;
        this.h = fragment.mTag;
        this.i = fragment.mRetainInstance;
        this.j = fragment.mRemoving;
        this.k = fragment.mDetached;
        this.l = fragment.mHidden;
        this.m = fragment.mMaxState.ordinal();
        this.n = fragment.mTargetWho;
        this.o = fragment.mTargetRequestCode;
        this.p = fragment.mUserVisibleHint;
    }

    @NonNull
    public final Fragment a(@NonNull f fVar, @NonNull ClassLoader classLoader) {
        Fragment a2 = fVar.a(this.b);
        a2.mWho = this.c;
        a2.mFromLayout = this.d;
        a2.mInDynamicContainer = this.e;
        a2.mRestored = true;
        a2.mFragmentId = this.f;
        a2.mContainerId = this.g;
        a2.mTag = this.h;
        a2.mRetainInstance = this.i;
        a2.mRemoving = this.j;
        a2.mDetached = this.k;
        a2.mHidden = this.l;
        a2.mMaxState = Lifecycle.State.values()[this.m];
        a2.mTargetWho = this.n;
        a2.mTargetRequestCode = this.o;
        a2.mUserVisibleHint = this.p;
        return a2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.b);
        sb.append(" (");
        sb.append(this.c);
        sb.append(")}:");
        if (this.d) {
            sb.append(" fromLayout");
        }
        if (this.e) {
            sb.append(" dynamicContainer");
        }
        int i = this.g;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.h;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.i) {
            sb.append(" retainInstance");
        }
        if (this.j) {
            sb.append(" removing");
        }
        if (this.k) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        String str2 = this.n;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.o);
        }
        if (this.p) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readInt() != 0;
    }
}
