package lf0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B4.C2581j;
import B4.C2584m;
import B4.H;
import B4.L;
import B4.P;
import C.Z;
import Sc.o;
import Sc.s;
import android.net.Uri;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import gf0.C6730b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC8141c;
import mf0.InterfaceC8142d;
import of0.InterfaceC8732a;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;
import xe.N;

/* renamed from: lf0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7951b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC8142d f73284a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final P f73285b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.navigation.core.integration.jetpack.ActivityScreenNavigator$listenCommands$2", f = "ActivityScreenNavigator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lf0.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f73286d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.navigation.core.integration.jetpack.ActivityScreenNavigator$listenCommands$2$1", f = "ActivityScreenNavigator.kt", l = {46}, m = "invokeSuspend")
        /* renamed from: lf0.b$a$a, reason: collision with other inner class name */
        static final class C1236a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f73288d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C7951b f73289e;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.navigation.core.integration.jetpack.ActivityScreenNavigator$listenCommands$2$1$1", f = "ActivityScreenNavigator.kt", l = {}, m = "invokeSuspend")
            /* renamed from: lf0.b$a$a$a, reason: collision with other inner class name */
            static final class C1237a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC8141c, kotlin.coroutines.d<? super Boolean>, Object> {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f73290d;

                C1237a() {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C1237a c1237a = new C1237a(2, dVar);
                    c1237a.f73290d = obj;
                    return c1237a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC8141c interfaceC8141c, kotlin.coroutines.d<? super Boolean> dVar) {
                    return ((C1237a) create(interfaceC8141c, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    s.b(obj);
                    return Boolean.valueOf(!(((InterfaceC8141c) this.f73290d) instanceof InterfaceC8141c.f));
                }
            }

            /* renamed from: lf0.b$a$a$b, reason: collision with other inner class name */
            static final class C1238b<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C7951b f73291a;

                C1238b(C7951b c7951b) {
                    this.f73291a = c7951b;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    C7951b.c(this.f73291a, (InterfaceC8141c) obj);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1236a(C7951b c7951b, kotlin.coroutines.d<? super C1236a> dVar) {
                super(2, dVar);
                this.f73289e = c7951b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1236a(this.f73289e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1236a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f73288d;
                if (i11 == 0) {
                    s.b(obj);
                    C7951b c7951b = this.f73289e;
                    Ae.P p11 = new Ae.P(c7951b.f73284a.d(), new C1237a(2, null));
                    C1238b c1238b = new C1238b(c7951b);
                    this.f73288d = 1;
                    if (p11.collect(c1238b, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.navigation.core.integration.jetpack.ActivityScreenNavigator$listenCommands$2$2", f = "ActivityScreenNavigator.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: lf0.b$a$b, reason: collision with other inner class name */
        static final class C1239b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f73292d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C7951b f73293e;

            /* renamed from: lf0.b$a$b$a, reason: collision with other inner class name */
            static final class C1240a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C7951b f73294a;

                C1240a(C7951b c7951b) {
                    this.f73294a = c7951b;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    this.f73294a.f73284a.b(new C7955f((C2581j) obj));
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1239b(C7951b c7951b, kotlin.coroutines.d<? super C1239b> dVar) {
                super(2, dVar);
                this.f73293e = c7951b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1239b(this.f73293e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1239b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f73292d;
                if (i11 == 0) {
                    s.b(obj);
                    C7951b c7951b = this.f73293e;
                    InterfaceC2395h<C2581j> x11 = c7951b.f73285b.x();
                    C1240a c1240a = new C1240a(c7951b);
                    this.f73292d = 1;
                    if (x11.collect(c1240a, this) == aVar) {
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

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = C7951b.this.new a(dVar);
            aVar.f73286d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            M m11 = (M) this.f73286d;
            C7951b c7951b = C7951b.this;
            C10727i.c(m11, null, null, new C1236a(c7951b, null), 3);
            C10727i.c(m11, null, null, new C1239b(c7951b, null), 3);
            return Unit.f71690a;
        }
    }

    public C7951b(@NotNull InterfaceC8142d router, @NotNull P navController) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.f73284a = router;
        this.f73285b = navController;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [gf0.a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gf0.a] */
    public static final void c(C7951b c7951b, InterfaceC8141c interfaceC8141c) {
        C2581j c2581j;
        C5418g0 g10;
        D d11;
        c7951b.getClass();
        boolean z11 = interfaceC8141c instanceof InterfaceC8141c.i;
        P p11 = c7951b.f73285b;
        if (z11) {
            InterfaceC8141c.i iVar = (InterfaceC8141c.i) interfaceC8141c;
            H y11 = p11.y();
            iVar.getClass();
            if (Intrinsics.d(y11 != null ? y11.q() : null, g.c(iVar.a().c()))) {
                return;
            }
            C6730b<?> a11 = iVar.a();
            Intrinsics.checkNotNullParameter(a11, "<this>");
            String e11 = a11.c().e();
            HashMap b11 = a11.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : b11.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List I02 = C7714v.I0(new io.sentry.android.replay.i(1), U.r(linkedHashMap));
            String route = U7.d.e(e11, I02.isEmpty() ? "" : C7714v.V(I02, "&", "?", null, i.f73304b, 28));
            C7952c builder = new C7952c(c7951b, iVar);
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(builder, "builder");
            C2584m.L(p11, route, B4.U.a(builder), 4);
            return;
        }
        if (interfaceC8141c instanceof InterfaceC8141c.h) {
            ((InterfaceC8141c.h) interfaceC8141c).getClass();
            Intrinsics.checkNotNullParameter(null, "<this>");
            throw null;
        }
        if (interfaceC8141c instanceof InterfaceC8141c.e) {
            ((InterfaceC8141c.e) interfaceC8141c).getClass();
            try {
                if (p11.G(null)) {
                    return;
                }
                int i11 = InterfaceC8732a.f78317a;
                Intrinsics.checkNotNullParameter("", "uri");
                Z exception = new Z("Ошибка сопоставления диплинка  с существующими шаблонами");
                Intrinsics.checkNotNullParameter(exception, "exception");
                return;
            } catch (IllegalStateException cause) {
                int i12 = InterfaceC8732a.f78317a;
                Intrinsics.checkNotNullParameter("", "uri");
                Intrinsics.checkNotNullParameter(cause, "cause");
                C7954e exception2 = new C7954e("Ошибка навигации на диплинк: ".concat(""), cause);
                Intrinsics.checkNotNullParameter(exception2, "exception");
                p11.N();
                return;
            }
        }
        if (interfaceC8141c instanceof InterfaceC8141c.d) {
            InterfaceC8141c.d dVar = (InterfaceC8141c.d) interfaceC8141c;
            Uri parse = Uri.parse(dVar.a());
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            p11.K(parse, B4.U.a(new C7953d(c7951b, dVar)));
            return;
        }
        if (interfaceC8141c instanceof InterfaceC8141c.b) {
            List<C2581j> value = p11.v().getValue();
            int i13 = 0;
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    if (!(((C2581j) it.next()).d() instanceof L) && (i13 = i13 + 1) < 0) {
                        C7714v.N0();
                        throw null;
                    }
                }
            }
            if (i13 != 1) {
                p11.N();
                return;
            } else {
                int i14 = InterfaceC8732a.f78317a;
                Intrinsics.checkNotNullParameter("Навигация назад была вызвана, когда в бэкстэке была только одна точка назначения. Возможно, из-за двойного клика или вызова в неверное время", "message");
                return;
            }
        }
        if (interfaceC8141c instanceof InterfaceC8141c.C1273c) {
            ((InterfaceC8141c.C1273c) interfaceC8141c).getClass();
            g.c(null);
            throw null;
        }
        if (interfaceC8141c instanceof InterfaceC8141c.g) {
            ((InterfaceC8141c.g) interfaceC8141c).getClass();
            throw null;
        }
        if (!(interfaceC8141c instanceof InterfaceC8141c.a)) {
            if (!Intrinsics.d(interfaceC8141c, InterfaceC8141c.f.f74840a)) {
                throw new o();
            }
            return;
        }
        ((InterfaceC8141c.a) interfaceC8141c).getClass();
        List<C2581j> value2 = p11.v().getValue();
        ListIterator<C2581j> listIterator = value2.listIterator(value2.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                c2581j = listIterator.previous();
                if (Intrinsics.d(c2581j.e(), null)) {
                    break;
                }
            } else {
                c2581j = null;
                break;
            }
        }
        C2581j c2581j2 = c2581j;
        C2581j w11 = p11.w();
        if (c2581j2 != null) {
            d11 = K.a(c2581j2);
            g10 = c2581j2.g();
        } else {
            if (w11 == null) {
                return;
            }
            D a12 = K.a(w11);
            g10 = w11.g();
            d11 = a12;
        }
        C10727i.c(d11, null, null, new C7950a(g10, "_nav_result_null", null), 3);
    }

    public final Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = N.d(new a(null), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
