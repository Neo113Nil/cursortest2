package com.my.tracker;

import androidx.annotation.NonNull;

/* loaded from: classes14.dex */
public final class MyTrackerAttribution {
    private final String a;

    private MyTrackerAttribution(String str) {
        this.a = str;
    }

    @NonNull
    public static MyTrackerAttribution newAttribution(@NonNull String str) {
        return new MyTrackerAttribution(str);
    }

    @NonNull
    public String getDeeplink() {
        return this.a;
    }
}
