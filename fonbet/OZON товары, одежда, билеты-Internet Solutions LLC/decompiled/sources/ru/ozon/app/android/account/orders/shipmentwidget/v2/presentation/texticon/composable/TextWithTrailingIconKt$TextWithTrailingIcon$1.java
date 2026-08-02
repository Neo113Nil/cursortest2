package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable;

import K1.C3422b;
import K1.K;
import K1.M;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import u0.InterfaceC9894c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "", "invoke", "(Lu0/c;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class TextWithTrailingIconKt$TextWithTrailingIcon$1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9894c, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ TextDTO $dto;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ float $iconSizePx;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ M $measurer;
    final /* synthetic */ PikazonImagePainter $painter;
    final /* synthetic */ int $realTextEnd;
    final /* synthetic */ C3422b $spacerText;
    final /* synthetic */ T $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextWithTrailingIconKt$TextWithTrailingIcon$1(C3422b c3422b, T t2, int i11, int i12, float f7, TextDTO textDTO, PikazonImagePainter pikazonImagePainter, long j11, M m11) {
        super(3);
        this.$spacerText = c3422b;
        this.$textStyle = t2;
        this.$maxLines = i11;
        this.$realTextEnd = i12;
        this.$iconSizePx = f7;
        this.$dto = textDTO;
        this.$painter = pikazonImagePainter;
        this.$iconColor = j11;
        this.$measurer = m11;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9894c interfaceC9894c, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9894c, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9894c BoxWithConstraints, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k.n(BoxWithConstraints) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        long c11 = BoxWithConstraints.c();
        interfaceC3967k.o(887734474);
        boolean n11 = interfaceC3967k.n(this.$spacerText) | interfaceC3967k.n(this.$textStyle) | interfaceC3967k.s(c11) | interfaceC3967k.r(this.$maxLines);
        M m11 = this.$measurer;
        C3422b c3422b = this.$spacerText;
        T t2 = this.$textStyle;
        int i13 = this.$maxLines;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = M.b(m11, c3422b, t2, 3, false, i13, c11, null, null, null, 1960);
            interfaceC3967k.x(C11);
        }
        K k11 = (K) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(887745152);
        boolean n12 = interfaceC3967k.n(k11) | interfaceC3967k.r(this.$realTextEnd) | interfaceC3967k.q(this.$iconSizePx);
        int i14 = this.$realTextEnd;
        float f7 = this.$iconSizePx;
        Object C12 = interfaceC3967k.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            C12 = TextWithTrailingIconKt.resolveIconSpot(k11, i14, f7);
            interfaceC3967k.x(C12);
        }
        IconSpot iconSpot = (IconSpot) C12;
        interfaceC3967k.k();
        TextDTO copy$default = TextDTO.copy$default(this.$dto, OzonSpannableStringKt.toOzonSpannableString(this.$spacerText), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        e.a aVar = e.f40358c0;
        interfaceC3967k.o(887753887);
        boolean n13 = interfaceC3967k.n(iconSpot) | interfaceC3967k.n(this.$painter) | interfaceC3967k.q(this.$iconSizePx) | interfaceC3967k.s(this.$iconColor);
        PikazonImagePainter pikazonImagePainter = this.$painter;
        float f11 = this.$iconSizePx;
        long j11 = this.$iconColor;
        Object C13 = interfaceC3967k.C();
        if (n13 || C13 == InterfaceC3967k.a.a()) {
            Object textWithTrailingIconKt$TextWithTrailingIcon$1$1$1 = new TextWithTrailingIconKt$TextWithTrailingIcon$1$1$1(iconSpot, pikazonImagePainter, f11, j11);
            interfaceC3967k.x(textWithTrailingIconKt$TextWithTrailingIcon$1$1$1);
            C13 = textWithTrailingIconKt$TextWithTrailingIcon$1$1$1;
        }
        interfaceC3967k.k();
        MonospaceDsTextAtomKt.MonospaceDsTextAtom(copy$default, c.d(aVar, (Function1) C13), interfaceC3967k, 0, 0);
    }
}
