package gf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f10025a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10026b;

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new e(getValue());
    }

    @Override // gf.i
    public final Object getValue() {
        if (this.f10026b == f0.f10021a) {
            Function0 function0 = this.f10025a;
            Intrinsics.checkNotNull(function0);
            this.f10026b = function0.invoke();
            this.f10025a = null;
        }
        return this.f10026b;
    }

    public final String toString() {
        return this.f10026b != f0.f10021a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
