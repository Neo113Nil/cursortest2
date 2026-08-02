package kotlin.coroutines;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.dsf;
import defpackage.l33;
import defpackage.lnb;
import defpackage.qs2;
import defpackage.vn6;
import defpackage.xt3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c implements CoroutineContext, Serializable {
    public final CoroutineContext a;
    public final CoroutineContext.Element b;

    public c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = coroutineContext;
        this.b = element;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int d = d();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[d];
        dsf dsfVar = new dsf();
        fold(Unit.a, new vn6(21, coroutineContextArr, dsfVar));
        if (dsfVar.a == d) {
            return new l33(coroutineContextArr);
        }
        a70.r("Check failed.");
        return null;
    }

    public final int d() {
        int i = 2;
        while (true) {
            CoroutineContext coroutineContext = this.a;
            this = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d() == d()) {
                while (true) {
                    CoroutineContext.Element element = this.b;
                    if (!Intrinsics.c(cVar.get(element.getKey()), element)) {
                        z = false;
                        break;
                    }
                    CoroutineContext coroutineContext = this.a;
                    if (!(coroutineContext instanceof c)) {
                        coroutineContext.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                        z = Intrinsics.c(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    this = (c) coroutineContext;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.a.fold(obj, function2), this.b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        fVar.getClass();
        while (true) {
            CoroutineContext.Element element = this.b.get(fVar);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = this.a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(fVar);
            }
            this = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        fVar.getClass();
        CoroutineContext.Element element = this.b;
        CoroutineContext.Element element2 = element.get(fVar);
        CoroutineContext coroutineContext = this.a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext minusKey = coroutineContext.minusKey(fVar);
        return minusKey == coroutineContext ? this : minusKey == g.a ? element : new c(element, minusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.a ? this : (CoroutineContext) coroutineContext.fold(this, new xt3(0));
    }

    public final String toString() {
        return lnb.q(new StringBuilder(U3.j.d), (String) fold("", new qs2(2)), ']');
    }
}
