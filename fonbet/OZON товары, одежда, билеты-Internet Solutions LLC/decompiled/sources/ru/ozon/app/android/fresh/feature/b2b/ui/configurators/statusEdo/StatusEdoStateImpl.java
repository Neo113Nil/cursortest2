package ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0003R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/StatusEdoStateImpl;", "Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/StatusEdoState;", "<init>", "()V", "LAe/h;", "", "statusEdoChangedEvent", "()LAe/h;", "updateStatusEdoState", "LAe/x0;", "LAe/x0;", "last", "Lkotlin/Unit;", "getLast", "()Lkotlin/Unit;", "setLast", "(Lkotlin/Unit;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StatusEdoStateImpl implements StatusEdoState {
    private Unit last;

    @NotNull
    private final x0<Unit> statusEdoChangedEvent = O0.a(null);

    @Override // ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.StatusEdoState
    public Unit getLast() {
        return this.last;
    }

    public void setLast(Unit unit) {
        this.last = unit;
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.StatusEdoState
    @NotNull
    public InterfaceC2395h<Unit> statusEdoChangedEvent() {
        return C2399j.a(this.statusEdoChangedEvent);
    }

    @Override // ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.StatusEdoState
    public void updateStatusEdoState() {
        this.statusEdoChangedEvent.setValue(Unit.f71690a);
        setLast(this.statusEdoChangedEvent.getValue());
    }
}
