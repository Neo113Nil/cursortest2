package ru.ozon.app.android.common.serviceCarousel.core;

import A00.a;
import android.view.View;
import h20.InterfaceC6786a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.common.events.StoriesUpdate;
import ru.ozon.app.android.common.serviceCarousel.data.ServiceCarouselDTO;
import ru.ozon.app.android.common.serviceCarousel.di.DaggerServiceCarouselComponent;
import ru.ozon.app.android.common.serviceCarousel.di.ServiceCarouselComponent;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselVO;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder;
import ru.ozon.app.android.common.ui.serviceCarousel.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R,\u0010-\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00106\u001a\u000e\u0012\n\b\u0001\u0012\u000602j\u0002`3018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/common/serviceCarousel/di/ServiceCarouselComponent;", "Lru/ozon/app/android/common/serviceCarousel/data/ServiceCarouselDTO;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselMapper;", "mapper", "Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselMapper;", "getMapper", "()Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselUpdateConsumer;", "updateConsumer", "Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselUpdateConsumer;", "getUpdateConsumer", "()Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselUpdateConsumer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServiceCarouselViewMapper extends WidgetViewMapper2<ServiceCarouselComponent, ServiceCarouselDTO, ServiceCarouselVO> {

    @NotNull
    private final ServiceCarouselMapper mapper = new ServiceCarouselMapper();
    private final int layout = R$layout.widget_service_carousel;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(StoriesUpdate.class, PostponedTransitionStarted.class, ItemViewedUpdate.class, LMStateSaveUpdate.class);

    @NotNull
    private final ServiceCarouselUpdateConsumer updateConsumer = new ServiceCarouselUpdateConsumer();

    @NotNull
    private final Function2<View, ComposerReferences, ServiceCarouselViewHolder> holderProducer = new ServiceCarouselViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServiceCarouselComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerServiceCarouselComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class), (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ServiceCarouselDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ServiceCarouselViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getViewModel();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ServiceCarouselComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ServiceCarouselComponent.class), new JS.a(storage, 9));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ServiceCarouselMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ServiceCarouselUpdateConsumer getUpdateConsumer() {
        return this.updateConsumer;
    }
}
