package io.agora.rtc2.video;

/* loaded from: classes3.dex */
public class AgoraImage {
    public double alpha;
    public int height;
    public String url;
    public int width;

    /* renamed from: x, reason: collision with root package name */
    public int f49179x;

    /* renamed from: y, reason: collision with root package name */
    public int f49180y;
    public int zOrder;

    public AgoraImage() {
        this.url = null;
        this.f49179x = 0;
        this.f49180y = 0;
        this.width = 0;
        this.height = 0;
        this.zOrder = 0;
        this.alpha = 1.0d;
    }

    public AgoraImage(String str) {
        this.url = str;
        this.f49179x = 0;
        this.f49180y = 0;
        this.width = 0;
        this.height = 0;
        this.zOrder = 0;
        this.alpha = 1.0d;
    }
}
