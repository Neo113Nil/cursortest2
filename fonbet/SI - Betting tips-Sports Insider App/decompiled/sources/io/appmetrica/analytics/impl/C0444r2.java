package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444r2 {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f14540a;

    public C0444r2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C0444r2(LocationManager locationManager) {
        this.f14540a = locationManager;
    }
}
