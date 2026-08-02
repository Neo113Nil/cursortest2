package M2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import z.C6900a;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7419d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f7420e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7421f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7422g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7423h;

    /* renamed from: i, reason: collision with root package name */
    public int f7424i;

    /* renamed from: j, reason: collision with root package name */
    public int f7425j;

    /* renamed from: k, reason: collision with root package name */
    public int f7426k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C6900a(), new C6900a(), new C6900a());
    }

    @Override // M2.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f7420e.writeInt(-1);
        } else {
            this.f7420e.writeInt(bArr.length);
            this.f7420e.writeByteArray(bArr);
        }
    }

    @Override // M2.a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f7420e, 0);
    }

    @Override // M2.a
    public void E(int i10) {
        this.f7420e.writeInt(i10);
    }

    @Override // M2.a
    public void G(Parcelable parcelable) {
        this.f7420e.writeParcelable(parcelable, 0);
    }

    @Override // M2.a
    public void I(String str) {
        this.f7420e.writeString(str);
    }

    @Override // M2.a
    public void a() {
        int i10 = this.f7424i;
        if (i10 >= 0) {
            int i11 = this.f7419d.get(i10);
            int dataPosition = this.f7420e.dataPosition();
            this.f7420e.setDataPosition(i11);
            this.f7420e.writeInt(dataPosition - i11);
            this.f7420e.setDataPosition(dataPosition);
        }
    }

    @Override // M2.a
    public a b() {
        Parcel parcel = this.f7420e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f7425j;
        if (i10 == this.f7421f) {
            i10 = this.f7422g;
        }
        return new b(parcel, dataPosition, i10, this.f7423h + "  ", this.f7416a, this.f7417b, this.f7418c);
    }

    @Override // M2.a
    public boolean g() {
        return this.f7420e.readInt() != 0;
    }

    @Override // M2.a
    public byte[] i() {
        int readInt = this.f7420e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f7420e.readByteArray(bArr);
        return bArr;
    }

    @Override // M2.a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f7420e);
    }

    @Override // M2.a
    public boolean m(int i10) {
        while (this.f7425j < this.f7422g) {
            int i11 = this.f7426k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f7420e.setDataPosition(this.f7425j);
            int readInt = this.f7420e.readInt();
            this.f7426k = this.f7420e.readInt();
            this.f7425j += readInt;
        }
        return this.f7426k == i10;
    }

    @Override // M2.a
    public int o() {
        return this.f7420e.readInt();
    }

    @Override // M2.a
    public Parcelable q() {
        return this.f7420e.readParcelable(getClass().getClassLoader());
    }

    @Override // M2.a
    public String s() {
        return this.f7420e.readString();
    }

    @Override // M2.a
    public void w(int i10) {
        a();
        this.f7424i = i10;
        this.f7419d.put(i10, this.f7420e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // M2.a
    public void y(boolean z10) {
        this.f7420e.writeInt(z10 ? 1 : 0);
    }

    public b(Parcel parcel, int i10, int i11, String str, C6900a c6900a, C6900a c6900a2, C6900a c6900a3) {
        super(c6900a, c6900a2, c6900a3);
        this.f7419d = new SparseIntArray();
        this.f7424i = -1;
        this.f7426k = -1;
        this.f7420e = parcel;
        this.f7421f = i10;
        this.f7422g = i11;
        this.f7425j = i10;
        this.f7423h = str;
    }
}
