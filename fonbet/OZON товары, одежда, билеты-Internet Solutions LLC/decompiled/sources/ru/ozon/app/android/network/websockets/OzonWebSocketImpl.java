package ru.ozon.app.android.network.websockets;

import BZ.g;
import DJ.c;
import DJ.e;
import We.E;
import We.G;
import We.L;
import We.Q;
import We.S;
import hg.InterfaceC6948a;
import io.reactivex.EnumC7093a;
import io.reactivex.h;
import io.reactivex.i;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import qc.f;
import ru.ozon.app.android.network.websockets.OzonWebSocketImpl;
import ru.ozon.app.android.network.websockets.SocketEvent;
import sc.C9656b;
import sf.C9684j;
import wc.C10475D;
import wc.C10478G;
import wc.C10490k;
import wc.I;
import wc.InterfaceC10476E;
import wc.J;
import wc.N;
import wc.T;
import wc.y;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u000b0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/network/websockets/OzonWebSocketImpl;", "Lru/ozon/app/android/network/websockets/OzonWebSocket;", "LWe/E;", "baseOkHttpClient", "Lru/ozon/app/android/network/websockets/AppVisibility;", "appVisibility", "Lru/ozon/app/android/network/websockets/OzonWebSocketUrl;", "socketUrl", "<init>", "(LWe/E;Lru/ozon/app/android/network/websockets/AppVisibility;Lru/ozon/app/android/network/websockets/OzonWebSocketUrl;)V", "Lio/reactivex/h;", "Lru/ozon/app/android/network/websockets/SocketEvent;", "getSocketFlowable", "()Lio/reactivex/h;", "getSocketEvents", "", "bytes", "", "send", "([B)V", "Lru/ozon/app/android/network/websockets/OzonWebSocketUrl;", "LWe/Q;", "webSocket", "LWe/Q;", "okHttpClient", "LWe/E;", "kotlin.jvm.PlatformType", "sharedSubscription", "Lio/reactivex/h;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonWebSocketImpl implements OzonWebSocket {

    @NotNull
    private final E okHttpClient;

    @NotNull
    private final h<SocketEvent> sharedSubscription;

    @NotNull
    private final OzonWebSocketUrl socketUrl;
    private Q webSocket;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [wc.J] */
    public OzonWebSocketImpl(@NotNull E baseOkHttpClient, @NotNull AppVisibility appVisibility, @NotNull OzonWebSocketUrl socketUrl) {
        Intrinsics.checkNotNullParameter(baseOkHttpClient, "baseOkHttpClient");
        Intrinsics.checkNotNullParameter(appVisibility, "appVisibility");
        Intrinsics.checkNotNullParameter(socketUrl, "socketUrl");
        this.socketUrl = socketUrl;
        baseOkHttpClient.getClass();
        E.a aVar = new E.a(baseOkHttpClient);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.U(15L);
        this.okHttpClient = new E(aVar);
        h k11 = appVisibility.observe().toFlowable(EnumC7093a.ERROR).k(new e(new OzonWebSocketImpl$sharedSubscription$1(this), 5));
        k11.getClass();
        C9656b.d(1, "bufferSize");
        ?? m11 = J.m(k11);
        boolean z11 = m11 instanceof InterfaceC10476E;
        C10475D c10475d = m11;
        if (z11) {
            InterfaceC10476E interfaceC10476E = (InterfaceC10476E) m11;
            c10475d = new C10475D(interfaceC10476E.a(), interfaceC10476E.b());
        }
        C10478G c10478g = new C10478G(c10475d);
        Intrinsics.checkNotNullExpressionValue(c10478g, "refCount(...)");
        this.sharedSubscription = c10478g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h<SocketEvent> getSocketFlowable() {
        AtomicLong atomicLong = new AtomicLong();
        g gVar = new g(this, atomicLong);
        EnumC7093a enumC7093a = EnumC7093a.BUFFER;
        int i11 = h.f66520b;
        C9656b.c(enumC7093a, "mode is null");
        y f7 = new I(new T(new N(new C10490k(gVar, enumC7093a)), new c(OzonWebSocketImpl$getSocketFlowable$2.INSTANCE, 3)), new AJ.c(new OzonWebSocketImpl$getSocketFlowable$3(atomicLong), 2)).f(Mc.a.b());
        Intrinsics.checkNotNullExpressionValue(f7, "observeOn(...)");
        return f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSocketFlowable$lambda$3(final OzonWebSocketImpl ozonWebSocketImpl, final AtomicLong atomicLong, final i emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        if (emitter.isCancelled()) {
            return;
        }
        emitter.onNext(SocketEvent.Connecting.INSTANCE);
        Lm0.a.f17149a.d("Web socket: Connecting", new Object[0]);
        G.a aVar = new G.a();
        aVar.k(ozonWebSocketImpl.socketUrl.getUrl());
        Map<String, String> headers = ozonWebSocketImpl.socketUrl.getHeaders();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        ozonWebSocketImpl.webSocket = ozonWebSocketImpl.okHttpClient.x(aVar.b(), new S() { // from class: ru.ozon.app.android.network.websockets.OzonWebSocketImpl$getSocketFlowable$1$2
            @Override // We.S
            public void onFailure(Q webSocket, Throwable t2, L response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(t2, "t");
                if (emitter.isCancelled()) {
                    Lm0.a.f17149a.d("Web socket: Disconnected", new Object[0]);
                    return;
                }
                Lm0.a.f17149a.d("Web socket: error " + t2, new Object[0]);
                emitter.onNext(new SocketEvent.Error(t2));
            }

            @Override // We.S
            public void onMessage(Q webSocket, String text) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(text, "text");
                Lm0.a.f17149a.d(Nk.a.b("Web socket: Message received -> ", text), new Object[0]);
                emitter.onNext(new SocketEvent.Message(new JSONObject(text)));
            }

            @Override // We.S
            public void onOpen(Q webSocket, L response) {
                Intrinsics.checkNotNullParameter(webSocket, "webSocket");
                Intrinsics.checkNotNullParameter(response, "response");
                atomicLong.set(0L);
                Lm0.a.f17149a.d("Web socket: Connected", new Object[0]);
                emitter.onNext(SocketEvent.Connected.INSTANCE);
            }
        });
        emitter.a(new f() { // from class: SA.a
            @Override // qc.f
            public final void cancel() {
                OzonWebSocketImpl.getSocketFlowable$lambda$3$lambda$2(OzonWebSocketImpl.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSocketFlowable$lambda$3$lambda$2(OzonWebSocketImpl ozonWebSocketImpl) {
        Q q11 = ozonWebSocketImpl.webSocket;
        if (q11 != null) {
            q11.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSocketFlowable$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6948a getSocketFlowable$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (InterfaceC6948a) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6948a sharedSubscription$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (InterfaceC6948a) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.network.websockets.OzonWebSocket
    @NotNull
    public h<SocketEvent> getSocketEvents() {
        return this.sharedSubscription;
    }

    @Override // ru.ozon.app.android.network.websockets.OzonWebSocket
    public void send(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Q q11 = this.webSocket;
        if (q11 != null) {
            C9684j c9684j = C9684j.f98719d;
            q11.c(C9684j.a.d(bytes));
        }
    }
}
