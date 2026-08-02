package ru.ozon.app.android.fresh.unsorted.widgets.islandSeparator.data;

import Ep.a;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/data/IslandSeparatorDTO;", "", "islandsColor", "", "separatorColor", "separatorHeight", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getIslandsColor", "()Ljava/lang/String;", "getSeparatorColor", "getSeparatorHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/fresh/unsorted/widgets/islandSeparator/data/IslandSeparatorDTO;", "equals", "", "other", "hashCode", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class IslandSeparatorDTO {
    public static final int $stable = 0;
    private final String islandsColor;
    private final String separatorColor;
    private final Integer separatorHeight;

    public IslandSeparatorDTO(String str, String str2, Integer num) {
        this.islandsColor = str;
        this.separatorColor = str2;
        this.separatorHeight = num;
    }

    public static /* synthetic */ IslandSeparatorDTO copy$default(IslandSeparatorDTO islandSeparatorDTO, String str, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = islandSeparatorDTO.islandsColor;
        }
        if ((i11 & 2) != 0) {
            str2 = islandSeparatorDTO.separatorColor;
        }
        if ((i11 & 4) != 0) {
            num = islandSeparatorDTO.separatorHeight;
        }
        return islandSeparatorDTO.copy(str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIslandsColor() {
        return this.islandsColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSeparatorHeight() {
        return this.separatorHeight;
    }

    @NotNull
    public final IslandSeparatorDTO copy(String islandsColor, String separatorColor, Integer separatorHeight) {
        return new IslandSeparatorDTO(islandsColor, separatorColor, separatorHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IslandSeparatorDTO)) {
            return false;
        }
        IslandSeparatorDTO islandSeparatorDTO = (IslandSeparatorDTO) other;
        return Intrinsics.d(this.islandsColor, islandSeparatorDTO.islandsColor) && Intrinsics.d(this.separatorColor, islandSeparatorDTO.separatorColor) && Intrinsics.d(this.separatorHeight, islandSeparatorDTO.separatorHeight);
    }

    public final String getIslandsColor() {
        return this.islandsColor;
    }

    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    public final Integer getSeparatorHeight() {
        return this.separatorHeight;
    }

    public int hashCode() {
        String str = this.islandsColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.separatorColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.separatorHeight;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.islandsColor;
        String str2 = this.separatorColor;
        return a.c(C3660k.d("IslandSeparatorDTO(islandsColor=", str, ", separatorColor=", str2, ", separatorHeight="), this.separatorHeight, ")");
    }
}
