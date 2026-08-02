package ru.ozon.tracker.db.entities;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/tracker/db/entities/EventsConstants;", "", "<init>", "()V", "NEW_STATUS_TYPE", "", "PENDING_STATUS_TYPE", "RETRY_STATUS_TYPE", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventsConstants {

    @NotNull
    public static final EventsConstants INSTANCE = new EventsConstants();
    public static final int NEW_STATUS_TYPE = 0;
    public static final int PENDING_STATUS_TYPE = 1;
    public static final int RETRY_STATUS_TYPE = 2;

    private EventsConstants() {
    }
}
