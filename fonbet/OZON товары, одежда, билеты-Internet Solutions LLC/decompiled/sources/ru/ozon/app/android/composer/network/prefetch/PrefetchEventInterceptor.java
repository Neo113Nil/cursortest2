package ru.ozon.app.android.composer.network.prefetch;

import Pc.a;
import Qj0.C3889i;
import Qj0.InterfaceC3888h;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/PrefetchEventInterceptor;", "LQj0/h;", "LPc/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureCheckerProvider", "<init>", "(LPc/a;)V", "LQj0/i;", "requestMeta", "", "intercept", "(LQj0/i;)Z", "LPc/a;", "joinRequests$delegate", "LSc/j;", "getJoinRequests", "()Z", "joinRequests", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrefetchEventInterceptor implements InterfaceC3888h {

    @NotNull
    private final a<FeatureChecker> featureCheckerProvider;

    /* renamed from: joinRequests$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j joinRequests;

    public PrefetchEventInterceptor(@NotNull a<FeatureChecker> featureCheckerProvider) {
        Intrinsics.checkNotNullParameter(featureCheckerProvider, "featureCheckerProvider");
        this.featureCheckerProvider = featureCheckerProvider;
        this.joinRequests = k.b(new PrefetchEventInterceptor$joinRequests$2(this));
    }

    private final boolean getJoinRequests() {
        return ((Boolean) this.joinRequests.getValue()).booleanValue();
    }

    @Override // Qj0.InterfaceC3888h
    public boolean intercept(@NotNull C3889i requestMeta) {
        Intrinsics.checkNotNullParameter(requestMeta, "requestMeta");
        return (getJoinRequests() || requestMeta.a().get("prefetch-for-caching") == null) ? false : true;
    }
}
