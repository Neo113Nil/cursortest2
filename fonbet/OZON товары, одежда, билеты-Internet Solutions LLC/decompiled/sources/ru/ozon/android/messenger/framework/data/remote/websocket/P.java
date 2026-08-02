package ru.ozon.android.messenger.framework.data.remote.websocket;

import De.C2862e;
import Lm0.a;
import We.A;
import We.C;
import We.G;
import We.InterfaceC4865g;
import We.K;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;
import xe.H0;
import xe.X0;

/* loaded from: classes10.dex */
public final class P implements We.Q {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final We.C f87941g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final We.A f87942h;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f87943a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final We.E f87944b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final We.G f87945c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2862e f87946d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f87947e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final c.Companion f87948f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.WebSocketHttpProxy$send$1", f = "WebSocketHttpProxy.kt", l = {102}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f87949d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f87950e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f87951f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ P f87952g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i11, P p11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f87950e = str;
            this.f87951f = i11;
            this.f87952g = p11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f87950e, this.f87951f, this.f87952g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f87949d;
            P p11 = this.f87952g;
            int i12 = this.f87951f;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    K.Companion companion = We.K.INSTANCE;
                    We.C c11 = P.f87941g;
                    companion.getClass();
                    String str = this.f87950e;
                    We.J b11 = K.Companion.b(str, c11);
                    G.a aVar2 = new G.a();
                    aVar2.j(P.f87942h);
                    aVar2.f(b11, "POST");
                    We.G b12 = aVar2.b();
                    a.b bVar = Lm0.a.f17149a;
                    bVar.b("WebSocketHttpProxy");
                    bVar.d(i12 + " Sending %s via http", str);
                    this.f87949d = 1;
                    obj = P.d(p11, b12, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                We.L l11 = (We.L) obj;
                a.b bVar2 = Lm0.a.f17149a;
                bVar2.b("WebSocketHttpProxy");
                bVar2.d(i12 + " Send via http returned code %d, body: %s", new Integer(l11.m()), l11.c());
                We.M c12 = l11.c();
                String string = c12 != null ? c12.string() : null;
                if (l11.v() && string != null && string.length() != 0) {
                    p11.f87943a.onMessage(p11, string);
                }
                We.M c13 = l11.c();
                if (c13 != null) {
                    c13.close();
                }
            } catch (Exception e11) {
                a.b bVar3 = Lm0.a.f17149a;
                bVar3.b("WebSocketHttpProxy");
                bVar3.e(e11, i12 + " Send via http failed", new Object[0]);
            }
            return Unit.f71690a;
        }
    }

    static {
        We.C.f33536g.getClass();
        f87941g = C.a.a("application/json");
        We.A.f33515l.getClass();
        f87942h = A.b.c("http://messenger-mock.ozon.ru");
    }

    public P(@NotNull J listener, @NotNull We.E okHttpClient) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.f87943a = listener;
        this.f87944b = okHttpClient;
        G.a aVar = new G.a();
        aVar.j(f87942h);
        aVar.f(null, "GET");
        this.f87945c = aVar.b();
        CoroutineContext d11 = CoroutineContext.Element.a.d(new xe.L("WebSocketHttpMock scope"), (H0) X0.b());
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = xe.N.a(d11.plus(He.b.f10879b));
        this.f87946d = a11;
        this.f87948f = kotlin.random.c.INSTANCE;
        C10727i.c(a11, null, null, new M(this, null), 3);
    }

    public static final Object d(P p11, We.G g10, kotlin.coroutines.d frame) {
        p11.getClass();
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        InterfaceC4865g a11 = p11.f87944b.a(g10);
        c10737n.q(new N(a11));
        a11.E0(new O(c10737n));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    @Override // We.Q
    public final boolean a(int i11, String str) {
        xe.N.c(this.f87946d, null);
        if (this.f87947e) {
            return false;
        }
        this.f87947e = true;
        return true;
    }

    @Override // We.Q
    public final boolean b(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.f87947e) {
            return false;
        }
        C10727i.c(this.f87946d, null, null, new a(text, this.f87948f.d(), this, null), 3);
        return true;
    }

    @Override // We.Q
    public final boolean c(@NotNull C9684j bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset(...)");
        return b(bytes.C(defaultCharset));
    }

    @Override // We.Q
    public final void cancel() {
        xe.N.c(this.f87946d, null);
        this.f87947e = true;
    }
}
