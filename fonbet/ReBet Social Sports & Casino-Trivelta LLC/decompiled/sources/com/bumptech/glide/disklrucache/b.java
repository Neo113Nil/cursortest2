package com.bumptech.glide.disklrucache;

import android.os.Build;
import android.os.StrictMode;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f29526a;

    /* renamed from: b, reason: collision with root package name */
    public final File f29527b;

    /* renamed from: c, reason: collision with root package name */
    public final File f29528c;

    /* renamed from: d, reason: collision with root package name */
    public final File f29529d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29530e;

    /* renamed from: f, reason: collision with root package name */
    public long f29531f;

    /* renamed from: g, reason: collision with root package name */
    public final int f29532g;

    /* renamed from: i, reason: collision with root package name */
    public Writer f29534i;

    /* renamed from: k, reason: collision with root package name */
    public int f29536k;

    /* renamed from: h, reason: collision with root package name */
    public long f29533h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f29535j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f29537l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f29538m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0466b(null));

    /* renamed from: n, reason: collision with root package name */
    public final Callable f29539n = new a();

    public class a implements Callable {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (b.this) {
                try {
                    if (b.this.f29534i == null) {
                        return null;
                    }
                    b.this.j2();
                    if (b.this.b2()) {
                        b.this.g2();
                        b.this.f29536k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.disklrucache.b$b, reason: collision with other inner class name */
    public static final class ThreadFactoryC0466b implements ThreadFactory {
        public ThreadFactoryC0466b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC0466b(a aVar) {
            this();
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f29541a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f29542b;
        private final boolean[] written;

        public /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            b.this.m1(this, false);
        }

        public void b() {
            if (this.f29542b) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            b.this.m1(this, true);
            this.f29542b = true;
        }

        public File f(int i10) {
            File k10;
            synchronized (b.this) {
                try {
                    if (this.f29541a.f29546c != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f29541a.f29545b) {
                        this.written[i10] = true;
                    }
                    k10 = this.f29541a.k(i10);
                    b.this.f29526a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k10;
        }

        public c(d dVar) {
            this.f29541a = dVar;
            this.written = dVar.f29545b ? null : new boolean[b.this.f29532g];
        }
    }

    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f29544a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f29545b;

        /* renamed from: c, reason: collision with root package name */
        public c f29546c;
        File[] cleanFiles;

        /* renamed from: d, reason: collision with root package name */
        public long f29547d;
        File[] dirtyFiles;
        private final long[] lengths;

        public /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        public File j(int i10) {
            return this.cleanFiles[i10];
        }

        public File k(int i10) {
            return this.dirtyFiles[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.lengths) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public final IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) {
            if (strArr.length != b.this.f29532g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.lengths[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public d(String str) {
            this.f29544a = str;
            this.lengths = new long[b.this.f29532g];
            this.cleanFiles = new File[b.this.f29532g];
            this.dirtyFiles = new File[b.this.f29532g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f29532g; i10++) {
                sb2.append(i10);
                this.cleanFiles[i10] = new File(b.this.f29526a, sb2.toString());
                sb2.append(".tmp");
                this.dirtyFiles[i10] = new File(b.this.f29526a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f29549a;

        /* renamed from: b, reason: collision with root package name */
        public final long f29550b;
        private final File[] files;
        private final long[] lengths;

        public /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.files[i10];
        }

        public e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f29549a = str;
            this.f29550b = j10;
            this.files = fileArr;
            this.lengths = jArr;
        }
    }

    public b(File file, int i10, int i11, long j10) {
        this.f29526a = file;
        this.f29530e = i10;
        this.f29527b = new File(file, "journal");
        this.f29528c = new File(file, "journal.tmp");
        this.f29529d = new File(file, "journal.bkp");
        this.f29532g = i11;
        this.f29531f = j10;
    }

    public static void D0(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void Z1(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static b c2(File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                i2(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f29527b.exists()) {
            try {
                bVar.e2();
                bVar.d2();
                return bVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                bVar.n1();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i10, i11, j10);
        bVar2.g2();
        return bVar2;
    }

    public static void i2(File file, File file2, boolean z10) {
        if (z10) {
            y1(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void y1(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final void A0() {
        if (this.f29534i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public c T1(String str) {
        return Y1(str, -1L);
    }

    public final synchronized c Y1(String str, long j10) {
        A0();
        d dVar = (d) this.f29535j.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f29547d != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f29535j.put(str, dVar);
        } else if (dVar.f29546c != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f29546c = cVar;
        this.f29534i.append((CharSequence) "DIRTY");
        this.f29534i.append(' ');
        this.f29534i.append((CharSequence) str);
        this.f29534i.append('\n');
        Z1(this.f29534i);
        return cVar;
    }

    public synchronized e a2(String str) {
        Throwable th2;
        try {
            try {
                A0();
                d dVar = (d) this.f29535j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f29545b) {
                    return null;
                }
                for (File file : dVar.cleanFiles) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f29536k++;
                this.f29534i.append((CharSequence) "READ");
                this.f29534i.append(' ');
                this.f29534i.append((CharSequence) str);
                this.f29534i.append('\n');
                if (b2()) {
                    this.f29538m.submit(this.f29539n);
                }
                return new e(this, str, dVar.f29547d, dVar.cleanFiles, dVar.lengths, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public final boolean b2() {
        int i10 = this.f29536k;
        return i10 >= 2000 && i10 >= this.f29535j.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f29534i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f29535j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f29546c != null) {
                    dVar.f29546c.a();
                }
            }
            j2();
            D0(this.f29534i);
            this.f29534i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d2() {
        y1(this.f29528c);
        Iterator it = this.f29535j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f29546c == null) {
                while (i10 < this.f29532g) {
                    this.f29533h += dVar.lengths[i10];
                    i10++;
                }
            } else {
                dVar.f29546c = null;
                while (i10 < this.f29532g) {
                    y1(dVar.j(i10));
                    y1(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void e2() {
        com.bumptech.glide.disklrucache.c cVar = new com.bumptech.glide.disklrucache.c(new FileInputStream(this.f29527b), com.bumptech.glide.disklrucache.d.f29557a);
        try {
            String B10 = cVar.B();
            String B11 = cVar.B();
            String B12 = cVar.B();
            String B13 = cVar.B();
            String B14 = cVar.B();
            if (!"libcore.io.DiskLruCache".equals(B10) || !"1".equals(B11) || !Integer.toString(this.f29530e).equals(B12) || !Integer.toString(this.f29532g).equals(B13) || !"".equals(B14)) {
                throw new IOException("unexpected journal header: [" + B10 + ", " + B11 + ", " + B13 + ", " + B14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    f2(cVar.B());
                    i10++;
                } catch (EOFException unused) {
                    this.f29536k = i10 - this.f29535j.size();
                    if (cVar.r()) {
                        g2();
                    } else {
                        this.f29534i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f29527b, true), com.bumptech.glide.disklrucache.d.f29557a));
                    }
                    com.bumptech.glide.disklrucache.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bumptech.glide.disklrucache.d.a(cVar);
            throw th2;
        }
    }

    public final void f2(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i10);
        if (indexOf2 == -1) {
            substring = str.substring(i10);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f29535j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i10, indexOf2);
        }
        d dVar = (d) this.f29535j.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f29535j.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f29545b = true;
            dVar.f29546c = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f29546c = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void g2() {
        try {
            Writer writer = this.f29534i;
            if (writer != null) {
                D0(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f29528c), com.bumptech.glide.disklrucache.d.f29557a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write("1");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.f29530e));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.f29532g));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                for (d dVar : this.f29535j.values()) {
                    if (dVar.f29546c != null) {
                        bufferedWriter.write("DIRTY " + dVar.f29544a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f29544a + dVar.l() + '\n');
                    }
                }
                D0(bufferedWriter);
                if (this.f29527b.exists()) {
                    i2(this.f29527b, this.f29529d, true);
                }
                i2(this.f29528c, this.f29527b, false);
                this.f29529d.delete();
                this.f29534i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f29527b, true), com.bumptech.glide.disklrucache.d.f29557a));
            } catch (Throwable th2) {
                D0(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized boolean h2(String str) {
        try {
            A0();
            d dVar = (d) this.f29535j.get(str);
            if (dVar != null && dVar.f29546c == null) {
                for (int i10 = 0; i10 < this.f29532g; i10++) {
                    File j10 = dVar.j(i10);
                    if (j10.exists() && !j10.delete()) {
                        throw new IOException("failed to delete " + j10);
                    }
                    this.f29533h -= dVar.lengths[i10];
                    dVar.lengths[i10] = 0;
                }
                this.f29536k++;
                this.f29534i.append((CharSequence) "REMOVE");
                this.f29534i.append(' ');
                this.f29534i.append((CharSequence) str);
                this.f29534i.append('\n');
                this.f29535j.remove(str);
                if (b2()) {
                    this.f29538m.submit(this.f29539n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void j2() {
        while (this.f29533h > this.f29531f) {
            h2((String) ((Map.Entry) this.f29535j.entrySet().iterator().next()).getKey());
        }
    }

    public final synchronized void m1(c cVar, boolean z10) {
        d dVar = cVar.f29541a;
        if (dVar.f29546c != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f29545b) {
            for (int i10 = 0; i10 < this.f29532g; i10++) {
                if (!cVar.written[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f29532g; i11++) {
            File k10 = dVar.k(i11);
            if (!z10) {
                y1(k10);
            } else if (k10.exists()) {
                File j10 = dVar.j(i11);
                k10.renameTo(j10);
                long j11 = dVar.lengths[i11];
                long length = j10.length();
                dVar.lengths[i11] = length;
                this.f29533h = (this.f29533h - j11) + length;
            }
        }
        this.f29536k++;
        dVar.f29546c = null;
        if (dVar.f29545b || z10) {
            dVar.f29545b = true;
            this.f29534i.append((CharSequence) "CLEAN");
            this.f29534i.append(' ');
            this.f29534i.append((CharSequence) dVar.f29544a);
            this.f29534i.append((CharSequence) dVar.l());
            this.f29534i.append('\n');
            if (z10) {
                long j12 = this.f29537l;
                this.f29537l = 1 + j12;
                dVar.f29547d = j12;
            }
        } else {
            this.f29535j.remove(dVar.f29544a);
            this.f29534i.append((CharSequence) "REMOVE");
            this.f29534i.append(' ');
            this.f29534i.append((CharSequence) dVar.f29544a);
            this.f29534i.append('\n');
        }
        Z1(this.f29534i);
        if (this.f29533h > this.f29531f || b2()) {
            this.f29538m.submit(this.f29539n);
        }
    }

    public void n1() {
        close();
        com.bumptech.glide.disklrucache.d.b(this.f29526a);
    }
}
