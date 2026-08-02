package com.socure.docv.capturesdk.core.extractor;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.core.extractor.IReader;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedBarcode;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BarcodeReader.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ$\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/BarcodeReader;", "", "()V", "options", "Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;", "scanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "read", "", "bitmap", "Landroid/graphics/Bitmap;", "reader", "Lcom/socure/docv/capturesdk/core/extractor/IReader;", "readBlocking", "Lkotlin/Pair;", "Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedBarcode;", "", "timeOutInMillis", "", "stop", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BarcodeReader {
    private final BarcodeScannerOptions options;
    private final BarcodeScanner scanner;

    public BarcodeReader() {
        BarcodeScannerOptions build = new BarcodeScannerOptions.Builder().setBarcodeFormats(2048, new int[0]).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .setBa…_PDF417)\n        .build()");
        this.options = build;
        BarcodeScanner client = BarcodeScanning.getClient(build);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(options)");
        this.scanner = client;
    }

    public final void read(Bitmap bitmap, final IReader reader) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(reader, "reader");
        InputImage fromBitmap = InputImage.fromBitmap(bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(bitmap, 0)");
        Task<List<Barcode>> process = this.scanner.process(fromBitmap);
        final Function1<List<Barcode>, Unit> function1 = new Function1<List<Barcode>, Unit>() { // from class: com.socure.docv.capturesdk.core.extractor.BarcodeReader$read$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<Barcode> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Barcode> barcodes) {
                LoggerKt.logD("SDLT_BR_MLK", barcodes.size() + " barcodes detected in image");
                IReader iReader = IReader.this;
                Intrinsics.checkNotNullExpressionValue(barcodes, "barcodes");
                iReader.onRead(ExtractorUtilsKt.getExtractedBarcode(barcodes), barcodes.size() > 0);
            }
        };
        process.addOnSuccessListener(new OnSuccessListener() { // from class: com.socure.docv.capturesdk.core.extractor.BarcodeReader$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                BarcodeReader.read$lambda$0(Function1.this, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.socure.docv.capturesdk.core.extractor.BarcodeReader$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                BarcodeReader.read$lambda$1(IReader.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read$lambda$1(IReader reader, Exception it) {
        Intrinsics.checkNotNullParameter(reader, "$reader");
        Intrinsics.checkNotNullParameter(it, "it");
        LoggerKt.logE$default("SDLT_BR_MLK", "Barcode reading failed", null, 4, null);
        IReader.DefaultImpls.onRead$default(reader, null, false, 2, null);
    }

    public final Pair<ExtractedBarcode, Boolean> readBlocking(Bitmap bitmap, long timeOutInMillis) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        LoggerKt.logD("SDLT_BR_MLK", "readBlocking called at: " + System.currentTimeMillis());
        InputImage fromBitmap = InputImage.fromBitmap(bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(bitmap, 0)");
        Task<List<Barcode>> process = this.scanner.process(fromBitmap);
        Intrinsics.checkNotNullExpressionValue(process, "scanner.process(inputImage)");
        try {
            List barcodes = (List) Tasks.await(process, timeOutInMillis, TimeUnit.MILLISECONDS);
            LoggerKt.logD("SDLT_BR_MLK", "readBlocking resumed at: " + System.currentTimeMillis());
            Intrinsics.checkNotNullExpressionValue(barcodes, "barcodes");
            return new Pair<>(ExtractorUtilsKt.getExtractedBarcode(barcodes), Boolean.valueOf(barcodes.size() > 0));
        } catch (Throwable th) {
            LoggerKt.logD("SDLT_BR_MLK", "readBlocking failure called at: " + System.currentTimeMillis() + " : Message: " + th.getLocalizedMessage() + ", Exception: " + Log.getStackTraceString(th));
            return new Pair<>(null, false);
        }
    }

    public final void stop() {
        this.scanner.close();
    }
}
