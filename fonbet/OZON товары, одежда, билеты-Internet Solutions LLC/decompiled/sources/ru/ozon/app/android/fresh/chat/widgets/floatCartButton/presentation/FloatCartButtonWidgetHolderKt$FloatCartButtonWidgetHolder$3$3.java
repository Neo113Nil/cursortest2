package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import WZ.l;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import l1.C7807Z;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll0/H;", "", "invoke", "(Ll0/H;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$3 extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ FloatCartButtonVO $item;
    final /* synthetic */ InterfaceC3978p0<TextDTO> $textAtom$delegate;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$3(FloatCartButtonVO floatCartButtonVO, Function1<? super AtomAction, Unit> function1, l lVar, InterfaceC3978p0<TextDTO> interfaceC3978p0) {
        super(3);
        this.$item = floatCartButtonVO;
        this.$actionHandler = function1;
        this.$tokenizedAnalytics = lVar;
        this.$textAtom$delegate = interfaceC3978p0;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(h11, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(H AnimatedVisibility, InterfaceC3967k interfaceC3967k, int i11) {
        TextDTO FloatCartButtonWidgetHolder_FJfuzF0$lambda$2;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        IconDTO icon = this.$item.getIcon();
        FloatCartButtonWidgetHolder_FJfuzF0$lambda$2 = FloatCartButtonWidgetHolderKt.FloatCartButtonWidgetHolder_FJfuzF0$lambda$2(this.$textAtom$delegate);
        C7807Z c7807z = TokenParserKt.tokenToColor(this.$item.getBackgroundColor(), interfaceC3967k, 0);
        interfaceC3967k.o(-2119794048);
        long bgPositivePrimary = c7807z == null ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getBgPositivePrimary() : c7807z.w();
        interfaceC3967k.k();
        interfaceC3967k.o(-2119790764);
        boolean F11 = interfaceC3967k.F(this.$item) | interfaceC3967k.n(this.$actionHandler) | interfaceC3967k.F(this.$tokenizedAnalytics);
        FloatCartButtonVO floatCartButtonVO = this.$item;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        l lVar = this.$tokenizedAnalytics;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$3$1$1(floatCartButtonVO, function1, lVar);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        FloatCartButtonKt.m708FloatCartButton2FlEJow(null, icon, FloatCartButtonWidgetHolder_FJfuzF0$lambda$2, bgPositivePrimary, 0.0f, 0.0f, 0.0f, 0.0f, (Function0) C11, interfaceC3967k, IconDTO.$stable << 3, 241);
    }
}
