package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class y2 implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final y2 f5654c = new y2(l3.f5498b);

    /* renamed from: a, reason: collision with root package name */
    public int f5655a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5656b;

    static {
        int i5 = v2.f5608a;
    }

    public y2(byte[] bArr) {
        bArr.getClass();
        this.f5656b = bArr;
    }

    public static int d(int i5, int i10, int i11) {
        int i12 = i10 - i5;
        if ((i5 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(d9.e.f(i5, "Beginning index: ", " < 0"));
        }
        if (i10 < i5) {
            throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Beginning index larger than ending index: ", ", ", i10));
        }
        throw new IndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i10, "End index: ", " >= ", i11));
    }

    public static y2 e(byte[] bArr, int i5, int i10) {
        d(i5, i5 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        return new y2(bArr2);
    }

    public byte a(int i5) {
        return this.f5656b[i5];
    }

    public byte b(int i5) {
        return this.f5656b[i5];
    }

    public int c() {
        return this.f5656b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y2) && c() == ((y2) obj).c()) {
            if (c() == 0) {
                return true;
            }
            if (!(obj instanceof y2)) {
                return obj.equals(this);
            }
            y2 y2Var = (y2) obj;
            int i5 = this.f5655a;
            int i10 = y2Var.f5655a;
            if (i5 == 0 || i10 == 0 || i5 == i10) {
                int c2 = c();
                if (c2 > y2Var.c()) {
                    throw new IllegalArgumentException("Length too large: " + c2 + c());
                }
                if (c2 > y2Var.c()) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.j(c2, "Ran off end of other: 0, ", ", ", y2Var.c()));
                }
                byte[] bArr = y2Var.f5656b;
                int i11 = 0;
                int i12 = 0;
                while (i11 < c2) {
                    if (this.f5656b[i11] == bArr[i12]) {
                        i11++;
                        i12++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.f5655a;
        if (i5 != 0) {
            return i5;
        }
        int c2 = c();
        int i10 = c2;
        for (int i11 = 0; i11 < c2; i11++) {
            i10 = (i10 * 31) + this.f5656b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f5655a = i10;
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
            concat = d3.f(this);
        } else {
            int d10 = d(0, 47, c());
            concat = d3.f(d10 == 0 ? f5654c : new x2(d10, this.f5656b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(c2);
        sb2.append(" contents=\"");
        return d9.e.l(sb2, concat, "\">");
    }
}
