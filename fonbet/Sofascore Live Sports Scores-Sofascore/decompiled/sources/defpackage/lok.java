package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lok extends kok {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public lok(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new dh0(0), new dh0(0), new dh0(0));
    }

    @Override // defpackage.kok
    public final lok a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new lok(parcel, dataPosition, i, mz1.o(new StringBuilder(), this.h, "  "), this.a, this.b, this.c);
    }

    @Override // defpackage.kok
    public final boolean e(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 >= this.g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
    }

    @Override // defpackage.kok
    public final void i(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public lok(Parcel parcel, int i, int i2, String str, dh0 dh0Var, dh0 dh0Var2, dh0 dh0Var3) {
        super(dh0Var, dh0Var2, dh0Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
