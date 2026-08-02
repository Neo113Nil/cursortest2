package ru.ozon.tracker.db.entities;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/tracker/db/entities/EventType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "USUAL", "TRINITY_EVENT", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    private final int type;
    public static final EventType USUAL = new EventType("USUAL", 0, 0);
    public static final EventType TRINITY_EVENT = new EventType("TRINITY_EVENT", 1, 2);

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{USUAL, TRINITY_EVENT};
    }

    static {
        EventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private EventType(String str, int i11, int i12) {
        this.type = i12;
    }

    @NotNull
    public static a<EventType> getEntries() {
        return $ENTRIES;
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
