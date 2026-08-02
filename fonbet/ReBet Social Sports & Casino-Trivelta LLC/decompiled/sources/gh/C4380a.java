package gh;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gh.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4380a extends AbstractC4384e {

    /* renamed from: b, reason: collision with root package name */
    public final List f47422b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f47423c;

    /* renamed from: d, reason: collision with root package name */
    public Object f47424d;

    /* renamed from: e, reason: collision with root package name */
    public int f47425e;

    /* renamed from: gh.a$a, reason: collision with other inner class name */
    public static final class C0707a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f47426n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f47427o;

        /* renamed from: q, reason: collision with root package name */
        public int f47429q;

        public C0707a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f47427o = obj;
            this.f47429q |= Integer.MIN_VALUE;
            return C4380a.this.i(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4380a(Object context, List interceptors, Object subject, CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f47422b = interceptors;
        this.f47423c = coroutineContext;
        this.f47424d = subject;
    }

    @Override // gh.AbstractC4384e
    public Object a(Object obj, Continuation continuation) {
        this.f47425e = 0;
        j(obj);
        return c(continuation);
    }

    @Override // gh.AbstractC4384e
    public Object c(Continuation continuation) {
        int i10 = this.f47425e;
        if (i10 < 0) {
            return h();
        }
        if (i10 < this.f47422b.size()) {
            return i(continuation);
        }
        g();
        return h();
    }

    @Override // gh.AbstractC4384e
    public Object e(Object obj, Continuation continuation) {
        j(obj);
        return c(continuation);
    }

    public void g() {
        this.f47425e = -1;
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f47423c;
    }

    public Object h() {
        return this.f47424d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Continuation continuation) {
        C0707a c0707a;
        Object coroutine_suspended;
        int i10;
        C4380a c4380a;
        int i11;
        Function3 function3;
        Object h10;
        if (continuation instanceof C0707a) {
            c0707a = (C0707a) continuation;
            int i12 = c0707a.f47429q;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0707a.f47429q = i12 - Integer.MIN_VALUE;
                Object obj = c0707a.f47427o;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0707a.f47429q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    c4380a = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4380a = (C4380a) c0707a.f47426n;
                    ResultKt.throwOnFailure(obj);
                }
                do {
                    i11 = c4380a.f47425e;
                    if (i11 == -1) {
                        List list = c4380a.f47422b;
                        if (i11 >= list.size()) {
                            c4380a.g();
                        } else {
                            function3 = (Function3) list.get(i11);
                            c4380a.f47425e = i11 + 1;
                            Intrinsics.checkNotNull(function3, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
                            h10 = c4380a.h();
                            c0707a.f47426n = c4380a;
                            c0707a.f47429q = 1;
                        }
                    }
                    return c4380a.h();
                } while (function3.invoke(c4380a, h10, c0707a) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        c0707a = new C0707a(continuation);
        Object obj2 = c0707a.f47427o;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0707a.f47429q;
        if (i10 != 0) {
        }
        do {
            i11 = c4380a.f47425e;
            if (i11 == -1) {
            }
            return c4380a.h();
        } while (function3.invoke(c4380a, h10, c0707a) != coroutine_suspended);
        return coroutine_suspended;
    }

    public void j(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f47424d = obj;
    }
}
