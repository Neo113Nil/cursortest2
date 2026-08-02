package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.w0;
import B90.d0;
import C.D;
import L30.k;
import Sc.C4005g;
import Sc.InterfaceC4008j;
import Sc.v;
import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.C;
import androidx.activity.M;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import b90.C5595b;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g.AbstractC6592d;
import g.InterfaceC6590b;
import g30.InterfaceC6618a;
import h.C6756b;
import h.C6758d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p40.C8853b;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.file.models.OpenFileRequest;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateV20;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateViewV20;
import s90.InterfaceC9636e;
import t90.AbstractC9781a;
import v80.InterfaceC10276c;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.N;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/features/webbank/presentation/fintechwebview/base/FintechWebViewFragmentBase;", "LE30/c;", "LU80/a;", "LI30/b;", "<init>", "()V", "webbank_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechWebViewFragmentBase extends E30.c implements U80.a, I30.b {

    /* renamed from: b, reason: collision with root package name */
    private Integer f96361b;

    /* renamed from: c, reason: collision with root package name */
    private ValueCallback<Uri[]> f96362c;

    /* renamed from: d, reason: collision with root package name */
    private String f96363d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f96364e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f96365f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f96366g;

    /* renamed from: k, reason: collision with root package name */
    private u80.b f96370k;

    /* renamed from: l, reason: collision with root package name */
    private FintechWebView f96371l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final y0 f96372m;

    /* renamed from: n, reason: collision with root package name */
    public S80.b f96373n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC6618a f96374o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final AbstractC6592d<String> f96375p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final AbstractC6592d<String[]> f96376q;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f96360a = Sc.k.a(Sc.n.PUBLICATION, new C5595b(this, 4));

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f96367h = "FintechWebViewFragmentBase";

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private d f96368i = new d();

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final c f96369j = new c();

    /* synthetic */ class a extends C7735q implements Function1<Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            ((ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a) this.receiver).L1(bool.booleanValue());
            return Unit.f71690a;
        }
    }

    /* synthetic */ class b extends C7735q implements Function1<FintechWebView.b, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FintechWebView.b bVar) {
            FintechWebView.b p02 = bVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a) this.receiver).p1(p02);
            return Unit.f71690a;
        }
    }

    public static final class c implements k.a {
        c() {
        }

        @Override // L30.k.a
        public final void a() {
            FintechWebViewFragmentBase fintechWebViewFragmentBase = FintechWebViewFragmentBase.this;
            M activity = fintechWebViewFragmentBase.getActivity();
            if (activity instanceof I30.a) {
                fintechWebViewFragmentBase.f96364e = fintechWebViewFragmentBase.f96364e || ((I30.a) activity).u();
                ((I30.a) activity).a(false);
                fintechWebViewFragmentBase.N().Q0().z(Boolean.TRUE);
            }
            L80.a.a(FintechWebViewFragmentBase.C(fintechWebViewFragmentBase), "keyboard visible=true");
        }

        @Override // L30.k.a
        public final void b() {
            FintechWebViewFragmentBase fintechWebViewFragmentBase = FintechWebViewFragmentBase.this;
            M activity = fintechWebViewFragmentBase.getActivity();
            if ((activity instanceof I30.a) && fintechWebViewFragmentBase.f96364e) {
                fintechWebViewFragmentBase.f96364e = false;
                ((I30.a) activity).s(false);
                fintechWebViewFragmentBase.N().Q0().z(Boolean.FALSE);
            }
        }
    }

    public static final class d extends C {
        d() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a N11 = FintechWebViewFragmentBase.this.N();
            N11.getClass();
            C10727i.c(x0.a(N11), null, null, new ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.i(N11, null), 3);
        }
    }

    /* synthetic */ class e extends C7735q implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FintechWebViewFragmentBase.F((FintechWebViewFragmentBase) this.receiver);
            return Unit.f71690a;
        }
    }

    /* synthetic */ class f extends C7735q implements Function1<OpenFileRequest, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OpenFileRequest openFileRequest) {
            OpenFileRequest p02 = openFileRequest;
            Intrinsics.checkNotNullParameter(p02, "p0");
            FintechWebViewFragmentBase.E((FintechWebViewFragmentBase) this.receiver, p02);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onCreate$3", f = "FintechWebViewFragmentBase.kt", l = {219}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96379d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96381a;

            a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                this.f96381a = fintechWebViewFragmentBase;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                a.s sVar = (a.s) obj;
                if (sVar != null) {
                    this.f96381a.P(sVar);
                }
                return Unit.f71690a;
            }
        }

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return FintechWebViewFragmentBase.this.new g(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96379d;
            if (i11 == 0) {
                Sc.s.b(obj);
                FintechWebViewFragmentBase fintechWebViewFragmentBase = FintechWebViewFragmentBase.this;
                Ae.x0<a.s> X02 = fintechWebViewFragmentBase.N().X0();
                a aVar2 = new a(fintechWebViewFragmentBase);
                this.f96379d = 1;
                if (X02.collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onCreate$4", f = "FintechWebViewFragmentBase.kt", l = {227}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96382d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96384a;

            a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                this.f96384a = fintechWebViewFragmentBase;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                FintechWebView f96371l;
                K60.a aVar = (K60.a) obj;
                FintechWebViewFragmentBase fintechWebViewFragmentBase = this.f96384a;
                L80.a.a("PINPADERTY", "goSpaPinPadFlow=" + aVar + " tabId=" + fintechWebViewFragmentBase.N().S0().d());
                if (aVar != null) {
                    String c11 = aVar.c();
                    if (c11 != null && (f96371l = fintechWebViewFragmentBase.getF96371l()) != null) {
                        f96371l.goSpa(c11, aVar.a());
                    }
                    fintechWebViewFragmentBase.N().V0().setValue(null);
                }
                return Unit.f71690a;
            }
        }

        h(kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return FintechWebViewFragmentBase.this.new h(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96382d;
            if (i11 == 0) {
                Sc.s.b(obj);
                FintechWebViewFragmentBase fintechWebViewFragmentBase = FintechWebViewFragmentBase.this;
                Ae.x0<K60.a> V02 = fintechWebViewFragmentBase.N().V0();
                a aVar2 = new a(fintechWebViewFragmentBase);
                this.f96382d = 1;
                if (V02.collect(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$1", f = "FintechWebViewFragmentBase.kt", l = {33}, m = "invokeSuspend")
    public static final class i extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96385d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96386e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96388g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechWebViewFragmentBase f96389h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$1$1", f = "FintechWebViewFragmentBase.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96390d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96391e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96392f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$i$a$a, reason: collision with other inner class name */
            public static final class C2085a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechWebViewFragmentBase f96393a;

                public C2085a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                    this.f96393a = fintechWebViewFragmentBase;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    FintechWebView f96371l;
                    K60.a aVar = (K60.a) t2;
                    FintechWebViewFragmentBase fintechWebViewFragmentBase = this.f96393a;
                    L80.a.a(FintechWebViewFragmentBase.C(fintechWebViewFragmentBase), "goSpa=" + aVar + " tabId=" + fintechWebViewFragmentBase.N().S0().d());
                    if (aVar != null) {
                        String c11 = aVar.c();
                        if (c11 != null && (f96371l = fintechWebViewFragmentBase.getF96371l()) != null) {
                            f96371l.goSpa(c11, aVar.a());
                        }
                        fintechWebViewFragmentBase.N().M1();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                super(2, dVar);
                this.f96391e = interfaceC2395h;
                this.f96392f = fintechWebViewFragmentBase;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96391e, dVar, this.f96392f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96390d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C2085a c2085a = new C2085a(this.f96392f);
                    this.f96390d = 1;
                    if (this.f96391e.collect(c2085a, this) == aVar) {
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
        public i(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
            super(2, dVar);
            this.f96388g = interfaceC2395h;
            this.f96389h = fintechWebViewFragmentBase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            i iVar = FintechWebViewFragmentBase.this.new i(this.f96388g, dVar, this.f96389h);
            iVar.f96386e = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96385d;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (N.f((xe.M) this.f96386e)) {
                    J viewLifecycleOwner = FintechWebViewFragmentBase.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96388g, null, this.f96389h);
                    this.f96385d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$2", f = "FintechWebViewFragmentBase.kt", l = {33}, m = "invokeSuspend")
    public static final class j extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96394d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96395e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96397g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechWebViewFragmentBase f96398h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$2$1", f = "FintechWebViewFragmentBase.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96399d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96400e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96401f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$j$a$a, reason: collision with other inner class name */
            public static final class C2086a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechWebViewFragmentBase f96402a;

                public C2086a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                    this.f96402a = fintechWebViewFragmentBase;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Boolean bool = (Boolean) t2;
                    if (bool != null) {
                        FintechWebViewFragmentBase fintechWebViewFragmentBase = this.f96402a;
                        M activity = fintechWebViewFragmentBase.getActivity();
                        I30.a aVar = activity instanceof I30.a ? (I30.a) activity : null;
                        if (aVar != null) {
                            if (bool.booleanValue()) {
                                if (L30.k.b()) {
                                    fintechWebViewFragmentBase.f96364e = false;
                                } else {
                                    aVar.a(true);
                                    fintechWebViewFragmentBase.N().Q0().z(Boolean.TRUE);
                                }
                            } else if (L30.k.b()) {
                                fintechWebViewFragmentBase.f96364e = true;
                            } else {
                                aVar.s(true);
                                fintechWebViewFragmentBase.N().Q0().z(Boolean.FALSE);
                            }
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                super(2, dVar);
                this.f96400e = c02;
                this.f96401f = fintechWebViewFragmentBase;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96400e, dVar, this.f96401f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96399d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C2086a c2086a = new C2086a(this.f96401f);
                    this.f96399d = 1;
                    if (this.f96400e.collect(c2086a, this) == aVar) {
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
        public j(C0 c02, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
            super(2, dVar);
            this.f96397g = c02;
            this.f96398h = fintechWebViewFragmentBase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j jVar = FintechWebViewFragmentBase.this.new j(this.f96397g, dVar, this.f96398h);
            jVar.f96395e = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96394d;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (N.f((xe.M) this.f96395e)) {
                    J viewLifecycleOwner = FintechWebViewFragmentBase.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96397g, null, this.f96398h);
                    this.f96394d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$3", f = "FintechWebViewFragmentBase.kt", l = {33}, m = "invokeSuspend")
    public static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96403d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96404e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96406g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechWebViewFragmentBase f96407h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$3$1", f = "FintechWebViewFragmentBase.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96408d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96409e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96410f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$k$a$a, reason: collision with other inner class name */
            public static final class C2087a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechWebViewFragmentBase f96411a;

                public C2087a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                    this.f96411a = fintechWebViewFragmentBase;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    u80.b f96370k;
                    ScreenStateViewV20 screenStateViewV20;
                    ScreenStateViewV20 screenStateViewV202;
                    ScreenStateV20 screenStateV20 = (ScreenStateV20) t2;
                    FintechWebViewFragmentBase fintechWebViewFragmentBase = this.f96411a;
                    u80.b f96370k2 = fintechWebViewFragmentBase.getF96370k();
                    if (f96370k2 != null && (screenStateViewV202 = f96370k2.f100398b) != null) {
                        screenStateViewV202.setVisibility(screenStateV20 != null ? 0 : 8);
                    }
                    if (screenStateV20 != null && (f96370k = fintechWebViewFragmentBase.getF96370k()) != null && (screenStateViewV20 = f96370k.f100398b) != null) {
                        screenStateViewV20.bindState(screenStateV20);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                super(2, dVar);
                this.f96409e = interfaceC2395h;
                this.f96410f = fintechWebViewFragmentBase;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96409e, dVar, this.f96410f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96408d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C2087a c2087a = new C2087a(this.f96410f);
                    this.f96408d = 1;
                    if (this.f96409e.collect(c2087a, this) == aVar) {
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
        public k(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
            super(2, dVar);
            this.f96406g = interfaceC2395h;
            this.f96407h = fintechWebViewFragmentBase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            k kVar = FintechWebViewFragmentBase.this.new k(this.f96406g, dVar, this.f96407h);
            kVar.f96404e = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96403d;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (N.f((xe.M) this.f96404e)) {
                    J viewLifecycleOwner = FintechWebViewFragmentBase.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96406g, null, this.f96407h);
                    this.f96403d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$4", f = "FintechWebViewFragmentBase.kt", l = {33}, m = "invokeSuspend")
    public static final class l extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96412d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96413e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96415g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechWebViewFragmentBase f96416h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$4$1", f = "FintechWebViewFragmentBase.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96417d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96418e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96419f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$l$a$a, reason: collision with other inner class name */
            public static final class C2088a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechWebViewFragmentBase f96420a;

                public C2088a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                    this.f96420a = fintechWebViewFragmentBase;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    a.q finishActivity = (a.q) t2;
                    if (finishActivity != null) {
                        FintechWebViewFragmentBase fintechWebViewFragmentBase = this.f96420a;
                        Intrinsics.checkNotNullParameter(finishActivity, "finishActivity");
                        if (finishActivity.a()) {
                            int i11 = finishActivity.c() ? -1 : 0;
                            androidx.fragment.app.r activity = fintechWebViewFragmentBase.getActivity();
                            if (activity != null) {
                                Intent intent = new Intent();
                                intent.putExtra("PAYMENT_RESULT_DEEPLINK", finishActivity.b());
                                Unit unit = Unit.f71690a;
                                activity.setResult(i11, intent);
                            }
                        }
                        androidx.fragment.app.r activity2 = fintechWebViewFragmentBase.getActivity();
                        if (activity2 != null) {
                            activity2.finish();
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                super(2, dVar);
                this.f96418e = interfaceC2395h;
                this.f96419f = fintechWebViewFragmentBase;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96418e, dVar, this.f96419f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96417d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C2088a c2088a = new C2088a(this.f96419f);
                    this.f96417d = 1;
                    if (this.f96418e.collect(c2088a, this) == aVar) {
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
        public l(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
            super(2, dVar);
            this.f96415g = interfaceC2395h;
            this.f96416h = fintechWebViewFragmentBase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            l lVar = FintechWebViewFragmentBase.this.new l(this.f96415g, dVar, this.f96416h);
            lVar.f96413e = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96412d;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (N.f((xe.M) this.f96413e)) {
                    J viewLifecycleOwner = FintechWebViewFragmentBase.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96415g, null, this.f96416h);
                    this.f96412d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$5", f = "FintechWebViewFragmentBase.kt", l = {33}, m = "invokeSuspend")
    public static final class m extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96421d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96422e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96424g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechWebViewFragmentBase f96425h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$5$1", f = "FintechWebViewFragmentBase.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96426d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96427e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96428f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$m$a$a, reason: collision with other inner class name */
            public static final class C2089a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechWebViewFragmentBase f96429a;

                public C2089a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                    this.f96429a = fintechWebViewFragmentBase;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    if (((Boolean) t2) != null) {
                        this.f96429a.O();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                super(2, dVar);
                this.f96427e = c02;
                this.f96428f = fintechWebViewFragmentBase;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96427e, dVar, this.f96428f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96426d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C2089a c2089a = new C2089a(this.f96428f);
                    this.f96426d = 1;
                    if (this.f96427e.collect(c2089a, this) == aVar) {
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
        public m(C0 c02, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
            super(2, dVar);
            this.f96424g = c02;
            this.f96425h = fintechWebViewFragmentBase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            m mVar = FintechWebViewFragmentBase.this.new m(this.f96424g, dVar, this.f96425h);
            mVar.f96422e = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96421d;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (N.f((xe.M) this.f96422e)) {
                    J viewLifecycleOwner = FintechWebViewFragmentBase.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96424g, null, this.f96425h);
                    this.f96421d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$6", f = "FintechWebViewFragmentBase.kt", l = {33}, m = "invokeSuspend")
    public static final class n extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96430d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96431e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96433g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechWebViewFragmentBase f96434h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$6$1", f = "FintechWebViewFragmentBase.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96435d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96436e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96437f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$n$a$a, reason: collision with other inner class name */
            public static final class C2090a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechWebViewFragmentBase f96438a;

                public C2090a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                    this.f96438a = fintechWebViewFragmentBase;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    AbstractC9781a abstractC9781a = (AbstractC9781a) t2;
                    if (abstractC9781a != null) {
                        boolean z11 = abstractC9781a instanceof AbstractC9781a.b;
                        FintechWebViewFragmentBase fintechWebViewFragmentBase = this.f96438a;
                        if (z11) {
                            List<InterfaceC9636e> a11 = ((AbstractC9781a.b) abstractC9781a).a();
                            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                            Iterator<T> it = a11.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InterfaceC9636e) it.next()).a());
                            }
                            fintechWebViewFragmentBase.requestPermissions((String[]) arrayList.toArray(new String[0]), 9314);
                        } else if (abstractC9781a instanceof AbstractC9781a.C2181a) {
                            fintechWebViewFragmentBase.requireContext().startActivity(((AbstractC9781a.C2181a) abstractC9781a).a());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                super(2, dVar);
                this.f96436e = c02;
                this.f96437f = fintechWebViewFragmentBase;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96436e, dVar, this.f96437f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96435d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C2090a c2090a = new C2090a(this.f96437f);
                    this.f96435d = 1;
                    if (this.f96436e.collect(c2090a, this) == aVar) {
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
        public n(C0 c02, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
            super(2, dVar);
            this.f96433g = c02;
            this.f96434h = fintechWebViewFragmentBase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            n nVar = FintechWebViewFragmentBase.this.new n(this.f96433g, dVar, this.f96434h);
            nVar.f96431e = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96430d;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (N.f((xe.M) this.f96431e)) {
                    J viewLifecycleOwner = FintechWebViewFragmentBase.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96433g, null, this.f96434h);
                    this.f96430d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$7", f = "FintechWebViewFragmentBase.kt", l = {33}, m = "invokeSuspend")
    public static final class o extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96439d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96440e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96442g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechWebViewFragmentBase f96443h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$onViewCreated$$inlined$observe$7$1", f = "FintechWebViewFragmentBase.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96444d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96445e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechWebViewFragmentBase f96446f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewFragmentBase$o$a$a, reason: collision with other inner class name */
            public static final class C2091a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechWebViewFragmentBase f96447a;

                public C2091a(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                    this.f96447a = fintechWebViewFragmentBase;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    if (((Unit) t2) != null) {
                        FintechWebViewFragmentBase fintechWebViewFragmentBase = this.f96447a;
                        fintechWebViewFragmentBase.S();
                        fintechWebViewFragmentBase.J(fintechWebViewFragmentBase.f96363d);
                        if (fintechWebViewFragmentBase.getView() == null) {
                            FintechWebViewFragmentBase.y(fintechWebViewFragmentBase);
                        } else {
                            u80.b f96370k = fintechWebViewFragmentBase.getF96370k();
                            if (f96370k != null) {
                                fintechWebViewFragmentBase.I(f96370k.f100399c);
                            }
                        }
                        fintechWebViewFragmentBase.N().O1();
                        fintechWebViewFragmentBase.N().K1();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
                super(2, dVar);
                this.f96445e = interfaceC2395h;
                this.f96446f = fintechWebViewFragmentBase;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96445e, dVar, this.f96446f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96444d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C2091a c2091a = new C2091a(this.f96446f);
                    this.f96444d = 1;
                    if (this.f96445e.collect(c2091a, this) == aVar) {
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
        public o(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechWebViewFragmentBase fintechWebViewFragmentBase) {
            super(2, dVar);
            this.f96442g = interfaceC2395h;
            this.f96443h = fintechWebViewFragmentBase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            o oVar = FintechWebViewFragmentBase.this.new o(this.f96442g, dVar, this.f96443h);
            oVar.f96440e = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96439d;
            if (i11 == 0) {
                Sc.s.b(obj);
                if (N.f((xe.M) this.f96440e)) {
                    J viewLifecycleOwner = FintechWebViewFragmentBase.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96442g, null, this.f96443h);
                    this.f96439d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    public static final class p extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return FintechWebViewFragmentBase.this;
        }
    }

    public static final class q extends AbstractC7737t implements Function0<androidx.lifecycle.B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f96449b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(p pVar) {
            super(0);
            this.f96449b = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.B0 invoke() {
            return (androidx.lifecycle.B0) this.f96449b.invoke();
        }
    }

    public static final class r extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96450b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96450b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((androidx.lifecycle.B0) this.f96450b.getValue()).getViewModelStore();
        }
    }

    public static final class s extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96451b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            androidx.lifecycle.B0 b02 = (androidx.lifecycle.B0) this.f96451b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public FintechWebViewFragmentBase() {
        D.c(56.0f);
        Me.g gVar = new Me.g(this, 1);
        InterfaceC4008j a11 = Sc.k.a(Sc.n.NONE, new q(new p()));
        this.f96372m = b0.b(this, kotlin.jvm.internal.N.b(ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a.class), new r(a11), new s(a11), gVar);
        AbstractC6592d<String> registerForActivityResult = registerForActivityResult(new C6756b(), new InterfaceC6590b() { // from class: z80.e
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                List<? extends Uri> list = (List) obj;
                ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a N11 = FintechWebViewFragmentBase.this.N();
                Intrinsics.f(list);
                N11.h1(list, q60.b.GALLERY);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f96375p = registerForActivityResult;
        AbstractC6592d<String[]> registerForActivityResult2 = registerForActivityResult(new C6758d(), new InterfaceC6590b() { // from class: z80.f
            @Override // g.InterfaceC6590b
            public final void onActivityResult(Object obj) {
                List<? extends Uri> list = (List) obj;
                ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a N11 = FintechWebViewFragmentBase.this.N();
                Intrinsics.f(list);
                N11.h1(list, q60.b.FILE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.f96376q = registerForActivityResult2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final String C(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
        return (String) fintechWebViewFragmentBase.f96360a.getValue();
    }

    public static final void E(FintechWebViewFragmentBase fintechWebViewFragmentBase, OpenFileRequest openFileRequest) {
        fintechWebViewFragmentBase.getClass();
        Object[] array = openFileRequest.getMimes().toArray(new String[0]);
        if (array.length == 0) {
            array = new String[]{"*/*"};
        }
        fintechWebViewFragmentBase.f96376q.a((String[]) array);
    }

    public static final void F(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
        fintechWebViewFragmentBase.f96375p.a("image/*");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final void I(ViewGroup viewGroup) {
        L80.a.a((String) this.f96360a.getValue(), "addWebViewTo fintechWebView=" + this.f96371l + " holder=" + viewGroup);
        FintechWebView fintechWebView = this.f96371l;
        if (fintechWebView == null || Intrinsics.d(fintechWebView.getParent(), viewGroup)) {
            return;
        }
        S();
        viewGroup.addView(fintechWebView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void J(String str) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        FintechWebView fintechWebView = new FintechWebView(requireContext, null, 2, 0 == true ? 1 : 0);
        fintechWebView.setTabId(str);
        if (!this.f96366g) {
            fintechWebView.onPause("Creation");
        }
        fintechWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        fintechWebView.setParentFragmentActivity(requireActivity);
        fintechWebView.setOnWebViewCreated(new Ca.o(this, 3));
        fintechWebView.configure(N().Y0());
        fintechWebView.setOnCreateErrorReceived(new b(1, N(), ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a.class, "onCreationError", "onCreationError(Lru/ozon/fintech/features/finwebview/ui/FintechWebView$CreationError;)V", 0));
        fintechWebView.setOnReceiveTitleListener(new Ca.q(this, 3));
        fintechWebView.setOnRedirectUrlListener(new Ca.r(this, 4));
        fintechWebView.setOnWebViewJsErrorListener(new InterfaceC6511n() { // from class: z80.g
            @Override // fd.InterfaceC6511n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String error = (String) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                FintechWebViewFragmentBase.this.N().s1((Integer) obj2, error);
                return Unit.f71690a;
            }
        });
        fintechWebView.setOnUpdateVisitedHistory(new InterfaceC6511n() { // from class: z80.a
            @Override // fd.InterfaceC6511n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                FintechWebViewFragmentBase.this.N().z1((String) obj, booleanValue, booleanValue2);
                return Unit.f71690a;
            }
        });
        fintechWebView.setOnLoadResource(new Function1() { // from class: z80.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                FintechWebViewFragmentBase.this.N().t1((String) obj);
                return Unit.f71690a;
            }
        });
        fintechWebView.setOnPageLoadingStarted(new C8853b(this, 1));
        fintechWebView.setOnPageLoadingFinished(new Function2() { // from class: z80.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String url = (String) obj;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                FintechWebViewFragmentBase.this.N().u1(url);
                return Unit.f71690a;
            }
        });
        fintechWebView.setOnShowFileChooserListener(new Ca.g(this, 1));
        fintechWebView.setOnErrorReceived(new Function2() { // from class: z80.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                WebResourceRequest request = (WebResourceRequest) obj;
                WebResourceError error = (WebResourceError) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(error, "error");
                FintechWebViewFragmentBase.this.N().q1(request, error);
                return Unit.f71690a;
            }
        });
        fintechWebView.setOnHttpErrorReceived(new L60.f(this, 1));
        fintechWebView.setOnRenderProcessGoneListener(new a(1, N(), ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a.class, "renderProcessCrashed", "renderProcessCrashed(Z)V", 0));
        N().J1(fintechWebView);
        this.f96371l = fintechWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        FintechWebView fintechWebView = this.f96371l;
        if (fintechWebView != null) {
            ViewParent parent = fintechWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setLayoutTransition(null);
                viewGroup.removeView(fintechWebView);
            }
        }
    }

    public static void t(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
        WebView webView;
        FintechWebView fintechWebView = fintechWebViewFragmentBase.f96371l;
        if (fintechWebView == null || (webView = fintechWebView.getWebView()) == null) {
            return;
        }
        webView.scrollBy(0, -1);
    }

    public static Unit u(FintechWebViewFragmentBase fintechWebViewFragmentBase, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        fintechWebViewFragmentBase.N().v1(fintechWebViewFragmentBase.f96371l, url);
        return Unit.f71690a;
    }

    public static String v(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
        return "FintechWebViewFragmentBase/" + fintechWebViewFragmentBase.f96367h;
    }

    public static C5353y0 w(ConstraintLayout constraintLayout, FintechWebViewFragmentBase fintechWebViewFragmentBase, View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int j11 = insets.j();
        int k11 = insets.k();
        int i11 = insets.i();
        C5353y0.b bVar = new C5353y0.b(insets);
        bVar.d(androidx.core.graphics.d.b(j11, 0, k11, i11));
        C5353y0 u11 = Y.u(constraintLayout, bVar.a());
        Intrinsics.checkNotNullExpressionValue(u11, "onApplyWindowInsets(...)");
        u80.b bVar2 = fintechWebViewFragmentBase.f96370k;
        if (bVar2 != null) {
            bVar2.f100398b.setPadding(0, insets.l(), 0, 0);
        }
        return u11;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [Sc.j, java.lang.Object] */
    public static Unit x(FintechWebViewFragmentBase fintechWebViewFragmentBase, ValueCallback uploadMessage, WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(uploadMessage, "uploadMessage");
        Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
        ValueCallback<Uri[]> valueCallback = fintechWebViewFragmentBase.f96362c;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
        fintechWebViewFragmentBase.f96362c = uploadMessage;
        Intent createIntent = fileChooserParams.createIntent();
        createIntent.putExtra("android.intent.extra.MIME_TYPES", fileChooserParams.getAcceptTypes());
        if (fileChooserParams.getMode() == 1) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        try {
            fintechWebViewFragmentBase.startActivityForResult(createIntent, 9461);
        } catch (ActivityNotFoundException e11) {
            L80.a.c((String) fintechWebViewFragmentBase.f96360a.getValue(), null, e11);
            fintechWebViewFragmentBase.N().P1();
        }
        return Unit.f71690a;
    }

    public static final void y(FintechWebViewFragmentBase fintechWebViewFragmentBase) {
        M activity = fintechWebViewFragmentBase.getActivity();
        I30.c cVar = activity instanceof I30.c ? (I30.c) activity : null;
        FrameLayout j11 = cVar != null ? cVar.j() : null;
        if (j11 != null) {
            fintechWebViewFragmentBase.I(j11);
        }
    }

    public final void K() {
        WebView webView;
        WebView webView2;
        FintechWebView fintechWebView = this.f96371l;
        if (fintechWebView != null && (webView2 = fintechWebView.getWebView()) != null) {
            webView2.scrollBy(0, 1);
        }
        FintechWebView fintechWebView2 = this.f96371l;
        if (fintechWebView2 == null || (webView = fintechWebView2.getWebView()) == null) {
            return;
        }
        webView.post(new d0(this, 3));
    }

    /* renamed from: L, reason: from getter */
    public final u80.b getF96370k() {
        return this.f96370k;
    }

    /* renamed from: M, reason: from getter */
    public final FintechWebView getF96371l() {
        return this.f96371l;
    }

    @NotNull
    public final ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a N() {
        return (ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a) this.f96372m.getValue();
    }

    public final void O() {
        this.f96368i.setEnabled(false);
        androidx.fragment.app.r activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public final void P(@NotNull a.s loadUrl) {
        FintechWebView fintechWebView;
        FintechWebView fintechWebView2;
        Intrinsics.checkNotNullParameter(loadUrl, "loadUrl");
        L80.a.a("TABSFLOW_FT", this.f96363d + " loadUrl.url " + loadUrl.b() + " ");
        if (this.f96371l == null) {
            J(this.f96363d);
            u80.b bVar = this.f96370k;
            if (bVar != null) {
                I(bVar.f100399c);
            }
        }
        if (loadUrl.b() != null && (fintechWebView2 = this.f96371l) != null) {
            fintechWebView2.loadUrl(loadUrl.b(), loadUrl.a());
        }
        N().N1();
        if (this.f96366g || (fintechWebView = this.f96371l) == null) {
            return;
        }
        fintechWebView.onPause("loadUrl");
    }

    public final void Q() {
        N().x1();
    }

    public final void R() {
        N().y1();
    }

    @Override // U80.a
    public final Map<String, ArrayList<String>> f() {
        FintechWebView fintechWebView = this.f96371l;
        if (fintechWebView != null) {
            return fintechWebView.getNativeBridgeNames();
        }
        return null;
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF96590a() {
        return this.f96367h;
    }

    @Override // U80.a
    public final w0<v<String, String, String>> h() {
        FintechWebView fintechWebView = this.f96371l;
        if (fintechWebView != null) {
            return fintechWebView.observeCallbacks();
        }
        return null;
    }

    @Override // I30.b
    public final void o(boolean z11) {
        String f7 = N().S0().f();
        if (f7 == null || f7.length() <= 0) {
            return;
        }
        if (!z11) {
            N().K1();
            return;
        }
        FintechWebView fintechWebView = this.f96371l;
        if (fintechWebView != null) {
            fintechWebView.goSpa(f7, Boolean.FALSE);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 9461) {
            ValueCallback<Uri[]> valueCallback = this.f96362c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(L30.b.a(i12, intent));
            }
            this.f96362c = null;
        } else {
            N().onActivityResult(i11, i12, intent);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC10276c) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC10276c.class)).Y(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireActivity().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
        getResources().getDimensionPixelSize(typedValue.resourceId);
        getResources().getInteger(R.integer.config_shortAnimTime);
        Bundle arguments = getArguments();
        A80.a aVar = new A80.a(arguments != null ? arguments.getString("LOAD_URL_KEY") : null, null, arguments != null ? arguments.getString("APP_CONFIG_ID") : null, arguments != null ? arguments.getString("TAB_ID") : null, (arguments == null || (string = arguments.getString("TAB_INDEX")) == null) ? 0 : Integer.parseInt(string));
        String d11 = aVar.d();
        this.f96363d = d11;
        L80.a.a("PINPADERFLOW", "FintechWebViewFragmentBase onCreate " + d11);
        ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a N11 = N();
        String uniqueUuid = getUniqueUuid();
        androidx.fragment.app.r activity = getActivity();
        N11.o1(aVar, (activity != null ? activity.getCallingActivity() : null) != null, uniqueUuid, new e(0, this, FintechWebViewFragmentBase.class, "openGalleryPicker", "openGalleryPicker()V", 0), new f(1, this, FintechWebViewFragmentBase.class, "openFilePicker", "openFilePicker(Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/open/file/models/OpenFileRequest;)V", 0));
        boolean l12 = N().l1();
        Ns.b.c("onCreate ", this.f96363d, "TABSFLOW");
        if (!l12) {
            J(aVar.d());
        }
        C10727i.c(K.a(this), null, null, new g(null), 3);
        L80.a.a("PINPADERTY", "FintechWebViewFragmentBase onCreate");
        this.f96365f = C10727i.c(K.a(this), null, null, new h(null), 3);
        M activity2 = getActivity();
        I30.c cVar = activity2 instanceof I30.c ? (I30.c) activity2 : null;
        FrameLayout j11 = cVar != null ? cVar.j() : null;
        if (j11 != null) {
            I(j11);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        L80.a.a("TABSFLOW", "onCreateView tabId=" + this.f96363d);
        H30.m.b(this);
        u80.b b11 = u80.b.b(inflater, viewGroup);
        this.f96370k = b11;
        int i11 = Build.VERSION.SDK_INT;
        ConstraintLayout constraintLayout2 = b11.f100400d;
        if (i11 >= 31) {
            if (constraintLayout2 != null) {
                constraintLayout2.setFitsSystemWindows(true);
            }
            u80.b bVar = this.f96370k;
            if (bVar != null && (constraintLayout = bVar.f100400d) != null) {
                Y.J(constraintLayout, new Y6.h(constraintLayout, this));
            }
        } else if (constraintLayout2 != null) {
            constraintLayout2.setFitsSystemWindows(true);
        }
        androidx.fragment.app.r activity = getActivity();
        this.f96361b = (activity == null || (window2 = activity.getWindow()) == null || (attributes = window2.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        int i12 = L30.k.f16511d;
        L30.k.a(this.f96369j);
        androidx.fragment.app.r activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        u80.b bVar2 = this.f96370k;
        if (bVar2 != null) {
            return bVar2.a();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        L80.a.a("PINPADERFLOW", "onDestroy tabId=" + this.f96363d);
        N().onDestroy();
        B0 b02 = this.f96365f;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f96365f = null;
        FintechWebView fintechWebView = this.f96371l;
        if (fintechWebView != null) {
            fintechWebView.onDestroy();
        }
        S();
        this.f96362c = null;
        this.f96371l = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        Window window;
        ConstraintLayout a11;
        Ns.b.c("onDestroyView tabId=", this.f96363d, "PINPADERFLOW");
        u80.b bVar = this.f96370k;
        if (bVar != null && (a11 = bVar.a()) != null) {
            a11.setLayoutTransition(null);
        }
        u80.b bVar2 = this.f96370k;
        if (bVar2 != null) {
            bVar2.f100399c.setLayoutTransition(null);
        }
        M activity = getActivity();
        I30.c cVar = activity instanceof I30.c ? (I30.c) activity : null;
        FrameLayout j11 = cVar != null ? cVar.j() : null;
        if (j11 != null) {
            I(j11);
        } else {
            S();
        }
        this.f96370k = null;
        Integer num = this.f96361b;
        if (num != null) {
            int intValue = num.intValue();
            androidx.fragment.app.r activity2 = getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
        int i11 = L30.k.f16511d;
        L30.k.d(this.f96369j);
        H30.m.b(this);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onRequestPermissionsResult(int i11, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (permissions.length == 0) {
            return;
        }
        ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a N11 = N();
        androidx.fragment.app.r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        N11.onPermissionResumeOrResult(requireActivity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a N11 = N();
        androidx.fragment.app.r activity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(activity, "requireActivity(...)");
        N11.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        N11.onPermissionResumeOrResult(activity);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        this.f96366g = true;
        this.f96368i.setEnabled(true);
        N().onStart();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        this.f96366g = false;
        N().onStop();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [Sc.j, java.lang.Object] */
    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Ns.b.c("onViewCreated tabId=", this.f96363d, (String) this.f96360a.getValue());
        Ns.b.c("onViewCreated tabId=", this.f96363d, "PINPADERFLOW");
        d dVar = this.f96368i;
        dVar.setEnabled(true);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, dVar);
        N().A1();
        u80.b bVar = this.f96370k;
        if (bVar != null) {
            I(bVar.f100399c);
        }
        Ae.x0<K60.a> U02 = N().U0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new i(U02, null, this), 3);
        C0 T02 = N().T0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new j(T02, null, this), 3);
        Ae.x0<ScreenStateV20> b12 = N().b1();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new k(b12, null, this), 3);
        InterfaceC2395h<a.q> M02 = N().M0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new l(M02, null, this), 3);
        C0 W02 = N().W0();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new m(W02, null, this), 3);
        w0<AbstractC9781a> permissionAction = N().getPermissionAction();
        J viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner7), null, null, new n((C0) permissionAction, null, this), 3);
        Ae.x0<Unit> a12 = N().a1();
        J viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner8), null, null, new o(a12, null, this), 3);
        N().A1();
    }

    @Override // U80.a
    public final void p(@NotNull String script, ValueCallback<String> valueCallback) {
        Intrinsics.checkNotNullParameter(script, "script");
        FintechWebView fintechWebView = this.f96371l;
        if (fintechWebView != null) {
            fintechWebView.evaluateJavascript(script, valueCallback);
        }
    }
}
