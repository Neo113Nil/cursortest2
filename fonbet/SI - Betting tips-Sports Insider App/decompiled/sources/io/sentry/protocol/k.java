package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16831a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f16832b;

    /* renamed from: c, reason: collision with root package name */
    public String f16833c;

    /* renamed from: d, reason: collision with root package name */
    public String f16834d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f16835e;

    /* renamed from: f, reason: collision with root package name */
    public String f16836f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f16837g;

    /* renamed from: h, reason: collision with root package name */
    public String f16838h;

    /* renamed from: i, reason: collision with root package name */
    public String f16839i;
    public ConcurrentHashMap j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (y4.a.s(this.f16831a, kVar.f16831a) && y4.a.s(this.f16832b, kVar.f16832b) && y4.a.s(this.f16833c, kVar.f16833c) && y4.a.s(this.f16834d, kVar.f16834d) && y4.a.s(this.f16835e, kVar.f16835e) && y4.a.s(this.f16836f, kVar.f16836f) && y4.a.s(this.f16837g, kVar.f16837g) && y4.a.s(this.f16838h, kVar.f16838h) && y4.a.s(this.f16839i, kVar.f16839i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16831a, this.f16832b, this.f16833c, this.f16834d, this.f16835e, this.f16836f, this.f16837g, this.f16838h, this.f16839i});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16831a != null) {
            aVar.u("name");
            aVar.K(this.f16831a);
        }
        if (this.f16832b != null) {
            aVar.u("id");
            aVar.J(this.f16832b);
        }
        if (this.f16833c != null) {
            aVar.u("vendor_id");
            aVar.K(this.f16833c);
        }
        if (this.f16834d != null) {
            aVar.u("vendor_name");
            aVar.K(this.f16834d);
        }
        if (this.f16835e != null) {
            aVar.u("memory_size");
            aVar.J(this.f16835e);
        }
        if (this.f16836f != null) {
            aVar.u("api_type");
            aVar.K(this.f16836f);
        }
        if (this.f16837g != null) {
            aVar.u("multi_threaded_rendering");
            aVar.I(this.f16837g);
        }
        if (this.f16838h != null) {
            aVar.u("version");
            aVar.K(this.f16838h);
        }
        if (this.f16839i != null) {
            aVar.u("npot_support");
            aVar.K(this.f16839i);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.j, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
