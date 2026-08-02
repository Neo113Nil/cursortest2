package com.unity3d.services.core.properties;

import java.util.UUID;

/* compiled from: SessionIdReader.kt */
/* loaded from: classes14.dex */
public final class SessionIdReader {
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    private static final String sessionId = UUID.randomUUID().toString();

    private SessionIdReader() {
    }

    public final String getSessionId() {
        return sessionId;
    }
}
