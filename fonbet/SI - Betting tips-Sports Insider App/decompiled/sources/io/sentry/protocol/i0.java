package io.sentry.protocol;

import com.sports.insider.data.room.general.table.AccountTable;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16816a;

    /* renamed from: b, reason: collision with root package name */
    public String f16817b;

    /* renamed from: c, reason: collision with root package name */
    public String f16818c;

    /* renamed from: d, reason: collision with root package name */
    public String f16819d;

    /* renamed from: e, reason: collision with root package name */
    public String f16820e;

    /* renamed from: f, reason: collision with root package name */
    public j f16821f;

    /* renamed from: g, reason: collision with root package name */
    public ConcurrentHashMap f16822g;

    /* renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap f16823h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (y4.a.s(this.f16816a, i0Var.f16816a) && y4.a.s(this.f16817b, i0Var.f16817b) && y4.a.s(this.f16818c, i0Var.f16818c) && y4.a.s(this.f16819d, i0Var.f16819d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16816a, this.f16817b, this.f16818c, this.f16819d});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16816a != null) {
            aVar.u(AccountTable.emailColumn);
            aVar.K(this.f16816a);
        }
        if (this.f16817b != null) {
            aVar.u("id");
            aVar.K(this.f16817b);
        }
        if (this.f16818c != null) {
            aVar.u("username");
            aVar.K(this.f16818c);
        }
        if (this.f16819d != null) {
            aVar.u("ip_address");
            aVar.K(this.f16819d);
        }
        if (this.f16820e != null) {
            aVar.u("name");
            aVar.K(this.f16820e);
        }
        if (this.f16821f != null) {
            aVar.u("geo");
            this.f16821f.serialize(aVar, iLogger);
        }
        if (this.f16822g != null) {
            aVar.u("data");
            aVar.H(iLogger, this.f16822g);
        }
        ConcurrentHashMap concurrentHashMap = this.f16823h;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16823h, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
