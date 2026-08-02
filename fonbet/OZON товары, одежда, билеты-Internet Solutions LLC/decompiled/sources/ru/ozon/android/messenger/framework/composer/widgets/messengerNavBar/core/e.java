package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> f86998b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> iVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar) {
        super(2);
        this.f86998b = iVar;
        this.f86999c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.d.a(this.f86998b.b(), this.f86999c, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
