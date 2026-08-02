package ru.ozon.app.android.monetization.widgets.skuListCopy.core.compose;

import S0.InterfaceC3967k;
import WZ.l;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.SkuListCopyTrackingVI;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/skuListCopy/presentation/SkuListCopyTrackingVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.monetization.widgets.skuListCopy.core.compose.ComposableSingletons$SkuListCopyWidgetKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes12.dex */
final class ComposableSingletons$SkuListCopyWidgetKt$lambda1$1 extends AbstractC7737t implements InterfaceC6511n<i<SkuListCopyTrackingVI>, InterfaceC3967k, Integer, Unit> {
    public static final ComposableSingletons$SkuListCopyWidgetKt$lambda1$1 INSTANCE = new ComposableSingletons$SkuListCopyWidgetKt$lambda1$1();

    ComposableSingletons$SkuListCopyWidgetKt$lambda1$1() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(i<SkuListCopyTrackingVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(iVar, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(i<SkuListCopyTrackingVI> content, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(content, "$this$content");
        if ((i11 & 6) == 0) {
            i11 |= interfaceC3967k.n(content) ? 4 : 2;
        }
        if ((i11 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        l lVar = (l) interfaceC3967k.m(f.e());
        if (content.b().getTokenizedEvent() != null) {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            interfaceC3967k.o(1719971109);
            boolean F11 = ((i11 & 14) == 4) | interfaceC3967k.F(lVar);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ComposableSingletons$SkuListCopyWidgetKt$lambda1$1$1$1(lVar, content);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            e3.i.a(aVar, null, (Function0) C11, interfaceC3967k, 6);
        }
    }
}
