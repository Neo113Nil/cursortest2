package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import defpackage.cpn;
import defpackage.ddb;
import defpackage.dpn;
import defpackage.epn;
import defpackage.f2n;
import defpackage.hsn;
import defpackage.x5n;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbsg implements zzatl {
    public volatile zzbrt a;
    public final Context b;

    public zzbsg(Context context) {
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    @Override // com.google.android.gms.internal.ads.zzatl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzato zza(zzats zzatsVar) {
        SafeParcelable safeParcelable;
        zzbrw zzbrwVar;
        Parcelable.Creator<zzbru> creator = zzbru.CREATOR;
        Map zzm = zzatsVar.zzm();
        int size = zzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : zzm.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzbru zzbruVar = new zzbru(zzatsVar.zzh(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcgo zzcgoVar = new zzcgo();
            this.a = new zzbrt(166, zzccf.a(this.b), com.google.android.gms.ads.internal.zzt.zzs().zza(), new dpn(this, zzcgoVar), new epn(this, zzcgoVar));
            this.a.checkAvailabilityAndConnect();
            cpn cpnVar = new cpn(this, zzbruVar);
            hsn hsnVar = zzcgj.a;
            ddb g = zzhcy.g(zzhcy.h(zzcgoVar, cpnVar, hsnVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A5)).intValue(), TimeUnit.MILLISECONDS, zzcgj.d);
            g.addListener(new f2n(this, 23), hsnVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) g.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder(x5n.f(32, elapsedRealtime2));
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            zzcbt zzcbtVar = new zzcbt(parcelFileDescriptor);
            Parcelable.Creator<zzbrw> creator2 = zzbrw.CREATOR;
            if (zzcbtVar.c) {
                if (zzcbtVar.a == null) {
                    zzo.zzf("File descriptor is empty, returning null.");
                } else {
                    DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(zzcbtVar.a));
                    try {
                        try {
                            int readInt = dataInputStream.readInt();
                            byte[] bArr = new byte[readInt];
                            dataInputStream.readFully(bArr, 0, readInt);
                            IOUtils.a(dataInputStream);
                            Parcel obtain = Parcel.obtain();
                            try {
                                obtain.unmarshall(bArr, 0, readInt);
                                obtain.setDataPosition(0);
                                zzcbtVar.b = creator2.createFromParcel(obtain);
                                obtain.recycle();
                                zzcbtVar.c = false;
                            } catch (Throwable th) {
                                obtain.recycle();
                                throw th;
                            }
                        } catch (IOException e) {
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzg("Could not read from parcel file descriptor", e);
                            IOUtils.a(dataInputStream);
                        }
                    } catch (Throwable th2) {
                        IOUtils.a(dataInputStream);
                        throw th2;
                    }
                }
                safeParcelable = null;
                zzbrwVar = (zzbrw) safeParcelable;
                if (zzbrwVar != null) {
                    return null;
                }
                if (zzbrwVar.a) {
                    throw new zzaub(zzbrwVar.b);
                }
                String[] strArr3 = zzbrwVar.e;
                String[] strArr4 = zzbrwVar.f;
                if (strArr3.length != strArr4.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                for (int i3 = 0; i3 < strArr3.length; i3++) {
                    hashMap.put(strArr3[i3], strArr4[i3]);
                }
                return new zzato(zzbrwVar.c, zzbrwVar.d, hashMap, zzato.a(hashMap), zzbrwVar.g);
            }
            safeParcelable = (SafeParcelable) zzcbtVar.b;
            zzbrwVar = (zzbrw) safeParcelable;
            if (zzbrwVar != null) {
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(x5n.f(32, elapsedRealtime3));
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th3) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            StringBuilder sb3 = new StringBuilder(x5n.f(32, elapsedRealtime4));
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th3;
        }
    }
}
