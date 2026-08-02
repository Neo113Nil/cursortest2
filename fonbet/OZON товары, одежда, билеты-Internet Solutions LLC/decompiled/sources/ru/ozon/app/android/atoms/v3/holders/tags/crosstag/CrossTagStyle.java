package ru.ozon.app.android.atoms.v3.holders.tags.crosstag;

import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/tags/crosstag/CrossTagStyle;", "", "", "textColor", "disabledTextColor", "iconColor", "", "backgroundResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTextColor", "getDisabledTextColor", "getIconColor", "I", "getBackgroundResId", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CrossTagStyle {
    private final int backgroundResId;

    @NotNull
    private final String disabledTextColor;

    @NotNull
    private final String iconColor;

    @NotNull
    private final String textColor;

    public CrossTagStyle(@NotNull String textColor, @NotNull String disabledTextColor, @NotNull String iconColor, int i11) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(disabledTextColor, "disabledTextColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.textColor = textColor;
        this.disabledTextColor = disabledTextColor;
        this.iconColor = iconColor;
        this.backgroundResId = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossTagStyle)) {
            return false;
        }
        CrossTagStyle crossTagStyle = (CrossTagStyle) other;
        return Intrinsics.d(this.textColor, crossTagStyle.textColor) && Intrinsics.d(this.disabledTextColor, crossTagStyle.disabledTextColor) && Intrinsics.d(this.iconColor, crossTagStyle.iconColor) && this.backgroundResId == crossTagStyle.backgroundResId;
    }

    public final int getBackgroundResId() {
        return this.backgroundResId;
    }

    @NotNull
    public final String getDisabledTextColor() {
        return this.disabledTextColor;
    }

    @NotNull
    public final String getIconColor() {
        return this.iconColor;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.backgroundResId) + g.a(g.a(this.textColor.hashCode() * 31, 31, this.disabledTextColor), 31, this.iconColor);
    }

    @NotNull
    public String toString() {
        String str = this.textColor;
        String str2 = this.disabledTextColor;
        String str3 = this.iconColor;
        int i11 = this.backgroundResId;
        StringBuilder d11 = C3660k.d("CrossTagStyle(textColor=", str, ", disabledTextColor=", str2, ", iconColor=");
        d11.append(str3);
        d11.append(", backgroundResId=");
        d11.append(i11);
        d11.append(")");
        return d11.toString();
    }
}
