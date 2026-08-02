package io.sentry.profilemeasurements;

import d9.e;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f16726a;

    /* renamed from: b, reason: collision with root package name */
    public String f16727b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f16728c;

    public a(String str, AbstractCollection abstractCollection) {
        this.f16727b = str;
        this.f16728c = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return y4.a.s(this.f16726a, aVar.f16726a) && this.f16727b.equals(aVar.f16727b) && new ArrayList(this.f16728c).equals(new ArrayList(aVar.f16728c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16726a, this.f16727b, this.f16728c});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("unit");
        aVar.H(iLogger, this.f16727b);
        aVar.u("values");
        aVar.H(iLogger, this.f16728c);
        ConcurrentHashMap concurrentHashMap = this.f16726a;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                e.v(this.f16726a, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
