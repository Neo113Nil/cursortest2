package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.N;
import androidx.lifecycle.AbstractC2185j;
import java.util.ArrayList;
import java.util.Objects;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19866b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19867c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19868d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19869e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f19870f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19871g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f19872h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f19873i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f19874j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f19875k;
    final int[] mCurrentMaxLifecycleStates;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    public BackStackRecordState(C2151a c2151a) {
        int size = c2151a.f20048c.size();
        this.mOps = new int[size * 6];
        if (!c2151a.f20054i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f19865a = new ArrayList(size);
        this.mOldMaxLifecycleStates = new int[size];
        this.mCurrentMaxLifecycleStates = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            N.a aVar = (N.a) c2151a.f20048c.get(i11);
            int i12 = i10 + 1;
            this.mOps[i10] = aVar.f20065a;
            ArrayList arrayList = this.f19865a;
            Fragment fragment = aVar.f20066b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.mOps;
            iArr[i12] = aVar.f20067c ? 1 : 0;
            iArr[i10 + 2] = aVar.f20068d;
            iArr[i10 + 3] = aVar.f20069e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f20070f;
            i10 += 6;
            iArr[i13] = aVar.f20071g;
            this.mOldMaxLifecycleStates[i11] = aVar.f20072h.ordinal();
            this.mCurrentMaxLifecycleStates[i11] = aVar.f20073i.ordinal();
        }
        this.f19866b = c2151a.f20053h;
        this.f19867c = c2151a.f20056k;
        this.f19868d = c2151a.f20144v;
        this.f19869e = c2151a.f20057l;
        this.f19870f = c2151a.f20058m;
        this.f19871g = c2151a.f20059n;
        this.f19872h = c2151a.f20060o;
        this.f19873i = c2151a.f20061p;
        this.f19874j = c2151a.f20062q;
        this.f19875k = c2151a.f20063r;
    }

    public final void a(C2151a c2151a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.mOps.length) {
                c2151a.f20053h = this.f19866b;
                c2151a.f20056k = this.f19867c;
                c2151a.f20054i = true;
                c2151a.f20057l = this.f19869e;
                c2151a.f20058m = this.f19870f;
                c2151a.f20059n = this.f19871g;
                c2151a.f20060o = this.f19872h;
                c2151a.f20061p = this.f19873i;
                c2151a.f20062q = this.f19874j;
                c2151a.f20063r = this.f19875k;
                return;
            }
            N.a aVar = new N.a();
            int i12 = i10 + 1;
            aVar.f20065a = this.mOps[i10];
            if (FragmentManager.Q0(2)) {
                Objects.toString(c2151a);
                int i13 = this.mOps[i12];
            }
            aVar.f20072h = AbstractC2185j.b.values()[this.mOldMaxLifecycleStates[i11]];
            aVar.f20073i = AbstractC2185j.b.values()[this.mCurrentMaxLifecycleStates[i11]];
            int[] iArr = this.mOps;
            int i14 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f20067c = z10;
            int i15 = iArr[i14];
            aVar.f20068d = i15;
            int i16 = iArr[i10 + 3];
            aVar.f20069e = i16;
            int i17 = i10 + 5;
            int i18 = iArr[i10 + 4];
            aVar.f20070f = i18;
            i10 += 6;
            int i19 = iArr[i17];
            aVar.f20071g = i19;
            c2151a.f20049d = i15;
            c2151a.f20050e = i16;
            c2151a.f20051f = i18;
            c2151a.f20052g = i19;
            c2151a.f(aVar);
            i11++;
        }
    }

    public C2151a b(FragmentManager fragmentManager) {
        C2151a c2151a = new C2151a(fragmentManager);
        a(c2151a);
        c2151a.f20144v = this.f19868d;
        for (int i10 = 0; i10 < this.f19865a.size(); i10++) {
            String str = (String) this.f19865a.get(i10);
            if (str != null) {
                ((N.a) c2151a.f20048c.get(i10)).f20066b = fragmentManager.l0(str);
            }
        }
        c2151a.y(1);
        return c2151a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.mOps);
        parcel.writeStringList(this.f19865a);
        parcel.writeIntArray(this.mOldMaxLifecycleStates);
        parcel.writeIntArray(this.mCurrentMaxLifecycleStates);
        parcel.writeInt(this.f19866b);
        parcel.writeString(this.f19867c);
        parcel.writeInt(this.f19868d);
        parcel.writeInt(this.f19869e);
        TextUtils.writeToParcel(this.f19870f, parcel, 0);
        parcel.writeInt(this.f19871g);
        TextUtils.writeToParcel(this.f19872h, parcel, 0);
        parcel.writeStringList(this.f19873i);
        parcel.writeStringList(this.f19874j);
        parcel.writeInt(this.f19875k ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.f19865a = parcel.createStringArrayList();
        this.mOldMaxLifecycleStates = parcel.createIntArray();
        this.mCurrentMaxLifecycleStates = parcel.createIntArray();
        this.f19866b = parcel.readInt();
        this.f19867c = parcel.readString();
        this.f19868d = parcel.readInt();
        this.f19869e = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f19870f = (CharSequence) creator.createFromParcel(parcel);
        this.f19871g = parcel.readInt();
        this.f19872h = (CharSequence) creator.createFromParcel(parcel);
        this.f19873i = parcel.createStringArrayList();
        this.f19874j = parcel.createStringArrayList();
        this.f19875k = parcel.readInt() != 0;
    }
}
