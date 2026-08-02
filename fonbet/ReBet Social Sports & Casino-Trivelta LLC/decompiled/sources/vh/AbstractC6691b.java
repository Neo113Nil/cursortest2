package vh;

import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import vh.AbstractRunnableC6690a;

/* renamed from: vh.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6691b extends AbstractRunnableC6690a {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f67177d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLong f67178e = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final Thread f67179b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67180c;

    /* renamed from: vh.b$a */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0944b initialValue() {
            return new C0944b();
        }
    }

    /* renamed from: vh.b$b, reason: collision with other inner class name */
    public static final class C0944b {

        /* renamed from: a, reason: collision with root package name */
        public Object f67181a;

        /* renamed from: b, reason: collision with root package name */
        public int f67182b;

        public void a() {
            this.f67181a = null;
            this.f67182b = 0;
        }

        public C0944b b(Object obj) {
            this.f67181a = obj;
            this.f67182b = System.identityHashCode(obj);
            return this;
        }

        public boolean equals(Object obj) {
            return obj instanceof C0944b ? ((C0944b) obj).f67181a == this.f67181a : ((AbstractRunnableC6690a.d) obj).get() == this.f67181a;
        }

        public int hashCode() {
            return this.f67182b;
        }
    }

    public AbstractC6691b(boolean z10, boolean z11, ConcurrentMap concurrentMap) {
        super(concurrentMap);
        this.f67180c = z11;
        if (!z10) {
            this.f67179b = null;
            return;
        }
        Thread thread = new Thread(this);
        this.f67179b = thread;
        thread.setName("weak-ref-cleaner-" + f67178e.getAndIncrement());
        thread.setPriority(1);
        thread.setDaemon(true);
        thread.start();
    }

    @Override // vh.AbstractRunnableC6690a
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // vh.AbstractRunnableC6690a
    public /* bridge */ /* synthetic */ Object c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // vh.AbstractRunnableC6690a
    public /* bridge */ /* synthetic */ Object e(Object obj) {
        return super.e(obj);
    }

    @Override // vh.AbstractRunnableC6690a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0944b b(Object obj) {
        return (this.f67180c ? (C0944b) f67177d.get() : new C0944b()).b(obj);
    }

    @Override // vh.AbstractRunnableC6690a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void f(C0944b c0944b) {
        c0944b.a();
    }

    @Override // vh.AbstractRunnableC6690a, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // vh.AbstractRunnableC6690a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
