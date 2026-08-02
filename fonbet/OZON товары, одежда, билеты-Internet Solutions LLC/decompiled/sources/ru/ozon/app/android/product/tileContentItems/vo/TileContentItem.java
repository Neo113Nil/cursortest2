package ru.ozon.app.android.product.tileContentItems.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.labelList.presentation.vo.LabelListVO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "", "Atom", "LabelListV2", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem$Atom;", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem$LabelListV2;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileContentItem {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem$Atom;", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Atom implements TileContentItem {

        @NotNull
        private final AtomDTO atom;

        public Atom(@NotNull AtomDTO atom) {
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.atom = atom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Atom) && Intrinsics.d(this.atom, ((Atom) other).atom);
        }

        @NotNull
        public final AtomDTO getAtom() {
            return this.atom;
        }

        public int hashCode() {
            return this.atom.hashCode();
        }

        @NotNull
        public String toString() {
            return "Atom(atom=" + this.atom + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem$LabelListV2;", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "labelList", "<init>", "(Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "getLabelList", "()Lru/ozon/app/android/product/labelList/presentation/vo/LabelListVO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LabelListV2 implements TileContentItem {

        @NotNull
        private final LabelListVO labelList;

        public LabelListV2(@NotNull LabelListVO labelList) {
            Intrinsics.checkNotNullParameter(labelList, "labelList");
            this.labelList = labelList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LabelListV2) && Intrinsics.d(this.labelList, ((LabelListV2) other).labelList);
        }

        @NotNull
        public final LabelListVO getLabelList() {
            return this.labelList;
        }

        public int hashCode() {
            return this.labelList.hashCode();
        }

        @NotNull
        public String toString() {
            return "LabelListV2(labelList=" + this.labelList + ")";
        }
    }
}
