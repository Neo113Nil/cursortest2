package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class HM {
    public final C05024v A00 = new C05024v(10);

    public final Metadata A00(InterfaceC2046ms interfaceC2046ms, IE ie) throws IOException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC2046ms.AGt(this.A00.A0l(), 0, 10);
                this.A00.A0f(0);
                if (this.A00.A0K() != 4801587) {
                    break;
                }
                this.A00.A0g(3);
                int A0H = this.A00.A0H();
                int framesLength = A0H + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A0l(), 0, bArr, 0, 10);
                    interfaceC2046ms.AGt(bArr, 10, A0H);
                    metadata = new C9U(ie).A0S(bArr, framesLength);
                } else {
                    interfaceC2046ms.A47(A0H);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC2046ms.AIl();
        interfaceC2046ms.A47(tagLength);
        return metadata;
    }
}
