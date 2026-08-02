package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class Z extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectionResult f32681a;

    public Z(ConnectionResult connectionResult) {
        AbstractC3191o.b(connectionResult.k(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f32681a = connectionResult;
    }
}
