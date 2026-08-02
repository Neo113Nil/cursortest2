package e4;

import eg.c0;
import eg.m0;
import eg.w;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.z;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements AutoCloseable {

    /* renamed from: r, reason: collision with root package name */
    public static final Regex f8591r = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    public final Path f8592a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8593b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f8594c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f8595d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f8596e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f8597f;

    /* renamed from: g, reason: collision with root package name */
    public final jg.d f8598g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8599h;

    /* renamed from: i, reason: collision with root package name */
    public long f8600i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public BufferedSink f8601k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8602l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8603m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8604n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8605o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8606p;
    public final d q;

    public e(long j, CoroutineContext coroutineContext, FileSystem fileSystem, Path path) {
        this.f8592a = path;
        this.f8593b = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f8594c = path.resolve("journal");
        this.f8595d = path.resolve("journal.tmp");
        this.f8596e = path.resolve("journal.bkp");
        this.f8597f = new LinkedHashMap(0, 0.75f, true);
        CoroutineContext t3 = coroutineContext.t(c0.d());
        w wVar = (w) coroutineContext.r(w.f9230b);
        if (wVar == null) {
            lg.e eVar = m0.f9201a;
            wVar = lg.d.f20063c;
        }
        this.f8598g = c0.b(t3.t(wVar.h0(1)));
        this.f8599h = new Object();
        this.q = new d(fileSystem);
    }

    public static void K(String str) {
        if (!f8591r.d(str)) {
            throw new IllegalArgumentException(d9.e.e('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011f, code lost:
    
        if ((r10.j >= 2000) != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118 A[Catch: all -> 0x0037, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:17:0x0032, B:27:0x0040, B:29:0x0058, B:30:0x0078, B:32:0x0088, B:34:0x008f, B:37:0x005e, B:39:0x006e, B:41:0x0072, B:44:0x0077, B:47:0x00af, B:49:0x00b6, B:52:0x00bb, B:54:0x00cc, B:57:0x00d1, B:58:0x010d, B:60:0x0118, B:64:0x0124, B:67:0x0121, B:68:0x00e9, B:70:0x00fe, B:72:0x010a, B:75:0x009f, B:77:0x0128, B:78:0x012f), top: B:3:0x0003, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(e eVar, com.android.billingclient.api.i iVar, boolean z5) {
        synchronized (eVar.f8599h) {
            b bVar = (b) iVar.f4028b;
            if (!Intrinsics.areEqual(bVar.f8585g, iVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z5 || bVar.f8584f) {
                for (int i5 = 0; i5 < 2; i5++) {
                    eVar.q.delete((Path) bVar.f8582d.get(i5));
                }
            } else {
                for (int i10 = 0; i10 < 2; i10++) {
                    if (((boolean[]) iVar.f4029c)[i10] && !eVar.q.exists((Path) bVar.f8582d.get(i10))) {
                        iVar.b(false);
                        return;
                    }
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    Path path = (Path) bVar.f8582d.get(i11);
                    Path path2 = (Path) bVar.f8581c.get(i11);
                    if (eVar.q.exists(path)) {
                        eVar.q.atomicMove(path, path2);
                    } else {
                        d dVar = eVar.q;
                        Path path3 = (Path) bVar.f8581c.get(i11);
                        if (!dVar.exists(path3)) {
                            try {
                                dVar.sink(path3).close();
                            } catch (RuntimeException e7) {
                                throw e7;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    long j = bVar.f8580b[i11];
                    Long size = eVar.q.metadata(path2).getSize();
                    long longValue = size != null ? size.longValue() : 0L;
                    bVar.f8580b[i11] = longValue;
                    eVar.f8600i = (eVar.f8600i - j) + longValue;
                }
            }
            bVar.f8585g = null;
            if (bVar.f8584f) {
                eVar.C(bVar);
                return;
            }
            eVar.j++;
            BufferedSink bufferedSink = eVar.f8601k;
            Intrinsics.checkNotNull(bufferedSink);
            if (!z5 && !bVar.f8583e) {
                eVar.f8597f.remove(bVar.f8579a);
                bufferedSink.writeUtf8("REMOVE");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(bVar.f8579a);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (eVar.f8600i <= eVar.f8593b) {
                }
                eVar.t();
                Unit unit = Unit.f19194a;
            }
            bVar.f8583e = true;
            bufferedSink.writeUtf8("CLEAN");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(bVar.f8579a);
            for (long j6 : bVar.f8580b) {
                bufferedSink.writeByte(32).writeDecimalLong(j6);
            }
            bufferedSink.writeByte(10);
            bufferedSink.flush();
            if (eVar.f8600i <= eVar.f8593b) {
            }
            eVar.t();
            Unit unit2 = Unit.f19194a;
        }
    }

    public final void C(b bVar) {
        BufferedSink bufferedSink;
        int i5 = bVar.f8586h;
        String str = bVar.f8579a;
        if (i5 > 0 && (bufferedSink = this.f8601k) != null) {
            bufferedSink.writeUtf8("DIRTY");
            bufferedSink.writeByte(32);
            bufferedSink.writeUtf8(str);
            bufferedSink.writeByte(10);
            bufferedSink.flush();
        }
        if (bVar.f8586h > 0 || bVar.f8585g != null) {
            bVar.f8584f = true;
            return;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.q.delete((Path) bVar.f8581c.get(i10));
            long j = this.f8600i;
            long[] jArr = bVar.f8580b;
            this.f8600i = j - jArr[i10];
            jArr[i10] = 0;
        }
        this.j++;
        BufferedSink bufferedSink2 = this.f8601k;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8("REMOVE");
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(str);
            bufferedSink2.writeByte(10);
            bufferedSink2.flush();
        }
        this.f8597f.remove(str);
        if (this.j >= 2000) {
            t();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        C(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        while (this.f8600i > this.f8593b) {
            for (b bVar : this.f8597f.values()) {
                if (!bVar.f8584f) {
                    break;
                }
            }
            return;
        }
        this.f8605o = false;
    }

    public final void N() {
        Throwable th2;
        synchronized (this.f8599h) {
            try {
                BufferedSink bufferedSink = this.f8601k;
                if (bufferedSink != null) {
                    bufferedSink.close();
                }
                BufferedSink buffer = Okio.buffer(this.q.sink(this.f8595d, false));
                try {
                    buffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                    buffer.writeUtf8("1").writeByte(10);
                    buffer.writeDecimalLong(3).writeByte(10);
                    buffer.writeDecimalLong(2).writeByte(10);
                    buffer.writeByte(10);
                    for (b bVar : this.f8597f.values()) {
                        if (bVar.f8585g != null) {
                            buffer.writeUtf8("DIRTY");
                            buffer.writeByte(32);
                            buffer.writeUtf8(bVar.f8579a);
                            buffer.writeByte(10);
                        } else {
                            buffer.writeUtf8("CLEAN");
                            buffer.writeByte(32);
                            buffer.writeUtf8(bVar.f8579a);
                            for (long j : bVar.f8580b) {
                                buffer.writeByte(32).writeDecimalLong(j);
                            }
                            buffer.writeByte(10);
                        }
                    }
                    Unit unit = Unit.f19194a;
                    try {
                        buffer.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    if (buffer != null) {
                        try {
                            buffer.close();
                        } catch (Throwable th5) {
                            gf.d.a(th4, th5);
                        }
                    }
                    th2 = th4;
                }
                if (th2 != null) {
                    throw th2;
                }
                if (this.q.exists(this.f8594c)) {
                    this.q.atomicMove(this.f8594c, this.f8596e);
                    this.q.atomicMove(this.f8595d, this.f8594c);
                    this.q.delete(this.f8596e);
                } else {
                    this.q.atomicMove(this.f8595d, this.f8594c);
                }
                this.f8601k = Okio.buffer(new f(this.q.appendingSink(this.f8594c), new a2.f(4, this)));
                this.j = 0;
                this.f8602l = false;
                this.f8606p = false;
                Unit unit2 = Unit.f19194a;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8599h) {
            try {
                if (this.f8603m && !this.f8604n) {
                    for (b bVar : (b[]) this.f8597f.values().toArray(new b[0])) {
                        com.android.billingclient.api.i iVar = bVar.f8585g;
                        if (iVar != null) {
                            b bVar2 = (b) iVar.f4028b;
                            if (Intrinsics.areEqual(bVar2.f8585g, iVar)) {
                                bVar2.f8584f = true;
                            }
                        }
                    }
                    J();
                    c0.g(this.f8598g, null);
                    BufferedSink bufferedSink = this.f8601k;
                    Intrinsics.checkNotNull(bufferedSink);
                    bufferedSink.close();
                    this.f8601k = null;
                    this.f8604n = true;
                    Unit unit = Unit.f19194a;
                    return;
                }
                this.f8604n = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final com.android.billingclient.api.i k(String str) {
        synchronized (this.f8599h) {
            if (this.f8604n) {
                throw new IllegalStateException("cache is closed");
            }
            K(str);
            r();
            b bVar = (b) this.f8597f.get(str);
            if ((bVar != null ? bVar.f8585g : null) != null) {
                return null;
            }
            if (bVar != null && bVar.f8586h != 0) {
                return null;
            }
            if (!this.f8605o && !this.f8606p) {
                BufferedSink bufferedSink = this.f8601k;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8("DIRTY");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.f8602l) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(this, str);
                    this.f8597f.put(str, bVar);
                }
                com.android.billingclient.api.i iVar = new com.android.billingclient.api.i(this, bVar);
                bVar.f8585g = iVar;
                return iVar;
            }
            t();
            return null;
        }
    }

    public final c n(String str) {
        c a7;
        synchronized (this.f8599h) {
            if (this.f8604n) {
                throw new IllegalStateException("cache is closed");
            }
            K(str);
            r();
            b bVar = (b) this.f8597f.get(str);
            if (bVar != null && (a7 = bVar.a()) != null) {
                boolean z5 = true;
                this.j++;
                BufferedSink bufferedSink = this.f8601k;
                Intrinsics.checkNotNull(bufferedSink);
                bufferedSink.writeUtf8("READ");
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(str);
                bufferedSink.writeByte(10);
                bufferedSink.flush();
                if (this.j < 2000) {
                    z5 = false;
                }
                if (z5) {
                    t();
                }
                return a7;
            }
            return null;
        }
    }

    public final void r() {
        synchronized (this.f8599h) {
            try {
                if (this.f8603m) {
                    return;
                }
                this.q.delete(this.f8595d);
                if (this.q.exists(this.f8596e)) {
                    if (this.q.exists(this.f8594c)) {
                        this.q.delete(this.f8596e);
                    } else {
                        this.q.atomicMove(this.f8596e, this.f8594c);
                    }
                }
                if (this.q.exists(this.f8594c)) {
                    try {
                        y();
                        w();
                        this.f8603m = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            com.google.android.play.core.appupdate.b.i(this.q, this.f8592a);
                            this.f8604n = false;
                        } catch (Throwable th2) {
                            this.f8604n = false;
                            throw th2;
                        }
                    }
                }
                N();
                this.f8603m = true;
                Unit unit = Unit.f19194a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void t() {
        c0.t(this.f8598g, null, null, new ad.a(this, null, 5), 3);
    }

    public final void w() {
        Iterator it = this.f8597f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i5 = 0;
            if (bVar.f8585g == null) {
                while (i5 < 2) {
                    j += bVar.f8580b[i5];
                    i5++;
                }
            } else {
                bVar.f8585g = null;
                while (i5 < 2) {
                    Path path = (Path) bVar.f8581c.get(i5);
                    d dVar = this.q;
                    dVar.delete(path);
                    dVar.delete((Path) bVar.f8582d.get(i5));
                    i5++;
                }
                it.remove();
            }
        }
        this.f8600i = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y() {
        d dVar = this.q;
        Path path = this.f8594c;
        BufferedSource buffer = Okio.buffer(dVar.source(path));
        try {
            String readUtf8LineStrict = buffer.readUtf8LineStrict();
            String readUtf8LineStrict2 = buffer.readUtf8LineStrict();
            String readUtf8LineStrict3 = buffer.readUtf8LineStrict();
            String readUtf8LineStrict4 = buffer.readUtf8LineStrict();
            String readUtf8LineStrict5 = buffer.readUtf8LineStrict();
            if (!Intrinsics.areEqual("libcore.io.DiskLruCache", readUtf8LineStrict) || !Intrinsics.areEqual("1", readUtf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(3), readUtf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(2), readUtf8LineStrict4) || readUtf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict3 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + ']');
            }
            int i5 = 0;
            while (true) {
                try {
                    z(buffer.readUtf8LineStrict());
                    i5++;
                } catch (EOFException unused) {
                    this.j = i5 - this.f8597f.size();
                    if (buffer.exhausted()) {
                        this.f8601k = Okio.buffer(new f(dVar.appendingSink(path), new a2.f(4, this)));
                    } else {
                        N();
                    }
                    Unit unit = Unit.f19194a;
                    try {
                        buffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    gf.d.a(th, th4);
                }
            }
            if (th == null) {
            }
        }
    }

    public final void z(String str) {
        String substring;
        int F = StringsKt.F(str, ' ', 0, false, 6);
        if (F == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i5 = F + 1;
        int F2 = StringsKt.F(str, ' ', i5, false, 4);
        LinkedHashMap linkedHashMap = this.f8597f;
        if (F2 == -1) {
            substring = str.substring(i5);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (F == 6 && z.o(str, "REMOVE", false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i5, F2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new b(this, substring);
            linkedHashMap.put(substring, obj);
        }
        b bVar = (b) obj;
        if (F2 == -1 || F != 5 || !z.o(str, "CLEAN", false)) {
            if (F2 == -1 && F == 5 && z.o(str, "DIRTY", false)) {
                bVar.f8585g = new com.android.billingclient.api.i(this, bVar);
                return;
            } else {
                if (F2 != -1 || F != 4 || !z.o(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String substring2 = str.substring(F2 + 1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        List R = StringsKt.R(substring2, new char[]{' '});
        bVar.f8583e = true;
        bVar.f8585g = null;
        if (R.size() != 2) {
            throw new IOException("unexpected journal line: " + R);
        }
        try {
            int size = R.size();
            for (int i10 = 0; i10 < size; i10++) {
                bVar.f8580b[i10] = Long.parseLong((String) R.get(i10));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + R);
        }
    }
}
