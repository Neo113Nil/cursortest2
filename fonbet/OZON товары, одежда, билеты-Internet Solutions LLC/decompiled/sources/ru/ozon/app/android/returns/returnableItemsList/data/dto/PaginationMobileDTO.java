package ru.ozon.app.android.returns.returnableItemsList.data.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/PaginationMobileDTO;", "", "previous", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "next", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "getPrevious", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getNext", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaginationMobileDTO {
    public static final int $stable = ButtonV3Atom.SmallButton.$stable;

    @NotNull
    private final ButtonV3Atom.SmallButton next;

    @NotNull
    private final ButtonV3Atom.SmallButton previous;

    public PaginationMobileDTO(@NotNull ButtonV3Atom.SmallButton previous, @NotNull ButtonV3Atom.SmallButton next) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(next, "next");
        this.previous = previous;
        this.next = next;
    }

    public static /* synthetic */ PaginationMobileDTO copy$default(PaginationMobileDTO paginationMobileDTO, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallButton = paginationMobileDTO.previous;
        }
        if ((i11 & 2) != 0) {
            smallButton2 = paginationMobileDTO.next;
        }
        return paginationMobileDTO.copy(smallButton, smallButton2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallButton getPrevious() {
        return this.previous;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallButton getNext() {
        return this.next;
    }

    @NotNull
    public final PaginationMobileDTO copy(@NotNull ButtonV3Atom.SmallButton previous, @NotNull ButtonV3Atom.SmallButton next) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(next, "next");
        return new PaginationMobileDTO(previous, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginationMobileDTO)) {
            return false;
        }
        PaginationMobileDTO paginationMobileDTO = (PaginationMobileDTO) other;
        return Intrinsics.d(this.previous, paginationMobileDTO.previous) && Intrinsics.d(this.next, paginationMobileDTO.next);
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getNext() {
        return this.next;
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getPrevious() {
        return this.previous;
    }

    public int hashCode() {
        return this.next.hashCode() + (this.previous.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PaginationMobileDTO(previous=" + this.previous + ", next=" + this.next + ")";
    }
}
