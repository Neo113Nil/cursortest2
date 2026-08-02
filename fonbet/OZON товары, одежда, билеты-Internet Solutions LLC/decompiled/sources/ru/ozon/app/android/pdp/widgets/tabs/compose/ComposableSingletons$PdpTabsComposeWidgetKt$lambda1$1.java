package ru.ozon.app.android.pdp.widgets.tabs.compose;

import S0.InterfaceC3967k;
import WZ.l;
import a00.h;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6617b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.InterfaceC7851b;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsViewModel;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/tabs/presentation/PdpTabsVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.ComposableSingletons$PdpTabsComposeWidgetKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes13.dex */
final class ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1 extends AbstractC7737t implements InterfaceC6512o<i<PdpTabsVO>, g.a, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1 INSTANCE = new ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1();

    ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1() {
        super(4);
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(i<PdpTabsVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(iVar, aVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(i<PdpTabsVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(content, "$this$content");
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(content) ? 4 : 2;
        }
        if ((i11 & 131) == 130 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        l lVar = (l) interfaceC3967k.m(f.e());
        InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
        PdpTabsVO b11 = content.b();
        B0 a11 = ((h) interfaceC3967k.m(f.f())).a();
        interfaceC3967k.B(1729797275);
        w0 a12 = C6617b.a(N.b(PdpTabsViewModel.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
        interfaceC3967k.K();
        PdpTabsViewModel pdpTabsViewModel = (PdpTabsViewModel) a12;
        interfaceC3967k.o(-1479273370);
        boolean F11 = interfaceC3967k.F(lVar);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1$1$1(lVar);
            interfaceC3967k.x(C11);
        }
        Function1 function1 = (Function1) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1479270456);
        boolean F12 = interfaceC3967k.F(lVar) | interfaceC3967k.F(interfaceC7851b);
        Object C12 = interfaceC3967k.C();
        if (F12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1$2$1(lVar, interfaceC7851b);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        PdpTabsComposableKt.PdpTabsComposable(b11, pdpTabsViewModel, function1, (Function1) C12, interfaceC3967k, 0, 0);
    }
}
