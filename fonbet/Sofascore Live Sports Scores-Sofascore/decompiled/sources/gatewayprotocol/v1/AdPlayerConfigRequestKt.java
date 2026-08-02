package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdPlayerConfigRequestKt {

    @NotNull
    public static final AdPlayerConfigRequestKt INSTANCE = new AdPlayerConfigRequestKt();

    private AdPlayerConfigRequestKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 R2\u00020\u0001:\u0002RSB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020 J\u0006\u00103\u001a\u00020\u0010J\u0006\u00104\u001a\u00020 J3\u0010:\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u000207062\u0006\u0010;\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H\u0007¢\u0006\u0002\b<J4\u0010=\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u000207062\u0006\u0010;\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011H\u0087\n¢\u0006\u0002\b>J+\u0010?\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u000207062\u0006\u0010;\u001a\u00020\u0011H\u0007¢\u0006\u0002\b@J7\u0010A\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u000207062\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110CH\u0007¢\u0006\u0002\bDJ#\u0010E\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020706H\u0007¢\u0006\u0002\bFJ\u0006\u0010M\u001a\u00020\u0010J\u0006\u0010N\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR$\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020%8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR$\u00100\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016R#\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u000207068G¢\u0006\u0006\u001a\u0004\b8\u00109R$\u0010H\u001a\u00020G2\u0006\u0010\b\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0017\u0010O\u001a\u0004\u0018\u00010G*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", U3.i.X, "Lcom/google/protobuf/ByteString;", "configurationToken", "getConfigurationToken", "()Lcom/google/protobuf/ByteString;", "setConfigurationToken", "(Lcom/google/protobuf/ByteString;)V", "clearConfigurationToken", "", "", "placementId", "getPlacementId", "()Ljava/lang/String;", "setPlacementId", "(Ljava/lang/String;)V", "clearPlacementId", "", "webviewVersion", "getWebviewVersion", "()I", "setWebviewVersion", "(I)V", "clearWebviewVersion", "hasWebviewVersion", "", "impressionOpportunityId", "getImpressionOpportunityId", "setImpressionOpportunityId", "clearImpressionOpportunityId", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "adFormatValue", "getAdFormatValue", "setAdFormatValue", "clearAdFormat", "hasAdFormat", "mediationAdUnitId", "getMediationAdUnitId", "setMediationAdUnitId", "clearMediationAdUnitId", "hasMediationAdUnitId", HandleInvocationsFromAdViewer.KEY_EXTRAS, "Lcom/google/protobuf/kotlin/DslMap;", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "put", U3.i.W, "putExtras", "set", "setExtras", "remove", "removeExtras", "putAll", "map", "", "putAllExtras", "clear", "clearExtras", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfo", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "clearMediationInfo", "hasMediationInfo", "mediationInfoOrNull", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "Companion", "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder _builder;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        private Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build() {
            AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            dslMap.getClass();
            this._builder.clearExtras();
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        @NotNull
        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            adFormat.getClass();
            return adFormat;
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        @NotNull
        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            configurationToken.getClass();
            return configurationToken;
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            extrasMap.getClass();
            return new DslMap(extrasMap);
        }

        @NotNull
        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            impressionOpportunityId.getClass();
            return impressionOpportunityId;
        }

        @NotNull
        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            mediationAdUnitId.getClass();
            return mediationAdUnitId;
        }

        @NotNull
        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            mediationInfo.getClass();
            return mediationInfo;
        }

        @Nullable
        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(@NotNull Dsl dsl) {
            dsl.getClass();
            return AdPlayerConfigRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }

        @NotNull
        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            placementId.getClass();
            return placementId;
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
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

        public final void setAdFormat(@NotNull AdFormatOuterClass.AdFormat adFormat) {
            adFormat.getClass();
            this._builder.setAdFormat(adFormat);
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void setConfigurationToken(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setConfigurationToken(byteString);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String str, String str2) {
            dslMap.getClass();
            str.getClass();
            str2.getClass();
            putExtras(dslMap, str, str2);
        }

        public final void setImpressionOpportunityId(@NotNull ByteString byteString) {
            byteString.getClass();
            this._builder.setImpressionOpportunityId(byteString);
        }

        public final void setMediationAdUnitId(@NotNull String str) {
            str.getClass();
            this._builder.setMediationAdUnitId(str);
        }

        public final void setMediationInfo(@NotNull MediationInfoOuterClass.MediationInfo mediationInfo) {
            mediationInfo.getClass();
            this._builder.setMediationInfo(mediationInfo);
        }

        public final void setPlacementId(@NotNull String str) {
            str.getClass();
            this._builder.setPlacementId(str);
        }

        public final void setWebviewVersion(int i) {
            this._builder.setWebviewVersion(i);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
