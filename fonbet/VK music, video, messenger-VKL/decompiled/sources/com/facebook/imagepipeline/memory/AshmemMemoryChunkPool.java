package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import xsna.fvb0;
import xsna.g320;
import xsna.gvb0;
import xsna.rt3;
import xsna.s220;
import xsna.zsn;

@zsn
@TargetApi(27)
/* loaded from: classes12.dex */
public class AshmemMemoryChunkPool extends b {
    @zsn
    public AshmemMemoryChunkPool(g320 g320Var, fvb0 fvb0Var, gvb0 gvb0Var) {
        super(g320Var, fvb0Var, gvb0Var);
    }

    @Override // com.facebook.imagepipeline.memory.b, com.facebook.imagepipeline.memory.BasePool
    public final s220 i(int i) {
        return new rt3(i);
    }

    @Override // com.facebook.imagepipeline.memory.b
    /* renamed from: v */
    public final s220 i(int i) {
        return new rt3(i);
    }
}
