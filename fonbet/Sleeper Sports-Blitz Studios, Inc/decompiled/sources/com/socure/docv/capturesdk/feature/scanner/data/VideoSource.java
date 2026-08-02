package com.socure.docv.capturesdk.feature.scanner.data;

import android.graphics.Bitmap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.provider.interfaces.CaptureListener;
import com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider;
import io.sentry.protocol.SentryThread;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoSource.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n\u00128\u0010\r\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\u0010\u0014J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\fH\u0016J(\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u0016R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016RF\u0010\u0017\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R@\u0010\r\u001a4\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/VideoSource;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/IFrameProvider;", "videoManager", "Lcom/socure/docv/capturesdk/feature/scanner/data/VideoManager;", "cropViewCoordinates", "", "", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "previewListener", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function2;", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "Lkotlin/ParameterName;", "name", "previous", SentryThread.JsonKeys.CURRENT, "(Lcom/socure/docv/capturesdk/feature/scanner/data/VideoManager;Ljava/util/List;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getCropViewCoordinates", "()Ljava/util/List;", "frameListener", "getFrameListener", "()Lkotlin/jvm/functions/Function2;", "freeze", "startGeneratingFrame", "stopGeneratingFrame", "takePicture", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "currentCount", "", "viewDimensions", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "captureListener", "Lcom/socure/docv/capturesdk/core/provider/interfaces/CaptureListener;", "toggleAnalysisMode", "enable", "", "updateViewDimensions", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VideoSource implements IFrameProvider {
    public static final int $stable = 8;
    private final List<List<Double>> cropViewCoordinates;
    private final Function2<ExtractedImageData, ExtractedImageData, Unit> listener;
    private final Function1<Bitmap, Unit> previewListener;
    private final ScanType scanType;
    private final VideoManager videoManager;

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void freeze() {
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void startGeneratingFrame() {
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void stopGeneratingFrame() {
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void takePicture(CaptureType captureType, int currentCount, ViewDimensions viewDimensions, CaptureListener captureListener) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
        Intrinsics.checkNotNullParameter(captureListener, "captureListener");
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void toggleAnalysisMode(boolean enable) {
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public void updateViewDimensions(ViewDimensions viewDimensions) {
        Intrinsics.checkNotNullParameter(viewDimensions, "viewDimensions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSource(VideoManager videoManager, List<List<Double>> cropViewCoordinates, ScanType scanType, Function1<? super Bitmap, Unit> previewListener, Function2<? super ExtractedImageData, ? super ExtractedImageData, Unit> listener) {
        Intrinsics.checkNotNullParameter(videoManager, "videoManager");
        Intrinsics.checkNotNullParameter(cropViewCoordinates, "cropViewCoordinates");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(previewListener, "previewListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.videoManager = videoManager;
        this.cropViewCoordinates = cropViewCoordinates;
        this.scanType = scanType;
        this.previewListener = previewListener;
        this.listener = listener;
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public List<List<Double>> getCropViewCoordinates() {
        return this.cropViewCoordinates;
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.IFrameProvider
    public Function2<ExtractedImageData, ExtractedImageData, Unit> getFrameListener() {
        return this.listener;
    }
}
