package ru.ozon.android.messenger.blocks.messagetext.compose;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.models.p;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f85828b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85829c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f85830d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.messagetext.f f85831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(p pVar, ru.ozon.android.messenger.framework.core.d dVar, androidx.compose.ui.e eVar, ru.ozon.android.messenger.blocks.messagetext.f fVar) {
        super(2);
        this.f85828b = pVar;
        this.f85829c = dVar;
        this.f85830d = eVar;
        this.f85831e = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            interfaceC3967k2.o(-302373872);
            p pVar = this.f85828b;
            boolean n11 = interfaceC3967k2.n(pVar);
            ru.ozon.android.messenger.framework.core.d dVar = this.f85829c;
            boolean F11 = n11 | interfaceC3967k2.F(dVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(pVar, dVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            e3.i.a(aVar, null, (Function0) C11, interfaceC3967k2, 6);
            ru.ozon.android.messenger.framework.presentation.common.compose.b.a(T.g(this.f85830d, 12, 10), a1.c.c(-583749689, new c(this.f85831e, dVar, pVar), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
