package N;

import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class f {
    public static final long a(float f10, float f11, float f12, float f13, O.c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float d10 = colorSpace.d(0);
        if (f10 <= colorSpace.c(0) && d10 <= f10) {
            float d11 = colorSpace.d(1);
            if (f11 <= colorSpace.c(1) && d11 <= f11) {
                float d12 = colorSpace.d(2);
                if (f12 <= colorSpace.c(2) && d12 <= f12 && 0.0f <= f13 && f13 <= 1.0f) {
                    if (colorSpace.g()) {
                        return e.c(ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl((((((int) ((f10 * 255.0f) + 0.5f)) << 16) | (((int) ((f13 * 255.0f) + 0.5f)) << 24)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((f12 * 255.0f) + 0.5f))) & BodyPartID.bodyIdMax) << 32));
                    }
                    if (colorSpace.a() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int b10 = colorSpace.b();
                    if (b10 == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short a10 = h.a(f10);
                    return e.c(ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl(h.a(f11)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl(a10) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl(h.a(f12)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m321constructorimpl(ULong.m321constructorimpl(b10) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f10 + ", green = " + f11 + ", blue = " + f12 + ", alpha = " + f13 + " outside the range for " + colorSpace).toString());
    }

    public static final long b(int i10) {
        return e.c(ULong.m321constructorimpl(ULong.m321constructorimpl(i10) << 32));
    }

    public static final long c(long j10) {
        return e.c(ULong.m321constructorimpl(ULong.m321constructorimpl(ULong.m321constructorimpl(j10) & BodyPartID.bodyIdMax) << 32));
    }

    public static final int d(long j10) {
        return (int) ULong.m321constructorimpl(e.d(j10, O.g.f8158a.h()) >>> 32);
    }
}
