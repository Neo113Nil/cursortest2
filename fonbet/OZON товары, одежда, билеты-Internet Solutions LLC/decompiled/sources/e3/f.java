package e3;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v.a f61892b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J f61893c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f61894d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f61895e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(AbstractC5434v.a aVar, J j11, Function0 function0, int i11) {
        super(2);
        this.f61892b = aVar;
        this.f61893c = j11;
        this.f61894d = function0;
        this.f61895e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f61895e | 1);
        Function0<Unit> function0 = this.f61894d;
        i.a(this.f61892b, this.f61893c, function0, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
