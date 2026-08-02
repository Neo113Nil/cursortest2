package ch;

import io.ktor.utils.io.f;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class g {

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f27820n;

        /* renamed from: o, reason: collision with root package name */
        public int f27821o;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27820n = obj;
            this.f27821o |= Integer.MIN_VALUE;
            return g.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(io.ktor.utils.io.f fVar, Continuation continuation) {
        a aVar;
        int i10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f27821o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f27821o = i11 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.f27820n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar2.f27821o;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar2.f27821o = 1;
                    obj = f.b.a(fVar, 0L, aVar2, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return kh.u.c((kh.l) obj, 0, 1, null);
            }
        }
        aVar = new a(continuation);
        a aVar22 = aVar;
        Object obj2 = aVar22.f27820n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar22.f27821o;
        if (i10 != 0) {
        }
        return kh.u.c((kh.l) obj2, 0, 1, null);
    }
}
