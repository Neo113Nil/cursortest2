package io.sentry.android.replay.capture;

import io.sentry.android.replay.capture.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class r extends AbstractC7737t implements Function1<u.c.a, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f67526b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f67527c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ I f67528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(long j11, q qVar, I i11) {
        super(1);
        this.f67526b = j11;
        this.f67527c = qVar;
        this.f67528d = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(u.c.a aVar) {
        u.c.a it = aVar;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.c().e0().getTime() >= this.f67526b) {
            return Boolean.FALSE;
        }
        q qVar = this.f67527c;
        qVar.b(qVar.d() - 1);
        q.y(qVar, it.c().f0());
        this.f67528d.f71783a = true;
        return Boolean.TRUE;
    }
}
