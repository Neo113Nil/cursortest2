package v2;

import android.database.Cursor;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: d, reason: collision with root package name */
    public int[] f24400d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f24401e;

    /* renamed from: f, reason: collision with root package name */
    public double[] f24402f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f24403g;

    /* renamed from: h, reason: collision with root package name */
    public byte[][] f24404h;

    /* renamed from: i, reason: collision with root package name */
    public Cursor f24405i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t2.a db2, String sql) {
        super(db2, sql);
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f24400d = new int[0];
        this.f24401e = new long[0];
        this.f24402f = new double[0];
        this.f24403g = new String[0];
        this.f24404h = new byte[0][];
    }

    public static void r(Cursor cursor, int i5) {
        if (i5 < 0 || i5 >= cursor.getColumnCount()) {
            h8.b.C(25, "column index out of range");
            throw null;
        }
    }

    @Override // s2.c
    public final void B(int i5, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c();
        k(3, i5);
        this.f24400d[i5] = 3;
        this.f24403g[i5] = value;
    }

    @Override // s2.c
    public final String V(int i5) {
        c();
        Cursor t3 = t();
        r(t3, i5);
        String string = t3.getString(i5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f24408c) {
            l();
            reset();
        }
        this.f24408c = true;
    }

    @Override // s2.c
    public final void f(int i5, long j) {
        c();
        k(1, i5);
        this.f24400d[i5] = 1;
        this.f24401e[i5] = j;
    }

    @Override // s2.c
    public final void g(int i5, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c();
        k(4, i5);
        this.f24400d[i5] = 4;
        this.f24404h[i5] = value;
    }

    @Override // s2.c
    public final byte[] getBlob(int i5) {
        c();
        Cursor t3 = t();
        r(t3, i5);
        byte[] blob = t3.getBlob(i5);
        Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
        return blob;
    }

    @Override // s2.c
    public final int getColumnCount() {
        c();
        n();
        Cursor cursor = this.f24405i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // s2.c
    public final String getColumnName(int i5) {
        c();
        n();
        Cursor cursor = this.f24405i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        r(cursor, i5);
        String columnName = cursor.getColumnName(i5);
        Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // s2.c
    public final long getLong(int i5) {
        c();
        Cursor t3 = t();
        r(t3, i5);
        return t3.getLong(i5);
    }

    @Override // s2.c
    public final void h(int i5) {
        c();
        k(5, i5);
        this.f24400d[i5] = 5;
    }

    @Override // s2.c
    public final boolean isNull(int i5) {
        c();
        Cursor t3 = t();
        r(t3, i5);
        return t3.isNull(i5);
    }

    public final void k(int i5, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.f24400d;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f24400d = copyOf;
        }
        if (i5 == 1) {
            long[] jArr = this.f24401e;
            if (jArr.length < i11) {
                long[] copyOf2 = Arrays.copyOf(jArr, i11);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
                this.f24401e = copyOf2;
                return;
            }
            return;
        }
        if (i5 == 2) {
            double[] dArr = this.f24402f;
            if (dArr.length < i11) {
                double[] copyOf3 = Arrays.copyOf(dArr, i11);
                Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(...)");
                this.f24402f = copyOf3;
                return;
            }
            return;
        }
        if (i5 == 3) {
            String[] strArr = this.f24403g;
            if (strArr.length < i11) {
                Object[] copyOf4 = Arrays.copyOf(strArr, i11);
                Intrinsics.checkNotNullExpressionValue(copyOf4, "copyOf(...)");
                this.f24403g = (String[]) copyOf4;
                return;
            }
            return;
        }
        if (i5 != 4) {
            return;
        }
        byte[][] bArr = this.f24404h;
        if (bArr.length < i11) {
            Object[] copyOf5 = Arrays.copyOf(bArr, i11);
            Intrinsics.checkNotNullExpressionValue(copyOf5, "copyOf(...)");
            this.f24404h = (byte[][]) copyOf5;
        }
    }

    @Override // v2.f, s2.c
    public final void l() {
        c();
        this.f24400d = new int[0];
        this.f24401e = new long[0];
        this.f24402f = new double[0];
        this.f24403g = new String[0];
        this.f24404h = new byte[0][];
    }

    public final void n() {
        if (this.f24405i == null) {
            this.f24405i = this.f24406a.Z(new r7.a(14, this));
        }
    }

    @Override // s2.c
    public final boolean n0() {
        c();
        n();
        Cursor cursor = this.f24405i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // v2.f, s2.c
    public final void reset() {
        c();
        Cursor cursor = this.f24405i;
        if (cursor != null) {
            cursor.close();
        }
        this.f24405i = null;
    }

    public final Cursor t() {
        Cursor cursor = this.f24405i;
        if (cursor != null) {
            return cursor;
        }
        h8.b.C(21, "no row");
        throw null;
    }
}
