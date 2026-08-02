package ru.ozon.app.android.composer.network.join;

import Ae.C0;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.w0;
import We.InterfaceC4865g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.E0;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/network/join/CallFinishedEventBus;", "", "<init>", "()V", "LWe/g;", "call", "", "emit", "(LWe/g;)V", "Lxe/M;", "scope", "Lxe/M;", "LAe/w0;", "_eventsFlow", "LAe/w0;", "LAe/h;", "eventsFlow", "LAe/h;", "getEventsFlow", "()LAe/h;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CallFinishedEventBus {
    public static final int $stable;

    @NotNull
    private static final w0<InterfaceC4865g> _eventsFlow;

    @NotNull
    private static final InterfaceC2395h<InterfaceC4865g> eventsFlow;

    @NotNull
    public static final CallFinishedEventBus INSTANCE = new CallFinishedEventBus();

    @NotNull
    private static final M scope = N.a(E0.a());

    static {
        C0 b11 = Ae.E0.b(0, 0, null, 7);
        _eventsFlow = b11;
        eventsFlow = C2399j.a(b11);
        $stable = 8;
    }

    private CallFinishedEventBus() {
    }

    public final void emit(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        C10727i.c(scope, null, null, new CallFinishedEventBus$emit$1(call, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<InterfaceC4865g> getEventsFlow() {
        return eventsFlow;
    }
}
