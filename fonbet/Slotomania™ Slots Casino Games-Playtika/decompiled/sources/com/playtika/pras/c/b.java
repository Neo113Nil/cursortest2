package com.playtika.pras.c;

import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes7.dex */
public enum b {
    ANDROID_PHONE("AndroidPhone"),
    ANDROID_TABLET("AndroidTablet"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);

    public final String a;

    b(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
