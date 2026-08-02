package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view;

import F3.G;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.presentation.HotelsBookTotalV2VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view.adapter.PriceDetailsItemDecoration;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view.adapter.priceDetails.PriceDetailsAdapter;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v2.view.adapter.totalPriceDetails.TotalPriceDetailsAdapter;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.travel.utils.extensions.TextDTOExtensionsKt;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fJ\u0012\u0010%\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0002J$\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/view/HotelsBookTotalV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp16", "", "dp12", "dp8", "priceDetailsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/view/adapter/priceDetails/PriceDetailsAdapter;", "totalPriceDetailsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/view/adapter/totalPriceDetails/TotalPriceDetailsAdapter;", "titleTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "priceDetailsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dividerView", "Landroid/view/View;", "totalPriceDetailsRecyclerView", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonLoaderView", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "getButtonLoaderView", "()Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "agreementTextView", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "bind", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v2/presentation/HotelsBookTotalV2VO$State;", "bindDivider", "color", "", "addChildren", "setConstraints", "setUpPriceDetailsRecyclerView", "setUpTotalPriceDetailsRecyclerView", "performClick", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV2View extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final TextAtomV2View agreementTextView;

    @NotNull
    private final LoaderView buttonLoaderView;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final View dividerView;
    private final int dp12;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final PriceDetailsAdapter priceDetailsAdapter;

    @NotNull
    private final RecyclerView priceDetailsRecyclerView;

    @NotNull
    private final TextAtomV2View titleTextView;

    @NotNull
    private final TotalPriceDetailsAdapter totalPriceDetailsAdapter;

    @NotNull
    private final RecyclerView totalPriceDetailsRecyclerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookTotalV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp16 = ResourceExtKt.toPx(16, context);
        int px = ResourceExtKt.toPx(12, context);
        this.dp12 = px;
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.priceDetailsAdapter = new PriceDetailsAdapter(new HotelsBookTotalV2View$priceDetailsAdapter$1(this));
        this.totalPriceDetailsAdapter = new TotalPriceDetailsAdapter(new HotelsBookTotalV2View$totalPriceDetailsAdapter$1(this));
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View, R$id.hotelsBookTotalV2TitleTav, 0, -2);
        this.titleTextView = textAtomV2View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.hotelsBookTotalV2PriceDetailsRv);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.priceDetailsRecyclerView = recyclerView;
        View view = new View(context);
        view.setId(R$id.hotelsBookTotalV2DividerV);
        view.setLayoutParams(new ConstraintLayout.b(0, ResourceExtKt.toPx(1, context)));
        view.setVisibility(8);
        this.dividerView = view;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(R$id.hotelsBookTotalV2TotalPriceDetailsRv);
        recyclerView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setItemAnimator(null);
        this.totalPriceDetailsRecyclerView = recyclerView2;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        buttonV3View = buttonV3View == null ? new ButtonV3View(context, null, 0, 0, 14, null) : buttonV3View;
        buttonV3View.setId(R$id.hotelsBookTotalV2ButtonBv);
        buttonV3View.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.buttonView = buttonV3View;
        LoaderView loaderView = new LoaderView(context, null, 0, 6, null);
        loaderView.setId(R$id.hotelsBookTotalV2ButtonLoaderLv);
        loaderView.setLayoutParams(new ConstraintLayout.b(0, 0));
        loaderView.setPadding(px, px, px, px);
        loaderView.setLoaderSize(LoaderSize.LOADER_300);
        loaderView.setVisibility(8);
        this.buttonLoaderView = loaderView;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View2, R$id.hotelsBookTotalV2AgreementTav, 0, -2);
        this.agreementTextView = textAtomV2View2;
        addChildren();
        setConstraints();
        setUpPriceDetailsRecyclerView();
        setUpTotalPriceDetailsRecyclerView();
    }

    private final void addChildren() {
        addView(this.titleTextView);
        addView(this.priceDetailsRecyclerView);
        addView(this.dividerView);
        addView(this.totalPriceDetailsRecyclerView);
        addView(this.buttonView);
        addView(this.buttonLoaderView);
        addView(this.agreementTextView);
    }

    private final void bindDivider(String color) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        this.dividerView.setVisibility(parseColor != null ? 0 : 8);
        if (parseColor == null) {
            return;
        }
        this.dividerView.setBackgroundColor(parseColor.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performClick(ButtonV3DTO button, Function1<? super AtomAction, Unit> actionHandler) {
        AtomActionDTO action;
        CommonControlSettings common = button.getCommon();
        if (common == null || (action = common.getAction()) == null) {
            return;
        }
        actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo()));
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new HotelsBookTotalV2View$setConstraints$1(this));
    }

    private final void setUpPriceDetailsRecyclerView() {
        RecyclerView recyclerView = this.priceDetailsRecyclerView;
        recyclerView.setAdapter(this.priceDetailsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new PriceDetailsItemDecoration(this.dp16));
    }

    private final void setUpTotalPriceDetailsRecyclerView() {
        RecyclerView recyclerView = this.totalPriceDetailsRecyclerView;
        recyclerView.setAdapter(this.totalPriceDetailsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new PriceDetailsItemDecoration(ResourceExtKt.toPx(6, context)));
    }

    public final void bind(@NotNull HotelsBookTotalV2VO.State item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        TextHolderKt.bind$default(this.titleTextView, item.getTitle(), null, 2, null);
        this.priceDetailsAdapter.setItems(item.getPriceDetails());
        bindDivider(item.getDividerColor());
        this.totalPriceDetailsAdapter.setItems(item.getTotalPriceDetails());
        ButtonV3HolderKt.bind$default(this.buttonView, item.getNextButton(), null, 2, null);
        ViewExtKt.setOnClickListenerThrottle$default(this.buttonView, 0L, new HotelsBookTotalV2View$bind$1(this, item, actionHandler), 1, null);
        this.buttonLoaderView.setBackground(this.buttonView.getBackground());
        this.buttonLoaderView.setColor(this.buttonView.getTitleColor());
        TextAtomV2View textAtomV2View = this.agreementTextView;
        TextDTO agreement = item.getAgreement();
        TextHolderKt.bindOrGone(textAtomV2View, agreement != null ? TextDTOExtensionsKt.withNavigationLinksHandling(agreement, this.agreementTextView, actionHandler) : null, actionHandler);
    }

    @NotNull
    public final LoaderView getButtonLoaderView() {
        return this.buttonLoaderView;
    }

    @NotNull
    public final ButtonV3View getButtonView() {
        return this.buttonView;
    }
}
