package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3004mt implements InterfaceC1759Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC1759Hd
    public final /* synthetic */ int AIp(InterfaceC13922c interfaceC13922c, int i, boolean z) {
        return AbstractC1756Ha.A00(this, interfaceC13922c, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1759Hd
    public final /* synthetic */ void AIr(C14594v c14594v, int i) {
        AbstractC1756Ha.A01(this, c14594v, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1759Hd
    public final void A6e(C3212qI c3212qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1759Hd
    public final int AIq(InterfaceC13922c interfaceC13922c, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = interfaceC13922c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1759Hd
    public final void AIs(C14594v c14594v, int i, int i2) {
        c14594v.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1759Hd
    public final void AIu(long j, int i, int i2, int i3, C1757Hb c1757Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1759Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
