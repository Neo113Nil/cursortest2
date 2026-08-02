package ru.ozon.uni.foundation.components.inputCore.decorationBox;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import I0.C3173b;
import J0.T0;
import K1.T;
import Nk.a;
import Q1.X;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import e1.d;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import q1.AbstractC8972b;
import t0.o;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "innerTextField", "invoke", "(Lkotlin/jvm/functions/Function2;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class DecorationBoxKt$DecorationBox$1 extends AbstractC7737t implements InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, ? extends Unit>, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ boolean $finalReadOnly;
    final /* synthetic */ e $innerTextFieldModifier;
    final /* synthetic */ o $interactionSource;
    final /* synthetic */ boolean $isLeftLockIconEnabled;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ float $labelTopPadding;
    final /* synthetic */ long $lockColor;
    final /* synthetic */ AbstractC8972b $lockIcon;
    final /* synthetic */ e $lockIconModifier;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ int $placeholderMaxLines;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ String $value;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.foundation.components.inputCore.decorationBox.DecorationBoxKt$DecorationBox$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ boolean $finalReadOnly;
        final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $innerTextField;
        final /* synthetic */ e $innerTextFieldModifier;
        final /* synthetic */ boolean $isLeftLockIconEnabled;
        final /* synthetic */ long $lockColor;
        final /* synthetic */ AbstractC8972b $lockIcon;
        final /* synthetic */ e $lockIconModifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(boolean z11, boolean z12, e eVar, AbstractC8972b abstractC8972b, long j11, e eVar2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
            super(2);
            this.$finalReadOnly = z11;
            this.$isLeftLockIconEnabled = z12;
            this.$lockIconModifier = eVar;
            this.$lockIcon = abstractC8972b;
            this.$lockColor = j11;
            this.$innerTextFieldModifier = eVar2;
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
            d.b i12 = InterfaceC6250b.a.i();
            C5179b.i n11 = C5179b.n(2);
            boolean z11 = this.$finalReadOnly;
            boolean z12 = this.$isLeftLockIconEnabled;
            e eVar = this.$lockIconModifier;
            AbstractC8972b abstractC8972b = this.$lockIcon;
            long j11 = this.$lockColor;
            e eVar2 = this.$innerTextFieldModifier;
            Function2<InterfaceC3967k, Integer, Unit> function2 = this.$innerTextField;
            e.a aVar = e.f40358c0;
            Y b11 = androidx.compose.foundation.layout.X.b(n11, i12, interfaceC3967k, 54);
            int I11 = interfaceC3967k.I();
            A0 d11 = interfaceC3967k.d();
            e f7 = c.f(interfaceC3967k, aVar);
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
            Function2 f11 = C3173b.f(interfaceC3967k, b11, interfaceC3967k, d11);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                a.d(f11, I11, interfaceC3967k, I11);
            }
            Ek.a.g(f7, interfaceC3967k, -347288829);
            if (z11 || z12) {
                T0.a(abstractC8972b, "lock", a0.n(eVar, 16), j11, interfaceC3967k, 48);
            }
            interfaceC3967k.k();
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = interfaceC3967k.I();
            A0 d12 = interfaceC3967k.d();
            e f13 = c.f(interfaceC3967k, eVar2);
            Function0 a12 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a12);
            } else {
                interfaceC3967k.e();
            }
            Function2 d13 = C2454a.d(interfaceC3967k, f12, interfaceC3967k, d12);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
                a.d(d13, I12, interfaceC3967k, I12);
            }
            F1.b(interfaceC3967k, f13, InterfaceC2801g.a.f());
            function2.invoke(interfaceC3967k, 0);
            interfaceC3967k.f();
            interfaceC3967k.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DecorationBoxKt$DecorationBox$1(String str, String str2, String str3, X x11, o oVar, InterfaceC9914x interfaceC9914x, float f7, long j11, T t2, e eVar, e eVar2, long j12, int i11, T t11, boolean z11, boolean z12, e eVar3, AbstractC8972b abstractC8972b, long j13, e eVar4) {
        super(3);
        this.$label = str;
        this.$placeholder = str2;
        this.$value = str3;
        this.$visualTransformation = x11;
        this.$interactionSource = oVar;
        this.$contentPadding = interfaceC9914x;
        this.$labelTopPadding = f7;
        this.$labelColor = j11;
        this.$labelTextStyle = t2;
        this.$labelModifier = eVar;
        this.$placeholderModifier = eVar2;
        this.$placeholderColor = j12;
        this.$placeholderMaxLines = i11;
        this.$valueTextStyle = t11;
        this.$finalReadOnly = z11;
        this.$isLeftLockIconEnabled = z12;
        this.$lockIconModifier = eVar3;
        this.$lockIcon = abstractC8972b;
        this.$lockColor = j13;
        this.$innerTextFieldModifier = eVar4;
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
        interfaceC3967k.o(1237268627);
        C4912a c11 = str == null ? null : a1.c.c(-999099332, new DecorationBoxKt$DecorationBox$1$1$1(this.$label, this.$labelColor, this.$labelTextStyle, this.$labelModifier), interfaceC3967k);
        interfaceC3967k.k();
        String str2 = this.$placeholder;
        interfaceC3967k.o(1237279437);
        C4912a c12 = str2 != null ? a1.c.c(-1930785476, new DecorationBoxKt$DecorationBox$1$2$1(this.$placeholder, this.$placeholderModifier, this.$placeholderColor, this.$placeholderMaxLines, this.$valueTextStyle), interfaceC3967k) : null;
        interfaceC3967k.k();
        TextFieldImplKt.m3017CommonDecorationBoxeKw1uXw(this.$value, a1.c.c(-452364565, new AnonymousClass3(this.$finalReadOnly, this.$isLeftLockIconEnabled, this.$lockIconModifier, this.$lockIcon, this.$lockColor, this.$innerTextFieldModifier, innerTextField), interfaceC3967k), this.$visualTransformation, c11, c12, true, this.$interactionSource, this.$contentPadding, this.$labelTopPadding, interfaceC3967k, 196656, 0);
    }
}
