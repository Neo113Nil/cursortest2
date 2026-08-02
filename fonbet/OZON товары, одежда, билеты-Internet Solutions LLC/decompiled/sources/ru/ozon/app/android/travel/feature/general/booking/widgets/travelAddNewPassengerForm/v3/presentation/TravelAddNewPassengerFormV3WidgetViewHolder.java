package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import Bm0.e;
import Em0.c;
import Vg.d;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3View;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v2.view.CommonTextInputV2View;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J+\u0010!\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J#\u0010!\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0014¢\u0006\u0004\b!\u0010#J3\u0010*\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0017048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R$\u00109\u001a\u0012\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001704j\u0002`88\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3View;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel;LWZ/l;)V", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "item", "LEm0/c;", "setFormatWatcher", "(Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)LEm0/c;", "", "observeAction", "()V", "clearFocus", "onAttach", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "payload", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/view/AddNewPassengerFormV3View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel;", "LWZ/l;", "", "", "shouldSkipActionNames", "Ljava/util/Set;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV3WidgetViewHolder extends k<TravelAddNewPassengerFormV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AddNewPassengerFormV3View containerView;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Set<String> shouldSkipActionNames;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TravelAddNewPassengerFormV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelAddNewPassengerFormV3WidgetViewHolder(@NotNull AddNewPassengerFormV3View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references, @NotNull TravelAddNewPassengerFormV3ViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.shouldSkipActionNames = e0.e("aviaPassengerHandbookFormSave", "aviaPassengerHandbookValidate", "railwayPassengerHandbookFormSave", "travelAddNewPassengerFormV3validate", "aviaPassengerHandbookFormSaveV2", "aviaPassengerHandbookValidateV2");
        this.actionHandler = new ActionHandler.Builder(references, this).onPreProcess(new TravelAddNewPassengerFormV3WidgetViewHolder$actionHandler$1(this)).customActionHandlers(new TravelAddNewPassengerFormV3WidgetViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
        this.processedActionHandler = new TravelAddNewPassengerFormV3WidgetViewHolder$processedActionHandler$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearFocus() {
        View findFocus = this.containerView.findFocus();
        if (findFocus == null) {
            return;
        }
        findFocus.clearFocus();
        if (findFocus instanceof CommonTextInputV2View) {
            KeyboardUtilsKt.hideKeyboard(findFocus);
        }
    }

    private final void observeAction() {
        this.viewModel.getActionLiveData().observe(this, new TravelAddNewPassengerFormV3WidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new TravelAddNewPassengerFormV3WidgetViewHolder$observeAction$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c setFormatWatcher(CommonInputV2VO.TextInputV2 item) {
        String mask;
        if (item.getInputType() != 3 || (mask = item.getMask()) == null) {
            return null;
        }
        return new Em0.d(new e(new Cm0.c().parseSlots(mask), true));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelAddNewPassengerFormV3VO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelAddNewPassengerFormV3WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelAddNewPassengerFormV3VO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (item.getIsInputChangedByClient()) {
            return;
        }
        bind(item, info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelAddNewPassengerFormV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        List<String> actionNamesToSkip = item.getActionNamesToSkip();
        if (actionNamesToSkip != null) {
            this.shouldSkipActionNames.addAll(actionNamesToSkip);
        }
        this.viewModel.bindInputs(item.getInputs(), item.getId());
        this.containerView.bind(item, this.processedActionHandler, new TravelAddNewPassengerFormV3WidgetViewHolder$bind$2(this.viewModel), new TravelAddNewPassengerFormV3WidgetViewHolder$bind$3(this), new TravelAddNewPassengerFormV3WidgetViewHolder$bind$4(this.viewModel), new TravelAddNewPassengerFormV3WidgetViewHolder$bind$5(this.viewModel), new TravelAddNewPassengerFormV3WidgetViewHolder$bind$6(this.viewModel), new TravelAddNewPassengerFormV3WidgetViewHolder$bind$7(this.viewModel), this.tokenizedAnalytics);
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        if (c11 != null) {
            C5402x.b(c11, "84655", new TravelAddNewPassengerFormV3WidgetViewHolder$bind$8(this));
        }
    }
}
