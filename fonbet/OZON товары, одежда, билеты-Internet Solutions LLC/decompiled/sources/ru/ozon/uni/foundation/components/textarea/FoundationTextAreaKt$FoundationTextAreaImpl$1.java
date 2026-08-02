package ru.ozon.uni.foundation.components.textarea;

import A0.h;
import B0.M0;
import B0.N0;
import D1.InterfaceC2801g;
import I0.C3173b;
import I0.j1;
import I0.k1;
import J0.P;
import J0.u3;
import K1.C3422b;
import K1.T;
import Nk.a;
import Q1.K;
import Q1.X;
import S0.A0;
import S0.C3996z;
import S0.F1;
import S0.InterfaceC3967k;
import Z1.u;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.P1;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import hd.C6915b;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import m3.C8060b;
import n0.C8385f;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.components.inputCore.DefaultTrailingIconKt;
import ru.ozon.uni.foundation.utils.EmptyInteractionSource;
import t0.q;
import u0.C9891D;
import u0.InterfaceC9894c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "", "invoke", "(Lu0/c;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class FoundationTextAreaKt$FoundationTextAreaImpl$1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9894c, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ long $activeBorderColor;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $bodyTopPadding;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ float $borderWidth;
    final /* synthetic */ C3422b $caption;
    final /* synthetic */ long $captionColor;
    final /* synthetic */ int $captionLineLimit;
    final /* synthetic */ e $captionModifier;
    final /* synthetic */ T $captionTextStyle;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $clearButton;
    final /* synthetic */ C7807Z $counterColor;
    final /* synthetic */ C7807Z $counterErrorColor;
    final /* synthetic */ e $counterModifier;
    final /* synthetic */ T $counterTextStyle;
    final /* synthetic */ long $cursorColor;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $finalReadOnly;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ boolean $hasBottomBar;
    final /* synthetic */ boolean $hasCounter;
    final /* synthetic */ float $inputCornerRadius;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ boolean $isLeftLockIconEnabled;
    final /* synthetic */ M0 $keyboardActions;
    final /* synthetic */ P1 $keyboardController;
    final /* synthetic */ N0 $keyboardOptions;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ e $labelModifier;
    final /* synthetic */ T $labelTextStyle;
    final /* synthetic */ float $labelTopPadding;
    final /* synthetic */ long $lockColor;
    final /* synthetic */ AbstractC8972b $lockIcon;
    final /* synthetic */ e $lockIconModifier;
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ Integer $maxLength;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Function1<Boolean, Unit> $onFocusChanged;
    final /* synthetic */ Function1<K, Unit> $onValueChange;
    final /* synthetic */ String $placeholder;
    final /* synthetic */ long $placeholderColor;
    final /* synthetic */ e $placeholderModifier;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $rightContent;
    final /* synthetic */ AbstractC8972b $systemContent;
    final /* synthetic */ long $systemContentColor;
    final /* synthetic */ float $systemContentIconSize;
    final /* synthetic */ e $systemContentModifier;
    final /* synthetic */ e $textFieldModifier;
    final /* synthetic */ K $textFieldValue;
    final /* synthetic */ K $value;
    final /* synthetic */ long $valueColor;
    final /* synthetic */ T $valueTextStyle;
    final /* synthetic */ X $visualTransformation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationTextAreaKt$FoundationTextAreaImpl$1(float f7, float f11, long j11, float f12, float f13, boolean z11, long j12, long j13, boolean z12, r rVar, P1 p12, C3422b c3422b, float f14, boolean z13, T t2, long j14, K k11, String str, String str2, boolean z14, X x11, q qVar, N0 n02, M0 m02, Function1<? super K, Unit> function1, Function1<? super Boolean, Unit> function12, long j15, long j16, long j17, T t11, e eVar, e eVar2, e eVar3, e eVar4, AbstractC8972b abstractC8972b, long j18, int i11, int i12, float f15, boolean z15, e eVar5, AbstractC8972b abstractC8972b2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, K k12, long j19, float f16, boolean z16, Integer num, C7807Z c7807z, C7807Z c7807z2, T t12, e eVar6, e eVar7, long j21, int i13, T t13) {
        super(3);
        this.$minHeight = f7;
        this.$maxHeight = f11;
        this.$backgroundColor = j11;
        this.$inputCornerRadius = f12;
        this.$borderWidth = f13;
        this.$active = z11;
        this.$activeBorderColor = j12;
        this.$borderColor = j13;
        this.$enabled = z12;
        this.$focusRequester = rVar;
        this.$keyboardController = p12;
        this.$caption = c3422b;
        this.$bodyTopPadding = f14;
        this.$hasBottomBar = z13;
        this.$valueTextStyle = t2;
        this.$cursorColor = j14;
        this.$textFieldValue = k11;
        this.$label = str;
        this.$placeholder = str2;
        this.$finalReadOnly = z14;
        this.$visualTransformation = x11;
        this.$interactionSource = qVar;
        this.$keyboardOptions = n02;
        this.$keyboardActions = m02;
        this.$onValueChange = function1;
        this.$onFocusChanged = function12;
        this.$labelColor = j15;
        this.$placeholderColor = j16;
        this.$valueColor = j17;
        this.$labelTextStyle = t11;
        this.$textFieldModifier = eVar;
        this.$labelModifier = eVar2;
        this.$placeholderModifier = eVar3;
        this.$lockIconModifier = eVar4;
        this.$lockIcon = abstractC8972b;
        this.$lockColor = j18;
        this.$minLines = i11;
        this.$maxLines = i12;
        this.$labelTopPadding = f15;
        this.$isLeftLockIconEnabled = z15;
        this.$systemContentModifier = eVar5;
        this.$systemContent = abstractC8972b2;
        this.$clearButton = function2;
        this.$rightContent = function22;
        this.$value = k12;
        this.$systemContentColor = j19;
        this.$systemContentIconSize = f16;
        this.$hasCounter = z16;
        this.$maxLength = num;
        this.$counterColor = c7807z;
        this.$counterErrorColor = c7807z2;
        this.$counterTextStyle = t12;
        this.$counterModifier = eVar6;
        this.$captionModifier = eVar7;
        this.$captionColor = j21;
        this.$captionLineLimit = i13;
        this.$captionTextStyle = t13;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9894c interfaceC9894c, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9894c, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9894c BoxWithConstraints, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f7;
        long j11;
        int i13;
        int i14;
        C3422b c3422b;
        e.a aVar;
        boolean z11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i11 & 6) == 0) {
            i12 = i11 | (interfaceC3967k2.n(BoxWithConstraints) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i12 & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
            return;
        }
        float e11 = BoxWithConstraints.e();
        f7 = FoundationTextAreaKt.captionHeight;
        float f11 = e11 - f7;
        float f12 = Float.compare(f11, this.$minHeight) < 0 ? f11 : this.$minHeight;
        if (Float.compare(f11, this.$maxHeight) >= 0) {
            f11 = this.$maxHeight;
        }
        long j12 = this.$backgroundColor;
        float f13 = this.$inputCornerRadius;
        float f14 = this.$borderWidth;
        boolean z12 = this.$active;
        long j13 = this.$activeBorderColor;
        long j14 = this.$borderColor;
        boolean z13 = this.$enabled;
        r rVar = this.$focusRequester;
        P1 p12 = this.$keyboardController;
        C3422b c3422b2 = this.$caption;
        float f15 = this.$bodyTopPadding;
        boolean z14 = this.$hasBottomBar;
        T t2 = this.$valueTextStyle;
        long j15 = this.$cursorColor;
        K k11 = this.$textFieldValue;
        String str = this.$label;
        String str2 = this.$placeholder;
        boolean z15 = this.$finalReadOnly;
        X x11 = this.$visualTransformation;
        q qVar = this.$interactionSource;
        N0 n02 = this.$keyboardOptions;
        M0 m02 = this.$keyboardActions;
        Function1<K, Unit> function1 = this.$onValueChange;
        Function1<Boolean, Unit> function12 = this.$onFocusChanged;
        C3422b c3422b3 = c3422b2;
        long j16 = this.$labelColor;
        long j17 = this.$placeholderColor;
        long j18 = this.$valueColor;
        T t11 = this.$labelTextStyle;
        e eVar = this.$textFieldModifier;
        e eVar2 = this.$labelModifier;
        e eVar3 = this.$placeholderModifier;
        e eVar4 = this.$lockIconModifier;
        AbstractC8972b abstractC8972b = this.$lockIcon;
        long j19 = this.$lockColor;
        int i15 = this.$minLines;
        int i16 = this.$maxLines;
        float f16 = this.$labelTopPadding;
        boolean z16 = this.$isLeftLockIconEnabled;
        e eVar5 = this.$systemContentModifier;
        AbstractC8972b abstractC8972b2 = this.$systemContent;
        Function2<InterfaceC3967k, Integer, Unit> function2 = this.$clearButton;
        Function2<InterfaceC3967k, Integer, Unit> function22 = this.$rightContent;
        K k12 = this.$value;
        long j21 = this.$systemContentColor;
        float f17 = this.$systemContentIconSize;
        boolean z17 = this.$hasCounter;
        Integer num = this.$maxLength;
        C7807Z c7807z = this.$counterColor;
        C7807Z c7807z2 = this.$counterErrorColor;
        T t12 = this.$counterTextStyle;
        e eVar6 = this.$counterModifier;
        e eVar7 = this.$captionModifier;
        long j22 = this.$captionColor;
        int i17 = this.$captionLineLimit;
        T t13 = this.$captionTextStyle;
        e.a aVar2 = e.f40358c0;
        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
        int I11 = interfaceC3967k2.I();
        A0 d11 = interfaceC3967k2.d();
        e f18 = c.f(interfaceC3967k2, aVar2);
        InterfaceC2801g.f5440U.getClass();
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k2.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k2.i();
        if (interfaceC3967k2.t()) {
            interfaceC3967k2.H(a12);
        } else {
            interfaceC3967k2.e();
        }
        Function2 c11 = P.c(interfaceC3967k2, a11, interfaceC3967k2, d11);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
            a.d(c11, I11, interfaceC3967k2, I11);
        }
        F1.b(interfaceC3967k2, f18, InterfaceC2801g.a.f());
        e c12 = C8385f.c(f14, z12 ? j13 : j14, androidx.compose.foundation.e.b(a0.g(a0.e(aVar2, 1.0f), f12, f11), j12, h.b(f13)), h.b(f13));
        EmptyInteractionSource emptyInteractionSource = EmptyInteractionSource.INSTANCE;
        interfaceC3967k2.o(917376811);
        boolean n11 = interfaceC3967k2.n(rVar) | interfaceC3967k2.n(p12);
        Object C11 = interfaceC3967k2.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new FoundationTextAreaKt$FoundationTextAreaImpl$1$1$1$1(rVar, p12);
            interfaceC3967k2.x(C11);
        }
        interfaceC3967k2.k();
        e b11 = i.b(c12, emptyInteractionSource, null, z13, null, null, (Function0) C11, 24);
        C5194q a13 = C5193p.a(C5179b.d(), InterfaceC6250b.a.k(), interfaceC3967k2, 6);
        int I12 = interfaceC3967k2.I();
        A0 d12 = interfaceC3967k2.d();
        e f19 = c.f(interfaceC3967k2, b11);
        Function0 a14 = InterfaceC2801g.a.a();
        if (interfaceC3967k2.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k2.i();
        if (interfaceC3967k2.t()) {
            interfaceC3967k2.H(a14);
        } else {
            interfaceC3967k2.e();
        }
        Function2 c13 = P.c(interfaceC3967k2, a13, interfaceC3967k2, d12);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
            a.d(c13, I12, interfaceC3967k2, I12);
        }
        F1.b(interfaceC3967k2, f19, InterfaceC2801g.a.f());
        e j23 = androidx.compose.foundation.layout.T.j(a0.g(aVar2, f12 - DefaultTrailingIconKt.getDefaultTrailingIconSize(), f11 - DefaultTrailingIconKt.getDefaultTrailingIconSize()), 0.0f, f15, 0.0f, 0.0f, 13);
        Y b12 = androidx.compose.foundation.layout.X.b(C5179b.d(), InterfaceC6250b.a.l(), interfaceC3967k2, 6);
        int I13 = interfaceC3967k2.I();
        A0 d13 = interfaceC3967k2.d();
        e f21 = c.f(interfaceC3967k2, j23);
        Function0 a15 = InterfaceC2801g.a.a();
        if (interfaceC3967k2.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k2.i();
        if (interfaceC3967k2.t()) {
            interfaceC3967k2.H(a15);
        } else {
            interfaceC3967k2.e();
        }
        Function2 f22 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d13);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I13))) {
            a.d(f22, I13, interfaceC3967k2, I13);
        }
        F1.b(interfaceC3967k2, f21, InterfaceC2801g.a.f());
        C9891D c9891d = C9891D.f99599a;
        int c14 = C6915b.c(((f12 - DefaultTrailingIconKt.getDefaultTrailingIconSize()) - f15) / u.e(t2.o()));
        Integer valueOf = Integer.valueOf(c14);
        if (c14 <= 0) {
            valueOf = null;
        }
        C3996z.a(k1.b().c(new j1(j15, C7807Z.o(0.4f, j15))), a1.c.c(1017453494, new FoundationTextAreaKt$FoundationTextAreaImpl$1$1$2$1$1(k11, str, str2, z15, z13, rVar, x11, qVar, n02, m02, function1, function12, j16, j17, j18, j15, t11, t2, c9891d, eVar, eVar2, eVar3, eVar4, abstractC8972b, j19, i15, i16, f16, z16, valueOf != null ? valueOf.intValue() : 1, z14, eVar5, abstractC8972b2, function2, function22, z12, k12, j21, f17), interfaceC3967k2), interfaceC3967k2, 56);
        interfaceC3967k2.f();
        interfaceC3967k2.o(562534358);
        if (z14) {
            e e12 = a0.e(aVar2, 1.0f);
            Y b13 = androidx.compose.foundation.layout.X.b(C5179b.c(), InterfaceC6250b.a.a(), interfaceC3967k2, 54);
            int I14 = interfaceC3967k2.I();
            A0 d14 = interfaceC3967k2.d();
            e f23 = c.f(interfaceC3967k2, e12);
            Function0 a16 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a16);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f24 = C3173b.f(interfaceC3967k2, b13, interfaceC3967k2, d14);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I14))) {
                a.d(f24, I14, interfaceC3967k2, I14);
            }
            Ek.a.g(f23, interfaceC3967k2, -1024332573);
            if (!z17 || num == null || c7807z == null || c7807z2 == null || t12 == null) {
                c3422b = c3422b3;
                aVar = aVar2;
                j11 = j22;
                i13 = i17;
                z11 = false;
            } else {
                c3422b = c3422b3;
                j11 = j22;
                i13 = i17;
                z11 = false;
                aVar = aVar2;
                FoundationTextAreaKt.m3028CounterY0xEhic(eVar6, num.intValue(), c7807z.w(), c7807z2.w(), t12, k11, interfaceC3967k2, 0, 0);
            }
            interfaceC3967k.k();
            c3422b3 = c3422b;
            e.a aVar3 = aVar;
            i14 = 4;
            interfaceC3967k2 = interfaceC3967k;
            FoundationTextAreaKt.m3033TrailingIconGi_pv64(aVar3, eVar5, abstractC8972b2, function2, function22, z13, z12, z15, k12.f().length() == 0 ? true : z11, j21, abstractC8972b, f17, z16, interfaceC3967k2, 6, 0, 0);
            interfaceC3967k2.f();
        } else {
            j11 = j22;
            i13 = i17;
            i14 = 4;
        }
        interfaceC3967k2.k();
        interfaceC3967k2.f();
        interfaceC3967k2.o(917572219);
        if (c3422b3 != null) {
            float f25 = i14;
            u3.c(c3422b3, androidx.compose.foundation.layout.T.j(eVar7, f25, f25, 0.0f, 0.0f, 12), j11, 0L, 0L, null, 0L, 2, false, i13, 0, null, null, t13, interfaceC3967k, 0, 48, 120824);
            Unit unit = Unit.f71690a;
        }
        interfaceC3967k.k();
        interfaceC3967k.f();
    }
}
