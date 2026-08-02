package com.google.android.gms.ads.identifier;

import com.google.android.gms.internal.ads_identifier.zzk;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@18.2.0 */
/* loaded from: classes12.dex */
public final class zze {
    public static final void zza(String str) {
        try {
            zzk.zzb(263);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                if (httpURLConnection.getResponseCode() >= 200) {
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        } catch (IOException | RuntimeException e2) {
            e2.getMessage();
        } finally {
            zzk.zza();
        }
    }
}
