package com.appsflyer.internal;

import com.facebook.c0;
import com.facebook.internal.b0;
import com.facebook.internal.d0;
import defpackage.cw3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set = null;
        switch (this.a) {
            case 0:
                AFi1lSDK.unregisterClient();
                return;
            case 1:
                com.facebook.appevents.i.d(6);
                return;
            case 2:
                com.facebook.appevents.c.a();
                return;
            case 3:
                if (cw3.a.contains(com.facebook.appevents.i.class)) {
                    return;
                }
                try {
                    com.facebook.appevents.i.c = null;
                    if (com.facebook.appevents.j.q() != 2) {
                        com.facebook.appevents.i.d(2);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    cw3.a(com.facebook.appevents.i.class, th);
                    return;
                }
            case 4:
                if (cw3.a.contains(com.facebook.appevents.i.class)) {
                    return;
                }
                try {
                    com.facebook.appevents.j.v(com.facebook.appevents.i.a);
                    com.facebook.appevents.i.a = new c0(2);
                    return;
                } catch (Throwable th2) {
                    cw3.a(com.facebook.appevents.i.class, th2);
                    return;
                }
            case 5:
                HashSet hashSet = new HashSet();
                c0 c0Var = com.facebook.appevents.i.a;
                if (!cw3.a.contains(com.facebook.appevents.i.class)) {
                    try {
                        set = com.facebook.appevents.i.a.l();
                    } catch (Throwable th3) {
                        cw3.a(com.facebook.appevents.i.class, th3);
                    }
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    hashSet.add(((com.facebook.appevents.b) it.next()).a);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    com.facebook.internal.x.k((String) it2.next(), true);
                }
                return;
            default:
                AtomicBoolean atomicBoolean = d0.c;
                if (cw3.a.contains(d0.class)) {
                    return;
                }
                try {
                    try {
                        Iterator it3 = d0.b.iterator();
                        while (it3.hasNext()) {
                            ((b0) it3.next()).a(true);
                        }
                        atomicBoolean.set(false);
                        return;
                    } catch (Throwable th4) {
                        cw3.a(d0.class, th4);
                        return;
                    }
                } catch (Throwable th5) {
                    atomicBoolean.set(false);
                    throw th5;
                }
        }
    }
}
