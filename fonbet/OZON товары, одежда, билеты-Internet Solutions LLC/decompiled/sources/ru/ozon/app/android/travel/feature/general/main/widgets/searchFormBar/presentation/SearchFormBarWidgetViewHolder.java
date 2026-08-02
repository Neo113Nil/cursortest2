package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.view.SearchFormBarView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO;", "Ll10/i;", "container", "Landroid/view/ViewGroup;", "composerRoot", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;", "view", "<init>", "(Ll10/i;Landroid/view/ViewGroup;Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "scrollToTop", "(Landroid/view/ViewGroup;Lru/ozon/uni/atoms/af/AtomAction;)Z", "", "addView", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO;)V", "removeView", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormBarWidgetViewHolder extends AbstractC6065b<SearchFormBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final ViewGroup composerRoot;

    @NotNull
    private final View metricView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final SearchFormBarView view;

    public SearchFormBarWidgetViewHolder(@NotNull i container, ViewGroup viewGroup, @NotNull SearchFormBarView view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        this.composerRoot = viewGroup;
        this.view = view;
        this.tokenizedAnalytics = container.X();
        this.actionHandler = new ActionHandler.Builder(container, this).onPreProcess(new SearchFormBarWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.metricView = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean scrollToTop(ViewGroup composerRoot, AtomAction action) {
        RecyclerView composerRecyclerViewOrNull;
        if (composerRoot == null) {
            return false;
        }
        boolean d11 = Intrinsics.d(action.getId(), "scrollToTop");
        if (d11) {
            AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(composerRoot);
            if (composerAppbar == null || (composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(composerRoot)) == null) {
                return false;
            }
            composerRecyclerViewOrNull.scrollToPosition(0);
            composerAppbar.t(true, true);
        }
        return d11;
    }

    @Override // d20.AbstractC6065b
    public void addView() {
        ViewGroup viewGroup = this.composerRoot;
        if (viewGroup != null) {
            viewGroup.addView(this.view);
        }
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void removeView() {
        ViewGroup viewGroup = this.composerRoot;
        if (viewGroup != null) {
            viewGroup.removeView(this.view);
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SearchFormBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, this.actionHandler);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull SearchFormBarVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }
}
