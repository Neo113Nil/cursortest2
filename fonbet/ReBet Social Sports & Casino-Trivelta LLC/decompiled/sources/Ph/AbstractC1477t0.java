package Ph;

import Ph.AbstractC1477t0;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Ph.t0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1477t0 extends L implements Closeable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9132b = new a(null);

    /* renamed from: Ph.t0$a */
    public static final class a extends AbstractCoroutineContextKey {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final AbstractC1477t0 b(CoroutineContext.Element element) {
            if (element instanceof AbstractC1477t0) {
                return (AbstractC1477t0) element;
            }
            return null;
        }

        public a() {
            super(L.f9039a, new Function1() { // from class: Ph.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AbstractC1477t0 b10;
                    b10 = AbstractC1477t0.a.b((CoroutineContext.Element) obj);
                    return b10;
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor e2();
}
