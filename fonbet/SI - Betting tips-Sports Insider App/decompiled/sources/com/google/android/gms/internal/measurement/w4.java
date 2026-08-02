package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class w4 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final w4 f5334c = new w4(n5.f5149b);

    /* renamed from: a, reason: collision with root package name */
    public int f5335a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5336b;

    static {
        int i5 = s4.f5235a;
    }

    public w4(byte[] bArr) {
        bArr.getClass();
        this.f5336b = bArr;
    }

    public static w4 d(byte[] bArr, int i5, int i10) {
        e(i5, i5 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        return new w4(bArr2);
    }

    public static int e(int i5, int i10, int i11) {
        int i12 = i10 - i5;
        if ((i5 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i5 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i5);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < i5) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + 44 + String.valueOf(i10).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i5);
            sb3.append(", ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(i11).length());
        sb4.append("End index: ");
        sb4.append(i10);
        sb4.append(" >= ");
        sb4.append(i11);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public byte a(int i5) {
        return this.f5336b[i5];
    }

    public byte b(int i5) {
        return this.f5336b[i5];
    }

    public int c() {
        return this.f5336b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w4) && c() == ((w4) obj).c()) {
            if (c() == 0) {
                return true;
            }
            if (!(obj instanceof w4)) {
                return obj.equals(this);
            }
            w4 w4Var = (w4) obj;
            int i5 = this.f5335a;
            int i10 = w4Var.f5335a;
            if (i5 == 0 || i10 == 0 || i5 == i10) {
                int c2 = c();
                if (c2 > w4Var.c()) {
                    int c8 = c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 18 + String.valueOf(c8).length());
                    sb2.append("Length too large: ");
                    sb2.append(c2);
                    sb2.append(c8);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (c2 <= w4Var.c()) {
                    byte[] bArr = w4Var.f5336b;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < c2) {
                        if (this.f5336b[i11] == bArr[i12]) {
                            i11++;
                            i12++;
                        }
                    }
                    return true;
                }
                int c10 = w4Var.c();
                StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 27 + String.valueOf(c10).length());
                sb3.append("Ran off end of other: 0, ");
                sb3.append(c2);
                sb3.append(", ");
                sb3.append(c10);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f5335a;
        if (i5 != 0) {
            return i5;
        }
        int c2 = c();
        int i10 = c2;
        for (int i11 = 0; i11 < c2; i11++) {
            i10 = (i10 * 31) + this.f5336b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f5335a = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int c2 = c();
        if (c() <= 50) {
            concat = h8.b.T(this);
        } else {
            int e7 = e(0, 47, c());
            concat = h8.b.T(e7 == 0 ? f5334c : new v4(e7, this.f5336b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(c2);
        sb2.append(" contents=\"");
        return d9.e.l(sb2, concat, "\">");
    }
}
