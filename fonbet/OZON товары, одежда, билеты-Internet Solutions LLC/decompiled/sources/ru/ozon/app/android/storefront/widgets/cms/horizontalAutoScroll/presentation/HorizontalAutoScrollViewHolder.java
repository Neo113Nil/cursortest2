package ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import FK.a;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO;", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollView;", "horizontalAutoScrollView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO;Ll20/d;)V", "onViewInVisibleBounds", "()V", "onViewOutOfVisibleBounds", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollView;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "hasSwipeRefresh", "Z", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalAutoScrollViewHolder extends k<HorizontalAutoScrollVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;
    private boolean hasSwipeRefresh;

    @NotNull
    private final HorizontalAutoScrollView horizontalAutoScrollView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalAutoScrollViewHolder(@NotNull HorizontalAutoScrollView horizontalAutoScrollView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences composerReferences) {
        super(horizontalAutoScrollView);
        Intrinsics.checkNotNullParameter(horizontalAutoScrollView, "horizontalAutoScrollView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.horizontalAutoScrollView = horizontalAutoScrollView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.composerReferences = composerReferences;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        horizontalAutoScrollView.setOnWidgetClickListener(new a(this, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HorizontalAutoScrollViewHolder horizontalAutoScrollViewHolder, View view) {
        AtomAction action;
        HorizontalAutoScrollVO boundData = horizontalAutoScrollViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        horizontalAutoScrollViewHolder.actionHandler.invoke(action);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.composerReferences.getController().getEventsFlow(), new HorizontalAutoScrollViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        if (this.hasSwipeRefresh) {
            return;
        }
        HorizontalAutoScrollView horizontalAutoScrollView = this.horizontalAutoScrollView;
        HorizontalAutoScrollVO boundData = getBoundData();
        horizontalAutoScrollView.setScrollState(boundData != null ? boundData.getScrollState() : null);
        HorizontalAutoScrollVO boundData2 = getBoundData();
        if (boundData2 != null) {
            boundData2.setScrollState(null);
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        super.onViewOutOfVisibleBounds();
        HorizontalAutoScrollVO boundData = getBoundData();
        if (boundData != null) {
            boundData.setScrollState(this.horizontalAutoScrollView.getScrollState());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HorizontalAutoScrollVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.horizontalAutoScrollView.bind(item, this.hasSwipeRefresh);
        this.hasSwipeRefresh = false;
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HorizontalAutoScrollVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
