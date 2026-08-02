package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseBannerVO;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.PlayerListenersContainer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/video/playerV2/playerController/base/listeners/PlayerListenersContainer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseVideoBannerHolder$playerListener$2 extends AbstractC7737t implements Function0<PlayerListenersContainer> {
    final /* synthetic */ WiseVideoBannerHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseVideoBannerHolder$playerListener$2(WiseVideoBannerHolder wiseVideoBannerHolder) {
        super(0);
        this.this$0 = wiseVideoBannerHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$0(WiseVideoBannerHolder wiseVideoBannerHolder, PlayerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        wiseVideoBannerHolder.resumePlayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(WiseVideoBannerHolder wiseVideoBannerHolder, String str, Exception exc, Boolean bool) {
        String imageUrl;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        wiseVideoBannerHolder.releasePlayer();
        WiseBannerVO item = wiseVideoBannerHolder.getItem();
        if (item == null || (imageUrl = item.getImageUrl()) == null) {
            return;
        }
        wiseVideoBannerHolder.bindBackgroundImage(imageUrl);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PlayerListenersContainer invoke() {
        PlayerListenersContainer.Builder builder = new PlayerListenersContainer.Builder();
        final WiseVideoBannerHolder wiseVideoBannerHolder = this.this$0;
        builder.onReady(new OnReadyPlayerControllerListener() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.b
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnReadyPlayerControllerListener
            public final void onReady(PlayerState playerState) {
                WiseVideoBannerHolder$playerListener$2.invoke$lambda$2$lambda$0(WiseVideoBannerHolder.this, playerState);
            }
        });
        builder.onError(new OnErrorPlayerControllerListener() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.c
            @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
            public final void onError(String str, Exception exc, Boolean bool) {
                WiseVideoBannerHolder$playerListener$2.invoke$lambda$2$lambda$1(WiseVideoBannerHolder.this, str, exc, bool);
            }
        });
        return builder.build();
    }
}
