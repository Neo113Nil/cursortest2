package y20;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f105969b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f105970c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f105971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar, C4912a c4912a, int i11) {
        super(2);
        this.f105969b = iVar;
        this.f105970c = c4912a;
        this.f105971d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f105971d | 1);
        C4912a c4912a = this.f105970c;
        f.a(this.f105969b, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
