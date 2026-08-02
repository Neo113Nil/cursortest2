package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdPlayerConfigRequestKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdPlayerConfigRequestKt {
    public static final AdPlayerConfigRequestKt INSTANCE = new AdPlayerConfigRequestKt();

    /* compiled from: AdPlayerConfigRequestKt.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002QRB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00105\u001a\u000206H\u0001J\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u000208J\u0006\u0010:\u001a\u000208J\u0006\u0010;\u001a\u000208J\u0006\u0010<\u001a\u000208J\u0006\u0010=\u001a\u000208J\u0006\u0010>\u001a\u000208J\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020@J\u0006\u0010B\u001a\u00020@J\u0006\u0010C\u001a\u00020@J#\u0010D\u001a\u000208*\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019H\u0007¢\u0006\u0002\bEJ3\u0010F\u001a\u000208*\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001aH\u0007¢\u0006\u0002\bHJ7\u0010I\u001a\u000208*\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0KH\u0007¢\u0006\u0002\bLJ+\u0010M\u001a\u000208*\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010G\u001a\u00020\u001aH\u0007¢\u0006\u0002\bNJ4\u0010O\u001a\u000208*\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00192\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001aH\u0087\n¢\u0006\u0002\bPR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R#\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R$\u0010!\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020&2\u0006\u0010\u0005\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%R$\u0010/\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R\u0017\u00102\u001a\u0004\u0018\u00010&*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006S"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "(Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;)V", "value", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "", "adFormatValue", "getAdFormatValue", "()I", "setAdFormatValue", "(I)V", "Lcom/google/protobuf/ByteString;", "configurationToken", "getConfigurationToken", "()Lcom/google/protobuf/ByteString;", "setConfigurationToken", "(Lcom/google/protobuf/ByteString;)V", "extras", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$ExtrasProxy;", "getExtrasMap", "()Lcom/google/protobuf/kotlin/DslMap;", "impressionOpportunityId", "getImpressionOpportunityId", "setImpressionOpportunityId", "mediationAdUnitId", "getMediationAdUnitId", "()Ljava/lang/String;", "setMediationAdUnitId", "(Ljava/lang/String;)V", "Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "mediationInfo", "getMediationInfo", "()Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "setMediationInfo", "(Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;)V", "placementId", "getPlacementId", "setPlacementId", "webviewVersion", "getWebviewVersion", "setWebviewVersion", "mediationInfoOrNull", "getMediationInfoOrNull", "(Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;)Lgatewayprotocol/v1/MediationInfoOuterClass$MediationInfo;", "_build", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest;", "clearAdFormat", "", "clearConfigurationToken", "clearImpressionOpportunityId", "clearMediationAdUnitId", "clearMediationInfo", "clearPlacementId", "clearWebviewVersion", "hasAdFormat", "", "hasMediationAdUnitId", "hasMediationInfo", "hasWebviewVersion", "clear", "clearExtras", "put", "key", "putExtras", "putAll", "map", "", "putAllExtras", "remove", "removeExtras", "set", "setExtras", k.M, "ExtrasProxy", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder _builder;

        public /* synthetic */ Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: AdPlayerConfigRequestKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdPlayerConfigRequestOuterClass$AdPlayerConfigRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build() {
            AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            Intrinsics.checkNotNullExpressionValue(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final void setConfigurationToken(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setConfigurationToken(value);
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final String getPlacementId() {
            String placementId = this._builder.getPlacementId();
            Intrinsics.checkNotNullExpressionValue(placementId, "_builder.getPlacementId()");
            return placementId;
        }

        public final void setPlacementId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlacementId(value);
        }

        public final void clearPlacementId() {
            this._builder.clearPlacementId();
        }

        public final int getWebviewVersion() {
            return this._builder.getWebviewVersion();
        }

        public final void setWebviewVersion(int i) {
            this._builder.setWebviewVersion(i);
        }

        public final void clearWebviewVersion() {
            this._builder.clearWebviewVersion();
        }

        public final boolean hasWebviewVersion() {
            return this._builder.hasWebviewVersion();
        }

        public final ByteString getImpressionOpportunityId() {
            ByteString impressionOpportunityId = this._builder.getImpressionOpportunityId();
            Intrinsics.checkNotNullExpressionValue(impressionOpportunityId, "_builder.getImpressionOpportunityId()");
            return impressionOpportunityId;
        }

        public final void setImpressionOpportunityId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setImpressionOpportunityId(value);
        }

        public final void clearImpressionOpportunityId() {
            this._builder.clearImpressionOpportunityId();
        }

        public final AdFormatOuterClass.AdFormat getAdFormat() {
            AdFormatOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            Intrinsics.checkNotNullExpressionValue(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final void setAdFormat(AdFormatOuterClass.AdFormat value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdFormat(value);
        }

        public final int getAdFormatValue() {
            return this._builder.getAdFormatValue();
        }

        public final void setAdFormatValue(int i) {
            this._builder.setAdFormatValue(i);
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final boolean hasAdFormat() {
            return this._builder.hasAdFormat();
        }

        public final String getMediationAdUnitId() {
            String mediationAdUnitId = this._builder.getMediationAdUnitId();
            Intrinsics.checkNotNullExpressionValue(mediationAdUnitId, "_builder.getMediationAdUnitId()");
            return mediationAdUnitId;
        }

        public final void setMediationAdUnitId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationAdUnitId(value);
        }

        public final void clearMediationAdUnitId() {
            this._builder.clearMediationAdUnitId();
        }

        public final boolean hasMediationAdUnitId() {
            return this._builder.hasMediationAdUnitId();
        }

        /* compiled from: AdPlayerConfigRequestKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lgatewayprotocol/v1/AdPlayerConfigRequestKt$Dsl$ExtrasProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class ExtrasProxy extends DslProxy {
            private ExtrasProxy() {
            }
        }

        public final /* synthetic */ DslMap getExtrasMap() {
            Map<String, String> extrasMap = this._builder.getExtrasMap();
            Intrinsics.checkNotNullExpressionValue(extrasMap, "_builder.getExtrasMap()");
            return new DslMap(extrasMap);
        }

        public final void putExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putExtras(key, value);
        }

        public final /* synthetic */ void setExtras(DslMap<String, String, ExtrasProxy> dslMap, String key, String value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            putExtras(dslMap, key, value);
        }

        public final /* synthetic */ void removeExtras(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeExtras(key);
        }

        public final /* synthetic */ void putAllExtras(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllExtras(map);
        }

        public final /* synthetic */ void clearExtras(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearExtras();
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfo() {
            MediationInfoOuterClass.MediationInfo mediationInfo = this._builder.getMediationInfo();
            Intrinsics.checkNotNullExpressionValue(mediationInfo, "_builder.getMediationInfo()");
            return mediationInfo;
        }

        public final void setMediationInfo(MediationInfoOuterClass.MediationInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMediationInfo(value);
        }

        public final void clearMediationInfo() {
            this._builder.clearMediationInfo();
        }

        public final boolean hasMediationInfo() {
            return this._builder.hasMediationInfo();
        }

        public final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(Dsl dsl) {
            Intrinsics.checkNotNullParameter(dsl, "<this>");
            return AdPlayerConfigRequestKtKt.getMediationInfoOrNull(dsl._builder);
        }
    }

    private AdPlayerConfigRequestKt() {
    }
}
