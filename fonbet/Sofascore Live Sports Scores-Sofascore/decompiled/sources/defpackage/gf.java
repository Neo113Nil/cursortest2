package defpackage;

import android.util.ArrayMap;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddedActivityWindowInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gf {
    public final ReentrantLock a = new ReentrantLock();
    public final ArrayMap b = new ArrayMap();

    public gf(ActivityEmbeddingComponent activityEmbeddingComponent) {
        int a = bl6.a();
        if (a >= 6) {
            new Consumer2() { // from class: ff
                @Override // androidx.window.reflection.Consumer2
                public final void accept(Object obj) {
                    gf gfVar = gf.this;
                    ((EmbeddedActivityWindowInfo) obj).getClass();
                    ReentrantLock reentrantLock = gfVar.a;
                    reentrantLock.lock();
                    try {
                        Iterator it = gfVar.b.values().iterator();
                        if (!it.hasNext()) {
                            Unit unit = Unit.a;
                        } else {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            };
        } else {
            a70.m(dmi.k(6, a, "This API requires extension version ", ", but the device is on "));
            throw null;
        }
    }
}
