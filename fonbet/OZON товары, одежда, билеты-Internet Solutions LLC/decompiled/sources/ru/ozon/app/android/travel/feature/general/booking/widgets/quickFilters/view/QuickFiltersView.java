package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view;

import Am.C2438a;
import Lo.b;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.adapter.QuickFiltersAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.adapter.QuickFiltersItemDecoration;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000w\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001'\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\fJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010<R\u0016\u0010=\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\u001fR\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0011\u0010B\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isSkeletonVisible", "", "showSkeletonOrContent", "(Z)V", "setMinimumHeight", "()V", "resetMinimumHeight", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;Lkotlin/jvm/functions/Function1;)V", "disableRoundedBackground", "enableRoundedBackground", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "", "dpf24", "F", "", "negativeDp24", "I", "dp4", "dp8", "dp12", "dp16", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/adapter/QuickFiltersAdapter;", "filtersAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/adapter/QuickFiltersAdapter;", "ru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersView$roundedOutlineProvider$1", "roundedOutlineProvider", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersView$roundedOutlineProvider$1;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersSkeletonView;", "skeletonView", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersSkeletonView;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersProgressBarView;", "progressView$delegate", "LSc/j;", "getProgressView", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/view/QuickFiltersProgressBarView;", "progressView", "Lkotlin/jvm/functions/Function1;", "bottomPadding", "dynamicTitlePaddings", "Z", "getProgressViewHeight", "()I", "progressViewHeight", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(QuickFiltersView.class, "titleTAV", "getTitleTAV()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    private Function1<? super AtomAction, Unit> actionHandler;
    private int bottomPadding;
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final int dp8;
    private final float dpf24;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;
    private boolean dynamicTitlePaddings;

    @NotNull
    private final QuickFiltersAdapter filtersAdapter;
    private final int negativeDp24;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j progressView;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final QuickFiltersView$roundedOutlineProvider$1 roundedOutlineProvider;

    @NotNull
    private final QuickFiltersSkeletonView skeletonView;

    /* renamed from: titleTAV$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.ViewOutlineProvider, ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view.QuickFiltersView$roundedOutlineProvider$1] */
    public QuickFiltersView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.dpf24 = dimens$default.getRadius24();
        this.negativeDp24 = -dimens$default.getMargin24();
        int margin4 = dimens$default.getMargin4();
        this.dp4 = margin4;
        this.dp8 = dimens$default.getMargin8();
        int margin12 = dimens$default.getMargin12();
        this.dp12 = margin12;
        int margin16 = dimens$default.getMargin16();
        this.dp16 = margin16;
        QuickFiltersAdapter quickFiltersAdapter = new QuickFiltersAdapter(new QuickFiltersView$filtersAdapter$1(this));
        this.filtersAdapter = quickFiltersAdapter;
        ?? r62 = new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view.QuickFiltersView$roundedOutlineProvider$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                int i11;
                float f7;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                i11 = QuickFiltersView.this.negativeDp24;
                int width = view.getWidth();
                int height = view.getHeight();
                f7 = QuickFiltersView.this.dpf24;
                outline.setRoundRect(0, i11, width, height, f7);
            }
        };
        this.roundedOutlineProvider = r62;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTAV = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new QuickFiltersView$special$$inlined$preCreationViewPool$default$1(this), new QuickFiltersView$special$$inlined$preCreationViewPool$default$2(this));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(quickFiltersAdapter);
        recyclerView.addItemDecoration(new QuickFiltersItemDecoration(margin16, margin4));
        recyclerView.setItemAnimator(null);
        this.recyclerView = recyclerView;
        QuickFiltersSkeletonView quickFiltersSkeletonView = new QuickFiltersSkeletonView(context);
        quickFiltersSkeletonView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.skeletonView = quickFiltersSkeletonView;
        this.progressView = LazyUtilsKt.unsafeLazy(new QuickFiltersView$progressView$2(context, this));
        setOrientation(1);
        addView(getTitleTAV());
        addView(recyclerView);
        addView(quickFiltersSkeletonView);
        setOutlineProvider(r62);
        setClipToOutline(true);
        setPadding(0, margin12, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4(QuickFiltersView quickFiltersView, QuickFiltersVO.QuickFiltersState quickFiltersState) {
        quickFiltersView.resetMinimumHeight();
        Integer autoScrollIndex = quickFiltersState.getAutoScrollIndex();
        if (autoScrollIndex != null) {
            quickFiltersView.recyclerView.scrollToPosition(autoScrollIndex.intValue());
        }
    }

    private final QuickFiltersProgressBarView getProgressView() {
        return (QuickFiltersProgressBarView) this.progressView.getValue();
    }

    private final TextAtomV2View getTitleTAV() {
        return (TextAtomV2View) this.titleTAV.getValue(this, $$delegatedProperties[0]);
    }

    private final void resetMinimumHeight() {
        if (getMinimumHeight() != 0) {
            setMinimumHeight(0);
        }
    }

    private final void setMinimumHeight() {
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight <= 0 || getMinimumHeight() == measuredHeight) {
            return;
        }
        setMinimumHeight(measuredHeight);
    }

    private final void showSkeletonOrContent(boolean isSkeletonVisible) {
        if ((this.skeletonView.getVisibility() == 0) == isSkeletonVisible) {
            if ((this.recyclerView.getVisibility() == 0) != isSkeletonVisible) {
                return;
            }
        }
        setMinimumHeight();
        this.skeletonView.setVisibility(isSkeletonVisible ? 0 : 8);
        this.recyclerView.setVisibility(isSkeletonVisible ? 8 : 0);
    }

    public final void bind(@NotNull QuickFiltersVO.QuickFiltersState item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        setOutlineProvider(this.roundedOutlineProvider);
        if (item.getIsSkeletonVisible()) {
            this.skeletonView.bind(item.getSkeletonsSettings());
        }
        showSkeletonOrContent(item.getIsSkeletonVisible());
        this.filtersAdapter.submitList(item.getItems(), new b(2, this, item));
        this.bottomPadding = item.getBottomPadding();
        if (item.getStickyBehavior() == QuickFiltersDTO.StickyBehavior.STATIC_HEADER || item.getStickyBehavior() == QuickFiltersDTO.StickyBehavior.STATIC_STICKY) {
            getProgressView().bind(item.getLoader());
        } else {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
        }
        TextHolderKt.bindOrGone$default(getTitleTAV(), item.getTitle(), null, 2, null);
        TextAtomV2View titleTAV = getTitleTAV();
        ViewGroup.LayoutParams layoutParams = titleTAV.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = item.getDynamicTitlePaddings() ? this.dp8 : 0;
        titleTAV.setLayoutParams(layoutParams2);
        if (item.getDynamicTitlePaddings()) {
            enableRoundedBackground();
        }
        this.dynamicTitlePaddings = item.getDynamicTitlePaddings();
    }

    public final void disableRoundedBackground() {
        if (this.dynamicTitlePaddings) {
            return;
        }
        setClipToOutline(false);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), 0);
    }

    public final void enableRoundedBackground() {
        setClipToOutline(true);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), this.bottomPadding);
    }

    public final int getProgressViewHeight() {
        return getProgressView().getHeight();
    }
}
