package com.bumptech.glide.integration.webp;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f57585a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f57587c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57588d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57589e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57590f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f57591g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f57592h;

    a(int i11, WebpFrame webpFrame) {
        this.f57585a = i11;
        this.f57586b = webpFrame.getXOffest();
        this.f57587c = webpFrame.getYOffest();
        this.f57588d = webpFrame.getWidth();
        this.f57589e = webpFrame.getHeight();
        this.f57590f = webpFrame.getDurationMs();
        this.f57591g = webpFrame.isBlendWithPreviousFrame();
        this.f57592h = webpFrame.shouldDisposeToBackgroundColor();
    }

    public final String toString() {
        return "frameNumber=" + this.f57585a + ", xOffset=" + this.f57586b + ", yOffset=" + this.f57587c + ", width=" + this.f57588d + ", height=" + this.f57589e + ", duration=" + this.f57590f + ", blendPreviousFrame=" + this.f57591g + ", disposeBackgroundColor=" + this.f57592h;
    }
}
