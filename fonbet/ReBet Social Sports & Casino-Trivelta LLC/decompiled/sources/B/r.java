package B;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public interface r extends CoroutineContext.Element {

    /* renamed from: N, reason: collision with root package name */
    public static final b f516N = b.f517a;

    public static final class a {
        public static Object a(r rVar, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.fold(rVar, obj, function2);
        }

        public static CoroutineContext.Element b(r rVar, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.get(rVar, key);
        }

        public static CoroutineContext c(r rVar, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(rVar, key);
        }

        public static CoroutineContext d(r rVar, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(rVar, coroutineContext);
        }
    }

    public static final class b implements CoroutineContext.Key {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f517a = new b();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default CoroutineContext.Key getKey() {
        return f516N;
    }
}
