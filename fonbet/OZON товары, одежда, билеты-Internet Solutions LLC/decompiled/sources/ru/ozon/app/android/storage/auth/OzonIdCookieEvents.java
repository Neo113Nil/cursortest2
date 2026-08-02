package ru.ozon.app.android.storage.auth;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import Nc.C3669c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import zb0.f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00040\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "", "<init>", "()V", "Lzb0/f;", "event", "", "onCookieEvent", "(Lzb0/f;)V", "Lxe/M;", "scope", "Lxe/M;", "LNc/c;", "kotlin.jvm.PlatformType", "_subject", "LNc/c;", "LAe/w0;", "_flow", "LAe/w0;", "Lio/reactivex/p;", "observable", "Lio/reactivex/p;", "getObservable", "()Lio/reactivex/p;", "LAe/h;", "flow", "LAe/h;", "getFlow", "()LAe/h;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "last", "Lzb0/f;", "getLast", "()Lzb0/f;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonIdCookieEvents {

    @NotNull
    private final w0<f> _flow;

    @NotNull
    private final C3669c<f> _subject;

    @NotNull
    private final InterfaceC2395h<f> flow;
    private f last;

    @NotNull
    private final p<f> observable;

    @NotNull
    private final M scope = N.a(C10720e0.a());

    public OzonIdCookieEvents() {
        C3669c<f> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this._subject = d11;
        C0 b11 = E0.b(0, 0, null, 7);
        this._flow = b11;
        this.observable = d11;
        this.flow = C2399j.a(b11);
    }

    @NotNull
    public final InterfaceC2395h<f> getFlow() {
        return this.flow;
    }

    public final f getLast() {
        return this.last;
    }

    @NotNull
    public final p<f> getObservable() {
        return this.observable;
    }

    public final void onCookieEvent(@NotNull f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.last = event;
        this._subject.onNext(event);
        C10727i.c(this.scope, null, null, new OzonIdCookieEvents$onCookieEvent$1(this, event, null), 3);
    }
}
