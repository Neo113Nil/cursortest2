package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.fsn;
import defpackage.hsn;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeez {
    public final Context a;
    public final VersionInfoParcel b;
    public final hsn c;
    public final AtomicReference d = new AtomicReference("");

    public zzeez(Context context, VersionInfoParcel versionInfoParcel, hsn hsnVar) {
        this.a = context;
        this.b = versionInfoParcel;
        this.c = hsnVar;
    }

    public static final String c(String str) {
        String str2 = new String(Base64.decode((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.gg), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
        char[] charArray = str3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new String(charArray);
    }

    public final String a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.cg)).booleanValue()) {
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.eg)).isEmpty()) {
                if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.fg)).isEmpty()) {
                    if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.gg)).isEmpty()) {
                        String str = (String) this.d.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.c.execute(new fsn(this, 28));
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final String b() {
        String str;
        VersionInfoParcel versionInfoParcel = this.b;
        String str2 = null;
        if (versionInfoParcel.isClientJar) {
            str = zzclx.class.getName();
        } else {
            try {
                str = (String) new JSONObject(c((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.eg))).get(Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.dg)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().d("SdkIE", e);
                }
                str = null;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return "2";
        }
        try {
            str2 = c((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.fg));
        } catch (IllegalArgumentException e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.dg)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().d("SdkIE", e2);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "3";
        }
        try {
            for (Method method : this.a.getClassLoader().loadClass(str).getDeclaredMethods()) {
                if (method.getName().matches(str2)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return Fc.e;
        } catch (PatternSyntaxException unused4) {
            return CampaignEx.CLICKMODE_ON;
        }
    }
}
