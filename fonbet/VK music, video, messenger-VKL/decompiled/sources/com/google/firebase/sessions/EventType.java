package com.google.firebase.sessions;

import xsna.un70;

/* compiled from: SessionEvent.kt */
/* loaded from: classes.dex */
public enum EventType implements un70 {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    EventType(int i) {
        this.number = i;
    }

    @Override // xsna.un70
    public final int getNumber() {
        return this.number;
    }
}
