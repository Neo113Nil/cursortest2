package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class au3 extends a implements d {
    public static final zt3 b = new zt3(d.Q7, new q73(12));

    public au3() {
        super(d.Q7);
    }

    public void a0(CoroutineContext coroutineContext, Runnable runnable) {
        t45.b(this, coroutineContext, runnable);
    }

    public boolean e0(CoroutineContext coroutineContext) {
        return !(this instanceof v9k);
    }

    public au3 f0(int i) {
        oea.j(i);
        return new k7b(this, i);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        CoroutineContext.Element element;
        fVar.getClass();
        if (fVar instanceof b) {
            b bVar = (b) fVar;
            f key = getKey();
            key.getClass();
            if ((key == bVar || bVar.b == key) && (element = (CoroutineContext.Element) bVar.a.invoke(this)) != null) {
                return element;
            }
        } else if (d.Q7 == fVar) {
            return this;
        }
        return null;
    }

    public abstract void i(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        fVar.getClass();
        if (!(fVar instanceof b)) {
            return d.Q7 == fVar ? g.a : this;
        }
        b bVar = (b) fVar;
        f key = getKey();
        key.getClass();
        return (key == bVar || bVar.b == key) ? ((CoroutineContext.Element) bVar.a.invoke(this)) != null ? g.a : this : this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ml4.X(this);
    }
}
