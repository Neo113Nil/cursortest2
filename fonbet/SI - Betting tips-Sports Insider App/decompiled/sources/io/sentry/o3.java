package io.sentry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o3 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public Integer f16684a;

    /* renamed from: b, reason: collision with root package name */
    public List f16685b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f16686c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o3.class == obj.getClass()) {
            o3 o3Var = (o3) obj;
            if (y4.a.s(this.f16684a, o3Var.f16684a) && y4.a.s(this.f16685b, o3Var.f16685b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16684a, this.f16685b});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) aVar.f19314b;
        if (this.f16684a != null) {
            aVar.u("segment_id");
            aVar.J(this.f16684a);
        }
        HashMap hashMap = this.f16686c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16686c, str, aVar, str, iLogger);
            }
        }
        aVar.o();
        cVar.f17223f = true;
        if (this.f16684a != null) {
            cVar.y();
            cVar.c();
            cVar.f17218a.append((CharSequence) "\n");
        }
        List list = this.f16685b;
        if (list != null) {
            aVar.H(iLogger, list);
        }
        cVar.f17223f = false;
    }
}
