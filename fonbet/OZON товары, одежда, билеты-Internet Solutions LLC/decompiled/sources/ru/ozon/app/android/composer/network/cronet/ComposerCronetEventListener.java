package ru.ozon.app.android.composer.network.cronet;

import We.InterfaceC4865g;
import We.L;
import We.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/composer/network/cronet/ComposerCronetEventListener;", "LWe/v;", "ozonEventListener", "<init>", "(LWe/v;)V", "LWe/g;", "call", "", "callStart", "(LWe/g;)V", "LWe/L;", "response", "cacheHit", "(LWe/g;LWe/L;)V", "LWe/v;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerCronetEventListener extends v {

    @NotNull
    private final v ozonEventListener;

    public ComposerCronetEventListener(@NotNull v ozonEventListener) {
        Intrinsics.checkNotNullParameter(ozonEventListener, "ozonEventListener");
        this.ozonEventListener = ozonEventListener;
    }

    @Override // We.v
    public void cacheHit(@NotNull InterfaceC4865g call, @NotNull L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        this.ozonEventListener.cacheHit(call, response);
    }

    @Override // We.v
    public void callStart(@NotNull InterfaceC4865g call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.ozonEventListener.callStart(call);
    }
}
