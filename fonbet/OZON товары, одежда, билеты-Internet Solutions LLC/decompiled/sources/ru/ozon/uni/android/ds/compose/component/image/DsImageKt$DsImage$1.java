package ru.ozon.uni.android.ds.compose.component.image;

import B1.InterfaceC2547p;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsImageKt$DsImage$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $aspectRatio;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ float $bottomPadding;
    final /* synthetic */ InterfaceC2547p $contentScale;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ float $endPadding;
    final /* synthetic */ boolean $hasParanja;
    final /* synthetic */ e $modifier;
    final /* synthetic */ AbstractC8972b $painter;
    final /* synthetic */ float $startPadding;
    final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsImageKt$DsImage$1(AbstractC8972b abstractC8972b, e eVar, boolean z11, float f7, long j11, InterfaceC2547p interfaceC2547p, float f11, float f12, float f13, float f14, float f15, int i11, int i12, int i13) {
        super(2);
        this.$painter = abstractC8972b;
        this.$modifier = eVar;
        this.$hasParanja = z11;
        this.$aspectRatio = f7;
        this.$backgroundColor = j11;
        this.$contentScale = interfaceC2547p;
        this.$cornerRadius = f11;
        this.$startPadding = f12;
        this.$topPadding = f13;
        this.$endPadding = f14;
        this.$bottomPadding = f15;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsImageKt.m1720DsImageA8mMYrQ(this.$painter, this.$modifier, this.$hasParanja, this.$aspectRatio, this.$backgroundColor, this.$contentScale, this.$cornerRadius, this.$startPadding, this.$topPadding, this.$endPadding, this.$bottomPadding, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
