package e00;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3967k;
import S0.Q;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;
import xe.M;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "key", "", "isUpdatesEnabled", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "Le00/c;", "a", "(Ljava/lang/String;ZLl10/i;Lru/ozon/composer/ui/widget/l;LS0/k;I)Ljava/util/List;", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    @e(c = "ru.ozon.composer.compose.widget.nested.PlaceholderWidgetKt$rememberPlaceholders$1$1", f = "PlaceholderWidget.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f61743d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f61744e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f61745f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ l f61746g;

        @e(c = "ru.ozon.composer.compose.widget.nested.PlaceholderWidgetKt$rememberPlaceholders$1$1$2", f = "PlaceholderWidget.kt", l = {}, m = "invokeSuspend")
        /* renamed from: e00.d$a$a, reason: collision with other inner class name */
        static final class C0963a extends j implements Function2<a.J.InterfaceC0007a, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f61747d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ QZ.a<l> f61748e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f61749f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ l f61750g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0963a(QZ.a<l> aVar, String str, l lVar, kotlin.coroutines.d<? super C0963a> dVar) {
                super(2, dVar);
                this.f61748e = aVar;
                this.f61749f = str;
                this.f61750g = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0963a c0963a = new C0963a(this.f61748e, this.f61749f, this.f61750g, dVar);
                c0963a.f61747d = obj;
                return c0963a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(a.J.InterfaceC0007a interfaceC0007a, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0963a) create(interfaceC0007a, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                a.J.InterfaceC0007a interfaceC0007a = (a.J.InterfaceC0007a) this.f61747d;
                this.f61748e.r().c(new a.M(interfaceC0007a, this.f61749f, this.f61750g));
                return Unit.f71690a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LAe/i;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.composer.compose.widget.nested.PlaceholderWidgetKt$rememberPlaceholders$1$1$invokeSuspend$$inlined$transform$1", f = "PlaceholderWidget.kt", l = {40}, m = "invokeSuspend")
        public static final class b extends j implements Function2<InterfaceC2397i<? super a.J.InterfaceC0007a>, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f61751d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f61752e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f61753f;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: e00.d$a$b$a, reason: collision with other inner class name */
            public static final class C0964a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i<a.J.InterfaceC0007a> f61754a;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.composer.compose.widget.nested.PlaceholderWidgetKt$rememberPlaceholders$1$1$invokeSuspend$$inlined$transform$1$1", f = "PlaceholderWidget.kt", l = {223}, m = "emit")
                /* renamed from: e00.d$a$b$a$a, reason: collision with other inner class name */
                public static final class C0965a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f61755d;

                    /* renamed from: e, reason: collision with root package name */
                    int f61756e;

                    public C0965a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f61755d = obj;
                        this.f61756e |= LinearLayoutManager.INVALID_OFFSET;
                        return C0964a.this.emit(null, this);
                    }
                }

                public C0964a(InterfaceC2397i interfaceC2397i) {
                    this.f61754a = interfaceC2397i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
                    C0965a c0965a;
                    int i11;
                    if (dVar instanceof C0965a) {
                        c0965a = (C0965a) dVar;
                        int i12 = c0965a.f61756e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c0965a.f61756e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj = c0965a.f61755d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c0965a.f61756e;
                            if (i11 != 0) {
                                s.b(obj);
                                A00.a aVar2 = (A00.a) t2;
                                if (aVar2 instanceof a.J) {
                                    a.J.InterfaceC0007a d11 = ((a.J) aVar2).d();
                                    c0965a.f61756e = 1;
                                    if (this.f61754a.emit(d11, c0965a) == aVar) {
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
                    c0965a = new C0965a(dVar);
                    Object obj2 = c0965a.f61755d;
                    Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0965a.f61756e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f61753f = interfaceC2395h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f61753f, dVar);
                bVar.f61752e = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull InterfaceC2397i<? super a.J.InterfaceC0007a> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f61751d;
                if (i11 == 0) {
                    s.b(obj);
                    C0964a c0964a = new C0964a((InterfaceC2397i) this.f61752e);
                    this.f61751d = 1;
                    if (this.f61753f.collect(c0964a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, String str, l lVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f61744e = iVar;
            this.f61745f = str;
            this.f61746g = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f61744e, this.f61745f, this.f61746g, dVar);
            aVar.f61743d = obj;
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
            M m11 = (M) this.f61743d;
            QZ.a<l> J11 = this.f61744e.J();
            C2399j.C(new C2408n0(C2399j.A(new b(J11.r().getEvents(), null)), new C0963a(J11, this.f61745f, this.f61746g, null)), m11);
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final List<c> a(@NotNull String key, boolean z11, @NotNull i container, @NotNull l viewItem, InterfaceC3967k interfaceC3967k, int i11) {
        List<c> B11;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        interfaceC3967k.o(-1704515180);
        Map<String, List<l>> g10 = viewItem.g();
        if (g10 == null || g10.isEmpty() || !g10.containsKey(key)) {
            K k11 = K.f71697a;
            interfaceC3967k.k();
            return k11;
        }
        interfaceC3967k.o(-1709785649);
        if (z11) {
            Long valueOf = Long.valueOf(viewItem.f());
            Integer valueOf2 = Integer.valueOf(viewItem.j());
            interfaceC3967k.o(-1709782927);
            boolean F11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(key)) || (i11 & 6) == 4) | interfaceC3967k.F(container) | interfaceC3967k.F(viewItem);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(container, key, viewItem, null);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            Q.g(valueOf, valueOf2, (Function2) C11, interfaceC3967k);
        }
        interfaceC3967k.k();
        interfaceC3967k.o(-1055986636);
        List<l> list = g10.get(key);
        if (list == null) {
            B11 = K.f71697a;
            interfaceC3967k.k();
        } else {
            Tc.b builder = new Tc.b(list.size());
            interfaceC3967k.o(-1709753333);
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                l lVar = list.get(i12);
                long f7 = lVar.f();
                int j11 = lVar.j();
                interfaceC3967k.o(-820994807);
                boolean r11 = interfaceC3967k.r(j11) | interfaceC3967k.s(f7);
                Object C12 = interfaceC3967k.C();
                if (r11 || C12 == InterfaceC3967k.a.a()) {
                    Object e11 = container.d0().e(lVar.j(), container);
                    C12 = e11 instanceof ru.ozon.composer.compose.widget.scrollable.b ? (ru.ozon.composer.compose.widget.scrollable.b) e11 : null;
                    interfaceC3967k.x(C12);
                }
                ru.ozon.composer.compose.widget.scrollable.b source = (ru.ozon.composer.compose.widget.scrollable.b) C12;
                interfaceC3967k.k();
                interfaceC3967k.o(-1709734340);
                if (source != null) {
                    interfaceC3967k.o(-820978832);
                    boolean n11 = interfaceC3967k.n(lVar);
                    Object C13 = interfaceC3967k.C();
                    if (n11 || C13 == InterfaceC3967k.a.a()) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        C13 = new c(container, source, lVar, null);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    builder.add((c) C13);
                }
                interfaceC3967k.k();
            }
            interfaceC3967k.k();
            Intrinsics.checkNotNullParameter(builder, "builder");
            B11 = builder.B();
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return B11;
    }
}
