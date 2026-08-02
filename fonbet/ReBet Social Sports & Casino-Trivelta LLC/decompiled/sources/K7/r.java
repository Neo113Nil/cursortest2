package K7;

import android.util.SparseIntArray;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f6344a = new r();

    public static final M a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new M(81920, PKIFailureInfo.badCertTemplate, sparseIntArray);
    }
}
