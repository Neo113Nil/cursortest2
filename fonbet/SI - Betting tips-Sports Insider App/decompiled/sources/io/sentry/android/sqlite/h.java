package io.sentry.android.sqlite;

import androidx.appcompat.app.v0;
import io.sentry.android.replay.n;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements t2.f {

    /* renamed from: a, reason: collision with root package name */
    public final t2.f f16200a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f16201b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16202c;

    public h(t2.f delegate, v0 sqLiteSpanManager, String sql) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqLiteSpanManager, "sqLiteSpanManager");
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f16200a = delegate;
        this.f16201b = sqLiteSpanManager;
        this.f16202c = sql;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16200a.close();
    }

    @Override // t2.e
    public final void f(int i5, long j) {
        this.f16200a.f(i5, j);
    }

    @Override // t2.e
    public final void g(int i5, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16200a.g(i5, value);
    }

    @Override // t2.e
    public final void h(int i5) {
        this.f16200a.h(i5);
    }

    @Override // t2.f
    public final void i() {
        this.f16201b.U(this.f16202c, new n(5, this));
    }

    @Override // t2.e
    public final void l() {
        this.f16200a.l();
    }

    @Override // t2.e
    public final void q(int i5, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16200a.q(i5, value);
    }

    @Override // t2.e
    public final void v(int i5, double d10) {
        this.f16200a.v(i5, d10);
    }
}
