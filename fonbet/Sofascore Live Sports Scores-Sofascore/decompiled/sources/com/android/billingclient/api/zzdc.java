package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;
import defpackage.lyn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzdc {
    public static final /* synthetic */ int zza = 0;

    static {
        int i = lyn.R7;
    }

    @Nullable
    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = com.google.android.gms.internal.play_billing.zzc.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            return null;
        }
    }

    @Nullable
    public static zzjl zzb(@Nullable zzjs zzjsVar, int i, BillingResult billingResult, @Nullable String str, zzjz zzjzVar) {
        try {
            zzjq q = zzju.q();
            q.h(billingResult.getResponseCode());
            String debugMessage = billingResult.getDebugMessage();
            q.e();
            zzju.s((zzju) q.b, debugMessage);
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                int onPurchasesUpdatedSubResponseCode = billingResult.getOnPurchasesUpdatedSubResponseCode();
                q.e();
                zzju.u((zzju) q.b, onPurchasesUpdatedSubResponseCode);
            }
            if (zzjsVar != null) {
                q.g(zzjsVar);
            }
            if (str != null) {
                q.e();
                zzju.r((zzju) q.b, str);
            }
            zzjj s = zzjl.s();
            s.g(q);
            s.i(i);
            if (!zzjzVar.equals(zzjz.BROADCAST_ACTION_UNSPECIFIED)) {
                s.e();
                zzjl.v((zzjl) s.b, zzjzVar);
            }
            return (zzjl) s.c();
        } catch (Throwable unused) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            return null;
        }
    }

    @Nullable
    public static zzjp zzc(int i, zzjz zzjzVar) {
        try {
            zzjn q = zzjp.q();
            q.e();
            zzjp.p((zzjp) q.b, i);
            if (!zzjzVar.equals(zzjz.BROADCAST_ACTION_UNSPECIFIED)) {
                q.e();
                zzjp.s((zzjp) q.b, zzjzVar);
            }
            return (zzjp) q.c();
        } catch (Exception unused) {
            int i2 = com.google.android.gms.internal.play_billing.zzc.a;
            return null;
        }
    }
}
