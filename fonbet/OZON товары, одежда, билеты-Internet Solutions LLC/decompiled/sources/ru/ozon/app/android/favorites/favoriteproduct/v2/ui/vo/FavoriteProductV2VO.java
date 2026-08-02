package ru.ozon.app.android.favorites.favoriteproduct.v2.ui.vo;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO$Margins;", "margins", "<init>", "(JLru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO$Margins;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getMolecule", "()Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO$Margins;", "getMargins", "()Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO$Margins;", "Margins", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FavoriteProductV2VO implements c {
    private final long id;

    @NotNull
    private final Margins margins;

    @NotNull
    private final FavoriteProductModel molecule;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO$Margins;", "", "", "top", "left", "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getLeft", "getRight", "getBottom", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Margins {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public Margins(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.left = i12;
            this.right = i13;
            this.bottom = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Margins)) {
                return false;
            }
            Margins margins = (Margins) other;
            return this.top == margins.top && this.left == margins.left && this.right == margins.right && this.bottom == margins.bottom;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottom) + C2454a.a(this.right, C2454a.a(this.left, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.right, this.bottom, ", bottom=", ")", C2438a.a("Margins(top=", this.top, ", left=", ", right=", this.left));
        }
    }

    public FavoriteProductV2VO(long j11, @NotNull FavoriteProductModel molecule, @NotNull Margins margins) {
        Intrinsics.checkNotNullParameter(molecule, "molecule");
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.id = j11;
        this.molecule = molecule;
        this.margins = margins;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteProductV2VO)) {
            return false;
        }
        FavoriteProductV2VO favoriteProductV2VO = (FavoriteProductV2VO) other;
        return this.id == favoriteProductV2VO.id && Intrinsics.d(this.molecule, favoriteProductV2VO.molecule) && Intrinsics.d(this.margins, favoriteProductV2VO.margins);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final Margins getMargins() {
        return this.margins;
    }

    @NotNull
    public final FavoriteProductModel getMolecule() {
        return this.molecule;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.margins.hashCode() + ((this.molecule.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FavoriteProductV2VO(id=" + this.id + ", molecule=" + this.molecule + ", margins=" + this.margins + ")";
    }
}
