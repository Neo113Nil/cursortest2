package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation;

import DS.a;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.view.HotelsGalleryFeedV2ItemView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/view/HotelsGalleryFeedV2ItemView;", "view", "Ll10/i;", "container", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/view/HotelsGalleryFeedV2ItemView;Ll10/i;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", "isLargeImage", "()Z", "hasTopPadding", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/view/HotelsGalleryFeedV2ItemView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFeedV2WidgetViewHolder extends k<HotelsGalleryFeedV2VI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final HotelsGalleryFeedV2ItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsGalleryFeedV2WidgetViewHolder(@NotNull HotelsGalleryFeedV2ItemView view, @NotNull i container, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        view.setOnClickListener(new a(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HotelsGalleryFeedV2WidgetViewHolder hotelsGalleryFeedV2WidgetViewHolder, View view) {
        AtomAction action;
        HotelsGalleryFeedV2VI boundData = hotelsGalleryFeedV2WidgetViewHolder.getBoundData();
        HotelsGalleryFeedV2VI.GalleryImageItem galleryImageItem = boundData instanceof HotelsGalleryFeedV2VI.GalleryImageItem ? (HotelsGalleryFeedV2VI.GalleryImageItem) boundData : null;
        if (galleryImageItem == null || (action = galleryImageItem.getAction()) == null) {
            return;
        }
        hotelsGalleryFeedV2WidgetViewHolder.actionHandler.invoke(action);
    }

    public final boolean hasTopPadding() {
        HotelsGalleryFeedV2VI boundData = getBoundData();
        HotelsGalleryFeedV2VI.GalleryImageItem galleryImageItem = boundData instanceof HotelsGalleryFeedV2VI.GalleryImageItem ? (HotelsGalleryFeedV2VI.GalleryImageItem) boundData : null;
        return galleryImageItem != null && galleryImageItem.getHasTopPadding();
    }

    public final boolean isLargeImage() {
        HotelsGalleryFeedV2VI boundData = getBoundData();
        HotelsGalleryFeedV2VI.GalleryImageItem galleryImageItem = boundData instanceof HotelsGalleryFeedV2VI.GalleryImageItem ? (HotelsGalleryFeedV2VI.GalleryImageItem) boundData : null;
        return galleryImageItem != null && galleryImageItem.getIsLarge();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsGalleryFeedV2VI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsGalleryFeedV2VI item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HotelsGalleryFeedV2WidgetViewHolder) item, trackingData, viewedPond);
        HotelsGalleryFeedV2VI boundData = getBoundData();
        HotelsGalleryFeedV2VI.GalleryImageItem galleryImageItem = boundData instanceof HotelsGalleryFeedV2VI.GalleryImageItem ? (HotelsGalleryFeedV2VI.GalleryImageItem) boundData : null;
        if (galleryImageItem == null || galleryImageItem.getIsViewEventSent()) {
            return;
        }
        t viewEvent = galleryImageItem.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
        galleryImageItem.setViewEventSent(true);
    }
}
