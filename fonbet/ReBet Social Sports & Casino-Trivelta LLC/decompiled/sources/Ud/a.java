package Ud;

import Ph.AbstractC1459k;
import Ph.P;
import Td.e;
import jg.InterfaceC5133a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import td.C6461a;

/* loaded from: classes4.dex */
public final class a implements InterfaceC5133a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0254a f12180a = new C0254a(null);

    /* renamed from: Ud.a$a, reason: collision with other inner class name */
    public static final class C0254a {

        /* renamed from: Ud.a$a$a, reason: collision with other inner class name */
        public static final class C0255a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f12181n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Dg.b f12182o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Dg.a f12183p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0255a(Dg.b bVar, Dg.a aVar, Continuation continuation) {
                super(2, continuation);
                this.f12182o = bVar;
                this.f12183p = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0255a(this.f12182o, this.f12183p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((C0255a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f12181n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                e.f11456a.s0(this.f12182o, this.f12183p);
                b.d(this.f12182o, this.f12183p);
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ C0254a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Dg.b bVar, Dg.a aVar) {
            AbstractC1459k.d(C6461a.f65810a.d(), null, null, new C0255a(bVar, aVar, null), 3, null);
        }

        public C0254a() {
        }
    }
}
