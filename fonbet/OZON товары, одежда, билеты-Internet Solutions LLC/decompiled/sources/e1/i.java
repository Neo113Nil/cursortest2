package e1;

import Sc.s;
import e1.h;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import xe.E0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {67, 69}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f61785d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f61786e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f61787f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AtomicReference<h.a<Object>> f61788g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f61789h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    i(Function1<? super M, Object> function1, AtomicReference<h.a<Object>> atomicReference, Function2<Object, ? super kotlin.coroutines.d<Object>, ? extends Object> function2, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f61787f = (AbstractC7737t) function1;
        this.f61788g = atomicReference;
        this.f61789h = (kotlin.coroutines.jvm.internal.j) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        i iVar = new i(this.f61787f, this.f61788g, this.f61789h, dVar);
        iVar.f61786e = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0059, code lost:
    
        if (xe.E0.c(r9, r8) == r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        h.a<Object> aVar;
        h.a<Object> aVar2;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f61785d;
        AtomicReference<h.a<Object>> atomicReference = this.f61788g;
        try {
            if (i11 == 0) {
                s.b(obj);
                M m11 = (M) this.f61786e;
                aVar = new h.a<>(E0.g(m11.getCoroutineContext()), this.f61787f.invoke(m11));
                h.a<Object> andSet = atomicReference.getAndSet(aVar);
                if (andSet != null && (r9 = andSet.a()) != null) {
                    this.f61786e = aVar;
                    this.f61785d = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (h.a) this.f61786e;
                    try {
                        s.b(obj);
                        while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                        }
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                        }
                        throw th;
                    }
                }
                aVar = (h.a) this.f61786e;
                s.b(obj);
            }
            ?? r92 = this.f61789h;
            Object b11 = aVar.b();
            this.f61786e = aVar;
            this.f61785d = 2;
            obj = r92.invoke(b11, this);
            if (obj != aVar3) {
                aVar2 = aVar;
                while (!atomicReference.compareAndSet(aVar2, null)) {
                }
                return obj;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            while (!atomicReference.compareAndSet(aVar2, null)) {
            }
            throw th;
        }
    }
}
