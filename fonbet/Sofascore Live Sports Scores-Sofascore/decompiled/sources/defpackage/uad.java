package defpackage;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uad implements Internal.EnumVerifier {
    public static final uad a = new uad();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return (i != 0 ? i != 1 ? null : vad.GENERIC_CLIENT_ERROR : vad.NETWORK_CLIENT_ERROR_REASON_UNKNOWN) != null;
    }
}
