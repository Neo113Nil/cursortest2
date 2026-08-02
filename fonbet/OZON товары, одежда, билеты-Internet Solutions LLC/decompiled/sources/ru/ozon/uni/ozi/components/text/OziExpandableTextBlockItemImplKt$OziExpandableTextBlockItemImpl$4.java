package ru.ozon.uni.ozi.components.text;

import Bl0.C2652m;
import K1.K;
import S0.InterfaceC3967k;
import V1.h;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.text.presets.OziTextPreset;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziExpandableTextBlockItemImplKt$OziExpandableTextBlockItemImpl$4 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ long $color;
    final /* synthetic */ long $expandBackgroundColor;
    final /* synthetic */ String $expandText;
    final /* synthetic */ long $expandTextColor;
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function0<Unit> $onExpand;
    final /* synthetic */ Function1<K, Unit> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ OziTextPreset $preset;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ String $text;
    final /* synthetic */ h $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziExpandableTextBlockItemImplKt$OziExpandableTextBlockItemImpl$4(String str, e eVar, boolean z11, String str2, Function0<Unit> function0, long j11, long j12, long j13, h hVar, int i11, boolean z12, int i12, Function1<? super K, Unit> function1, OziTextPreset oziTextPreset, int i13, int i14) {
        super(2);
        this.$text = str;
        this.$modifier = eVar;
        this.$isExpanded = z11;
        this.$expandText = str2;
        this.$onExpand = function0;
        this.$color = j11;
        this.$expandBackgroundColor = j12;
        this.$expandTextColor = j13;
        this.$textAlign = hVar;
        this.$overflow = i11;
        this.$softWrap = z12;
        this.$maxLines = i12;
        this.$onTextLayout = function1;
        this.$preset = oziTextPreset;
        this.$$changed = i13;
        this.$$changed1 = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziExpandableTextBlockItemImplKt.m3126OziExpandableTextBlockItemImplffHtLjE(this.$text, this.$modifier, this.$isExpanded, this.$expandText, this.$onExpand, this.$color, this.$expandBackgroundColor, this.$expandTextColor, this.$textAlign, this.$overflow, this.$softWrap, this.$maxLines, this.$onTextLayout, this.$preset, interfaceC3967k, C2652m.e(this.$$changed | 1), C2652m.e(this.$$changed1));
    }
}
