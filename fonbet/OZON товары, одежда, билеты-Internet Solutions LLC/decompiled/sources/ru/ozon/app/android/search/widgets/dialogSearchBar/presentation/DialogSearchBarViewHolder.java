package ru.ozon.app.android.search.widgets.dialogSearchBar.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import android.view.View;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;
import ru.ozon.app.android.search.widgets.utils.SearchAiUtilsKt;
import ru.ozon.composer.ui.widget.l;
import xe.E0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarViewHolder;", "Ld20/b;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;", "Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "viewModel", "Ll10/i;", "container", "<init>", "(Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;Ll10/i;)V", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;)V", "Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "Ll10/i;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchBarViewHolder extends AbstractC6065b<DialogSearchBarVO> {

    @NotNull
    private final i container;
    private final View metricView;

    @NotNull
    private final DialogSearchViewModel viewModel;
    public static final int $stable = 8;

    public DialogSearchBarViewHolder(@NotNull DialogSearchViewModel viewModel, @NotNull i container) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        this.viewModel = viewModel;
        this.container = container;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        C2399j.C(new C2408n0(C2399j.o(this.container.M().getEventsFlow()), new DialogSearchBarViewHolder$onWidgetCreated$1(this, null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        E0.d(K.a(this).getCoroutineContext());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull DialogSearchBarVO item) {
        List<l> list;
        List<l> list2;
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.onSearchBarModelUpdated(item);
        String c11 = this.container.J().r().b().m().c();
        this.viewModel.setCurrentPage(c11);
        this.viewModel.setRefreshUrl(c11);
        this.viewModel.onSearchInputState(SearchAiUtilsKt.isAiInitMode(c11));
        Map<String, List<l>> nestedWidgets = getNestedWidgets();
        l lVar = null;
        l lVar2 = (nestedWidgets == null || (list2 = nestedWidgets.get("topFiltersTagList")) == null) ? null : (l) C7714v.Q(0, list2);
        Map<String, List<l>> nestedWidgets2 = getNestedWidgets();
        if (nestedWidgets2 != null && (list = nestedWidgets2.get("default")) != null) {
            lVar = (l) C7714v.Q(0, list);
        }
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        if (lVar2 == null) {
            lVar2 = lVar;
        }
        dialogSearchViewModel.insertNestedWidget(lVar2);
    }
}
