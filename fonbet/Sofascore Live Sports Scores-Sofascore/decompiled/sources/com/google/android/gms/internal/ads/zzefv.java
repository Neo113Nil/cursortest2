package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzefv implements zzinw {
    public final zzddg a;

    public zzefv(zzddg zzddgVar) {
        this.a = zzddgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zziol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() {
        String valueOf;
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.a.a().d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r8)).booleanValue()) {
            String str = zzmVar.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    valueOf = new JSONObject(str).getString("request_id");
                } catch (JSONException unused) {
                }
            }
            com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
            if (zzcVar != null) {
                try {
                    valueOf = new JSONObject(zzcVar.zza).getString("request_id");
                } catch (JSONException unused2) {
                }
            }
        }
        valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzay.zzh().nextInt() & Integer.MAX_VALUE);
        zzioe.a(valueOf);
        return valueOf;
    }
}
