package ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation;

import J0.u3;
import K1.C3422b;
import S0.InterfaceC3967k;
import Tg.b;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import ru.ozon.app.android.regulardraw.ui.CustomBadgeAtomKt;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import u0.C9915y;
import u0.InterfaceC9904m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/m;", "", "invoke", "(Lu0/m;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class LotteryResultWidgetKt$LotteryResultWidgetContent$1$2$1$1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9904m, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ LotteryResultVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LotteryResultWidgetKt$LotteryResultWidgetContent$1$2$1$1(LotteryResultVI lotteryResultVI, Function1<? super b, Unit> function1) {
        super(3);
        this.$state = lotteryResultVI;
        this.$actionHandler = function1;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9904m interfaceC9904m, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9904m, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9904m FlowRow, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k.n(FlowRow) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e.a aVar = e.f40358c0;
        float f7 = 2;
        e b11 = FlowRow.b(T.j(aVar, 0.0f, 0.0f, 0.0f, f7, 7), InterfaceC6250b.a.i());
        C3422b m1836toAnnotateStringiJQMabo = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(this.$state.getTitle().getText(), 0L, interfaceC3967k, OzonSpannableString.$stable, 1);
        C7807Z c7807z = TokenParserKt.tokenToColor(this.$state.getTitle().getTextColor(), interfaceC3967k, 0);
        u3.c(m1836toAnnotateStringiJQMabo, b11, c7807z != null ? c7807z.w() : C7807Z.f72259m, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, this.$state.getValues() == null ? RegularDrawTypographyKt.getText_14_16_W500() : RegularDrawTypographyKt.getText_12_14_W500(), interfaceC3967k, 0, 0, 131064);
        if (this.$state.getWinStatusBadge() != null) {
            CustomBadgeAtomKt.m909CustomBadgeAtomPfoAEA0(this.$state.getWinStatusBadge(), FlowRow.b(aVar, InterfaceC6250b.a.i()), null, null, new C9915y(f7, (float) 1.5d, f7, (float) 0.5d), 0.0f, this.$actionHandler, interfaceC3967k, 0, 44);
        }
    }
}
