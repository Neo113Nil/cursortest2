package ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo;

import Ae.InterfaceC2395h;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/StatusEdoState;", "", "LAe/h;", "", "statusEdoChangedEvent", "()LAe/h;", "updateStatusEdoState", "()V", "getLast", "()Lkotlin/Unit;", "setLast", "(Lkotlin/Unit;)V", "last", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StatusEdoState {
    Unit getLast();

    @NotNull
    InterfaceC2395h<Unit> statusEdoChangedEvent();

    void updateStatusEdoState();
}
