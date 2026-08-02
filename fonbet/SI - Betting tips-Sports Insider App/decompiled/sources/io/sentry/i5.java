package io.sentry;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i5 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f16489a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f16490b;

    public i5(List list) {
        this.f16489a = list;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("items");
        aVar.H(iLogger, this.f16489a);
        HashMap hashMap = this.f16490b;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16490b, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
