package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di;

import Du.C2881a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.DeliveryWidgetV4Mapper;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.data.DeliveryWidgetV4RepositoryImpl;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4ViewModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/di/DeliveryWidgetV4Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4ViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4ViewModel;", "viewModel", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/DeliveryWidgetV4Mapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/DeliveryWidgetV4Mapper;", "mapper", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeliveryWidgetV4Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/di/DeliveryWidgetV4Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/di/DeliveryWidgetV4Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DeliveryWidgetV4Component create$lambda$0(final C7475g c7475g) {
            return new DeliveryWidgetV4Component() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di.DeliveryWidgetV4Component$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(DeliveryWidgetV4Component$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di.DeliveryWidgetV4Component
                public DeliveryWidgetV4Mapper getMapper() {
                    return (DeliveryWidgetV4Mapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.di.DeliveryWidgetV4Component
                public DeliveryWidgetV4ViewModel getViewModel() {
                    return new DeliveryWidgetV4ViewModel(new DeliveryWidgetV4RepositoryImpl(((ComposerWidgetAsyncComponentApi) C7475g.this.getComponent(ComposerWidgetAsyncComponentApi.class)).getComposerAsyncWidgetRepository(), getMapper()), ((CartServiceApi) C7475g.this.getComponent(CartServiceApi.class)).getCartService());
                }
            };
        }

        @NotNull
        public final C7473e<DeliveryWidgetV4Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(DeliveryWidgetV4Component.class), new C2881a(storage, 8));
        }
    }

    @NotNull
    DeliveryWidgetV4Mapper getMapper();

    @NotNull
    DeliveryWidgetV4ViewModel getViewModel();
}
