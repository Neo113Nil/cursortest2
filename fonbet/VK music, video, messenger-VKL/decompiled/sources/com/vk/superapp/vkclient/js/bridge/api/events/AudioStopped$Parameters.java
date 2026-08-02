package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioStopped.kt */
/* loaded from: classes6.dex */
public final class AudioStopped$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AudioStopped$Parameters(String str) {
        this.requestId = str;
    }

    public static final AudioStopped$Parameters a(AudioStopped$Parameters audioStopped$Parameters) {
        return audioStopped$Parameters.requestId == null ? new AudioStopped$Parameters("default_request_id") : audioStopped$Parameters;
    }

    public static final void b(AudioStopped$Parameters audioStopped$Parameters) {
        if (audioStopped$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioStopped$Parameters) && epx.f(this.requestId, ((AudioStopped$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
