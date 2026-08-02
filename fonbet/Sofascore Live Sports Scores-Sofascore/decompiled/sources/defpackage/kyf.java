package defpackage;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kyf implements Internal.EnumVerifier {
    public static final kyf a = new kyf();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return (i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : lyf.IMAGE_UNSUPPORTED_FORMAT : lyf.IMAGE_DISPLAY_ERROR : lyf.IMAGE_FETCH_ERROR : lyf.UNSPECIFIED_RENDER_ERROR) != null;
    }
}
