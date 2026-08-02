package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.X3;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes12.dex */
public final class g implements Closeable {
    public static final Pattern p = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final b q = new b();
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter i;
    public int k;
    public f l;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long m = 0;
    public final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final a o = new a(this);
    public final int e = 0;
    public final int g = 1;

    public g(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static void a(g gVar, d dVar, boolean z) {
        int i;
        synchronized (gVar) {
            e eVar = dVar.a;
            if (eVar.d != dVar) {
                throw new IllegalStateException();
            }
            if (z && !eVar.c) {
                for (int i2 = 0; i2 < gVar.g; i2++) {
                    if (!dVar.b[i2]) {
                        a(dVar.d, dVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!eVar.b(i2).exists()) {
                        a(dVar.d, dVar, false);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < gVar.g; i3++) {
                File b = eVar.b(i3);
                if (!z) {
                    a(b);
                } else if (b.exists()) {
                    File a = eVar.a(i3);
                    b.renameTo(a);
                    long j = eVar.b[i3];
                    long length = a.length();
                    eVar.b[i3] = length;
                    gVar.h = (gVar.h - j) + length;
                }
            }
            gVar.k++;
            eVar.d = null;
            if (eVar.c || z) {
                eVar.c = true;
                BufferedWriter bufferedWriter = gVar.i;
                StringBuilder sb = new StringBuilder("CLEAN ");
                sb.append(eVar.a);
                StringBuilder sb2 = new StringBuilder();
                for (long j2 : eVar.b) {
                    sb2.append(' ');
                    sb2.append(j2);
                }
                sb.append(sb2.toString());
                sb.append('\n');
                bufferedWriter.write(sb.toString());
                if (z) {
                    gVar.m++;
                }
            } else {
                gVar.j.remove(eVar.a);
                gVar.i.write("REMOVE " + eVar.a + '\n');
            }
            gVar.i.flush();
            if (gVar.h > gVar.f || ((i = gVar.k) >= 2000 && i >= gVar.j.size())) {
                gVar.n.submit(gVar.o);
            }
        }
    }

    public final void b() {
        FileInputStream fileInputStream = new FileInputStream(this.b);
        Charset charset = l.a;
        k kVar = new k(fileInputStream);
        try {
            String a = kVar.a();
            String a2 = kVar.a();
            String a3 = kVar.a();
            String a4 = kVar.a();
            String a5 = kVar.a();
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.e).equals(a3) || !Integer.toString(this.g).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    b(kVar.a());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (kVar.e == -1) {
                        c();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), l.a));
                    }
                    try {
                        kVar.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                kVar.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), l.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (e eVar : this.j.values()) {
                    if (eVar.d != null) {
                        bufferedWriter2.write("DIRTY " + eVar.a + '\n');
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEAN ");
                        sb.append(eVar.a);
                        StringBuilder sb2 = new StringBuilder();
                        for (long j : eVar.b) {
                            sb2.append(' ');
                            sb2.append(j);
                        }
                        sb.append(sb2.toString());
                        sb.append('\n');
                        bufferedWriter2.write(sb.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.b.exists()) {
                    File file = this.b;
                    File file2 = this.d;
                    a(file2);
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.c.renameTo(this.b)) {
                    throw new IOException();
                }
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), l.a));
            } catch (Throwable th) {
                bufferedWriter2.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                d dVar = ((e) it.next()).d;
                if (dVar != null) {
                    a(dVar.d, dVar, false);
                }
            }
            d();
            this.i.close();
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        while (this.h > this.f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            f fVar = this.l;
            if (fVar == null) {
                c(str);
            } else if (fVar.a(str)) {
                c(str);
            } else {
                boolean z = false;
                for (String str2 : this.j.keySet()) {
                    if (this.l.a(str2)) {
                        z |= c(str2);
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    public final void b(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE)) {
                    this.j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            e eVar = (e) this.j.get(substring);
            if (eVar == null) {
                eVar = new e(this, substring);
                this.j.put(substring, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                eVar.c = true;
                eVar.d = null;
                if (split.length == eVar.e.g) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            eVar.b[i2] = Long.parseLong(split[i2]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                eVar.d = new d(this, eVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized boolean c(String str) {
        try {
            IAlog.e("DiskLruCache remove %s", str);
            if (this.i != null) {
                if (p.matcher(str).matches()) {
                    e eVar = (e) this.j.get(str);
                    if (eVar != null && eVar.d == null) {
                        for (int i = 0; i < this.g; i++) {
                            File a = eVar.a(i);
                            if (a.exists() && !a.delete()) {
                                throw new IOException("failed to delete " + a);
                            }
                            long j = this.h;
                            long[] jArr = eVar.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.j.remove(str);
                        int i2 = this.k;
                        if (i2 >= 2000 && i2 >= this.j.size()) {
                            this.n.submit(this.o);
                        }
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    public static g a(File file, long j) {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            g gVar = new g(file, j);
            if (gVar.b.exists()) {
                try {
                    gVar.b();
                    gVar.a();
                    return gVar;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    IAlog.e("DiskLruCache delete cache", new Object[0]);
                    gVar.close();
                    l.a(gVar.a);
                }
            }
            file.mkdirs();
            g gVar2 = new g(file, j);
            gVar2.c();
            return gVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void a() {
        a(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i = 0;
            if (eVar.d == null) {
                while (i < this.g) {
                    this.h += eVar.b[i];
                    i++;
                }
            } else {
                eVar.d = null;
                while (i < this.g) {
                    a(eVar.a(i));
                    a(eVar.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public static void a(File file) {
        IAlog.e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final d a(String str) {
        synchronized (this) {
            try {
                if (this.i != null) {
                    if (p.matcher(str).matches()) {
                        e eVar = (e) this.j.get(str);
                        if (eVar == null) {
                            eVar = new e(this, str);
                            this.j.put(str, eVar);
                        } else if (eVar.d != null) {
                            return null;
                        }
                        d dVar = new d(this, eVar);
                        eVar.d = dVar;
                        this.i.write("DIRTY " + str + '\n');
                        this.i.flush();
                        return dVar;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
