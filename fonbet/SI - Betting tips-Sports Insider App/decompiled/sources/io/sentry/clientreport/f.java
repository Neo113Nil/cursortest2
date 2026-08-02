package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16283a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16284b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f16285c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f16286d;

    public f(String str, String str2, Long l6) {
        this.f16283a = str;
        this.f16284b = str2;
        this.f16285c = l6;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("reason");
        aVar.K(this.f16283a);
        aVar.u("category");
        aVar.K(this.f16284b);
        aVar.u("quantity");
        aVar.J(this.f16285c);
        HashMap hashMap = this.f16286d;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f16286d, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f16283a + "', category='" + this.f16284b + "', quantity=" + this.f16285c + '}';
    }
}
