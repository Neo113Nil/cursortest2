package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.AbstractC0729Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0729Eh<T extends AbstractC0729Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2255qI A02;
    public final C2218pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0729Eh(int i, C2218pg c2218pg, int i2) {
        this.A00 = i;
        this.A03 = c2218pg;
        this.A01 = i2;
        this.A02 = c2218pg.A08(i2);
    }
}
