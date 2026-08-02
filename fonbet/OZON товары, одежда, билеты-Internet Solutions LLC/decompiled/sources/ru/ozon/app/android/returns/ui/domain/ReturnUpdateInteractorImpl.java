package ru.ozon.app.android.returns.ui.domain;

import Ae.E0;
import Ae.w0;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/ui/domain/ReturnUpdateInteractorImpl;", "Lru/ozon/app/android/returns/ui/domain/ReturnUpdateInteractor;", "<init>", "()V", "LAe/w0;", "", "observeNeedUpdate", "()LAe/w0;", "setNeedUpdate", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "orderNeedUpdateSubject", "LAe/w0;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnUpdateInteractorImpl implements ReturnUpdateInteractor {

    @NotNull
    private final w0<Unit> orderNeedUpdateSubject = E0.b(0, 0, null, 7);

    @Override // ru.ozon.app.android.returns.ui.domain.ReturnUpdateInteractor
    public Object setNeedUpdate(@NotNull d<? super Unit> dVar) {
        w0<Unit> w0Var = this.orderNeedUpdateSubject;
        Unit unit = Unit.f71690a;
        Object emit = w0Var.emit(unit, dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : unit;
    }

    @Override // ru.ozon.app.android.returns.ui.domain.ReturnUpdateInteractor
    @NotNull
    public w0<Unit> observeNeedUpdate() {
        return this.orderNeedUpdateSubject;
    }
}
