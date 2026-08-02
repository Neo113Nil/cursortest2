package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements InterfaceC6511n<ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o>, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87041b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f87042c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f87043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2, ru.ozon.android.messenger.framework.navigation.controller.a aVar3) {
        super(3);
        this.f87041b = aVar;
        this.f87042c = aVar2;
        this.f87043d = aVar3;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
        ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> content = iVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(content, "$this$content");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(content) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            t.a(null, a1.c.c(-1590581991, new l(content, this.f87041b, this.f87042c, this.f87043d), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
