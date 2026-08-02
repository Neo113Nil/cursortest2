package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.ironsource.U3;
import com.ironsource.Ua;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.vp2;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzauh implements zzatl {
    public final zzaut a;
    public final zzauj b;

    public zzauh(zzaut zzautVar) {
        zzauj zzaujVar = new zzauj();
        this.a = zzautVar;
        this.b = zzaujVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023e A[LOOP:0: B:2:0x000c->B:59:0x023e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0257 A[EDGE_INSN: B:60:0x0257->B:61:0x0257 BREAK  A[LOOP:0: B:2:0x000c->B:59:0x023e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d2  */
    @Override // com.google.android.gms.internal.ads.zzatl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzato zza(zzats zzatsVar) {
        zzato zzatoVar;
        zzauq zzauqVar;
        byte[] bArr;
        Throwable zzatnVar;
        String str;
        int zzo;
        int i;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Object obj = null;
            try {
                zzatb zzk = zzatsVar.zzk();
                if (zzk == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = zzk.b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j = zzk.d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = hashMap;
                }
                zzauqVar = this.a.a(zzatsVar, map);
                try {
                    int i2 = zzauqVar.a;
                    List unmodifiableList = Collections.unmodifiableList(zzauqVar.b);
                    if (i2 == 304) {
                        SystemClock.elapsedRealtime();
                        zzatb zzk2 = zzatsVar.zzk();
                        if (zzk2 == null) {
                            return new zzato(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, null, true, unmodifiableList);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!unmodifiableList.isEmpty()) {
                            Iterator it = unmodifiableList.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzatk) it.next()).a);
                            }
                        }
                        ArrayList arrayList = new ArrayList(unmodifiableList);
                        List list = zzk2.h;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzatk zzatkVar : zzk2.h) {
                                    Object obj2 = obj;
                                    if (!treeSet.contains(zzatkVar.a)) {
                                        arrayList.add(zzatkVar);
                                    }
                                    obj = obj2;
                                }
                            }
                        } else if (!zzk2.g.isEmpty()) {
                            for (Map.Entry entry : zzk2.g.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzatk((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzato(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, zzk2.a, true, arrayList);
                    }
                    try {
                        zzatoVar = null;
                        InputStream inputStream = zzauqVar.d;
                        if (inputStream == null) {
                            inputStream = null;
                        }
                        if (inputStream != null) {
                            int i3 = zzauqVar.c;
                            zzauj zzaujVar = this.b;
                            zzauu zzauuVar = new zzauu(zzaujVar, i3);
                            try {
                                bArr3 = zzaujVar.a(1024);
                                while (true) {
                                    try {
                                        int read = inputStream.read(bArr3);
                                        if (read == -1) {
                                            break;
                                        }
                                        zzauuVar.write(bArr3, 0, read);
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            inputStream.close();
                                            break;
                                        } catch (IOException unused) {
                                            zzaue.a("Error occurred when closing InputStream", new Object[0]);
                                        }
                                        zzaujVar.b(bArr3);
                                        zzauuVar.close();
                                        throw th;
                                    }
                                }
                                byte[] byteArray = zzauuVar.toByteArray();
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                    zzaue.a("Error occurred when closing InputStream", new Object[0]);
                                }
                                zzaujVar.b(bArr3);
                                zzauuVar.close();
                                bArr2 = byteArray;
                            } catch (Throwable th2) {
                                th = th2;
                                bArr3 = null;
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (zzaue.a || elapsedRealtime2 > Ua.C) {
                                zzaue.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzatsVar, Long.valueOf(elapsedRealtime2), bArr2 != null ? Integer.valueOf(bArr2.length) : "null", Integer.valueOf(i2), Integer.valueOf(zzatsVar.zzy().b));
                            }
                            if (i2 < 200 || i2 > 299) {
                                throw new IOException();
                            }
                            SystemClock.elapsedRealtime();
                            return new zzato(i2, bArr2, false, unmodifiableList);
                        } catch (IOException e) {
                            e = e;
                            bArr = bArr2;
                            if (!(e instanceof SocketTimeoutException)) {
                                zzatnVar = new zzaua();
                                str = "socket";
                            } else {
                                if (e instanceof MalformedURLException) {
                                    vp2.e("Bad URL ".concat(String.valueOf(zzatsVar.zzh())), e);
                                    return zzatoVar;
                                }
                                if (zzauqVar == null) {
                                    throw new zzatp(e);
                                }
                                int i4 = zzauqVar.a;
                                zzaue.b("Unexpected response code %d for %s", Integer.valueOf(i4), zzatsVar.zzh());
                                if (bArr != 0) {
                                    List unmodifiableList2 = Collections.unmodifiableList(zzauqVar.b);
                                    SystemClock.elapsedRealtime();
                                    new zzato(i4, bArr, false, unmodifiableList2);
                                    if (i4 != 401 && i4 != 403) {
                                        if (i4 < 400 || i4 > 499) {
                                            throw new zzatz();
                                        }
                                        throw new zzatf();
                                    }
                                    zzatnVar = new zzata();
                                    str = "auth";
                                } else {
                                    zzatnVar = new zzatn();
                                    str = "network";
                                }
                            }
                            zzatg zzy = zzatsVar.zzy();
                            zzo = zzatsVar.zzo();
                            try {
                                i = zzy.b + 1;
                                zzy.b = i;
                                int i5 = zzy.a;
                                zzy.a = i5 + i5;
                                if (i <= 1) {
                                    throw zzatnVar;
                                }
                                zzatsVar.zzc(str + "-retry [timeout=" + zzo + U3.j.e);
                            } catch (zzaub e2) {
                                zzatsVar.zzc(str + "-timeout-giveup [timeout=" + zzo + U3.j.e);
                                throw e2;
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        bArr = zzatoVar;
                        if (!(e instanceof SocketTimeoutException)) {
                        }
                        zzatg zzy2 = zzatsVar.zzy();
                        zzo = zzatsVar.zzo();
                        i = zzy2.b + 1;
                        zzy2.b = i;
                        int i52 = zzy2.a;
                        zzy2.a = i52 + i52;
                        if (i <= 1) {
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                    zzatoVar = null;
                }
            } catch (IOException e5) {
                e = e5;
                zzatoVar = null;
                zzauqVar = null;
                bArr = 0;
            }
            zzatsVar.zzc(str + "-retry [timeout=" + zzo + U3.j.e);
        }
    }
}
