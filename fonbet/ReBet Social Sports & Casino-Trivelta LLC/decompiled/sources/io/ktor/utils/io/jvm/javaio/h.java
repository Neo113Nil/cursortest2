package io.ktor.utils.io.jvm.javaio;

import Ph.C1452g0;
import Ph.C1483w0;
import io.ktor.utils.io.n;
import io.ktor.utils.io.r;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mh.AbstractC5585a;

/* loaded from: classes3.dex */
public abstract class h {

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f49517n;

        /* renamed from: o, reason: collision with root package name */
        public int f49518o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f49519p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ mh.f f49520q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InputStream f49521r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mh.f fVar, InputStream inputStream, Continuation continuation) {
            super(2, continuation);
            this.f49520q = fVar;
            this.f49521r = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f49520q, this.f49521r, continuation);
            aVar.f49519p = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(r rVar, Continuation continuation) {
            return ((a) create(rVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            byte[] bArr;
            r rVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f49518o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                r rVar2 = (r) this.f49519p;
                bArr = (byte[]) this.f49520q.V0();
                rVar = rVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = (byte[]) this.f49517n;
                rVar = (r) this.f49519p;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    try {
                        rVar.d().a(th2);
                        this.f49520q.O1(bArr);
                        this.f49521r.close();
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        this.f49520q.O1(bArr);
                        this.f49521r.close();
                        throw th3;
                    }
                }
            }
            while (true) {
                int read = this.f49521r.read(bArr, 0, bArr.length);
                if (read < 0) {
                    this.f49520q.O1(bArr);
                    break;
                }
                if (read != 0) {
                    io.ktor.utils.io.i d10 = rVar.d();
                    this.f49519p = rVar;
                    this.f49517n = bArr;
                    this.f49518o = 1;
                    if (d10.h(bArr, 0, read, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
    }

    public static final io.ktor.utils.io.f a(InputStream inputStream, CoroutineContext context, mh.f pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return n.b(C1483w0.f9135a, context, true, new a(pool, inputStream, null)).d();
    }

    public static /* synthetic */ io.ktor.utils.io.f b(InputStream inputStream, CoroutineContext coroutineContext, mh.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = C1452g0.b();
        }
        if ((i10 & 2) != 0) {
            fVar = AbstractC5585a.a();
        }
        return a(inputStream, coroutineContext, fVar);
    }
}
