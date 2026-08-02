package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.ewo0;
import xsna.fxc0;
import xsna.mjp0;
import xsna.x1b0;

/* compiled from: BaseMediaSource.java */
/* loaded from: classes12.dex */
public abstract class a implements i {
    public final ArrayList<i.c> a = new ArrayList<>(1);
    public final HashSet<i.c> b = new HashSet<>(1);
    public final j.a c = new j.a();
    public final a.C0054a d = new a.C0054a();

    @Nullable
    public Looper e;

    @Nullable
    public ewo0 f;

    @Nullable
    public x1b0 g;

    @Override // androidx.media3.exoplayer.source.i
    public final void a(Handler handler, j jVar) {
        handler.getClass();
        j.a aVar = this.c;
        aVar.getClass();
        CopyOnWriteArrayList<j.a.C0063a> copyOnWriteArrayList = aVar.c;
        j.a.C0063a c0063a = new j.a.C0063a();
        c0063a.a = handler;
        c0063a.b = jVar;
        copyOnWriteArrayList.add(c0063a);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void b(i.c cVar) {
        ArrayList<i.c> arrayList = this.a;
        arrayList.remove(cVar);
        if (!arrayList.isEmpty()) {
            d(cVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        t();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void c(i.c cVar) {
        this.e.getClass();
        HashSet<i.c> hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(cVar);
        if (isEmpty) {
            q();
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void d(i.c cVar) {
        HashSet<i.c> hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(cVar);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        p();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void e(i.c cVar, @Nullable mjp0 mjp0Var, x1b0 x1b0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        fxc0.p(looper == null || looper == myLooper);
        this.g = x1b0Var;
        ewo0 ewo0Var = this.f;
        this.a.add(cVar);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(cVar);
            r(mjp0Var);
        } else if (ewo0Var != null) {
            c(cVar);
            cVar.a(this, ewo0Var);
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void g(Handler handler, androidx.media3.exoplayer.drm.a aVar) {
        handler.getClass();
        a.C0054a c0054a = this.d;
        c0054a.getClass();
        CopyOnWriteArrayList<a.C0054a.C0055a> copyOnWriteArrayList = c0054a.c;
        a.C0054a.C0055a c0055a = new a.C0054a.C0055a();
        c0055a.a = aVar;
        copyOnWriteArrayList.add(c0055a);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void j(j jVar) {
        CopyOnWriteArrayList<j.a.C0063a> copyOnWriteArrayList = this.c.c;
        Iterator<j.a.C0063a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j.a.C0063a next = it.next();
            if (next.b == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void k(androidx.media3.exoplayer.drm.a aVar) {
        CopyOnWriteArrayList<a.C0054a.C0055a> copyOnWriteArrayList = this.d.c;
        Iterator<a.C0054a.C0055a> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            a.C0054a.C0055a next = it.next();
            if (next.a == aVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    public final j.a o(@Nullable i.b bVar) {
        return new j.a(this.c.c, 0, bVar);
    }

    public abstract void r(@Nullable mjp0 mjp0Var);

    public final void s(ewo0 ewo0Var) {
        this.f = ewo0Var;
        Iterator<i.c> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(this, ewo0Var);
        }
    }

    public abstract void t();

    public void p() {
    }

    public void q() {
    }
}
