package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.C8416i;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ReactionButtonKt$borderInside$2$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ Function0<Float> $alpha;
    final /* synthetic */ AbstractC7799Q $brush;
    final /* synthetic */ long $cornerRadiusPx;
    final /* synthetic */ C8416i $stroke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactionButtonKt$borderInside$2$1$1(Function0<Float> function0, AbstractC7799Q abstractC7799Q, long j11, C8416i c8416i) {
        super(1);
        this.$alpha = function0;
        this.$brush = abstractC7799Q;
        this.$cornerRadiusPx = j11;
        this.$stroke = c8416i;
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
        InterfaceC8412e.I0(drawWithContent, this.$brush, 0L, 0L, this.$cornerRadiusPx, this.$alpha.invoke().floatValue(), this.$stroke, 198);
    }
}
