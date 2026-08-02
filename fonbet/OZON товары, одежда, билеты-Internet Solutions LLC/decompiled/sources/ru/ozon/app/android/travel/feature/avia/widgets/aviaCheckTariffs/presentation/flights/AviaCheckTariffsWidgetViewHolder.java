package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import El.C2971a;
import T00.m;
import Vg.d;
import WZ.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.b;
import lx.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.adapter.AviaCheckTariffsAdapter;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B3\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u001f\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00132\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00130<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010I\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Landroid/view/ViewGroup;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsViewModel;LVg/d;)V", "", "cancelJob", "()V", "", "targetHeight", "applyNewHeight", "(I)V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "onRecycle", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsViewModel;", "Lxe/B0;", "job", "Lxe/B0;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/adapter/AviaCheckTariffsAdapter;", "tariffsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/adapter/AviaCheckTariffsAdapter;", "scrollOffset", "I", "lastSelectedCardIndex", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsViewWidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsViewWidgetViewModel;", "widgetViewModel", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsWidgetViewHolder extends k<AviaCheckTariffsVO> implements AsyncWidgetCallbacks<AviaCheckTariffsVO.Content>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private B0 job;
    private int lastSelectedCardIndex;

    @NotNull
    private final LinearLayoutManager linearLayoutManager;
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences refs;
    private final int scrollOffset;

    @NotNull
    private final AviaCheckTariffsAdapter tariffsAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AviaCheckTariffsViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AviaCheckTariffsDTO.AsyncBehaviorType.values().length];
            try {
                iArr[AviaCheckTariffsDTO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AviaCheckTariffsDTO.AsyncBehaviorType.REFRESH_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsWidgetViewHolder(@NotNull ViewGroup containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull AviaCheckTariffsViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        View childAt = containerView.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        this.recyclerView = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.linearLayoutManager = linearLayoutManager;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new AviaCheckTariffsWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        AviaCheckTariffsAdapter aviaCheckTariffsAdapter = new AviaCheckTariffsAdapter(this, tokenizedAnalytics, new AviaCheckTariffsWidgetViewHolder$tariffsAdapter$2(this), new AviaCheckTariffsWidgetViewHolder$tariffsAdapter$1(viewModel), refs.getComposerViewPoolProvider().getViewPool());
        this.tariffsAdapter = aviaCheckTariffsAdapter;
        this.lastSelectedCardIndex = -1;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(aviaCheckTariffsAdapter);
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.addItemDecoration(new AviaCheckTariffDecoration(context));
            Context context2 = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$default(recyclerView, UiExtKt.toPx(290, context2), K.a(this), 0, new AviaCheckTariffsWidgetViewHolder$1$1(this), 4, (Object) null);
        }
        this.scrollOffset = ((getContext().getResources().getDisplayMetrics().widthPixels - UiExtKt.toPx(290, getContext())) / 2) - UiExtKt.toPx(8, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyNewHeight(int targetHeight) {
        this.viewModel.setCachedHeight(targetHeight);
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null || this.viewModel.getCachedHeight() == recyclerView.getHeight()) {
            return;
        }
        if (recyclerView.getHeight() != 0) {
            ValueAnimator ofInt = ValueAnimator.ofInt(recyclerView.getHeight(), this.viewModel.getCachedHeight());
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new c(recyclerView, 1));
            ofInt.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.viewModel.getCachedHeight();
        recyclerView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyNewHeight$lambda$7$lambda$6$lambda$5(RecyclerView recyclerView, ValueAnimator valueAnimator) {
        int intValue = ((Integer) Bi.a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Int")).intValue();
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = intValue;
        recyclerView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelJob() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
    }

    private final AviaCheckTariffsViewWidgetViewModel getWidgetViewModel() {
        return (AviaCheckTariffsViewWidgetViewModel) getWidgetViewModel();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<AviaCheckTariffsVO.Content> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.refs.getController().update(new AviaCheckTariffsUpdate(AviaCheckTariffsVO.Content.copy$default(fetchedModel.getFetchedState(), null, null, 0, this.linearLayoutManager.onSaveInstanceState(), null, null, 55, null)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ViewGroup b11 = C2971a.b(this.refs);
        if (b11 != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this, 62, null).show();
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C2408n0(new C2406m0(this.viewModel.getWidgetState()), new AviaCheckTariffsWidgetViewHolder$onAttach$1(this, null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        AviaCheckTariffsViewWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.observeEvents(lifecycle, this, this);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        cancelJob();
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
    public void bind(@NotNull AviaCheckTariffsVO item, @NotNull l20.d info) {
        AviaCheckTariffsViewWidgetViewModel widgetViewModel;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getContent().getAsyncBehaviorType().ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            String asyncData = item.getAsyncData();
            if (asyncData != null && (widgetViewModel = getWidgetViewModel()) != null) {
                widgetViewModel.fetchWidgetWithParams(asyncData, item.getContent().getAsyncParams());
            }
        } else if (i11 == 2) {
            InterfaceC7851b.a.e(this.refs.getController(), null, null, null, 7);
        }
        this.tariffsAdapter.setWidgetId(item.getId());
        AviaCheckTariffsViewModel aviaCheckTariffsViewModel = this.viewModel;
        if (aviaCheckTariffsViewModel.getOfferId() != null && Intrinsics.d(this.viewModel.getOfferId(), item.getOfferId())) {
            z11 = false;
        }
        aviaCheckTariffsViewModel.setFirstScrollEnabled(z11);
        this.viewModel.setOfferId(item.getOfferId());
        cancelJob();
        this.viewModel.bindData(item.getContent());
    }
}
