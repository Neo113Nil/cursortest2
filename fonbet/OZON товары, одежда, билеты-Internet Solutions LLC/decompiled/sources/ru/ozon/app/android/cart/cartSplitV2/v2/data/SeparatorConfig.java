package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import B0.C2454a;
import Cm.e;
import Ep.a;
import G.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "", "height", "", "backgroundColor", "", "tintColor", "leftPadding", "rightPadding", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHeight", "()I", "getBackgroundColor", "()Ljava/lang/String;", "getTintColor", "getLeftPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRightPadding", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "equals", "", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SeparatorConfig {
    public static final int $stable = 0;

    @NotNull
    private final String backgroundColor;
    private final int height;
    private final Integer leftPadding;
    private final Integer rightPadding;
    private final String tintColor;

    public SeparatorConfig(int i11, @NotNull String backgroundColor, String str, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.height = i11;
        this.backgroundColor = backgroundColor;
        this.tintColor = str;
        this.leftPadding = num;
        this.rightPadding = num2;
    }

    public static /* synthetic */ SeparatorConfig copy$default(SeparatorConfig separatorConfig, int i11, String str, String str2, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = separatorConfig.height;
        }
        if ((i12 & 2) != 0) {
            str = separatorConfig.backgroundColor;
        }
        if ((i12 & 4) != 0) {
            str2 = separatorConfig.tintColor;
        }
        if ((i12 & 8) != 0) {
            num = separatorConfig.leftPadding;
        }
        if ((i12 & 16) != 0) {
            num2 = separatorConfig.rightPadding;
        }
        Integer num3 = num2;
        String str3 = str2;
        return separatorConfig.copy(i11, str, str3, num, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    public final SeparatorConfig copy(int height, @NotNull String backgroundColor, String tintColor, Integer leftPadding, Integer rightPadding) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new SeparatorConfig(height, backgroundColor, tintColor, leftPadding, rightPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorConfig)) {
            return false;
        }
        SeparatorConfig separatorConfig = (SeparatorConfig) other;
        return this.height == separatorConfig.height && Intrinsics.d(this.backgroundColor, separatorConfig.backgroundColor) && Intrinsics.d(this.tintColor, separatorConfig.tintColor) && Intrinsics.d(this.leftPadding, separatorConfig.leftPadding) && Intrinsics.d(this.rightPadding, separatorConfig.rightPadding);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Integer getLeftPadding() {
        return this.leftPadding;
    }

    public final Integer getRightPadding() {
        return this.rightPadding;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        int a11 = g.a(Integer.hashCode(this.height) * 31, 31, this.backgroundColor);
        String str = this.tintColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.leftPadding;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rightPadding;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.height;
        String str = this.backgroundColor;
        String str2 = this.tintColor;
        Integer num = this.leftPadding;
        Integer num2 = this.rightPadding;
        StringBuilder g10 = e.g(i11, "SeparatorConfig(height=", ", backgroundColor=", str, ", tintColor=");
        C2454a.f(num, str2, ", leftPadding=", ", rightPadding=", g10);
        return a.c(g10, num2, ")");
    }
}
