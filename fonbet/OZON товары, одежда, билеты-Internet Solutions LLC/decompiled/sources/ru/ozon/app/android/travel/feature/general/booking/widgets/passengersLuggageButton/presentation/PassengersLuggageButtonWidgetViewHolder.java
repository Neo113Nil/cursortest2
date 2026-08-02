package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.presentation;

import Vg.d;
import android.view.View;
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
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.view.PassengersLuggageButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014j\u0002`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/presentation/PassengersLuggageButtonWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/presentation/PassengersLuggageButtonButtonVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "pageStorage", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/presentation/PassengersLuggageButtonButtonVO;)V", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersLuggageButtonWidgetViewHolder extends AbstractC6064a<PassengersLuggageButtonButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelPageKeyValueStorage pageStorage;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersLuggageButtonWidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull TravelPageKeyValueStorage pageStorage, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.pageStorage = pageStorage;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new PassengersLuggageButtonWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.processedActionHandler = new PassengersLuggageButtonWidgetViewHolder$processedActionHandler$1(this);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PassengersLuggageButtonButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        PassengersLuggageButtonView passengersLuggageButtonView = view instanceof PassengersLuggageButtonView ? (PassengersLuggageButtonView) view : null;
        if (passengersLuggageButtonView != null) {
            passengersLuggageButtonView.bind(item, this.processedActionHandler);
        }
    }
}
