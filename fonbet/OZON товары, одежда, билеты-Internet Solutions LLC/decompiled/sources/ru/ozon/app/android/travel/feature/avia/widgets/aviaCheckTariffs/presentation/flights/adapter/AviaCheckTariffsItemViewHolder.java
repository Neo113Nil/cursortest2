package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.adapter;

import WZ.l;
import WZ.t;
import java.util.List;
import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R$\u0010)\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/adapter/AviaCheckTariffsItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsView;", "container", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "onItemClick", "Lkotlin/Function0;", "onExpand", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;LWZ/l;)V", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "onExpandClicked", "(Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;)V", "", "payloads", "bindPayloads", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;Ljava/util/List;)V", "", "id", "setWidgetId", "(J)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "LWZ/l;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEvent", "Ljava/util/Map;", "widgetId", "Ljava/lang/Long;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsItemViewHolder extends j {

    @NotNull
    private final AviaCheckTariffsView container;

    @NotNull
    private final Function0<Unit> onExpand;

    @NotNull
    private final Function2<AtomAction, Integer, Unit> onItemClick;

    @NotNull
    private final l tokenizedAnalytics;
    private Map<String, TokenizedTrackingInfo> viewEvent;
    private Long widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AviaCheckTariffsItemViewHolder(@NotNull AviaCheckTariffsView container, @NotNull Function2<? super AtomAction, ? super Integer, Unit> onItemClick, @NotNull Function0<Unit> onExpand, @NotNull l tokenizedAnalytics) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onExpand, "onExpand");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.container = container;
        this.onItemClick = onItemClick;
        this.onExpand = onExpand;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExpandClicked(CommonControlSettings common) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        this.onExpand.invoke();
        if (common == null || (trackingInfo = common.getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, this.widgetId, null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
    }

    public final void bind(@NotNull AviaCheckTariffsVO.TariffItem.TariffVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.container.bind(item, new AviaCheckTariffsItemViewHolder$bind$1(this), new AviaCheckTariffsItemViewHolder$bind$2(this));
        this.viewEvent = item.getViewTrackingInfo();
    }

    public final void bindPayloads(@NotNull AviaCheckTariffsVO.TariffItem.TariffVO item, @NotNull List<?> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        for (Object obj : payloads) {
            if (obj == AviaCheckTariffsPayload.CONTENT) {
                this.container.bindContent(item, new AviaCheckTariffsItemViewHolder$bindPayloads$1$1(this), new AviaCheckTariffsItemViewHolder$bindPayloads$1$2(this));
                this.viewEvent = item.getViewTrackingInfo();
            } else if (obj == AviaCheckTariffsPayload.APPEARANCE) {
                this.container.bindAppearance(item);
            }
        }
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t tokenizedEvent$default;
        super.onViewInVisibleBounds();
        Map<String, TokenizedTrackingInfo> map = this.viewEvent;
        if (map == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(map, this.widgetId, null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
    }

    public final void setWidgetId(long id2) {
        this.widgetId = Long.valueOf(id2);
    }
}
