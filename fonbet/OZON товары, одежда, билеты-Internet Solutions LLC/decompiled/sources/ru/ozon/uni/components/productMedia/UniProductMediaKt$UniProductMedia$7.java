package ru.ozon.uni.components.productMedia;

import B1.InterfaceC2547p;
import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import n0.C8391l;
import q1.AbstractC8972b;
import t0.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniProductMediaKt$UniProductMedia$7 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ AbstractC7799Q $background;
    final /* synthetic */ C8391l $border;
    final /* synthetic */ UniProductMediaBorderStyle $borderStyle;
    final /* synthetic */ InterfaceC2547p $fitType;
    final /* synthetic */ AbstractC8972b $graphic;
    final /* synthetic */ long $graphicColor;
    final /* synthetic */ boolean $hasOverlay;
    final /* synthetic */ boolean $hasParanja;
    final /* synthetic */ AbstractC8972b $image;
    final /* synthetic */ q $interactionSource;
    final /* synthetic */ String $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ float $radius;
    final /* synthetic */ float $ratio;
    final /* synthetic */ UniProductMediaSize $size;
    final /* synthetic */ AbstractC8972b $smallGraphic;
    final /* synthetic */ long $smallGraphicColor;
    final /* synthetic */ String $smallLabel;
    final /* synthetic */ long $smallLabelColor;
    final /* synthetic */ T $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniProductMediaKt$UniProductMedia$7(AbstractC8972b abstractC8972b, e eVar, UniProductMediaSize uniProductMediaSize, float f7, AbstractC7799Q abstractC7799Q, boolean z11, C8391l c8391l, UniProductMediaBorderStyle uniProductMediaBorderStyle, boolean z12, AbstractC8972b abstractC8972b2, long j11, String str, long j12, T t2, float f11, InterfaceC2547p interfaceC2547p, AbstractC8972b abstractC8972b3, String str2, long j13, long j14, Function0<Unit> function0, q qVar, int i11, int i12, int i13, int i14) {
        super(2);
        this.$image = abstractC8972b;
        this.$modifier = eVar;
        this.$size = uniProductMediaSize;
        this.$ratio = f7;
        this.$background = abstractC7799Q;
        this.$hasParanja = z11;
        this.$border = c8391l;
        this.$borderStyle = uniProductMediaBorderStyle;
        this.$hasOverlay = z12;
        this.$graphic = abstractC8972b2;
        this.$graphicColor = j11;
        this.$label = str;
        this.$labelColor = j12;
        this.$textStyle = t2;
        this.$radius = f11;
        this.$fitType = interfaceC2547p;
        this.$smallGraphic = abstractC8972b3;
        this.$smallLabel = str2;
        this.$smallGraphicColor = j13;
        this.$smallLabelColor = j14;
        this.$onClick = function0;
        this.$interactionSource = qVar;
        this.$$changed = i11;
        this.$$changed1 = i12;
        this.$$changed2 = i13;
        this.$$default = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniProductMediaKt.m1931UniProductMediawzanWIw(this.$image, this.$modifier, this.$size, this.$ratio, this.$background, this.$hasParanja, this.$border, this.$borderStyle, this.$hasOverlay, this.$graphic, this.$graphicColor, this.$label, this.$labelColor, this.$textStyle, this.$radius, this.$fitType, this.$smallGraphic, this.$smallLabel, this.$smallGraphicColor, this.$smallLabelColor, this.$onClick, this.$interactionSource, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), C2652m.e(this.$$changed2), this.$$default);
    }
}
