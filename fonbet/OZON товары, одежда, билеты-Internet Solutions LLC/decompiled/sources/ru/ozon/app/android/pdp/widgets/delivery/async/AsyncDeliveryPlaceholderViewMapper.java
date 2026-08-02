package ru.ozon.app.android.pdp.widgets.delivery.async;

import A00.a;
import Sc.o;
import WZ.t;
import a00.C4908c;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncCartButtonDeliveryUpdateKey;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryWidgetViewModel;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTOHolder;
import ru.ozon.app.android.pdp.widgets.delivery.di.DeliveryWidgetComponent;
import ru.ozon.app.android.pdp.widgets.delivery.v5.core.DeliveryV5MapperKt;
import ru.ozon.app.android.pdp.widgets.delivery.v5.presentation.DeliveryV5Vo;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J=\u0010*\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010&\u001a\u00020\f2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020\t0'j\u0002`(H\u0016¢\u0006\u0004\b*\u0010+J+\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00020/j\b\u0012\u0004\u0012\u00020\u0002`02\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R,\u0010;\u001a\u0014\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020:088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR,\u0010C\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>¨\u0006D"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryPlaceholderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/delivery/di/DeliveryWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryPlaceholderVo;", "<init>", "()V", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event;", "event", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "handleEvent", "(Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel$Event;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;", "widgetDto", "onAsyncWidgetFetched", "(Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "error", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;", "toDomain", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$ButtonText;)Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncCartButtonDeliveryUpdateKey$ButtonText;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTOHolder;Ll20/d;)Ljava/util/List;", "Landroid/view/ViewGroup;", "composerRootView", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "viewItemHelper", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryPlaceholderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel;", "asyncViewModel", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel;", "getMapper", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public class AsyncDeliveryPlaceholderViewMapper extends WidgetViewMapper2<DeliveryWidgetComponent, DeliveryDTOHolder, AsyncDeliveryPlaceholderVo> {
    private AsyncDeliveryWidgetViewModel asyncViewModel;
    private final int layout = R$layout.pdp_widget_no_ui;

    @NotNull
    private final Function2<View, ComposerReferences, AsyncDeliveryPlaceholderViewHolder> holderProducer = AsyncDeliveryPlaceholderViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(AsyncDeliveryWidgetViewModel.Event event, l viewObject, ComposerReferences refs) {
        if (event instanceof AsyncDeliveryWidgetViewModel.Event.OnWidgetFetched) {
            onAsyncWidgetFetched(((AsyncDeliveryWidgetViewModel.Event.OnWidgetFetched) event).getWidgetDto(), viewObject, refs);
        } else {
            if (!(event instanceof AsyncDeliveryWidgetViewModel.Event.OnWidgetFetchingFailed)) {
                throw new o();
            }
            onAsyncWidgetFetchingFailed(((AsyncDeliveryWidgetViewModel.Event.OnWidgetFetchingFailed) event).getError(), refs);
        }
    }

    private final void onAsyncWidgetFetched(final ComposerAsyncWidgetResponse<DeliveryDTO> widgetDto, l viewObject, ComposerReferences refs) {
        Map<String, String> trackingPayloads = widgetDto.getTrackingPayloads();
        if (trackingPayloads != null) {
            component().getTokenizedAnalytics().e(trackingPayloads);
        }
        final InterfaceC7851b controller = refs.getController();
        DeliveryV5Vo extractVo = DeliveryV5MapperKt.extractVo(widgetDto.getState(), viewObject.c());
        controller.update(new AsyncDeliverySuccessUpdateKey(extractVo));
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryPlaceholderViewMapper$onAsyncWidgetFetched$$inlined$runWithDelay$default$1
            @Override // java.lang.Runnable
            public final void run() {
                a.J.InterfaceC0007a asyncCartButtonDeliveryUpdateKey;
                DeliveryDTO.CartButtonTexts cartButtonTexts = ((DeliveryDTO) ComposerAsyncWidgetResponse.this.getState()).getCartButtonTexts();
                if (cartButtonTexts == null) {
                    asyncCartButtonDeliveryUpdateKey = AsyncCartButtonErrorUpdateKey.INSTANCE;
                } else {
                    DeliveryDTO.ButtonText firstButton = cartButtonTexts.getFirstButton();
                    AsyncCartButtonDeliveryUpdateKey.ButtonText domain = firstButton != null ? this.toDomain(firstButton) : null;
                    DeliveryDTO.ButtonText secondButton = cartButtonTexts.getSecondButton();
                    asyncCartButtonDeliveryUpdateKey = new AsyncCartButtonDeliveryUpdateKey(domain, secondButton != null ? this.toDomain(secondButton) : null);
                }
                controller.update(asyncCartButtonDeliveryUpdateKey);
            }
        }, 500L);
        Map<String, TokenizedTrackingInfo> dateTrackingInfo = widgetDto.getState().getDateTrackingInfo();
        t mapToTokenizedEvent$default = dateTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(dateTrackingInfo, Long.valueOf(extractVo.getId()), null, 2, null) : null;
        if (mapToTokenizedEvent$default != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(component().getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
        }
    }

    private final void onAsyncWidgetFetchingFailed(Throwable error, final ComposerReferences refs) {
        refs.getController().update(new AsyncDeliveryErrorUpdateKey(error));
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryPlaceholderViewMapper$onAsyncWidgetFetchingFailed$$inlined$runWithDelay$default$1
            @Override // java.lang.Runnable
            public final void run() {
                ComposerReferences.this.getController().update(AsyncCartButtonErrorUpdateKey.INSTANCE);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AsyncCartButtonDeliveryUpdateKey.ButtonText toDomain(DeliveryDTO.ButtonText buttonText) {
        return new AsyncCartButtonDeliveryUpdateKey.ButtonText(buttonText.getInCart(), buttonText.getToCart());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        P<AsyncDeliveryWidgetViewModel.Event> events;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        C4908c g10 = references.getContainer().g();
        AsyncDeliveryWidgetViewModel asyncDeliveryWidgetViewModel = (AsyncDeliveryWidgetViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryPlaceholderViewMapper$constructLayout$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AsyncDeliveryWidgetViewModel asyncViewModel = AsyncDeliveryPlaceholderViewMapper.this.component().getAsyncViewModel();
                Intrinsics.g(asyncViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return asyncViewModel;
            }
        }).a(AsyncDeliveryWidgetViewModel.class);
        this.asyncViewModel = asyncDeliveryWidgetViewModel;
        if (asyncDeliveryWidgetViewModel != null && (events = asyncDeliveryWidgetViewModel.getEvents()) != null) {
            events.observe(g10, new AsyncDeliveryPlaceholderViewMapperKt$sam$androidx_lifecycle_Observer$0(new AsyncDeliveryPlaceholderViewMapper$constructLayout$2(this, viewObject, references)));
        }
        String a11 = viewObject.c().c().a();
        if (a11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AsyncDeliveryWidgetViewModel asyncDeliveryWidgetViewModel2 = this.asyncViewModel;
        if (asyncDeliveryWidgetViewModel2 != null) {
            asyncDeliveryWidgetViewModel2.fetchWidget(a11);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AsyncDeliveryPlaceholderViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DeliveryDTOHolder, d, List<AsyncDeliveryPlaceholderVo>> getMapper() {
        return component().getAsyncMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DeliveryWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return DeliveryWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, m20.InterfaceC8046a
    @NotNull
    public List<AsyncDeliveryPlaceholderVo> map(@NotNull DeliveryDTOHolder state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        String a11 = info.c().a();
        if (a11 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AsyncDeliveryWidgetViewModel asyncDeliveryWidgetViewModel = this.asyncViewModel;
        if (asyncDeliveryWidgetViewModel != null) {
            asyncDeliveryWidgetViewModel.fetchWidget(a11);
        }
        return super.map((AsyncDeliveryPlaceholderViewMapper) state, info);
    }
}
