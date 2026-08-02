package e3;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l20.c f61923b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J f61924c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<p, q> f61925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l20.c cVar, J j11, Function1 function1, int i11) {
        super(2);
        this.f61923b = cVar;
        this.f61924c = j11;
        this.f61925d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        Function1<p, q> function1 = this.f61925d;
        i.d(this.f61923b, this.f61924c, function1, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
