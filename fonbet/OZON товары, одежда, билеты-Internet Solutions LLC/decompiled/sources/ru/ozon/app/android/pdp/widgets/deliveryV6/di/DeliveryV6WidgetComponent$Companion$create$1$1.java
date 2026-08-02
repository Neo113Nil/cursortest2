package ru.ozon.app.android.pdp.widgets.deliveryV6.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.async.DeliveryV6AsyncPlaceholderMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.footer.DeliveryV6FooterMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.annotation.DeliveryV6HeaderAnnotationMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.button.DeliveryV6HeaderButtonMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.title.DeliveryV6HeaderTitleMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.sections.DeliveryV6SectionsMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncDTOMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;

@Metadata(d1 = {"\u0000}\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0010\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0010\u001a\u0004\b4\u00105R\u0018\u0010;\u001a\u000607j\u0002`88VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"ru/ozon/app/android/pdp/widgets/deliveryV6/di/DeliveryV6WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/deliveryV6/di/DeliveryV6WidgetComponent;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "platformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/async/DeliveryV6AsyncPlaceholderMapper;", "deliveryV6AsyncPlaceholderMapper$delegate", "LSc/j;", "getDeliveryV6AsyncPlaceholderMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/async/DeliveryV6AsyncPlaceholderMapper;", "deliveryV6AsyncPlaceholderMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncDTOMapper$Default;", "deliveryV6AsyncDTOMapper$delegate", "getDeliveryV6AsyncDTOMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncDTOMapper$Default;", "deliveryV6AsyncDTOMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/title/DeliveryV6HeaderTitleMapper;", "deliveryV6HeaderTitleMapper$delegate", "getDeliveryV6HeaderTitleMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/title/DeliveryV6HeaderTitleMapper;", "deliveryV6HeaderTitleMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/button/DeliveryV6HeaderButtonMapper;", "deliveryV6HeaderButtonMapper$delegate", "getDeliveryV6HeaderButtonMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/button/DeliveryV6HeaderButtonMapper;", "deliveryV6HeaderButtonMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/annotation/DeliveryV6HeaderAnnotationMapper;", "deliveryV6HeaderAnnotationMapper$delegate", "getDeliveryV6HeaderAnnotationMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/annotation/DeliveryV6HeaderAnnotationMapper;", "deliveryV6HeaderAnnotationMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/sections/DeliveryV6SectionsMapper;", "deliveryV6SectionsMapper$delegate", "getDeliveryV6SectionsMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/sections/DeliveryV6SectionsMapper;", "deliveryV6SectionsMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/footer/DeliveryV6FooterMapper;", "deliveryV6FooterMapper$delegate", "getDeliveryV6FooterMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/footer/DeliveryV6FooterMapper;", "deliveryV6FooterMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel;", "getDeliveryV6AsyncPlaceholderViewModel", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel;", "deliveryV6AsyncPlaceholderViewModel", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6WidgetComponent$Companion$create$1$1 implements DeliveryV6WidgetComponent {
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final NetworkComponentApi networkComponentApi;
    private final AndroidPlatformComponentDependencies platformComponentDependencies;
    private final RetainComposerComponentApi retainComposerComponentApi;

    /* renamed from: deliveryV6AsyncPlaceholderMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryV6AsyncPlaceholderMapper = k.b(new DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6AsyncPlaceholderMapper$2(this));

    /* renamed from: deliveryV6AsyncDTOMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryV6AsyncDTOMapper = k.b(DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6AsyncDTOMapper$2.INSTANCE);

    /* renamed from: deliveryV6HeaderTitleMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryV6HeaderTitleMapper = k.b(DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6HeaderTitleMapper$2.INSTANCE);

    /* renamed from: deliveryV6HeaderButtonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryV6HeaderButtonMapper = k.b(DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6HeaderButtonMapper$2.INSTANCE);

    /* renamed from: deliveryV6HeaderAnnotationMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryV6HeaderAnnotationMapper = k.b(DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6HeaderAnnotationMapper$2.INSTANCE);

    /* renamed from: deliveryV6SectionsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryV6SectionsMapper = k.b(DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6SectionsMapper$2.INSTANCE);

    /* renamed from: deliveryV6FooterMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j deliveryV6FooterMapper = k.b(DeliveryV6WidgetComponent$Companion$create$1$1$deliveryV6FooterMapper$2.INSTANCE);

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(DeliveryV6WidgetComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

    DeliveryV6WidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.platformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    public DeliveryV6AsyncDTOMapper.Default getDeliveryV6AsyncDTOMapper() {
        return (DeliveryV6AsyncDTOMapper.Default) this.deliveryV6AsyncDTOMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public DeliveryV6AsyncPlaceholderMapper getDeliveryV6AsyncPlaceholderMapper() {
        return (DeliveryV6AsyncPlaceholderMapper) this.deliveryV6AsyncPlaceholderMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public DeliveryV6AsyncPlaceholderViewModel getDeliveryV6AsyncPlaceholderViewModel() {
        return new DeliveryV6AsyncPlaceholderViewModel(this.composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository(), getDeliveryV6AsyncDTOMapper());
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public DeliveryV6FooterMapper getDeliveryV6FooterMapper() {
        return (DeliveryV6FooterMapper) this.deliveryV6FooterMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public DeliveryV6HeaderAnnotationMapper getDeliveryV6HeaderAnnotationMapper() {
        return (DeliveryV6HeaderAnnotationMapper) this.deliveryV6HeaderAnnotationMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public DeliveryV6HeaderButtonMapper getDeliveryV6HeaderButtonMapper() {
        return (DeliveryV6HeaderButtonMapper) this.deliveryV6HeaderButtonMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public DeliveryV6HeaderTitleMapper getDeliveryV6HeaderTitleMapper() {
        return (DeliveryV6HeaderTitleMapper) this.deliveryV6HeaderTitleMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public DeliveryV6SectionsMapper getDeliveryV6SectionsMapper() {
        return (DeliveryV6SectionsMapper) this.deliveryV6SectionsMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.deliveryV6.di.DeliveryV6WidgetComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
