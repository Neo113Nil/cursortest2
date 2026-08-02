package ru.ozon.app.android.pdp.widgets.tabs.compose;

import S0.InterfaceC3967k;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.m;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.y0;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import u0.C9915y;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class PdpTabsComposableKt$PdpTabsContent$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ PdpTabsVO $item;
    final /* synthetic */ Function1<PdpTabsVO.Tab, Unit> $onTabClick;
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ I $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PdpTabsComposableKt$PdpTabsContent$2(PdpTabsVO pdpTabsVO, I i11, Function1<? super PdpTabsVO.Tab, Unit> function1, Function1<? super t, Unit> function12) {
        super(2);
        this.$item = pdpTabsVO;
        this.$scrollState = i11;
        this.$onTabClick = function1;
        this.$onView = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e e11 = a0.e(a0.f(e.f40358c0, this.$item.getContainerHeight()), 1.0f);
        C7807Z parseColorToken = TokenParserKt.parseColorToken(this.$item.getBackgroundColor(), interfaceC3967k, 0);
        b11 = androidx.compose.foundation.e.b(e11, parseColorToken != null ? parseColorToken.w() : C7807Z.f72259m, y0.a());
        C9915y a11 = T.a(16, 2, 0.0f);
        C5179b.i n11 = C5179b.n(8);
        d.b i12 = InterfaceC6250b.a.i();
        I i13 = this.$scrollState;
        interfaceC3967k.o(1218190269);
        boolean F11 = interfaceC3967k.F(this.$item) | interfaceC3967k.n(this.$onTabClick) | interfaceC3967k.n(this.$onView);
        PdpTabsVO pdpTabsVO = this.$item;
        Function1<PdpTabsVO.Tab, Unit> function1 = this.$onTabClick;
        Function1<t, Unit> function12 = this.$onView;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new PdpTabsComposableKt$PdpTabsContent$2$1$1(pdpTabsVO, function1, function12);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        C10164d.b(b11, i13, a11, n11, i12, null, false, (Function1) C11, interfaceC3967k, 221568, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
    }
}
