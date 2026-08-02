package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ock implements joa, Serializable {
    public Function0 a;
    public Object b;

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new j3a(getValue());
    }

    @Override // defpackage.joa
    public final Object getValue() {
        Object obj = this.b;
        if (obj != j8k.a) {
            return obj;
        }
        Function0 function0 = this.a;
        function0.getClass();
        Object invoke = function0.invoke();
        this.b = invoke;
        this.a = null;
        return invoke;
    }

    @Override // defpackage.joa
    public final boolean isInitialized() {
        return this.b != j8k.a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
