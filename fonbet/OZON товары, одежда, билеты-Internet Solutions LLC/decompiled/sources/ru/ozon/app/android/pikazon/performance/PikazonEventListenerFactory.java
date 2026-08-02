package ru.ozon.app.android.pikazon.performance;

import Qj0.D;
import We.InterfaceC4865g;
import We.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.flags.QuicPikazonEnabledFlag;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pikazon/performance/PikazonEventListenerFactory;", "LWe/v$c;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LQj0/D;", "ozonEventListenerFactory", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;LQj0/D;)V", "LWe/g;", "call", "LWe/v;", "create", "(LWe/g;)LWe/v;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LQj0/D;", "pikazon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonEventListenerFactory implements v.c {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final D ozonEventListenerFactory;

    public PikazonEventListenerFactory(@NotNull FeatureChecker featureChecker, @NotNull D ozonEventListenerFactory) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(ozonEventListenerFactory, "ozonEventListenerFactory");
        this.featureChecker = featureChecker;
        this.ozonEventListenerFactory = ozonEventListenerFactory;
    }

    @Override // We.v.c
    @NotNull
    public v create(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return this.featureChecker.isEnabled(QuicPikazonEnabledFlag.INSTANCE) ? v.NONE : this.ozonEventListenerFactory.create(call);
    }
}
