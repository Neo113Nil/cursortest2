package K7;

import K7.AbstractC1366g;
import android.util.SparseIntArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public class x extends AbstractC1366g implements G6.a {

    @NotNull
    private final int[] bucketSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(G6.d memoryTrimmableRegistry, M poolParams, N poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        Intrinsics.checkNotNullParameter(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        Intrinsics.checkNotNullParameter(poolParams, "poolParams");
        Intrinsics.checkNotNullParameter(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f6296c;
        if (sparseIntArray != null) {
            this.bucketSizes = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.bucketSizes[i10] = sparseIntArray.keyAt(i10);
            }
        } else {
            this.bucketSizes = new int[0];
        }
        s();
    }

    @Override // K7.AbstractC1366g
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public byte[] g(int i10) {
        return new byte[i10];
    }

    @Override // K7.AbstractC1366g
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void k(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // K7.AbstractC1366g
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int o(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length;
    }

    @Override // K7.AbstractC1366g
    public int n(int i10) {
        if (i10 <= 0) {
            throw new AbstractC1366g.b(Integer.valueOf(i10));
        }
        for (int i11 : this.bucketSizes) {
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
