package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.viewItem.SeparatorVO;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/separator/viewItem/SeparatorVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers.ComposableSingletons$SeparatorViewMapperKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes11.dex */
final class ComposableSingletons$SeparatorViewMapperKt$lambda1$1 extends AbstractC7737t implements InterfaceC6512o<i<SeparatorVO>, g.a, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$SeparatorViewMapperKt$lambda1$1 INSTANCE = new ComposableSingletons$SeparatorViewMapperKt$lambda1$1();

    ComposableSingletons$SeparatorViewMapperKt$lambda1$1() {
        super(4);
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(i<SeparatorVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(iVar, aVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(i<SeparatorVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Intrinsics.checkNotNullParameter(content, "$this$content");
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(content) ? 4 : 2;
        }
        if ((i11 & 131) == 130 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        SeparatorVO b12 = content.b();
        SeparatorVO separatorVO = b12 instanceof SeparatorVO ? b12 : null;
        String color = separatorVO != null ? separatorVO.getColor() : null;
        float f7 = 16;
        e f11 = a0.f(T.j(a0.e(e.f40358c0, 1.0f), f7, 12, f7, 0.0f, 8), (float) 0.5d);
        interfaceC3967k.o(106680141);
        C7807Z c7807z = color != null ? TokenParserKt.tokenToColor(color, interfaceC3967k, 0) : null;
        interfaceC3967k.k();
        interfaceC3967k.o(106679837);
        long graphicQuaternary = c7807z == null ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicQuaternary() : c7807z.w();
        interfaceC3967k.k();
        b11 = androidx.compose.foundation.e.b(f11, graphicQuaternary, y0.a());
        E.a(interfaceC3967k, b11);
    }
}
