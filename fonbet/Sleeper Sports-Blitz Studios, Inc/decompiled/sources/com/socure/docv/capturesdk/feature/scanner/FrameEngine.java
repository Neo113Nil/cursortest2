package com.socure.docv.capturesdk.feature.scanner;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.utils.CameraManager;
import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import com.socure.docv.capturesdk.common.utils.FeedManager;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.provider.interfaces.CaptureListener;
import com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider;
import com.socure.docv.capturesdk.feature.scanner.data.CameraSource;
import com.socure.docv.capturesdk.feature.scanner.data.VideoManager;
import com.socure.docv.capturesdk.feature.scanner.data.VideoSource;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrameEngine.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00128\u0010\n\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\u0010\u0015J\r\u0010\u001c\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001dJ \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0011J&\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0003J\u0015\u0010)\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b*R@\u0010\n\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/FrameEngine;", "", "videoFeed", "", "feedManager", "Lcom/socure/docv/capturesdk/common/utils/FeedManager;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "viewDimensions", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "frameCallBack", "Lkotlin/Function2;", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "Lkotlin/ParameterName;", "name", "previous", SentryThread.JsonKeys.CURRENT, "", "videoPreviewCallback", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "(ZLcom/socure/docv/capturesdk/common/utils/FeedManager;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "frameProvider", "Lcom/socure/docv/capturesdk/core/provider/interfaces/IFrameProvider;", "getFrameProvider", "()Lcom/socure/docv/capturesdk/core/provider/interfaces/IFrameProvider;", "setFrameProvider", "(Lcom/socure/docv/capturesdk/core/provider/interfaces/IFrameProvider;)V", "freeze", "freeze$capturesdk_productionRelease", "startGeneratingFrame", "stopGeneratingFrame", "takePicture", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "currentCount", "", "captureListener", "Lcom/socure/docv/capturesdk/core/provider/interfaces/CaptureListener;", "toggleAnalysisMode", "enableAnalysis", "updateViewDimensions", "updateViewDimensions$capturesdk_productionRelease", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FrameEngine {
    public static final int $stable = 8;
    private Function2<? super ExtractedImageData, ? super ExtractedImageData, Unit> frameCallBack;
    private IFrameProvider frameProvider;
    private Function1<? super Bitmap, Unit> videoPreviewCallback;
    private final ViewDimensions viewDimensions;

    public FrameEngine(boolean z, FeedManager feedManager, ScanType scanType, ViewDimensions viewDimensions, Function2<? super ExtractedImageData, ? super ExtractedImageData, Unit> frameCallBack, Function1<? super Bitmap, Unit> videoPreviewCallback) {
        Intrinsics.checkNotNullParameter(feedManager, "feedManager");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        Intrinsics.checkNotNullParameter(frameCallBack, "frameCallBack");
        Intrinsics.checkNotNullParameter(videoPreviewCallback, "videoPreviewCallback");
        this.viewDimensions = viewDimensions;
        this.frameCallBack = frameCallBack;
        this.videoPreviewCallback = videoPreviewCallback;
        this.frameProvider = setFrameProvider(z, feedManager, scanType);
    }

    public final IFrameProvider getFrameProvider() {
        return this.frameProvider;
    }

    public final void setFrameProvider(IFrameProvider iFrameProvider) {
        this.frameProvider = iFrameProvider;
    }

    private final IFrameProvider setFrameProvider(boolean videoFeed, FeedManager feedManager, ScanType scanType) {
        if (videoFeed) {
            Intrinsics.checkNotNull(feedManager, "null cannot be cast to non-null type com.socure.docv.capturesdk.feature.scanner.data.VideoManager");
            return new VideoSource((VideoManager) feedManager, feedManager.getCropCoordinates(), scanType, new Function1<Bitmap, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.FrameEngine$setFrameProvider$1
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
                    Function1 function1;
                    function1 = FrameEngine.this.videoPreviewCallback;
                    function1.invoke(bitmap);
                }
            }, new Function2<ExtractedImageData, ExtractedImageData, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.FrameEngine$setFrameProvider$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExtractedImageData extractedImageData, ExtractedImageData current) {
                    Intrinsics.checkNotNullParameter(current, "current");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(ExtractedImageData extractedImageData, ExtractedImageData extractedImageData2) {
                    invoke2(extractedImageData, extractedImageData2);
                    return Unit.INSTANCE;
                }
            });
        }
        Intrinsics.checkNotNull(feedManager, "null cannot be cast to non-null type com.socure.docv.capturesdk.common.utils.CameraManager");
        return new CameraSource((CameraManager) feedManager, feedManager.getCropCoordinates(), scanType, this.viewDimensions, new Function2<ExtractedImageData, ExtractedImageData, Unit>() { // from class: com.socure.docv.capturesdk.feature.scanner.FrameEngine$setFrameProvider$3
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
                Function2 function2;
                Intrinsics.checkNotNullParameter(current, "current");
                function2 = FrameEngine.this.frameCallBack;
                function2.invoke(extractedImageData, current);
            }
        });
    }

    public final void toggleAnalysisMode(boolean enableAnalysis) {
        IFrameProvider iFrameProvider = this.frameProvider;
        if (iFrameProvider != null) {
            iFrameProvider.toggleAnalysisMode(enableAnalysis);
        }
    }

    public final void startGeneratingFrame() {
        IFrameProvider iFrameProvider = this.frameProvider;
        if (iFrameProvider != null) {
            iFrameProvider.startGeneratingFrame();
        }
    }

    public final void stopGeneratingFrame() {
        IFrameProvider iFrameProvider = this.frameProvider;
        if (iFrameProvider != null) {
            iFrameProvider.stopGeneratingFrame();
        }
    }

    public final void takePicture(CaptureType captureType, int currentCount, ViewDimensions viewDimensions, CaptureListener captureListener) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        Intrinsics.checkNotNullParameter(captureListener, "captureListener");
        IFrameProvider iFrameProvider = this.frameProvider;
        if (iFrameProvider != null) {
            iFrameProvider.takePicture(captureType, currentCount, viewDimensions, captureListener);
        }
    }

    public final void updateViewDimensions$capturesdk_productionRelease(ViewDimensions viewDimensions) {
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        IFrameProvider iFrameProvider = this.frameProvider;
        if (iFrameProvider != null) {
            iFrameProvider.updateViewDimensions(viewDimensions);
        }
    }

    public final void freeze$capturesdk_productionRelease() {
        IFrameProvider iFrameProvider = this.frameProvider;
        if (iFrameProvider != null) {
            iFrameProvider.freeze();
        }
    }
}
