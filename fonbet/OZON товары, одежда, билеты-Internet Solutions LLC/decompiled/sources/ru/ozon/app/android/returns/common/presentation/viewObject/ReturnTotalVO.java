package ru.ozon.app.android.returns.common.presentation.viewObject;

import Fj.c;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO;", "", "", "Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO$ItemPhoto;", "itemPhotos", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$TableRowListElement;", "amountDetailing", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItemPhotos", "()Ljava/util/List;", "getAmountDetailing", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "ItemPhoto", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnTotalVO {

    @NotNull
    private final List<ListElementAtom.TableRowListElement> amountDetailing;
    private final DisclaimerAtom disclaimer;
    private final List<ItemPhoto> itemPhotos;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO$ItemPhoto;", "", "", "hint", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "image", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHint", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "getImage", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemPhoto {
        public static final int $stable = ImageVO.$stable;

        @NotNull
        private final String hint;

        @NotNull
        private final ImageVO image;

        public ItemPhoto(@NotNull String hint, @NotNull ImageVO image) {
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(image, "image");
            this.hint = hint;
            this.image = image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemPhoto)) {
                return false;
            }
            ItemPhoto itemPhoto = (ItemPhoto) other;
            return Intrinsics.d(this.hint, itemPhoto.hint) && Intrinsics.d(this.image, itemPhoto.image);
        }

        @NotNull
        public final ImageVO getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.image.hashCode() + (this.hint.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ItemPhoto(hint=" + this.hint + ", image=" + this.image + ")";
        }
    }

    public ReturnTotalVO(List<ItemPhoto> list, @NotNull List<ListElementAtom.TableRowListElement> amountDetailing, DisclaimerAtom disclaimerAtom) {
        Intrinsics.checkNotNullParameter(amountDetailing, "amountDetailing");
        this.itemPhotos = list;
        this.amountDetailing = amountDetailing;
        this.disclaimer = disclaimerAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnTotalVO)) {
            return false;
        }
        ReturnTotalVO returnTotalVO = (ReturnTotalVO) other;
        return Intrinsics.d(this.itemPhotos, returnTotalVO.itemPhotos) && Intrinsics.d(this.amountDetailing, returnTotalVO.amountDetailing) && Intrinsics.d(this.disclaimer, returnTotalVO.disclaimer);
    }

    @NotNull
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
        int b11 = g.b((list == null ? 0 : list.hashCode()) * 31, 31, this.amountDetailing);
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        return b11 + (disclaimerAtom != null ? disclaimerAtom.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ItemPhoto> list = this.itemPhotos;
        List<ListElementAtom.TableRowListElement> list2 = this.amountDetailing;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        StringBuilder d11 = c.d("ReturnTotalVO(itemPhotos=", list, ", amountDetailing=", ", disclaimer=", list2);
        d11.append(disclaimerAtom);
        d11.append(")");
        return d11.toString();
    }
}
