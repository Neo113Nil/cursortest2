package defpackage;

import android.os.StrictMode;
import com.ironsource.U3;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k45 implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w35());
    public final v35 n = new v35(this, 0);
    public final int e = 1;
    public final int g = 1;
    public final long f = 262144000;

    public k45(File file) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
    }

    public static void H(File file, File file2, boolean z) {
        if (z) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void e(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void i(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static k45 m(File file) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                H(file2, file3, false);
            }
        }
        k45 k45Var = new k45(file);
        if (k45Var.b.exists()) {
            try {
                k45Var.p();
                k45Var.n();
                return k45Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                k45Var.close();
                jik.a(k45Var.a);
            }
        }
        file.mkdirs();
        k45 k45Var2 = new k45(file);
        k45Var2.C();
        return k45Var2;
    }

    public final synchronized void C() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                e(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), jik.a));
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
                for (z35 z35Var : this.j.values()) {
                    if (z35Var.f != null) {
                        bufferedWriter2.write("DIRTY " + z35Var.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + z35Var.a + z35Var.a() + '\n');
                    }
                }
                e(bufferedWriter2);
                if (this.b.exists()) {
                    H(this.b, this.d, true);
                }
                H(this.c, this.b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), jik.a));
            } catch (Throwable th) {
                e(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void M() {
        while (this.h > this.f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    z35 z35Var = (z35) this.j.get(str);
                    if (z35Var != null && z35Var.f == null) {
                        for (int i = 0; i < this.g; i++) {
                            File file = z35Var.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.h;
                            long[] jArr = z35Var.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) "REMOVE");
                        this.i.append(' ');
                        this.i.append((CharSequence) str);
                        this.i.append('\n');
                        this.j.remove(str);
                        if (k()) {
                            this.m.submit(this.n);
                        }
                    }
                } finally {
                }
            }
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
                en0 en0Var = ((z35) it.next()).f;
                if (en0Var != null) {
                    en0Var.b();
                }
            }
            M();
            e(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(en0 en0Var, boolean z) {
        z35 z35Var = (z35) en0Var.c;
        if (z35Var.f != en0Var) {
            throw new IllegalStateException();
        }
        if (z && !z35Var.e) {
            for (int i = 0; i < this.g; i++) {
                if (!((boolean[]) en0Var.d)[i]) {
                    en0Var.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!z35Var.d[i].exists()) {
                    en0Var.b();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            File file = z35Var.d[i2];
            if (!z) {
                g(file);
            } else if (file.exists()) {
                File file2 = z35Var.c[i2];
                file.renameTo(file2);
                long j = z35Var.b[i2];
                long length = file2.length();
                z35Var.b[i2] = length;
                this.h = (this.h - j) + length;
            }
        }
        this.k++;
        z35Var.f = null;
        if (z35Var.e || z) {
            z35Var.e = true;
            this.i.append((CharSequence) "CLEAN");
            this.i.append(' ');
            this.i.append((CharSequence) z35Var.a);
            this.i.append((CharSequence) z35Var.a());
            this.i.append('\n');
            if (z) {
                this.l++;
            }
        } else {
            this.j.remove(z35Var.a);
            this.i.append((CharSequence) "REMOVE");
            this.i.append(' ');
            this.i.append((CharSequence) z35Var.a);
            this.i.append('\n');
        }
        i(this.i);
        if (this.h > this.f || k()) {
            this.m.submit(this.n);
        }
    }

    public final en0 h(String str) {
        synchronized (this) {
            try {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                z35 z35Var = (z35) this.j.get(str);
                if (z35Var == null) {
                    z35Var = new z35(this, str);
                    this.j.put(str, z35Var);
                } else if (z35Var.f != null) {
                    return null;
                }
                en0 en0Var = new en0(this, z35Var);
                z35Var.f = en0Var;
                this.i.append((CharSequence) "DIRTY");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                i(this.i);
                return en0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized de0 j(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        z35 z35Var = (z35) this.j.get(str);
        if (z35Var == null) {
            return null;
        }
        if (!z35Var.e) {
            return null;
        }
        for (File file : z35Var.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (k()) {
            this.m.submit(this.n);
        }
        return new de0(z35Var.c, 17);
    }

    public final boolean k() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public final void n() {
        g(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            z35 z35Var = (z35) it.next();
            en0 en0Var = z35Var.f;
            int i = this.g;
            int i2 = 0;
            if (en0Var == null) {
                while (i2 < i) {
                    this.h += z35Var.b[i2];
                    i2++;
                }
            } else {
                z35Var.f = null;
                while (i2 < i) {
                    g(z35Var.c[i2]);
                    g(z35Var.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void p() {
        File file = this.b;
        lhi lhiVar = new lhi(new FileInputStream(file), jik.a);
        try {
            String h = lhiVar.h();
            String h2 = lhiVar.h();
            String h3 = lhiVar.h();
            String h4 = lhiVar.h();
            String h5 = lhiVar.h();
            if (!"libcore.io.DiskLruCache".equals(h) || !"1".equals(h2) || !Integer.toString(this.e).equals(h3) || !Integer.toString(this.g).equals(h4) || !"".equals(h5)) {
                throw new IOException("unexpected journal header: [" + h + ", " + h2 + ", " + h4 + ", " + h5 + U3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    t(lhiVar.h());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (lhiVar.e == -1) {
                        C();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), jik.a));
                    }
                    try {
                        lhiVar.close();
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
                lhiVar.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void t(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            is8.e("unexpected journal line: ".concat(str));
            return;
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.j;
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        z35 z35Var = (z35) linkedHashMap.get(substring);
        if (z35Var == null) {
            z35Var = new z35(this, substring);
            linkedHashMap.put(substring, z35Var);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                z35Var.f = new en0(this, z35Var);
                return;
            } else {
                if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                is8.e("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        z35Var.e = true;
        z35Var.f = null;
        if (split.length != z35Var.g.g) {
            pvd.q(Arrays.toString(split), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                z35Var.b[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                pvd.q(Arrays.toString(split), "unexpected journal line: ");
                return;
            }
        }
    }
}
