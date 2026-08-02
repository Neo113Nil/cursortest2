package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends b implements c2 {

    /* renamed from: c, reason: collision with root package name */
    public String f17023c;

    /* renamed from: d, reason: collision with root package name */
    public int f17024d;

    /* renamed from: e, reason: collision with root package name */
    public int f17025e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f17026f;

    public j() {
        super(c.Meta);
        this.f17023c = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f17024d == jVar.f17024d && this.f17025e == jVar.f17025e && y4.a.s(this.f17023c, jVar.f17023c);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f17023c, Integer.valueOf(this.f17024d), Integer.valueOf(this.f17025e)});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("type");
        aVar.H(iLogger, this.f17004a);
        aVar.u("timestamp");
        aVar.G(this.f17005b);
        aVar.u("data");
        aVar.j();
        aVar.u("href");
        aVar.K(this.f17023c);
        aVar.u("height");
        aVar.G(this.f17024d);
        aVar.u("width");
        aVar.G(this.f17025e);
        HashMap hashMap = this.f17026f;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f17026f, str, aVar, str, iLogger);
            }
        }
        aVar.o();
        aVar.o();
    }
}
