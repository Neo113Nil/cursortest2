package q3;

import J0.C3354v2;
import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;
import m3.s;
import o3.InterfaceC8635b;
import q3.InterfaceC8980a;

/* loaded from: classes.dex */
public final class q implements InterfaceC8980a {

    /* renamed from: j, reason: collision with root package name */
    private static final HashSet<File> f81484j = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private final File f81485a;

    /* renamed from: b, reason: collision with root package name */
    private final n f81486b;

    /* renamed from: c, reason: collision with root package name */
    private final k f81487c;

    /* renamed from: d, reason: collision with root package name */
    private final f f81488d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<InterfaceC8980a.b>> f81489e;

    /* renamed from: f, reason: collision with root package name */
    private final Random f81490f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f81491g;

    /* renamed from: h, reason: collision with root package name */
    private long f81492h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC8980a.C1373a f81493i;

    public q(File file, n nVar, InterfaceC8635b interfaceC8635b) {
        boolean add;
        k kVar = new k(interfaceC8635b, file);
        f fVar = interfaceC8635b != null ? new f(interfaceC8635b) : null;
        synchronized (q.class) {
            add = f81484j.add(file.getAbsoluteFile());
        }
        if (!add) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f81485a = file;
        this.f81486b = nVar;
        this.f81487c = kVar;
        this.f81488d = fVar;
        this.f81489e = new HashMap<>();
        this.f81490f = new Random();
        this.f81491g = true;
        this.f81492h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new p(this, conditionVariable).start();
        conditionVariable.block();
    }

    static void e(q qVar) {
        long j11;
        k kVar = qVar.f81487c;
        File file = qVar.f81485a;
        if (!file.exists()) {
            try {
                k(file);
            } catch (InterfaceC8980a.C1373a e11) {
                qVar.f81493i = e11;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            s.c("SimpleCache", str);
            qVar.f81493i = new InterfaceC8980a.C1373a(str);
            return;
        }
        int length = listFiles.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                j11 = -1;
                break;
            }
            File file2 = listFiles[i11];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j11 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    s.c("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i11++;
        }
        qVar.f81492h = j11;
        if (j11 == -1) {
            try {
                qVar.f81492h = l(file);
            } catch (IOException e12) {
                String str2 = "Failed to create cache UID: " + file;
                s.d("SimpleCache", str2, e12);
                qVar.f81493i = new InterfaceC8980a.C1373a(str2, e12);
                return;
            }
        }
        try {
            kVar.h(qVar.f81492h);
            f fVar = qVar.f81488d;
            if (fVar != null) {
                fVar.b(qVar.f81492h);
                HashMap a11 = fVar.a();
                qVar.n(file, true, listFiles, a11);
                fVar.d(a11.keySet());
            } else {
                qVar.n(file, true, listFiles, null);
            }
            kVar.j();
            try {
                kVar.k();
            } catch (IOException e13) {
                s.d("SimpleCache", "Storing index file failed", e13);
            }
        } catch (IOException e14) {
            String str3 = "Failed to initialize cache indices: " + file;
            s.d("SimpleCache", str3, e14);
            qVar.f81493i = new InterfaceC8980a.C1373a(str3, e14);
        }
    }

    private void g(r rVar) {
        k kVar = this.f81487c;
        String str = rVar.f81434a;
        kVar.g(str).a(rVar);
        ArrayList<InterfaceC8980a.b> arrayList = this.f81489e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).c(this, rVar);
            }
        }
        this.f81486b.c(this, rVar);
    }

    private static void k(File file) throws InterfaceC8980a.C1373a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        s.c("SimpleCache", str);
        throw new InterfaceC8980a.C1373a(str);
    }

    private static long l(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, U7.d.e(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private void n(File file, boolean z11, File[] fileArr, HashMap hashMap) {
        long j11;
        long j12;
        if (fileArr == null || fileArr.length == 0) {
            if (z11) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z11 && name.indexOf(46) == -1) {
                n(file2, false, file2.listFiles(), hashMap);
            } else if (!z11 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                e eVar = hashMap != null ? (e) hashMap.remove(name) : null;
                if (eVar != null) {
                    j11 = eVar.f81428a;
                    j12 = eVar.f81429b;
                } else {
                    j11 = -1;
                    j12 = -9223372036854775807L;
                }
                r b11 = r.b(file2, j11, j12, this.f81487c);
                if (b11 != null) {
                    g(b11);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private void q(h hVar) {
        String str = hVar.f81434a;
        k kVar = this.f81487c;
        j d11 = kVar.d(str);
        if (d11 == null || !d11.k(hVar)) {
            return;
        }
        f fVar = this.f81488d;
        if (fVar != null) {
            File file = hVar.f81438e;
            file.getClass();
            String name = file.getName();
            try {
                fVar.c(name);
            } catch (IOException unused) {
                C3354v2.f("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        kVar.i(d11.f81451b);
        ArrayList<InterfaceC8980a.b> arrayList = this.f81489e.get(hVar.f81434a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).b(hVar);
            }
        }
        this.f81486b.b(hVar);
    }

    private void r() {
        ArrayList arrayList = new ArrayList();
        Iterator<j> it = this.f81487c.e().iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = it.next().f().iterator();
            while (it2.hasNext()) {
                r next = it2.next();
                File file = next.f81438e;
                file.getClass();
                if (file.length() != next.f81436c) {
                    arrayList.add(next);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q((h) arrayList.get(i11));
        }
    }

    private r u(String str, r rVar) {
        boolean z11;
        if (!this.f81491g) {
            return rVar;
        }
        File file = rVar.f81438e;
        file.getClass();
        String name = file.getName();
        long j11 = rVar.f81436c;
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = this.f81488d;
        if (fVar != null) {
            try {
                fVar.e(name, j11, currentTimeMillis);
            } catch (IOException unused) {
                s.f("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z11 = false;
        } else {
            z11 = true;
        }
        j d11 = this.f81487c.d(str);
        d11.getClass();
        r l11 = d11.l(rVar, currentTimeMillis, z11);
        ArrayList<InterfaceC8980a.b> arrayList = this.f81489e.get(rVar.f81434a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, rVar, l11);
            }
        }
        this.f81486b.a(this, rVar, l11);
        return l11;
    }

    @Override // q3.InterfaceC8980a
    public final synchronized m a(String str) {
        j d11;
        d11 = this.f81487c.d(str);
        return d11 != null ? d11.d() : m.f81475c;
    }

    @Override // q3.InterfaceC8980a
    public final synchronized void b(String str) {
        TreeSet treeSet;
        synchronized (this) {
            try {
                j d11 = this.f81487c.d(str);
                if (d11 != null && !d11.g()) {
                    treeSet = new TreeSet((Collection) d11.f());
                }
                treeSet = new TreeSet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            q((h) it.next());
        }
    }

    @Override // q3.InterfaceC8980a
    public final synchronized long c(String str, long j11, long j12) {
        long j13;
        long j14 = j12 == -1 ? Long.MAX_VALUE : j11 + j12;
        long j15 = j14 >= 0 ? j14 : Long.MAX_VALUE;
        long j16 = j11;
        j13 = 0;
        while (j16 < j15) {
            long d11 = d(str, j16, j15 - j16);
            if (d11 > 0) {
                j13 += d11;
            } else {
                d11 = -d11;
            }
            j16 += d11;
        }
        return j13;
    }

    @Override // q3.InterfaceC8980a
    public final synchronized long d(String str, long j11, long j12) {
        j d11;
        if (j12 == -1) {
            j12 = Long.MAX_VALUE;
        }
        d11 = this.f81487c.d(str);
        return d11 != null ? d11.c(j11, j12) : -j12;
    }

    public final synchronized void h(String str, l lVar) throws InterfaceC8980a.C1373a {
        i();
        this.f81487c.c(str, lVar);
        try {
            this.f81487c.k();
        } catch (IOException e11) {
            throw new InterfaceC8980a.C1373a(e11);
        }
    }

    public final synchronized void i() throws InterfaceC8980a.C1373a {
        InterfaceC8980a.C1373a c1373a = this.f81493i;
        if (c1373a != null) {
            throw c1373a;
        }
    }

    public final synchronized void j(File file, long j11) throws InterfaceC8980a.C1373a {
        if (file.exists()) {
            if (j11 == 0) {
                file.delete();
                return;
            }
            r b11 = r.b(file, j11, -9223372036854775807L, this.f81487c);
            b11.getClass();
            j d11 = this.f81487c.d(b11.f81434a);
            d11.getClass();
            G10.a.h(d11.h(b11.f81435b, b11.f81436c));
            long c11 = d11.d().c();
            if (c11 != -1) {
                G10.a.h(b11.f81435b + b11.f81436c <= c11);
            }
            if (this.f81488d != null) {
                try {
                    this.f81488d.e(file.getName(), b11.f81436c, b11.f81439f);
                } catch (IOException e11) {
                    throw new InterfaceC8980a.C1373a(e11);
                }
            }
            g(b11);
            try {
                this.f81487c.k();
                notifyAll();
            } catch (IOException e12) {
                throw new InterfaceC8980a.C1373a(e12);
            }
        }
    }

    public final synchronized boolean m(long j11, String str) {
        boolean z11;
        j d11 = this.f81487c.d(str);
        if (d11 != null) {
            z11 = d11.c(0L, j11) >= j11;
        }
        return z11;
    }

    public final synchronized void o(h hVar) {
        j d11 = this.f81487c.d(hVar.f81434a);
        d11.getClass();
        d11.m(hVar.f81435b);
        this.f81487c.i(d11.f81451b);
        notifyAll();
    }

    public final synchronized void p(h hVar) {
        q(hVar);
    }

    public final synchronized File s(String str, long j11, long j12) throws InterfaceC8980a.C1373a {
        j d11;
        File file;
        try {
            i();
            d11 = this.f81487c.d(str);
            d11.getClass();
            G10.a.h(d11.h(j11, j12));
            if (!this.f81485a.exists()) {
                k(this.f81485a);
                r();
            }
            this.f81486b.d(this, j12);
            file = new File(this.f81485a, Integer.toString(this.f81490f.nextInt(10)));
            if (!file.exists()) {
                k(file);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return r.c(file, d11.f81450a, j11, System.currentTimeMillis());
    }

    public final synchronized h t(String str, long j11, long j12) throws InterfaceC8980a.C1373a {
        String str2;
        long j13;
        r e11;
        i();
        j d11 = this.f81487c.d(str);
        if (d11 != null) {
            str2 = str;
            j13 = j11;
            while (true) {
                e11 = d11.e(j13, j12);
                if (!e11.f81437d) {
                    break;
                }
                File file = e11.f81438e;
                file.getClass();
                if (file.length() == e11.f81436c) {
                    break;
                }
                r();
            }
        } else {
            str2 = str;
            j13 = j11;
            e11 = new r(str2, j13, j12, -9223372036854775807L, null);
        }
        if (e11.f81437d) {
            return u(str2, e11);
        }
        if (this.f81487c.g(str2).j(j13, e11.f81436c)) {
            return e11;
        }
        return null;
    }
}
