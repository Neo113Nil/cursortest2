package com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.core.ImageCaptureException;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.socure.docv.capturesdk.api.SocureDocVError;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.model.EventData;
import com.socure.docv.capturesdk.common.analytics.model.Face;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.upload.EventUpdater;
import com.socure.docv.capturesdk.common.upload.ImageUploadResponse;
import com.socure.docv.capturesdk.common.upload.UploadIvsResponse;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import com.socure.docv.capturesdk.common.utils.FeedManager;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.common.utils.ScannerDurationStore;
import com.socure.docv.capturesdk.common.utils.Utils;
import com.socure.docv.capturesdk.common.utils.UtilsKt;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import com.socure.docv.capturesdk.core.decision.BestImageSelector;
import com.socure.docv.capturesdk.core.pipeline.Pipeline;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.CaptureMetadata;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.core.provider.interfaces.CaptureListener;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import com.socure.docv.capturesdk.feature.scanner.FrameAnalyzer;
import com.socure.docv.capturesdk.feature.scanner.FrameEngine;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import com.socure.docv.capturesdk.feature.scanner.data.ErrorScenario;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
import com.socure.docv.capturesdk.feature.scanner.data.ImageMode;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import com.socure.docv.capturesdk.feature.scanner.presentation.ui.ScannerShim;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: ScannerViewModel.kt */
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020RH\u0003J\u0018\u0010T\u001a\u00020P2\u0006\u0010U\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020!H\u0002J\u0018\u0010W\u001a\u00020P2\u0006\u0010V\u001a\u00020!2\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020:H\u0002J\u0006\u0010[\u001a\u00020PJ\u0006\u0010\\\u001a\u00020PJ\u0006\u0010]\u001a\u00020PJ\u0006\u0010^\u001a\u00020_J\b\u0010`\u001a\u00020PH\u0016J\b\u0010a\u001a\u00020PH\u0014J\u0006\u0010b\u001a\u00020PJ:\u0010c\u001a\u00020P2\u0006\u0010d\u001a\u00020e2\u0018\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\f0g2\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0002Jn\u0010l\u001a\u00020P2\u0006\u0010d\u001a\u00020e2\u0018\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\f0g2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020:2\u0006\u0010j\u001a\u00020k2\u0006\u0010p\u001a\u00020e2\u0006\u0010q\u001a\u00020\u00192\u001a\u0010r\u001a\u0016\u0012\u0004\u0012\u00020t\u0018\u00010sj\n\u0012\u0004\u0012\u00020t\u0018\u0001`uH\u0002J\b\u0010v\u001a\u00020PH\u0002J\u0006\u0010w\u001a\u00020PJ^\u0010x\u001a\u00020P2\u0018\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\f0g2\u0006\u0010m\u001a\u00020n2\u0006\u0010j\u001a\u00020k2\u0006\u0010p\u001a\u00020e2\u0006\u0010q\u001a\u00020\u00192\u001a\u0010r\u001a\u0016\u0012\u0004\u0012\u00020t\u0018\u00010sj\n\u0012\u0004\u0012\u00020t\u0018\u0001`uH\u0002J\u0006\u0010y\u001a\u00020PJV\u0010z\u001a\u00020P2\u0018\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\f0g2\u0006\u0010m\u001a\u00020n2\u0006\u0010j\u001a\u00020k2\u0006\u0010q\u001a\u00020\u00192\u001a\u0010r\u001a\u0016\u0012\u0004\u0012\u00020t\u0018\u00010sj\n\u0012\u0004\u0012\u00020t\u0018\u0001`uH\u0002J\u0016\u0010{\u001a\u00020P2\u0006\u0010|\u001a\u00020:2\u0006\u0010}\u001a\u00020~J\u0010\u0010\u007f\u001a\u00020P2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020P2\u0007\u0010\u0083\u0001\u001a\u00020\u0012H\u0016J\u0007\u0010\u0084\u0001\u001a\u00020PJ\u0007\u0010\u0085\u0001\u001a\u00020PJ\u0010\u0010\u0086\u0001\u001a\u00020P2\u0007\u0010\u0087\u0001\u001a\u00020:J\u0010\u0010\u0088\u0001\u001a\u00020P2\u0007\u0010\u0089\u0001\u001a\u00020:J\u001b\u0010\u008a\u0001\u001a\u00020P2\u0006\u0010S\u001a\u00020R2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0002J\u0015\u0010\u008b\u0001\u001a\u00020P2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0002J\u0012\u0010\u008e\u0001\u001a\u00020P2\u0007\u0010\u008f\u0001\u001a\u00020\u0014H\u0002JB\u0010m\u001a\u00020P2\u0006\u0010m\u001a\u00020n2\u0006\u0010q\u001a\u00020\u00192\u001a\u0010r\u001a\u0016\u0012\u0004\u0012\u00020t\u0018\u00010sj\n\u0012\u0004\u0012\u00020t\u0018\u0001`u2\u0006\u0010p\u001a\u00020e2\u0006\u0010j\u001a\u00020kR&\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R)\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f0'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R%\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\f0'8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140'8F¢\u0006\u0006\u001a\u0004\b-\u0010)R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R%\u00106\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\f0'8F¢\u0006\u0006\u001a\u0004\b7\u0010)R\u000e\u00108\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u00020:X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0019\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190'8F¢\u0006\u0006\u001a\u0004\b>\u0010)R\u001b\u0010?\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00103\u001a\u0004\bA\u0010BR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010D\u001a\u00020E¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010H\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0'8F¢\u0006\u0006\u001a\u0004\bI\u0010)R\u001b\u0010J\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\bL\u0010M¨\u0006\u0090\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/ScannerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/DebugImageCallback;", "applicationComponent", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "shim", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/feature/scanner/presentation/ui/ScannerShim;)V", "_cornerDetectionCallBack", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "_debugImageCallback", "Lcom/socure/docv/capturesdk/feature/scanner/data/ImageMode;", "Landroid/graphics/Bitmap;", "_detectionCallbacks", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "_irrecoverableErrorCallback", "Lcom/socure/docv/capturesdk/feature/scanner/data/ErrorScenario;", "", "_outPutCallBack", "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "_uploadImageIvsCallback", "Lcom/socure/docv/capturesdk/common/upload/UploadIvsResponse;", "", "autoCaptureFailure", "", "bothErrorsMaxed", "captureMode", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "getCaptureMode", "()Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "setCaptureMode", "(Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;)V", "cornerDetectionCallBack", "Landroidx/lifecycle/LiveData;", "getCornerDetectionCallBack", "()Landroidx/lifecycle/LiveData;", "debugImageCallback", "getDebugImageCallback", "detectionCallbacks", "getDetectionCallbacks", "frameAnalyzer", "Lcom/socure/docv/capturesdk/feature/scanner/FrameAnalyzer;", "getFrameAnalyzer", "()Lcom/socure/docv/capturesdk/feature/scanner/FrameAnalyzer;", "frameAnalyzer$delegate", "Lkotlin/Lazy;", "frameEngine", "Lcom/socure/docv/capturesdk/feature/scanner/FrameEngine;", "irrecoverableErrorCallback", "getIrrecoverableErrorCallback", "manualCaptureFailure", "manualCaptureOnly", "", "getManualCaptureOnly$capturesdk_productionRelease", "()Z", "outPutCallBack", "getOutPutCallBack", "pipeline", "Lcom/socure/docv/capturesdk/core/pipeline/Pipeline;", "getPipeline", "()Lcom/socure/docv/capturesdk/core/pipeline/Pipeline;", "pipeline$delegate", "scannerDurationStore", "Lcom/socure/docv/capturesdk/common/utils/ScannerDurationStore;", "getScannerDurationStore", "()Lcom/socure/docv/capturesdk/common/utils/ScannerDurationStore;", "uploadImageIvsCallback", "getUploadImageIvsCallback", "varianceManager", "Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "getVarianceManager", "()Lcom/socure/docv/capturesdk/common/utils/VarianceManager;", "varianceManager$delegate", "calculateVariance", "", "previous", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", SentryThread.JsonKeys.CURRENT, "captureFrames", "captureCount", "captureType", "captureMaxErrorHandling", "exception", "Landroidx/camera/core/ImageCaptureException;", "checkForMaxCaptureError", "clearLiveData", "clearPreviewCallbackValues", "freezeFeed", "getManualGuidingBox", "Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBox;", "hideImage", "onCleared", "onCompletionShown", "onImageUploadFailure", "uploadStartTime", "", "eventParams", "", "apiResponse", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "eventUpdater", "Lcom/socure/docv/capturesdk/common/upload/EventUpdater;", "onImageUploadSuccess", "uploadImage", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "shouldRetake", "captureDuration", AgentOptions.OUTPUT, "faces", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/analytics/model/Face;", "Lkotlin/collections/ArrayList;", "performAutoCapture", "performManualCapture", "processedToNext", "resetErrorCount", "retake", "setFrameProvider", "videoFeed", "feedManager", "Lcom/socure/docv/capturesdk/common/utils/FeedManager;", "setViewDimensions", "viewDimensions", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "showImage", "bitmap", "startGeneratingFrame", "stopGeneratingFrame", "toggleToAnalysisMode", "enableAnalysis", "updateBarcodeStateInPipeline", "skipBarcode", "updateCallbacks", "updateCornerDetectionCallback", "cornerMetric", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "updateDetectionCallback", "dc", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScannerViewModel extends AndroidViewModel implements DebugImageCallback {
    private final MutableLiveData<Pair<List<Float>, Dimension>> _cornerDetectionCallBack;
    private final MutableLiveData<Pair<ImageMode, Bitmap>> _debugImageCallback;
    private final MutableLiveData<DetectionCallback> _detectionCallbacks;
    private final MutableLiveData<Pair<ErrorScenario, String>> _irrecoverableErrorCallback;
    private final MutableLiveData<Output> _outPutCallBack;
    private final MutableLiveData<UploadIvsResponse<Object>> _uploadImageIvsCallback;
    private final ApplicationComponent applicationComponent;
    private int autoCaptureFailure;
    private int bothErrorsMaxed;
    private CaptureType captureMode;

    /* renamed from: frameAnalyzer$delegate, reason: from kotlin metadata */
    private final Lazy frameAnalyzer;
    private FrameEngine frameEngine;
    private int manualCaptureFailure;
    private final boolean manualCaptureOnly;

    /* renamed from: pipeline$delegate, reason: from kotlin metadata */
    private final Lazy pipeline;
    private final ScanType scanType;
    private final ScannerDurationStore scannerDurationStore;
    private final ScannerShim shim;

    /* renamed from: varianceManager$delegate, reason: from kotlin metadata */
    private final Lazy varianceManager;

    /* compiled from: ScannerViewModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CaptureType.values().length];
            try {
                iArr[CaptureType.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaptureType.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerViewModel(ApplicationComponent applicationComponent, ScanType scanType, ScannerShim shim) {
        super(applicationComponent.getApplication());
        Intrinsics.checkNotNullParameter(applicationComponent, "applicationComponent");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(shim, "shim");
        this.applicationComponent = applicationComponent;
        this.scanType = scanType;
        this.shim = shim;
        this.manualCaptureOnly = UtilsKt.isOldOs() || UtilsKt.lowRamDevice();
        this._detectionCallbacks = new MutableLiveData<>();
        this._cornerDetectionCallBack = new MutableLiveData<>();
        this._outPutCallBack = new MutableLiveData<>();
        this._debugImageCallback = new MutableLiveData<>();
        this._irrecoverableErrorCallback = new MutableLiveData<>();
        this._uploadImageIvsCallback = new MutableLiveData<>();
        this.pipeline = LazyKt.lazy(new Function0<Pipeline>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$pipeline$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Pipeline invoke() {
                ApplicationComponent applicationComponent2;
                ScanType scanType2;
                applicationComponent2 = ScannerViewModel.this.applicationComponent;
                scanType2 = ScannerViewModel.this.scanType;
                return new Pipeline(applicationComponent2, scanType2, ScannerViewModel.this);
            }
        });
        this.varianceManager = LazyKt.lazy(new Function0<VarianceManager>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$varianceManager$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final VarianceManager invoke() {
                ApplicationComponent applicationComponent2;
                applicationComponent2 = ScannerViewModel.this.applicationComponent;
                return applicationComponent2.getVarianceManager();
            }
        });
        this.frameAnalyzer = LazyKt.lazy(new Function0<FrameAnalyzer>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$frameAnalyzer$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final FrameAnalyzer invoke() {
                Pipeline pipeline;
                pipeline = ScannerViewModel.this.getPipeline();
                return new FrameAnalyzer(pipeline);
            }
        });
        this.scannerDurationStore = new ScannerDurationStore(System.currentTimeMillis());
    }

    /* renamed from: getManualCaptureOnly$capturesdk_productionRelease, reason: from getter */
    public final boolean getManualCaptureOnly() {
        return this.manualCaptureOnly;
    }

    public final LiveData<DetectionCallback> getDetectionCallbacks() {
        return this._detectionCallbacks;
    }

    public final LiveData<Pair<List<Float>, Dimension>> getCornerDetectionCallBack() {
        return this._cornerDetectionCallBack;
    }

    public final LiveData<Output> getOutPutCallBack() {
        return this._outPutCallBack;
    }

    public final LiveData<Pair<ImageMode, Bitmap>> getDebugImageCallback() {
        return this._debugImageCallback;
    }

    public final LiveData<Pair<ErrorScenario, String>> getIrrecoverableErrorCallback() {
        return this._irrecoverableErrorCallback;
    }

    public final LiveData<UploadIvsResponse<Object>> getUploadImageIvsCallback() {
        return this._uploadImageIvsCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pipeline getPipeline() {
        return (Pipeline) this.pipeline.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VarianceManager getVarianceManager() {
        return (VarianceManager) this.varianceManager.getValue();
    }

    private final FrameAnalyzer getFrameAnalyzer() {
        return (FrameAnalyzer) this.frameAnalyzer.getValue();
    }

    public final ScannerDurationStore getScannerDurationStore() {
        return this.scannerDurationStore;
    }

    public final CaptureType getCaptureMode() {
        return this.captureMode;
    }

    public final void setCaptureMode(CaptureType captureType) {
        this.captureMode = captureType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCornerDetectionCallback(DetectionMetric cornerMetric) {
        Dimension processedBitmapDimension;
        Unit unit = null;
        if (cornerMetric != null && (processedBitmapDimension = cornerMetric.getProcessedBitmapDimension()) != null) {
            this._cornerDetectionCallBack.postValue(new Pair<>(cornerMetric.getRegionList(), processedBitmapDimension));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this._cornerDetectionCallBack.postValue(new Pair<>(CollectionsKt.emptyList(), new Dimension(0.0d, 0.0d)));
        }
    }

    private final void updateDetectionCallback(DetectionCallback dc) {
        LoggerKt.logDetailed("SDLT_SVM", "sendNotProcessing :" + dc);
        this._detectionCallbacks.postValue(dc);
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.DebugImageCallback
    public void showImage(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (!bitmap.isRecycled()) {
            this._debugImageCallback.postValue(new Pair<>(ImageMode.DEBUG, bitmap));
        } else {
            LoggerKt.logE$default("SDLT_SVM", "recycled bitmap received in showImage - IGNORING", null, 4, null);
        }
    }

    @Override // com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.DebugImageCallback
    public void hideImage() {
        this._debugImageCallback.postValue(new Pair<>(ImageMode.DEBUG, null));
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        LoggerKt.logD("SDLT_SVM", "onCleared called. bothErrorsMaxed count: " + this.bothErrorsMaxed);
        getPipeline().shutdown();
        super.onCleared();
    }

    public final void clearLiveData() {
        this._detectionCallbacks.postValue(DetectionCallback.NOT_PROCESSING);
        this._cornerDetectionCallBack.postValue(new Pair<>(CollectionsKt.emptyList(), new Dimension(0.0d, 0.0d)));
        this._outPutCallBack.postValue(null);
        this._debugImageCallback.postValue(new Pair<>(ImageMode.DEBUG, null));
        this._irrecoverableErrorCallback.postValue(null);
    }

    public final void resetErrorCount() {
        this.autoCaptureFailure = 0;
        this.manualCaptureFailure = 0;
    }

    public final void updateBarcodeStateInPipeline(boolean skipBarcode) {
        LoggerKt.logD("SDLT_SVM", "updateBarcodeStateInPipeline called - skipBarcode: " + skipBarcode + " ");
        getPipeline().updateAutoPipelineForLicenceBack(skipBarcode);
    }

    public final void setFrameProvider(boolean videoFeed, FeedManager feedManager) {
        Intrinsics.checkNotNullParameter(feedManager, "feedManager");
        LoggerKt.logD("SDLT_SVM", "setFrameProvider called - videoFeed: " + videoFeed + " ");
        final ViewDimensions guidingBoxViewDimension = this.applicationComponent.getGuidingBoxViewDimension();
        this.frameEngine = new FrameEngine(videoFeed, feedManager, this.scanType, guidingBoxViewDimension, new Function2<ExtractedImageData, ExtractedImageData, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$setFrameProvider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ExtractedImageData extractedImageData, ExtractedImageData extractedImageData2) {
                invoke2(extractedImageData, extractedImageData2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ExtractedImageData extractedImageData, ExtractedImageData current) {
                Intrinsics.checkNotNullParameter(current, "current");
                ScannerViewModel.this.updateCallbacks(current, guidingBoxViewDimension);
                ScannerViewModel.this.calculateVariance(extractedImageData, current);
            }
        }, new Function1<Bitmap, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$setFrameProvider$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Bitmap bitmap) {
                MutableLiveData mutableLiveData;
                mutableLiveData = ScannerViewModel.this._debugImageCallback;
                mutableLiveData.setValue(new Pair(ImageMode.PREVIEW, bitmap));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateVariance(ExtractedImageData previous, ExtractedImageData current) {
        if (previous != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new ScannerViewModel$calculateVariance$1(this, previous, current, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCallbacks(ExtractedImageData current, ViewDimensions viewDimensions) {
        Object obj;
        Bitmap first = ImageUtils.INSTANCE.getBitmapFromImageProxy(current, this.scanType, CaptureType.AUTO_ANALYSIS, viewDimensions).getFirst();
        LoggerKt.logDetailed("SDLT_SVM", this.scanType + " frame received: " + first.getWidth() + "x" + first.getHeight() + " | " + Utils.INSTANCE.getBytesToHr(first.getByteCount()) + " | on thread: " + Thread.currentThread().getName());
        Pair<List<DetectionMetric>, DetectionCallback> analyze = getFrameAnalyzer().analyze(first);
        String name = Thread.currentThread().getName();
        StringBuilder sb = new StringBuilder("frame analysed on thread: ");
        sb.append(name);
        LoggerKt.logDetailed("SDLT_SVM", sb.toString());
        Iterator<T> it = analyze.getFirst().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((DetectionMetric) obj).getDetectionType() == DetectionType.CORNER) {
                    break;
                }
            }
        }
        updateCornerDetectionCallback((DetectionMetric) obj);
        updateDetectionCallback(analyze.getSecond());
        if (analyze.getSecond() == DetectionCallback.CAPTURING) {
            performAutoCapture();
        }
    }

    public final void performManualCapture() {
        int i = 1;
        if (this.scanType != ScanType.SELFIE && !this.manualCaptureOnly) {
            i = 2;
        }
        captureFrames(i, CaptureType.MANUAL);
    }

    private final void performAutoCapture() {
        LoggerKt.logI("SDLT_SVM", "\n++++++++ INITIATING AUTO CAPTURE! +++++++");
        captureFrames(3, CaptureType.AUTO);
    }

    private final void captureFrames(int captureCount, CaptureType captureType) {
        final int i;
        final CaptureType captureType2;
        LoggerKt.logD("SDLT_SVM", "captureFrames - captureType?: " + captureType.getValue() + ", captureCount: " + captureCount + ", manualCaptureOnly: " + this.manualCaptureOnly);
        final Lazy lazy = LazyKt.lazy(new Function0<BestImageSelector>() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$captureFrames$bestImageSelector$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BestImageSelector invoke() {
                return new BestImageSelector();
            }
        });
        final Ref.IntRef intRef = new Ref.IntRef();
        final int i2 = this.manualCaptureOnly ? 1 : captureCount;
        if (1 > i2) {
            return;
        }
        int i3 = 1;
        while (true) {
            FrameEngine frameEngine = this.frameEngine;
            if (frameEngine != null) {
                i = captureCount;
                captureType2 = captureType;
                frameEngine.takePicture(captureType2, i3, this.applicationComponent.getGuidingBoxViewDimension(), new CaptureListener() { // from class: com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.ScannerViewModel$captureFrames$1
                    @Override // com.socure.docv.capturesdk.core.provider.interfaces.CaptureListener
                    public void captured(int currentCount, Bitmap bitmap, CaptureMetadata captureMetadata, Bitmap manualDbgImg) {
                        Pipeline pipeline;
                        BestImageSelector captureFrames$lambda$4;
                        MutableLiveData mutableLiveData;
                        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                        Intrinsics.checkNotNullParameter(captureMetadata, "captureMetadata");
                        LoggerKt.logD("SDLT_SVM", "captured callback - currentCount: " + currentCount);
                        Ref.IntRef.this.element = 0;
                        this.resetErrorCount();
                        if (!this.getManualCaptureOnly()) {
                            pipeline = this.getPipeline();
                            Output process = pipeline.process(bitmap, captureType2);
                            process.setCaptureMetadata(captureMetadata);
                            Object obj = null;
                            if (process.getFinalStatus() || captureType2 == CaptureType.MANUAL) {
                                if (captureType2 == CaptureType.MANUAL && manualDbgImg != null && !manualDbgImg.isRecycled()) {
                                    LoggerKt.logDetailed("SDLT_SVM", "Added manual debug image to output");
                                    process.setDebugBitmap(manualDbgImg);
                                }
                                captureFrames$lambda$4 = ScannerViewModel.captureFrames$lambda$4(lazy);
                                captureFrames$lambda$4.add(process);
                            } else {
                                LoggerKt.logE$default("SDLT_SVM", "Not adding image to best image selector - finalStatus: " + process.getFinalStatus(), null, 4, null);
                            }
                            if (captureType2 != CaptureType.MANUAL) {
                                ScannerViewModel scannerViewModel = this;
                                Iterator<T> it = process.getMetrics().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    if (((DetectionMetric) next).getDetectionType() == DetectionType.CORNER) {
                                        obj = next;
                                        break;
                                    }
                                }
                                scannerViewModel.updateCornerDetectionCallback((DetectionMetric) obj);
                            }
                            if (currentCount == i2) {
                                handleLastCapture();
                                return;
                            }
                            return;
                        }
                        Output output = new Output(bitmap, captureType2, null, false, null, manualDbgImg, 28, null);
                        output.setCaptureMetadata(captureMetadata);
                        mutableLiveData = this._outPutCallBack;
                        mutableLiveData.postValue(output);
                    }

                    @Override // com.socure.docv.capturesdk.core.provider.interfaces.CaptureListener
                    public void error(int currentCount, ImageCaptureException exception) {
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        LoggerKt.logD("SDLT_SVM", "error currentCount: " + currentCount + " || error: " + exception.getMessage());
                        if (currentCount == i) {
                            LoggerKt.logI("SDLT_SVM", "Captures finished");
                            handleLastCapture();
                        }
                        Ref.IntRef.this.element++;
                        int i4 = Ref.IntRef.this.element;
                        LoggerKt.logD("SDLT_SVM", "errorCountCapture : " + Ref.IntRef.this.element);
                        if (Ref.IntRef.this.element == i) {
                            LoggerKt.logD("SDLT_SVM", "error errorCountCapture : " + Ref.IntRef.this.element + " || captureCount: " + i);
                            this.captureMaxErrorHandling(captureType2, exception);
                        }
                    }

                    private final void enableAnalysisOnCaptureError() {
                        MutableLiveData mutableLiveData;
                        MutableLiveData mutableLiveData2;
                        MutableLiveData mutableLiveData3;
                        LoggerKt.logD("SDLT_SVM", "enableAnalysisOnCaptureError called with openCvSupported: " + ConstantsKt.getOPEN_CV_SUPPORTED());
                        if (!ConstantsKt.getOPEN_CV_SUPPORTED()) {
                            mutableLiveData = this._irrecoverableErrorCallback;
                            mutableLiveData.postValue(new Pair(ErrorScenario.MANUAL_FAILED, "Capture failed in manual mode"));
                            return;
                        }
                        if (captureType2 == CaptureType.MANUAL) {
                            mutableLiveData3 = this._irrecoverableErrorCallback;
                            mutableLiveData3.postValue(new Pair(ErrorScenario.REMOVE_BLOCKER_MANUAL_CAPTURE_FAILED, "remove blocker as manual capture failed"));
                        } else {
                            mutableLiveData2 = this._irrecoverableErrorCallback;
                            mutableLiveData2.postValue(new Pair(ErrorScenario.REMOVE_BLOCKER_AUTO_CAPTURE_FAILED, "remove blocker as auto capture failed"));
                        }
                        this.toggleToAnalysisMode(true);
                    }

                    private final void handleLastCapture() {
                        BestImageSelector captureFrames$lambda$4;
                        MutableLiveData mutableLiveData;
                        LoggerKt.logD("SDLT_SVM", "handleLastCapture");
                        captureFrames$lambda$4 = ScannerViewModel.captureFrames$lambda$4(lazy);
                        Output fetch = captureFrames$lambda$4.fetch();
                        Unit unit = null;
                        if (fetch != null) {
                            ScannerViewModel scannerViewModel = this;
                            if (fetch.getFinalBitmap().isRecycled()) {
                                LoggerKt.logE$default("SDLT_SVM", "output finalBitmap is Recycled ", null, 4, null);
                                enableAnalysisOnCaptureError();
                            } else {
                                LoggerKt.logD("SDLT_SVM", "We have a good scan from BIM");
                                mutableLiveData = scannerViewModel._outPutCallBack;
                                mutableLiveData.postValue(fetch);
                            }
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            LoggerKt.logD("SDLT_SVM", "Bim didn't have a good image, starting analysis mode again");
                            enableAnalysisOnCaptureError();
                        }
                    }
                });
            } else {
                i = captureCount;
                captureType2 = captureType;
            }
            if (i3 == i2) {
                return;
            }
            i3++;
            captureType = captureType2;
            captureCount = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BestImageSelector captureFrames$lambda$4(Lazy<BestImageSelector> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void captureMaxErrorHandling(CaptureType captureType, ImageCaptureException exception) {
        LoggerKt.logD("SDLT_SVM", "captureMaxErrorHandling captureType: " + captureType + " || ex: " + exception);
        int i = WhenMappings.$EnumSwitchMapping$0[captureType.ordinal()];
        if (i == 1) {
            this.autoCaptureFailure++;
        } else if (i == 2) {
            this.manualCaptureFailure++;
        } else {
            LoggerKt.logD("SDLT_SVM", "captureMaxErrorHandling unhandled captureType: " + captureType);
        }
        if (checkForMaxCaptureError()) {
            int i2 = this.bothErrorsMaxed + 1;
            this.bothErrorsMaxed = i2;
            LoggerKt.logE$default("SDLT_SVM", "bothErrorsMaxed count: " + i2, null, 4, null);
            resetErrorCount();
            this._irrecoverableErrorCallback.postValue(new Pair<>(ErrorScenario.CONTINUOUS_ERRORS_MAXED, "bothErrorsMaxed: " + this.bothErrorsMaxed + " | " + Log.getStackTraceString(exception)));
        }
    }

    private final boolean checkForMaxCaptureError() {
        int i = this.autoCaptureFailure;
        boolean z = i >= 10 && this.manualCaptureFailure >= 3;
        LoggerKt.logD("SDLT_SVM", "checkForMaxError - bothMaxed: " + z + " | autoCaptureFailure: " + i + " | manualCaptureFailure: " + this.manualCaptureFailure);
        return z;
    }

    public final void toggleToAnalysisMode(boolean enableAnalysis) {
        LoggerKt.logD("SDLT_SVM", "toggleToAnalysisMode");
        FrameEngine frameEngine = this.frameEngine;
        if (frameEngine != null) {
            frameEngine.toggleAnalysisMode(enableAnalysis);
        }
    }

    public final void startGeneratingFrame() {
        FrameEngine frameEngine = this.frameEngine;
        if (frameEngine != null) {
            frameEngine.startGeneratingFrame();
        }
    }

    public final void stopGeneratingFrame() {
        FrameEngine frameEngine = this.frameEngine;
        if (frameEngine != null) {
            frameEngine.stopGeneratingFrame();
        }
    }

    public final void freezeFeed() {
        FrameEngine frameEngine = this.frameEngine;
        if (frameEngine != null) {
            frameEngine.freeze$capturesdk_productionRelease();
        }
    }

    public final void setViewDimensions(ViewDimensions viewDimensions) {
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        this.applicationComponent.setGuidingBoxViewDimension(viewDimensions);
        FrameEngine frameEngine = this.frameEngine;
        if (frameEngine != null) {
            frameEngine.updateViewDimensions$capturesdk_productionRelease(this.applicationComponent.getGuidingBoxViewDimension());
        }
    }

    public final GuidingBox getManualGuidingBox() {
        return this.applicationComponent.getGuidingBoxViewDimension().getGuidingBox();
    }

    public final void uploadImage(UploadImage uploadImage, Output output, ArrayList<Face> faces, long captureDuration, EventUpdater eventUpdater) {
        Intrinsics.checkNotNullParameter(uploadImage, "uploadImage");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(eventUpdater, "eventUpdater");
        LoggerKt.logDetailed("SDLT_SVM", "uploadImage called");
        long currentTimeMillis = System.currentTimeMillis();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO().plus(new ScannerViewModel$uploadImage$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this)), null, new ScannerViewModel$uploadImage$2(uploadImage, new ArrayList(), eventUpdater, this, currentTimeMillis, captureDuration, output, faces, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageUploadFailure(long uploadStartTime, List<Pair<String, String>> eventParams, SocureDocVError apiResponse, EventUpdater eventUpdater) {
        eventParams.add(new Pair<>("duration", String.valueOf(System.currentTimeMillis() - uploadStartTime)));
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(eventParams);
        arrayList.add(new Pair("type", apiResponse == SocureDocVError.NO_INTERNET_CONNECTION ? AnalyticsConstantsKt.NO_NETWORK : AnalyticsConstantsKt.SERVER));
        eventUpdater.triggerEvent(new EventData(Utils.replacePlaceholders$capturesdk_productionRelease$default(Utils.INSTANCE, AnalyticsConstantsKt.UPLOAD_FAILED, null, SessionManager.INSTANCE.getSelectedDocument(), 2, null), CollectionsKt.toList(arrayList)));
        eventUpdater.triggerEvent(new EventData("error", CollectionsKt.arrayListOf(new Pair("type", AnalyticsConstantsKt.UPLOAD_FAILED), new Pair("message", apiResponse.name()))));
        this._uploadImageIvsCallback.postValue(new UploadIvsResponse.Error(apiResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageUploadSuccess(long uploadStartTime, List<Pair<String, String>> eventParams, UploadImage uploadImage, boolean shouldRetake, EventUpdater eventUpdater, long captureDuration, Output output, ArrayList<Face> faces) {
        UtilsKt.appendUploadSuccessEventParams(eventParams, uploadStartTime);
        if (shouldRetake) {
            retake(eventParams, uploadImage, eventUpdater, output, faces);
        } else {
            processedToNext(eventParams, uploadImage, eventUpdater, captureDuration, output, faces);
        }
    }

    private final void retake(List<Pair<String, String>> eventParams, UploadImage uploadImage, EventUpdater eventUpdater, Output output, ArrayList<Face> faces) {
        eventParams.add(new Pair<>("type", AnalyticsConstantsKt.IVS));
        eventUpdater.triggerEvent(new EventData(Utils.replacePlaceholders$capturesdk_productionRelease$default(Utils.INSTANCE, AnalyticsConstantsKt.UPLOAD_FAILED, null, SessionManager.INSTANCE.getSelectedDocument(), 2, null), CollectionsKt.toList(eventParams)));
        this._uploadImageIvsCallback.postValue(new UploadIvsResponse.Retry(new ImageUploadResponse(uploadImage, output, faces)));
    }

    private final void processedToNext(List<Pair<String, String>> eventParams, UploadImage uploadImage, EventUpdater eventUpdater, long captureDuration, Output output, ArrayList<Face> faces) {
        eventParams.add(new Pair<>("type", uploadImage.getCaptureType().getValue()));
        eventParams.add(new Pair<>(AnalyticsConstantsKt.CAPTURE_DURATION, String.valueOf(captureDuration)));
        eventParams.add(new Pair<>(AnalyticsConstantsKt.TOTAL_FACET_DURATION, String.valueOf(this.scannerDurationStore.getTotalScannerScreenDuration())));
        eventParams.add(new Pair<>(AnalyticsConstantsKt.TOTAL_CAPTURE_DURATION, String.valueOf(this.scannerDurationStore.getTotalCaptureDuration())));
        eventUpdater.triggerEvent(new EventData(Utils.replacePlaceholders$capturesdk_productionRelease$default(Utils.INSTANCE, AnalyticsConstantsKt.UPLOAD_COMPLETE, null, SessionManager.INSTANCE.getSelectedDocument(), 2, null), CollectionsKt.toList(eventParams)));
        this._uploadImageIvsCallback.postValue(new UploadIvsResponse.Success(new ImageUploadResponse(uploadImage, output, faces)));
    }

    public final void clearPreviewCallbackValues() {
        this._uploadImageIvsCallback.postValue(null);
    }

    public final void onCompletionShown() {
        this.shim.onComplete();
    }
}
