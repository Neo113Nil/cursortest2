package com.facebook.imagepipeline.memory;

import xsna.fvb0;
import xsna.g320;
import xsna.gvb0;
import xsna.s220;
import xsna.zsn;

@zsn
/* loaded from: classes.dex */
public class NativeMemoryChunkPool extends b {
    @zsn
    public NativeMemoryChunkPool(g320 g320Var, fvb0 fvb0Var, gvb0 gvb0Var) {
        super(g320Var, fvb0Var, gvb0Var);
    }

    @Override // com.facebook.imagepipeline.memory.b, com.facebook.imagepipeline.memory.BasePool
    public final s220 i(int i) {
        return new NativeMemoryChunk(i);
    }

    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: v */
    public final s220 i(int i) {
        return new NativeMemoryChunk(i);
    }
}
