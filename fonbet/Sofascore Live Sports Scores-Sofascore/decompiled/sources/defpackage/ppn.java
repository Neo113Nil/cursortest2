package defpackage;

import android.os.Looper;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.a;
import com.android.billingclient.api.m;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzp;
import defpackage.ppn;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ppn implements BillingClientStateListener {
    public final /* synthetic */ zzp a;
    public final /* synthetic */ a b;

    public ppn(a aVar, zzp zzpVar) {
        this.a = zzpVar;
        Objects.requireNonNull(aVar);
        this.b = aVar;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        zzc.h("BillingClient", "Reconnection attempt failed.");
        try {
            this.a.a(m.j);
        } catch (Throwable unused) {
            int i = zzc.a;
        }
        a aVar = this.b;
        if (aVar.K != null) {
            Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzbt
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ppn.this.b.K.onBillingServiceDisconnected();
                    } catch (Throwable unused2) {
                        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                    }
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                aVar.e.post(runnable);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(final BillingResult billingResult) {
        zzc.h("BillingClient", "Reconnection finished with result: " + billingResult.getResponseCode());
        try {
            this.a.a(billingResult);
        } catch (Throwable unused) {
            int i = zzc.a;
        }
        a aVar = this.b;
        if (aVar.K != null) {
            Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzbu
                @Override // java.lang.Runnable
                public final void run() {
                    ppn ppnVar = ppn.this;
                    try {
                        ppnVar.b.K.onBillingSetupFinished(billingResult);
                    } catch (Throwable unused2) {
                        int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                    }
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                aVar.e.post(runnable);
            }
        }
    }
}
