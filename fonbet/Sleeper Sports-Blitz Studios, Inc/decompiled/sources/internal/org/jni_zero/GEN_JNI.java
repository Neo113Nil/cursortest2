package internal.org.jni_zero;

import internal.J.N;

/* loaded from: classes9.dex */
public class GEN_JNI {
    public static void org_chromium_base_AndroidInfo_fillFields(Object brand, Object device, Object buildId, Object manufacturer, Object model, Object type, Object board, Object androidBuildFingerprint, Object versionIncremental, Object hardware, Object codename, Object socManufacturer, Object supportedAbis, int sdkInt, boolean isDebugAndroid, Object securityPatch) {
        N.MYc8mtnY(brand, device, buildId, manufacturer, model, type, board, androidBuildFingerprint, versionIncremental, hardware, codename, socManufacturer, supportedAbis, sdkInt, isDebugAndroid, securityPatch);
    }

    public static void org_chromium_base_ApkInfo_fillFields(Object hostPackageName, Object hostVersionCode, Object hostPackageLabel, Object packageVersionCode, Object packageVersionName, Object packageName, Object resourcesVersion, Object installerPackageName, boolean isDebugApp, int targetSdkVersion) {
        N.MOh5qbSu(hostPackageName, hostVersionCode, hostPackageLabel, packageVersionCode, packageVersionName, packageName, resourcesVersion, installerPackageName, isDebugApp, targetSdkVersion);
    }

    public static void org_chromium_base_ApplicationStatus_onApplicationStateChange(int newState) {
        N.MiAkQ_SU(newState);
    }

    public static long org_chromium_base_BaseFeatureMap_getNativeMap() {
        return N.MshdYEWu();
    }

    public static void org_chromium_base_CommandLine_appendSwitchWithValue(Object switchString, Object value) {
        N.MUoYiNbY(switchString, value);
    }

    public static void org_chromium_base_CommandLine_appendSwitchesAndArguments(Object array) {
        N.MPquHBNa(array);
    }

    public static Object org_chromium_base_CommandLine_getSwitchValue(Object switchString) {
        return N.MZJ2lrZY(switchString);
    }

    public static Object org_chromium_base_CommandLine_getSwitches() {
        return N.MEf0C$KO();
    }

    public static boolean org_chromium_base_CommandLine_hasSwitch(Object switchString) {
        return N.MsCvypjU(switchString);
    }

    public static void org_chromium_base_CommandLine_init(Object args) {
        N.MDkrKi31(args);
    }

    public static void org_chromium_base_CommandLine_removeSwitch(Object switchString) {
        N.M1cMYXGO(switchString);
    }

    public static int org_chromium_base_CpuFeatures_getCoreCount() {
        return N.MOiBJ1qS();
    }

    public static long org_chromium_base_CpuFeatures_getCpuFeatures() {
        return N.ML0T8q1U();
    }

    public static void org_chromium_base_DeviceInfo_fillFields(Object gmsVersionCode, boolean isTV, boolean isAutomotive, boolean isFoldable, boolean isDesktop, int vulkanDeqpLevel, boolean isXr, boolean wasLaunchedOnLargeDisplay) {
        N.MFWeJGQZ(gmsVersionCode, isTV, isAutomotive, isFoldable, isDesktop, vulkanDeqpLevel, isXr, wasLaunchedOnLargeDisplay);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(Object name, long id, long timeNanos) {
        N.M_Gv8TwM(name, id, timeNanos);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(long id, long timeNanos) {
        N.MrKsqeCD(id, timeNanos);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(Object name, long timeNanos, int threadId, long threadMillis) {
        N.MrWG2uUW(name, timeNanos, threadId, threadMillis);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(Object name, long timeNanos, int threadId, long threadMillis) {
        N.MmyrhqXB(name, timeNanos, threadId, threadMillis);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(Object name, long timeNanos, int threadId, long threadMillis) {
        N.M7UXCmoq(name, timeNanos, threadId, threadMillis);
    }

    public static void org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(Object name, long timeNanos, int threadId, long threadMillis) {
        N.MRlw2LEn(name, timeNanos, threadId, threadMillis);
    }

    public static boolean org_chromium_base_FeatureList_isInitialized() {
        return N.MFTJCvBh();
    }

    public static Object org_chromium_base_FeatureMap_getFieldTrialParamByFeature(long featureMap, Object featureName, Object paramName) {
        return N.MkEZDArf(featureMap, featureName, paramName);
    }

    public static boolean org_chromium_base_FeatureMap_getFieldTrialParamByFeatureAsBoolean(long featureMap, Object featureName, Object paramName, boolean defaultValue) {
        return N.MR5ZSvGM(featureMap, featureName, paramName, defaultValue);
    }

    public static double org_chromium_base_FeatureMap_getFieldTrialParamByFeatureAsDouble(long featureMap, Object featureName, Object paramName, double defaultValue) {
        return N.MVPjCt$S(featureMap, featureName, paramName, defaultValue);
    }

    public static int org_chromium_base_FeatureMap_getFieldTrialParamByFeatureAsInt(long featureMap, Object featureName, Object paramName, int defaultValue) {
        return N.Me$URWJx(featureMap, featureName, paramName, defaultValue);
    }

    public static Object org_chromium_base_FeatureMap_getFlattedFieldTrialParamsForFeature(long featureMap, Object featureName) {
        return N.MV_QqWU4(featureMap, featureName);
    }

    public static boolean org_chromium_base_FeatureMap_isEnabled(long featureMap, Object featureName) {
        return N.M2evocmp(featureMap, featureName);
    }

    public static boolean org_chromium_base_Features_getFieldTrialParamByFeatureAsBoolean(long featurePointer, Object paramName, boolean defaultValue) {
        return N.M8R55Xut(featurePointer, paramName, defaultValue);
    }

    public static Object org_chromium_base_Features_getFieldTrialParamByFeatureAsString(long featurePointer, Object paramName) {
        return N.M9wfStLu(featurePointer, paramName);
    }

    public static boolean org_chromium_base_Features_isEnabled(long featurePointer) {
        return N.MRiRQ_Ey(featurePointer);
    }

    public static boolean org_chromium_base_FieldTrialList_createFieldTrial(Object trialName, Object groupName) {
        return N.MGqzwlIM(trialName, groupName);
    }

    public static Object org_chromium_base_FieldTrialList_findFullName(Object trialName) {
        return N.MdC43qwX(trialName);
    }

    public static Object org_chromium_base_FieldTrialList_getVariationParameter(Object trialName, Object parameterKey) {
        return N.MZWMOP4I(trialName, parameterKey);
    }

    public static void org_chromium_base_FieldTrialList_logActiveTrials() {
        N.MHz6Fn06();
    }

    public static boolean org_chromium_base_FieldTrialList_trialExists(Object trialName) {
        return N.Mmqqda9c(trialName);
    }

    public static Object org_chromium_base_FileUtils_getAbsoluteFilePath(Object filePath) {
        return N.MWck3aif(filePath);
    }

    public static boolean org_chromium_base_ImportantFileWriterAndroid_writeFileAtomically(Object fileName, Object data) {
        return N.MsOKBrZ5(fileName, data);
    }

    public static boolean org_chromium_base_InputHintChecker_failedToInitializeForTesting() {
        return N.MczIGOvj_ForTesting();
    }

    public static boolean org_chromium_base_InputHintChecker_hasInputForTesting() {
        return N.MQ$6ljxU_ForTesting();
    }

    public static boolean org_chromium_base_InputHintChecker_hasInputWithThrottlingForTesting() {
        return N.MDDrLK5r_ForTesting();
    }

    public static boolean org_chromium_base_InputHintChecker_isInitializedForTesting() {
        return N.MUOsQUSh_ForTesting();
    }

    public static void org_chromium_base_InputHintChecker_onCompositorViewHolderTouchEvent() {
        N.M6mA2913();
    }

    public static void org_chromium_base_InputHintChecker_setIsAfterInputYieldForTesting(boolean after) {
        N.MtNxwUj9_ForTesting(after);
    }

    public static void org_chromium_base_InputHintChecker_setView(Object view) {
        N.MTGiZpkh(view);
    }

    public static void org_chromium_base_JavaExceptionReporter_reportJavaException(boolean crashAfterReport, Object e) {
        N.MLlibBXh(crashAfterReport, e);
    }

    public static void org_chromium_base_JavaExceptionReporter_reportJavaStackTrace(Object stackTrace) {
        N.MmS4zlEt(stackTrace);
    }

    public static void org_chromium_base_JavaHandlerThread_initializeThread(long nativeJavaHandlerThread, long nativeEvent) {
        N.MJcct7gJ(nativeJavaHandlerThread, nativeEvent);
    }

    public static void org_chromium_base_JavaHandlerThread_onLooperStopped(long nativeJavaHandlerThread) {
        N.MYwg$x8E(nativeJavaHandlerThread);
    }

    public static void org_chromium_base_JniCallbackImpl_destroy(boolean isRepeating, long callbackPtr) {
        N.MsfzhsO7(isRepeating, callbackPtr);
    }

    public static void org_chromium_base_JniCallbackImpl_onResult(boolean isRepeating, long callbackPtr, Object result) {
        N.Mv1m4r87(isRepeating, callbackPtr, result);
    }

    public static boolean org_chromium_base_MemoryPressureListener_isTrimMemoryBackgroundCritical() {
        return N.MaQ9HvMU();
    }

    public static void org_chromium_base_MemoryPressureListener_onMemoryPressure(int pressure) {
        N.MZJzyjAa(pressure);
    }

    public static void org_chromium_base_MemoryPressureListener_onPreFreeze() {
        N.M7JarlfB();
    }

    public static void org_chromium_base_PathService_override(int what, Object path) {
        N.M6H_IiaF(what, path);
    }

    public static void org_chromium_base_PowerMonitor_onBatteryChargingChanged() {
        N.MCImhGql();
    }

    public static void org_chromium_base_PowerMonitor_onThermalStatusChanged(int thermalStatus) {
        N.MQNVaF2F(thermalStatus);
    }

    public static void org_chromium_base_SysUtils_logPageFaultCountToTracing() {
        N.MOXOasS5();
    }

    public static Object org_chromium_base_Token_createRandom() {
        return N.MnpYy_DE();
    }

    public static void org_chromium_base_TraceEvent_addViewDump(int id, int parentId, boolean isShown, boolean isDirty, Object className, Object resourceName, long activityProtoPtr) {
        N.MmnP6i1r(id, parentId, isShown, isDirty, className, resourceName, activityProtoPtr);
    }

    public static void org_chromium_base_TraceEvent_begin(Object name, Object arg) {
        N.M9XfPu17(name, arg);
    }

    public static void org_chromium_base_TraceEvent_beginToplevel(Object target) {
        N.M_y76mct(target);
    }

    public static void org_chromium_base_TraceEvent_beginWithIntArg(Object name, int arg) {
        N.MfyKGfoR(name, arg);
    }

    public static void org_chromium_base_TraceEvent_end(Object arg, long flow) {
        N.Mw73xTww(arg, flow);
    }

    public static void org_chromium_base_TraceEvent_endToplevel() {
        N.MLJecZJ9();
    }

    public static void org_chromium_base_TraceEvent_finishAsync(long id) {
        N.MffNhCLU(id);
    }

    public static void org_chromium_base_TraceEvent_initViewHierarchyDump(long id, Object list) {
        N.Ml5G_GLY(id, list);
    }

    public static void org_chromium_base_TraceEvent_instant(Object name, Object arg) {
        N.ML40H8ed(name, arg);
    }

    public static void org_chromium_base_TraceEvent_instantAndroidIPC(Object name, long durMs) {
        N.MgOW0Igo(name, durMs);
    }

    public static void org_chromium_base_TraceEvent_instantAndroidToolbar(int blockReason, int allowReason, int snapshotDiff) {
        N.MtoXPJsu(blockReason, allowReason, snapshotDiff);
    }

    public static void org_chromium_base_TraceEvent_registerEnabledObserver() {
        N.MFFzPOVw();
    }

    public static long org_chromium_base_TraceEvent_startActivityDump(Object name, long dumpProtoPtr) {
        return N.MwX2YEhL(name, dumpProtoPtr);
    }

    public static void org_chromium_base_TraceEvent_startAsync(Object name, long id) {
        N.MHopMqLX(name, id);
    }

    public static void org_chromium_base_TraceEvent_startupActivityStart(long activityId, long startTimeMs) {
        N.MvcVeOsg(activityId, startTimeMs);
    }

    public static void org_chromium_base_TraceEvent_startupLaunchCause(long activityId, long startTimeMs, int launchCause) {
        N.MbWHcONC(activityId, startTimeMs, launchCause);
    }

    public static void org_chromium_base_TraceEvent_startupTimeToFirstVisibleContent2(long activityId, long startTimeMs, long durationMs) {
        N.MCS8G8B2(activityId, startTimeMs, durationMs);
    }

    public static boolean org_chromium_base_TraceEvent_viewHierarchyDumpEnabled() {
        return N.MnfJQqTB();
    }

    public static void org_chromium_base_TraceEvent_webViewStartupFirstInstance(long startTimeMs, long durationMs, boolean includedGlobalStartup) {
        N.MU2h8swg(startTimeMs, durationMs, includedGlobalStartup);
    }

    public static void org_chromium_base_TraceEvent_webViewStartupNotFirstInstance(long startTimeMs, long durationMs) {
        N.MSryNsDk(startTimeMs, durationMs);
    }

    public static void org_chromium_base_TraceEvent_webViewStartupStage1(long startTimeMs, long durationMs) {
        N.MkM80XCq(startTimeMs, durationMs);
    }

    public static void org_chromium_base_TraceEvent_webViewStartupStartChromiumLocked(long startTimeMs, long durationMs, int startCallSite, int finishCallSite, int startupMode) {
        N.MhNry1OP(startTimeMs, durationMs, startCallSite, finishCallSite, startupMode);
    }

    public static void org_chromium_base_TraceEvent_webViewStartupTotalFactoryInit(long startTimeMs, long durationMs) {
        N.MsUcOjxl(startTimeMs, durationMs);
    }

    public static boolean org_chromium_base_library_1loader_LibraryLoader_libraryLoaded(int processType) {
        return N.M81WqFvs(processType);
    }

    public static void org_chromium_base_library_1loader_LibraryPrefetcher_prefetchNativeLibraryForWebView() {
        N.MwfavhFV();
    }

    public static boolean org_chromium_base_memory_MemoryPurgeManager_isOnPreFreezeMemoryTrimEnabled() {
        return N.M22p8lu4();
    }

    public static void org_chromium_base_memory_MemoryPurgeManager_postDelayedPurgeTaskOnUiThread(long delayMillis) {
        N.MhkobVIJ(delayMillis);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_addActionCallbackForTesting(Object callback) {
        return N.MEfoV$c9_ForTesting(callback);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_createHistogramSnapshotForTesting() {
        return N.MlZcyPle_ForTesting();
    }

    public static void org_chromium_base_metrics_NativeUmaRecorder_destroyHistogramSnapshotForTesting(long snapshotPtr) {
        N.MqHgOQAN_ForTesting(snapshotPtr);
    }

    public static Object org_chromium_base_metrics_NativeUmaRecorder_getHistogramSamplesForTesting(Object name) {
        return N.MDr5ROsj_ForTesting(name);
    }

    public static int org_chromium_base_metrics_NativeUmaRecorder_getHistogramTotalCountForTesting(Object name, long snapshotPtr) {
        return N.MP$RSyC4_ForTesting(name, snapshotPtr);
    }

    public static int org_chromium_base_metrics_NativeUmaRecorder_getHistogramValueCountForTesting(Object name, int sample, long snapshotPtr) {
        return N.M_1WxmXI_ForTesting(name, sample, snapshotPtr);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_recordBooleanHistogram(Object name, long nativeHint, boolean sample) {
        return N.MtKTTHie(name, nativeHint, sample);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_recordExponentialHistogram(Object name, long nativeHint, int sample, int min, int max, int numBuckets) {
        return N.MILRV9Ch(name, nativeHint, sample, min, max, numBuckets);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_recordLinearHistogram(Object name, long nativeHint, int sample, int min, int max, int numBuckets) {
        return N.M$oMD214(name, nativeHint, sample, min, max, numBuckets);
    }

    public static long org_chromium_base_metrics_NativeUmaRecorder_recordSparseHistogram(Object name, long nativeHint, int sample) {
        return N.Mk1ai9mx(name, nativeHint, sample);
    }

    public static void org_chromium_base_metrics_NativeUmaRecorder_recordUserAction(Object name, long millisSinceEvent) {
        N.MTDsfZGe(name, millisSinceEvent);
    }

    public static void org_chromium_base_metrics_NativeUmaRecorder_removeActionCallbackForTesting(long callbackId) {
        N.MUBbgum1_ForTesting(callbackId);
    }

    public static Object org_chromium_base_metrics_StatisticsRecorderAndroid_toJson(int verbosityLevel) {
        return N.MvO$oy3r(verbosityLevel);
    }

    public static void org_chromium_base_task_TaskRunnerImpl_destroy(long nativeTaskRunnerAndroid) {
        N.MERCiIV8(nativeTaskRunnerAndroid);
    }

    public static long org_chromium_base_task_TaskRunnerImpl_init(int taskRunnerType, int taskTraits) {
        return N.M5_IQXaH(taskRunnerType, taskTraits);
    }

    public static void org_chromium_base_task_TaskRunnerImpl_postDelayedTask(long nativeTaskRunnerAndroid, long delay, int taskIndex) {
        N.MGnQU$47(nativeTaskRunnerAndroid, delay, taskIndex);
    }

    public static void org_chromium_base_version_1info_VersionConstantsBridge_nativeSetChannel(int channel) {
        N.M4pgQGxC(channel);
    }

    public static Object org_chromium_net_GURLUtils_getOrigin(Object url) {
        return N.MpCt7siL(url);
    }

    public static void org_chromium_net_HttpNegotiateAuthenticator_setResult(long nativeJavaNegotiateResultWrapper, int status, Object authToken) {
        N.M0s8NeYn(nativeJavaNegotiateResultWrapper, status, authToken);
    }

    public static boolean org_chromium_net_HttpUtil_isAllowedHeader(Object headerName, Object headerValue) {
        return N.MorcXgQd(headerName, headerValue);
    }

    public static void org_chromium_net_NetworkActiveNotifier_notifyOfDefaultNetworkActive(long nativePtr) {
        N.MSZPA7qE(nativePtr);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionCostChanged(long nativePtr, int newConnectionCost) {
        N.Mg0W7eRL(nativePtr, newConnectionCost);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionSubtypeChanged(long nativePtr, int subType) {
        N.MCEqyWQ0(nativePtr, subType);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyConnectionTypeChanged(long nativePtr, int newConnectionType, long defaultNetId) {
        N.MbPIImnU(nativePtr, newConnectionType, defaultNetId);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkConnect(long nativePtr, long netId, int connectionType) {
        N.MBT1i5cd(nativePtr, netId, connectionType);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkDisconnect(long nativePtr, long netId) {
        N.MDpuHJTB(nativePtr, netId);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyOfNetworkSoonToDisconnect(long nativePtr, long netId) {
        N.MiJIMrTb(nativePtr, netId);
    }

    public static void org_chromium_net_NetworkChangeNotifier_notifyPurgeActiveNetworkList(long nativePtr, Object activeNetIds) {
        N.MpF$179U(nativePtr, activeNetIds);
    }

    public static void org_chromium_net_ProxyChangeListener_proxySettingsChanged(long nativePtr) {
        N.MCIk73GZ(nativePtr);
    }

    public static void org_chromium_net_ProxyChangeListener_proxySettingsChangedTo(long nativePtr, Object host, int port, Object pacUrl, Object exclusionList) {
        N.MyoFZt$2(nativePtr, host, port, pacUrl, exclusionList);
    }

    public static void org_chromium_net_X509Util_notifyClientCertStoreChanged() {
        N.MJdorYDE();
    }

    public static void org_chromium_net_X509Util_notifyTrustStoreChanged() {
        N.M6C2IQIc();
    }

    public static void org_chromium_net_impl_CompletionOnceCallback_run(long nativeCompletionOnceCallbackAdapter, int result) {
        N.MGR2x4WJ(nativeCompletionOnceCallbackAdapter, result);
    }

    public static long org_chromium_net_impl_CronetBidirectionalStream_createBidirectionalStream(Object self, long urlRequestContextAdapter, boolean sendRequestHeadersAutomatically, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, long networkHandle) {
        return N.MqTDYvZd(self, urlRequestContextAdapter, sendRequestHeadersAutomatically, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid, networkHandle);
    }

    public static void org_chromium_net_impl_CronetBidirectionalStream_destroy(long nativePtr) {
        N.MS2l1kNx(nativePtr);
    }

    public static boolean org_chromium_net_impl_CronetBidirectionalStream_readData(long nativePtr, Object byteBuffer, int position, int limit) {
        return N.Md_rPmgC(nativePtr, byteBuffer, position, limit);
    }

    public static void org_chromium_net_impl_CronetBidirectionalStream_sendRequestHeaders(long nativePtr) {
        N.MGLIR7Sc(nativePtr);
    }

    public static int org_chromium_net_impl_CronetBidirectionalStream_start(long nativePtr, Object url, int priority, Object method, Object headers, boolean endOfStream) {
        return N.McDUim_I(nativePtr, url, priority, method, headers, endOfStream);
    }

    public static boolean org_chromium_net_impl_CronetBidirectionalStream_writevData(long nativePtr, Object buffers, Object positions, Object limits, boolean endOfStream) {
        return N.MwJCBTMQ(nativePtr, buffers, positions, limits, endOfStream);
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread(int traceNetLogCaptureMode) {
        N.MROCxiBo(traceNetLogCaptureMode);
    }

    public static Object org_chromium_net_impl_CronetLibraryLoader_getCronetVersion() {
        return N.M6xubM8G();
    }

    public static int org_chromium_net_impl_CronetLibraryLoader_getTraceNetLogCaptureModeForTesting() {
        return N.MNL5_Cay_ForTesting();
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_nativeInit(boolean initializePerfetto) {
        N.MAuYp$hS(initializePerfetto);
    }

    public static void org_chromium_net_impl_CronetLibraryLoader_setMinLogLevel(int loggingLevel) {
        N.Mrxu2pQS(loggingLevel);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(Object caller, long urlRequestAdapter, long length) {
        return N.MA4X1aZa(caller, urlRequestAdapter, length);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(Object caller) {
        return N.MnDEFloP_ForTesting(caller);
    }

    public static long org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(Object caller, long length, long adapter) {
        return N.MymnNC4__ForTesting(caller, length, adapter);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_destroy(long nativePtr) {
        N.MMW1G0N1(nativePtr);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(long nativePtr, int bytesRead, boolean finalChunk) {
        N.MpWH3VIr(nativePtr, bytesRead, finalChunk);
    }

    public static void org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(long nativePtr) {
        N.MFpRjSMv(nativePtr);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_addRequestHeader(long nativePtr, Object name, Object value) {
        return N.MvHusd1J(nativePtr, name, value);
    }

    public static long org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(Object self, long urlRequestContextAdapter, Object url, int priority, boolean disableCache, boolean disableConnectionMigration, boolean trafficStatsTagSet, int trafficStatsTag, boolean trafficStatsUidSet, int trafficStatsUid, int idempotency, Object dictionarySha256Hash, Object dictionary, int dictionaryPosition, int dictionaryCapacity, Object dictionaryId, long networkHandle) {
        return N.MuOIsMvf(self, urlRequestContextAdapter, url, priority, disableCache, disableConnectionMigration, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid, idempotency, dictionarySha256Hash, dictionary, dictionaryPosition, dictionaryCapacity, dictionaryId, networkHandle);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_destroy(long nativePtr, boolean sendOnCanceled) {
        N.M4znfYdB(nativePtr, sendOnCanceled);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(long nativePtr) {
        N.Mhp54Oqs(nativePtr);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_getStatus(long nativePtr, Object listener) {
        N.MgIIMpT9(nativePtr, listener);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_readData(long nativePtr, Object byteBuffer, int position, int capacity) {
        return N.MfCxA8r3(nativePtr, byteBuffer, position, capacity);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequest_setHttpMethod(long nativePtr, Object method) {
        return N.M51RPBJe(nativePtr, method);
    }

    public static void org_chromium_net_impl_CronetUrlRequest_start(long nativePtr) {
        N.MabZ5m6r(nativePtr);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_addPkp(long urlRequestContextConfig, Object host, Object hashes, boolean includeSubdomains, long expirationTime) {
        N.Muq3ic6p(urlRequestContextConfig, host, hashes, includeSubdomains, expirationTime);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(long urlRequestContextConfig, Object host, int port, int alternatePort) {
        N.MyRIv1Ij(urlRequestContextConfig, host, port, alternatePort);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(long nativePtr, boolean useLocalHostRequests, boolean useSmallerResponses, boolean disableOfflineCheck) {
        N.M6sIJDgy_ForTesting(nativePtr, useLocalHostRequests, useSmallerResponses, disableOfflineCheck);
    }

    public static long org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(long urlRequestContextConfig) {
        return N.M135Cu0D(urlRequestContextConfig);
    }

    public static long org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(Object serializedRequestContextConfigOptions) {
        return N.MB3ntV7V(serializedRequestContextConfigOptions);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_destroy(long nativePtr) {
        N.MeBvNXm5(nativePtr);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_flushWritePropertiesForTesting(long nativePtr) {
        N.MMxc_BIz_ForTesting(nativePtr);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(long nativePtr, Object self) {
        N.M6Dz0nZ5(nativePtr, self);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(long nativePtr, boolean should) {
        N.MpnFLFF2(nativePtr, should);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(long nativePtr, boolean should) {
        N.MnPUhNKP(nativePtr, should);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(long nativePtr, Object dirPath, boolean logAll, int maxSize) {
        N.MTULt02u(nativePtr, dirPath, logAll, maxSize);
    }

    public static boolean org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(long nativePtr, Object fileName, boolean logAll) {
        return N.MgwJQAH1(nativePtr, fileName, logAll);
    }

    public static void org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(long nativePtr) {
        N.MKFm_qQ7(nativePtr);
    }

    public static void org_chromium_net_impl_ProxyCallbackRequestImpl_cancel(long nativeProxyCallbackRequestAdapter) {
        N.MLpcvWs2(nativeProxyCallbackRequestAdapter);
    }

    public static boolean org_chromium_net_impl_ProxyCallbackRequestImpl_proceed(long nativeProxyCallbackRequestAdapter, Object extraHeaders) {
        return N.ML1ZNMN3(nativeProxyCallbackRequestAdapter, extraHeaders);
    }
}
