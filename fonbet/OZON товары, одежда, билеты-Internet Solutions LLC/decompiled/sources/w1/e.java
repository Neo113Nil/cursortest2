package w1;

import D1.I0;
import D1.J0;
import Sc.s;
import Z1.w;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* loaded from: classes.dex */
public final class e extends e.c implements I0, InterfaceC10406a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC10406a f103338a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C10407b f103339b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f103340c;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {104, 105}, m = "onPostFling-RZ2iAVY")
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        e f103341d;

        /* renamed from: e, reason: collision with root package name */
        long f103342e;

        /* renamed from: f, reason: collision with root package name */
        long f103343f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f103344g;

        /* renamed from: i, reason: collision with root package name */
        int f103346i;

        a(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f103344g = obj;
            this.f103346i |= LinearLayoutManager.INVALID_OFFSET;
            return e.this.O(0L, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", f = "NestedScrollNode.kt", l = {97, 98}, m = "onPreFling-QWom1Mo")
    /* loaded from: classes8.dex */
    static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        e f103347d;

        /* renamed from: e, reason: collision with root package name */
        long f103348e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f103349f;

        /* renamed from: h, reason: collision with root package name */
        int f103351h;

        b(kotlin.coroutines.jvm.internal.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f103349f = obj;
            this.f103351h |= LinearLayoutManager.INVALID_OFFSET;
            return e.this.mo11onPreFlingQWom1Mo(0L, this);
        }
    }

    public e(@NotNull InterfaceC10406a interfaceC10406a, C10407b c10407b) {
        this.f103338a = interfaceC10406a;
        this.f103339b = c10407b == null ? new C10407b() : c10407b;
        this.f103340c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M J1() {
        e eVar = isAttached() ? (e) J0.b(this) : null;
        if (eVar != null) {
            return eVar.J1();
        }
        M g10 = this.f103339b.g();
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // D1.I0
    @NotNull
    public final Object K0() {
        return this.f103340c;
    }

    public final void K1(@NotNull InterfaceC10406a interfaceC10406a, C10407b c10407b) {
        this.f103338a = interfaceC10406a;
        if (this.f103339b.f() == this) {
            this.f103339b.i(null);
        }
        if (c10407b == null) {
            this.f103339b = new C10407b();
        } else if (!c10407b.equals(this.f103339b)) {
            this.f103339b = c10407b;
        }
        if (isAttached()) {
            this.f103339b.i(this);
            this.f103339b.h(new f(this));
            this.f103339b.j(getCoroutineScope());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // w1.InterfaceC10406a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(long j11, long j12, @NotNull kotlin.coroutines.d<? super w> dVar) {
        a aVar;
        int i11;
        e eVar;
        long j13;
        long j14;
        long i12;
        e eVar2;
        long j15;
        long j16;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i13 = aVar.f103346i;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f103346i = i13 - LinearLayoutManager.INVALID_OFFSET;
                a aVar2 = aVar;
                Object obj = aVar2.f103344g;
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar2.f103346i;
                if (i11 != 0) {
                    s.b(obj);
                    InterfaceC10406a interfaceC10406a = this.f103338a;
                    aVar2.f103341d = this;
                    aVar2.f103342e = j11;
                    aVar2.f103343f = j12;
                    aVar2.f103346i = 1;
                    obj = interfaceC10406a.O(j11, j12, aVar2);
                    if (obj != aVar3) {
                        eVar = this;
                        j13 = j11;
                        j14 = j12;
                    }
                    return aVar3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j16 = aVar2.f103342e;
                    s.b(obj);
                    j15 = ((w) obj).i();
                    i12 = j16;
                    return w.a(w.f(i12, j15));
                }
                j14 = aVar2.f103343f;
                j13 = aVar2.f103342e;
                eVar = aVar2.f103341d;
                s.b(obj);
                i12 = ((w) obj).i();
                eVar2 = (eVar.isAttached() || !eVar.isAttached()) ? null : (e) J0.b(eVar);
                if (eVar2 != null) {
                    j15 = 0;
                    return w.a(w.f(i12, j15));
                }
                long f7 = w.f(j13, i12);
                long e11 = w.e(j14, i12);
                aVar2.f103341d = null;
                aVar2.f103342e = i12;
                aVar2.f103346i = 2;
                obj = eVar2.O(f7, e11, aVar2);
                if (obj != aVar3) {
                    j16 = i12;
                    j15 = ((w) obj).i();
                    i12 = j16;
                    return w.a(w.f(i12, j15));
                }
                return aVar3;
            }
        }
        aVar = new a((kotlin.coroutines.jvm.internal.c) dVar);
        a aVar22 = aVar;
        Object obj2 = aVar22.f103344g;
        Wc.a aVar32 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar22.f103346i;
        if (i11 != 0) {
        }
        i12 = ((w) obj2).i();
        if (eVar.isAttached()) {
        }
        if (eVar2 != null) {
        }
    }

    @Override // w1.InterfaceC10406a
    public final long f0(int i11, long j11, long j12) {
        long f02 = this.f103338a.f0(i11, j11, j12);
        e eVar = null;
        if (isAttached() && isAttached()) {
            eVar = (e) J0.b(this);
        }
        e eVar2 = eVar;
        return C7459e.k(f02, eVar2 != null ? eVar2.f0(i11, C7459e.k(j11, f02), C7459e.j(j12, f02)) : 0L);
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        this.f103339b.i(this);
        this.f103339b.h(new f(this));
        this.f103339b.j(getCoroutineScope());
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        if (this.f103339b.f() == this) {
            this.f103339b.i(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r12 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // w1.InterfaceC10406a
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo11onPreFlingQWom1Mo(long j11, @NotNull kotlin.coroutines.d<? super w> dVar) {
        b bVar;
        int i11;
        long j12;
        e eVar;
        long j13;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.f103351h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f103351h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f103349f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f103351h;
                if (i11 != 0) {
                    s.b(obj);
                    e eVar2 = (isAttached() && isAttached()) ? (e) J0.b(this) : null;
                    if (eVar2 != null) {
                        bVar.f103347d = this;
                        bVar.f103348e = j11;
                        bVar.f103351h = 1;
                        obj = eVar2.mo11onPreFlingQWom1Mo(j11, bVar);
                        if (obj != aVar) {
                            eVar = this;
                        }
                        return aVar;
                    }
                    j12 = 0;
                    eVar = this;
                    long j14 = j12;
                    long j15 = j11;
                    j13 = j14;
                    InterfaceC10406a interfaceC10406a = eVar.f103338a;
                    long e11 = w.e(j15, j13);
                    bVar.f103347d = null;
                    bVar.f103348e = j13;
                    bVar.f103351h = 2;
                    obj = interfaceC10406a.mo11onPreFlingQWom1Mo(e11, bVar);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j13 = bVar.f103348e;
                        s.b(obj);
                        return w.a(w.f(j13, ((w) obj).i()));
                    }
                    j11 = bVar.f103348e;
                    eVar = bVar.f103347d;
                    s.b(obj);
                }
                j12 = ((w) obj).i();
                long j142 = j12;
                long j152 = j11;
                j13 = j142;
                InterfaceC10406a interfaceC10406a2 = eVar.f103338a;
                long e112 = w.e(j152, j13);
                bVar.f103347d = null;
                bVar.f103348e = j13;
                bVar.f103351h = 2;
                obj = interfaceC10406a2.mo11onPreFlingQWom1Mo(e112, bVar);
            }
        }
        bVar = new b((kotlin.coroutines.jvm.internal.c) dVar);
        Object obj2 = bVar.f103349f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f103351h;
        if (i11 != 0) {
        }
        j12 = ((w) obj2).i();
        long j1422 = j12;
        long j1522 = j11;
        j13 = j1422;
        InterfaceC10406a interfaceC10406a22 = eVar.f103338a;
        long e1122 = w.e(j1522, j13);
        bVar.f103347d = null;
        bVar.f103348e = j13;
        bVar.f103351h = 2;
        obj2 = interfaceC10406a22.mo11onPreFlingQWom1Mo(e1122, bVar);
    }

    @Override // w1.InterfaceC10406a
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo12onPreScrollOzD1aCk(long j11, int i11) {
        e eVar = null;
        if (isAttached() && isAttached()) {
            eVar = (e) J0.b(this);
        }
        long mo12onPreScrollOzD1aCk = eVar != null ? eVar.mo12onPreScrollOzD1aCk(j11, i11) : 0L;
        return C7459e.k(mo12onPreScrollOzD1aCk, this.f103338a.mo12onPreScrollOzD1aCk(C7459e.j(j11, mo12onPreScrollOzD1aCk), i11));
    }
}
