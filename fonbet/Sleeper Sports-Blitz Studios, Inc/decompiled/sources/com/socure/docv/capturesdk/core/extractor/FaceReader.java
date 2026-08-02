package com.socure.docv.capturesdk.core.extractor;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ImageUtils;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedFace;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FaceReader.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/FaceReader;", "", "bitmap", "Landroid/graphics/Bitmap;", "reader", "Lcom/socure/docv/capturesdk/core/extractor/IReader;", "performanceMode", "", "(Landroid/graphics/Bitmap;Lcom/socure/docv/capturesdk/core/extractor/IReader;I)V", "options", "Lcom/google/mlkit/vision/face/FaceDetectorOptions;", "scanner", "Lcom/google/mlkit/vision/face/FaceDetector;", "read", "", "readBlocking", "Lcom/google/mlkit/vision/face/Face;", "timeOutInMillis", "", "secondProcess", "extractedFace", "Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedFace;", "stop", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FaceReader {
    private final Bitmap bitmap;
    private final FaceDetectorOptions options;
    private final IReader reader;
    private final FaceDetector scanner;

    public FaceReader(Bitmap bitmap, IReader reader, int i) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.bitmap = bitmap;
        this.reader = reader;
        FaceDetectorOptions build = new FaceDetectorOptions.Builder().setPerformanceMode(i).setLandmarkMode(1).setContourMode(1).setClassificationMode(1).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .setPe…DE_NONE)\n        .build()");
        this.options = build;
        FaceDetector client = FaceDetection.getClient(build);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(options)");
        this.scanner = client;
    }

    public /* synthetic */ FaceReader(Bitmap bitmap, IReader iReader, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, iReader, (i2 & 4) != 0 ? 2 : i);
    }

    public final void read() {
        InputImage fromBitmap = InputImage.fromBitmap(this.bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(bitmap, 0)");
        Task<List<Face>> process = this.scanner.process(fromBitmap);
        final Function1<List<Face>, Unit> function1 = new Function1<List<Face>, Unit>() { // from class: com.socure.docv.capturesdk.core.extractor.FaceReader$read$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<Face> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Face> it) {
                Unit unit;
                IReader iReader;
                Bitmap bitmap;
                IReader iReader2;
                LoggerKt.logD("SDLT_FD", "success called at: " + System.currentTimeMillis() + " | No. of Faces: " + it.size());
                Intrinsics.checkNotNullExpressionValue(it, "it");
                Face finalFace = ExtractorUtilsKt.getFinalFace(it);
                ExtractedFace extractedFace = new ExtractedFace();
                if (finalFace != null) {
                    FaceReader faceReader = FaceReader.this;
                    extractedFace.setFace$capturesdk_productionRelease(finalFace);
                    extractedFace.setRotZAxis$capturesdk_productionRelease(ExtractorUtilsKt.getRotationAngle(finalFace.getHeadEulerAngleZ()));
                    iReader2 = faceReader.reader;
                    iReader2.onRead(extractedFace, true);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    FaceReader faceReader2 = FaceReader.this;
                    if (it.size() == 0) {
                        bitmap = faceReader2.bitmap;
                        faceReader2.secondProcess(bitmap, extractedFace);
                    } else {
                        iReader = faceReader2.reader;
                        iReader.onRead(null, false);
                    }
                }
            }
        };
        process.addOnSuccessListener(new OnSuccessListener() { // from class: com.socure.docv.capturesdk.core.extractor.FaceReader$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FaceReader.read$lambda$0(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.socure.docv.capturesdk.core.extractor.FaceReader$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                FaceReader.read$lambda$1(FaceReader.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read$lambda$1(FaceReader this$0, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        LoggerKt.logD("SDLT_FD", "failure called at: " + System.currentTimeMillis() + " : ex: " + Log.getStackTraceString(it));
        this$0.reader.onRead(null, false);
    }

    public final Face readBlocking(long timeOutInMillis) {
        LoggerKt.logD("SDLT_FD", "readBlocking called at: " + System.currentTimeMillis());
        InputImage fromBitmap = InputImage.fromBitmap(this.bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(bitmap, 0)");
        Task<List<Face>> process = this.scanner.process(fromBitmap);
        Intrinsics.checkNotNullExpressionValue(process, "scanner.process(inputImage)");
        try {
            return (Face) BuildersKt.runBlocking(Dispatchers.getIO(), new FaceReader$readBlocking$1(process, timeOutInMillis, null));
        } catch (Throwable th) {
            LoggerKt.logD("SDLT_FD", "readBlocking failure called at: " + System.currentTimeMillis() + " : Message: " + th.getLocalizedMessage() + ", Exception: " + Log.getStackTraceString(th));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void secondProcess(Bitmap bitmap, final ExtractedFace extractedFace) {
        LoggerKt.logD("SDLT_FD", "secondProcess called at: " + System.currentTimeMillis());
        InputImage fromBitmap = InputImage.fromBitmap(ImageUtils.INSTANCE.rotateBitmap$capturesdk_productionRelease(bitmap, 180.0f), 0);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(ImageUtils.ro…eBitmap(bitmap, 180F), 0)");
        Task<List<Face>> process = this.scanner.process(fromBitmap);
        final Function1<List<Face>, Unit> function1 = new Function1<List<Face>, Unit>() { // from class: com.socure.docv.capturesdk.core.extractor.FaceReader$secondProcess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<Face> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Face> it) {
                Unit unit;
                IReader iReader;
                IReader iReader2;
                LoggerKt.logD("SDLT_FD", "secondProcess - success called at: " + System.currentTimeMillis() + " | No. of Faces: " + it.size());
                Intrinsics.checkNotNullExpressionValue(it, "it");
                Face finalFace = ExtractorUtilsKt.getFinalFace(it);
                if (finalFace != null) {
                    ExtractedFace extractedFace2 = extractedFace;
                    FaceReader faceReader = FaceReader.this;
                    extractedFace2.setFace$capturesdk_productionRelease(finalFace);
                    extractedFace2.setRotZAxis$capturesdk_productionRelease(ExtractorUtilsKt.getRotationAngle(finalFace.getHeadEulerAngleZ()) + 180.0f);
                    iReader2 = faceReader.reader;
                    iReader2.onRead(extractedFace2, true);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    iReader = FaceReader.this.reader;
                    iReader.onRead(null, false);
                }
            }
        };
        process.addOnSuccessListener(new OnSuccessListener() { // from class: com.socure.docv.capturesdk.core.extractor.FaceReader$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FaceReader.secondProcess$lambda$2(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.socure.docv.capturesdk.core.extractor.FaceReader$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                FaceReader.secondProcess$lambda$3(FaceReader.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void secondProcess$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void secondProcess$lambda$3(FaceReader this$0, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        LoggerKt.logD("SDLT_FD", "secondProcess - failure called at: " + System.currentTimeMillis() + " : ex: " + Log.getStackTraceString(it));
        this$0.reader.onRead(null, false);
    }

    public final void stop() {
        this.scanner.close();
    }
}
