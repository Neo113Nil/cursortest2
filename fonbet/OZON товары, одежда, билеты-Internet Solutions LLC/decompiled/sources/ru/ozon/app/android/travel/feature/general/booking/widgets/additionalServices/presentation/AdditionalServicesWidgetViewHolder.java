package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import El.C2971a;
import Lm0.a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellsAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesControlActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesInfoActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffActionWrapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.view.AdditionalServicesView;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalIsLoadingUpdate;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared.HotelsBookTotalRefreshStateUpdate;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J/\u0010%\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/view/AdditionalServicesView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/view/AdditionalServicesView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel;LWZ/l;)V", "vo", "", "handleState", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "event", "handleEvent", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel$Event;)V", "showError", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;Ll20/d;)V", "onAttach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/view/AdditionalServicesView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesViewModel;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellsAdapter;", "cellsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellsAdapter;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesWidgetViewHolder extends k<AdditionalServicesVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private AdditionalServicesCellsAdapter cellsAdapter;

    @NotNull
    private final AdditionalServicesView containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AdditionalServicesViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesWidgetViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<AdditionalServicesControlActionWrapper, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, AdditionalServicesViewModel.class, "onControlActionWrapperClicked", "onControlActionWrapperClicked(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesControlActionWrapper;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AdditionalServicesControlActionWrapper additionalServicesControlActionWrapper) {
            invoke2(additionalServicesControlActionWrapper);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdditionalServicesControlActionWrapper p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((AdditionalServicesViewModel) this.receiver).onControlActionWrapperClicked(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesWidgetViewHolder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function1<AdditionalServicesInfoActionWrapper, Unit> {
        AnonymousClass2(Object obj) {
            super(1, obj, AdditionalServicesViewModel.class, "onInfoActionWrapperClicked", "onInfoActionWrapperClicked(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesInfoActionWrapper;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AdditionalServicesInfoActionWrapper additionalServicesInfoActionWrapper) {
            invoke2(additionalServicesInfoActionWrapper);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdditionalServicesInfoActionWrapper p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((AdditionalServicesViewModel) this.receiver).onInfoActionWrapperClicked(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesWidgetViewHolder$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<AdditionalServicesTariffActionWrapper, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, AdditionalServicesViewModel.class, "onTariffActionWrapperClicked", "onTariffActionWrapperClicked(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffActionWrapper;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AdditionalServicesTariffActionWrapper additionalServicesTariffActionWrapper) {
            invoke2(additionalServicesTariffActionWrapper);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdditionalServicesTariffActionWrapper p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((AdditionalServicesViewModel) this.receiver).onTariffActionWrapperClicked(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalServicesWidgetViewHolder(@NotNull AdditionalServicesView containerView, @NotNull ComposerReferences references, @NotNull AdditionalServicesViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).onClick(new AdditionalServicesWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AdditionalServicesCellsAdapter additionalServicesCellsAdapter = new AdditionalServicesCellsAdapter(getContext(), this, buildHandler, new AnonymousClass1(viewModel), new AnonymousClass2(viewModel), new AnonymousClass3(viewModel), viewModel.getTariffScrollStates());
        containerView.setupCellsRecyclerView(additionalServicesCellsAdapter);
        this.cellsAdapter = additionalServicesCellsAdapter;
    }

    private final void handleEvent(AdditionalServicesViewModel.Event<AdditionalServicesVO.State.Loaded> event) {
        if (event instanceof AdditionalServicesViewModel.Event.OnWidgetJobsCountChanged) {
            this.references.getController().update(new HotelsBookTotalIsLoadingUpdate(((AdditionalServicesViewModel.Event.OnWidgetJobsCountChanged) event).getHasRunningJobs()));
            return;
        }
        if (event instanceof AdditionalServicesViewModel.Event.OnWidgetFetched) {
            Map<String, String> trackingPayloads = ((AdditionalServicesViewModel.Event.OnWidgetFetched) event).getFetchedModel().getTrackingPayloads();
            if (trackingPayloads != null) {
                this.tokenizedAnalytics.e(trackingPayloads);
            }
            this.references.getController().update(new HotelsBookTotalRefreshStateUpdate(null, 1, null));
            return;
        }
        if (!(event instanceof AdditionalServicesViewModel.Event.OnWidgetFetchingFailed)) {
            throw new o();
        }
        a.f17149a.e(((AdditionalServicesViewModel.Event.OnWidgetFetchingFailed) event).getThrowable());
        showError();
    }

    private final void handleState(AdditionalServicesVO vo) {
        List<AdditionalServicesCellVO> cells;
        this.containerView.bindOrGone(vo, this.actionHandler);
        AdditionalServicesVO.State state = vo.getState();
        if (state instanceof AdditionalServicesVO.State.Loaded) {
            AdditionalServicesVO.State.Loaded loaded = (AdditionalServicesVO.State.Loaded) state;
            if (loaded.getShowMoreButton() == null || (cells = loaded.getCells().subList(0, Math.min(loaded.getCellsCount(), loaded.getCells().size()))) == null) {
                cells = loaded.getCells();
            }
            AdditionalServicesCellsAdapter additionalServicesCellsAdapter = this.cellsAdapter;
            if (additionalServicesCellsAdapter != null) {
                additionalServicesCellsAdapter.submitList(cells);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$lambda$1$handleEvent(AdditionalServicesWidgetViewHolder additionalServicesWidgetViewHolder, AdditionalServicesViewModel.Event event, d dVar) {
        additionalServicesWidgetViewHolder.handleEvent(event);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$lambda$1$handleState(AdditionalServicesWidgetViewHolder additionalServicesWidgetViewHolder, AdditionalServicesVO additionalServicesVO, d dVar) {
        additionalServicesWidgetViewHolder.handleState(additionalServicesVO);
        return Unit.f71690a;
    }

    private final void showError() {
        ViewGroup b11 = C2971a.b(this.references);
        if (b11 != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this, 62, null).show();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        AdditionalServicesViewModel additionalServicesViewModel = this.viewModel;
        M0<AdditionalServicesVO> state = additionalServicesViewModel.getState();
        AbstractC5434v lifecycle = getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2399j.C(new C2408n0(C5427n.a(state, lifecycle, bVar), new AdditionalServicesWidgetViewHolder$onAttach$1$1(this)), K.a(this));
        C2399j.C(new C2408n0(C5427n.a(additionalServicesViewModel.getEvent(), getLifecycle(), bVar), new AdditionalServicesWidgetViewHolder$onAttach$1$2(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalServicesVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.onBindWidgetViewHolder(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull AdditionalServicesVO item, @NotNull c trackingData, f viewedPond) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((AdditionalServicesWidgetViewHolder) item, trackingData, viewedPond);
        if (!(item.getState() instanceof AdditionalServicesVO.State.Loaded) || (trackingInfo = ((AdditionalServicesVO.State.Loaded) item.getState()).getTrackingInfo()) == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
    }
}
