package ru.ozon.id.nativeauth.sso2;

import Sc.InterfaceC4008j;
import android.webkit.WebView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.sso2.t;
import ru.ozon.id.nativeauth.sso2.u;
import xe.C10720e0;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2WebViewDomainValidator$reauthorizeAndLoad$1", f = "Sso2WebViewDomainValidator.kt", l = {110, 113}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class D extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97338d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ F f97339e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ t.c f97340f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ WebView f97341g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f97342h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Map<String, String> f97343i;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2WebViewDomainValidator$reauthorizeAndLoad$1$1", f = "Sso2WebViewDomainValidator.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f97344d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ WebView f97345e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f97346f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f97347g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ F f97348h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar, WebView webView, String str, Map<String, String> map, F f7, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f97344d = uVar;
            this.f97345e = webView;
            this.f97346f = str;
            this.f97347g = map;
            this.f97348h = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f97344d, this.f97345e, this.f97346f, this.f97347g, this.f97348h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            u uVar = this.f97344d;
            boolean z11 = uVar instanceof u.d;
            WebView webView = this.f97345e;
            if (z11 || (uVar instanceof u.b)) {
                webView.loadUrl(this.f97346f, this.f97347g);
            } else {
                boolean z12 = uVar instanceof u.a;
                F f7 = this.f97348h;
                if (z12) {
                    f7.i(webView, ((u.a) uVar).b().getMessage());
                } else {
                    if (!(uVar instanceof u.c)) {
                        throw new Sc.o();
                    }
                    f7.i(webView, ((u.c) uVar).b());
                }
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    D(F f7, t.c cVar, WebView webView, String str, Map<String, String> map, kotlin.coroutines.d<? super D> dVar) {
        super(2, dVar);
        this.f97339e = f7;
        this.f97340f = cVar;
        this.f97341g = webView;
        this.f97342h = str;
        this.f97343i = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new D(this.f97339e, this.f97340f, this.f97341g, this.f97342h, this.f97343i, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((D) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (xe.C10727i.f(r11, r3, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97338d;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC4008j = this.f97339e.f97357b;
            v vVar = (v) interfaceC4008j.getValue();
            this.f97338d = 1;
            obj = vVar.l(this.f97340f, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        u uVar = (u) obj;
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l02 = De.s.f6650a;
        a aVar2 = new a(uVar, this.f97341g, this.f97342h, this.f97343i, this.f97339e, null);
        this.f97338d = 2;
    }
}
