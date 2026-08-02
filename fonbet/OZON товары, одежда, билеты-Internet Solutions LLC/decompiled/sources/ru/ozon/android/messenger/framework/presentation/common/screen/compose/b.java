package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f91056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar) {
        super(2);
        this.f91056b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f91056b.t(interfaceC3967k2);
        }
        return Unit.f71690a;
    }
}
