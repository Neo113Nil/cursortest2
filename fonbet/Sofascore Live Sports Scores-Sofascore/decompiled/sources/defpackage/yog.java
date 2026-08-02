package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yog implements joa, Serializable {

    @NotNull
    public static final xog c = new xog(null);
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(yog.class, Object.class, "b");
    public static final /* synthetic */ long e = rh0.a.objectFieldOffset(yog.class.getDeclaredField("b"));
    public volatile Function0 a;
    public volatile Object b;

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new j3a(getValue());
    }

    @Override // defpackage.joa
    public final Object getValue() {
        yog yogVar;
        Object obj = this.b;
        j8k j8kVar = j8k.a;
        if (obj != j8kVar) {
            return obj;
        }
        Function0 function0 = this.a;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                yogVar = this;
                if (rh0.a.compareAndSwapObject(yogVar, e, j8kVar, invoke)) {
                    yogVar.a = null;
                    return invoke;
                }
                if (rh0.a.getObjectVolatile(yogVar, e) != j8kVar) {
                    break;
                }
                this = yogVar;
            }
        } else {
            yogVar = this;
        }
        return yogVar.b;
    }

    @Override // defpackage.joa
    public final boolean isInitialized() {
        return this.b != j8k.a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
