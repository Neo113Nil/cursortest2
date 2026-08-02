package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a70;
import defpackage.akn;
import defpackage.c0l;
import defpackage.d1l;
import defpackage.fn0;
import defpackage.sb2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzauo implements zzatc {
    public final zzaun c;
    public final LinkedHashMap a = new LinkedHashMap(16, 0.75f, true);
    public long b = 0;
    public final int d = 5242880;

    public zzauo(File file) {
        this.c = new d1l(6, this, file);
    }

    public static byte[] e(sb2 sb2Var, long j) {
        long j2 = sb2Var.b - sb2Var.c;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(sb2Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 33 + String.valueOf(j2).length());
        fn0.t(j, "streamToBytes length=", ", maxLength=", sb);
        sb.append(j2);
        throw new IOException(sb.toString());
    }

    public static void f(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static int g(InputStream inputStream) {
        return (m(inputStream) << 24) | m(inputStream) | (m(inputStream) << 8) | (m(inputStream) << 16);
    }

    public static void h(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static long i(InputStream inputStream) {
        return (m(inputStream) & 255) | ((m(inputStream) & 255) << 8) | ((m(inputStream) & 255) << 16) | ((m(inputStream) & 255) << 24) | ((m(inputStream) & 255) << 32) | ((m(inputStream) & 255) << 40) | ((m(inputStream) & 255) << 48) | ((m(inputStream) & 255) << 56);
    }

    public static void j(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        int length = bytes.length;
        h(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static String k(sb2 sb2Var) {
        return new String(e(sb2Var, i(sb2Var)), C.UTF8_NAME);
    }

    public static int m(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        a70.q();
        return 0;
    }

    public static final String n(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public final synchronized zzatb a(String str) {
        akn aknVar = (akn) this.a.get(str);
        if (aknVar == null) {
            return null;
        }
        File d = d(str);
        try {
            sb2 sb2Var = new sb2(new BufferedInputStream(new FileInputStream(d)), d.length());
            try {
                String str2 = akn.a(sb2Var).b;
                if (!TextUtils.equals(str, str2)) {
                    zzaue.b("%s: key=%s, found=%s", d.getAbsolutePath(), str, str2);
                    akn aknVar2 = (akn) this.a.remove(str);
                    if (aknVar2 != null) {
                        this.b -= aknVar2.a;
                    }
                    return null;
                }
                byte[] e = e(sb2Var, sb2Var.b - sb2Var.c);
                zzatb zzatbVar = new zzatb();
                zzatbVar.a = e;
                zzatbVar.b = aknVar.c;
                zzatbVar.c = aknVar.d;
                zzatbVar.d = aknVar.e;
                zzatbVar.e = aknVar.f;
                zzatbVar.f = aknVar.g;
                List<zzatk> list = aknVar.h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzatk zzatkVar : list) {
                    treeMap.put(zzatkVar.a, zzatkVar.b);
                }
                zzatbVar.g = treeMap;
                zzatbVar.h = Collections.unmodifiableList(list);
                return zzatbVar;
            } finally {
                sb2Var.close();
            }
        } catch (IOException e2) {
            zzaue.b("%s: %s", d.getAbsolutePath(), e2.toString());
            synchronized (this) {
                boolean delete = d(str).delete();
                akn aknVar3 = (akn) this.a.remove(str);
                if (aknVar3 != null) {
                    this.b -= aknVar3.a;
                }
                if (!delete) {
                    zzaue.b("Could not delete cache entry for key=%s, filename=%s", str, n(str));
                }
                return null;
            }
        }
    }

    public final synchronized void b(String str, zzatb zzatbVar) {
        float f;
        try {
            long j = this.b;
            int length = zzatbVar.a.length;
            long j2 = j + length;
            int i = this.d;
            float f2 = 0.9f;
            if (j2 <= i || length <= i * 0.9f) {
                File d = d(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
                    akn aknVar = new akn(str, zzatbVar);
                    try {
                        f(bufferedOutputStream, 538247942);
                        j(bufferedOutputStream, str);
                        String str2 = aknVar.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        j(bufferedOutputStream, str2);
                        h(bufferedOutputStream, aknVar.d);
                        h(bufferedOutputStream, aknVar.e);
                        h(bufferedOutputStream, aknVar.f);
                        h(bufferedOutputStream, aknVar.g);
                        List<zzatk> list = aknVar.h;
                        if (list != null) {
                            f(bufferedOutputStream, list.size());
                            for (zzatk zzatkVar : list) {
                                j(bufferedOutputStream, zzatkVar.a);
                                j(bufferedOutputStream, zzatkVar.b);
                            }
                        } else {
                            f(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzatbVar.a);
                        bufferedOutputStream.close();
                        aknVar.a = d.length();
                        l(str, aknVar);
                        long j3 = this.b;
                        int i2 = this.d;
                        if (j3 >= i2) {
                            boolean z = zzaue.a;
                            if (z) {
                                zzaue.a("Pruning old cache entries.", new Object[0]);
                            }
                            long j4 = this.b;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.a.entrySet().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                akn aknVar2 = (akn) ((Map.Entry) it.next()).getValue();
                                String str3 = aknVar2.b;
                                if (d(str3).delete()) {
                                    f = f2;
                                    this.b -= aknVar2.a;
                                } else {
                                    f = f2;
                                    zzaue.b("Could not delete cache entry for key=%s, filename=%s", str3, n(str3));
                                }
                                it.remove();
                                i3++;
                                if (this.b < i2 * f) {
                                    break;
                                } else {
                                    f2 = f;
                                }
                            }
                            if (z) {
                                zzaue.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.b - j4), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzaue.b("%s", e.toString());
                        bufferedOutputStream.close();
                        zzaue.b("Failed to write header for %s", d.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!d.delete()) {
                        zzaue.b("Could not clean up file %s", d.getAbsolutePath());
                    }
                    if (!this.c.mo16zza().exists()) {
                        zzaue.b("Re-initializing cache after external clearing.", new Object[0]);
                        this.a.clear();
                        this.b = 0L;
                        c();
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void c() {
        File mo16zza = this.c.mo16zza();
        if (mo16zza.exists()) {
            File[] listFiles = mo16zza.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    try {
                        long length = file.length();
                        sb2 sb2Var = new sb2(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            akn a = akn.a(sb2Var);
                            a.a = length;
                            l(a.b, a);
                            sb2Var.close();
                        } catch (Throwable th) {
                            sb2Var.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!mo16zza.mkdirs()) {
            zzaue.b("Unable to create cache dir %s", mo16zza.getAbsolutePath());
        }
    }

    public final File d(String str) {
        return new File(this.c.mo16zza(), n(str));
    }

    public final void l(String str, akn aknVar) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(str)) {
            this.b = (aknVar.a - ((akn) linkedHashMap.get(str)).a) + this.b;
        } else {
            this.b += aknVar.a;
        }
        linkedHashMap.put(str, aknVar);
    }

    public zzauo(c0l c0lVar) {
        this.c = c0lVar;
    }
}
