package ru.ozon.uni.android.ds.compose.component.cell;

import S0.A1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln1/c;", "", "invoke", "(Ln1/c;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsCellKt$DsCell$10$1 extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {
    final /* synthetic */ long $finalIndicatorColor;
    final /* synthetic */ A1<Boolean> $isEndPressed$delegate;
    final /* synthetic */ A1<Boolean> $isPressed$delegate;
    final /* synthetic */ A1<Boolean> $isStartPressed$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCellKt$DsCell$10$1(long j11, A1<Boolean> a12, A1<Boolean> a13, A1<Boolean> a14) {
        super(1);
        this.$finalIndicatorColor = j11;
        this.$isPressed$delegate = a12;
        this.$isStartPressed$delegate = a13;
        this.$isEndPressed$delegate = a14;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC8410c interfaceC8410c) {
        invoke2(interfaceC8410c);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC8410c drawWithContent) {
        boolean DsCell_0rf_eiU$lambda$3;
        boolean DsCell_0rf_eiU$lambda$4;
        boolean DsCell_0rf_eiU$lambda$5;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.F0();
        if (this.$finalIndicatorColor != 16) {
            DsCell_0rf_eiU$lambda$3 = DsCellKt.DsCell_0rf_eiU$lambda$3(this.$isPressed$delegate);
            if (!DsCell_0rf_eiU$lambda$3) {
                DsCell_0rf_eiU$lambda$4 = DsCellKt.DsCell_0rf_eiU$lambda$4(this.$isStartPressed$delegate);
                if (!DsCell_0rf_eiU$lambda$4) {
                    DsCell_0rf_eiU$lambda$5 = DsCellKt.DsCell_0rf_eiU$lambda$5(this.$isEndPressed$delegate);
                    if (!DsCell_0rf_eiU$lambda$5) {
                        return;
                    }
                }
            }
            InterfaceC8412e.Q(drawWithContent, this.$finalIndicatorColor, 0L, 0L, 0.0f, null, 126);
        }
    }
}
