package ru.ozon.uni.foundation.components.input;

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
import ru.ozon.uni.foundation.components.inputCore.DrawEllipsisForInputKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class FoundationInputKt$InputBody$decorationBox$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ boolean $active;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ T $finalTextStyle;
    final /* synthetic */ InterfaceC3978p0<K> $textLayoutResult;
    final /* synthetic */ M $textMeasurer;
    final /* synthetic */ Q1.K $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationInputKt$InputBody$decorationBox$1$1(InterfaceC3978p0<K> interfaceC3978p0, Q1.K k11, boolean z11, M m11, T t2, long j11) {
        super(1);
        this.$textLayoutResult = interfaceC3978p0;
        this.$value = k11;
        this.$active = z11;
        this.$textMeasurer = m11;
        this.$finalTextStyle = t2;
        this.$backgroundColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        K value = this.$textLayoutResult.getValue();
        if (this.$value.f().length() == 0 || this.$active || value == null) {
            return;
        }
        DrawEllipsisForInputKt.m3012drawEllipsisForInputxwkQ0AY(drawWithContent, value, this.$textMeasurer, this.$finalTextStyle, this.$backgroundColor);
    }
}
