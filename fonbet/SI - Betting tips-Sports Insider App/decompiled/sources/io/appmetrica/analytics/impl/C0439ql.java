package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439ql implements InterfaceC0623y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Y6 f14524a;

    public C0439ql(Y6 y62) {
        this.f14524a = y62;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0623y6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0623y6
    public final SQLiteDatabase a() {
        try {
            return this.f14524a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
