package ru.ozon.android.messenger.blocks.travelOrders;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f86544b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f86545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(p pVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f86544b = pVar;
        this.f86545c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            n.a(this.f86544b, this.f86545c.c(), null, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
