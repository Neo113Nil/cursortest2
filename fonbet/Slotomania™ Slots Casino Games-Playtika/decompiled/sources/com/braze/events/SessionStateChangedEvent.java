package com.braze.events;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/braze/events/SessionStateChangedEvent;", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "eventType", "Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "(Ljava/lang/String;Lcom/braze/events/SessionStateChangedEvent$ChangeType;)V", "getEventType", "()Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "getSessionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ChangeType", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SessionStateChangedEvent {
    private final ChangeType eventType;
    private final String sessionId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "", "(Ljava/lang/String;I)V", "SESSION_STARTED", "SESSION_ENDED", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum ChangeType {
        SESSION_STARTED,
        SESSION_ENDED
    }

    public SessionStateChangedEvent(String sessionId, ChangeType eventType) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.sessionId = sessionId;
        this.eventType = eventType;
    }

    public static /* synthetic */ SessionStateChangedEvent copy$default(SessionStateChangedEvent sessionStateChangedEvent, String str, ChangeType changeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionStateChangedEvent.sessionId;
        }
        if ((i & 2) != 0) {
            changeType = sessionStateChangedEvent.eventType;
        }
        return sessionStateChangedEvent.copy(str, changeType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final ChangeType getEventType() {
        return this.eventType;
    }

    public final SessionStateChangedEvent copy(String sessionId, ChangeType eventType) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new SessionStateChangedEvent(sessionId, eventType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionStateChangedEvent)) {
            return false;
        }
        SessionStateChangedEvent sessionStateChangedEvent = (SessionStateChangedEvent) other;
        return Intrinsics.areEqual(this.sessionId, sessionStateChangedEvent.sessionId) && this.eventType == sessionStateChangedEvent.eventType;
    }

    public final ChangeType getEventType() {
        return this.eventType;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + this.eventType.hashCode();
    }

    public String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.sessionId + "', eventType='" + this.eventType + "'}'";
    }
}
