package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class S5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f33622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T5 f33623b;

    public S5(T5 t52, ConnectionResult connectionResult) {
        this.f33622a = connectionResult;
        Objects.requireNonNull(t52);
        this.f33623b = t52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z5 z52 = this.f33623b.f33671c;
        z52.O(null);
        if (this.f33622a.h() != 7777) {
            z52.L();
            return;
        }
        if (z52.P() == null) {
            z52.Q(Executors.newScheduledThreadPool(1));
        }
        z52.P().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.Q5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final Z5 z53 = S5.this.f33623b.f33671c;
                z53.f33578a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.R5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        Z5.this.w();
                    }
                });
            }
        }, ((Long) AbstractC3209a2.f33853a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
