package com.instagram.common.viewpoint.core;

import android.media.Spatializer;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0726Ee implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ C0727Ef A00;
    public final /* synthetic */ C06129h A01;

    public C0726Ee(C0727Ef c0727Ef, C06129h c06129h) {
        this.A00 = c0727Ef;
        this.A01 = c06129h;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
