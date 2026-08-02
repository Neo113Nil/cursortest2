package y10;

import H00.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class f extends AbstractC7737t implements Function1<Throwable, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final f f105920b = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        Throwable throwable = th2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (H00.b.a() != b.a.C0214a.a()) {
            H00.b.a().logError(throwable);
        }
        return Unit.f71690a;
    }
}
