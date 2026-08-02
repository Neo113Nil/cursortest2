package ru.ozon.app.android.search.catalog.components.clusters.presentation;

import L2.c;
import WZ.t;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersVO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 &2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001&B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Ll10/i;", "screenContainer", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersScrollViewModel;", "viewModel", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Ll10/i;Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersScrollViewModel;)V", "", "saveScrollState", "()V", "restoreScrollState", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Ll10/i;", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersScrollViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersAdapter;", "clusterAdapter", "Lru/ozon/app/android/search/catalog/components/clusters/presentation/ClustersAdapter;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ClustersWidgetViewHolder extends k<ClustersVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ClustersAdapter clusterAdapter;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final i screenContainer;

    @NotNull
    private final ClustersScrollViewModel viewModel;
    public static final int $stable = 8;
    private static final int scrollOffset = UiExtKt.toPx(16);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClustersWidgetViewHolder(@NotNull RecyclerView recyclerView, @NotNull i screenContainer, @NotNull ClustersScrollViewModel viewModel) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.recyclerView = recyclerView;
        this.screenContainer = screenContainer;
        this.viewModel = viewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(screenContainer, this).onPreProcess(new ClustersWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        ClustersAdapter clustersAdapter = new ClustersAdapter(buildHandler, this);
        this.clusterAdapter = clustersAdapter;
        recyclerView.setAdapter(clustersAdapter);
        recyclerView.addItemDecoration(new ClustersDecorator());
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersWidgetViewHolder$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                if (newState == 0) {
                    ClustersWidgetViewHolder.this.saveScrollState();
                }
            }
        });
        final AbstractC5434v lifecycle = screenContainer.K().f().getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            this.recyclerView.clearOnScrollListeners();
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersWidgetViewHolder$special$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.recyclerView.clearOnScrollListeners();
                    AbstractC5434v.this.e(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3(ClustersWidgetViewHolder clustersWidgetViewHolder, ClustersVO clustersVO) {
        CommonControlSettings common;
        if (clustersWidgetViewHolder.viewModel.getLayoutManagerState() != null) {
            clustersWidgetViewHolder.restoreScrollState();
            return;
        }
        Iterator<ClustersVO.ClusterVO> it = clustersVO.getClusters().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            CellDTO.RightBlock rightBlock = it.next().getCell().getRightBlock();
            if (((rightBlock == null || (common = rightBlock.getCommon()) == null) ? null : common.getAction()) != null) {
                break;
            } else {
                i11++;
            }
        }
        int i12 = i11 >= 0 ? i11 : 0;
        RecyclerView.o layoutManager = clustersWidgetViewHolder.recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.scrollToPositionWithOffset(i12, scrollOffset);
        }
    }

    private final void restoreScrollState() {
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(this.viewModel.getLayoutManagerState());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveScrollState() {
        ClustersScrollViewModel clustersScrollViewModel = this.viewModel;
        RecyclerView.o layoutManager = this.recyclerView.getLayoutManager();
        clustersScrollViewModel.setLayoutManagerState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ClustersVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.clusterAdapter.submitList(item.getClusters(), new c(2, this, item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ClustersVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((ClustersWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.screenContainer.X(), tokenizedEvent, null, 2, null);
        }
    }
}
