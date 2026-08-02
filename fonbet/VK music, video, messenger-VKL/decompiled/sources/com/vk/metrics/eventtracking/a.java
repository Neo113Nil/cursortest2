package com.vk.metrics.eventtracking;

import android.app.Application;
import android.os.Bundle;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.eventtracking.VkMainTracker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.el3;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.jgp;
import xsna.ohp0;
import xsna.qhp0;
import xsna.s3q0;
import xsna.ug9;

/* compiled from: VkStartupTracker.kt */
/* loaded from: classes.dex */
public final class a extends VkMainTracker {
    public final ArrayList<ohp0> k = new ArrayList<>();
    public final HashSet<String> l = new HashSet<>();
    public final ArrayList<gzs<s3q0>> m = new ArrayList<>();
    public volatile izs<? super Event, s3q0> n;

    @Override // com.vk.metrics.eventtracking.VkMainTracker, xsna.ohp0
    public final void b(ohp0 ohp0Var) {
        if (o(ohp0Var.getId()) != null) {
            throw new IllegalArgumentException("Tracker with id=" + ohp0Var.getId() + " is already registered!");
        }
        if (r()) {
            throw new IllegalStateException("Already initialized!");
        }
        ArrayList<ohp0> arrayList = this.k;
        arrayList.clear();
        HashSet<String> hashSet = this.l;
        hashSet.clear();
        arrayList.add(ohp0Var);
        hashSet.add(ohp0Var.getId());
    }

    @Override // com.vk.metrics.eventtracking.VkMainTracker, xsna.ohp0
    public final synchronized void c(Application application, Bundle bundle, gzs<s3q0> gzsVar) {
        if (this.g != VkMainTracker.State.IDLE) {
            return;
        }
        this.j = bundle.getBoolean("IS_DEBUG", false);
        this.g = VkMainTracker.State.INITIALIZING;
        this.f = application;
        this.h.getClass();
        qhp0.b = jgp.b;
        this.g = VkMainTracker.State.INITIALIZED;
        u();
        gzsVar.invoke();
        Iterator<ohp0> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().c(application, bundle, new ug9(19));
        }
    }

    @Override // com.vk.metrics.eventtracking.VkMainTracker, xsna.ohp0
    public final String getId() {
        return "TrackerStartupFacade";
    }

    @Override // com.vk.metrics.eventtracking.VkMainTracker, xsna.ohp0
    public final void h(izs<? super Event, s3q0> izsVar) {
        this.n = izsVar;
    }

    @Override // com.vk.metrics.eventtracking.VkMainTracker
    public final List n() {
        return this.m;
    }

    @Override // com.vk.metrics.eventtracking.VkMainTracker
    public final List p() {
        return this.k;
    }

    @Override // com.vk.metrics.eventtracking.VkMainTracker
    public final Set q() {
        return this.l;
    }

    @Override // com.vk.metrics.eventtracking.VkMainTracker
    public final void v(Event event) {
        if (epx.f(event.a.d.get("vk_tracking_startup_event"), Boolean.TRUE)) {
            HashSet<String> hashSet = this.l;
            Set<String> a = event.a();
            if (hashSet == null || !hashSet.isEmpty()) {
                Iterator<String> it = hashSet.iterator();
                while (it.hasNext()) {
                    if (((el3) a).contains(it.next())) {
                        break;
                    }
                }
            }
        }
        if (!this.l.containsAll(event.a())) {
            izs<? super Event, s3q0> izsVar = this.n;
            if (izsVar != null) {
                izsVar.invoke(event);
                return;
            }
            return;
        }
        this.h.getClass();
        jgp jgpVar = qhp0.b;
        if (jgpVar == null) {
            jgpVar = null;
        }
        Event.a aVar = event.a;
        aVar.f = false;
        aVar.d(jgpVar);
        aVar.f = true;
        Iterator<ohp0> it2 = this.k.iterator();
        while (it2.hasNext()) {
            ohp0 next = it2.next();
            if (!((el3) event.a()).isEmpty()) {
                if (((el3) event.a()).contains(next.getId())) {
                }
            }
            next.k(event);
        }
    }
}
