package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.core;

import Xc.a;
import Xc.b;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.data.OrderDonePaymentStatusDTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetComponent;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation.OrderDonePaymentStatusVO;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation.Timer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdone.R$layout;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR2\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R2\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040%0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/core/OrderDonePaymentStatusViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/di/OrderDonePaymentStatusWidgetComponent;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/data/OrderDonePaymentStatusDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/data/OrderDonePaymentStatusDTO;J)Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "mapper", "getMapper", "OrderDonePaymentStatusPayloads", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderDonePaymentStatusViewMapper extends WidgetViewMapper2<OrderDonePaymentStatusWidgetComponent, OrderDonePaymentStatusDTO, OrderDonePaymentStatusVO> {
    private final int layout = R$layout.widget_order_done_payment_status;

    @NotNull
    private final Function2<View, ComposerReferences, k<OrderDonePaymentStatusVO>> holderProducer = new OrderDonePaymentStatusViewMapper$holderProducer$1(this);

    @NotNull
    private final Function2<OrderDonePaymentStatusDTO, d, List<OrderDonePaymentStatusVO>> mapper = new OrderDonePaymentStatusViewMapper$mapper$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/core/OrderDonePaymentStatusViewMapper$OrderDonePaymentStatusPayloads;", "", "<init>", "(Ljava/lang/String;I)V", "ICON", SelectionItemDescriptionDTO.TITLE, "SUBTITLE", "TIMER", "PROCESSING", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class OrderDonePaymentStatusPayloads {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OrderDonePaymentStatusPayloads[] $VALUES;
        public static final OrderDonePaymentStatusPayloads ICON = new OrderDonePaymentStatusPayloads("ICON", 0);
        public static final OrderDonePaymentStatusPayloads TITLE = new OrderDonePaymentStatusPayloads(SelectionItemDescriptionDTO.TITLE, 1);
        public static final OrderDonePaymentStatusPayloads SUBTITLE = new OrderDonePaymentStatusPayloads("SUBTITLE", 2);
        public static final OrderDonePaymentStatusPayloads TIMER = new OrderDonePaymentStatusPayloads("TIMER", 3);
        public static final OrderDonePaymentStatusPayloads PROCESSING = new OrderDonePaymentStatusPayloads("PROCESSING", 4);

        private static final /* synthetic */ OrderDonePaymentStatusPayloads[] $values() {
            return new OrderDonePaymentStatusPayloads[]{ICON, TITLE, SUBTITLE, TIMER, PROCESSING};
        }

        static {
            OrderDonePaymentStatusPayloads[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private OrderDonePaymentStatusPayloads(String str, int i11) {
        }

        public static OrderDonePaymentStatusPayloads valueOf(String str) {
            return (OrderDonePaymentStatusPayloads) Enum.valueOf(OrderDonePaymentStatusPayloads.class, str);
        }

        public static OrderDonePaymentStatusPayloads[] values() {
            return (OrderDonePaymentStatusPayloads[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderDonePaymentStatusVO toVo(OrderDonePaymentStatusDTO orderDonePaymentStatusDTO, long j11) {
        Timer timer;
        String icon = orderDonePaymentStatusDTO.getIcon();
        TextAtom title = orderDonePaymentStatusDTO.getTitle();
        List<TextAtom> subtitle = orderDonePaymentStatusDTO.getSubtitle();
        if (subtitle == null) {
            subtitle = K.f71697a;
        }
        List<TextAtom> list = subtitle;
        Long timeLeft = orderDonePaymentStatusDTO.getTimeLeft();
        if (timeLeft != null) {
            timer = new Timer(TimeUnit.SECONDS.toMillis(timeLeft.longValue()) + System.currentTimeMillis(), new TextAtom(new OzonSpannableString(), StyleParser.TextStyle.BODY_M.getStyleName(), UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, 120, null));
        } else {
            timer = null;
        }
        Boolean isProcessing = orderDonePaymentStatusDTO.isProcessing();
        Map<String, TokenizedTrackingInfo> trackingInfo = orderDonePaymentStatusDTO.getTrackingInfo();
        return new OrderDonePaymentStatusVO(j11, icon, title, list, timer, isProcessing, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<OrderDonePaymentStatusVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderDonePaymentStatusDTO, d, List<OrderDonePaymentStatusVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OrderDonePaymentStatusWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return OrderDonePaymentStatusWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull OrderDonePaymentStatusVO oldItem, @NotNull OrderDonePaymentStatusVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getIcon(), newItem.getIcon())) {
            arrayList.add(OrderDonePaymentStatusPayloads.ICON);
        }
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            arrayList.add(OrderDonePaymentStatusPayloads.TITLE);
        }
        if (!Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle())) {
            arrayList.add(OrderDonePaymentStatusPayloads.SUBTITLE);
        }
        if (!Intrinsics.d(oldItem.getTimer(), newItem.getTimer())) {
            arrayList.add(OrderDonePaymentStatusPayloads.TIMER);
        }
        if (!Intrinsics.d(oldItem.getIsProcessing(), newItem.getIsProcessing())) {
            arrayList.add(OrderDonePaymentStatusPayloads.PROCESSING);
        }
        return arrayList;
    }
}
