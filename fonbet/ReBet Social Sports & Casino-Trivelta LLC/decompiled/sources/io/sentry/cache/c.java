package io.sentry.cache;

import io.sentry.C4665a3;
import io.sentry.C4866x2;
import io.sentry.EnumC4783m3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4770k0;
import io.sentry.V3;
import io.sentry.util.p;
import io.sentry.util.w;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f51922e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public F3 f51923a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.p f51924b = new io.sentry.util.p(new p.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.p.a
        public final Object a() {
            InterfaceC4770k0 serializer;
            serializer = c.this.f51923a.getSerializer();
            return serializer;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public final File f51925c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51926d;

    public c(F3 f32, String str, int i10) {
        w.c(str, "Directory is required.");
        this.f51923a = (F3) w.c(f32, "SentryOptions is required.");
        this.f51925c = new File(str);
        this.f51926d = i10;
    }

    public final C4866x2 c(C4866x2 c4866x2, C4665a3 c4665a3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c4866x2.c().iterator();
        while (it.hasNext()) {
            arrayList.add((C4665a3) it.next());
        }
        arrayList.add(c4665a3);
        return new C4866x2(c4866x2.b(), arrayList);
    }

    public final V3 e(C4866x2 c4866x2) {
        for (C4665a3 c4665a3 : c4866x2.c()) {
            if (g(c4665a3)) {
                return l(c4665a3);
            }
        }
        return null;
    }

    public boolean f() {
        if (this.f51925c.isDirectory() && this.f51925c.canWrite() && this.f51925c.canRead()) {
            return true;
        }
        this.f51923a.getLogger().c(EnumC4788n3.ERROR, "The directory for caching files is inaccessible.: %s", this.f51925c.getAbsolutePath());
        return false;
    }

    public final boolean g(C4665a3 c4665a3) {
        if (c4665a3 == null) {
            return false;
        }
        return c4665a3.O().e().equals(EnumC4783m3.Session);
    }

    public final boolean h(C4866x2 c4866x2) {
        return c4866x2.c().iterator().hasNext();
    }

    public final boolean i(V3 v32) {
        return v32.l().equals(V3.b.Ok) && v32.j() != null;
    }

    public final void j(File file, File[] fileArr) {
        Boolean g10;
        int i10;
        File file2;
        C4866x2 k10;
        C4665a3 c4665a3;
        V3 l10;
        C4866x2 k11 = k(file);
        if (k11 == null || !h(k11)) {
            return;
        }
        this.f51923a.getClientReportRecorder().b(io.sentry.clientreport.f.CACHE_OVERFLOW, k11);
        V3 e10 = e(k11);
        if (e10 == null || !i(e10) || (g10 = e10.g()) == null || !g10.booleanValue()) {
            return;
        }
        int length = fileArr.length;
        for (i10 = 0; i10 < length; i10++) {
            file2 = fileArr[i10];
            k10 = k(file2);
            if (k10 != null && h(k10)) {
                Iterator it = k10.c().iterator();
                while (true) {
                    c4665a3 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C4665a3 c4665a32 = (C4665a3) it.next();
                    if (g(c4665a32) && (l10 = l(c4665a32)) != null && i(l10)) {
                        Boolean g11 = l10.g();
                        if (g11 != null && g11.booleanValue()) {
                            this.f51923a.getLogger().c(EnumC4788n3.ERROR, "Session %s has 2 times the init flag.", e10.j());
                            return;
                        }
                        if (e10.j() != null && e10.j().equals(l10.j())) {
                            l10.n();
                            try {
                                c4665a3 = C4665a3.K((InterfaceC4770k0) this.f51924b.a(), l10);
                                it.remove();
                                break;
                            } catch (IOException e11) {
                                this.f51923a.getLogger().a(EnumC4788n3.ERROR, e11, "Failed to create new envelope item for the session %s", e10.j());
                            }
                        }
                    }
                }
            }
        }
        return;
        if (c4665a3 != null) {
            C4866x2 c10 = c(k10, c4665a3);
            long lastModified = file2.lastModified();
            if (!file2.delete()) {
                this.f51923a.getLogger().c(EnumC4788n3.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
            }
            n(c10, file2, lastModified);
            return;
        }
    }

    public final C4866x2 k(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                C4866x2 d10 = ((InterfaceC4770k0) this.f51924b.a()).d(bufferedInputStream);
                bufferedInputStream.close();
                return d10;
            } finally {
            }
        } catch (IOException e10) {
            this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    public final V3 l(C4665a3 c4665a3) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c4665a3.M()), f51922e));
            try {
                V3 v32 = (V3) ((InterfaceC4770k0) this.f51924b.a()).c(bufferedReader, V3.class);
                bufferedReader.close();
                return v32;
            } finally {
            }
        } catch (Throwable th2) {
            this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    public void m(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f51926d) {
            this.f51923a.getLogger().c(EnumC4788n3.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i10 = (length - this.f51926d) + 1;
            o(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i10, length);
            for (int i11 = 0; i11 < i10; i11++) {
                File file = fileArr[i11];
                j(file, fileArr2);
                if (!file.delete()) {
                    this.f51923a.getLogger().c(EnumC4788n3.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }

    public final void n(C4866x2 c4866x2, File file, long j10) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((InterfaceC4770k0) this.f51924b.a()).b(c4866x2, fileOutputStream);
                file.setLastModified(j10);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f51923a.getLogger().b(EnumC4788n3.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    public final void o(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                    return compare;
                }
            });
        }
    }
}
