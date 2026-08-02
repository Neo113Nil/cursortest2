package ru.ozon.app.android.pdp.widgets.separator.data;

import C.o0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/separator/data/PdpSeparatorDTO;", "", "height", "", "color", "", "tabGroupId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getColor", "()Ljava/lang/String;", "getTabGroupId", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/separator/data/PdpSeparatorDTO;", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PdpSeparatorDTO {
    public static final int $stable = 0;
    private final String color;
    private final Integer height;
    private final String tabGroupId;

    public PdpSeparatorDTO(Integer num, String str, String str2) {
        this.height = num;
        this.color = str;
        this.tabGroupId = str2;
    }

    public static /* synthetic */ PdpSeparatorDTO copy$default(PdpSeparatorDTO pdpSeparatorDTO, Integer num, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = pdpSeparatorDTO.height;
        }
        if ((i11 & 2) != 0) {
            str = pdpSeparatorDTO.color;
        }
        if ((i11 & 4) != 0) {
            str2 = pdpSeparatorDTO.tabGroupId;
        }
        return pdpSeparatorDTO.copy(num, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    @NotNull
    public final PdpSeparatorDTO copy(Integer height, String color, String tabGroupId) {
        return new PdpSeparatorDTO(height, color, tabGroupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpSeparatorDTO)) {
            return false;
        }
        PdpSeparatorDTO pdpSeparatorDTO = (PdpSeparatorDTO) other;
        return Intrinsics.d(this.height, pdpSeparatorDTO.height) && Intrinsics.d(this.color, pdpSeparatorDTO.color) && Intrinsics.d(this.tabGroupId, pdpSeparatorDTO.tabGroupId);
    }

    public final String getColor() {
        return this.color;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getTabGroupId() {
        return this.tabGroupId;
    }

    public int hashCode() {
        Integer num = this.height;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tabGroupId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.height;
        String str = this.color;
        String str2 = this.tabGroupId;
        StringBuilder sb2 = new StringBuilder("PdpSeparatorDTO(height=");
        sb2.append(num);
        sb2.append(", color=");
        sb2.append(str);
        sb2.append(", tabGroupId=");
        return o0.c(sb2, str2, ")");
    }
}
