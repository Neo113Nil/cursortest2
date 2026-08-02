package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.BannerSize;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: AndroidBuildHeaderBiddingToken.kt */
/* loaded from: classes14.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final MediationInfoConverter mediationInfoConverter;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    public AndroidBuildHeaderBiddingToken(GetByteStringId getByteStringId, GetClientInfo getClientInfo, GetSharedDataTimestamps getSharedDataTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo androidTestDataInfo, OfferwallManager offerwallManager, MediationInfoConverter mediationInfoConverter) {
        this.generateId = getByteStringId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getSharedDataTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = androidTestDataInfo;
        this.offerwallManager = offerwallManager;
        this.mediationInfoConverter = mediationInfoConverter;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, TokenConfiguration tokenConfiguration, spj<? super HeaderBiddingTokenOuterClass.HeaderBiddingToken> spjVar) {
        AndroidBuildHeaderBiddingToken$invoke$1 androidBuildHeaderBiddingToken$invoke$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        TokenCounters tokenCounters;
        HeaderBiddingTokenKt.Dsl _create;
        TokenConfiguration tokenConfiguration2;
        ByteString byteString;
        HeaderBiddingTokenKt.Dsl dsl;
        HeaderBiddingTokenKt.Dsl dsl2;
        String tcfString;
        HeaderBiddingTokenKt.Dsl dsl3;
        ByteString byteString2;
        TokenCounters tokenCounters2;
        String userIdentifier;
        HeaderBiddingTokenKt.Dsl dsl4;
        TokenCounters tokenCounters3;
        HeaderBiddingTokenKt.Dsl dsl5;
        HeaderBiddingTokenKt.Dsl dsl6;
        HeaderBiddingTokenKt.Dsl dsl7;
        TokenCounters tokenCounters4;
        TestDataOuterClass.TestData invoke;
        if (spjVar instanceof AndroidBuildHeaderBiddingToken$invoke$1) {
            androidBuildHeaderBiddingToken$invoke$1 = (AndroidBuildHeaderBiddingToken$invoke$1) spjVar;
            int i3 = androidBuildHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                androidBuildHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                obj = androidBuildHeaderBiddingToken$invoke$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = androidBuildHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    tokenCounters = this.sessionRepository.getTokenCounters();
                    ByteString sessionToken = this.sessionRepository.getSessionToken();
                    this.sessionRepository.incrementTokenSequenceNumber();
                    _create = HeaderBiddingTokenKt.Dsl.Companion._create(HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder());
                    _create.setTokenId(this.generateId.invoke());
                    _create.setTokenNumber(i);
                    GetClientInfo getClientInfo = this.getClientInfo;
                    androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenConfiguration;
                    androidBuildHeaderBiddingToken$invoke$1.L$1 = tokenCounters;
                    androidBuildHeaderBiddingToken$invoke$1.L$2 = sessionToken;
                    androidBuildHeaderBiddingToken$invoke$1.L$3 = _create;
                    androidBuildHeaderBiddingToken$invoke$1.L$4 = _create;
                    androidBuildHeaderBiddingToken$invoke$1.L$5 = _create;
                    androidBuildHeaderBiddingToken$invoke$1.label = 1;
                    Object invoke2 = getClientInfo.invoke(androidBuildHeaderBiddingToken$invoke$1);
                    if (invoke2 != coroutineSingletons) {
                        tokenConfiguration2 = tokenConfiguration;
                        byteString = sessionToken;
                        dsl = _create;
                        obj = invoke2;
                        dsl2 = dsl;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            dsl5 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                            dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                            _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                            tokenCounters3 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                            kotlin.a.a(obj);
                            dsl5.setInitializationData((InitializationDataOuterClass.InitializationData) obj);
                            dsl6 = dsl;
                            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                            androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                            androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                            androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                            androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                            androidBuildHeaderBiddingToken$invoke$1.label = 5;
                            obj = deviceInfoRepository.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                            if (obj != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (i2 != 4) {
                            if (i2 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dsl6 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                            dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                            dsl7 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                            tokenCounters4 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                            kotlin.a.a(obj);
                            dsl6.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                            tokenCounters2 = tokenCounters4;
                            _create = dsl7;
                            invoke = this.testDataInfo.invoke();
                            if (invoke != null) {
                                dsl.setTestData(invoke);
                            }
                            TokenCountersKt.Dsl _create2 = TokenCountersKt.Dsl.Companion._create(HeaderBiddingTokenOuterClass.TokenCounters.newBuilder());
                            _create2.setSeq(tokenCounters2.getSeq());
                            _create2.setWins(tokenCounters2.getWins());
                            _create2.setStarts(tokenCounters2.getStarts());
                            dsl.setTokenCounters(_create2._build());
                            return _create._build();
                        }
                        dsl4 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                        dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                        _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                        tokenCounters3 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                        kotlin.a.a(obj);
                        dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
                        dsl6 = dsl;
                        DeviceInfoRepository deviceInfoRepository2 = this.deviceInfoRepository;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.label = 5;
                        obj = deviceInfoRepository2.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj != coroutineSingletons) {
                            dsl = dsl6;
                            dsl7 = _create;
                            tokenCounters4 = tokenCounters3;
                            dsl6.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                            tokenCounters2 = tokenCounters4;
                            _create = dsl7;
                            invoke = this.testDataInfo.invoke();
                            if (invoke != null) {
                            }
                            TokenCountersKt.Dsl _create22 = TokenCountersKt.Dsl.Companion._create(HeaderBiddingTokenOuterClass.TokenCounters.newBuilder());
                            _create22.setSeq(tokenCounters2.getSeq());
                            _create22.setWins(tokenCounters2.getWins());
                            _create22.setStarts(tokenCounters2.getStarts());
                            dsl.setTokenCounters(_create22._build());
                            return _create._build();
                        }
                        return coroutineSingletons;
                    }
                    dsl3 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$4;
                    dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                    _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                    byteString2 = (ByteString) androidBuildHeaderBiddingToken$invoke$1.L$1;
                    tokenCounters2 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                    kotlin.a.a(obj);
                    dsl3.setOfferwallEnabled(((Boolean) obj).booleanValue());
                    userIdentifier = UnityAds.getUserIdentifier();
                    if (userIdentifier != null) {
                        dsl.setExternalUserIdentifier(userIdentifier);
                    }
                    if (byteString2.isEmpty()) {
                        dsl.setSessionToken(this.sessionRepository.getSessionToken());
                        dsl.setStaticDeviceInfo(this.deviceInfoRepository.cachedStaticDeviceInfo());
                        invoke = this.testDataInfo.invoke();
                        if (invoke != null) {
                        }
                        TokenCountersKt.Dsl _create222 = TokenCountersKt.Dsl.Companion._create(HeaderBiddingTokenOuterClass.TokenCounters.newBuilder());
                        _create222.setSeq(tokenCounters2.getSeq());
                        _create222.setWins(tokenCounters2.getWins());
                        _create222.setStarts(tokenCounters2.getStarts());
                        dsl.setTokenCounters(_create222._build());
                        return _create._build();
                    }
                    String gameId = this.sessionRepository.getGameId();
                    if (gameId == null || gameId.length() <= 0) {
                        GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters2;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
                        androidBuildHeaderBiddingToken$invoke$1.L$4 = null;
                        androidBuildHeaderBiddingToken$invoke$1.label = 4;
                        obj = getLimitedSessionToken.invoke(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj != coroutineSingletons) {
                            dsl4 = dsl;
                            tokenCounters3 = tokenCounters2;
                            dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
                            dsl6 = dsl;
                            DeviceInfoRepository deviceInfoRepository22 = this.deviceInfoRepository;
                            androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                            androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                            androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                            androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                            androidBuildHeaderBiddingToken$invoke$1.label = 5;
                            obj = deviceInfoRepository22.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                            if (obj != coroutineSingletons) {
                            }
                        }
                    } else {
                        GetInitializationData getInitializationData = this.getInitializationData;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters2;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
                        androidBuildHeaderBiddingToken$invoke$1.L$4 = null;
                        androidBuildHeaderBiddingToken$invoke$1.label = 3;
                        obj = getInitializationData.invoke(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj != coroutineSingletons) {
                            dsl5 = dsl;
                            tokenCounters3 = tokenCounters2;
                            dsl5.setInitializationData((InitializationDataOuterClass.InitializationData) obj);
                            dsl6 = dsl;
                            DeviceInfoRepository deviceInfoRepository222 = this.deviceInfoRepository;
                            androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                            androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                            androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                            androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                            androidBuildHeaderBiddingToken$invoke$1.label = 5;
                            obj = deviceInfoRepository222.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                            if (obj != coroutineSingletons) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                dsl2 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$5;
                dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$4;
                _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                byteString = (ByteString) androidBuildHeaderBiddingToken$invoke$1.L$2;
                tokenCounters = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$1;
                tokenConfiguration2 = (TokenConfiguration) androidBuildHeaderBiddingToken$invoke$1.L$0;
                kotlin.a.a(obj);
                dsl2.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                dsl.setTimestamps(this.getTimestamps.invoke());
                if (tokenConfiguration2 != null) {
                    dsl.setAdFormat(AdFormatExtensions.toProtoAdFormat(tokenConfiguration2.getAdFormat()));
                    dsl.putAllExtras(dsl.getExtrasMap(), tokenConfiguration2.getExtras());
                    MediationInfo mediationInfo = tokenConfiguration2.getMediationInfo();
                    if (mediationInfo != null) {
                        dsl.setMediationInfo(this.mediationInfoConverter.invoke(mediationInfo));
                    }
                    String placementId = tokenConfiguration2.getPlacementId();
                    if (placementId != null) {
                        dsl.setPlacementId(placementId);
                    }
                    String mediationAdUnitId = tokenConfiguration2.getMediationAdUnitId();
                    if (mediationAdUnitId != null) {
                        dsl.setMediationAdUnitId(mediationAdUnitId);
                    }
                    BannerSize bannerSize = tokenConfiguration2.getBannerSize();
                    if (bannerSize != null) {
                        BannerSizeKt.Dsl _create3 = BannerSizeKt.Dsl.Companion._create(AdRequestOuterClass.BannerSize.newBuilder());
                        _create3.setWidth(bannerSize.getWidth());
                        _create3.setHeight(bannerSize.getHeight());
                        dsl.setBannerSize(_create3._build());
                    }
                }
                dsl.setSessionCounters(this.sessionRepository.getSessionCounters());
                dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl.setPii(this.deviceInfoRepository.getPiiData());
                dsl.setCampaignState(this.campaignRepository.getCampaignState());
                tcfString = this.tcfRepository.getTcfString();
                if (tcfString != null) {
                    dsl.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
                }
                OfferwallManager offerwallManager = this.offerwallManager;
                androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters;
                androidBuildHeaderBiddingToken$invoke$1.L$1 = byteString;
                androidBuildHeaderBiddingToken$invoke$1.L$2 = _create;
                androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
                androidBuildHeaderBiddingToken$invoke$1.L$4 = dsl;
                androidBuildHeaderBiddingToken$invoke$1.L$5 = null;
                androidBuildHeaderBiddingToken$invoke$1.label = 2;
                obj = offerwallManager.isConnected(androidBuildHeaderBiddingToken$invoke$1);
                if (obj != coroutineSingletons) {
                    dsl3 = dsl;
                    byteString2 = byteString;
                    tokenCounters2 = tokenCounters;
                    dsl3.setOfferwallEnabled(((Boolean) obj).booleanValue());
                    userIdentifier = UnityAds.getUserIdentifier();
                    if (userIdentifier != null) {
                    }
                    if (byteString2.isEmpty()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        androidBuildHeaderBiddingToken$invoke$1 = new AndroidBuildHeaderBiddingToken$invoke$1(this, spjVar);
        obj = androidBuildHeaderBiddingToken$invoke$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = androidBuildHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        dsl2.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
        dsl.setTimestamps(this.getTimestamps.invoke());
        if (tokenConfiguration2 != null) {
        }
        dsl.setSessionCounters(this.sessionRepository.getSessionCounters());
        dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl.setPii(this.deviceInfoRepository.getPiiData());
        dsl.setCampaignState(this.campaignRepository.getCampaignState());
        tcfString = this.tcfRepository.getTcfString();
        if (tcfString != null) {
        }
        OfferwallManager offerwallManager2 = this.offerwallManager;
        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters;
        androidBuildHeaderBiddingToken$invoke$1.L$1 = byteString;
        androidBuildHeaderBiddingToken$invoke$1.L$2 = _create;
        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
        androidBuildHeaderBiddingToken$invoke$1.L$4 = dsl;
        androidBuildHeaderBiddingToken$invoke$1.L$5 = null;
        androidBuildHeaderBiddingToken$invoke$1.label = 2;
        obj = offerwallManager2.isConnected(androidBuildHeaderBiddingToken$invoke$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
