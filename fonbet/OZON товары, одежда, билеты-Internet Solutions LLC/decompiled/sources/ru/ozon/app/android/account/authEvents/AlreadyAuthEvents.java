package ru.ozon.app.android.account.authEvents;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;", "", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "deeplink", "redirectDeeplink", "", "sendNonFatal", "(Ljava/lang/String;Ljava/lang/String;)V", "emit", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lxe/M;", "coroutineScope", "Lxe/M;", "LAe/w0;", "_flow", "LAe/w0;", "LAe/B0;", "flow", "LAe/B0;", "getFlow", "()LAe/B0;", "AlreadyAuthException", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AlreadyAuthEvents {

    @NotNull
    private final w0<Unit> _flow;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final B0<Unit> flow;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents$AlreadyAuthException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class AlreadyAuthException extends Exception {

        @NotNull
        public static final AlreadyAuthException INSTANCE = new AlreadyAuthException();

        private AlreadyAuthException() {
        }
    }

    public AlreadyAuthEvents(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.coroutineScope = N.a(C10720e0.a());
        C0 b11 = E0.b(0, 0, null, 7);
        this._flow = b11;
        this.flow = C2399j.a(b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendNonFatal(String deeplink, String redirectDeeplink) {
        BxLogger bxLogger = BxLogger.INSTANCE;
        bxLogger.putKey("deeplink", String.valueOf(deeplink));
        bxLogger.putKey("redirectDeeplink", String.valueOf(redirectDeeplink));
        bxLogger.logException(AlreadyAuthException.INSTANCE);
    }

    public final void emit(String deeplink, String redirectDeeplink) {
        C10727i.c(this.coroutineScope, null, null, new AlreadyAuthEvents$emit$1(this, deeplink, redirectDeeplink, null), 3);
    }

    @NotNull
    public final B0<Unit> getFlow() {
        return this.flow;
    }
}
