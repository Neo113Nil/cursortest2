package com.socure.docv.capturesdk.feature.scanner.data;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.DataExtractionUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: CameraSource.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class CameraSource$analyzer$2 extends Lambda implements Function0<ImageAnalysis.Analyzer> {
    final /* synthetic */ CameraSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraSource$analyzer$2(CameraSource cameraSource) {
        super(0);
        this.this$0 = cameraSource;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageAnalysis.Analyzer invoke() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final CameraSource cameraSource = this.this$0;
        return new ImageAnalysis.Analyzer() { // from class: com.socure.docv.capturesdk.feature.scanner.data.CameraSource$analyzer$2$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.ImageAnalysis.Analyzer
            public final void analyze(ImageProxy imageProxy) {
                CameraSource$analyzer$2.invoke$lambda$0(CameraSource.this, objectRef, imageProxy);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.socure.docv.capturesdk.common.utils.ExtractedImageData, java.lang.Object] */
    public static final void invoke$lambda$0(CameraSource this$0, Ref.ObjectRef previousExtractedData, ImageProxy it) {
        Function2 function2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(previousExtractedData, "$previousExtractedData");
        Intrinsics.checkNotNullParameter(it, "it");
        LoggerKt.logDetailed("SDLT_CS", "imageProxy received in analyzer: h:" + it.getHeight() + ", w:" + it.getWidth());
        ?? extractImageData = DataExtractionUtils.INSTANCE.extractImageData(it);
        LoggerKt.logDetailed("SDLT_CS", "current imageProxy is getting closed in analyzer");
        function2 = this$0.listener;
        function2.invoke(previousExtractedData.element, extractImageData);
        previousExtractedData.element = extractImageData;
        it.close();
    }
}
