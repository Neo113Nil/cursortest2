package Rg;

import Ph.AbstractC1488z;
import Ph.InterfaceC1484x;
import Ph.P;
import Rh.AbstractC1561b;
import Rh.B;
import Rh.InterfaceC1562c;
import Rh.l;
import Rh.m;
import Rh.p;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import nh.AbstractC5737b;
import nh.C5736a;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

/* loaded from: classes3.dex */
public final class f extends WebSocketListener implements P {

    /* renamed from: a, reason: collision with root package name */
    public final OkHttpClient f10285a;

    /* renamed from: b, reason: collision with root package name */
    public final WebSocket.Factory f10286b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f10287c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1484x f10288d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1484x f10289e;

    /* renamed from: f, reason: collision with root package name */
    public final Rh.j f10290f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1484x f10291g;

    /* renamed from: h, reason: collision with root package name */
    public final B f10292h;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f10293n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10294o;

        /* renamed from: p, reason: collision with root package name */
        public int f10295p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f10296q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Request f10298s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Request request, Continuation continuation) {
            super(2, continuation);
            this.f10298s = request;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = f.this.new a(this.f10298s, continuation);
            aVar.f10296q = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1562c interfaceC1562c, Continuation continuation) {
            return ((a) create(interfaceC1562c, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
        
            if (r10 != r0) goto L24;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0080 -> B:8:0x0083). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC1562c interfaceC1562c;
            Request request;
            WebSocket.Factory factory;
            WebSocket newWebSocket;
            C5736a c5736a;
            WebSocket webSocket;
            Throwable th2;
            l it;
            boolean c10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f10295p;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    interfaceC1562c = (InterfaceC1562c) this.f10296q;
                    WebSocket.Factory factory2 = f.this.f10286b;
                    request = this.f10298s;
                    InterfaceC1484x interfaceC1484x = f.this.f10288d;
                    this.f10296q = interfaceC1562c;
                    this.f10293n = factory2;
                    this.f10294o = request;
                    this.f10295p = 1;
                    Object await = interfaceC1484x.await(this);
                    if (await != coroutine_suspended) {
                        factory = factory2;
                        obj = await;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    request = (Request) this.f10294o;
                    factory = (WebSocket.Factory) this.f10293n;
                    interfaceC1562c = (InterfaceC1562c) this.f10296q;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (l) this.f10294o;
                    c5736a = (C5736a) this.f10293n;
                    webSocket = (WebSocket) this.f10296q;
                    try {
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            try {
                                webSocket.close(c5736a.a(), c5736a.c());
                                return Unit.INSTANCE;
                            } finally {
                            }
                        }
                        AbstractC5737b abstractC5737b = (AbstractC5737b) it.next();
                        if (abstractC5737b instanceof AbstractC5737b.a) {
                            webSocket.send(ti.k.f65867c.i(abstractC5737b.a(), 0, abstractC5737b.a().length));
                        } else {
                            if (!(abstractC5737b instanceof AbstractC5737b.d)) {
                                if (!(abstractC5737b instanceof AbstractC5737b.C0860b)) {
                                    throw new k(abstractC5737b);
                                }
                                C5736a a10 = nh.c.a((AbstractC5737b.C0860b) abstractC5737b);
                                Intrinsics.checkNotNull(a10);
                                c10 = g.c(a10);
                                if (!c10) {
                                    c5736a = a10;
                                }
                                Unit unit = Unit.INSTANCE;
                                try {
                                    webSocket.close(c5736a.a(), c5736a.c());
                                    return unit;
                                } finally {
                                }
                            }
                            webSocket.send(new String(abstractC5737b.a(), Charsets.UTF_8));
                        }
                        this.f10296q = webSocket;
                        this.f10293n = c5736a;
                        this.f10294o = it;
                        this.f10295p = 2;
                        obj = it.b(this);
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            webSocket.close(c5736a.a(), c5736a.c());
                            throw th2;
                        } finally {
                        }
                    }
                }
                it = interfaceC1562c.d().iterator();
                webSocket = newWebSocket;
                this.f10296q = webSocket;
                this.f10293n = c5736a;
                this.f10294o = it;
                this.f10295p = 2;
                obj = it.b(this);
            } catch (Throwable th4) {
                webSocket = newWebSocket;
                th2 = th4;
                webSocket.close(c5736a.a(), c5736a.c());
                throw th2;
            }
            newWebSocket = factory.newWebSocket(request, (WebSocketListener) obj);
            c5736a = g.f10299a;
        }
    }

    public f(OkHttpClient engine, WebSocket.Factory webSocketFactory, Request engineRequest, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
        Intrinsics.checkNotNullParameter(engineRequest, "engineRequest");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f10285a = engine;
        this.f10286b = webSocketFactory;
        this.f10287c = coroutineContext;
        this.f10288d = AbstractC1488z.b(null, 1, null);
        this.f10289e = AbstractC1488z.b(null, 1, null);
        this.f10290f = m.b(0, null, null, 7, null);
        this.f10291g = AbstractC1488z.b(null, 1, null);
        this.f10292h = AbstractC1561b.b(this, null, 0, null, null, new a(engineRequest, null), 15, null);
    }

    public final InterfaceC1484x c() {
        return this.f10289e;
    }

    public B e() {
        return this.f10292h;
    }

    public final void f() {
        this.f10288d.A0(this);
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f10287c;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i10, String reason) {
        Object valueOf;
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        super.onClosed(webSocket, i10, reason);
        short s10 = (short) i10;
        this.f10291g.A0(new C5736a(s10, reason));
        B.a.a(this.f10290f, null, 1, null);
        B e10 = e();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WebSocket session closed with code ");
        C5736a.EnumC0858a a10 = C5736a.EnumC0858a.f58531b.a(s10);
        if (a10 == null || (valueOf = a10.toString()) == null) {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        sb2.append('.');
        e10.a(new CancellationException(sb2.toString()));
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int i10, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        super.onClosing(webSocket, i10, reason);
        short s10 = (short) i10;
        this.f10291g.A0(new C5736a(s10, reason));
        try {
            p.b(e(), new AbstractC5737b.C0860b(new C5736a(s10, reason)));
        } catch (Throwable unused) {
        }
        B.a.a(this.f10290f, null, 1, null);
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable t10, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t10, "t");
        super.onFailure(webSocket, t10, response);
        this.f10291g.k(t10);
        this.f10289e.k(t10);
        this.f10290f.a(t10);
        e().a(t10);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, ti.k bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        super.onMessage(webSocket, bytes);
        p.b(this.f10290f, new AbstractC5737b.a(true, bytes.x()));
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        super.onOpen(webSocket, response);
        this.f10289e.A0(response);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        super.onMessage(webSocket, text);
        Rh.j jVar = this.f10290f;
        byte[] bytes = text.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        p.b(jVar, new AbstractC5737b.d(true, bytes));
    }
}
