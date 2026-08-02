package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.core;

import androidx.lifecycle.AbstractC5434v;
import e3.p;
import e3.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le3/p;", "Le3/q;", "invoke", "(Le3/p;)Le3/q;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class EntryBannerWidgetKt$EntryBannerWidget$1$4$2$1$1$1 extends AbstractC7737t implements Function1<p, q> {
    final /* synthetic */ EntryBannerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EntryBannerWidgetKt$EntryBannerWidget$1$4$2$1$1$1(EntryBannerViewModel entryBannerViewModel) {
        super(1);
        this.$viewModel = entryBannerViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final q invoke(final p LifecycleStartEffect) {
        Intrinsics.checkNotNullParameter(LifecycleStartEffect, "$this$LifecycleStartEffect");
        final EntryBannerViewModel entryBannerViewModel = this.$viewModel;
        return new q() { // from class: ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.core.EntryBannerWidgetKt$EntryBannerWidget$1$4$2$1$1$1$invoke$$inlined$onStopOrDispose$1
            @Override // e3.q
            public void runStopOrDisposeEffect() {
                if (p.this.getLifecycle().b().compareTo(AbstractC5434v.b.RESUMED) < 0) {
                    entryBannerViewModel.onGoneAwayFromScreen();
                }
            }
        };
    }
}
