package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/AdRevenueEventRequestKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdRevenueEventRequestKt {

    @NotNull
    public static final AdRevenueEventRequestKt INSTANCE = new AdRevenueEventRequestKt();

    private AdRevenueEventRequestKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00109\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00101\u001a\u0002002\u0006\u0010\b\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u00020)2\u0006\u0010\b\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.¨\u0006;"}, d2 = {"Lgatewayprotocol/v1/AdRevenueEventRequestKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder;", "<init>", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder;)V", "_build", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", U3.i.X, "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "staticDeviceInfo", "getStaticDeviceInfo", "()Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "setStaticDeviceInfo", "(Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;)V", "clearStaticDeviceInfo", "", "hasStaticDeviceInfo", "", "Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "dynamicDeviceInfo", "getDynamicDeviceInfo", "()Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;", "setDynamicDeviceInfo", "(Lgatewayprotocol/v1/DynamicDeviceInfoOuterClass$DynamicDeviceInfo;)V", "clearDynamicDeviceInfo", "hasDynamicDeviceInfo", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "adRevenueData", "getAdRevenueData", "()Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;", "setAdRevenueData", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueData;)V", "clearAdRevenueData", "hasAdRevenueData", "Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "mediationProvider", "getMediationProvider", "()Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;", "setMediationProvider", "(Lgatewayprotocol/v1/ClientInfoOuterClass$MediationProvider;)V", "", "mediationProviderValue", "getMediationProviderValue", "()I", "setMediationProviderValue", "(I)V", "clearMediationProvider", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueOrigin;", "adRevenueOrigin", "getAdRevenueOrigin", "()Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueOrigin;", "setAdRevenueOrigin", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueOrigin;)V", "adRevenueOriginValue", "getAdRevenueOriginValue", "setAdRevenueOriginValue", "clearAdRevenueOrigin", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder _builder;

        private Dsl(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ AdRevenueEventRequestOuterClass.AdRevenueEventRequest _build() {
            AdRevenueEventRequestOuterClass.AdRevenueEventRequest build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAdRevenueData() {
            this._builder.clearAdRevenueData();
        }

        public final void clearAdRevenueOrigin() {
            this._builder.clearAdRevenueOrigin();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        @NotNull
        public final AdRevenueEventRequestOuterClass.AdRevenueData getAdRevenueData() {
            AdRevenueEventRequestOuterClass.AdRevenueData adRevenueData = this._builder.getAdRevenueData();
            adRevenueData.getClass();
            return adRevenueData;
        }

        @NotNull
        public final AdRevenueEventRequestOuterClass.AdRevenueOrigin getAdRevenueOrigin() {
            AdRevenueEventRequestOuterClass.AdRevenueOrigin adRevenueOrigin = this._builder.getAdRevenueOrigin();
            adRevenueOrigin.getClass();
            return adRevenueOrigin;
        }

        public final int getAdRevenueOriginValue() {
            return this._builder.getAdRevenueOriginValue();
        }

        @NotNull
        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            dynamicDeviceInfo.getClass();
            return dynamicDeviceInfo;
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
        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            staticDeviceInfo.getClass();
            return staticDeviceInfo;
        }

        public final boolean hasAdRevenueData() {
            return this._builder.hasAdRevenueData();
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setAdRevenueData(@NotNull AdRevenueEventRequestOuterClass.AdRevenueData adRevenueData) {
            adRevenueData.getClass();
            this._builder.setAdRevenueData(adRevenueData);
        }

        public final void setAdRevenueOrigin(@NotNull AdRevenueEventRequestOuterClass.AdRevenueOrigin adRevenueOrigin) {
            adRevenueOrigin.getClass();
            this._builder.setAdRevenueOrigin(adRevenueOrigin);
        }

        public final void setAdRevenueOriginValue(int i) {
            this._builder.setAdRevenueOriginValue(i);
        }

        public final void setDynamicDeviceInfo(@NotNull DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            dynamicDeviceInfo.getClass();
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setMediationProvider(@NotNull ClientInfoOuterClass.MediationProvider mediationProvider) {
            mediationProvider.getClass();
            this._builder.setMediationProvider(mediationProvider);
        }

        public final void setMediationProviderValue(int i) {
            this._builder.setMediationProviderValue(i);
        }

        public final void setStaticDeviceInfo(@NotNull StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            staticDeviceInfo.getClass();
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/AdRevenueEventRequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/AdRevenueEventRequestKt$Dsl;", "builder", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(AdRevenueEventRequestOuterClass.AdRevenueEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
