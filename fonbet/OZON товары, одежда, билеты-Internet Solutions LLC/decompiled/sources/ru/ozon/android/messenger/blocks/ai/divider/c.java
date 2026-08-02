package ru.ozon.android.messenger.blocks.ai.divider;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84097b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f84098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(androidx.compose.ui.e eVar, b bVar) {
        super(2);
        this.f84097b = eVar;
        this.f84098c = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a(this.f84097b, this.f84098c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
