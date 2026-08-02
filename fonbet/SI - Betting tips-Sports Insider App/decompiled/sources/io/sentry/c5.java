package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c5 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16233a;

    /* renamed from: b, reason: collision with root package name */
    public String f16234b;

    /* renamed from: c, reason: collision with root package name */
    public String f16235c;

    /* renamed from: d, reason: collision with root package name */
    public String f16236d;

    /* renamed from: e, reason: collision with root package name */
    public Long f16237e;

    /* renamed from: f, reason: collision with root package name */
    public ConcurrentHashMap f16238f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c5.class != obj.getClass()) {
            return false;
        }
        return y4.a.s(this.f16234b, ((c5) obj).f16234b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16234b});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("type");
        aVar.G(this.f16233a);
        if (this.f16234b != null) {
            aVar.u("address");
            aVar.K(this.f16234b);
        }
        if (this.f16235c != null) {
            aVar.u("package_name");
            aVar.K(this.f16235c);
        }
        if (this.f16236d != null) {
            aVar.u("class_name");
            aVar.K(this.f16236d);
        }
        if (this.f16237e != null) {
            aVar.u("thread_id");
            aVar.J(this.f16237e);
        }
        ConcurrentHashMap concurrentHashMap = this.f16238f;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16238f, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
