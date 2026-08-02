package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.nm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3058nm implements DT, DU {
    public final int A00;
    public final /* synthetic */ C15759p A01;

    public C3058nm(C15759p c15759p, int i) {
        this.A01 = c15759p;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.DU
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A89() {
        C3046na[] c3046naArr;
        c3046naArr = this.A01.A0L;
        return c3046naArr[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final boolean AAe() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final void ACR() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AHP(C15156z c15156z, C3133p0 c3133p0, int i) {
        return this.A01.A0Y(this.A00, c15156z, c3133p0, i);
    }

    @Override // com.facebook.ads.redexgen.core.DT
    public final int AK2(long j) {
        return this.A01.A0X(this.A00, j);
    }
}
