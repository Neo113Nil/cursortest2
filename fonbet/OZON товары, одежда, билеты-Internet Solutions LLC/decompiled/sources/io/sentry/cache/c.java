package io.sentry.cache;

import io.sentry.C7222x2;
import io.sentry.H2;
import io.sentry.I2;
import io.sentry.InterfaceC7126b0;
import io.sentry.V1;
import io.sentry.W2;
import io.sentry.h3;
import io.sentry.util.l;
import io.sentry.util.p;
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
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    protected static final Charset f67779e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    protected W2 f67780a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    protected final io.sentry.util.l<InterfaceC7126b0> f67781b = new io.sentry.util.l<>(new l.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.l.a
        public final Object g() {
            return c.this.f67780a.getSerializer();
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    protected final File f67782c;

    /* renamed from: d, reason: collision with root package name */
    private final int f67783d;

    c(@NotNull W2 w22, @NotNull String str, int i11) {
        p.b(w22, "SentryOptions is required.");
        this.f67780a = w22;
        this.f67782c = new File(str);
        this.f67783d = i11;
    }

    private V1 a(@NotNull File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                V1 d11 = this.f67781b.a().d(bufferedInputStream);
                bufferedInputStream.close();
                return d11;
            } finally {
            }
        } catch (IOException e11) {
            this.f67780a.getLogger().a(I2.ERROR, "Failed to deserialize the envelope.", e11);
            return null;
        }
    }

    private h3 b(@NotNull C7222x2 c7222x2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c7222x2.o()), f67779e));
            try {
                h3 h3Var = (h3) this.f67781b.a().c(bufferedReader, h3.class);
                bufferedReader.close();
                return h3Var;
            } finally {
            }
        } catch (Throwable th2) {
            this.f67780a.getLogger().a(I2.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void c(@NotNull File[] fileArr) {
        int i11;
        h3 h3Var;
        Boolean e11;
        C7222x2 c7222x2;
        Iterator<C7222x2> it;
        boolean equals;
        c cVar = this;
        File[] fileArr2 = fileArr;
        int length = fileArr2.length;
        int i12 = cVar.f67783d;
        if (length >= i12) {
            W2 w22 = cVar.f67780a;
            boolean z11 = false;
            w22.getLogger().c(I2.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            boolean z12 = true;
            int i13 = (length - i12) + 1;
            if (fileArr2.length > 1) {
                Arrays.sort(fileArr2, new b(0));
            }
            File[] fileArr3 = (File[]) Arrays.copyOfRange(fileArr2, i13, length);
            int i14 = 0;
            while (i14 < i13) {
                File file = fileArr2[i14];
                V1 a11 = cVar.a(file);
                if (a11 != null && a11.b().iterator().hasNext()) {
                    w22.getClientReportRecorder().d(io.sentry.clientreport.f.CACHE_OVERFLOW, a11);
                    Iterator<C7222x2> it2 = a11.b().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            h3Var = null;
                            break;
                        }
                        C7222x2 next = it2.next();
                        if (next == null ? z11 : next.p().e().equals(H2.Session)) {
                            h3Var = cVar.b(next);
                            break;
                        }
                    }
                    if (h3Var != null) {
                        if (((h3Var.i().equals(h3.b.Ok) && h3Var.g() != null) ? z12 : z11) && (e11 = h3Var.e()) != null && e11.booleanValue()) {
                            int length2 = fileArr3.length;
                            ?? r14 = z11;
                            while (true) {
                                if (r14 >= length2) {
                                    break;
                                }
                                File file2 = fileArr3[r14];
                                V1 a12 = cVar.a(file2);
                                if (a12 != null && a12.b().iterator().hasNext()) {
                                    Iterator<C7222x2> it3 = a12.b().iterator();
                                    while (true) {
                                        boolean hasNext = it3.hasNext();
                                        io.sentry.util.l<InterfaceC7126b0> lVar = cVar.f67781b;
                                        if (!hasNext) {
                                            i11 = i13;
                                            c7222x2 = null;
                                            break;
                                        }
                                        C7222x2 next2 = it3.next();
                                        if (next2 == null) {
                                            it = it3;
                                            equals = false;
                                        } else {
                                            it = it3;
                                            equals = next2.p().e().equals(H2.Session);
                                        }
                                        if (equals) {
                                            h3 b11 = cVar.b(next2);
                                            if (b11 != null) {
                                                if (b11.i().equals(h3.b.Ok) && b11.g() != null) {
                                                    Boolean e12 = b11.e();
                                                    if (e12 != null && e12.booleanValue()) {
                                                        w22.getLogger().c(I2.ERROR, "Session %s has 2 times the init flag.", h3Var.g());
                                                        break;
                                                    }
                                                    if (h3Var.g() == null || !h3Var.g().equals(b11.g())) {
                                                        cVar = this;
                                                        it3 = it;
                                                        i13 = i13;
                                                    } else {
                                                        b11.k();
                                                        try {
                                                            c7222x2 = C7222x2.m(lVar.a(), b11);
                                                            try {
                                                                it.remove();
                                                                i11 = i13;
                                                                break;
                                                            } catch (IOException e13) {
                                                                e = e13;
                                                                i11 = i13;
                                                                w22.getLogger().b(I2.ERROR, e, "Failed to create new envelope item for the session %s", h3Var.g());
                                                                if (c7222x2 != null) {
                                                                    ArrayList arrayList = new ArrayList();
                                                                    Iterator<C7222x2> it4 = a12.b().iterator();
                                                                    while (it4.hasNext()) {
                                                                        arrayList.add(it4.next());
                                                                    }
                                                                    arrayList.add(c7222x2);
                                                                    V1 v12 = new V1(a12.a(), arrayList);
                                                                    long lastModified = file2.lastModified();
                                                                    if (!file2.delete()) {
                                                                        w22.getLogger().c(I2.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                                                                    }
                                                                    try {
                                                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                                        try {
                                                                            lVar.a().b(v12, fileOutputStream);
                                                                            file2.setLastModified(lastModified);
                                                                            fileOutputStream.close();
                                                                        } finally {
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        w22.getLogger().a(I2.ERROR, "Failed to serialize the new envelope to the disk.", th2);
                                                                    }
                                                                    if (file.delete()) {
                                                                    }
                                                                    i14++;
                                                                    cVar = this;
                                                                    fileArr2 = fileArr;
                                                                    i13 = i11;
                                                                    z12 = true;
                                                                    z11 = false;
                                                                } else {
                                                                    cVar = this;
                                                                    i13 = i11;
                                                                    r14++;
                                                                }
                                                            }
                                                        } catch (IOException e14) {
                                                            e = e14;
                                                            c7222x2 = null;
                                                        }
                                                    }
                                                }
                                            } else {
                                                cVar = this;
                                            }
                                        }
                                        it3 = it;
                                    }
                                } else {
                                    i11 = i13;
                                }
                                cVar = this;
                                i13 = i11;
                                r14++;
                            }
                        }
                    }
                }
                i11 = i13;
                if (file.delete()) {
                    w22.getLogger().c(I2.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
                i14++;
                cVar = this;
                fileArr2 = fileArr;
                i13 = i11;
                z12 = true;
                z11 = false;
            }
        }
    }
}
