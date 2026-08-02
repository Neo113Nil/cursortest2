package com.socure.docv.capturesdk.common.utils;

import android.content.Context;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.FeedManager;
import com.socure.docv.capturesdk.feature.scanner.data.FrameGenerator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraManager.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\b\u0010)\u001a\u00020\u0011H\u0002J\b\u0010*\u001a\u00020\u0011H\u0016J\u0006\u0010+\u001a\u00020\u0011J\b\u0010,\u001a\u00020\u0011H\u0016J\u000e\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020/J(\u00100\u001a\u00020\u00112 \u00101\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0018\u000103j\u0004\u0018\u0001`4\u0012\u0004\u0012\u00020\u001102J\u000e\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u000207R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/CameraManager;", "Lcom/socure/docv/capturesdk/common/utils/FeedManager;", "manualCaptureOnly", "", "context", "Landroid/content/Context;", "previewView", "Landroidx/camera/view/PreviewView;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "lensFacing", "", "cropCoordinates", "", "", "onStreaming", "Lkotlin/Function0;", "", "(ZLandroid/content/Context;Landroidx/camera/view/PreviewView;Landroidx/lifecycle/LifecycleOwner;ILjava/util/List;Lkotlin/jvm/functions/Function0;)V", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "getCameraExecutor", "()Ljava/util/concurrent/ExecutorService;", "cameraExecutor$delegate", "Lkotlin/Lazy;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "getCameraSelector", "()Landroidx/camera/core/CameraSelector;", "cameraSelector$delegate", "getCropCoordinates", "()Ljava/util/List;", "imageAnalysis", "Landroidx/camera/core/ImageAnalysis;", "imageCapture", "Landroidx/camera/core/ImageCapture;", AnalyticsConstantsKt.PREVIEW_SCREEN, "Landroidx/camera/core/Preview;", "screenAspectRatio", "bindCameraUseCases", "clear", "clearAnalyzer", "freeze", "setAnalyzer", "analyzer", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "setCamera", "cameraStartListener", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "takePicture", "captureListener", "Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CameraManager implements FeedManager {

    /* renamed from: cameraExecutor$delegate, reason: from kotlin metadata */
    private final Lazy cameraExecutor;
    private ProcessCameraProvider cameraProvider;

    /* renamed from: cameraSelector$delegate, reason: from kotlin metadata */
    private final Lazy cameraSelector;
    private final Context context;
    private final List<List<Double>> cropCoordinates;
    private ImageAnalysis imageAnalysis;
    private ImageCapture imageCapture;
    private final LifecycleOwner lifecycleOwner;
    private final boolean manualCaptureOnly;
    private final Function0<Unit> onStreaming;
    private Preview preview;
    private final PreviewView previewView;
    private final int screenAspectRatio;

    public CameraManager(boolean z, Context context, PreviewView previewView, LifecycleOwner lifecycleOwner, final int i, List<List<Double>> cropCoordinates, Function0<Unit> onStreaming) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cropCoordinates, "cropCoordinates");
        Intrinsics.checkNotNullParameter(onStreaming, "onStreaming");
        this.manualCaptureOnly = z;
        this.context = context;
        this.previewView = previewView;
        this.lifecycleOwner = lifecycleOwner;
        this.cropCoordinates = cropCoordinates;
        this.onStreaming = onStreaming;
        this.cameraExecutor = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.socure.docv.capturesdk.common.utils.CameraManager$cameraExecutor$2
            @Override // kotlin.jvm.functions.Function0
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor();
            }
        });
        this.cameraSelector = LazyKt.lazy(new Function0<CameraSelector>() { // from class: com.socure.docv.capturesdk.common.utils.CameraManager$cameraSelector$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CameraSelector invoke() {
                CameraSelector build = new CameraSelector.Builder().requireLensFacing(i).build();
                Intrinsics.checkNotNullExpressionValue(build, "Builder().requireLensFacing(lensFacing).build()");
                return build;
            }
        });
        this.screenAspectRatio = 1;
    }

    @Override // com.socure.docv.capturesdk.common.utils.FeedManager
    public FrameGenerator getFrameGenerator() {
        return FeedManager.DefaultImpls.getFrameGenerator(this);
    }

    @Override // com.socure.docv.capturesdk.common.utils.FeedManager
    public List<List<Double>> getCropCoordinates() {
        return this.cropCoordinates;
    }

    private final ExecutorService getCameraExecutor() {
        Object value = this.cameraExecutor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cameraExecutor>(...)");
        return (ExecutorService) value;
    }

    private final CameraSelector getCameraSelector() {
        return (CameraSelector) this.cameraSelector.getValue();
    }

    @Override // com.socure.docv.capturesdk.common.utils.FeedManager
    public void clear() {
        LoggerKt.logD("SDLT_CM", "clear");
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            if (processCameraProvider == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraProvider");
                processCameraProvider = null;
            }
            processCameraProvider.unbindAll();
        }
        getCameraExecutor().shutdown();
        this.previewView.getPreviewStreamState().removeObservers(this.lifecycleOwner);
        Preview preview = this.preview;
        if (preview != null) {
            if (preview == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AnalyticsConstantsKt.PREVIEW_SCREEN);
                preview = null;
            }
            preview.setSurfaceProvider(null);
        }
    }

    public final void setCamera(final Function2<? super Boolean, ? super Exception, Unit> cameraStartListener) {
        Intrinsics.checkNotNullParameter(cameraStartListener, "cameraStartListener");
        LoggerKt.logD("SDLT_CM", "setCamera");
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.INSTANCE.getInstance(this.context);
        companion.addListener(new Runnable() { // from class: com.socure.docv.capturesdk.common.utils.CameraManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CameraManager.setCamera$lambda$0(CameraManager.this, companion, cameraStartListener);
            }
        }, ContextCompat.getMainExecutor(this.context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setCamera$lambda$0(CameraManager this$0, ListenableFuture cameraProviderFuture, Function2 cameraStartListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cameraProviderFuture, "$cameraProviderFuture");
        Intrinsics.checkNotNullParameter(cameraStartListener, "$cameraStartListener");
        V v = cameraProviderFuture.get();
        Intrinsics.checkNotNullExpressionValue(v, "cameraProviderFuture.get()");
        this$0.cameraProvider = (ProcessCameraProvider) v;
        try {
            this$0.bindCameraUseCases();
            cameraStartListener.invoke(true, null);
        } catch (Exception e) {
            LoggerKt.logD("SDLT_CM", "setCamera exception");
            cameraStartListener.invoke(false, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d5, code lost:
    
        if (r8.bindToLifecycle(r9, r10, r11) == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindCameraUseCases() {
        LoggerKt.logD("SDLT_CM", "bindCameraUseCases called");
        int rotation = this.previewView.getDisplay().getRotation();
        Preview build = new Preview.Builder().setTargetAspectRatio(this.screenAspectRatio).setTargetRotation(rotation).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        this.preview = build;
        ImageCapture build2 = new ImageCapture.Builder().setCaptureMode(1).setTargetAspectRatio(this.screenAspectRatio).setTargetRotation(rotation).build();
        Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n              …\n                .build()");
        this.imageCapture = build2;
        Preview preview = null;
        if (ConstantsKt.getOPEN_CV_SUPPORTED() && !this.manualCaptureOnly) {
            this.imageAnalysis = new ImageAnalysis.Builder().setBackpressureStrategy(0).setTargetAspectRatio(this.screenAspectRatio).setTargetRotation(rotation).build();
        } else {
            LoggerKt.logE$default("SDLT_CM", "Not instantiating image analysis - OPEN_CV_SUPPORTED " + ConstantsKt.getOPEN_CV_SUPPORTED() + " | manualCaptureOnly: " + this.manualCaptureOnly, null, 4, null);
        }
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraProvider");
            processCameraProvider = null;
        }
        processCameraProvider.unbindAll();
        ImageAnalysis imageAnalysis = this.imageAnalysis;
        if (imageAnalysis != null) {
            ProcessCameraProvider processCameraProvider2 = this.cameraProvider;
            if (processCameraProvider2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraProvider");
                processCameraProvider2 = null;
            }
            LifecycleOwner lifecycleOwner = this.lifecycleOwner;
            CameraSelector cameraSelector = getCameraSelector();
            UseCase[] useCaseArr = new UseCase[3];
            Preview preview2 = this.preview;
            if (preview2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AnalyticsConstantsKt.PREVIEW_SCREEN);
                preview2 = null;
            }
            useCaseArr[0] = preview2;
            ImageCapture imageCapture = this.imageCapture;
            if (imageCapture == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageCapture");
                imageCapture = null;
            }
            useCaseArr[1] = imageCapture;
            useCaseArr[2] = imageAnalysis;
        }
        ProcessCameraProvider processCameraProvider3 = this.cameraProvider;
        if (processCameraProvider3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraProvider");
            processCameraProvider3 = null;
        }
        LifecycleOwner lifecycleOwner2 = this.lifecycleOwner;
        CameraSelector cameraSelector2 = getCameraSelector();
        UseCase[] useCaseArr2 = new UseCase[2];
        Preview preview3 = this.preview;
        if (preview3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AnalyticsConstantsKt.PREVIEW_SCREEN);
            preview3 = null;
        }
        useCaseArr2[0] = preview3;
        ImageCapture imageCapture2 = this.imageCapture;
        if (imageCapture2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCapture");
            imageCapture2 = null;
        }
        useCaseArr2[1] = imageCapture2;
        processCameraProvider3.bindToLifecycle(lifecycleOwner2, cameraSelector2, useCaseArr2);
        this.previewView.getPreviewStreamState().observe(this.lifecycleOwner, new CameraManagerKt$sam$androidx_lifecycle_Observer$0(new Function1<PreviewView.StreamState, Unit>() { // from class: com.socure.docv.capturesdk.common.utils.CameraManager$bindCameraUseCases$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PreviewView.StreamState streamState) {
                invoke2(streamState);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PreviewView.StreamState streamState) {
                Function0 function0;
                if (streamState == PreviewView.StreamState.STREAMING) {
                    function0 = CameraManager.this.onStreaming;
                    function0.invoke();
                }
            }
        }));
        Preview preview4 = this.preview;
        if (preview4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AnalyticsConstantsKt.PREVIEW_SCREEN);
        } else {
            preview = preview4;
        }
        preview.setSurfaceProvider(this.previewView.getSurfaceProvider());
    }

    public final void setAnalyzer(ImageAnalysis.Analyzer analyzer) {
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        ImageAnalysis imageAnalysis = this.imageAnalysis;
        if (imageAnalysis != null) {
            imageAnalysis.setAnalyzer(getCameraExecutor(), analyzer);
        }
    }

    public final void clearAnalyzer() {
        ImageAnalysis imageAnalysis = this.imageAnalysis;
        if (imageAnalysis != null) {
            imageAnalysis.clearAnalyzer();
        }
    }

    @Override // com.socure.docv.capturesdk.common.utils.FeedManager
    public void freeze() {
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        Preview preview = null;
        if (processCameraProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraProvider");
            processCameraProvider = null;
        }
        UseCase[] useCaseArr = new UseCase[1];
        Preview preview2 = this.preview;
        if (preview2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AnalyticsConstantsKt.PREVIEW_SCREEN);
        } else {
            preview = preview2;
        }
        useCaseArr[0] = preview;
        processCameraProvider.unbind(useCaseArr);
    }

    public final void takePicture(ImageCapture.OnImageCapturedCallback captureListener) {
        Intrinsics.checkNotNullParameter(captureListener, "captureListener");
        LoggerKt.logI("SDLT_CM", "takePicture called on imageCapture");
        ImageCapture imageCapture = this.imageCapture;
        if (imageCapture == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageCapture");
            imageCapture = null;
        }
        imageCapture.m168lambda$takePicture$1$androidxcameracoreImageCapture(getCameraExecutor(), captureListener);
    }
}
