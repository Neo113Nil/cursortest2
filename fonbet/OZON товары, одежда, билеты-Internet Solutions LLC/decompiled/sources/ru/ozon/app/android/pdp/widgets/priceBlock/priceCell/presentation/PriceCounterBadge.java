package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import C.o0;
import G.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/PriceCounterBadge;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "textColor", "backgroundColor", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getValue", "()Ljava/lang/CharSequence;", "Ljava/lang/String;", "getTextColor", "getBackgroundColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceCounterBadge {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String textColor;

    @NotNull
    private final CharSequence value;

    public PriceCounterBadge(@NotNull CharSequence value, @NotNull String textColor, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.value = value;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceCounterBadge)) {
            return false;
        }
        PriceCounterBadge priceCounterBadge = (PriceCounterBadge) other;
        return Intrinsics.d(this.value, priceCounterBadge.value) && Intrinsics.d(this.textColor, priceCounterBadge.textColor) && Intrinsics.d(this.backgroundColor, priceCounterBadge.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final CharSequence getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + g.a(this.value.hashCode() * 31, 31, this.textColor);
    }

    @NotNull
    public String toString() {
        CharSequence charSequence = this.value;
        String str = this.textColor;
        String str2 = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("PriceCounterBadge(value=");
        sb2.append((Object) charSequence);
        sb2.append(", textColor=");
        sb2.append(str);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str2, ")");
    }
}
