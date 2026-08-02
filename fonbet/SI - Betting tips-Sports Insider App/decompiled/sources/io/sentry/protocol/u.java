package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16915a;

    /* renamed from: b, reason: collision with root package name */
    public String f16916b;

    /* renamed from: c, reason: collision with root package name */
    public String f16917c;

    /* renamed from: d, reason: collision with root package name */
    public Long f16918d;

    /* renamed from: e, reason: collision with root package name */
    public b0 f16919e;

    /* renamed from: f, reason: collision with root package name */
    public m f16920f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f16921g;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16915a != null) {
            aVar.u("type");
            aVar.K(this.f16915a);
        }
        if (this.f16916b != null) {
            aVar.u("value");
            aVar.K(this.f16916b);
        }
        if (this.f16917c != null) {
            aVar.u("module");
            aVar.K(this.f16917c);
        }
        if (this.f16918d != null) {
            aVar.u("thread_id");
            aVar.J(this.f16918d);
        }
        if (this.f16919e != null) {
            aVar.u("stacktrace");
            aVar.H(iLogger, this.f16919e);
        }
        if (this.f16920f != null) {
            aVar.u("mechanism");
            aVar.H(iLogger, this.f16920f);
        }
        HashMap hashMap = this.f16921g;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16921g, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
