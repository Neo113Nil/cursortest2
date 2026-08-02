package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends b implements c2 {

    /* renamed from: c, reason: collision with root package name */
    public String f17027c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f17028d;

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
        aVar.u("tag");
        aVar.K(this.f17027c);
        aVar.u("payload");
        aVar.j();
        HashMap hashMap = this.f17028d;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                Object obj = hashMap.get(str);
                aVar.u(str);
                aVar.H(iLogger, obj);
            }
        }
        aVar.o();
        aVar.o();
        aVar.o();
    }
}
