package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbbz extends zzbcy {
    private static final zzbcz zzh = new zzbcz();
    private final zzawy zzi;
    private final Context zzj;
    private final zzazf zzk;

    public zzbbz(zzbbl zzbblVar, String str, String str2, zzaxf zzaxfVar, int i, int i2, Context context, zzawr zzawrVar, zzawy zzawyVar, zzazf zzazfVar) {
        super(zzbblVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", zzaxfVar, i, 27);
        this.zzj = context;
        this.zzi = zzawyVar;
        this.zzk = zzazfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzazc zzc() throws IllegalAccessException, InvocationTargetException {
        String str;
        zzbhv zzbhvVar = zzbie.zzdE;
        int zzb = (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue() <= 0 || ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue() >= this.zzi.zzb()) ? this.zzi.zzb() : ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue();
        zzazc zzazcVar = new zzazc((String) this.zze.invoke(null, this.zzj, false, ""));
        zzazf zzazfVar = this.zzk;
        if (zzazfVar != null && zzazfVar.zza() != null) {
            try {
                str = (String) zzazfVar.zza().get(zzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
            zzazcVar.zza = str;
            return zzazcVar;
        }
        str = ExifInterface.LONGITUDE_EAST;
        zzazcVar.zza = str;
        return zzazcVar;
    }

    private final String zzd() {
        try {
            zzbbl zzbblVar = this.zza;
            if (zzbblVar.zzm() != null) {
                zzbblVar.zzm().get();
            }
            zzayf zzl = zzbblVar.zzl();
            if (zzl == null || !zzl.zza()) {
                return null;
            }
            return zzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcy
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzazc zzazcVar;
        zzazc zzazcVar2;
        zzbcz zzbczVar = zzh;
        Context context = this.zzj;
        AtomicReference zza = zzbczVar.zza(context.getPackageName());
        synchronized (zza) {
            zzazc zzazcVar3 = (zzazc) zza.get();
            if (zzazcVar3 == null || zzbbo.zzc(zzazcVar3.zza) || zzazcVar3.zza.equals(ExifInterface.LONGITUDE_EAST) || zzazcVar3.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                boolean z = false;
                if (zzbbo.zzc(null)) {
                    (!zzbbo.zzc(null) ? false : false).booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                if (this.zzk != null) {
                    zzazcVar = zzc();
                } else {
                    if (i == 3 && !this.zzi.zza()) {
                        z = true;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdq);
                    String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdp)).booleanValue() ? zzb() : null;
                    if (bool.booleanValue() && this.zza.zzi() && zzbbo.zzc(zzb)) {
                        zzb = zzd();
                    }
                    zzazc zzazcVar4 = new zzazc((String) this.zze.invoke(null, context, valueOf, zzb));
                    String str = zzazcVar4.zza;
                    if (zzbbo.zzc(str) || str.equals(ExifInterface.LONGITUDE_EAST)) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String zzd = zzd();
                            if (!zzbbo.zzc(zzd)) {
                                zzazcVar4.zza = zzd;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    zzazcVar = zzazcVar4;
                }
                zza.set(zzazcVar);
            }
            zzazcVar2 = (zzazc) zza.get();
        }
        zzaxf zzaxfVar = this.zzd;
        synchronized (zzaxfVar) {
            if (zzazcVar2 != null) {
                zzaxfVar.zzo(zzazcVar2.zza);
                zzaxfVar.zzu(zzazcVar2.zzb);
                zzaxfVar.zzt(zzazcVar2.zzc);
                zzaxfVar.zzD(zzazcVar2.zzd);
                zzaxfVar.zzE(zzazcVar2.zze);
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] zzb = zzbbo.zzb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdr));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzbbo.zzb((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzds)))));
            }
            Context context = this.zzj;
            return zzbdb.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
