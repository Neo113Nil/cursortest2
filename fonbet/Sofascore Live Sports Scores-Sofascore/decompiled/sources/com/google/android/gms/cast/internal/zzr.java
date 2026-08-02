package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzr implements Cast.ApplicationConnectionResult {
    public final Status a;
    public final ApplicationMetadata b;
    public final String c;
    public final String d;
    public final boolean e;

    public zzr(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.a = status;
        this.b = applicationMetadata;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // com.google.android.gms.cast.Cast.ApplicationConnectionResult
    public final ApplicationMetadata E0() {
        return this.b;
    }

    @Override // com.google.android.gms.cast.Cast.ApplicationConnectionResult
    public final String getSessionId() {
        return this.d;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.a;
    }

    @Override // com.google.android.gms.cast.Cast.ApplicationConnectionResult
    public final boolean j0() {
        return this.e;
    }

    @Override // com.google.android.gms.cast.Cast.ApplicationConnectionResult
    public final String n0() {
        return this.c;
    }
}
