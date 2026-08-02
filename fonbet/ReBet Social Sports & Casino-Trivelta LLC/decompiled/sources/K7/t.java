package K7;

import android.util.SparseIntArray;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f6347a = new t();

    public static final M a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(PKIFailureInfo.notAuthorized, 5);
        sparseIntArray.put(PKIFailureInfo.unsupportedVersion, 5);
        sparseIntArray.put(PKIFailureInfo.transactionIdInUse, 2);
        sparseIntArray.put(PKIFailureInfo.signerNotTrusted, 2);
        sparseIntArray.put(PKIFailureInfo.badCertTemplate, 2);
        t tVar = f6347a;
        return new M(tVar.c(), tVar.b(), sparseIntArray);
    }

    public final int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min < 16777216 ? min / 2 : (min / 4) * 3;
    }

    public final int c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        return min < 33554432 ? 6291456 : 12582912;
    }
}
