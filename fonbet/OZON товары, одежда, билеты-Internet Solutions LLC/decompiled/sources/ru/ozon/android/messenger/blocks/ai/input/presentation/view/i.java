package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Bl0.C2652m;
import I0.j1;
import I0.k1;
import Q1.K;
import S0.C3969l;
import S0.C3996z;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.N;
import S0.O;
import S0.Q;
import S0.n1;
import Sc.s;
import androidx.compose.ui.platform.P1;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.C6285b;
import j1.r;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.ai.input.data.Settings;
import ru.ozon.android.messenger.blocks.ai.input.presentation.view.o;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.ai.K0;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import xe.M;

/* loaded from: classes10.dex */
public final class i {

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.input.presentation.view.AiInputRootKt$AiInputRoot$1$1", f = "AiInputRoot.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f84247d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.ai.input.presentation.a f84248e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o oVar, ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f84247d = oVar;
            this.f84248e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f84247d, this.f84248e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            this.f84247d.f0(this.f84248e);
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f84249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f84250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.ai.input.presentation.a f84251d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o oVar, ru.ozon.android.messenger.framework.navigation.controller.a aVar, ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar2) {
            super(0);
            this.f84249b = oVar;
            this.f84250c = aVar;
            this.f84251d = aVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Map<String, MessengerTrackingInfo> i11 = this.f84251d.i();
            this.f84249b.getClass();
            ru.ozon.android.messenger.framework.navigation.controller.a messengerController = this.f84250c;
            Intrinsics.checkNotNullParameter(messengerController, "messengerController");
            messengerController.s(i11);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.input.presentation.view.AiInputRootKt$AiInputRoot$3$1", f = "AiInputRoot.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f84252d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f84253e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o oVar, r rVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f84252d = oVar;
            this.f84253e = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f84252d, this.f84253e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            if (this.f84252d.getState().getValue().h()) {
                this.f84253e.d();
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.input.presentation.view.AiInputRootKt$AiInputRoot$4$1", f = "AiInputRoot.kt", l = {60}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f84254d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f84255e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ r f84256f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j1.i f84257g;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r f84258a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1.i f84259b;

            a(r rVar, j1.i iVar) {
                this.f84258a = rVar;
                this.f84259b = iVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                if (((o.a) obj) instanceof o.a.C1462a) {
                    this.f84258a.e();
                    this.f84259b.g(false);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o oVar, r rVar, j1.i iVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f84255e = oVar;
            this.f84256f = rVar;
            this.f84257g = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f84255e, this.f84256f, this.f84257g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f84254d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h<o.a> effects = this.f84255e.getEffects();
                a aVar2 = new a(this.f84256f, this.f84257g);
                this.f84254d = 1;
                if (effects.collect(aVar2, this) == aVar) {
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

    static final class e extends AbstractC7737t implements Function1<N, S0.M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f84260b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j1.i f84261c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ P1 f84262d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(J j11, j1.i iVar, P1 p12) {
            super(1);
            this.f84260b = j11;
            this.f84261c = iVar;
            this.f84262d = p12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.I, ru.ozon.android.messenger.blocks.ai.input.presentation.view.j] */
        @Override // kotlin.jvm.functions.Function1
        public final S0.M invoke(N n11) {
            N DisposableEffect = n11;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final j1.i iVar = this.f84261c;
            final P1 p12 = this.f84262d;
            ?? r32 = new G() { // from class: ru.ozon.android.messenger.blocks.ai.input.presentation.view.j
                @Override // androidx.lifecycle.G
                public final void onStateChanged(J j11, AbstractC5434v.a event) {
                    Intrinsics.checkNotNullParameter(j11, "<unused var>");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == AbstractC5434v.a.ON_PAUSE) {
                        j1.i.this.g(true);
                        P1 p13 = p12;
                        if (p13 != null) {
                            p13.hide();
                        }
                    }
                }
            };
            J j11 = this.f84260b;
            j11.getLifecycle().a(r32);
            return new k(j11, r32);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.input.presentation.view.AiInputRootKt$AiInputRoot$6$1", f = "AiInputRoot.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o f84263d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f84264e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(o oVar, InterfaceC3978p0 interfaceC3978p0, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f84263d = oVar;
            this.f84264e = interfaceC3978p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f84263d, this.f84264e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            this.f84263d.i0(i.b(this.f84264e));
            return Unit.f71690a;
        }
    }

    static final class g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.ai.input.presentation.a f84265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f84266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f84267d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f84268e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ K0 f84269f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f84270g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f84271h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar, o oVar, r rVar, ru.ozon.android.messenger.framework.navigation.controller.a aVar2, K0 k02, InterfaceC3978p0 interfaceC3978p0, InterfaceC3978p0 interfaceC3978p02) {
            super(2);
            this.f84265b = aVar;
            this.f84266c = oVar;
            this.f84267d = rVar;
            this.f84268e = aVar2;
            this.f84269f = k02;
            this.f84270g = interfaceC3978p0;
            this.f84271h = interfaceC3978p02;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar = this.f84265b;
                boolean z11 = false;
                Boolean[] boolArr = {Boolean.valueOf(aVar.d() != ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING), Boolean.valueOf(aVar.d() != ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY), Boolean.valueOf(i.b(this.f84270g))};
                InterfaceC3978p0 interfaceC3978p0 = this.f84271h;
                K g10 = ((o.b) interfaceC3978p0.getValue()).g();
                TextDTO d11 = ((o.b) interfaceC3978p0.getValue()).d();
                String b11 = ((o.b) interfaceC3978p0.getValue()).b();
                String c11 = ((o.b) interfaceC3978p0.getValue()).c();
                Settings f7 = ((o.b) interfaceC3978p0.getValue()).f();
                IconButtonV3DTO e11 = ((o.b) interfaceC3978p0.getValue()).e();
                int i11 = 0;
                while (true) {
                    if (i11 >= 3) {
                        z11 = true;
                        break;
                    }
                    if (!boolArr[i11].booleanValue()) {
                        break;
                    }
                    i11++;
                }
                interfaceC3967k2.o(2102194039);
                o oVar = this.f84266c;
                boolean F11 = interfaceC3967k2.F(oVar);
                Object C11 = interfaceC3967k2.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    Object lVar = new l(1, oVar, o.class, "onInputValueChanged", "onInputValueChanged(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
                    interfaceC3967k2.x(lVar);
                    C11 = lVar;
                }
                interfaceC3967k2.k();
                Function1 function1 = (Function1) ((kotlin.reflect.h) C11);
                interfaceC3967k2.o(2102196103);
                boolean F12 = interfaceC3967k2.F(oVar);
                Object C12 = interfaceC3967k2.C();
                if (F12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new m(oVar);
                    interfaceC3967k2.x(C12);
                }
                Function1 function12 = (Function1) C12;
                interfaceC3967k2.k();
                interfaceC3967k2.o(2102201707);
                boolean F13 = interfaceC3967k2.F(oVar);
                ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = this.f84268e;
                boolean F14 = F13 | interfaceC3967k2.F(aVar2);
                K0 k02 = this.f84269f;
                boolean F15 = F14 | interfaceC3967k2.F(k02);
                Object C13 = interfaceC3967k2.C();
                if (F15 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new n(oVar, aVar2, k02);
                    interfaceC3967k2.x(C13);
                }
                interfaceC3967k2.k();
                ru.ozon.android.messenger.blocks.ai.input.presentation.view.h.a(g10, d11, b11, c11, f7, z11, e11, this.f84267d, function1, function12, (Function2) C13, interfaceC3967k2, 12582912 | (IconButtonV3DTO.$stable << 18));
            }
            return Unit.f71690a;
        }
    }

    static final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f84272b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.ai.input.presentation.a f84273c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K0 f84274d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f84275e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ru.ozon.android.messenger.framework.navigation.controller.a aVar, ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar2, K0 k02, o oVar, int i11) {
            super(2);
            this.f84272b = aVar;
            this.f84273c = aVar2;
            this.f84274d = k02;
            this.f84275e = oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar = this.f84273c;
            i.a(this.f84272b, aVar, this.f84274d, this.f84275e, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, @NotNull ru.ozon.android.messenger.blocks.ai.input.presentation.a item, K0 k02, @NotNull o viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(-856524092);
        int i12 = i11 | (u11.n(messengerController) ? 4 : 2) | (u11.n(item) ? 32 : 16) | (u11.n(k02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(viewModel) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            u11.o(-296667325);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new r();
                u11.x(C11);
            }
            r rVar = (r) C11;
            u11.k();
            P1 p12 = (P1) u11.m(androidx.compose.ui.platform.K0.o());
            J j11 = (J) u11.m(e3.r.a());
            j1.i iVar = (j1.i) u11.m(androidx.compose.ui.platform.K0.f());
            u11.o(-296659648);
            boolean F11 = u11.F(viewModel) | u11.F(item);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new a(viewModel, item, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, item, (Function2) C12);
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-296656590);
            boolean F12 = ((i12 & 14) == 4) | u11.F(viewModel) | u11.F(item);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new b(viewModel, messengerController, item);
                u11.x(C13);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C13, u11, 6);
            Unit unit = Unit.f71690a;
            u11.o(-296650903);
            boolean F13 = u11.F(viewModel);
            Object C14 = u11.C();
            if (F13 || C14 == InterfaceC3967k.a.a()) {
                C14 = new c(viewModel, rVar, null);
                u11.x(C14);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C14);
            u11.o(-296646375);
            boolean F14 = u11.F(viewModel) | u11.F(iVar);
            Object C15 = u11.C();
            if (F14 || C15 == InterfaceC3967k.a.a()) {
                C15 = new d(viewModel, rVar, iVar, null);
                u11.x(C15);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C15);
            u11.o(-296636736);
            boolean F15 = u11.F(iVar) | u11.n(p12) | u11.F(j11);
            Object C16 = u11.C();
            if (F15 || C16 == InterfaceC3967k.a.a()) {
                C16 = new e(j11, iVar, p12);
                u11.x(C16);
            }
            u11.k();
            Q.a(j11, iVar, p12, (Function1) C16, u11);
            InterfaceC3978p0 c11 = C6285b.c(viewModel.getState(), u11, 0);
            u11.o(-296621561);
            Object C17 = u11.C();
            if (C17 == InterfaceC3967k.a.a()) {
                C17 = n1.f(Boolean.TRUE, D1.f25195a);
                u11.x(C17);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C17;
            u11.k();
            M0<Boolean> b11 = k02 != null ? k02.b() : null;
            u11.o(-296617174);
            InterfaceC3978p0 a11 = b11 == null ? null : C6285b.a(b11, Boolean.TRUE, u11, 48);
            u11.k();
            InterfaceC3978p0 interfaceC3978p02 = a11 == null ? interfaceC3978p0 : a11;
            Boolean bool = (Boolean) interfaceC3978p02.getValue();
            bool.getClass();
            u11.o(-296613277);
            boolean F16 = u11.F(viewModel) | u11.n(interfaceC3978p02);
            Object C18 = u11.C();
            if (F16 || C18 == InterfaceC3967k.a.a()) {
                C18 = new f(viewModel, interfaceC3978p02, null);
                u11.x(C18);
            }
            u11.k();
            Q.e(u11, bool, (Function2) C18);
            O b12 = k1.b();
            String b13 = item.b();
            u11.o(-692553334);
            C7807Z c7807z = TokenParserKt.tokenToColor(b13, u11, 0);
            long bgAquaPrimary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgAquaPrimary() : c7807z.w();
            j1 j1Var = new j1(bgAquaPrimary, C7807Z.o(0.4f, bgAquaPrimary));
            u11.k();
            C3996z.a(b12.c(j1Var), a1.c.c(1465437700, new g(item, viewModel, rVar, messengerController, k02, interfaceC3978p02, c11), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new h(messengerController, item, k02, viewModel, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(InterfaceC3978p0 interfaceC3978p0) {
        return ((Boolean) interfaceC3978p0.getValue()).booleanValue();
    }
}
