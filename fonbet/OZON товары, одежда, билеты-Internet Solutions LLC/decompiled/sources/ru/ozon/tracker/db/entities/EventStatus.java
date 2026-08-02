package ru.ozon.tracker.db.entities;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/tracker/db/entities/EventStatus;", "", "status", "", "<init>", "(Ljava/lang/String;II)V", "getStatus", "()I", "NEW", "PENDING", "RETRY", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EventStatus[] $VALUES;
    public static final EventStatus NEW = new EventStatus("NEW", 0, 0);
    public static final EventStatus PENDING = new EventStatus("PENDING", 1, 1);
    public static final EventStatus RETRY = new EventStatus("RETRY", 2, 2);
    private final int status;

    private static final /* synthetic */ EventStatus[] $values() {
        return new EventStatus[]{NEW, PENDING, RETRY};
    }

    static {
        EventStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private EventStatus(String str, int i11, int i12) {
        this.status = i12;
    }

    @NotNull
    public static a<EventStatus> getEntries() {
        return $ENTRIES;
    }

    public static EventStatus valueOf(String str) {
        return (EventStatus) Enum.valueOf(EventStatus.class, str);
    }

    public static EventStatus[] values() {
        return (EventStatus[]) $VALUES.clone();
    }

    public final int getStatus() {
        return this.status;
    }
}
