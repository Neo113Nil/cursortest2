package wg0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import wg0.InterfaceC10555b;

/* renamed from: wg0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10558e extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<InterfaceC10555b, Unit> f104531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C10558e(Function1<? super InterfaceC10555b, Unit> function1) {
        super(0);
        this.f104531b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f104531b.invoke(InterfaceC10555b.a.f104509a);
        return Unit.f71690a;
    }
}
