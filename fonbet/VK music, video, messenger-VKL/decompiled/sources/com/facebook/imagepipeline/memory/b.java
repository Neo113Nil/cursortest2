package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import xsna.fvb0;
import xsna.g320;
import xsna.gvb0;
import xsna.s220;

/* compiled from: MemoryChunkPool.java */
/* loaded from: classes.dex */
public abstract class b extends BasePool<s220> {
    public final int[] k;

    public b(g320 g320Var, fvb0 fvb0Var, gvb0 gvb0Var) {
        super(g320Var, fvb0Var, gvb0Var);
        SparseIntArray sparseIntArray = fvb0Var.c;
        sparseIntArray.getClass();
        this.k = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.k;
            if (i >= iArr.length) {
                this.c.a(this);
                this.j.getClass();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final void k(s220 s220Var) {
        s220 s220Var2 = s220Var;
        s220Var2.getClass();
        s220Var2.close();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int m(int i) {
        if (i <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.k) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int n(s220 s220Var) {
        s220 s220Var2 = s220Var;
        s220Var2.getClass();
        return s220Var2.getSize();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final boolean r(s220 s220Var) {
        s220Var.getClass();
        return !r1.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public abstract s220 i(int i);

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int o(int i) {
        return i;
    }
}
