package ru.ozon.fintech.features.webbank.presentation.fintechwebview.base;

import A30.m;
import Ae.w0;
import Ae.x0;
import D30.c;
import Sc.o;
import Sc.s;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a;
import ru.ozon.fintech.network.models.a;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$handleOnHttpErrorReceived$1", f = "FintechWebViewViewModelBase.kt", l = {1047}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f96570d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a f96571e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ WebResourceRequest f96572f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ WebView f96573g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ WebResourceResponse f96574h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.FintechWebViewViewModelBase$handleOnHttpErrorReceived$1$ssoResult$1", f = "FintechWebViewViewModelBase.kt", l = {1048}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super D30.c>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96575d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a f96576e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ WebView f96577f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ WebResourceRequest f96578g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ WebResourceResponse f96579h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, WebView webView, kotlin.coroutines.d dVar, ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar) {
            super(2, dVar);
            this.f96576e = aVar;
            this.f96577f = webView;
            this.f96578g = webResourceRequest;
            this.f96579h = webResourceResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f96578g, this.f96579h, this.f96577f, dVar, this.f96576e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super D30.c> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96575d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            m P02 = this.f96576e.P0();
            this.f96575d = 1;
            Object z11 = P02.z(this.f96577f, this.f96578g, this.f96579h, this);
            return z11 == aVar ? aVar : z11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, WebView webView, kotlin.coroutines.d dVar, ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar) {
        super(2, dVar);
        this.f96571e = aVar;
        this.f96572f = webResourceRequest;
        this.f96573g = webView;
        this.f96574h = webResourceResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        WebView webView = this.f96573g;
        return new d(this.f96572f, this.f96574h, webView, dVar, this.f96571e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f96570d;
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            He.b bVar = He.b.f10879b;
            WebView webView = this.f96573g;
            a aVar2 = new a(this.f96572f, this.f96574h, webView, null, this.f96571e);
            this.f96570d = 1;
            obj = C10727i.f(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        D30.c cVar = (D30.c) obj;
        boolean z12 = cVar instanceof c.a;
        ru.ozon.fintech.features.webbank.presentation.fintechwebview.base.a aVar3 = this.f96571e;
        if (z12) {
            x0<a.s> X02 = aVar3.X0();
            ((c.a) cVar).getClass();
            X02.setValue(new a.s(null, true));
            aVar3.f96460E = a.b.f96629a;
            w0<Boolean> Y11 = aVar3.Q0().Y();
            if (Y11 != null) {
                Y11.tryEmit(Boolean.TRUE);
            }
            aVar3.handleState();
        } else if (Intrinsics.d(cVar, c.C0131c.f5775a)) {
            z11 = aVar3.f96503r0;
            if (z11) {
                w0<Boolean> Y12 = aVar3.Q0().Y();
                if (Y12 != null) {
                    Y12.tryEmit(Boolean.TRUE);
                }
            } else {
                aVar3.f96503r0 = true;
                aVar3.X0().setValue(new a.s(this.f96572f.getUrl().toString(), true));
            }
        } else {
            if (!Intrinsics.d(cVar, c.b.f5774a)) {
                throw new o();
            }
            w0<Boolean> Y13 = aVar3.Q0().Y();
            if (Y13 != null) {
                Y13.tryEmit(Boolean.TRUE);
            }
        }
        return Unit.f71690a;
    }
}
