package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.core;

import e3.n;
import e3.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerVI;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerViewModel;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le3/o;", "Le3/n;", "invoke", "(Le3/o;)Le3/n;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class EntryBannerWidgetKt$EntryBannerWidget$1$3$2$1$1$1 extends AbstractC7737t implements Function1<o, n> {
    final /* synthetic */ i<EntryBannerVI.Content> $this_content;
    final /* synthetic */ EntryBannerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EntryBannerWidgetKt$EntryBannerWidget$1$3$2$1$1$1(EntryBannerViewModel entryBannerViewModel, i<EntryBannerVI.Content> iVar) {
        super(1);
        this.$viewModel = entryBannerViewModel;
        this.$this_content = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final n invoke(final o LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        this.$viewModel.onWidgetAppeared(this.$this_content.b());
        return new n() { // from class: ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.core.EntryBannerWidgetKt$EntryBannerWidget$1$3$2$1$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // e3.n
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }
}
