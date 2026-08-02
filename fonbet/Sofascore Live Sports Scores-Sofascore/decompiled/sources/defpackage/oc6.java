package defpackage;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oc6 implements Internal.EnumVerifier {
    public static final oc6 a = new oc6();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return (i != 0 ? i != 1 ? i != 2 ? null : qc6.CLICK_EVENT_TYPE : qc6.IMPRESSION_EVENT_TYPE : qc6.UNKNOWN_EVENT_TYPE) != null;
    }
}
