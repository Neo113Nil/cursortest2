package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioTrackChanged.kt */
/* loaded from: classes6.dex */
public final class AudioTrackChanged$Parameters implements ad6 {

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public AudioTrackChanged$Parameters(String str) {
        this.requestId = str;
    }

    public static final AudioTrackChanged$Parameters a(AudioTrackChanged$Parameters audioTrackChanged$Parameters) {
        return audioTrackChanged$Parameters.requestId == null ? new AudioTrackChanged$Parameters("default_request_id") : audioTrackChanged$Parameters;
    }

    public static final void b(AudioTrackChanged$Parameters audioTrackChanged$Parameters) {
        if (audioTrackChanged$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioTrackChanged$Parameters) && epx.f(this.requestId, ((AudioTrackChanged$Parameters) obj).requestId);
    }

    public final int hashCode() {
        return this.requestId.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Parameters(requestId="), this.requestId, ')');
    }
}
