package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: com.ironsource.u5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4578u5 {
    public static final C4578u5 a = new C4578u5();

    private C4578u5() {
    }

    public static /* synthetic */ IronSourceError a(C4578u5 c4578u5, EnumC4223a8 enumC4223a8, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c4578u5.a(enumC4223a8, ironSourceError);
    }

    public final IronSourceError b() {
        return a(this, EnumC4223a8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError c() {
        return a(this, EnumC4223a8.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError d() {
        return a(this, EnumC4223a8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final IronSourceError e() {
        return a(this, EnumC4223a8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, EnumC4223a8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, EnumC4223a8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, EnumC4223a8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, EnumC4223a8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, EnumC4223a8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, EnumC4223a8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, EnumC4223a8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, EnumC4223a8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, EnumC4223a8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, EnumC4223a8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, EnumC4223a8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, EnumC4223a8.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, EnumC4223a8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, EnumC4223a8.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, EnumC4223a8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(EnumC4223a8 enumC4223a8, IronSourceError ironSourceError) {
        String c;
        if (ironSourceError != null) {
            c = enumC4223a8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + StringUtils.PROCESS_POSTFIX_DELIMITER + ironSourceError.getErrorMessage() + "'";
        } else {
            c = enumC4223a8.c();
        }
        return new IronSourceError(enumC4223a8.b(), c);
    }

    public final IronSourceError b(IronSourceError ironSourceError) {
        return a(EnumC4223a8.ISErrorLoadNetworkFailed, ironSourceError);
    }

    public final IronSourceError c(String str) {
        return a(EnumC4223a8.ISErrorLoadNetworkFailed, str);
    }

    public final IronSourceError d(String str) {
        return a(EnumC4223a8.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C4578u5 c4578u5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4578u5.b(str);
    }

    public final IronSourceError c(IronSourceError ironSourceError) {
        return a(EnumC4223a8.ISErrorShowNetworkFailed, ironSourceError);
    }

    public static /* synthetic */ IronSourceError c(C4578u5 c4578u5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4578u5.d(str);
    }

    public final IronSourceError b(String str) {
        return a(EnumC4223a8.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(EnumC4223a8 enumC4223a8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC4223a8.c();
        }
        return new IronSourceError(enumC4223a8.b(), str);
    }

    public final IronSourceError a(IronSourceError ironSourceError) {
        return a(EnumC4223a8.ISErrorInitNetworkFailed, ironSourceError);
    }

    public final IronSourceError a() {
        return a(this, EnumC4223a8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C4578u5 c4578u5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4578u5.a(str);
    }

    public final IronSourceError a(String str) {
        return a(EnumC4223a8.ISErrorBannerLoadNoConfig, str);
    }
}
