package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2047mt implements InterfaceC0802Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.instagram.common.viewpoint.core.InterfaceC0802Hd
    public final /* synthetic */ int AIp(InterfaceC04352c interfaceC04352c, int i, boolean z) {
        return AbstractC0799Ha.A00(this, interfaceC04352c, i, z);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0802Hd
    public final /* synthetic */ void AIr(C05024v c05024v, int i) {
        AbstractC0799Ha.A01(this, c05024v, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0802Hd
    public final void A6e(C2255qI c2255qI) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0802Hd
    public final int AIq(InterfaceC04352c interfaceC04352c, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = interfaceC04352c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0802Hd
    public final void AIs(C05024v c05024v, int i, int i2) {
        c05024v.A0g(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0802Hd
    public final void AIu(long j, int i, int i2, int i3, C0800Hb c0800Hb) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0802Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
