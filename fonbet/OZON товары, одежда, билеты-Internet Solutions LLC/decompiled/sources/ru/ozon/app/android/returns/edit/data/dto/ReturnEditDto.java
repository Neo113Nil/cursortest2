package ru.ozon.app.android.returns.edit.data.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/edit/data/dto/ReturnEditDto;", "", "textEditBlock", "Lru/ozon/app/android/returns/edit/data/dto/ReturnTextEditBlockDto;", "imageEditBlock", "Lru/ozon/app/android/returns/edit/data/dto/ReturnImageEditBlockDto;", "sticky", "Lru/ozon/app/android/returns/edit/data/dto/ReturnEditStickyDto;", "<init>", "(Lru/ozon/app/android/returns/edit/data/dto/ReturnTextEditBlockDto;Lru/ozon/app/android/returns/edit/data/dto/ReturnImageEditBlockDto;Lru/ozon/app/android/returns/edit/data/dto/ReturnEditStickyDto;)V", "getTextEditBlock", "()Lru/ozon/app/android/returns/edit/data/dto/ReturnTextEditBlockDto;", "getImageEditBlock", "()Lru/ozon/app/android/returns/edit/data/dto/ReturnImageEditBlockDto;", "getSticky", "()Lru/ozon/app/android/returns/edit/data/dto/ReturnEditStickyDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnEditDto {
    public static final int $stable = 8;
    private final ReturnImageEditBlockDto imageEditBlock;

    @NotNull
    private final ReturnEditStickyDto sticky;

    @NotNull
    private final ReturnTextEditBlockDto textEditBlock;

    public ReturnEditDto(@NotNull ReturnTextEditBlockDto textEditBlock, ReturnImageEditBlockDto returnImageEditBlockDto, @NotNull ReturnEditStickyDto sticky) {
        Intrinsics.checkNotNullParameter(textEditBlock, "textEditBlock");
        Intrinsics.checkNotNullParameter(sticky, "sticky");
        this.textEditBlock = textEditBlock;
        this.imageEditBlock = returnImageEditBlockDto;
        this.sticky = sticky;
    }

    public static /* synthetic */ ReturnEditDto copy$default(ReturnEditDto returnEditDto, ReturnTextEditBlockDto returnTextEditBlockDto, ReturnImageEditBlockDto returnImageEditBlockDto, ReturnEditStickyDto returnEditStickyDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            returnTextEditBlockDto = returnEditDto.textEditBlock;
        }
        if ((i11 & 2) != 0) {
            returnImageEditBlockDto = returnEditDto.imageEditBlock;
        }
        if ((i11 & 4) != 0) {
            returnEditStickyDto = returnEditDto.sticky;
        }
        return returnEditDto.copy(returnTextEditBlockDto, returnImageEditBlockDto, returnEditStickyDto);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ReturnTextEditBlockDto getTextEditBlock() {
        return this.textEditBlock;
    }

    /* renamed from: component2, reason: from getter */
    public final ReturnImageEditBlockDto getImageEditBlock() {
        return this.imageEditBlock;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ReturnEditStickyDto getSticky() {
        return this.sticky;
    }

    @NotNull
    public final ReturnEditDto copy(@NotNull ReturnTextEditBlockDto textEditBlock, ReturnImageEditBlockDto imageEditBlock, @NotNull ReturnEditStickyDto sticky) {
        Intrinsics.checkNotNullParameter(textEditBlock, "textEditBlock");
        Intrinsics.checkNotNullParameter(sticky, "sticky");
        return new ReturnEditDto(textEditBlock, imageEditBlock, sticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnEditDto)) {
            return false;
        }
        ReturnEditDto returnEditDto = (ReturnEditDto) other;
        return Intrinsics.d(this.textEditBlock, returnEditDto.textEditBlock) && Intrinsics.d(this.imageEditBlock, returnEditDto.imageEditBlock) && Intrinsics.d(this.sticky, returnEditDto.sticky);
    }

    public final ReturnImageEditBlockDto getImageEditBlock() {
        return this.imageEditBlock;
    }

    @NotNull
    public final ReturnEditStickyDto getSticky() {
        return this.sticky;
    }

    @NotNull
    public final ReturnTextEditBlockDto getTextEditBlock() {
        return this.textEditBlock;
    }

    public int hashCode() {
        int hashCode = this.textEditBlock.hashCode() * 31;
        ReturnImageEditBlockDto returnImageEditBlockDto = this.imageEditBlock;
        return this.sticky.hashCode() + ((hashCode + (returnImageEditBlockDto == null ? 0 : returnImageEditBlockDto.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnEditDto(textEditBlock=" + this.textEditBlock + ", imageEditBlock=" + this.imageEditBlock + ", sticky=" + this.sticky + ")";
    }
}
