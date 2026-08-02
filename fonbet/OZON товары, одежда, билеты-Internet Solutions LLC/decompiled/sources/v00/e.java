package v00;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f101611b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f101612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, int i11) {
        super(2);
        this.f101611b = fVar;
        this.f101612c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f101612c | 1);
        f.u(this.f101611b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
