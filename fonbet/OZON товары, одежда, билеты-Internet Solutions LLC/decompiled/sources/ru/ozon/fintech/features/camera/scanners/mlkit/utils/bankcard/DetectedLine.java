package ru.ozon.fintech.features.camera.scanners.mlkit.utils.bankcard;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\rHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/fintech/features/camera/scanners/mlkit/utils/bankcard/DetectedLine;", "", "text", "", "box", "Landroid/graphics/Rect;", "<init>", "(Ljava/lang/String;Landroid/graphics/Rect;)V", "getText", "()Ljava/lang/String;", "getBox", "()Landroid/graphics/Rect;", "centerY", "", "getCenterY", "()I", "left", "getLeft", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "camera-scanners-mlkit_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DetectedLine {
    private final Rect box;

    @NotNull
    private final String text;

    public DetectedLine(@NotNull String text, Rect rect) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.box = rect;
    }

    public static /* synthetic */ DetectedLine copy$default(DetectedLine detectedLine, String str, Rect rect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = detectedLine.text;
        }
        if ((i11 & 2) != 0) {
            rect = detectedLine.box;
        }
        return detectedLine.copy(str, rect);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Rect getBox() {
        return this.box;
    }

    @NotNull
    public final DetectedLine copy(@NotNull String text, Rect box) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new DetectedLine(text, box);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectedLine)) {
            return false;
        }
        DetectedLine detectedLine = (DetectedLine) other;
        return Intrinsics.d(this.text, detectedLine.text) && Intrinsics.d(this.box, detectedLine.box);
    }

    public final Rect getBox() {
        return this.box;
    }

    public final int getCenterY() {
        Rect rect = this.box;
        if (rect != null) {
            return rect.centerY();
        }
        return 0;
    }

    public final int getLeft() {
        Rect rect = this.box;
        if (rect != null) {
            return rect.left;
        }
        return 0;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Rect rect = this.box;
        return hashCode + (rect == null ? 0 : rect.hashCode());
    }

    @NotNull
    public String toString() {
        return "DetectedLine(text=" + this.text + ", box=" + this.box + ")";
    }
}
