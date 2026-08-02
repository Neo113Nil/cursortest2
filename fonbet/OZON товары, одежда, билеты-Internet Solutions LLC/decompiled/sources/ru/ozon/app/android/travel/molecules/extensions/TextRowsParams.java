package ru.ozon.app.android.travel.molecules.extensions;

import B0.C2454a;
import Pk0.b;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/molecules/extensions/TextRowsParams;", "", "", "maxLines", "", "spacingMult", "spacingAdd", "ellipsizedWidth", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "hyphenationFrequency", "<init>", "(IFFILandroid/text/TextUtils$TruncateAt;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMaxLines", "F", "getSpacingMult", "()F", "getSpacingAdd", "getEllipsizedWidth", "Landroid/text/TextUtils$TruncateAt;", "getEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "getHyphenationFrequency", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextRowsParams {
    public static final int $stable = 0;
    private final TextUtils.TruncateAt ellipsize;
    private final int ellipsizedWidth;
    private final int hyphenationFrequency;
    private final int maxLines;
    private final float spacingAdd;
    private final float spacingMult;

    public TextRowsParams(int i11, float f7, float f11, int i12, TextUtils.TruncateAt truncateAt, int i13) {
        this.maxLines = i11;
        this.spacingMult = f7;
        this.spacingAdd = f11;
        this.ellipsizedWidth = i12;
        this.ellipsize = truncateAt;
        this.hyphenationFrequency = i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextRowsParams)) {
            return false;
        }
        TextRowsParams textRowsParams = (TextRowsParams) other;
        return this.maxLines == textRowsParams.maxLines && Float.compare(this.spacingMult, textRowsParams.spacingMult) == 0 && Float.compare(this.spacingAdd, textRowsParams.spacingAdd) == 0 && this.ellipsizedWidth == textRowsParams.ellipsizedWidth && this.ellipsize == textRowsParams.ellipsize && this.hyphenationFrequency == textRowsParams.hyphenationFrequency;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getSpacingAdd() {
        return this.spacingAdd;
    }

    public final float getSpacingMult() {
        return this.spacingMult;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.ellipsizedWidth, b.a(this.spacingAdd, b.a(this.spacingMult, Integer.hashCode(this.maxLines) * 31, 31), 31), 31);
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        return Integer.hashCode(this.hyphenationFrequency) + ((a11 + (truncateAt == null ? 0 : truncateAt.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "TextRowsParams(maxLines=" + this.maxLines + ", spacingMult=" + this.spacingMult + ", spacingAdd=" + this.spacingAdd + ", ellipsizedWidth=" + this.ellipsizedWidth + ", ellipsize=" + this.ellipsize + ", hyphenationFrequency=" + this.hyphenationFrequency + ")";
    }

    public /* synthetic */ TextRowsParams(int i11, float f7, float f11, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 2 : i11, (i14 & 2) != 0 ? 1.0f : f7, (i14 & 4) != 0 ? 0.0f : f11, i12, (i14 & 16) != 0 ? TextUtils.TruncateAt.END : truncateAt, (i14 & 32) != 0 ? 0 : i13);
    }
}
