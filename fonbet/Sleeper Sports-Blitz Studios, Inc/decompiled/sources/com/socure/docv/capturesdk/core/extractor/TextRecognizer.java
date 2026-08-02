package com.socure.docv.capturesdk.core.extractor;

import android.graphics.Bitmap;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextRecognizer.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/TextRecognizer;", "", "()V", "recognizer", "Lcom/google/mlkit/vision/text/TextRecognizer;", "read", "", "bitmap", "Landroid/graphics/Bitmap;", "successListener", "Lcom/google/android/gms/tasks/OnSuccessListener;", "Lcom/google/mlkit/vision/text/Text;", "failureListener", "Lcom/google/android/gms/tasks/OnFailureListener;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextRecognizer {
    private final com.google.mlkit.vision.text.TextRecognizer recognizer;

    public TextRecognizer() {
        com.google.mlkit.vision.text.TextRecognizer client = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(TextRecognizerOptions.DEFAULT_OPTIONS)");
        this.recognizer = client;
    }

    public final void read(Bitmap bitmap, OnSuccessListener<Text> successListener, OnFailureListener failureListener) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(successListener, "successListener");
        Intrinsics.checkNotNullParameter(failureListener, "failureListener");
        InputImage fromBitmap = InputImage.fromBitmap(bitmap, 0);
        Intrinsics.checkNotNullExpressionValue(fromBitmap, "fromBitmap(bitmap, 0)");
        this.recognizer.process(fromBitmap).addOnSuccessListener(successListener).addOnFailureListener(failureListener);
    }
}
