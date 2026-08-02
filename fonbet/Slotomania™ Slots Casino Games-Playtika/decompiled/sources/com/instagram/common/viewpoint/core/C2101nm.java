package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2101nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C06189p A01;

    public C2101nm(C06189p c06189p, int i) {
        this.A01 = c06189p;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        C2089na[] c2089naArr;
        c2089naArr = this.A01.A0L;
        return c2089naArr[this.A00].A0S();
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final int AHP(C05586z c05586z, C2176p0 c2176p0, int i) {
        return this.A01.A0Y(this.A00, c05586z, c2176p0, i);
    }

    @Override // com.instagram.common.viewpoint.core.DT
    public final int AK2(long j) {
        return this.A01.A0X(this.A00, j);
    }
}
