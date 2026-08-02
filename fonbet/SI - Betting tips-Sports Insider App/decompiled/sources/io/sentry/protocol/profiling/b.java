package io.sentry.protocol.profiling;

import d9.e;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public double f16892a;

    /* renamed from: b, reason: collision with root package name */
    public int f16893b;

    /* renamed from: c, reason: collision with root package name */
    public String f16894c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f16895d;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("timestamp");
        aVar.H(iLogger, BigDecimal.valueOf(this.f16892a).setScale(6, RoundingMode.DOWN));
        aVar.u("stack_id");
        aVar.H(iLogger, Integer.valueOf(this.f16893b));
        if (this.f16894c != null) {
            aVar.u("thread_id");
            aVar.H(iLogger, this.f16894c);
        }
        HashMap hashMap = this.f16895d;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                e.u(this.f16895d, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
