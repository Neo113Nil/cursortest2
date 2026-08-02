package ru.ozon.app.android.travel.molecules.extensions;

import B0.C2454a;
import Pk0.b;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/molecules/extensions/TextBlockParams;", "", "", "x", "y", "", "width", "Landroid/text/Layout$Alignment;", "alignment", "Landroid/text/TextDirectionHeuristic;", "textDir", "<init>", "(FFILandroid/text/Layout$Alignment;Landroid/text/TextDirectionHeuristic;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getX", "()F", "getY", "I", "getWidth", "Landroid/text/Layout$Alignment;", "getAlignment", "()Landroid/text/Layout$Alignment;", "Landroid/text/TextDirectionHeuristic;", "getTextDir", "()Landroid/text/TextDirectionHeuristic;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextBlockParams {
    public static final int $stable = 8;

    @NotNull
    private final Layout.Alignment alignment;

    @NotNull
    private final TextDirectionHeuristic textDir;
    private final int width;
    private final float x;
    private final float y;

    public TextBlockParams(float f7, float f11, int i11, @NotNull Layout.Alignment alignment, @NotNull TextDirectionHeuristic textDir) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        this.x = f7;
        this.y = f11;
        this.width = i11;
        this.alignment = alignment;
        this.textDir = textDir;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBlockParams)) {
            return false;
        }
        TextBlockParams textBlockParams = (TextBlockParams) other;
        return Float.compare(this.x, textBlockParams.x) == 0 && Float.compare(this.y, textBlockParams.y) == 0 && this.width == textBlockParams.width && this.alignment == textBlockParams.alignment && Intrinsics.d(this.textDir, textBlockParams.textDir);
    }

    @NotNull
    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    public final int getWidth() {
        return this.width;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return this.textDir.hashCode() + ((this.alignment.hashCode() + C2454a.a(this.width, b.a(this.y, Float.hashCode(this.x) * 31, 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TextBlockParams(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", alignment=" + this.alignment + ", textDir=" + this.textDir + ")";
    }

    public /* synthetic */ TextBlockParams(float f7, float f11, int i11, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, f11, i11, (i12 & 8) != 0 ? Layout.Alignment.ALIGN_CENTER : alignment, (i12 & 16) != 0 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : textDirectionHeuristic);
    }
}
