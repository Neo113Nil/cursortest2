package ru.ozon.composer.compose.widget.scrollable;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.scrollable.c;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c.a f94733b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l10.i f94734c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.ui.widget.l f94735d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l20.c f94736e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f94737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(c.a aVar, l10.i iVar, ru.ozon.composer.ui.widget.l lVar, l20.c cVar, int i11) {
        super(2);
        this.f94733b = aVar;
        this.f94734c = iVar;
        this.f94735d = lVar;
        this.f94736e = cVar;
        this.f94737f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC6512o<ru.ozon.composer.compose.widget.i<I>, g.a, InterfaceC3967k, Integer, Unit> h11 = this.f94733b.h();
            ru.ozon.composer.ui.widget.l lVar = this.f94735d;
            ru.ozon.composer.compose.widget.i c11 = ru.ozon.composer.compose.widget.j.c(this.f94734c, lVar, this.f94736e, interfaceC3967k2, 0);
            interfaceC3967k2.o(1819250786);
            boolean n11 = interfaceC3967k2.n(lVar);
            int i11 = this.f94737f;
            boolean r11 = n11 | interfaceC3967k2.r(i11);
            Object C11 = interfaceC3967k2.C();
            if (r11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new g.a(i11);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            h11.invoke(c11, (g.a) C11, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
