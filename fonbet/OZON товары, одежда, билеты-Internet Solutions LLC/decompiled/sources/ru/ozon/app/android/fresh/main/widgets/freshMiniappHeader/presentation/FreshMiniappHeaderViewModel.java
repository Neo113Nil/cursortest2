package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import xe.C10727i;
import xe.E0;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;)V", "", "onCleared", "()V", "", "asyncData", "updateWidget", "(Ljava/lang/String;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lze/h;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderUpdateResponse;", "_widgetUpdate", "Lze/h;", "LAe/h;", "widgetUpdate", "LAe/h;", "getWidgetUpdate", "()LAe/h;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshMiniappHeaderViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final h<FreshMiniappHeaderUpdateResponse> _widgetUpdate;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final InterfaceC2395h<FreshMiniappHeaderUpdateResponse> widgetUpdate;

    public FreshMiniappHeaderViewModel(@NotNull ComposerAsyncWidgetRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        C11115c a11 = k.a(-2, 6, null);
        this._widgetUpdate = a11;
        this.widgetUpdate = C2399j.H(a11);
    }

    @NotNull
    public final InterfaceC2395h<FreshMiniappHeaderUpdateResponse> getWidgetUpdate() {
        return this.widgetUpdate;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        E0.d(x0.a(this).getCoroutineContext());
    }

    public final void updateWidget(@NotNull String asyncData) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        C10727i.c(x0.a(this), null, null, new FreshMiniappHeaderViewModel$updateWidget$1(this, asyncData, null), 3);
    }
}
