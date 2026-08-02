package r0;

import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: r0.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9136p extends AbstractC7737t implements Function1<Float, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f82635b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9136p(InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f82635b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f7) {
        ((Function1) this.f82635b.getValue()).invoke(Float.valueOf(f7.floatValue()));
        return Unit.f71690a;
    }
}
