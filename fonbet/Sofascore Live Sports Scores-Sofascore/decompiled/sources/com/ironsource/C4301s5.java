package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4301s5 {

    @NotNull
    public static final C4301s5 a = new C4301s5();

    private C4301s5() {
    }

    private final IronSourceError a(X7 x7, IronSourceError ironSourceError) {
        String c;
        if (ironSourceError != null) {
            c = x7.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            c = x7.c();
        }
        return new IronSourceError(x7.b(), c);
    }

    public static /* synthetic */ IronSourceError b(C4301s5 c4301s5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4301s5.b(str);
    }

    public static /* synthetic */ IronSourceError c(C4301s5 c4301s5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4301s5.d(str);
    }

    @NotNull
    public final IronSourceError d() {
        return a(this, X7.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    @NotNull
    public final IronSourceError e() {
        return a(this, X7.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    @NotNull
    public final IronSourceError f() {
        return a(this, X7.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    @NotNull
    public final IronSourceError g() {
        return a(this, X7.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError h() {
        return a(this, X7.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    @NotNull
    public final IronSourceError i() {
        return a(this, X7.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    @NotNull
    public final IronSourceError j() {
        return a(this, X7.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError k() {
        return a(this, X7.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError l() {
        return a(this, X7.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    @NotNull
    public final IronSourceError m() {
        return a(this, X7.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError n() {
        return a(this, X7.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    @NotNull
    public final IronSourceError o() {
        return a(this, X7.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError p() {
        return a(this, X7.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    @NotNull
    public final IronSourceError q() {
        return a(this, X7.ISErrorLoadNullADM, null, 2, null);
    }

    @NotNull
    public final IronSourceError r() {
        return a(this, X7.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    @NotNull
    public final IronSourceError s() {
        return a(this, X7.ISErrorLoadTimedOut, null, 2, null);
    }

    @NotNull
    public final IronSourceError t() {
        return a(this, X7.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    @NotNull
    public final IronSourceError d(@Nullable String str) {
        return a(X7.ISErrorRewardedLoadNoConfig, str);
    }

    @NotNull
    public final IronSourceError b(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        return a(X7.ISErrorLoadNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError c(@NotNull String str) {
        str.getClass();
        return a(X7.ISErrorLoadNetworkFailed, str);
    }

    @NotNull
    public final IronSourceError b() {
        return a(this, X7.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    @NotNull
    public final IronSourceError c(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        return a(X7.ISErrorShowNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError b(@Nullable String str) {
        return a(X7.ISErrorInterstitialLoadNoConfig, str);
    }

    @NotNull
    public final IronSourceError c() {
        return a(this, X7.ISErrorInitInvalidResponse, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C4301s5 c4301s5, X7 x7, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c4301s5.a(x7, ironSourceError);
    }

    private final IronSourceError a(X7 x7, String str) {
        if (str == null || str.length() == 0) {
            str = x7.c();
        }
        return new IronSourceError(x7.b(), str);
    }

    @NotNull
    public final IronSourceError a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        return a(X7.ISErrorInitNetworkFailed, ironSourceError);
    }

    @NotNull
    public final IronSourceError a() {
        return a(this, X7.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C4301s5 c4301s5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4301s5.a(str);
    }

    @NotNull
    public final IronSourceError a(@Nullable String str) {
        return a(X7.ISErrorBannerLoadNoConfig, str);
    }
}
