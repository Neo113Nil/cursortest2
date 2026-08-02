package io.sentry.android.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.appcompat.app.v0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements t2.a {

    /* renamed from: a, reason: collision with root package name */
    public final t2.a f16192a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f16193b;

    public e(t2.a delegate, v0 sqLiteSpanManager) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqLiteSpanManager, "sqLiteSpanManager");
        this.f16192a = delegate;
        this.f16193b = sqLiteSpanManager;
    }

    @Override // t2.a
    public final boolean D() {
        return this.f16192a.D();
    }

    @Override // t2.a
    public final void F(Object[] bindArgs) {
        Intrinsics.checkNotNullParameter("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f16193b.U("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new d(this, bindArgs, 1));
    }

    @Override // t2.a
    public final void G() {
        this.f16192a.G();
    }

    @Override // t2.a
    public final void I() {
        this.f16192a.I();
    }

    @Override // t2.a
    public final void S() {
        this.f16192a.S();
    }

    @Override // t2.a
    public final Cursor Z(r7.a query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (Cursor) this.f16193b.U(((v2.e) query.f22318b).f24407b, new d(this, query, 2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16192a.close();
    }

    @Override // t2.a
    public final boolean g0() {
        return this.f16192a.g0();
    }

    @Override // t2.a
    public final boolean isOpen() {
        return this.f16192a.isOpen();
    }

    @Override // t2.a
    public final boolean j() {
        return this.f16192a.j();
    }

    @Override // t2.a
    public final void m() {
        this.f16192a.m();
    }

    @Override // t2.a
    public final void o() {
        this.f16192a.o();
    }

    @Override // t2.a
    public final void p(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f16193b.U(sql, new d(this, sql, 0));
    }

    @Override // t2.a
    public final int p0(ContentValues values, Object[] objArr) {
        Intrinsics.checkNotNullParameter("WorkSpec", "table");
        Intrinsics.checkNotNullParameter(values, "values");
        return this.f16192a.p0(values, objArr);
    }

    @Override // t2.a
    public final t2.f s(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return new h(this.f16192a.s(sql), this.f16193b, sql);
    }

    @Override // t2.a
    public final void x() {
        this.f16192a.x();
    }
}
