package gf;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f10036a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10037b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10038c;

    public t(Function0 initializer, Object obj, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i5 & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f10036a = initializer;
        this.f10037b = f0.f10021a;
        this.f10038c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new e(getValue());
    }

    @Override // gf.i
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f10037b;
        f0 f0Var = f0.f10021a;
        if (obj2 != f0Var) {
            return obj2;
        }
        synchronized (this.f10038c) {
            obj = this.f10037b;
            if (obj == f0Var) {
                Function0 function0 = this.f10036a;
                Intrinsics.checkNotNull(function0);
                obj = function0.invoke();
                this.f10037b = obj;
                this.f10036a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f10037b != f0.f10021a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
