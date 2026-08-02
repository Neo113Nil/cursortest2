package ru.ozon.uni.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class VisualEffectsKt$hoverEffect$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ float $alpha;
    final /* synthetic */ C7807Z $hoverColor;
    final /* synthetic */ Function0<Boolean> $isPressed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VisualEffectsKt$hoverEffect$1(Function0<Boolean> function0, C7807Z c7807z, float f7) {
        super(1);
        this.$isPressed = function0;
        this.$hoverColor = c7807z;
        this.$alpha = f7;
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
        if (this.$isPressed.invoke().booleanValue()) {
            InterfaceC8412e.Q(drawWithContent, this.$hoverColor.w(), 0L, 0L, this.$alpha, null, 118);
        }
    }
}
