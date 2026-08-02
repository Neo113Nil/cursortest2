package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool;
import xsna.fvb0;
import xsna.g320;
import xsna.u370;
import xsna.ut8;

/* compiled from: GenericByteArrayPool.kt */
/* loaded from: classes.dex */
public class a extends BasePool<byte[]> implements ut8 {
    public final int[] k;

    public a(g320 g320Var, fvb0 fvb0Var, u370 u370Var) {
        super(g320Var, fvb0Var, u370Var);
        SparseIntArray sparseIntArray = fvb0Var.c;
        if (sparseIntArray != null) {
            this.k = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.k[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.k = new int[0];
        }
        this.c.a(this);
        this.j.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final byte[] i(int i) {
        return new byte[i];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final /* bridge */ /* synthetic */ void k(byte[] bArr) {
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
    public final int n(byte[] bArr) {
        return bArr.length;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int o(int i) {
        return i;
    }
}
