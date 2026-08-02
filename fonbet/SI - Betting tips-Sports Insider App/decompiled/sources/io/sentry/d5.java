package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d5 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f16313a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f16314b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16315c;

    /* renamed from: d, reason: collision with root package name */
    public final f5 f16316d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f16317e;

    /* renamed from: f, reason: collision with root package name */
    public Map f16318f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f16319g;

    public d5(io.sentry.protocol.v vVar, Double d10, String str, f5 f5Var) {
        this.f16313a = vVar;
        this.f16314b = d10;
        this.f16315c = str;
        this.f16316d = f5Var;
    }

    public final void a(String str, io.sentry.protocol.l lVar) {
        if (this.f16318f == null) {
            this.f16318f = new HashMap();
        }
        this.f16318f.put(str, lVar);
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("timestamp");
        aVar.H(iLogger, com.google.android.play.core.appupdate.b.k(this.f16314b));
        aVar.u("trace_id");
        aVar.H(iLogger, this.f16313a);
        aVar.u("body");
        aVar.K(this.f16315c);
        aVar.u("level");
        aVar.H(iLogger, this.f16316d);
        if (this.f16317e != null) {
            aVar.u("severity_number");
            aVar.H(iLogger, this.f16317e);
        }
        if (this.f16318f != null) {
            aVar.u("attributes");
            aVar.H(iLogger, this.f16318f);
        }
        HashMap hashMap = this.f16319g;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16319g, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
