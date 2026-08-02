package K7;

import K7.AbstractC1366g;
import android.util.SparseIntArray;

/* loaded from: classes2.dex */
public abstract class B extends AbstractC1366g {
    private final int[] mBucketSizes;

    public B(G6.d dVar, M m10, N n10) {
        super(dVar, m10, n10);
        SparseIntArray sparseIntArray = (SparseIntArray) D6.k.g(m10.f6296c);
        this.mBucketSizes = new int[sparseIntArray.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = this.mBucketSizes;
            if (i10 >= iArr.length) {
                s();
                return;
            } else {
                iArr[i10] = sparseIntArray.keyAt(i10);
                i10++;
            }
        }
    }

    @Override // K7.AbstractC1366g
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void k(A a10) {
        D6.k.g(a10);
        a10.close();
    }

    @Override // K7.AbstractC1366g
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int o(A a10) {
        D6.k.g(a10);
        return a10.getSize();
    }

    public int C() {
        return this.mBucketSizes[0];
    }

    @Override // K7.AbstractC1366g
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean u(A a10) {
        D6.k.g(a10);
        return !a10.isClosed();
    }

    @Override // K7.AbstractC1366g
    public int n(int i10) {
        if (i10 <= 0) {
            throw new AbstractC1366g.b(Integer.valueOf(i10));
        }
        for (int i11 : this.mBucketSizes) {
            if (i11 >= i10) {
                return i11;
            }
        }
        return i10;
    }

    @Override // K7.AbstractC1366g
    public int p(int i10) {
        return i10;
    }
}
