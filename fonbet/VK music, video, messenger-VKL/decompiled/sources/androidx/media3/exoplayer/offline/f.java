package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.d;
import androidx.media3.exoplayer.upstream.c;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import xsna.bsg0;
import xsna.c5i0;
import xsna.ddk;
import xsna.dy8;
import xsna.e5i0;
import xsna.evk;
import xsna.fxc0;
import xsna.kr10;
import xsna.uer;
import xsna.xw8;
import xsna.y2r0;
import xsna.zhn0;

/* compiled from: SegmentDownloader.java */
/* loaded from: classes12.dex */
public abstract class f<M extends uer<M>> implements androidx.media3.exoplayer.offline.d {
    public final long a;
    public final long b;
    public final evk c;
    public final c.a<M> d;
    public final ArrayList<StreamKey> e;
    public final a.b f;
    public final Cache g;
    public final xw8 h;

    @Nullable
    public final PriorityTaskManager i;
    public final Executor j;
    public final long k;
    public final ArrayList<bsg0<?, ?>> l;
    public volatile boolean m;

    /* compiled from: SegmentDownloader.java */
    public static abstract class a<M extends uer<M>> implements e5i0 {
        public final a.b a;
        public c.a<M> b;
        public long d;
        public Executor c = new ddk();
        public long e = C.TIME_UNSET;

        public a(a.b bVar, c.a<M> aVar) {
            this.a = bVar;
            this.b = aVar;
        }
    }

    /* compiled from: SegmentDownloader.java */
    public static final class b implements dy8.a {
        public final d.a b;
        public final long c;
        public final int d;
        public long e;
        public int f;

        public b(d.a aVar, long j, int i, long j2, int i2) {
            this.b = aVar;
            this.c = j;
            this.d = i;
            this.e = j2;
            this.f = i2;
        }

        @Override // xsna.dy8.a
        public final void a(long j, long j2, long j3) {
            long j4 = this.e + j3;
            this.e = j4;
            this.b.b(this.c, j4, b());
        }

        public final float b() {
            long j = this.c;
            if (j != -1 && j != 0) {
                return y2r0.W(this.e, j);
            }
            int i = this.d;
            if (i != 0) {
                return y2r0.W(this.f, i);
            }
            return -1.0f;
        }
    }

    /* compiled from: SegmentDownloader.java */
    public static class c implements Comparable<c> {
        public final long b;
        public final evk c;

        public c(long j, evk evkVar) {
            this.b = j;
            this.c = evkVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Long.compare(this.b, cVar.b);
        }
    }

    /* compiled from: SegmentDownloader.java */
    public static final class d extends bsg0<Void, IOException> {
        public final c i;
        public final androidx.media3.datasource.cache.a j;

        @Nullable
        public final b k;
        public final byte[] l;
        public final dy8 m;

        public d(c cVar, androidx.media3.datasource.cache.a aVar, @Nullable b bVar, byte[] bArr) {
            this.i = cVar;
            this.j = aVar;
            this.k = bVar;
            this.l = bArr;
            this.m = new dy8(aVar, cVar.c, bArr, bVar);
        }

        @Override // xsna.bsg0
        public final void b() {
            this.m.j = true;
        }

        @Override // xsna.bsg0
        public final Void c() throws Exception {
            this.m.a();
            b bVar = this.k;
            if (bVar == null) {
                return null;
            }
            bVar.f++;
            bVar.b.b(bVar.c, bVar.e, bVar.b());
            return null;
        }
    }

    public f(kr10 kr10Var, c.a aVar, a.b bVar, Executor executor, long j, long j2) {
        kr10.f fVar = kr10Var.b;
        fVar.getClass();
        this.c = d(fVar.a);
        this.d = aVar;
        this.e = new ArrayList<>(fVar.c);
        this.f = bVar;
        this.j = executor;
        this.a = j;
        this.b = j2;
        Cache cache = bVar.a;
        cache.getClass();
        this.g = cache;
        this.h = bVar.c;
        this.i = bVar.f;
        this.l = new ArrayList<>();
        this.k = y2r0.S(20000L);
    }

    public static evk d(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        fxc0.t(uri, "The uri must be set.");
        return new evk(uri, 0L, 1, null, map, 0L, -1L, null, 1, null);
    }

    public static void f(List<c> list, xw8 xw8Var, long j) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            c cVar = list.get(i2);
            evk evkVar = cVar.c;
            String k = xw8Var.k(evkVar);
            Integer num = (Integer) hashMap.get(k);
            c cVar2 = num == null ? null : list.get(num.intValue());
            if (cVar2 != null) {
                long j2 = cVar2.b;
                evk evkVar2 = cVar2.c;
                if (cVar.b <= j2 + j) {
                    Uri uri = evkVar2.a;
                    long j3 = evkVar2.h;
                    if (uri.equals(evkVar.a)) {
                        if (j3 != -1 && evkVar2.g + j3 == evkVar.g && Objects.equals(evkVar2.i, evkVar.i) && evkVar2.j == evkVar.j && evkVar2.c == evkVar.c && evkVar2.e.equals(evkVar.e)) {
                            long j4 = evkVar.h;
                            evk e = evkVar2.e(0L, j4 != -1 ? j3 + j4 : -1L);
                            num.getClass();
                            list.set(num.intValue(), new c(j2, e));
                        }
                    }
                }
            }
            hashMap.put(k, Integer.valueOf(i));
            list.set(i, cVar);
            i++;
        }
        y2r0.a0(list, i, list.size());
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void a(@Nullable d.a aVar) throws IOException, InterruptedException {
        androidx.media3.datasource.cache.a b2;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        PriorityTaskManager priorityTaskManager = this.i;
        if (priorityTaskManager != null) {
            priorityTaskManager.a(-4000);
        }
        try {
            androidx.media3.datasource.cache.a b3 = this.f.b();
            uer uerVar = (uer) c(new c5i0(this, b3, this.c), false);
            if (!this.e.isEmpty()) {
                uerVar = (uer) uerVar.copy(this.e);
            }
            List e = e(b3, uerVar, false);
            Collections.sort(e);
            f(e, this.h, this.k);
            int size = e.size();
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = e.size() - 1; size2 >= 0; size2--) {
                evk evkVar = ((c) e.get(size2)).c;
                String k = this.h.k(evkVar);
                long j3 = evkVar.h;
                if (j3 == -1) {
                    long j4 = this.g.getContentMetadata(k).get("exo_len");
                    if (j4 != -1) {
                        j3 = j4 - evkVar.g;
                    }
                }
                long j5 = j3;
                long b4 = this.g.b(evkVar.g, j5, k);
                j2 += b4;
                if (j5 != -1) {
                    if (j5 == b4) {
                        i++;
                        e.remove(size2);
                    }
                    if (j != -1) {
                        j += j5;
                    }
                } else {
                    j = -1;
                }
            }
            b bVar = aVar != null ? new b(aVar, j, size, j2, i) : null;
            arrayDeque.addAll(e);
            while (!this.m && !arrayDeque.isEmpty()) {
                PriorityTaskManager priorityTaskManager2 = this.i;
                if (priorityTaskManager2 != null) {
                    priorityTaskManager2.b();
                }
                if (arrayDeque2.isEmpty()) {
                    b2 = this.f.b();
                    bArr = new byte[131072];
                } else {
                    d dVar = (d) arrayDeque2.removeFirst();
                    b2 = dVar.j;
                    bArr = dVar.l;
                }
                d dVar2 = new d((c) arrayDeque.removeFirst(), b2, bVar, bArr);
                b(dVar2);
                this.j.execute(dVar2);
                for (int size3 = this.l.size() - 1; size3 >= 0; size3--) {
                    d dVar3 = (d) this.l.get(size3);
                    if (arrayDeque.isEmpty() || dVar3.c.e()) {
                        try {
                            dVar3.get();
                            g(size3);
                            arrayDeque2.addLast(dVar3);
                        } catch (ExecutionException e2) {
                            Throwable cause = e2.getCause();
                            cause.getClass();
                            if (!(cause instanceof PriorityTaskManager.PriorityTooLowException)) {
                                if (!(cause instanceof IOException)) {
                                    throw cause;
                                }
                                throw ((IOException) cause);
                            }
                            arrayDeque.addFirst(dVar3.i);
                            g(size3);
                            arrayDeque2.addLast(dVar3);
                        }
                    }
                }
                dVar2.b.b();
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.l.get(i2).cancel(true);
            }
            for (int size4 = this.l.size() - 1; size4 >= 0; size4--) {
                this.l.get(size4).a();
                g(size4);
            }
            PriorityTaskManager priorityTaskManager3 = this.i;
            if (priorityTaskManager3 != null) {
                priorityTaskManager3.d(-4000);
            }
        } catch (Throwable th) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                this.l.get(i3).cancel(true);
            }
            for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
                this.l.get(size5).a();
                g(size5);
            }
            PriorityTaskManager priorityTaskManager4 = this.i;
            if (priorityTaskManager4 != null) {
                priorityTaskManager4.d(-4000);
            }
            throw th;
        }
    }

    public final <T> void b(bsg0<T, ?> bsg0Var) throws InterruptedException {
        synchronized (this.l) {
            try {
                if (this.m) {
                    throw new InterruptedException();
                }
                this.l.add(bsg0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T> T c(zhn0<bsg0<T, ?>> zhn0Var, boolean z) throws InterruptedException, IOException {
        if (z) {
            bsg0<T, ?> bsg0Var = zhn0Var.get();
            bsg0Var.run();
            try {
                return bsg0Var.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                String str = y2r0.a;
                throw e;
            }
        }
        while (!this.m) {
            PriorityTaskManager priorityTaskManager = this.i;
            if (priorityTaskManager != null) {
                priorityTaskManager.b();
            }
            bsg0<T, ?> bsg0Var2 = zhn0Var.get();
            b(bsg0Var2);
            this.j.execute(bsg0Var2);
            try {
                return bsg0Var2.get();
            } catch (ExecutionException e2) {
                Throwable cause2 = e2.getCause();
                cause2.getClass();
                if (!(cause2 instanceof PriorityTaskManager.PriorityTooLowException)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    String str2 = y2r0.a;
                    throw e2;
                }
            } finally {
                bsg0Var2.a();
                h(bsg0Var2);
            }
        }
        throw new InterruptedException();
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void cancel() {
        synchronized (this.l) {
            try {
                this.m = true;
                for (int i = 0; i < this.l.size(); i++) {
                    this.l.get(i).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract List e(androidx.media3.datasource.cache.a aVar, uer uerVar, boolean z) throws IOException, InterruptedException;

    public final void g(int i) {
        synchronized (this.l) {
            this.l.remove(i);
        }
    }

    public final void h(bsg0<?, ?> bsg0Var) {
        synchronized (this.l) {
            this.l.remove(bsg0Var);
        }
    }

    @Override // androidx.media3.exoplayer.offline.d
    public final void remove() {
        xw8 xw8Var = this.h;
        Cache cache = this.g;
        evk evkVar = this.c;
        a.b bVar = this.f;
        androidx.media3.datasource.cache.a c2 = bVar.c(null, bVar.h | 1, -4000);
        try {
            try {
                List e = e(c2, (uer) c(new c5i0(this, c2, evkVar), true), true);
                for (int i = 0; i < e.size(); i++) {
                    cache.c(xw8Var.k(((c) e.get(i)).c));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            cache.c(xw8Var.k(evkVar));
        }
    }
}
