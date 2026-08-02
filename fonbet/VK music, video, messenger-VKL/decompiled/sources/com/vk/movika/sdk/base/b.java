package com.vk.movika.sdk.base;

import com.vk.movika.sdk.base.logic.interactor.o;
import com.vk.movika.sdk.base.logic.interactor.p;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.f;
import com.vk.movika.sdk.base.model.h;
import com.vk.movika.sdk.base.model.s;
import com.vk.movika.sdk.base.model.t;
import com.vk.movika.sdk.base.ui.v0;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.i5g;
import xsna.izs;
import xsna.mj80;
import xsna.rli0;

/* loaded from: classes3.dex */
public interface b extends com.vk.movika.sdk.player.base.components.c {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    /* renamed from: com.vk.movika.sdk.base.b$b, reason: collision with other inner class name */
    public static final class C1288b {
        /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static t a(com.vk.movika.sdk.base.ui.c cVar) {
            long longValue;
            Object next;
            v0 v0Var = cVar.r;
            mj80 mj80Var = v0Var.b;
            mj80 mj80Var2 = v0Var.d.a;
            if (mj80Var.q == PlaybackStateListener.PlaybackState.READY) {
                com.vk.movika.sdk.base.presenter.d dVar = cVar.t;
                final long o = v0Var.o(mj80Var2.q());
                final Long r = mj80Var2.r();
                s sVar = dVar.d.a;
                if (sVar != null) {
                    o oVar = dVar.b;
                    com.vk.movika.sdk.base.logic.e eVar = dVar.c;
                    oVar.a(sVar).d.getClass();
                    if (((r == null || r.longValue() <= 0) ? null : r) != null) {
                        Chapter a = sVar.a(eVar.b);
                        ArrayList b = a != null ? com.vk.movika.sdk.base.utils.d.b(a.d) : null;
                        if (b != null && !b.isEmpty()) {
                            ArrayList d = com.vk.movika.sdk.base.logic.processor.actions.a.d(eVar, sVar);
                            if (!d.isEmpty()) {
                                Iterator it = d.iterator();
                                while (it.hasNext()) {
                                    if (!com.vk.movika.sdk.base.logic.processor.actions.openuri.d.a((f) it.next())) {
                                    }
                                }
                            }
                            Set<String> set = eVar.f;
                            ArrayList arrayList = a.c;
                            if (!arrayList.isEmpty()) {
                                if (set.size() == arrayList.size()) {
                                    if (!arrayList.isEmpty()) {
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            if (!set.contains(((h) it2.next()).a)) {
                                            }
                                        }
                                    }
                                }
                                List A = rli0.A(rli0.j(rli0.j(new i5g(a.c), new p(eVar, 0)), new izs() { // from class: com.vk.movika.sdk.base.logic.interactor.q
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj) {
                                        Long l = ((com.vk.movika.sdk.base.model.h) obj).d;
                                        if (l == null) {
                                            l = r;
                                        }
                                        return Boolean.valueOf(l.longValue() >= o);
                                    }
                                }));
                                if (!A.isEmpty()) {
                                    Iterator it3 = A.iterator();
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        if (it3.hasNext()) {
                                            long j = ((h) next).c;
                                            do {
                                                Object next2 = it3.next();
                                                long j2 = ((h) next2).c;
                                                if (j > j2) {
                                                    next = next2;
                                                    j = j2;
                                                }
                                            } while (it3.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    h hVar = (h) next;
                                    Long valueOf = hVar != null ? Long.valueOf(hVar.c) : null;
                                    Long valueOf2 = Long.valueOf(r.longValue() - 1);
                                    if (valueOf == null) {
                                        valueOf = valueOf2;
                                    }
                                    long longValue2 = valueOf.longValue() - 750;
                                    if (longValue2 >= o) {
                                        o = longValue2;
                                    }
                                    if (o > 0) {
                                        return new t.d(o);
                                    }
                                }
                            }
                            longValue = r.longValue();
                            o = longValue - 1;
                            if (o > 0) {
                            }
                        }
                        longValue = r.longValue();
                        o = longValue - 1;
                        if (o > 0) {
                        }
                    }
                }
                o = 0;
                if (o > 0) {
                }
            }
            return t.c.b;
        }
    }

    List<f> a();

    e b(Long l);

    Chapter d();

    long g();

    d l();
}
