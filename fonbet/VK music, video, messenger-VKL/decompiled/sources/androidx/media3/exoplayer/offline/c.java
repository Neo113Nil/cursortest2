package androidx.media3.exoplayer.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.offline.a;
import androidx.media3.exoplayer.offline.c;
import androidx.media3.exoplayer.offline.d;
import androidx.media3.exoplayer.scheduler.Requirements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.ahn;
import xsna.d9o;
import xsna.fco;
import xsna.fxc0;
import xsna.h5s;
import xsna.n9o;
import xsna.o7o;
import xsna.t8g0;
import xsna.y2r0;
import xsna.z8o;

/* compiled from: DownloadManager.java */
/* loaded from: classes.dex */
public final class c {
    public static final Requirements q = new Requirements(1);
    public final Context a;
    public final androidx.media3.exoplayer.offline.a b;
    public final Handler c;
    public final b d;
    public final z8o e;
    public int g;
    public int h;
    public boolean i;
    public int m;
    public boolean n;
    public t8g0 p;
    public int k = 3;
    public int l = 5;
    public boolean j = true;
    public List<o7o> o = Collections.EMPTY_LIST;
    public final CopyOnWriteArraySet<InterfaceC0061c> f = new CopyOnWriteArraySet<>();

    /* compiled from: DownloadManager.java */
    /* loaded from: classes12.dex */
    public static final class a {
        public final o7o a;
        public final boolean b;
        public final ArrayList c;

        @Nullable
        public final Exception d;

        public a(o7o o7oVar, boolean z, ArrayList arrayList, @Nullable Exception exc) {
            this.a = o7oVar;
            this.b = z;
            this.c = arrayList;
            this.d = exc;
        }
    }

    /* compiled from: DownloadManager.java */
    public static final class b extends Handler {
        public boolean a;
        public final HandlerThread b;
        public final androidx.media3.exoplayer.offline.a c;
        public final fco d;
        public final Handler e;
        public final ArrayList<o7o> f;
        public final HashMap<String, d> g;
        public int h;
        public boolean i;
        public int j;
        public int k;
        public int l;
        public boolean m;

        public b(HandlerThread handlerThread, androidx.media3.exoplayer.offline.a aVar, fco fcoVar, Handler handler, int i, int i2, boolean z) {
            super(handlerThread.getLooper());
            this.b = handlerThread;
            this.c = aVar;
            this.d = fcoVar;
            this.e = handler;
            this.j = i;
            this.k = i2;
            this.i = z;
            this.f = new ArrayList<>();
            this.g = new HashMap<>();
        }

        public static o7o a(o7o o7oVar, int i, int i2) {
            return new o7o(o7oVar.a, i, o7oVar.c, System.currentTimeMillis(), o7oVar.e, i2, 0, o7oVar.h);
        }

        @Nullable
        public final o7o b(String str, boolean z) {
            int c = c(str);
            if (c != -1) {
                return this.f.get(c);
            }
            if (!z) {
                return null;
            }
            try {
                return this.c.b(str);
            } catch (IOException e) {
                ahn.o("DownloadManager", "Failed to load download: " + str, e);
                return null;
            }
        }

        public final int c(String str) {
            int i = 0;
            while (true) {
                ArrayList<o7o> arrayList = this.f;
                if (i >= arrayList.size()) {
                    return -1;
                }
                if (arrayList.get(i).a.b.equals(str)) {
                    return i;
                }
                i++;
            }
        }

        public final void d(o7o o7oVar) {
            int i = o7oVar.b;
            fxc0.z((i == 3 || i == 4) ? false : true);
            int c = c(o7oVar.a.b);
            ArrayList<o7o> arrayList = this.f;
            if (c == -1) {
                arrayList.add(o7oVar);
                Collections.sort(arrayList, new d9o(0));
            } else {
                boolean z = o7oVar.c != arrayList.get(c).c;
                arrayList.set(c, o7oVar);
                if (z) {
                    Collections.sort(arrayList, new d9o(0));
                }
            }
            try {
                this.c.d(o7oVar);
            } catch (IOException e) {
                ahn.o("DownloadManager", "Failed to update index.", e);
            }
            this.e.obtainMessage(3, new a(o7oVar, false, new ArrayList(arrayList), null)).sendToTarget();
        }

        public final o7o e(o7o o7oVar, int i, int i2) {
            fxc0.z((i == 3 || i == 4) ? false : true);
            o7o a = a(o7oVar, i, i2);
            d(a);
            return a;
        }

        public final void f(o7o o7oVar, int i) {
            if (i == 0) {
                if (o7oVar.b == 1) {
                    e(o7oVar, 0, 0);
                }
            } else if (i != o7oVar.f) {
                int i2 = o7oVar.b;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                d(new o7o(o7oVar.a, i2, o7oVar.c, System.currentTimeMillis(), o7oVar.e, i, 0, o7oVar.h));
            }
        }

        public final void g() {
            int i = 0;
            int i2 = 0;
            while (true) {
                ArrayList<o7o> arrayList = this.f;
                if (i >= arrayList.size()) {
                    return;
                }
                o7o o7oVar = arrayList.get(i);
                DownloadRequest downloadRequest = o7oVar.a;
                String str = downloadRequest.b;
                HashMap<String, d> hashMap = this.g;
                d dVar = hashMap.get(str);
                int i3 = o7oVar.b;
                fco fcoVar = this.d;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            dVar.getClass();
                            fxc0.z(!dVar.e);
                            if (this.i || this.h != 0 || i2 >= this.j) {
                                e(o7oVar, 0, 0);
                                dVar.f(false);
                            }
                        } else {
                            if (i3 != 5 && i3 != 7) {
                                throw new IllegalStateException();
                            }
                            if (dVar != null) {
                                if (!dVar.e) {
                                    dVar.f(false);
                                }
                            } else if (!this.m) {
                                d dVar2 = new d(o7oVar.a, fcoVar.a(downloadRequest), o7oVar.h, true, this.k, this);
                                hashMap.put(downloadRequest.b, dVar2);
                                this.m = true;
                                dVar2.start();
                            }
                        }
                    } else if (dVar != null) {
                        fxc0.z(!dVar.e);
                        dVar.f(false);
                    }
                } else if (dVar != null) {
                    fxc0.z(!dVar.e);
                    dVar.f(false);
                } else if (this.i || this.h != 0 || this.l >= this.j) {
                    dVar = null;
                } else {
                    o7o e = e(o7oVar, 2, 0);
                    DownloadRequest downloadRequest2 = e.a;
                    d dVar3 = new d(e.a, fcoVar.a(downloadRequest2), e.h, false, this.k, this);
                    hashMap.put(downloadRequest2.b, dVar3);
                    int i4 = this.l;
                    this.l = i4 + 1;
                    if (i4 == 0) {
                        sendEmptyMessageDelayed(12, 5000L);
                    }
                    dVar3.start();
                    dVar = dVar3;
                }
                if (dVar != null && !dVar.e) {
                    i2++;
                }
                i++;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            r10 = 0;
            int i = 0;
            switch (message.what) {
                case 1:
                    a.C0060a c0060a = null;
                    int i2 = message.arg1;
                    androidx.media3.exoplayer.offline.a aVar = this.c;
                    ArrayList<o7o> arrayList = this.f;
                    this.h = i2;
                    try {
                        try {
                            aVar.f();
                            c0060a = aVar.g(0, 1, 2, 5, 7);
                            while (c0060a.moveToNext()) {
                                arrayList.add(androidx.media3.exoplayer.offline.a.l(c0060a.b));
                            }
                        } finally {
                            y2r0.h(c0060a);
                        }
                    } catch (IOException e) {
                        ahn.o("DownloadManager", "Failed to load index.", e);
                        arrayList.clear();
                    }
                    this.e.obtainMessage(1, new ArrayList(arrayList)).sendToTarget();
                    g();
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 2:
                    this.i = message.arg1 != 0;
                    g();
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 3:
                    this.h = message.arg1;
                    g();
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 4:
                    String str = (String) message.obj;
                    int i3 = message.arg1;
                    androidx.media3.exoplayer.offline.a aVar2 = this.c;
                    ArrayList<o7o> arrayList2 = this.f;
                    if (str == null) {
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            f(arrayList2.get(i4), i3);
                        }
                        try {
                            aVar2.h(i3);
                        } catch (IOException e2) {
                            ahn.o("DownloadManager", "Failed to set manual stop reason", e2);
                        }
                    } else {
                        o7o b = b(str, false);
                        if (b != null) {
                            f(b, i3);
                        } else {
                            try {
                                aVar2.c(i3, str);
                            } catch (IOException e3) {
                                ahn.o("DownloadManager", "Failed to set manual stop reason: ".concat(str), e3);
                            }
                        }
                    }
                    g();
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 5:
                    this.j = message.arg1;
                    g();
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 6:
                    this.k = message.arg1;
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 7:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i5 = message.arg1;
                    o7o b2 = b(downloadRequest.b, true);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (b2 != null) {
                        int i6 = b2.b;
                        d(new o7o(b2.a.a(downloadRequest), (i6 == 5 || i6 == 7) ? 7 : i5 != 0 ? 1 : 0, (i6 == 5 || b2.c()) ? currentTimeMillis : b2.c, currentTimeMillis, i5));
                    } else {
                        d(new o7o(downloadRequest, i5 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, i5));
                    }
                    g();
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 8:
                    String str2 = (String) message.obj;
                    o7o b3 = b(str2, true);
                    if (b3 == null) {
                        ahn.n("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        e(b3, 5, 0);
                        g();
                    }
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 9:
                    androidx.media3.exoplayer.offline.a aVar3 = this.c;
                    ArrayList<o7o> arrayList3 = this.f;
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        a.C0060a g = aVar3.g(3, 4);
                        while (g.moveToNext()) {
                            try {
                                arrayList4.add(androidx.media3.exoplayer.offline.a.l(g.b));
                            } finally {
                            }
                        }
                        g.close();
                    } catch (IOException unused) {
                        ahn.n("DownloadManager", "Failed to load downloads.");
                    }
                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                        arrayList3.set(i7, a(arrayList3.get(i7), 5, 0));
                    }
                    for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                        arrayList3.add(a((o7o) arrayList4.get(i8), 5, 0));
                    }
                    Collections.sort(arrayList3, new d9o(0));
                    try {
                        aVar3.e();
                    } catch (IOException e4) {
                        ahn.o("DownloadManager", "Failed to update index.", e4);
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList3);
                    for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                        this.e.obtainMessage(3, new a(arrayList3.get(i9), false, arrayList5, null)).sendToTarget();
                    }
                    g();
                    i = 1;
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 10:
                    d dVar = (d) message.obj;
                    Handler handler = this.e;
                    androidx.media3.exoplayer.offline.a aVar4 = this.c;
                    ArrayList<o7o> arrayList6 = this.f;
                    String str3 = dVar.b.b;
                    this.g.remove(str3);
                    boolean z = dVar.e;
                    if (z) {
                        this.m = false;
                    } else {
                        int i10 = this.l - 1;
                        this.l = i10;
                        if (i10 == 0) {
                            removeMessages(12);
                        }
                    }
                    if (dVar.h) {
                        g();
                    } else {
                        Exception exc = dVar.i;
                        if (exc != null) {
                            ahn.o("DownloadManager", "Task failed: " + dVar.b + ", " + z, exc);
                        }
                        o7o b4 = b(str3, false);
                        b4.getClass();
                        int i11 = b4.b;
                        if (i11 == 2) {
                            fxc0.z(!z);
                            o7o o7oVar = new o7o(b4.a, exc == null ? 3 : 4, b4.c, System.currentTimeMillis(), b4.e, b4.f, exc == null ? 0 : 1, b4.h);
                            arrayList6.remove(c(o7oVar.a.b));
                            try {
                                aVar4.d(o7oVar);
                            } catch (IOException e5) {
                                ahn.o("DownloadManager", "Failed to update index.", e5);
                            }
                            handler.obtainMessage(3, new a(o7oVar, false, new ArrayList(arrayList6), exc)).sendToTarget();
                        } else {
                            if (i11 != 5 && i11 != 7) {
                                throw new IllegalStateException();
                            }
                            fxc0.z(z);
                            DownloadRequest downloadRequest2 = b4.a;
                            if (i11 == 7) {
                                int i12 = b4.f;
                                e(b4, i12 == 0 ? 0 : 1, i12);
                                g();
                            } else {
                                arrayList6.remove(c(downloadRequest2.b));
                                try {
                                    aVar4.a(downloadRequest2.b);
                                } catch (IOException unused2) {
                                    ahn.n("DownloadManager", "Failed to remove from database");
                                }
                                handler.obtainMessage(3, new a(b4, true, new ArrayList(arrayList6), null)).sendToTarget();
                            }
                        }
                        g();
                    }
                    this.e.obtainMessage(2, i, this.g.size()).sendToTarget();
                    return;
                case 11:
                    d dVar2 = (d) message.obj;
                    long i0 = y2r0.i0(message.arg1, message.arg2);
                    o7o b5 = b(dVar2.b.b, false);
                    b5.getClass();
                    if (i0 == b5.e || i0 == -1) {
                        return;
                    }
                    d(new o7o(b5.a, b5.b, b5.c, System.currentTimeMillis(), i0, b5.f, b5.g, b5.h));
                    return;
                case 12:
                    ArrayList<o7o> arrayList7 = this.f;
                    for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                        o7o o7oVar2 = arrayList7.get(i13);
                        if (o7oVar2.b == 2) {
                            try {
                                this.c.d(o7oVar2);
                            } catch (IOException e6) {
                                ahn.o("DownloadManager", "Failed to update index.", e6);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(12, 5000L);
                    return;
                case 13:
                    Iterator<d> it = this.g.values().iterator();
                    while (it.hasNext()) {
                        it.next().f(true);
                    }
                    try {
                        this.c.f();
                    } catch (IOException e7) {
                        ahn.o("DownloadManager", "Failed to update index.", e7);
                    }
                    this.f.clear();
                    this.b.quit();
                    synchronized (this) {
                        this.a = true;
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* compiled from: DownloadManager.java */
    /* loaded from: classes12.dex */
    public static class d extends Thread implements d.a {
        public final DownloadRequest b;
        public final androidx.media3.exoplayer.offline.d c;
        public final n9o d;
        public final boolean e;
        public final int f;

        @Nullable
        public volatile b g;
        public volatile boolean h;

        @Nullable
        public Exception i;
        public long j = -1;

        public d(DownloadRequest downloadRequest, androidx.media3.exoplayer.offline.d dVar, n9o n9oVar, boolean z, int i, b bVar) {
            this.b = downloadRequest;
            this.c = dVar;
            this.d = n9oVar;
            this.e = z;
            this.f = i;
            this.g = bVar;
        }

        @Override // androidx.media3.exoplayer.offline.d.a
        public final void b(long j, long j2, float f) {
            this.d.a = j2;
            this.d.b = f;
            if (j != this.j) {
                this.j = j;
                b bVar = this.g;
                if (bVar != null) {
                    bVar.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }

        public final void f(boolean z) {
            if (z) {
                this.g = null;
            }
            if (this.h) {
                return;
            }
            this.h = true;
            this.c.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.e) {
                    this.c.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.h) {
                        try {
                            this.c.a(this);
                            break;
                        } catch (IOException e) {
                            if (!this.h) {
                                long j2 = this.d.a;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                int i2 = i + 1;
                                if (i2 > this.f) {
                                    throw e;
                                }
                                Thread.sleep(Math.min(i * 1000, 5000));
                                i = i2;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.i = e2;
            }
            b bVar = this.g;
            if (bVar != null) {
                bVar.obtainMessage(10, this).sendToTarget();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [xsna.t8g0$b, xsna.z8o] */
    public c(Context context, androidx.media3.exoplayer.offline.a aVar, fco fcoVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
        Handler p = y2r0.p(new Handler.Callback() { // from class: xsna.y8o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                androidx.media3.exoplayer.offline.c cVar = androidx.media3.exoplayer.offline.c.this;
                CopyOnWriteArraySet<c.InterfaceC0061c> copyOnWriteArraySet = cVar.f;
                int i = message.what;
                if (i == 1) {
                    List list = (List) message.obj;
                    cVar.i = true;
                    cVar.o = Collections.unmodifiableList(list);
                    boolean j = cVar.j();
                    Iterator<c.InterfaceC0061c> it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        it.next().f(cVar);
                    }
                    if (j) {
                        cVar.b();
                    }
                } else if (i == 2) {
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    int i4 = cVar.g - i2;
                    cVar.g = i4;
                    cVar.h = i3;
                    if (i3 != 0 || i4 != 0) {
                        return true;
                    }
                    Iterator<c.InterfaceC0061c> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().b();
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    c.a aVar2 = (c.a) message.obj;
                    cVar.o = Collections.unmodifiableList(aVar2.c);
                    o7o o7oVar = aVar2.a;
                    boolean j2 = cVar.j();
                    if (aVar2.b) {
                        Iterator<c.InterfaceC0061c> it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            it3.next().a(o7oVar);
                        }
                    } else {
                        Iterator<c.InterfaceC0061c> it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            it4.next().e(cVar, o7oVar, aVar2.d);
                        }
                    }
                    if (j2) {
                        cVar.b();
                        return true;
                    }
                }
                return true;
            }
        });
        this.c = p;
        b bVar = new b(h5s.a("ExoPlayer:DownloadManager"), aVar, fcoVar, p, this.k, this.l, this.j);
        this.d = bVar;
        ?? r12 = new t8g0.b() { // from class: xsna.z8o
            @Override // xsna.t8g0.b
            public final void a(t8g0 t8g0Var, int i) {
                androidx.media3.exoplayer.offline.c.this.c(t8g0Var, i);
            }
        };
        this.e = r12;
        t8g0 t8g0Var = new t8g0(context, r12, q);
        this.p = t8g0Var;
        int b2 = t8g0Var.b();
        this.m = b2;
        this.g = 1;
        bVar.obtainMessage(1, b2, 0).sendToTarget();
    }

    public final void a(DownloadRequest downloadRequest, int i) {
        this.g++;
        this.d.obtainMessage(7, i, 0, downloadRequest).sendToTarget();
    }

    public final void b() {
        Iterator<InterfaceC0061c> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c(this, this.n);
        }
    }

    public final void c(t8g0 t8g0Var, int i) {
        Requirements requirements = t8g0Var.c;
        if (this.m != i) {
            this.m = i;
            this.g++;
            this.d.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean j = j();
        Iterator<InterfaceC0061c> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        if (j) {
            b();
        }
    }

    public final void d() {
        synchronized (this.d) {
            try {
                b bVar = this.d;
                if (bVar.a) {
                    return;
                }
                bVar.sendEmptyMessage(13);
                boolean z = false;
                while (true) {
                    b bVar2 = this.d;
                    if (bVar2.a) {
                        break;
                    }
                    try {
                        bVar2.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                this.c.removeCallbacksAndMessages(null);
                this.p.c();
                this.o = Collections.EMPTY_LIST;
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = 0;
                this.n = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        this.g++;
        this.d.obtainMessage(9).sendToTarget();
    }

    public final void f(String str) {
        this.g++;
        this.d.obtainMessage(8, str).sendToTarget();
    }

    public final void g(boolean z) {
        if (this.j == z) {
            return;
        }
        this.j = z;
        this.g++;
        this.d.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        boolean j = j();
        Iterator<InterfaceC0061c> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (j) {
            b();
        }
    }

    public final void h(Requirements requirements) {
        if (requirements.equals(this.p.c)) {
            return;
        }
        this.p.c();
        t8g0 t8g0Var = new t8g0(this.a, this.e, requirements);
        this.p = t8g0Var;
        c(this.p, t8g0Var.b());
    }

    public final void i(int i, @Nullable String str) {
        this.g++;
        this.d.obtainMessage(4, i, 0, str).sendToTarget();
    }

    public final boolean j() {
        boolean z;
        if (!this.j && this.m != 0) {
            for (int i = 0; i < this.o.size(); i++) {
                if (this.o.get(i).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.n != z;
        this.n = z;
        return z2;
    }

    /* compiled from: DownloadManager.java */
    /* renamed from: androidx.media3.exoplayer.offline.c$c, reason: collision with other inner class name */
    public interface InterfaceC0061c {
        default void b() {
        }

        default void d() {
        }

        default void a(o7o o7oVar) {
        }

        default void f(c cVar) {
        }

        default void c(c cVar, boolean z) {
        }

        default void e(c cVar, o7o o7oVar, @Nullable Exception exc) {
        }
    }
}
