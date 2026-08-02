package Tg;

import bh.AbstractC2423b;
import ch.C2924a;
import ch.InterfaceC2925b;
import gh.AbstractC4384e;
import gh.C4387h;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Tg.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1694a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0232a f11797a = new C0232a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final C2924a f11798b = new C2924a("BodyProgress");

    /* renamed from: Tg.a$a, reason: collision with other inner class name */
    public static final class C0232a implements k {
        public /* synthetic */ C0232a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Tg.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(C1694a plugin, Ng.a scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            plugin.c(scope);
        }

        @Override // Tg.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C1694a a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C1694a();
        }

        @Override // Tg.k
        public C2924a getKey() {
            return C1694a.f11798b;
        }

        public C0232a() {
        }
    }

    /* renamed from: Tg.a$b */
    public static final class b extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f11799n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f11800o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f11801p;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f11800o = abstractC4384e;
            bVar.f11801p = obj;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2924a c2924a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11799n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11800o;
                Object obj2 = this.f11801p;
                InterfaceC2925b c10 = ((Wg.c) abstractC4384e.b()).c();
                c2924a = Tg.b.f11805a;
                Function3 function3 = (Function3) c10.f(c2924a);
                if (function3 == null) {
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
                Pg.a aVar = new Pg.a((AbstractC2423b) obj2, ((Wg.c) abstractC4384e.b()).g(), function3);
                this.f11800o = null;
                this.f11799n = 1;
                if (abstractC4384e.e(aVar, this) == coroutine_suspended) {
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

    /* renamed from: Tg.a$c */
    public static final class c extends SuspendLambda implements Function3 {

        /* renamed from: n, reason: collision with root package name */
        public int f11802n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f11803o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f11804p;

        public c(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4384e abstractC4384e, Xg.c cVar, Continuation continuation) {
            c cVar2 = new c(continuation);
            cVar2.f11803o = abstractC4384e;
            cVar2.f11804p = cVar;
            return cVar2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2924a c2924a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11802n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11803o;
                Xg.c cVar = (Xg.c) this.f11804p;
                InterfaceC2925b attributes = cVar.r().e().getAttributes();
                c2924a = Tg.b.f11806b;
                Function3 function3 = (Function3) attributes.f(c2924a);
                if (function3 == null) {
                    return Unit.INSTANCE;
                }
                Xg.c c10 = Tg.b.c(cVar, function3);
                this.f11803o = null;
                this.f11802n = 1;
                if (abstractC4384e.e(c10, this) == coroutine_suspended) {
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

    public final void c(Ng.a aVar) {
        C4387h c4387h = new C4387h("ObservableContent");
        aVar.z0().j(Wg.f.f13260g.b(), c4387h);
        aVar.z0().l(c4387h, new b(null));
        aVar.w0().l(Xg.b.f13834g.a(), new c(null));
    }
}
