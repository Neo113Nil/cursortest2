package com.google.firebase.sessions;

import xsna.un70;

/* compiled from: ApplicationInfo.kt */
/* loaded from: classes.dex */
public enum LogEnvironment implements un70 {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int number;

    LogEnvironment(int i) {
        this.number = i;
    }

    @Override // xsna.un70
    public final int getNumber() {
        return this.number;
    }
}
