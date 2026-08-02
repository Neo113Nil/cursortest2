package s00;

import Ae.C2399j;
import Ae.C2404l0;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B0.M0;
import B0.N0;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.s;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputBaseKt;
import ru.ozon.uni.android.ds.compose.component.input.DsInputLabelPosition;
import ru.ozon.uni.android.ds.compose.component.input.DsInputSize;
import ru.ozon.uni.android.ds.compose.component.input.DsInputState;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;
import ru.ozon.uni.android.ds.compose.component.input.DsInputTheme;
import ru.ozon.uni.android.ds.compose.component.input.DsInputType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.core.models.UniIconToken;
import t0.q;
import t00.AbstractC9719a;
import t00.AbstractC9720b;
import u0.C9891D;
import u00.m;
import xe.M;

/* renamed from: s00.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9579d {

    @e(c = "ru.ozon.composer.debug.menu.ui.items.StringDebugMenuItemKt$StringDebugMenuItem$1$1", f = "StringDebugMenuItem.kt", l = {}, m = "invokeSuspend")
    /* renamed from: s00.d$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f98099d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f98100e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC9720b.d f98101f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<C9578c> f98102g;

        @e(c = "ru.ozon.composer.debug.menu.ui.items.StringDebugMenuItemKt$StringDebugMenuItem$1$1$2", f = "StringDebugMenuItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: s00.d$a$a, reason: collision with other inner class name */
        static final class C2161a extends j implements Function2<AbstractC9719a.b, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f98103d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC3978p0<C9578c> f98104e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2161a(InterfaceC3978p0<C9578c> interfaceC3978p0, kotlin.coroutines.d<? super C2161a> dVar) {
                super(2, dVar);
                this.f98104e = interfaceC3978p0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C2161a c2161a = new C2161a(this.f98104e, dVar);
                c2161a.f98103d = obj;
                return c2161a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AbstractC9719a.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2161a) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                AbstractC9719a.b bVar = (AbstractC9719a.b) this.f98103d;
                InterfaceC3978p0<C9578c> interfaceC3978p0 = this.f98104e;
                C9578c value = interfaceC3978p0.getValue();
                String initialText = bVar.b().d();
                String currentText = bVar.b().d();
                value.getClass();
                Intrinsics.checkNotNullParameter(initialText, "initialText");
                Intrinsics.checkNotNullParameter(currentText, "currentText");
                interfaceC3978p0.setValue(new C9578c(initialText, currentText));
                return Unit.f71690a;
            }
        }

        /* renamed from: s00.d$a$b */
        public static final class b implements InterfaceC2395h<AbstractC9719a> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f98105a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC9720b.d f98106b;

            /* renamed from: s00.d$a$b$a, reason: collision with other inner class name */
            public static final class C2162a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i f98107a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AbstractC9720b.d f98108b;

                @e(c = "ru.ozon.composer.debug.menu.ui.items.StringDebugMenuItemKt$StringDebugMenuItem$1$1$invokeSuspend$$inlined$filter$1$2", f = "StringDebugMenuItem.kt", l = {223}, m = "emit")
                /* renamed from: s00.d$a$b$a$a, reason: collision with other inner class name */
                public static final class C2163a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f98109d;

                    /* renamed from: e, reason: collision with root package name */
                    int f98110e;

                    public C2163a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f98109d = obj;
                        this.f98110e |= LinearLayoutManager.INVALID_OFFSET;
                        return C2162a.this.emit(null, this);
                    }
                }

                public C2162a(InterfaceC2397i interfaceC2397i, AbstractC9720b.d dVar) {
                    this.f98107a = interfaceC2397i;
                    this.f98108b = dVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C2163a c2163a;
                    int i11;
                    if (dVar instanceof C2163a) {
                        c2163a = (C2163a) dVar;
                        int i12 = c2163a.f98110e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c2163a.f98110e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = c2163a.f98109d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c2163a.f98110e;
                            if (i11 != 0) {
                                s.b(obj2);
                                if (Intrinsics.d(this.f98108b, ((AbstractC9719a) obj).a())) {
                                    c2163a.f98110e = 1;
                                    if (this.f98107a.emit(obj, c2163a) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    c2163a = new C2163a(dVar);
                    Object obj22 = c2163a.f98109d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c2163a.f98110e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            public b(InterfaceC2395h interfaceC2395h, AbstractC9720b.d dVar) {
                this.f98105a = interfaceC2395h;
                this.f98106b = dVar;
            }

            @Override // Ae.InterfaceC2395h
            public final Object collect(@NotNull InterfaceC2397i<? super AbstractC9719a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                Object collect = this.f98105a.collect(new C2162a(interfaceC2397i, this.f98106b), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, AbstractC9720b.d dVar, InterfaceC3978p0<C9578c> interfaceC3978p0, kotlin.coroutines.d<? super a> dVar2) {
            super(2, dVar2);
            this.f98100e = mVar;
            this.f98101f = dVar;
            this.f98102g = interfaceC3978p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f98100e, this.f98101f, this.f98102g, dVar);
            aVar.f98099d = obj;
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
            C2399j.C(new C2408n0(new C2404l0(new b(this.f98100e.f0(), this.f98101f), N.b(AbstractC9719a.b.class)), new C2161a(this.f98102g, null)), (M) this.f98099d);
            return Unit.f71690a;
        }
    }

    /* renamed from: s00.d$b */
    static final class b extends AbstractC7737t implements Function1<String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<C9578c> f98112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3978p0<C9578c> interfaceC3978p0) {
            super(1);
            this.f98112b = interfaceC3978p0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String text = str;
            Intrinsics.checkNotNullParameter(text, "text");
            InterfaceC3978p0<C9578c> interfaceC3978p0 = this.f98112b;
            interfaceC3978p0.setValue(C9578c.a(interfaceC3978p0.getValue(), text));
            return Unit.f71690a;
        }
    }

    /* renamed from: s00.d$c */
    static final class c extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f98113b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC9720b.d f98114c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<C9578c> f98115d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m mVar, AbstractC9720b.d dVar, InterfaceC3978p0<C9578c> interfaceC3978p0) {
            super(1);
            this.f98113b = mVar;
            this.f98114c = dVar;
            this.f98115d = interfaceC3978p0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f98113b.h0(this.f98114c, this.f98115d.getValue().b());
            return Unit.f71690a;
        }
    }

    /* renamed from: s00.d$d, reason: collision with other inner class name */
    static final class C2164d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC9720b.d f98116b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f98117c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2164d(AbstractC9720b.d dVar, m mVar, int i11) {
            super(2);
            this.f98116b = dVar;
            this.f98117c = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C9579d.a(this.f98116b, this.f98117c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@NotNull AbstractC9720b.d item, @NotNull m viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        AbstractC9720b.d dVar;
        C3969l c3969l;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(-2037201089);
        if (((i11 | (u11.F(item) ? 4 : 2) | (u11.F(viewModel) ? 32 : 16)) & 19) == 18 && u11.b()) {
            u11.j();
            dVar = item;
            c3969l = u11;
        } else {
            u11.o(189150839);
            boolean n11 = u11.n(item);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(new C9578c(item.d(), item.d()), D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            u11.o(189155421);
            boolean F11 = u11.F(viewModel) | u11.F(item) | u11.n(interfaceC3978p0);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new a(viewModel, item, interfaceC3978p0, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, item, (Function2) C12);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            float f7 = 12;
            androidx.compose.ui.e j11 = T.j(T.h(aVar, f7, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8, 7);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, j11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            String b12 = ((C9578c) interfaceC3978p0.getValue()).b();
            String b13 = item.b().b();
            androidx.compose.ui.e j12 = T.j(c9891d.a(aVar, 10.0f, true), 0.0f, 0.0f, f7, 0.0f, 11);
            u11.o(-428057096);
            boolean n12 = u11.n(interfaceC3978p0);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new b(interfaceC3978p0);
                u11.x(C13);
            }
            u11.k();
            DsInputBaseKt.m1743DsInputBaseawFkL_c(b12, (Function1<? super String, Unit>) C13, j12, (DsInputSize) null, (DsInputType) null, (DsInputTheme) null, (DsInputState) null, (DsInputStatus) null, false, b13, (DsInputLabelPosition) null, (String) null, (String) null, (C7807Z) null, (UniIconToken) null, (UniIconToken) null, true, false, false, (N0) null, (M0) null, (Q1.X) null, (q) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function0<Unit>) null, (Function1<? super DsInputStatus, Unit>) null, (Function1<? super Boolean, Unit>) null, (Function1<? super String, Unit>) null, (InterfaceC3967k) u11, 0, 1572864, 0, 536804856);
            IconButtonV3DTO copy$default = IconButtonV3DTO.copy$default(item.c(), null, null, null, null, Boolean.valueOf(((C9578c) interfaceC3978p0.getValue()).c()), null, null, null, null, null, null, null, null, null, 16367, null);
            androidx.compose.ui.e a12 = c9891d.a(aVar, 2.0f, true);
            u11.o(-428044380);
            dVar = item;
            boolean F12 = u11.F(viewModel) | u11.F(dVar) | u11.n(interfaceC3978p0);
            Object C14 = u11.C();
            if (F12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new c(viewModel, dVar, interfaceC3978p0);
                u11.x(C14);
            }
            u11.k();
            DsIconButtonAtomKt.DsIconButtonAtom(copy$default, a12, false, (Function1) C14, u11, IconButtonV3DTO.$stable, 4);
            c3969l = u11;
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C2164d(dVar, viewModel, i11));
        }
    }
}
