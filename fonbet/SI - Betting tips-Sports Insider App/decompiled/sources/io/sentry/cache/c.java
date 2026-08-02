package io.sentry.cache;

import com.google.android.material.color.utilities.h;
import io.sentry.ILogger;
import io.sentry.a5;
import io.sentry.android.core.j1;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.g1;
import io.sentry.h0;
import io.sentry.hints.i;
import io.sentry.hints.j;
import io.sentry.j4;
import io.sentry.k6;
import io.sentry.l6;
import io.sentry.m4;
import io.sentry.r;
import io.sentry.r4;
import io.sentry.x6;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import k2.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class c implements d {

    /* renamed from: i, reason: collision with root package name */
    public static final Charset f16240i = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final b6 f16241a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.f f16242b = new io.sentry.util.f(new io.sentry.android.core.internal.gestures.c(4, this));

    /* renamed from: c, reason: collision with root package name */
    public final File f16243c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16244d;

    /* renamed from: e, reason: collision with root package name */
    public final CountDownLatch f16245e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f16246f;

    /* renamed from: g, reason: collision with root package name */
    public final io.sentry.util.a f16247g;

    /* renamed from: h, reason: collision with root package name */
    public final io.sentry.util.a f16248h;

    public c(b6 b6Var, String str, int i5) {
        y4.a.C(b6Var, "SentryOptions is required.");
        this.f16241a = b6Var;
        this.f16243c = new File(str);
        this.f16244d = i5;
        this.f16246f = new WeakHashMap();
        this.f16247g = new io.sentry.util.a();
        this.f16248h = new io.sentry.util.a();
        this.f16245e = new CountDownLatch(1);
    }

    public final File[] a() {
        File file = this.f16243c;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] listFiles = file.listFiles(new b());
            if (listFiles != null) {
                return listFiles;
            }
        } else {
            this.f16241a.getLogger().h(b5.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File b(l1.a aVar) {
        String str;
        WeakHashMap weakHashMap = this.f16246f;
        r a7 = this.f16247g.a();
        try {
            if (weakHashMap.containsKey(aVar)) {
                str = (String) weakHashMap.get(aVar);
            } else {
                String concat = io.sentry.config.a.n().concat(".envelope");
                weakHashMap.put(aVar, concat);
                str = concat;
            }
            File file = new File(this.f16243c.getAbsolutePath(), str);
            a7.close();
            return file;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void c(File file, File file2) {
        r a7 = this.f16248h.a();
        try {
            if (!file.exists()) {
                a7.close();
                return;
            }
            boolean exists = file2.exists();
            b6 b6Var = this.f16241a;
            if (exists) {
                b6Var.getLogger().h(b5.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    b6Var.getLogger().h(b5.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            b6Var.getLogger().h(b5.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    b6Var.getLogger().h(b5.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th2) {
                b6Var.getLogger().e(b5.ERROR, "Error moving current session to previous session.", th2);
            }
            a7.close();
        } catch (Throwable th3) {
            try {
                a7.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final l1.a d(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                l1.a d10 = ((g1) this.f16242b.a()).d(bufferedInputStream);
                bufferedInputStream.close();
                return d10;
            } finally {
            }
        } catch (IOException e7) {
            this.f16241a.getLogger().e(b5.ERROR, "Failed to deserialize the envelope.", e7);
            return null;
        }
    }

    public final l6 e(r4 r4Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r4Var.f()), f16240i));
            try {
                l6 l6Var = (l6) ((g1) this.f16242b.a()).c(bufferedReader, l6.class);
                bufferedReader.close();
                return l6Var;
            } finally {
            }
        } catch (Throwable th2) {
            this.f16241a.getLogger().e(b5.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    public final boolean f() {
        b6 b6Var = this.f16241a;
        try {
            return this.f16245e.await(b6Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            b6Var.getLogger().h(b5.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void g(File file, l6 l6Var) {
        String str = l6Var.f16614e;
        b6 b6Var = this.f16241a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f16240i));
                try {
                    b6Var.getLogger().h(b5.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((g1) this.f16242b.a()).a(l6Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b6 b6Var = this.f16241a;
        File[] a7 = a();
        ArrayList arrayList = new ArrayList(a7.length);
        for (File file : a7) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((g1) this.f16242b.a()).d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                b6Var.getLogger().h(b5.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e7) {
                b6Var.getLogger().e(b5.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e7);
            }
        }
        return arrayList.iterator();
    }

    @Override // io.sentry.cache.d
    public final void n(l1.a aVar) {
        y4.a.C(aVar, "Envelope is required.");
        File b10 = b(aVar);
        boolean delete = b10.delete();
        b6 b6Var = this.f16241a;
        if (delete) {
            b6Var.getLogger().h(b5.DEBUG, "Discarding envelope from cache: %s", b10.getAbsolutePath());
        } else {
            b6Var.getLogger().h(b5.DEBUG, "Envelope was not cached or could not be deleted: %s", b10.getAbsolutePath());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab A[SYNTHETIC] */
    @Override // io.sentry.cache.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean y(l1.a aVar, h0 h0Var) {
        Date date;
        boolean z5;
        File[] fileArr;
        io.sentry.util.f fVar;
        int i5;
        b6 b6Var;
        l6 l6Var;
        Boolean bool;
        String str;
        int i10;
        r4 r4Var;
        int i11;
        l6 e7;
        y4.a.C(aVar, "Envelope is required.");
        File[] a7 = a();
        int length = a7.length;
        io.sentry.util.f fVar2 = this.f16242b;
        int i12 = 0;
        b6 b6Var2 = this.f16241a;
        int i13 = 1;
        int i14 = this.f16244d;
        if (length >= i14) {
            b6Var2.getLogger().h(b5.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i15 = (length - i14) + 1;
            if (a7.length > 1) {
                Arrays.sort(a7, new h(2));
            }
            File[] fileArr2 = (File[]) Arrays.copyOfRange(a7, i15, length);
            int i16 = 0;
            while (i16 < i15) {
                File file = a7[i16];
                l1.a d10 = d(file);
                if (d10 != null) {
                    Iterable iterable = (Iterable) d10.f19315c;
                    if (iterable.iterator().hasNext()) {
                        i5 = i12;
                        b6Var2.getClientReportRecorder().c(io.sentry.clientreport.e.CACHE_OVERFLOW, d10);
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                l6Var = null;
                                break;
                            }
                            r4 r4Var2 = (r4) it.next();
                            if ((r4Var2 == null ? i5 : r4Var2.f16985a.f17078e.equals(a5.Session)) != 0) {
                                l6Var = e(r4Var2);
                                break;
                            }
                        }
                        if (l6Var != null) {
                            String str2 = l6Var.f16614e;
                            if (((l6Var.f16616g.equals(k6.Ok) && str2 != null) ? i13 : i5) != 0 && (bool = l6Var.f16615f) != null && bool.booleanValue()) {
                                int length2 = fileArr2.length;
                                int i17 = i5;
                                while (i17 < length2) {
                                    File file2 = fileArr2[i17];
                                    fileArr = a7;
                                    l1.a d11 = d(file2);
                                    if (d11 != null) {
                                        Iterable iterable2 = (Iterable) d11.f19315c;
                                        if (iterable2.iterator().hasNext()) {
                                            Iterator it2 = iterable2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    str = str2;
                                                    fVar = fVar2;
                                                    i10 = length2;
                                                    b6Var = b6Var2;
                                                    r4Var = null;
                                                    break;
                                                }
                                                Iterator it3 = it2;
                                                r4 r4Var3 = (r4) it2.next();
                                                if (r4Var3 == null) {
                                                    fVar = fVar2;
                                                    i10 = length2;
                                                    i11 = i5;
                                                } else {
                                                    fVar = fVar2;
                                                    i10 = length2;
                                                    i11 = r4Var3.f16985a.f17078e.equals(a5.Session);
                                                }
                                                if (i11 != 0 && (e7 = e(r4Var3)) != null) {
                                                    String str3 = e7.f16614e;
                                                    b6Var = b6Var2;
                                                    if (((e7.f16616g.equals(k6.Ok) && str3 != null) ? 1 : i5) != 0) {
                                                        Boolean bool2 = e7.f16615f;
                                                        if (bool2 != null && bool2.booleanValue()) {
                                                            ILogger logger = b6Var.getLogger();
                                                            b5 b5Var = b5.ERROR;
                                                            Object[] objArr = new Object[1];
                                                            objArr[i5] = str2;
                                                            logger.h(b5Var, "Session %s has 2 times the init flag.", objArr);
                                                            break;
                                                        }
                                                        if (str2 == null || !str2.equals(str3)) {
                                                            fVar2 = fVar;
                                                            it2 = it3;
                                                            length2 = i10;
                                                            b6Var2 = b6Var;
                                                            str2 = str2;
                                                        } else {
                                                            e7.f16615f = Boolean.TRUE;
                                                            try {
                                                                r4Var = r4.d((g1) fVar.a(), e7);
                                                            } catch (IOException e9) {
                                                                e = e9;
                                                                r4Var = null;
                                                            }
                                                            try {
                                                                it3.remove();
                                                                str = str2;
                                                                break;
                                                            } catch (IOException e10) {
                                                                e = e10;
                                                                ILogger logger2 = b6Var.getLogger();
                                                                b5 b5Var2 = b5.ERROR;
                                                                str = str2;
                                                                r4 r4Var4 = r4Var;
                                                                Object[] objArr2 = new Object[1];
                                                                objArr2[i5] = str;
                                                                logger2.b(b5Var2, e, "Failed to create new envelope item for the session %s", objArr2);
                                                                r4Var = r4Var4;
                                                                if (r4Var == null) {
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        fVar2 = fVar;
                                                        it2 = it3;
                                                        length2 = i10;
                                                        b6Var2 = b6Var;
                                                    }
                                                } else {
                                                    fVar2 = fVar;
                                                    it2 = it3;
                                                    length2 = i10;
                                                }
                                            }
                                            if (r4Var == null) {
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it4 = iterable2.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList.add((r4) it4.next());
                                                }
                                                arrayList.add(r4Var);
                                                l1.a aVar2 = new l1.a((m4) d11.f19314b, arrayList);
                                                long lastModified = file2.lastModified();
                                                if (!file2.delete()) {
                                                    ILogger logger3 = b6Var.getLogger();
                                                    b5 b5Var3 = b5.WARNING;
                                                    Object[] objArr3 = new Object[1];
                                                    objArr3[i5] = file2.getAbsolutePath();
                                                    logger3.h(b5Var3, "File can't be deleted: %s", objArr3);
                                                }
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                    try {
                                                        ((g1) fVar.a()).e(aVar2, fileOutputStream);
                                                        file2.setLastModified(lastModified);
                                                        fileOutputStream.close();
                                                    } finally {
                                                    }
                                                } catch (Throwable th2) {
                                                    b6Var.getLogger().e(b5.ERROR, "Failed to serialize the new envelope to the disk.", th2);
                                                }
                                            } else {
                                                i17++;
                                                a7 = fileArr;
                                                fVar2 = fVar;
                                                length2 = i10;
                                                b6Var2 = b6Var;
                                                str2 = str;
                                            }
                                        }
                                    }
                                    str = str2;
                                    fVar = fVar2;
                                    i10 = length2;
                                    b6Var = b6Var2;
                                    i17++;
                                    a7 = fileArr;
                                    fVar2 = fVar;
                                    length2 = i10;
                                    b6Var2 = b6Var;
                                    str2 = str;
                                }
                            }
                        }
                        fileArr = a7;
                        fVar = fVar2;
                        b6Var = b6Var2;
                        if (file.delete()) {
                            ILogger logger4 = b6Var.getLogger();
                            b5 b5Var4 = b5.WARNING;
                            Object[] objArr4 = new Object[1];
                            objArr4[i5] = file.getAbsolutePath();
                            logger4.h(b5Var4, "File can't be deleted: %s", objArr4);
                        }
                        i16++;
                        i12 = i5;
                        a7 = fileArr;
                        fVar2 = fVar;
                        b6Var2 = b6Var;
                        i13 = 1;
                    }
                }
                fileArr = a7;
                fVar = fVar2;
                i5 = i12;
                b6Var = b6Var2;
                if (file.delete()) {
                }
                i16++;
                i12 = i5;
                a7 = fileArr;
                fVar2 = fVar;
                b6Var2 = b6Var;
                i13 = 1;
            }
        }
        io.sentry.util.f fVar3 = fVar2;
        int i18 = i12;
        b6 b6Var3 = b6Var2;
        File file3 = this.f16243c;
        File file4 = new File(file3.getAbsolutePath(), "session.json");
        File file5 = new File(file3.getAbsolutePath(), "previous_session.json");
        if (x.t(h0Var, i.class) && !file4.delete()) {
            b6Var3.getLogger().h(b5.WARNING, "Current envelope doesn't exist.", new Object[i18]);
        }
        boolean isInstance = io.sentry.hints.a.class.isInstance(h0Var.b("sentry:typeCheckHint"));
        Charset charset = f16240i;
        if (isInstance || io.sentry.hints.g.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
            Object b10 = h0Var.b("sentry:typeCheckHint");
            File file6 = new File(file3.getAbsolutePath(), "previous_session.json");
            if (file6.exists()) {
                ILogger logger5 = b6Var3.getLogger();
                b5 b5Var5 = b5.WARNING;
                logger5.h(b5Var5, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file6), charset));
                    try {
                        l6 l6Var2 = (l6) ((g1) fVar3.a()).c(bufferedReader, l6.class);
                        if (l6Var2 != null) {
                            if (b10 instanceof io.sentry.hints.a) {
                                io.sentry.hints.a aVar3 = (io.sentry.hints.a) b10;
                                Long b11 = aVar3.b();
                                if (b11 != null) {
                                    date = com.google.android.play.core.appupdate.b.o(b11.longValue());
                                    Date c2 = l6Var2.c();
                                    if (c2 != null) {
                                        if (date.before(c2)) {
                                        }
                                    }
                                    b6Var3.getLogger().h(b5Var5, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                } else {
                                    date = null;
                                }
                                l6Var2.d(k6.Abnormal, null, true, aVar3.e());
                                l6Var2.b(date);
                                g(file6, l6Var2);
                            } else {
                                if (b10 instanceof io.sentry.hints.g) {
                                    Date o3 = com.google.android.play.core.appupdate.b.o(((j1) ((io.sentry.hints.g) b10)).f15765d);
                                    Date c8 = l6Var2.c();
                                    if (c8 != null && !o3.before(c8)) {
                                        l6Var2.d(k6.Crashed, null, true, null);
                                        date = o3;
                                    }
                                    b6Var3.getLogger().h(b5Var5, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                } else {
                                    date = null;
                                }
                                l6Var2.b(date);
                                g(file6, l6Var2);
                            }
                        }
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable th3) {
                    b6Var3.getLogger().e(b5.ERROR, "Error processing previous session.", th3);
                }
            } else {
                b6Var3.getLogger().h(b5.DEBUG, "No previous session file to end.", new Object[0]);
            }
        }
        if (j.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
            c(file4, file5);
            Iterable iterable3 = (Iterable) aVar.f19315c;
            if (iterable3.iterator().hasNext()) {
                r4 r4Var5 = (r4) iterable3.iterator().next();
                a5 a5Var = a5.Session;
                a5 a5Var2 = r4Var5.f16985a.f17078e;
                if (a5Var.equals(a5Var2)) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r4Var5.f()), charset));
                        try {
                            l6 l6Var3 = (l6) ((g1) fVar3.a()).c(bufferedReader2, l6.class);
                            if (l6Var3 == null) {
                                b6Var3.getLogger().h(b5.ERROR, "Item of type %s returned null by the parser.", a5Var2);
                            } else {
                                g(file4, l6Var3);
                            }
                            bufferedReader2.close();
                        } finally {
                        }
                    } catch (Throwable th4) {
                        b6Var3.getLogger().e(b5.ERROR, "Item failed to process.", th4);
                    }
                } else {
                    b6Var3.getLogger().h(b5.INFO, "Current envelope has a different envelope type %s", a5Var2);
                }
            } else {
                b6Var3.getLogger().h(b5.INFO, "Current envelope %s is empty", file4.getAbsolutePath());
            }
            if (!new File(b6Var3.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                File file7 = new File(b6Var3.getCacheDirPath(), "last_crash");
                if (file7.exists()) {
                    b6Var3.getLogger().h(b5.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file7.delete()) {
                        b6Var3.getLogger().h(b5.ERROR, "Failed to delete the crash marker file. %s.", file7.getAbsolutePath());
                    }
                }
            }
            j4.f16563c.a();
            this.f16245e.countDown();
        }
        File b12 = b(aVar);
        if (b12.exists()) {
            b6Var3.getLogger().h(b5.WARNING, "Not adding Envelope to offline storage because it already exists: %s", b12.getAbsolutePath());
            return true;
        }
        ILogger logger6 = b6Var3.getLogger();
        b5 b5Var6 = b5.DEBUG;
        logger6.h(b5Var6, "Adding Envelope to offline storage: %s", b12.getAbsolutePath());
        if (b12.exists()) {
            b6Var3.getLogger().h(b5Var6, "Overwriting envelope to offline storage: %s", b12.getAbsolutePath());
            if (!b12.delete()) {
                b6Var3.getLogger().h(b5.ERROR, "Failed to delete: %s", b12.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(b12);
            try {
                ((g1) fVar3.a()).e(aVar, fileOutputStream2);
                fileOutputStream2.close();
                z5 = true;
            } finally {
                try {
                    fileOutputStream2.close();
                    throw th;
                } catch (Throwable th5) {
                    th.addSuppressed(th5);
                }
            }
        } catch (Throwable th6) {
            b6Var3.getLogger().b(b5.ERROR, th6, "Error writing Envelope %s to offline storage", b12.getAbsolutePath());
            z5 = false;
        }
        if (x6.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(b6Var3.getCacheDirPath(), "last_crash"));
                try {
                    fileOutputStream3.write(com.google.android.play.core.appupdate.b.u(com.google.android.play.core.appupdate.b.n()).getBytes(charset));
                    fileOutputStream3.flush();
                    fileOutputStream3.close();
                } finally {
                }
            } catch (Throwable th7) {
                b6Var3.getLogger().e(b5.ERROR, "Error writing the crash marker file to the disk", th7);
            }
        }
        return z5;
    }
}
