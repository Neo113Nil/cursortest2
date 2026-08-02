package ru.ozon.app.android.cart.async.di;

import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.async.di.AsyncWidgetComponent;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/async/di/AsyncWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "getAsyncCartViewModelProvider", "()Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "getComposerWidgetComponentStorage", "()Lk20/g;", "composerWidgetComponentStorage", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AsyncWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/async/di/AsyncWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/cart/async/di/AsyncWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AsyncWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new AsyncWidgetComponent() { // from class: ru.ozon.app.android.cart.async.di.AsyncWidgetComponent$Companion$create$1$1
                @Override // ru.ozon.app.android.cart.async.di.AsyncWidgetComponent
                public AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider() {
                    return ((CartServiceApi) C7475g.this.getComponent(CartServiceApi.class)).getAsyncCartViewModelProvider();
                }

                @Override // ru.ozon.app.android.cart.async.di.AsyncWidgetComponent
                /* renamed from: getComposerWidgetComponentStorage, reason: from getter */
                public C7475g get$storage() {
                    return C7475g.this;
                }
            };
        }

        @NotNull
        public final C7473e<AsyncWidgetComponent> create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AsyncWidgetComponent.class), new InterfaceC7469a() { // from class: Zm.a
                @Override // k20.InterfaceC7469a
                public final InterfaceC6958a component() {
                    AsyncWidgetComponent create$lambda$0;
                    create$lambda$0 = AsyncWidgetComponent.Companion.create$lambda$0(C7475g.this);
                    return create$lambda$0;
                }
            });
        }
    }

    @NotNull
    AsyncCartViewModelProviderWrapper getAsyncCartViewModelProvider();

    @NotNull
    /* renamed from: getComposerWidgetComponentStorage */
    C7475g get$storage();
}
