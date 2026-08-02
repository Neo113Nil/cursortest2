package Ph;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ph.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1447e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9070a = AtomicIntegerFieldUpdater.newUpdater(C1447e.class, "notCompletedCount$volatile");

    @NotNull
    private final X[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* renamed from: Ph.e$a */
    public final class a extends H0 {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f9071h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC1465n f9072e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC1456i0 f9073f;

        public a(InterfaceC1465n interfaceC1465n) {
            this.f9072e = interfaceC1465n;
        }

        public final void A(b bVar) {
            f9071h.set(this, bVar);
        }

        public final void B(InterfaceC1456i0 interfaceC1456i0) {
            this.f9073f = interfaceC1456i0;
        }

        @Override // Ph.H0
        public boolean u() {
            return false;
        }

        @Override // Ph.H0
        public void v(Throwable th2) {
            if (th2 != null) {
                Object e10 = this.f9072e.e(th2);
                if (e10 != null) {
                    this.f9072e.q(e10);
                    b x10 = x();
                    if (x10 != null) {
                        x10.a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C1447e.d().decrementAndGet(C1447e.this) == 0) {
                InterfaceC1465n interfaceC1465n = this.f9072e;
                X[] xArr = C1447e.this.deferreds;
                ArrayList arrayList = new ArrayList(xArr.length);
                for (X x11 : xArr) {
                    arrayList.add(x11.getCompleted());
                }
                interfaceC1465n.resumeWith(Result.m147constructorimpl(arrayList));
            }
        }

        public final b x() {
            return (b) f9071h.get(this);
        }

        public final InterfaceC1456i0 y() {
            InterfaceC1456i0 interfaceC1456i0 = this.f9073f;
            if (interfaceC1456i0 != null) {
                return interfaceC1456i0;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }
    }

    /* renamed from: Ph.e$b */
    public final class b implements InterfaceC1463m {

        @NotNull
        private final Ph.e.a[] nodes;

        public b(a[] aVarArr) {
            this.nodes = aVarArr;
        }

        public final void a() {
            for (a aVar : this.nodes) {
                aVar.y().dispose();
            }
        }

        @Override // Ph.InterfaceC1463m
        public void b(Throwable th2) {
            a();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    public C1447e(X[] xArr) {
        this.deferreds = xArr;
        this.notCompletedCount$volatile = xArr.length;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f9070a;
    }

    public final Object c(Continuation continuation) {
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        int length = this.deferreds.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            X x10 = this.deferreds[i10];
            x10.start();
            a aVar = new a(c1469p);
            aVar.B(G0.p(x10, false, aVar, 1, null));
            Unit unit = Unit.INSTANCE;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].A(bVar);
        }
        if (c1469p.isCompleted()) {
            bVar.a();
        } else {
            r.c(c1469p, bVar);
        }
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10;
    }
}
