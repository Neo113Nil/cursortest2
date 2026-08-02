package com.facebook.imagepipeline.memory;

import D6.d;
import K7.B;
import K7.M;
import K7.N;

@d
/* loaded from: classes2.dex */
public class NativeMemoryChunkPool extends B {
    @d
    public NativeMemoryChunkPool(G6.d dVar, M m10, N n10) {
        super(dVar, m10, n10);
    }

    @Override // K7.AbstractC1366g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public NativeMemoryChunk g(int i10) {
        return new NativeMemoryChunk(i10);
    }
}
