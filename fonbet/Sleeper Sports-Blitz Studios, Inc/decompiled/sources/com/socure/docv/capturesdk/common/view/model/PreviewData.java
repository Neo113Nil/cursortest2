package com.socure.docv.capturesdk.common.view.model;

import android.graphics.Bitmap;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BsViewData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006*"}, d2 = {"Lcom/socure/docv/capturesdk/common/view/model/PreviewData;", "", "imageDimenRatio", "", "title", "Lcom/socure/docv/capturesdk/common/view/model/TextLabel;", "confirmationTitle", "confirmationText", "previewBitmap", "Landroid/graphics/Bitmap;", "agreeButton", "Lcom/socure/docv/capturesdk/common/view/model/Button;", "retake", "debugImage", "(Ljava/lang/String;Lcom/socure/docv/capturesdk/common/view/model/TextLabel;Lcom/socure/docv/capturesdk/common/view/model/TextLabel;Lcom/socure/docv/capturesdk/common/view/model/TextLabel;Landroid/graphics/Bitmap;Lcom/socure/docv/capturesdk/common/view/model/Button;Lcom/socure/docv/capturesdk/common/view/model/Button;Landroid/graphics/Bitmap;)V", "getAgreeButton", "()Lcom/socure/docv/capturesdk/common/view/model/Button;", "getConfirmationText", "()Lcom/socure/docv/capturesdk/common/view/model/TextLabel;", "getConfirmationTitle", "getDebugImage", "()Landroid/graphics/Bitmap;", "getImageDimenRatio", "()Ljava/lang/String;", "getPreviewBitmap", "getRetake", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PreviewData {
    public static final int $stable = 8;
    private final Button agreeButton;
    private final TextLabel confirmationText;
    private final TextLabel confirmationTitle;
    private final Bitmap debugImage;
    private final String imageDimenRatio;
    private final Bitmap previewBitmap;
    private final Button retake;
    private final TextLabel title;

    public static /* synthetic */ PreviewData copy$default(PreviewData previewData, String str, TextLabel textLabel, TextLabel textLabel2, TextLabel textLabel3, Bitmap bitmap, Button button, Button button2, Bitmap bitmap2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewData.imageDimenRatio;
        }
        if ((i & 2) != 0) {
            textLabel = previewData.title;
        }
        if ((i & 4) != 0) {
            textLabel2 = previewData.confirmationTitle;
        }
        if ((i & 8) != 0) {
            textLabel3 = previewData.confirmationText;
        }
        if ((i & 16) != 0) {
            bitmap = previewData.previewBitmap;
        }
        if ((i & 32) != 0) {
            button = previewData.agreeButton;
        }
        if ((i & 64) != 0) {
            button2 = previewData.retake;
        }
        if ((i & 128) != 0) {
            bitmap2 = previewData.debugImage;
        }
        Button button3 = button2;
        Bitmap bitmap3 = bitmap2;
        Bitmap bitmap4 = bitmap;
        Button button4 = button;
        return previewData.copy(str, textLabel, textLabel2, textLabel3, bitmap4, button4, button3, bitmap3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageDimenRatio() {
        return this.imageDimenRatio;
    }

    /* renamed from: component2, reason: from getter */
    public final TextLabel getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextLabel getConfirmationTitle() {
        return this.confirmationTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final TextLabel getConfirmationText() {
        return this.confirmationText;
    }

    /* renamed from: component5, reason: from getter */
    public final Bitmap getPreviewBitmap() {
        return this.previewBitmap;
    }

    /* renamed from: component6, reason: from getter */
    public final Button getAgreeButton() {
        return this.agreeButton;
    }

    /* renamed from: component7, reason: from getter */
    public final Button getRetake() {
        return this.retake;
    }

    /* renamed from: component8, reason: from getter */
    public final Bitmap getDebugImage() {
        return this.debugImage;
    }

    public final PreviewData copy(String imageDimenRatio, TextLabel title, TextLabel confirmationTitle, TextLabel confirmationText, Bitmap previewBitmap, Button agreeButton, Button retake, Bitmap debugImage) {
        Intrinsics.checkNotNullParameter(imageDimenRatio, "imageDimenRatio");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(previewBitmap, "previewBitmap");
        Intrinsics.checkNotNullParameter(agreeButton, "agreeButton");
        Intrinsics.checkNotNullParameter(retake, "retake");
        return new PreviewData(imageDimenRatio, title, confirmationTitle, confirmationText, previewBitmap, agreeButton, retake, debugImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewData)) {
            return false;
        }
        PreviewData previewData = (PreviewData) other;
        return Intrinsics.areEqual(this.imageDimenRatio, previewData.imageDimenRatio) && Intrinsics.areEqual(this.title, previewData.title) && Intrinsics.areEqual(this.confirmationTitle, previewData.confirmationTitle) && Intrinsics.areEqual(this.confirmationText, previewData.confirmationText) && Intrinsics.areEqual(this.previewBitmap, previewData.previewBitmap) && Intrinsics.areEqual(this.agreeButton, previewData.agreeButton) && Intrinsics.areEqual(this.retake, previewData.retake) && Intrinsics.areEqual(this.debugImage, previewData.debugImage);
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.imageDimenRatio.hashCode() * 31) + this.title.hashCode()) * 31) + this.confirmationTitle.hashCode()) * 31) + this.confirmationText.hashCode()) * 31) + this.previewBitmap.hashCode()) * 31) + this.agreeButton.hashCode()) * 31) + this.retake.hashCode()) * 31;
        Bitmap bitmap = this.debugImage;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public String toString() {
        return "PreviewData(imageDimenRatio=" + this.imageDimenRatio + ", title=" + this.title + ", confirmationTitle=" + this.confirmationTitle + ", confirmationText=" + this.confirmationText + ", previewBitmap=" + this.previewBitmap + ", agreeButton=" + this.agreeButton + ", retake=" + this.retake + ", debugImage=" + this.debugImage + ")";
    }

    public PreviewData(String imageDimenRatio, TextLabel title, TextLabel confirmationTitle, TextLabel confirmationText, Bitmap previewBitmap, Button agreeButton, Button retake, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageDimenRatio, "imageDimenRatio");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(confirmationTitle, "confirmationTitle");
        Intrinsics.checkNotNullParameter(confirmationText, "confirmationText");
        Intrinsics.checkNotNullParameter(previewBitmap, "previewBitmap");
        Intrinsics.checkNotNullParameter(agreeButton, "agreeButton");
        Intrinsics.checkNotNullParameter(retake, "retake");
        this.imageDimenRatio = imageDimenRatio;
        this.title = title;
        this.confirmationTitle = confirmationTitle;
        this.confirmationText = confirmationText;
        this.previewBitmap = previewBitmap;
        this.agreeButton = agreeButton;
        this.retake = retake;
        this.debugImage = bitmap;
    }

    public final Button getAgreeButton() {
        return this.agreeButton;
    }

    public final TextLabel getConfirmationText() {
        return this.confirmationText;
    }

    public final TextLabel getConfirmationTitle() {
        return this.confirmationTitle;
    }

    public final Bitmap getDebugImage() {
        return this.debugImage;
    }

    public final String getImageDimenRatio() {
        return this.imageDimenRatio;
    }

    public final Bitmap getPreviewBitmap() {
        return this.previewBitmap;
    }

    public final Button getRetake() {
        return this.retake;
    }

    public final TextLabel getTitle() {
        return this.title;
    }
}
