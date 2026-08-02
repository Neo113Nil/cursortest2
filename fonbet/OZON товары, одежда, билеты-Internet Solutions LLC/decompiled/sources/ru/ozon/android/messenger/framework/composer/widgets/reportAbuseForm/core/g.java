package ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.core;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.t;
import ru.ozon.composer.compose.widget.g;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements InterfaceC6512o<ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o>, g.a, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.analytics.i f87032b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(ru.ozon.android.messenger.framework.analytics.i iVar) {
        super(4);
        this.f87032b = iVar;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
        ru.ozon.composer.compose.widget.i<ru.ozon.android.messenger.framework.composer.widgets.reportAbuseForm.presentation.o> content = iVar;
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
            t.a(null, a1.c.c(-1305858963, new f(content, this.f87032b), interfaceC3967k2), interfaceC3967k2, 48);
        }
        return Unit.f71690a;
    }
}
