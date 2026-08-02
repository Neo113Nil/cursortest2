package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;
import xe.E0;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/utils/JobGroupManager;", "", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "delayMillis", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "action", "startAction", "(JLkotlin/jvm/functions/Function1;)V", "cancelJobGroup", "()V", "restartJobGroup", "Lxe/B0;", "groupJob", "Lxe/B0;", "Lxe/M;", "scope", "Lxe/M;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JobGroupManager {

    @NotNull
    private B0 groupJob;

    @NotNull
    private final M scope;

    public JobGroupManager(@NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.groupJob = E0.a();
        this.scope = N.a(dispatcherProvider.getMainImmediate());
    }

    public final void cancelJobGroup() {
        if (this.groupJob.isActive()) {
            this.groupJob.j(null);
        }
    }

    public final void restartJobGroup() {
        if (this.groupJob.isCancelled() || this.groupJob.l0()) {
            this.groupJob = E0.a();
        }
    }

    public final void startAction(long delayMillis, @NotNull Function1<? super d<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        C10727i.c(this.scope, this.groupJob, null, new JobGroupManager$startAction$1(delayMillis, action, null), 2);
    }
}
