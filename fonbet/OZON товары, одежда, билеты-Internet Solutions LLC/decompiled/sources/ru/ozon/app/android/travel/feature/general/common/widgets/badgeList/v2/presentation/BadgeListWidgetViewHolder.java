package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation;

import Ib.a;
import Sc.InterfaceC4008j;
import T00.m;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter.ItemsAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter.ItemsDecoration;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.adapter.LinesLayoutManager;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B1\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00102R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0012078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO$State;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LIb/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListWidgetViewModel;", "viewModelProvider", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;LIb/a;)V", "", "removeWidget", "()V", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "LIb/a;", "", "horizontalPadding", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager$delegate", "LSc/j;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/LinesLayoutManager;", "linesLayoutManager$delegate", "getLinesLayoutManager", "()Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/LinesLayoutManager;", "linesLayoutManager", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/ItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/adapter/ItemsAdapter;", "", "isNestedWidget", "Z", "getViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListWidgetViewModel;", "viewModel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BadgeListWidgetViewHolder extends k<BadgeListVO> implements AsyncWidgetCallbacks<BadgeListVO.State>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int horizontalPadding;
    private boolean isNestedWidget;

    @NotNull
    private final ItemsAdapter itemsAdapter;

    /* renamed from: linearLayoutManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j linearLayoutManager;

    /* renamed from: linesLayoutManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j linesLayoutManager;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final a<BadgeListWidgetViewModel> viewModelProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeListWidgetViewHolder(@NotNull RecyclerView recyclerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences references, @NotNull a<BadgeListWidgetViewModel> viewModelProvider) {
        super(recyclerView);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.recyclerView = recyclerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.references = references;
        this.viewModelProvider = viewModelProvider;
        this.horizontalPadding = UiExtKt.toPx(16, getContext());
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        this.linearLayoutManager = LazyUtilsKt.unsafeLazy(new BadgeListWidgetViewHolder$linearLayoutManager$2(this));
        this.linesLayoutManager = LazyUtilsKt.unsafeLazy(new BadgeListWidgetViewHolder$linesLayoutManager$2(this));
        ItemsAdapter itemsAdapter = new ItemsAdapter(this, buildHandler);
        this.itemsAdapter = itemsAdapter;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ItemsDecoration(context));
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        recyclerView.setAdapter(itemsAdapter);
        recyclerView.setItemAnimator(null);
    }

    private final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) this.linearLayoutManager.getValue();
    }

    private final LinesLayoutManager getLinesLayoutManager() {
        return (LinesLayoutManager) this.linesLayoutManager.getValue();
    }

    private final BadgeListWidgetViewModel getViewModel() {
        BadgeListWidgetViewModel badgeListWidgetViewModel = (BadgeListWidgetViewModel) getWidgetViewModel();
        if (badgeListWidgetViewModel != null) {
            return badgeListWidgetViewModel;
        }
        this.isNestedWidget = true;
        BadgeListWidgetViewModel badgeListWidgetViewModel2 = this.viewModelProvider.get();
        Intrinsics.checkNotNullExpressionValue(badgeListWidgetViewModel2, "run(...)");
        return badgeListWidgetViewModel2;
    }

    private final void removeWidget() {
        BadgeListVO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().m(boundData.getId());
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<BadgeListVO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        BadgeListVO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().update(new BadgeListUpdateEvent(boundData.getId(), fetchedModel.getFetchedState()));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Lm0.a.f17149a.e(throwable);
        removeWidget();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        getViewModel().observeEvents(lifecycle, this, this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        if (this.isNestedWidget) {
            getViewModel().onCleared();
        }
        super.onDetach();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BadgeListVO item, @NotNull d info) {
        String asyncData;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getState().getIsUpdateRequired() && (asyncData = item.getAsyncData()) != null) {
            getViewModel().fetchWidgetWithParams(asyncData, item.getState().getAsyncParameters());
        }
        RecyclerView recyclerView = this.recyclerView;
        if (item.getState().getIsHorizontalScrollEnabled()) {
            recyclerView.setLayoutManager(getLinearLayoutManager());
            recyclerView.setPadding(0, 0, 0, 0);
        } else {
            LinesLayoutManager linesLayoutManager = getLinesLayoutManager();
            linesLayoutManager.setMaxLines(Integer.valueOf(item.getState().getMaxLines()));
            linesLayoutManager.setLastViewVisibility(item.getState().getIsLastBadgeMustBeVisible());
            recyclerView.setLayoutManager(linesLayoutManager);
            int i11 = this.horizontalPadding;
            recyclerView.setPadding(i11, 0, i11, 0);
        }
        this.itemsAdapter.submitList(item.getState().getItems());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BadgeListVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((BadgeListWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            WZ.m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
