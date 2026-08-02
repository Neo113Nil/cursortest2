package gf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements i, Serializable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final r f10032c = new r(null);

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10033d = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile Function0 f10034a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10035b;

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new e(getValue());
    }

    @Override // gf.i
    public final Object getValue() {
        Object obj = this.f10035b;
        f0 f0Var = f0.f10021a;
        if (obj != f0Var) {
            return obj;
        }
        Function0 function0 = this.f10034a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10033d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, f0Var, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != f0Var) {
                }
            }
            this.f10034a = null;
            return invoke;
        }
        return this.f10035b;
    }

    public final String toString() {
        return this.f10035b != f0.f10021a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
