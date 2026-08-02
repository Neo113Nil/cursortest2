package ru.ozon.uni.ozi.components.text;

import K1.K;
import S0.A1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class OziExpandableTextBlockItemImplKt$ExpandableTextBlockItemWrapper$4$2$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ A1<K> $textLayoutResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OziExpandableTextBlockItemImplKt$ExpandableTextBlockItemWrapper$4$2$1$1(A1<K> a12) {
        super(1);
        this.$textLayoutResult = a12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        K value = this.$textLayoutResult.getValue();
        if (value == null || !value.h()) {
            return;
        }
        drawWithContent.F0();
    }
}
