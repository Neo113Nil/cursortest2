package ru.ozon.app.android.switchUser.loader;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.w0;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/switchUser/loader/LoaderEventBus;", "", "<init>", "()V", "Lru/ozon/app/android/switchUser/loader/LoaderEventBus$Event;", "event", "", "emit", "(Lru/ozon/app/android/switchUser/loader/LoaderEventBus$Event;)V", "LAe/w0;", "_flow", "LAe/w0;", "LAe/h;", "flow", "LAe/h;", "getFlow", "()LAe/h;", "Event", "switch-user_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoaderEventBus {

    @NotNull
    public static final LoaderEventBus INSTANCE = new LoaderEventBus();

    @NotNull
    private static final w0<Event> _flow;

    @NotNull
    private static final InterfaceC2395h<Event> flow;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/switchUser/loader/LoaderEventBus$Event;", "", "<init>", "(Ljava/lang/String;I)V", "SHOW_LOADER", "HIDE_LOADER", "switch-user_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Event {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event SHOW_LOADER = new Event("SHOW_LOADER", 0);
        public static final Event HIDE_LOADER = new Event("HIDE_LOADER", 1);

        private static final /* synthetic */ Event[] $values() {
            return new Event[]{SHOW_LOADER, HIDE_LOADER};
        }

        static {
            Event[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Event(String str, int i11) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    static {
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        _flow = b11;
        flow = C2399j.a(b11);
    }

    private LoaderEventBus() {
    }

    public final void emit(@NotNull Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        _flow.tryEmit(event);
    }

    @NotNull
    public final InterfaceC2395h<Event> getFlow() {
        return flow;
    }
}
