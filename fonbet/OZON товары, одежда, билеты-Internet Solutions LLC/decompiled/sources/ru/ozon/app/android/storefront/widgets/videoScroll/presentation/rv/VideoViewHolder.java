package ru.ozon.app.android.storefront.widgets.videoScroll.presentation.rv;

import CG.c;
import WZ.l;
import WZ.t;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.storefront.widgets.videoScroll.presentation.Item;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/rv/VideoViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/rv/VideoItemView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/rv/VideoItemView;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Item;", "video", "bind", "(Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Item;)V", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/rv/VideoItemView;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "itemVideo", "Lru/ozon/app/android/storefront/widgets/videoScroll/presentation/Item;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private Item itemVideo;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final VideoItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VideoViewHolder(@NotNull VideoItemView view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        view.setOnClickListener(new c(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(VideoViewHolder videoViewHolder, View view) {
        t tokenizedEvent;
        AtomAction action;
        Item item = videoViewHolder.itemVideo;
        if (item != null && (action = item.getAction()) != null) {
            videoViewHolder.actionHandler.invoke(action);
        }
        Item item2 = videoViewHolder.itemVideo;
        if (item2 == null || (tokenizedEvent = item2.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(videoViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }

    public final void bind(@NotNull Item video) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.itemVideo = video;
        this.view.bindImage(video.getImage());
        this.view.bindBadge(video.getTimeBadge());
        this.view.bindTitle(video.getTitle());
        this.view.bindOrGoneAdvBadge(video.getAdvBadge(), this.actionHandler);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        Item item = this.itemVideo;
        if (item == null || (tokenizedEvent = item.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
