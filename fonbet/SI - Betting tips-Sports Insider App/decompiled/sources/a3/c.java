package a3;

import android.os.Parcel;
import android.util.SparseIntArray;
import s.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f70d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f71e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72f;

    /* renamed from: g, reason: collision with root package name */
    public final int f73g;

    /* renamed from: h, reason: collision with root package name */
    public final String f74h;

    /* renamed from: i, reason: collision with root package name */
    public int f75i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f76k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // a3.b
    public final c a() {
        Parcel parcel = this.f71e;
        int dataPosition = parcel.dataPosition();
        int i5 = this.j;
        if (i5 == this.f72f) {
            i5 = this.f73g;
        }
        return new c(parcel, dataPosition, i5, d9.e.l(new StringBuilder(), this.f74h, "  "), this.f67a, this.f68b, this.f69c);
    }

    @Override // a3.b
    public final boolean e(int i5) {
        while (this.j < this.f73g) {
            int i10 = this.f76k;
            if (i10 == i5) {
                return true;
            }
            if (String.valueOf(i10).compareTo(String.valueOf(i5)) > 0) {
                return false;
            }
            int i11 = this.j;
            Parcel parcel = this.f71e;
            parcel.setDataPosition(i11);
            int readInt = parcel.readInt();
            this.f76k = parcel.readInt();
            this.j += readInt;
        }
        return this.f76k == i5;
    }

    @Override // a3.b
    public final void h(int i5) {
        int i10 = this.f75i;
        SparseIntArray sparseIntArray = this.f70d;
        Parcel parcel = this.f71e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f75i = i5;
        sparseIntArray.put(i5, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i5);
    }

    public c(Parcel parcel, int i5, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f70d = new SparseIntArray();
        this.f75i = -1;
        this.f76k = -1;
        this.f71e = parcel;
        this.f72f = i5;
        this.f73g = i10;
        this.j = i5;
        this.f74h = str;
    }
}
