package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import D30.c;
import H30.k;
import Kk.C3532b;
import N3.C3660k;
import Q90.c;
import Sc.C4001c;
import Sc.C4005g;
import T60.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.lifecycle.w0;
import d40.InterfaceC6083a;
import d70.d;
import fd.InterfaceC6511n;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.C7740w;
import kotlin.jvm.internal.Intrinsics;
import l30.InterfaceC7863a;
import m30.InterfaceC8075b;
import org.jetbrains.annotations.NotNull;
import r90.f;
import ru.ozon.app.android.R;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.features.cbottombase.models.cbottom.CbottomType;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2SheetDTO;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeBridgeConfigurator;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.file.models.OpenFileRequest;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.network.models.a;
import ru.ozon.fintech.settings.models.AppConfig;
import ru.ozon.fintech.settings.models.AppConfigTab;
import ru.ozon.fintech.settings.models.AuthPinpad;
import ru.ozon.fintech.ui.ActionResult2UI;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateV20;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import t90.AbstractC9782b;
import u90.C9987a;
import w80.C10448a;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.L0;
import xe.M;
import xe.N;
import xe.Y;
import y80.C10863b;
import y80.InterfaceC10862a;
import ze.EnumC11113a;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class a extends w0 implements f.a {

    /* renamed from: A, reason: collision with root package name */
    private final boolean f96452A;

    /* renamed from: A0, reason: collision with root package name */
    @NotNull
    private final x0<K60.a> f96453A0;

    /* renamed from: B, reason: collision with root package name */
    private boolean f96454B;

    /* renamed from: B0, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<q> f96455B0;

    /* renamed from: C, reason: collision with root package name */
    private boolean f96456C;

    /* renamed from: C0, reason: collision with root package name */
    @NotNull
    private final x0<ScreenStateV20> f96457C0;

    /* renamed from: D, reason: collision with root package name */
    private boolean f96458D;

    /* renamed from: D0, reason: collision with root package name */
    @NotNull
    private final C0 f96459D0;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private ru.ozon.fintech.network.models.a f96460E;

    /* renamed from: E0, reason: collision with root package name */
    @NotNull
    private final C0 f96461E0;

    /* renamed from: F, reason: collision with root package name */
    private B0 f96462F;

    /* renamed from: F0, reason: collision with root package name */
    @NotNull
    private final x0<Unit> f96463F0;

    /* renamed from: G, reason: collision with root package name */
    private B0 f96464G;

    /* renamed from: G0, reason: collision with root package name */
    public A80.a f96465G0;

    /* renamed from: H, reason: collision with root package name */
    private boolean f96466H;

    /* renamed from: H0, reason: collision with root package name */
    @NotNull
    private final String f96467H0;

    /* renamed from: I, reason: collision with root package name */
    private B0 f96468I;

    /* renamed from: I0, reason: collision with root package name */
    private AbstractC9782b f96469I0;

    /* renamed from: J, reason: collision with root package name */
    private e40.d f96470J;

    /* renamed from: J0, reason: collision with root package name */
    @NotNull
    private final x0<C9987a> f96471J0;

    /* renamed from: K, reason: collision with root package name */
    private K60.a f96472K;

    /* renamed from: K0, reason: collision with root package name */
    @NotNull
    private C0 f96473K0;

    /* renamed from: L, reason: collision with root package name */
    private boolean f96474L;

    /* renamed from: M, reason: collision with root package name */
    private B0 f96475M;

    /* renamed from: N, reason: collision with root package name */
    private B0 f96476N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f96477O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f96478P;

    /* renamed from: Q, reason: collision with root package name */
    private int f96479Q;

    /* renamed from: R, reason: collision with root package name */
    private String f96480R;

    /* renamed from: S, reason: collision with root package name */
    @NotNull
    private final Object f96481S;

    /* renamed from: X, reason: collision with root package name */
    private boolean f96482X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f96483Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f96484Z;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final v30.d f96485a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6083a f96486b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S60.a f96487c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A30.m f96488d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final K40.a f96489e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Context f96490f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final r90.f f96491g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Q90.c f96492h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f96493i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC8075b f96494j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC7863a f96495k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C10863b f96496l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final O30.b f96497m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C10448a f96498n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final S80.b f96499o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f96500p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final NativeBridgeConfigurator f96501q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final Z30.a f96502r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f96503r0;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final d70.d f96504s;

    /* renamed from: s0, reason: collision with root package name */
    private Function0<Unit> f96505s0;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final h90.f f96506t;

    /* renamed from: t0, reason: collision with root package name */
    private Function1<? super OpenFileRequest, Unit> f96507t0;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final Object f96508u;

    /* renamed from: u0, reason: collision with root package name */
    private AppConfig f96509u0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f96510v;

    /* renamed from: v0, reason: collision with root package name */
    private B0 f96511v0;

    /* renamed from: w, reason: collision with root package name */
    private String f96512w;

    /* renamed from: w0, reason: collision with root package name */
    @NotNull
    private String f96513w0;

    /* renamed from: x, reason: collision with root package name */
    private String f96514x;

    /* renamed from: x0, reason: collision with root package name */
    private WeakReference<FintechWebView> f96515x0;

    /* renamed from: y, reason: collision with root package name */
    private int f96516y;

    /* renamed from: y0, reason: collision with root package name */
    @NotNull
    private final x0<s> f96517y0;

    /* renamed from: z, reason: collision with root package name */
    private final int f96518z;

    /* renamed from: z0, reason: collision with root package name */
    @NotNull
    private final x0<K60.a> f96519z0;

    /* synthetic */ class A extends C7735q implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((a) this.receiver).S0().d();
        }
    }

    /* synthetic */ class B extends C7735q implements Function0<Boolean> {
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((a) this.receiver).E1());
        }
    }

    /* synthetic */ class C extends C7735q implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((a) this.receiver).F1();
        }
    }

    /* synthetic */ class D extends C7735q implements InterfaceC6511n<String, Boolean, Boolean, Unit> {
        @Override // fd.InterfaceC6511n
        public final Unit invoke(String str, Boolean bool, Boolean bool2) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            ((a) this.receiver).L0(str, booleanValue, booleanValue2);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class E extends C7735q implements Function0<Boolean> {
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((a) this.receiver).m1());
        }
    }

    /* synthetic */ class F extends C7735q implements Function2<String, Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ((a) this.receiver).k1(str, booleanValue);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$onCreate$8", f = "FintechWebViewViewModelBase.kt", l = {475}, m = "invokeSuspend")
    static final class G extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96520d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A80.a f96522f;

        /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$G$a, reason: collision with other inner class name */
        static final class C2092a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f96523a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ A80.a f96524b;

            C2092a(a aVar, A80.a aVar2) {
                this.f96523a = aVar;
                this.f96524b = aVar2;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                String str = (String) obj;
                Ns.b.c("FintechWebViewViewModelBase pinPadDeepLinkToOpen collect url=", str, "PINPADERTY");
                if (str != null) {
                    a aVar = this.f96523a;
                    r J02 = aVar.J0(str);
                    L80.a.a("PINPADERTY", "FintechWebViewViewModelBase handleUrlResult=" + J02 + " goSpaPinPadFlow.value=" + aVar.V0().getValue());
                    if (!J02.a()) {
                        x0<K60.a> V02 = aVar.V0();
                        String d11 = this.f96524b.d();
                        if (d11 == null) {
                            d11 = "";
                        }
                        V02.setValue(new K60.a(d11, str, Boolean.TRUE));
                    }
                    x0<String> p11 = aVar.Q0().p();
                    if (p11 != null) {
                        p11.setValue(null);
                    }
                    x0<String> L11 = aVar.Q0().L();
                    if (L11 != null) {
                        L11.setValue(null);
                    }
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(A80.a aVar, kotlin.coroutines.d<? super G> dVar) {
            super(2, dVar);
            this.f96522f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new G(this.f96522f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96520d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = a.this;
                x0<String> p11 = aVar2.Q0().p();
                if (p11 == null) {
                    return Unit.f71690a;
                }
                C2092a c2092a = new C2092a(aVar2, this.f96522f);
                this.f96520d = 1;
                if (p11.collect(c2092a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$onStart$1", f = "FintechWebViewViewModelBase.kt", l = {276}, m = "invokeSuspend")
    static final class H extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96525d;

        /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$H$a, reason: collision with other inner class name */
        static final class C2093a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f96527a;

            C2093a(a aVar) {
                this.f96527a = aVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                K60.a aVar = (K60.a) obj;
                a aVar2 = this.f96527a;
                String c12 = aVar2.c1();
                String b11 = aVar != null ? aVar.b() : null;
                L80.a.a(c12, "handleSpa it?.tabId = " + b11 + " fintechWebViewConfig.tabId=" + aVar2.S0().d());
                if (Intrinsics.d(aVar != null ? aVar.b() : null, aVar2.S0().d())) {
                    aVar2.d1().a().setValue(null);
                    aVar2.f96472K = aVar;
                    aVar2.j1();
                }
                return Unit.f71690a;
            }
        }

        H(kotlin.coroutines.d<? super H> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new H(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((H) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96525d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = a.this;
                x0<K60.a> a11 = aVar2.d1().a();
                C2093a c2093a = new C2093a(aVar2);
                this.f96525d = 1;
                if (a11.collect(c2093a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    /* synthetic */ class I extends C7740w {
        @Override // kotlin.reflect.n
        public final Object get() {
            return ((a) this.receiver).getPermissionState();
        }

        @Override // kotlin.reflect.j
        public final void set(Object obj) {
            ((a) this.receiver).setPermissionState((AbstractC9782b) obj);
        }
    }

    /* synthetic */ class J extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((a) this.receiver).onClosePermission();
            return Unit.f71690a;
        }
    }

    /* synthetic */ class K extends C7719a implements Function1<AbstractC9781a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AbstractC9781a abstractC9781a) {
            ((Ae.w0) this.receiver).tryEmit(abstractC9781a);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$startLoadUrlAnalyticWork$1", f = "FintechWebViewViewModelBase.kt", l = {1174}, m = "invokeSuspend")
    static final class L extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96528d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f96529e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f96530f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        L(long j11, a aVar, kotlin.coroutines.d<? super L> dVar) {
            super(2, dVar);
            this.f96529e = j11;
            this.f96530f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new L(this.f96529e, this.f96530f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((L) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96528d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f96528d = 1;
                if (Y.b(this.f96529e, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            a aVar2 = this.f96530f;
            if (Intrinsics.d(aVar2.f96460E, a.c.f96630a)) {
                k.a(new B50.a(aVar2, 8));
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$a, reason: collision with other inner class name */
    /* synthetic */ class C2094a extends C7735q implements InterfaceC6511n<String, String, Boolean, Unit> {
        @Override // fd.InterfaceC6511n
        public final Unit invoke(String str, String str2, Boolean bool) {
            a aVar = (a) this.receiver;
            aVar.e1(str, bool, str2);
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$b, reason: case insensitive filesystem */
    /* synthetic */ class C9536b extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((a) this.receiver).K1();
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$c, reason: case insensitive filesystem */
    /* synthetic */ class C9537c extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((a) this.receiver).K1();
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$d, reason: case insensitive filesystem */
    /* synthetic */ class C9538d extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a.w0((a) this.receiver);
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$e, reason: case insensitive filesystem */
    /* synthetic */ class C9539e extends C7735q implements Function1<OpenFileRequest, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OpenFileRequest openFileRequest) {
            OpenFileRequest p02 = openFileRequest;
            Intrinsics.checkNotNullParameter(p02, "p0");
            a.v0((a) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$15", f = "FintechWebViewViewModelBase.kt", l = {223}, m = "invokeSuspend")
    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$f, reason: case insensitive filesystem */
    static final class C9540f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96531d;

        /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$f$a, reason: collision with other inner class name */
        static final class C2095a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f96533a;

            C2095a(a aVar) {
                this.f96533a = aVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                if (Intrinsics.d((Boolean) obj, Boolean.TRUE)) {
                    a aVar = this.f96533a;
                    B0 b02 = aVar.f96464G;
                    if (b02 != null) {
                        ((H0) b02).j(null);
                    }
                    B0 b03 = aVar.f96475M;
                    if (b03 != null) {
                        ((H0) b03).j(null);
                    }
                    B0 b04 = aVar.f96462F;
                    if (b04 != null) {
                        ((H0) b04).j(null);
                    }
                }
                return Unit.f71690a;
            }
        }

        C9540f(kotlin.coroutines.d<? super C9540f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C9540f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C9540f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96531d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = a.this;
                Ae.w0<Boolean> X9 = aVar2.Q0().X();
                if (X9 == null) {
                    return Unit.f71690a;
                }
                C2095a c2095a = new C2095a(aVar2);
                this.f96531d = 1;
                if (X9.collect(c2095a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$16", f = "FintechWebViewViewModelBase.kt", l = {233}, m = "invokeSuspend")
    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$g, reason: case insensitive filesystem */
    static final class C9541g extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96534d;

        /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$g$a, reason: collision with other inner class name */
        static final class C2096a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f96536a;

            C2096a(a aVar) {
                this.f96536a = aVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                ((Boolean) obj).getClass();
                a aVar = this.f96536a;
                if (aVar.f96514x != null) {
                    aVar.k1(aVar.f96514x, true);
                    aVar.f96514x = null;
                }
                return Unit.f71690a;
            }
        }

        C9541g(kotlin.coroutines.d<? super C9541g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new C9541g(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C9541g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96534d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = a.this;
                C0 r02 = aVar2.Q0().r0();
                if (r02 == null) {
                    return Unit.f71690a;
                }
                C2096a c2096a = new C2096a(aVar2);
                this.f96534d = 1;
                if (r02.collect(c2096a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$h, reason: case insensitive filesystem */
    /* synthetic */ class C9542h extends C7735q implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((a) this.receiver).F1();
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$i, reason: case insensitive filesystem */
    /* synthetic */ class C9543i extends C7735q implements Function0<Integer> {
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(((a) this.receiver).S0().e());
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$j, reason: case insensitive filesystem */
    /* synthetic */ class C9544j extends C7735q implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((a) this.receiver).S0().d();
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$k, reason: case insensitive filesystem */
    /* synthetic */ class C9545k extends C7735q implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((a) this.receiver).G1();
        }
    }

    /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$l, reason: case insensitive filesystem */
    /* synthetic */ class C9546l extends C7735q implements Function1<String, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            return Boolean.valueOf(a.g0((a) this.receiver, p02));
        }
    }

    /* synthetic */ class m extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a aVar = (a) this.receiver;
            aVar.getClass();
            C10720e0 c10720e0 = C10720e0.f105451a;
            C10727i.d(De.s.f6650a, new f(aVar, null));
        }
    }

    /* synthetic */ class n extends C7735q implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            a.x0((a) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class o extends C7735q implements Function1<Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            a.I0((a) this.receiver, bool.booleanValue());
            return Unit.f71690a;
        }
    }

    /* synthetic */ class p extends C7735q implements Function0<Pair<? extends String, ? extends String>> {
        @Override // kotlin.jvm.functions.Function0
        public final Pair<? extends String, ? extends String> invoke() {
            return a.H0((a) this.receiver);
        }
    }

    public static final class q {

        /* renamed from: a, reason: collision with root package name */
        private final String f96537a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f96538b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f96539c;

        public q(String str, boolean z11, boolean z12) {
            this.f96537a = str;
            this.f96538b = z11;
            this.f96539c = z12;
        }

        public final boolean a() {
            return this.f96539c;
        }

        public final String b() {
            return this.f96537a;
        }

        public final boolean c() {
            return this.f96538b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Intrinsics.d(this.f96537a, qVar.f96537a) && this.f96538b == qVar.f96538b && this.f96539c == qVar.f96539c;
        }

        public final int hashCode() {
            String str = this.f96537a;
            return Boolean.hashCode(this.f96539c) + C3532b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f96538b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FinishActivity(cancelUrl=");
            sb2.append(this.f96537a);
            sb2.append(", success=");
            sb2.append(this.f96538b);
            sb2.append(", activityForResult=");
            return Pk0.a.a(")", sb2, this.f96539c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class r {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f96540a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f96541b;

        public r(boolean z11, boolean z12) {
            this.f96540a = z11;
            this.f96541b = z12;
        }

        public final boolean a() {
            return this.f96540a;
        }

        public final boolean b() {
            return this.f96541b;
        }
    }

    public static final class s {

        /* renamed from: a, reason: collision with root package name */
        private final String f96542a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f96543b;

        public s(String str, boolean z11) {
            this.f96542a = str;
            this.f96543b = z11;
        }

        public final boolean a() {
            return this.f96543b;
        }

        public final String b() {
            return this.f96542a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return Intrinsics.d(this.f96542a, sVar.f96542a) && this.f96543b == sVar.f96543b;
        }

        public final int hashCode() {
            String str = this.f96542a;
            return Boolean.hashCode(this.f96543b) + ((str == null ? 0 : str.hashCode()) * 961);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadUrl(url=");
            sb2.append(this.f96542a);
            sb2.append(", html=null, resetBackStack=");
            return Pk0.a.a(")", sb2, this.f96543b);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$goTab$1", f = "FintechWebViewViewModelBase.kt", l = {}, m = "invokeSuspend")
    static final class t extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f96544d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f96545e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f96546f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Boolean f96547g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, a aVar, String str2, Boolean bool, kotlin.coroutines.d<? super t> dVar) {
            super(2, dVar);
            this.f96544d = str;
            this.f96545e = aVar;
            this.f96546f = str2;
            this.f96547g = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new t(this.f96544d, this.f96545e, this.f96546f, this.f96547g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((t) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            a aVar2 = this.f96545e;
            String d11 = aVar2.S0().d();
            String str = this.f96544d;
            boolean d12 = Intrinsics.d(str, d11);
            Boolean bool = this.f96547g;
            String str2 = this.f96546f;
            if (d12) {
                if (str2 != null) {
                    String d13 = aVar2.S0().d();
                    if (d13 == null) {
                        d13 = "";
                    }
                    aVar2.f96472K = new K60.a(d13, str2, bool);
                    aVar2.j1();
                }
            } else if (str != null) {
                aVar2.Q0().b0(str);
                aVar2.d1().a().setValue(new K60.a(str, str2, bool));
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$handleOnErrorReceivedSpecific$1", f = "FintechWebViewViewModelBase.kt", l = {}, m = "invokeSuspend")
    static final class u extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        u(kotlin.coroutines.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new u(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((u) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            Ae.w0<Boolean> Y11 = a.this.Q0().Y();
            if (Y11 != null) {
                Y11.tryEmit(Boolean.TRUE);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$handlePageLoaded$1", f = "FintechWebViewViewModelBase.kt", l = {1271}, m = "invokeSuspend")
    static final class v extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96549d;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new v(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((v) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96549d;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f96549d = 1;
                if (Y.b(5000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            a.this.Z0().d();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$handlePageLoaded$2", f = "FintechWebViewViewModelBase.kt", l = {}, m = "invokeSuspend")
    static final class w extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        w(kotlin.coroutines.d<? super w> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return a.this.new w(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((w) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            Ae.w0<Boolean> Y11 = a.this.Q0().Y();
            if (Y11 != null) {
                Y11.tryEmit(Boolean.TRUE);
            }
            return Unit.f71690a;
        }
    }

    /* synthetic */ class x extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((a) this.receiver).I1();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$makeUrlLoad$1", f = "FintechWebViewViewModelBase.kt", l = {1130, 1136, 1150}, m = "invokeSuspend")
    static final class y extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96552d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f96553e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a f96554f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f96555g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$makeUrlLoad$1$1", f = "FintechWebViewViewModelBase.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a$y$a, reason: collision with other inner class name */
        static final class C2097a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f96556d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c.a f96557e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f96558f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2097a(a aVar, c.a aVar2, boolean z11, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f96556d = aVar;
                this.f96557e = aVar2;
                this.f96558f = z11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2097a(this.f96556d, this.f96557e, this.f96558f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2097a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                x0<s> X02 = this.f96556d.X0();
                this.f96557e.getClass();
                X02.setValue(new s(null, this.f96558f));
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$makeUrlLoad$1$2", f = "FintechWebViewViewModelBase.kt", l = {}, m = "invokeSuspend")
        static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f96559d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f96560e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f96561f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, kotlin.coroutines.d dVar, a aVar, boolean z11) {
                super(2, dVar);
                this.f96559d = aVar;
                this.f96560e = str;
                this.f96561f = z11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f96560e, dVar, this.f96559d, this.f96561f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                this.f96559d.X0().setValue(new s(this.f96560e, this.f96561f));
                return Unit.f71690a;
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$makeUrlLoad$1$ssoResult$1", f = "FintechWebViewViewModelBase.kt", l = {1131}, m = "invokeSuspend")
        static final class c extends j implements Function2<M, kotlin.coroutines.d<? super D30.c>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96562d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f96563e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f96564f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a aVar, String str, kotlin.coroutines.d<? super c> dVar) {
                super(2, dVar);
                this.f96563e = aVar;
                this.f96564f = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new c(this.f96563e, this.f96564f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super D30.c> dVar) {
                return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96562d;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return obj;
                }
                Sc.s.b(obj);
                A30.m P02 = this.f96563e.P0();
                this.f96562d = 1;
                Object F11 = P02.F(this.f96564f, this);
                return F11 == aVar ? aVar : F11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str, kotlin.coroutines.d dVar, a aVar, boolean z11) {
            super(2, dVar);
            this.f96553e = str;
            this.f96554f = aVar;
            this.f96555g = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new y(this.f96553e, dVar, this.f96554f, this.f96555g);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((y) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            if (xe.C10727i.f(r1, r2, r8) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        
            if (xe.C10727i.f(r9, r1, r8) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x003b, code lost:
        
            if (r9 == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96552d;
            String str = this.f96553e;
            a aVar2 = this.f96554f;
            if (i11 == 0) {
                Sc.s.b(obj);
                C10720e0 c10720e0 = C10720e0.f105451a;
                He.b bVar = He.b.f10879b;
                c cVar = new c(aVar2, str, null);
                this.f96552d = 1;
                obj = C10727i.f(bVar, cVar, this);
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        Sc.s.b(obj);
                        aVar2.i1("", false);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
            }
            D30.c cVar2 = (D30.c) obj;
            Log.d("SSO20", "actuallyLoad tryAuthDomain " + str + " ssoResult=" + cVar2);
            boolean z11 = cVar2 instanceof c.a;
            boolean z12 = this.f96555g;
            if (z11) {
                C10720e0 c10720e02 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                C2097a c2097a = new C2097a(aVar2, (c.a) cVar2, z12, null);
                this.f96552d = 2;
            } else {
                if (!Intrinsics.d(cVar2, c.C0131c.f5775a) && !Intrinsics.d(cVar2, c.b.f5774a)) {
                    throw new Sc.o();
                }
                C10720e0 c10720e03 = C10720e0.f105451a;
                L0 l03 = De.s.f6650a;
                b bVar2 = new b(str, null, aVar2, z12);
                this.f96552d = 3;
            }
            return aVar;
        }
    }

    /* synthetic */ class z extends C7735q implements Function1<e40.d, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(e40.d dVar) {
            e40.d p02 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((a) this.receiver).H1(p02);
            return Unit.f71690a;
        }
    }

    public a(@NotNull v30.d fintechAntiFraudInteractor, @NotNull InterfaceC6083a exchanger, @NotNull S60.a fintechMetrixInteractor, @NotNull A30.m fintechAuthInteractor, @NotNull K40.a cbottomDisplay, @NotNull Context context, @NotNull r90.f permissionsDelegate, @NotNull Q90.c featureToggles, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull InterfaceC8075b webPerfAnalyticInteractor, @NotNull InterfaceC7863a pageLoadDelayAnalyticInteractor, @NotNull C10863b interceptorsFabric, @NotNull O30.b fintechLibType, @NotNull C10448a webBankInteractor, @NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull NativeBridgeConfigurator nativeBridgeConfigurator, @NotNull Z30.a digRoubleApi, @NotNull d70.d offlineManager, @NotNull h90.f notificationInteractor) {
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(fintechMetrixInteractor, "fintechMetrixInteractor");
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        Intrinsics.checkNotNullParameter(cbottomDisplay, "cbottomDisplay");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionsDelegate, "permissionsDelegate");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(webPerfAnalyticInteractor, "webPerfAnalyticInteractor");
        Intrinsics.checkNotNullParameter(pageLoadDelayAnalyticInteractor, "pageLoadDelayAnalyticInteractor");
        Intrinsics.checkNotNullParameter(interceptorsFabric, "interceptorsFabric");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(webBankInteractor, "webBankInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(nativeBridgeConfigurator, "nativeBridgeConfigurator");
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        Intrinsics.checkNotNullParameter(notificationInteractor, "notificationInteractor");
        this.f96485a = fintechAntiFraudInteractor;
        this.f96486b = exchanger;
        this.f96487c = fintechMetrixInteractor;
        this.f96488d = fintechAuthInteractor;
        this.f96489e = cbottomDisplay;
        this.f96490f = context;
        this.f96491g = permissionsDelegate;
        this.f96492h = featureToggles;
        this.f96493i = fintechAnalyticInteractor;
        this.f96494j = webPerfAnalyticInteractor;
        this.f96495k = pageLoadDelayAnalyticInteractor;
        this.f96496l = interceptorsFabric;
        this.f96497m = fintechLibType;
        this.f96498n = webBankInteractor;
        this.f96499o = fintechNavigation;
        this.f96500p = fintechSettings;
        this.f96501q = nativeBridgeConfigurator;
        this.f96502r = digRoubleApi;
        this.f96504s = offlineManager;
        this.f96506t = notificationInteractor;
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f96508u = Sc.k.a(nVar, new F90.d(this, 8));
        this.f96510v = true;
        this.f96518z = 2;
        this.f96452A = fintechSettings.s();
        this.f96460E = a.c.f96630a;
        this.f96478P = true;
        this.f96481S = Sc.k.a(nVar, new K70.c(this, 5));
        this.f96513w0 = "";
        this.f96517y0 = O0.a(null);
        this.f96519z0 = O0.a(null);
        this.f96453A0 = O0.a(null);
        this.f96455B0 = O0.a(null);
        this.f96457C0 = O0.a(null);
        EnumC11113a enumC11113a = EnumC11113a.DROP_OLDEST;
        this.f96459D0 = E0.a(0, 1, enumC11113a);
        this.f96461E0 = E0.a(0, 1, enumC11113a);
        this.f96463F0 = O0.a(null);
        this.f96467H0 = "FintechWebViewViewModelBase";
        this.f96471J0 = O0.a(null);
        this.f96473K0 = E0.a(0, 1, EnumC11113a.DROP_LATEST);
        permissionsDelegate.s(this);
        C9542h c9542h = new C9542h(0, this, a.class, "provideAppConfigId", "provideAppConfigId()Ljava/lang/String;", 0);
        C9543i c9543i = new C9543i(0, this, a.class, "provideTabIndex", "provideTabIndex()Ljava/lang/Integer;", 0);
        C9544j c9544j = new C9544j(0, this, a.class, "provideTabId", "provideTabId()Ljava/lang/String;", 0);
        C9545k c9545k = new C9545k(0, this, a.class, "provideUUID", "provideUUID()Ljava/lang/String;", 0);
        C9546l c9546l = new C9546l(1, this, a.class, "attemptNativeNavigation", "attemptNativeNavigation(Ljava/lang/String;)Z", 0);
        m mVar = new m(0, this, a.class, "navigationWindowClose", "navigationWindowClose()V", 0);
        n nVar2 = new n(1, this, a.class, "pageLoaded", "pageLoaded(Ljava/lang/String;)V", 0);
        C6788a a11 = androidx.lifecycle.x0.a(this);
        o oVar = new o(1, this, a.class, "tabsVisibilityCallback", "tabsVisibilityCallback(Z)V", 0);
        notificationInteractor.getClass();
        nativeBridgeConfigurator.b0(c9542h, c9543i, c9544j, c9545k, c9546l, mVar, nVar2, permissionsDelegate, oVar, a11, new p(0, this, a.class, "tabInfoCallback", "tabInfoCallback()Lkotlin/Pair;", 0), new C2094a(3, this, a.class, "goTab", "goTab(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", 0), new C9536b(0, this, a.class, "reloadInitialUrl", "reloadInitialUrl()V", 0), new C9537c(0, this, a.class, "reloadInitialUrl", "reloadInitialUrl()V", 0), new C9538d(0, this, a.class, "openGalleryRequest", "openGalleryRequest()V", 0), new C9539e(1, this, a.class, "openFileRequest", "openFileRequest(Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/open/file/models/OpenFileRequest;)V", 0));
        this.f96462F = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C9540f(null), 3);
        this.f96464G = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new C9541g(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String F1() {
        return S0().b();
    }

    public static final Pair H0(a aVar) {
        aVar.f96493i.k1(aVar.F1());
        return new Pair(aVar.S0().b(), aVar.S0().f());
    }

    public static final void I0(a aVar, boolean z11) {
        L80.a.a(aVar.c1(), "tabsVisibilityCallback hidden = " + z11);
        aVar.f96461E0.tryEmit(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r J0(String str) {
        Object obj;
        L80.a.a(c1(), "urlFlow canHandleReceivedUrlInternal url=" + str + " isStarted=" + this.f96456C);
        ComponentCallbacks2 c11 = this.f96499o.c();
        I30.d dVar = c11 instanceof I30.d ? (I30.d) c11 : null;
        boolean z11 = true;
        if (dVar != null && dVar.getF72991j()) {
            return new r(false, false);
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(this.f96500p.f());
        Iterator<T> it = this.f96496l.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Intrinsics.f(parse);
            Intrinsics.f(parse2);
            if (((InterfaceC10862a) obj).a(str, parse, parse2)) {
                break;
            }
        }
        InterfaceC10862a interfaceC10862a = (InterfaceC10862a) obj;
        if (interfaceC10862a != null) {
            Intrinsics.f(parse);
            Intrinsics.f(parse2);
            interfaceC10862a.b(str, parse, parse2);
        } else {
            z11 = false;
        }
        L80.a.a(c1(), "url=" + str + " interceptor=" + (interfaceC10862a != null ? interfaceC10862a.getType() : null));
        return new r(z11, interfaceC10862a != null ? interfaceC10862a.c() : false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Sc.j, java.lang.Object] */
    private final void Q1(String str) {
        d70.d dVar = this.f96504s;
        long a11 = dVar.a();
        if (dVar.i() && a11 > 0) {
            B0 b02 = this.f96468I;
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f96468I = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new L(a11, this, null), 3);
        }
        if (((S90.a) this.f96481S.getValue()).b().isEnabled()) {
            this.f96495k.c(str, F1());
        }
        this.f96494j.c(str);
        this.f96493i.K1(str, S0().b());
    }

    public static Unit d0(a aVar, e40.d urlWrap) {
        Intrinsics.checkNotNullParameter(urlWrap, "urlWrap");
        L80.a.a(aVar.c1(), "urlWrap.url = " + urlWrap.a());
        String a11 = urlWrap.a();
        String d11 = aVar.S0().d();
        if (d11 == null) {
            d11 = "";
        }
        aVar.f96472K = new K60.a(d11, a11, null);
        aVar.j1();
        return Unit.f71690a;
    }

    public static S90.a e0(a aVar) {
        return aVar.f96492h.q(S90.c.MOB_PAGES_LOAD_TICK_LOGS);
    }

    public static String f0(a aVar) {
        return Nk.a.b("FintechWebViewViewModelBase/", aVar.f96467H0);
    }

    public static final boolean g0(a aVar, String str) {
        if (!aVar.f96458D) {
            return true;
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        r rVar = (r) C10727i.d(De.s.f6650a, new b(aVar, str, null));
        aVar.f96493i.c0(str, aVar.F1(), rVar.b());
        String c12 = aVar.c1();
        boolean a11 = rVar.a();
        boolean b11 = rVar.b();
        StringBuilder d11 = K1.G.d("urlFlow attemptNativeNavigation handled=", " url=", str, " wasActuallyNavigated=", a11);
        d11.append(b11);
        L80.a.a(c12, d11.toString());
        return rVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState() {
        ScreenStateV20 screenStateV20;
        ru.ozon.fintech.network.models.a aVar = this.f96460E;
        x0<ScreenStateV20> x0Var = this.f96457C0;
        boolean z11 = aVar instanceof a.c;
        if (z11 && this.f96510v) {
            screenStateV20 = ScreenStateV20.INSTANCE.getProgress(500L, false);
        } else {
            if (!z11 || !this.f96483Y) {
                if (aVar instanceof a.C2102a) {
                    this.f96483Y = true;
                    screenStateV20 = ScreenStateV20.INSTANCE.getError(new x(0, this, a.class, "recreateAll", "recreateAll()V", 0), this.f96490f, ((a.C2102a) aVar).a());
                } else {
                    this.f96483Y = false;
                    screenStateV20 = null;
                }
                x0Var.setValue(screenStateV20);
            }
            screenStateV20 = ScreenStateV20.INSTANCE.getProgress(0L, true);
        }
        x0Var.setValue(screenStateV20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1(String str, boolean z11) {
        L80.a.a("TABSFLOW", "handlePageLoaded: url = " + str + " tabId=" + S0().d());
        this.f96494j.g(str);
        this.f96495k.e(str, F1(), z11);
        this.f96474L = true;
        ru.ozon.fintech.network.models.a aVar = this.f96460E;
        if (aVar instanceof a.c) {
            this.f96510v = false;
        }
        if (!(aVar instanceof a.C2102a)) {
            this.f96460E = a.b.f96629a;
            if (!this.f96500p.isStandAloneIntegration()) {
                this.f96487c.a(new a.g(System.currentTimeMillis()));
            }
        }
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new v(null), 2);
        handleState();
        C10727i.c(androidx.lifecycle.x0.a(this), De.s.f6650a, null, new w(null), 2);
        this.f96501q.U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1() {
        K60.a aVar = this.f96472K;
        L80.a.a(c1(), "handleSpa spaToGoLocal=" + aVar + " initialUrlLoaded=" + this.f96474L + " tabId=" + S0().d());
        if (aVar == null || !this.f96474L) {
            return;
        }
        this.f96472K = null;
        this.f96519z0.setValue(aVar);
    }

    private final void n1(String str, boolean z11) {
        x0<s> x0Var = this.f96517y0;
        x0Var.setValue(null);
        if (Tl.a.f(this.f96492h, S90.c.MOB_SSO20)) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new y(str, null, this, z11), 3);
        } else {
            x0Var.setValue(new s(str, z11));
        }
    }

    public static final void u0(a aVar, AppConfig appConfig) {
        AuthPinpad authPinpad;
        AuthPinpad authPinpad2;
        AuthPinpad authPinpad3;
        S80.b bVar = aVar.f96499o;
        String e02 = bVar.e0();
        boolean d11 = Intrinsics.d(e02, aVar.S0().d());
        Q90.c cVar = aVar.f96492h;
        if (d11) {
            AppConfig n11 = cVar.n();
            boolean z11 = false;
            if (n11 != null && (authPinpad3 = n11.getAuthPinpad()) != null && authPinpad3.getShowPinpad()) {
                z11 = true;
            }
            aVar.f96501q.H().c(!z11);
        }
        A30.m fintechAuthInteractor = aVar.f96488d;
        Intrinsics.checkNotNullParameter(fintechAuthInteractor, "fintechAuthInteractor");
        ru.ozon.fintech.settings.domain.a fintechSettings = aVar.f96500p;
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        if ((!fintechAuthInteractor.v() && fintechSettings.getNeedOzonId() && fintechSettings.isStandAloneIntegration()) || (fintechSettings.q() && fintechSettings.isStandAloneIntegration() && !fintechSettings.getNeedOzonId())) {
            if (!Intrinsics.d(e02, aVar.S0().d())) {
                aVar.f96514x = aVar.S0().f();
                return;
            }
            String c11 = aVar.S0().c();
            if (c11 == null && (c11 = aVar.f96480R) == null) {
                c11 = aVar.S0().f();
            }
            aVar.f96514x = c11;
            return;
        }
        if (!Intrinsics.d(e02, aVar.S0().d())) {
            Ns.b.c("actuallyLoad NOT CURRENT_TAB_ID ", aVar.S0().d(), "TABSFLOW");
            if (aVar.f96484Z) {
                aVar.D1(aVar.S0().f());
                return;
            } else {
                aVar.f96514x = aVar.S0().f();
                return;
            }
        }
        String c12 = aVar.S0().c();
        if (c12 == null && (c12 = aVar.f96480R) == null) {
            c12 = aVar.S0().f();
        }
        String c13 = aVar.c1();
        x0<String> L11 = bVar.L();
        String value = L11 != null ? L11.getValue() : null;
        String f7 = aVar.S0().f();
        StringBuilder d12 = C3660k.d("actuallyLoad url=", c12, " deep=", value, " web=");
        d12.append(f7);
        L80.a.a(c13, d12.toString());
        L80.a.a("TABSFLOW", "actuallyLoad CURRENT_TAB_ID " + aVar.S0().d() + " url=" + c12);
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        d70.d dVar = aVar.f96504s;
        boolean h11 = dVar.h();
        boolean d13 = Intrinsics.d(appConfig.getSource(), AppConfig.CHO);
        AppConfig n12 = cVar.n();
        Boolean valueOf = (n12 == null || (authPinpad2 = n12.getAuthPinpad()) == null) ? null : Boolean.valueOf(authPinpad2.getShowPinpad());
        StringBuilder d14 = Lh.a.d("mayBeNativePinPad offlineManager.isOfflineMode()=", " appConfig.source == AppConfig.CHO=", "featureToggles.appConfig?.authPinpad?.showPinpad=", h11, d13);
        d14.append(valueOf);
        L80.a.a("PINPADER_OFF", d14.toString());
        AppConfig n13 = cVar.n();
        if (n13 != null && (authPinpad = n13.getAuthPinpad()) != null && authPinpad.getShowPinpad() && Intrinsics.d(appConfig.getSource(), AppConfig.CHO) && !dVar.h() && !bVar.N0()) {
            if (!fintechSettings.isStandAloneIntegration()) {
                aVar.f96487c.a(new a.g(System.currentTimeMillis()));
            }
            L80.a.a("PINPADER_PERF", System.currentTimeMillis() + " mayBeNativePinPad");
            Ae.w0<Boolean> S02 = bVar.S0();
            if (S02 != null) {
                S02.tryEmit(Boolean.TRUE);
            }
            bVar.S();
        }
        C10727i.c(androidx.lifecycle.x0.a(aVar), null, null, new g(aVar, c12, null), 3);
    }

    public static final void v0(a aVar, OpenFileRequest openFileRequest) {
        Function1<? super OpenFileRequest, Unit> function1 = aVar.f96507t0;
        if (function1 != null) {
            function1.invoke(openFileRequest);
        }
    }

    public static final void w0(a aVar) {
        Function0<Unit> function0 = aVar.f96505s0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void x0(a aVar, String str) {
        L80.a.a(aVar.c1(), "pageLoaded url=" + str + " tabId=" + aVar.S0().d());
        S60.a aVar2 = aVar.f96487c;
        if (aVar2.c(str)) {
            aVar2.a(new a.e(System.currentTimeMillis(), false, str));
        }
        aVar.i1(str, true);
        C6788a a11 = androidx.lifecycle.x0.a(aVar);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, De.s.f6650a, null, new h(aVar, null), 2);
    }

    public final void A1() {
        Ae.w0<Boolean> e11 = this.f96499o.e();
        if (e11 != null) {
            e11.tryEmit(Boolean.TRUE);
        }
        if (this.f96514x == null || S0().e() == 0) {
            return;
        }
        k1(this.f96514x, true);
        this.f96514x = null;
    }

    public final void B1(String str) {
        Ns.b.c("onWebTitleChanged title = ", str, c1());
        if (str != null) {
            handleState();
        }
    }

    public final void C1(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Iterator it = this.f96488d.s().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(webView);
        }
    }

    public final void D1(String str) {
        d70.d dVar = this.f96504s;
        if (!dVar.i()) {
            k1(str, true);
        } else if (dVar.isConnected() && !dVar.h()) {
            k1(str, true);
        } else {
            g1();
            dVar.g(this.f96510v, d.a.BEFORE_LOAD_URL);
        }
    }

    public final boolean E1() {
        return this.f96482X;
    }

    @NotNull
    public final String G1() {
        return this.f96513w0;
    }

    public final void H1(@NotNull e40.d urlWrap) {
        Intrinsics.checkNotNullParameter(urlWrap, "urlWrap");
        InterfaceC6083a interfaceC6083a = this.f96486b;
        interfaceC6083a.d(e40.d.class);
        this.f96466H = true;
        interfaceC6083a.push(urlWrap);
        L80.a.a(c1(), "pushUrlWrapToExchangerAndPop POP");
        this.f96499o.pop();
    }

    public final void I1() {
        C0 J11 = this.f96499o.J();
        if (J11 != null) {
            J11.tryEmit(Boolean.TRUE);
        }
    }

    public final void J1(@NotNull FintechWebView fintechWebView) {
        Intrinsics.checkNotNullParameter(fintechWebView, "fintechWebView");
        this.f96515x0 = new WeakReference<>(fintechWebView);
        this.f96499o.h(new WeakReference<>(fintechWebView.getWebView()));
    }

    public final boolean K0(String str) {
        AuthPinpad authPinpad;
        AppConfig n11 = this.f96492h.n();
        if ((n11 != null && (authPinpad = n11.getAuthPinpad()) != null && authPinpad.getShowPinpad()) || !Intrinsics.d(str, S0().f())) {
            return true;
        }
        x0<String> L11 = this.f96499o.L();
        if (L11 == null) {
            return false;
        }
        L11.setValue(null);
        return false;
    }

    public final void K1() {
        String f7 = S0().f();
        if (f7 == null || this.f96477O) {
            return;
        }
        this.f96460E = a.c.f96630a;
        handleState();
        Q1(f7);
        n1(f7, true);
    }

    public final void L0(String str, boolean z11, boolean z12) {
        InterfaceC2395h<q> interfaceC2395h = this.f96455B0;
        Intrinsics.g(interfaceC2395h, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase.FinishActivity?>");
        ((x0) interfaceC2395h).setValue(new q(str, z11, z12));
    }

    public final void L1(boolean z11) {
        int i11;
        if (!z11 || (i11 = this.f96516y) >= this.f96518z) {
            return;
        }
        this.f96516y = i11 + 1;
        x0<Unit> x0Var = this.f96463F0;
        Unit unit = Unit.f71690a;
        x0Var.setValue(unit);
        x0Var.tryEmit(unit);
        this.f96493i.A(this.f96512w, F1());
    }

    @NotNull
    public final InterfaceC2395h<q> M0() {
        return this.f96455B0;
    }

    public final void M1() {
        this.f96519z0.setValue(null);
    }

    @NotNull
    public final Q90.c N0() {
        return this.f96492h;
    }

    public final void N1() {
        this.f96517y0.setValue(null);
    }

    @NotNull
    public final InterfaceC6618a O0() {
        return this.f96493i;
    }

    public final void O1() {
        this.f96463F0.setValue(null);
    }

    @NotNull
    public final A30.m P0() {
        return this.f96488d;
    }

    public final void P1() {
        K40.a aVar = this.f96489e;
        K40.b creator = aVar.creator();
        String string = this.f96490f.getString(R.string.fintech_webbank_file_chooser_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        aVar.g(K40.b.b(creator, string, 0, 30), CbottomType.SNACK, this.f96513w0, null);
    }

    @NotNull
    public final S80.b Q0() {
        return this.f96499o;
    }

    @NotNull
    public final ru.ozon.fintech.settings.domain.a R0() {
        return this.f96500p;
    }

    @NotNull
    public final A80.a S0() {
        A80.a aVar = this.f96465G0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("fintechWebViewConfig");
        throw null;
    }

    @NotNull
    public final C0 T0() {
        return this.f96461E0;
    }

    @NotNull
    public final x0<K60.a> U0() {
        return this.f96519z0;
    }

    @NotNull
    public final x0<K60.a> V0() {
        return this.f96453A0;
    }

    @NotNull
    public final C0 W0() {
        return this.f96459D0;
    }

    @NotNull
    public final x0<s> X0() {
        return this.f96517y0;
    }

    @NotNull
    public final NativeBridgeConfigurator Y0() {
        return this.f96501q;
    }

    @NotNull
    public final d70.d Z0() {
        return this.f96504s;
    }

    @NotNull
    public final x0<Unit> a1() {
        return this.f96463F0;
    }

    @NotNull
    public final x0<ScreenStateV20> b1() {
        return this.f96457C0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final String c1() {
        return (String) this.f96508u.getValue();
    }

    @NotNull
    public final C10448a d1() {
        return this.f96498n;
    }

    public final void e1(String str, Boolean bool, String str2) {
        List<AppConfigTab> tabs;
        if (str == null) {
            return;
        }
        AppConfig n11 = this.f96492h.n();
        int i11 = 0;
        if (n11 != null && (tabs = n11.getTabs()) != null) {
            Iterator<AppConfigTab> it = tabs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (Intrinsics.d(it.next().getId(), str)) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        String q02 = this.f96499o.q0(i11);
        L80.a.a(c1(), "goTab index=" + q02 + " appConfigTabId=" + str);
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, De.s.f6650a, null, new t(q02, this, str2, bool, null), 2);
    }

    public final void f1() {
        String a11;
        S80.b bVar = this.f96499o;
        if (bVar.Q()) {
            this.f96470J = null;
            return;
        }
        e40.d dVar = this.f96470J;
        if (dVar != null && (a11 = dVar.a()) != null) {
            this.f96493i.T0(F1(), a11);
        }
        e40.d dVar2 = this.f96470J;
        L80.a.a("TABSFLOW", "handleDeepLink initialUrlLoaded=" + this.f96474L + " deepLinkUrl=" + dVar2 + " tabId=" + S0().d());
        if (this.f96474L) {
            if (dVar2 == null) {
                x0<String> L11 = bVar.L();
                if (L11 != null) {
                    Intrinsics.checkNotNullParameter(L11, "<this>");
                    if (L11.getValue() != null) {
                        String value = L11.getValue();
                        L11.tryEmit(null);
                        L11.tryEmit(value);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f96470J = null;
            boolean a12 = J0(dVar2.a()).a();
            String a13 = dVar2.a();
            String d11 = S0().d();
            StringBuilder d12 = K1.G.d("handleDeepLink handled ", " deepLinkLocal.url=", a13, " tabId=", a12);
            d12.append(d11);
            L80.a.a("TABSFLOW", d12.toString());
            if (a12) {
                return;
            }
            String a14 = dVar2.a();
            String d13 = S0().d();
            if (d13 == null) {
                d13 = "";
            }
            this.f96472K = new K60.a(d13, a14, null);
            j1();
        }
    }

    public final void g1() {
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, De.s.f6650a, null, new u(null), 2);
    }

    @NotNull
    public final Ae.w0<AbstractC9781a> getPermissionAction() {
        return this.f96473K0;
    }

    public final AbstractC9782b getPermissionState() {
        return this.f96469I0;
    }

    public final void h1(@NotNull List<? extends Uri> uris, @NotNull q60.b type) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f96501q.L(uris, type);
    }

    public final void k1(String str, boolean z11) {
        if (((str == null || str.equals(this.f96512w)) && (str == null || !z11)) || this.f96477O) {
            return;
        }
        this.f96499o.I0(true);
        this.f96458D = false;
        this.f96484Z = true;
        this.f96512w = str;
        NativeBridgeConfigurator nativeBridgeConfigurator = this.f96501q;
        nativeBridgeConfigurator.c0(str);
        if (nativeBridgeConfigurator.C(str)) {
            nativeBridgeConfigurator.H().d(true);
        }
        this.f96460E = a.c.f96630a;
        handleState();
        Q1(str);
        nativeBridgeConfigurator.T(str);
        n1(str, z11);
        if (!this.f96452A || this.f96454B) {
            return;
        }
        this.f96454B = true;
        L1(true);
    }

    public final boolean l1() {
        int i11 = Q90.c.f23057s;
        return c.a.d(S90.c.MOB_LAZY_PAYMENT_ADDITIONAL_WEBVIEW_CREATION, this.f96497m).b().isEnabled();
    }

    public final boolean m1() {
        return this.f96456C;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Sc.j, java.lang.Object] */
    public final void o1(@NotNull A80.a fintechWebViewConfig, boolean z11, @NotNull String uniqueUuid, @NotNull Function0<Unit> openGalleryPicker, @NotNull Function1<? super OpenFileRequest, Unit> openFilePicker) {
        String value;
        Intrinsics.checkNotNullParameter(fintechWebViewConfig, "fintechWebViewConfig");
        Intrinsics.checkNotNullParameter(uniqueUuid, "uniqueUuid");
        Intrinsics.checkNotNullParameter(openGalleryPicker, "openGalleryPicker");
        Intrinsics.checkNotNullParameter(openFilePicker, "openFilePicker");
        this.f96482X = z11;
        this.f96505s0 = openGalleryPicker;
        this.f96507t0 = openFilePicker;
        ?? r12 = this.f96481S;
        if (((S90.a) r12.getValue()).b().isEnabled()) {
            this.f96495k.d(androidx.lifecycle.x0.a(this), ((S90.a) r12.getValue()).b().getStringArrayData());
        }
        this.f96513w0 = uniqueUuid;
        Intrinsics.checkNotNullParameter(fintechWebViewConfig, "<set-?>");
        this.f96465G0 = fintechWebViewConfig;
        this.f96496l.c(androidx.lifecycle.x0.a(this), this.f96501q, new z(1, this, a.class, "pushUrlWrapToExchangerAndPop", "pushUrlWrapToExchangerAndPop(Lru/ozon/fintech/exchanger/datapass/UrlWrap;)V", 0), new A(0, this, a.class, "provideTabId", "provideTabId()Ljava/lang/String;", 0), new C(0, this, a.class, "provideAppConfigId", "provideAppConfigId()Ljava/lang/String;", 0), new D(3, this, a.class, "doCloseActivity", "doCloseActivity(Ljava/lang/String;ZZ)V", 0), new B(0, this, a.class, "provideActivityForResult", "provideActivityForResult()Z", 0), new E(0, this, a.class, "isStartedNow", "isStartedNow()Z", 0), new F(2, this, a.class, "handleUrl", "handleUrl(Ljava/lang/String;Z)V", 0));
        L80.a.a(c1(), "configuratorId=$" + fintechWebViewConfig.d() + " deepLinkUrl=" + this.f96470J);
        Ns.b.c("viewmodel onCreate configuratorId=$", fintechWebViewConfig.d(), "PINPADERFLOW");
        handleState();
        this.f96501q.R();
        S80.b bVar = this.f96499o;
        x0<String> L11 = bVar.L();
        String value2 = L11 != null ? L11.getValue() : null;
        x0<String> L12 = bVar.L();
        Uri e11 = (L12 == null || (value = L12.getValue()) == null) ? null : H30.x.e(value);
        ru.ozon.fintech.settings.domain.a aVar = this.f96500p;
        Uri e12 = H30.x.e(aVar.f());
        Uri e13 = H30.x.e(aVar.u() ? "https://ozon-stg.ozonru.me" : "https://ozon.ru");
        if ((value2 == null || !kotlin.text.h.e0(value2, "https://localhost", false)) && (value2 == null || !kotlin.text.h.e0(value2, "http://localhost", false))) {
            if ((e12 != null ? H30.x.d(e12) : null) != null) {
                if ((e11 != null ? H30.x.d(e11) : null) != null && H30.x.a(e12) != null && H30.x.a(e11) != null && Intrinsics.d(H30.x.d(e12), H30.x.d(e11)) && Intrinsics.d(H30.x.a(e12), H30.x.a(e11))) {
                    x0<String> L13 = bVar.L();
                    if (L13 != null) {
                        L13.setValue(null);
                    }
                }
            }
            if ((e12 != null ? H30.x.d(e12) : null) != null) {
                if ((e11 != null ? H30.x.d(e11) : null) != null && H30.x.a(e12) != null && H30.x.a(e11) != null && Intrinsics.d(H30.x.d(e12), H30.x.d(e11)) && Intrinsics.d(H30.x.a(e12), H30.x.a(e11))) {
                    x0<String> L14 = bVar.L();
                    if (L14 != null) {
                        L14.setValue(null);
                    }
                }
            }
            if ((e13 != null ? H30.x.d(e13) : null) != null) {
                if ((e11 != null ? H30.x.d(e11) : null) != null && H30.x.a(e13) != null && H30.x.a(e11) != null && Intrinsics.d(H30.x.d(e13), H30.x.d(e11)) && Intrinsics.d(H30.x.a(e13), H30.x.a(e11))) {
                    x0<String> L15 = bVar.L();
                    if (L15 != null) {
                        L15.setValue(null);
                    }
                }
            }
            value2 = null;
        } else {
            x0<String> L16 = bVar.L();
            if (L16 != null) {
                L16.setValue(null);
            }
        }
        this.f96480R = value2;
        B0 b02 = this.f96511v0;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        L80.a.a("TABSFLOW", "handleOnCreateSpecific fintechWebViewConfig=" + S0().d() + " deepLinkOnCreate=" + this.f96480R);
        if (S0().f() != null) {
            k1(S0().f(), false);
        } else {
            this.f96511v0 = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new c(this, null), 3);
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new G(fintechWebViewConfig, null), 3);
    }

    public final void onActivityResult(int i11, int i12, Intent intent) {
        this.f96501q.P(i11, i12, intent, this.f96456C);
    }

    public final void onClosePermission() {
        permissionUpdated(null);
        this.f96501q.Q();
    }

    public final void onDestroy() {
        this.f96501q.S();
        N.c(androidx.lifecycle.x0.a(this), null);
    }

    public final void onPermissionResumeOrResult(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f96501q.V((androidx.fragment.app.r) activity);
    }

    public final void onStart() {
        this.f96456C = true;
        this.f96476N = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new H(null), 3);
        this.f96475M = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new e(this, null), 3);
        C6788a a11 = androidx.lifecycle.x0.a(this);
        Ca.s sVar = new Ca.s(this, 3);
        InterfaceC6083a exchanger = this.f96486b;
        exchanger.e(e40.d.class, a11, false, sVar);
        String uuid = this.f96513w0;
        C6788a coroutineScope = androidx.lifecycle.x0.a(this);
        final I permissionStateProvider = new I(this, a.class, "permissionState", "getPermissionState()Lru/ozon/fintech/permissions/models/PermissionState;", 0);
        final J onClosePermission = new J(0, this, a.class, "onClosePermission", "onClosePermission()V", 0);
        final K permissionEmit = new K(1, this.f96473K0, Ae.w0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8);
        this.f96491g.getClass();
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(permissionStateProvider, "permissionStateProvider");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(onClosePermission, "onClosePermission");
        Intrinsics.checkNotNullParameter(permissionEmit, "permissionEmit");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        ActionResult2.INSTANCE.getClass();
        exchanger.b(ActionResult2.Companion.a(uuid + "PERM_ID"), coroutineScope, false, new Function1() { // from class: r90.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List<InterfaceC9636e> a12;
                ActionResult2 result = (ActionResult2) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean d11 = Intrinsics.d(result.getType(), ActionResult2UI.Type.DISMISSED.toString());
                Function0 function0 = Function0.this;
                if (d11) {
                    function0.invoke();
                } else {
                    boolean d12 = Intrinsics.d(result.getWidgetId(), "PERM_GO_RUNTIME");
                    Function0 function02 = permissionStateProvider;
                    Function1 function1 = permissionEmit;
                    if (d12) {
                        AbstractC9782b abstractC9782b = (AbstractC9782b) function02.invoke();
                        if (abstractC9782b != null && (a12 = abstractC9782b.a()) != null) {
                            function1.invoke(new AbstractC9781a.b(a12));
                        }
                    } else if (Intrinsics.d(result.getWidgetId(), "PERM_GO_SETTINGS") && (function02.invoke() instanceof AbstractC9782b.d)) {
                        Object invoke = function02.invoke();
                        AbstractC9782b.d dVar = invoke instanceof AbstractC9782b.d ? (AbstractC9782b.d) invoke : null;
                        if (dVar != null) {
                            function1.invoke(new AbstractC9781a.C2181a(dVar.e()));
                        }
                    } else if (Intrinsics.d(result.getWidgetId(), "perm_close")) {
                        function0.invoke();
                    }
                }
                return Unit.f71690a;
            }
        });
        this.f96501q.W();
    }

    public final void onStop() {
        this.f96456C = false;
        B0 b02 = this.f96476N;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        B0 b03 = this.f96475M;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
        boolean z11 = this.f96466H;
        InterfaceC6083a exchanger = this.f96486b;
        if (!z11) {
            exchanger.d(e40.d.class);
        }
        String uuid = this.f96513w0;
        this.f96491g.getClass();
        Intrinsics.checkNotNullParameter(exchanger, "exchanger");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        ActionResult2.INSTANCE.getClass();
        exchanger.a(ActionResult2.Companion.a(uuid + "PERM_ID"));
        this.f96501q.X();
    }

    public final void p1(@NotNull FintechWebView.b type) {
        Intrinsics.checkNotNullParameter(type, "type");
        L80.a.a(c1(), "WebView error received, type: " + type);
        this.f96499o.o0();
        this.f96460E = new a.C2102a(type.a());
        this.f96493i.m(type.a().getMessage(), C4001c.b(type.a()));
        this.f96477O = true;
        handleState();
    }

    @Override // r90.f.a
    public final void permissionUpdated(AbstractC9782b abstractC9782b) {
        this.f96469I0 = abstractC9782b;
        this.f96501q.Z(abstractC9782b);
        K40.a aVar = this.f96489e;
        r90.f fVar = this.f96491g;
        if (abstractC9782b != null) {
            Cbottom2SheetDTO r11 = fVar.r(abstractC9782b, this.f96490f);
            if (r11 != null) {
                aVar.g(r11, CbottomType.SHEET, U7.d.e(this.f96513w0, "PERM_ID"), null);
            } else {
                aVar.c("PERM_ID", this.f96513w0 + "PERM_ID", null);
            }
        } else {
            aVar.c("PERM_ID", this.f96513w0 + "PERM_ID", null);
        }
        C0 c02 = this.f96473K0;
        fVar.getClass();
        c02.tryEmit(r90.f.p(abstractC9782b));
    }

    public final void q1(@NotNull WebResourceRequest request, @NotNull WebResourceError error) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        L80.a.b(c1(), "onErrorReceived " + request.getUrl() + " error=" + error.getErrorCode() + " " + ((Object) error.getDescription()));
        this.f96493i.w0(this.f96512w, request.getUrl().toString(), Integer.valueOf(error.getErrorCode()), S0().b(), error.getDescription().toString());
        CharSequence description = error.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
        if (kotlin.text.h.t(description, "net::ERR_CACHE_MISS", false)) {
            return;
        }
        int errorCode = error.getErrorCode();
        Exception iOException = (errorCode == -8 || errorCode == -7 || errorCode == -6 || errorCode == -5 || errorCode == -2) ? new IOException() : new Exception();
        String str = this.f96512w;
        if (str != null) {
            this.f96494j.f(str, iOException.getMessage());
            iOException.getMessage();
            this.f96495k.error(str);
        }
        d70.d dVar = this.f96504s;
        if (dVar.i() && (iOException instanceof IOException)) {
            g1();
            dVar.g(this.f96478P, d.a.LOAD_URL_IO_ERROR);
            return;
        }
        if (iOException instanceof IOException) {
            dVar.c(false);
        }
        this.f96499o.o0();
        this.f96460E = new a.C2102a(iOException);
        g1();
        handleState();
    }

    public final void r1(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        FintechWebView fintechWebView;
        FintechWebView fintechWebView2;
        L80.a.b(c1(), "onHttpErrorReceived " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + " error=" + webResourceResponse);
        String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        this.f96493i.N1(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), S0().b(), webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null, webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null);
        if (valueOf.equals(this.f96512w)) {
            S80.b bVar = this.f96499o;
            bVar.o0();
            this.f96460E = new a.C2102a(new IOException());
            WeakReference<FintechWebView> weakReference = this.f96515x0;
            if (weakReference != null && (fintechWebView2 = weakReference.get()) != null) {
                fintechWebView2.stopLoading();
            }
            WeakReference<FintechWebView> weakReference2 = this.f96515x0;
            WebView webView = (weakReference2 == null || (fintechWebView = weakReference2.get()) == null) ? null : fintechWebView.getWebView();
            boolean f7 = Tl.a.f(this.f96492h, S90.c.MOB_SSO20);
            if (webView == null || webResourceRequest == null || webResourceResponse == null || !f7) {
                Ae.w0<Boolean> Y11 = bVar.Y();
                if (Y11 != null) {
                    Y11.tryEmit(Boolean.TRUE);
                }
            } else {
                C10727i.c(androidx.lifecycle.x0.a(this), null, null, new d(webResourceRequest, webResourceResponse, webView, null, this), 3);
            }
            handleState();
        }
    }

    public final void s1(Integer num, @NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f96493i.Y0(this.f96512w, S0().b(), num, error, F1());
    }

    public final void setPermissionState(AbstractC9782b abstractC9782b) {
        this.f96469I0 = abstractC9782b;
    }

    public final void t1(String str) {
        if (str != null) {
            this.f96494j.b(str);
        }
    }

    public final void u1(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        L80.a.a(c1(), "onPageLoadingFinished url=" + url + " tabId=" + S0().d());
        if (!this.f96458D) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f96494j.d(url);
            String F12 = F1();
            Long b11 = this.f96495k.b();
            this.f96493i.h0(currentTimeMillis - (b11 != null ? b11.longValue() : currentTimeMillis), url, F12);
        }
        if (!(this.f96460E instanceof a.C2102a)) {
            this.f96503r0 = false;
        }
        this.f96458D = true;
        this.f96488d.D(false);
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public final void v1(FintechWebView fintechWebView, @NotNull String url) {
        WebView webView;
        Intrinsics.checkNotNullParameter(url, "url");
        Ns.b.c("onPageLoadingStarted url=", url, c1());
        this.f96494j.e();
        if (fintechWebView == null || (webView = fintechWebView.getWebView()) == null) {
            return;
        }
        this.f96485a.g(webView);
    }

    public final boolean w1(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        boolean a11 = J0(url).a();
        L80.a.a(c1(), "urlFlow onRedirectUrlListener handled = " + a11 + " url=" + url);
        if (!a11) {
            this.f96494j.a(url);
            this.f96495k.a(url);
            this.f96493i.z0(this.f96512w, F1(), url);
        }
        return a11;
    }

    public final void x1() {
        NativeBridgeConfigurator nativeBridgeConfigurator = this.f96501q;
        nativeBridgeConfigurator.d0(true);
        nativeBridgeConfigurator.e0(false);
    }

    public final void y1() {
        NativeBridgeConfigurator nativeBridgeConfigurator = this.f96501q;
        nativeBridgeConfigurator.d0(false);
        nativeBridgeConfigurator.e0(true);
    }

    public final void z1(String str, boolean z11, boolean z12) {
        this.f96512w = str;
        NativeBridgeConfigurator nativeBridgeConfigurator = this.f96501q;
        nativeBridgeConfigurator.c0(str);
        String c12 = c1();
        StringBuilder d11 = K1.G.d("onUpdateVisitedHistory isReload = ", " url =", str, " canGoBack=", z11);
        d11.append(z12);
        L80.a.a(c12, d11.toString());
        nativeBridgeConfigurator.Y(str);
        handleState();
    }
}
