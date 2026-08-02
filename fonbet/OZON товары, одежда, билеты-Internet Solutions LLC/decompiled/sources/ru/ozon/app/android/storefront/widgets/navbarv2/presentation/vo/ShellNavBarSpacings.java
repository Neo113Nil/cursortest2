package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarSpacings;", "", "", "statusBarBottomSpacing", "level0BottomSpacing", "level1BottomSpacing", "level2BottomSpacing", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;", "level1HorizontalPaddings", "level2HorizontalPaddings", "level3HorizontalPaddings", "<init>", "(IIIILru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatusBarBottomSpacing", "getLevel0BottomSpacing", "getLevel1BottomSpacing", "getLevel2BottomSpacing", "Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;", "getLevel1HorizontalPaddings", "()Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;", "getLevel2HorizontalPaddings", "getLevel3HorizontalPaddings", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ShellNavBarSpacings {
    private final int level0BottomSpacing;
    private final int level1BottomSpacing;

    @NotNull
    private final ShellNavBarHorizontalPaddings level1HorizontalPaddings;
    private final int level2BottomSpacing;

    @NotNull
    private final ShellNavBarHorizontalPaddings level2HorizontalPaddings;

    @NotNull
    private final ShellNavBarHorizontalPaddings level3HorizontalPaddings;
    private final int statusBarBottomSpacing;

    public ShellNavBarSpacings(int i11, int i12, int i13, int i14, @NotNull ShellNavBarHorizontalPaddings level1HorizontalPaddings, @NotNull ShellNavBarHorizontalPaddings level2HorizontalPaddings, @NotNull ShellNavBarHorizontalPaddings level3HorizontalPaddings) {
        Intrinsics.checkNotNullParameter(level1HorizontalPaddings, "level1HorizontalPaddings");
        Intrinsics.checkNotNullParameter(level2HorizontalPaddings, "level2HorizontalPaddings");
        Intrinsics.checkNotNullParameter(level3HorizontalPaddings, "level3HorizontalPaddings");
        this.statusBarBottomSpacing = i11;
        this.level0BottomSpacing = i12;
        this.level1BottomSpacing = i13;
        this.level2BottomSpacing = i14;
        this.level1HorizontalPaddings = level1HorizontalPaddings;
        this.level2HorizontalPaddings = level2HorizontalPaddings;
        this.level3HorizontalPaddings = level3HorizontalPaddings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShellNavBarSpacings)) {
            return false;
        }
        ShellNavBarSpacings shellNavBarSpacings = (ShellNavBarSpacings) other;
        return this.statusBarBottomSpacing == shellNavBarSpacings.statusBarBottomSpacing && this.level0BottomSpacing == shellNavBarSpacings.level0BottomSpacing && this.level1BottomSpacing == shellNavBarSpacings.level1BottomSpacing && this.level2BottomSpacing == shellNavBarSpacings.level2BottomSpacing && Intrinsics.d(this.level1HorizontalPaddings, shellNavBarSpacings.level1HorizontalPaddings) && Intrinsics.d(this.level2HorizontalPaddings, shellNavBarSpacings.level2HorizontalPaddings) && Intrinsics.d(this.level3HorizontalPaddings, shellNavBarSpacings.level3HorizontalPaddings);
    }

    public final int getLevel0BottomSpacing() {
        return this.level0BottomSpacing;
    }

    public final int getLevel1BottomSpacing() {
        return this.level1BottomSpacing;
    }

    @NotNull
    public final ShellNavBarHorizontalPaddings getLevel1HorizontalPaddings() {
        return this.level1HorizontalPaddings;
    }

    public final int getLevel2BottomSpacing() {
        return this.level2BottomSpacing;
    }

    @NotNull
    public final ShellNavBarHorizontalPaddings getLevel2HorizontalPaddings() {
        return this.level2HorizontalPaddings;
    }

    @NotNull
    public final ShellNavBarHorizontalPaddings getLevel3HorizontalPaddings() {
        return this.level3HorizontalPaddings;
    }

    public final int getStatusBarBottomSpacing() {
        return this.statusBarBottomSpacing;
    }

    public int hashCode() {
        return this.level3HorizontalPaddings.hashCode() + ((this.level2HorizontalPaddings.hashCode() + ((this.level1HorizontalPaddings.hashCode() + C2454a.a(this.level2BottomSpacing, C2454a.a(this.level1BottomSpacing, C2454a.a(this.level0BottomSpacing, Integer.hashCode(this.statusBarBottomSpacing) * 31, 31), 31), 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.statusBarBottomSpacing;
        int i12 = this.level0BottomSpacing;
        int i13 = this.level1BottomSpacing;
        int i14 = this.level2BottomSpacing;
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings = this.level1HorizontalPaddings;
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings2 = this.level2HorizontalPaddings;
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings3 = this.level3HorizontalPaddings;
        StringBuilder a11 = C2438a.a("ShellNavBarSpacings(statusBarBottomSpacing=", i11, ", level0BottomSpacing=", ", level1BottomSpacing=", i12);
        a.f(i13, i14, ", level2BottomSpacing=", ", level1HorizontalPaddings=", a11);
        a11.append(shellNavBarHorizontalPaddings);
        a11.append(", level2HorizontalPaddings=");
        a11.append(shellNavBarHorizontalPaddings2);
        a11.append(", level3HorizontalPaddings=");
        a11.append(shellNavBarHorizontalPaddings3);
        a11.append(")");
        return a11.toString();
    }
}
