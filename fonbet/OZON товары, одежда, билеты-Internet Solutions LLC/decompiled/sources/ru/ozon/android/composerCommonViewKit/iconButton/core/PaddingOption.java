package ru.ozon.android.composerCommonViewKit.iconButton.core;

import Kk.c;
import T7.Z;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/iconButton/core/PaddingOption;", "", "topMargin", "", "leftMargin", "rightMargin", "bottomMargin", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTopMargin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLeftMargin", "getRightMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/android/composerCommonViewKit/iconButton/core/PaddingOption;", "equals", "", "other", "hashCode", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PaddingOption {
    public static final int $stable = 0;
    private final Integer bottomMargin;
    private final Integer leftMargin;
    private final Integer rightMargin;
    private final Integer topMargin;

    public PaddingOption(Integer num, Integer num2, Integer num3, Integer num4) {
        this.topMargin = num;
        this.leftMargin = num2;
        this.rightMargin = num3;
        this.bottomMargin = num4;
    }

    public static /* synthetic */ PaddingOption copy$default(PaddingOption paddingOption, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = paddingOption.topMargin;
        }
        if ((i11 & 2) != 0) {
            num2 = paddingOption.leftMargin;
        }
        if ((i11 & 4) != 0) {
            num3 = paddingOption.rightMargin;
        }
        if ((i11 & 8) != 0) {
            num4 = paddingOption.bottomMargin;
        }
        return paddingOption.copy(num, num2, num3, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getLeftMargin() {
        return this.leftMargin;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final PaddingOption copy(Integer topMargin, Integer leftMargin, Integer rightMargin, Integer bottomMargin) {
        return new PaddingOption(topMargin, leftMargin, rightMargin, bottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingOption)) {
            return false;
        }
        PaddingOption paddingOption = (PaddingOption) other;
        return Intrinsics.d(this.topMargin, paddingOption.topMargin) && Intrinsics.d(this.leftMargin, paddingOption.leftMargin) && Intrinsics.d(this.rightMargin, paddingOption.rightMargin) && Intrinsics.d(this.bottomMargin, paddingOption.bottomMargin);
    }

    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    public final Integer getLeftMargin() {
        return this.leftMargin;
    }

    public final Integer getRightMargin() {
        return this.rightMargin;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        Integer num = this.topMargin;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.leftMargin;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rightMargin;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottomMargin;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.topMargin;
        Integer num2 = this.leftMargin;
        return Z.c(c.f("PaddingOption(topMargin=", ", leftMargin=", num, num2, ", rightMargin="), this.rightMargin, ", bottomMargin=", this.bottomMargin, ")");
    }
}
