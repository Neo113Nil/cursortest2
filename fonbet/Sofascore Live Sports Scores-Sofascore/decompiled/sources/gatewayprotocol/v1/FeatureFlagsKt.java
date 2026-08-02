package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.U3;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureFlagsKt {

    @NotNull
    public static final FeatureFlagsKt INSTANCE = new FeatureFlagsKt();

    private FeatureFlagsKt() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 p2\u00020\u0001:\u0001pB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010H\u001a\u00020\u0010J\u0006\u0010U\u001a\u00020\u0010J\u0006\u0010Y\u001a\u00020\u0010J\u0006\u0010]\u001a\u00020\u0010J\u0006\u0010a\u001a\u00020\u0010J\u0006\u0010k\u001a\u00020\u0010J\u0006\u0010o\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR$\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR$\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR$\u00105\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010=\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR$\u0010A\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR$\u0010E\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR$\u0010J\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010P\u001a\u00020O2\u0006\u0010\b\u001a\u00020O8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010V\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010\f\"\u0004\bX\u0010\u000eR$\u0010Z\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010\u000eR$\u0010^\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010\u000eR$\u0010c\u001a\u00020b2\u0006\u0010\b\u001a\u00020b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010h\u001a\u00020O2\u0006\u0010\b\u001a\u00020O8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010R\"\u0004\bj\u0010TR$\u0010l\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010\f\"\u0004\bn\u0010\u000e¨\u0006q"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;", "<init>", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;)V", "_build", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", U3.i.X, "", "openglGpuEnabled", "getOpenglGpuEnabled", "()Z", "setOpenglGpuEnabled", "(Z)V", "clearOpenglGpuEnabled", "", "opportunityIdPlacementValidation", "getOpportunityIdPlacementValidation", "setOpportunityIdPlacementValidation", "clearOpportunityIdPlacementValidation", "boldSdkNextSessionEnabled", "getBoldSdkNextSessionEnabled", "setBoldSdkNextSessionEnabled", "clearBoldSdkNextSessionEnabled", "appSheetBugCheckEnabled", "getAppSheetBugCheckEnabled", "setAppSheetBugCheckEnabled", "clearAppSheetBugCheckEnabled", "recoverTerminatedWebviews", "getRecoverTerminatedWebviews", "setRecoverTerminatedWebviews", "clearRecoverTerminatedWebviews", "shouldHandleWebviewCaching", "getShouldHandleWebviewCaching", "setShouldHandleWebviewCaching", "clearShouldHandleWebviewCaching", "shouldSendIapHistory", "getShouldSendIapHistory", "setShouldSendIapHistory", "clearShouldSendIapHistory", "collectIlrData", "getCollectIlrData", "setCollectIlrData", "clearCollectIlrData", "disableGridCollection", "getDisableGridCollection", "setDisableGridCollection", "clearDisableGridCollection", "disableCustomScheme", "getDisableCustomScheme", "setDisableCustomScheme", "clearDisableCustomScheme", "useFilesDir", "getUseFilesDir", "setUseFilesDir", "clearUseFilesDir", "useTryCatchInDownloadQueue", "getUseTryCatchInDownloadQueue", "setUseTryCatchInDownloadQueue", "clearUseTryCatchInDownloadQueue", "ensureCacheFolderExistences", "getEnsureCacheFolderExistences", "setEnsureCacheFolderExistences", "clearEnsureCacheFolderExistences", "webviewLessLoadParallelActivityLaunch", "getWebviewLessLoadParallelActivityLaunch", "setWebviewLessLoadParallelActivityLaunch", "clearWebviewLessLoadParallelActivityLaunch", "collectLifecycleEvents", "getCollectLifecycleEvents", "setCollectLifecycleEvents", "clearCollectLifecycleEvents", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeStartMode;", "nativeStartMode", "getNativeStartMode", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeStartMode;", "setNativeStartMode", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeStartMode;)V", "", "nativeStartModeValue", "getNativeStartModeValue", "()I", "setNativeStartModeValue", "(I)V", "clearNativeStartMode", "useOptimisticWebviewCache", "getUseOptimisticWebviewCache", "setUseOptimisticWebviewCache", "clearUseOptimisticWebviewCache", "collectGoogleAppId", "getCollectGoogleAppId", "setCollectGoogleAppId", "clearCollectGoogleAppId", "enableCoherenceLibrary", "getEnableCoherenceLibrary", "setEnableCoherenceLibrary", "clearEnableCoherenceLibrary", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FullscreenNavBarMode;", "fullscreenNavBarMode", "getFullscreenNavBarMode", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FullscreenNavBarMode;", "setFullscreenNavBarMode", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$FullscreenNavBarMode;)V", "fullscreenNavBarModeValue", "getFullscreenNavBarModeValue", "setFullscreenNavBarModeValue", "clearFullscreenNavBarMode", "shouldInitAdqWithGameId", "getShouldInitAdqWithGameId", "setShouldInitAdqWithGameId", "clearShouldInitAdqWithGameId", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final NativeConfigurationOuterClass.FeatureFlags.Builder _builder;

        private Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NativeConfigurationOuterClass.FeatureFlags _build() {
            NativeConfigurationOuterClass.FeatureFlags build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearAppSheetBugCheckEnabled() {
            this._builder.clearAppSheetBugCheckEnabled();
        }

        public final void clearBoldSdkNextSessionEnabled() {
            this._builder.clearBoldSdkNextSessionEnabled();
        }

        public final void clearCollectGoogleAppId() {
            this._builder.clearCollectGoogleAppId();
        }

        public final void clearCollectIlrData() {
            this._builder.clearCollectIlrData();
        }

        public final void clearCollectLifecycleEvents() {
            this._builder.clearCollectLifecycleEvents();
        }

        public final void clearDisableCustomScheme() {
            this._builder.clearDisableCustomScheme();
        }

        public final void clearDisableGridCollection() {
            this._builder.clearDisableGridCollection();
        }

        public final void clearEnableCoherenceLibrary() {
            this._builder.clearEnableCoherenceLibrary();
        }

        public final void clearEnsureCacheFolderExistences() {
            this._builder.clearEnsureCacheFolderExistences();
        }

        public final void clearFullscreenNavBarMode() {
            this._builder.clearFullscreenNavBarMode();
        }

        public final void clearNativeStartMode() {
            this._builder.clearNativeStartMode();
        }

        public final void clearOpenglGpuEnabled() {
            this._builder.clearOpenglGpuEnabled();
        }

        public final void clearOpportunityIdPlacementValidation() {
            this._builder.clearOpportunityIdPlacementValidation();
        }

        public final void clearRecoverTerminatedWebviews() {
            this._builder.clearRecoverTerminatedWebviews();
        }

        public final void clearShouldHandleWebviewCaching() {
            this._builder.clearShouldHandleWebviewCaching();
        }

        public final void clearShouldInitAdqWithGameId() {
            this._builder.clearShouldInitAdqWithGameId();
        }

        public final void clearShouldSendIapHistory() {
            this._builder.clearShouldSendIapHistory();
        }

        public final void clearUseFilesDir() {
            this._builder.clearUseFilesDir();
        }

        public final void clearUseOptimisticWebviewCache() {
            this._builder.clearUseOptimisticWebviewCache();
        }

        public final void clearUseTryCatchInDownloadQueue() {
            this._builder.clearUseTryCatchInDownloadQueue();
        }

        public final void clearWebviewLessLoadParallelActivityLaunch() {
            this._builder.clearWebviewLessLoadParallelActivityLaunch();
        }

        public final boolean getAppSheetBugCheckEnabled() {
            return this._builder.getAppSheetBugCheckEnabled();
        }

        public final boolean getBoldSdkNextSessionEnabled() {
            return this._builder.getBoldSdkNextSessionEnabled();
        }

        public final boolean getCollectGoogleAppId() {
            return this._builder.getCollectGoogleAppId();
        }

        public final boolean getCollectIlrData() {
            return this._builder.getCollectIlrData();
        }

        public final boolean getCollectLifecycleEvents() {
            return this._builder.getCollectLifecycleEvents();
        }

        public final boolean getDisableCustomScheme() {
            return this._builder.getDisableCustomScheme();
        }

        public final boolean getDisableGridCollection() {
            return this._builder.getDisableGridCollection();
        }

        public final boolean getEnableCoherenceLibrary() {
            return this._builder.getEnableCoherenceLibrary();
        }

        public final boolean getEnsureCacheFolderExistences() {
            return this._builder.getEnsureCacheFolderExistences();
        }

        @NotNull
        public final NativeConfigurationOuterClass.FullscreenNavBarMode getFullscreenNavBarMode() {
            NativeConfigurationOuterClass.FullscreenNavBarMode fullscreenNavBarMode = this._builder.getFullscreenNavBarMode();
            fullscreenNavBarMode.getClass();
            return fullscreenNavBarMode;
        }

        public final int getFullscreenNavBarModeValue() {
            return this._builder.getFullscreenNavBarModeValue();
        }

        @NotNull
        public final NativeConfigurationOuterClass.NativeStartMode getNativeStartMode() {
            NativeConfigurationOuterClass.NativeStartMode nativeStartMode = this._builder.getNativeStartMode();
            nativeStartMode.getClass();
            return nativeStartMode;
        }

        public final int getNativeStartModeValue() {
            return this._builder.getNativeStartModeValue();
        }

        public final boolean getOpenglGpuEnabled() {
            return this._builder.getOpenglGpuEnabled();
        }

        public final boolean getOpportunityIdPlacementValidation() {
            return this._builder.getOpportunityIdPlacementValidation();
        }

        public final boolean getRecoverTerminatedWebviews() {
            return this._builder.getRecoverTerminatedWebviews();
        }

        public final boolean getShouldHandleWebviewCaching() {
            return this._builder.getShouldHandleWebviewCaching();
        }

        public final boolean getShouldInitAdqWithGameId() {
            return this._builder.getShouldInitAdqWithGameId();
        }

        public final boolean getShouldSendIapHistory() {
            return this._builder.getShouldSendIapHistory();
        }

        public final boolean getUseFilesDir() {
            return this._builder.getUseFilesDir();
        }

        public final boolean getUseOptimisticWebviewCache() {
            return this._builder.getUseOptimisticWebviewCache();
        }

        public final boolean getUseTryCatchInDownloadQueue() {
            return this._builder.getUseTryCatchInDownloadQueue();
        }

        public final boolean getWebviewLessLoadParallelActivityLaunch() {
            return this._builder.getWebviewLessLoadParallelActivityLaunch();
        }

        public final void setAppSheetBugCheckEnabled(boolean z) {
            this._builder.setAppSheetBugCheckEnabled(z);
        }

        public final void setBoldSdkNextSessionEnabled(boolean z) {
            this._builder.setBoldSdkNextSessionEnabled(z);
        }

        public final void setCollectGoogleAppId(boolean z) {
            this._builder.setCollectGoogleAppId(z);
        }

        public final void setCollectIlrData(boolean z) {
            this._builder.setCollectIlrData(z);
        }

        public final void setCollectLifecycleEvents(boolean z) {
            this._builder.setCollectLifecycleEvents(z);
        }

        public final void setDisableCustomScheme(boolean z) {
            this._builder.setDisableCustomScheme(z);
        }

        public final void setDisableGridCollection(boolean z) {
            this._builder.setDisableGridCollection(z);
        }

        public final void setEnableCoherenceLibrary(boolean z) {
            this._builder.setEnableCoherenceLibrary(z);
        }

        public final void setEnsureCacheFolderExistences(boolean z) {
            this._builder.setEnsureCacheFolderExistences(z);
        }

        public final void setFullscreenNavBarMode(@NotNull NativeConfigurationOuterClass.FullscreenNavBarMode fullscreenNavBarMode) {
            fullscreenNavBarMode.getClass();
            this._builder.setFullscreenNavBarMode(fullscreenNavBarMode);
        }

        public final void setFullscreenNavBarModeValue(int i) {
            this._builder.setFullscreenNavBarModeValue(i);
        }

        public final void setNativeStartMode(@NotNull NativeConfigurationOuterClass.NativeStartMode nativeStartMode) {
            nativeStartMode.getClass();
            this._builder.setNativeStartMode(nativeStartMode);
        }

        public final void setNativeStartModeValue(int i) {
            this._builder.setNativeStartModeValue(i);
        }

        public final void setOpenglGpuEnabled(boolean z) {
            this._builder.setOpenglGpuEnabled(z);
        }

        public final void setOpportunityIdPlacementValidation(boolean z) {
            this._builder.setOpportunityIdPlacementValidation(z);
        }

        public final void setRecoverTerminatedWebviews(boolean z) {
            this._builder.setRecoverTerminatedWebviews(z);
        }

        public final void setShouldHandleWebviewCaching(boolean z) {
            this._builder.setShouldHandleWebviewCaching(z);
        }

        public final void setShouldInitAdqWithGameId(boolean z) {
            this._builder.setShouldInitAdqWithGameId(z);
        }

        public final void setShouldSendIapHistory(boolean z) {
            this._builder.setShouldSendIapHistory(z);
        }

        public final void setUseFilesDir(boolean z) {
            this._builder.setUseFilesDir(z);
        }

        public final void setUseOptimisticWebviewCache(boolean z) {
            this._builder.setUseOptimisticWebviewCache(z);
        }

        public final void setUseTryCatchInDownloadQueue(boolean z) {
            this._builder.setUseTryCatchInDownloadQueue(z);
        }

        public final void setWebviewLessLoadParallelActivityLaunch(boolean z) {
            this._builder.setWebviewLessLoadParallelActivityLaunch(z);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/FeatureFlagsKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/FeatureFlagsKt$Dsl;", "builder", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }
    }
}
