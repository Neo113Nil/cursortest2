package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mqi implements joa, Serializable {
    public Function0 a;
    public volatile Object b;
    public final Object c;

    public mqi(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        function0.getClass();
        this.a = function0;
        this.b = j8k.a;
        this.c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new j3a(getValue());
    }

    @Override // defpackage.joa
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        j8k j8kVar = j8k.a;
        if (obj2 != j8kVar) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == j8kVar) {
                Function0 function0 = this.a;
                function0.getClass();
                obj = function0.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    @Override // defpackage.joa
    public final boolean isInitialized() {
        return this.b != j8k.a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
