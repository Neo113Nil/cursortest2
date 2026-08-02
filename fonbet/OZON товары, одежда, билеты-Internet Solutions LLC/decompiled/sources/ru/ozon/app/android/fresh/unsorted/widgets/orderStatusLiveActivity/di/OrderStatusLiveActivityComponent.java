package ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.di;

import AI.c;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.presentation.OrderStatusLiveActivityMapper;
import ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.presentation.OrderStatusLiveActivityViewModel;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/di/OrderStatusLiveActivityComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityViewModel;", "viewModel", "Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/presentation/OrderStatusLiveActivityMapper;", "mapper", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OrderStatusLiveActivityComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/di/OrderStatusLiveActivityComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/unsorted/widgets/orderStatusLiveActivity/di/OrderStatusLiveActivityComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OrderStatusLiveActivityComponent create$lambda$0(final C7475g c7475g) {
            return new OrderStatusLiveActivityComponent(c7475g) { // from class: ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.di.OrderStatusLiveActivityComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(OrderStatusLiveActivityComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: viewModel$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j viewModel;

                {
                    this.viewModel = k.b(new OrderStatusLiveActivityComponent$Companion$create$1$1$viewModel$2(c7475g));
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.di.OrderStatusLiveActivityComponent
                public OrderStatusLiveActivityMapper getMapper() {
                    return (OrderStatusLiveActivityMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.fresh.unsorted.widgets.orderStatusLiveActivity.di.OrderStatusLiveActivityComponent
                public OrderStatusLiveActivityViewModel getViewModel() {
                    return (OrderStatusLiveActivityViewModel) this.viewModel.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<OrderStatusLiveActivityComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(OrderStatusLiveActivityComponent.class), new c(storage, 1));
        }
    }

    @NotNull
    OrderStatusLiveActivityMapper getMapper();

    @NotNull
    OrderStatusLiveActivityViewModel getViewModel();
}
