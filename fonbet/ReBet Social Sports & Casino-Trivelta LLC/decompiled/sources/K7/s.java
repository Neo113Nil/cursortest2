package K7;

import android.util.SparseIntArray;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f6345a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final int f6346b = Runtime.getRuntime().availableProcessors();

    public static final SparseIntArray a(int i10, int i11, int i12) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i10 <= i11) {
            sparseIntArray.put(i10, i12);
            i10 *= 2;
        }
        return sparseIntArray;
    }

    public static final M b() {
        int i10 = f6346b;
        return new M(4194304, i10 * 4194304, a(PKIFailureInfo.unsupportedVersion, 4194304, i10), PKIFailureInfo.unsupportedVersion, 4194304, i10);
    }
}
