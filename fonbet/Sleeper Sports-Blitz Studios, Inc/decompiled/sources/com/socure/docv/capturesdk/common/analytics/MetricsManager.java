package com.socure.docv.capturesdk.common.analytics;

import android.app.Application;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.socure.docv.capturesdk.common.analytics.model.Barcode;
import com.socure.docv.capturesdk.common.analytics.model.CameraDevice;
import com.socure.docv.capturesdk.common.analytics.model.Capabilities;
import com.socure.docv.capturesdk.common.analytics.model.Document;
import com.socure.docv.capturesdk.common.analytics.model.Documents;
import com.socure.docv.capturesdk.common.analytics.model.MetricCaptureData;
import com.socure.docv.capturesdk.common.analytics.model.MetricData;
import com.socure.docv.capturesdk.common.analytics.model.MinMaxDouble;
import com.socure.docv.capturesdk.common.analytics.model.MinMaxInt;
import com.socure.docv.capturesdk.common.analytics.model.Mrz;
import com.socure.docv.capturesdk.common.analytics.model.Settings;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.CaptureMetadata;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MetricsManager.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J!\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001c0\u001bH\u0002¢\u0006\u0002\u0010\u001dJ*\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\"j\n\u0012\u0004\u0012\u00020#\u0018\u0001`$J+\u0010%\u001a\u0012\u0012\u0004\u0012\u00020&0\"j\b\u0012\u0004\u0012\u00020&`$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001bH\u0002¢\u0006\u0002\u0010)J\"\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010\u000eH\u0002J\u001d\u0010.\u001a\u00020/2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0012H\u0000¢\u0006\u0002\b0J\u0014\u00101\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020 03J\u001a\u00104\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0010\u00107\u001a\u00020/2\u0006\u00108\u001a\u000209H\u0002J\u001e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002J\b\u0010A\u001a\u00020/H\u0002J\u000e\u0010B\u001a\u00020/2\u0006\u00108\u001a\u000209R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/MetricsManager;", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "metricData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricData;", "findGreatestCommonDivisorOfTwoNumber", "", "number1", "number2", "getCameraCapability", "Lcom/socure/docv/capturesdk/common/analytics/model/Capabilities;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "cameraId", "", Constants.ScionAnalytics.PARAM_LABEL, "getCameraId", "cManager", "lensFacing", "getDeviceId", "getFrameRate", "Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;", "range", "", "Landroid/util/Range;", "([Landroid/util/Range;)Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;", "getModuleSpecificMetrics", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "variances", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getRatioList", "", "sizeList", "Landroid/util/Size;", "([Landroid/util/Size;)Ljava/util/ArrayList;", "getSettingData", "Lcom/socure/docv/capturesdk/common/analytics/model/Settings;", "facingMode", "capabilities", "setDeviceMetricData", "", "setDeviceMetricData$capturesdk_productionRelease", "setDeviceMetrics", "screens", "", "updateCaptureMetaData", "captureMetadata", "Lcom/socure/docv/capturesdk/core/processor/model/CaptureMetadata;", "updateDocumentMetric", "metricCaptureData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricCaptureData;", "updateModelDetails", "Lcom/socure/docv/capturesdk/common/analytics/model/Document;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "metricList", "", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "updateUserAgent", "updatingMetricData", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MetricsManager {
    public static final int $stable = 8;
    private final Application application;
    private MetricData metricData;

    /* compiled from: MetricsManager.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScanType.values().length];
            try {
                iArr[ScanType.LICENSE_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanType.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanType.LICENSE_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanType.SELFIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MetricsManager(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    public final Application getApplication() {
        return this.application;
    }

    public final void setDeviceMetrics(List<? extends ScanType> screens) {
        Object obj;
        Intrinsics.checkNotNullParameter(screens, "screens");
        List<? extends ScanType> list = screens;
        LoggerKt.logDetailed("SDLT_MM", "setScanType called scanTypes: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null));
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ScanType scanType : list) {
                if (scanType == ScanType.LICENSE_FRONT || scanType == ScanType.LICENSE_BACK || scanType == ScanType.PASSPORT) {
                    setDeviceMetricData$capturesdk_productionRelease(ConstantsKt.BACK_CAMERA, "environment");
                    break;
                }
            }
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ScanType) obj) == ScanType.SELFIE) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((ScanType) obj) != null) {
            setDeviceMetricData$capturesdk_productionRelease(ConstantsKt.FRONT_CAMERA, "user");
        }
        updateUserAgent();
    }

    private final void updateUserAgent() {
        LoggerKt.logDetailed("SDLT_MM", "updateUserAgent called");
        MetricData metricData = this.metricData;
        if (metricData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metricData");
            metricData = null;
        }
        metricData.setUserAgent(ApiConstant.USER_AGENT_VALUE);
    }

    public final void setDeviceMetricData$capturesdk_productionRelease(String label, String facingMode) {
        Unit unit;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        LoggerKt.logDetailed("SDLT_MM", "setMetricData - label: " + label + " || facingMode: " + facingMode);
        try {
            if (this.metricData == null) {
                LoggerKt.logD("SDLT_MM", "metricData is null");
                this.metricData = new MetricData(null, null, null, 7, null);
            } else {
                LoggerKt.logDetailed("SDLT_MM", "metricData is not null");
            }
            Object systemService = this.application.getSystemService("camera");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            CameraManager cameraManager = (CameraManager) systemService;
            CameraDevice cameraDevice = new CameraDevice(null, new Capabilities(null, null, new MinMaxInt(0, 0, 3, null), null, null, new MinMaxInt(0, 0, 3, null), 27, null), null, null, null, 29, null);
            cameraDevice.setLabel(label);
            cameraDevice.setDeviceId(getCameraId(cameraManager, !Intrinsics.areEqual(label, ConstantsKt.FRONT_CAMERA) ? 1 : 0));
            cameraDevice.setModelID(cameraDevice.getDeviceId());
            String deviceId = cameraDevice.getDeviceId();
            if (deviceId != null) {
                cameraDevice.setCapabilities(getCameraCapability(cameraManager, deviceId, label));
                cameraDevice.setSettings(getSettingData(facingMode, deviceId, cameraDevice.getCapabilities()));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                LoggerKt.logD("SDLT_MM", "deviceId is null");
            }
            MetricData metricData = this.metricData;
            if (metricData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData = null;
            }
            metricData.getDevices().add(cameraDevice);
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_MM", "setMetricData error: " + th.getLocalizedMessage(), null, 4, null);
        }
    }

    private final Settings getSettingData(String facingMode, String cameraId, Capabilities capabilities) {
        MinMaxInt frameRate;
        LoggerKt.logDetailed("SDLT_MM", "getSettingData called");
        Settings settings = new Settings(null, null, null, null, null, 31, null);
        settings.setFacingMode(facingMode);
        settings.setDeviceId(cameraId);
        settings.setFrameRate((capabilities == null || (frameRate = capabilities.getFrameRate()) == null) ? null : Integer.valueOf(frameRate.getMax()));
        return settings;
    }

    private final Capabilities getCameraCapability(CameraManager cameraManager, String cameraId, String label) {
        Unit unit;
        String str;
        LoggerKt.logDetailed("SDLT_MM", "getCameraCapability - label: " + label + " || cameraId: " + cameraId);
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraId);
        Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "cameraManager.getCameraCharacteristics(cameraId)");
        Unit unit2 = null;
        Capabilities capabilities = new Capabilities(null, null, new MinMaxInt(0, 0, 3, null), null, null, new MinMaxInt(0, 0, 3, null), 27, null);
        capabilities.setDeviceId(cameraId);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(35) : null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (outputSizes != null) {
            for (Size size : outputSizes) {
                arrayList.add(Integer.valueOf(size.getHeight()));
                arrayList2.add(Integer.valueOf(size.getWidth()));
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LoggerKt.logD("SDLT_MM", "arrayOfSize is null");
        }
        if (outputSizes != null) {
            ArrayList<Double> ratioList = getRatioList(outputSizes);
            capabilities.setAspectRatio(new MinMaxDouble((Double) CollectionsKt.first((List) ratioList), (Double) CollectionsKt.last((List) ratioList)));
        }
        ArrayList arrayList3 = arrayList;
        CollectionsKt.sort(arrayList3);
        ArrayList arrayList4 = arrayList2;
        CollectionsKt.sort(arrayList4);
        capabilities.setHeight(new MinMaxInt(((Number) CollectionsKt.first((List) arrayList3)).intValue(), ((Number) CollectionsKt.last((List) arrayList3)).intValue()));
        capabilities.setWidth(new MinMaxInt(((Number) CollectionsKt.first((List) arrayList4)).intValue(), ((Number) CollectionsKt.last((List) arrayList4)).intValue()));
        if (Intrinsics.areEqual(label, ConstantsKt.FRONT_CAMERA)) {
            str = "user";
        } else {
            str = "environment";
        }
        capabilities.setFacingMode(CollectionsKt.arrayListOf(str));
        Range<Integer>[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            capabilities.setFrameRate(getFrameRate(rangeArr));
            unit2 = Unit.INSTANCE;
        }
        if (unit2 == null) {
            LoggerKt.logD("SDLT_MM", "range is null");
        }
        LoggerKt.logDetailed("SDLT_MM", "capabilities: " + new Gson().toJson(capabilities));
        return capabilities;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r4 > r6.intValue()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final MinMaxInt getFrameRate(Range<Integer>[] range) {
        LoggerKt.logDetailed("SDLT_MM", "getFrameRate called");
        MinMaxInt minMaxInt = new MinMaxInt(0, 0, 3, null);
        for (Range<Integer> range2 : range) {
            if (minMaxInt.getMin() != 0) {
                int min = minMaxInt.getMin();
                Integer lower = range2.getLower();
                Intrinsics.checkNotNullExpressionValue(lower, "it.lower");
            }
            Integer lower2 = range2.getLower();
            Intrinsics.checkNotNullExpressionValue(lower2, "it.lower");
            minMaxInt.setMin(lower2.intValue());
            int max = minMaxInt.getMax();
            Integer upper = range2.getUpper();
            Intrinsics.checkNotNullExpressionValue(upper, "it.upper");
            if (max < upper.intValue()) {
                Integer upper2 = range2.getUpper();
                Intrinsics.checkNotNullExpressionValue(upper2, "it.upper");
                minMaxInt.setMax(upper2.intValue());
            }
        }
        return minMaxInt;
    }

    private final String getCameraId(CameraManager cManager, int lensFacing) {
        LoggerKt.logDetailed("SDLT_MM", "getCameraId called");
        String[] cameraIdList = cManager.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "cManager.cameraIdList");
        for (String str : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = cManager.getCameraCharacteristics(str);
            Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "cManager.getCameraCharacteristics(cameraId)");
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == lensFacing) {
                return str;
            }
        }
        return null;
    }

    private final ArrayList<Double> getRatioList(Size[] sizeList) {
        LoggerKt.logDetailed("SDLT_MM", "getRatioList called");
        ArrayList<Double> arrayList = new ArrayList<>();
        for (Size size : sizeList) {
            double findGreatestCommonDivisorOfTwoNumber = findGreatestCommonDivisorOfTwoNumber(size.getWidth(), size.getHeight());
            arrayList.add(Double.valueOf((size.getWidth() / findGreatestCommonDivisorOfTwoNumber) / (size.getHeight() / findGreatestCommonDivisorOfTwoNumber)));
        }
        CollectionsKt.sort(arrayList);
        return arrayList;
    }

    private final int findGreatestCommonDivisorOfTwoNumber(int number1, int number2) {
        return number2 == 0 ? number1 : findGreatestCommonDivisorOfTwoNumber(number2, number1 % number2);
    }

    public final void updatingMetricData(MetricCaptureData metricCaptureData) {
        Intrinsics.checkNotNullParameter(metricCaptureData, "metricCaptureData");
        LoggerKt.logDetailed("SDLT_MM", "setSettingResolution called");
        try {
            updateCaptureMetaData(metricCaptureData.getScanType(), metricCaptureData.getCaptureMetadata());
            updateDocumentMetric(metricCaptureData);
            Gson gson = new Gson();
            MetricData metricData = this.metricData;
            if (metricData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData = null;
            }
            LoggerKt.logDetailed("SDLT_MM", "setSettingResolution metricData: " + gson.toJson(metricData));
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_MM", "updatingMetricData error msg: " + th.getMessage(), null, 4, null);
        }
    }

    public final MetricData getModuleSpecificMetrics(ScanType scanType, ArrayList<Float> variances) {
        MetricData metricData;
        MetricData copy$default;
        Document documentFront;
        MetricData metricData2;
        Document documentBack;
        MetricData metricData3;
        Document selfPortrait;
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        LoggerKt.logDetailed("SDLT_MM", "getModuleSpecificMetrics called for scanType: " + scanType);
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        Document document = null;
        if (i == 1 || i == 2) {
            MetricData metricData4 = this.metricData;
            if (metricData4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData = null;
            } else {
                metricData = metricData4;
            }
            MetricData metricData5 = this.metricData;
            if (metricData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData5 = null;
            }
            ArrayList arrayList = (ArrayList) CollectionsKt.toCollection(CollectionsKt.toSet(metricData5.getDevices()), new ArrayList());
            Documents documents = new Documents(null, null, null, 7, null);
            MetricData metricData6 = this.metricData;
            if (metricData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData6 = null;
            }
            Documents documents2 = metricData6.getDocuments();
            if (documents2 != null && (documentFront = documents2.getDocumentFront()) != null) {
                documentFront.setVariances(variances);
                document = documentFront;
            }
            documents.setDocumentFront(document);
            copy$default = MetricData.copy$default(metricData, documents, arrayList, null, 4, null);
        } else if (i == 3) {
            MetricData metricData7 = this.metricData;
            if (metricData7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData2 = null;
            } else {
                metricData2 = metricData7;
            }
            MetricData metricData8 = this.metricData;
            if (metricData8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData8 = null;
            }
            ArrayList arrayList2 = (ArrayList) CollectionsKt.toCollection(CollectionsKt.toSet(metricData8.getDevices()), new ArrayList());
            Documents documents3 = new Documents(null, null, null, 7, null);
            MetricData metricData9 = this.metricData;
            if (metricData9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData9 = null;
            }
            Documents documents4 = metricData9.getDocuments();
            if (documents4 != null && (documentBack = documents4.getDocumentBack()) != null) {
                documentBack.setVariances(variances);
                document = documentBack;
            }
            documents3.setDocumentBack(document);
            copy$default = MetricData.copy$default(metricData2, documents3, arrayList2, null, 4, null);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            MetricData metricData10 = this.metricData;
            if (metricData10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData3 = null;
            } else {
                metricData3 = metricData10;
            }
            MetricData metricData11 = this.metricData;
            if (metricData11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData11 = null;
            }
            ArrayList arrayList3 = (ArrayList) CollectionsKt.toCollection(CollectionsKt.toSet(metricData11.getDevices()), new ArrayList());
            Documents documents5 = new Documents(null, null, null, 7, null);
            MetricData metricData12 = this.metricData;
            if (metricData12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData12 = null;
            }
            Documents documents6 = metricData12.getDocuments();
            if (documents6 != null && (selfPortrait = documents6.getSelfPortrait()) != null) {
                selfPortrait.setVariances(variances);
                document = selfPortrait;
            }
            documents5.setSelfPortrait(document);
            copy$default = MetricData.copy$default(metricData3, documents5, arrayList3, null, 4, null);
        }
        LoggerKt.logDetailed("SDLT_MM", "getModuleSpecificMetrics result: " + new Gson().toJson(copy$default));
        return copy$default;
    }

    private final void updateDocumentMetric(MetricCaptureData metricCaptureData) {
        LoggerKt.logDetailed("SDLT_MM", "updateDocumentMetric scanType: " + metricCaptureData + ".scanType || metricList: " + new Gson().toJson(metricCaptureData.getMetrics()));
        try {
            MetricData metricData = this.metricData;
            if (metricData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData = null;
            }
            if (metricData.getDocuments() == null) {
                MetricData metricData2 = this.metricData;
                if (metricData2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("metricData");
                    metricData2 = null;
                }
                metricData2.setDocuments(new Documents(null, null, null, 7, null));
            }
            int i = WhenMappings.$EnumSwitchMapping$0[metricCaptureData.getScanType().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    return;
                }
                LoggerKt.logDetailed("SDLT_MM", "updating the selfie");
                MetricData metricData3 = this.metricData;
                if (metricData3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("metricData");
                    metricData3 = null;
                }
                Documents documents = metricData3.getDocuments();
                if (documents == null) {
                    return;
                }
                documents.setSelfPortrait(new Document(null, null, null, null, metricCaptureData.getCaptureType().getValue(), getDeviceId(ConstantsKt.FRONT_CAMERA), null, null, metricCaptureData.getFaces(), null, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, null));
                return;
            }
            Document updateModelDetails = updateModelDetails(metricCaptureData.getCaptureType(), metricCaptureData.getMetrics());
            updateModelDetails.setDeviceId(getDeviceId(ConstantsKt.BACK_CAMERA));
            updateModelDetails.setFaces(metricCaptureData.getFaces());
            if (metricCaptureData.getScanType() == ScanType.LICENSE_BACK) {
                updateModelDetails.setBarcode(new Barcode(metricCaptureData.getExtractionDataDetected(), null, null, 6, null));
                LoggerKt.logDetailed("SDLT_MM", "updating the back document");
                MetricData metricData4 = this.metricData;
                if (metricData4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("metricData");
                    metricData4 = null;
                }
                Documents documents2 = metricData4.getDocuments();
                if (documents2 == null) {
                    return;
                }
                documents2.setDocumentBack(updateModelDetails);
                return;
            }
            if (metricCaptureData.getScanType() == ScanType.PASSPORT) {
                updateModelDetails.setMrz(new Mrz(metricCaptureData.getExtractionDataDetected()));
            }
            LoggerKt.logDetailed("SDLT_MM", "updating the front document");
            MetricData metricData5 = this.metricData;
            if (metricData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData5 = null;
            }
            Documents documents3 = metricData5.getDocuments();
            if (documents3 == null) {
                return;
            }
            documents3.setDocumentFront(updateModelDetails);
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_MM", "updateDocumentMetric error: " + th.getLocalizedMessage(), null, 4, null);
        }
    }

    private final String getDeviceId(String label) {
        Object obj;
        MetricData metricData = this.metricData;
        if (metricData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metricData");
            metricData = null;
        }
        Iterator<T> it = metricData.getDevices().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((CameraDevice) obj).getLabel(), label)) {
                break;
            }
        }
        CameraDevice cameraDevice = (CameraDevice) obj;
        if (cameraDevice != null) {
            return cameraDevice.getDeviceId();
        }
        return null;
    }

    private final Document updateModelDetails(CaptureType captureType, List<DetectionMetric> metricList) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Double outputMeasure;
        LoggerKt.logDetailed("SDLT_MM", "updateModelDetails called");
        Document document = new Document(null, null, null, null, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
        document.setCaptureMode(captureType.getValue());
        List<DetectionMetric> list = metricList;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((DetectionMetric) obj2).getDetectionType() == DetectionType.BRIGHTNESS) {
                break;
            }
        }
        DetectionMetric detectionMetric = (DetectionMetric) obj2;
        document.setBrightness(Double.valueOf((detectionMetric == null || (outputMeasure = detectionMetric.getOutputMeasure()) == null) ? 0.0d : outputMeasure.doubleValue()));
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it2.next();
            if (((DetectionMetric) obj3).getDetectionType() == DetectionType.GLARE) {
                break;
            }
        }
        document.setGlare(UtilsKt.getGlareData((DetectionMetric) obj3));
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it3.next();
            if (((DetectionMetric) obj4).getDetectionType() == DetectionType.BLUR) {
                break;
            }
        }
        document.setBlur(UtilsKt.getBlurData((DetectionMetric) obj4));
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next = it4.next();
            if (((DetectionMetric) next).getDetectionType() == DetectionType.CORNER) {
                obj = next;
                break;
            }
        }
        document.setEdge(UtilsKt.getCornerData((DetectionMetric) obj));
        return document;
    }

    private final void updateCaptureMetaData(ScanType scanType, CaptureMetadata captureMetadata) {
        Object obj;
        CameraDevice cameraDevice;
        Unit unit;
        LoggerKt.logDetailed("SDLT_MM", "updateCaptureMetaData");
        try {
            MetricData metricData = this.metricData;
            if (metricData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metricData");
                metricData = null;
            }
            if (captureMetadata != null) {
                Iterator<T> it = metricData.getDevices().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((CameraDevice) obj).getLabel(), UtilsKt.getLabel(scanType))) {
                            break;
                        }
                    }
                }
                CameraDevice cameraDevice2 = (CameraDevice) obj;
                if (cameraDevice2 != null) {
                    int indexOf = metricData.getDevices().indexOf(cameraDevice2);
                    LoggerKt.logDetailed("SDLT_MM", "index is " + indexOf);
                    Settings settings = cameraDevice2.getSettings();
                    if (settings != null) {
                        settings.setWidth(Integer.valueOf(captureMetadata.getResolution().getWidth()));
                        settings.setHeight(Integer.valueOf(captureMetadata.getResolution().getHeight()));
                        cameraDevice2.setSettings(settings);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LoggerKt.logD("SDLT_MM", "cameraDevice settings is null");
                    }
                    MetricData metricData2 = this.metricData;
                    if (metricData2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("metricData");
                        metricData2 = null;
                    }
                    cameraDevice = metricData2.getDevices().set(indexOf, cameraDevice2);
                } else {
                    cameraDevice = null;
                }
                if (cameraDevice == null) {
                    LoggerKt.logD("SDLT_MM", "updateCaptureMetaData currentDevice is null");
                    return;
                }
                return;
            }
            LoggerKt.logD("SDLT_MM", "updateCaptureMetaData captureMetadata is null");
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_MM", "updateCaptureMetaData error: " + th.getLocalizedMessage(), null, 4, null);
        }
    }
}
