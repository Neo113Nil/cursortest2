package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: m0.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7995i0 extends AbstractC7737t implements Function1<Long, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7989f0<Object> f73784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7995i0(C7989f0<Object> c7989f0) {
        super(1);
        this.f73784b = c7989f0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l11) {
        ((C7989f0) this.f73784b).f73731l = l11.longValue();
        return Unit.f71690a;
    }
}
