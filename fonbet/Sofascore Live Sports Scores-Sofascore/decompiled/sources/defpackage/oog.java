package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class oog implements rq3, mu3 {

    @NotNull
    private static final nog b = new nog(null);
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(oog.class, Object.class, "result");
    public static final /* synthetic */ long d = rh0.a.objectFieldOffset(oog.class.getDeclaredField("result"));
    public final rq3 a;

    @Nullable
    private volatile Object result;

    public oog(rq3 rq3Var, Object obj) {
        rq3Var.getClass();
        this.a = rq3Var;
        this.result = obj;
    }

    public final Object b() {
        Object obj = this.result;
        lu3 lu3Var = lu3.b;
        if (obj == lu3Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            lu3 lu3Var2 = lu3.a;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                oog oogVar = this;
                if (rh0.a.compareAndSwapObject(oogVar, d, lu3Var, lu3Var2)) {
                    return lu3.a;
                }
                if (rh0.a.getObjectVolatile(oogVar, d) != lu3Var) {
                    obj = oogVar.result;
                    break;
                }
                this = oogVar;
            }
        }
        if (obj == lu3.c) {
            return lu3.a;
        }
        if (obj instanceof u2g) {
            throw ((u2g) obj).a;
        }
        return obj;
    }

    @Override // defpackage.mu3
    public final mu3 getCallerFrame() {
        rq3 rq3Var = this.a;
        if (rq3Var instanceof mu3) {
            return (mu3) rq3Var;
        }
        return null;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        oog oogVar;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            lu3 lu3Var = lu3.b;
            if (obj3 == lu3Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = rh0.a;
                    long j2 = d;
                    oogVar = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(oogVar, j2, lu3Var, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(oogVar, j2) != lu3Var) {
                        break;
                    }
                    this = oogVar;
                    obj = obj2;
                }
            } else {
                oogVar = this;
                obj2 = obj;
                lu3 lu3Var2 = lu3.a;
                if (obj3 != lu3Var2) {
                    a70.r("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = c;
                lu3 lu3Var3 = lu3.c;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = rh0.a;
                    j = d;
                    if (unsafe.compareAndSwapObject(oogVar, j, lu3Var2, lu3Var3)) {
                        oogVar.a.resumeWith(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(oogVar, j) == lu3Var2);
            }
            this = oogVar;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oog(rq3 rq3Var) {
        this(rq3Var, lu3.b);
        rq3Var.getClass();
    }
}
