package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C9t extends Timeline {
    public final Timeline A00;

    public C9t(Timeline timeline) {
        this.A00 = timeline;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.A06();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A00.A07();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A08(int i, int i2, boolean z) {
        return this.A00.A08(i, i2, z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z) {
        return this.A00.A0B(z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z) {
        return this.A00.A0C(z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2222pl A0I(int i, C2222pl c2222pl, boolean z) {
        return this.A00.A0I(i, c2222pl, z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2220pj A0L(int i, C2220pj c2220pj, long j) {
        return this.A00.A0L(i, c2220pj, j);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i) {
        return this.A00.A0M(i);
    }
}
