package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import xsna.bpz;
import xsna.ewo0;
import xsna.fxc0;
import xsna.kx2;
import xsna.mjp0;
import xsna.pr10;
import xsna.py10;
import xsna.qti;
import xsna.qy10;
import xsna.ry10;
import xsna.tn4;
import xsna.x1b0;
import xsna.yj0;

/* compiled from: CompositeMediaSource.java */
/* loaded from: classes12.dex */
public abstract class c<T> extends androidx.media3.exoplayer.source.a {
    public final HashMap<T, b<T>> h = new HashMap<>();

    @Nullable
    public Handler i;

    @Nullable
    public mjp0 j;

    /* compiled from: CompositeMediaSource.java */
    public final class a implements j, androidx.media3.exoplayer.drm.a {
        public final T b;
        public j.a c;
        public a.C0054a d;

        public a(T t) {
            this.c = c.this.o(null);
            this.d = new a.C0054a(c.this.d.c, 0, null);
            this.b = t;
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void A(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var, IOException iOException, boolean z) {
            if (a(i, bVar)) {
                j.a aVar = this.c;
                pr10 d = d(pr10Var, bVar);
                aVar.getClass();
                aVar.a(new qy10(aVar, bpzVar, d, iOException, z));
            }
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void B(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var) {
            if (a(i, bVar)) {
                j.a aVar = this.c;
                pr10 d = d(pr10Var, bVar);
                aVar.getClass();
                aVar.a(new kx2(aVar, bpzVar, d));
            }
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void F(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var, int i2) {
            if (a(i, bVar)) {
                j.a aVar = this.c;
                pr10 d = d(pr10Var, bVar);
                aVar.getClass();
                aVar.a(new tn4(aVar, bpzVar, d, i2));
            }
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void H(int i, @Nullable i.b bVar, bpz bpzVar, pr10 pr10Var) {
            if (a(i, bVar)) {
                j.a aVar = this.c;
                pr10 d = d(pr10Var, bVar);
                aVar.getClass();
                aVar.a(new ry10(aVar, bpzVar, d));
            }
        }

        public final boolean a(int i, @Nullable i.b bVar) {
            i.b bVar2;
            T t = this.b;
            c cVar = c.this;
            if (bVar != null) {
                bVar2 = cVar.u(t, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int w = cVar.w(t, i);
            j.a aVar = this.c;
            if (aVar.a != w || !Objects.equals(aVar.b, bVar2)) {
                this.c = new j.a(cVar.c.c, w, bVar2);
            }
            a.C0054a c0054a = this.d;
            if (c0054a.a == w && Objects.equals(c0054a.b, bVar2)) {
                return true;
            }
            this.d = new a.C0054a(cVar.d.c, w, bVar2);
            return true;
        }

        public final pr10 d(pr10 pr10Var, @Nullable i.b bVar) {
            long j = pr10Var.f;
            c cVar = c.this;
            T t = this.b;
            long v = cVar.v(t, j);
            long j2 = pr10Var.g;
            long v2 = cVar.v(t, j2);
            return (v == j && v2 == j2) ? pr10Var : new pr10(pr10Var.a, pr10Var.b, pr10Var.c, pr10Var.d, pr10Var.e, v, v2);
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void h(int i, @Nullable i.b bVar, pr10 pr10Var) {
            if (a(i, bVar)) {
                j.a aVar = this.c;
                pr10 d = d(pr10Var, bVar);
                i.b bVar2 = aVar.b;
                bVar2.getClass();
                aVar.a(new py10(aVar, bVar2, d));
            }
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void x(int i, @Nullable i.b bVar, pr10 pr10Var) {
            if (a(i, bVar)) {
                j.a aVar = this.c;
                pr10 d = d(pr10Var, bVar);
                aVar.getClass();
                aVar.a(new yj0(aVar, d));
            }
        }
    }

    /* compiled from: CompositeMediaSource.java */
    public static final class b<T> {
        public final i a;
        public final qti b;
        public final c<T>.a c;

        public b(i iVar, qti qtiVar, a aVar) {
            this.a = iVar;
            this.b = qtiVar;
            this.c = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b<T>> it = this.h.values().iterator();
        while (it.hasNext()) {
            it.next().a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void p() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.d(bVar.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void q() {
        for (b<T> bVar : this.h.values()) {
            bVar.a.c(bVar.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void t() {
        HashMap<T, b<T>> hashMap = this.h;
        for (b<T> bVar : hashMap.values()) {
            i iVar = bVar.a;
            c<T>.a aVar = bVar.c;
            iVar.b(bVar.b);
            iVar.j(aVar);
            iVar.k(aVar);
        }
        hashMap.clear();
    }

    @Nullable
    public abstract i.b u(T t, i.b bVar);

    public abstract void x(Object obj, androidx.media3.exoplayer.source.a aVar, ewo0 ewo0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.media3.exoplayer.source.i$c, xsna.qti] */
    public final void y(final T t, i iVar) {
        HashMap<T, b<T>> hashMap = this.h;
        fxc0.p(!hashMap.containsKey(t));
        ?? r1 = new i.c() { // from class: xsna.qti
            @Override // androidx.media3.exoplayer.source.i.c
            public final void a(androidx.media3.exoplayer.source.a aVar, ewo0 ewo0Var) {
                androidx.media3.exoplayer.source.c.this.x(t, aVar, ewo0Var);
            }
        };
        a aVar = new a(t);
        hashMap.put(t, new b<>(iVar, r1, aVar));
        Handler handler = this.i;
        handler.getClass();
        iVar.a(handler, aVar);
        Handler handler2 = this.i;
        handler2.getClass();
        iVar.g(handler2, aVar);
        mjp0 mjp0Var = this.j;
        x1b0 x1b0Var = this.g;
        x1b0Var.getClass();
        iVar.e(r1, mjp0Var, x1b0Var);
        if (this.b.isEmpty()) {
            iVar.d(r1);
        }
    }

    public long v(Object obj, long j) {
        return j;
    }

    public int w(T t, int i) {
        return i;
    }
}
