package bo.app;

import com.braze.support.BrazeLogger;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

/* loaded from: classes.dex */
public final class l5 {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f25702o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: p, reason: collision with root package name */
    public static final String f25703p = BrazeLogger.getBrazeLogTag((Class<?>) l5.class);

    /* renamed from: q, reason: collision with root package name */
    public static final h5 f25704q = new h5();

    /* renamed from: a, reason: collision with root package name */
    public final File f25705a;

    /* renamed from: b, reason: collision with root package name */
    public final File f25706b;

    /* renamed from: c, reason: collision with root package name */
    public final File f25707c;

    /* renamed from: d, reason: collision with root package name */
    public final File f25708d;

    /* renamed from: i, reason: collision with root package name */
    public BufferedWriter f25713i;

    /* renamed from: k, reason: collision with root package name */
    public int f25715k;

    /* renamed from: h, reason: collision with root package name */
    public long f25712h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f25714j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f25716l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f25717m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n, reason: collision with root package name */
    public final g5 f25718n = new g5(this);

    /* renamed from: e, reason: collision with root package name */
    public final int f25709e = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f25711g = 1;

    /* renamed from: f, reason: collision with root package name */
    public final long f25710f = 52428800;

    public l5(File file) {
        this.f25705a = file;
        this.f25706b = new File(file, "journal");
        this.f25707c = new File(file, "journal.tmp");
        this.f25708d = new File(file, "journal.bkp");
    }

    public final j5 a(String str) {
        synchronized (this) {
            try {
                if (this.f25713i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                if (!f25702o.matcher(str).matches()) {
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                d7 d7Var = (d7) this.f25714j.get(str);
                if (d7Var == null) {
                    d7Var = new d7(str, this.f25711g, this.f25705a);
                    this.f25714j.put(str, d7Var);
                } else if (d7Var.f25391d != null) {
                    return null;
                }
                j5 j5Var = new j5(this, d7Var);
                d7Var.f25391d = j5Var;
                this.f25713i.write("DIRTY " + str + '\n');
                this.f25713i.flush();
                return j5Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        File file = this.f25707c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f25714j.values().iterator();
        while (it.hasNext()) {
            d7 d7Var = (d7) it.next();
            int i10 = 0;
            if (d7Var.f25391d == null) {
                while (i10 < this.f25711g) {
                    this.f25712h += d7Var.f25389b[i10];
                    i10++;
                }
            } else {
                d7Var.f25391d = null;
                while (i10 < this.f25711g) {
                    File file2 = new File(d7Var.f25393f, d7Var.f25388a + "." + i10);
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    File a10 = d7Var.a(i10);
                    if (a10.exists() && !a10.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void c() {
        lf lfVar = new lf(new FileInputStream(this.f25706b), bh.f25305a);
        try {
            String a10 = lfVar.a();
            String a11 = lfVar.a();
            String a12 = lfVar.a();
            String a13 = lfVar.a();
            String a14 = lfVar.a();
            if (!"libcore.io.DiskLruCache".equals(a10) || !"1".equals(a11) || !Integer.toString(this.f25709e).equals(a12) || !Integer.toString(this.f25711g).equals(a13) || !"".equals(a14)) {
                throw new IOException("unexpected journal header: [" + a10 + ", " + a11 + ", " + a13 + ", " + a14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    c(lfVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f25715k = i10 - this.f25714j.size();
                    if (lfVar.f25736e == -1) {
                        d();
                    } else {
                        this.f25713i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25706b, true), bh.f25305a));
                    }
                    try {
                        lfVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                lfVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final synchronized void d() {
        try {
            BufferedWriter bufferedWriter = this.f25713i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25707c), bh.f25305a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter2.write("1");
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter2.write(Integer.toString(this.f25709e));
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter2.write(Integer.toString(this.f25711g));
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                bufferedWriter2.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                for (d7 d7Var : this.f25714j.values()) {
                    if (d7Var.f25391d != null) {
                        bufferedWriter2.write("DIRTY " + d7Var.f25388a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(d7Var.f25388a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : d7Var.f25389b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f25706b.exists()) {
                    File file = this.f25706b;
                    File file2 = this.f25708d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f25707c.renameTo(this.f25706b)) {
                    throw new IOException();
                }
                this.f25708d.delete();
                this.f25713i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f25706b, true), bh.f25305a));
            } finally {
                try {
                    bufferedWriter2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(j5 j5Var, boolean z10) {
        int i10;
        d7 d7Var = j5Var.f25596a;
        if (d7Var.f25391d == j5Var) {
            if (z10 && !d7Var.f25390c) {
                for (int i11 = 0; i11 < this.f25711g; i11++) {
                    if (j5Var.f25597b[i11]) {
                        if (!d7Var.a(i11).exists()) {
                            j5Var.f25599d.a(j5Var, false);
                            return;
                        }
                    } else {
                        j5Var.f25599d.a(j5Var, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f25711g; i12++) {
                File a10 = d7Var.a(i12);
                if (z10) {
                    if (a10.exists()) {
                        File file = new File(d7Var.f25393f, d7Var.f25388a + "." + i12);
                        a10.renameTo(file);
                        long j10 = d7Var.f25389b[i12];
                        long length = file.length();
                        d7Var.f25389b[i12] = length;
                        this.f25712h = (this.f25712h - j10) + length;
                    }
                } else if (a10.exists() && !a10.delete()) {
                    throw new IOException();
                }
            }
            this.f25715k++;
            d7Var.f25391d = null;
            if (d7Var.f25390c | z10) {
                d7Var.f25390c = true;
                BufferedWriter bufferedWriter = this.f25713i;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(d7Var.f25388a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : d7Var.f25389b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    this.f25716l++;
                }
            } else {
                this.f25714j.remove(d7Var.f25388a);
                this.f25713i.write("REMOVE " + d7Var.f25388a + '\n');
            }
            this.f25713i.flush();
            if (this.f25712h > this.f25710f || ((i10 = this.f25715k) >= 2000 && i10 >= this.f25714j.size())) {
                this.f25717m.submit(this.f25718n);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized k5 b(String str) {
        InputStream inputStream;
        if (this.f25713i != null) {
            if (f25702o.matcher(str).matches()) {
                d7 d7Var = (d7) this.f25714j.get(str);
                if (d7Var == null) {
                    return null;
                }
                if (!d7Var.f25390c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f25711g];
                for (int i10 = 0; i10 < this.f25711g; i10++) {
                    try {
                        inputStreamArr[i10] = new FileInputStream(new File(d7Var.f25393f, d7Var.f25388a + "." + i10));
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.f25711g && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            Charset charset = bh.f25305a;
                            try {
                                inputStream.close();
                            } catch (RuntimeException e10) {
                                throw e10;
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    }
                }
                this.f25715k++;
                this.f25713i.append((CharSequence) ("READ " + str + '\n'));
                int i12 = this.f25715k;
                if (i12 >= 2000 && i12 >= this.f25714j.size()) {
                    this.f25717m.submit(this.f25718n);
                }
                return new k5(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final void c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f25714j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d7 d7Var = (d7) this.f25714j.get(substring);
            if (d7Var == null) {
                d7Var = new d7(substring, this.f25711g, this.f25705a);
                this.f25714j.put(substring, d7Var);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                d7Var.f25390c = true;
                d7Var.f25391d = null;
                if (split.length == d7Var.f25392e) {
                    for (int i11 = 0; i11 < split.length; i11++) {
                        try {
                            d7Var.f25389b[i11] = Long.parseLong(split[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                d7Var.f25391d = new j5(this, d7Var);
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

    public final synchronized void d(String str) {
        try {
            if (this.f25713i != null) {
                if (f25702o.matcher(str).matches()) {
                    d7 d7Var = (d7) this.f25714j.get(str);
                    if (d7Var != null && d7Var.f25391d == null) {
                        for (int i10 = 0; i10 < this.f25711g; i10++) {
                            File file = new File(d7Var.f25393f, d7Var.f25388a + "." + i10);
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.f25712h;
                            long[] jArr = d7Var.f25389b;
                            this.f25712h = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f25715k++;
                        this.f25713i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.f25714j.remove(str);
                        int i11 = this.f25715k;
                        if (i11 >= 2000 && i11 >= this.f25714j.size()) {
                            this.f25717m.submit(this.f25718n);
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    public final synchronized void a() {
        try {
            if (this.f25713i == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f25714j.values());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j5 j5Var = ((d7) obj).f25391d;
                if (j5Var != null) {
                    j5Var.f25599d.a(j5Var, false);
                }
            }
            while (this.f25712h > this.f25710f) {
                d((String) ((Map.Entry) this.f25714j.entrySet().iterator().next()).getKey());
            }
            this.f25713i.close();
            this.f25713i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
