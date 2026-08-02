package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.author;

import P9.a;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.C8416i;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class InitialTopAuthorCellListKt$InitialTopAuthorCellList$3$1$1$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ AbstractC7799Q $borderBrush;
    final /* synthetic */ float $iconRadiusDp;
    final /* synthetic */ CellDTO $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitialTopAuthorCellListKt$InitialTopAuthorCellList$3$1$1$1(float f7, AbstractC7799Q abstractC7799Q, CellDTO cellDTO) {
        super(1);
        this.$iconRadiusDp = f7;
        this.$borderBrush = abstractC7799Q;
        this.$item = cellDTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        float circleCenterY;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        float v12 = drawWithContent.v1(2);
        float v13 = drawWithContent.v1(this.$iconRadiusDp);
        circleCenterY = InitialTopAuthorCellListKt.circleCenterY(drawWithContent, this.$item, C7464j.d(drawWithContent.i()), v13);
        InterfaceC8412e.O0(drawWithContent, this.$borderBrush, v13 - v12, a.a(v13, circleCenterY), new C8416i(v12, 0.0f, 0, 0, null, 30), 104);
    }
}
