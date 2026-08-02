package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.j;
import androidx.media3.exoplayer.k;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.n;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.ahp0;
import xsna.aq10;
import xsna.bq10;
import xsna.d7q;
import xsna.dvf;
import xsna.dz5;
import xsna.ehp0;
import xsna.ewo0;
import xsna.fn80;
import xsna.fxc0;
import xsna.fz5;
import xsna.io20;
import xsna.kr10;
import xsna.ln00;
import xsna.lp6;
import xsna.mjp0;
import xsna.n3i0;
import xsna.npl;
import xsna.p06;
import xsna.pll;
import xsna.qfp0;
import xsna.s4q0;
import xsna.tgq;
import xsna.vp;
import xsna.vyf0;
import xsna.wv4;
import xsna.x1b0;
import xsna.y2r0;
import xsna.z9l;
import xsna.zgp0;
import xsna.zq;

/* loaded from: classes12.dex */
public final class DownloadHelper {
    public static final npl.d q;
    public final kr10.f a;

    @Nullable
    public final i b;
    public final int c;
    public final npl d;
    public final vyf0 e;
    public final SparseIntArray f;
    public final Handler g;
    public final ewo0.c h;
    public boolean i;
    public boolean j;
    public a k;
    public e l;
    public qfp0[] m;
    public ln00.a[] n;
    public List<d7q>[][] o;
    public List<d7q>[][] p;

    public static class LiveContentUnsupportedException extends IOException {
    }

    public interface a {
        void a(DownloadHelper downloadHelper, boolean z);

        void b(IOException iOException);
    }

    public static final class c {

        @Nullable
        public a.InterfaceC0045a a;

        @Nullable
        public fn80 b;
        public ahp0 c = DownloadHelper.q;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v5, types: [androidx.media3.exoplayer.offline.DownloadHelper$f] */
        /* JADX WARN: Type inference failed for: r5v6, types: [xsna.vyf0] */
        /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, xsna.pll] */
        public final DownloadHelper a(kr10 kr10Var) {
            i d;
            ?? fVar;
            kr10.f fVar2 = kr10Var.b;
            fVar2.getClass();
            npl.d dVar = DownloadHelper.q;
            boolean z = true;
            boolean z2 = y2r0.J(fVar2.a, fVar2.b) == 4;
            if (!z2 && this.a == null) {
                z = false;
            }
            fxc0.p(z);
            if (z2 && this.a == null) {
                d = null;
            } else {
                a.InterfaceC0045a interfaceC0045a = this.a;
                kr10.f fVar3 = kr10Var.b;
                fVar3.getClass();
                d = (y2r0.J(fVar3.a, fVar3.b) == 4 ? new n.b(interfaceC0045a) : new androidx.media3.exoplayer.source.e(interfaceC0045a, tgq.a)).d(kr10Var);
            }
            ahp0 ahp0Var = this.c;
            fn80 fn80Var = this.b;
            if (fn80Var != null) {
                j[] a = fn80Var.a(y2r0.p(null), new dz5(), new fz5(), new io.reactivex.rxjava3.internal.operators.mixed.n(8), new zq(12));
                fVar = new pll();
                fVar.b = (j[]) Arrays.copyOf(a, a.length);
                for (int i = 0; i < a.length; i++) {
                    ((j[]) fVar.b)[i].g(i, x1b0.c, dvf.a);
                }
            } else {
                fVar = new f(new k[0]);
            }
            return new DownloadHelper(kr10Var, d, ahp0Var, fVar);
        }

        public final void b(@Nullable a.InterfaceC0045a interfaceC0045a) {
            this.a = interfaceC0045a;
        }

        public final void c(@Nullable fn80 fn80Var) {
            this.b = fn80Var;
        }
    }

    public static final class e implements i.c, h.a, Handler.Callback {
        public final i b;
        public final DownloadHelper c;
        public final z9l d = new z9l(65536);
        public final ArrayList<h> e = new ArrayList<>();
        public final Handler f = y2r0.p(new Handler.Callback() { // from class: xsna.r8o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                DownloadHelper.e eVar = DownloadHelper.e.this;
                DownloadHelper downloadHelper = eVar.c;
                boolean z = eVar.l;
                if (z) {
                    return false;
                }
                int i = message.what;
                if (i == 1) {
                    try {
                        DownloadHelper.a(downloadHelper);
                        return true;
                    } catch (ExoPlaybackException e) {
                        eVar.f.obtainMessage(2, new IOException(e)).sendToTarget();
                        return true;
                    }
                }
                if (i != 2) {
                    return false;
                }
                if (!z) {
                    eVar.l = true;
                    eVar.h.sendEmptyMessage(4);
                }
                Object obj = message.obj;
                String str = y2r0.a;
                Handler handler = downloadHelper.g;
                handler.getClass();
                handler.post(new zv4(3, downloadHelper, (IOException) obj));
                return true;
            }
        });
        public final HandlerThread g;
        public final Handler h;
        public ewo0 i;
        public n3i0 j;
        public h[] k;
        public boolean l;

        public e(i iVar, DownloadHelper downloadHelper) {
            this.b = iVar;
            this.c = downloadHelper;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadHelper");
            this.g = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.h = handler;
            handler.sendEmptyMessage(1);
        }

        @Override // androidx.media3.exoplayer.source.i.c
        public final void a(androidx.media3.exoplayer.source.a aVar, ewo0 ewo0Var) {
            h[] hVarArr;
            if (this.i != null) {
                return;
            }
            if (ewo0Var.m(0, new ewo0.c(), 0L).a()) {
                this.f.obtainMessage(2, new LiveContentUnsupportedException()).sendToTarget();
                return;
            }
            this.i = ewo0Var;
            this.k = new h[ewo0Var.h()];
            int i = 0;
            while (true) {
                hVarArr = this.k;
                if (i >= hVarArr.length) {
                    break;
                }
                h m = this.b.m(new i.b(ewo0Var.l(i)), this.d, 0L);
                this.k[i] = m;
                this.e.add(m);
                i++;
            }
            for (h hVar : hVarArr) {
                hVar.e(this, 0L);
            }
        }

        @Override // androidx.media3.exoplayer.source.h.a
        public final void b(h hVar) {
            ArrayList<h> arrayList = this.e;
            arrayList.remove(hVar);
            if (arrayList.isEmpty()) {
                this.h.removeMessages(2);
                this.f.sendEmptyMessage(1);
            }
        }

        @Override // androidx.media3.exoplayer.source.q.a
        public final void d(h hVar) {
            h hVar2 = hVar;
            if (this.e.contains(hVar2)) {
                this.h.obtainMessage(3, hVar2).sendToTarget();
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            Handler handler = this.h;
            i iVar = this.b;
            if (i == 1) {
                if (iVar instanceof n) {
                    ((n) iVar).u = this;
                }
                iVar.e(this, null, x1b0.c);
                handler.sendEmptyMessage(2);
                return true;
            }
            ArrayList<h> arrayList = this.e;
            int i2 = 0;
            if (i == 2) {
                try {
                    if (this.k == null) {
                        iVar.maybeThrowSourceInfoRefreshError();
                    } else {
                        while (i2 < arrayList.size()) {
                            arrayList.get(i2).maybeThrowPrepareError();
                            i2++;
                        }
                    }
                    handler.sendEmptyMessageDelayed(2, 100L);
                    return true;
                } catch (IOException e) {
                    this.f.obtainMessage(2, e).sendToTarget();
                    return true;
                }
            }
            if (i == 3) {
                h hVar = (h) message.obj;
                if (arrayList.contains(hVar)) {
                    f.a aVar = new f.a();
                    aVar.a = 0L;
                    hVar.k(new androidx.media3.exoplayer.f(aVar));
                }
                return true;
            }
            if (i != 4) {
                return false;
            }
            h[] hVarArr = this.k;
            if (hVarArr != null) {
                int length = hVarArr.length;
                while (i2 < length) {
                    iVar.h(hVarArr[i2]);
                    i2++;
                }
            }
            if (iVar instanceof n) {
                ((n) iVar).u = null;
            }
            iVar.b(this);
            handler.removeCallbacksAndMessages(null);
            this.g.quit();
            return true;
        }
    }

    static {
        npl.d dVar = npl.d.I;
        dVar.getClass();
        npl.d.a aVar = new npl.d.a(dVar);
        aVar.v = true;
        aVar.C = false;
        q = new npl.d(aVar);
    }

    public DownloadHelper(kr10 kr10Var, @Nullable i iVar, ahp0 ahp0Var, vyf0 vyf0Var) {
        kr10.f fVar = kr10Var.b;
        fVar.getClass();
        this.a = fVar;
        this.b = iVar;
        this.c = iVar == null ? 0 : iVar instanceof n ? 1 : 2;
        npl nplVar = new npl(ahp0Var, new b.a(), null);
        this.d = nplVar;
        this.e = vyf0Var;
        this.f = new SparseIntArray();
        nplVar.c(new vp(15), new d());
        this.g = y2r0.p(null);
        this.h = new ewo0.c();
    }

    public static void a(final DownloadHelper downloadHelper) throws ExoPlaybackException {
        npl nplVar = downloadHelper.d;
        downloadHelper.l.getClass();
        downloadHelper.l.k.getClass();
        downloadHelper.l.i.getClass();
        int i = downloadHelper.c;
        final boolean z = false;
        if (i == 2) {
            int length = downloadHelper.l.k.length;
            int size = downloadHelper.e.size();
            downloadHelper.o = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            downloadHelper.p = (List[][]) Array.newInstance((Class<?>) List.class, length, size);
            for (int i2 = 0; i2 < length; i2++) {
                for (int i3 = 0; i3 < size; i3++) {
                    downloadHelper.o[i2][i3] = new ArrayList();
                    downloadHelper.p[i2][i3] = Collections.unmodifiableList(downloadHelper.o[i2][i3]);
                }
            }
            downloadHelper.m = new qfp0[length];
            downloadHelper.n = new ln00.a[length];
            for (int i4 = 0; i4 < length; i4++) {
                downloadHelper.m[i4] = downloadHelper.l.k[i4].getTrackGroups();
                Object obj = downloadHelper.l(i4).e;
                nplVar.getClass();
                ln00.a aVar = (ln00.a) obj;
                ln00.a[] aVarArr = downloadHelper.n;
                aVar.getClass();
                aVarArr[i4] = aVar;
            }
            downloadHelper.i = true;
            downloadHelper.j = true;
            z = true;
        } else {
            fxc0.z(i == 1);
            downloadHelper.l.j.getClass();
            downloadHelper.i = true;
        }
        Handler handler = downloadHelper.g;
        handler.getClass();
        handler.post(new Runnable() { // from class: xsna.q8o
            @Override // java.lang.Runnable
            public final void run() {
                DownloadHelper downloadHelper2 = DownloadHelper.this;
                DownloadHelper.a aVar2 = downloadHelper2.k;
                aVar2.getClass();
                aVar2.a(downloadHelper2, z);
            }
        });
    }

    public final void b(String... strArr) {
        try {
            e();
            npl.d dVar = q;
            dVar.getClass();
            npl.d.a aVar = new npl.d.a(dVar);
            aVar.u = true;
            aVar.v = true;
            for (k kVar : this.e.c()) {
                int trackType = kVar.getTrackType();
                aVar.h(trackType, trackType != 3);
            }
            int i = i();
            for (String str : strArr) {
                if (str == null) {
                    aVar.g(new String[0]);
                } else {
                    aVar.g(new String[]{str});
                }
                npl.d dVar2 = new npl.d(aVar);
                for (int i2 = 0; i2 < i; i2++) {
                    c(i2, dVar2);
                }
            }
        } catch (ExoPlaybackException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void c(int i, npl.d dVar) throws ExoPlaybackException {
        npl nplVar = this.d;
        nplVar.i(dVar);
        l(i);
        s4q0<zgp0> it = dVar.w.values().iterator();
        while (it.hasNext()) {
            zgp0 next = it.next();
            npl.d.a aVar = new npl.d.a(dVar);
            aVar.f(next);
            nplVar.i(aVar.a());
            l(i);
        }
    }

    public final void d() {
        fxc0.z(this.c != 0);
        fxc0.z(this.i);
    }

    public final void e() {
        fxc0.z(this.c == 2);
        fxc0.z(this.i);
        fxc0.z(this.j);
    }

    public final DownloadRequest.b f(String str, @Nullable byte[] bArr) {
        kr10.f fVar = this.a;
        DownloadRequest.b bVar = new DownloadRequest.b(str, fVar.a);
        bVar.c = io20.q(fVar.b);
        bVar.e = null;
        bVar.f = fVar.d;
        bVar.g = bArr;
        if (this.c == 2) {
            e();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = this.o.length;
            for (int i = 0; i < length; i++) {
                arrayList2.clear();
                int length2 = this.o[i].length;
                for (int i2 = 0; i2 < length2; i2++) {
                    arrayList2.addAll(this.o[i][i2]);
                }
                arrayList.addAll(this.l.k[i].c(arrayList2));
            }
            bVar.d = arrayList;
        }
        return bVar;
    }

    @Nullable
    public final Object g() {
        if (this.c == 0) {
            return null;
        }
        d();
        if (this.l.i.o() > 0) {
            return this.l.i.m(0, this.h, 0L).d;
        }
        return null;
    }

    public final ln00.a h() {
        e();
        return this.n[0];
    }

    public final int i() {
        if (this.c == 0) {
            return 0;
        }
        d();
        return this.l.k.length;
    }

    public final void j(a aVar) {
        fxc0.z(this.k == null);
        this.k = aVar;
        if (this.c == 0) {
            this.g.post(new wv4(5, this, aVar));
            return;
        }
        i iVar = this.b;
        iVar.getClass();
        this.l = new e(iVar, this);
    }

    public final void k() {
        e eVar = this.l;
        if (eVar != null && !eVar.l) {
            eVar.l = true;
            eVar.h.sendEmptyMessage(4);
        }
        this.d.f();
        this.e.release();
    }

    public final ehp0 l(int i) throws ExoPlaybackException {
        ehp0 g = this.d.g(this.e.c(), this.m[i], new i.b(this.l.i.l(i)), this.l.i);
        for (int i2 = 0; i2 < g.a; i2++) {
            d7q d7qVar = g.c[i2];
            if (d7qVar != null) {
                List<d7q> list = this.o[i][i2];
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        list.add(d7qVar);
                        break;
                    }
                    d7q d7qVar2 = list.get(i3);
                    if (d7qVar2.getTrackGroup().equals(d7qVar.getTrackGroup())) {
                        SparseIntArray sparseIntArray = this.f;
                        sparseIntArray.clear();
                        for (int i4 = 0; i4 < d7qVar2.length(); i4++) {
                            sparseIntArray.put(d7qVar2.getIndexInTrackGroup(i4), 0);
                        }
                        for (int i5 = 0; i5 < d7qVar.length(); i5++) {
                            sparseIntArray.put(d7qVar.getIndexInTrackGroup(i5), 0);
                        }
                        int[] iArr = new int[sparseIntArray.size()];
                        for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                            iArr[i6] = sparseIntArray.keyAt(i6);
                        }
                        list.set(i3, new b(0, d7qVar2.getTrackGroup(), iArr));
                    } else {
                        i3++;
                    }
                }
            }
        }
        return g;
    }

    public static final class f implements vyf0 {
        public final k[] b;

        public f(k[] kVarArr) {
            this.b = kVarArr;
        }

        @Override // xsna.vyf0
        public final k[] c() {
            return this.b;
        }

        @Override // xsna.vyf0
        public final int size() {
            return this.b.length;
        }

        @Override // xsna.vyf0
        public final void release() {
        }
    }

    public static final class d implements p06 {
        @Override // xsna.p06
        @Nullable
        public final mjp0 d() {
            return null;
        }

        @Override // xsna.p06
        public final long getBitrateEstimate() {
            return 0L;
        }

        @Override // xsna.p06
        public final void c(p06.a aVar) {
        }

        @Override // xsna.p06
        public final void b(Handler handler, p06.a aVar) {
        }
    }

    public static final class b extends lp6 {

        public static final class a implements d7q.b {
            @Override // xsna.d7q.b
            public final d7q[] a(d7q.a[] aVarArr, p06 p06Var) {
                d7q[] d7qVarArr = new d7q[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    d7q.a aVar = aVarArr[i];
                    d7qVarArr[i] = aVar == null ? null : new b(0, aVar.a, aVar.b);
                }
                return d7qVarArr;
            }
        }

        @Override // xsna.d7q
        public final int getSelectedIndex() {
            return 0;
        }

        @Override // xsna.d7q
        @Nullable
        public final Object getSelectionData() {
            return null;
        }

        @Override // xsna.d7q
        public final int getSelectionReason() {
            return 0;
        }

        @Override // xsna.d7q
        public final void g(long j, long j2, long j3, List<? extends aq10> list, bq10[] bq10VarArr) {
        }
    }
}
