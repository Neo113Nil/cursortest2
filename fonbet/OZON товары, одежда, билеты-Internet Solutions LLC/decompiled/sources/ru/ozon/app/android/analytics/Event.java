package ru.ozon.app.android.analytics;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/analytics/Event;", "", "", "event", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getEvent", "SCREEN_VIEW", "CAMPAIGN", "TAB_CLICK", "TRACKER_V2_EVENT", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Event {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Event[] $VALUES;

    @NotNull
    private final String event;
    public static final Event SCREEN_VIEW = new Event("SCREEN_VIEW", 0, "screenView");
    public static final Event CAMPAIGN = new Event("CAMPAIGN", 1, "campaign");
    public static final Event TAB_CLICK = new Event("TAB_CLICK", 2, "tab_click");
    public static final Event TRACKER_V2_EVENT = new Event("TRACKER_V2_EVENT", 3, "trackerV2");

    private static final /* synthetic */ Event[] $values() {
        return new Event[]{SCREEN_VIEW, CAMPAIGN, TAB_CLICK, TRACKER_V2_EVENT};
    }

    static {
        Event[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private Event(String str, int i11, String str2) {
        this.event = str2;
    }

    public static Event valueOf(String str) {
        return (Event) Enum.valueOf(Event.class, str);
    }

    public static Event[] values() {
        return (Event[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.event;
    }
}
