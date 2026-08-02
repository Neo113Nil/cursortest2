package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.B0;
import xe.C10727i;
import xe.E0;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$makeSearchRequest$2", f = "ChatSearchViewModel.kt", l = {440, 442, 445, 442, 445}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class v extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f91801d;

    /* renamed from: e, reason: collision with root package name */
    int f91802e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f91803f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C9527g f91804g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> f91805h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f91806i;

    static final class a extends AbstractC7737t implements Function1<Long, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.M<Long> f91807b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.M<Long> m11) {
            super(1);
            this.f91807b = m11;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Long] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l11) {
            this.f91807b.f71787a = Long.valueOf(l11.longValue());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    v(C9527g c9527g, Function2<? super Boolean, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, kotlin.coroutines.d<? super v> dVar) {
        super(2, dVar);
        this.f91804g = c9527g;
        this.f91805h = function2;
        this.f91806i = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        v vVar = new v(this.f91804g, this.f91805h, this.f91806i, dVar);
        vVar.f91803f = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((v) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (ru.ozon.android.messenger.framework.presentation.search.C9527g.w0(r3, r6, r2, r13) == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        if (xe.E0.c(r1, r13) == r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        B0 b02;
        Throwable th2;
        kotlin.jvm.internal.M m11;
        kotlin.jvm.internal.M m12;
        kotlin.jvm.internal.M m13;
        Long l11;
        Throwable th3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91802e;
        Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f91805h;
        C9527g c9527g = this.f91804g;
        if (i11 == 0) {
            Sc.s.b(obj);
            xe.M m14 = (xe.M) this.f91803f;
            kotlin.jvm.internal.M m15 = new kotlin.jvm.internal.M();
            B0 c11 = C10727i.c(m14, null, null, new q(function2, new a(m15), null), 3);
            try {
                Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f91806i;
                this.f91803f = m15;
                this.f91801d = c11;
                this.f91802e = 1;
                if (((E) function1).invoke(this) != aVar) {
                    m12 = m15;
                    b02 = c11;
                }
            } catch (Throwable th4) {
                b02 = c11;
                th2 = th4;
                m11 = m15;
                this.f91803f = m11;
                this.f91801d = th2;
                this.f91802e = 4;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                m13 = (kotlin.jvm.internal.M) this.f91803f;
                Sc.s.b(obj);
                l11 = (Long) m13.f71787a;
                if (l11 != null) {
                    long longValue = l11.longValue();
                    this.f91803f = null;
                    this.f91802e = 3;
                }
                return Unit.f71690a;
            }
            if (i11 == 3) {
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th3 = (Throwable) this.f91803f;
                Sc.s.b(obj);
                throw th3;
            }
            Throwable th5 = (Throwable) this.f91801d;
            m11 = (kotlin.jvm.internal.M) this.f91803f;
            Sc.s.b(obj);
            th2 = th5;
            Long l12 = (Long) m11.f71787a;
            if (l12 == null) {
                throw th2;
            }
            long longValue2 = l12.longValue();
            this.f91803f = th2;
            this.f91801d = null;
            this.f91802e = 5;
            if (C9527g.w0(c9527g, longValue2, function2, this) != aVar) {
                th3 = th2;
                throw th3;
            }
            return aVar;
        }
        b02 = (B0) this.f91801d;
        m12 = (kotlin.jvm.internal.M) this.f91803f;
        try {
            Sc.s.b(obj);
        } catch (Throwable th6) {
            th2 = th6;
            m11 = m12;
            this.f91803f = m11;
            this.f91801d = th2;
            this.f91802e = 4;
        }
        this.f91803f = m12;
        this.f91801d = null;
        this.f91802e = 2;
        if (E0.c(b02, this) != aVar) {
            m13 = m12;
            l11 = (Long) m13.f71787a;
            if (l11 != null) {
            }
            return Unit.f71690a;
        }
        return aVar;
    }
}
