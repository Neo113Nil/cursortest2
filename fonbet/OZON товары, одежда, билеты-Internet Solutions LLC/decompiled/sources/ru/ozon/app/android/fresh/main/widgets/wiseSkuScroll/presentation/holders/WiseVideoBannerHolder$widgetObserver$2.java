package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollLifecycle;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseVideoBannerHolder$widgetObserver$2$1", "invoke", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseVideoBannerHolder$widgetObserver$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseVideoBannerHolder$widgetObserver$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ WiseVideoBannerHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseVideoBannerHolder$widgetObserver$2(WiseVideoBannerHolder wiseVideoBannerHolder) {
        super(0);
        this.this$0 = wiseVideoBannerHolder;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseVideoBannerHolder$widgetObserver$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final WiseVideoBannerHolder wiseVideoBannerHolder = this.this$0;
        return new WiseSkuScrollLifecycle() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseVideoBannerHolder$widgetObserver$2.1
            @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollLifecycle
            public void onDestroy() {
                WiseVideoBannerHolder.this.releasePlayer();
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollLifecycle
            public void onViewIn() {
                SingleInstancePlayerController singleInstancePlayerController;
                singleInstancePlayerController = WiseVideoBannerHolder.this._player;
                if (singleInstancePlayerController != null) {
                    WiseVideoBannerHolder.this.resumePlayer();
                }
            }

            @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollLifecycle
            public void onViewOut() {
                WiseVideoBannerHolder.this.pausePlayer();
            }
        };
    }
}
