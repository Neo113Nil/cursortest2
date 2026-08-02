package ru.ozon.android.messenger.utils.coroutines;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.coroutines.CoroutineExtKt$throttleLatest$1$1", f = "CoroutineExt.kt", l = {23, 24}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91887d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f91888e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f91889f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Object> f91890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(long j11, Function2<Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.jvm.internal.M<Object> m11, kotlin.coroutines.d<? super b> dVar) {
        super(2, dVar);
        this.f91888e = j11;
        this.f91889f = function2;
        this.f91890g = m11;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f91888e, this.f91889f, this.f91890g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5.f91889f.invoke(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (xe.Y.b(r5.f91888e, r5) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91887d;
        if (i11 == 0) {
            s.b(obj);
            this.f91887d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        Object obj2 = this.f91890g.f71787a;
        this.f91887d = 2;
    }
}
