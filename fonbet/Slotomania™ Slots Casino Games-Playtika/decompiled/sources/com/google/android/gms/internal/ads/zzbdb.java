package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzbdb {
    public static String zza(Context context, String str, List list, Executor executor) throws CertificateEncodingException, PackageManager.NameNotFoundException, InterruptedException, ExecutionException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(ExifInterface.LATITUDE_SOUTH)) {
            return null;
        }
        final zzhcb zze = zzhcb.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbda
            @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhcb zzhcbVar = zzhcb.this;
                if (list2 == null) {
                    zzhcbVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ApkChecksum apkChecksum = (ApkChecksum) list2.get(i);
                        if (apkChecksum.getType() == 8) {
                            zzhcbVar.zza(zzbbo.zza(apkChecksum.getValue()));
                            return;
                        }
                    }
                    zzhcbVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhcbVar.zza((Object) null);
                }
            }
        });
        return (String) zze.get();
    }
}
