package ru.ozon.app.android.returns.creation.widgets.methods.data;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "", "leftPadding", "", "topPadding", "rightPadding", "bottomPadding", "<init>", "(IIII)V", "getLeftPadding", "()I", "getTopPadding", "getRightPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PaddingsDTO {
    public static final int $stable = 0;
    private final int bottomPadding;
    private final int leftPadding;
    private final int rightPadding;
    private final int topPadding;

    public PaddingsDTO() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = paddingsDTO.leftPadding;
        }
        if ((i15 & 2) != 0) {
            i12 = paddingsDTO.topPadding;
        }
        if ((i15 & 4) != 0) {
            i13 = paddingsDTO.rightPadding;
        }
        if ((i15 & 8) != 0) {
            i14 = paddingsDTO.bottomPadding;
        }
        return paddingsDTO.copy(i11, i12, i13, i14);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final PaddingsDTO copy(int leftPadding, int topPadding, int rightPadding, int bottomPadding) {
        return new PaddingsDTO(leftPadding, topPadding, rightPadding, bottomPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingsDTO)) {
            return false;
        }
        PaddingsDTO paddingsDTO = (PaddingsDTO) other;
        return this.leftPadding == paddingsDTO.leftPadding && this.topPadding == paddingsDTO.topPadding && this.rightPadding == paddingsDTO.rightPadding && this.bottomPadding == paddingsDTO.bottomPadding;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final int getLeftPadding() {
        return this.leftPadding;
    }

    public final int getRightPadding() {
        return this.rightPadding;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottomPadding) + C2454a.a(this.rightPadding, C2454a.a(this.topPadding, Integer.hashCode(this.leftPadding) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return P.a(this.rightPadding, this.bottomPadding, ", bottomPadding=", ")", C2438a.a("PaddingsDTO(leftPadding=", this.leftPadding, ", topPadding=", ", rightPadding=", this.topPadding));
    }

    public PaddingsDTO(int i11, int i12, int i13, int i14) {
        this.leftPadding = i11;
        this.topPadding = i12;
        this.rightPadding = i13;
        this.bottomPadding = i14;
    }

    public /* synthetic */ PaddingsDTO(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 14 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }
}
