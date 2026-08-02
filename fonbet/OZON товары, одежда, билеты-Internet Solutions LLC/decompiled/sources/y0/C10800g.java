package y0;

import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import r0.C9115P;
import r0.C9140t;
import x1.C10638m;
import x1.C10639n;
import x1.EnumC10640o;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1", f = "LazyLayoutPager.kt", l = {284}, m = "invokeSuspend")
/* renamed from: y0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10800g extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105811d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f105812e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b0 f105813f;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {285}, m = "invokeSuspend")
    /* renamed from: y0.g$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105814d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ x1.F f105815e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b0 f105816f;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {287, 291}, m = "invokeSuspend")
        /* renamed from: y0.g$a$a, reason: collision with other inner class name */
        static final class C2287a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            x1.x f105817d;

            /* renamed from: e, reason: collision with root package name */
            x1.x f105818e;

            /* renamed from: f, reason: collision with root package name */
            int f105819f;

            /* renamed from: g, reason: collision with root package name */
            private /* synthetic */ Object f105820g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ b0 f105821h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2287a(b0 b0Var, kotlin.coroutines.d<? super C2287a> dVar) {
                super(2, dVar);
                this.f105821h = b0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C2287a c2287a = new C2287a(this.f105821h, dVar);
                c2287a.f105820g = obj;
                return c2287a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2287a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
            
                if (r12 == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
            
                if (r12 == r0) goto L17;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:6:0x005e). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC10628c interfaceC10628c;
                InterfaceC10628c interfaceC10628c2;
                x1.x xVar;
                x1.x xVar2;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f105819f;
                b0 b0Var = this.f105821h;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    interfaceC10628c = (InterfaceC10628c) this.f105820g;
                    EnumC10640o enumC10640o = EnumC10640o.Initial;
                    this.f105820g = interfaceC10628c;
                    this.f105819f = 1;
                    obj = C9115P.c(interfaceC10628c, false, enumC10640o, this);
                } else if (i11 == 1) {
                    interfaceC10628c = (InterfaceC10628c) this.f105820g;
                    Sc.s.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = this.f105818e;
                    xVar2 = this.f105817d;
                    interfaceC10628c2 = (InterfaceC10628c) this.f105820g;
                    Sc.s.b(obj);
                    C10638m c10638m = (C10638m) obj;
                    List<x1.x> b11 = c10638m.b();
                    int size = b11.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            xVar = c10638m.b().get(0);
                            break;
                        }
                        if (!C10639n.b(b11.get(i12))) {
                            break;
                        }
                        i12++;
                    }
                    if (xVar == null) {
                        b0Var.U(C7459e.j(xVar.f(), xVar2.f()));
                        return Unit.f71690a;
                    }
                    EnumC10640o enumC10640o2 = EnumC10640o.Initial;
                    this.f105820g = interfaceC10628c2;
                    this.f105817d = xVar2;
                    this.f105818e = xVar;
                    this.f105819f = 2;
                    obj = interfaceC10628c2.i0(enumC10640o2, this);
                }
                b0Var.U(0L);
                interfaceC10628c2 = interfaceC10628c;
                xVar = null;
                xVar2 = (x1.x) obj;
                if (xVar == null) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(x1.F f7, b0 b0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f105815e = f7;
            this.f105816f = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f105815e, this.f105816f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105814d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C2287a c2287a = new C2287a(this.f105816f, null);
                this.f105814d = 1;
                if (C9140t.b(this.f105815e, c2287a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10800g(b0 b0Var, kotlin.coroutines.d<? super C10800g> dVar) {
        super(2, dVar);
        this.f105813f = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C10800g c10800g = new C10800g(this.f105813f, dVar);
        c10800g.f105812e = obj;
        return c10800g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10800g) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105811d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a((x1.F) this.f105812e, this.f105813f, null);
            this.f105811d = 1;
            if (xe.N.d(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
