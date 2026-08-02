package com.facebook.ads.redexgen.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1683Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C1684Ef A00;
    public final /* synthetic */ C15699h A01;

    public C1683Ee(C1684Ef c1684Ef, C15699h c15699h) {
        this.A00 = c1684Ef;
        this.A01 = c15699h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
