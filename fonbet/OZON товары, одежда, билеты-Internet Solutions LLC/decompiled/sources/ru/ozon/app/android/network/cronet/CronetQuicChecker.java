package ru.ozon.app.android.network.cronet;

import Ib.a;
import Sc.InterfaceC4008j;
import Sc.k;
import We.E;
import We.G;
import We.L;
import Ye.b;
import ei0.InterfaceC6369b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0001,BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'¨\u0006-"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetQuicChecker;", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/cronet/CronetPrefs;", "cronetPrefs", "Lqj/a;", "networkInfoProvider", "", "apiUrl", "LIb/a;", "LWe/E;", "simpleOkHttpClient", "simpleCronetOkHttpClient", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/cronet/CronetPrefs;Lqj/a;Ljava/lang/String;LIb/a;LIb/a;)V", "LWe/L;", "", "safeCloseBody", "(LWe/L;)V", "Lei0/b;", "ozonTracker", "launchQuicAvailabilityCheck", "(Lei0/b;)V", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/cronet/CronetPrefs;", "Lqj/a;", "Ljava/lang/String;", "LIb/a;", "Lxe/M;", "coroutineScope", "Lxe/M;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCheckInProgress", "Ljava/util/concurrent/atomic/AtomicBoolean;", "LWe/G;", "h2HeadRequest$delegate", "LSc/j;", "getH2HeadRequest", "()LWe/G;", "h2HeadRequest", "h3HeadRequest$delegate", "getH3HeadRequest", "h3HeadRequest", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetQuicChecker {

    @NotNull
    private final String apiUrl;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final CronetPrefs cronetPrefs;

    @NotNull
    private final FeatureService featureService;

    /* renamed from: h2HeadRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j h2HeadRequest;

    /* renamed from: h3HeadRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j h3HeadRequest;

    @NotNull
    private final AtomicBoolean isCheckInProgress;

    @NotNull
    private final C9067a networkInfoProvider;

    @NotNull
    private final a<E> simpleCronetOkHttpClient;

    @NotNull
    private final a<E> simpleOkHttpClient;

    public CronetQuicChecker(@NotNull FeatureService featureService, @NotNull CronetPrefs cronetPrefs, @NotNull C9067a networkInfoProvider, @NotNull String apiUrl, @NotNull a<E> simpleOkHttpClient, @NotNull a<E> simpleCronetOkHttpClient) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(cronetPrefs, "cronetPrefs");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        Intrinsics.checkNotNullParameter(simpleOkHttpClient, "simpleOkHttpClient");
        Intrinsics.checkNotNullParameter(simpleCronetOkHttpClient, "simpleCronetOkHttpClient");
        this.featureService = featureService;
        this.cronetPrefs = cronetPrefs;
        this.networkInfoProvider = networkInfoProvider;
        this.apiUrl = apiUrl;
        this.simpleOkHttpClient = simpleOkHttpClient;
        this.simpleCronetOkHttpClient = simpleCronetOkHttpClient;
        this.coroutineScope = CoroutineUtilsKt.getSafeScope();
        this.isCheckInProgress = new AtomicBoolean(false);
        this.h2HeadRequest = k.b(new CronetQuicChecker$h2HeadRequest$2(this));
        this.h3HeadRequest = k.b(new CronetQuicChecker$h3HeadRequest$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G getH2HeadRequest() {
        return (G) this.h2HeadRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G getH3HeadRequest() {
        return (G) this.h3HeadRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void safeCloseBody(L l11) {
        try {
            We.M c11 = l11.c();
            if (c11 != null) {
                b.e(c11);
            }
        } catch (Throwable unused) {
        }
    }

    public final void launchQuicAvailabilityCheck(InterfaceC6369b ozonTracker) {
        if (this.cronetPrefs.isQuicBroken() || this.isCheckInProgress.getAndSet(true)) {
            return;
        }
        C10727i.c(this.coroutineScope, null, null, new CronetQuicChecker$launchQuicAvailabilityCheck$1(this, ozonTracker, null), 3);
    }
}
