package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton;

import Sc.o;
import T00.m;
import Vg.d;
import WZ.l;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.decoration.AviaSearchResultV4Decoration;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.adapter.AviaSearchResultV4LoadingAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4LoadingVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateBottomButtonsView;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import v10.C10183a;

@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u0006B7\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0019H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u00020\u00192\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00192\u0006\u00101\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J'\u0010?\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00192\u0006\u0010A\u001a\u00020=H\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010DR\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR \u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00190G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR,\u0010S\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020R0Q\u0012\u0004\u0012\u00020\u00190G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010JR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u0014\u0010^\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\\R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010c\u001a\u0004\u0018\u00010b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010f\u001a\u0004\u0018\u00010e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010i\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010k\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010r\u001a\u0004\u0018\u00010o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LVg/d;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO;Ll20/d;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "()V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State$FetchState;", "state", "asyncData", "handleFetchState", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State$FetchState;Ljava/lang/String;)V", "", "hasOpenedDialogFragment", "()Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State$Refresh;", "handleRefresh", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State$Refresh;)V", "view", "containerItem", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "vo", "bindOnBoarding", "(Landroid/view/View;Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "onBoarding", "initDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onBoardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Landroid/widget/FrameLayout;", "container", "Landroid/widget/FrameLayout;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackViewEvent", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/adapter/AviaSearchResultV4LoadingAdapter;", "loadAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/adapter/AviaSearchResultV4LoadingAdapter;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "dp4", "I", "dp8", "dp16", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/decoration/AviaSearchResultV4Decoration;", "rvDecorator", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/decoration/AviaSearchResultV4Decoration;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateBottomButtonsView;", "emptyStateView", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateBottomButtonsView;", "Lkotlin/Function0;", "resumeCallBack", "Lkotlin/jvm/functions/Function0;", "widgetName", "Ljava/lang/String;", "refreshTriggered", "Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingWidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/AviaSearchResultV4LoadingWidgetViewModel;", "widgetViewModel", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4LoadingWidgetViewHolder extends k<AviaSearchResultV4LoadingVO> implements AsyncWidgetCallbacks<AviaSearchResultV4LoadingVO.State>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final FrameLayout container;
    private final int dp16;
    private final int dp4;
    private final int dp8;
    private final EmptyStateBottomButtonsView emptyStateView;

    @NotNull
    private final LinearLayoutManager linearLayoutManager;

    @NotNull
    private final AviaSearchResultV4LoadingAdapter loadAdapter;
    private OnBoardingDelegate onBoardingDelegate;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;
    private final RecyclerView recyclerView;
    private boolean refreshTriggered;

    @NotNull
    private final ComposerReferences refs;
    private Function0<Unit> resumeCallBack;

    @NotNull
    private final AviaSearchResultV4Decoration rvDecorator;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final Function1<Map<String, TokenizedTrackingInfo>, Unit> trackViewEvent;
    private String widgetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaSearchResultV4LoadingWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onBoardingViewModel = onBoardingViewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new AviaSearchResultV4LoadingWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        FrameLayout frameLayout = containerView instanceof FrameLayout ? (FrameLayout) containerView : null;
        this.container = frameLayout;
        AviaSearchResultV4LoadingWidgetViewHolder$trackViewEvent$1 aviaSearchResultV4LoadingWidgetViewHolder$trackViewEvent$1 = new AviaSearchResultV4LoadingWidgetViewHolder$trackViewEvent$1(this);
        this.trackViewEvent = aviaSearchResultV4LoadingWidgetViewHolder$trackViewEvent$1;
        AviaSearchResultV4LoadingAdapter aviaSearchResultV4LoadingAdapter = new AviaSearchResultV4LoadingAdapter(this, buildHandler, new AviaSearchResultV4LoadingWidgetViewHolder$loadAdapter$1(this), refs.getComposerViewPoolProvider().getViewPool(), aviaSearchResultV4LoadingWidgetViewHolder$trackViewEvent$1);
        this.loadAdapter = aviaSearchResultV4LoadingAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.linearLayoutManager = linearLayoutManager;
        this.dp4 = ResourceExtKt.toPx(4, getContext());
        this.dp8 = ResourceExtKt.toPx(8, getContext());
        this.dp16 = ResourceExtKt.toPx(16, getContext());
        AviaSearchResultV4Decoration aviaSearchResultV4Decoration = new AviaSearchResultV4Decoration(getContext());
        this.rvDecorator = aviaSearchResultV4Decoration;
        View childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(aviaSearchResultV4LoadingAdapter);
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.addItemDecoration(aviaSearchResultV4Decoration);
            recyclerView.setRecycledViewPool(refs.getComposerViewPoolProvider().getViewPool());
        } else {
            recyclerView = null;
        }
        this.recyclerView = recyclerView;
        KeyEvent.Callback childAt2 = frameLayout != null ? frameLayout.getChildAt(1) : null;
        this.emptyStateView = childAt2 instanceof EmptyStateBottomButtonsView ? (EmptyStateBottomButtonsView) childAt2 : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindOnBoarding(View view, View containerItem, OnBoardingDTO vo) {
        if (this.refreshTriggered) {
            return;
        }
        ComposerExtKt.withPageTag(this.refs.getContainer(), new AviaSearchResultV4LoadingWidgetViewHolder$bindOnBoarding$1(this, vo, view, containerItem));
    }

    private final AviaSearchResultV4LoadingWidgetViewModel getWidgetViewModel() {
        return (AviaSearchResultV4LoadingWidgetViewModel) getWidgetViewModel();
    }

    private final void handleFetchState(AviaSearchResultV4LoadingVO.State.FetchState state, String asyncData) {
        AviaSearchResultV4LoadingWidgetViewModel widgetViewModel;
        if (asyncData != null && (widgetViewModel = getWidgetViewModel()) != null) {
            widgetViewModel.fetchWidgetWithParams(asyncData, state.getAsyncParams());
        }
        AviaSearchResultV4LoadingWidgetViewHolder$handleFetchState$callback$1 aviaSearchResultV4LoadingWidgetViewHolder$handleFetchState$callback$1 = new AviaSearchResultV4LoadingWidgetViewHolder$handleFetchState$callback$1(this, state);
        if (hasOpenedDialogFragment()) {
            this.resumeCallBack = aviaSearchResultV4LoadingWidgetViewHolder$handleFetchState$callback$1;
        } else {
            aviaSearchResultV4LoadingWidgetViewHolder$handleFetchState$callback$1.invoke();
        }
    }

    private final void handleRefresh(AviaSearchResultV4LoadingVO.State.Refresh state) {
        AviaSearchResultV4LoadingWidgetViewHolder$handleRefresh$callback$1 aviaSearchResultV4LoadingWidgetViewHolder$handleRefresh$callback$1 = new AviaSearchResultV4LoadingWidgetViewHolder$handleRefresh$callback$1(state, this);
        if (hasOpenedDialogFragment()) {
            this.resumeCallBack = aviaSearchResultV4LoadingWidgetViewHolder$handleRefresh$callback$1;
        } else {
            this.refreshTriggered = true;
            aviaSearchResultV4LoadingWidgetViewHolder$handleRefresh$callback$1.invoke();
        }
    }

    private final boolean hasOpenedDialogFragment() {
        G supportFragmentManager;
        List<ComponentCallbacksC5392m> r02;
        r a11 = this.refs.getContainer().a();
        Object obj = null;
        if (a11 != null && (supportFragmentManager = a11.getSupportFragmentManager()) != null && (r02 = supportFragmentManager.r0()) != null) {
            Iterator<T> it = r02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ComponentCallbacksC5392m) next) instanceof DialogInterfaceOnCancelListenerC5390k) {
                    obj = next;
                    break;
                }
            }
            obj = (ComponentCallbacksC5392m) obj;
        }
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDelegate(OnBoardingDTO onBoarding) {
        String onboardingKey = onBoarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "avia_search_result_v4_onboarding_key";
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.refs, this.itemView, onBoarding, this, this.onBoardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new AviaSearchResultV4LoadingWidgetViewHolder$initDelegate$1$1(this));
        this.onBoardingDelegate = onBoardingDelegateImpl;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<AviaSearchResultV4LoadingVO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.refs.getController().update(AviaSearchResultV4LoadingUpdate.m1076boximpl(AviaSearchResultV4LoadingUpdate.m1077constructorimpl(fetchedModel.getFetchedState())));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        EmptyStateVO asyncErrorMessage;
        EmptyStateBottomButtonsView emptyStateBottomButtonsView;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Lm0.a.f17149a.e(throwable);
        AviaSearchResultV4LoadingVO boundData = getBoundData();
        AviaSearchResultV4LoadingVO.State state = boundData != null ? boundData.getState() : null;
        AviaSearchResultV4LoadingVO.State.FetchState fetchState = state instanceof AviaSearchResultV4LoadingVO.State.FetchState ? (AviaSearchResultV4LoadingVO.State.FetchState) state : null;
        if (fetchState != null && (asyncErrorMessage = fetchState.getAsyncErrorMessage()) != null && (emptyStateBottomButtonsView = this.emptyStateView) != null) {
            emptyStateBottomButtonsView.bind(asyncErrorMessage, this.actionHandler);
        }
        EmptyStateBottomButtonsView emptyStateBottomButtonsView2 = this.emptyStateView;
        if (emptyStateBottomButtonsView2 != null) {
            ViewExtKt.show(emptyStateBottomButtonsView2);
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            ViewExtKt.gone(recyclerView);
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        AviaSearchResultV4LoadingWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        ComposerExtKt.withPageTag(this.refs.getContainer(), new AviaSearchResultV4LoadingWidgetViewHolder$onDetach$1(this));
        this.onBoardingDelegate = null;
        super.onDetach();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        EmptyStateBottomButtonsView emptyStateBottomButtonsView;
        View view;
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        int height = info.a().e().height();
        int i11 = info.b().top - info.a().e().top;
        int height2 = info.a().d().height();
        int i12 = (height - i11) + height2;
        if (height > 0) {
            View view2 = this.itemView;
            if (this.rvDecorator.getBottomOverlapHeight() != height2) {
                this.rvDecorator.setBottomOverlapHeight(height2);
                RecyclerView recyclerView = this.recyclerView;
                if (recyclerView != null) {
                    recyclerView.invalidateItemDecorations();
                }
            }
            if (view2.getHeight() != i12) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = i12;
                view2.setLayoutParams(layoutParams);
                ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
                if (c11 == null || (view = c11.getView()) == null || C10183a.i(view).computeVerticalScrollOffset() != 0) {
                    this.refs.getController().l(0);
                }
            }
            EmptyStateBottomButtonsView emptyStateBottomButtonsView2 = this.emptyStateView;
            if ((emptyStateBottomButtonsView2 == null || emptyStateBottomButtonsView2.getHeight() != i12) && (emptyStateBottomButtonsView = this.emptyStateView) != null) {
                ViewGroup.LayoutParams layoutParams2 = emptyStateBottomButtonsView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = i12;
                emptyStateBottomButtonsView.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        l20.d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AviaSearchResultV4LoadingVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.refreshTriggered = false;
        this.widgetName = info.c().e();
        AviaSearchResultV4LoadingVO.State state = item.getState();
        if (state instanceof AviaSearchResultV4LoadingVO.State.FetchState) {
            handleFetchState((AviaSearchResultV4LoadingVO.State.FetchState) item.getState(), item.getAsyncData());
        } else {
            if (!(state instanceof AviaSearchResultV4LoadingVO.State.Refresh)) {
                throw new o();
            }
            handleRefresh((AviaSearchResultV4LoadingVO.State.Refresh) item.getState());
        }
    }
}
