package u2;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class i implements t2.e {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f24047a;

    public i(SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f24047a = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24047a.close();
    }

    @Override // t2.e
    public final void f(int i5, long j) {
        this.f24047a.bindLong(i5, j);
    }

    @Override // t2.e
    public final void g(int i5, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24047a.bindBlob(i5, value);
    }

    @Override // t2.e
    public final void h(int i5) {
        this.f24047a.bindNull(i5);
    }

    @Override // t2.e
    public final void l() {
        this.f24047a.clearBindings();
    }

    @Override // t2.e
    public final void q(int i5, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f24047a.bindString(i5, value);
    }

    @Override // t2.e
    public final void v(int i5, double d10) {
        this.f24047a.bindDouble(i5, d10);
    }
}
