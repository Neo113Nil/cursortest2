package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import K1.T;
import Nk.a;
import Q1.X;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import t0.o;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "invoke", "(Lkotlin/jvm/functions/Function2;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DecorationBoxKt$DecorationBox$1 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ e $innerTextFieldModifier;
    final /* synthetic */ o $interactionSource;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ DsInputLabelPosition $labelPosition;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ String $value;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.android.ds.compose.component.input.inputCore.DecorationBoxKt$DecorationBox$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $innerTextField;
        final /* synthetic */ e $innerTextFieldModifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(e eVar, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
            super(2);
            this.$innerTextFieldModifier = eVar;
            this.$innerTextField = function2;
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
            e eVar = this.$innerTextFieldModifier;
            Function2<InterfaceC3967k, Integer, Unit> function2 = this.$innerTextField;
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k.I();
            A0 d11 = interfaceC3967k.d();
            e f11 = c.f(interfaceC3967k, eVar);
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
            function2.invoke(interfaceC3967k, 0);
            interfaceC3967k.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DecorationBoxKt$DecorationBox$1(String str, String str2, String str3, X x11, o oVar, DsInputLabelPosition dsInputLabelPosition, InterfaceC9914x interfaceC9914x, e eVar, long j11, T t2, e eVar2, long j12, T t11, e eVar3) {
        super(3);
        this.$label = str;
        this.$placeholder = str2;
        this.$value = str3;
        this.$visualTransformation = x11;
        this.$interactionSource = oVar;
        this.$labelPosition = dsInputLabelPosition;
        this.$contentPadding = interfaceC9914x;
        this.$labelModifier = eVar;
        this.$labelColor = j11;
        this.$labelTextStyle = t2;
        this.$placeholderModifier = eVar2;
        this.$placeholderColor = j12;
        this.$valueTextStyle = t11;
        this.$innerTextFieldModifier = eVar3;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit> function2, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke((Function2<? super InterfaceC3967k, ? super Integer, Unit>) function2, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(Function2<? super InterfaceC3967k, ? super Integer, Unit> innerTextField, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k.F(innerTextField) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        String str = this.$label;
        if (str == null || str.length() == 0) {
            str = null;
        }
        interfaceC3967k.o(670490316);
        C4912a c11 = str == null ? null : a1.c.c(-1719648423, new DecorationBoxKt$DecorationBox$1$2$1(this.$labelModifier, this.$label, this.$labelColor, this.$labelTextStyle), interfaceC3967k);
        interfaceC3967k.k();
        String str2 = this.$placeholder;
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        interfaceC3967k.o(670503006);
        C4912a c12 = str2 != null ? a1.c.c(-2037780775, new DecorationBoxKt$DecorationBox$1$4$1(this.$placeholderModifier, this.$placeholder, this.$placeholderColor, this.$valueTextStyle), interfaceC3967k) : null;
        interfaceC3967k.k();
        TextFieldImplKt.CommonDecorationBox(this.$value, this.$visualTransformation, this.$interactionSource, this.$labelPosition, this.$contentPadding, a1.c.c(334500290, new AnonymousClass5(this.$innerTextFieldModifier, innerTextField), interfaceC3967k), c11, c12, interfaceC3967k, 196608, 0);
    }
}
