package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.DeveloperConsentOuterClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n implements Internal.EnumVerifier {
    public static final n a = new n();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DeveloperConsentOuterClass.DeveloperConsentChoice.forNumber(i) != null;
    }
}
