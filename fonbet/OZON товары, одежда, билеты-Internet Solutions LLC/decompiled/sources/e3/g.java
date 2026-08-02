package e3;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l20.c f61896b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ J f61897c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<o, n> f61898d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f61899e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f61900f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(l20.c cVar, J j11, Function1 function1, int i11, int i12) {
        super(2);
        this.f61896b = cVar;
        this.f61897c = j11;
        this.f61898d = function1;
        this.f61899e = i11;
        this.f61900f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f61899e | 1);
        l20.c cVar = this.f61896b;
        i.b(cVar, this.f61897c, this.f61898d, interfaceC3967k, e11, this.f61900f);
        return Unit.f71690a;
    }
}
