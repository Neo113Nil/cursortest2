package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dm4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;

    public /* synthetic */ dm4(int i) {
        this.a = i;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                int i = this.b;
                int i2 = this.c;
                int i3 = this.d;
                int i4 = this.e;
                int i5 = this.f;
                int i6 = this.g;
                int i7 = this.h;
                int i8 = this.i;
                int i9 = this.j;
                int i10 = this.k;
                long j = this.l;
                int i11 = this.m;
                int i12 = lik.a;
                Locale locale = Locale.US;
                StringBuilder s = lnb.s(i, i2, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
                me4.q(s, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
                me4.q(s, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
                me4.q(s, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
                me4.q(s, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
                s.append(j);
                s.append("\n videoFrameProcessingOffsetCount=");
                s.append(i11);
                s.append("\n}");
                return s.toString();
            default:
                int i13 = this.b;
                int i14 = this.c;
                int i15 = this.d;
                int i16 = this.e;
                int i17 = this.f;
                int i18 = this.g;
                int i19 = this.h;
                int i20 = this.i;
                int i21 = this.j;
                int i22 = this.k;
                long j2 = this.l;
                int i23 = this.m;
                String str = nik.a;
                Locale locale2 = Locale.US;
                StringBuilder s2 = lnb.s(i13, i14, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
                me4.q(s2, i15, "\n skippedInputBuffers=", i16, "\n renderedOutputBuffers=");
                me4.q(s2, i17, "\n skippedOutputBuffers=", i18, "\n droppedBuffers=");
                me4.q(s2, i19, "\n droppedInputBuffers=", i20, "\n maxConsecutiveDroppedBuffers=");
                me4.q(s2, i21, "\n droppedToKeyframeEvents=", i22, "\n totalVideoFrameProcessingOffsetUs=");
                s2.append(j2);
                s2.append("\n videoFrameProcessingOffsetCount=");
                s2.append(i23);
                s2.append("\n}");
                return s2.toString();
        }
    }
}
