package ru.ozon.uni.components.text;

import Bl0.C2652m;
import K1.C3422b;
import K1.K;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UniTextKt$MaxLinesParagraphTextBlockAnnotated$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<K, Unit> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ List<C3422b> $paragraphs;
    final /* synthetic */ UniTextPreset $preset;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UniTextKt$MaxLinesParagraphTextBlockAnnotated$1(e eVar, List<C3422b> list, int i11, int i12, boolean z11, int i13, Function1<? super K, Unit> function1, UniTextPreset uniTextPreset, int i14) {
        super(2);
        this.$modifier = eVar;
        this.$paragraphs = list;
        this.$textAlign = i11;
        this.$overflow = i12;
        this.$softWrap = z11;
        this.$maxLines = i13;
        this.$onTextLayout = function1;
        this.$preset = uniTextPreset;
        this.$$changed = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        UniTextKt.m1947MaxLinesParagraphTextBlockAnnotated8fRtlAg(this.$modifier, this.$paragraphs, this.$textAlign, this.$overflow, this.$softWrap, this.$maxLines, this.$onTextLayout, this.$preset, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
