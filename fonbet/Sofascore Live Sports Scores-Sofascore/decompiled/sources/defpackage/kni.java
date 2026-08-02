package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kni extends lni {
    public int[] d;
    public long[] e;
    public double[] f;
    public String[] g;
    public byte[][] h;
    public Cursor i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kni(dni dniVar, String str) {
        super(dniVar, str);
        dniVar.getClass();
        str.getClass();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    public static void m(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            b0a.R(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.nlg
    public final String F0(int i) {
        h();
        Cursor n = n();
        m(n, i);
        String string = n.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.nlg
    public final void L(int i, String str) {
        str.getClass();
        h();
        i(3, i);
        this.d[i] = 3;
        this.g[i] = str;
    }

    @Override // defpackage.nlg
    public final boolean U0() {
        h();
        k();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        a70.r("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            z();
            reset();
        }
        this.c = true;
    }

    @Override // defpackage.nlg
    public final byte[] getBlob(int i) {
        h();
        Cursor n = n();
        m(n, i);
        byte[] blob = n.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.nlg
    public final int getColumnCount() {
        h();
        k();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.nlg
    public final String getColumnName(int i) {
        h();
        k();
        Cursor cursor = this.i;
        if (cursor == null) {
            a70.r("Required value was null.");
            return null;
        }
        m(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.nlg
    public final long getLong(int i) {
        h();
        Cursor n = n();
        m(n, i);
        return n.getLong(i);
    }

    public final void i(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.d;
        if (iArr.length < i3) {
            this.d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.e;
            if (jArr.length < i3) {
                this.e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f;
            if (dArr.length < i3) {
                this.f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.g;
            if (strArr.length < i3) {
                this.g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.h;
        if (bArr.length < i3) {
            this.h = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.nlg
    public final boolean isNull(int i) {
        h();
        Cursor n = n();
        m(n, i);
        return n.isNull(i);
    }

    public final void k() {
        if (this.i == null) {
            this.i = this.a.B(new cqa(this));
        }
    }

    public final Cursor n() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        b0a.R(21, "no row");
        throw null;
    }

    @Override // defpackage.nlg
    public final void q(int i, long j) {
        h();
        i(1, i);
        this.d[i] = 1;
        this.e[i] = j;
    }

    @Override // defpackage.nlg
    public final void r(int i, byte[] bArr) {
        bArr.getClass();
        h();
        i(4, i);
        this.d[i] = 4;
        this.h[i] = bArr;
    }

    @Override // defpackage.lni, defpackage.nlg
    public final void reset() {
        h();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // defpackage.nlg
    public final void s(int i) {
        h();
        i(5, i);
        this.d[i] = 5;
    }

    @Override // defpackage.lni, defpackage.nlg
    public final void z() {
        h();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }
}
