package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzc implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzd[] c;

    public /* synthetic */ zzc(String str, String str2, zzd[] zzdVarArr) {
        this.a = str;
        this.b = str2;
        this.c = zzdVarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final JSONObject jSONObject;
        String str = this.a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final String lowerCase = str.toLowerCase();
        String str2 = this.b;
        if (TextUtils.isEmpty(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.toString();
        int i = 0;
        while (true) {
            zzd[] zzdVarArr = this.c;
            if (i >= zzdVarArr.length) {
                return;
            }
            final zzd zzdVar = zzdVarArr[i];
            FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzb
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(zzd.this.h(lowerCase, jSONObject));
                }
            });
            zzdVar.zza().execute(futureTask);
            try {
            } catch (InterruptedException unused2) {
            } catch (ExecutionException e) {
                e.getCause();
            }
            if (((Boolean) futureTask.get()).booleanValue()) {
                return;
            } else {
                i++;
            }
        }
    }
}
