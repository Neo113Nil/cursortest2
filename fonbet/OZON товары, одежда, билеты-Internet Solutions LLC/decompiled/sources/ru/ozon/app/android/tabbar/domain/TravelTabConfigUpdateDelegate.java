package ru.ozon.app.android.tabbar.domain;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;", "", "<init>", "()V", "", "updateConfig", "LAe/w0;", "_updates", "LAe/w0;", "LAe/B0;", "updates", "LAe/B0;", "getUpdates", "()LAe/B0;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelTabConfigUpdateDelegate {

    @NotNull
    private final w0<Unit> _updates;

    @NotNull
    private final B0<Unit> updates;

    public TravelTabConfigUpdateDelegate() {
        C0 b11 = E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
        b11.tryEmit(Unit.f71690a);
        this._updates = b11;
        this.updates = C2399j.a(b11);
    }

    @NotNull
    public final B0<Unit> getUpdates() {
        return this.updates;
    }

    public final void updateConfig() {
        this._updates.tryEmit(Unit.f71690a);
    }
}
