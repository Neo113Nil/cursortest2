package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import CX.b;
import Sc.InterfaceC4008j;
import Sc.o;
import V.e;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetPricesHistogramV2Binding;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.OnScrollFinishedListener;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.OnSnapPositionChangeListener;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.RecyclerViewExtKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter.PricesHistogramV2DaysAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter.PricesHistogramV2Decoration;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.adapter.PricesHistogramV2MonthsAdapter;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.selection.toggle.ToggleTitleSubtitleCellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.chip.ChipView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.selection.ToggleTitleSubtitleCellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.chip.ChipHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u001b\u0010#\u001a\u00020\u001a2\n\u0010\"\u001a\u00060 j\u0002`!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010\u001eJ\u000f\u0010&\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010\u001eJ=\u0010,\u001a\u00020\u001a2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u001a2\u0006\u00100\u001a\u00020'H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001aH\u0016¢\u0006\u0004\b3\u0010\u001eJ\u000f\u00104\u001a\u00020\u001aH\u0016¢\u0006\u0004\b4\u0010\u001eJ#\u00109\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u00022\n\u00108\u001a\u000606j\u0002`7H\u0014¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u001a0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010T\u001a\u0004\bY\u0010VR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;", "availableColors", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$MonthVO;", "months", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$DayVO;", "days", "", "isDirect", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;", "flightDirection", "", "setupHistogram", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO$AvailableColorsVO;Ljava/util/List;Ljava/util/List;ZLru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/FlightDirection;)V", "attachSnapHelperWithListener", "()V", "setupViews", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "sendAnalytics", "(LWZ/t;)V", "setupRV", "observeAction", "", "position", "", "totalPrice", "selectedDates", "showDaysState", "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Z)V", "getTextOfButton", "(Ljava/lang/String;)Ljava/lang/String;", "targetPosition", "scrollToPosition", "(I)V", "onAttach", "onDetach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2VO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/PricesHistogramV2ViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetPricesHistogramV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetPricesHistogramV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2DaysAdapter;", "pricesHistogramDaysAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2DaysAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2MonthsAdapter;", "pricesHistogramMonthsAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v2/presentation/adapter/PricesHistogramV2MonthsAdapter;", "Landroidx/recyclerview/widget/s;", "snapHelper", "Landroidx/recyclerview/widget/s;", "isListenersActive", "Z", "findTickets$delegate", "LSc/j;", "getFindTickets", "()Ljava/lang/String;", "findTickets", "findTicketsFrom$delegate", "getFindTicketsFrom", "findTicketsFrom", "Landroidx/recyclerview/widget/RecyclerView$z;", "smoothScroller", "Landroidx/recyclerview/widget/RecyclerView$z;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramV2WidgetViewHolder extends k<PricesHistogramV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetPricesHistogramV2Binding binding;

    @NotNull
    private final View containerView;

    /* renamed from: findTickets$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j findTickets;

    /* renamed from: findTicketsFrom$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j findTicketsFrom;
    private boolean isListenersActive;

    @NotNull
    private final PricesHistogramV2DaysAdapter pricesHistogramDaysAdapter;

    @NotNull
    private final PricesHistogramV2MonthsAdapter pricesHistogramMonthsAdapter;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final RecyclerView.z smoothScroller;

    @NotNull
    private final s snapHelper;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PricesHistogramV2ViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightDirection.values().length];
            try {
                iArr[FlightDirection.THERE_FLIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlightDirection.BACK_FLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PricesHistogramV2WidgetViewHolder(@NotNull View containerView, @NotNull PricesHistogramV2ViewModel viewModel, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetPricesHistogramV2Binding bind = WidgetPricesHistogramV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).onComposerAction(new PricesHistogramV2WidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.pricesHistogramDaysAdapter = new PricesHistogramV2DaysAdapter(new PricesHistogramV2WidgetViewHolder$pricesHistogramDaysAdapter$1(this));
        this.pricesHistogramMonthsAdapter = new PricesHistogramV2MonthsAdapter();
        this.snapHelper = new s();
        this.isListenersActive = true;
        this.findTickets = LazyUtilsKt.unsafeLazy(PricesHistogramV2WidgetViewHolder$findTickets$2.INSTANCE);
        this.findTicketsFrom = LazyUtilsKt.unsafeLazy(PricesHistogramV2WidgetViewHolder$findTicketsFrom$2.INSTANCE);
        final Context context = getContext();
        this.smoothScroller = new r(context) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder$smoothScroller$1
            @Override // androidx.recyclerview.widget.r
            public int calculateDtToFit(int viewStart, int viewEnd, int boxStart, int boxEnd, int snapPreference) {
                return ((boxStart + boxEnd) / 2) - ((viewStart + viewEnd) / 2);
            }

            @Override // androidx.recyclerview.widget.r
            protected int getHorizontalSnapPreference() {
                return -1;
            }
        };
        setupViews();
        setupRV();
    }

    private final void attachSnapHelperWithListener() {
        RecyclerView daysPricesHistogramV2RV = this.binding.daysPricesHistogramV2RV;
        Intrinsics.checkNotNullExpressionValue(daysPricesHistogramV2RV, "daysPricesHistogramV2RV");
        s sVar = this.snapHelper;
        OnSnapPositionChangeListener onSnapPositionChangeListener = new OnSnapPositionChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder$attachSnapHelperWithListener$1
            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.OnSnapPositionChangeListener
            public void onSnapPositionChange(int position) {
                boolean z11;
                PricesHistogramV2ViewModel pricesHistogramV2ViewModel;
                WidgetPricesHistogramV2Binding widgetPricesHistogramV2Binding;
                PricesHistogramV2ViewModel pricesHistogramV2ViewModel2;
                z11 = PricesHistogramV2WidgetViewHolder.this.isListenersActive;
                if (z11) {
                    pricesHistogramV2ViewModel = PricesHistogramV2WidgetViewHolder.this.viewModel;
                    pricesHistogramV2ViewModel.setIsScrollInProgress(true);
                    widgetPricesHistogramV2Binding = PricesHistogramV2WidgetViewHolder.this.binding;
                    RecyclerView.o layoutManager = widgetPricesHistogramV2Binding.daysPricesHistogramV2RV.getLayoutManager();
                    if (layoutManager == null || !layoutManager.isSmoothScrolling()) {
                        pricesHistogramV2ViewModel2 = PricesHistogramV2WidgetViewHolder.this.viewModel;
                        pricesHistogramV2ViewModel2.changePosition(position);
                    }
                }
            }
        };
        OnScrollFinishedListener onScrollFinishedListener = new OnScrollFinishedListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder$attachSnapHelperWithListener$2
            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.OnScrollFinishedListener
            public void onScrollFinished(int position) {
                boolean z11;
                PricesHistogramV2ViewModel pricesHistogramV2ViewModel;
                PricesHistogramV2ViewModel pricesHistogramV2ViewModel2;
                PricesHistogramV2ViewModel pricesHistogramV2ViewModel3;
                PricesHistogramV2ViewModel pricesHistogramV2ViewModel4;
                z11 = PricesHistogramV2WidgetViewHolder.this.isListenersActive;
                if (z11) {
                    pricesHistogramV2ViewModel = PricesHistogramV2WidgetViewHolder.this.viewModel;
                    pricesHistogramV2ViewModel.setIsScrollInProgress(false);
                    pricesHistogramV2ViewModel2 = PricesHistogramV2WidgetViewHolder.this.viewModel;
                    pricesHistogramV2ViewModel2.changePosition(position);
                    pricesHistogramV2ViewModel3 = PricesHistogramV2WidgetViewHolder.this.viewModel;
                    pricesHistogramV2ViewModel4 = PricesHistogramV2WidgetViewHolder.this.viewModel;
                    pricesHistogramV2ViewModel3.scrollFinished(pricesHistogramV2ViewModel4.getSelectedDirection());
                }
            }
        };
        PricesHistogramV2ViewModel pricesHistogramV2ViewModel = this.viewModel;
        RecyclerViewExtKt.attachSnapHelperWithListener(daysPricesHistogramV2RV, sVar, onSnapPositionChangeListener, onScrollFinishedListener, Integer.valueOf(pricesHistogramV2ViewModel.getSelectedPosition(pricesHistogramV2ViewModel.getSelectedDirection())));
    }

    private final String getFindTickets() {
        return (String) this.findTickets.getValue();
    }

    private final String getFindTicketsFrom() {
        return (String) this.findTicketsFrom.getValue();
    }

    private final String getTextOfButton(String totalPrice) {
        if (totalPrice.length() == 0) {
            return getFindTickets();
        }
        return e.b(new Object[]{totalPrice}, 1, getFindTicketsFrom(), "format(...)");
    }

    private final void observeAction() {
        C2399j.C(new C2408n0(this.viewModel.daysLiveData(), new PricesHistogramV2WidgetViewHolder$observeAction$1(this, null)), K.a(this));
        C2399j.C(new C2408n0(this.viewModel.scrollLiveData(), new PricesHistogramV2WidgetViewHolder$observeAction$2(this, null)), K.a(this));
        C2399j.C(new C2408n0(this.viewModel.actionLiveData(), new PricesHistogramV2WidgetViewHolder$observeAction$3(this, null)), K.a(this));
        C2399j.C(new C2408n0(this.viewModel.trackingLiveData(), new PricesHistogramV2WidgetViewHolder$observeAction$4(this)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observeAction$sendAnalytics(PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder, t tVar, d dVar) {
        pricesHistogramV2WidgetViewHolder.sendAnalytics(tVar);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToPosition(final int targetPosition) {
        if (targetPosition < 0) {
            return;
        }
        final RecyclerView recyclerView = this.binding.daysPricesHistogramV2RV;
        recyclerView.post(new Runnable() { // from class: jP.a
            @Override // java.lang.Runnable
            public final void run() {
                PricesHistogramV2WidgetViewHolder.scrollToPosition$lambda$4$lambda$3(PricesHistogramV2WidgetViewHolder.this, targetPosition, recyclerView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToPosition$lambda$4$lambda$3(PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder, int i11, RecyclerView recyclerView) {
        pricesHistogramV2WidgetViewHolder.smoothScroller.setTargetPosition(i11);
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(pricesHistogramV2WidgetViewHolder.smoothScroller);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalytics(t event) {
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, event, null, 2, null);
    }

    private final void setupHistogram(PricesHistogramV2VO.AvailableColorsVO availableColors, List<PricesHistogramV2VO.MonthVO> months, List<PricesHistogramV2VO.DayVO> days, boolean isDirect, FlightDirection flightDirection) {
        this.pricesHistogramDaysAdapter.setColors(availableColors);
        this.pricesHistogramMonthsAdapter.setItems(months);
        this.binding.daysPricesHistogramV2RV.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder$setupHistogram$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                WidgetPricesHistogramV2Binding widgetPricesHistogramV2Binding;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                widgetPricesHistogramV2Binding = PricesHistogramV2WidgetViewHolder.this.binding;
                widgetPricesHistogramV2Binding.monthsPricesHistogramV2RV.scrollBy(dx, 0);
            }
        });
        showDaysState(days, this.viewModel.getSelectedPosition(flightDirection), this.viewModel.getTotalPrice(), this.viewModel.getFormatDates(), isDirect);
        scrollToPosition(this.viewModel.getSelectedPosition(flightDirection));
    }

    private final void setupRV() {
        RecyclerView recyclerView = this.binding.daysPricesHistogramV2RV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.pricesHistogramDaysAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new PricesHistogramV2Decoration(context));
        RecyclerView recyclerView2 = this.binding.monthsPricesHistogramV2RV;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
        recyclerView2.setAdapter(this.pricesHistogramMonthsAdapter);
        Context context2 = recyclerView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView2.addItemDecoration(new PricesHistogramV2Decoration(context2));
        recyclerView2.setOnTouchListener(new b(recyclerView2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupRV$lambda$2$lambda$1(RecyclerView recyclerView, View view, MotionEvent motionEvent) {
        recyclerView.performClick();
        return true;
    }

    private final void setupViews() {
        this.binding.toggleWrapperPricesHistogramV2FL.setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor0), ResourceExtKt.toPxF(16, getContext())));
        this.binding.chipTherePricesHistogramV2CV.setUnselectByClick(false);
        this.binding.chipTherePricesHistogramV2CV.setOnSelect(new PricesHistogramV2WidgetViewHolder$setupViews$1(this));
        this.binding.chipBackPricesHistogramV2CV.setUnselectByClick(false);
        this.binding.chipBackPricesHistogramV2CV.setOnSelect(new PricesHistogramV2WidgetViewHolder$setupViews$2(this));
        this.binding.togglePricesHistogramV2TTSCV.setOnStateChangeListener(new PricesHistogramV2WidgetViewHolder$setupViews$3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDaysState(List<PricesHistogramV2VO.DayVO> days, int position, String totalPrice, String selectedDates, boolean isDirect) {
        PricesHistogramV2VO.DayVO dayVO = days.get(position);
        this.pricesHistogramDaysAdapter.setDirect(isDirect);
        PricesHistogramV2DaysAdapter pricesHistogramV2DaysAdapter = this.pricesHistogramDaysAdapter;
        RecyclerView daysPricesHistogramV2RV = this.binding.daysPricesHistogramV2RV;
        Intrinsics.checkNotNullExpressionValue(daysPricesHistogramV2RV, "daysPricesHistogramV2RV");
        pricesHistogramV2DaysAdapter.submitList(days, daysPricesHistogramV2RV);
        this.binding.selectedDatesPricesHistogramV2TAV.setText(selectedDates);
        TextAtomV2View selectedPricesHistogramV2TAV = this.binding.selectedPricesHistogramV2TAV;
        Intrinsics.checkNotNullExpressionValue(selectedPricesHistogramV2TAV, "selectedPricesHistogramV2TAV");
        TextHolderKt.bindOrGone$default(selectedPricesHistogramV2TAV, isDirect ? dayVO.getPriceOrMessageDirect() : dayVO.getPriceOrMessage(), null, 2, null);
        this.binding.findTicketsPricesHistogramV2BV.setTitle(getTextOfButton(totalPrice));
        TextAtomV2View leftMonthPricesHistogramV2TV = this.binding.leftMonthPricesHistogramV2TV;
        Intrinsics.checkNotNullExpressionValue(leftMonthPricesHistogramV2TV, "leftMonthPricesHistogramV2TV");
        TextHolderKt.bindOrGone$default(leftMonthPricesHistogramV2TV, dayVO.getMonthLeft(), null, 2, null);
        TextAtomV2View rightMonthPricesHistogramV2TV = this.binding.rightMonthPricesHistogramV2TV;
        Intrinsics.checkNotNullExpressionValue(rightMonthPricesHistogramV2TV, "rightMonthPricesHistogramV2TV");
        TextHolderKt.bindOrGone$default(rightMonthPricesHistogramV2TV, dayVO.getMonthRight(), null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
        attachSnapHelperWithListener();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.binding.daysPricesHistogramV2RV.clearOnScrollListeners();
        this.snapHelper.attachToRecyclerView(null);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PricesHistogramV2VO item, @NotNull l20.d info) {
        PricesHistogramV2WidgetViewHolder pricesHistogramV2WidgetViewHolder;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.isListenersActive = false;
        PricesHistogramV2VO upVar = this.viewModel.setup(item);
        TextAtomV2View titlePricesHistogramV2TAV = this.binding.titlePricesHistogramV2TAV;
        Intrinsics.checkNotNullExpressionValue(titlePricesHistogramV2TAV, "titlePricesHistogramV2TAV");
        TextHolderKt.bind$default(titlePricesHistogramV2TAV, upVar.getDirection(), null, 2, null);
        ChipView chipTherePricesHistogramV2CV = this.binding.chipTherePricesHistogramV2CV;
        Intrinsics.checkNotNullExpressionValue(chipTherePricesHistogramV2CV, "chipTherePricesHistogramV2CV");
        ChipHolderKt.bindOrGone$default(chipTherePricesHistogramV2CV, upVar.getTabThere(), null, 2, null);
        ChipView chipBackPricesHistogramV2CV = this.binding.chipBackPricesHistogramV2CV;
        Intrinsics.checkNotNullExpressionValue(chipBackPricesHistogramV2CV, "chipBackPricesHistogramV2CV");
        ChipHolderKt.bindOrGone$default(chipBackPricesHistogramV2CV, upVar.getTabBack(), null, 2, null);
        TextAtomV2View selectedDatesPricesHistogramV2TAV = this.binding.selectedDatesPricesHistogramV2TAV;
        Intrinsics.checkNotNullExpressionValue(selectedDatesPricesHistogramV2TAV, "selectedDatesPricesHistogramV2TAV");
        TextHolderKt.bindOrGone$default(selectedDatesPricesHistogramV2TAV, upVar.getSelectedDates(), null, 2, null);
        FrameLayout toggleWrapperPricesHistogramV2FL = this.binding.toggleWrapperPricesHistogramV2FL;
        Intrinsics.checkNotNullExpressionValue(toggleWrapperPricesHistogramV2FL, "toggleWrapperPricesHistogramV2FL");
        toggleWrapperPricesHistogramV2FL.setVisibility(upVar.getIsToggleVisible() ? 0 : 8);
        ToggleTitleSubtitleCellView togglePricesHistogramV2TTSCV = this.binding.togglePricesHistogramV2TTSCV;
        Intrinsics.checkNotNullExpressionValue(togglePricesHistogramV2TTSCV, "togglePricesHistogramV2TTSCV");
        ToggleTitleSubtitleCellHolderKt.bindOrGone$default(togglePricesHistogramV2TTSCV, upVar.getToggleCalendarButton(), null, 2, null);
        ButtonV3View findTicketsPricesHistogramV2BV = this.binding.findTicketsPricesHistogramV2BV;
        Intrinsics.checkNotNullExpressionValue(findTicketsPricesHistogramV2BV, "findTicketsPricesHistogramV2BV");
        ButtonV3HolderKt.bind(findTicketsPricesHistogramV2BV, upVar.getFindTicketsButton(), this.actionHandler);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.viewModel.getSelectedDirection().ordinal()];
        if (i11 == 1) {
            setupHistogram(upVar.getAvailableColors(), upVar.getMonthsThere(), upVar.getListDaysThere(), upVar.getIsDirect(), FlightDirection.THERE_FLIGHT);
            pricesHistogramV2WidgetViewHolder = this;
        } else {
            if (i11 != 2) {
                throw new o();
            }
            if (upVar.getMonthsBack() == null || upVar.getListDaysBack() == null) {
                pricesHistogramV2WidgetViewHolder = this;
            } else {
                pricesHistogramV2WidgetViewHolder = this;
                pricesHistogramV2WidgetViewHolder.setupHistogram(upVar.getAvailableColors(), upVar.getMonthsBack(), upVar.getListDaysBack(), upVar.getIsDirect(), FlightDirection.BACK_FLIGHT);
            }
        }
        pricesHistogramV2WidgetViewHolder.isListenersActive = true;
    }
}
