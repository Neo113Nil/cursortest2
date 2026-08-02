package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.video.manager.ExoManager;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/manager/ExoManager;", "isLiveVideo", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseSkuScrollComponent$Companion$create$1$1$exoManagerProvider$1 extends AbstractC7737t implements Function1<Boolean, ExoManager> {
    final /* synthetic */ WiseSkuScrollComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseSkuScrollComponent$Companion$create$1$1$exoManagerProvider$1(WiseSkuScrollComponent$Companion$create$1$1 wiseSkuScrollComponent$Companion$create$1$1) {
        super(1);
        this.this$0 = wiseSkuScrollComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ExoManager invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    public final ExoManager invoke(boolean z11) {
        VideoController videoController = this.this$0.getVideoController();
        return z11 ? videoController.getExoManagerLive() : videoController.getProgressiveWithCacheExoManager();
    }
}
