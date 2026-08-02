package ru.ozon.android.composerCommonViewKit.iconButton.core;

import I0.C3173b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/android/composerCommonViewKit/iconButton/core/DynamicOnScrollColors;", "", "iconTintColorExpanded", "", "iconTintColorCollapsed", "backgroundColorExpanded", "backgroundColorCollapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconTintColorExpanded", "()Ljava/lang/String;", "getIconTintColorCollapsed", "getBackgroundColorExpanded", "getBackgroundColorCollapsed", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DynamicOnScrollColors {
    public static final int $stable = 0;
    private final String backgroundColorCollapsed;
    private final String backgroundColorExpanded;
    private final String iconTintColorCollapsed;
    private final String iconTintColorExpanded;

    public DynamicOnScrollColors(String str, String str2, String str3, String str4) {
        this.iconTintColorExpanded = str;
        this.iconTintColorCollapsed = str2;
        this.backgroundColorExpanded = str3;
        this.backgroundColorCollapsed = str4;
    }

    public static /* synthetic */ DynamicOnScrollColors copy$default(DynamicOnScrollColors dynamicOnScrollColors, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dynamicOnScrollColors.iconTintColorExpanded;
        }
        if ((i11 & 2) != 0) {
            str2 = dynamicOnScrollColors.iconTintColorCollapsed;
        }
        if ((i11 & 4) != 0) {
            str3 = dynamicOnScrollColors.backgroundColorExpanded;
        }
        if ((i11 & 8) != 0) {
            str4 = dynamicOnScrollColors.backgroundColorCollapsed;
        }
        return dynamicOnScrollColors.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIconTintColorExpanded() {
        return this.iconTintColorExpanded;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconTintColorCollapsed() {
        return this.iconTintColorCollapsed;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColorExpanded() {
        return this.backgroundColorExpanded;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColorCollapsed() {
        return this.backgroundColorCollapsed;
    }

    @NotNull
    public final DynamicOnScrollColors copy(String iconTintColorExpanded, String iconTintColorCollapsed, String backgroundColorExpanded, String backgroundColorCollapsed) {
        return new DynamicOnScrollColors(iconTintColorExpanded, iconTintColorCollapsed, backgroundColorExpanded, backgroundColorCollapsed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicOnScrollColors)) {
            return false;
        }
        DynamicOnScrollColors dynamicOnScrollColors = (DynamicOnScrollColors) other;
        return Intrinsics.d(this.iconTintColorExpanded, dynamicOnScrollColors.iconTintColorExpanded) && Intrinsics.d(this.iconTintColorCollapsed, dynamicOnScrollColors.iconTintColorCollapsed) && Intrinsics.d(this.backgroundColorExpanded, dynamicOnScrollColors.backgroundColorExpanded) && Intrinsics.d(this.backgroundColorCollapsed, dynamicOnScrollColors.backgroundColorCollapsed);
    }

    public final String getBackgroundColorCollapsed() {
        return this.backgroundColorCollapsed;
    }

    public final String getBackgroundColorExpanded() {
        return this.backgroundColorExpanded;
    }

    public final String getIconTintColorCollapsed() {
        return this.iconTintColorCollapsed;
    }

    public final String getIconTintColorExpanded() {
        return this.iconTintColorExpanded;
    }

    public int hashCode() {
        String str = this.iconTintColorExpanded;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconTintColorCollapsed;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColorExpanded;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundColorCollapsed;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.iconTintColorExpanded;
        String str2 = this.iconTintColorCollapsed;
        return C3173b.c(C3660k.d("DynamicOnScrollColors(iconTintColorExpanded=", str, ", iconTintColorCollapsed=", str2, ", backgroundColorExpanded="), this.backgroundColorExpanded, ", backgroundColorCollapsed=", this.backgroundColorCollapsed, ")");
    }
}
