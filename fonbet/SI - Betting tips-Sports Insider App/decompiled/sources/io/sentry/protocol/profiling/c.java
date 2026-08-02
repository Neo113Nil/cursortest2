package io.sentry.protocol.profiling;

import d9.e;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16896a;

    /* renamed from: b, reason: collision with root package name */
    public int f16897b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f16898c;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16896a != null) {
            aVar.u("name");
            aVar.H(iLogger, this.f16896a);
        }
        aVar.u("priority");
        aVar.H(iLogger, Integer.valueOf(this.f16897b));
        HashMap hashMap = this.f16898c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                e.u(this.f16898c, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
