package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRevenueDataKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt;", "", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdRevenueDataKt {
    public static final AdRevenueDataKt INSTANCE = new AdRevenueDataKt();

    /* compiled from: AdRevenueDataKt.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010-\u001a\u00020.H\u0001J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u000200J\u0006\u00102\u001a\u000200J\u0006\u00103\u001a\u000200J\u0006\u00104\u001a\u000200J\u0006\u00105\u001a\u000200J\u0006\u00106\u001a\u000200J\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u000208J\u0006\u0010:\u001a\u000208J\u0006\u0010;\u001a\u000208J\u0006\u0010<\u001a\u000208R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R$\u0010%\u001a\u00020$2\u0006\u0010\u0005\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017¨\u0006>"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;)V", "value", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "getAdFormat", "()Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "setAdFormat", "(Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;)V", "", "adFormatValue", "getAdFormatValue", "()I", "setAdFormatValue", "(I)V", "", "adUnitId", "getAdUnitId", "()Ljava/lang/String;", "setAdUnitId", "(Ljava/lang/String;)V", "countryCode", "getCountryCode", "setCountryCode", "Lcom/google/protobuf/ByteString;", "eventId", "getEventId", "()Lcom/google/protobuf/ByteString;", "setEventId", "(Lcom/google/protobuf/ByteString;)V", "networkName", "getNetworkName", "setNetworkName", "", "revenue", "getRevenue", "()D", "setRevenue", "(D)V", "thirdPartyAdPlacementId", "getThirdPartyAdPlacementId", "setThirdPartyAdPlacementId", "_build", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "clearAdFormat", "", "clearAdUnitId", "clearCountryCode", "clearEventId", "clearNetworkName", "clearRevenue", "clearThirdPartyAdPlacementId", "hasAdUnitId", "", "hasCountryCode", "hasNetworkName", "hasRevenue", "hasThirdPartyAdPlacementId", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdRevenueEventRequestOuterClass.AdRevenueData.Builder _builder;

        public /* synthetic */ Dsl(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: AdRevenueDataKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lgatewayprotocol/v1/AdRevenueDataKt$Dsl$Companion;", "", "()V", "_create", "Lgatewayprotocol/v1/AdRevenueDataKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(AdRevenueEventRequestOuterClass.AdRevenueData.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ AdRevenueEventRequestOuterClass.AdRevenueData _build() {
            AdRevenueEventRequestOuterClass.AdRevenueData build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            Intrinsics.checkNotNullExpressionValue(eventId, "_builder.getEventId()");
            return eventId;
        }

        public final void setEventId(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setEventId(value);
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final double getRevenue() {
            return this._builder.getRevenue();
        }

        public final void setRevenue(double d) {
            this._builder.setRevenue(d);
        }

        public final void clearRevenue() {
            this._builder.clearRevenue();
        }

        public final boolean hasRevenue() {
            return this._builder.hasRevenue();
        }

        public final String getCountryCode() {
            String countryCode = this._builder.getCountryCode();
            Intrinsics.checkNotNullExpressionValue(countryCode, "_builder.getCountryCode()");
            return countryCode;
        }

        public final void setCountryCode(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCountryCode(value);
        }

        public final void clearCountryCode() {
            this._builder.clearCountryCode();
        }

        public final boolean hasCountryCode() {
            return this._builder.hasCountryCode();
        }

        public final String getNetworkName() {
            String networkName = this._builder.getNetworkName();
            Intrinsics.checkNotNullExpressionValue(networkName, "_builder.getNetworkName()");
            return networkName;
        }

        public final void setNetworkName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNetworkName(value);
        }

        public final void clearNetworkName() {
            this._builder.clearNetworkName();
        }

        public final boolean hasNetworkName() {
            return this._builder.hasNetworkName();
        }

        public final String getAdUnitId() {
            String adUnitId = this._builder.getAdUnitId();
            Intrinsics.checkNotNullExpressionValue(adUnitId, "_builder.getAdUnitId()");
            return adUnitId;
        }

        public final void setAdUnitId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAdUnitId(value);
        }

        public final void clearAdUnitId() {
            this._builder.clearAdUnitId();
        }

        public final boolean hasAdUnitId() {
            return this._builder.hasAdUnitId();
        }

        public final String getThirdPartyAdPlacementId() {
            String thirdPartyAdPlacementId = this._builder.getThirdPartyAdPlacementId();
            Intrinsics.checkNotNullExpressionValue(thirdPartyAdPlacementId, "_builder.getThirdPartyAdPlacementId()");
            return thirdPartyAdPlacementId;
        }

        public final void setThirdPartyAdPlacementId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setThirdPartyAdPlacementId(value);
        }

        public final void clearThirdPartyAdPlacementId() {
            this._builder.clearThirdPartyAdPlacementId();
        }

        public final boolean hasThirdPartyAdPlacementId() {
            return this._builder.hasThirdPartyAdPlacementId();
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
    }

    private AdRevenueDataKt() {
    }
}
