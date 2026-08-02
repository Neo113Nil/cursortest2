package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AI implements InterfaceC2191pF {
    public static byte[] A00;
    public static final C5Y A01;
    public static final AI A02;

    public static /* synthetic */ AI A00() {
        return new AI();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Ascii.ETB, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, Ascii.DC4, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    static {
        A02();
        A02 = new AI();
        A01 = new C5Y() { // from class: com.facebook.ads.redexgen.X.p4
            @Override // com.instagram.common.viewpoint.core.C5Y
            public final InterfaceC2191pF A5I() {
                return AI.A00();
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final void A43(InterfaceC05265t interfaceC05265t) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final Uri A9P() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final long AGi(C05155i c05155i) throws IOException {
        throw new IOException(A01(0, 38, 57));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final void close() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04352c
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
