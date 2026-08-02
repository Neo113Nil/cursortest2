package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation;

import C.h0;
import J2.b;
import SS.a;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.l;
import WZ.t;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.adapter.TravelScrollPriceCalendarAdapter;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.adapter.TravelScrollPriceCalendarAdapterDecoration;
import ru.ozon.app.android.travel.utils.CenterSmoothScroller;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010 J#\u0010&\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00022\n\u0010%\u001a\u00060#j\u0002`$H\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarViewModel;LWZ/l;)V", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "price", "", "trackAnalytics", "(Ljava/util/Map;Ljava/lang/String;)V", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "getCustomParamsModifier", "(Ljava/lang/String;)LWZ/e;", "", "selectedItemPosition", "scrollToSelectedItem", "(Ljava/lang/Integer;)V", "observeAction", "()V", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO;Ll20/d;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/adapter/TravelScrollPriceCalendarAdapter;", "adapterSelect", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/adapter/TravelScrollPriceCalendarAdapter;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelScrollPriceCalendarWidgetViewHolder extends k<TravelScrollPriceCalendarVO> {

    @NotNull
    private TravelScrollPriceCalendarAdapter adapterSelect;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TravelScrollPriceCalendarViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelScrollPriceCalendarWidgetViewHolder(@NotNull RecyclerView containerView, @NotNull ComposerReferences references, @NotNull TravelScrollPriceCalendarViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adapterSelect = new TravelScrollPriceCalendarAdapter(new ActionHandler.Builder(references, this).buildHandler(), new TravelScrollPriceCalendarWidgetViewHolder$adapterSelect$1(this));
        containerView.setLayoutManager(new LinearLayoutManager(containerView.getContext(), 0, false));
        containerView.setAdapter(this.adapterSelect);
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        containerView.addItemDecoration(new TravelScrollPriceCalendarAdapterDecoration(context));
        containerView.setRecycledViewPool(references.getComposerViewPoolProvider().getViewPool());
        containerView.setNestedScrollingEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$1(TravelScrollPriceCalendarWidgetViewHolder travelScrollPriceCalendarWidgetViewHolder, TravelScrollPriceCalendarVO travelScrollPriceCalendarVO) {
        travelScrollPriceCalendarWidgetViewHolder.scrollToSelectedItem(travelScrollPriceCalendarVO.getSelectedItemPosition());
    }

    private final e getCustomParamsModifier(String price) {
        return new a(price, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g getCustomParamsModifier$lambda$4(String str, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap a11 = h.a(params.b());
        a11.put("status", String.valueOf(str));
        return g.a(params, a11, null, 2);
    }

    private final void observeAction() {
        this.viewModel.getActionLiveData().observe(this, new TravelScrollPriceCalendarWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new TravelScrollPriceCalendarWidgetViewHolder$observeAction$1(this)));
    }

    private final void scrollToSelectedItem(Integer selectedItemPosition) {
        if (selectedItemPosition != null) {
            RecyclerView recyclerView = this.containerView;
            recyclerView.post(new b(2, recyclerView, selectedItemPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToSelectedItem$lambda$7$lambda$6$lambda$5(RecyclerView recyclerView, Integer num) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(context);
        centerSmoothScroller.setTargetPosition(num.intValue());
        layoutManager.startSmoothScroll(centerSmoothScroller);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackAnalytics(Map<String, TokenizedTrackingInfo> trackingInfo, String price) {
        if (trackingInfo != null) {
            TravelScrollPriceCalendarVO boundData = getBoundData();
            t tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, boundData != null ? Long.valueOf(boundData.getId()) : null, null, 2, null);
            if (tokenizedEvent$default != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents(this.tokenizedAnalytics, tokenizedEvent$default, getCustomParamsModifier(price));
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelScrollPriceCalendarVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getLoadingAction() != null) {
            this.viewModel.performApiAction(item.getLoadingAction(), getTrackingData());
        }
        this.adapterSelect.setItems(item.getDateTabs(), new h0(7, this, item));
    }
}
