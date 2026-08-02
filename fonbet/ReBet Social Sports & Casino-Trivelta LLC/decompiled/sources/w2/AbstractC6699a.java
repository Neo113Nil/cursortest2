package w2;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import Ph.Q;
import Ph.X;
import Ta.o;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v2.AbstractC6630b;
import x2.AbstractC6779a;
import x2.AbstractC6780b;
import x2.AbstractC6791m;
import x2.AbstractC6792n;
import x2.AbstractC6793o;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6699a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f67268a = new b(null);

    /* renamed from: w2.a$a, reason: collision with other inner class name */
    public static final class C0950a extends AbstractC6699a {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC6780b f67269b;

        /* renamed from: w2.a$a$a, reason: collision with other inner class name */
        public static final class C0951a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f67270n;

            public C0951a(AbstractC6779a abstractC6779a, Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return C0950a.this.new C0951a(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0951a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f67270n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC6780b abstractC6780b = C0950a.this.f67269b;
                    this.f67270n = 1;
                    if (abstractC6780b.a(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: w2.a$a$b */
        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f67272n;

            public b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return C0950a.this.new b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f67272n;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                AbstractC6780b abstractC6780b = C0950a.this.f67269b;
                this.f67272n = 1;
                Object b10 = abstractC6780b.b(this);
                return b10 == coroutine_suspended ? coroutine_suspended : b10;
            }
        }

        /* renamed from: w2.a$a$c */
        public static final class c extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f67274n;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Uri f67276p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ InputEvent f67277q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, Continuation continuation) {
                super(2, continuation);
                this.f67276p = uri;
                this.f67277q = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return C0950a.this.new c(this.f67276p, this.f67277q, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f67274n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC6780b abstractC6780b = C0950a.this.f67269b;
                    Uri uri = this.f67276p;
                    InputEvent inputEvent = this.f67277q;
                    this.f67274n = 1;
                    if (abstractC6780b.c(uri, inputEvent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: w2.a$a$d */
        public static final class d extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f67278n;

            public d(AbstractC6791m abstractC6791m, Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return C0950a.this.new d(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f67278n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC6780b abstractC6780b = C0950a.this.f67269b;
                    this.f67278n = 1;
                    if (abstractC6780b.d(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: w2.a$a$e */
        public static final class e extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f67280n;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Uri f67282p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, Continuation continuation) {
                super(2, continuation);
                this.f67282p = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return C0950a.this.new e(this.f67282p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f67280n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC6780b abstractC6780b = C0950a.this.f67269b;
                    Uri uri = this.f67282p;
                    this.f67280n = 1;
                    if (abstractC6780b.e(uri, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: w2.a$a$f */
        public static final class f extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f67283n;

            public f(AbstractC6792n abstractC6792n, Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return C0950a.this.new f(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f67283n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC6780b abstractC6780b = C0950a.this.f67269b;
                    this.f67283n = 1;
                    if (abstractC6780b.f(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: w2.a$a$g */
        public static final class g extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f67285n;

            public g(AbstractC6793o abstractC6793o, Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return C0950a.this.new g(null, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f67285n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC6780b abstractC6780b = C0950a.this.f67269b;
                    this.f67285n = 1;
                    if (abstractC6780b.g(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public C0950a(AbstractC6780b mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f67269b = mMeasurementManager;
        }

        @Override // w2.AbstractC6699a
        @NotNull
        public o b() {
            X b10;
            b10 = AbstractC1459k.b(Q.a(C1452g0.a()), null, null, new b(null), 3, null);
            return AbstractC6630b.c(b10, null, 1, null);
        }

        @Override // w2.AbstractC6699a
        @NotNull
        public o c(@NotNull Uri trigger) {
            X b10;
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            b10 = AbstractC1459k.b(Q.a(C1452g0.a()), null, null, new e(trigger, null), 3, null);
            return AbstractC6630b.c(b10, null, 1, null);
        }

        @NotNull
        public o e(@NotNull AbstractC6779a deletionRequest) {
            X b10;
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            b10 = AbstractC1459k.b(Q.a(C1452g0.a()), null, null, new C0951a(deletionRequest, null), 3, null);
            return AbstractC6630b.c(b10, null, 1, null);
        }

        @NotNull
        public o f(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            X b10;
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            b10 = AbstractC1459k.b(Q.a(C1452g0.a()), null, null, new c(attributionSource, inputEvent, null), 3, null);
            return AbstractC6630b.c(b10, null, 1, null);
        }

        @NotNull
        public o g(@NotNull AbstractC6791m request) {
            X b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = AbstractC1459k.b(Q.a(C1452g0.a()), null, null, new d(request, null), 3, null);
            return AbstractC6630b.c(b10, null, 1, null);
        }

        @NotNull
        public o h(@NotNull AbstractC6792n request) {
            X b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = AbstractC1459k.b(Q.a(C1452g0.a()), null, null, new f(request, null), 3, null);
            return AbstractC6630b.c(b10, null, 1, null);
        }

        @NotNull
        public o i(@NotNull AbstractC6793o request) {
            X b10;
            Intrinsics.checkNotNullParameter(request, "request");
            b10 = AbstractC1459k.b(Q.a(C1452g0.a()), null, null, new g(request, null), 3, null);
            return AbstractC6630b.c(b10, null, 1, null);
        }
    }

    /* renamed from: w2.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6699a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC6780b a10 = AbstractC6780b.f67822a.a(context);
            if (a10 != null) {
                return new C0950a(a10);
            }
            return null;
        }

        public b() {
        }
    }

    public static final AbstractC6699a a(Context context) {
        return f67268a.a(context);
    }

    public abstract o b();

    public abstract o c(Uri uri);
}
