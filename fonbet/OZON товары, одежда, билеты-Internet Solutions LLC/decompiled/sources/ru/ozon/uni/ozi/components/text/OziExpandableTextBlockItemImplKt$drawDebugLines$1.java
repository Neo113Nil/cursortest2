package ru.ozon.uni.ozi.components.text;

import K1.K;
import S0.A1;
import Z1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziExpandableTextBlockItemImplKt$drawDebugLines$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ d $density;
    final /* synthetic */ A1<K> $layoutResult;
    final /* synthetic */ InterfaceC9914x $paddingValues;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziExpandableTextBlockItemImplKt$drawDebugLines$1(d dVar, A1<K> a12, InterfaceC9914x interfaceC9914x) {
        super(1);
        this.$density = dVar;
        this.$layoutResult = a12;
        this.$paddingValues = interfaceC9914x;
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
    }
}
