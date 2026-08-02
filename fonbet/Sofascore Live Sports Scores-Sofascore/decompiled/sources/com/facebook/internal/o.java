package com.facebook.internal;

import android.R;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum o {
    Unknown(-1),
    Core(0),
    AppEvents(C.DEFAULT_BUFFER_SEGMENT_SIZE),
    CodelessEvents(65792),
    CloudBridge(67584),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    ProtectedMode(66564),
    MACARuleMatching(66565),
    BlocklistEvents(66566),
    FilterRedactedEvents(66567),
    FilterSensitiveParams(66568),
    StdParamEnforcement(R.attr.trimPathEnd),
    BannedParamFiltering(R.attr.trimPathOffset),
    VVP(66571),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    IapLoggingLib5To7(67330),
    AndroidManualImplicitPurchaseDedupe(67331),
    AndroidManualImplicitSubsDedupe(67332),
    AndroidIAPSubscriptionAutoLogging(67333),
    Instrument(131072),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    /* JADX INFO: Fake field, exist only in values array */
    Login(262144),
    /* JADX INFO: Fake field, exist only in values array */
    ReferrerForDeepLink(327680),
    GPSARATriggers(393216),
    GPSPACAProcessing(458752),
    GPSTopicsObservation(524288),
    /* JADX INFO: Fake field, exist only in values array */
    ReferrerForDeepLink(589824),
    /* JADX INFO: Fake field, exist only in values array */
    Login(C.DEFAULT_MUXED_BUFFER_SIZE),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    /* JADX INFO: Fake field, exist only in values array */
    LoginSSO(R.string.cancel),
    /* JADX INFO: Fake field, exist only in values array */
    Share(33554432);

    public final int a;

    o(int i) {
        this.a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (ordinal()) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "AppEventsCloudbridge";
            case 5:
                return "RestrictiveDataFiltering";
            case 6:
                return "AAM";
            case 7:
                return "PrivacyProtection";
            case 8:
                return "SuggestedEvents";
            case 9:
                return "IntelligentIntegrity";
            case 10:
                return "ModelRequest";
            case 11:
                return "ProtectedMode";
            case 12:
                return "MACARuleMatching";
            case 13:
                return "BlocklistEvents";
            case 14:
                return "FilterRedactedEvents";
            case 15:
                return "FilterSensitiveParams";
            case 16:
                return "StdParamEnforcement";
            case 17:
                return "BannedParamFiltering";
            case 18:
                return "VVP";
            case 19:
                return "EventDeactivation";
            case 20:
                return "OnDeviceEventProcessing";
            case 21:
                return "OnDevicePostInstallEventProcessing";
            case 22:
                return "IAPLogging";
            case 23:
                return "IAPLoggingLib2";
            case 24:
                return "IAPLoggingLib5To7";
            case 25:
                return "AndroidManualImplicitPurchaseDedupe";
            case 26:
                return "AndroidManualImplicitSubsDedupe";
            case 27:
                return "AndroidIAPSubscriptionAutoLogging";
            case 28:
                return "Instrument";
            case 29:
                return "CrashReport";
            case 30:
                return "CrashShield";
            case 31:
                return "ThreadCheck";
            case 32:
                return "ErrorReport";
            case 33:
                return "AnrReport";
            case 34:
                return "Monitoring";
            case 35:
                return "ServiceUpdateCompliance";
            case 36:
                return "Megatron";
            case 37:
                return "Elora";
            case 38:
                return "GPSARATriggers";
            case 39:
                return "GPSPACAProcessing";
            case 40:
                return "GPSTopicsObservation";
            case 41:
                return "ReferrerForDeepLink";
            case 42:
                return "LoginKit";
            case 43:
                return "ChromeCustomTabsPrefetching";
            case 44:
                return "IgnoreAppSwitchToLoggedOut";
            case 45:
                return "BypassAppSwitch";
            case 46:
                return "LoginSSO";
            case 47:
                return "ShareKit";
            default:
                return "unknown";
        }
    }
}
