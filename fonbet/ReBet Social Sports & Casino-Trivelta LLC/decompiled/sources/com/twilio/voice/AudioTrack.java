package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
abstract class AudioTrack implements Track {
    private boolean isEnabled;
    private final String name;

    public AudioTrack(boolean z10, @NonNull String str) {
        this.isEnabled = z10;
        this.name = str;
    }

    @Override // com.twilio.voice.Track
    public String getName() {
        return this.name;
    }

    @Override // com.twilio.voice.Track
    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setEnabled(boolean z10) {
        this.isEnabled = z10;
    }
}
