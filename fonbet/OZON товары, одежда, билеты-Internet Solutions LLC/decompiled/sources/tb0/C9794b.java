package tb0;

import Sc.s;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import jd0.C7352e;
import jd0.q;
import jd0.w;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ob0.s;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeManager$createWebView$2", f = "AntibotJSChallengeManager.kt", l = {89, 105}, m = "invokeSuspend")
/* renamed from: tb0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9794b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f99332d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9796d f99333e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f99334f;

    /* renamed from: tb0.b$a */
    /* synthetic */ class a extends C7735q implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p02 = str;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C9796d) this.receiver).r(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: tb0.b$b, reason: collision with other inner class name */
    /* synthetic */ class C2186b extends C7735q implements Function1<C7352e.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7352e.a aVar) {
            C7352e.a p02 = aVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C9796d) this.receiver).s(p02);
            return Unit.f71690a;
        }
    }

    /* renamed from: tb0.b$c */
    /* synthetic */ class c extends C7735q implements Function1<C7352e.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C7352e.a aVar) {
            C7352e.a p02 = aVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((C9796d) this.receiver).u(p02);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9794b(String str, kotlin.coroutines.d dVar, C9796d c9796d) {
        super(2, dVar);
        this.f99333e = c9796d;
        this.f99334f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9794b(this.f99334f, dVar, this.f99333e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9794b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (tb0.C9796d.w(r4, r14, r13) == r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        if (tb0.C9796d.w(r4, r14, r13) != r9) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str = this.f99334f;
        C9796d c9796d = this.f99333e;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f99332d;
        if (i11 == 0) {
            s.b(obj);
            try {
                if (CookieManager.getInstance() != null) {
                    try {
                        context = c9796d.f99339f;
                        WebView webView = new WebView(context);
                        w.a(webView, q.NO_CACHE);
                        webView.setWebViewClient(new C7352e(new a(1, c9796d, C9796d.class, "onInterceptUrl", "onInterceptUrl(Ljava/lang/String;)V", 0), null, new C2186b(1, c9796d, C9796d.class, "onNetworkError", "onNetworkError(Lru/ozon/id/nativeauth/web/OzonIdWebViewClient$OzonIdWebViewError;)V", 0), new c(1, c9796d, C9796d.class, "onWebViewError", "onWebViewError(Lru/ozon/id/nativeauth/web/OzonIdWebViewClient$OzonIdWebViewError;)V", 0)));
                        c9796d.f99340g = webView;
                    } catch (Throwable th2) {
                        C9796d.i(c9796d, Vb0.c.START_ERROR, str, th2);
                        s.h hVar = s.h.JsChallengeWebViewError;
                        this.f99332d = 2;
                    }
                    return Unit.f71690a;
                }
            } catch (Throwable unused) {
            }
            C9796d.q(c9796d, Vb0.c.NOT_FOUND, str);
            s.h hVar2 = s.h.JsChallengeNoWebViewError;
            this.f99332d = 1;
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
        return Unit.f71690a;
    }
}
