package ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.core;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.uni.core.repository.UniThemeKt;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements InterfaceC6512o<ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d>, g.a, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f86951b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.domain.repository.a f86952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, ru.ozon.android.messenger.framework.domain.repository.a aVar2) {
        super(4);
        this.f86951b = aVar;
        this.f86952c = aVar2;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
        ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.fastAnswersList.presentation.d> content = iVar;
        g.a it = aVar;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        Intrinsics.checkNotNullParameter(content, "$this$content");
        Intrinsics.checkNotNullParameter(it, "it");
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(content) ? 4 : 2;
        }
        if ((intValue & 131) == 130 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            UniThemeKt.UniTheme(false, a1.c.c(-570791016, new f(content, this.f86951b, this.f86952c), interfaceC3967k2), interfaceC3967k2, 48, 1);
        }
        return Unit.f71690a;
    }
}
