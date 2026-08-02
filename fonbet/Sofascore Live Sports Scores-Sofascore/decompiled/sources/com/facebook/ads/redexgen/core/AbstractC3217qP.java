package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.qP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3217qP implements InterfaceC14153b {
    public final C3177pj A00 = new C3177pj();

    @MetaExoPlayerCustomization("Should be final")
    public abstract void A0H(int i, long j);

    public final int A00() {
        long A77 = A77();
        long A7s = A7s();
        if (A77 == C.TIME_UNSET || A7s == C.TIME_UNSET) {
            return 0;
        }
        if (A7s == 0) {
            return 100;
        }
        return C5C.A07((int) ((100 * A77) / A7s), 0, 100);
    }

    public void A01() {
        AKG(false);
    }

    public final void A02() {
        A03(A7h());
    }

    public final void A03(int i) {
        A0H(i, C.TIME_UNSET);
    }

    public final void A04(long j) {
        A0H(A7h(), j);
    }
}
