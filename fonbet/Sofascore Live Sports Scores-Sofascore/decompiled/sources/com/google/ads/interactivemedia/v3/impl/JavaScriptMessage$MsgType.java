package com.google.ads.interactivemedia.v3.impl;

import androidx.annotation.NonNull;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class JavaScriptMessage$MsgType {
    private static final /* synthetic */ JavaScriptMessage$MsgType[] $VALUES;

    @NonNull
    public static final JavaScriptMessage$MsgType activate;

    @NonNull
    public static final JavaScriptMessage$MsgType adBreakEnded;

    @NonNull
    public static final JavaScriptMessage$MsgType adBreakFetchError;

    @NonNull
    public static final JavaScriptMessage$MsgType adBreakReady;

    @NonNull
    public static final JavaScriptMessage$MsgType adBreakStarted;

    @NonNull
    public static final JavaScriptMessage$MsgType adBuffering;

    @NonNull
    public static final JavaScriptMessage$MsgType adCanPlay;

    @NonNull
    public static final JavaScriptMessage$MsgType adMetadata;

    @NonNull
    public static final JavaScriptMessage$MsgType adPeriodEnded;

    @NonNull
    public static final JavaScriptMessage$MsgType adPeriodStarted;

    @NonNull
    public static final JavaScriptMessage$MsgType adProgress;

    @NonNull
    public static final JavaScriptMessage$MsgType adsLoaded;

    @NonNull
    public static final JavaScriptMessage$MsgType allAdsCompleted;

    @NonNull
    public static final JavaScriptMessage$MsgType appBackgrounding;

    @NonNull
    public static final JavaScriptMessage$MsgType appForegrounding;

    @NonNull
    public static final JavaScriptMessage$MsgType appStateChanged;

    @NonNull
    public static final JavaScriptMessage$MsgType click;

    @NonNull
    public static final JavaScriptMessage$MsgType clickSignalRequest;

    @NonNull
    public static final JavaScriptMessage$MsgType clickSignalResponse;

    @NonNull
    public static final JavaScriptMessage$MsgType companionView;

    @NonNull
    public static final JavaScriptMessage$MsgType complete;

    @NonNull
    public static final JavaScriptMessage$MsgType contentComplete;

    @NonNull
    public static final JavaScriptMessage$MsgType contentPauseRequested;

    @NonNull
    public static final JavaScriptMessage$MsgType contentResumeRequested;

    @NonNull
    public static final JavaScriptMessage$MsgType contentTimeUpdate;

    @NonNull
    public static final JavaScriptMessage$MsgType csi;

    @NonNull
    public static final JavaScriptMessage$MsgType cuepointsChanged;

    @NonNull
    public static final JavaScriptMessage$MsgType destroy;

    @NonNull
    public static final JavaScriptMessage$MsgType discardAdBreak;

    @NonNull
    public static final JavaScriptMessage$MsgType displayCompanions;

    @NonNull
    public static final JavaScriptMessage$MsgType displayPauseAd;

    @NonNull
    public static final JavaScriptMessage$MsgType durationChange;

    @NonNull
    public static final JavaScriptMessage$MsgType end;

    @NonNull
    public static final JavaScriptMessage$MsgType error;

    @NonNull
    public static final JavaScriptMessage$MsgType firstquartile;

    @NonNull
    public static final JavaScriptMessage$MsgType focusUiElement;

    @NonNull
    public static final JavaScriptMessage$MsgType forwardCompatibleUnload;

    @NonNull
    public static final JavaScriptMessage$MsgType getViewability;

    @NonNull
    public static final JavaScriptMessage$MsgType hide;

    @NonNull
    public static final JavaScriptMessage$MsgType hideAdUi;

    @NonNull
    public static final JavaScriptMessage$MsgType hidePauseAd;

    @NonNull
    public static final JavaScriptMessage$MsgType iconClicked;

    @NonNull
    public static final JavaScriptMessage$MsgType iconFallbackImageClosed;

    @NonNull
    public static final JavaScriptMessage$MsgType iconRendered;

    @NonNull
    public static final JavaScriptMessage$MsgType impression;

    @NonNull
    public static final JavaScriptMessage$MsgType init;

    @NonNull
    public static final JavaScriptMessage$MsgType initialized;

    @NonNull
    public static final JavaScriptMessage$MsgType isDestroyed;

    @NonNull
    public static final JavaScriptMessage$MsgType load;

    @NonNull
    public static final JavaScriptMessage$MsgType loadStream;

    @NonNull
    public static final JavaScriptMessage$MsgType loadStreamMetadata;

    @NonNull
    public static final JavaScriptMessage$MsgType loaded;

    @NonNull
    public static final JavaScriptMessage$MsgType log;

    @NonNull
    public static final JavaScriptMessage$MsgType midpoint;

    @NonNull
    public static final JavaScriptMessage$MsgType mute;

    @NonNull
    public static final JavaScriptMessage$MsgType nativeInstrumentation;

    @NonNull
    public static final JavaScriptMessage$MsgType nativeRequest;

    @NonNull
    public static final JavaScriptMessage$MsgType nativeResponse;

    @NonNull
    public static final JavaScriptMessage$MsgType navigationRequested;

    @NonNull
    public static final JavaScriptMessage$MsgType navigationRequestedFailed;

    @NonNull
    public static final JavaScriptMessage$MsgType omidReady;

    @NonNull
    public static final JavaScriptMessage$MsgType omidUnavailable;

    @NonNull
    public static final JavaScriptMessage$MsgType onClick;

    @NonNull
    public static final JavaScriptMessage$MsgType pause;

    @NonNull
    public static final JavaScriptMessage$MsgType pauseAdClick;

    @NonNull
    public static final JavaScriptMessage$MsgType pauseAdReady;

    @NonNull
    public static final JavaScriptMessage$MsgType pauseAdView;

    @NonNull
    public static final JavaScriptMessage$MsgType play;

    @NonNull
    public static final JavaScriptMessage$MsgType registerFriendlyObstructions;

    @NonNull
    public static final JavaScriptMessage$MsgType replaceAdTagParameters;

    @NonNull
    public static final JavaScriptMessage$MsgType requestAds;

    @NonNull
    public static final JavaScriptMessage$MsgType requestNextAdBreak;

    @NonNull
    public static final JavaScriptMessage$MsgType requestStream;

    @NonNull
    public static final JavaScriptMessage$MsgType resizeAndPositionVideo;

    @NonNull
    public static final JavaScriptMessage$MsgType restoreSizeAndPositionVideo;

    @NonNull
    public static final JavaScriptMessage$MsgType resume;

    @NonNull
    public static final JavaScriptMessage$MsgType setVisibleUiElements;

    @NonNull
    public static final JavaScriptMessage$MsgType showAdUi;

    @NonNull
    public static final JavaScriptMessage$MsgType showVideo;

    @NonNull
    public static final JavaScriptMessage$MsgType skip;

    @NonNull
    public static final JavaScriptMessage$MsgType skippableStateChanged;

    @NonNull
    public static final JavaScriptMessage$MsgType start;

    @NonNull
    public static final JavaScriptMessage$MsgType startStream;

    @NonNull
    public static final JavaScriptMessage$MsgType startTracking;

    @NonNull
    public static final JavaScriptMessage$MsgType stopTracking;

    @NonNull
    public static final JavaScriptMessage$MsgType streamInitialized;

    @NonNull
    public static final JavaScriptMessage$MsgType streamRequestComplete;

    @NonNull
    public static final JavaScriptMessage$MsgType thirdquartile;

    @NonNull
    public static final JavaScriptMessage$MsgType timedMetadata;

    @NonNull
    public static final JavaScriptMessage$MsgType timeupdate;

    @NonNull
    public static final JavaScriptMessage$MsgType unload;

    @NonNull
    public static final JavaScriptMessage$MsgType unmute;

    @NonNull
    public static final JavaScriptMessage$MsgType updateUiState;

    @NonNull
    public static final JavaScriptMessage$MsgType videoClicked;

    @NonNull
    public static final JavaScriptMessage$MsgType videoIconClicked;

    @NonNull
    public static final JavaScriptMessage$MsgType viewSignalRequest;

    @NonNull
    public static final JavaScriptMessage$MsgType viewSignalResponse;

    @NonNull
    public static final JavaScriptMessage$MsgType viewability;

    @NonNull
    public static final JavaScriptMessage$MsgType volumeChange;

    @NonNull
    public static final JavaScriptMessage$MsgType waiting;

    @NonNull
    public static final JavaScriptMessage$MsgType webViewNavigationDetected;

    static {
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = new JavaScriptMessage$MsgType("activate", 0);
        activate = javaScriptMessage$MsgType;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType2 = new JavaScriptMessage$MsgType("adBreakEnded", 1);
        adBreakEnded = javaScriptMessage$MsgType2;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType3 = new JavaScriptMessage$MsgType("adBreakFetchError", 2);
        adBreakFetchError = javaScriptMessage$MsgType3;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType4 = new JavaScriptMessage$MsgType("adBreakReady", 3);
        adBreakReady = javaScriptMessage$MsgType4;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType5 = new JavaScriptMessage$MsgType("adBreakStarted", 4);
        adBreakStarted = javaScriptMessage$MsgType5;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType6 = new JavaScriptMessage$MsgType("adBuffering", 5);
        adBuffering = javaScriptMessage$MsgType6;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType7 = new JavaScriptMessage$MsgType("adCanPlay", 6);
        adCanPlay = javaScriptMessage$MsgType7;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType8 = new JavaScriptMessage$MsgType("adMetadata", 7);
        adMetadata = javaScriptMessage$MsgType8;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType9 = new JavaScriptMessage$MsgType("adPeriodEnded", 8);
        adPeriodEnded = javaScriptMessage$MsgType9;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType10 = new JavaScriptMessage$MsgType("adPeriodStarted", 9);
        adPeriodStarted = javaScriptMessage$MsgType10;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType11 = new JavaScriptMessage$MsgType("adProgress", 10);
        adProgress = javaScriptMessage$MsgType11;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType12 = new JavaScriptMessage$MsgType("adsLoaded", 11);
        adsLoaded = javaScriptMessage$MsgType12;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType13 = new JavaScriptMessage$MsgType("allAdsCompleted", 12);
        allAdsCompleted = javaScriptMessage$MsgType13;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType14 = new JavaScriptMessage$MsgType("appBackgrounding", 13);
        appBackgrounding = javaScriptMessage$MsgType14;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType15 = new JavaScriptMessage$MsgType("appForegrounding", 14);
        appForegrounding = javaScriptMessage$MsgType15;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType16 = new JavaScriptMessage$MsgType("appStateChanged", 15);
        appStateChanged = javaScriptMessage$MsgType16;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType17 = new JavaScriptMessage$MsgType("click", 16);
        click = javaScriptMessage$MsgType17;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType18 = new JavaScriptMessage$MsgType("clickSignalRequest", 17);
        clickSignalRequest = javaScriptMessage$MsgType18;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType19 = new JavaScriptMessage$MsgType("clickSignalResponse", 18);
        clickSignalResponse = javaScriptMessage$MsgType19;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType20 = new JavaScriptMessage$MsgType("companionView", 19);
        companionView = javaScriptMessage$MsgType20;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType21 = new JavaScriptMessage$MsgType(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, 20);
        complete = javaScriptMessage$MsgType21;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType22 = new JavaScriptMessage$MsgType("contentComplete", 21);
        contentComplete = javaScriptMessage$MsgType22;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType23 = new JavaScriptMessage$MsgType("contentPauseRequested", 22);
        contentPauseRequested = javaScriptMessage$MsgType23;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType24 = new JavaScriptMessage$MsgType("contentResumeRequested", 23);
        contentResumeRequested = javaScriptMessage$MsgType24;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType25 = new JavaScriptMessage$MsgType("contentTimeUpdate", 24);
        contentTimeUpdate = javaScriptMessage$MsgType25;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType26 = new JavaScriptMessage$MsgType("csi", 25);
        csi = javaScriptMessage$MsgType26;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType27 = new JavaScriptMessage$MsgType("cuepointsChanged", 26);
        cuepointsChanged = javaScriptMessage$MsgType27;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType28 = new JavaScriptMessage$MsgType("destroy", 27);
        destroy = javaScriptMessage$MsgType28;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType29 = new JavaScriptMessage$MsgType("discardAdBreak", 28);
        discardAdBreak = javaScriptMessage$MsgType29;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType30 = new JavaScriptMessage$MsgType("displayCompanions", 29);
        displayCompanions = javaScriptMessage$MsgType30;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType31 = new JavaScriptMessage$MsgType("displayPauseAd", 30);
        displayPauseAd = javaScriptMessage$MsgType31;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType32 = new JavaScriptMessage$MsgType("durationChange", 31);
        durationChange = javaScriptMessage$MsgType32;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType33 = new JavaScriptMessage$MsgType(TtmlNode.END, 32);
        end = javaScriptMessage$MsgType33;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType34 = new JavaScriptMessage$MsgType("error", 33);
        error = javaScriptMessage$MsgType34;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType35 = new JavaScriptMessage$MsgType("firstquartile", 34);
        firstquartile = javaScriptMessage$MsgType35;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType36 = new JavaScriptMessage$MsgType("focusUiElement", 35);
        focusUiElement = javaScriptMessage$MsgType36;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType37 = new JavaScriptMessage$MsgType("forwardCompatibleUnload", 36);
        forwardCompatibleUnload = javaScriptMessage$MsgType37;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType38 = new JavaScriptMessage$MsgType("getViewability", 37);
        getViewability = javaScriptMessage$MsgType38;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType39 = new JavaScriptMessage$MsgType("hide", 38);
        hide = javaScriptMessage$MsgType39;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType40 = new JavaScriptMessage$MsgType("hideAdUi", 39);
        hideAdUi = javaScriptMessage$MsgType40;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType41 = new JavaScriptMessage$MsgType("hidePauseAd", 40);
        hidePauseAd = javaScriptMessage$MsgType41;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType42 = new JavaScriptMessage$MsgType("iconClicked", 41);
        iconClicked = javaScriptMessage$MsgType42;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType43 = new JavaScriptMessage$MsgType("iconFallbackImageClosed", 42);
        iconFallbackImageClosed = javaScriptMessage$MsgType43;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType44 = new JavaScriptMessage$MsgType("iconRendered", 43);
        iconRendered = javaScriptMessage$MsgType44;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType45 = new JavaScriptMessage$MsgType("impression", 44);
        impression = javaScriptMessage$MsgType45;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType46 = new JavaScriptMessage$MsgType("init", 45);
        init = javaScriptMessage$MsgType46;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType47 = new JavaScriptMessage$MsgType("initialized", 46);
        initialized = javaScriptMessage$MsgType47;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType48 = new JavaScriptMessage$MsgType("isDestroyed", 47);
        isDestroyed = javaScriptMessage$MsgType48;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType49 = new JavaScriptMessage$MsgType("load", 48);
        load = javaScriptMessage$MsgType49;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType50 = new JavaScriptMessage$MsgType("loadStream", 49);
        loadStream = javaScriptMessage$MsgType50;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType51 = new JavaScriptMessage$MsgType("loadStreamMetadata", 50);
        loadStreamMetadata = javaScriptMessage$MsgType51;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType52 = new JavaScriptMessage$MsgType(U3.i.r, 51);
        loaded = javaScriptMessage$MsgType52;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType53 = new JavaScriptMessage$MsgType("log", 52);
        log = javaScriptMessage$MsgType53;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType54 = new JavaScriptMessage$MsgType(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, 53);
        midpoint = javaScriptMessage$MsgType54;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType55 = new JavaScriptMessage$MsgType(CampaignEx.JSON_NATIVE_VIDEO_MUTE, 54);
        mute = javaScriptMessage$MsgType55;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType56 = new JavaScriptMessage$MsgType("nativeInstrumentation", 55);
        nativeInstrumentation = javaScriptMessage$MsgType56;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType57 = new JavaScriptMessage$MsgType("nativeRequest", 56);
        nativeRequest = javaScriptMessage$MsgType57;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType58 = new JavaScriptMessage$MsgType("nativeResponse", 57);
        nativeResponse = javaScriptMessage$MsgType58;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType59 = new JavaScriptMessage$MsgType("navigationRequested", 58);
        navigationRequested = javaScriptMessage$MsgType59;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType60 = new JavaScriptMessage$MsgType("navigationRequestedFailed", 59);
        navigationRequestedFailed = javaScriptMessage$MsgType60;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType61 = new JavaScriptMessage$MsgType("omidReady", 60);
        omidReady = javaScriptMessage$MsgType61;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType62 = new JavaScriptMessage$MsgType("omidUnavailable", 61);
        omidUnavailable = javaScriptMessage$MsgType62;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType63 = new JavaScriptMessage$MsgType("onClick", 62);
        onClick = javaScriptMessage$MsgType63;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType64 = new JavaScriptMessage$MsgType(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, 63);
        pause = javaScriptMessage$MsgType64;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType65 = new JavaScriptMessage$MsgType("pauseAdClick", 64);
        pauseAdClick = javaScriptMessage$MsgType65;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType66 = new JavaScriptMessage$MsgType("pauseAdReady", 65);
        pauseAdReady = javaScriptMessage$MsgType66;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType67 = new JavaScriptMessage$MsgType("pauseAdView", 66);
        pauseAdView = javaScriptMessage$MsgType67;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType68 = new JavaScriptMessage$MsgType("play", 67);
        play = javaScriptMessage$MsgType68;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType69 = new JavaScriptMessage$MsgType("registerFriendlyObstructions", 68);
        registerFriendlyObstructions = javaScriptMessage$MsgType69;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType70 = new JavaScriptMessage$MsgType("replaceAdTagParameters", 69);
        replaceAdTagParameters = javaScriptMessage$MsgType70;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType71 = new JavaScriptMessage$MsgType("requestAds", 70);
        requestAds = javaScriptMessage$MsgType71;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType72 = new JavaScriptMessage$MsgType("requestNextAdBreak", 71);
        requestNextAdBreak = javaScriptMessage$MsgType72;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType73 = new JavaScriptMessage$MsgType("requestStream", 72);
        requestStream = javaScriptMessage$MsgType73;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType74 = new JavaScriptMessage$MsgType("resizeAndPositionVideo", 73);
        resizeAndPositionVideo = javaScriptMessage$MsgType74;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType75 = new JavaScriptMessage$MsgType("restoreSizeAndPositionVideo", 74);
        restoreSizeAndPositionVideo = javaScriptMessage$MsgType75;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType76 = new JavaScriptMessage$MsgType(CampaignEx.JSON_NATIVE_VIDEO_RESUME, 75);
        resume = javaScriptMessage$MsgType76;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType77 = new JavaScriptMessage$MsgType("setVisibleUiElements", 76);
        setVisibleUiElements = javaScriptMessage$MsgType77;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType78 = new JavaScriptMessage$MsgType("showAdUi", 77);
        showAdUi = javaScriptMessage$MsgType78;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType79 = new JavaScriptMessage$MsgType("showVideo", 78);
        showVideo = javaScriptMessage$MsgType79;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType80 = new JavaScriptMessage$MsgType("skip", 79);
        skip = javaScriptMessage$MsgType80;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType81 = new JavaScriptMessage$MsgType("skippableStateChanged", 80);
        skippableStateChanged = javaScriptMessage$MsgType81;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType82 = new JavaScriptMessage$MsgType("start", 81);
        start = javaScriptMessage$MsgType82;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType83 = new JavaScriptMessage$MsgType("startStream", 82);
        startStream = javaScriptMessage$MsgType83;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType84 = new JavaScriptMessage$MsgType("startTracking", 83);
        startTracking = javaScriptMessage$MsgType84;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType85 = new JavaScriptMessage$MsgType("stopTracking", 84);
        stopTracking = javaScriptMessage$MsgType85;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType86 = new JavaScriptMessage$MsgType("streamInitialized", 85);
        streamInitialized = javaScriptMessage$MsgType86;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType87 = new JavaScriptMessage$MsgType("streamRequestComplete", 86);
        streamRequestComplete = javaScriptMessage$MsgType87;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType88 = new JavaScriptMessage$MsgType("thirdquartile", 87);
        thirdquartile = javaScriptMessage$MsgType88;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType89 = new JavaScriptMessage$MsgType("timedMetadata", 88);
        timedMetadata = javaScriptMessage$MsgType89;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType90 = new JavaScriptMessage$MsgType("timeupdate", 89);
        timeupdate = javaScriptMessage$MsgType90;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType91 = new JavaScriptMessage$MsgType("unload", 90);
        unload = javaScriptMessage$MsgType91;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType92 = new JavaScriptMessage$MsgType(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE, 91);
        unmute = javaScriptMessage$MsgType92;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType93 = new JavaScriptMessage$MsgType("updateUiState", 92);
        updateUiState = javaScriptMessage$MsgType93;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType94 = new JavaScriptMessage$MsgType("videoClicked", 93);
        videoClicked = javaScriptMessage$MsgType94;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType95 = new JavaScriptMessage$MsgType("videoIconClicked", 94);
        videoIconClicked = javaScriptMessage$MsgType95;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType96 = new JavaScriptMessage$MsgType("viewSignalRequest", 95);
        viewSignalRequest = javaScriptMessage$MsgType96;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType97 = new JavaScriptMessage$MsgType("viewSignalResponse", 96);
        viewSignalResponse = javaScriptMessage$MsgType97;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType98 = new JavaScriptMessage$MsgType("viewability", 97);
        viewability = javaScriptMessage$MsgType98;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType99 = new JavaScriptMessage$MsgType("volumeChange", 98);
        volumeChange = javaScriptMessage$MsgType99;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType100 = new JavaScriptMessage$MsgType("waiting", 99);
        waiting = javaScriptMessage$MsgType100;
        JavaScriptMessage$MsgType javaScriptMessage$MsgType101 = new JavaScriptMessage$MsgType("webViewNavigationDetected", 100);
        webViewNavigationDetected = javaScriptMessage$MsgType101;
        $VALUES = new JavaScriptMessage$MsgType[]{javaScriptMessage$MsgType, javaScriptMessage$MsgType2, javaScriptMessage$MsgType3, javaScriptMessage$MsgType4, javaScriptMessage$MsgType5, javaScriptMessage$MsgType6, javaScriptMessage$MsgType7, javaScriptMessage$MsgType8, javaScriptMessage$MsgType9, javaScriptMessage$MsgType10, javaScriptMessage$MsgType11, javaScriptMessage$MsgType12, javaScriptMessage$MsgType13, javaScriptMessage$MsgType14, javaScriptMessage$MsgType15, javaScriptMessage$MsgType16, javaScriptMessage$MsgType17, javaScriptMessage$MsgType18, javaScriptMessage$MsgType19, javaScriptMessage$MsgType20, javaScriptMessage$MsgType21, javaScriptMessage$MsgType22, javaScriptMessage$MsgType23, javaScriptMessage$MsgType24, javaScriptMessage$MsgType25, javaScriptMessage$MsgType26, javaScriptMessage$MsgType27, javaScriptMessage$MsgType28, javaScriptMessage$MsgType29, javaScriptMessage$MsgType30, javaScriptMessage$MsgType31, javaScriptMessage$MsgType32, javaScriptMessage$MsgType33, javaScriptMessage$MsgType34, javaScriptMessage$MsgType35, javaScriptMessage$MsgType36, javaScriptMessage$MsgType37, javaScriptMessage$MsgType38, javaScriptMessage$MsgType39, javaScriptMessage$MsgType40, javaScriptMessage$MsgType41, javaScriptMessage$MsgType42, javaScriptMessage$MsgType43, javaScriptMessage$MsgType44, javaScriptMessage$MsgType45, javaScriptMessage$MsgType46, javaScriptMessage$MsgType47, javaScriptMessage$MsgType48, javaScriptMessage$MsgType49, javaScriptMessage$MsgType50, javaScriptMessage$MsgType51, javaScriptMessage$MsgType52, javaScriptMessage$MsgType53, javaScriptMessage$MsgType54, javaScriptMessage$MsgType55, javaScriptMessage$MsgType56, javaScriptMessage$MsgType57, javaScriptMessage$MsgType58, javaScriptMessage$MsgType59, javaScriptMessage$MsgType60, javaScriptMessage$MsgType61, javaScriptMessage$MsgType62, javaScriptMessage$MsgType63, javaScriptMessage$MsgType64, javaScriptMessage$MsgType65, javaScriptMessage$MsgType66, javaScriptMessage$MsgType67, javaScriptMessage$MsgType68, javaScriptMessage$MsgType69, javaScriptMessage$MsgType70, javaScriptMessage$MsgType71, javaScriptMessage$MsgType72, javaScriptMessage$MsgType73, javaScriptMessage$MsgType74, javaScriptMessage$MsgType75, javaScriptMessage$MsgType76, javaScriptMessage$MsgType77, javaScriptMessage$MsgType78, javaScriptMessage$MsgType79, javaScriptMessage$MsgType80, javaScriptMessage$MsgType81, javaScriptMessage$MsgType82, javaScriptMessage$MsgType83, javaScriptMessage$MsgType84, javaScriptMessage$MsgType85, javaScriptMessage$MsgType86, javaScriptMessage$MsgType87, javaScriptMessage$MsgType88, javaScriptMessage$MsgType89, javaScriptMessage$MsgType90, javaScriptMessage$MsgType91, javaScriptMessage$MsgType92, javaScriptMessage$MsgType93, javaScriptMessage$MsgType94, javaScriptMessage$MsgType95, javaScriptMessage$MsgType96, javaScriptMessage$MsgType97, javaScriptMessage$MsgType98, javaScriptMessage$MsgType99, javaScriptMessage$MsgType100, javaScriptMessage$MsgType101};
    }

    @NonNull
    public static JavaScriptMessage$MsgType[] values() {
        return (JavaScriptMessage$MsgType[]) $VALUES.clone();
    }
}
