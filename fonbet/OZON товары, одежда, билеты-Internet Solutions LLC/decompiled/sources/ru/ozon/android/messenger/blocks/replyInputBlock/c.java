package ru.ozon.android.messenger.blocks.replyInputBlock;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f86342b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86343c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f86342b = eVar;
        this.f86343c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            t.a(null, a1.c.c(2113886871, new b(this.f86342b, this.f86343c), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
