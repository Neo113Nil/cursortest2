package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.U3;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgi implements Result {
    public final Status a;
    public final zzgc b;

    public zzgi(Status status, zzgc zzgcVar) {
        this.a = status;
        this.b = zzgcVar;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.a;
    }

    public final String toString() {
        zzgc zzgcVar = this.b;
        Preconditions.i(zzgcVar);
        return bf3.l("OptInOptionsResultImpl[", U3.j.e, zzgcVar.a == 1);
    }
}
