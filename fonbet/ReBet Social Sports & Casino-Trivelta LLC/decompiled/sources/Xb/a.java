package Xb;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
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
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f13671o = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: p, reason: collision with root package name */
    public static final OutputStream f13672p = new b();

    /* renamed from: a, reason: collision with root package name */
    public final File f13673a;

    /* renamed from: b, reason: collision with root package name */
    public final File f13674b;

    /* renamed from: c, reason: collision with root package name */
    public final File f13675c;

    /* renamed from: d, reason: collision with root package name */
    public final File f13676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13677e;

    /* renamed from: f, reason: collision with root package name */
    public long f13678f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13679g;

    /* renamed from: i, reason: collision with root package name */
    public Writer f13681i;

    /* renamed from: k, reason: collision with root package name */
    public int f13683k;

    /* renamed from: h, reason: collision with root package name */
    public long f13680h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f13682j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f13684l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f13685m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n, reason: collision with root package name */
    public final Callable f13686n = new CallableC0282a();

    /* renamed from: Xb.a$a, reason: collision with other inner class name */
    public class CallableC0282a implements Callable {
        public CallableC0282a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f13681i == null) {
                        return null;
                    }
                    a.this.j2();
                    if (a.this.b2()) {
                        a.this.g2();
                        a.this.f13683k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f13688a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f13689b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f13690c;
        private final boolean[] written;

        /* renamed from: Xb.a$c$a, reason: collision with other inner class name */
        public class C0283a extends FilterOutputStream {
            public /* synthetic */ C0283a(c cVar, OutputStream outputStream, CallableC0282a callableC0282a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f13689b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f13689b = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    c.this.f13689b = true;
                }
            }

            public C0283a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    c.this.f13689b = true;
                }
            }
        }

        public /* synthetic */ c(a aVar, d dVar, CallableC0282a callableC0282a) {
            this(dVar);
        }

        public void a() {
            a.this.m1(this, false);
        }

        public void e() {
            if (this.f13689b) {
                a.this.m1(this, false);
                a.this.h2(this.f13688a.f13693a);
            } else {
                a.this.m1(this, true);
            }
            this.f13690c = true;
        }

        public OutputStream f(int i10) {
            FileOutputStream fileOutputStream;
            C0283a c0283a;
            synchronized (a.this) {
                try {
                    if (this.f13688a.f13695c != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f13688a.f13694b) {
                        this.written[i10] = true;
                    }
                    File k10 = this.f13688a.k(i10);
                    try {
                        fileOutputStream = new FileOutputStream(k10);
                    } catch (FileNotFoundException unused) {
                        a.this.f13673a.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(k10);
                        } catch (FileNotFoundException unused2) {
                            return a.f13672p;
                        }
                    }
                    c0283a = new C0283a(this, fileOutputStream, null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c0283a;
        }

        public c(d dVar) {
            this.f13688a = dVar;
            this.written = dVar.f13694b ? null : new boolean[a.this.f13679g];
        }
    }

    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f13693a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f13694b;

        /* renamed from: c, reason: collision with root package name */
        public c f13695c;

        /* renamed from: d, reason: collision with root package name */
        public long f13696d;
        private final long[] lengths;

        public /* synthetic */ d(a aVar, String str, CallableC0282a callableC0282a) {
            this(str);
        }

        public File j(int i10) {
            return new File(a.this.f13673a, this.f13693a + "." + i10);
        }

        public File k(int i10) {
            return new File(a.this.f13673a, this.f13693a + "." + i10 + ".tmp");
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
            if (strArr.length != a.this.f13679g) {
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
            this.f13693a = str;
            this.lengths = new long[a.this.f13679g];
        }
    }

    public final class e implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public final String f13698a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13699b;
        private final InputStream[] ins;
        private final long[] lengths;

        public /* synthetic */ e(a aVar, String str, long j10, InputStream[] inputStreamArr, long[] jArr, CallableC0282a callableC0282a) {
            this(str, j10, inputStreamArr, jArr);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.ins) {
                Xb.c.a(inputStream);
            }
        }

        public InputStream d(int i10) {
            return this.ins[i10];
        }

        public long k(int i10) {
            return this.lengths[i10];
        }

        public e(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f13698a = str;
            this.f13699b = j10;
            this.ins = inputStreamArr;
            this.lengths = jArr;
        }
    }

    public a(File file, int i10, int i11, long j10) {
        this.f13673a = file;
        this.f13677e = i10;
        this.f13674b = new File(file, "journal");
        this.f13675c = new File(file, "journal.tmp");
        this.f13676d = new File(file, "journal.bkp");
        this.f13679g = i11;
        this.f13678f = j10;
    }

    public static a c2(File file, int i10, int i11, long j10) {
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
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f13674b.exists()) {
            try {
                aVar.e2();
                aVar.d2();
                aVar.f13681i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f13674b, true), Xb.c.f13706a));
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.n1();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.g2();
        return aVar2;
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

    public final void D0() {
        if (this.f13681i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public c T1(String str) {
        return Y1(str, -1L);
    }

    public final synchronized c Y1(String str, long j10) {
        D0();
        k2(str);
        d dVar = (d) this.f13682j.get(str);
        CallableC0282a callableC0282a = null;
        if (j10 != -1 && (dVar == null || dVar.f13696d != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0282a);
            this.f13682j.put(str, dVar);
        } else if (dVar.f13695c != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0282a);
        dVar.f13695c = cVar;
        this.f13681i.write("DIRTY " + str + '\n');
        this.f13681i.flush();
        return cVar;
    }

    public synchronized e Z1(String str) {
        Throwable th2;
        InputStream inputStream;
        try {
            D0();
            k2(str);
            d dVar = (d) this.f13682j.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f13694b) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.f13679g];
            for (int i10 = 0; i10 < this.f13679g; i10++) {
                try {
                    try {
                        try {
                            inputStreamArr[i10] = new FileInputStream(dVar.j(i10));
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.f13679g && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            Xb.c.a(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            }
            this.f13683k++;
            this.f13681i.append((CharSequence) ("READ " + str + '\n'));
            if (b2()) {
                this.f13685m.submit(this.f13686n);
            }
            return new e(this, str, dVar.f13696d, inputStreamArr, dVar.lengths, null);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public File a2() {
        return this.f13673a;
    }

    public final boolean b2() {
        int i10 = this.f13683k;
        return i10 >= 2000 && i10 >= this.f13682j.size();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f13681i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f13682j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f13695c != null) {
                    dVar.f13695c.a();
                }
            }
            j2();
            this.f13681i.close();
            this.f13681i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d2() {
        y1(this.f13675c);
        Iterator it = this.f13682j.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f13695c == null) {
                while (i10 < this.f13679g) {
                    this.f13680h += dVar.lengths[i10];
                    i10++;
                }
            } else {
                dVar.f13695c = null;
                while (i10 < this.f13679g) {
                    y1(dVar.j(i10));
                    y1(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void e2() {
        Xb.b bVar = new Xb.b(new FileInputStream(this.f13674b), Xb.c.f13706a);
        try {
            String r10 = bVar.r();
            String r11 = bVar.r();
            String r12 = bVar.r();
            String r13 = bVar.r();
            String r14 = bVar.r();
            if (!"libcore.io.DiskLruCache".equals(r10) || !"1".equals(r11) || !Integer.toString(this.f13677e).equals(r12) || !Integer.toString(this.f13679g).equals(r13) || !"".equals(r14)) {
                throw new IOException("unexpected journal header: [" + r10 + ", " + r11 + ", " + r13 + ", " + r14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    f2(bVar.r());
                    i10++;
                } catch (EOFException unused) {
                    this.f13683k = i10 - this.f13682j.size();
                    Xb.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            Xb.c.a(bVar);
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
                this.f13682j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i10, indexOf2);
        }
        d dVar = (d) this.f13682j.get(substring);
        CallableC0282a callableC0282a = null;
        if (dVar == null) {
            dVar = new d(this, substring, callableC0282a);
            this.f13682j.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f13694b = true;
            dVar.f13695c = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f13695c = new c(this, dVar, callableC0282a);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void g2() {
        try {
            Writer writer = this.f13681i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13675c), Xb.c.f13706a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write("1");
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.f13677e));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(Integer.toString(this.f13679g));
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                for (d dVar : this.f13682j.values()) {
                    if (dVar.f13695c != null) {
                        bufferedWriter.write("DIRTY " + dVar.f13693a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f13693a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f13674b.exists()) {
                    i2(this.f13674b, this.f13676d, true);
                }
                i2(this.f13675c, this.f13674b, false);
                this.f13676d.delete();
                this.f13681i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13674b, true), Xb.c.f13706a));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized boolean h2(String str) {
        try {
            D0();
            k2(str);
            d dVar = (d) this.f13682j.get(str);
            if (dVar != null && dVar.f13695c == null) {
                for (int i10 = 0; i10 < this.f13679g; i10++) {
                    File j10 = dVar.j(i10);
                    if (j10.exists() && !j10.delete()) {
                        throw new IOException("failed to delete " + j10);
                    }
                    this.f13680h -= dVar.lengths[i10];
                    dVar.lengths[i10] = 0;
                }
                this.f13683k++;
                this.f13681i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f13682j.remove(str);
                if (b2()) {
                    this.f13685m.submit(this.f13686n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void j2() {
        while (this.f13680h > this.f13678f) {
            h2((String) ((Map.Entry) this.f13682j.entrySet().iterator().next()).getKey());
        }
    }

    public final void k2(String str) {
        if (f13671o.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    public final synchronized void m1(c cVar, boolean z10) {
        d dVar = cVar.f13688a;
        if (dVar.f13695c != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f13694b) {
            for (int i10 = 0; i10 < this.f13679g; i10++) {
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
        for (int i11 = 0; i11 < this.f13679g; i11++) {
            File k10 = dVar.k(i11);
            if (!z10) {
                y1(k10);
            } else if (k10.exists()) {
                File j10 = dVar.j(i11);
                k10.renameTo(j10);
                long j11 = dVar.lengths[i11];
                long length = j10.length();
                dVar.lengths[i11] = length;
                this.f13680h = (this.f13680h - j11) + length;
            }
        }
        this.f13683k++;
        dVar.f13695c = null;
        if (dVar.f13694b || z10) {
            dVar.f13694b = true;
            this.f13681i.write("CLEAN " + dVar.f13693a + dVar.l() + '\n');
            if (z10) {
                long j12 = this.f13684l;
                this.f13684l = 1 + j12;
                dVar.f13696d = j12;
            }
        } else {
            this.f13682j.remove(dVar.f13693a);
            this.f13681i.write("REMOVE " + dVar.f13693a + '\n');
        }
        this.f13681i.flush();
        if (this.f13680h > this.f13678f || b2()) {
            this.f13685m.submit(this.f13686n);
        }
    }

    public void n1() {
        close();
        Xb.c.b(this.f13673a);
    }

    public static class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i10) {
        }
    }
}
