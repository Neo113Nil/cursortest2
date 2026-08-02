package ru.ozon.app.android.ordertracking.utils;

import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.orderTracking.utils.ProcessLifecyclePublisher;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ordertracking/utils/ProcessLifecyclePublisherImpl;", "Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "clearListeners", "LAe/x0;", "Lru/ozon/app/android/csma/orderTracking/utils/ProcessLifecyclePublisher$PreviousAndCurrentProcessState;", "_processPublisher", "LAe/x0;", "LAe/h;", "processPublisher", "LAe/h;", "getProcessPublisher", "()LAe/h;", "processLifecycleOwner", "Landroidx/lifecycle/J;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessLifecyclePublisherImpl implements ProcessLifecyclePublisher {

    @NotNull
    private final x0<ProcessLifecyclePublisher.PreviousAndCurrentProcessState> _processPublisher;

    @NotNull
    private final J processLifecycleOwner;

    @NotNull
    private final InterfaceC2395h<ProcessLifecyclePublisher.PreviousAndCurrentProcessState> processPublisher;

    public ProcessLifecyclePublisherImpl() {
        ProcessLifecycleOwner processLifecycleOwner;
        x0<ProcessLifecyclePublisher.PreviousAndCurrentProcessState> a11 = O0.a(new ProcessLifecyclePublisher.PreviousAndCurrentProcessState(ProcessLifecyclePublisher.ProcessState.NOT_INITIATED, ProcessLifecyclePublisher.ProcessState.FOREGROUND));
        this._processPublisher = a11;
        this.processPublisher = a11;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        this.processLifecycleOwner = processLifecycleOwner;
        processLifecycleOwner.getLifecycle().a(this);
    }

    @Override // ru.ozon.app.android.csma.orderTracking.utils.ProcessLifecyclePublisher
    public void clearListeners() {
        this.processLifecycleOwner.getLifecycle().e(this);
    }

    @Override // ru.ozon.app.android.csma.orderTracking.utils.ProcessLifecyclePublisher
    @NotNull
    public InterfaceC2395h<ProcessLifecyclePublisher.PreviousAndCurrentProcessState> getProcessPublisher() {
        return this.processPublisher;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        x0<ProcessLifecyclePublisher.PreviousAndCurrentProcessState> x0Var = this._processPublisher;
        x0Var.setValue(new ProcessLifecyclePublisher.PreviousAndCurrentProcessState(x0Var.getValue().getCurrentState(), ProcessLifecyclePublisher.ProcessState.FOREGROUND));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        x0<ProcessLifecyclePublisher.PreviousAndCurrentProcessState> x0Var = this._processPublisher;
        x0Var.setValue(new ProcessLifecyclePublisher.PreviousAndCurrentProcessState(x0Var.getValue().getCurrentState(), ProcessLifecyclePublisher.ProcessState.BACKGROUND));
    }
}
