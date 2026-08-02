package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04321z {
    public final AudioAttributes A00;

    public C04321z(C2261qQ c2261qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2261qQ.A02).setFlags(c2261qQ.A03).setUsage(c2261qQ.A05);
        if (C5C.A02 >= 29) {
            C04301x.A00(usage, c2261qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C04311y.A00(usage, c2261qQ.A04);
        }
        this.A00 = usage.build();
    }
}
