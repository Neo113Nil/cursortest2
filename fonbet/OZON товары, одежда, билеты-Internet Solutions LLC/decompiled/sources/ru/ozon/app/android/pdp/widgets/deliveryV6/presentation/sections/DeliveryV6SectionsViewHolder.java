package ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections;

import W10.c;
import WZ.l;
import WZ.t;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.ItemAnimator;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionsAdapter;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/DeliveryV6SectionsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "", "trackView", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;)Lkotlin/Unit;", "bind", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Sections;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter;", "adapter", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionsAdapter;", "", "isViewTracked", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionsViewHolder extends TabEmbeddedWidgetViewHolder<DeliveryV6VO.Sections> {

    @NotNull
    private final DeliveryV6SectionsAdapter adapter;
    private boolean isViewTracked;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryV6SectionsViewHolder(@NotNull RecyclerView recyclerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor handlersInhibitor) {
        super(recyclerView, refs, null, 4, null);
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.recyclerView = recyclerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).buildHandler();
        this.onAction = buildHandler;
        DeliveryV6SectionsAdapter deliveryV6SectionsAdapter = new DeliveryV6SectionsAdapter(buildHandler, this);
        this.adapter = deliveryV6SectionsAdapter;
        recyclerView.setAdapter(deliveryV6SectionsAdapter);
        recyclerView.setItemAnimator(new ItemAnimator());
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public void bind(@NotNull DeliveryV6VO.Sections item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z11 = item.getViewDTO() != null;
        RecyclerView recyclerView = this.recyclerView;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = z11 ? -2 : 0;
        layoutParams.height = i12;
        if (i11 != i12) {
            recyclerView.setLayoutParams(layoutParams);
        }
        this.adapter.submitList(item.getViewDTO());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull DeliveryV6VO.Sections item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        this.isViewTracked = true;
        trackView(item);
    }

    private final Unit trackView(DeliveryV6VO.Sections item) {
        t tokenizedEvent;
        l lVar = this.tokenizedAnalytics;
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        TokenizedAnalyticsExtKt.processViewEvents(lVar, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null) : null);
        List<? extends DeliveryV6SectionItem> viewDTO = item.getViewDTO();
        if (viewDTO == null) {
            return null;
        }
        List<? extends DeliveryV6SectionItem> list = viewDTO;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (DeliveryV6SectionItem deliveryV6SectionItem : list) {
            if (deliveryV6SectionItem instanceof DeliveryV6SectionItem.CellDefault) {
                tokenizedEvent = ((DeliveryV6SectionItem.CellDefault) deliveryV6SectionItem).getTokenizedEvent();
            } else {
                tokenizedEvent = deliveryV6SectionItem instanceof DeliveryV6SectionItem.Pickup ? ((DeliveryV6SectionItem.Pickup) deliveryV6SectionItem).getTokenizedEvent() : null;
            }
            arrayList.add(tokenizedEvent);
        }
        l lVar2 = this.tokenizedAnalytics;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TokenizedAnalyticsExtKt.processViewEvents(lVar2, (t) it.next());
        }
        return Unit.f71690a;
    }
}
