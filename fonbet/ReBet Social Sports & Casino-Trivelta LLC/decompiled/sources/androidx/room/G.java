package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class G {

    @NotNull
    private final w database;

    @NotNull
    private final AtomicBoolean lock;

    @NotNull
    private final Lazy stmt$delegate;

    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final E2.k invoke() {
            return G.this.a();
        }
    }

    public G(w database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = LazyKt.lazy(new a());
    }

    public final E2.k a() {
        return this.database.compileStatement(createQuery());
    }

    @NotNull
    public E2.k acquire() {
        assertNotMainThread();
        return c(this.lock.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    public final E2.k b() {
        return (E2.k) this.stmt$delegate.getValue();
    }

    public final E2.k c(boolean z10) {
        return z10 ? b() : a();
    }

    public abstract String createQuery();

    public void release(@NotNull E2.k statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == b()) {
            this.lock.set(false);
        }
    }
}
