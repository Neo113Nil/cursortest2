package sb0;

import Sc.C4001c;
import Sc.InterfaceC4008j;
import Vb0.b;
import android.webkit.CookieManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import jd0.C7352e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import ob0.C8685A;
import ob0.s;
import org.jetbrains.annotations.NotNull;
import td0.j;

/* renamed from: sb0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9649b extends rb0.c<String, s.b> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<yc0.c> f98509e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8685A> f98510f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final a f98511g;

    /* renamed from: sb0.b$a */
    public static final class a implements InterfaceC9652e {
        a() {
        }

        @Override // sb0.InterfaceC9652e
        public final void a() {
            C9649b.k(C9649b.this, s.c.CaptchaChallengeBlock);
        }

        @Override // sb0.InterfaceC9652e
        public final void b(C7352e.a error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Vb0.c cVar = Vb0.c.NETWORK_ERROR;
            C9649b c9649b = C9649b.this;
            C9649b.f(c9649b, cVar, error);
            C9649b.h(c9649b, s.c.CaptchaChallengeNetworkError, error);
        }

        @Override // sb0.InterfaceC9652e
        public final void c(C7352e.a error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Vb0.c cVar = Vb0.c.RENDER_ERROR;
            C9649b c9649b = C9649b.this;
            C9649b.f(c9649b, cVar, error);
            C9649b.h(c9649b, s.c.CaptchaChallengeWebViewError, error);
        }

        @Override // sb0.InterfaceC9652e
        public final void onClose() {
            C9649b.k(C9649b.this, s.c.CaptchaChallengeWebViewClosed);
        }

        @Override // sb0.InterfaceC9652e
        public final void onSuccess() {
            C9649b.k(C9649b.this, s.c.CaptchaChallengeSuccess);
        }
    }

    public C9649b(@NotNull InterfaceC4008j<yc0.c> headersProvider, @NotNull InterfaceC4008j<C8685A> antibotRouter) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        Intrinsics.checkNotNullParameter(antibotRouter, "antibotRouter");
        this.f98509e = headersProvider;
        this.f98510f = antibotRouter;
        this.f98511g = new a();
    }

    public static final void f(C9649b c9649b, Vb0.c cVar, C7352e.a aVar) {
        c9649b.getClass();
        b.a aVar2 = Vb0.b.f28514a;
        String a11 = cVar.a();
        Map j11 = U.j(new Pair("data", aVar.b()), new Pair(ImagesContract.URL, aVar.c()), new Pair("error_code", aVar.a()), new Pair("trace_id", aVar.d()), new Pair("webview_type", Vb0.d.CAPTCHA));
        aVar2.getClass();
        b.a.a(a11, j11);
    }

    public static final void h(C9649b c9649b, s.c cVar, C7352e.a aVar) {
        c9649b.getClass();
        c9649b.e(new s.b(cVar, aVar != null ? aVar.e() : null));
    }

    private static void i(Vb0.c cVar, String str, Throwable th2) {
        b.a aVar = Vb0.b.f28514a;
        String a11 = cVar.a();
        Tc.d builder = new Tc.d();
        builder.put(ImagesContract.URL, str);
        if (th2 != null) {
            builder.put("data", C4001c.b(th2));
            builder.put("trace_id", j.b(th2));
        }
        builder.put("webview_type", Vb0.d.CAPTCHA);
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.d u11 = builder.u();
        aVar.getClass();
        b.a.a(a11, u11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, kotlin.coroutines.jvm.internal.c cVar) {
        C9648a c9648a;
        int i11;
        C9649b c9649b;
        if (cVar instanceof C9648a) {
            c9648a = (C9648a) cVar;
            int i12 = c9648a.f98508h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9648a.f98508h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9648a.f98506f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9648a.f98508h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    try {
                        if (CookieManager.getInstance() != null) {
                            try {
                                C8685A value = this.f98510f.getValue();
                                Map<String, String> e11 = this.f98509e.getValue().e();
                                a aVar2 = this.f98511g;
                                c9648a.f98504d = this;
                                c9648a.f98505e = str;
                                c9648a.f98508h = 1;
                                if (value.g(str, e11, aVar2, c9648a) == aVar) {
                                    return aVar;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c9649b = this;
                                Vb0.c cVar2 = Vb0.c.START_ERROR;
                                c9649b.getClass();
                                i(cVar2, str, th);
                                k(c9649b, s.c.CaptchaChallengeWebViewError);
                                return Unit.f71690a;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    i(Vb0.c.NOT_FOUND, str, null);
                    k(this, s.c.CaptchaChallengeNoWebViewError);
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c9648a.f98505e;
                c9649b = c9648a.f98504d;
                try {
                    Sc.s.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    Vb0.c cVar22 = Vb0.c.START_ERROR;
                    c9649b.getClass();
                    i(cVar22, str, th);
                    k(c9649b, s.c.CaptchaChallengeWebViewError);
                    return Unit.f71690a;
                }
                return Unit.f71690a;
            }
        }
        c9648a = new C9648a(this, cVar);
        Object obj2 = c9648a.f98506f;
        Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9648a.f98508h;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    static void k(C9649b c9649b, s.c cVar) {
        c9649b.getClass();
        c9649b.e(new s.b(cVar, null));
    }

    @Override // rb0.c
    public final Object d(String str, kotlin.coroutines.d dVar) {
        Object j11 = j(str, (kotlin.coroutines.jvm.internal.c) dVar);
        return j11 == Wc.a.COROUTINE_SUSPENDED ? j11 : Unit.f71690a;
    }
}
