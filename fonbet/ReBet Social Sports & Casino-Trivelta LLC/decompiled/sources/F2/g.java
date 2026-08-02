package F2;

import E2.i;
import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f3526a;

    public g(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3526a = delegate;
    }

    @Override // E2.i
    public void C1(int i10) {
        this.f3526a.bindNull(i10);
    }

    @Override // E2.i
    public void M(int i10, double d10) {
        this.f3526a.bindDouble(i10, d10);
    }

    @Override // E2.i
    public void P0(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3526a.bindString(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3526a.close();
    }

    @Override // E2.i
    public void h1(int i10, long j10) {
        this.f3526a.bindLong(i10, j10);
    }

    @Override // E2.i
    public void j1(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3526a.bindBlob(i10, value);
    }
}
