package ru.ozon.android.messenger.blocks.ai.header;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.header.presentation.a f84113b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f84114c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar, g gVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f84113b = aVar;
        this.f84114c = gVar;
        this.f84115d = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            t.a(null, a1.c.c(-264448565, new e(this.f84113b, this.f84114c, this.f84115d), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
