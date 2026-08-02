package io.sentry.util;

import io.sentry.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public final e f17160b;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f17159a = null;

    /* renamed from: c, reason: collision with root package name */
    public final a f17161c = new a();

    public f(e eVar) {
        this.f17160b = eVar;
    }

    public final Object a() {
        if (this.f17159a == null) {
            r a7 = this.f17161c.a();
            try {
                if (this.f17159a == null) {
                    this.f17159a = this.f17160b.b();
                }
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this.f17159a;
    }

    public final void b(Object obj) {
        r a7 = this.f17161c.a();
        try {
            this.f17159a = obj;
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
