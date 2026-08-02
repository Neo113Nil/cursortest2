package ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation.FlashBarErrorWrapper;
import ru.ozon.app.android.fresh.feature.b2b.widgets.statusEdo.data.StatusEdoRepository;
import xe.C10727i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/presentation/StatusEdoViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/StatusEdoRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/StatusEdoRepository;)V", "", "actionName", "", "closeStatusEdo", "(Ljava/lang/String;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusEdo/data/StatusEdoRepository;", "LAe/x0;", "", "_shouldShowStatus", "LAe/x0;", "LAe/M0;", "shouldShowStatus", "LAe/M0;", "getShouldShowStatus", "()LAe/M0;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/presentation/FlashBarErrorWrapper;", "_flashbarErrorMessage", "flashbarErrorMessage", "getFlashbarErrorMessage", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StatusEdoViewModel extends w0 {

    @NotNull
    private final x0<FlashBarErrorWrapper> _flashbarErrorMessage;

    @NotNull
    private final x0<Boolean> _shouldShowStatus;

    @NotNull
    private final M0<FlashBarErrorWrapper> flashbarErrorMessage;

    @NotNull
    private final StatusEdoRepository repository;

    @NotNull
    private final M0<Boolean> shouldShowStatus;

    public StatusEdoViewModel(@NotNull StatusEdoRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        x0<Boolean> a11 = O0.a(Boolean.TRUE);
        this._shouldShowStatus = a11;
        this.shouldShowStatus = C2399j.b(a11);
        x0<FlashBarErrorWrapper> a12 = O0.a(new FlashBarErrorWrapper(""));
        this._flashbarErrorMessage = a12;
        this.flashbarErrorMessage = C2399j.b(a12);
    }

    public final void closeStatusEdo(@NotNull String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new StatusEdoViewModel$closeStatusEdo$1(this, actionName, null), 3);
    }

    @NotNull
    public final M0<FlashBarErrorWrapper> getFlashbarErrorMessage() {
        return this.flashbarErrorMessage;
    }

    @NotNull
    public final M0<Boolean> getShouldShowStatus() {
        return this.shouldShowStatus;
    }
}
