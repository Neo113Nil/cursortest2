package ru.ozon.uni.android.ds.compose.component.rating;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DsRatingKt$DsRating$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function1<Float, Unit> $onSelected;
    final /* synthetic */ boolean $separateClickable;
    final /* synthetic */ DsRatingSize $size;
    final /* synthetic */ AbstractC7799Q $starsBackgroundBrush;
    final /* synthetic */ AbstractC7799Q $starsBrush;
    final /* synthetic */ int $style;
    final /* synthetic */ float $total;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsRatingKt$DsRating$3(float f7, e eVar, DsRatingSize dsRatingSize, int i11, boolean z11, Function0<Unit> function0, Function1<? super Float, Unit> function1, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, int i12, int i13) {
        super(2);
        this.$total = f7;
        this.$modifier = eVar;
        this.$size = dsRatingSize;
        this.$style = i11;
        this.$separateClickable = z11;
        this.$onClick = function0;
        this.$onSelected = function1;
        this.$starsBrush = abstractC7799Q;
        this.$starsBackgroundBrush = abstractC7799Q2;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsRatingKt.m1762DsRatingu6rfSSE(this.$total, this.$modifier, this.$size, this.$style, this.$separateClickable, this.$onClick, this.$onSelected, this.$starsBrush, this.$starsBackgroundBrush, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
