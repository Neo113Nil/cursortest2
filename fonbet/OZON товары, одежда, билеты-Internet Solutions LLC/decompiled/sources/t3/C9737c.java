package t3;

import Am.C2438a;
import java.util.Locale;
import m3.N;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9737c {

    /* renamed from: a, reason: collision with root package name */
    public int f99011a;

    /* renamed from: b, reason: collision with root package name */
    public int f99012b;

    /* renamed from: c, reason: collision with root package name */
    public int f99013c;

    /* renamed from: d, reason: collision with root package name */
    public int f99014d;

    /* renamed from: e, reason: collision with root package name */
    public int f99015e;

    /* renamed from: f, reason: collision with root package name */
    public int f99016f;

    /* renamed from: g, reason: collision with root package name */
    public int f99017g;

    /* renamed from: h, reason: collision with root package name */
    public int f99018h;

    /* renamed from: i, reason: collision with root package name */
    public int f99019i;

    /* renamed from: j, reason: collision with root package name */
    public int f99020j;

    /* renamed from: k, reason: collision with root package name */
    public long f99021k;

    /* renamed from: l, reason: collision with root package name */
    public int f99022l;

    public final String toString() {
        int i11 = this.f99011a;
        int i12 = this.f99012b;
        int i13 = this.f99013c;
        int i14 = this.f99014d;
        int i15 = this.f99015e;
        int i16 = this.f99016f;
        int i17 = this.f99017g;
        int i18 = this.f99018h;
        int i19 = this.f99019i;
        int i21 = this.f99020j;
        long j11 = this.f99021k;
        int i22 = this.f99022l;
        int i23 = N.f74289a;
        Locale locale = Locale.US;
        StringBuilder a11 = C2438a.a("DecoderCounters {\n decoderInits=", i11, ",\n decoderReleases=", "\n queuedInputBuffers=", i12);
        Ek.a.f(i13, i14, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", a11);
        Ek.a.f(i15, i16, "\n skippedOutputBuffers=", "\n droppedBuffers=", a11);
        Ek.a.f(i17, i18, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", a11);
        Ek.a.f(i19, i21, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", a11);
        a11.append(j11);
        a11.append("\n videoFrameProcessingOffsetCount=");
        a11.append(i22);
        a11.append("\n}");
        return a11.toString();
    }
}
