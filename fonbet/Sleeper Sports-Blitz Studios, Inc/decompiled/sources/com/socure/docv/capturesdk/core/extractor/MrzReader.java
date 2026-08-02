package com.socure.docv.capturesdk.core.extractor;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.vision.text.Text;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.utils.ExtensionsKt;
import com.socure.docv.capturesdk.core.extractor.IReader;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedMrz;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MrzReader.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/MrzReader;", "", "bitmap", "Landroid/graphics/Bitmap;", "reader", "Lcom/socure/docv/capturesdk/core/extractor/IReader;", "(Landroid/graphics/Bitmap;Lcom/socure/docv/capturesdk/core/extractor/IReader;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "read", "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MrzReader {
    private final Bitmap bitmap;
    private final IReader reader;

    public MrzReader(Bitmap bitmap, IReader reader) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.bitmap = bitmap;
        this.reader = reader;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final void read() {
        new TextRecognizer().read(this.bitmap, new OnSuccessListener() { // from class: com.socure.docv.capturesdk.core.extractor.MrzReader$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                MrzReader.read$lambda$1(MrzReader.this, (Text) obj);
            }
        }, new OnFailureListener() { // from class: com.socure.docv.capturesdk.core.extractor.MrzReader$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                MrzReader.read$lambda$2(MrzReader.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read$lambda$1(MrzReader this$0, Text text) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            List<Text.TextBlock> textBlocks = text.getTextBlocks();
            Intrinsics.checkNotNullExpressionValue(textBlocks, "visionText.textBlocks");
            int i = 0;
            for (Object obj : textBlocks) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                LoggerKt.logPiiDebug("SDLT_MRZ_R", "textBlock " + i + ": " + ((Text.TextBlock) obj).getText());
                i = i2;
            }
            List<Text.TextBlock> textBlocks2 = text.getTextBlocks();
            Intrinsics.checkNotNullExpressionValue(textBlocks2, "visionText.textBlocks");
            Pair<ExtractedMrz, Boolean> validateTextBlocks = ExtractorUtilsKt.validateTextBlocks(ExtensionsKt.toStringList(textBlocks2));
            this$0.reader.onRead(validateTextBlocks.getFirst(), validateTextBlocks.getSecond().booleanValue());
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_MRZ_R", "Ex mrz reader: " + Log.getStackTraceString(th), null, 4, null);
            IReader.DefaultImpls.onRead$default(this$0.reader, null, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read$lambda$2(MrzReader this$0, Exception it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        LoggerKt.logE$default("SDLT_MRZ_R", "Error in recognising text: " + Log.getStackTraceString(it), null, 4, null);
        IReader.DefaultImpls.onRead$default(this$0.reader, null, false, 2, null);
    }
}
