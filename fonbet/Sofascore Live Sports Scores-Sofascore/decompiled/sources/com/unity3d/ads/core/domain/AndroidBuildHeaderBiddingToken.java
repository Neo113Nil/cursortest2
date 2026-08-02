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
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
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
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096B¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.¨\u0006/"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidBuildHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "generateId", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "getClientInfo", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "getTimestamps", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "getLimitedSessionToken", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "getInitializationData", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "tcfRepository", "Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "testDataInfo", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "mediationInfoConverter", "<init>", "(Lcom/unity3d/ads/core/domain/GetByteStringId;Lcom/unity3d/ads/core/domain/GetClientInfo;Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;Lcom/unity3d/ads/core/domain/GetInitializationData;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/data/repository/TcfRepository;Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/MediationInfoConverter;)V", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$HeaderBiddingToken;", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetByteStringId;", "Lcom/unity3d/ads/core/domain/GetClientInfo;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "Lcom/unity3d/ads/core/domain/GetLimitedSessionToken;", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/ads/core/domain/MediationInfoConverter;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetByteStringId generateId;

    @NotNull
    private final GetClientInfo getClientInfo;

    @NotNull
    private final GetInitializationData getInitializationData;

    @NotNull
    private final GetLimitedSessionToken getLimitedSessionToken;

    @NotNull
    private final GetSharedDataTimestamps getTimestamps;

    @NotNull
    private final MediationInfoConverter mediationInfoConverter;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TcfRepository tcfRepository;

    @NotNull
    private final AndroidTestDataInfo testDataInfo;

    public AndroidBuildHeaderBiddingToken(@NotNull GetByteStringId getByteStringId, @NotNull GetClientInfo getClientInfo, @NotNull GetSharedDataTimestamps getSharedDataTimestamps, @NotNull GetLimitedSessionToken getLimitedSessionToken, @NotNull GetInitializationData getInitializationData, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull CampaignRepository campaignRepository, @NotNull TcfRepository tcfRepository, @NotNull AndroidTestDataInfo androidTestDataInfo, @NotNull OfferwallManager offerwallManager, @NotNull MediationInfoConverter mediationInfoConverter) {
        getByteStringId.getClass();
        getClientInfo.getClass();
        getSharedDataTimestamps.getClass();
        getLimitedSessionToken.getClass();
        getInitializationData.getClass();
        deviceInfoRepository.getClass();
        sessionRepository.getClass();
        campaignRepository.getClass();
        tcfRepository.getClass();
        androidTestDataInfo.getClass();
        offerwallManager.getClass();
        mediationInfoConverter.getClass();
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, @Nullable TokenConfiguration tokenConfiguration, @NotNull rq3<? super HeaderBiddingTokenOuterClass.HeaderBiddingToken> rq3Var) {
        AndroidBuildHeaderBiddingToken$invoke$1 androidBuildHeaderBiddingToken$invoke$1;
        Object obj;
        lu3 lu3Var;
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
        boolean isEmpty;
        HeaderBiddingTokenKt.Dsl dsl4;
        TokenCounters tokenCounters3;
        HeaderBiddingTokenKt.Dsl dsl5;
        HeaderBiddingTokenKt.Dsl dsl6;
        HeaderBiddingTokenKt.Dsl dsl7;
        TokenCounters tokenCounters4;
        TestDataOuterClass.TestData invoke;
        if (rq3Var instanceof AndroidBuildHeaderBiddingToken$invoke$1) {
            androidBuildHeaderBiddingToken$invoke$1 = (AndroidBuildHeaderBiddingToken$invoke$1) rq3Var;
            int i3 = androidBuildHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                androidBuildHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                obj = androidBuildHeaderBiddingToken$invoke$1.result;
                lu3Var = lu3.a;
                i2 = androidBuildHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    y6a.M(obj);
                    tokenCounters = this.sessionRepository.getTokenCounters();
                    ByteString sessionToken = this.sessionRepository.getSessionToken();
                    this.sessionRepository.incrementTokenSequenceNumber();
                    HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.INSTANCE;
                    HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder newBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
                    newBuilder.getClass();
                    _create = companion._create(newBuilder);
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
                    if (invoke2 != lu3Var) {
                        tokenConfiguration2 = tokenConfiguration;
                        byteString = sessionToken;
                        dsl = _create;
                        obj = invoke2;
                        dsl2 = dsl;
                    }
                    return lu3Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        dsl3 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$4;
                        dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                        _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                        byteString2 = (ByteString) androidBuildHeaderBiddingToken$invoke$1.L$1;
                        tokenCounters2 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                        y6a.M(obj);
                        dsl3.setOfferwallEnabled(((Boolean) obj).booleanValue());
                        userIdentifier = UnityAds.getUserIdentifier();
                        if (userIdentifier != null) {
                            dsl.setExternalUserIdentifier(userIdentifier);
                        }
                        isEmpty = byteString2.isEmpty();
                        SessionRepository sessionRepository = this.sessionRepository;
                        if (isEmpty) {
                            dsl.setSessionToken(sessionRepository.getSessionToken());
                            dsl.setStaticDeviceInfo(this.deviceInfoRepository.cachedStaticDeviceInfo());
                            invoke = this.testDataInfo.invoke();
                            if (invoke != null) {
                            }
                            TokenCountersKt.Dsl.Companion companion2 = TokenCountersKt.Dsl.INSTANCE;
                            HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder2 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                            newBuilder2.getClass();
                            TokenCountersKt.Dsl _create2 = companion2._create(newBuilder2);
                            _create2.setSeq(tokenCounters2.getSeq());
                            _create2.setWins(tokenCounters2.getWins());
                            _create2.setStarts(tokenCounters2.getStarts());
                            dsl.setTokenCounters(_create2._build());
                            return _create._build();
                        }
                        String gameId = sessionRepository.getGameId();
                        if (gameId == null || gameId.length() <= 0) {
                            GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                            androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters2;
                            androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                            androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl;
                            androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl;
                            androidBuildHeaderBiddingToken$invoke$1.L$4 = null;
                            androidBuildHeaderBiddingToken$invoke$1.label = 4;
                            obj = getLimitedSessionToken.invoke(androidBuildHeaderBiddingToken$invoke$1);
                            if (obj != lu3Var) {
                                dsl4 = dsl;
                                tokenCounters3 = tokenCounters2;
                                dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
                                dsl6 = dsl;
                                DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                                androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                                androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                                androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                                androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                                androidBuildHeaderBiddingToken$invoke$1.label = 5;
                                obj = deviceInfoRepository.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                                if (obj != lu3Var) {
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
                            if (obj != lu3Var) {
                                dsl5 = dsl;
                                tokenCounters3 = tokenCounters2;
                                dsl5.setInitializationData((InitializationDataOuterClass.InitializationData) obj);
                                dsl6 = dsl;
                                DeviceInfoRepository deviceInfoRepository2 = this.deviceInfoRepository;
                                androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                                androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                                androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                                androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                                androidBuildHeaderBiddingToken$invoke$1.label = 5;
                                obj = deviceInfoRepository2.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                                if (obj != lu3Var) {
                                }
                            }
                        }
                        return lu3Var;
                    }
                    if (i2 == 3) {
                        dsl5 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                        dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                        _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                        tokenCounters3 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                        y6a.M(obj);
                        dsl5.setInitializationData((InitializationDataOuterClass.InitializationData) obj);
                        dsl6 = dsl;
                        DeviceInfoRepository deviceInfoRepository22 = this.deviceInfoRepository;
                        androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                        androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                        androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                        androidBuildHeaderBiddingToken$invoke$1.label = 5;
                        obj = deviceInfoRepository22.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                        if (obj != lu3Var) {
                        }
                        return lu3Var;
                    }
                    if (i2 != 4) {
                        if (i2 != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dsl6 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                        dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                        dsl7 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                        tokenCounters4 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                        y6a.M(obj);
                        dsl6.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                        tokenCounters2 = tokenCounters4;
                        _create = dsl7;
                        invoke = this.testDataInfo.invoke();
                        if (invoke != null) {
                            dsl.setTestData(invoke);
                        }
                        TokenCountersKt.Dsl.Companion companion22 = TokenCountersKt.Dsl.INSTANCE;
                        HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder22 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                        newBuilder22.getClass();
                        TokenCountersKt.Dsl _create22 = companion22._create(newBuilder22);
                        _create22.setSeq(tokenCounters2.getSeq());
                        _create22.setWins(tokenCounters2.getWins());
                        _create22.setStarts(tokenCounters2.getStarts());
                        dsl.setTokenCounters(_create22._build());
                        return _create._build();
                    }
                    dsl4 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                    dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$2;
                    _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$1;
                    tokenCounters3 = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$0;
                    y6a.M(obj);
                    dsl4.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
                    dsl6 = dsl;
                    DeviceInfoRepository deviceInfoRepository222 = this.deviceInfoRepository;
                    androidBuildHeaderBiddingToken$invoke$1.L$0 = tokenCounters3;
                    androidBuildHeaderBiddingToken$invoke$1.L$1 = _create;
                    androidBuildHeaderBiddingToken$invoke$1.L$2 = dsl6;
                    androidBuildHeaderBiddingToken$invoke$1.L$3 = dsl6;
                    androidBuildHeaderBiddingToken$invoke$1.label = 5;
                    obj = deviceInfoRepository222.staticDeviceInfo(androidBuildHeaderBiddingToken$invoke$1);
                    if (obj != lu3Var) {
                        dsl = dsl6;
                        dsl7 = _create;
                        tokenCounters4 = tokenCounters3;
                        dsl6.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                        tokenCounters2 = tokenCounters4;
                        _create = dsl7;
                        invoke = this.testDataInfo.invoke();
                        if (invoke != null) {
                        }
                        TokenCountersKt.Dsl.Companion companion222 = TokenCountersKt.Dsl.INSTANCE;
                        HeaderBiddingTokenOuterClass.TokenCounters.Builder newBuilder222 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                        newBuilder222.getClass();
                        TokenCountersKt.Dsl _create222 = companion222._create(newBuilder222);
                        _create222.setSeq(tokenCounters2.getSeq());
                        _create222.setWins(tokenCounters2.getWins());
                        _create222.setStarts(tokenCounters2.getStarts());
                        dsl.setTokenCounters(_create222._build());
                        return _create._build();
                    }
                    return lu3Var;
                }
                dsl2 = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$5;
                dsl = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$4;
                _create = (HeaderBiddingTokenKt.Dsl) androidBuildHeaderBiddingToken$invoke$1.L$3;
                byteString = (ByteString) androidBuildHeaderBiddingToken$invoke$1.L$2;
                tokenCounters = (TokenCounters) androidBuildHeaderBiddingToken$invoke$1.L$1;
                tokenConfiguration2 = (TokenConfiguration) androidBuildHeaderBiddingToken$invoke$1.L$0;
                y6a.M(obj);
                dsl2.setClientInfo((ClientInfoOuterClass.ClientInfo) obj);
                dsl.setTimestamps(this.getTimestamps.invoke());
                if (tokenConfiguration2 != null) {
                    dsl.setAdFormat(AdFormatExtensions.toProtoAdFormat(tokenConfiguration2.getAdFormat()));
                    dsl.putAllExtras(dsl.getExtrasMap(), tokenConfiguration2.getExtras());
                    MediationInfo mediationInfo = tokenConfiguration2.get_mediationInfo();
                    if (mediationInfo != null) {
                        dsl.setMediationInfo(this.mediationInfoConverter.invoke(mediationInfo));
                    }
                    String str = tokenConfiguration2.get_placementId();
                    if (str != null) {
                        dsl.setPlacementId(str);
                    }
                    String str2 = tokenConfiguration2.get_mediationAdUnitId();
                    if (str2 != null) {
                        dsl.setMediationAdUnitId(str2);
                    }
                    BannerSize bannerSize = tokenConfiguration2.get_bannerSize();
                    if (bannerSize != null) {
                        BannerSizeKt.Dsl.Companion companion3 = BannerSizeKt.Dsl.INSTANCE;
                        AdRequestOuterClass.BannerSize.Builder newBuilder3 = AdRequestOuterClass.BannerSize.newBuilder();
                        newBuilder3.getClass();
                        BannerSizeKt.Dsl _create3 = companion3._create(newBuilder3);
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
                if (obj != lu3Var) {
                    dsl3 = dsl;
                    byteString2 = byteString;
                    tokenCounters2 = tokenCounters;
                    dsl3.setOfferwallEnabled(((Boolean) obj).booleanValue());
                    userIdentifier = UnityAds.getUserIdentifier();
                    if (userIdentifier != null) {
                    }
                    isEmpty = byteString2.isEmpty();
                    SessionRepository sessionRepository2 = this.sessionRepository;
                    if (isEmpty) {
                    }
                }
                return lu3Var;
            }
        }
        androidBuildHeaderBiddingToken$invoke$1 = new AndroidBuildHeaderBiddingToken$invoke$1(this, rq3Var);
        obj = androidBuildHeaderBiddingToken$invoke$1.result;
        lu3Var = lu3.a;
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
        if (obj != lu3Var) {
        }
        return lu3Var;
    }
}
