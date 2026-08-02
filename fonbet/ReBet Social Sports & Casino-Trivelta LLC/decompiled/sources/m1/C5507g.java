package m1;

/* renamed from: m1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5507g {

    /* renamed from: a, reason: collision with root package name */
    public int f56196a;

    /* renamed from: b, reason: collision with root package name */
    public int f56197b;

    /* renamed from: c, reason: collision with root package name */
    public int f56198c;

    /* renamed from: d, reason: collision with root package name */
    public int f56199d;

    /* renamed from: e, reason: collision with root package name */
    public int f56200e;

    /* renamed from: f, reason: collision with root package name */
    public int f56201f;

    /* renamed from: g, reason: collision with root package name */
    public int f56202g;

    /* renamed from: h, reason: collision with root package name */
    public int f56203h;

    /* renamed from: i, reason: collision with root package name */
    public int f56204i;

    /* renamed from: j, reason: collision with root package name */
    public int f56205j;

    /* renamed from: k, reason: collision with root package name */
    public long f56206k;

    /* renamed from: l, reason: collision with root package name */
    public int f56207l;

    public void a(long j10) {
        b(j10, 1);
    }

    public final void b(long j10, int i10) {
        this.f56206k += j10;
        this.f56207l += i10;
    }

    public synchronized void c() {
    }

    public String toString() {
        return e1.Z.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f56196a), Integer.valueOf(this.f56197b), Integer.valueOf(this.f56198c), Integer.valueOf(this.f56199d), Integer.valueOf(this.f56200e), Integer.valueOf(this.f56201f), Integer.valueOf(this.f56202g), Integer.valueOf(this.f56203h), Integer.valueOf(this.f56204i), Integer.valueOf(this.f56205j), Long.valueOf(this.f56206k), Integer.valueOf(this.f56207l));
    }
}
