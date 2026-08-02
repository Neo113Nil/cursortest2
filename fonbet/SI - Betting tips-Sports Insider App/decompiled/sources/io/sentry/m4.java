package io.sentry;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m4 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f16641a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.protocol.t f16642b;

    /* renamed from: c, reason: collision with root package name */
    public final t6 f16643c;

    /* renamed from: d, reason: collision with root package name */
    public Date f16644d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f16645e;

    public m4(io.sentry.protocol.v vVar, io.sentry.protocol.t tVar, t6 t6Var) {
        this.f16641a = vVar;
        this.f16642b = tVar;
        this.f16643c = t6Var;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        io.sentry.protocol.v vVar = this.f16641a;
        if (vVar != null) {
            aVar.u("event_id");
            aVar.H(iLogger, vVar);
        }
        io.sentry.protocol.t tVar = this.f16642b;
        if (tVar != null) {
            aVar.u("sdk");
            aVar.H(iLogger, tVar);
        }
        t6 t6Var = this.f16643c;
        if (t6Var != null) {
            aVar.u("trace");
            aVar.H(iLogger, t6Var);
        }
        if (this.f16644d != null) {
            aVar.u("sent_at");
            aVar.H(iLogger, com.google.android.play.core.appupdate.b.u(this.f16644d));
        }
        HashMap hashMap = this.f16645e;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16645e, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
