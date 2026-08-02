package ru.ozon.app.android.travel.molecules.extensions;

import B0.C2454a;
import K00.b;
import Kk.C3532b;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/molecules/extensions/TextParams;", "", "", "text", "Landroid/text/TextPaint;", "textPaint", "", "includePad", "", "start", "end", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;ZII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "Z", "getIncludePad", "()Z", "I", "getStart", "getEnd", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextParams {
    public static final int $stable = 8;
    private final int end;
    private final boolean includePad;
    private final int start;

    @NotNull
    private final CharSequence text;

    @NotNull
    private final TextPaint textPaint;

    public TextParams(@NotNull CharSequence text, @NotNull TextPaint textPaint, boolean z11, int i11, int i12) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.text = text;
        this.textPaint = textPaint;
        this.includePad = z11;
        this.start = i11;
        this.end = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextParams)) {
            return false;
        }
        TextParams textParams = (TextParams) other;
        return Intrinsics.d(this.text, textParams.text) && Intrinsics.d(this.textPaint, textParams.textPaint) && this.includePad == textParams.includePad && this.start == textParams.start && this.end == textParams.end;
    }

    public final int getEnd() {
        return this.end;
    }

    public final boolean getIncludePad() {
        return this.includePad;
    }

    public final int getStart() {
        return this.start;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    @NotNull
    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public int hashCode() {
        return Integer.hashCode(this.end) + C2454a.a(this.start, C3532b.a((this.textPaint.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.includePad), 31);
    }

    @NotNull
    public String toString() {
        CharSequence charSequence = this.text;
        TextPaint textPaint = this.textPaint;
        boolean z11 = this.includePad;
        int i11 = this.start;
        int i12 = this.end;
        StringBuilder sb2 = new StringBuilder("TextParams(text=");
        sb2.append((Object) charSequence);
        sb2.append(", textPaint=");
        sb2.append(textPaint);
        sb2.append(", includePad=");
        sb2.append(z11);
        sb2.append(", start=");
        sb2.append(i11);
        sb2.append(", end=");
        return b.e(i12, ")", sb2);
    }

    public /* synthetic */ TextParams(CharSequence charSequence, TextPaint textPaint, boolean z11, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, textPaint, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? charSequence.length() : i12);
    }
}
