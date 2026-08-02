package defpackage;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class byj implements Internal.EnumVerifier {
    public static final byj a = new byj();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return (i != 0 ? i != 1 ? null : cyj.FL_LEGACY_V1 : cyj.SOURCE_UNKNOWN) != null;
    }
}
