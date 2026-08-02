package io.sentry.cache;

import io.sentry.AbstractC4779m;
import io.sentry.C4665a3;
import io.sentry.C4841u2;
import io.sentry.C4866x2;
import io.sentry.EnumC4783m3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4770k0;
import io.sentry.J;
import io.sentry.T3;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.V3;
import io.sentry.util.C4843a;
import io.sentry.util.w;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class f extends c implements g {

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f51928f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f51929g;

    /* renamed from: h, reason: collision with root package name */
    public final C4843a f51930h;

    /* renamed from: i, reason: collision with root package name */
    public final C4843a f51931i;

    public f(F3 f32, String str, int i10) {
        super(f32, str, i10);
        this.f51929g = new WeakHashMap();
        this.f51930h = new C4843a();
        this.f51931i = new C4843a();
        this.f51928f = new CountDownLatch(1);
    }

    public static g r(F3 f32) {
        String cacheDirPath = f32.getCacheDirPath();
        int maxCacheItems = f32.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(f32, cacheDirPath, maxCacheItems);
        }
        f32.getLogger().c(EnumC4788n3.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return io.sentry.transport.r.a();
    }

    public static File t(String str) {
        return new File(str, "session.json");
    }

    public static File v(String str) {
        return new File(str, "previous_session.json");
    }

    public boolean A() {
        try {
            return this.f51928f.await(this.f51923a.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void B() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f51923a.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(AbstractC4779m.g(AbstractC4779m.c()).getBytes(c.f51922e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    public final boolean C(File file, C4866x2 c4866x2) {
        if (file.exists()) {
            this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f51923a.getLogger().c(EnumC4788n3.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((InterfaceC4770k0) this.f51924b.a()).b(c4866x2, fileOutputStream);
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            this.f51923a.getLogger().a(EnumC4788n3.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
            return false;
        }
    }

    public final void D(File file, V3 v32) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f51922e));
                try {
                    this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Overwriting session to offline storage: %s", v32.j());
                    ((InterfaceC4770k0) this.f51924b.a()).a(v32, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f51923a.getLogger().a(EnumC4788n3.ERROR, th2, "Error writing Session to offline storage: %s", v32.j());
        }
    }

    @Override // io.sentry.cache.g
    public void d(C4866x2 c4866x2) {
        w.c(c4866x2, "Envelope is required.");
        File u10 = u(c4866x2);
        if (u10.delete()) {
            this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Discarding envelope from cache: %s", u10.getAbsolutePath());
        } else {
            this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Envelope was not cached or could not be deleted: %s", u10.getAbsolutePath());
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        File[] q10 = q();
        ArrayList arrayList = new ArrayList(q10.length);
        for (File file : q10) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((InterfaceC4770k0) this.f51924b.a()).d(bufferedInputStream));
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
                this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                this.f51923a.getLogger().b(EnumC4788n3.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e10);
            }
        }
        return arrayList.iterator();
    }

    public final File[] q() {
        File[] listFiles;
        return (!f() || (listFiles = this.f51925c.listFiles(new FilenameFilter() { // from class: io.sentry.cache.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean endsWith;
                endsWith = str.endsWith(".envelope");
                return endsWith;
            }
        })) == null) ? new File[0] : listFiles;
    }

    public void s() {
        this.f51928f.countDown();
    }

    public final File u(C4866x2 c4866x2) {
        String str;
        InterfaceC4765j0 d10 = this.f51930h.d();
        try {
            if (this.f51929g.containsKey(c4866x2)) {
                str = (String) this.f51929g.get(c4866x2);
            } else {
                String str2 = T3.a() + ".envelope";
                this.f51929g.put(c4866x2, str2);
                str = str2;
            }
            File file = new File(this.f51925c.getAbsolutePath(), str);
            if (d10 != null) {
                d10.close();
            }
            return file;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void w(File file, File file2) {
        InterfaceC4765j0 d10 = this.f51931i.d();
        try {
            if (!file.exists()) {
                if (d10 != null) {
                    d10.close();
                    return;
                }
                return;
            }
            if (file2.exists()) {
                this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    this.f51923a.getLogger().c(EnumC4788n3.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            this.f51923a.getLogger().c(EnumC4788n3.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    this.f51923a.getLogger().c(EnumC4788n3.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th2) {
                this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Error moving current session to previous session.", th2);
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th3) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public boolean w0(C4866x2 c4866x2, J j10) {
        return x(c4866x2, j10);
    }

    public final boolean x(C4866x2 c4866x2, J j10) {
        w.c(c4866x2, "Envelope is required.");
        m(q());
        File t10 = t(this.f51925c.getAbsolutePath());
        File v10 = v(this.f51925c.getAbsolutePath());
        if (io.sentry.util.l.f(j10, io.sentry.hints.m.class) && !t10.delete()) {
            this.f51923a.getLogger().c(EnumC4788n3.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.l.f(j10, io.sentry.hints.a.class) || io.sentry.util.l.f(j10, io.sentry.hints.j.class)) {
            y(j10);
        }
        if (io.sentry.util.l.f(j10, io.sentry.hints.o.class)) {
            w(t10, v10);
            z(t10, c4866x2);
            boolean exists = new File(this.f51923a.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!exists) {
                File file = new File(this.f51923a.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f51923a.getLogger().c(EnumC4788n3.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f51923a.getLogger().c(EnumC4788n3.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    exists = true;
                }
            }
            C4841u2.a().d(exists);
            s();
        }
        File u10 = u(c4866x2);
        if (u10.exists()) {
            this.f51923a.getLogger().c(EnumC4788n3.WARNING, "Not adding Envelope to offline storage because it already exists: %s", u10.getAbsolutePath());
            return true;
        }
        this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "Adding Envelope to offline storage: %s", u10.getAbsolutePath());
        boolean C10 = C(u10, c4866x2);
        if (io.sentry.util.l.f(j10, UncaughtExceptionHandlerIntegration.a.class)) {
            B();
        }
        return C10;
    }

    public final void y(J j10) {
        Date date;
        Object e10 = io.sentry.util.l.e(j10);
        File v10 = v(this.f51925c.getAbsolutePath());
        if (!v10.exists()) {
            this.f51923a.getLogger().c(EnumC4788n3.DEBUG, "No previous session file to end.", new Object[0]);
            return;
        }
        ILogger logger = this.f51923a.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.WARNING;
        logger.c(enumC4788n3, "Previous session is not ended, we'd need to end it.", new Object[0]);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(v10), c.f51922e));
            try {
                V3 v32 = (V3) ((InterfaceC4770k0) this.f51924b.a()).c(bufferedReader, V3.class);
                if (v32 != null) {
                    Date date2 = null;
                    if (e10 instanceof io.sentry.hints.a) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) e10;
                        Long a10 = aVar.a();
                        if (a10 != null) {
                            date = AbstractC4779m.d(a10.longValue());
                            Date k10 = v32.k();
                            if (k10 != null) {
                                if (date.before(k10)) {
                                }
                            }
                            this.f51923a.getLogger().c(enumC4788n3, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                        } else {
                            date = null;
                        }
                        v32.q(V3.b.Abnormal, null, true, aVar.h());
                        date2 = date;
                        v32.d(date2);
                        D(v10, v32);
                    } else {
                        if (e10 instanceof io.sentry.hints.j) {
                            Date d10 = AbstractC4779m.d(((io.sentry.hints.j) e10).a().longValue());
                            Date k11 = v32.k();
                            if (k11 != null && !d10.before(k11)) {
                                v32.q(V3.b.Crashed, null, true, null);
                                date2 = d10;
                            }
                            this.f51923a.getLogger().c(enumC4788n3, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                        }
                        v32.d(date2);
                        D(v10, v32);
                    }
                }
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Error processing previous session.", th2);
        }
    }

    public final void z(File file, C4866x2 c4866x2) {
        Iterable c10 = c4866x2.c();
        if (!c10.iterator().hasNext()) {
            this.f51923a.getLogger().c(EnumC4788n3.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        C4665a3 c4665a3 = (C4665a3) c10.iterator().next();
        if (!EnumC4783m3.Session.equals(c4665a3.O().e())) {
            this.f51923a.getLogger().c(EnumC4788n3.INFO, "Current envelope has a different envelope type %s", c4665a3.O().e());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c4665a3.M()), c.f51922e));
            try {
                V3 v32 = (V3) ((InterfaceC4770k0) this.f51924b.a()).c(bufferedReader, V3.class);
                if (v32 == null) {
                    this.f51923a.getLogger().c(EnumC4788n3.ERROR, "Item of type %s returned null by the parser.", c4665a3.O().e());
                } else {
                    D(file, v32);
                }
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Item failed to process.", th2);
        }
    }
}
