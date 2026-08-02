package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzece;
import com.google.android.gms.internal.ads.zzecf;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzax {
    private zzecf zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected String zza = "";

    /* JADX WARN: Multi-variable type inference failed */
    protected static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str2));
        ListenableFuture zzb = new zzbl(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfW)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Interrupted while retrieving a response from: ".concat(valueOf), e);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String.valueOf(str);
            String valueOf2 = String.valueOf(str);
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout while retrieving a response from: ".concat(valueOf2), e2);
            zzb.cancel(true);
            return null;
        } catch (Exception e3) {
            String.valueOf(str);
            String valueOf3 = String.valueOf(str);
            int i3 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving a response from: ".concat(valueOf3), e3);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes(StandardCharsets.UTF_8));
                        openFileOutput.close();
                    } catch (Exception e) {
                        int i2 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final void zza(zzecf zzecfVar) {
        this.zzg = zzecfVar;
    }

    public final zzecf zzb() {
        return this.zzg;
    }

    public final void zzc(Context context) {
        zzecf zzecfVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkB)).booleanValue() || (zzecfVar = this.zzg) == null) {
            return;
        }
        zzecfVar.zzo(new zzau(this, context), zzece.DEBUG_MENU);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzd(Context context, String str, String str2) {
        boolean z;
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfT), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(zzo.trim());
            String optString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkB)).booleanValue()) {
                String str3 = this.zza;
                if (!"0".equals(str3) && !"2".equals(str3)) {
                    z = false;
                    zzj(z);
                    zzg zzo2 = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                    if (!z) {
                        str = "";
                    }
                    zzo2.zzM(str);
                }
                z = true;
                zzj(z);
                zzg zzo22 = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (!z) {
                }
                zzo22.zzM(str);
            }
            synchronized (this.zzb) {
                this.zzd = optString;
            }
            return true;
        } catch (JSONException e) {
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean zze(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfU), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzj(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkB)).booleanValue()) {
                zzg zzo2 = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (true != equals) {
                    str = "";
                }
                zzo2.zzM(str);
            }
            return equals;
        } catch (JSONException e) {
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final void zzf(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzZ(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfS), str, str2));
    }

    public final boolean zzg(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Sending troubleshooting signals to the server.");
        zzh(context, str, str2, str3);
        return true;
    }

    public final void zzh(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzfV), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzO(context, str, buildUpon.build().toString());
    }

    public final String zzi() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzj(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzkB)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(z);
                zzecf zzecfVar = this.zzg;
                if (zzecfVar != null) {
                    zzecfVar.zzb(z);
                }
            }
        }
    }

    public final boolean zzk() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final void zzl(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    protected final void zzn(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzaw(this, context, str, z, z2));
        } else {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
        }
    }
}
