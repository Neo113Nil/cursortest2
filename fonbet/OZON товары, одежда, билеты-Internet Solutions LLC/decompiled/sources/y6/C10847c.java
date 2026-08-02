package y6;

import Sc.s;
import android.util.Log;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

@e(c = "com.esiasdk.android.EsiaAuthVm$request$3", f = "EsiaAuthVm.kt", l = {97}, m = "invokeSuspend")
/* renamed from: y6.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10847c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f106080d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f106081e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ CoroutineContext f106082f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f106083g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f106084h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ j f106085i;

    @e(c = "com.esiasdk.android.EsiaAuthVm$request$3$result$1", f = "EsiaAuthVm.kt", l = {97}, m = "invokeSuspend")
    /* renamed from: y6.c$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106086d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j f106087e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f106087e = (j) function1;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f106087e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106086d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            this.f106086d = 1;
            Object invoke = this.f106087e.invoke(this);
            return invoke == aVar ? aVar : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C10847c(CoroutineContext coroutineContext, Function1<Object, Unit> function1, Function1<? super Exception, Unit> function12, Function1<? super kotlin.coroutines.d<Object>, ? extends Object> function13, kotlin.coroutines.d<? super C10847c> dVar) {
        super(2, dVar);
        this.f106082f = coroutineContext;
        this.f106083g = (AbstractC7737t) function1;
        this.f106084h = (AbstractC7737t) function12;
        this.f106085i = (j) function13;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        ?? r32 = this.f106084h;
        ?? r42 = this.f106085i;
        C10847c c10847c = new C10847c(this.f106082f, this.f106083g, r32, r42, dVar);
        c10847c.f106081e = obj;
        return c10847c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10847c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        M m11;
        Exception e11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f106080d;
        if (i11 == 0) {
            s.b(obj);
            M m12 = (M) this.f106081e;
            try {
                CoroutineContext coroutineContext = this.f106082f;
                a aVar2 = new a(this.f106085i, null);
                this.f106081e = m12;
                this.f106080d = 1;
                Object f7 = C10727i.f(coroutineContext, aVar2, this);
                if (f7 == aVar) {
                    return aVar;
                }
                m11 = m12;
                obj = f7;
            } catch (Exception e12) {
                m11 = m12;
                e11 = e12;
                Log.e(m11.getClass().getSimpleName(), "Request was failed: " + e11);
                this.f106084h.invoke(e11);
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.f106081e;
            try {
                s.b(obj);
            } catch (Exception e13) {
                e11 = e13;
                Log.e(m11.getClass().getSimpleName(), "Request was failed: " + e11);
                this.f106084h.invoke(e11);
                return Unit.f71690a;
            }
        }
        this.f106083g.invoke(obj);
        return Unit.f71690a;
    }
}
