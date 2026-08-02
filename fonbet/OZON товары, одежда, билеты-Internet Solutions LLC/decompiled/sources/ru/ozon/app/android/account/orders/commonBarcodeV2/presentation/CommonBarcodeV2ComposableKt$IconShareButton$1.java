package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.app.android.account.orders.commonBarcodeV2.presentation.BarcodeShareButton;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CommonBarcodeV2ComposableKt$IconShareButton$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ CornerCutoutPieceShape $cutoutShape;
    final /* synthetic */ BarcodeShareButton.IconButton $iconShareButton;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonBarcodeV2ComposableKt$IconShareButton$1(e eVar, long j11, CornerCutoutPieceShape cornerCutoutPieceShape, BarcodeShareButton.IconButton iconButton, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$modifier = eVar;
        this.$backgroundColor = j11;
        this.$cutoutShape = cornerCutoutPieceShape;
        this.$iconShareButton = iconButton;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        e b11 = androidx.compose.foundation.e.b(this.$modifier, this.$backgroundColor, this.$cutoutShape);
        interfaceC3967k.o(1670512788);
        boolean F11 = interfaceC3967k.F(this.$iconShareButton) | interfaceC3967k.n(this.$onAction);
        BarcodeShareButton.IconButton iconButton = this.$iconShareButton;
        Function1<AtomAction, Unit> function1 = this.$onAction;
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new CommonBarcodeV2ComposableKt$IconShareButton$1$1$1(iconButton, function1);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e j11 = T.j(i.b(b11, null, null, false, null, null, (Function0) C11, 28), this.$iconShareButton.getContentPadding(), 0.0f, 8, this.$iconShareButton.getContentPadding(), 2);
        BarcodeShareButton.IconButton iconButton2 = this.$iconShareButton;
        Function1<AtomAction, Unit> function12 = this.$onAction;
        V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
        int I11 = interfaceC3967k.I();
        A0 d11 = interfaceC3967k.d();
        e f11 = c.f(interfaceC3967k, j11);
        InterfaceC2801g.f5440U.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        if (interfaceC3967k.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k.i();
        if (interfaceC3967k.t()) {
            interfaceC3967k.H(a11);
        } else {
            interfaceC3967k.e();
        }
        Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
        if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
            a.d(d12, I11, interfaceC3967k, I11);
        }
        F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
        DsIconButtonAtomKt.DsIconButtonAtom(iconButton2.getIconButton(), null, false, function12, interfaceC3967k, IconButtonV3DTO.$stable, 6);
        interfaceC3967k.f();
    }
}
