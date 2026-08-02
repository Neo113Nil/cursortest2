package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3259g4 implements Ta.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzoh f34025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f34026b;

    public C3259g4(W4 w42, zzoh zzohVar) {
        this.f34025a = zzohVar;
        Objects.requireNonNull(w42);
        this.f34026b = w42;
    }

    public final void a() {
        C3298l3 c3298l3 = this.f34026b.f33578a;
        SparseArray r10 = c3298l3.x().r();
        zzoh zzohVar = this.f34025a;
        r10.put(zzohVar.f34441c, Long.valueOf(zzohVar.f34440b));
        L2 x10 = c3298l3.x();
        int[] iArr = new int[r10.size()];
        long[] jArr = new long[r10.size()];
        for (int i10 = 0; i10 < r10.size(); i10++) {
            iArr[i10] = r10.keyAt(i10);
            jArr[i10] = ((Long) r10.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        x10.f33525o.b(bundle);
    }

    @Override // Ta.h
    public final void onFailure(Throwable th2) {
        W4 w42 = this.f34026b;
        w42.h();
        w42.Z(false);
        C3298l3 c3298l3 = w42.f33578a;
        int d02 = (c3298l3.w().H(null, AbstractC3209a2.f33841U0) ? w42.d0(th2) : 2) - 1;
        if (d02 == 0) {
            c3298l3.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C3392x2.x(w42.f33578a.L().q()), C3392x2.x(th2.toString()));
            w42.b0(1);
            w42.w0().add(this.f34025a);
            return;
        }
        if (d02 != 1) {
            c3298l3.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C3392x2.x(w42.f33578a.L().q()), th2);
            a();
            w42.b0(1);
            w42.x0();
            return;
        }
        w42.w0().add(this.f34025a);
        if (w42.a0() > ((Integer) AbstractC3209a2.f33911x0.b(null)).intValue()) {
            w42.b0(1);
            c3298l3.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", C3392x2.x(w42.f33578a.L().q()), C3392x2.x(th2.toString()));
        } else {
            c3298l3.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C3392x2.x(w42.f33578a.L().q()), C3392x2.x(String.valueOf(w42.a0())), C3392x2.x(th2.toString()));
            w42.V(w42.a0());
            int a02 = w42.a0();
            w42.b0(a02 + a02);
        }
    }

    @Override // Ta.h
    public final void onSuccess(Object obj) {
        W4 w42 = this.f34026b;
        w42.h();
        a();
        w42.Z(false);
        w42.b0(1);
        w42.f33578a.a().v().b("Successfully registered trigger URI", this.f34025a.f34439a);
        w42.x0();
    }
}
