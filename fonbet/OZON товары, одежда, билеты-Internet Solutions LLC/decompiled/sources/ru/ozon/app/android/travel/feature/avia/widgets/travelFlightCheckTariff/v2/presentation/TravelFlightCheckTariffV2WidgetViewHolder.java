package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation;

import De.s;
import Sc.o;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i10.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetFlightCheckTariffV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2VO;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2WidgetViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.TravelFlightCheckTariffV2Adapter;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.TravelFlightCheckTariffV2ItemDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.view.TravelFlightCheckTariffView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ%\u0010\u001f\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u000eJ#\u0010'\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2ViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "setUpRoot", "()V", "setUpRecyclerView", "observeLiveData", "", "isVisible", "setProgress", "(Z)V", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2ViewModel$Result;", "result", "handleResult", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2ViewModel$Result;)V", "showError", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "tariffs", "", "scrollPosition", "showTariffs", "(Ljava/util/List;I)V", "cancelJob", "onRecycle", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO;Ll20/d;)V", "onAttach", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2ViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetFlightCheckTariffV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetFlightCheckTariffV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/adapter/TravelFlightCheckTariffV2Adapter;", "tariffAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/adapter/TravelFlightCheckTariffV2Adapter;", "Lxe/M;", "viewHolderScope", "Lxe/M;", "Lxe/B0;", "calcHeightJob", "Lxe/B0;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TravelFlightCheckTariffV2WidgetViewHolder extends k<TravelFlightCheckTariffV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetFlightCheckTariffV2Binding binding;
    private B0 calcHeightJob;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TravelFlightCheckTariffV2Adapter tariffAdapter;

    @NotNull
    private final M viewHolderScope;

    @NotNull
    private final TravelFlightCheckTariffV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelFlightCheckTariffV2WidgetViewHolder(@NotNull View containerView, @NotNull TravelFlightCheckTariffV2ViewModel viewModel, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.references = references;
        WidgetFlightCheckTariffV2Binding bind = WidgetFlightCheckTariffV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.tariffAdapter = new TravelFlightCheckTariffV2Adapter(new TravelFlightCheckTariffV2WidgetViewHolder$tariffAdapter$1(viewModel));
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.viewHolderScope = N.a(CoroutineContext.Element.a.d(s.f6650a, (H0) b11));
        setUpRoot();
        setUpRecyclerView();
    }

    private final void cancelJob() {
        B0 b02 = this.calcHeightJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.calcHeightJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(TravelFlightCheckTariffV2ViewModel.Result result) {
        if (result instanceof TravelFlightCheckTariffV2ViewModel.Result.Success) {
            this.actionHandler.invoke(((TravelFlightCheckTariffV2ViewModel.Result.Success) result).getAction());
        } else {
            if (!Intrinsics.d(result, TravelFlightCheckTariffV2ViewModel.Result.Error.INSTANCE)) {
                throw new o();
            }
            showError();
        }
    }

    private final void observeLiveData() {
        TravelFlightCheckTariffV2ViewModel travelFlightCheckTariffV2ViewModel = this.viewModel;
        travelFlightCheckTariffV2ViewModel.progressLiveData().observe(this, new TravelFlightCheckTariffV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelFlightCheckTariffV2WidgetViewHolder$observeLiveData$1$1(this)));
        travelFlightCheckTariffV2ViewModel.resultLiveData().observe(this, new TravelFlightCheckTariffV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelFlightCheckTariffV2WidgetViewHolder$observeLiveData$1$2(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setProgress(boolean isVisible) {
        if (isVisible) {
            this.references.getController().e(new l.a.C1079a(0L, null, 3));
        } else {
            this.references.getController().hideLoader();
        }
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = this.binding.travelFlightCheckTariffV2RecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.tariffAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new TravelFlightCheckTariffV2ItemDecoration(context));
        new androidx.recyclerview.widget.s().attachToRecyclerView(recyclerView);
    }

    private final void setUpRoot() {
        this.binding.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
    }

    private final void showError() {
        C4911f container = this.references.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTariffs(List<TravelFlightCheckTariffV2VO.Tariff> tariffs, final int scrollPosition) {
        this.tariffAdapter.setItems(tariffs, new Runnable() { // from class: hN.b
            @Override // java.lang.Runnable
            public final void run() {
                TravelFlightCheckTariffV2WidgetViewHolder.showTariffs$lambda$3(scrollPosition, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTariffs$lambda$3(int i11, TravelFlightCheckTariffV2WidgetViewHolder travelFlightCheckTariffV2WidgetViewHolder) {
        if (i11 >= 0) {
            travelFlightCheckTariffV2WidgetViewHolder.binding.travelFlightCheckTariffV2RecyclerView.smoothScrollToPosition(i11);
        }
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    @Override // jk0.j
    public void onRecycle() {
        cancelJob();
        super.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelFlightCheckTariffV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.initialize(item.getSelectedTariffPosition());
        if (item.getShouldExecuteRefreshAction()) {
            this.viewModel.performAction(item.getRefreshAction());
            return;
        }
        if (item.getTallestTariff() == null) {
            showTariffs(item.getTariffs(), item.getSelectedTariffPosition());
            return;
        }
        View view = this.containerView;
        Intrinsics.g(view, "null cannot be cast to non-null type android.view.ViewGroup");
        TravelFlightCheckTariffView travelFlightCheckTariffView = new TravelFlightCheckTariffView(getContext(), null, 0, 0, 14, null);
        Context context = travelFlightCheckTariffView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        travelFlightCheckTariffView.setLayoutParams(new ViewGroup.LayoutParams(ResourceExtKt.toPx(240, context), -1));
        travelFlightCheckTariffView.setVisibility(4);
        ((ViewGroup) this.containerView).addView(travelFlightCheckTariffView);
        cancelJob();
        this.calcHeightJob = C10727i.c(this.viewHolderScope, null, null, new TravelFlightCheckTariffV2WidgetViewHolder$bind$1(travelFlightCheckTariffView, this, item, null), 3);
    }
}
