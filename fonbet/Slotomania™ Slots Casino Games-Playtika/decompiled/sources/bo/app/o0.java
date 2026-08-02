package bo.app;

import coil.disk.DiskLruCache;
import com.braze.support.BrazeLogger;
import com.ironsource.X3;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class o0 {
    static final Pattern o = Pattern.compile("[a-z0-9_-]{1,120}");
    private static final String p = BrazeLogger.getBrazeLogTag((Class<?>) o0.class);
    private static final OutputStream q = new b();
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private Writer i;
    private int k;
    private long h = 0;
    private final LinkedHashMap<String, v0> j = new LinkedHashMap<>(0, 0.75f, true);
    private long l = 0;
    final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> n = new a();

    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (o0.this) {
                if (o0.this.i == null) {
                    return null;
                }
                o0.this.i();
                if (o0.this.e()) {
                    o0.this.h();
                    o0.this.k = 0;
                }
                return null;
            }
        }
    }

    class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }

    public final class c {
        private final v0 a;
        private final boolean[] b;
        private boolean c;
        private boolean d;

        private class a extends FilterOutputStream {
            /* synthetic */ a(c cVar, OutputStream outputStream, a aVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            private a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }
        }

        /* synthetic */ c(o0 o0Var, v0 v0Var, a aVar) {
            this(v0Var);
        }

        private c(v0 v0Var) {
            this.a = v0Var;
            this.b = v0Var.c ? null : new boolean[o0.this.g];
        }

        public void b() {
            if (this.c) {
                o0.this.a(this, false);
                o0.this.d(this.a.a);
            } else {
                o0.this.a(this, true);
            }
            this.d = true;
        }

        public OutputStream a(int i) {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i >= 0 && i < o0.this.g) {
                synchronized (o0.this) {
                    v0 v0Var = this.a;
                    if (v0Var.d == this) {
                        if (!v0Var.c) {
                            this.b[i] = true;
                        }
                        File b = v0Var.b(i);
                        try {
                            fileOutputStream = new FileOutputStream(b);
                        } catch (FileNotFoundException unused) {
                            o0.this.a.mkdirs();
                            try {
                                fileOutputStream = new FileOutputStream(b);
                            } catch (FileNotFoundException unused2) {
                                return o0.q;
                            }
                        }
                        aVar = new a(this, fileOutputStream, null);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                return aVar;
            }
            throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + o0.this.g);
        }

        public void a() {
            o0.this.a(this, false);
        }
    }

    public final class d implements Closeable {
        private final String b;
        private final long c;
        private final InputStream[] d;
        private final long[] e;

        /* synthetic */ d(o0 o0Var, String str, long j, InputStream[] inputStreamArr, long[] jArr, a aVar) {
            this(str, j, inputStreamArr, jArr);
        }

        public InputStream a(int i) {
            return this.d[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.d) {
                y6.a(inputStream);
            }
        }

        private d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.b = str;
            this.c = j;
            this.d = inputStreamArr;
            this.e = jArr;
        }
    }

    private o0(File file, int i, int i2, long j) {
        this.a = file;
        this.e = i;
        this.b = new File(file, DiskLruCache.JOURNAL_FILE);
        this.c = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.d = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.g = i2;
        this.f = j;
    }

    private void g() {
        w5 w5Var = new w5(new FileInputStream(this.b), y6.a);
        try {
            String c2 = w5Var.c();
            String c3 = w5Var.c();
            String c4 = w5Var.c();
            String c5 = w5Var.c();
            String c6 = w5Var.c();
            if (!DiskLruCache.MAGIC.equals(c2) || !"1".equals(c3) || !Integer.toString(this.e).equals(c4) || !Integer.toString(this.g).equals(c5) || !"".equals(c6)) {
                throw new IOException("unexpected journal header: [" + c2 + ", " + c3 + ", " + c5 + ", " + c6 + X3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    c(w5Var.c());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (w5Var.b()) {
                        h();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), y6.a));
                    }
                    y6.a(w5Var);
                    return;
                }
            }
        } catch (Throwable th) {
            y6.a(w5Var);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        Writer writer = this.i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), y6.a));
        try {
            bufferedWriter.write(DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (v0 v0Var : this.j.values()) {
                if (v0Var.d != null) {
                    bufferedWriter.write("DIRTY " + v0Var.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + v0Var.a + v0Var.a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.b.exists()) {
                a(this.b, this.d, true);
            }
            a(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), y6.a));
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        while (this.h > this.f) {
            d(this.j.entrySet().iterator().next().getKey());
        }
    }

    private void c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        v0 v0Var = this.j.get(substring);
        if (v0Var == null) {
            v0Var = new v0(substring, this.g, this.a);
            this.j.put(substring, v0Var);
        }
        a aVar = null;
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(ServerSentEventKt.SPACE);
            v0Var.c = true;
            v0Var.d = null;
            v0Var.b(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            v0Var.d = new c(this, v0Var, aVar);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    private void f() {
        a(this.c);
        Iterator<v0> it = this.j.values().iterator();
        while (it.hasNext()) {
            v0 next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.g) {
                    this.h += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.g) {
                    a(next.a(i));
                    a(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public synchronized d b(String str) {
        Throwable th;
        InputStream inputStream;
        try {
            b();
            e(str);
            v0 v0Var = this.j.get(str);
            if (v0Var == null) {
                return null;
            }
            if (!v0Var.c) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.g];
            for (int i = 0; i < this.g; i++) {
                try {
                    try {
                        try {
                            inputStreamArr[i] = new FileInputStream(v0Var.a(i));
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i2 = 0; i2 < this.g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                            y6.a(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
            this.k++;
            this.i.append((CharSequence) ("READ " + str + '\n'));
            if (e()) {
                this.m.submit(this.n);
            }
            return new d(this, str, v0Var.e, inputStreamArr, v0Var.b, null);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public synchronized boolean d(String str) {
        b();
        e(str);
        v0 v0Var = this.j.get(str);
        if (v0Var != null && v0Var.d == null) {
            for (int i = 0; i < this.g; i++) {
                File a2 = v0Var.a(i);
                if (a2.exists() && !a2.delete()) {
                    throw new IOException("failed to delete " + a2);
                }
                long j = this.h;
                long[] jArr = v0Var.b;
                this.h = j - jArr[i];
                jArr[i] = 0;
            }
            this.k++;
            this.i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.j.remove(str);
            if (e()) {
                this.m.submit(this.n);
            }
            return true;
        }
        return false;
    }

    private void e(String str) {
        if (!o.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    public static o0 a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 > 0) {
            File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            o0 o0Var = new o0(file, i, i2, j);
            if (o0Var.b.exists()) {
                try {
                    o0Var.g();
                    o0Var.f();
                    return o0Var;
                } catch (IOException e) {
                    BrazeLogger.w(p, "DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    o0Var.d();
                }
            }
            file.mkdirs();
            o0 o0Var2 = new o0(file, i, i2, j);
            o0Var2.h();
            return o0Var2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public void d() {
        c();
        y6.a(this.a);
    }

    private static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z) {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public synchronized void c() {
        if (this.i == null) {
            return;
        }
        Iterator it = new ArrayList(this.j.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((v0) it.next()).d;
            if (cVar != null) {
                cVar.a();
            }
        }
        i();
        this.i.close();
        this.i = null;
    }

    public c a(String str) {
        return a(str, -1L);
    }

    private synchronized c a(String str, long j) {
        b();
        e(str);
        v0 v0Var = this.j.get(str);
        a aVar = null;
        if (j != -1 && (v0Var == null || v0Var.e != j)) {
            return null;
        }
        if (v0Var == null) {
            v0Var = new v0(str, this.g, this.a);
            this.j.put(str, v0Var);
        } else if (v0Var.d != null) {
            return null;
        }
        c cVar = new c(this, v0Var, aVar);
        v0Var.d = cVar;
        this.i.write("DIRTY " + str + '\n');
        this.i.flush();
        return cVar;
    }

    private void b() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(c cVar, boolean z) {
        v0 v0Var = cVar.a;
        if (v0Var.d == cVar) {
            if (z && !v0Var.c) {
                for (int i = 0; i < this.g; i++) {
                    if (cVar.b[i]) {
                        if (!v0Var.b(i).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.g; i2++) {
                File b2 = v0Var.b(i2);
                if (z) {
                    if (b2.exists()) {
                        File a2 = v0Var.a(i2);
                        b2.renameTo(a2);
                        long j = v0Var.b[i2];
                        long length = a2.length();
                        v0Var.b[i2] = length;
                        this.h = (this.h - j) + length;
                    }
                } else {
                    a(b2);
                }
            }
            this.k++;
            v0Var.d = null;
            if (v0Var.c | z) {
                v0Var.c = true;
                this.i.write("CLEAN " + v0Var.a + v0Var.a() + '\n');
                if (z) {
                    long j2 = this.l;
                    this.l = 1 + j2;
                    v0Var.e = j2;
                }
            } else {
                this.j.remove(v0Var.a);
                this.i.write("REMOVE " + v0Var.a + '\n');
            }
            this.i.flush();
            if (this.h > this.f || e()) {
                this.m.submit(this.n);
            }
            return;
        }
        throw new IllegalStateException();
    }
}
