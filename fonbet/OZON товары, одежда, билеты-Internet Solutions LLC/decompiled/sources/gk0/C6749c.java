package gk0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.B0;

/* renamed from: gk0.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6749c extends AbstractC7737t implements Function1<B0, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f64503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6749c(String str) {
        super(1);
        this.f64503b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(B0 b02) {
        B0 job = b02;
        Intrinsics.checkNotNullParameter(job, "job");
        m mVar = (m) job.get(m.f64547c);
        return Boolean.valueOf(Intrinsics.d(mVar != null ? mVar.q() : null, this.f64503b));
    }
}
