package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.button;

import Vg.d;
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
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetPassengersMatcherV2ButtonBinding;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000f0\u0019j\u0002`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/button/PassengersMatcherV2ButtonWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/button/PassengersMatcherV2ButtonVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "pageStorage", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/button/PassengersMatcherV2ButtonVO;)V", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetPassengersMatcherV2ButtonBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetPassengersMatcherV2ButtonBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersMatcherV2ButtonWidgetViewHolder extends AbstractC6064a<PassengersMatcherV2ButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private WidgetPassengersMatcherV2ButtonBinding binding;

    @NotNull
    private final TravelPageKeyValueStorage pageStorage;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersMatcherV2ButtonWidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull TravelPageKeyValueStorage pageStorage, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.pageStorage = pageStorage;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new PassengersMatcherV2ButtonWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.processedActionHandler = new PassengersMatcherV2ButtonWidgetViewHolder$processedActionHandler$1(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.binding = WidgetPassengersMatcherV2ButtonBinding.bind(getView());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PassengersMatcherV2ButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetPassengersMatcherV2ButtonBinding widgetPassengersMatcherV2ButtonBinding = this.binding;
        if (widgetPassengersMatcherV2ButtonBinding != null) {
            LargeButtonView passengersMatcherV2Button = widgetPassengersMatcherV2ButtonBinding.passengersMatcherV2Button;
            Intrinsics.checkNotNullExpressionValue(passengersMatcherV2Button, "passengersMatcherV2Button");
            LargeButtonHolderKt.bind(passengersMatcherV2Button, item.getLargeButton(), this.processedActionHandler);
            TextAtomView passengersMatcherV2AgreementTAV = widgetPassengersMatcherV2ButtonBinding.passengersMatcherV2AgreementTAV;
            Intrinsics.checkNotNullExpressionValue(passengersMatcherV2AgreementTAV, "passengersMatcherV2AgreementTAV");
            TextAtomHolderKt.bindOrGone(passengersMatcherV2AgreementTAV, item.getAgreement(), this.actionHandler);
        }
    }
}
