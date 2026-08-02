package U2;

import Q2.C1493d;
import Rh.w;
import Rh.y;
import androidx.work.impl.constraints.b;
import androidx.work.impl.model.WorkSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final V2.h f12012a;

    /* renamed from: U2.a$a, reason: collision with other inner class name */
    public static final class C0244a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f12013n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f12014o;

        /* renamed from: U2.a$a$a, reason: collision with other inner class name */
        public static final class C0245a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f12016d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f12017e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0245a(a aVar, b bVar) {
                super(0);
                this.f12016d = aVar;
                this.f12017e = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m20invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m20invoke() {
                this.f12016d.f12012a.f(this.f12017e);
            }
        }

        /* renamed from: U2.a$a$b */
        public static final class b implements androidx.work.impl.constraints.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f12018a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ y f12019b;

            public b(a aVar, y yVar) {
                this.f12018a = aVar;
                this.f12019b = yVar;
            }

            @Override // androidx.work.impl.constraints.a
            public void a(Object obj) {
                this.f12019b.d().h(this.f12018a.f(obj) ? new b.C0420b(this.f12018a.e()) : b.a.f23858a);
            }
        }

        public C0244a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0244a c0244a = a.this.new C0244a(continuation);
            c0244a.f12014o = obj;
            return c0244a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y yVar, Continuation continuation) {
            return ((C0244a) create(yVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f12013n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                y yVar = (y) this.f12014o;
                b bVar = new b(a.this, yVar);
                a.this.f12012a.c(bVar);
                C0245a c0245a = new C0245a(a.this, bVar);
                this.f12013n = 1;
                if (w.a(yVar, c0245a, this) == coroutine_suspended) {
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

    public a(V2.h tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f12012a = tracker;
    }

    @Override // U2.d
    public InterfaceC5321f a(C1493d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return AbstractC5323h.e(new C0244a(null));
    }

    @Override // U2.d
    public boolean b(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return c(workSpec) && f(this.f12012a.e());
    }

    public abstract int e();

    public abstract boolean f(Object obj);
}
