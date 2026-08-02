package com.vk.music.offline.api.exception;

/* compiled from: MalformedMusicTrackException.kt */
/* loaded from: classes3.dex */
public final class MalformedMusicTrackException extends Exception {
    private final String message;

    public MalformedMusicTrackException(String str) {
        super(str);
        this.message = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
