package zi;

import B1.InterfaceC2547p;
import B1.V;
import Bl0.C2652m;
import C.Y;
import D1.InterfaceC2801g;
import Qi.InterfaceC3877a;
import S0.A0;
import S0.A1;
import S0.C3959g1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3974n0;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.P;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5236c1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e.C6230e;
import e.C6236k;
import e1.InterfaceC6250b;
import e3.C6285b;
import fd.InterfaceC6512o;
import h.C6763i;
import i1.C6988h;
import java.util.Arrays;
import java.util.Locale;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.K0;
import l1.y0;
import li.C7962a;
import m0.C7990g;
import m0.C8004n;
import n0.C8385f;
import oi.C8737a;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import r0.Y;
import ru.ozon.app.android.R;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.components.badge.UniBadgeAtomKt;
import ru.ozon.uni.components.iconButton.UniIconButtonColors;
import ru.ozon.uni.components.iconButton.UniIconButtonKt;
import ru.ozon.uni.components.iconButton.UniIconButtonSize;
import ru.ozon.uni.components.iconButton.UniIconButtonStyle;
import u0.U;
import zi.k;

/* renamed from: zi.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11130g {

    /* renamed from: zi.g$A */
    static final class A extends AbstractC7737t implements Function0<zi.u> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109084b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109084b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final zi.u invoke() {
            return ((l) this.f109084b.getValue()).j();
        }
    }

    /* renamed from: zi.g$B */
    static final class B extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109085b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((l) this.f109085b.getValue()).l());
        }
    }

    /* renamed from: zi.g$C */
    static final class C extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(Function0<Unit> function0) {
            super(0);
            this.f109086b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109086b.invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$D */
    static final class D extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f109087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f109088c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109089d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f109090e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(long j11, long j12, Function0<Unit> function0, int i11) {
            super(2);
            this.f109087b = j11;
            this.f109088c = j12;
            this.f109089d = function0;
            this.f109090e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f109090e | 1);
            Function0<Unit> function0 = this.f109089d;
            C11130g.d(this.f109087b, this.f109088c, function0, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$E */
    static final class E extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109091b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(Function0<Unit> function0) {
            super(0);
            this.f109091b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109091b.invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$F */
    static final class F extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f109092b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f109093c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f109094d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109095e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109096f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(boolean z11, long j11, long j12, Function0<Unit> function0, int i11) {
            super(2);
            this.f109092b = z11;
            this.f109093c = j11;
            this.f109094d = j12;
            this.f109095e = function0;
            this.f109096f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            C11130g.e(this.f109092b, this.f109093c, this.f109094d, this.f109095e, interfaceC3967k, C2652m.e(this.f109096f | 1));
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$G */
    static final class G extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(Function0<Unit> function0) {
            super(0);
            this.f109097b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109097b.invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$H */
    static final class H extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ yi.q f109098b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f109099c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f109100d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109101e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f109102f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(yi.q qVar, long j11, long j12, Function0<Unit> function0, int i11) {
            super(2);
            this.f109098b = qVar;
            this.f109099c = j11;
            this.f109100d = j12;
            this.f109101e = function0;
            this.f109102f = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            C11130g.f(this.f109098b, this.f109099c, this.f109100d, this.f109101e, interfaceC3967k, C2652m.e(this.f109102f | 1));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenKt$ScreenFlashEffect$1$1", f = "CameraScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: zi.g$I */
    static final class I extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f109103d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Window f109104e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3877a f109105f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Float f109106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I(boolean z11, Window window, InterfaceC3877a interfaceC3877a, Float f7, kotlin.coroutines.d<? super I> dVar) {
            super(2, dVar);
            this.f109103d = z11;
            this.f109104e = window;
            this.f109105f = interfaceC3877a;
            this.f109106g = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new I(this.f109103d, this.f109104e, this.f109105f, this.f109106g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((I) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            boolean z11 = this.f109103d;
            InterfaceC3877a interfaceC3877a = this.f109105f;
            Window window = this.f109104e;
            if (z11) {
                C11130g.r(window, 1.0f, interfaceC3877a);
            } else {
                Float f7 = this.f109106g;
                C11130g.r(window, f7 != null ? f7.floatValue() : -1.0f, interfaceC3877a);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$J */
    static final class J extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f109107b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Window f109108c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3877a f109109d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f109110e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(boolean z11, Window window, InterfaceC3877a interfaceC3877a, int i11) {
            super(2);
            this.f109107b = z11;
            this.f109108c = window;
            this.f109109d = interfaceC3877a;
            this.f109110e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f109110e | 1);
            InterfaceC3877a interfaceC3877a = this.f109109d;
            C11130g.g(this.f109107b, this.f109108c, interfaceC3877a, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$K */
    static final class K extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109111b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        K(Function0<Unit> function0) {
            super(0);
            this.f109111b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109111b.invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$L */
    static final class L extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ yi.q f109112b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f109113c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f109114d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f109115e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f109116f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f109117g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109118h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f109119i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        L(yi.q qVar, boolean z11, long j11, long j12, long j13, long j14, Function0<Unit> function0, int i11) {
            super(2);
            this.f109112b = qVar;
            this.f109113c = z11;
            this.f109114d = j11;
            this.f109115e = j12;
            this.f109116f = j13;
            this.f109117g = j14;
            this.f109118h = function0;
            this.f109119i = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f109119i | 1);
            long j11 = this.f109115e;
            long j12 = this.f109116f;
            C11130g.h(this.f109112b, this.f109113c, this.f109114d, j11, j12, this.f109117g, this.f109118h, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$M */
    static final class M extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f109120b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f109121c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109122d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f109123e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        M(long j11, String str, Function0<Unit> function0, int i11) {
            super(2);
            this.f109120b = j11;
            this.f109121c = str;
            this.f109122d = function0;
            this.f109123e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f109123e | 1);
            Function0<Unit> function0 = this.f109122d;
            C11130g.i(this.f109120b, this.f109121c, function0, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$N */
    static final class N extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        N(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109124b = interfaceC3978p0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((Function0) this.f109124b.getValue()).invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$a, reason: case insensitive filesystem */
    static final class C11131a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ zi.t f109125b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f109126c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f109127d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f109128e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f109129f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f109130g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f109131h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109132i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109133j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109134k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109135l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f109136m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f109137n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11131a(zi.t tVar, String str, long j11, long j12, long j13, long j14, long j15, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i11, int i12) {
            super(2);
            this.f109125b = tVar;
            this.f109126c = str;
            this.f109127d = j11;
            this.f109128e = j12;
            this.f109129f = j13;
            this.f109130g = j14;
            this.f109131h = j15;
            this.f109132i = function0;
            this.f109133j = function02;
            this.f109134k = function03;
            this.f109135l = function04;
            this.f109136m = i11;
            this.f109137n = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f109136m | 1);
            int e12 = C2652m.e(this.f109137n);
            Function0<Unit> function0 = this.f109132i;
            Function0<Unit> function02 = this.f109133j;
            C11130g.a(this.f109125b, this.f109126c, this.f109127d, this.f109128e, this.f109129f, this.f109130g, this.f109131h, function0, function02, this.f109134k, this.f109135l, interfaceC3967k, e11, e12);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenKt$CameraPreviewContent$1$1", f = "CameraScreen.kt", l = {340}, m = "invokeSuspend")
    /* renamed from: zi.g$b, reason: case insensitive filesystem */
    static final class C11132b extends kotlin.coroutines.jvm.internal.j implements Function2<x1.F, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f109138d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f109139e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109140f;

        /* renamed from: zi.g$b$a */
        static final class a extends AbstractC7737t implements InterfaceC6512o<C7459e, C7459e, Float, Float, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3978p0 f109141b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3978p0 interfaceC3978p0) {
                super(4);
                this.f109141b = interfaceC3978p0;
            }

            @Override // fd.InterfaceC6512o
            public final Unit invoke(C7459e c7459e, C7459e c7459e2, Float f7, Float f11) {
                c7459e.getClass();
                c7459e2.getClass();
                float floatValue = f7.floatValue();
                f11.floatValue();
                ((Function1) this.f109141b.getValue()).invoke(Float.valueOf(floatValue));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11132b(InterfaceC3978p0 interfaceC3978p0, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f109140f = interfaceC3978p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C11132b c11132b = new C11132b(this.f109140f, dVar);
            c11132b.f109139e = obj;
            return c11132b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x1.F f7, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C11132b) create(f7, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f109138d;
            if (i11 == 0) {
                Sc.s.b(obj);
                x1.F f7 = (x1.F) this.f109139e;
                a aVar2 = new a(this.f109140f);
                this.f109138d = 1;
                if (Y.e(f7, aVar2, this) == aVar) {
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

    /* renamed from: zi.g$c, reason: case insensitive filesystem */
    static final class C11133c extends AbstractC7737t implements Function1<Context, PreviewView> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PreviewView f109142b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11133c(PreviewView previewView) {
            super(1);
            this.f109142b = previewView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final PreviewView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f109142b;
        }
    }

    /* renamed from: zi.g$d, reason: case insensitive filesystem */
    static final class C11134d extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109143b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11134d(Function0<Unit> function0) {
            super(0);
            this.f109143b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109143b.invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$e, reason: case insensitive filesystem */
    static final class C11135e extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11135e(Function0<Unit> function0) {
            super(0);
            this.f109144b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109144b.invoke();
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$f, reason: case insensitive filesystem */
    static final class C11136f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ zi.u f109145b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PreviewView f109146c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f109147d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f109148e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f109149f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109150g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109151h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109152i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f109153j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11136f(zi.u uVar, PreviewView previewView, long j11, long j12, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i11) {
            super(2);
            this.f109145b = uVar;
            this.f109146c = previewView;
            this.f109147d = j11;
            this.f109148e = j12;
            this.f109149f = function1;
            this.f109150g = function0;
            this.f109151h = function02;
            this.f109152i = function03;
            this.f109153j = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f109153j | 1);
            Function1<Float, Unit> function1 = this.f109149f;
            Function0<Unit> function0 = this.f109150g;
            C11130g.b(this.f109145b, this.f109146c, this.f109147d, this.f109148e, function1, function0, this.f109151h, this.f109152i, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenKt$CameraScreen$1$1", f = "CameraScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: zi.g$g, reason: collision with other inner class name */
    static final class C2353g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6236k<String, Boolean> f109154d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f109155e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2353g(C6236k<String, Boolean> c6236k, A1<Boolean> a12, kotlin.coroutines.d<? super C2353g> dVar) {
            super(2, dVar);
            this.f109154d = c6236k;
            this.f109155e = a12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C2353g(this.f109154d, this.f109155e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2353g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            if (this.f109155e.getValue().booleanValue()) {
                this.f109154d.a("android.permission.RECORD_AUDIO");
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenKt$CameraScreen$2$1", f = "CameraScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: zi.g$h, reason: case insensitive filesystem */
    static final class C11137h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f109156d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ PreviewView f109157e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11137h(m mVar, PreviewView previewView, kotlin.coroutines.d<? super C11137h> dVar) {
            super(2, dVar);
            this.f109156d = mVar;
            this.f109157e = previewView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C11137h(this.f109156d, this.f109157e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C11137h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            Y.c c11 = this.f109157e.c();
            Intrinsics.checkNotNullExpressionValue(c11, "getSurfaceProvider(...)");
            this.f109156d.r0(c11);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.gallery.camera.presentation.CameraScreenKt$CameraScreen$3$1", f = "CameraScreen.kt", l = {}, m = "invokeSuspend")
    /* renamed from: zi.g$i, reason: case insensitive filesystem */
    static final class C11138i extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ A1<Hi.k> f109158d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Hi.k, Unit> f109159e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m f109160f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11138i(A1<? extends Hi.k> a12, Function1<? super Hi.k, Unit> function1, m mVar, kotlin.coroutines.d<? super C11138i> dVar) {
            super(2, dVar);
            this.f109158d = a12;
            this.f109159e = function1;
            this.f109160f = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C11138i(this.f109158d, this.f109159e, this.f109160f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C11138i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            Hi.k value = this.f109158d.getValue();
            if (value != null) {
                this.f109159e.invoke(value);
                this.f109160f.q0(k.b.f109192a);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$j, reason: case insensitive filesystem */
    static final class C11139j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109161b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3877a f109162c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f109163d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<Hi.k, Hi.a, Unit> f109164e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11139j(m mVar, InterfaceC3877a interfaceC3877a, Function0<Unit> function0, Function2<? super Hi.k, ? super Hi.a, Unit> function2, int i11) {
            super(2);
            this.f109161b = mVar;
            this.f109162c = interfaceC3877a;
            this.f109163d = function0;
            this.f109164e = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C11130g.c(this.f109161b, this.f109162c, this.f109163d, this.f109164e, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$k, reason: case insensitive filesystem */
    static final class C11140k extends AbstractC7737t implements Function1<Boolean, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109165b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11140k(m mVar) {
            super(1);
            this.f109165b = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            this.f109165b.q0(k.h.f109197a);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$l, reason: case insensitive filesystem */
    static final class C11141l extends AbstractC7737t implements Function0<yi.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109166b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11141l(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109166b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final yi.q invoke() {
            return ((l) this.f109166b.getValue()).c().b();
        }
    }

    /* renamed from: zi.g$m, reason: case insensitive filesystem */
    static final class C11142m extends AbstractC7737t implements Function0<zi.t> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109167b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11142m(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109167b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final zi.t invoke() {
            return ((l) this.f109167b.getValue()).c();
        }
    }

    /* renamed from: zi.g$n, reason: case insensitive filesystem */
    static final class C11143n extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11143n(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109168b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((l) this.f109168b.getValue()).o());
        }
    }

    /* renamed from: zi.g$o */
    static final class o extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109169b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109169b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((l) this.f109169b.getValue()).j().d());
        }
    }

    /* renamed from: zi.g$p */
    static final class p extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109170b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109170b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((l) this.f109170b.getValue()).p());
        }
    }

    /* renamed from: zi.g$q */
    static final class q extends AbstractC7737t implements Function0<Hi.k> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109171b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Hi.k invoke() {
            return ((l) this.f109171b.getValue()).g();
        }
    }

    /* renamed from: zi.g$r */
    static final class r extends AbstractC7737t implements Function0<Integer> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f109172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(InterfaceC3978p0 interfaceC3978p0) {
            super(0);
            this.f109172b = interfaceC3978p0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(((l) this.f109172b.getValue()).h());
        }
    }

    /* renamed from: zi.g$s */
    static final class s extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(m mVar) {
            super(0);
            this.f109173b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109173b.q0(k.a.f109191a);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$t */
    static final class t extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(m mVar) {
            super(0);
            this.f109174b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109174b.q0(k.n.f109203a);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$u */
    static final class u extends AbstractC7737t implements Function1<Float, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109175b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(m mVar) {
            super(1);
            this.f109175b = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Float f7) {
            this.f109175b.q0(new k.d(f7.floatValue()));
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$v */
    static final class v extends AbstractC7737t implements Function1<Hi.k, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<Hi.k, Hi.a, Unit> f109176b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f109177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        v(Function2<? super Hi.k, ? super Hi.a, Unit> function2, m mVar) {
            super(1);
            this.f109176b = function2;
            this.f109177c = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Hi.k kVar) {
            Hi.k ozMedia = kVar;
            Intrinsics.checkNotNullParameter(ozMedia, "ozMedia");
            this.f109176b.invoke(ozMedia, this.f109177c.p0());
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$w */
    static final class w extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ A1<yi.q> f109179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f109180d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ A1<Integer> f109181e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A1<Boolean> f109182f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(m mVar, A1<? extends yi.q> a12, A1<Boolean> a13, A1<Integer> a14, A1<Boolean> a15) {
            super(0);
            this.f109178b = mVar;
            this.f109179c = a12;
            this.f109180d = a13;
            this.f109181e = a14;
            this.f109182f = a15;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            yi.q value = this.f109179c.getValue();
            yi.q qVar = yi.q.PHOTO;
            m mVar = this.f109178b;
            A1<Boolean> a12 = this.f109180d;
            if (value != qVar || a12.getValue().booleanValue()) {
                if (a12.getValue().booleanValue()) {
                    mVar.q0(k.i.f109198a);
                } else {
                    mVar.q0(k.e.f109195a);
                }
            } else if (this.f109181e.getValue().intValue() == 0 && this.f109182f.getValue().booleanValue()) {
                mVar.q0(k.l.f109201a);
            } else {
                mVar.q0(k.C2354k.f109200a);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$x */
    static final class x extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(m mVar) {
            super(0);
            this.f109183b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109183b.q0(k.j.f109199a);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$y */
    static final class y extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(m mVar) {
            super(0);
            this.f109184b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109184b.q0(k.m.f109202a);
            return Unit.f71690a;
        }
    }

    /* renamed from: zi.g$z */
    static final class z extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f109185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(m mVar) {
            super(0);
            this.f109185b = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f109185b.q0(k.c.f109193a);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(zi.t tVar, String str, long j11, long j12, long j13, long j14, long j15, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        long j16;
        long j17;
        long j18;
        Function0<Unit> function05;
        int i14;
        C3969l u11 = interfaceC3967k.u(313982550);
        if ((i11 & 6) == 0) {
            i13 = (u11.n(tVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            j16 = j12;
            i13 |= u11.s(j16) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        } else {
            j16 = j12;
        }
        if ((i11 & 24576) == 0) {
            j17 = j13;
            i13 |= u11.s(j17) ? 16384 : 8192;
        } else {
            j17 = j13;
        }
        if ((196608 & i11) == 0) {
            j18 = j14;
            i13 |= u11.s(j18) ? 131072 : 65536;
        } else {
            j18 = j14;
        }
        if ((1572864 & i11) == 0) {
            i13 |= u11.s(j15) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            function05 = function0;
            i13 |= u11.F(function05) ? 8388608 : 4194304;
        } else {
            function05 = function0;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= u11.F(function02) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= u11.F(function03) ? 536870912 : 268435456;
        }
        int i15 = i13;
        if ((i12 & 6) == 0) {
            i14 = i12 | (u11.F(function04) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((306783379 & i15) == 306783378 && (i14 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e b11 = androidx.compose.ui.c.b(T.j(a0.e(aVar, 1.0f), 0.0f, 20, 0.0f, 0.0f, 13), C5236c1.a(), new U(3));
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            androidx.compose.ui.e a12 = c5187j.a(aVar, InterfaceC6250b.a.e());
            V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(u11, a12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f15 = T7.E.f(u11, f13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f15);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            int i16 = i15 >> 3;
            h(tVar.b(), tVar.d(), j11, j16, j17, j18, function05, u11, (i15 & 524160) | (3670016 & i16));
            u11.f();
            float f16 = 36;
            float f17 = 24;
            float f18 = 56 + f16 + f17;
            androidx.compose.ui.e c11 = P.c(c5187j.a(aVar, InterfaceC6250b.a.e()), -f18, 0.0f, 2);
            V f19 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I13 = u11.I();
            A0 d13 = u11.d();
            androidx.compose.ui.e f21 = androidx.compose.ui.c.f(u11, c11);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 f22 = T7.E.f(u11, f19, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                Ep.a.d(I13, u11, I13, f22);
            }
            F1.b(u11, f21, InterfaceC2801g.a.f());
            int i17 = i15 >> 18;
            i(j15, str, function02, u11, (i17 & 896) | (i17 & 14) | (i15 & 112));
            u11 = u11;
            u11.f();
            u11.o(-1797228888);
            if (!tVar.d()) {
                if (tVar.e()) {
                    u11.o(120551552);
                    float f23 = f16 + f17;
                    androidx.compose.ui.e c12 = P.c(c5187j.a(aVar, InterfaceC6250b.a.e()), f23 + f17, 0.0f, 2);
                    V f24 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I14 = u11.I();
                    A0 d14 = u11.d();
                    androidx.compose.ui.e f25 = androidx.compose.ui.c.f(u11, c12);
                    Function0 a15 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a15);
                    } else {
                        u11.e();
                    }
                    Function2 f26 = T7.E.f(u11, f24, u11, d14);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                        Ep.a.d(I14, u11, I14, f26);
                    }
                    F1.b(u11, f25, InterfaceC2801g.a.f());
                    f(tVar.b(), j11, j12, function04, u11, (i16 & 1008) | ((i14 << 9) & 7168));
                    u11 = u11;
                    u11.f();
                    if (tVar.c()) {
                        androidx.compose.ui.e c13 = P.c(c5187j.a(aVar, InterfaceC6250b.a.e()), f23 + 48 + f17 + f17, 0.0f, 2);
                        V f27 = C5185h.f(InterfaceC6250b.a.o(), false);
                        int I15 = u11.I();
                        A0 d15 = u11.d();
                        androidx.compose.ui.e f28 = androidx.compose.ui.c.f(u11, c13);
                        Function0 a16 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                            u11.H(a16);
                        } else {
                            u11.e();
                        }
                        Function2 f29 = T7.E.f(u11, f27, u11, d15);
                        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                            Ep.a.d(I15, u11, I15, f29);
                        }
                        F1.b(u11, f28, InterfaceC2801g.a.f());
                        d(j11, j12, function03, u11, ((i15 >> 6) & 126) | ((i15 >> 21) & 896));
                        u11.f();
                    }
                    u11.k();
                } else if (tVar.c()) {
                    u11.o(121622602);
                    androidx.compose.ui.e c14 = P.c(c5187j.a(aVar, InterfaceC6250b.a.e()), f18, 0.0f, 2);
                    V f31 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I16 = u11.I();
                    A0 d16 = u11.d();
                    androidx.compose.ui.e f32 = androidx.compose.ui.c.f(u11, c14);
                    Function0 a17 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a17);
                    } else {
                        u11.e();
                    }
                    Function2 f33 = T7.E.f(u11, f31, u11, d16);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I16))) {
                        Ep.a.d(I16, u11, I16, f33);
                    }
                    F1.b(u11, f32, InterfaceC2801g.a.f());
                    d(j11, j12, function03, u11, ((i15 >> 6) & 126) | ((i15 >> 21) & 896));
                    u11.f();
                    u11.k();
                } else {
                    u11.o(122046403);
                    u11.k();
                }
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C11131a(tVar, str, j11, j12, j13, j14, j15, function0, function02, function03, function04, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(zi.u uVar, PreviewView previewView, long j11, long j12, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC3967k interfaceC3967k, int i11) {
        zi.u uVar2;
        int i12;
        int i13;
        int i14;
        C3969l u11 = interfaceC3967k.u(1509516421);
        if ((i11 & 6) == 0) {
            uVar2 = uVar;
            i12 = (u11.n(uVar2) ? 4 : 2) | i11;
        } else {
            uVar2 = uVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(previewView) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.s(j12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function1) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.F(function0) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= u11.F(function03) ? 8388608 : 4194304;
        }
        if ((4793491 & i12) == 4793490 && u11.b()) {
            u11.j();
        } else {
            boolean d11 = uVar2.d();
            boolean b11 = uVar2.b();
            InterfaceC3978p0 l11 = n1.l(function1, u11);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e d12 = a0.d(aVar);
            int i15 = i12;
            Unit unit = Unit.f71690a;
            u11.o(-281831132);
            boolean n11 = u11.n(l11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C11132b(l11, null);
                u11.x(C11);
            }
            u11.k();
            androidx.compose.ui.e b12 = x1.L.b(d12, unit, (Function2) C11);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d13 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b12);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            u11.o(-173315165);
            boolean F11 = u11.F(previewView);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new C11133c(previewView);
                u11.x(C12);
            }
            u11.k();
            androidx.compose.ui.viewinterop.a.a((Function1) C12, C6988h.a(a0.e(aVar, 1.0f), A0.h.b(32)), null, u11, 0, 4);
            u11.o(-173309069);
            if (d11) {
                i13 = 8;
                i14 = 100663680;
            } else {
                float f13 = 8;
                androidx.compose.ui.e j13 = T.j(c5187j.a(aVar, InterfaceC6250b.a.o()), f13, f13, 0.0f, 0.0f, 12);
                AbstractC8972b a12 = G1.e.a(R.drawable.ic_m_disclosure_back_filled, u11, 0);
                UniIconButtonSize uniIconButtonSize = UniIconButtonSize.SIZE_500;
                i14 = 100663680;
                UniIconButtonStyle.Custom custom = new UniIconButtonStyle.Custom(new UniIconButtonColors(j11, j12, j12, (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, null);
                u11.o(-173287968);
                boolean z11 = (i15 & 458752) == 131072;
                Object C13 = u11.C();
                if (z11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new C11134d(function0);
                    u11.x(C13);
                }
                u11.k();
                i13 = 8;
                UniIconButtonKt.UniIconButton(a12, custom, uniIconButtonSize, j13, null, null, false, false, true, false, (Function0) C13, null, u11, (UniIconButtonStyle.Custom.$stable << 3) | 100663680, 0, 2800);
                u11 = u11;
                if (b11) {
                    androidx.compose.ui.e n12 = a0.n(T.j(c5187j.a(aVar, InterfaceC6250b.a.n()), 0.0f, f13, f13, 0.0f, 9), 44);
                    V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
                    int I12 = u11.I();
                    A0 d14 = u11.d();
                    androidx.compose.ui.e f15 = androidx.compose.ui.c.f(u11, n12);
                    Function0 a13 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a13);
                    } else {
                        u11.e();
                    }
                    Function2 f16 = T7.E.f(u11, f14, u11, d14);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        Ep.a.d(I12, u11, I12, f16);
                    }
                    F1.b(u11, f15, InterfaceC2801g.a.f());
                    e(uVar.c(), j11, j12, function02, u11, ((i15 >> 3) & 1008) | ((i15 >> 9) & 7168));
                    u11 = u11;
                    u11.f();
                }
            }
            u11.k();
            u11.o(-173266509);
            if (d11) {
                u11.o(377832859);
                u11.o(-1509972748);
                Object C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = C3959g1.a(0L);
                    u11.x(C14);
                }
                InterfaceC3974n0 interfaceC3974n0 = (InterfaceC3974n0) C14;
                u11.k();
                Boolean bool = Boolean.TRUE;
                u11.o(-1509970266);
                Object C15 = u11.C();
                if (C15 == InterfaceC3967k.a.a()) {
                    C15 = new C11144h(interfaceC3974n0, null);
                    u11.x(C15);
                }
                u11.k();
                Q.e(u11, bool, (Function2) C15);
                u11.o(-1509960102);
                Object C16 = u11.C();
                if (C16 == InterfaceC3967k.a.a()) {
                    C16 = n1.e(new i(interfaceC3974n0));
                    u11.x(C16);
                }
                A1 a14 = (A1) C16;
                u11.k();
                u11.k();
                u11.o(-173264432);
                Object C17 = u11.C();
                if (C17 == InterfaceC3967k.a.a()) {
                    C17 = new BadgeDTO.CustomStyle(new BadgeDTO.CustomBackground("clearDarkKey600", null, 2, null), null, "textLightKey", null, null, 26, null);
                    u11.x(C17);
                }
                u11.k();
                float f17 = i13;
                UniBadgeAtomKt.UniBadgeAtom(new BadgeDTO((String) a14.getValue(), null, BadgeDTO.BadgeSize.SIZE_600, BadgeDTO.Style.CUSTOM, (BadgeDTO.CustomStyle) C17, null, null, null, null, null, null, null, 4066, null), T.j(c5187j.a(aVar, InterfaceC6250b.a.m()), 0.0f, f17, 0.0f, 0.0f, 13), null, u11, 0, 4);
                androidx.compose.ui.e n13 = a0.n(T.j(c5187j.a(aVar, InterfaceC6250b.a.n()), 0.0f, f17, f17, 0.0f, 9), 44);
                V f18 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I13 = u11.I();
                A0 d15 = u11.d();
                androidx.compose.ui.e f19 = androidx.compose.ui.c.f(u11, n13);
                Function0 a15 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a15);
                } else {
                    u11.e();
                }
                Function2 f21 = T7.E.f(u11, f18, u11, d15);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, u11, I13, f21);
                }
                F1.b(u11, f19, InterfaceC2801g.a.f());
                AbstractC8972b a16 = G1.e.a(R.drawable.ic_m_cross_filled, u11, 0);
                UniIconButtonSize uniIconButtonSize2 = UniIconButtonSize.SIZE_500;
                UniIconButtonStyle.Custom custom2 = new UniIconButtonStyle.Custom(new UniIconButtonColors(j11, j12, j12, (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, null);
                u11.o(-2023893206);
                boolean z12 = (i15 & 29360128) == 8388608;
                Object C18 = u11.C();
                if (z12 || C18 == InterfaceC3967k.a.a()) {
                    C18 = new C11135e(function03);
                    u11.x(C18);
                }
                u11.k();
                C3969l c3969l = u11;
                UniIconButtonKt.UniIconButton(a16, custom2, uniIconButtonSize2, null, null, null, false, false, true, false, (Function0) C18, null, c3969l, (UniIconButtonStyle.Custom.$stable << 3) | i14, 0, 2808);
                u11 = c3969l;
                u11.f();
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C11136f(uVar, previewView, j11, j12, function1, function0, function02, function03, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0193, code lost:
    
        if (r2 == S0.InterfaceC3967k.a.a()) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(@NotNull m viewModel, InterfaceC3877a interfaceC3877a, @NotNull Function0<Unit> onBack, @NotNull Function2<? super Hi.k, ? super Hi.a, Unit> onResult, InterfaceC3967k interfaceC3967k, int i11) {
        A1 a12;
        Function1 function1;
        PreviewView previewView;
        long j11;
        androidx.compose.ui.e b11;
        C3969l c3969l;
        long j12;
        androidx.compose.ui.e b12;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        C3969l u11 = interfaceC3967k.u(-320031153);
        int i12 = i11 | (u11.F(viewModel) ? 4 : 2) | (u11.n(interfaceC3877a) ? 32 : 16) | (u11.F(onBack) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onResult) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL);
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            InterfaceC3978p0 c11 = C6285b.c(viewModel.getUiState(), u11, 0);
            u11.o(1035776799);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.e(new A(c11));
                u11.x(C11);
            }
            A1 a13 = (A1) C11;
            Object b13 = Pk0.h.b(u11, 1035779136);
            if (b13 == InterfaceC3967k.a.a()) {
                b13 = n1.e(new C11142m(c11));
                u11.x(b13);
            }
            A1 a14 = (A1) b13;
            Object b14 = Pk0.h.b(u11, 1035781484);
            if (b14 == InterfaceC3967k.a.a()) {
                b14 = n1.e(new C11141l(c11));
                u11.x(b14);
            }
            A1 a15 = (A1) b14;
            Object b15 = Pk0.h.b(u11, 1035784171);
            if (b15 == InterfaceC3967k.a.a()) {
                b15 = n1.e(new o(c11));
                u11.x(b15);
            }
            A1 a16 = (A1) b15;
            Object b16 = Pk0.h.b(u11, 1035787083);
            if (b16 == InterfaceC3967k.a.a()) {
                b16 = n1.e(new C11143n(c11));
                u11.x(b16);
            }
            A1 a17 = (A1) b16;
            Object b17 = Pk0.h.b(u11, 1035789698);
            if (b17 == InterfaceC3967k.a.a()) {
                b17 = n1.e(new r(c11));
                u11.x(b17);
            }
            A1 a18 = (A1) b17;
            Object b18 = Pk0.h.b(u11, 1035792135);
            if (b18 == InterfaceC3967k.a.a()) {
                b18 = n1.e(new q(c11));
                u11.x(b18);
            }
            A1 a19 = (A1) b18;
            Object b19 = Pk0.h.b(u11, 1035794923);
            if (b19 == InterfaceC3967k.a.a()) {
                b19 = n1.e(new p(c11));
                u11.x(b19);
            }
            A1 a110 = (A1) b19;
            Object b21 = Pk0.h.b(u11, 1035797802);
            if (b21 == InterfaceC3967k.a.a()) {
                b21 = n1.e(new B(c11));
                u11.x(b21);
            }
            A1 a111 = (A1) b21;
            u11.k();
            C6763i c6763i = new C6763i();
            u11.o(1035804190);
            boolean F11 = u11.F(viewModel);
            Object C12 = u11.C();
            if (F11) {
                a12 = a15;
            } else {
                a12 = a15;
            }
            C12 = new C11140k(viewModel);
            u11.x(C12);
            u11.k();
            C6236k a11 = C6230e.a(c6763i, (Function1) C12, u11);
            Boolean bool = (Boolean) a111.getValue();
            bool.getClass();
            u11.o(1035808048);
            boolean F12 = u11.F(a11);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C2353g(a11, a111, null);
                u11.x(C13);
            }
            u11.k();
            Q.e(u11, bool, (Function2) C13);
            long a21 = mi.f.a(new C8737a("bgDarkKey"), u11);
            long a22 = mi.f.a(new C8737a("graphicLightKey"), u11);
            long a23 = mi.f.a(new C8737a("clearDarkKey600"), u11);
            long a24 = mi.f.a(new C8737a("graphicNegativePrimary"), u11);
            long a25 = mi.f.a(new C8737a("graphicTertiaryOnDark"), u11);
            long a26 = mi.f.a(new C8737a("textLightKey"), u11);
            Function0<Unit> s11 = s(onBack, u11, (i12 >> 6) & 14);
            u11.o(1035829321);
            boolean F13 = ((i12 & 7168) == 2048) | u11.F(viewModel);
            Object C14 = u11.C();
            if (F13 || C14 == InterfaceC3967k.a.a()) {
                C14 = new v(onResult, viewModel);
                u11.x(C14);
            }
            u11.k();
            Function1 t2 = t(u11, (Function1) C14);
            u11.o(1035833176);
            Object C15 = u11.C();
            Object obj = C15;
            if (C15 == InterfaceC3967k.a.a()) {
                PreviewView previewView2 = new PreviewView(context, null);
                if (Build.VERSION.SDK_INT < 30) {
                    previewView2.e(PreviewView.c.COMPATIBLE);
                }
                u11.x(previewView2);
                obj = previewView2;
            }
            PreviewView previewView3 = (PreviewView) obj;
            u11.k();
            u11.o(1035844505);
            boolean F14 = u11.F(viewModel) | u11.F(previewView3);
            Object C16 = u11.C();
            if (F14 || C16 == InterfaceC3967k.a.a()) {
                C16 = new C11137h(viewModel, previewView3, null);
                u11.x(C16);
            }
            u11.k();
            Q.e(u11, previewView3, (Function2) C16);
            if (((l) c11.getValue()).b() != null) {
                onBack.invoke();
            }
            float n11 = ((l) c11.getValue()).n();
            u11.o(1035849551);
            boolean q11 = u11.q(n11);
            Object C17 = u11.C();
            if (q11 || C17 == InterfaceC3967k.a.a()) {
                C17 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((l) c11.getValue()).n())}, 1));
                Intrinsics.checkNotNullExpressionValue(C17, "format(...)");
                u11.x(C17);
            }
            String str = (String) C17;
            u11.k();
            u11.o(1035854308);
            boolean F15 = u11.F(viewModel);
            Object C18 = u11.C();
            if (F15 || C18 == InterfaceC3967k.a.a()) {
                C18 = new u(viewModel);
                u11.x(C18);
            }
            u11.k();
            Function1 t11 = t(u11, (Function1) C18);
            u11.o(1035858486);
            boolean F16 = u11.F(viewModel);
            Object C19 = u11.C();
            if (F16 || C19 == InterfaceC3967k.a.a()) {
                C19 = new t(viewModel);
                u11.x(C19);
            }
            u11.k();
            Function0<Unit> s12 = s((Function0) C19, u11, 0);
            u11.o(1035862394);
            boolean F17 = u11.F(viewModel);
            Object C21 = u11.C();
            if (F17 || C21 == InterfaceC3967k.a.a()) {
                C21 = new s(viewModel);
                u11.x(C21);
            }
            u11.k();
            Function0<Unit> s13 = s((Function0) C21, u11, 0);
            u11.o(1035866228);
            boolean F18 = u11.F(viewModel);
            Object C22 = u11.C();
            if (F18 || C22 == InterfaceC3967k.a.a()) {
                C22 = new z(viewModel);
                u11.x(C22);
            }
            u11.k();
            Function0<Unit> s14 = s((Function0) C22, u11, 0);
            u11.o(1035869975);
            boolean F19 = u11.F(viewModel);
            Object C23 = u11.C();
            if (F19 || C23 == InterfaceC3967k.a.a()) {
                C23 = new x(viewModel);
                u11.x(C23);
            }
            u11.k();
            Function0<Unit> s15 = s((Function0) C23, u11, 0);
            u11.o(1035873756);
            boolean F21 = u11.F(viewModel);
            Object C24 = u11.C();
            if (F21 || C24 == InterfaceC3967k.a.a()) {
                C24 = new y(viewModel);
                u11.x(C24);
            }
            u11.k();
            Function0<Unit> s16 = s((Function0) C24, u11, 0);
            u11.o(1035878244);
            boolean F22 = u11.F(viewModel);
            Object C25 = u11.C();
            if (F22 || C25 == InterfaceC3967k.a.a()) {
                function1 = t2;
                A1 a112 = a12;
                previewView = previewView3;
                j11 = a21;
                Object wVar = new w(viewModel, a112, a16, a18, a17);
                u11.x(wVar);
                C25 = wVar;
            } else {
                previewView = previewView3;
                function1 = t2;
                j11 = a21;
            }
            u11.k();
            Function0<Unit> s17 = s((Function0) C25, u11, 0);
            Hi.k kVar = (Hi.k) a19.getValue();
            u11.o(1035897040);
            boolean n12 = u11.n(function1) | u11.F(viewModel);
            Object C26 = u11.C();
            if (n12 || C26 == InterfaceC3967k.a.a()) {
                C26 = new C11138i(a19, function1, viewModel, null);
                u11.x(C26);
            }
            u11.k();
            Q.e(u11, kVar, (Function2) C26);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            b11 = androidx.compose.foundation.e.b(a0.d(aVar), j11, y0.a());
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b11);
            Function0 a27 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a27);
            } else {
                u11.e();
            }
            Function2 f12 = T7.E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            Object m11 = u11.m(AndroidCompositionLocals_androidKt.d());
            Activity activity = m11 instanceof Activity ? (Activity) m11 : null;
            g(((Boolean) a110.getValue()).booleanValue(), activity != null ? activity.getWindow() : null, interfaceC3877a, u11, (i12 << 3) & 896);
            androidx.compose.ui.e b22 = androidx.compose.ui.c.b(a0.d(aVar), C5236c1.a(), new U(3));
            C5194q a28 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, b22);
            Function0 a29 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a29);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a28, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            androidx.compose.ui.e e11 = a0.e(new LayoutWeightElement(1.0f, true), 1.0f);
            V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I13 = u11.I();
            A0 d13 = u11.d();
            androidx.compose.ui.e f15 = androidx.compose.ui.c.f(u11, e11);
            Function0 a31 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a31);
            } else {
                u11.e();
            }
            Function2 f16 = T7.E.f(u11, f14, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                Ep.a.d(I13, u11, I13, f16);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            b((zi.u) a13.getValue(), previewView, a23, a22, t11, s11, s12, s13, u11, 0);
            u11.f();
            a((zi.t) a14.getValue(), str, j11, a22, a24, a25, a26, s17, s14, s15, s16, u11, 0, 0);
            c3969l = u11;
            c3969l.f();
            c3969l.o(1156961242);
            if (((Boolean) a110.getValue()).booleanValue()) {
                androidx.compose.ui.e a32 = C6988h.a(u0.T.a(a0.d(aVar)), A0.h.b(32));
                j12 = C7807Z.f72251e;
                b12 = androidx.compose.foundation.e.b(a32, j12, y0.a());
                C5185h.a(b12, c3969l, 0);
            }
            c3969l.k();
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new C11139j(viewModel, interfaceC3877a, onBack, onResult, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(long j11, long j12, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-590479121);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            AbstractC8972b a11 = G1.e.a(R.drawable.ic_m_reload_filled, u11, 0);
            ki.g gVar = new ki.g(j11, j12, 44, 22);
            A0.g e11 = A0.h.e();
            u11.o(1784688951);
            boolean z11 = (i12 & 896) == 256;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C(function0);
                u11.x(C11);
            }
            u11.k();
            ki.f.a(a11, gVar, e11, null, null, false, null, (Function0) C11, u11, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new D(j11, j12, function0, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(boolean z11, long j11, long j12, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(167488678);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.s(j12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            AbstractC8972b a11 = G1.e.a(z11 ? R.drawable.ic_m_flash_on_filled : R.drawable.ic_m_flash_off_filled, u11, 0);
            UniIconButtonSize uniIconButtonSize = UniIconButtonSize.SIZE_500;
            UniIconButtonStyle.Custom custom = new UniIconButtonStyle.Custom(new UniIconButtonColors(j11, j12, j12, (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, null);
            u11.o(796842736);
            boolean z12 = (i12 & 7168) == 2048;
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new E(function0);
                u11.x(C11);
            }
            u11.k();
            c3969l = u11;
            UniIconButtonKt.UniIconButton(a11, custom, uniIconButtonSize, null, null, null, false, false, true, false, (Function0) C11, null, c3969l, (UniIconButtonStyle.Custom.$stable << 3) | 100663680, 0, 2808);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new F(z11, j11, j12, function0, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(yi.q qVar, long j11, long j12, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-977473622);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.s(j12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(function0) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            AbstractC8972b a11 = G1.e.a(qVar == yi.q.PHOTO ? R.drawable.ic_m_video_record_filled : R.drawable.ic_m_photo_filled, u11, 0);
            ki.g gVar = new ki.g(j11, j12, 44, 22);
            A0.g e11 = A0.h.e();
            u11.o(-1564747946);
            boolean z11 = (i12 & 7168) == 2048;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new G(function0);
                u11.x(C11);
            }
            u11.k();
            c3969l = u11;
            ki.f.a(a11, gVar, e11, null, null, false, null, (Function0) C11, c3969l, 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new H(qVar, j11, j12, function0, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z11, Window window, InterfaceC3877a interfaceC3877a, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        WindowManager.LayoutParams attributes;
        boolean z12;
        Window window2;
        InterfaceC3877a interfaceC3877a2;
        C3969l u11 = interfaceC3967k.u(138058336);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(window) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(interfaceC3877a) : u11.F(interfaceC3877a) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            z12 = z11;
            window2 = window;
            interfaceC3877a2 = interfaceC3877a;
        } else {
            u11.o(528430799);
            boolean n11 = u11.n(window);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = (window == null || (attributes = window.getAttributes()) == null) ? null : Float.valueOf(attributes.screenBrightness);
                u11.x(C11);
            }
            Float f7 = (Float) C11;
            u11.k();
            Boolean valueOf = Boolean.valueOf(z11);
            u11.o(528433945);
            boolean z13 = false;
            boolean F11 = ((i12 & 14) == 4) | u11.F(window);
            if ((i12 & 896) == 256 || ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && u11.F(interfaceC3877a))) {
                z13 = true;
            }
            boolean n12 = F11 | z13 | u11.n(f7);
            Object C12 = u11.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                z12 = z11;
                window2 = window;
                interfaceC3877a2 = interfaceC3877a;
                I i13 = new I(z12, window2, interfaceC3877a2, f7, null);
                u11.x(i13);
                C12 = i13;
            } else {
                z12 = z11;
                window2 = window;
                interfaceC3877a2 = interfaceC3877a;
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) C12);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new J(z12, window2, interfaceC3877a2, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(yi.q qVar, boolean z11, long j11, long j12, long j13, long j14, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        Function0<Unit> function02;
        androidx.compose.ui.e b11;
        yi.q qVar2;
        androidx.compose.ui.e b12;
        long j15 = j13;
        C3969l u11 = interfaceC3967k.u(340467214);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(qVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.s(j11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.s(j12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.s(j15) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= u11.s(j14) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= u11.F(function0) ? 1048576 : 524288;
        }
        int i13 = i12;
        if ((i13 & 599187) == 599186 && u11.b()) {
            u11.j();
            c3969l = u11;
            qVar2 = qVar;
            function02 = function0;
        } else {
            u11.o(1882384807);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = t0.p.a();
                u11.x(C11);
            }
            t0.q qVar3 = (t0.q) C11;
            u11.k();
            InterfaceC3978p0 a11 = t0.u.a(qVar3, u11, 6);
            A1 a12 = C7990g.a((!z11 && ((Boolean) a11.getValue()).booleanValue()) ? 10 : 6, C8004n.c(200.0f, null, 4), u11, 48, 12);
            A1 a13 = C7990g.a(z11 ? 72 : ((Boolean) a11.getValue()).booleanValue() ? 48 : 56, C8004n.c(200.0f, null, 4), u11, 48, 12);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            float f7 = 72;
            androidx.compose.ui.e b13 = androidx.compose.foundation.i.b(C6988h.a(a0.n(aVar, f7), A0.h.e()), qVar3, null, false, null, null, function0, 28);
            V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            c3969l = u11;
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(c3969l, b13);
            Function0 a14 = Fr.g.a(InterfaceC2801g.f5440U, c3969l);
            if (c3969l.t()) {
                c3969l.H(a14);
            } else {
                c3969l.e();
            }
            Function2 f13 = T7.E.f(c3969l, f11, c3969l, d11);
            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, c3969l, I11, f13);
            }
            F1.b(c3969l, f12, InterfaceC2801g.a.f());
            if (z11) {
                c3969l.o(1347332645);
                androidx.compose.ui.e c11 = C8385f.c(6, j15, a0.n(aVar, f7), A0.h.e());
                V f14 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I12 = c3969l.I();
                A0 d12 = c3969l.d();
                androidx.compose.ui.e f15 = androidx.compose.ui.c.f(c3969l, c11);
                Function0 a15 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                    c3969l.H(a15);
                } else {
                    c3969l.e();
                }
                Function2 f16 = T7.E.f(c3969l, f14, c3969l, d12);
                if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I12))) {
                    Ep.a.d(I12, c3969l, I12, f16);
                }
                F1.b(c3969l, f15, InterfaceC2801g.a.f());
                AbstractC8972b a16 = G1.e.a(R.drawable.ic_m_stop_sign_filled, c3969l, 0);
                UniIconButtonSize uniIconButtonSize = UniIconButtonSize.SIZE_500;
                function02 = function0;
                j15 = j13;
                UniIconButtonStyle.Custom custom = new UniIconButtonStyle.Custom(new UniIconButtonColors(j11, j13, j13, (C7807Z) null, 8, (DefaultConstructorMarker) null), null, 2, null);
                c3969l.o(-1169488693);
                boolean z12 = (i13 & 3670016) == 1048576;
                Object C12 = c3969l.C();
                if (z12 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new K(function02);
                    c3969l.x(C12);
                }
                c3969l.k();
                UniIconButtonKt.UniIconButton(a16, custom, uniIconButtonSize, null, null, null, false, false, false, false, (Function0) C12, null, c3969l, (UniIconButtonStyle.Custom.$stable << 3) | 384, 0, 3064);
                c3969l = c3969l;
                c3969l.f();
                c3969l.k();
                qVar2 = qVar;
            } else {
                function02 = function0;
                c3969l.o(1348244386);
                androidx.compose.ui.e c12 = C8385f.c(((Z1.h) a12.getValue()).d(), j14, a0.n(aVar, f7), A0.h.e());
                V f17 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I13 = c3969l.I();
                A0 d13 = c3969l.d();
                androidx.compose.ui.e f18 = androidx.compose.ui.c.f(c3969l, c12);
                Function0 a17 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                    c3969l.H(a17);
                } else {
                    c3969l.e();
                }
                Function2 f19 = T7.E.f(c3969l, f17, c3969l, d13);
                if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, c3969l, I13, f19);
                }
                F1.b(c3969l, f18, InterfaceC2801g.a.f());
                b11 = androidx.compose.foundation.e.b(C6988h.a(a0.n(aVar, ((Z1.h) a13.getValue()).d()), A0.h.e()), j12, y0.a());
                V f21 = C5185h.f(InterfaceC6250b.a.e(), false);
                int I14 = c3969l.I();
                A0 d14 = c3969l.d();
                androidx.compose.ui.e f22 = androidx.compose.ui.c.f(c3969l, b11);
                Function0 a18 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                    c3969l.H(a18);
                } else {
                    c3969l.e();
                }
                Function2 f23 = T7.E.f(c3969l, f21, c3969l, d14);
                if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I14))) {
                    Ep.a.d(I14, c3969l, I14, f23);
                }
                U7.i.b(c3969l, f22, -359419878);
                qVar2 = qVar;
                if (qVar2 == yi.q.VIDEO) {
                    b12 = androidx.compose.foundation.e.b(C6988h.a(a0.n(aVar, 12), A0.h.e()), j15, y0.a());
                    C5185h.a(b12, c3969l, 0);
                }
                c3969l.k();
                c3969l.f();
                c3969l.f();
                c3969l.k();
            }
            c3969l.f();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new L(qVar2, z11, j11, j12, j15, j14, function02, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(long j11, String str, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        long j12;
        long j13;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-690680552);
        if ((i11 & 6) == 0) {
            i12 = (u11.s(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e c11 = androidx.compose.foundation.i.c(aVar, false, null, null, function0, 7);
            j12 = C7807Z.f72259m;
            j13 = C7807Z.f72259m;
            K0 k02 = new K0(j13);
            oi.g q11 = pi.k.f().q();
            Intrinsics.checkNotNullParameter(q11, "<this>");
            float f7 = 44;
            C7962a style = new C7962a(j12, C7807Z.m(j11), k02, (K1.T) kotlin.collections.U.e(ni.f.c(), q11), 0, f7, f7);
            int i13 = (i12 << 3) & 896;
            Intrinsics.checkNotNullParameter(style, "style");
            u11.o(-1874902081);
            A0.g e11 = A0.h.e();
            float e12 = e11 != null ? style.e() : style.d();
            boolean z11 = str != null;
            androidx.compose.ui.e j14 = a0.j(c11, e12);
            K1.T g10 = style.g();
            if (g10 == null) {
                g10 = K1.T.f15012d;
            }
            long a11 = style.a();
            C7807Z f11 = z11 ? style.f() : null;
            c3969l = u11;
            X20.d.a(j14, z11, C7807Z.m(f11 != null ? f11.w() : C7807Z.f72259m), null, str, g10, new V1.r(), aVar, aVar, aVar, aVar, e11, mi.f.a(pi.k.a().i6(), u11), a11, style.b(), style.e(), style.d(), Float.NaN, style.c(), InterfaceC2547p.a.a(), null, c3969l, 918552576 | ((i13 << 9) & 458752));
            c3969l.k();
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new M(j11, str, function0, i11));
        }
    }

    public static final void r(Window window, float f7, InterfaceC3877a interfaceC3877a) {
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = f7;
                window.setAttributes(attributes);
            } catch (SecurityException e11) {
                interfaceC3877a.b(e11, "ozon_gallery", "camera_screen setScreenBrightness exception", kotlin.collections.U.c());
            }
        }
    }

    private static final Function0<Unit> s(Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1309137547);
        InterfaceC3978p0 l11 = n1.l(function0, interfaceC3967k);
        interfaceC3967k.o(1332597096);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new N(l11);
            interfaceC3967k.x(C11);
        }
        Function0<Unit> function02 = (Function0) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return function02;
    }

    private static final Function1 t(InterfaceC3967k interfaceC3967k, Function1 function1) {
        interfaceC3967k.o(-1070326152);
        InterfaceC3978p0 l11 = n1.l(function1, interfaceC3967k);
        interfaceC3967k.o(-833608953);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new j(l11);
            interfaceC3967k.x(C11);
        }
        Function1 function12 = (Function1) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return function12;
    }
}
