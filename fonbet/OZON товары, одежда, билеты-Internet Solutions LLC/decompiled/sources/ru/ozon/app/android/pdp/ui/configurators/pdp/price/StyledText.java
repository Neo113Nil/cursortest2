package ru.ozon.app.android.pdp.ui.configurators.pdp.price;

import Ep.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/price/StyledText;", "", "", "text", "", "color", "", "styleRes", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "Ljava/lang/String;", "getColor", "Ljava/lang/Integer;", "getStyleRes", "()Ljava/lang/Integer;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StyledText {
    private final String color;
    private final Integer styleRes;

    @NotNull
    private final CharSequence text;

    public StyledText(@NotNull CharSequence text, String str, Integer num) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.color = str;
        this.styleRes = num;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyledText)) {
            return false;
        }
        StyledText styledText = (StyledText) other;
        return Intrinsics.d(this.text, styledText.text) && Intrinsics.d(this.color, styledText.color) && Intrinsics.d(this.styleRes, styledText.styleRes);
    }

    public final String getColor() {
        return this.color;
    }

    public final Integer getStyleRes() {
        return this.styleRes;
    }

    @NotNull
    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.styleRes;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CharSequence charSequence = this.text;
        String str = this.color;
        Integer num = this.styleRes;
        StringBuilder sb2 = new StringBuilder("StyledText(text=");
        sb2.append((Object) charSequence);
        sb2.append(", color=");
        sb2.append(str);
        sb2.append(", styleRes=");
        return a.c(sb2, num, ")");
    }
}
