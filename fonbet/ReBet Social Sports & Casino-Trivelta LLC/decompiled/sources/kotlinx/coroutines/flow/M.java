package kotlinx.coroutines.flow;

import Ph.C0;
import Ph.F0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.AbstractC5326b;

/* loaded from: classes5.dex */
public final class M extends AbstractC5326b implements y, InterfaceC5321f, kotlinx.coroutines.flow.internal.q {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f54653e = AtomicReferenceFieldUpdater.newUpdater(M.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public int f54654d;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54655n;

        /* renamed from: o, reason: collision with root package name */
        public Object f54656o;

        /* renamed from: p, reason: collision with root package name */
        public Object f54657p;

        /* renamed from: q, reason: collision with root package name */
        public Object f54658q;

        /* renamed from: r, reason: collision with root package name */
        public Object f54659r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f54660s;

        /* renamed from: u, reason: collision with root package name */
        public int f54662u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54660s = obj;
            this.f54662u |= Integer.MIN_VALUE;
            return M.this.collect(null, this);
        }
    }

    public M(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.x
    public boolean a(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public InterfaceC5321f b(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return N.d(this, coroutineContext, i10, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
    
        if (r6.e(r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0099, B:19:0x009e, B:21:0x00bf, B:23:0x00c5, B:27:0x00a4, B:30:0x00ab, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d5 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.C, kotlinx.coroutines.flow.InterfaceC5321f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        a aVar;
        Object coroutine_suspended;
        int i10;
        M m10;
        O o10;
        InterfaceC5322g interfaceC5322g2;
        C0 c02;
        Object obj;
        Object obj2;
        Object obj3;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i11 = aVar.f54662u;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f54662u = i11 - Integer.MIN_VALUE;
                    Object obj4 = aVar.f54660s;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = aVar.f54662u;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj4);
                        m10 = this;
                        o10 = (O) f();
                    } else if (i10 == 1) {
                        o10 = (O) aVar.f54657p;
                        interfaceC5322g = (InterfaceC5322g) aVar.f54656o;
                        m10 = (M) aVar.f54655n;
                        ResultKt.throwOnFailure(obj4);
                    } else if (i10 == 2) {
                        obj = aVar.f54659r;
                        c02 = (C0) aVar.f54658q;
                        o10 = (O) aVar.f54657p;
                        interfaceC5322g2 = (InterfaceC5322g) aVar.f54656o;
                        m10 = (M) aVar.f54655n;
                        ResultKt.throwOnFailure(obj4);
                        if (!o10.h()) {
                        }
                        obj2 = f54653e.get(m10);
                        if (c02 != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj2 == kotlinx.coroutines.flow.internal.t.f54780a) {
                        }
                        aVar.f54655n = m10;
                        aVar.f54656o = interfaceC5322g2;
                        aVar.f54657p = o10;
                        aVar.f54658q = c02;
                        aVar.f54659r = obj2;
                        aVar.f54662u = 2;
                        if (interfaceC5322g2.emit(obj3, aVar) == coroutine_suspended) {
                        }
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = aVar.f54659r;
                        c02 = (C0) aVar.f54658q;
                        o10 = (O) aVar.f54657p;
                        interfaceC5322g2 = (InterfaceC5322g) aVar.f54656o;
                        m10 = (M) aVar.f54655n;
                        ResultKt.throwOnFailure(obj4);
                        obj2 = f54653e.get(m10);
                        if (c02 != null) {
                            F0.l(c02);
                        }
                        if (obj != null || !Intrinsics.areEqual(obj, obj2)) {
                            obj3 = obj2 == kotlinx.coroutines.flow.internal.t.f54780a ? null : obj2;
                            aVar.f54655n = m10;
                            aVar.f54656o = interfaceC5322g2;
                            aVar.f54657p = o10;
                            aVar.f54658q = c02;
                            aVar.f54659r = obj2;
                            aVar.f54662u = 2;
                            if (interfaceC5322g2.emit(obj3, aVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = obj2;
                        }
                        if (!o10.h()) {
                            aVar.f54655n = m10;
                            aVar.f54656o = interfaceC5322g2;
                            aVar.f54657p = o10;
                            aVar.f54658q = c02;
                            aVar.f54659r = obj;
                            aVar.f54662u = 3;
                        }
                        obj2 = f54653e.get(m10);
                        if (c02 != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj2 == kotlinx.coroutines.flow.internal.t.f54780a) {
                        }
                        aVar.f54655n = m10;
                        aVar.f54656o = interfaceC5322g2;
                        aVar.f54657p = o10;
                        aVar.f54658q = c02;
                        aVar.f54659r = obj2;
                        aVar.f54662u = 2;
                        if (interfaceC5322g2.emit(obj3, aVar) == coroutine_suspended) {
                        }
                    }
                    interfaceC5322g2 = interfaceC5322g;
                    c02 = (C0) aVar.get$context().get(C0.f9001U2);
                    obj = null;
                    obj2 = f54653e.get(m10);
                    if (c02 != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj2 == kotlinx.coroutines.flow.internal.t.f54780a) {
                    }
                    aVar.f54655n = m10;
                    aVar.f54656o = interfaceC5322g2;
                    aVar.f54657p = o10;
                    aVar.f54658q = c02;
                    aVar.f54659r = obj2;
                    aVar.f54662u = 2;
                    if (interfaceC5322g2.emit(obj3, aVar) == coroutine_suspended) {
                    }
                }
            }
            if (i10 != 0) {
            }
            interfaceC5322g2 = interfaceC5322g;
            c02 = (C0) aVar.get$context().get(C0.f9001U2);
            obj = null;
            obj2 = f54653e.get(m10);
            if (c02 != null) {
            }
            if (obj != null) {
            }
            if (obj2 == kotlinx.coroutines.flow.internal.t.f54780a) {
            }
            aVar.f54655n = m10;
            aVar.f54656o = interfaceC5322g2;
            aVar.f54657p = o10;
            aVar.f54658q = c02;
            aVar.f54659r = obj2;
            aVar.f54662u = 2;
            if (interfaceC5322g2.emit(obj3, aVar) == coroutine_suspended) {
            }
        } catch (Throwable th2) {
            m10.k(o10);
            throw th2;
        }
        aVar = new a(continuation);
        Object obj42 = aVar.f54660s;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f54662u;
    }

    @Override // kotlinx.coroutines.flow.y
    public boolean d(Object obj, Object obj2) {
        if (obj == null) {
            obj = kotlinx.coroutines.flow.internal.t.f54780a;
        }
        if (obj2 == null) {
            obj2 = kotlinx.coroutines.flow.internal.t.f54780a;
        }
        return q(obj, obj2);
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.InterfaceC5322g
    public Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.y, kotlinx.coroutines.flow.L
    public Object getValue() {
        Sh.G g10 = kotlinx.coroutines.flow.internal.t.f54780a;
        Object obj = f54653e.get(this);
        if (obj == g10) {
            return null;
        }
        return obj;
    }

    @Override // kotlinx.coroutines.flow.x
    public void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5326b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public O i() {
        return new O();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5326b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public O[] j(int i10) {
        return new O[i10];
    }

    public final boolean q(Object obj, Object obj2) {
        int i10;
        kotlinx.coroutines.flow.internal.d[] m10;
        synchronized (this) {
            Object obj3 = f54653e.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            f54653e.set(this, obj2);
            int i11 = this.f54654d;
            if ((i11 & 1) != 0) {
                this.f54654d = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f54654d = i12;
            kotlinx.coroutines.flow.internal.d[] m11 = m();
            Unit unit = Unit.INSTANCE;
            while (true) {
                O[] oArr = (O[]) m11;
                if (oArr != null) {
                    for (O o10 : oArr) {
                        if (o10 != null) {
                            o10.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f54654d;
                    if (i10 == i12) {
                        this.f54654d = i12 + 1;
                        return true;
                    }
                    m10 = m();
                    Unit unit2 = Unit.INSTANCE;
                }
                m11 = m10;
                i12 = i10;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.y
    public void setValue(Object obj) {
        if (obj == null) {
            obj = kotlinx.coroutines.flow.internal.t.f54780a;
        }
        q(null, obj);
    }
}
