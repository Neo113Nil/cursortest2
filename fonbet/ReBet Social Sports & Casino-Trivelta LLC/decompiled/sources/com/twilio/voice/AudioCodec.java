package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class AudioCodec {
    private final String name;

    public AudioCodec(@NonNull String str) {
        this.name = str;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public String toString() {
        return this.name;
    }
}
