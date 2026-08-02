package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzka;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzkw;
import defpackage.c0l;
import defpackage.fjg;
import defpackage.lyn;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o extends BroadcastReceiver {
    public BillingResult a;
    public boolean b = false;
    public final lyn c;

    public o(c0l c0lVar) {
        this.c = c0lVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            return;
        }
        com.google.android.gms.internal.play_billing.zzc.h("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        boolean equals = Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
        lyn lynVar = this.c;
        if (equals) {
            if (!intent.hasExtra("RESPONSE_CODE")) {
                if (lynVar != null) {
                    ((c0l) lynVar).z(null, intent.getLongExtra("billingClientTransactionId", 0L));
                    return;
                }
                return;
            }
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(intent.getIntExtra("RESPONSE_CODE", 0));
            String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
            if (stringExtra == null) {
                stringExtra = "";
            }
            newBuilder.setDebugMessage(stringExtra);
            BillingResult build = newBuilder.build();
            this.a = build;
            if (lynVar != null) {
                ((c0l) lynVar).z(build, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
            "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction()));
            return;
        }
        this.b = true;
        if (lynVar != null) {
            long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
            c0l c0lVar = (c0l) lynVar;
            try {
                zzka p = zzkd.p();
                p.e();
                zzkd.u((zzkd) p.b, 4);
                zzjz zzjzVar = zzjz.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                p.e();
                zzkd.q((zzkd) p.b, zzjzVar);
                zzkd zzkdVar = (zzkd) p.c();
                zzku r = zzkw.r();
                zzkg zzkgVar = (zzkg) c0lVar.b;
                if (longExtra != 0) {
                    zzke zzkeVar = (zzke) zzkgVar.k();
                    zzkeVar.i(longExtra);
                    zzkgVar = (zzkg) zzkeVar.c();
                }
                r.g(zzkgVar);
                r.e();
                zzkw.v((zzkw) r.b, zzkdVar);
                ((fjg) c0lVar.c).v((zzkw) r.c());
            } catch (Throwable unused) {
                int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            }
        }
    }
}
