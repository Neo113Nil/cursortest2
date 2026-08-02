package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzatt implements zzash {
    private final zzats zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzatt(zzats zzatsVar, int i) {
        this.zzc = zzatsVar;
    }

    static byte[] zzg(zzatr zzatrVar, long j) throws IOException {
        long zza = zzatrVar.zza();
        if (j >= 0 && j <= zza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzatrVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(zza).length());
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zza);
        throw new IOException(sb.toString());
    }

    static void zzh(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    static void zzj(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    static long zzk(InputStream inputStream) throws IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static String zzm(zzatr zzatrVar) throws IOException {
        return new String(zzg(zzatrVar, zzk(zzatrVar)), C.UTF8_NAME);
    }

    private final void zzn(String str, zzatq zzatqVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzatqVar.zza - ((zzatq) map.get(str)).zza;
        } else {
            this.zzb += zzatqVar.zza;
        }
        map.put(str, zzatqVar);
    }

    private final void zzo(String str) {
        zzatq zzatqVar = (zzatq) this.zza.remove(str);
        if (zzatqVar != null) {
            this.zzb -= zzatqVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        String valueOf2 = String.valueOf(str.substring(length).hashCode());
        String.valueOf(valueOf);
        String.valueOf(valueOf2);
        return String.valueOf(valueOf).concat(String.valueOf(valueOf2));
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final synchronized zzasg zza(String str) {
        zzatq zzatqVar = (zzatq) this.zza.get(str);
        if (zzatqVar == null) {
            return null;
        }
        File zzf = zzf(str);
        try {
            zzatr zzatrVar = new zzatr(new BufferedInputStream(new FileInputStream(zzf)), zzf.length());
            try {
                String str2 = zzatq.zza(zzatrVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzatj.zzb("%s: key=%s, found=%s", zzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] zzg = zzg(zzatrVar, zzatrVar.zza());
                zzasg zzasgVar = new zzasg();
                zzasgVar.zza = zzg;
                zzasgVar.zzb = zzatqVar.zzc;
                zzasgVar.zzc = zzatqVar.zzd;
                zzasgVar.zzd = zzatqVar.zze;
                zzasgVar.zze = zzatqVar.zzf;
                zzasgVar.zzf = zzatqVar.zzg;
                List<zzasp> list = zzatqVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzasp zzaspVar : list) {
                    treeMap.put(zzaspVar.zza(), zzaspVar.zzb());
                }
                zzasgVar.zzg = treeMap;
                zzasgVar.zzh = Collections.unmodifiableList(list);
                return zzasgVar;
            } finally {
                zzatrVar.close();
            }
        } catch (IOException e) {
            zzatj.zzb("%s: %s", zzf.getAbsolutePath(), e.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final synchronized void zzb(String str, zzasg zzasgVar) {
        float f;
        long j = this.zzb;
        int length = zzasgVar.zza.length;
        long j2 = j + length;
        int i = this.zzd;
        float f2 = 0.9f;
        if (j2 <= i || length <= i * 0.9f) {
            File zzf = zzf(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(AdMobFilesBridge.fileOutputStreamCtor(zzf));
                zzatq zzatqVar = new zzatq(str, zzasgVar);
                try {
                    zzh(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzatqVar.zzb);
                    String str2 = zzatqVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzj(bufferedOutputStream, zzatqVar.zzd);
                    zzj(bufferedOutputStream, zzatqVar.zze);
                    zzj(bufferedOutputStream, zzatqVar.zzf);
                    zzj(bufferedOutputStream, zzatqVar.zzg);
                    List<zzasp> list = zzatqVar.zzh;
                    if (list != null) {
                        zzh(bufferedOutputStream, list.size());
                        for (zzasp zzaspVar : list) {
                            zzl(bufferedOutputStream, zzaspVar.zza());
                            zzl(bufferedOutputStream, zzaspVar.zzb());
                        }
                    } else {
                        zzh(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzasgVar.zza);
                    bufferedOutputStream.close();
                    zzatqVar.zza = zzf.length();
                    zzn(str, zzatqVar);
                    long j3 = this.zzb;
                    int i2 = this.zzd;
                    if (j3 >= i2) {
                        boolean z = zzatj.zzb;
                        if (z) {
                            zzatj.zza("Pruning old cache entries.", new Object[0]);
                        }
                        long j4 = this.zzb;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            zzatq zzatqVar2 = (zzatq) ((Map.Entry) it.next()).getValue();
                            String str3 = zzatqVar2.zzb;
                            if (zzf(str3).delete()) {
                                f = f2;
                                this.zzb -= zzatqVar2.zza;
                            } else {
                                f = f2;
                                zzatj.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i3++;
                            if (this.zzb < i2 * f) {
                                break;
                            } else {
                                f2 = f;
                            }
                        }
                        if (z) {
                            zzatj.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    zzatj.zzb("%s", e.toString());
                    bufferedOutputStream.close();
                    zzatj.zzb("Failed to write header for %s", zzf.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!zzf.delete()) {
                    zzatj.zzb("Could not clean up file %s", zzf.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzatj.zzb("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzc();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final synchronized void zzc() {
        File zza = this.zzc.zza();
        if (zza.exists()) {
            File[] listFiles = zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        zzatr zzatrVar = new zzatr(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzatq zza2 = zzatq.zza(zzatrVar);
                            zza2.zza = length;
                            zzn(zza2.zzb, zza2);
                            zzatrVar.close();
                        } catch (Throwable th) {
                            zzatrVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!zza.mkdirs()) {
            zzatj.zzc("Unable to create cache dir %s", zza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final synchronized void zzd(String str, boolean z) {
        zzasg zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzb(str, zza);
        }
    }

    public final synchronized void zze(String str) {
        boolean delete = zzf(str).delete();
        zzo(str);
        if (delete) {
            return;
        }
        zzatj.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzatt(File file, int i) {
        this.zzc = new zzatp(this, file);
    }
}
