package ru.sberdevices.salutevision.core.data;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/sberdevices/salutevision/core/data/DocumentRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "crop", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getCrop", "()Landroid/graphics/Bitmap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DocumentRecognitionInfo implements SaluteVisionRecognition.Info {
    private final Bitmap crop;

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentRecognitionInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DocumentRecognitionInfo copy$default(DocumentRecognitionInfo documentRecognitionInfo, Bitmap bitmap, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bitmap = documentRecognitionInfo.crop;
        }
        return documentRecognitionInfo.copy(bitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getCrop() {
        return this.crop;
    }

    @NotNull
    public final DocumentRecognitionInfo copy(Bitmap crop) {
        return new DocumentRecognitionInfo(crop);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentRecognitionInfo) && Intrinsics.d(this.crop, ((DocumentRecognitionInfo) other).crop);
    }

    public final Bitmap getCrop() {
        return this.crop;
    }

    public int hashCode() {
        Bitmap bitmap = this.crop;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentRecognitionInfo(crop=" + this.crop + ')';
    }

    public DocumentRecognitionInfo(Bitmap bitmap) {
        this.crop = bitmap;
    }

    public /* synthetic */ DocumentRecognitionInfo(Bitmap bitmap, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bitmap);
    }
}
