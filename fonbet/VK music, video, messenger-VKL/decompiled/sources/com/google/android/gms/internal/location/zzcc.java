package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.c;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import xsna.cv90;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
public final class zzcc {
    public final cv90<LocationSettingsResult> checkLocationSettings(c cVar, LocationSettingsRequest locationSettingsRequest) {
        return cVar.a(new zzca(this, cVar, locationSettingsRequest, null));
    }
}
