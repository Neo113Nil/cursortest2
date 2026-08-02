package ru.ozon.app.android.returns.common.data.dto;

import Fj.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB7\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "", "itemPhotos", "", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto$ItemPhoto;", "amountDetailing", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$TableRowListElement;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "getItemPhotos", "()Ljava/util/List;", "getAmountDetailing", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ItemPhoto", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnTotalDto {
    public static final int $stable = 8;
    private final List<ListElementAtom.TableRowListElement> amountDetailing;
    private final DisclaimerAtom disclaimer;
    private final List<ItemPhoto> itemPhotos;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto$ItemPhoto;", "", "hint", "", "itemImage", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;)V", "getHint", "()Ljava/lang/String;", "getItemImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemPhoto {
        public static final int $stable = ImageDTO.$stable;

        @NotNull
        private final String hint;

        @NotNull
        private final ImageDTO itemImage;

        public ItemPhoto(@i(name = "hint") @NotNull String hint, @NotNull ImageDTO itemImage) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(itemImage, "itemImage");
            this.hint = hint;
            this.itemImage = itemImage;
        }

        public static /* synthetic */ ItemPhoto copy$default(ItemPhoto itemPhoto, String str, ImageDTO imageDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = itemPhoto.hint;
            }
            if ((i11 & 2) != 0) {
                imageDTO = itemPhoto.itemImage;
            }
            return itemPhoto.copy(str, imageDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getHint() {
            return this.hint;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ImageDTO getItemImage() {
            return this.itemImage;
        }

        @NotNull
        public final ItemPhoto copy(@i(name = "hint") @NotNull String hint, @NotNull ImageDTO itemImage) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(itemImage, "itemImage");
            return new ItemPhoto(hint, itemImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemPhoto)) {
                return false;
            }
            ItemPhoto itemPhoto = (ItemPhoto) other;
            return Intrinsics.d(this.hint, itemPhoto.hint) && Intrinsics.d(this.itemImage, itemPhoto.itemImage);
        }

        @NotNull
        public final String getHint() {
            return this.hint;
        }

        @NotNull
        public final ImageDTO getItemImage() {
            return this.itemImage;
        }

        public int hashCode() {
            return this.itemImage.hashCode() + (this.hint.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ItemPhoto(hint=" + this.hint + ", itemImage=" + this.itemImage + ")";
        }
    }

    public ReturnTotalDto(@i(name = "itemPhotos") List<ItemPhoto> list, @i(name = "amountDetailing") List<ListElementAtom.TableRowListElement> list2, @i(name = "disclaimer") DisclaimerAtom disclaimerAtom) {
        this.itemPhotos = list;
        this.amountDetailing = list2;
        this.disclaimer = disclaimerAtom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnTotalDto copy$default(ReturnTotalDto returnTotalDto, List list, List list2, DisclaimerAtom disclaimerAtom, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = returnTotalDto.itemPhotos;
        }
        if ((i11 & 2) != 0) {
            list2 = returnTotalDto.amountDetailing;
        }
        if ((i11 & 4) != 0) {
            disclaimerAtom = returnTotalDto.disclaimer;
        }
        return returnTotalDto.copy(list, list2, disclaimerAtom);
    }

    public final List<ItemPhoto> component1() {
        return this.itemPhotos;
    }

    public final List<ListElementAtom.TableRowListElement> component2() {
        return this.amountDetailing;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final ReturnTotalDto copy(@i(name = "itemPhotos") List<ItemPhoto> itemPhotos, @i(name = "amountDetailing") List<ListElementAtom.TableRowListElement> amountDetailing, @i(name = "disclaimer") DisclaimerAtom disclaimer) {
        return new ReturnTotalDto(itemPhotos, amountDetailing, disclaimer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnTotalDto)) {
            return false;
        }
        ReturnTotalDto returnTotalDto = (ReturnTotalDto) other;
        return Intrinsics.d(this.itemPhotos, returnTotalDto.itemPhotos) && Intrinsics.d(this.amountDetailing, returnTotalDto.amountDetailing) && Intrinsics.d(this.disclaimer, returnTotalDto.disclaimer);
    }

    public final List<ListElementAtom.TableRowListElement> getAmountDetailing() {
        return this.amountDetailing;
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    public final List<ItemPhoto> getItemPhotos() {
        return this.itemPhotos;
    }

    public int hashCode() {
        List<ItemPhoto> list = this.itemPhotos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ListElementAtom.TableRowListElement> list2 = this.amountDetailing;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        return hashCode2 + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ItemPhoto> list = this.itemPhotos;
        List<ListElementAtom.TableRowListElement> list2 = this.amountDetailing;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        StringBuilder d11 = c.d("ReturnTotalDto(itemPhotos=", list, ", amountDetailing=", ", disclaimer=", list2);
        d11.append(disclaimerAtom);
        d11.append(")");
        return d11.toString();
    }
}
