package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class sq3 extends h21 {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient rq3<Object> intercepted;

    public sq3(rq3 rq3Var) {
        this(rq3Var, rq3Var != null ? rq3Var.getContext() : null);
    }

    @Override // defpackage.rq3
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    @NotNull
    public final rq3<Object> intercepted() {
        rq3<Object> rq3Var = this.intercepted;
        if (rq3Var != null) {
            return rq3Var;
        }
        d dVar = (d) getContext().get(d.Q7);
        rq3<Object> s45Var = dVar != null ? new s45((au3) dVar, this) : this;
        this.intercepted = s45Var;
        return s45Var;
    }

    @Override // defpackage.h21
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        rq3<Object> rq3Var = this.intercepted;
        if (rq3Var != null && rq3Var != this) {
            CoroutineContext.Element element = getContext().get(d.Q7);
            element.getClass();
            ((au3) ((d) element)).getClass();
            s45 s45Var = (s45) rq3Var;
            do {
                unsafe = rh0.a;
                j = s45.h;
            } while (unsafe.getObjectVolatile(s45Var, j) == t45.b);
            Object objectVolatile = unsafe.getObjectVolatile(s45Var, j);
            lj2 lj2Var = objectVolatile instanceof lj2 ? (lj2) objectVolatile : null;
            if (lj2Var != null) {
                lj2Var.n();
            }
        }
        this.intercepted = db3.a;
    }

    public sq3(rq3 rq3Var, CoroutineContext coroutineContext) {
        super(rq3Var);
        this._context = coroutineContext;
    }
}
