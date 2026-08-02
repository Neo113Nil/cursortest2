package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.di;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data.FreshSubscribeRepository;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewModel;
import ru.ozon.app.android.storage.auth.AuthStateStorage;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/di/SwapButtonViewModelFactory;", "Landroidx/lifecycle/z0$b;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscribeRepository;", "freshSubscribeRepository", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscribeRepository;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscribeRepository;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwapButtonViewModelFactory implements z0.b {

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final FreshSubscribeRepository freshSubscribeRepository;

    public SwapButtonViewModelFactory(@NotNull FreshSubscribeRepository freshSubscribeRepository, @NotNull AuthStateStorage authStateStorage) {
        Intrinsics.checkNotNullParameter(freshSubscribeRepository, "freshSubscribeRepository");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        this.freshSubscribeRepository = freshSubscribeRepository;
        this.authStateStorage = authStateStorage;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new SwapButtonViewModel(this.freshSubscribeRepository, this.authStateStorage);
    }
}
