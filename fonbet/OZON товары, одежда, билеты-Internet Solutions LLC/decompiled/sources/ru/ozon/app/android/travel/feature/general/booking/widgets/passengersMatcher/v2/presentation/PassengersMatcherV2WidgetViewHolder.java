package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetPassengersMatcherV2Binding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersMatcher.v2.presentation.adapter.PassengersMatcherV2ListAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160&j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "pageStorage", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/PassengersMatcherV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetPassengersMatcherV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetPassengersMatcherV2Binding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/adapter/PassengersMatcherV2ListAdapter;", "passengersMatcherV2ListAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersMatcher/v2/presentation/adapter/PassengersMatcherV2ListAdapter;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersMatcherV2WidgetViewHolder extends k<PassengersMatcherV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetPassengersMatcherV2Binding binding;

    @NotNull
    private final TravelPageKeyValueStorage pageStorage;

    @NotNull
    private final PassengersMatcherV2ListAdapter passengersMatcherV2ListAdapter;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersMatcherV2WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull TravelPageKeyValueStorage pageStorage, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.pageStorage = pageStorage;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetPassengersMatcherV2Binding bind = WidgetPassengersMatcherV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new PassengersMatcherV2WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        PassengersMatcherV2WidgetViewHolder$processedActionHandler$1 passengersMatcherV2WidgetViewHolder$processedActionHandler$1 = new PassengersMatcherV2WidgetViewHolder$processedActionHandler$1(this);
        this.processedActionHandler = passengersMatcherV2WidgetViewHolder$processedActionHandler$1;
        PassengersMatcherV2ListAdapter passengersMatcherV2ListAdapter = new PassengersMatcherV2ListAdapter(passengersMatcherV2WidgetViewHolder$processedActionHandler$1);
        this.passengersMatcherV2ListAdapter = passengersMatcherV2ListAdapter;
        RecyclerView recyclerView = bind.passengerMatcherV2CategoriesRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(passengersMatcherV2ListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PassengersMatcherV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView passengerMatcherV2TitleTAV = this.binding.passengerMatcherV2TitleTAV;
        Intrinsics.checkNotNullExpressionValue(passengerMatcherV2TitleTAV, "passengerMatcherV2TitleTAV");
        TextAtomHolderKt.bind$default(passengerMatcherV2TitleTAV, item.getTitle(), null, 2, null);
        TextAtomView passengerMatcherV2SubtitleTAV = this.binding.passengerMatcherV2SubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(passengerMatcherV2SubtitleTAV, "passengerMatcherV2SubtitleTAV");
        TextAtomHolderKt.bindOrGone$default(passengerMatcherV2SubtitleTAV, item.getSubtitle(), null, 2, null);
        this.passengersMatcherV2ListAdapter.setItems(item.getItems());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PassengersMatcherV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PassengersMatcherV2WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
