package ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation;

import Sc.InterfaceC4008j;
import V.e;
import WZ.l;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetPricesHistogramBinding;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.OnScrollFinishedListener;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.OnSnapPositionChangeListener;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.RecyclerViewExtKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramWidgetViewHolder;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.adapter.PricesHistogramDaysAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.adapter.PricesHistogramDecoration;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.adapter.PricesHistogramMonthsAdapter;
import ru.ozon.app.android.travel.molecules.extensions.LiveDataDebounceExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJs\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J-\u0010-\u001a\u00020%2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\u0006\u0010*\u001a\u00020#2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J-\u0010/\u001a\u00020%2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\u0006\u0010*\u001a\u00020#2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J/\u00102\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020#H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020%H\u0016¢\u0006\u0004\b4\u0010)J#\u00109\u001a\u00020%2\u0006\u00105\u001a\u00020\u00022\n\u00108\u001a\u000606j\u0002`7H\u0014¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020%0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010R\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010SR\u0016\u0010U\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001b\u0010[\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001b\u0010^\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010Z¨\u0006_"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Landroidx/recyclerview/widget/RecyclerView;", "daysRecyclerView", "monthsRecyclerView", "Landroidx/recyclerview/widget/D;", "snapHelper", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PricesHistogramDaysAdapter;", "daysAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PricesHistogramMonthsAdapter;", "monthsAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;", "availableColors", "", "haveDirectionTo", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO;", "months", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$MonthVO$DayVO;", "days", "Landroidx/recyclerview/widget/RecyclerView$z;", "smoothScroller", "", "flightDirection", "", "setupHistogram", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/D;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PricesHistogramDaysAdapter;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PricesHistogramMonthsAdapter;Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO$AvailableColorsVO;ZLjava/util/List;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$z;I)V", "observeAction", "()V", "position", "", "totalPrice", "showStateFrom", "(Ljava/util/List;ILjava/lang/String;)V", "showStateTo", "getTextOfButton", "(Ljava/lang/String;)Ljava/lang/String;", "scrollToPosition", "(Landroidx/recyclerview/widget/RecyclerView$z;Landroidx/recyclerview/widget/D;Landroidx/recyclerview/widget/RecyclerView;I)V", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/PricesHistogramViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetPricesHistogramBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetPricesHistogramBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pricesHistogramDaysFromAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PricesHistogramDaysAdapter;", "pricesHistogramDaysToAdapter", "pricesHistogramMonthsFromAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/pricesHistogram/v1/presentation/adapter/PricesHistogramMonthsAdapter;", "pricesHistogramMonthsToAdapter", "Landroidx/recyclerview/widget/s;", "snapHelperFrom", "Landroidx/recyclerview/widget/s;", "snapHelperTo", "smoothScrollerFrom", "Landroidx/recyclerview/widget/RecyclerView$z;", "smoothScrollerTo", "countOfEmptyDays", "I", "findTickets$delegate", "LSc/j;", "getFindTickets", "()Ljava/lang/String;", "findTickets", "findTicketsFrom$delegate", "getFindTicketsFrom", "findTicketsFrom", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PricesHistogramWidgetViewHolder extends k<PricesHistogramVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetPricesHistogramBinding binding;

    @NotNull
    private final View containerView;
    private int countOfEmptyDays;

    /* renamed from: findTickets$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j findTickets;

    /* renamed from: findTicketsFrom$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j findTicketsFrom;

    @NotNull
    private final PricesHistogramDaysAdapter pricesHistogramDaysFromAdapter;

    @NotNull
    private final PricesHistogramDaysAdapter pricesHistogramDaysToAdapter;

    @NotNull
    private final PricesHistogramMonthsAdapter pricesHistogramMonthsFromAdapter;

    @NotNull
    private final PricesHistogramMonthsAdapter pricesHistogramMonthsToAdapter;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final RecyclerView.z smoothScrollerFrom;

    @NotNull
    private final RecyclerView.z smoothScrollerTo;

    @NotNull
    private final s snapHelperFrom;

    @NotNull
    private final s snapHelperTo;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PricesHistogramViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PricesHistogramWidgetViewHolder(@NotNull View containerView, @NotNull PricesHistogramViewModel viewModel, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetPricesHistogramBinding bind = WidgetPricesHistogramBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).onComposerAction(new PricesHistogramWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.pricesHistogramDaysFromAdapter = new PricesHistogramDaysAdapter();
        this.pricesHistogramDaysToAdapter = new PricesHistogramDaysAdapter();
        this.pricesHistogramMonthsFromAdapter = new PricesHistogramMonthsAdapter();
        this.pricesHistogramMonthsToAdapter = new PricesHistogramMonthsAdapter();
        this.snapHelperFrom = new s();
        this.snapHelperTo = new s();
        final Context context = getContext();
        this.smoothScrollerFrom = new r(context) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramWidgetViewHolder$smoothScrollerFrom$1
            @Override // androidx.recyclerview.widget.r
            protected int getHorizontalSnapPreference() {
                return -1;
            }
        };
        final Context context2 = getContext();
        this.smoothScrollerTo = new r(context2) { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramWidgetViewHolder$smoothScrollerTo$1
            @Override // androidx.recyclerview.widget.r
            protected int getHorizontalSnapPreference() {
                return -1;
            }
        };
        this.findTickets = Sc.k.b(PricesHistogramWidgetViewHolder$findTickets$2.INSTANCE);
        this.findTicketsFrom = Sc.k.b(PricesHistogramWidgetViewHolder$findTicketsFrom$2.INSTANCE);
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
        this.viewModel.getDaysFromLiveData().observe(this, new PricesHistogramWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PricesHistogramWidgetViewHolder$observeAction$1(this)));
        this.viewModel.getDaysToLiveData().observe(this, new PricesHistogramWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PricesHistogramWidgetViewHolder$observeAction$2(this)));
        LiveDataDebounceExtKt.debounce(this.viewModel.getScrollFromLiveData(), 100L, x0.a(this.viewModel)).observe(this, new PricesHistogramWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PricesHistogramWidgetViewHolder$observeAction$3(this)));
        LiveDataDebounceExtKt.debounce(this.viewModel.getScrollToLiveData(), 100L, x0.a(this.viewModel)).observe(this, new PricesHistogramWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PricesHistogramWidgetViewHolder$observeAction$4(this)));
        this.viewModel.getLoadingStateLiveData().observe(this, new PricesHistogramWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PricesHistogramWidgetViewHolder$observeAction$5(this)));
        this.viewModel.getActionLiveData().observe(this, new PricesHistogramWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PricesHistogramWidgetViewHolder$observeAction$6(this)));
        this.viewModel.getTrackingLiveData().observe(this, new PricesHistogramWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PricesHistogramWidgetViewHolder$observeAction$7(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToPosition(final RecyclerView.z smoothScroller, final D snapHelper, final RecyclerView daysRecyclerView, final int position) {
        daysRecyclerView.post(new Runnable() { // from class: hP.c
            @Override // java.lang.Runnable
            public final void run() {
                PricesHistogramWidgetViewHolder.scrollToPosition$lambda$9$lambda$8(RecyclerView.z.this, position, this, daysRecyclerView, snapHelper);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToPosition$lambda$9$lambda$8(RecyclerView.z zVar, int i11, PricesHistogramWidgetViewHolder pricesHistogramWidgetViewHolder, RecyclerView recyclerView, D d11) {
        View findViewByPosition;
        RecyclerView.o layoutManager;
        int[] calculateDistanceToFinalSnap;
        Integer E11;
        zVar.setTargetPosition(i11 - pricesHistogramWidgetViewHolder.countOfEmptyDays);
        RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.startSmoothScroll(zVar);
        }
        RecyclerView.o layoutManager3 = recyclerView.getLayoutManager();
        if (layoutManager3 == null || (findViewByPosition = layoutManager3.findViewByPosition(i11)) == null || (layoutManager = recyclerView.getLayoutManager()) == null || (calculateDistanceToFinalSnap = d11.calculateDistanceToFinalSnap(layoutManager, findViewByPosition)) == null || (E11 = C7705l.E(calculateDistanceToFinalSnap)) == null) {
            return;
        }
        if (E11.intValue() == 0) {
            E11 = null;
        }
        if (E11 != null) {
            recyclerView.scrollBy(E11.intValue(), 0);
        }
    }

    private final void setupHistogram(RecyclerView daysRecyclerView, final RecyclerView monthsRecyclerView, D snapHelper, PricesHistogramDaysAdapter daysAdapter, PricesHistogramMonthsAdapter monthsAdapter, PricesHistogramVO.AvailableColorsVO availableColors, boolean haveDirectionTo, List<PricesHistogramVO.MonthVO> months, List<PricesHistogramVO.MonthVO.DayVO> days, RecyclerView.z smoothScroller, final int flightDirection) {
        int i11 = 0;
        daysRecyclerView.setLayoutManager(new LinearLayoutManager(daysRecyclerView.getContext(), 0, false));
        daysAdapter.setColors(availableColors);
        daysAdapter.setHaveDirectionTo(haveDirectionTo);
        daysRecyclerView.setAdapter(daysAdapter);
        Context context = daysRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        daysRecyclerView.addItemDecoration(new PricesHistogramDecoration(context));
        monthsRecyclerView.setLayoutManager(new LinearLayoutManager(monthsRecyclerView.getContext(), 0, false));
        monthsAdapter.setItems(months);
        monthsRecyclerView.setAdapter(monthsAdapter);
        Context context2 = monthsRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        monthsRecyclerView.addItemDecoration(new PricesHistogramDecoration(context2));
        monthsRecyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: hP.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z11;
                z11 = PricesHistogramWidgetViewHolder.setupHistogram$lambda$4$lambda$3(RecyclerView.this, view, motionEvent);
                return z11;
            }
        });
        daysRecyclerView.addOnScrollListener(new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramWidgetViewHolder$setupHistogram$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                RecyclerView.this.scrollBy(dx, 0);
            }
        });
        daysAdapter.setItems(days);
        RecyclerViewExtKt.attachSnapHelperWithListener$default(daysRecyclerView, snapHelper, new OnSnapPositionChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramWidgetViewHolder$setupHistogram$3
            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.OnSnapPositionChangeListener
            public void onSnapPositionChange(int position) {
                PricesHistogramViewModel pricesHistogramViewModel;
                pricesHistogramViewModel = PricesHistogramWidgetViewHolder.this.viewModel;
                pricesHistogramViewModel.changePosition(position, flightDirection);
            }
        }, new OnScrollFinishedListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v1.presentation.PricesHistogramWidgetViewHolder$setupHistogram$4
            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.shared.OnScrollFinishedListener
            public void onScrollFinished(int position) {
                PricesHistogramViewModel pricesHistogramViewModel;
                pricesHistogramViewModel = PricesHistogramWidgetViewHolder.this.viewModel;
                pricesHistogramViewModel.scrollFinished(flightDirection);
            }
        }, null, 8, null);
        Iterator<PricesHistogramVO.MonthVO.DayVO> it = days.iterator();
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getIsSelected()) {
                break;
            } else {
                i11++;
            }
        }
        scrollToPosition(smoothScroller, snapHelper, daysRecyclerView, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupHistogram$lambda$4$lambda$3(RecyclerView recyclerView, View view, MotionEvent motionEvent) {
        recyclerView.performClick();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStateFrom(List<PricesHistogramVO.MonthVO.DayVO> days, int position, String totalPrice) {
        this.pricesHistogramDaysFromAdapter.setItems(days);
        TextAtomView selectedDateFromTAV = this.binding.selectedDateFromTAV;
        Intrinsics.checkNotNullExpressionValue(selectedDateFromTAV, "selectedDateFromTAV");
        TextAtomHolderKt.bindOrGone$default(selectedDateFromTAV, days.get(position).getTitle(), null, 2, null);
        TextAtomView selectedPriceFromTAV = this.binding.selectedPriceFromTAV;
        Intrinsics.checkNotNullExpressionValue(selectedPriceFromTAV, "selectedPriceFromTAV");
        TextAtomHolderKt.bindOrGone$default(selectedPriceFromTAV, days.get(position).getPriceOrMessage(), null, 2, null);
        this.binding.findTicketsPriceHistogramBtn.setText(getTextOfButton(totalPrice));
        TextAtomView leftMonthFromPricesHistogramTV = this.binding.leftMonthFromPricesHistogramTV;
        Intrinsics.checkNotNullExpressionValue(leftMonthFromPricesHistogramTV, "leftMonthFromPricesHistogramTV");
        TextAtomHolderKt.bindOrGone$default(leftMonthFromPricesHistogramTV, days.get(position).getMonthLeft(), null, 2, null);
        TextAtomView rightMonthFromPricesHistogramTV = this.binding.rightMonthFromPricesHistogramTV;
        Intrinsics.checkNotNullExpressionValue(rightMonthFromPricesHistogramTV, "rightMonthFromPricesHistogramTV");
        TextAtomHolderKt.bindOrGone$default(rightMonthFromPricesHistogramTV, days.get(position).getMonthRight(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStateTo(List<PricesHistogramVO.MonthVO.DayVO> days, int position, String totalPrice) {
        this.pricesHistogramDaysToAdapter.setItems(days);
        TextAtomView selectedDateToTAV = this.binding.selectedDateToTAV;
        Intrinsics.checkNotNullExpressionValue(selectedDateToTAV, "selectedDateToTAV");
        TextAtomHolderKt.bindOrGone$default(selectedDateToTAV, days.get(position).getTitle(), null, 2, null);
        TextAtomView selectedPriceToTAV = this.binding.selectedPriceToTAV;
        Intrinsics.checkNotNullExpressionValue(selectedPriceToTAV, "selectedPriceToTAV");
        TextAtomHolderKt.bindOrGone$default(selectedPriceToTAV, days.get(position).getPriceOrMessage(), null, 2, null);
        this.binding.findTicketsPriceHistogramBtn.setText(getTextOfButton(totalPrice));
        TextAtomView leftMonthToPricesHistogramTV = this.binding.leftMonthToPricesHistogramTV;
        Intrinsics.checkNotNullExpressionValue(leftMonthToPricesHistogramTV, "leftMonthToPricesHistogramTV");
        TextAtomHolderKt.bindOrGone$default(leftMonthToPricesHistogramTV, days.get(position).getMonthLeft(), null, 2, null);
        TextAtomView rightMonthToPricesHistogramTV = this.binding.rightMonthToPricesHistogramTV;
        Intrinsics.checkNotNullExpressionValue(rightMonthToPricesHistogramTV, "rightMonthToPricesHistogramTV");
        TextAtomHolderKt.bindOrGone$default(rightMonthToPricesHistogramTV, days.get(position).getMonthRight(), null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PricesHistogramVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.countOfEmptyDays = item.getCountOfEmptyDays();
        this.viewModel.setup(item);
        TextAtomView titlePricesHistogramTAV = this.binding.titlePricesHistogramTAV;
        Intrinsics.checkNotNullExpressionValue(titlePricesHistogramTAV, "titlePricesHistogramTAV");
        TextAtomHolderKt.bindOrGone$default(titlePricesHistogramTAV, item.getTitle(), null, 2, null);
        TextAtomView titleFromPricesHistogramTAV = this.binding.titleFromPricesHistogramTAV;
        Intrinsics.checkNotNullExpressionValue(titleFromPricesHistogramTAV, "titleFromPricesHistogramTAV");
        TextAtomHolderKt.bindOrGone$default(titleFromPricesHistogramTAV, item.getTitleFrom(), null, 2, null);
        SmallBorderlessButtonView cancelPricesHistogramBtn = this.binding.cancelPricesHistogramBtn;
        Intrinsics.checkNotNullExpressionValue(cancelPricesHistogramBtn, "cancelPricesHistogramBtn");
        WrappedBorderlessButtonHolderKt.bindOrGone(cancelPricesHistogramBtn, item.getCancelButton(), this.actionHandler);
        LargeButtonView findTicketsPriceHistogramBtn = this.binding.findTicketsPriceHistogramBtn;
        Intrinsics.checkNotNullExpressionValue(findTicketsPriceHistogramBtn, "findTicketsPriceHistogramBtn");
        LargeButtonHolderKt.bindOrGone(findTicketsPriceHistogramBtn, item.getFindTicketsButton(), this.actionHandler);
        List<PricesHistogramVO.MonthVO.DayVO> listDaysFrom = item.getListDaysFrom();
        Iterator<PricesHistogramVO.MonthVO.DayVO> it = item.getListDaysFrom().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getIsSelected()) {
                break;
            } else {
                i11++;
            }
        }
        showStateFrom(listDaysFrom, i11, this.viewModel.getTotalPrice());
        RecyclerView daysFromPriceHistogramRV = this.binding.daysFromPriceHistogramRV;
        Intrinsics.checkNotNullExpressionValue(daysFromPriceHistogramRV, "daysFromPriceHistogramRV");
        RecyclerView monthsFromPriceHistogramRV = this.binding.monthsFromPriceHistogramRV;
        Intrinsics.checkNotNullExpressionValue(monthsFromPriceHistogramRV, "monthsFromPriceHistogramRV");
        setupHistogram(daysFromPriceHistogramRV, monthsFromPriceHistogramRV, this.snapHelperFrom, this.pricesHistogramDaysFromAdapter, this.pricesHistogramMonthsFromAdapter, item.getAvailableColors(), item.getSelectedDateTo() != null, item.getMonthsFrom(), item.getListDaysFrom(), this.smoothScrollerFrom, 0);
        if (item.getListDaysTo() == null || item.getMonthsTo() == null) {
            return;
        }
        TextAtomView titleToPricesHistogramTAV = this.binding.titleToPricesHistogramTAV;
        Intrinsics.checkNotNullExpressionValue(titleToPricesHistogramTAV, "titleToPricesHistogramTAV");
        TextAtomHolderKt.bindOrGone$default(titleToPricesHistogramTAV, item.getTitleTo(), null, 2, null);
        ImageView arrowIconToPriceHistogramIV = this.binding.arrowIconToPriceHistogramIV;
        Intrinsics.checkNotNullExpressionValue(arrowIconToPriceHistogramIV, "arrowIconToPriceHistogramIV");
        arrowIconToPriceHistogramIV.setVisibility(0);
        RecyclerView daysToPriceHistogramRV = this.binding.daysToPriceHistogramRV;
        Intrinsics.checkNotNullExpressionValue(daysToPriceHistogramRV, "daysToPriceHistogramRV");
        daysToPriceHistogramRV.setVisibility(0);
        RecyclerView monthsToPriceHistogramRV = this.binding.monthsToPriceHistogramRV;
        Intrinsics.checkNotNullExpressionValue(monthsToPriceHistogramRV, "monthsToPriceHistogramRV");
        monthsToPriceHistogramRV.setVisibility(0);
        List<PricesHistogramVO.MonthVO.DayVO> listDaysTo = item.getListDaysTo();
        Iterator<PricesHistogramVO.MonthVO.DayVO> it2 = item.getListDaysTo().iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            } else if (it2.next().getIsSelected()) {
                break;
            } else {
                i12++;
            }
        }
        showStateTo(listDaysTo, i12, this.viewModel.getTotalPrice());
        RecyclerView daysToPriceHistogramRV2 = this.binding.daysToPriceHistogramRV;
        Intrinsics.checkNotNullExpressionValue(daysToPriceHistogramRV2, "daysToPriceHistogramRV");
        RecyclerView monthsToPriceHistogramRV2 = this.binding.monthsToPriceHistogramRV;
        Intrinsics.checkNotNullExpressionValue(monthsToPriceHistogramRV2, "monthsToPriceHistogramRV");
        setupHistogram(daysToPriceHistogramRV2, monthsToPriceHistogramRV2, this.snapHelperTo, this.pricesHistogramDaysToAdapter, this.pricesHistogramMonthsToAdapter, item.getAvailableColors(), item.getSelectedDateTo() != null, item.getMonthsTo(), item.getListDaysTo(), this.smoothScrollerTo, 1);
    }
}
