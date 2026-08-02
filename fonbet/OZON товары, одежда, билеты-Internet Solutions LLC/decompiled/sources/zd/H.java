package zd;

import Jd.InterfaceC3391a;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class H implements Jd.w {
    @NotNull
    protected abstract Type I();

    public final boolean equals(Object obj) {
        return (obj instanceof H) && Intrinsics.d(I(), ((H) obj).I());
    }

    public final int hashCode() {
        return I().hashCode();
    }

    @Override // Jd.d
    public InterfaceC3391a j(Sd.c fqName) {
        Object obj;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((InterfaceC3391a) obj).b().a(), fqName)) {
                break;
            }
        }
        return (InterfaceC3391a) obj;
    }

    @NotNull
    public final String toString() {
        return getClass().getName() + ": " + I();
    }
}
