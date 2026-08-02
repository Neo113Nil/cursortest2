package ru.ozon.app.android.checkoutgeo.location;

import A00.a;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/MapUpdateManagerImpl;", "Lru/ozon/app/android/mapcommon/mapcommon/MapUpdateManager;", "<init>", "()V", "LA00/a$J$a;", "event", "", "update", "(LA00/a$J$a;)V", "LAe/x0;", "_eventsFlow", "LAe/x0;", "LAe/h;", "eventsFlow", "LAe/h;", "getEventsFlow", "()LAe/h;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapUpdateManagerImpl implements MapUpdateManager {

    @NotNull
    private final x0<a.J.InterfaceC0007a> _eventsFlow;

    @NotNull
    private final InterfaceC2395h<a.J.InterfaceC0007a> eventsFlow;

    public MapUpdateManagerImpl() {
        x0<a.J.InterfaceC0007a> a11 = O0.a(null);
        this._eventsFlow = a11;
        this.eventsFlow = new C2406m0(a11);
    }

    @Override // ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager
    @NotNull
    public InterfaceC2395h<a.J.InterfaceC0007a> getEventsFlow() {
        return this.eventsFlow;
    }

    @Override // ru.ozon.app.android.mapcommon.mapcommon.MapUpdateManager
    public void update(@NotNull a.J.InterfaceC0007a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this._eventsFlow.setValue(event);
    }
}
