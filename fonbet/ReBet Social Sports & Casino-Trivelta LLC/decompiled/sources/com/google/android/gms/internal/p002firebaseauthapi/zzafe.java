package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import eb.C4196f;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import ub.i;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class zzafe {
    private Context zza;
    private zzafx zzb;
    private String zzc;
    private final C4196f zzd;
    private boolean zze;
    private String zzf;

    public zzafe(C4196f c4196f, String str) {
        this(c4196f.l(), c4196f, str);
    }

    private static String zza(C4196f c4196f) {
        b.a(FirebaseAuth.getInstance(c4196f).w0().get());
        return null;
    }

    private static String zzb(C4196f c4196f) {
        i iVar = (i) FirebaseAuth.getInstance(c4196f).z0().get();
        if (iVar != null) {
            try {
                return (String) Tasks.await(iVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e10.getMessage());
            }
        }
        return null;
    }

    public zzafe(Context context, C4196f c4196f, String str) {
        this.zze = false;
        this.zza = (Context) AbstractC3191o.m(context);
        this.zzd = (C4196f) AbstractC3191o.m(c4196f);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        if (this.zze) {
            str = this.zzc + "/FirebaseUI-Android";
        } else {
            str = this.zzc + "/FirebaseCore-Android";
        }
        if (this.zzb == null) {
            this.zzb = new zzafx(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty(Constants.ACCEPT_LANGUAGE, zzafd.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.q().c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
