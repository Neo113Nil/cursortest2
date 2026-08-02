package ru.ozon.tracker.db.entities;

import G.g;
import N3.C3660k;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/tracker/db/entities/DbEvent;", "", "uuid", "", "eventUuid", "version", "eventBody", "type", "Lru/ozon/tracker/db/entities/EventType;", "markEventToSend", "Lru/ozon/tracker/db/entities/EventStatus;", "timestamp", "Lorg/joda/time/DateTime;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/tracker/db/entities/EventType;Lru/ozon/tracker/db/entities/EventStatus;Lorg/joda/time/DateTime;)V", "getUuid", "()Ljava/lang/String;", "getEventUuid", "getVersion", "getEventBody", "getType", "()Lru/ozon/tracker/db/entities/EventType;", "getMarkEventToSend", "()Lru/ozon/tracker/db/entities/EventStatus;", "getTimestamp", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DbEvent {

    @NotNull
    private final String eventBody;

    @NotNull
    private final String eventUuid;

    @NotNull
    private final EventStatus markEventToSend;

    @NotNull
    private final DateTime timestamp;

    @NotNull
    private final EventType type;

    @NotNull
    private final String uuid;

    @NotNull
    private final String version;

    public DbEvent(@NotNull String uuid, @NotNull String eventUuid, @NotNull String version, @NotNull String eventBody, @NotNull EventType type, @NotNull EventStatus markEventToSend, @NotNull DateTime timestamp) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(eventUuid, "eventUuid");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(eventBody, "eventBody");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(markEventToSend, "markEventToSend");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.uuid = uuid;
        this.eventUuid = eventUuid;
        this.version = version;
        this.eventBody = eventBody;
        this.type = type;
        this.markEventToSend = markEventToSend;
        this.timestamp = timestamp;
    }

    public static /* synthetic */ DbEvent copy$default(DbEvent dbEvent, String str, String str2, String str3, String str4, EventType eventType, EventStatus eventStatus, DateTime dateTime, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dbEvent.uuid;
        }
        if ((i11 & 2) != 0) {
            str2 = dbEvent.eventUuid;
        }
        if ((i11 & 4) != 0) {
            str3 = dbEvent.version;
        }
        if ((i11 & 8) != 0) {
            str4 = dbEvent.eventBody;
        }
        if ((i11 & 16) != 0) {
            eventType = dbEvent.type;
        }
        if ((i11 & 32) != 0) {
            eventStatus = dbEvent.markEventToSend;
        }
        if ((i11 & 64) != 0) {
            dateTime = dbEvent.timestamp;
        }
        EventStatus eventStatus2 = eventStatus;
        DateTime dateTime2 = dateTime;
        EventType eventType2 = eventType;
        String str5 = str3;
        return dbEvent.copy(str, str2, str5, str4, eventType2, eventStatus2, dateTime2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEventUuid() {
        return this.eventUuid;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getEventBody() {
        return this.eventBody;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final EventType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final EventStatus getMarkEventToSend() {
        return this.markEventToSend;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DbEvent copy(@NotNull String uuid, @NotNull String eventUuid, @NotNull String version, @NotNull String eventBody, @NotNull EventType type, @NotNull EventStatus markEventToSend, @NotNull DateTime timestamp) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(eventUuid, "eventUuid");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(eventBody, "eventBody");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(markEventToSend, "markEventToSend");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new DbEvent(uuid, eventUuid, version, eventBody, type, markEventToSend, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbEvent)) {
            return false;
        }
        DbEvent dbEvent = (DbEvent) other;
        return Intrinsics.d(this.uuid, dbEvent.uuid) && Intrinsics.d(this.eventUuid, dbEvent.eventUuid) && Intrinsics.d(this.version, dbEvent.version) && Intrinsics.d(this.eventBody, dbEvent.eventBody) && this.type == dbEvent.type && this.markEventToSend == dbEvent.markEventToSend && Intrinsics.d(this.timestamp, dbEvent.timestamp);
    }

    @NotNull
    public final String getEventBody() {
        return this.eventBody;
    }

    @NotNull
    public final String getEventUuid() {
        return this.eventUuid;
    }

    @NotNull
    public final EventStatus getMarkEventToSend() {
        return this.markEventToSend;
    }

    @NotNull
    public final DateTime getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final EventType getType() {
        return this.type;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.timestamp.hashCode() + ((this.markEventToSend.hashCode() + ((this.type.hashCode() + g.a(g.a(g.a(this.uuid.hashCode() * 31, 31, this.eventUuid), 31, this.version), 31, this.eventBody)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        String str2 = this.eventUuid;
        String str3 = this.version;
        String str4 = this.eventBody;
        EventType eventType = this.type;
        EventStatus eventStatus = this.markEventToSend;
        DateTime dateTime = this.timestamp;
        StringBuilder d11 = C3660k.d("DbEvent(uuid=", str, ", eventUuid=", str2, ", version=");
        a.h(d11, str3, ", eventBody=", str4, ", type=");
        d11.append(eventType);
        d11.append(", markEventToSend=");
        d11.append(eventStatus);
        d11.append(", timestamp=");
        d11.append(dateTime);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ DbEvent(String str, String str2, String str3, String str4, EventType eventType, EventStatus eventStatus, DateTime dateTime, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, eventType, (i11 & 32) != 0 ? EventStatus.NEW : eventStatus, dateTime);
    }
}
