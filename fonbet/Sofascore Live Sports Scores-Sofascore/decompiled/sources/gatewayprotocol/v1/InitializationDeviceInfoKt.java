package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/InitializationDeviceInfoKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitializationDeviceInfoKt {

    @NotNull
    public static final InitializationDeviceInfoKt INSTANCE = new InitializationDeviceInfoKt();

    private InitializationDeviceInfoKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u0006\n\u0002\b&\b\u0007\u0018\u0000 b2\u00020\u0001:\u0001bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010$\u001a\u00020%J\u0006\u0010,\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010C\u001a\u00020\u0010J\u0006\u0010G\u001a\u00020\u0010J\u0006\u0010K\u001a\u00020\u0010J\u0006\u0010O\u001a\u00020\u0010J\u0006\u0010S\u001a\u00020\u0010J\u0006\u0010W\u001a\u00020\u0010J\u0006\u0010[\u001a\u00020\u0010J\u0006\u0010\\\u001a\u00020%J\u0006\u0010`\u001a\u00020\u0010J\u0006\u0010a\u001a\u00020%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u00020&2\u0006\u0010\b\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R$\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR$\u00105\u001a\u00020&2\u0006\u0010\b\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010>\u001a\u00020=2\u0006\u0010\b\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010D\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R$\u0010H\u001a\u00020&2\u0006\u0010\b\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bI\u0010)\"\u0004\bJ\u0010+R$\u0010L\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010\u000eR$\u0010P\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR$\u0010T\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR$\u0010X\u001a\u00020&2\u0006\u0010\b\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010)\"\u0004\bZ\u0010+R$\u0010]\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010\f\"\u0004\b_\u0010\u000e¨\u0006c"}, d2 = {"Lgatewayprotocol/v1/InitializationDeviceInfoKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo$Builder;", "<init>", "(Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo$Builder;)V", "_build", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo;", U3.i.X, "", "bundleId", "getBundleId", "()Ljava/lang/String;", "setBundleId", "(Ljava/lang/String;)V", "clearBundleId", "", "deviceMake", "getDeviceMake", "setDeviceMake", "clearDeviceMake", "deviceModel", "getDeviceModel", "setDeviceModel", "clearDeviceModel", "osVersion", "getOsVersion", "setOsVersion", "clearOsVersion", "", "trackingAuthStatus", "getTrackingAuthStatus", "()I", "setTrackingAuthStatus", "(I)V", "clearTrackingAuthStatus", "hasTrackingAuthStatus", "", "", "totalDiskSpace", "getTotalDiskSpace", "()J", "setTotalDiskSpace", "(J)V", "clearTotalDiskSpace", "totalRamMemory", "getTotalRamMemory", "setTotalRamMemory", "clearTotalRamMemory", "hashedDeviceName", "getHashedDeviceName", "setHashedDeviceName", "clearHashedDeviceName", "currentUiTheme", "getCurrentUiTheme", "setCurrentUiTheme", "clearCurrentUiTheme", "networkOperator", "getNetworkOperator", "setNetworkOperator", "clearNetworkOperator", "", U3.j.Y, "getBatteryLevel", "()D", "setBatteryLevel", "(D)V", "clearBatteryLevel", "batteryStatus", "getBatteryStatus", "setBatteryStatus", "clearBatteryStatus", "systemBootTime", "getSystemBootTime", "setSystemBootTime", "clearSystemBootTime", "language", "getLanguage", "setLanguage", "clearLanguage", "localList", "getLocalList", "setLocalList", "clearLocalList", "connectionType", "getConnectionType", "setConnectionType", "clearConnectionType", "gridToken", "getGridToken", "setGridToken", "clearGridToken", "hasGridToken", "bundleVersion", "getBundleVersion", "setBundleVersion", "clearBundleVersion", "hasBundleVersion", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final InitializationRequestOuterClass.InitializationDeviceInfo.Builder _builder;

        private Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationDeviceInfo _build() {
            InitializationRequestOuterClass.InitializationDeviceInfo build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearBatteryLevel() {
            this._builder.clearBatteryLevel();
        }

        public final void clearBatteryStatus() {
            this._builder.clearBatteryStatus();
        }

        public final void clearBundleId() {
            this._builder.clearBundleId();
        }

        public final void clearBundleVersion() {
            this._builder.clearBundleVersion();
        }

        public final void clearConnectionType() {
            this._builder.clearConnectionType();
        }

        public final void clearCurrentUiTheme() {
            this._builder.clearCurrentUiTheme();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGridToken() {
            this._builder.clearGridToken();
        }

        public final void clearHashedDeviceName() {
            this._builder.clearHashedDeviceName();
        }

        public final void clearLanguage() {
            this._builder.clearLanguage();
        }

        public final void clearLocalList() {
            this._builder.clearLocalList();
        }

        public final void clearNetworkOperator() {
            this._builder.clearNetworkOperator();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearSystemBootTime() {
            this._builder.clearSystemBootTime();
        }

        public final void clearTotalDiskSpace() {
            this._builder.clearTotalDiskSpace();
        }

        public final void clearTotalRamMemory() {
            this._builder.clearTotalRamMemory();
        }

        public final void clearTrackingAuthStatus() {
            this._builder.clearTrackingAuthStatus();
        }

        public final double getBatteryLevel() {
            return this._builder.getBatteryLevel();
        }

        public final int getBatteryStatus() {
            return this._builder.getBatteryStatus();
        }

        @NotNull
        public final String getBundleId() {
            String bundleId = this._builder.getBundleId();
            bundleId.getClass();
            return bundleId;
        }

        @NotNull
        public final String getBundleVersion() {
            String bundleVersion = this._builder.getBundleVersion();
            bundleVersion.getClass();
            return bundleVersion;
        }

        @NotNull
        public final String getConnectionType() {
            String connectionType = this._builder.getConnectionType();
            connectionType.getClass();
            return connectionType;
        }

        public final long getCurrentUiTheme() {
            return this._builder.getCurrentUiTheme();
        }

        @NotNull
        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            deviceMake.getClass();
            return deviceMake;
        }

        @NotNull
        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            deviceModel.getClass();
            return deviceModel;
        }

        public final long getGridToken() {
            return this._builder.getGridToken();
        }

        @NotNull
        public final String getHashedDeviceName() {
            String hashedDeviceName = this._builder.getHashedDeviceName();
            hashedDeviceName.getClass();
            return hashedDeviceName;
        }

        @NotNull
        public final String getLanguage() {
            String language = this._builder.getLanguage();
            language.getClass();
            return language;
        }

        @NotNull
        public final String getLocalList() {
            String localList = this._builder.getLocalList();
            localList.getClass();
            return localList;
        }

        @NotNull
        public final String getNetworkOperator() {
            String networkOperator = this._builder.getNetworkOperator();
            networkOperator.getClass();
            return networkOperator;
        }

        @NotNull
        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            osVersion.getClass();
            return osVersion;
        }

        public final long getSystemBootTime() {
            return this._builder.getSystemBootTime();
        }

        public final long getTotalDiskSpace() {
            return this._builder.getTotalDiskSpace();
        }

        public final long getTotalRamMemory() {
            return this._builder.getTotalRamMemory();
        }

        public final int getTrackingAuthStatus() {
            return this._builder.getTrackingAuthStatus();
        }

        public final boolean hasBundleVersion() {
            return this._builder.hasBundleVersion();
        }

        public final boolean hasGridToken() {
            return this._builder.hasGridToken();
        }

        public final boolean hasTrackingAuthStatus() {
            return this._builder.hasTrackingAuthStatus();
        }

        public final void setBatteryLevel(double d) {
            this._builder.setBatteryLevel(d);
        }

        public final void setBatteryStatus(int i) {
            this._builder.setBatteryStatus(i);
        }

        public final void setBundleId(@NotNull String str) {
            str.getClass();
            this._builder.setBundleId(str);
        }

        public final void setBundleVersion(@NotNull String str) {
            str.getClass();
            this._builder.setBundleVersion(str);
        }

        public final void setConnectionType(@NotNull String str) {
            str.getClass();
            this._builder.setConnectionType(str);
        }

        public final void setCurrentUiTheme(long j) {
            this._builder.setCurrentUiTheme(j);
        }

        public final void setDeviceMake(@NotNull String str) {
            str.getClass();
            this._builder.setDeviceMake(str);
        }

        public final void setDeviceModel(@NotNull String str) {
            str.getClass();
            this._builder.setDeviceModel(str);
        }

        public final void setGridToken(long j) {
            this._builder.setGridToken(j);
        }

        public final void setHashedDeviceName(@NotNull String str) {
            str.getClass();
            this._builder.setHashedDeviceName(str);
        }

        public final void setLanguage(@NotNull String str) {
            str.getClass();
            this._builder.setLanguage(str);
        }

        public final void setLocalList(@NotNull String str) {
            str.getClass();
            this._builder.setLocalList(str);
        }

        public final void setNetworkOperator(@NotNull String str) {
            str.getClass();
            this._builder.setNetworkOperator(str);
        }

        public final void setOsVersion(@NotNull String str) {
            str.getClass();
            this._builder.setOsVersion(str);
        }

        public final void setSystemBootTime(long j) {
            this._builder.setSystemBootTime(j);
        }

        public final void setTotalDiskSpace(long j) {
            this._builder.setTotalDiskSpace(j);
        }

        public final void setTotalRamMemory(long j) {
            this._builder.setTotalRamMemory(j);
        }

        public final void setTrackingAuthStatus(int i) {
            this._builder.setTrackingAuthStatus(i);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/InitializationDeviceInfoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/InitializationDeviceInfoKt$Dsl;", "builder", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InitializationDeviceInfo$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationDeviceInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
