package com.socure.docv.capturesdk.feature.scanner.data;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.CameraManager;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.DataExtractionUtils;
import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.CaptureMetadata;
import com.socure.docv.capturesdk.core.processor.model.Resolution;
import com.socure.docv.capturesdk.core.provider.interfaces.CaptureListener;
import com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider;
import io.sentry.protocol.SentryThread;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraSource.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00128\u0010\u000b\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0002\u0010\u0013J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\u0012H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J(\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0016J \u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-2\u0006\u0010)\u001a\u00020*2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0016R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bRF\u0010\u001c\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR@\u0010\u000b\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/CameraSource;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/IFrameProvider;", "cameraManager", "Lcom/socure/docv/capturesdk/common/utils/CameraManager;", "cropViewCoordinates", "", "", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "viewDimensions", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "Lkotlin/ParameterName;", "name", "previous", SentryThread.JsonKeys.CURRENT, "", "(Lcom/socure/docv/capturesdk/common/utils/CameraManager;Ljava/util/List;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;Lkotlin/jvm/functions/Function2;)V", "analyzer", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "getAnalyzer", "()Landroidx/camera/core/ImageAnalysis$Analyzer;", "analyzer$delegate", "Lkotlin/Lazy;", "getCropViewCoordinates", "()Ljava/util/List;", "frameListener", "getFrameListener", "()Lkotlin/jvm/functions/Function2;", "clearAnalyzer", "freeze", "setAnalyzer", "startGeneratingFrame", "stopGeneratingFrame", "takePicture", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "currentCount", "", "captureListener", "Lcom/socure/docv/capturesdk/core/provider/interfaces/CaptureListener;", "takePictureError", "th", "", "toggleAnalysisMode", "enable", "", "updateViewDimensions", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CameraSource implements IFrameProvider {

    /* renamed from: analyzer$delegate, reason: from kotlin metadata */
    private final Lazy analyzer;
    private final CameraManager cameraManager;
    private final List<List<Double>> cropViewCoordinates;
    private final Function2<ExtractedImageData, ExtractedImageData, Unit> listener;
    private final ScanType scanType;
    private ViewDimensions viewDimensions;

    /* JADX WARN: Multi-variable type inference failed */
    public CameraSource(CameraManager cameraManager, List<List<Double>> cropViewCoordinates, ScanType scanType, ViewDimensions viewDimensions, Function2<? super ExtractedImageData, ? super ExtractedImageData, Unit> listener) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(cropViewCoordinates, "cropViewCoordinates");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.cameraManager = cameraManager;
        this.cropViewCoordinates = cropViewCoordinates;
        this.scanType = scanType;
        this.viewDimensions = viewDimensions;
        this.listener = listener;
        this.analyzer = LazyKt.lazy(new CameraSource$analyzer$2(this));
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public List<List<Double>> getCropViewCoordinates() {
        return this.cropViewCoordinates;
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void startGeneratingFrame() {
        LoggerKt.logD("SDLT_CS", "startGeneratingFrame");
        if (!ConstantsKt.getOPEN_CV_SUPPORTED() && this.scanType != ScanType.SELFIE) {
            LoggerKt.logD("SDLT_CS", "Not adding analyzer for selfie - openCvSupported: " + ConstantsKt.getOPEN_CV_SUPPORTED());
            return;
        }
        setAnalyzer();
    }

    private final ImageAnalysis.Analyzer getAnalyzer() {
        return (ImageAnalysis.Analyzer) this.analyzer.getValue();
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public Function2<ExtractedImageData, ExtractedImageData, Unit> getFrameListener() {
        return this.listener;
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void takePicture(final CaptureType captureType, final int currentCount, final ViewDimensions viewDimensions, final CaptureListener captureListener) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        Intrinsics.checkNotNullParameter(captureListener, "captureListener");
        toggleAnalysisMode(false);
        this.cameraManager.takePicture(new ImageCapture.OnImageCapturedCallback() { // from class: com.socure.docv.capturesdk.feature.scanner.data.CameraSource$takePicture$1
            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onCaptureSuccess(ImageProxy imageProxy) {
                ScanType scanType;
                Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
                CaptureMetadata captureMetadata = new CaptureMetadata(CaptureType.this, new Resolution(imageProxy.getWidth(), imageProxy.getHeight()), currentCount, null, 8, null);
                LoggerKt.logD("SDLT_CS", "takePicture - onCaptureSuccess - captureMetadata: " + new Gson().toJson(captureMetadata));
                ExtractedImageData extractImageData = DataExtractionUtils.INSTANCE.extractImageData(imageProxy);
                try {
                    ImageUtils imageUtils = ImageUtils.INSTANCE;
                    scanType = this.scanType;
                    Triple<Bitmap, Bitmap, Integer> bitmapFromImageProxy = imageUtils.getBitmapFromImageProxy(extractImageData, scanType, CaptureType.this, viewDimensions);
                    captureMetadata.setOriginalSize(bitmapFromImageProxy.getThird());
                    captureListener.captured(currentCount, bitmapFromImageProxy.getFirst(), captureMetadata, bitmapFromImageProxy.getSecond());
                } catch (Throwable th) {
                    this.takePictureError(th, captureListener, currentCount);
                }
                imageProxy.close();
            }

            @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
            public void onError(ImageCaptureException exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                captureListener.error(currentCount, exception);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void takePictureError(Throwable th, CaptureListener captureListener, int currentCount) {
        LoggerKt.logE$default("SDLT_CS", "takePicture ex: " + th.getLocalizedMessage(), null, 4, null);
        LoggerKt.logDetailed("SDLT_CS", "takePicture ex: " + Log.getStackTraceString(th));
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "getBitmapFromImageProxy ex";
        }
        captureListener.error(currentCount, new ImageCaptureException(0, localizedMessage, th));
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void toggleAnalysisMode(boolean enable) {
        LoggerKt.logD("SDLT_CS", "toggleAnalysisMode - analysisMode: " + enable);
        if (enable) {
            setAnalyzer();
        } else {
            clearAnalyzer();
        }
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void stopGeneratingFrame() {
        clearAnalyzer();
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void updateViewDimensions(ViewDimensions viewDimensions) {
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        this.viewDimensions = viewDimensions;
    }

    private final void clearAnalyzer() {
        this.cameraManager.clearAnalyzer();
    }

    private final void setAnalyzer() {
        this.cameraManager.setAnalyzer(getAnalyzer());
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void freeze() {
        this.cameraManager.freeze();
    }
}
