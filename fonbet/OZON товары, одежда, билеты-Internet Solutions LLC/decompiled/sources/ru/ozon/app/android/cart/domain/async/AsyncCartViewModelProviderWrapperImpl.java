package ru.ozon.app.android.cart.domain.async;

import a00.h;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/domain/async/AsyncCartViewModelProviderWrapperImpl;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "<init>", "()V", "La00/h;", "Lk20/g;", "storage", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "(La00/h;Lk20/g;)Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "", "composerReferences", "get", "(Ljava/lang/Object;)Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "viewModelOwnerProvider", "(Ljava/lang/Object;Ljava/lang/Object;)Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AsyncCartViewModelProviderWrapperImpl implements AsyncCartViewModelProviderWrapper {
    private final AsyncCartViewModel asyncCartViewModel(h hVar, final C7475g c7475g) {
        return (AsyncCartViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.cart.domain.async.AsyncCartViewModelProviderWrapperImpl$asyncCartViewModel$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AsyncCartViewModelImpl create = AsyncCartViewModelImpl.INSTANCE.create(C7475g.this);
                Intrinsics.g(create, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return create;
            }
        }).a(AsyncCartViewModelImpl.class);
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper
    @NotNull
    public AsyncCartViewModel get(@NotNull Object composerReferences) {
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        if ((composerReferences instanceof ComposerReferences ? (ComposerReferences) composerReferences : null) == null) {
            throw new IllegalArgumentException("type must be ru.ozon.app.android.composer.ComposerReferences");
        }
        ComposerReferences composerReferences2 = (ComposerReferences) composerReferences;
        composerReferences2.getComposerWidgetComponentStorage();
        return asyncCartViewModel(composerReferences2.getViewModelOwnerProvider(), composerReferences2.getComposerWidgetComponentStorage());
    }

    @Override // ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper
    @NotNull
    public AsyncCartViewModel get(@NotNull Object viewModelOwnerProvider, @NotNull Object storage) {
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        if ((viewModelOwnerProvider instanceof h ? (h) viewModelOwnerProvider : null) != null) {
            if ((storage instanceof C7475g ? (C7475g) storage : null) != null) {
                return asyncCartViewModel((h) viewModelOwnerProvider, (C7475g) storage);
            }
            throw new IllegalArgumentException("type must be ru.ozon.composer.widget.di.WidgetComponentStorage");
        }
        throw new IllegalArgumentException("type must be ru.ozon.composer.common.ui.ViewModelOwnerProvider");
    }
}
