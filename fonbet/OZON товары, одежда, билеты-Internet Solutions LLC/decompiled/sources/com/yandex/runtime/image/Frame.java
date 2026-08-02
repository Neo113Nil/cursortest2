package com.yandex.runtime.image;

/* loaded from: classes9.dex */
public class Frame {
    private final long duration;
    private final ImageProvider image;

    public Frame(ImageProvider imageProvider, long j11) {
        this.image = imageProvider;
        this.duration = j11;
    }

    public long getDuration() {
        return this.duration;
    }

    public ImageProvider getImage() {
        return this.image;
    }
}
