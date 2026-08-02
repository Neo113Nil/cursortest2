package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.GatewayUrl;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.SessionIdReader;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.baj0;
import xsna.caj0;
import xsna.dt;
import xsna.ksr;
import xsna.lsr;
import xsna.lyd;
import xsna.myc0;
import xsna.ovj;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.utk0;
import xsna.vtk0;
import xsna.wzs;
import xsna.xh50;
import xsna.yvj;
import xsna.zcl;
import xsna.ztr;
import xsna.zvj;

/* compiled from: AndroidSessionRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidSessionRepository implements SessionRepository {
    private final xh50<ByteString> _currentState;
    private xh50<String> _gameId;
    private final xh50<String> _gatewayUrl;
    private final xh50<Integer> _headerBiddingTokenCounter;
    private final xh50<InitializationException> _initializationError;
    private final xh50<InitializationState> _initializationState;
    private final xh50<Boolean> _isFirstInitAttempt;
    private final xh50<Boolean> _isTestModeEnabled;
    private sh50<SessionChange> _onChange;
    private final xh50<List<InitializationResponseOuterClass.RequestUrlOverride>> _requestUrlOverride;
    private final xh50<NativeConfigurationOuterClass.NativeConfiguration> _sdkConfiguration;
    private final xh50<SessionCountersOuterClass.SessionCounters> _sessionCounters;
    private final xh50<ByteString> _sessionId;
    private final xh50<ByteString> _sessionToken;
    private final xh50<Boolean> _shouldInitialize;
    private final xh50<TokenCounters> _tokenCounters;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    private InitializationConfigurationInternal initializationConfiguration;
    private final xh50<Boolean> isInit;
    private final ByteStringDataSource nativeConfigDataSource;
    private final baj0<SessionChange> onChange;
    private final ksr<NativeConfigurationOuterClass.NativeConfiguration> persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    /* compiled from: AndroidSessionRepository.kt */
    @b6l(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    a.a(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    AndroidSessionRepository.this._sdkConfiguration.setValue(NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data));
                }
            } catch (Exception e) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", (Double) null, dt.b("debugReason", message), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            }
            AndroidSessionRepository.this.isInit.setValue(Boolean.TRUE);
            return s3q0.a;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    public /* synthetic */ AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, ovj ovjVar, SendDiagnosticEvent sendDiagnosticEvent, String str, zcl zclVar) {
        this(byteStringDataSource, byteStringDataSource2, byteStringDataSource3, byteStringDataSource4, androidUnityInfoDataSource, nativeConfiguration, ovjVar, sendDiagnosticEvent, str);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int i) {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setGlobalAdsFocusTime(_create.getGlobalAdsFocusTime() + i);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        return getNativeConfiguration().getFeatureFlags();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGameId() {
        String value;
        String gameId;
        xh50<String> xh50Var = this._gameId;
        do {
            value = xh50Var.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!xh50Var.compareAndSet(value, gameId));
        return gameId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGatewayCache(spj<? super ByteString> spjVar) {
        AndroidSessionRepository$getGatewayCache$1 androidSessionRepository$getGatewayCache$1;
        int i;
        if (spjVar instanceof AndroidSessionRepository$getGatewayCache$1) {
            androidSessionRepository$getGatewayCache$1 = (AndroidSessionRepository$getGatewayCache$1) spjVar;
            int i2 = androidSessionRepository$getGatewayCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getGatewayCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getGatewayCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidSessionRepository$getGatewayCache$1.label;
                if (i != 0) {
                    a.a(obj);
                    ByteStringDataSource byteStringDataSource = this.gatewayCacheDataSource;
                    androidSessionRepository$getGatewayCache$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getGatewayCache$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
            }
        }
        androidSessionRepository$getGatewayCache$1 = new AndroidSessionRepository$getGatewayCache$1(this, spjVar);
        Object obj2 = androidSessionRepository$getGatewayCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidSessionRepository$getGatewayCache$1.label;
        if (i != 0) {
        }
        return ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getGatewayState() {
        return this._currentState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGatewayUrl() {
        return this._gatewayUrl.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        Integer value;
        Integer num;
        xh50<Integer> xh50Var = this._headerBiddingTokenCounter;
        do {
            value = xh50Var.getValue();
            num = value;
        } while (!xh50Var.compareAndSet(value, Integer.valueOf(num.intValue() + 1)));
        return num.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationConfigurationInternal getInitializationConfiguration() {
        return this.initializationConfiguration;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationException getInitializationError() {
        return this._initializationError.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationState getInitializationState() {
        return this._initializationState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        if (this.isInit.getValue().booleanValue()) {
            return this._sdkConfiguration.getValue();
        }
        return (NativeConfigurationOuterClass.NativeConfiguration) myc0.i(EmptyCoroutineContext.b, new AndroidSessionRepository$nativeConfiguration$1(this, null));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ksr<InitializationState> getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public baj0<SessionChange> getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPrivacy(spj<? super ByteString> spjVar) {
        AndroidSessionRepository$getPrivacy$1 androidSessionRepository$getPrivacy$1;
        int i;
        if (spjVar instanceof AndroidSessionRepository$getPrivacy$1) {
            androidSessionRepository$getPrivacy$1 = (AndroidSessionRepository$getPrivacy$1) spjVar;
            int i2 = androidSessionRepository$getPrivacy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getPrivacy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getPrivacy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidSessionRepository$getPrivacy$1.label;
                if (i != 0) {
                    a.a(obj);
                    ByteStringDataSource byteStringDataSource = this.privacyDataSource;
                    androidSessionRepository$getPrivacy$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getPrivacy$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
            }
        }
        androidSessionRepository$getPrivacy$1 = new AndroidSessionRepository$getPrivacy$1(this, spjVar);
        Object obj2 = androidSessionRepository$getPrivacy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidSessionRepository$getPrivacy$1.label;
        if (i != 0) {
        }
        return ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getPrivacyFsm(spj<? super ByteString> spjVar) {
        AndroidSessionRepository$getPrivacyFsm$1 androidSessionRepository$getPrivacyFsm$1;
        int i;
        if (spjVar instanceof AndroidSessionRepository$getPrivacyFsm$1) {
            androidSessionRepository$getPrivacyFsm$1 = (AndroidSessionRepository$getPrivacyFsm$1) spjVar;
            int i2 = androidSessionRepository$getPrivacyFsm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$getPrivacyFsm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$getPrivacyFsm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidSessionRepository$getPrivacyFsm$1.label;
                if (i != 0) {
                    a.a(obj);
                    ByteStringDataSource byteStringDataSource = this.fsmDataSource;
                    androidSessionRepository$getPrivacyFsm$1.label = 1;
                    obj = byteStringDataSource.get(androidSessionRepository$getPrivacyFsm$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
            }
        }
        androidSessionRepository$getPrivacyFsm$1 = new AndroidSessionRepository$getPrivacyFsm$1(this, spjVar);
        Object obj2 = androidSessionRepository$getPrivacyFsm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidSessionRepository$getPrivacyFsm$1.label;
        if (i != 0) {
        }
        return ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides() {
        return this._requestUrlOverride.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return this._sessionCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionId() {
        return this._sessionId.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionToken() {
        return this._sessionToken.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return this._shouldInitialize.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public TokenCounters getTokenCounters() {
        return this._tokenCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementAllErrorsCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setAllErrorsCount(_create.getAllErrorsCount() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setBannerImpressions(_create.getBannerImpressions() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setBannerRequestsAdm(_create.getBannerRequestsAdm() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setBannerLoadRequests(_create.getBannerLoadRequests() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementCacheTimeoutErrorsCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setCacheTimeoutErrorsCount(_create.getCacheTimeoutErrorsCount() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setFocusChangeCount(_create.getFocusChangeCount() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setGlobalAdsFocusChangeCount(_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setLoadRequestsAdm(_create.getLoadRequestsAdm() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setLoadRequests(_create.getLoadRequests() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementSuccessCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setSuccessCount(_create.getSuccessCount() + 1);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        TokenCounters value;
        TokenCounters tokenCounters;
        xh50<TokenCounters> xh50Var = this._tokenCounters;
        do {
            value = xh50Var.getValue();
            tokenCounters = value;
        } while (!xh50Var.compareAndSet(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        TokenCounters value;
        TokenCounters tokenCounters;
        xh50<TokenCounters> xh50Var = this._tokenCounters;
        do {
            value = xh50Var.getValue();
            tokenCounters = value;
        } while (!xh50Var.compareAndSet(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        TokenCounters value;
        TokenCounters tokenCounters;
        xh50<TokenCounters> xh50Var = this._tokenCounters;
        do {
            value = xh50Var.getValue();
            tokenCounters = value;
        } while (!xh50Var.compareAndSet(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        Boolean value;
        Boolean bool;
        xh50<Boolean> xh50Var = this._isFirstInitAttempt;
        do {
            value = xh50Var.getValue();
            bool = value;
            bool.getClass();
        } while (!xh50Var.compareAndSet(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isNativeConfigReady() {
        return this.isInit.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        Boolean value;
        boolean isTestMode;
        xh50<Boolean> xh50Var = this._isTestModeEnabled;
        do {
            value = xh50Var.getValue();
            value.getClass();
            isTestMode = SdkProperties.isTestMode();
        } while (!xh50Var.compareAndSet(value, Boolean.valueOf(isTestMode)));
        return isTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object persistNativeConfiguration(spj<? super s3q0> spjVar) {
        Object obj = this.nativeConfigDataSource.set(getNativeConfiguration().toByteString(), spjVar);
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : s3q0.a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        xh50<TokenCounters> xh50Var = this._tokenCounters;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), new TokenCounters(0, 0, 0))) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(String str) {
        String value;
        xh50<String> xh50Var = this._gameId;
        do {
            value = xh50Var.getValue();
            ClientProperties.setGameId(str);
        } while (!xh50Var.compareAndSet(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setGatewayCache(ByteString byteString, spj<? super s3q0> spjVar) {
        Object obj = this.gatewayCacheDataSource.set(byteString, spjVar);
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : s3q0.a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(ByteString byteString) {
        xh50<ByteString> xh50Var = this._currentState;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), byteString)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(String str) {
        xh50<String> xh50Var = this._gatewayUrl;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), str)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationConfiguration(InitializationConfigurationInternal initializationConfigurationInternal) {
        this.initializationConfiguration = initializationConfigurationInternal;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationError(InitializationException initializationException) {
        xh50<InitializationException> xh50Var = this._initializationError;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), initializationException)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationLatency(int i) {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setInitializationLatency(i);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(InitializationState initializationState) {
        xh50<InitializationState> xh50Var = this._initializationState;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), initializationState)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setLastLoadLatency(int i) {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl _create;
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        do {
            value = xh50Var.getValue();
            _create = SessionCountersKt.Dsl.Companion._create(value.toBuilder());
            _create.setLastLoadLatency(i);
        } while (!xh50Var.compareAndSet(value, _create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
        xh50<NativeConfigurationOuterClass.NativeConfiguration> xh50Var = this._sdkConfiguration;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), nativeConfiguration)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r7.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r7.set(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setPrivacy(ByteString byteString, spj<? super s3q0> spjVar) {
        AndroidSessionRepository$setPrivacy$1 androidSessionRepository$setPrivacy$1;
        int i;
        if (spjVar instanceof AndroidSessionRepository$setPrivacy$1) {
            androidSessionRepository$setPrivacy$1 = (AndroidSessionRepository$setPrivacy$1) spjVar;
            int i2 = androidSessionRepository$setPrivacy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$setPrivacy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$setPrivacy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidSessionRepository$setPrivacy$1.label;
                if (i != 0) {
                    a.a(obj);
                    ByteStringDataSource byteStringDataSource = this.privacyDataSource;
                    androidSessionRepository$setPrivacy$1.L$0 = byteString;
                    androidSessionRepository$setPrivacy$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return s3q0.a;
                    }
                    byteString = (ByteString) androidSessionRepository$setPrivacy$1.L$0;
                    a.a(obj);
                }
                sh50<SessionChange> sh50Var = this._onChange;
                SessionChange.UserConsentChange userConsentChange = new SessionChange.UserConsentChange(byteString);
                androidSessionRepository$setPrivacy$1.L$0 = null;
                androidSessionRepository$setPrivacy$1.label = 2;
            }
        }
        androidSessionRepository$setPrivacy$1 = new AndroidSessionRepository$setPrivacy$1(this, spjVar);
        Object obj2 = androidSessionRepository$setPrivacy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidSessionRepository$setPrivacy$1.label;
        if (i != 0) {
        }
        sh50<SessionChange> sh50Var2 = this._onChange;
        SessionChange.UserConsentChange userConsentChange2 = new SessionChange.UserConsentChange(byteString);
        androidSessionRepository$setPrivacy$1.L$0 = null;
        androidSessionRepository$setPrivacy$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r7.emit(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r7.set(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setPrivacyFsm(ByteString byteString, spj<? super s3q0> spjVar) {
        AndroidSessionRepository$setPrivacyFsm$1 androidSessionRepository$setPrivacyFsm$1;
        int i;
        if (spjVar instanceof AndroidSessionRepository$setPrivacyFsm$1) {
            androidSessionRepository$setPrivacyFsm$1 = (AndroidSessionRepository$setPrivacyFsm$1) spjVar;
            int i2 = androidSessionRepository$setPrivacyFsm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSessionRepository$setPrivacyFsm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidSessionRepository$setPrivacyFsm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidSessionRepository$setPrivacyFsm$1.label;
                if (i != 0) {
                    a.a(obj);
                    ByteStringDataSource byteStringDataSource = this.fsmDataSource;
                    androidSessionRepository$setPrivacyFsm$1.L$0 = byteString;
                    androidSessionRepository$setPrivacyFsm$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return s3q0.a;
                    }
                    byteString = (ByteString) androidSessionRepository$setPrivacyFsm$1.L$0;
                    a.a(obj);
                }
                sh50<SessionChange> sh50Var = this._onChange;
                SessionChange.PrivacyFsmChange privacyFsmChange = new SessionChange.PrivacyFsmChange(byteString);
                androidSessionRepository$setPrivacyFsm$1.L$0 = null;
                androidSessionRepository$setPrivacyFsm$1.label = 2;
            }
        }
        androidSessionRepository$setPrivacyFsm$1 = new AndroidSessionRepository$setPrivacyFsm$1(this, spjVar);
        Object obj2 = androidSessionRepository$setPrivacyFsm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidSessionRepository$setPrivacyFsm$1.label;
        if (i != 0) {
        }
        sh50<SessionChange> sh50Var2 = this._onChange;
        SessionChange.PrivacyFsmChange privacyFsmChange2 = new SessionChange.PrivacyFsmChange(byteString);
        androidSessionRepository$setPrivacyFsm$1.L$0 = null;
        androidSessionRepository$setPrivacyFsm$1.label = 2;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setRequestUrlOverrides(List<InitializationResponseOuterClass.RequestUrlOverride> list) {
        xh50<List<InitializationResponseOuterClass.RequestUrlOverride>> xh50Var = this._requestUrlOverride;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), list)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
        xh50<SessionCountersOuterClass.SessionCounters> xh50Var = this._sessionCounters;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), sessionCounters)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(ByteString byteString) {
        xh50<ByteString> xh50Var = this._sessionToken;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), byteString)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z) {
        Boolean value;
        xh50<Boolean> xh50Var = this._shouldInitialize;
        do {
            value = xh50Var.getValue();
            value.getClass();
        } while (!xh50Var.compareAndSet(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(TokenCounters tokenCounters) {
        xh50<TokenCounters> xh50Var = this._tokenCounters;
        while (!xh50Var.compareAndSet(xh50Var.getValue(), tokenCounters)) {
        }
    }

    private AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, ovj ovjVar, SendDiagnosticEvent sendDiagnosticEvent, String str) {
        this.gatewayCacheDataSource = byteStringDataSource;
        this.privacyDataSource = byteStringDataSource2;
        this.fsmDataSource = byteStringDataSource3;
        this.nativeConfigDataSource = byteStringDataSource4;
        this.unityInfoDataSource = androidUnityInfoDataSource;
        utk0 a = vtk0.a(nativeConfiguration);
        this._sdkConfiguration = a;
        utk0 a2 = vtk0.a(Boolean.FALSE);
        this.isInit = a2;
        myc0.h(zvj.a(ovjVar), null, null, new AnonymousClass1(sendDiagnosticEvent, null), 3);
        final ztr ztrVar = new ztr(a, a2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final ksr<Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>> ksrVar = new ksr<Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                if (((Boolean) ((Pair) obj).j()).booleanValue()) {
                                    anonymousClass1.label = 1;
                                    if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public Object collect(lsr<? super Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        this.persistedNativeConfiguration = new ksr<NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                final /* synthetic */ lsr $this_unsafeFlow;

                @b6l(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {50}, m = "emit")
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar) {
                    this.$this_unsafeFlow = lsrVar;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                a.a(obj2);
                                lsr lsrVar = this.$this_unsafeFlow;
                                Object i3 = ((Pair) obj).i();
                                anonymousClass1.label = 1;
                                if (lsrVar.emit(i3, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public Object collect(lsr<? super NativeConfigurationOuterClass.NativeConfiguration> lsrVar, spj spjVar) {
                Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
        caj0 b = lyd.b(0, 0, null, 7);
        this._onChange = b;
        this.onChange = rsr.e(b);
        String gameId = ClientProperties.getGameId();
        this._gameId = vtk0.a(gameId == null ? null : gameId);
        this._sessionId = vtk0.a(ProtobufExtensionsKt.toByteString(UUID.fromString(SessionIdReader.INSTANCE.getSessionId())));
        this._isTestModeEnabled = vtk0.a(Boolean.valueOf(SdkProperties.isTestMode()));
        this._sessionCounters = vtk0.a(SessionCountersOuterClass.SessionCounters.newBuilder().build());
        this._tokenCounters = vtk0.a(new TokenCounters(0, 0, 0));
        this._initializationError = vtk0.a(null);
        ByteString byteString = ByteString.EMPTY;
        this._sessionToken = vtk0.a(byteString);
        this._currentState = vtk0.a(byteString);
        this._gatewayUrl = vtk0.a(str);
        this._initializationState = vtk0.a(InitializationState.NOT_INITIALIZED);
        this._requestUrlOverride = vtk0.a(EmptyList.b);
        this._headerBiddingTokenCounter = vtk0.a(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = vtk0.a(bool);
        this._isFirstInitAttempt = vtk0.a(bool);
    }

    public /* synthetic */ AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, ovj ovjVar, SendDiagnosticEvent sendDiagnosticEvent, String str, int i, zcl zclVar) {
        this(byteStringDataSource, byteStringDataSource2, byteStringDataSource3, byteStringDataSource4, androidUnityInfoDataSource, nativeConfiguration, ovjVar, sendDiagnosticEvent, (i & 256) != 0 ? GatewayUrl.m58constructorimpl(UnityAdsConstants.DefaultUrls.GATEWAY_URL) : str, null);
    }
}
