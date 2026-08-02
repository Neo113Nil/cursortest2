package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.footer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "viewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterVO;)V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getAddRoomButton", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "addRoomButton", "getApplyButton", "applyButton", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3FooterWidgetViewHolder extends AbstractC6064a<TouristCountSelectorV3FooterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final TouristCountSelectorV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorV3FooterWidgetViewHolder(@NotNull i container, @NotNull TouristCountSelectorV3ViewModel viewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).onClick(new TouristCountSelectorV3FooterWidgetViewHolder$actionHandler$1(this)).onComposerAction(new TouristCountSelectorV3FooterWidgetViewHolder$actionHandler$2(viewModel)).buildHandler();
    }

    private final ButtonV3View getAddRoomButton() {
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        if (childAt instanceof ButtonV3View) {
            return (ButtonV3View) childAt;
        }
        return null;
    }

    private final ButtonV3View getApplyButton() {
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(1) : null;
        if (childAt instanceof ButtonV3View) {
            return (ButtonV3View) childAt;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        View Y11 = this.container.Y();
        Intrinsics.g(Y11, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) Y11).setClipChildren(false);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        View Y11 = this.container.Y();
        Intrinsics.g(Y11, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) Y11).setClipChildren(true);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TouristCountSelectorV3FooterVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ButtonV3View addRoomButton = getAddRoomButton();
        if (addRoomButton != null) {
            ButtonV3HolderKt.bindOrGone(addRoomButton, item.getAddRoomButton(), this.actionHandler);
            addRoomButton.setVisibility(item.getIsAddRoomButtonVisible() ? 0 : 8);
        }
        ButtonV3View applyButton = getApplyButton();
        if (applyButton != null) {
            ButtonV3HolderKt.bind(applyButton, item.getApplyButton(), this.actionHandler);
        }
    }
}
