package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f19998a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f19999b;

    /* renamed from: c, reason: collision with root package name */
    public int f20000c;

    /* renamed from: d, reason: collision with root package name */
    public String f20001d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f20002e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f20003f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f20004g;
    BackStackRecordState[] mBackStack;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f20001d = null;
        this.f20002e = new ArrayList();
        this.f20003f = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f19998a);
        parcel.writeStringList(this.f19999b);
        parcel.writeTypedArray(this.mBackStack, i10);
        parcel.writeInt(this.f20000c);
        parcel.writeString(this.f20001d);
        parcel.writeStringList(this.f20002e);
        parcel.writeTypedList(this.f20003f);
        parcel.writeTypedList(this.f20004g);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f20001d = null;
        this.f20002e = new ArrayList();
        this.f20003f = new ArrayList();
        this.f19998a = parcel.createStringArrayList();
        this.f19999b = parcel.createStringArrayList();
        this.mBackStack = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f20000c = parcel.readInt();
        this.f20001d = parcel.readString();
        this.f20002e = parcel.createStringArrayList();
        this.f20003f = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f20004g = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
