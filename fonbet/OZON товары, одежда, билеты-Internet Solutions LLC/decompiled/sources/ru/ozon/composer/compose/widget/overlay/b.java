package ru.ozon.composer.compose.widget.overlay;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.composer.compose.widget.j;
import ru.ozon.composer.compose.widget.overlay.c;
import ru.ozon.composer.ui.widget.l;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c.a f94655b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f94656c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l f94657d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l20.c f94658e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(i iVar, l20.c cVar, c.a aVar, l lVar) {
        super(2);
        this.f94655b = aVar;
        this.f94656c = iVar;
        this.f94657d = lVar;
        this.f94658e = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f94655b.b().invoke(j.c(this.f94656c, this.f94657d, this.f94658e, interfaceC3967k2, 0), interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
