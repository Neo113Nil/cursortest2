package eg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class w extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* renamed from: b, reason: collision with root package name */
    public static final v f9230b = new v(kotlin.coroutines.d.f19226f0, new a2.j(28));

    public w() {
        super(kotlin.coroutines.d.f19226f0);
    }

    public abstract void c0(CoroutineContext coroutineContext, Runnable runnable);

    public void d0(CoroutineContext coroutineContext, Runnable runnable) {
        jg.h.g(this, coroutineContext, runnable);
    }

    public boolean f0(CoroutineContext coroutineContext) {
        return !(this instanceof c2);
    }

    public w h0(int i5) {
        jg.h.a(i5);
        return new jg.i(this, i5);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element r(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(key instanceof kotlin.coroutines.b)) {
            if (kotlin.coroutines.d.f19226f0 != key) {
                return null;
            }
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
            return this;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
        kotlin.coroutines.f key2 = this.f19221a;
        Intrinsics.checkNotNullParameter(key2, "key");
        if (key2 != bVar && bVar.f19223b != key2) {
            return null;
        }
        Intrinsics.checkNotNullParameter(this, "element");
        CoroutineContext.Element element = (CoroutineContext.Element) bVar.f19222a.invoke(this);
        if (element != null) {
            return element;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + c0.n(this);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            kotlin.coroutines.f key2 = this.f19221a;
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f19223b != key2) {
                return this;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            if (((CoroutineContext.Element) bVar.f19222a.invoke(this)) != null) {
                return kotlin.coroutines.g.f19227a;
            }
        } else if (kotlin.coroutines.d.f19226f0 == key) {
            return kotlin.coroutines.g.f19227a;
        }
        return this;
    }
}
