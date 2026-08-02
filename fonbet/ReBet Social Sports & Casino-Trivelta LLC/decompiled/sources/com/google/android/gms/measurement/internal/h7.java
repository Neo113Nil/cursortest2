package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzqp;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class h7 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C3298l3 f34042a;

    public h7(C3298l3 c3298l3) {
        this.f34042a = c3298l3;
    }

    public final /* synthetic */ void a() {
        this.f34042a.N().o(((Long) AbstractC3209a2.f33806D.b(null)).longValue());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f34042a.a().r().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f34042a.a().r().a("App receiver called with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1928239649) {
            if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                C3298l3 c3298l3 = this.f34042a;
                c3298l3.a().w().a("[sgtm] App Receiver notified batches are available");
                c3298l3.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.e7
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        h7.this.a();
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final C3298l3 c3298l32 = this.f34042a;
            zzqp.zza();
            if (c3298l32.w().H(null, AbstractC3209a2.f33835R0)) {
                c3298l32.a().w().a("App receiver notified triggers are available");
                c3298l32.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.f7
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C3298l3 c3298l33 = C3298l3.this;
                        if (!c3298l33.C().G()) {
                            c3298l33.a().r().a("registerTrigger called but app not eligible");
                            return;
                        }
                        c3298l33.B().t0();
                        final W4 B10 = c3298l33.B();
                        Objects.requireNonNull(B10);
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.g7
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                W4.this.u0();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        this.f34042a.a().r().a("App receiver called with unknown action");
    }
}
