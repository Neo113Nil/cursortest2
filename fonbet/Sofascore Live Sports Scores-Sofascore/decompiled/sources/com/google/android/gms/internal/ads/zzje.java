package com.google.android.gms.internal.ads;

import defpackage.lnb;
import defpackage.me4;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzje {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = zzfm.a;
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
    }
}
