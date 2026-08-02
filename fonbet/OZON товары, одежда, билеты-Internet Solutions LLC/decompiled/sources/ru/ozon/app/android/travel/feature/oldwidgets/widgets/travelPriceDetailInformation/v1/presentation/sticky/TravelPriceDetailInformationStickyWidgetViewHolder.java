package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky;

import Vg.d;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.oldwidgets.databinding.WidgetTravelPriceDetailInformationStickyBinding;
import ru.ozon.app.android.travel.molecules.utils.travelPriceDetailInformation.WidgetVisibilityObservable;
import ru.ozon.app.android.travel.utils.animator.ListTotalStickyAnimator;
import ru.ozon.app.android.travel.utils.animator.StickyAnimator;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001#\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00110&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationStickyWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationStickyVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;", "widgetVisibilityObservable", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationStickyVO;)V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/travel/molecules/utils/travelPriceDetailInformation/WidgetVisibilityObservable;", "Lru/ozon/app/android/travel/feature/oldwidgets/databinding/WidgetTravelPriceDetailInformationStickyBinding;", "binding", "Lru/ozon/app/android/travel/feature/oldwidgets/databinding/WidgetTravelPriceDetailInformationStickyBinding;", "Lru/ozon/app/android/travel/utils/animator/StickyAnimator;", "animator", "Lru/ozon/app/android/travel/utils/animator/StickyAnimator;", "", "isHiddenBeforeLayout", "Z", "ru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationStickyWidgetViewHolder$stickyScrollListener$1", "stickyScrollListener", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationStickyWidgetViewHolder$stickyScrollListener$1;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationStickyWidgetViewHolder extends AbstractC6064a<TravelPriceDetailInformationStickyVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private StickyAnimator animator;
    private WidgetTravelPriceDetailInformationStickyBinding binding;

    @NotNull
    private final i container;
    private boolean isHiddenBeforeLayout;

    @NotNull
    private final TravelPriceDetailInformationStickyWidgetViewHolder$stickyScrollListener$1 stickyScrollListener;

    @NotNull
    private final WidgetVisibilityObservable widgetVisibilityObservable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky.TravelPriceDetailInformationStickyWidgetViewHolder$stickyScrollListener$1] */
    public TravelPriceDetailInformationStickyWidgetViewHolder(@NotNull i container, @NotNull WidgetVisibilityObservable widgetVisibilityObservable, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(widgetVisibilityObservable, "widgetVisibilityObservable");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.widgetVisibilityObservable = widgetVisibilityObservable;
        this.stickyScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky.TravelPriceDetailInformationStickyWidgetViewHolder$stickyScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    StickyAnimator stickyAnimator = TravelPriceDetailInformationStickyWidgetViewHolder.this.animator;
                    if (stickyAnimator != null) {
                        stickyAnimator.show();
                        return;
                    }
                    return;
                }
                StickyAnimator stickyAnimator2 = TravelPriceDetailInformationStickyWidgetViewHolder.this.animator;
                if (stickyAnimator2 != null) {
                    stickyAnimator2.hide();
                }
            }
        };
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new TravelPriceDetailInformationStickyWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        ConstraintLayout constraintLayout;
        WidgetTravelPriceDetailInformationStickyBinding bind = WidgetTravelPriceDetailInformationStickyBinding.bind(getView());
        this.binding = bind;
        if (bind != null && (constraintLayout = bind.getConstraintLayout()) != null) {
            int i11 = Y.f42258g;
            if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky.TravelPriceDetailInformationStickyWidgetViewHolder$onWidgetCreated$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        view.removeOnLayoutChangeListener(this);
                        TravelPriceDetailInformationStickyWidgetViewHolder.this.animator = new ListTotalStickyAnimator(view, view.getMeasuredHeight());
                        StickyAnimator stickyAnimator = TravelPriceDetailInformationStickyWidgetViewHolder.this.animator;
                        if (stickyAnimator != null) {
                            stickyAnimator.setForceHide(TravelPriceDetailInformationStickyWidgetViewHolder.this.isHiddenBeforeLayout);
                        }
                    }
                });
            } else {
                this.animator = new ListTotalStickyAnimator(constraintLayout, constraintLayout.getMeasuredHeight());
                StickyAnimator stickyAnimator = this.animator;
                if (stickyAnimator != null) {
                    stickyAnimator.setForceHide(this.isHiddenBeforeLayout);
                }
            }
        }
        this.container.e0().addOnScrollListener(this.stickyScrollListener);
        this.widgetVisibilityObservable.observe(this, new TravelPriceDetailInformationStickyWidgetViewHolder$onWidgetCreated$2(this));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.container.e0().removeOnScrollListener(this.stickyScrollListener);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TravelPriceDetailInformationStickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetTravelPriceDetailInformationStickyBinding widgetTravelPriceDetailInformationStickyBinding = this.binding;
        if (widgetTravelPriceDetailInformationStickyBinding != null) {
            widgetTravelPriceDetailInformationStickyBinding.totalPriceTV.setText(item.getTotalPrice());
            TextView subtitleTV = widgetTravelPriceDetailInformationStickyBinding.subtitleTV;
            Intrinsics.checkNotNullExpressionValue(subtitleTV, "subtitleTV");
            TextViewExtKt.setTextOrGone(subtitleTV, item.getSubtitle());
            SmallButtonView smallButton = widgetTravelPriceDetailInformationStickyBinding.smallButton;
            Intrinsics.checkNotNullExpressionValue(smallButton, "smallButton");
            WrappedButtonHolderKt.bind(smallButton, item.getSmallButton(), this.actionHandler);
        }
    }
}
