package ru.ozon.uni.ozi.components.text;

import Bl0.C2652m;
import K1.K;
import S0.InterfaceC3967k;
import V1.h;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.ozi.components.text.presets.OziTextPreset;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziTextBlockItemKt$MaxLinesParagraphTextBlock$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<K, Unit> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ List<String> $paragraphs;
    final /* synthetic */ OziTextPreset $preset;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ h $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziTextBlockItemKt$MaxLinesParagraphTextBlock$1(e eVar, List<String> list, long j11, h hVar, int i11, boolean z11, int i12, Function1<? super K, Unit> function1, OziTextPreset oziTextPreset, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$paragraphs = list;
        this.$color = j11;
        this.$textAlign = hVar;
        this.$overflow = i11;
        this.$softWrap = z11;
        this.$maxLines = i12;
        this.$onTextLayout = function1;
        this.$preset = oziTextPreset;
        this.$$changed = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziTextBlockItemKt.m3132MaxLinesParagraphTextBlockjVGSiAQ(this.$modifier, this.$paragraphs, this.$color, this.$textAlign, this.$overflow, this.$softWrap, this.$maxLines, this.$onTextLayout, this.$preset, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
