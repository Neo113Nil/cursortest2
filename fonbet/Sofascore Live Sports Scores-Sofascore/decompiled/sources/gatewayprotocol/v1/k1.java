package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k1 implements Internal.EnumVerifier {
    public static final k1 a = new k1();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return TransactionEventRequestOuterClass.TransactionOrigin.forNumber(i) != null;
    }
}
