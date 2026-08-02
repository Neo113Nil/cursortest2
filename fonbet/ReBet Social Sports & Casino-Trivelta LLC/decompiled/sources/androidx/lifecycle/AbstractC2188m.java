package androidx.lifecycle;

import Ph.AbstractC1459k;
import Ph.C0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2188m implements Ph.P {

    /* renamed from: androidx.lifecycle.m$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f20402n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function2 f20404p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f20404p = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AbstractC2188m.this.new a(this.f20404p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f20402n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = AbstractC2188m.this.getLifecycle();
                Function2 function2 = this.f20404p;
                this.f20402n = 1;
                if (F.a(lifecycle, function2, this) == coroutine_suspended) {
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

    /* renamed from: androidx.lifecycle.m$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f20405n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function2 f20407p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f20407p = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AbstractC2188m.this.new b(this.f20407p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f20405n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = AbstractC2188m.this.getLifecycle();
                Function2 function2 = this.f20407p;
                this.f20405n = 1;
                if (F.b(lifecycle, function2, this) == coroutine_suspended) {
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

    /* renamed from: androidx.lifecycle.m$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f20408n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function2 f20410p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f20410p = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AbstractC2188m.this.new c(this.f20410p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f20408n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = AbstractC2188m.this.getLifecycle();
                Function2 function2 = this.f20410p;
                this.f20408n = 1;
                if (F.c(lifecycle, function2, this) == coroutine_suspended) {
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

    /* renamed from: a */
    public abstract AbstractC2185j getLifecycle();

    public final C0 b(Function2 block) {
        C0 d10;
        Intrinsics.checkNotNullParameter(block, "block");
        d10 = AbstractC1459k.d(this, null, null, new a(block, null), 3, null);
        return d10;
    }

    public final C0 c(Function2 block) {
        C0 d10;
        Intrinsics.checkNotNullParameter(block, "block");
        d10 = AbstractC1459k.d(this, null, null, new b(block, null), 3, null);
        return d10;
    }

    public final C0 e(Function2 block) {
        C0 d10;
        Intrinsics.checkNotNullParameter(block, "block");
        d10 = AbstractC1459k.d(this, null, null, new c(block, null), 3, null);
        return d10;
    }
}
