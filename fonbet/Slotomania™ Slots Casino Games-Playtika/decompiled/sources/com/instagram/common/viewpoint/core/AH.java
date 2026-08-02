package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC2191pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC04603d A01;
    public final InterfaceC2191pF A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC2191pF interfaceC2191pF, AbstractC04603d abstractC04603d, int i) {
        this.A02 = (InterfaceC2191pF) AbstractC04793y.A01(interfaceC2191pF);
        AbstractC04793y.A01(abstractC04603d);
        this.A01 = null;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final void A43(InterfaceC05265t interfaceC05265t) {
        AbstractC04793y.A01(interfaceC05265t);
        this.A02.A43(interfaceC05265t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final long AGi(C05155i c05155i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2191pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04352c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
