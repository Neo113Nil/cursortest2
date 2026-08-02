package y20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f105965b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f105966c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(boolean z11, C4912a c4912a, int i11) {
        super(2);
        this.f105965b = z11;
        this.f105966c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(49);
        C4912a c4912a = this.f105966c;
        f.b(this.f105965b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
