package ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.r;
import Sc.s;
import a5.C4945c;
import a5.C4947e;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateV20;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import u80.C9985a;
import v80.InterfaceC10276c;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/webbank/presentation/fintechwebview/payment/bank/FintechBankCardsPaymentWebViewFragment;", "LE30/c;", "<init>", "()V", "webbank_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechBankCardsPaymentWebViewFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f96590a = "FintechBankCardsPaymentWebViewFragment";

    /* renamed from: b, reason: collision with root package name */
    private C9985a f96591b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f96592c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$onViewCreated$$inlined$observe$1", f = "FintechBankCardsPaymentWebViewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96593d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96594e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96596g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96597h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$onViewCreated$$inlined$observe$1$1", f = "FintechBankCardsPaymentWebViewFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$a$a, reason: collision with other inner class name */
        public static final class C2098a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96598d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96599e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96600f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$a$a$a, reason: collision with other inner class name */
            public static final class C2099a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96601a;

                public C2099a(FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
                    this.f96601a = fintechBankCardsPaymentWebViewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    String str = (String) t2;
                    if (str != null) {
                        L80.a.a("BANK_CARDS", "fragment observe url=".concat(str));
                        C9985a c9985a = this.f96601a.f96591b;
                        if (c9985a != null) {
                            c9985a.f100395c.loadUrl(str);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2098a(C0 c02, kotlin.coroutines.d dVar, FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
                super(2, dVar);
                this.f96599e = c02;
                this.f96600f = fintechBankCardsPaymentWebViewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2098a(this.f96599e, dVar, this.f96600f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2098a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96598d;
                if (i11 == 0) {
                    s.b(obj);
                    C2099a c2099a = new C2099a(this.f96600f);
                    this.f96598d = 1;
                    if (this.f96599e.collect(c2099a, this) == aVar) {
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
        public a(C0 c02, kotlin.coroutines.d dVar, FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
            super(2, dVar);
            this.f96596g = c02;
            this.f96597h = fintechBankCardsPaymentWebViewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = FintechBankCardsPaymentWebViewFragment.this.new a(this.f96596g, dVar, this.f96597h);
            aVar.f96594e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96593d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96594e)) {
                    J viewLifecycleOwner = FintechBankCardsPaymentWebViewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C2098a c2098a = new C2098a(this.f96596g, null, this.f96597h);
                    this.f96593d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c2098a, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$onViewCreated$$inlined$observe$2", f = "FintechBankCardsPaymentWebViewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96602d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96603e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96605g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96606h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$onViewCreated$$inlined$observe$2$1", f = "FintechBankCardsPaymentWebViewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96607d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96608e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96609f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2100a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96610a;

                public C2100a(FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
                    this.f96610a = fintechBankCardsPaymentWebViewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9985a c9985a;
                    FinToolbarState finToolbarState = (FinToolbarState) t2;
                    if (finToolbarState != null && (c9985a = this.f96610a.f96591b) != null) {
                        c9985a.f100396d.bindState(finToolbarState);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
                super(2, dVar);
                this.f96608e = interfaceC2395h;
                this.f96609f = fintechBankCardsPaymentWebViewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96608e, dVar, this.f96609f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96607d;
                if (i11 == 0) {
                    s.b(obj);
                    C2100a c2100a = new C2100a(this.f96609f);
                    this.f96607d = 1;
                    if (this.f96608e.collect(c2100a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
            super(2, dVar);
            this.f96605g = interfaceC2395h;
            this.f96606h = fintechBankCardsPaymentWebViewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = FintechBankCardsPaymentWebViewFragment.this.new b(this.f96605g, dVar, this.f96606h);
            bVar.f96603e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96602d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96603e)) {
                    J viewLifecycleOwner = FintechBankCardsPaymentWebViewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96605g, null, this.f96606h);
                    this.f96602d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$onViewCreated$$inlined$observe$3", f = "FintechBankCardsPaymentWebViewFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96611d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96612e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96614g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96615h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$onViewCreated$$inlined$observe$3$1", f = "FintechBankCardsPaymentWebViewFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96616d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96617e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96618f;

            /* renamed from: ru.ozon.fintech.features.webbank.presentation.fintechwebview.payment.bank.FintechBankCardsPaymentWebViewFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2101a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechBankCardsPaymentWebViewFragment f96619a;

                public C2101a(FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
                    this.f96619a = fintechBankCardsPaymentWebViewFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ScreenStateV20 screenStateV20 = (ScreenStateV20) t2;
                    FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment = this.f96619a;
                    if (screenStateV20 != null) {
                        C9985a c9985a = fintechBankCardsPaymentWebViewFragment.f96591b;
                        if (c9985a != null) {
                            c9985a.f100394b.setVisibility(0);
                        }
                        C9985a c9985a2 = fintechBankCardsPaymentWebViewFragment.f96591b;
                        if (c9985a2 != null) {
                            c9985a2.f100394b.bindState(screenStateV20);
                        }
                    } else {
                        C9985a c9985a3 = fintechBankCardsPaymentWebViewFragment.f96591b;
                        if (c9985a3 != null) {
                            c9985a3.f100394b.setVisibility(8);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
                super(2, dVar);
                this.f96617e = interfaceC2395h;
                this.f96618f = fintechBankCardsPaymentWebViewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96617e, dVar, this.f96618f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96616d;
                if (i11 == 0) {
                    s.b(obj);
                    C2101a c2101a = new C2101a(this.f96618f);
                    this.f96616d = 1;
                    if (this.f96617e.collect(c2101a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment) {
            super(2, dVar);
            this.f96614g = interfaceC2395h;
            this.f96615h = fintechBankCardsPaymentWebViewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = FintechBankCardsPaymentWebViewFragment.this.new c(this.f96614g, dVar, this.f96615h);
            cVar.f96612e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96611d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96612e)) {
                    J viewLifecycleOwner = FintechBankCardsPaymentWebViewFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96614g, null, this.f96615h);
                    this.f96611d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    public static final class d extends WebViewClient {
        d() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Ns.b.c("fragment onPageFinished url=", str, "BANK_CARDS");
            FintechBankCardsPaymentWebViewFragment.this.w().k0();
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            L80.a.a("BANK_CARDS", "fragment onReceivedError request=" + webResourceRequest.getUrl());
            FintechBankCardsPaymentWebViewFragment.this.w().j0("");
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            L80.a.a("BANK_CARDS", "fragment onReceivedHttpError request=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null));
            FintechBankCardsPaymentWebViewFragment.this.w().j0("");
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            String str = null;
            L80.a.a("BANK_CARDS", "fragment shouldOverrideUrlLoading request=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null));
            B80.a w11 = FintechBankCardsPaymentWebViewFragment.this.w();
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                str = url.toString();
            }
            if (w11.g0(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public static final class e extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return FintechBankCardsPaymentWebViewFragment.this;
        }
    }

    public static final class f extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f96622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f96622b = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96622b.invoke();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96623b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96623b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96623b.getValue()).getViewModelStore();
        }
    }

    public static final class h extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96624b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96624b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public FintechBankCardsPaymentWebViewFragment() {
        B80.c cVar = new B80.c(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new f(new e()));
        this.f96592c = b0.b(this, kotlin.jvm.internal.N.b(B80.a.class), new g(a11), new h(a11), cVar);
    }

    public static Unit t(FintechBankCardsPaymentWebViewFragment fintechBankCardsPaymentWebViewFragment, String str) {
        fintechBankCardsPaymentWebViewFragment.w().l0(str);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B80.a w() {
        return (B80.a) this.f96592c.getValue();
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF96590a() {
        return this.f96590a;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC10276c) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC10276c.class)).W(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        B80.a w11 = w();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("LOAD_URL_KEY", null) : null;
        Bundle arguments2 = getArguments();
        w11.h0(string, arguments2 != null ? arguments2.getStringArrayList("CANCEL_URLS") : null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C9985a b11 = C9985a.b(inflater, viewGroup);
        this.f96591b = b11;
        FrameLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C9985a c9985a = this.f96591b;
        if (c9985a != null) {
            WebView webView = c9985a.f100395c;
            try {
                r.Companion companion = Sc.r.INSTANCE;
                webView.setWebViewClient(new d());
                if (Build.VERSION.SDK_INT < 33 && C4947e.a("FORCE_DARK")) {
                    Context context = webView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    C4945c.a(webView.getSettings(), H30.e.d(context) ? 2 : 0);
                    if (C4947e.a("FORCE_DARK_STRATEGY")) {
                        C4945c.b(webView.getSettings());
                    }
                }
                webView.setHapticFeedbackEnabled(false);
                Intrinsics.checkNotNullParameter(webView, "webView");
                M60.a aVar = new M60.a();
                aVar.b(new B80.d(0));
                aVar.a(new Function1() { // from class: B80.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FintechBankCardsPaymentWebViewFragment.t(FintechBankCardsPaymentWebViewFragment.this, (String) obj);
                    }
                });
                aVar.c(new B80.f());
                webView.setWebChromeClient(aVar);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setSupportZoom(false);
                webView.getSettings().setAllowFileAccess(false);
                webView.getSettings().setAllowContentAccess(false);
                webView.getSettings().setDatabaseEnabled(false);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
                webView.getSettings().setMixedContentMode(1);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setTextZoom(100);
                webView.setDownloadListener(new B80.g());
                webView.setVerticalScrollBarEnabled(false);
                webView.setHorizontalScrollBarEnabled(false);
                webView.setRendererPriorityPolicy(2, false);
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                r.Companion companion2 = Sc.r.INSTANCE;
                s.a(th2);
            }
        }
        C0 f02 = w().f0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new a(f02, null, this), 3);
        x0<FinToolbarState> e02 = w().e0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(e02, null, this), 3);
        x0<ScreenStateV20> screenStateFlow = w().getScreenStateFlow();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(screenStateFlow, null, this), 3);
    }
}
