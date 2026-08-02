package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.L6;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitializationRequestKt {

    @NotNull
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    private InitializationRequestKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0088\u0001\u0089\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010%\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012J\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0012J\u0006\u00103\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\u0012J\u0006\u00108\u001a\u00020\u0010J\u0006\u00109\u001a\u00020\u0012J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010A\u001a\u00020\u0012J\u0006\u0010G\u001a\u00020\u0010J\u0006\u0010K\u001a\u00020\u0010J\u0006\u0010L\u001a\u00020\u0012J\u0006\u0010P\u001a\u00020\u0010J\u0006\u0010Q\u001a\u00020\u0012J\u0006\u0010U\u001a\u00020\u0010J\u0006\u0010V\u001a\u00020\u0012J\u0006\u0010Z\u001a\u00020\u0010J\u0006\u0010[\u001a\u00020\u0012J\u0006\u0010_\u001a\u00020\u0010J\u0006\u0010`\u001a\u00020\u0012J3\u0010f\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b2\u0006\u0010g\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001bH\u0007¢\u0006\u0002\bhJ4\u0010i\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b2\u0006\u0010g\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001bH\u0087\n¢\u0006\u0002\bjJ+\u0010k\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b2\u0006\u0010g\u001a\u00020\u001bH\u0007¢\u0006\u0002\blJ7\u0010m\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0oH\u0007¢\u0006\u0002\bpJ#\u0010q\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0bH\u0007¢\u0006\u0002\brJ\u0006\u0010v\u001a\u00020\u0010J\u0006\u0010w\u001a\u00020\u0012J\u0006\u0010~\u001a\u00020\u0010J\u0006\u0010\u007f\u001a\u00020\u0012J\u0007\u0010\u0086\u0001\u001a\u00020\u0010J\u0007\u0010\u0087\u0001\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R$\u0010&\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R$\u0010+\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010 R$\u00100\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R$\u00105\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010 R$\u0010;\u001a\u00020:2\u0006\u0010\b\u001a\u00020:8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010B\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 R$\u0010M\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010\u0016\"\u0004\bO\u0010\u0018R$\u0010R\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u0016\"\u0004\bT\u0010\u0018R$\u0010W\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010\u0016\"\u0004\bY\u0010\u0018R$\u0010\\\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010\u001e\"\u0004\b^\u0010 R#\u0010a\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020c0b8G¢\u0006\u0006\u001a\u0004\bd\u0010eR$\u0010s\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bt\u0010\u001e\"\u0004\bu\u0010 R$\u0010y\u001a\u00020x2\u0006\u0010\b\u001a\u00020x8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010x*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0083\u0001\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\u001e\"\u0005\b\u0085\u0001\u0010 ¨\u0006\u008a\u0001"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest;", U3.i.X, "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "clientInfo", "getClientInfo", "()Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", "setClientInfo", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;)V", "clearClientInfo", "", "hasClientInfo", "", "Lcom/google/protobuf/ByteString;", "privacy", "getPrivacy", "()Lcom/google/protobuf/ByteString;", "setPrivacy", "(Lcom/google/protobuf/ByteString;)V", "clearPrivacy", "hasPrivacy", "", L6.P0, "getIdfi", "()Ljava/lang/String;", "setIdfi", "(Ljava/lang/String;)V", "clearIdfi", "sessionId", "getSessionId", "setSessionId", "clearSessionId", "cache", "getCache", "setCache", "clearCache", "hasCache", "legacyFlowUserConsent", "getLegacyFlowUserConsent", "setLegacyFlowUserConsent", "clearLegacyFlowUserConsent", "hasLegacyFlowUserConsent", "auid", "getAuid", "setAuid", "clearAuid", "hasAuid", "analyticsUserId", "getAnalyticsUserId", "setAnalyticsUserId", "clearAnalyticsUserId", "hasAnalyticsUserId", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "deviceInfo", "getDeviceInfo", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", "setDeviceInfo", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;)V", "clearDeviceInfo", "hasDeviceInfo", "isFirstInit", "getIsFirstInit", "()Z", "setIsFirstInit", "(Z)V", "clearIsFirstInit", "auidString", "getAuidString", "setAuidString", "clearAuidString", "hasAuidString", "uadsInitBlob", "getUadsInitBlob", "setUadsInitBlob", "clearUadsInitBlob", "hasUadsInitBlob", "unityInstallationId", "getUnityInstallationId", "setUnityInstallationId", "clearUnityInstallationId", "hasUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "setUnityMegaSessionId", "clearUnityMegaSessionId", "hasUnityMegaSessionId", "externalUserIdentifier", "getExternalUserIdentifier", "setExternalUserIdentifier", "clearExternalUserIdentifier", "hasExternalUserIdentifier", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "put", U3.i.W, "putExtras", "set", "setExtras", "remove", "removeExtras", "putAll", "map", "", "putAllExtras", "clear", "clearExtras", "unityBuildGuid", "getUnityBuildGuid", "setUnityBuildGuid", "clearUnityBuildGuid", "hasUnityBuildGuid", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "installReferrer", "getInstallReferrer", "()Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "setInstallReferrer", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;)V", "clearInstallReferrer", "hasInstallReferrer", "installReferrerOrNull", "getInstallReferrerOrNull", "(Lgatewayprotocol/v1/InitializationRequestKt$Dsl;)Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "googleAppId", "getGoogleAppId", "setGoogleAppId", "clearGoogleAppId", "hasGoogleAppId", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearExternalUserIdentifier() {
            this._builder.clearExternalUserIdentifier();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            dslMap.getClass();
            this._builder.clearExtras();
        }

        public final void clearGoogleAppId() {
            this._builder.clearGoogleAppId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearInstallReferrer() {
            this._builder.clearInstallReferrer();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearUadsInitBlob() {
            this._builder.clearUadsInitBlob();
        }

        public final void clearUnityBuildGuid() {
            this._builder.clearUnityBuildGuid();
        }

        public final void clearUnityInstallationId() {
            this._builder.clearUnityInstallationId();
        }

        public final void clearUnityMegaSessionId() {
            this._builder.clearUnityMegaSessionId();
        }

        @NotNull
        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            analyticsUserId.getClass();
            return analyticsUserId;
        }

        @NotNull
        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            auid.getClass();
            return auid;
        }

        @NotNull
        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            auidString.getClass();
            return auidString;
        }

        @NotNull
        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            cache.getClass();
            return cache;
        }

        @NotNull
        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            clientInfo.getClass();
            return clientInfo;
        }

        @NotNull
        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            deviceInfo.getClass();
            return deviceInfo;
        }

        @NotNull
        public final String getExternalUserIdentifier() {
            String externalUserIdentifier = this._builder.getExternalUserIdentifier();
            externalUserIdentifier.getClass();
            return externalUserIdentifier;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            extrasMap.getClass();
            return new DslMap(extrasMap);
        }

        @NotNull
        public final String getGoogleAppId() {
            String googleAppId = this._builder.getGoogleAppId();
            googleAppId.getClass();
            return googleAppId;
        }

        @NotNull
        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            idfi.getClass();
            return idfi;
        }

        @NotNull
        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrer() {
            InitializationRequestOuterClass.InstallReferrer installReferrer = this._builder.getInstallReferrer();
            installReferrer.getClass();
            return installReferrer;
        }

        @Nullable
        public final InitializationRequestOuterClass.InstallReferrer getInstallReferrerOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return InitializationRequestKtKt.getInstallReferrerOrNull(dsl._builder);
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        @NotNull
        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            legacyFlowUserConsent.getClass();
            return legacyFlowUserConsent;
        }

        @NotNull
        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            privacy.getClass();
            return privacy;
        }

        @NotNull
        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            sessionId.getClass();
            return sessionId;
        }

        @NotNull
        public final ByteString getUadsInitBlob() {
            ByteString uadsInitBlob = this._builder.getUadsInitBlob();
            uadsInitBlob.getClass();
            return uadsInitBlob;
        }

        @NotNull
        public final String getUnityBuildGuid() {
            String unityBuildGuid = this._builder.getUnityBuildGuid();
            unityBuildGuid.getClass();
            return unityBuildGuid;
        }

        @NotNull
        public final ByteString getUnityInstallationId() {
            ByteString unityInstallationId = this._builder.getUnityInstallationId();
            unityInstallationId.getClass();
            return unityInstallationId;
        }

        @NotNull
        public final ByteString getUnityMegaSessionId() {
            ByteString unityMegaSessionId = this._builder.getUnityMegaSessionId();
            unityMegaSessionId.getClass();
            return unityMegaSessionId;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasExternalUserIdentifier() {
            return this._builder.hasExternalUserIdentifier();
        }

        public final boolean hasGoogleAppId() {
            return this._builder.hasGoogleAppId();
        }

        public final boolean hasInstallReferrer() {
            return this._builder.hasInstallReferrer();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasUadsInitBlob() {
            return this._builder.hasUadsInitBlob();
        }

        public final boolean hasUnityBuildGuid() {
            return this._builder.hasUnityBuildGuid();
        }

        public final boolean hasUnityInstallationId() {
            return this._builder.hasUnityInstallationId();
        }

        public final boolean hasUnityMegaSessionId() {
            return this._builder.hasUnityMegaSessionId();
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            dslMap.getClass();
            map.getClass();
            this._builder.putAllExtras(map);
        }

        public final void putExtras(@NotNull DslMap<String, String, ExtrasProxy> dslMap, @NotNull String str, @NotNull String str2) {
            dslMap.getClass();
            str.getClass();
            str2.getClass();
            this._builder.putExtras(str, str2);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String str) {
            dslMap.getClass();
            str.getClass();
            this._builder.removeExtras(str);
        }

        public final void setAnalyticsUserId(@NotNull String str) {
            str.getClass();
            this._builder.setAnalyticsUserId(str);
        }

        public final void setAuid(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setAuid(byteString);
        }

        public final void setAuidString(@NotNull String str) {
            str.getClass();
            this._builder.setAuidString(str);
        }

        public final void setCache(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setCache(byteString);
        }

        public final void setClientInfo(@NotNull ClientInfoOuterClass.ClientInfo clientInfo) {
            clientInfo.getClass();
            this._builder.setClientInfo(clientInfo);
        }

        public final void setDeviceInfo(@NotNull InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
            initializationDeviceInfo.getClass();
            this._builder.setDeviceInfo(initializationDeviceInfo);
        }

        public final void setExternalUserIdentifier(@NotNull String str) {
            str.getClass();
            this._builder.setExternalUserIdentifier(str);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String str, String str2) {
            dslMap.getClass();
            str.getClass();
            str2.getClass();
            putExtras(dslMap, str, str2);
        }

        public final void setGoogleAppId(@NotNull String str) {
            str.getClass();
            this._builder.setGoogleAppId(str);
        }

        public final void setIdfi(@NotNull String str) {
            str.getClass();
            this._builder.setIdfi(str);
        }

        public final void setInstallReferrer(@NotNull InitializationRequestOuterClass.InstallReferrer installReferrer) {
            installReferrer.getClass();
            this._builder.setInstallReferrer(installReferrer);
        }

        public final void setIsFirstInit(boolean z) {
            this._builder.setIsFirstInit(z);
        }

        public final void setLegacyFlowUserConsent(@NotNull String str) {
            str.getClass();
            this._builder.setLegacyFlowUserConsent(str);
        }

        public final void setPrivacy(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setPrivacy(byteString);
        }

        public final void setSessionId(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setSessionId(byteString);
        }

        public final void setUadsInitBlob(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setUadsInitBlob(byteString);
        }

        public final void setUnityBuildGuid(@NotNull String str) {
            str.getClass();
            this._builder.setUnityBuildGuid(str);
        }

        public final void setUnityInstallationId(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setUnityInstallationId(byteString);
        }

        public final void setUnityMegaSessionId(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setUnityMegaSessionId(byteString);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/InitializationRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/InitializationRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
