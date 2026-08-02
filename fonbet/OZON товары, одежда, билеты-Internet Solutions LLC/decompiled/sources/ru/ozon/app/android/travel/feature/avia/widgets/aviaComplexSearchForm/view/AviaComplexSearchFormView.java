package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.adapter.ComplexRouteAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.adapter.ComplexRouteItemDecoration;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J^\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00150\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0013J\u0014\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J$\u0010#\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010$2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\"\u0010%\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020&2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\"\u0010'\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020$2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0007J\b\u0010*\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/AviaComplexSearchFormView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "routeRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "addRouteButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "passengerView", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldView;", "submitButtonView", "routeAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/adapter/ComplexRouteAdapter;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onSwipedListener", "Lkotlin/Function2;", "", "onAddRouteButtonClickedListener", "Lkotlin/Function0;", "getIsDemoAnimationRequired", "bind", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO;", "bindRouteList", "routes", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "bindAddRouteButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "bindPassengerButton", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "bindSubmitButton", "hideDeleteButton", "position", "addChildren", "createButtonView", "topMargin", "setUpRouteRecyclerView", "updatePassengerButtonTopMargin", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaComplexSearchFormView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonV3View addRouteButtonView;
    private final int dp16;
    private final int dp8;
    private Function1<? super Boolean, Boolean> getIsDemoAnimationRequired;
    private Function0<Unit> onAddRouteButtonClickedListener;
    private Function2<? super Boolean, ? super Integer, Unit> onSwipedListener;

    @NotNull
    private final IconFieldView passengerView;

    @NotNull
    private final ComplexRouteAdapter routeAdapter;

    @NotNull
    private final RecyclerView routeRecyclerView;

    @NotNull
    private final ButtonV3View submitButtonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaComplexSearchFormView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        this.dp16 = ResourceExtKt.toPx(16, context);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        this.routeRecyclerView = recyclerView;
        this.addRouteButtonView = createButtonView(px);
        IconFieldView iconFieldView = new IconFieldView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = px;
        iconFieldView.setLayoutParams(layoutParams);
        this.passengerView = iconFieldView;
        this.submitButtonView = createButtonView(ResourceExtKt.toPx(16, context));
        this.routeAdapter = new ComplexRouteAdapter(new AviaComplexSearchFormView$routeAdapter$1(this), new AviaComplexSearchFormView$routeAdapter$2(this), new AviaComplexSearchFormView$routeAdapter$3(this));
        setOrientation(1);
        addChildren();
        setUpRouteRecyclerView();
    }

    private final void addChildren() {
        addView(this.routeRecyclerView);
        addView(this.addRouteButtonView);
        addView(this.passengerView);
        addView(this.submitButtonView);
    }

    private final ButtonV3View createButtonView(int topMargin) {
        ButtonV3View buttonV3View = (ButtonV3View) q.f64554a.i(N.b(ButtonV3View.class), getContext());
        if (buttonV3View == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = topMargin;
        buttonV3View.setLayoutParams(layoutParams);
        return buttonV3View;
    }

    private final void setUpRouteRecyclerView() {
        RecyclerView recyclerView = this.routeRecyclerView;
        recyclerView.setAdapter(this.routeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new ComplexRouteItemDecoration(ResourceExtKt.toPx(8, context)));
        recyclerView.setItemAnimator(null);
    }

    private final void updatePassengerButtonTopMargin(int topMargin) {
        ViewGroup.LayoutParams layoutParams = this.passengerView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) != topMargin) {
            IconFieldView iconFieldView = this.passengerView;
            ViewGroup.LayoutParams layoutParams2 = iconFieldView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.topMargin = topMargin;
            iconFieldView.setLayoutParams(layoutParams3);
        }
    }

    public final void bind(@NotNull AviaComplexSearchFormVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super Boolean, ? super Integer, Unit> onSwipedListener, @NotNull Function0<Unit> onAddRouteButtonClickedListener, @NotNull Function1<? super Boolean, Boolean> getIsDemoAnimationRequired) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onSwipedListener, "onSwipedListener");
        Intrinsics.checkNotNullParameter(onAddRouteButtonClickedListener, "onAddRouteButtonClickedListener");
        Intrinsics.checkNotNullParameter(getIsDemoAnimationRequired, "getIsDemoAnimationRequired");
        this.actionHandler = actionHandler;
        this.onSwipedListener = onSwipedListener;
        this.onAddRouteButtonClickedListener = onAddRouteButtonClickedListener;
        this.getIsDemoAnimationRequired = getIsDemoAnimationRequired;
        bindRouteList(item.getFlights());
        bindAddRouteButton(item.getAddFlight(), actionHandler);
        bindPassengerButton(item.getPassenger(), actionHandler);
        bindSubmitButton(item.getSubmitButton(), actionHandler);
    }

    public final void bindAddRouteButton(ButtonV3DTO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        updatePassengerButtonTopMargin(item == null ? this.dp16 : this.dp8);
        ButtonV3HolderKt.bindOrGone(this.addRouteButtonView, item, new AviaComplexSearchFormView$bindAddRouteButton$1(this, actionHandler));
    }

    public final void bindPassengerButton(@NotNull IconFieldVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.passengerView.bindOrGone(item, false, actionHandler);
    }

    public final void bindRouteList(@NotNull List<AviaComplexSearchFormVO.Flight> routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.routeAdapter.update(routes);
    }

    public final void bindSubmitButton(@NotNull ButtonV3DTO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bind(this.submitButtonView, item, actionHandler);
    }

    public final void hideDeleteButton(int position) {
        this.routeAdapter.notifyItemChanged(position, "ComplexRouteHideDeleteButtonPayload");
    }
}
