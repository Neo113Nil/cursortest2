package ru.ozon.uni.components.text;

import Bl0.C2652m;
import K1.C3422b;
import K1.K;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTextKt$UniText$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $leftPadding;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<K, Unit> $onTextLayout;
    final /* synthetic */ UniTextResizing $resizing;
    final /* synthetic */ float $rightPadding;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ C3422b $text;
    final /* synthetic */ int $textAlign;
    final /* synthetic */ AbstractC7799Q $textColor;
    final /* synthetic */ UniTextPreset $textPreset;
    final /* synthetic */ int $truncatingMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UniTextKt$UniText$5(C3422b c3422b, e eVar, UniTextPreset uniTextPreset, int i11, UniTextResizing uniTextResizing, float f7, float f11, int i12, AbstractC7799Q abstractC7799Q, int i13, boolean z11, Function1<? super K, Unit> function1, int i14, int i15, int i16) {
        super(2);
        this.$text = c3422b;
        this.$modifier = eVar;
        this.$textPreset = uniTextPreset;
        this.$textAlign = i11;
        this.$resizing = uniTextResizing;
        this.$leftPadding = f7;
        this.$rightPadding = f11;
        this.$truncatingMode = i12;
        this.$textColor = abstractC7799Q;
        this.$maxLines = i13;
        this.$softWrap = z11;
        this.$onTextLayout = function1;
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
        UniTextKt.m1948UniText28lkidg(this.$text, this.$modifier, this.$textPreset, this.$textAlign, this.$resizing, this.$leftPadding, this.$rightPadding, this.$truncatingMode, this.$textColor, this.$maxLines, this.$softWrap, this.$onTextLayout, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1), this.$$default);
    }
}
