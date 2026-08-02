package ru.ozon.app.android.csma.orderTracking.data;

import Kk.c;
import T7.Z;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/PaddingDTO;", "", "top", "", "right", "bottom", "left", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTop", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRight", "getBottom", "getLeft", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/csma/orderTracking/data/PaddingDTO;", "equals", "", "other", "hashCode", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaddingDTO {
    private final Integer bottom;
    private final Integer left;
    private final Integer right;
    private final Integer top;

    public PaddingDTO(Integer num, Integer num2, Integer num3, Integer num4) {
        this.top = num;
        this.right = num2;
        this.bottom = num3;
        this.left = num4;
    }

    public static /* synthetic */ PaddingDTO copy$default(PaddingDTO paddingDTO, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = paddingDTO.top;
        }
        if ((i11 & 2) != 0) {
            num2 = paddingDTO.right;
        }
        if ((i11 & 4) != 0) {
            num3 = paddingDTO.bottom;
        }
        if ((i11 & 8) != 0) {
            num4 = paddingDTO.left;
        }
        return paddingDTO.copy(num, num2, num3, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getTop() {
        return this.top;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRight() {
        return this.right;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getBottom() {
        return this.bottom;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getLeft() {
        return this.left;
    }

    @NotNull
    public final PaddingDTO copy(Integer top, Integer right, Integer bottom, Integer left) {
        return new PaddingDTO(top, right, bottom, left);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingDTO)) {
            return false;
        }
        PaddingDTO paddingDTO = (PaddingDTO) other;
        return Intrinsics.d(this.top, paddingDTO.top) && Intrinsics.d(this.right, paddingDTO.right) && Intrinsics.d(this.bottom, paddingDTO.bottom) && Intrinsics.d(this.left, paddingDTO.left);
    }

    public final Integer getBottom() {
        return this.bottom;
    }

    public final Integer getLeft() {
        return this.left;
    }

    public final Integer getRight() {
        return this.right;
    }

    public final Integer getTop() {
        return this.top;
    }

    public int hashCode() {
        Integer num = this.top;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.right;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bottom;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.left;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.top;
        Integer num2 = this.right;
        return Z.c(c.f("PaddingDTO(top=", ", right=", num, num2, ", bottom="), this.bottom, ", left=", this.left, ")");
    }
}
