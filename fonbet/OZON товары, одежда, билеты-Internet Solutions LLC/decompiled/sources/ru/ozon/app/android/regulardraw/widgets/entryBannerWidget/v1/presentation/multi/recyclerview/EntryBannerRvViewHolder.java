package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.multi.recyclerview;

import BC.a;
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
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.Banner;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.presentation.view.EntryBannerView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/multi/recyclerview/EntryBannerRvViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerView;", "entryBannerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerView;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;", "banner", "bind", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/view/EntryBannerView;", "LWZ/l;", "Lkotlin/jvm/functions/Function1;", "itemBanner", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/presentation/Banner;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerRvViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final EntryBannerView entryBannerView;
    private Banner itemBanner;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EntryBannerRvViewHolder(@NotNull EntryBannerView entryBannerView, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(entryBannerView);
        Intrinsics.checkNotNullParameter(entryBannerView, "entryBannerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.entryBannerView = entryBannerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = actionHandler;
        entryBannerView.setOnClickListener(new a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(EntryBannerRvViewHolder entryBannerRvViewHolder, View view) {
        AtomAction action;
        Banner banner = entryBannerRvViewHolder.itemBanner;
        if (banner == null || (action = banner.getAction()) == null) {
            return;
        }
        entryBannerRvViewHolder.actionHandler.invoke(action);
    }

    public final void bind(@NotNull Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.itemBanner = banner;
        this.entryBannerView.bind(banner, this.actionHandler);
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent;
        super.onViewInVisibleBounds();
        Banner banner = this.itemBanner;
        if (banner == null || (tokenizedEvent = banner.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
