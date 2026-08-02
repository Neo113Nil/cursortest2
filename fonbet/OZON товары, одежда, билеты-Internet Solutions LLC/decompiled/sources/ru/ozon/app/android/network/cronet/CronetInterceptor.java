package ru.ozon.app.android.network.cronet;

import Ha.c;
import Ja.i;
import Ja.j;
import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.G;
import We.InterfaceC4865g;
import We.L;
import Ya.a;
import Ya.b;
import ei0.InterfaceC6369b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.r;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.H3CheckEnabled;
import ru.ozon.app.android.network.cronet.metrics.CronetMetricsPayloadKey;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B7\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u0019*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LYa/b;", "LYa/a;", "LIb/a;", "Lru/ozon/app/android/network/cronet/CronetClient;", "cronetClient", "Lru/ozon/app/android/network/cronet/CronetConfig;", "cronetConfig", "Lru/ozon/app/android/network/cronet/CronetQuicChecker;", "cronetQuicChecker", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lei0/b;", "ozonTracker", "<init>", "(LIb/a;Lru/ozon/app/android/network/cronet/CronetConfig;Lru/ozon/app/android/network/cronet/CronetQuicChecker;Lru/ozon/app/android/network/abtool/FeatureService;Lei0/b;)V", "Ljava/io/IOException;", "toOkHttpException", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lorg/chromium/net/r;", "(Lorg/chromium/net/r;)Ljava/io/IOException;", "LWe/g;", "LJa/i;", "httpRequest", "Lxe/B0;", "launchCancellationStatusCheck", "(LWe/g;LJa/i;)Lxe/B0;", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LIb/a;", "Lru/ozon/app/android/network/cronet/CronetConfig;", "Lru/ozon/app/android/network/cronet/CronetQuicChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lei0/b;", "Lxe/M;", "coroutineScope", "Lxe/M;", "LGa/a;", "knet$delegate", "LSc/j;", "getKnet", "()LGa/a;", "knet", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetInterceptor extends BXInterceptor implements b, a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final Ib.a<CronetClient> cronetClient;

    @NotNull
    private final CronetConfig cronetConfig;

    @NotNull
    private final CronetQuicChecker cronetQuicChecker;

    @NotNull
    private final FeatureService featureService;

    /* renamed from: knet$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j knet;
    private final InterfaceC6369b ozonTracker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetInterceptor$Companion;", "", "<init>", "()V", "ACCEPT_ENCODING_HEADER_NAME", "", "CONTENT_DECODING_HEADER_NAME", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CronetInterceptor(@NotNull Ib.a<CronetClient> cronetClient, @NotNull CronetConfig cronetConfig, @NotNull CronetQuicChecker cronetQuicChecker, @NotNull FeatureService featureService, InterfaceC6369b interfaceC6369b) {
        Intrinsics.checkNotNullParameter(cronetClient, "cronetClient");
        Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
        Intrinsics.checkNotNullParameter(cronetQuicChecker, "cronetQuicChecker");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.cronetClient = cronetClient;
        this.cronetConfig = cronetConfig;
        this.cronetQuicChecker = cronetQuicChecker;
        this.featureService = featureService;
        this.ozonTracker = interfaceC6369b;
        this.coroutineScope = CoroutineUtilsKt.getSafeScope();
        this.knet = k.b(new CronetInterceptor$knet$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ga.a getKnet() {
        return (Ga.a) this.knet.getValue();
    }

    private final B0 launchCancellationStatusCheck(InterfaceC4865g interfaceC4865g, i iVar) {
        return C10727i.c(this.coroutineScope, null, null, new CronetInterceptor$launchCancellationStatusCheck$1(interfaceC4865g, this, iVar, null), 3);
    }

    private final IOException toOkHttpException(IOException iOException) {
        if (!(iOException.getCause() instanceof r)) {
            return iOException instanceof Ha.b ? new ConnectException(iOException.getMessage()) : ((iOException instanceof c) || (iOException instanceof Ha.a)) ? new ProtocolException(iOException.getMessage()) : iOException;
        }
        Throwable cause = iOException.getCause();
        Intrinsics.g(cause, "null cannot be cast to non-null type org.chromium.net.NetworkException");
        return toOkHttpException((r) cause);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected L onIntercept(@NotNull B.a chain) {
        CronetInterceptor cronetInterceptor;
        Throwable th2;
        B0 b02;
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            try {
                try {
                    G request = chain.request();
                    try {
                        request.getClass();
                        G.a aVar = new G.a(request);
                        aVar.h("accept-encoding");
                        i knetRequest = toKnetRequest(aVar.b(), false);
                        if (knetRequest != null) {
                            i n11 = knetRequest.n(CronetMetricsPayloadKey.INSTANCE, this.cronetConfig.getCronetMetricsKey());
                            String invoke = this.cronetConfig.getGetOkHttpRequestId().invoke(request);
                            if (invoke != null) {
                                try {
                                    n11 = n11.n(CronetRequestIdKey.INSTANCE, invoke);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    b02 = null;
                                    if (b02 == null) {
                                        throw th2;
                                    }
                                    if (!b02.isActive()) {
                                        throw th2;
                                    }
                                    b02.j(null);
                                    throw th2;
                                }
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            b02 = launchCancellationStatusCheck(chain.call(), n11);
                            try {
                                j a11 = getKnet().a(n11);
                                b02.j(null);
                                cronetInterceptor = this;
                                try {
                                    L okResponse = cronetInterceptor.toOkResponse(a11, request, currentTimeMillis, false);
                                    if (okResponse == null) {
                                        throw new c("Failed quic-to-okhttp response mapping for: " + request.j());
                                    }
                                    L.a aVar2 = new L.a(okResponse);
                                    aVar2.q("content-encoding");
                                    L c11 = aVar2.c();
                                    if (b02.isActive()) {
                                        b02.j(null);
                                    }
                                    return c11;
                                } catch (IOException e11) {
                                    e = e11;
                                    IOException okHttpException = toOkHttpException(e);
                                    if (!Intrinsics.d(chain.request().i(Object.class), "quic_check_request_tag") && cronetInterceptor.featureService.getBooleanKey(H3CheckEnabled.INSTANCE) && ((okHttpException instanceof SocketTimeoutException) || (okHttpException instanceof ProtocolException))) {
                                        cronetInterceptor.cronetQuicChecker.launchQuicAvailabilityCheck(cronetInterceptor.ozonTracker);
                                    }
                                    throw okHttpException;
                                }
                            } catch (IOException e12) {
                                e = e12;
                                cronetInterceptor = this;
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                if (b02 == null) {
                                }
                            }
                        } else {
                            cronetInterceptor = this;
                            try {
                                throw new c("Failed okhttp-to-quic request mapping for: " + request.j());
                            } catch (IOException e13) {
                                e = e13;
                                IOException okHttpException2 = toOkHttpException(e);
                                if (!Intrinsics.d(chain.request().i(Object.class), "quic_check_request_tag")) {
                                    cronetInterceptor.cronetQuicChecker.launchQuicAvailabilityCheck(cronetInterceptor.ozonTracker);
                                }
                                throw okHttpException2;
                            } catch (Throwable th5) {
                                th = th5;
                                th2 = th;
                                b02 = null;
                                if (b02 == null) {
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (IOException e14) {
            e = e14;
            cronetInterceptor = this;
        }
    }

    @Override // Ya.b
    public i toKnetRequest(@NotNull G g10, boolean z11) {
        return b.a.a(g10, z11);
    }

    @Override // Ya.a
    public L toOkResponse(@NotNull j jVar, @NotNull G g10, long j11, boolean z11) {
        return a.C0644a.b(jVar, g10, j11, z11);
    }

    private final IOException toOkHttpException(r rVar) {
        switch (rVar.a()) {
        }
        return new InterruptedIOException(rVar.getMessage());
    }
}
