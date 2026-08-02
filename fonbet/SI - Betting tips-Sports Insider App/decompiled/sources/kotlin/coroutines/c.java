package kotlin.coroutines;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import jg.x;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements CoroutineContext, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f19224a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext.Element f19225b;

    public c(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f19224a = left;
        this.f19225b = element;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int a7 = a();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[a7];
        final Ref.IntRef intRef = new Ref.IntRef();
        O(Unit.f19194a, new Function2() { // from class: kf.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter((Unit) obj, "<unused var>");
                Intrinsics.checkNotNullParameter(element, "element");
                Ref.IntRef intRef2 = intRef;
                int i5 = intRef2.element;
                intRef2.element = i5 + 1;
                coroutineContextArr[i5] = element;
                return Unit.f19194a;
            }
        });
        if (intRef.element == a7) {
            return new kf.c(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object O(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f19224a.O(obj, operation), this.f19225b);
    }

    public final int a() {
        int i5 = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f19224a;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i5;
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        boolean z5;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.a() == a()) {
                c cVar2 = this;
                while (true) {
                    CoroutineContext.Element element = cVar2.f19225b;
                    if (!Intrinsics.areEqual(cVar.r(element.getKey()), element)) {
                        z5 = false;
                        break;
                    }
                    CoroutineContext coroutineContext = cVar2.f19224a;
                    if (!(coroutineContext instanceof c)) {
                        Intrinsics.checkNotNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                        z5 = Intrinsics.areEqual(cVar.r(element2.getKey()), element2);
                        break;
                    }
                    cVar2 = (c) coroutineContext;
                }
                if (z5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19225b.hashCode() + this.f19224a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element r(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            CoroutineContext.Element r5 = cVar.f19225b.r(key);
            if (r5 != null) {
                return r5;
            }
            CoroutineContext coroutineContext = cVar.f19224a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.r(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext t(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f19227a ? this : (CoroutineContext) context.O(this, new x(3));
    }

    public final String toString() {
        return d9.e.k(new StringBuilder("["), (String) O("", new x(2)), ']');
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f19225b;
        CoroutineContext.Element r5 = element.r(key);
        CoroutineContext coroutineContext = this.f19224a;
        if (r5 != null) {
            return coroutineContext;
        }
        CoroutineContext z5 = coroutineContext.z(key);
        return z5 == coroutineContext ? this : z5 == g.f19227a ? element : new c(element, z5);
    }
}
