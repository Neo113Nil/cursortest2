package com.vk.music.restriction;

/* compiled from: ResubscribeRequiredException.kt */
/* loaded from: classes3.dex */
public class ResubscribeRequiredException extends RuntimeException {
    private final boolean isKeyExpired;

    public ResubscribeRequiredException() {
        this(null, 7);
    }

    public final boolean d() {
        return this.isKeyExpired;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ResubscribeRequiredException(Exception exc, int i) {
        super(r0, exc);
        String str = (i & 1) != 0 ? null : "Key is about to expire";
        exc = (i & 2) != 0 ? null : exc;
        boolean z = (i & 4) == 0;
        this.isKeyExpired = z;
    }
}
