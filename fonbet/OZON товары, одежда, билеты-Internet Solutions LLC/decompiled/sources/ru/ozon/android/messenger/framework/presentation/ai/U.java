package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.ui.e;
import androidx.core.view.C5342t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.presentation.ai.delegates.a;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9915y;
import v0.InterfaceC10174n;

/* loaded from: classes10.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private static final float f89356a = m.e.DEFAULT_DRAG_ANIMATION_DURATION;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f89357b = 0;

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0.I f89358b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f89359c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.EnumC1654a f89360d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89361e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f89362f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v0.I i11, List<ru.ozon.android.messenger.framework.presentation.models.q> list, a.EnumC1654a enumC1654a, ru.ozon.android.messenger.framework.core.d dVar, int i12) {
            super(2);
            this.f89358b = i11;
            this.f89359c = list;
            this.f89360d = enumC1654a;
            this.f89361e = dVar;
            this.f89362f = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f89362f | 1);
            ru.ozon.android.messenger.framework.core.d dVar = this.f89361e;
            U.b(this.f89358b, this.f89359c, this.f89360d, dVar, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantScreenKt$RestoreAiAssistantScrollEffect$2$1", f = "AiAssistantScreen.kt", l = {220, 232}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        Object f89363d;

        /* renamed from: e, reason: collision with root package name */
        int f89364e;

        /* renamed from: f, reason: collision with root package name */
        int f89365f;

        /* renamed from: g, reason: collision with root package name */
        int f89366g;

        /* renamed from: h, reason: collision with root package name */
        int f89367h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ X f89368i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f89369j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ v0.I f89370k;

        static final class a extends AbstractC7737t implements Function0<Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v0.I f89371b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v0.I i11) {
                super(0);
                this.f89371b = i11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(this.f89371b.t().d());
            }
        }

        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.U$b$b, reason: collision with other inner class name */
        static final class C1645b extends AbstractC7737t implements Function1<Long, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1645b f89372b = new C1645b(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Long l11) {
                l11.longValue();
                return Unit.f71690a;
            }
        }

        public static final class c implements InterfaceC2395h<Integer> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f89373a;

            public static final class a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i f89374a;

                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantScreenKt$RestoreAiAssistantScrollEffect$2$1$invokeSuspend$$inlined$filter$1$2", f = "AiAssistantScreen.kt", l = {223}, m = "emit")
                /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.U$b$c$a$a, reason: collision with other inner class name */
                public static final class C1646a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f89375d;

                    /* renamed from: e, reason: collision with root package name */
                    int f89376e;

                    public C1646a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f89375d = obj;
                        this.f89376e |= LinearLayoutManager.INVALID_OFFSET;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2397i interfaceC2397i) {
                    this.f89374a = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C1646a c1646a;
                    int i11;
                    if (dVar instanceof C1646a) {
                        c1646a = (C1646a) dVar;
                        int i12 = c1646a.f89376e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c1646a.f89376e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = c1646a.f89375d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c1646a.f89376e;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                if (((Number) obj).intValue() > 0) {
                                    c1646a.f89376e = 1;
                                    if (this.f89374a.emit(obj, c1646a) == aVar) {
                                        return aVar;
                                    }
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
                    c1646a = new C1646a(dVar);
                    Object obj22 = c1646a.f89375d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1646a.f89376e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            public c(InterfaceC2395h interfaceC2395h) {
                this.f89373a = interfaceC2395h;
            }

            @Override // Ae.InterfaceC2395h
            public final Object collect(@NotNull InterfaceC2397i<? super Integer> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                Object collect = ((AbstractC2381a) this.f89373a).collect(new a(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(X x11, List<ru.ozon.android.messenger.framework.presentation.models.q> list, v0.I i11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f89368i = x11;
            this.f89369j = list;
            this.f89370k = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f89368i, this.f89369j, this.f89370k, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
        
            if (S0.C3961h0.a(getContext()).v(ru.ozon.android.messenger.framework.presentation.ai.U.b.C1645b.f89372b, r13) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
        
            if (Ae.C2399j.u(r7, r13) == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008a -> B:6:0x008d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            X x11;
            int e11;
            List list;
            int b11;
            int i11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i12 = this.f89367h;
            v0.I i13 = this.f89370k;
            if (i12 == 0) {
                Sc.s.b(obj);
                x11 = this.f89368i;
                if (x11 == null) {
                    return Unit.f71690a;
                }
                c cVar = new c(n1.m(new a(i13)));
                this.f89363d = x11;
                this.f89367h = 1;
            } else if (i12 == 1) {
                x11 = (X) this.f89363d;
                Sc.s.b(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f89366g;
                b11 = this.f89365f;
                e11 = this.f89364e;
                list = (List) this.f89363d;
                Sc.s.b(obj);
                List<InterfaceC10174n> g10 = i13.t().g();
                ArrayList arrayList = new ArrayList(C7714v.z(g10, 10));
                for (InterfaceC10174n interfaceC10174n : g10) {
                    arrayList.add(new Pair(new Integer(interfaceC10174n.getIndex()), new Integer(interfaceC10174n.getSize())));
                }
                if (!arrayList.equals(list) || i13.a()) {
                    i11 = 0;
                    list = arrayList;
                } else {
                    new Integer(i11);
                    i11++;
                }
                if (i11 < 10) {
                    return Unit.f71690a;
                }
                i13.F(e11, b11);
                this.f89363d = list;
                this.f89364e = e11;
                this.f89365f = b11;
                this.f89366g = i11;
                this.f89367h = 2;
            }
            int a11 = x11.a();
            int P11 = C7714v.P(this.f89369j);
            if (P11 < 0) {
                P11 = 0;
            }
            e11 = kotlin.ranges.h.e(a11, 0, P11);
            list = null;
            b11 = x11.b();
            i11 = 0;
            if (i11 < 10) {
            }
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0.I f89378b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.models.q> f89379c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.EnumC1654a f89380d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89381e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f89382f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v0.I i11, List<ru.ozon.android.messenger.framework.presentation.models.q> list, a.EnumC1654a enumC1654a, ru.ozon.android.messenger.framework.core.d dVar, int i12) {
            super(2);
            this.f89378b = i11;
            this.f89379c = list;
            this.f89380d = enumC1654a;
            this.f89381e = dVar;
            this.f89382f = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f89382f | 1);
            ru.ozon.android.messenger.framework.core.d dVar = this.f89381e;
            U.b(this.f89378b, this.f89379c, this.f89380d, dVar, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0.I f89383b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.EnumC1654a f89384c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89385d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f89386e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(v0.I i11, a.EnumC1654a enumC1654a, ru.ozon.android.messenger.framework.core.d dVar, int i12) {
            super(2);
            this.f89383b = i11;
            this.f89384c = enumC1654a;
            this.f89385d = dVar;
            this.f89386e = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f89386e | 1);
            ru.ozon.android.messenger.framework.core.d dVar = this.f89385d;
            U.c(this.f89383b, this.f89384c, dVar, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class e extends AbstractC7737t implements Function1<S0.N, S0.M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.J f89387b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f89388c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f89389d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.lifecycle.J j11, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02) {
            super(1);
            this.f89387b = j11;
            this.f89388c = interfaceC3978p0;
            this.f89389d = interfaceC3978p02;
        }

        @Override // kotlin.jvm.functions.Function1
        public final S0.M invoke(S0.N n11) {
            S0.N DisposableEffect = n11;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            InterfaceC3978p0 interfaceC3978p0 = this.f89388c;
            InterfaceC3978p0 interfaceC3978p02 = this.f89389d;
            C5342t c5342t = new C5342t(1, interfaceC3978p0, interfaceC3978p02);
            androidx.lifecycle.J j11 = this.f89387b;
            j11.getLifecycle().a(c5342t);
            return new V(j11, c5342t, interfaceC3978p0, interfaceC3978p02);
        }
    }

    static final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0.I f89390b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.EnumC1654a f89391c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.core.d f89392d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f89393e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(v0.I i11, a.EnumC1654a enumC1654a, ru.ozon.android.messenger.framework.core.d dVar, int i12) {
            super(2);
            this.f89390b = i11;
            this.f89391c = enumC1654a;
            this.f89392d = dVar;
            this.f89393e = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f89393e | 1);
            ru.ozon.android.messenger.framework.core.d dVar = this.f89392d;
            U.c(this.f89390b, this.f89391c, dVar, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x023b, code lost:
    
        if (r0 == S0.InterfaceC3967k.a.a()) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(e.a aVar, @NotNull C9414c0 viewModel, ru.ozon.android.messenger.framework.core.d dVar, @NotNull d.a aiAssistantCustomSettings, @NotNull C9915y paddingValues, @NotNull Function0 scrollBoundaryBottomPxProvider, @NotNull Function0 showNoInternetNotification, @NotNull Function1 copyText, @NotNull Function1 onScrollToLastItem, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        e.a aVar2;
        C3969l c3969l;
        e.a aVar3;
        int i12;
        List<ru.ozon.android.messenger.framework.presentation.models.q> list;
        Float f7;
        Boolean bool;
        boolean z11;
        v0.I i13;
        InterfaceC3978p0 interfaceC3978p0;
        List<ru.ozon.android.messenger.framework.presentation.models.q> list2;
        Function2<InterfaceC3967k, Integer, Unit> e11;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(aiAssistantCustomSettings, "aiAssistantCustomSettings");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(scrollBoundaryBottomPxProvider, "scrollBoundaryBottomPxProvider");
        Intrinsics.checkNotNullParameter(showNoInternetNotification, "showNoInternetNotification");
        Intrinsics.checkNotNullParameter(copyText, "copyText");
        Intrinsics.checkNotNullParameter(onScrollToLastItem, "onScrollToLastItem");
        C3969l u11 = interfaceC3967k.u(253081681);
        int i14 = i11 | 6 | (u11.F(viewModel) ? 32 : 16) | (u11.F(dVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.n(aiAssistantCustomSettings) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | (u11.n(paddingValues) ? 16384 : 8192) | (u11.F(scrollBoundaryBottomPxProvider) ? 131072 : 65536) | (u11.F(showNoInternetNotification) ? 1048576 : 524288) | (u11.F(copyText) ? 8388608 : 4194304) | (u11.F(onScrollToLastItem) ? 67108864 : 33554432);
        if ((38347923 & i14) == 38347922 && u11.b()) {
            u11.j();
            aVar3 = aVar;
            c3969l = u11;
        } else {
            e.a aVar4 = androidx.compose.ui.e.f40358c0;
            InterfaceC3978p0 c11 = C6285b.c(viewModel.M0(), u11, 0);
            String a11 = aiAssistantCustomSettings.a();
            u11.o(420618502);
            boolean n11 = u11.n(a11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                UniTheme uniTheme = UniTheme.INSTANCE;
                UniColorToken byId = uniTheme.getColorTokens().getById(aiAssistantCustomSettings.a());
                C11 = byId == null ? uniTheme.getColorTokens().getLayerFloor1() : byId;
                u11.x(C11);
            }
            u11.k();
            b11 = androidx.compose.foundation.e.b(aVar4, UniCompositionLocalKt.getThemedColor((UniColorToken) C11, u11, UniColorToken.$stable), l1.y0.a());
            androidx.compose.ui.e d11 = androidx.compose.foundation.layout.a0.d(b11);
            B1.V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            S0.A0 d12 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, d11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f13 = T7.E.f(u11, f11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0 e12 = ((W) c11.getValue()).e();
            List<ru.ozon.android.messenger.framework.presentation.models.q> a13 = e12 != null ? e12.a() : null;
            if (a13 == null) {
                a13 = kotlin.collections.K.f71697a;
            }
            ru.ozon.android.messenger.framework.presentation.ai.delegates.a b12 = ((W) c11.getValue()).b();
            a.EnumC1654a a14 = b12 != null ? b12.a() : null;
            u11.o(2017386766);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C12;
            u11.k();
            u11.o(2017388289);
            if (a14 == a.EnumC1654a.EMPTY_STATE && (e11 = aiAssistantCustomSettings.e()) != null) {
                e11.invoke(u11, 0);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            u11.o(2017396879);
            if (a13.isEmpty()) {
                aVar2 = aVar4;
                c3969l = u11;
            } else {
                ru.ozon.android.messenger.framework.presentation.ai.delegates.a b13 = ((W) c11.getValue()).b();
                boolean z12 = (b13 != null ? b13.a() : null) == a.EnumC1654a.CONVERSATION;
                u11.o(2017398660);
                boolean n12 = u11.n(dVar) | u11.p(z12);
                Object C13 = u11.C();
                if (n12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new v0.I(0, 0);
                    u11.x(C13);
                }
                v0.I i15 = (v0.I) C13;
                u11.k();
                Z1.d dVar2 = (Z1.d) u11.m(androidx.compose.ui.platform.K0.e());
                u11.o(2017403030);
                boolean n13 = u11.n(dVar2);
                Object C14 = u11.C();
                if (n13) {
                    i12 = i14;
                } else {
                    i12 = i14;
                }
                C14 = Float.valueOf(dVar2.v1(f89356a));
                u11.x(C14);
                float floatValue = ((Number) C14).floatValue();
                u11.k();
                int i16 = i12 << 3;
                List<ru.ozon.android.messenger.framework.presentation.models.q> list3 = a13;
                a.EnumC1654a enumC1654a = a14;
                int i17 = i12;
                aVar2 = aVar4;
                b(i15, list3, enumC1654a, dVar, u11, i16 & 7168);
                c3969l = u11;
                c(i15, enumC1654a, dVar, c3969l, i17 & 896);
                Boolean valueOf = Boolean.valueOf(z12);
                Float valueOf2 = Float.valueOf(floatValue);
                c3969l.o(2017422924);
                boolean p11 = ((i17 & 234881024) == 67108864) | c3969l.p(z12) | c3969l.n(i15) | c3969l.q(floatValue);
                Object C15 = c3969l.C();
                if (p11 || C15 == InterfaceC3967k.a.a()) {
                    list = list3;
                    boolean z13 = z12;
                    f7 = valueOf2;
                    bool = valueOf;
                    C15 = new P(z13, i15, floatValue, onScrollToLastItem, null);
                    z11 = z13;
                    i13 = i15;
                    c3969l.x(C15);
                } else {
                    boolean z14 = z12;
                    f7 = valueOf2;
                    z11 = z14;
                    list = list3;
                    bool = valueOf;
                    i13 = i15;
                }
                c3969l.k();
                S0.Q.f(i13, bool, f7, (Function2) C15, c3969l);
                Unit unit2 = Unit.f71690a;
                c3969l.o(2017460414);
                boolean F11 = c3969l.F(viewModel) | ((i17 & 3670016) == 1048576) | ((i17 & 29360128) == 8388608);
                Object C16 = c3969l.C();
                if (F11 || C16 == InterfaceC3967k.a.a()) {
                    interfaceC3978p0 = interfaceC3978p02;
                    Q q11 = new Q(viewModel, showNoInternetNotification, copyText, interfaceC3978p0, null);
                    c3969l.x(q11);
                    C16 = q11;
                } else {
                    interfaceC3978p0 = interfaceC3978p02;
                }
                c3969l.k();
                S0.Q.e(c3969l, unit2, (Function2) C16);
                Integer valueOf3 = Integer.valueOf(list.size());
                Boolean bool2 = (Boolean) interfaceC3978p0.getValue();
                bool2.getClass();
                c3969l.o(2017483045);
                boolean F12 = c3969l.F(list) | c3969l.n(i13);
                Object C17 = c3969l.C();
                if (F12 || C17 == InterfaceC3967k.a.a()) {
                    list2 = null;
                    C17 = new S(list, i13, interfaceC3978p0, null);
                    c3969l.x(C17);
                } else {
                    list2 = null;
                }
                c3969l.k();
                S0.Q.g(valueOf3, bool2, (Function2) C17, c3969l);
                androidx.compose.ui.e d13 = androidx.compose.foundation.layout.a0.d(aVar2);
                d.a.C1558a d14 = aiAssistantCustomSettings.d();
                ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0 e13 = ((W) c11.getValue()).e();
                List<ru.ozon.android.messenger.framework.presentation.models.q> a15 = e13 != null ? e13.a() : list2;
                if (a15 == null) {
                    a15 = kotlin.collections.K.f71697a;
                }
                N.a(d13, a15, z11, i13, d14, paddingValues, scrollBoundaryBottomPxProvider, dVar, viewModel.c(), viewModel.Q0(), c3969l, (458752 & i16) | 6 | (i16 & 3670016) | ((i17 << 15) & 29360128));
            }
            c3969l.k();
            c3969l.f();
            aVar3 = aVar2;
        }
        S0.J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new T(aVar3, viewModel, dVar, aiAssistantCustomSettings, paddingValues, scrollBoundaryBottomPxProvider, showNoInternetNotification, copyText, onScrollToLastItem, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(v0.I i11, List<ru.ozon.android.messenger.framework.presentation.models.q> list, a.EnumC1654a enumC1654a, ru.ozon.android.messenger.framework.core.d dVar, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        v0.I i14;
        int i15;
        List<ru.ozon.android.messenger.framework.presentation.models.q> list2;
        a.EnumC1654a enumC1654a2;
        ru.ozon.android.messenger.framework.core.d dVar2;
        C3969l u11 = interfaceC3967k.u(617959308);
        if ((i12 & 6) == 0) {
            i13 = (u11.n(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= (i12 & 64) == 0 ? u11.n(list) : u11.F(list) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.n(enumC1654a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.F(dVar) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            i14 = i11;
            list2 = list;
            enumC1654a2 = enumC1654a;
            dVar2 = dVar;
            i15 = i12;
        } else {
            if (!(enumC1654a == a.EnumC1654a.CONVERSATION)) {
                S0.J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new a(i11, list, enumC1654a, dVar, i12));
                    return;
                }
                return;
            }
            i14 = i11;
            i15 = i12;
            list2 = list;
            boolean z11 = false;
            enumC1654a2 = enumC1654a;
            dVar2 = dVar;
            u11.o(-108609246);
            boolean n11 = u11.n(dVar2);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                ru.ozon.android.messenger.framework.presentation.common.viewmodel.b b11 = dVar2.b();
                Intrinsics.checkNotNullParameter(b11, "<this>");
                C11 = (X) ((ru.ozon.android.messenger.framework.presentation.messenger.a) b11).b("KEY_AI_ASSISTANT_CONVERSATION_SCROLL_PARAMS");
                u11.x(C11);
            }
            X x11 = (X) C11;
            u11.k();
            u11.o(-108603584);
            boolean n12 = u11.n(x11) | ((i13 & 14) == 4);
            if ((i13 & 112) == 32 || ((i13 & 64) != 0 && u11.F(list2))) {
                z11 = true;
            }
            boolean z12 = n12 | z11;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new b(x11, list2, i14, null);
                u11.x(C12);
            }
            u11.k();
            S0.Q.g(i14, dVar2, (Function2) C12, u11);
        }
        S0.J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new c(i14, list2, enumC1654a2, dVar2, i15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(v0.I i11, a.EnumC1654a enumC1654a, ru.ozon.android.messenger.framework.core.d dVar, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-1935943006);
        if ((i12 & 6) == 0) {
            i13 = (u11.n(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.n(enumC1654a) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.F(dVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (enumC1654a != a.EnumC1654a.CONVERSATION) {
                S0.J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new d(i11, enumC1654a, dVar, i12));
                    return;
                }
                return;
            }
            androidx.lifecycle.J j11 = (androidx.lifecycle.J) u11.m(e3.r.a());
            InterfaceC3978p0 l11 = n1.l(i11, u11);
            InterfaceC3978p0 l12 = n1.l(dVar, u11);
            u11.o(-613120209);
            boolean n11 = u11.n(l11) | u11.n(l12) | u11.F(j11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new e(j11, l11, l12);
                u11.x(C11);
            }
            u11.k();
            S0.Q.c(j11, (Function1) C11, u11);
        }
        S0.J0 m03 = u11.m0();
        if (m03 != null) {
            m03.G(new f(i11, enumC1654a, dVar, i12));
        }
    }

    public static final void f(v0.I i11, ru.ozon.android.messenger.framework.core.d dVar) {
        int o11 = i11.o();
        int p11 = i11.p();
        if (dVar != null) {
            ru.ozon.android.messenger.framework.presentation.common.viewmodel.b b11 = dVar.b();
            Intrinsics.checkNotNullParameter(b11, "<this>");
            ((ru.ozon.android.messenger.framework.presentation.messenger.a) b11).a(new X(o11, p11), "KEY_AI_ASSISTANT_CONVERSATION_SCROLL_PARAMS");
        }
    }
}
