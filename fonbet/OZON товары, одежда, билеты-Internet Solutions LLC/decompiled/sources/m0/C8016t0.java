package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: m0.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8016t0 extends AbstractC7737t implements Function1<C8000l<Object, Object>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f73866b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ U0<Object, Object> f73867c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8016t0(Function2<Object, Object, Unit> function2, U0<Object, Object> u02) {
        super(1);
        this.f73866b = (AbstractC7737t) function2;
        this.f73867c = u02;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C8000l<Object, Object> c8000l) {
        C8000l<Object, Object> c8000l2 = c8000l;
        this.f73866b.invoke(c8000l2.e(), ((V0) this.f73867c).b().invoke(c8000l2.g()));
        return Unit.f71690a;
    }
}
