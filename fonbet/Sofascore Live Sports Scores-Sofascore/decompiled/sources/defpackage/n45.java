package defpackage;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n45 implements Internal.EnumVerifier {
    public static final n45 a = new n45();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : o45.SWIPE : o45.CLICK : o45.AUTO : o45.UNKNOWN_DISMISS_TYPE) != null;
    }
}
