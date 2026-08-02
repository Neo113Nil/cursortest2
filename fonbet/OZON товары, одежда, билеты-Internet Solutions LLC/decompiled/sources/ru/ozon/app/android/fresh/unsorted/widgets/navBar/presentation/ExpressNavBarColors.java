package ru.ozon.app.android.fresh.unsorted.widgets.navBar.presentation;

import Am.C2438a;
import B0.C2454a;
import Kk.C3532b;
import Pk0.a;
import Ql.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navBar/presentation/ExpressNavBarColors;", "", "", "backgroundColor", "statusBarColor", "iconColor", "", "isBgColorDark", "shouldShowBackButton", "<init>", "(IIIZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "getStatusBarColor", "getIconColor", "Z", "()Z", "getShouldShowBackButton", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExpressNavBarColors {
    private final int backgroundColor;
    private final int iconColor;
    private final boolean isBgColorDark;
    private final boolean shouldShowBackButton;
    private final int statusBarColor;

    public ExpressNavBarColors(int i11, int i12, int i13, boolean z11, boolean z12) {
        this.backgroundColor = i11;
        this.statusBarColor = i12;
        this.iconColor = i13;
        this.isBgColorDark = z11;
        this.shouldShowBackButton = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressNavBarColors)) {
            return false;
        }
        ExpressNavBarColors expressNavBarColors = (ExpressNavBarColors) other;
        return this.backgroundColor == expressNavBarColors.backgroundColor && this.statusBarColor == expressNavBarColors.statusBarColor && this.iconColor == expressNavBarColors.iconColor && this.isBgColorDark == expressNavBarColors.isBgColorDark && this.shouldShowBackButton == expressNavBarColors.shouldShowBackButton;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public final boolean getShouldShowBackButton() {
        return this.shouldShowBackButton;
    }

    public final int getStatusBarColor() {
        return this.statusBarColor;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowBackButton) + C3532b.a(C2454a.a(this.iconColor, C2454a.a(this.statusBarColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31), 31, this.isBgColorDark);
    }

    /* renamed from: isBgColorDark, reason: from getter */
    public final boolean getIsBgColorDark() {
        return this.isBgColorDark;
    }

    @NotNull
    public String toString() {
        int i11 = this.backgroundColor;
        int i12 = this.statusBarColor;
        int i13 = this.iconColor;
        boolean z11 = this.isBgColorDark;
        boolean z12 = this.shouldShowBackButton;
        StringBuilder a11 = C2438a.a("ExpressNavBarColors(backgroundColor=", i11, ", statusBarColor=", ", iconColor=", i12);
        c.d(a11, i13, ", isBgColorDark=", z11, ", shouldShowBackButton=");
        return a.a(")", a11, z12);
    }
}
