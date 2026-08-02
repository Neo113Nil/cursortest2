package gk0;

import android.app.Activity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import xe.B0;

/* loaded from: classes7.dex */
final class f extends AbstractC7737t implements Function1<B0, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f64529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Activity activity) {
        super(1);
        this.f64529b = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(B0 b02) {
        B0 job = b02;
        Intrinsics.checkNotNullParameter(job, "job");
        m mVar = (m) job.get(m.f64547c);
        return Boolean.valueOf((mVar != null ? mVar.r() : null) == this.f64529b);
    }
}
