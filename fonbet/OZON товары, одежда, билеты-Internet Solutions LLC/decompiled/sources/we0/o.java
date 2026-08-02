package we0;

import Sc.r;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes3.dex */
public final class o<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f104448a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7704k<T> f104449b = new C7704k<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReentrantReadWriteLock f104450c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    private C10737n f104451d;

    static final class a extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o<T> f104452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o<T> oVar) {
            super(1);
            this.f104452b = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            ((o) this.f104452b).f104451d = null;
            return Unit.f71690a;
        }
    }

    public o(int i11) {
        this.f104448a = i11;
    }

    public final void b(T t2) {
        C7704k<T> c7704k = this.f104449b;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f104450c;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i12 = 0; i12 < readHoldCount; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            C10737n c10737n = this.f104451d;
            if (c10737n != null) {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(t2);
                this.f104451d = null;
            } else {
                if (c7704k.getF26995b() == this.f104448a) {
                    c7704k.removeFirst();
                }
                c7704k.addLast(t2);
            }
            Unit unit = Unit.f71690a;
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i11 < readHoldCount) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final T c() {
        ReentrantReadWriteLock.ReadLock readLock = this.f104450c.readLock();
        readLock.lock();
        try {
            return this.f104449b.i();
        } finally {
            readLock.unlock();
        }
    }

    public final boolean d() {
        ReentrantReadWriteLock.ReadLock readLock = this.f104450c.readLock();
        readLock.lock();
        try {
            return this.f104449b.isEmpty();
        } finally {
            readLock.unlock();
        }
    }

    public final T e() {
        ReentrantReadWriteLock.ReadLock readLock = this.f104450c.readLock();
        readLock.lock();
        try {
            return this.f104449b.m();
        } finally {
            readLock.unlock();
        }
    }

    @NotNull
    public final List<T> f() {
        ReentrantReadWriteLock.ReadLock readLock = this.f104450c.readLock();
        readLock.lock();
        try {
            return C7714v.U0(this.f104449b);
        } finally {
            readLock.unlock();
        }
    }

    public final Object g(@NotNull kotlin.coroutines.d<? super T> frame) {
        C7704k<T> c7704k = this.f104449b;
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        ReentrantReadWriteLock.ReadLock readLock = this.f104450c.readLock();
        readLock.lock();
        try {
            if (c7704k.isEmpty()) {
                c10737n.q(new a(this));
                this.f104451d = c10737n;
            } else {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(c7704k.removeFirst());
            }
            Unit unit = Unit.f71690a;
            readLock.unlock();
            Object n11 = c10737n.n();
            if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return n11;
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }

    public final int h() {
        ReentrantReadWriteLock.ReadLock readLock = this.f104450c.readLock();
        readLock.lock();
        try {
            return this.f104449b.getF26995b();
        } finally {
            readLock.unlock();
        }
    }
}
