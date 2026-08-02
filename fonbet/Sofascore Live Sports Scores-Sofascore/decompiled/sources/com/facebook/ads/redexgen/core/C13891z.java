package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C13891z {
    public final AudioAttributes A00;

    public C13891z(C3218qQ c3218qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c3218qQ.A02).setFlags(c3218qQ.A03).setUsage(c3218qQ.A05);
        if (C5C.A02 >= 29) {
            C13871x.A00(usage, c3218qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C13881y.A00(usage, c3218qQ.A04);
        }
        this.A00 = usage.build();
    }
}
