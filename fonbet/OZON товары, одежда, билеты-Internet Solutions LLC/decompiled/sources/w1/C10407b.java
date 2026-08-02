package w1;

import D1.J0;
import Sc.s;
import Z1.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10407b {

    /* renamed from: a, reason: collision with root package name */
    private e f103328a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f103329b = new a();

    /* renamed from: c, reason: collision with root package name */
    private M f103330c;

    /* renamed from: w1.b$a */
    static final class a extends AbstractC7737t implements Function0<M> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            return C10407b.this.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j11, long j12, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10408c c10408c;
        int i11;
        long j13;
        if (cVar instanceof C10408c) {
            c10408c = (C10408c) cVar;
            int i12 = c10408c.f103334f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c10408c.f103334f = i12 - LinearLayoutManager.INVALID_OFFSET;
                C10408c c10408c2 = c10408c;
                Object obj = c10408c2.f103332d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c10408c2.f103334f;
                if (i11 != 0) {
                    s.b(obj);
                    e eVar = this.f103328a;
                    e eVar2 = null;
                    if (eVar != null && eVar.isAttached()) {
                        eVar2 = (e) J0.b(eVar);
                    }
                    if (eVar2 == null) {
                        j13 = 0;
                        return w.a(j13);
                    }
                    c10408c2.f103334f = 1;
                    obj = eVar2.O(j11, j12, c10408c2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                j13 = ((w) obj).i();
                return w.a(j13);
            }
        }
        c10408c = new C10408c(this, cVar);
        C10408c c10408c22 = c10408c;
        Object obj2 = c10408c22.f103332d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10408c22.f103334f;
        if (i11 != 0) {
        }
        j13 = ((w) obj2).i();
        return w.a(j13);
    }

    public final long b(int i11, long j11, long j12) {
        e eVar = this.f103328a;
        e eVar2 = null;
        if (eVar != null && eVar.isAttached()) {
            eVar2 = (e) J0.b(eVar);
        }
        e eVar3 = eVar2;
        if (eVar3 != null) {
            return eVar3.f0(i11, j11, j12);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(long j11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        long j12;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f103337f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f103337f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f103335d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f103337f;
                if (i11 != 0) {
                    s.b(obj);
                    e eVar = this.f103328a;
                    e eVar2 = null;
                    if (eVar != null && eVar.isAttached()) {
                        eVar2 = (e) J0.b(eVar);
                    }
                    if (eVar2 == null) {
                        j12 = 0;
                        return w.a(j12);
                    }
                    dVar.f103337f = 1;
                    obj = eVar2.mo11onPreFlingQWom1Mo(j11, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                j12 = ((w) obj).i();
                return w.a(j12);
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f103335d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f103337f;
        if (i11 != 0) {
        }
        j12 = ((w) obj2).i();
        return w.a(j12);
    }

    public final long d(int i11, long j11) {
        e eVar = this.f103328a;
        e eVar2 = null;
        if (eVar != null && eVar.isAttached()) {
            eVar2 = (e) J0.b(eVar);
        }
        if (eVar2 != null) {
            return eVar2.mo12onPreScrollOzD1aCk(j11, i11);
        }
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @NotNull
    public final M e() {
        M m11 = (M) this.f103329b.invoke();
        if (m11 != null) {
            return m11;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final e f() {
        return this.f103328a;
    }

    public final M g() {
        return this.f103330c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(@NotNull Function0<? extends M> function0) {
        this.f103329b = (AbstractC7737t) function0;
    }

    public final void i(e eVar) {
        this.f103328a = eVar;
    }

    public final void j(M m11) {
        this.f103330c = m11;
    }
}
