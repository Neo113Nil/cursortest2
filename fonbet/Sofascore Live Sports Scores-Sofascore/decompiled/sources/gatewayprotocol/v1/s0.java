package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s0 implements Internal.EnumVerifier {
    public static final s0 a = new s0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return NativeConfigurationOuterClass.FullscreenNavBarMode.forNumber(i) != null;
    }
}
