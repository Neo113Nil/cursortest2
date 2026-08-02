package com.facebook.imagepipeline.nativecode;

import u7.C6528b;

@D6.d
/* loaded from: classes2.dex */
public class NativeJpegTranscoderFactory implements O7.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f30589a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30590b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30591c;

    @D6.d
    public NativeJpegTranscoderFactory(int i10, boolean z10, boolean z11) {
        this.f30589a = i10;
        this.f30590b = z10;
        this.f30591c = z11;
    }

    @Override // O7.d
    @D6.d
    public O7.c createImageTranscoder(u7.c cVar, boolean z10) {
        if (cVar != C6528b.f66196b) {
            return null;
        }
        return new NativeJpegTranscoder(z10, this.f30589a, this.f30590b, this.f30591c);
    }
}
