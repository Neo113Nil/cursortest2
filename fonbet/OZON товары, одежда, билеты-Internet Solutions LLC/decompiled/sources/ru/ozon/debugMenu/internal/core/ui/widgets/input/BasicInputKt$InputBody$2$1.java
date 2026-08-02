package ru.ozon.debugMenu.internal.core.ui.widgets.input;

import K1.K;
import K1.M;
import K1.T;
import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;
import ru.ozon.debugMenu.internal.core.ui.widgets.input.core.DrawEllipsisForInputKt;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class BasicInputKt$InputBody$2$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ InterfaceC9914x $contentPadding;
    final /* synthetic */ T $finalTextStyle;
    final /* synthetic */ InterfaceC3978p0<K> $textLayoutResult$delegate;
    final /* synthetic */ M $textMeasurer;
    final /* synthetic */ Q1.K $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicInputKt$InputBody$2$1(Q1.K k11, boolean z11, InterfaceC9914x interfaceC9914x, M m11, T t2, long j11, InterfaceC3978p0<K> interfaceC3978p0) {
        super(1);
        this.$value = k11;
        this.$active = z11;
        this.$contentPadding = interfaceC9914x;
        this.$textMeasurer = m11;
        this.$finalTextStyle = t2;
        this.$backgroundColor = j11;
        this.$textLayoutResult$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        K InputBody_zDOBpz4$lambda$4;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        InputBody_zDOBpz4$lambda$4 = BasicInputKt.InputBody_zDOBpz4$lambda$4(this.$textLayoutResult$delegate);
        if (this.$value.f().length() == 0 || this.$active || InputBody_zDOBpz4$lambda$4 == null) {
            return;
        }
        DrawEllipsisForInputKt.m1624drawEllipsisForInputkKL39v8(drawWithContent, InputBody_zDOBpz4$lambda$4, this.$contentPadding, this.$textMeasurer, this.$finalTextStyle, this.$backgroundColor);
    }
}
