package ru.ozon.android.messenger.framework.network.di;

import Gc.e;
import Gc.i;
import Gc.k;
import io.reactivex.p;
import io.reactivex.w;
import java.util.concurrent.LinkedBlockingQueue;
import qc.InterfaceC9019a;
import qc.g;
import rc.d;
import sc.C9653a;
import sc.C9656b;
import uc.h;
import uc.r;

/* loaded from: classes10.dex */
public final class a {
    public static void a(p pVar) {
        e eVar = new e(1);
        r rVar = new r(C9653a.g(), eVar, eVar, C9653a.g());
        pVar.subscribe(rVar);
        if (eVar.getCount() != 0) {
            try {
                eVar.await();
            } catch (InterruptedException e11) {
                d.a(rVar);
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e11);
            }
        }
        Throwable th2 = eVar.f9906a;
        if (th2 != null) {
            throw i.d(th2);
        }
    }

    public static void b(p pVar, w wVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        h hVar = new h(linkedBlockingQueue);
        wVar.onSubscribe(hVar);
        pVar.subscribe(hVar);
        while (!hVar.isDisposed()) {
            Object poll = linkedBlockingQueue.poll();
            if (poll == null) {
                try {
                    poll = linkedBlockingQueue.take();
                } catch (InterruptedException e11) {
                    hVar.dispose();
                    wVar.onError(e11);
                    return;
                }
            }
            if (hVar.isDisposed() || pVar == h.f100567b || k.d(wVar, poll)) {
                return;
            }
        }
    }

    public static void c(p pVar, g gVar, g gVar2, InterfaceC9019a interfaceC9019a) {
        C9656b.c(gVar, "onNext is null");
        C9656b.c(gVar2, "onError is null");
        C9656b.c(interfaceC9019a, "onComplete is null");
        b(pVar, new r(gVar, gVar2, interfaceC9019a, C9653a.g()));
    }
}
