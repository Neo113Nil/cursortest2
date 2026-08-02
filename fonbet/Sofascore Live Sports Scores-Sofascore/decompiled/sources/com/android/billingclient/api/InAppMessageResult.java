package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class InAppMessageResult {
    public final int a;
    public final String b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
        public static final int NO_ACTION_NEEDED = 0;
        public static final int SUBSCRIPTION_STATUS_UPDATED = 1;
    }

    public InAppMessageResult(int i, @Nullable String str) {
        this.a = 0;
        this.b = null;
    }

    @Nullable
    public String getPurchaseToken() {
        return this.b;
    }

    public int getResponseCode() {
        return this.a;
    }

    public InAppMessageResult(int i, String str, int i2) {
        this.a = i;
        this.b = str;
    }
}
