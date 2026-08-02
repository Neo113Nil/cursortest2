package com.google.android.gms.internal.ads;

import android.os.Looper;
import defpackage.cy8;
import defpackage.e3o;
import defpackage.tc0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeg {
    public final Thread a;
    public final zzea b;
    public final zzec c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public zzeg(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, zzdp zzdpVar, zzec zzecVar, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = zzecVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = (looper == null || zzdpVar == null || zzecVar == null) ? null : zzdpVar.a(looper, new cy8(this, 2));
        this.i = z;
    }

    public final void a(Object obj) {
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new e3o(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        if (this.i) {
            zzguk.f(Thread.currentThread() == this.a);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e3o e3oVar = (e3o) it.next();
            if (e3oVar.a.equals(obj)) {
                e3oVar.d = true;
                zzec zzecVar = this.c;
                if (zzecVar != null && e3oVar.c) {
                    e3oVar.c = false;
                    zzecVar.b(e3oVar.a, e3oVar.b.b());
                }
                copyOnWriteArraySet.remove(e3oVar);
            }
        }
    }

    public final void c(int i, zzeb zzebVar) {
        if (this.i) {
            zzguk.f(Thread.currentThread() == this.a);
        }
        this.f.add(new tc0((Object) new CopyOnWriteArraySet(this.d), i, (Object) zzebVar, 7, false));
    }

    public final void d() {
        if (this.i) {
            zzguk.f(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            zzea zzeaVar = this.b;
            zzeaVar.getClass();
            if (!zzeaVar.zzb(1)) {
                zzeaVar.b(zzeaVar.k(1));
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void e() {
        if (this.i) {
            zzguk.f(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            e3o e3oVar = (e3o) it.next();
            zzec zzecVar = this.c;
            e3oVar.d = true;
            if (zzecVar != null && e3oVar.c) {
                e3oVar.c = false;
                zzecVar.b(e3oVar.a, e3oVar.b.b());
            }
        }
        copyOnWriteArraySet.clear();
    }

    public zzeg(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
