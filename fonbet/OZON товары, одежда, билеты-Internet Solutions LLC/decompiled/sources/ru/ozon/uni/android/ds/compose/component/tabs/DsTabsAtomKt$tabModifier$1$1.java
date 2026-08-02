package ru.ozon.uni.android.ds.compose.component.tabs;

import I1.D;
import I1.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LI1/D;", "", "invoke", "(LI1/D;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes8.dex */
final class DsTabsAtomKt$tabModifier$1$1 extends AbstractC7737t implements Function1<D, Unit> {
    final /* synthetic */ boolean $isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTabsAtomKt$tabModifier$1$1(boolean z11) {
        super(1);
        this.$isSelected = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(D d11) {
        invoke2(d11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(D semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        z.r(semantics, this.$isSelected);
        z.q(semantics, 4);
    }
}
