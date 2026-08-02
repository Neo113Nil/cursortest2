package ru.ozon.id.nativeauth.sso2;

import Fb0.f;
import Sc.InterfaceC4008j;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import id0.C7050a;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2WebViewDomainValidator$trackLogout$1", f = "Sso2WebViewDomainValidator.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class E extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97349d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ F f97350e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ WebResourceResponse f97351f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ WebResourceRequest f97352g;

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ F f97353b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebResourceRequest f97354c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ WebResourceResponse f97355d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(F f7, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super(0);
            this.f97353b = f7;
            this.f97354c = webResourceRequest;
            this.f97355d = webResourceResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            InterfaceC4008j interfaceC4008j;
            interfaceC4008j = this.f97353b.f97360e;
            return ((ob0.B) interfaceC4008j.getValue()).l(this.f97354c, this.f97355d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    E(F f7, WebResourceResponse webResourceResponse, WebResourceRequest webResourceRequest, kotlin.coroutines.d<? super E> dVar) {
        super(2, dVar);
        this.f97350e = f7;
        this.f97351f = webResourceResponse;
        this.f97352g = webResourceRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new E(this.f97350e, this.f97351f, this.f97352g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((E) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        InterfaceC4008j interfaceC4008j2;
        Fb0.f fVar;
        InterfaceC4008j interfaceC4008j3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97349d;
        F f7 = this.f97350e;
        if (i11 == 0) {
            Sc.s.b(obj);
            interfaceC4008j = f7.f97358c;
            hd0.i iVar = (hd0.i) interfaceC4008j.getValue();
            this.f97349d = 1;
            obj = iVar.f(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        Sso2MobileConfigResponseDTO sso2MobileConfigResponseDTO = (Sso2MobileConfigResponseDTO) obj;
        if (sso2MobileConfigResponseDTO != null ? sso2MobileConfigResponseDTO.getLogsEnabled() : true) {
            WebResourceResponse webResourceResponse = this.f97351f;
            if (webResourceResponse.getStatusCode() == 401) {
                interfaceC4008j2 = f7.f97360e;
                Set<f.a> v11 = ((ob0.B) interfaceC4008j2.getValue()).v();
                fVar = f7.f97356a;
                if (!v11.contains(fVar.getAppName())) {
                    interfaceC4008j3 = f7.f97359d;
                    ((C7050a) interfaceC4008j3.getValue()).c(new a(f7, this.f97352g, webResourceResponse));
                }
            }
        }
        return Unit.f71690a;
    }
}
