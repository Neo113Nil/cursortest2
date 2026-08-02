package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.author;

import P9.a;
import S0.InterfaceC3978p0;
import java.util.List;
import k1.C7460f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8412e;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/e;", "", "invoke", "(Ln1/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class InitialTopAuthorCellListKt$InitialTopAuthorCellList$2$1 extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {
    final /* synthetic */ List<CellDTO> $cellsWithNumbers;
    final /* synthetic */ InterfaceC3978p0<C7460f> $firstCellBounds;
    final /* synthetic */ float $iconRadiusDp;
    final /* synthetic */ InterfaceC3978p0<C7460f> $lastCellBounds;
    final /* synthetic */ long $lineColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitialTopAuthorCellListKt$InitialTopAuthorCellList$2$1(List<CellDTO> list, float f7, InterfaceC3978p0<C7460f> interfaceC3978p0, InterfaceC3978p0<C7460f> interfaceC3978p02, long j11) {
        super(1);
        this.$cellsWithNumbers = list;
        this.$iconRadiusDp = f7;
        this.$firstCellBounds = interfaceC3978p0;
        this.$lastCellBounds = interfaceC3978p02;
        this.$lineColor = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8412e interfaceC8412e) {
        invoke2(interfaceC8412e);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8412e drawBehind) {
        float circleCenterY;
        float circleCenterY2;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (this.$cellsWithNumbers.size() < 2) {
            return;
        }
        float v12 = drawBehind.v1(this.$iconRadiusDp);
        float q11 = this.$firstCellBounds.getValue().q();
        circleCenterY = InitialTopAuthorCellListKt.circleCenterY(drawBehind, (CellDTO) C7714v.K(this.$cellsWithNumbers), this.$firstCellBounds.getValue().m(), v12);
        float f7 = circleCenterY + q11;
        float q12 = this.$lastCellBounds.getValue().q();
        circleCenterY2 = InitialTopAuthorCellListKt.circleCenterY(drawBehind, (CellDTO) C7714v.X(this.$cellsWithNumbers), this.$lastCellBounds.getValue().m(), v12);
        float f11 = circleCenterY2 + q12;
        if (f11 > f7) {
            drawBehind.U(this.$lineColor, a.a(v12, f7), a.a(v12, f11), drawBehind.v1(2), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
        }
    }
}
