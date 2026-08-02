package Xg;

import Ph.A;
import Ph.C0;
import ah.AbstractC2026s;
import hh.AbstractC4509b;
import hh.C4508a;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import jh.AbstractC5136b;
import kh.n;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public abstract class e {

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f13841n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f13842o;

        /* renamed from: p, reason: collision with root package name */
        public int f13843p;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13842o = obj;
            this.f13843p |= Integer.MIN_VALUE;
            return e.a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, Charset charset, Continuation continuation) {
        a aVar;
        Object obj;
        int i10;
        CharsetDecoder decoder;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f13843p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f13843p = i11 - Integer.MIN_VALUE;
                obj = aVar.f13842o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f13843p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Charset a10 = AbstractC2026s.a(cVar);
                    if (a10 != null) {
                        charset = a10;
                    }
                    CharsetDecoder newDecoder = charset.newDecoder();
                    Og.b r10 = cVar.r();
                    KType typeOf = Reflection.typeOf(n.class);
                    C4508a b10 = AbstractC4509b.b(TypesJVMKt.getJavaType(typeOf), Reflection.getOrCreateKotlinClass(n.class), typeOf);
                    aVar.f13841n = newDecoder;
                    aVar.f13843p = 1;
                    obj = r10.a(b10, aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    decoder = newDecoder;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    decoder = (CharsetDecoder) aVar.f13841n;
                    ResultKt.throwOnFailure(obj);
                }
                if (obj != null) {
                    throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.Input");
                }
                Intrinsics.checkNotNullExpressionValue(decoder, "decoder");
                return AbstractC5136b.b(decoder, (n) obj, 0, 2, null);
            }
        }
        aVar = new a(continuation);
        obj = aVar.f13842o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f13843p;
        if (i10 != 0) {
        }
        if (obj != null) {
        }
    }

    public static /* synthetic */ Object b(c cVar, Charset charset, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return a(cVar, charset, continuation);
    }

    public static final void c(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        CoroutineContext.Element element = cVar.getCoroutineContext().get(C0.f9001U2);
        Intrinsics.checkNotNull(element);
        ((A) element).y1();
    }

    public static final Wg.b d(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.r().e();
    }
}
