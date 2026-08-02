package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32475a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionResult f32476b;

    public d1(ConnectionResult connectionResult, int i10) {
        AbstractC3191o.m(connectionResult);
        this.f32476b = connectionResult;
        this.f32475a = i10;
    }

    public final int a() {
        return this.f32475a;
    }

    public final ConnectionResult b() {
        return this.f32476b;
    }
}
