package u00;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f99709b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f99710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, int i11) {
        super(2);
        this.f99709b = lVar;
        this.f99710c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f99710c | 1);
        l.x(this.f99709b, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
