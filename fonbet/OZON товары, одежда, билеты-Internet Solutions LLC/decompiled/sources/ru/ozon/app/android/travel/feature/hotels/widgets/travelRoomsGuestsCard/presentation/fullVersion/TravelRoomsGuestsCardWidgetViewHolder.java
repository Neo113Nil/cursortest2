package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.fullVersion;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.a;
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
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetTravelRoomsGuestsCardBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.TravelRoomsGuestsCardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.fullVersion.adapter.TravelRoomAndGuestsAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.fullVersion.adapter.TravelRoomAndGuestsItemDecoration;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00100)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/fullVersion/TravelRoomsGuestsCardWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomsGuestsCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;LWZ/l;)V", "", "setUpRecyclerView", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomsGuestsCardVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomsGuestsCardVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetTravelRoomsGuestsCardBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetTravelRoomsGuestsCardBinding;", "", "dp16", "I", "dp12", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/fullVersion/adapter/TravelRoomAndGuestsAdapter;", "roomAndGuestsAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/fullVersion/adapter/TravelRoomAndGuestsAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/fullVersion/adapter/TravelRoomAndGuestsItemDecoration;", "decoration", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/fullVersion/adapter/TravelRoomAndGuestsItemDecoration;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRoomsGuestsCardWidgetViewHolder extends k<TravelRoomsGuestsCardVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelRoomsGuestsCardBinding binding;
    private final TravelRoomAndGuestsItemDecoration decoration;
    private final int dp12;
    private final int dp16;

    @NotNull
    private final TravelRoomAndGuestsAdapter roomAndGuestsAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRoomsGuestsCardWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetTravelRoomsGuestsCardBinding bind = WidgetTravelRoomsGuestsCardBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        int px = ResourceExtKt.toPx(16, getContext());
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(12, getContext());
        this.dp12 = px2;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelRoomsGuestsCardWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        this.roomAndGuestsAdapter = new TravelRoomAndGuestsAdapter(buildHandler);
        Drawable drawable = a.getDrawable(getContext(), R$drawable.line_divider);
        this.decoration = drawable != null ? new TravelRoomAndGuestsItemDecoration(getContext(), drawable) : null;
        setUpRecyclerView();
        bind.travelHotelRoomDetailsInfoBadge.setPadding(px, px2, px, px2);
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = this.binding.travelHotelRoomDetailsRecyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.roomAndGuestsAdapter);
        TravelRoomAndGuestsItemDecoration travelRoomAndGuestsItemDecoration = this.decoration;
        if (travelRoomAndGuestsItemDecoration != null) {
            recyclerView.removeItemDecoration(travelRoomAndGuestsItemDecoration);
            recyclerView.addItemDecoration(travelRoomAndGuestsItemDecoration);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelRoomsGuestsCardVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView travelHotelRoomDetailsTitleTextView = this.binding.travelHotelRoomDetailsTitleTextView;
        Intrinsics.checkNotNullExpressionValue(travelHotelRoomDetailsTitleTextView, "travelHotelRoomDetailsTitleTextView");
        TextAtomHolderKt.bind$default(travelHotelRoomDetailsTitleTextView, item.getTitle(), null, 2, null);
        this.binding.travelHotelRoomDetailsInfoBadge.bindOrGone(item.getInfoBadge(), this.actionHandler);
        RecyclerView travelHotelRoomDetailsRecyclerView = this.binding.travelHotelRoomDetailsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(travelHotelRoomDetailsRecyclerView, "travelHotelRoomDetailsRecyclerView");
        travelHotelRoomDetailsRecyclerView.setVisibility(item.getAreDetailsVisible() ? 0 : 8);
        this.roomAndGuestsAdapter.setItems(item.getDetails());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelRoomsGuestsCardVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelRoomsGuestsCardWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
