package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public class zzatm implements zzasq {
    protected final zzato zza;
    private final zzatl zzb;

    public zzatm(zzatl zzatlVar) {
        zzato zzatoVar = new zzato(4096);
        this.zzb = zzatlVar;
        this.zza = zzatoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be  */
    @Override // com.google.android.gms.internal.ads.zzasq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzast zza(zzasx zzasxVar) throws zzatg {
        byte[] bArr;
        zzatg zzassVar;
        String str;
        int zzo;
        Map map;
        zzatv zza;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            zzatv zzatvVar = null;
            try {
                zzasg zzk = zzasxVar.zzk();
                if (zzk == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = zzk.zzb;
                    if (str2 != null) {
                        hashMap.put(HttpHeaders.IF_NONE_MATCH, str2);
                    }
                    long j = zzk.zzd;
                    if (j > 0) {
                        hashMap.put(HttpHeaders.IF_MODIFIED_SINCE, zzatu.zzc(j));
                    }
                    map = hashMap;
                }
                zza = this.zzb.zza(zzasxVar, map);
            } catch (IOException e) {
                e = e;
                bArr = null;
            }
            try {
                int zza2 = zza.zza();
                List zzb = zza.zzb();
                if (zza2 == 304) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    zzasg zzk2 = zzasxVar.zzk();
                    if (zzk2 == null) {
                        return new zzast(304, (byte[]) null, true, elapsedRealtime2, zzb);
                    }
                    TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    if (!zzb.isEmpty()) {
                        Iterator it = zzb.iterator();
                        while (it.hasNext()) {
                            treeSet.add(((zzasp) it.next()).zza());
                        }
                    }
                    ArrayList arrayList = new ArrayList(zzb);
                    List list = zzk2.zzh;
                    if (list != null) {
                        if (!list.isEmpty()) {
                            for (zzasp zzaspVar : zzk2.zzh) {
                                if (!treeSet.contains(zzaspVar.zza())) {
                                    arrayList.add(zzaspVar);
                                }
                            }
                        }
                    } else if (!zzk2.zzg.isEmpty()) {
                        for (Map.Entry entry : zzk2.zzg.entrySet()) {
                            if (!treeSet.contains(entry.getKey())) {
                                arrayList.add(new zzasp((String) entry.getKey(), (String) entry.getValue()));
                            }
                        }
                    }
                    return new zzast(304, zzk2.zza, true, elapsedRealtime2, (List) arrayList);
                }
                InputStream zzd = zza.zzd();
                if (zzd != null) {
                    int zzc = zza.zzc();
                    zzato zzatoVar = this.zza;
                    zzatz zzatzVar = new zzatz(zzatoVar, zzc);
                    try {
                        bArr3 = zzatoVar.zza(1024);
                        while (true) {
                            try {
                                int read = zzd.read(bArr3);
                                if (read == -1) {
                                    break;
                                }
                                zzatzVar.write(bArr3, 0, read);
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    zzd.close();
                                    break;
                                } catch (IOException unused) {
                                    zzatj.zza("Error occurred when closing InputStream", new Object[0]);
                                }
                                zzatoVar.zzb(bArr3);
                                zzatzVar.close();
                                throw th;
                            }
                        }
                        bArr2 = zzatzVar.toByteArray();
                        try {
                            zzd.close();
                        } catch (IOException unused2) {
                            zzatj.zza("Error occurred when closing InputStream", new Object[0]);
                        }
                        zzatoVar.zzb(bArr3);
                        zzatzVar.close();
                    } catch (Throwable th2) {
                        th = th2;
                        bArr3 = null;
                    }
                } else {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = bArr2;
                try {
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (zzatj.zzb || elapsedRealtime3 > 3000) {
                        zzatj.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzasxVar, Long.valueOf(elapsedRealtime3), bArr4 != null ? Integer.valueOf(bArr4.length) : AbstractJsonLexerKt.NULL, Integer.valueOf(zza2), Integer.valueOf(zzasxVar.zzy().zzb()));
                    }
                    if (zza2 < 200 || zza2 > 299) {
                        throw new IOException();
                    }
                    return new zzast(zza2, bArr4, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzb);
                } catch (IOException e2) {
                    e = e2;
                    zzatvVar = zza;
                    bArr = bArr4;
                    if (!(e instanceof SocketTimeoutException)) {
                        zzassVar = new zzatf();
                        str = "socket";
                    } else {
                        if (e instanceof MalformedURLException) {
                            String zzh = zzasxVar.zzh();
                            String.valueOf(zzh);
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzh)), e);
                        }
                        if (zzatvVar == null) {
                            throw new zzasu(e);
                        }
                        int zza3 = zzatvVar.zza();
                        zzatj.zzc("Unexpected response code %d for %s", Integer.valueOf(zza3), zzasxVar.zzh());
                        if (bArr != null) {
                            zzast zzastVar = new zzast(zza3, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, zzatvVar.zzb());
                            if (zza3 != 401 && zza3 != 403) {
                                if (zza3 < 400 || zza3 > 499) {
                                    throw new zzate(zzastVar);
                                }
                                throw new zzask(zzastVar);
                            }
                            zzassVar = new zzasf(zzastVar);
                            str = "auth";
                        } else {
                            zzassVar = new zzass();
                            str = "network";
                        }
                    }
                    zzasl zzy = zzasxVar.zzy();
                    zzo = zzasxVar.zzo();
                    try {
                        zzy.zzc(zzassVar);
                        zzasxVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
                    } catch (zzatg e3) {
                        zzasxVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzo)));
                        throw e3;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                bArr = null;
                zzatvVar = zza;
                if (!(e instanceof SocketTimeoutException)) {
                }
                zzasl zzy2 = zzasxVar.zzy();
                zzo = zzasxVar.zzo();
                zzy2.zzc(zzassVar);
                zzasxVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
            }
            zzasxVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(zzo)));
        }
    }
}
