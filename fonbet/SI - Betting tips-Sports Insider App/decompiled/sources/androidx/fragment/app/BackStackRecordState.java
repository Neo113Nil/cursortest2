package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1815a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1816b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1817c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1818d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1819e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1820f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1821g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1822h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f1823i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1824k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1825l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1826m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1827n;

    public BackStackRecordState(a aVar) {
        int size = aVar.f2069a.size();
        this.f1815a = new int[size * 6];
        if (!aVar.f2075g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1816b = new ArrayList(size);
        this.f1817c = new int[size];
        this.f1818d = new int[size];
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            r1 r1Var = (r1) aVar.f2069a.get(i10);
            int i11 = i5 + 1;
            this.f1815a[i5] = r1Var.f2060a;
            ArrayList arrayList = this.f1816b;
            Fragment fragment = r1Var.f2061b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f1815a;
            iArr[i11] = r1Var.f2062c ? 1 : 0;
            iArr[i5 + 2] = r1Var.f2063d;
            iArr[i5 + 3] = r1Var.f2064e;
            int i12 = i5 + 5;
            iArr[i5 + 4] = r1Var.f2065f;
            i5 += 6;
            iArr[i12] = r1Var.f2066g;
            this.f1817c[i10] = r1Var.f2067h.ordinal();
            this.f1818d[i10] = r1Var.f2068i.ordinal();
        }
        this.f1819e = aVar.f2074f;
        this.f1820f = aVar.f2077i;
        this.f1821g = aVar.f1862t;
        this.f1822h = aVar.j;
        this.f1823i = aVar.f2078k;
        this.j = aVar.f2079l;
        this.f1824k = aVar.f2080m;
        this.f1825l = aVar.f2081n;
        this.f1826m = aVar.f2082o;
        this.f1827n = aVar.f2083p;
    }

    public final void a(a aVar) {
        int i5 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1815a;
            boolean z5 = true;
            if (i5 >= iArr.length) {
                aVar.f2074f = this.f1819e;
                aVar.f2077i = this.f1820f;
                aVar.f2075g = true;
                aVar.j = this.f1822h;
                aVar.f2078k = this.f1823i;
                aVar.f2079l = this.j;
                aVar.f2080m = this.f1824k;
                aVar.f2081n = this.f1825l;
                aVar.f2082o = this.f1826m;
                aVar.f2083p = this.f1827n;
                return;
            }
            r1 r1Var = new r1();
            int i11 = i5 + 1;
            r1Var.f2060a = iArr[i5];
            if (j1.L(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i10 + " base fragment #" + iArr[i11]);
            }
            r1Var.f2067h = androidx.lifecycle.x.values()[this.f1817c[i10]];
            r1Var.f2068i = androidx.lifecycle.x.values()[this.f1818d[i10]];
            int i12 = i5 + 2;
            if (iArr[i11] == 0) {
                z5 = false;
            }
            r1Var.f2062c = z5;
            int i13 = iArr[i12];
            r1Var.f2063d = i13;
            int i14 = iArr[i5 + 3];
            r1Var.f2064e = i14;
            int i15 = i5 + 5;
            int i16 = iArr[i5 + 4];
            r1Var.f2065f = i16;
            i5 += 6;
            int i17 = iArr[i15];
            r1Var.f2066g = i17;
            aVar.f2070b = i13;
            aVar.f2071c = i14;
            aVar.f2072d = i16;
            aVar.f2073e = i17;
            aVar.b(r1Var);
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeIntArray(this.f1815a);
        parcel.writeStringList(this.f1816b);
        parcel.writeIntArray(this.f1817c);
        parcel.writeIntArray(this.f1818d);
        parcel.writeInt(this.f1819e);
        parcel.writeString(this.f1820f);
        parcel.writeInt(this.f1821g);
        parcel.writeInt(this.f1822h);
        TextUtils.writeToParcel(this.f1823i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.f1824k, parcel, 0);
        parcel.writeStringList(this.f1825l);
        parcel.writeStringList(this.f1826m);
        parcel.writeInt(this.f1827n ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f1815a = parcel.createIntArray();
        this.f1816b = parcel.createStringArrayList();
        this.f1817c = parcel.createIntArray();
        this.f1818d = parcel.createIntArray();
        this.f1819e = parcel.readInt();
        this.f1820f = parcel.readString();
        this.f1821g = parcel.readInt();
        this.f1822h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1823i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.f1824k = (CharSequence) creator.createFromParcel(parcel);
        this.f1825l = parcel.createStringArrayList();
        this.f1826m = parcel.createStringArrayList();
        this.f1827n = parcel.readInt() != 0;
    }
}
