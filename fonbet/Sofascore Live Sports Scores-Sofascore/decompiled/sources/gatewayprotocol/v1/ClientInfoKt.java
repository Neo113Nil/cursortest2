package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.Fc;
import com.ironsource.L6;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/ClientInfoKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClientInfoKt {

    @NotNull
    public static final ClientInfoKt INSTANCE = new ClientInfoKt();

    private ClientInfoKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b=\b\u0007\u0018\u0000 i2\u00020\u0001:\u0001iB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0006\u00106\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010;\u001a\u00020\u001cJ\u0006\u0010?\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u001cJ\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010E\u001a\u00020\u001cJ\u0006\u0010I\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u001cJ\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010O\u001a\u00020\u001cJ\u0006\u0010S\u001a\u00020\u0010J\u0006\u0010T\u001a\u00020\u001cJ\u0006\u0010X\u001a\u00020\u0010J\u0006\u0010Y\u001a\u00020\u001cJ\u0006\u0010]\u001a\u00020\u0010J\u0006\u0010^\u001a\u00020\u001cJ\u0006\u0010b\u001a\u00020\u0010J\u0006\u0010c\u001a\u00020\u001cJ\u0006\u0010g\u001a\u00020\u0010J\u0006\u0010h\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR$\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020-8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR$\u00107\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R$\u0010<\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u0010\u0016R$\u0010A\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0014\"\u0004\bC\u0010\u0016R$\u0010F\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0014\"\u0004\bH\u0010\u0016R$\u0010K\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0014\"\u0004\bM\u0010\u0016R$\u0010P\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010\u0014\"\u0004\bR\u0010\u0016R$\u0010U\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010\u0014\"\u0004\bW\u0010\u0016R$\u0010Z\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\u001f\"\u0004\b\\\u0010!R$\u0010_\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010\u0014\"\u0004\ba\u0010\u0016R$\u0010d\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\be\u0010\u0014\"\u0004\bf\u0010\u0016¨\u0006j"}, d2 = {"Lgatewayprotocol/v1/ClientInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;", "<init>", "(Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;)V", "_build", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo;", U3.i.X, "", "sdkVersion", "getSdkVersion", "()I", "setSdkVersion", "(I)V", "clearSdkVersion", "", "", "sdkVersionName", "getSdkVersionName", "()Ljava/lang/String;", "setSdkVersionName", "(Ljava/lang/String;)V", "clearSdkVersionName", AndroidGetAdPlayerContext.KEY_GAME_ID, "getGameId", "setGameId", "clearGameId", "", "test", "getTest", "()Z", "setTest", "(Z)V", "clearTest", "Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", L6.H, "getPlatform", "()Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;", "setPlatform", "(Lgatewayprotocol/v1/ClientInfoOuterClass$Platform;)V", "platformValue", "getPlatformValue", "setPlatformValue", "clearPlatform", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "getMediationProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setMediationProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "mediationProviderValue", "getMediationProviderValue", "setMediationProviderValue", "clearMediationProvider", "customMediationName", "getCustomMediationName", "setCustomMediationName", "clearCustomMediationName", "hasCustomMediationName", "mediationVersion", "getMediationVersion", "setMediationVersion", "clearMediationVersion", "hasMediationVersion", Fc.i, "getOmidPartnerVersion", "setOmidPartnerVersion", "clearOmidPartnerVersion", "hasOmidPartnerVersion", Fc.g, "getOmidVersion", "setOmidVersion", "clearOmidVersion", "hasOmidVersion", "sdkDevelopmentPlatform", "getSdkDevelopmentPlatform", "setSdkDevelopmentPlatform", "clearSdkDevelopmentPlatform", "hasSdkDevelopmentPlatform", "scarVersionName", "getScarVersionName", "setScarVersionName", "clearScarVersionName", "hasScarVersionName", "offerwallVersion", "getOfferwallVersion", "setOfferwallVersion", "clearOfferwallVersion", "hasOfferwallVersion", "isFidAvailable", "getIsFidAvailable", "setIsFidAvailable", "clearIsFidAvailable", "hasIsFidAvailable", "mediationAdapterVersion", "getMediationAdapterVersion", "setMediationAdapterVersion", "clearMediationAdapterVersion", "hasMediationAdapterVersion", "adQualitySdkVersion", "getAdQualitySdkVersion", "setAdQualitySdkVersion", "clearAdQualitySdkVersion", "hasAdQualitySdkVersion", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final ClientInfoOuterClass.ClientInfo.Builder _builder;

        private Dsl(ClientInfoOuterClass.ClientInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ ClientInfoOuterClass.ClientInfo _build() {
            ClientInfoOuterClass.ClientInfo build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAdQualitySdkVersion() {
            this._builder.clearAdQualitySdkVersion();
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIsFidAvailable() {
            this._builder.clearIsFidAvailable();
        }

        public final void clearMediationAdapterVersion() {
            this._builder.clearMediationAdapterVersion();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOfferwallVersion() {
            this._builder.clearOfferwallVersion();
        }

        public final void clearOmidPartnerVersion() {
            this._builder.clearOmidPartnerVersion();
        }

        public final void clearOmidVersion() {
            this._builder.clearOmidVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearScarVersionName() {
            this._builder.clearScarVersionName();
        }

        public final void clearSdkDevelopmentPlatform() {
            this._builder.clearSdkDevelopmentPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearTest() {
            this._builder.clearTest();
        }

        @NotNull
        public final String getAdQualitySdkVersion() {
            String adQualitySdkVersion = this._builder.getAdQualitySdkVersion();
            adQualitySdkVersion.getClass();
            return adQualitySdkVersion;
        }

        @NotNull
        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            customMediationName.getClass();
            return customMediationName;
        }

        @NotNull
        public final String getGameId() {
            String gameId = this._builder.getGameId();
            gameId.getClass();
            return gameId;
        }

        public final boolean getIsFidAvailable() {
            return this._builder.getIsFidAvailable();
        }

        @NotNull
        public final String getMediationAdapterVersion() {
            String mediationAdapterVersion = this._builder.getMediationAdapterVersion();
            mediationAdapterVersion.getClass();
            return mediationAdapterVersion;
        }

        @NotNull
        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            mediationProvider.getClass();
            return mediationProvider;
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        @NotNull
        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            mediationVersion.getClass();
            return mediationVersion;
        }

        @NotNull
        public final String getOfferwallVersion() {
            String offerwallVersion = this._builder.getOfferwallVersion();
            offerwallVersion.getClass();
            return offerwallVersion;
        }

        @NotNull
        public final String getOmidPartnerVersion() {
            String omidPartnerVersion = this._builder.getOmidPartnerVersion();
            omidPartnerVersion.getClass();
            return omidPartnerVersion;
        }

        @NotNull
        public final String getOmidVersion() {
            String omidVersion = this._builder.getOmidVersion();
            omidVersion.getClass();
            return omidVersion;
        }

        @NotNull
        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            platform.getClass();
            return platform;
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        @NotNull
        public final String getScarVersionName() {
            String scarVersionName = this._builder.getScarVersionName();
            scarVersionName.getClass();
            return scarVersionName;
        }

        @NotNull
        public final String getSdkDevelopmentPlatform() {
            String sdkDevelopmentPlatform = this._builder.getSdkDevelopmentPlatform();
            sdkDevelopmentPlatform.getClass();
            return sdkDevelopmentPlatform;
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        @NotNull
        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            sdkVersionName.getClass();
            return sdkVersionName;
        }

        public final boolean getTest() {
            return this._builder.getTest();
        }

        public final boolean hasAdQualitySdkVersion() {
            return this._builder.hasAdQualitySdkVersion();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasIsFidAvailable() {
            return this._builder.hasIsFidAvailable();
        }

        public final boolean hasMediationAdapterVersion() {
            return this._builder.hasMediationAdapterVersion();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasOfferwallVersion() {
            return this._builder.hasOfferwallVersion();
        }

        public final boolean hasOmidPartnerVersion() {
            return this._builder.hasOmidPartnerVersion();
        }

        public final boolean hasOmidVersion() {
            return this._builder.hasOmidVersion();
        }

        public final boolean hasScarVersionName() {
            return this._builder.hasScarVersionName();
        }

        public final boolean hasSdkDevelopmentPlatform() {
            return this._builder.hasSdkDevelopmentPlatform();
        }

        public final void setAdQualitySdkVersion(@NotNull String str) {
            str.getClass();
            this._builder.setAdQualitySdkVersion(str);
        }

        public final void setCustomMediationName(@NotNull String str) {
            str.getClass();
            this._builder.setCustomMediationName(str);
        }

        public final void setGameId(@NotNull String str) {
            str.getClass();
            this._builder.setGameId(str);
        }

        public final void setIsFidAvailable(boolean z) {
            this._builder.setIsFidAvailable(z);
        }

        public final void setMediationAdapterVersion(@NotNull String str) {
            str.getClass();
            this._builder.setMediationAdapterVersion(str);
        }

        public final void setMediationProvider(@NotNull ClientInfoOuterClass.MediationProvider mediationProvider) {
            mediationProvider.getClass();
            this._builder.setMediationProvider(mediationProvider);
        }

        public final void setMediationProviderValue(int i) {
            this._builder.setMediationProviderValue(i);
        }

        public final void setMediationVersion(@NotNull String str) {
            str.getClass();
            this._builder.setMediationVersion(str);
        }

        public final void setOfferwallVersion(@NotNull String str) {
            str.getClass();
            this._builder.setOfferwallVersion(str);
        }

        public final void setOmidPartnerVersion(@NotNull String str) {
            str.getClass();
            this._builder.setOmidPartnerVersion(str);
        }

        public final void setOmidVersion(@NotNull String str) {
            str.getClass();
            this._builder.setOmidVersion(str);
        }

        public final void setPlatform(@NotNull ClientInfoOuterClass.Platform platform) {
            platform.getClass();
            this._builder.setPlatform(platform);
        }

        public final void setPlatformValue(int i) {
            this._builder.setPlatformValue(i);
        }

        public final void setScarVersionName(@NotNull String str) {
            str.getClass();
            this._builder.setScarVersionName(str);
        }

        public final void setSdkDevelopmentPlatform(@NotNull String str) {
            str.getClass();
            this._builder.setSdkDevelopmentPlatform(str);
        }

        public final void setSdkVersion(int i) {
            this._builder.setSdkVersion(i);
        }

        public final void setSdkVersionName(@NotNull String str) {
            str.getClass();
            this._builder.setSdkVersionName(str);
        }

        public final void setTest(boolean z) {
            this._builder.setTest(z);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/ClientInfoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/ClientInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/ClientInfoOuterClass$ClientInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(ClientInfoOuterClass.ClientInfo.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ClientInfoOuterClass.ClientInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
