package ru.ozon.app.android.pdp.widgets.deliveryV6.core.async;

import A00.a;
import WZ.t;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.C7854a;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonDeliveryUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonErrorUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliverySuccessUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTOHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.DeliveryV6VO;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderView;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderViewHolder;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderViewModel;
import ru.ozon.app.android.pdp.widgets.tabs.core.PdpVisibilityTabChangedUpdateKey;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J+\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00020'j\b\u0012\u0004\u0012\u00020\u0002`(2\n\u0010&\u001a\u00060$j\u0002`%H\u0016¢\u0006\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R,\u00105\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R,\u0010:\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0019018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00108¨\u0006;"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/core/async/DeliveryV6AsyncPlaceholderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/di/DeliveryV6WidgetComponent;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/DeliveryV6VO$Placeholder;", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event$OnWidgetFetched;", "event", "Ll20/a;", "viewItem", "Ll10/i;", "container", "", "onAsyncWidgetFetched", "(Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel$Event$OnWidgetFetched;Ll20/a;Ll10/i;)V", "onAsyncWidgetFetchingFailed", "(Ll20/a;Ll10/i;)V", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;", "toDomain", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;)Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;Ll20/d;)Ljava/util/List;", "Lru/ozon/composer/ui/widget/l;", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel;", "asyncViewModel", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel;", "", "placeholderWidgetId", "Ljava/lang/Long;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "getMapper", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryV6AsyncPlaceholderViewMapper extends WidgetViewMapper2<DeliveryV6WidgetComponent, DeliveryDTOHolder, DeliveryV6VO.Placeholder> {
    private DeliveryV6AsyncPlaceholderViewModel asyncViewModel;

    @NotNull
    private final Function2<View, ComposerReferences, DeliveryV6AsyncPlaceholderViewHolder> holderProducer = DeliveryV6AsyncPlaceholderViewMapper$holderProducer$1.INSTANCE;
    private Long placeholderWidgetId;

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAsyncWidgetFetched(final DeliveryV6AsyncPlaceholderViewModel.Event.OnWidgetFetched event, C7854a viewItem, final i container) {
        t mapToTokenizedEvent$default;
        Map<String, String> trackingPayloads = event.getTrackingPayloads();
        if (trackingPayloads != null) {
            component().getTokenizedAnalytics().e(trackingPayloads);
        }
        Iterator<T> it = event.getListOfDeliveryVO().iterator();
        while (it.hasNext()) {
            DeliveryV6VO deliveryV6VO = (DeliveryV6VO) it.next();
            if (deliveryV6VO.getViewDTO() == null || Intrinsics.d(event.getIsHidden(), Boolean.TRUE)) {
                container.M().m(deliveryV6VO.getId());
            } else {
                container.M().update(new AsyncDeliverySuccessUpdateKey(deliveryV6VO));
            }
        }
        String tabGroupId = event.getTabGroupId();
        if (tabGroupId != null) {
            container.M().update(new PdpVisibilityTabChangedUpdateKey(tabGroupId, Intrinsics.d(event.getIsHidden(), Boolean.TRUE)));
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ru.ozon.app.android.pdp.widgets.deliveryV6.core.async.DeliveryV6AsyncPlaceholderViewMapper$onAsyncWidgetFetched$lambda$8$$inlined$runWithDelay$default$1
            @Override // java.lang.Runnable
            public final void run() {
                a.J.InterfaceC0007a asyncCartButtonDeliveryUpdateKey;
                DeliveryDTO.CartButtonTexts cartButtonTexts = DeliveryV6AsyncPlaceholderViewModel.Event.OnWidgetFetched.this.getCartButtonTexts();
                InterfaceC7851b M11 = container.M();
                if (cartButtonTexts == null) {
                    asyncCartButtonDeliveryUpdateKey = AsyncCartButtonErrorUpdateKey.INSTANCE;
                } else {
                    DeliveryDTO.ButtonText firstButton = cartButtonTexts.getFirstButton();
                    AsyncCartButtonDeliveryUpdateKey.ButtonText domain = firstButton != null ? this.toDomain(firstButton) : null;
                    DeliveryDTO.ButtonText secondButton = cartButtonTexts.getSecondButton();
                    asyncCartButtonDeliveryUpdateKey = new AsyncCartButtonDeliveryUpdateKey(domain, secondButton != null ? this.toDomain(secondButton) : null);
                }
                M11.update(asyncCartButtonDeliveryUpdateKey);
            }
        }, 500L);
        Long l11 = this.placeholderWidgetId;
        long longValue = l11 != null ? l11.longValue() : viewItem.f();
        Map<String, TokenizedTrackingInfo> dateTrackingInfo = event.getDateTrackingInfo();
        if (dateTrackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(dateTrackingInfo, Long.valueOf(longValue), null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(component().getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
        }
        container.M().m(longValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAsyncWidgetFetchingFailed(C7854a viewItem, final i container) {
        container.M().p(viewItem.c().d());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ru.ozon.app.android.pdp.widgets.deliveryV6.core.async.DeliveryV6AsyncPlaceholderViewMapper$onAsyncWidgetFetchingFailed$$inlined$runWithDelay$default$1
            @Override // java.lang.Runnable
            public final void run() {
                i.this.M().update(AsyncCartButtonErrorUpdateKey.INSTANCE);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AsyncCartButtonDeliveryUpdateKey.ButtonText toDomain(DeliveryDTO.ButtonText buttonText) {
        return new AsyncCartButtonDeliveryUpdateKey.ButtonText(buttonText.getInCart(), buttonText.getToCart());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull i container, @NotNull l viewItem) {
        P<DeliveryV6AsyncPlaceholderViewModel.Event> events;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        DeliveryV6AsyncPlaceholderViewModel deliveryV6AsyncPlaceholderViewModel = (DeliveryV6AsyncPlaceholderViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.deliveryV6.core.async.DeliveryV6AsyncPlaceholderViewMapper$constructLayout$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DeliveryV6AsyncPlaceholderViewModel deliveryV6AsyncPlaceholderViewModel2 = DeliveryV6AsyncPlaceholderViewMapper.this.component().getDeliveryV6AsyncPlaceholderViewModel();
                Intrinsics.g(deliveryV6AsyncPlaceholderViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return deliveryV6AsyncPlaceholderViewModel2;
            }
        }).a(DeliveryV6AsyncPlaceholderViewModel.class);
        this.asyncViewModel = deliveryV6AsyncPlaceholderViewModel;
        if (deliveryV6AsyncPlaceholderViewModel != null && (events = deliveryV6AsyncPlaceholderViewModel.getEvents()) != null) {
            events.observe(container.K().f(), new DeliveryV6AsyncPlaceholderViewMapperKt$sam$androidx_lifecycle_Observer$0(new DeliveryV6AsyncPlaceholderViewMapper$constructLayout$2(this, viewItem, container)));
        }
        String a11 = viewItem.c().c().a();
        if (a11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String d11 = viewItem.c().d();
        DeliveryV6AsyncPlaceholderViewModel deliveryV6AsyncPlaceholderViewModel2 = this.asyncViewModel;
        if (deliveryV6AsyncPlaceholderViewModel2 != null) {
            deliveryV6AsyncPlaceholderViewModel2.fetchWidget(a11, d11);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, DeliveryV6AsyncPlaceholderViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DeliveryDTOHolder, d, List<DeliveryV6VO.Placeholder>> getMapper() {
        return component().getDeliveryV6AsyncPlaceholderMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryV6WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return DeliveryV6WidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public DeliveryV6AsyncPlaceholderView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        DeliveryV6AsyncPlaceholderView deliveryV6AsyncPlaceholderView = new DeliveryV6AsyncPlaceholderView(context);
        deliveryV6AsyncPlaceholderView.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        return deliveryV6AsyncPlaceholderView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, m20.InterfaceC8046a
    @NotNull
    public List<DeliveryV6VO.Placeholder> map(@NotNull DeliveryDTOHolder state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        String a11 = info.c().a();
        if (a11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        DeliveryV6AsyncPlaceholderViewModel deliveryV6AsyncPlaceholderViewModel = this.asyncViewModel;
        if (deliveryV6AsyncPlaceholderViewModel != null) {
            deliveryV6AsyncPlaceholderViewModel.fetchWidget(a11, info.d());
        }
        List<DeliveryV6VO.Placeholder> map = super.map((DeliveryV6AsyncPlaceholderViewMapper) state, info);
        DeliveryV6VO.Placeholder placeholder = (DeliveryV6VO.Placeholder) C7714v.M(map);
        this.placeholderWidgetId = placeholder != null ? Long.valueOf(placeholder.getId()) : null;
        return map;
    }
}
