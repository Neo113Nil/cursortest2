package xe;

import De.C2857A;
import Sc.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10715c<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105431b = AtomicIntegerFieldUpdater.newUpdater(C10715c.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U<T>[] f105432a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* renamed from: xe.c$a */
    private final class a extends G0 {

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f105433h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final C10737n f105434e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC10724g0 f105435f;

        public a(@NotNull C10737n c10737n) {
            this.f105434e = c10737n;
        }

        @Override // xe.G0
        public final boolean n() {
            return false;
        }

        @Override // xe.G0
        public final void o(Throwable th2) {
            C10737n c10737n = this.f105434e;
            if (th2 != null) {
                C2857A J11 = c10737n.J(th2);
                if (J11 != null) {
                    c10737n.E(J11);
                    b bVar = (b) f105433h.get(this);
                    if (bVar != null) {
                        bVar.a();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C10715c.f105431b;
            C10715c<T> c10715c = C10715c.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(c10715c) == 0) {
                U[] uArr = ((C10715c) c10715c).f105432a;
                ArrayList arrayList = new ArrayList(uArr.length);
                for (U u11 : uArr) {
                    arrayList.add(u11.p());
                }
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(arrayList);
            }
        }

        public final void p(C10715c<T>.b bVar) {
            f105433h.set(this, bVar);
        }
    }

    /* renamed from: xe.c$b */
    private final class b implements InterfaceC10731k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C10715c<T>.a[] f105437a;

        public b(@NotNull a[] aVarArr) {
            this.f105437a = aVarArr;
        }

        public final void a() {
            for (C10715c<T>.a aVar : this.f105437a) {
                InterfaceC10724g0 interfaceC10724g0 = aVar.f105435f;
                if (interfaceC10724g0 == null) {
                    Intrinsics.n("handle");
                    throw null;
                }
                interfaceC10724g0.dispose();
            }
        }

        @Override // xe.InterfaceC10731k
        public final void b(Throwable th2) {
            a();
        }

        @NotNull
        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f105437a + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10715c(@NotNull U<? extends T>[] uArr) {
        this.f105432a = uArr;
        this.notCompletedCount$volatile = uArr.length;
    }

    public final Object c(@NotNull kotlin.coroutines.d<? super List<? extends T>> frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        U<T>[] uArr = this.f105432a;
        int length = uArr.length;
        a[] aVarArr = new a[length];
        for (int i11 = 0; i11 < length; i11++) {
            U<T> u11 = uArr[i11];
            u11.start();
            a aVar = new a(c10737n);
            aVar.f105435f = E0.h(u11, aVar);
            Unit unit = Unit.f71690a;
            aVarArr[i11] = aVar;
        }
        C10715c<T>.b bVar = new b(aVarArr);
        for (int i12 = 0; i12 < length; i12++) {
            aVarArr[i12].p(bVar);
        }
        if (c10737n.t()) {
            bVar.a();
        } else {
            c10737n.s(bVar);
        }
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
