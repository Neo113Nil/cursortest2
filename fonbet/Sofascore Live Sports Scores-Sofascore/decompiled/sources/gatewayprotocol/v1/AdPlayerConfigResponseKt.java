package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigResponseKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdPlayerConfigResponseKt {

    @NotNull
    public static final AdPlayerConfigResponseKt INSTANCE = new AdPlayerConfigResponseKt();

    private AdPlayerConfigResponseKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020$J\u0006\u0010+\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010J\u0006\u00103\u001a\u00020$J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010>\u001a\u00020\u0010J\u0006\u0010E\u001a\u00020\u0010J\u0006\u0010F\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010%\u001a\u0004\u0018\u00010\u001c*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR$\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00104\u001a\u0004\u0018\u00010,*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b5\u00106R$\u00107\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR$\u0010;\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001aR$\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020?8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0017\u0010G\u001a\u0004\u0018\u00010?*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder;", "<init>", "(Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder;)V", "_build", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse;", U3.i.X, "Lcom/google/protobuf/ByteString;", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "getTrackingToken", "()Lcom/google/protobuf/ByteString;", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "clearTrackingToken", "", "impressionConfiguration", "getImpressionConfiguration", "setImpressionConfiguration", "clearImpressionConfiguration", "", "impressionConfigurationVersion", "getImpressionConfigurationVersion", "()I", "setImpressionConfigurationVersion", "(I)V", "clearImpressionConfigurationVersion", "Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "webviewConfiguration", "getWebviewConfiguration", "()Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", "setWebviewConfiguration", "(Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;)V", "clearWebviewConfiguration", "hasWebviewConfiguration", "", "webviewConfigurationOrNull", "getWebviewConfigurationOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;)Lgatewayprotocol/v1/WebviewConfiguration$WebViewConfiguration;", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "getAdDataRefreshToken", "setAdDataRefreshToken", "clearAdDataRefreshToken", "Lgatewayprotocol/v1/ErrorOuterClass$Error;", "error", "getError", "()Lgatewayprotocol/v1/ErrorOuterClass$Error;", "setError", "(Lgatewayprotocol/v1/ErrorOuterClass$Error;)V", "clearError", "hasError", "errorOrNull", "getErrorOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;)Lgatewayprotocol/v1/ErrorOuterClass$Error;", "adData", "getAdData", "setAdData", "clearAdData", "adDataVersion", "getAdDataVersion", "setAdDataVersion", "clearAdDataVersion", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "campaignMetadata", "getCampaignMetadata", "()Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "setCampaignMetadata", "(Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;)V", "clearCampaignMetadata", "hasCampaignMetadata", "campaignMetadataOrNull", "getCampaignMetadataOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;)Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignMetadata;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder _builder;

        private Dsl(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse _build() {
            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataRefreshToken() {
            this._builder.clearAdDataRefreshToken();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearCampaignMetadata() {
            this._builder.clearCampaignMetadata();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearImpressionConfiguration() {
            this._builder.clearImpressionConfiguration();
        }

        public final void clearImpressionConfigurationVersion() {
            this._builder.clearImpressionConfigurationVersion();
        }

        public final void clearTrackingToken() {
            this._builder.clearTrackingToken();
        }

        public final void clearWebviewConfiguration() {
            this._builder.clearWebviewConfiguration();
        }

        @NotNull
        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            adData.getClass();
            return adData;
        }

        @NotNull
        public final ByteString getAdDataRefreshToken() {
            ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
            adDataRefreshToken.getClass();
            return adDataRefreshToken;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        @NotNull
        public final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadata() {
            CampaignMetadataOuterClass.CampaignMetadata campaignMetadata = this._builder.getCampaignMetadata();
            campaignMetadata.getClass();
            return campaignMetadata;
        }

        @Nullable
        public final CampaignMetadataOuterClass.CampaignMetadata getCampaignMetadataOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return AdPlayerConfigResponseKtKt.getCampaignMetadataOrNull(dsl._builder);
        }

        @NotNull
        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            error.getClass();
            return error;
        }

        @Nullable
        public final ErrorOuterClass.Error getErrorOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return AdPlayerConfigResponseKtKt.getErrorOrNull(dsl._builder);
        }

        @NotNull
        public final ByteString getImpressionConfiguration() {
            ByteString impressionConfiguration = this._builder.getImpressionConfiguration();
            impressionConfiguration.getClass();
            return impressionConfiguration;
        }

        public final int getImpressionConfigurationVersion() {
            return this._builder.getImpressionConfigurationVersion();
        }

        @NotNull
        public final ByteString getTrackingToken() {
            ByteString trackingToken = this._builder.getTrackingToken();
            trackingToken.getClass();
            return trackingToken;
        }

        @NotNull
        public final WebviewConfiguration.WebViewConfiguration getWebviewConfiguration() {
            WebviewConfiguration.WebViewConfiguration webviewConfiguration = this._builder.getWebviewConfiguration();
            webviewConfiguration.getClass();
            return webviewConfiguration;
        }

        @Nullable
        public final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return AdPlayerConfigResponseKtKt.getWebviewConfigurationOrNull(dsl._builder);
        }

        public final boolean hasCampaignMetadata() {
            return this._builder.hasCampaignMetadata();
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasWebviewConfiguration() {
            return this._builder.hasWebviewConfiguration();
        }

        public final void setAdData(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setAdData(byteString);
        }

        public final void setAdDataRefreshToken(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setAdDataRefreshToken(byteString);
        }

        public final void setAdDataVersion(int i) {
            this._builder.setAdDataVersion(i);
        }

        public final void setCampaignMetadata(@NotNull CampaignMetadataOuterClass.CampaignMetadata campaignMetadata) {
            campaignMetadata.getClass();
            this._builder.setCampaignMetadata(campaignMetadata);
        }

        public final void setError(@NotNull ErrorOuterClass.Error error) {
            error.getClass();
            this._builder.setError(error);
        }

        public final void setImpressionConfiguration(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setImpressionConfiguration(byteString);
        }

        public final void setImpressionConfigurationVersion(int i) {
            this._builder.setImpressionConfigurationVersion(i);
        }

        public final void setTrackingToken(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setTrackingToken(byteString);
        }

        public final void setWebviewConfiguration(@NotNull WebviewConfiguration.WebViewConfiguration webViewConfiguration) {
            webViewConfiguration.getClass();
            this._builder.setWebviewConfiguration(webViewConfiguration);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/AdPlayerConfigResponseKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdPlayerConfigResponseOuterClass$AdPlayerConfigResponse$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
