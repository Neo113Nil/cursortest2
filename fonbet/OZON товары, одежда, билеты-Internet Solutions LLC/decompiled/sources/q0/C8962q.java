package q0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: q0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8962q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8950e f81345b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f81346c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f81347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8962q(C8950e c8950e, androidx.compose.ui.e eVar, C4912a c4912a, int i11) {
        super(2);
        this.f81345b = c8950e;
        this.f81346c = eVar;
        this.f81347d = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(385);
        androidx.compose.ui.e eVar = this.f81346c;
        C4912a c4912a = this.f81347d;
        C8969x.a(this.f81345b, eVar, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
