package ru.ozon.app.android.pdp.widgets.deliveryV6.di;

import FD.a;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.async.DeliveryV6AsyncPlaceholderMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.footer.DeliveryV6FooterMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.annotation.DeliveryV6HeaderAnnotationMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.button.DeliveryV6HeaderButtonMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.header.title.DeliveryV6HeaderTitleMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.core.sections.DeliveryV6SectionsMapper;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.async.DeliveryV6AsyncPlaceholderViewModel;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 '2\u00060\u0001j\u0002`\u0002:\u0001'R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/di/DeliveryV6WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/async/DeliveryV6AsyncPlaceholderMapper;", "getDeliveryV6AsyncPlaceholderMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/async/DeliveryV6AsyncPlaceholderMapper;", "deliveryV6AsyncPlaceholderMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/title/DeliveryV6HeaderTitleMapper;", "getDeliveryV6HeaderTitleMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/title/DeliveryV6HeaderTitleMapper;", "deliveryV6HeaderTitleMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/button/DeliveryV6HeaderButtonMapper;", "getDeliveryV6HeaderButtonMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/button/DeliveryV6HeaderButtonMapper;", "deliveryV6HeaderButtonMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/annotation/DeliveryV6HeaderAnnotationMapper;", "getDeliveryV6HeaderAnnotationMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/header/annotation/DeliveryV6HeaderAnnotationMapper;", "deliveryV6HeaderAnnotationMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/sections/DeliveryV6SectionsMapper;", "getDeliveryV6SectionsMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/sections/DeliveryV6SectionsMapper;", "deliveryV6SectionsMapper", "Lru/ozon/app/android/pdp/widgets/deliveryV6/core/footer/DeliveryV6FooterMapper;", "getDeliveryV6FooterMapper", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/core/footer/DeliveryV6FooterMapper;", "deliveryV6FooterMapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel;", "getDeliveryV6AsyncPlaceholderViewModel", "()Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/async/DeliveryV6AsyncPlaceholderViewModel;", "deliveryV6AsyncPlaceholderViewModel", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DeliveryV6WidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/deliveryV6/di/DeliveryV6WidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/deliveryV6/di/DeliveryV6WidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DeliveryV6WidgetComponent create$lambda$0(C7475g c7475g) {
            return new DeliveryV6WidgetComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<DeliveryV6WidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(DeliveryV6WidgetComponent.class), new a(storage, 0));
        }
    }

    @NotNull
    DeliveryV6AsyncPlaceholderMapper getDeliveryV6AsyncPlaceholderMapper();

    @NotNull
    DeliveryV6AsyncPlaceholderViewModel getDeliveryV6AsyncPlaceholderViewModel();

    @NotNull
    DeliveryV6FooterMapper getDeliveryV6FooterMapper();

    @NotNull
    DeliveryV6HeaderAnnotationMapper getDeliveryV6HeaderAnnotationMapper();

    @NotNull
    DeliveryV6HeaderButtonMapper getDeliveryV6HeaderButtonMapper();

    @NotNull
    DeliveryV6HeaderTitleMapper getDeliveryV6HeaderTitleMapper();

    @NotNull
    DeliveryV6SectionsMapper getDeliveryV6SectionsMapper();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    l getTokenizedAnalytics();
}
