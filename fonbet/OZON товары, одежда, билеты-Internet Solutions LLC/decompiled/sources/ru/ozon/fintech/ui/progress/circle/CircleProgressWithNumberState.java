package ru.ozon.fintech.ui.progress.circle;

import C.o0;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;", "", "percentage", "", "digit", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "circleAndDiginColor", "", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getPercentage", "()I", "getDigit", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCircleAndDiginColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CircleProgressWithNumberState {
    private final String circleAndDiginColor;
    private final TextAtom digit;
    private final int percentage;

    public CircleProgressWithNumberState(int i11, TextAtom textAtom, String str) {
        this.percentage = i11;
        this.digit = textAtom;
        this.circleAndDiginColor = str;
    }

    public static /* synthetic */ CircleProgressWithNumberState copy$default(CircleProgressWithNumberState circleProgressWithNumberState, int i11, TextAtom textAtom, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = circleProgressWithNumberState.percentage;
        }
        if ((i12 & 2) != 0) {
            textAtom = circleProgressWithNumberState.digit;
        }
        if ((i12 & 4) != 0) {
            str = circleProgressWithNumberState.circleAndDiginColor;
        }
        return circleProgressWithNumberState.copy(i11, textAtom, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPercentage() {
        return this.percentage;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getDigit() {
        return this.digit;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCircleAndDiginColor() {
        return this.circleAndDiginColor;
    }

    @NotNull
    public final CircleProgressWithNumberState copy(int percentage, TextAtom digit, String circleAndDiginColor) {
        return new CircleProgressWithNumberState(percentage, digit, circleAndDiginColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CircleProgressWithNumberState)) {
            return false;
        }
        CircleProgressWithNumberState circleProgressWithNumberState = (CircleProgressWithNumberState) other;
        return this.percentage == circleProgressWithNumberState.percentage && Intrinsics.d(this.digit, circleProgressWithNumberState.digit) && Intrinsics.d(this.circleAndDiginColor, circleProgressWithNumberState.circleAndDiginColor);
    }

    public final String getCircleAndDiginColor() {
        return this.circleAndDiginColor;
    }

    public final TextAtom getDigit() {
        return this.digit;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.percentage) * 31;
        TextAtom textAtom = this.digit;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.circleAndDiginColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.percentage;
        TextAtom textAtom = this.digit;
        String str = this.circleAndDiginColor;
        StringBuilder sb2 = new StringBuilder("CircleProgressWithNumberState(percentage=");
        sb2.append(i11);
        sb2.append(", digit=");
        sb2.append(textAtom);
        sb2.append(", circleAndDiginColor=");
        return o0.c(sb2, str, ")");
    }
}
