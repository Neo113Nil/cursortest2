package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Tg.b;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerVI;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class EntryBannerComposableKt$SubtitleBlock$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<b, Unit> $onAtomAction;
    final /* synthetic */ EntryBannerVI.Content.Block.Subtitle $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EntryBannerComposableKt$SubtitleBlock$1(EntryBannerVI.Content.Block.Subtitle subtitle, Function1<? super b, Unit> function1, e eVar, int i11, int i12) {
        super(2);
        this.$state = subtitle;
        this.$onAtomAction = function1;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        EntryBannerComposableKt.SubtitleBlock(this.$state, this.$onAtomAction, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
