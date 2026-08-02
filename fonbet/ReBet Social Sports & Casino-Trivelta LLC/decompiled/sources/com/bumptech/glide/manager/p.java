package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final Set f30113a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final Set f30114b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f30115c;

    public boolean a(L4.d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f30113a.remove(dVar);
        if (!this.f30114b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = com.bumptech.glide.util.l.k(this.f30113a).iterator();
        while (it.hasNext()) {
            a((L4.d) it.next());
        }
        this.f30114b.clear();
    }

    public void c() {
        this.f30115c = true;
        for (L4.d dVar : com.bumptech.glide.util.l.k(this.f30113a)) {
            if (dVar.isRunning() || dVar.isComplete()) {
                dVar.clear();
                this.f30114b.add(dVar);
            }
        }
    }

    public void d() {
        this.f30115c = true;
        for (L4.d dVar : com.bumptech.glide.util.l.k(this.f30113a)) {
            if (dVar.isRunning()) {
                dVar.pause();
                this.f30114b.add(dVar);
            }
        }
    }

    public void e() {
        for (L4.d dVar : com.bumptech.glide.util.l.k(this.f30113a)) {
            if (!dVar.isComplete() && !dVar.e()) {
                dVar.clear();
                if (this.f30115c) {
                    this.f30114b.add(dVar);
                } else {
                    dVar.h();
                }
            }
        }
    }

    public void f() {
        this.f30115c = false;
        for (L4.d dVar : com.bumptech.glide.util.l.k(this.f30113a)) {
            if (!dVar.isComplete() && !dVar.isRunning()) {
                dVar.h();
            }
        }
        this.f30114b.clear();
    }

    public void g(L4.d dVar) {
        this.f30113a.add(dVar);
        if (!this.f30115c) {
            dVar.h();
            return;
        }
        dVar.clear();
        Log.isLoggable("RequestTracker", 2);
        this.f30114b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f30113a.size() + ", isPaused=" + this.f30115c + "}";
    }
}
