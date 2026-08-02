package ru.ozon.uni.android.flashbar.view;

import Sc.InterfaceC3999a;
import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC3999a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/flashbar/view/DismissEvent;", "", "<init>", "(Ljava/lang/String;I)V", "TIMEOUT", "MANUAL", "SWIPE", "EXIT", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DismissEvent {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DismissEvent[] $VALUES;
    public static final DismissEvent TIMEOUT = new DismissEvent("TIMEOUT", 0);
    public static final DismissEvent MANUAL = new DismissEvent("MANUAL", 1);
    public static final DismissEvent SWIPE = new DismissEvent("SWIPE", 2);
    public static final DismissEvent EXIT = new DismissEvent("EXIT", 3);

    private static final /* synthetic */ DismissEvent[] $values() {
        return new DismissEvent[]{TIMEOUT, MANUAL, SWIPE, EXIT};
    }

    static {
        DismissEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DismissEvent(String str, int i11) {
    }

    public static DismissEvent valueOf(String str) {
        return (DismissEvent) Enum.valueOf(DismissEvent.class, str);
    }

    public static DismissEvent[] values() {
        return (DismissEvent[]) $VALUES.clone();
    }
}
