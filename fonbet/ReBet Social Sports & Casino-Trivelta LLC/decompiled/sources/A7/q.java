package A7;

import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public class q implements D6.n {

    /* renamed from: a, reason: collision with root package name */
    public static final long f249a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return PKIFailureInfo.badCertTemplate;
        }
        if (min < 33554432) {
            return PKIFailureInfo.badSenderNonce;
        }
        return 4194304;
    }

    @Override // D6.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        int b10 = b();
        return new y(b10, Integer.MAX_VALUE, b10, Integer.MAX_VALUE, b10 / 8, f249a);
    }
}
