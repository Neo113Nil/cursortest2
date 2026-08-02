package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.lU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2929lU implements H9 {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final HD A04 = new HD() { // from class: com.facebook.ads.redexgen.X.lV
        @Override // com.facebook.ads.redexgen.core.HD
        public final H9[] A5N() {
            return C2929lU.A00();
        }

        @Override // com.facebook.ads.redexgen.core.HD
        public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
            return HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C2928lT A02 = new C2928lT();
    public final C14594v A01 = new C14594v(16384);

    public static /* synthetic */ H9[] A00() {
        return new H9[]{new C2929lU()};
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AAC(HA ha) {
        this.A02.A5c(ha, new LG(0, 1));
        ha.A6O();
        ha.AJ7(new C2998mn(C.TIME_UNSET));
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final int AHL(InterfaceC3003ms interfaceC3003ms, HV hv) throws IOException {
        int read = interfaceC3003ms.read(this.A01.A0l(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(read);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final void AJ6(long j, long j2) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.facebook.ads.redexgen.core.H9
    public final boolean AK5(InterfaceC3003ms interfaceC3003ms) throws IOException {
        C14594v c14594v = new C14594v(10);
        int length = 0;
        while (true) {
            byte[] A0l = c14594v.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC3003ms.AGt(A0l, 0, 10);
            c14594v.A0f(0);
            if (c14594v.A0K() != 4801587) {
                interfaceC3003ms.AIl();
                interfaceC3003ms.A47(length);
                int i = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC3003ms.AGt(c14594v.A0l(), 0, 7);
                    c14594v.A0f(0);
                    int headerPosition = c14594v.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC3003ms.AIl();
                        i++;
                        if (i - length >= 8192) {
                            return false;
                        }
                        interfaceC3003ms.A47(i);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = AbstractC1750Gu.A02(c14594v.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC3003ms.A47(headerPosition2 - 7);
                    }
                }
            } else {
                c14594v.A0g(3);
                int A0H = c14594v.A0H();
                length += A0H + 10;
                interfaceC3003ms.A47(A0H);
            }
        }
    }
}
