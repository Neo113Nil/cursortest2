package ru.ozon.app.android.pdp.widgets.selectCrossSale.presentation;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import u0.C9915y;
import u0.InterfaceC9894c;
import v0.C10164d;
import v0.I;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "", "invoke", "(Lu0/c;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class SelectCrossSaleWidgetKt$SelectCrossSaleContent$1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9894c, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ C7807Z $backgroundColor;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ SelectCrossSaleVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SelectCrossSaleWidgetKt$SelectCrossSaleContent$1(float f7, SelectCrossSaleVI selectCrossSaleVI, Function1<? super AtomAction, Unit> function1, C7807Z c7807z) {
        super(3);
        this.$horizontalPadding = f7;
        this.$state = selectCrossSaleVI;
        this.$actionHandler = function1;
        this.$backgroundColor = c7807z;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9894c interfaceC9894c, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9894c, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r5 = androidx.compose.foundation.e.b(r4, r5.w(), l1.y0.a());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(InterfaceC9894c BoxWithConstraints, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3967k.n(BoxWithConstraints) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e a11 = Q1.a(e.f40358c0, "horizontalContainer");
        C7807Z c7807z = this.$backgroundColor;
        if (c7807z != null && b11 != null) {
            a11 = b11;
        }
        C9915y a12 = T.a(this.$horizontalPadding, 2, 0.0f);
        int i13 = C5179b.f39454h;
        C5179b.i n11 = C5179b.n(Paddings.PADDING_200.m1867getDpD9Ej5fM());
        I scrollState = this.$state.getScrollState();
        interfaceC3967k.o(-1275629336);
        boolean F11 = ((i12 & 14) == 4) | interfaceC3967k.F(this.$state) | interfaceC3967k.n(this.$actionHandler);
        SelectCrossSaleVI selectCrossSaleVI = this.$state;
        float f7 = this.$horizontalPadding;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new SelectCrossSaleWidgetKt$SelectCrossSaleContent$1$2$1(selectCrossSaleVI, BoxWithConstraints, f7, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        C10164d.b(a11, scrollState, a12, n11, null, null, false, (Function1) C11, interfaceC3967k, 384, 232);
    }
}
