package com.google.firebase.sessions;

import xsna.un70;

/* compiled from: SessionEvent.kt */
/* loaded from: classes.dex */
public enum DataCollectionState implements un70 {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int number;

    DataCollectionState(int i) {
        this.number = i;
    }

    @Override // xsna.un70
    public final int getNumber() {
        return this.number;
    }
}
