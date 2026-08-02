package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Zb implements InterfaceC0623y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13285a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13286b;

    /* renamed from: c, reason: collision with root package name */
    public final C0239in f13287c;

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f13288d;

    /* renamed from: e, reason: collision with root package name */
    public Y6 f13289e;

    public Zb(Context context, String str, @NonNull C0239in c0239in) {
        this(context, str, new Y9(str), c0239in);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0623y6
    public final synchronized SQLiteDatabase a() {
        Y6 y62;
        try {
            this.f13288d.a();
            y62 = new Y6(this.f13285a, this.f13286b, this.f13287c, PublicLogger.getAnonymousInstance());
            this.f13289e = y62;
        } catch (Throwable unused) {
            return null;
        }
        return y62.getWritableDatabase();
    }

    public Zb(@NonNull Context context, @NonNull String str, @NonNull Y9 y92, @NonNull C0239in c0239in) {
        this.f13285a = context;
        this.f13286b = str;
        this.f13288d = y92;
        this.f13287c = c0239in;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0623y6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        lo.a((Closeable) this.f13289e);
        this.f13288d.b();
        this.f13289e = null;
    }
}
