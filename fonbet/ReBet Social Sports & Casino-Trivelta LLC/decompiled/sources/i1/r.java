package i1;

import android.os.ConditionVariable;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import g1.InterfaceC4315b;
import i1.InterfaceC4517a;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public final class r implements InterfaceC4517a {

    /* renamed from: l, reason: collision with root package name */
    public static final HashSet f47999l = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final File f48000a;

    /* renamed from: b, reason: collision with root package name */
    public final d f48001b;

    /* renamed from: c, reason: collision with root package name */
    public final k f48002c;

    /* renamed from: d, reason: collision with root package name */
    public final f f48003d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f48004e;

    /* renamed from: f, reason: collision with root package name */
    public final Random f48005f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f48006g;

    /* renamed from: h, reason: collision with root package name */
    public long f48007h;

    /* renamed from: i, reason: collision with root package name */
    public long f48008i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f48009j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC4517a.C0721a f48010k;

    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f48011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f48011a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (r.this) {
                this.f48011a.open();
                r.this.p();
                r.this.f48001b.f();
            }
        }
    }

    public r(File file, d dVar, InterfaceC4315b interfaceC4315b) {
        this(file, dVar, interfaceC4315b, null, false, false);
    }

    public static void m(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC4156x.d("SimpleCache", str);
        throw new InterfaceC4517a.C0721a(str);
    }

    public static long n(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static long r(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return w(name);
                } catch (NumberFormatException unused) {
                    AbstractC4156x.d("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized boolean s(File file) {
        boolean add;
        synchronized (r.class) {
            add = f47999l.add(file.getAbsoluteFile());
        }
        return add;
    }

    public static long w(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    @Override // i1.InterfaceC4517a
    public synchronized File a(String str, long j10, long j11) {
        Throwable th2;
        try {
            try {
                AbstractC4134a.g(!this.f48009j);
                l();
                j f10 = this.f48002c.f(str);
                AbstractC4134a.e(f10);
                AbstractC4134a.g(f10.g(j10, j11));
                if (!this.f48000a.exists()) {
                    try {
                        m(this.f48000a);
                        y();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f48001b.c(this, str, j10, j11);
                File file = new File(this.f48000a, Integer.toString(this.f48005f.nextInt(10)));
                if (!file.exists()) {
                    m(file);
                }
                return s.i(file, f10.f47966a, j10, System.currentTimeMillis());
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // i1.InterfaceC4517a
    public synchronized l b(String str) {
        AbstractC4134a.g(!this.f48009j);
        return this.f48002c.h(str);
    }

    @Override // i1.InterfaceC4517a
    public synchronized void c(i iVar) {
        AbstractC4134a.g(!this.f48009j);
        j jVar = (j) AbstractC4134a.e(this.f48002c.f(iVar.f47960a));
        jVar.l(iVar.f47961b);
        this.f48002c.n(jVar.f47967b);
        notifyAll();
    }

    @Override // i1.InterfaceC4517a
    public synchronized i d(String str, long j10, long j11) {
        try {
            try {
                AbstractC4134a.g(!this.f48009j);
                l();
                s o10 = o(str, j10, j11);
                if (o10.f47963d) {
                    return z(str, o10);
                }
                if (this.f48002c.k(str).i(j10, o10.f47962c)) {
                    return o10;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // i1.InterfaceC4517a
    public synchronized void e(String str, m mVar) {
        AbstractC4134a.g(!this.f48009j);
        l();
        this.f48002c.d(str, mVar);
        try {
            this.f48002c.q();
        } catch (IOException e10) {
            throw new InterfaceC4517a.C0721a(e10);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:? -> B:12:0x001e). Please report as a decompilation issue!!! */
    @Override // i1.InterfaceC4517a
    public synchronized i f(String str, long j10, long j11) {
        try {
            AbstractC4134a.g(!this.f48009j);
            l();
            while (true) {
                i d10 = d(str, j10, j11);
                long j12 = j11;
                long j13 = j10;
                String str2 = str;
                if (d10 != null) {
                    return d10;
                }
                try {
                    wait();
                    str = str2;
                    j10 = j13;
                    j11 = j12;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // i1.InterfaceC4517a
    public synchronized void g(i iVar) {
        AbstractC4134a.g(!this.f48009j);
        x(iVar);
    }

    @Override // i1.InterfaceC4517a
    public synchronized void h(File file, long j10) {
        boolean z10 = true;
        AbstractC4134a.g(!this.f48009j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            s sVar = (s) AbstractC4134a.e(s.f(file, j10, this.f48002c));
            j jVar = (j) AbstractC4134a.e(this.f48002c.f(sVar.f47960a));
            AbstractC4134a.g(jVar.g(sVar.f47961b, sVar.f47962c));
            long b10 = l.b(jVar.c());
            if (b10 != -1) {
                if (sVar.f47961b + sVar.f47962c > b10) {
                    z10 = false;
                }
                AbstractC4134a.g(z10);
            }
            if (this.f48003d != null) {
                try {
                    this.f48003d.h(file.getName(), sVar.f47962c, sVar.f47965f);
                } catch (IOException e10) {
                    throw new InterfaceC4517a.C0721a(e10);
                }
            }
            k(sVar);
            try {
                this.f48002c.q();
                notifyAll();
            } catch (IOException e11) {
                throw new InterfaceC4517a.C0721a(e11);
            }
        }
    }

    public final void k(s sVar) {
        this.f48002c.k(sVar.f47960a).a(sVar);
        this.f48008i += sVar.f47962c;
        t(sVar);
    }

    public synchronized void l() {
        InterfaceC4517a.C0721a c0721a = this.f48010k;
        if (c0721a != null) {
            throw c0721a;
        }
    }

    public final s o(String str, long j10, long j11) {
        s d10;
        j f10 = this.f48002c.f(str);
        if (f10 == null) {
            return s.g(str, j10, j11);
        }
        while (true) {
            d10 = f10.d(j10, j11);
            if (!d10.f47963d || ((File) AbstractC4134a.e(d10.f47964e)).length() == d10.f47962c) {
                break;
            }
            y();
        }
        return d10;
    }

    public final void p() {
        if (!this.f48000a.exists()) {
            try {
                m(this.f48000a);
            } catch (InterfaceC4517a.C0721a e10) {
                this.f48010k = e10;
                return;
            }
        }
        File[] listFiles = this.f48000a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.f48000a;
            AbstractC4156x.d("SimpleCache", str);
            this.f48010k = new InterfaceC4517a.C0721a(str);
            return;
        }
        long r10 = r(listFiles);
        this.f48007h = r10;
        if (r10 == -1) {
            try {
                this.f48007h = n(this.f48000a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f48000a;
                AbstractC4156x.e("SimpleCache", str2, e11);
                this.f48010k = new InterfaceC4517a.C0721a(str2, e11);
                return;
            }
        }
        try {
            this.f48002c.l(this.f48007h);
            f fVar = this.f48003d;
            if (fVar != null) {
                fVar.e(this.f48007h);
                Map b10 = this.f48003d.b();
                q(this.f48000a, true, listFiles, b10);
                this.f48003d.g(b10.keySet());
            } else {
                q(this.f48000a, true, listFiles, null);
            }
            this.f48002c.p();
            try {
                this.f48002c.q();
            } catch (IOException e12) {
                AbstractC4156x.e("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + this.f48000a;
            AbstractC4156x.e("SimpleCache", str3, e13);
            this.f48010k = new InterfaceC4517a.C0721a(str3, e13);
        }
    }

    public final void q(File file, boolean z10, File[] fileArr, Map map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                q(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!k.m(name) && !name.endsWith(".uid"))) {
                e eVar = map != null ? (e) map.remove(name) : null;
                if (eVar != null) {
                    j10 = eVar.f47955a;
                    j11 = eVar.f47956b;
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                }
                s e10 = s.e(file2, j10, j11, this.f48002c);
                if (e10 != null) {
                    k(e10);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void t(s sVar) {
        ArrayList arrayList = (ArrayList) this.f48004e.get(sVar.f47960a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC4517a.b) arrayList.get(size)).a(this, sVar);
            }
        }
        this.f48001b.a(this, sVar);
    }

    public final void u(i iVar) {
        ArrayList arrayList = (ArrayList) this.f48004e.get(iVar.f47960a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC4517a.b) arrayList.get(size)).b(this, iVar);
            }
        }
        this.f48001b.b(this, iVar);
    }

    public final void v(s sVar, i iVar) {
        ArrayList arrayList = (ArrayList) this.f48004e.get(sVar.f47960a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC4517a.b) arrayList.get(size)).e(this, sVar, iVar);
            }
        }
        this.f48001b.e(this, sVar, iVar);
    }

    public final void x(i iVar) {
        j f10 = this.f48002c.f(iVar.f47960a);
        if (f10 == null || !f10.j(iVar)) {
            return;
        }
        this.f48008i -= iVar.f47962c;
        if (this.f48003d != null) {
            String name = ((File) AbstractC4134a.e(iVar.f47964e)).getName();
            try {
                this.f48003d.f(name);
            } catch (IOException unused) {
                AbstractC4156x.i("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.f48002c.n(f10.f47967b);
        u(iVar);
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f48002c.g().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((j) it.next()).e().iterator();
            while (it2.hasNext()) {
                i iVar = (i) it2.next();
                if (((File) AbstractC4134a.e(iVar.f47964e)).length() != iVar.f47962c) {
                    arrayList.add(iVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x((i) arrayList.get(i10));
        }
    }

    public final s z(String str, s sVar) {
        boolean z10;
        if (!this.f48006g) {
            return sVar;
        }
        String name = ((File) AbstractC4134a.e(sVar.f47964e)).getName();
        long j10 = sVar.f47962c;
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = this.f48003d;
        if (fVar != null) {
            try {
                fVar.h(name, j10, currentTimeMillis);
            } catch (IOException unused) {
                AbstractC4156x.i("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z10 = false;
        } else {
            z10 = true;
        }
        s k10 = ((j) AbstractC4134a.e(this.f48002c.f(str))).k(sVar, currentTimeMillis, z10);
        v(sVar, k10);
        return k10;
    }

    public r(File file, d dVar, InterfaceC4315b interfaceC4315b, byte[] bArr, boolean z10, boolean z11) {
        this(file, dVar, new k(interfaceC4315b, file, bArr, z10, z11), (interfaceC4315b == null || z11) ? null : new f(interfaceC4315b));
    }

    public r(File file, d dVar, k kVar, f fVar) {
        if (s(file)) {
            this.f48000a = file;
            this.f48001b = dVar;
            this.f48002c = kVar;
            this.f48003d = fVar;
            this.f48004e = new HashMap();
            this.f48005f = new Random();
            this.f48006g = dVar.d();
            this.f48007h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
