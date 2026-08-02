package com.google.android.gms.internal.location;

import V9.InterfaceC1758n;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.LocationSettingsRequest;

/* loaded from: classes2.dex */
public final class zzcc implements InterfaceC1758n {
    public final h checkLocationSettings(f fVar, LocationSettingsRequest locationSettingsRequest) {
        return fVar.g(new zzca(this, fVar, locationSettingsRequest, null));
    }
}
