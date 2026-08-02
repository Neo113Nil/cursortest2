package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class q extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final Feature f32599a;

    public q(Feature feature) {
        this.f32599a = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f32599a));
    }
}
