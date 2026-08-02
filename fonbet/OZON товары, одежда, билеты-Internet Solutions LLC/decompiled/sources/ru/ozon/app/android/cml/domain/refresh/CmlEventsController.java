package ru.ozon.app.android.cml.domain.refresh;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cml/domain/refresh/CmlEventsController;", "", "<init>", "()V", "Lru/ozon/app/android/cml/domain/refresh/CmlRefreshReason;", "event", "", "handleEvent", "(Lru/ozon/app/android/cml/domain/refresh/CmlRefreshReason;)V", "LAe/w0;", "_cmlEventsSharedFlow", "LAe/w0;", "LAe/B0;", "cmlEventsSharedFlow", "LAe/B0;", "getCmlEventsSharedFlow", "()LAe/B0;", "cml_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlEventsController {

    @NotNull
    private final w0<CmlRefreshReason> _cmlEventsSharedFlow;

    @NotNull
    private final B0<CmlRefreshReason> cmlEventsSharedFlow;

    public CmlEventsController() {
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this._cmlEventsSharedFlow = b11;
        this.cmlEventsSharedFlow = C2399j.a(b11);
    }

    @NotNull
    public final B0<CmlRefreshReason> getCmlEventsSharedFlow() {
        return this.cmlEventsSharedFlow;
    }

    public final void handleEvent(@NotNull CmlRefreshReason event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this._cmlEventsSharedFlow.tryEmit(event);
    }
}
