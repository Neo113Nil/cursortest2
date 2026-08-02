package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC1686Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1686Eh<T extends AbstractC1686Eh<T>> {
    public final int A00;
    public final int A01;
    public final C3212qI A02;
    public final C3175pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC1686Eh(int i, C3175pg c3175pg, int i2) {
        this.A00 = i;
        this.A03 = c3175pg;
        this.A01 = i2;
        this.A02 = c3175pg.A08(i2);
    }
}
