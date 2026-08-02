package m0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class A0 extends AbstractC7737t implements Function1<Long, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f73464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    A0(Function1<? super Long, Object> function1) {
        super(1);
        this.f73464b = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Long l11) {
        return this.f73464b.invoke(Long.valueOf(l11.longValue()));
    }
}
