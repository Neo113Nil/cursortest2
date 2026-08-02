package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzedo;
import com.google.android.gms.internal.ads.zzedp;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.ddb;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzax {
    public final Object a = new Object();
    public String b = "";
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public zzedp g;

    public static final String b(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str2));
        ddb zzb = new zzbl(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f6)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(str);
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Interrupted while retrieving a response from: ".concat(valueOf), e);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            String valueOf2 = String.valueOf(str);
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout while retrieving a response from: ".concat(valueOf2), e2);
            zzb.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            int i3 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving a response from: ".concat(valueOf3), e3);
            return null;
        }
    }

    public final void a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzaw(this, context, str, z, z2));
        } else {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
        }
    }

    public final Uri c(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    IOUtils.b(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                } catch (IOException unused) {
                    int i = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error reading from internal storage.");
                    str5 = "";
                }
                this.b = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.b = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String str6 = this.b;
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
            str4 = this.b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final void zza(zzedp zzedpVar) {
        this.g = zzedpVar;
    }

    public final zzedp zzb() {
        return this.g;
    }

    public final void zzc(Context context) {
        zzedp zzedpVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue() || (zzedpVar = this.g) == null) {
            return;
        }
        zzedpVar.e(new zzau(this, context), zzedo.d);
    }

    public final boolean zze(Context context, String str, String str2) {
        String b = b(context, c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.d6), str, str2).toString(), str2);
        if (TextUtils.isEmpty(b)) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(b.trim()).optString("debug_mode"));
            zzj(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue()) {
                zzj g = com.google.android.gms.ads.internal.zzt.zzh().g();
                if (true != equals) {
                    str = "";
                }
                g.zzM(str);
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
        zzs.zzZ(context, c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b6), str, str2));
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
        Uri.Builder buildUpon = c(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.e6), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzO(context, str, buildUpon.build().toString());
    }

    public final String zzi() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(boolean z) {
        synchronized (this.a) {
            try {
                this.e = z;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().g().zzK(z);
                    zzedp zzedpVar = this.g;
                    if (zzedpVar != null) {
                        if (!zzedpVar.u) {
                            if (z) {
                                zzedpVar.j();
                                if (!zzedpVar.s) {
                                    zzedpVar.k();
                                }
                            }
                            if (!zzedpVar.f()) {
                                zzedpVar.l();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzk() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final void zzl(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }
}
