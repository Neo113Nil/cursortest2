package com.google.android.gms.internal.gtm;

import android.net.Uri;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzhs {
    private static zzhs zza;
    private volatile int zzd = 1;
    private volatile String zzc = null;
    private volatile String zzb = null;

    zzhs() {
    }

    @VisibleForTesting
    public static zzhs zza() {
        zzhs zzhsVar;
        synchronized (zzhs.class) {
            try {
                if (zza == null) {
                    zza = new zzhs();
                }
                zzhsVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzhsVar;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzd == 2;
    }

    public final boolean zze(String str) {
        return zzd() && this.zzb.equals(str);
    }

    public final synchronized boolean zzf(String str, Uri uri) {
        try {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+")) {
                    zzhl.zze(decode.length() != 0 ? "Bad preview url: ".concat(decode) : new String("Bad preview url: "));
                    return false;
                }
                String queryParameter = uri.getQueryParameter("id");
                String queryParameter2 = uri.getQueryParameter("gtm_auth");
                String queryParameter3 = uri.getQueryParameter("gtm_preview");
                if (!str.equals(queryParameter)) {
                    zzhl.zze("Preview fails (container doesn't match the container specified by the asset)");
                    return false;
                }
                if (queryParameter == null || queryParameter.length() <= 0) {
                    zzhl.zze(decode.length() != 0 ? "Bad preview url: ".concat(decode) : new String("Bad preview url: "));
                    return false;
                }
                if (queryParameter3 != null && queryParameter3.length() == 0) {
                    if (queryParameter.equals(this.zzb) && this.zzd != 1) {
                        String valueOf = String.valueOf(this.zzb);
                        zzhl.zzd(valueOf.length() != 0 ? "Exit preview mode for container: ".concat(valueOf) : new String("Exit preview mode for container: "));
                        this.zzd = 1;
                        this.zzb = null;
                        this.zzc = null;
                    }
                    zzhl.zze("Error in exiting preview mode. The container is not in preview.");
                    return false;
                }
                if (queryParameter3 == null || queryParameter3.length() <= 0 || queryParameter2 == null || queryParameter2.length() <= 0) {
                    zzhl.zze(decode.length() != 0 ? "Bad preview url: ".concat(decode) : new String("Bad preview url: "));
                    return false;
                }
                this.zzd = 2;
                this.zzc = uri.getQuery();
                this.zzb = queryParameter;
                return true;
            } catch (UnsupportedEncodingException e11) {
                String valueOf2 = String.valueOf(e11);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 32);
                sb2.append("Error decoding the preview url: ");
                sb2.append(valueOf2);
                zzhl.zze(sb2.toString());
                return false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
