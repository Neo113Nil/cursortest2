package Og;

import io.ktor.utils.io.f;
import kh.l;
import kh.u;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class d {

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f8647n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f8648o;

        /* renamed from: p, reason: collision with root package name */
        public int f8649p;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8648o = obj;
            this.f8649p |= Integer.MIN_VALUE;
            return d.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, Continuation continuation) {
        a aVar;
        int i10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f8649p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f8649p = i11 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.f8648o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar2.f8649p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.f b10 = bVar.f().b();
                    aVar2.f8647n = bVar;
                    aVar2.f8649p = 1;
                    obj = f.b.a(b10, 0L, aVar2, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) aVar2.f8647n;
                    ResultKt.throwOnFailure(obj);
                }
                return new e(bVar.c(), bVar.e(), bVar.f(), u.c((l) obj, 0, 1, null));
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.f8648o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar22.f8649p;
        if (i10 != 0) {
        }
        return new e(bVar.c(), bVar.e(), bVar.f(), u.c((l) obj2, 0, 1, null));
    }
}
