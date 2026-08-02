package ru.ozon.android.messenger.blocks.dangerousText;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f85010b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f85011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(e eVar, f fVar) {
        super(2);
        this.f85010b = eVar;
        this.f85011c = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            t.a(null, a1.c.c(290744358, new h(this.f85010b, this.f85011c), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
