package io.sentry.android.sqlite;

import androidx.appcompat.app.v0;
import gf.k;
import gf.t;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements t2.d {

    /* renamed from: a, reason: collision with root package name */
    public final t2.d f16196a;

    /* renamed from: b, reason: collision with root package name */
    public final v0 f16197b;

    /* renamed from: c, reason: collision with root package name */
    public final t f16198c = k.b(new f(this, 1));

    /* renamed from: d, reason: collision with root package name */
    public final t f16199d = k.b(new f(this, 0));

    public g(t2.d dVar) {
        this.f16196a = dVar;
        this.f16197b = new v0(dVar.getDatabaseName(), 20);
    }

    public static final g c(t2.d delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (!(delegate instanceof g)) {
            delegate = new g(delegate);
        }
        return (g) delegate;
    }

    @Override // t2.d
    public final t2.a M() {
        return (t2.a) this.f16199d.getValue();
    }

    @Override // t2.d
    public final t2.a Q() {
        return (t2.a) this.f16198c.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16196a.close();
    }

    @Override // t2.d
    public final String getDatabaseName() {
        return this.f16196a.getDatabaseName();
    }

    @Override // t2.d
    public final void setWriteAheadLoggingEnabled(boolean z5) {
        this.f16196a.setWriteAheadLoggingEnabled(z5);
    }
}
