package z0;

import D1.AbstractC2810k0;
import D1.C2809k;
import Sc.s;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.C9126f;
import xe.B0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super B0>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f106857d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ e f106858e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2810k0 f106859f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f106860g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<C7460f> f106861h;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {196}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106862d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f106863e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC2810k0 f106864f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f106865g;

        /* renamed from: z0.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C2312a extends C7735q implements Function0<C7460f> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f106866a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC2810k0 f106867b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC7737t f106868c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2312a(e eVar, AbstractC2810k0 abstractC2810k0, Function0 function0) {
                super(0, Intrinsics.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.f106866a = eVar;
                this.f106867b = abstractC2810k0;
                this.f106868c = (AbstractC7737t) function0;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
            @Override // kotlin.jvm.functions.Function0
            public final C7460f invoke() {
                ?? r02 = this.f106868c;
                return e.I1(this.f106866a, this.f106867b, r02);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(e eVar, AbstractC2810k0 abstractC2810k0, Function0 function0, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f106863e = eVar;
            this.f106864f = abstractC2810k0;
            this.f106865g = (AbstractC7737t) function0;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f106863e, this.f106864f, this.f106865g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106862d;
            if (i11 == 0) {
                s.b(obj);
                e eVar = this.f106863e;
                d J12 = eVar.J1();
                C2312a c2312a = new C2312a(eVar, this.f106864f, this.f106865g);
                this.f106862d = 1;
                if (((C9126f) J12).Q1(c2312a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {207}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f106869d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f106870e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<C7460f> f106871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, Function0<C7460f> function0, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f106870e = eVar;
            this.f106871f = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new b(this.f106870e, this.f106871f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC10968a b11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f106869d;
            if (i11 == 0) {
                s.b(obj);
                e eVar = this.f106870e;
                if (eVar.isAttached() && (b11 = c.b(eVar)) != null) {
                    AbstractC2810k0 e11 = C2809k.e(eVar);
                    this.f106869d = 1;
                    if (b11.n1(e11, this.f106871f, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    f(e eVar, AbstractC2810k0 abstractC2810k0, Function0 function0, Function0 function02, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f106858e = eVar;
        this.f106859f = abstractC2810k0;
        this.f106860g = (AbstractC7737t) function0;
        this.f106861h = function02;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        ?? r32 = this.f106860g;
        Function0<C7460f> function0 = this.f106861h;
        f fVar = new f(this.f106858e, this.f106859f, r32, function0, dVar);
        fVar.f106857d = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super B0> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        M m11 = (M) this.f106857d;
        AbstractC2810k0 abstractC2810k0 = this.f106859f;
        ?? r22 = this.f106860g;
        e eVar = this.f106858e;
        C10727i.c(m11, null, null, new a(eVar, abstractC2810k0, r22, null), 3);
        return C10727i.c(m11, null, null, new b(eVar, this.f106861h, null), 3);
    }
}
