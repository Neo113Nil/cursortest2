package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.core;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.core.repository.UniThemeKt;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements InterfaceC6511n<ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e>, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(ru.ozon.android.messenger.framework.composer.navigation.router.a aVar) {
        super(3);
        this.f87000b = aVar;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
        ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.e> content = iVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(content, "$this$content");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(content) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            UniThemeKt.UniTheme(false, a1.c.c(-981994552, new e(content, this.f87000b), interfaceC3967k2), interfaceC3967k2, 48, 1);
        }
        return Unit.f71690a;
    }
}
