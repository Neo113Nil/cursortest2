package l10;

import A00.a;
import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import c20.k;
import i10.C6997c;
import i10.InterfaceC6995a;
import i10.k;
import j10.InterfaceC7238a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n10.InterfaceC8417a;
import org.jetbrains.annotations.NotNull;
import v10.C10185c;
import xe.M;
import y00.AbstractC10819a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1", f = "ComposerScreenUiContainer.kt", l = {513}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class o extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f72474d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f72475e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f72476f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f72477d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l10.i f72478e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f72479f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$10", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
        /* renamed from: l10.o$a$a, reason: collision with other inner class name */
        static final class C1198a extends kotlin.coroutines.jvm.internal.j implements Function2<k.a<ru.ozon.composer.ui.widget.l>, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f72480d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l10.i f72481e;

            /* renamed from: l10.o$a$a$a, reason: collision with other inner class name */
            static final class C1199a extends AbstractC7737t implements Function1<Boolean, Unit> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ k.a<ru.ozon.composer.ui.widget.l> f72482b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ l10.i f72483c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1199a(k.a<ru.ozon.composer.ui.widget.l> aVar, l10.i iVar) {
                    super(1);
                    this.f72482b = aVar;
                    this.f72483c = iVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Boolean bool) {
                    InterfaceC7238a interfaceC7238a;
                    boolean booleanValue = bool.booleanValue();
                    if (this.f72482b.c() == null) {
                        interfaceC7238a = this.f72483c.f72385E;
                        interfaceC7238a.c(new a.C2372m(booleanValue));
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1198a(l10.i iVar, kotlin.coroutines.d<? super C1198a> dVar) {
                super(2, dVar);
                this.f72481e = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C1198a c1198a = new C1198a(this.f72481e, dVar);
                c1198a.f72480d = obj;
                return c1198a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(k.a<ru.ozon.composer.ui.widget.l> aVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1198a) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                k.a aVar2 = (k.a) this.f72480d;
                ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                boolean c11 = H00.b.c();
                l10.i iVar = this.f72481e;
                if (c11) {
                    ru.ozon.android.ozonLogger.core.h b11 = H00.b.b();
                    Thread currentThread = Thread.currentThread();
                    ComponentCallbacksC5392m c12 = iVar.Q().c();
                    String tag = c12 != null ? c12.getTag() : null;
                    b11.e(cVar, Pk0.g.c(currentThread, ": ", "showItems: [page=" + tag + ", lifecycleState=" + iVar.Q().g().getLifecycle().b() + "]"), "ComposerScreenUiContainer", null, Boolean.TRUE);
                }
                iVar.f72408a0 = new C1199a(aVar2, iVar);
                l10.i.H(aVar2, iVar);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$1", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<AbstractC10819a, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f72484d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l10.i f72485e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l10.i iVar, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f72485e = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f72485e, dVar);
                bVar.f72484d = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AbstractC10819a abstractC10819a, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(abstractC10819a, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                AbstractC10819a abstractC10819a = (AbstractC10819a) this.f72484d;
                boolean z11 = abstractC10819a instanceof AbstractC10819a.C2288a;
                l10.i iVar = this.f72485e;
                if (z11) {
                    iVar.f72416e0.clear();
                } else if (abstractC10819a instanceof AbstractC10819a.f) {
                    l10.i.z(iVar, ((AbstractC10819a.f) abstractC10819a).a());
                } else if (abstractC10819a instanceof AbstractC10819a.g) {
                    AbstractC10819a.g gVar = (AbstractC10819a.g) abstractC10819a;
                    A00.e b11 = gVar.b();
                    int a11 = gVar.a();
                    if (!b11.j() && A10.h.a(iVar.e0())) {
                        a11++;
                    }
                    l10.i.t(iVar).a(iVar.e0(), b11, a11);
                } else if (abstractC10819a instanceof AbstractC10819a.c) {
                    l10.i.G(iVar, (AbstractC10819a.c) abstractC10819a);
                } else if (abstractC10819a instanceof AbstractC10819a.b) {
                    l10.i.F(iVar, (AbstractC10819a.b) abstractC10819a);
                } else if (abstractC10819a instanceof AbstractC10819a.d) {
                    iVar.f72416e0.b();
                    androidx.activity.M m11 = iVar.f72427o;
                    InterfaceC8417a interfaceC8417a = m11 instanceof InterfaceC8417a ? (InterfaceC8417a) m11 : null;
                    if (interfaceC8417a != null) {
                        interfaceC8417a.pageViewChanged();
                    }
                } else {
                    if (!(abstractC10819a instanceof AbstractC10819a.e)) {
                        throw new Sc.o();
                    }
                    Function1<AbstractC10819a.e, Unit> U10 = iVar.U();
                    if (U10 != 0) {
                        U10.invoke(abstractC10819a);
                    }
                }
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$3", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
        static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<i10.j, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f72486d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC5434v f72487e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ l10.i f72488f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC5434v abstractC5434v, kotlin.coroutines.d dVar, l10.i iVar) {
                super(2, dVar);
                this.f72487e = abstractC5434v;
                this.f72488f = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                c cVar = new c(this.f72487e, dVar, this.f72488f);
                cVar.f72486d = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(i10.j jVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((c) create(jVar, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                i10.j jVar = (i10.j) this.f72486d;
                ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                boolean c11 = H00.b.c();
                l10.i iVar = this.f72488f;
                if (c11) {
                    ru.ozon.android.ozonLogger.core.h b11 = H00.b.b();
                    Thread currentThread = Thread.currentThread();
                    ComponentCallbacksC5392m c12 = iVar.Q().c();
                    String tag = c12 != null ? c12.getTag() : null;
                    b11.e(cVar, Pk0.g.c(currentThread, ": ", "render: [page=" + tag + ", lifecycleState=" + iVar.Q().g().getLifecycle().b() + "]"), "ComposerScreenUiContainer", null, Boolean.TRUE);
                }
                if (this.f72487e.b() == AbstractC5434v.b.RESUMED) {
                    l10.i.C(iVar, iVar.f72415e.getComposerStore());
                }
                l10.i.A(iVar, jVar);
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$5", f = "ComposerScreenUiContainer.kt", l = {574}, m = "invokeSuspend")
        static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<List<? extends InterfaceC6995a>, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            Iterator f72489d;

            /* renamed from: e, reason: collision with root package name */
            int f72490e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f72491f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ l10.i f72492g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(l10.i iVar, kotlin.coroutines.d<? super d> dVar) {
                super(2, dVar);
                this.f72492g = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                d dVar2 = new d(this.f72492g, dVar);
                dVar2.f72491f = obj;
                return dVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends InterfaceC6995a> list, kotlin.coroutines.d<? super Unit> dVar) {
                return ((d) create(list, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                l10.i iVar;
                Iterator it;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f72490e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Iterator it2 = ((List) this.f72491f).iterator();
                    iVar = this.f72492g;
                    it = it2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f72489d;
                    iVar = (l10.i) this.f72491f;
                    Sc.s.b(obj);
                }
                while (it.hasNext()) {
                    InterfaceC6995a interfaceC6995a = (InterfaceC6995a) it.next();
                    L10.a<? extends InterfaceC6995a> aVar2 = iVar.W().get(interfaceC6995a.getClass());
                    if (aVar2 != null) {
                        this.f72491f = iVar;
                        this.f72489d = it;
                        this.f72490e = 1;
                        if (aVar2.a(interfaceC6995a, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$8", f = "ComposerScreenUiContainer.kt", l = {}, m = "invokeSuspend")
        static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<k.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f72493d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ l10.i f72494e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(l10.i iVar, kotlin.coroutines.d<? super e> dVar) {
                super(2, dVar);
                this.f72494e = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                e eVar = new e(this.f72494e, dVar);
                eVar.f72493d = obj;
                return eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(k.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((e) create(k.c.a(cVar.b()), dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                List b11 = ((k.c) this.f72493d).b();
                ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
                boolean c11 = H00.b.c();
                l10.i iVar = this.f72494e;
                if (c11) {
                    ru.ozon.android.ozonLogger.core.h b12 = H00.b.b();
                    Thread currentThread = Thread.currentThread();
                    ComponentCallbacksC5392m c12 = iVar.Q().c();
                    String tag = c12 != null ? c12.getTag() : null;
                    b12.e(cVar, Pk0.g.c(currentThread, ": ", "notifyOverlayItems: [page=" + tag + ", lifecycleState=" + iVar.Q().g().getLifecycle().b() + "]"), "ComposerScreenUiContainer", null, Boolean.TRUE);
                }
                l10.i.y(iVar, b11);
                return Unit.f71690a;
            }
        }

        public static final class f implements InterfaceC2395h<i10.j> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f72495a;

            /* renamed from: l10.o$a$f$a, reason: collision with other inner class name */
            public static final class C1200a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i f72496a;

                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$invokeSuspend$$inlined$map$1$2", f = "ComposerScreenUiContainer.kt", l = {223}, m = "emit")
                /* renamed from: l10.o$a$f$a$a, reason: collision with other inner class name */
                public static final class C1201a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f72497d;

                    /* renamed from: e, reason: collision with root package name */
                    int f72498e;

                    public C1201a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f72497d = obj;
                        this.f72498e |= LinearLayoutManager.INVALID_OFFSET;
                        return C1200a.this.emit(null, this);
                    }
                }

                public C1200a(InterfaceC2397i interfaceC2397i) {
                    this.f72496a = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C1201a c1201a;
                    int i11;
                    if (dVar instanceof C1201a) {
                        c1201a = (C1201a) dVar;
                        int i12 = c1201a.f72498e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c1201a.f72498e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = c1201a.f72497d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c1201a.f72498e;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                i10.j o11 = ((C6997c) obj).o();
                                c1201a.f72498e = 1;
                                if (this.f72496a.emit(o11, c1201a) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    c1201a = new C1201a(dVar);
                    Object obj22 = c1201a.f72497d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1201a.f72498e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            public f(InterfaceC2395h interfaceC2395h) {
                this.f72495a = interfaceC2395h;
            }

            @Override // Ae.InterfaceC2395h
            public final Object collect(@NotNull InterfaceC2397i<? super i10.j> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                Object collect = this.f72495a.collect(new C1200a(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }

        public static final class g implements InterfaceC2395h<List<? extends InterfaceC6995a>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f72500a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l10.i f72501b;

            /* renamed from: l10.o$a$g$a, reason: collision with other inner class name */
            public static final class C1202a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i f72502a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ l10.i f72503b;

                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$invokeSuspend$$inlined$map$2$2", f = "ComposerScreenUiContainer.kt", l = {223}, m = "emit")
                /* renamed from: l10.o$a$g$a$a, reason: collision with other inner class name */
                public static final class C1203a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f72504d;

                    /* renamed from: e, reason: collision with root package name */
                    int f72505e;

                    public C1203a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f72504d = obj;
                        this.f72505e |= LinearLayoutManager.INVALID_OFFSET;
                        return C1202a.this.emit(null, this);
                    }
                }

                public C1202a(InterfaceC2397i interfaceC2397i, l10.i iVar) {
                    this.f72502a = interfaceC2397i;
                    this.f72503b = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C1203a c1203a;
                    int i11;
                    if (dVar instanceof C1203a) {
                        c1203a = (C1203a) dVar;
                        int i12 = c1203a.f72505e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c1203a.f72505e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = c1203a.f72504d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c1203a.f72505e;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                C6997c c6997c = (C6997c) obj;
                                Collection<L10.a<? extends InterfaceC6995a>> values = this.f72503b.W().values();
                                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                                ArrayList arrayList = new ArrayList();
                                Iterator<T> it = values.iterator();
                                while (it.hasNext()) {
                                    InterfaceC6995a a11 = c6997c.a(((L10.a) it.next()).b());
                                    if (a11 != null) {
                                        arrayList.add(a11);
                                    }
                                }
                                c1203a.f72505e = 1;
                                if (this.f72502a.emit(arrayList, c1203a) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    c1203a = new C1203a(dVar);
                    Object obj22 = c1203a.f72504d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1203a.f72505e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            public g(InterfaceC2395h interfaceC2395h, l10.i iVar) {
                this.f72500a = interfaceC2395h;
                this.f72501b = iVar;
            }

            @Override // Ae.InterfaceC2395h
            public final Object collect(@NotNull InterfaceC2397i<? super List<? extends InterfaceC6995a>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                Object collect = this.f72500a.collect(new C1202a(interfaceC2397i, this.f72501b), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }

        public static final class h implements InterfaceC2395h<k.b<ru.ozon.composer.ui.widget.l>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f72507a;

            /* renamed from: l10.o$a$h$a, reason: collision with other inner class name */
            public static final class C1204a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i f72508a;

                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$invokeSuspend$$inlined$map$3$2", f = "ComposerScreenUiContainer.kt", l = {223}, m = "emit")
                /* renamed from: l10.o$a$h$a$a, reason: collision with other inner class name */
                public static final class C1205a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f72509d;

                    /* renamed from: e, reason: collision with root package name */
                    int f72510e;

                    public C1205a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f72509d = obj;
                        this.f72510e |= LinearLayoutManager.INVALID_OFFSET;
                        return C1204a.this.emit(null, this);
                    }
                }

                public C1204a(InterfaceC2397i interfaceC2397i) {
                    this.f72508a = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C1205a c1205a;
                    int i11;
                    if (dVar instanceof C1205a) {
                        c1205a = (C1205a) dVar;
                        int i12 = c1205a.f72510e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c1205a.f72510e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = c1205a.f72509d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c1205a.f72510e;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                k.b h11 = ((C6997c) obj).h();
                                c1205a.f72510e = 1;
                                if (this.f72508a.emit(h11, c1205a) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    c1205a = new C1205a(dVar);
                    Object obj22 = c1205a.f72509d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1205a.f72510e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            public h(InterfaceC2395h interfaceC2395h) {
                this.f72507a = interfaceC2395h;
            }

            @Override // Ae.InterfaceC2395h
            public final Object collect(@NotNull InterfaceC2397i<? super k.b<ru.ozon.composer.ui.widget.l>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                Object collect = this.f72507a.collect(new C1204a(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }

        public static final class i implements InterfaceC2395h<k.c> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f72512a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l10.i f72513b;

            /* renamed from: l10.o$a$i$a, reason: collision with other inner class name */
            public static final class C1206a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i f72514a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ l10.i f72515b;

                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$invokeSuspend$$inlined$map$4$2", f = "ComposerScreenUiContainer.kt", l = {223}, m = "emit")
                /* renamed from: l10.o$a$i$a$a, reason: collision with other inner class name */
                public static final class C1207a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f72516d;

                    /* renamed from: e, reason: collision with root package name */
                    int f72517e;

                    public C1207a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f72516d = obj;
                        this.f72517e |= LinearLayoutManager.INVALID_OFFSET;
                        return C1206a.this.emit(null, this);
                    }
                }

                public C1206a(InterfaceC2397i interfaceC2397i, l10.i iVar) {
                    this.f72514a = interfaceC2397i;
                    this.f72515b = iVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C1207a c1207a;
                    int i11;
                    if (dVar instanceof C1207a) {
                        c1207a = (C1207a) dVar;
                        int i12 = c1207a.f72517e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c1207a.f72517e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = c1207a.f72516d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c1207a.f72517e;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                k.c a11 = k.c.a(l10.i.r(this.f72515b).b((k.b) obj));
                                c1207a.f72517e = 1;
                                if (this.f72514a.emit(a11, c1207a) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    c1207a = new C1207a(dVar);
                    Object obj22 = c1207a.f72516d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1207a.f72517e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            public i(InterfaceC2395h interfaceC2395h, l10.i iVar) {
                this.f72512a = interfaceC2395h;
                this.f72513b = iVar;
            }

            @Override // Ae.InterfaceC2395h
            public final Object collect(@NotNull InterfaceC2397i<? super k.c> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                Object collect = this.f72512a.collect(new C1206a(interfaceC2397i, this.f72513b), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }

        public static final class j implements InterfaceC2395h<k.a<ru.ozon.composer.ui.widget.l>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f72519a;

            /* renamed from: l10.o$a$j$a, reason: collision with other inner class name */
            public static final class C1208a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i f72520a;

                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ComposerScreenUiContainer$subscribeStateOnLifecycle$1$1$invokeSuspend$$inlined$map$5$2", f = "ComposerScreenUiContainer.kt", l = {223}, m = "emit")
                /* renamed from: l10.o$a$j$a$a, reason: collision with other inner class name */
                public static final class C1209a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f72521d;

                    /* renamed from: e, reason: collision with root package name */
                    int f72522e;

                    public C1209a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f72521d = obj;
                        this.f72522e |= LinearLayoutManager.INVALID_OFFSET;
                        return C1208a.this.emit(null, this);
                    }
                }

                public C1208a(InterfaceC2397i interfaceC2397i) {
                    this.f72520a = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C1209a c1209a;
                    int i11;
                    if (dVar instanceof C1209a) {
                        c1209a = (C1209a) dVar;
                        int i12 = c1209a.f72522e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c1209a.f72522e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = c1209a.f72521d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c1209a.f72522e;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                k.a e11 = ((C6997c) obj).e();
                                c1209a.f72522e = 1;
                                if (this.f72520a.emit(e11, c1209a) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    c1209a = new C1209a(dVar);
                    Object obj22 = c1209a.f72521d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1209a.f72522e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            public j(InterfaceC2395h interfaceC2395h) {
                this.f72519a = interfaceC2395h;
            }

            @Override // Ae.InterfaceC2395h
            public final Object collect(@NotNull InterfaceC2397i<? super k.a<ru.ozon.composer.ui.widget.l>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                Object collect = this.f72519a.collect(new C1208a(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC5434v abstractC5434v, kotlin.coroutines.d dVar, l10.i iVar) {
            super(2, dVar);
            this.f72478e = iVar;
            this.f72479f = abstractC5434v;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f72479f, dVar, this.f72478e);
            aVar.f72477d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC7238a interfaceC7238a;
            InterfaceC7238a interfaceC7238a2;
            InterfaceC7238a interfaceC7238a3;
            InterfaceC7238a interfaceC7238a4;
            InterfaceC7238a interfaceC7238a5;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            M m11 = (M) this.f72477d;
            l10.i iVar = this.f72478e;
            interfaceC7238a = iVar.f72385E;
            C2399j.C(new C2408n0(interfaceC7238a.d(), new b(iVar, null)), m11);
            interfaceC7238a2 = iVar.f72385E;
            C10185c.b(C10185c.c(C10185c.a(new f(interfaceC7238a2.getState())), new c(this.f72479f, null, iVar)), m11);
            interfaceC7238a3 = iVar.f72385E;
            C10185c.b(C10185c.c(C10185c.a(new g(interfaceC7238a3.getState(), iVar)), new d(iVar, null)), m11);
            interfaceC7238a4 = iVar.f72385E;
            C10185c.b(C10185c.c(new i(C10185c.a(new C2406m0(new h(interfaceC7238a4.getState()))), iVar), new e(iVar, null)), m11);
            interfaceC7238a5 = iVar.f72385E;
            C10185c.b(C10185c.c(C10185c.a(new C2406m0(new j(interfaceC7238a5.getState()))), new C1198a(iVar, null)), m11);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(AbstractC5434v abstractC5434v, kotlin.coroutines.d dVar, i iVar) {
        super(2, dVar);
        this.f72475e = abstractC5434v;
        this.f72476f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new o(this.f72475e, dVar, this.f72476f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f72474d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            i iVar = this.f72476f;
            AbstractC5434v abstractC5434v = this.f72475e;
            a aVar2 = new a(abstractC5434v, null, iVar);
            this.f72474d = 1;
            if (C5412d0.a(abstractC5434v, bVar, aVar2, this) == aVar) {
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
