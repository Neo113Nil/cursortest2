package ru.ozon.uni.ozi.components.heading;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.text.presets.OziTextPreset;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziHeadingKt$TextBlock$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ boolean $expandable;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ OziTextPreset $preset;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziHeadingKt$TextBlock$2(e eVar, String str, boolean z11, int i11, OziTextPreset oziTextPreset, long j11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$text = str;
        this.$expandable = z11;
        this.$maxLines = i11;
        this.$preset = oziTextPreset;
        this.$color = j11;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziHeadingKt.m3081TextBlockV9fs2A(this.$modifier, this.$text, this.$expandable, this.$maxLines, this.$preset, this.$color, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
