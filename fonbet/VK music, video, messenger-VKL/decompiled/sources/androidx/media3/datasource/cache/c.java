package androidx.media3.datasource.cache;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache;
import com.google.common.collect.ImmutableSet;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import xsna.adl;
import xsna.ahn;
import xsna.cij;
import xsna.dij;
import xsna.fo8;
import xsna.fxc0;
import xsna.fy8;
import xsna.gy8;
import xsna.npj0;
import xsna.qpj0;
import xsna.qx8;
import xsna.sw8;
import xsna.swk;
import xsna.tw8;
import xsna.xr;
import xsna.z9r;

/* compiled from: SimpleCache.java */
/* loaded from: classes.dex */
public final class c implements Cache {
    public static final HashSet<File> l = new HashSet<>();
    public final File a;
    public final b b;
    public final gy8 c;

    @Nullable
    public final tw8 d;
    public final HashMap<String, ArrayList<Cache.a>> e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public boolean j;
    public Cache.CacheException k;

    public c(File file, b bVar, @Nullable swk swkVar, boolean z) {
        boolean add;
        gy8 gy8Var = new gy8(swkVar, file, z);
        tw8 tw8Var = (swkVar == null || z) ? null : new tw8(swkVar);
        synchronized (c.class) {
            add = l.add(file.getAbsoluteFile());
        }
        if (!add) {
            throw new IllegalStateException(z9r.a(file, "Another SimpleCache instance uses the folder: "));
        }
        this.a = file;
        this.b = bVar;
        this.c = gy8Var;
        this.d = tw8Var;
        this.e = new HashMap<>();
        this.f = new Random();
        this.g = bVar.a();
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new npj0(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void h(c cVar) {
        tw8 tw8Var = cVar.d;
        gy8 gy8Var = cVar.c;
        File file = cVar.a;
        if (!file.exists()) {
            try {
                k(file);
            } catch (Cache.CacheException e) {
                cVar.k = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            ahn.n("SimpleCache", str);
            cVar.k = new Cache.CacheException(str);
            return;
        }
        long n = n(listFiles);
        cVar.h = n;
        if (n == -1) {
            try {
                cVar.h = l(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                ahn.o("SimpleCache", str2, e2);
                cVar.k = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            gy8Var.e(cVar.h);
            if (tw8Var != null) {
                tw8Var.c(cVar.h);
                HashMap a = tw8Var.a();
                cVar.m(file, true, listFiles, a);
                tw8Var.e(a.keySet());
            } else {
                cVar.m(file, true, listFiles, null);
            }
            Iterator it = ImmutableSet.n(gy8Var.a.keySet()).iterator();
            while (it.hasNext()) {
                gy8Var.f((String) it.next());
            }
            try {
                gy8Var.g();
            } catch (IOException e3) {
                ahn.o("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            ahn.o("SimpleCache", str3, e4);
            cVar.k = new Cache.CacheException(str3, e4);
        }
    }

    public static void k(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        ahn.n("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    public static long l(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, fo8.a(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException(z9r.a(file2, "Failed to create UID file: "));
    }

    public static long n(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                } catch (NumberFormatException unused) {
                    ahn.n("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized void t(File file) {
        synchronized (c.class) {
            l.remove(file.getAbsoluteFile());
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:? -> B:12:0x001e). Please report as a decompilation issue!!! */
    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized qx8 a(long j, long j2, String str) throws InterruptedException, Cache.CacheException {
        try {
            fxc0.z(!this.j);
            j();
            while (true) {
                qx8 g = g(j, j2, str);
                String str2 = str;
                long j3 = j2;
                long j4 = j;
                if (g != null) {
                    return g;
                }
                try {
                    wait();
                    j = j4;
                    j2 = j3;
                    str = str2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized long b(long j, long j2, String str) {
        long j3;
        long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = j;
        j3 = 0;
        while (j6 < j5) {
            long cachedLength = getCachedLength(str, j6, j5 - j6);
            if (cachedLength > 0) {
                j3 += cachedLength;
            } else {
                cachedLength = -cachedLength;
            }
            j6 += cachedLength;
        }
        return j3;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void c(String str) {
        fxc0.z(!this.j);
        Iterator<qx8> it = getCachedSpans(str).iterator();
        while (it.hasNext()) {
            q(it.next());
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void d(qx8 qx8Var) {
        fxc0.z(!this.j);
        fy8 c = this.c.c(qx8Var.b);
        c.getClass();
        c.m(qx8Var.c);
        this.c.f(c.b);
        notifyAll();
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void e(File file, long j) throws Cache.CacheException {
        boolean z = true;
        fxc0.z(!this.j);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            qpj0 b = qpj0.b(file, j, C.TIME_UNSET, this.c);
            b.getClass();
            fy8 c = this.c.c(b.b);
            c.getClass();
            fxc0.z(c.h(b.c, b.d));
            long b2 = cij.b(c.d());
            if (b2 != -1) {
                if (b.c + b.d > b2) {
                    z = false;
                }
                fxc0.z(z);
            }
            if (this.d != null) {
                try {
                    this.d.f(b.d, b.g, file.getName());
                } catch (IOException e) {
                    throw new Cache.CacheException(e);
                }
            }
            i(b);
            try {
                this.c.g();
                notifyAll();
            } catch (IOException e2) {
                throw new Cache.CacheException(e2);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized void f(String str, dij dijVar) throws Cache.CacheException {
        fxc0.z(!this.j);
        j();
        gy8 gy8Var = this.c;
        fy8 d = gy8Var.d(str);
        if (d.b(dijVar)) {
            gy8Var.e.g(d);
        }
        try {
            this.c.g();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    @Nullable
    public final synchronized qx8 g(long j, long j2, String str) throws Cache.CacheException {
        long j3;
        String str2;
        qpj0 e;
        fxc0.z(!this.j);
        j();
        fy8 c = this.c.c(str);
        if (c != null) {
            j3 = j;
            str2 = str;
            while (true) {
                e = c.e(j3, j2);
                if (!e.e) {
                    break;
                }
                File file = e.f;
                file.getClass();
                if (file.length() == e.d) {
                    break;
                }
                r();
            }
        } else {
            j3 = j;
            str2 = str;
            e = new qpj0(str2, j3, j2, C.TIME_UNSET, null);
        }
        if (e.e) {
            return s(str2, e);
        }
        if (this.c.d(str2).j(j3, e.d)) {
            return e;
        }
        return null;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized long getCacheSpace() {
        fxc0.z(!this.j);
        return this.i;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized long getCachedLength(String str, long j, long j2) {
        fy8 c;
        fxc0.z(!this.j);
        if (j2 == -1) {
            j2 = Long.MAX_VALUE;
        }
        c = this.c.c(str);
        return c != null ? c.c(j, j2) : -j2;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized NavigableSet<qx8> getCachedSpans(String str) {
        TreeSet treeSet;
        try {
            fxc0.z(!this.j);
            fy8 c = this.c.c(str);
            if (c != null && !c.g()) {
                treeSet = new TreeSet((Collection) c.f());
            }
            treeSet = new TreeSet();
        } catch (Throwable th) {
            throw th;
        }
        return treeSet;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized cij getContentMetadata(String str) {
        fy8 c;
        fxc0.z(!this.j);
        c = this.c.c(str);
        return c != null ? c.d() : adl.c;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized Set<String> getKeys() {
        fxc0.z(!this.j);
        return new HashSet(this.c.a.keySet());
    }

    public final void i(qpj0 qpj0Var) {
        String str = qpj0Var.b;
        this.c.d(str).a(qpj0Var);
        this.i += qpj0Var.d;
        ArrayList<Cache.a> arrayList = this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).e(this, qpj0Var);
            }
        }
        this.b.e(this, qpj0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r3.c(r4, r6) >= r6) goto L12;
     */
    @Override // androidx.media3.datasource.cache.Cache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean isCached(String str, long j, long j2) {
        boolean z;
        z = true;
        fxc0.z(!this.j);
        fy8 c = this.c.c(str);
        if (c != null) {
        }
        z = false;
        return z;
    }

    public final synchronized void j() throws Cache.CacheException {
        Cache.CacheException cacheException = this.k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public final void m(File file, boolean z, @Nullable File[] fileArr, @Nullable Map<String, sw8> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                m(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith(CachedContentIndex.FILE_NAME) && !name.endsWith(".uid"))) {
                sw8 remove = map != null ? map.remove(name) : null;
                if (remove != null) {
                    j = remove.a;
                    j2 = remove.b;
                } else {
                    j = -1;
                    j2 = C.TIME_UNSET;
                }
                qpj0 b = qpj0.b(file2, j, j2, this.c);
                if (b != null) {
                    i(b);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void o() {
        if (this.j) {
            return;
        }
        this.e.clear();
        r();
        try {
            try {
                this.c.g();
                t(this.a);
            } catch (IOException e) {
                ahn.o("SimpleCache", "Storing index file failed", e);
                t(this.a);
            }
            this.j = true;
        } catch (Throwable th) {
            t(this.a);
            this.j = true;
            throw th;
        }
    }

    public final synchronized void p(qx8 qx8Var) {
        fxc0.z(!this.j);
        q(qx8Var);
    }

    public final void q(qx8 qx8Var) {
        String str = qx8Var.b;
        gy8 gy8Var = this.c;
        fy8 c = gy8Var.c(str);
        if (c == null || !c.k(qx8Var)) {
            return;
        }
        this.i -= qx8Var.d;
        tw8 tw8Var = this.d;
        if (tw8Var != null) {
            File file = qx8Var.f;
            file.getClass();
            String name = file.getName();
            try {
                ((String) tw8Var.c).getClass();
                try {
                    ((swk) tw8Var.b).getWritableDatabase().delete((String) tw8Var.c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                xr.a("Failed to remove file index entry for: ", name);
            }
        }
        gy8Var.f(c.b);
        ArrayList<Cache.a> arrayList = this.e.get(qx8Var.b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).c(this, qx8Var);
            }
        }
        this.b.c(this, qx8Var);
    }

    public final void r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.c.a.values()).iterator();
        while (it.hasNext()) {
            Iterator<qpj0> it2 = ((fy8) it.next()).f().iterator();
            while (it2.hasNext()) {
                qpj0 next = it2.next();
                File file = next.f;
                file.getClass();
                if (file.length() != next.d) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            q((qx8) arrayList.get(i));
        }
    }

    public final qpj0 s(String str, qpj0 qpj0Var) {
        boolean z;
        if (!this.g) {
            return qpj0Var;
        }
        File file = qpj0Var.f;
        file.getClass();
        String name = file.getName();
        long j = qpj0Var.d;
        long currentTimeMillis = System.currentTimeMillis();
        tw8 tw8Var = this.d;
        if (tw8Var != null) {
            try {
                tw8Var.f(j, currentTimeMillis, name);
            } catch (IOException unused) {
                ahn.F("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        fy8 c = this.c.c(str);
        c.getClass();
        qpj0 l2 = c.l(qpj0Var, currentTimeMillis, z);
        ArrayList<Cache.a> arrayList = this.e.get(qpj0Var.b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(this, qpj0Var, l2);
            }
        }
        this.b.b(this, qpj0Var, l2);
        return l2;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final synchronized File startFile(String str, long j, long j2) throws Cache.CacheException {
        Throwable th;
        try {
            try {
                fxc0.z(!this.j);
                j();
                fy8 c = this.c.c(str);
                c.getClass();
                fxc0.z(c.h(j, j2));
                if (!this.a.exists()) {
                    try {
                        k(this.a);
                        r();
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.b.d(this, str, j, j2);
                File file = new File(this.a, Integer.toString(this.f.nextInt(10)));
                if (!file.exists()) {
                    k(file);
                }
                return qpj0.c(file, c.a, j, System.currentTimeMillis());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
