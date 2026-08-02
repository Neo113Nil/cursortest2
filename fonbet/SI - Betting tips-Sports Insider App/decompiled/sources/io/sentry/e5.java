package io.sentry;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e5 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f16381a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f16382b;

    public e5(List list) {
        this.f16381a = list;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("items");
        aVar.H(iLogger, this.f16381a);
        HashMap hashMap = this.f16382b;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16382b, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
