package ru.ozon.uni.android.ds.compose.component.text;

import Bl0.C2652m;
import K1.T;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsTextKt$DsText$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $allCaps;
    final /* synthetic */ float $bottomPadding;
    final /* synthetic */ float $leftPadding;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ long $paragraphSpacing;
    final /* synthetic */ float $rightPadding;
    final /* synthetic */ String $text;
    final /* synthetic */ int $textAlign;
    final /* synthetic */ long $textColor;
    final /* synthetic */ T $textStyle;
    final /* synthetic */ float $topPadding;
    final /* synthetic */ int $truncatingMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTextKt$DsText$1(String str, e eVar, int i11, long j11, int i12, int i13, T t2, long j12, boolean z11, float f7, float f11, float f12, float f13, int i14, int i15, int i16) {
        super(2);
        this.$text = str;
        this.$modifier = eVar;
        this.$textAlign = i11;
        this.$textColor = j11;
        this.$truncatingMode = i12;
        this.$maxLines = i13;
        this.$textStyle = t2;
        this.$paragraphSpacing = j12;
        this.$allCaps = z11;
        this.$topPadding = f7;
        this.$leftPadding = f11;
        this.$rightPadding = f12;
        this.$bottomPadding = f13;
        this.$$changed = i14;
        this.$$changed1 = i15;
        this.$$default = i16;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsTextKt.m1815DsTextkme9oNY(this.$text, this.$modifier, this.$textAlign, this.$textColor, this.$truncatingMode, this.$maxLines, this.$textStyle, this.$paragraphSpacing, this.$allCaps, this.$topPadding, this.$leftPadding, this.$rightPadding, this.$bottomPadding, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
