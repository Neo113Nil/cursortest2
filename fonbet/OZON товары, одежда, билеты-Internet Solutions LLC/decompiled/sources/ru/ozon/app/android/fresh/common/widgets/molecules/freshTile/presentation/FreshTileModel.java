package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u00016J=\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "newActionBarVO", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "newProductMediaVO", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "newFavoriteButton", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "newActionBarVOV2", "copy", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "", "getId", "()J", "id", "getWidgetId", "widgetId", "getProductMedia", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "productMedia", "getActionBar", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "actionBar", "getActionBarV2", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "actionBarV2", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtomList", "()Ljava/util/List;", "atomList", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadgeList", "badgeList", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "paddings", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "tokenizedEvent", "getFavoriteButton", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeVO;", "favoriteButton", "", "getAutomatizationId", "()Ljava/lang/String;", "automatizationId", "PaddingsVO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FreshTileModel {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ FreshTileModel copy$default(FreshTileModel freshTileModel, ProductActionBarVO productActionBarVO, ProductMediaVO productMediaVO, FreshFavoriteMoleculeVO freshFavoriteMoleculeVO, ProductActionBarVOV2 productActionBarVOV2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
            }
            if ((i11 & 1) != 0) {
                productActionBarVO = freshTileModel.getActionBar();
            }
            if ((i11 & 2) != 0) {
                productMediaVO = freshTileModel.getProductMedia();
            }
            if ((i11 & 4) != 0) {
                freshFavoriteMoleculeVO = freshTileModel.getFavoriteButton();
            }
            if ((i11 & 8) != 0) {
                productActionBarVOV2 = freshTileModel.getActionBarV2();
            }
            return freshTileModel.copy(productActionBarVO, productMediaVO, freshFavoriteMoleculeVO, productActionBarVOV2);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel$PaddingsVO;", "", "", "top", "bottom", "left", "right", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class PaddingsVO {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        public PaddingsVO(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.bottom = i12;
            this.left = i13;
            this.right = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsVO)) {
                return false;
            }
            PaddingsVO paddingsVO = (PaddingsVO) other;
            return this.top == paddingsVO.top && this.bottom == paddingsVO.bottom && this.left == paddingsVO.left && this.right == paddingsVO.right;
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
            return Integer.hashCode(this.right) + C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.left, this.right, ", right=", ")", C2438a.a("PaddingsVO(top=", this.top, ", bottom=", ", left=", this.bottom));
        }
    }

    @NotNull
    FreshTileModel copy(ProductActionBarVO newActionBarVO, @NotNull ProductMediaVO newProductMediaVO, FreshFavoriteMoleculeVO newFavoriteButton, ProductActionBarVOV2 newActionBarVOV2);

    ProductActionBarVO getActionBar();

    ProductActionBarVOV2 getActionBarV2();

    @NotNull
    List<AtomDTO> getAtomList();

    String getAutomatizationId();

    @NotNull
    List<BadgeDTO> getBadgeList();

    AtomAction getClickAction();

    FreshFavoriteMoleculeVO getFavoriteButton();

    long getId();

    @NotNull
    PaddingsVO getPaddings();

    @NotNull
    ProductMediaVO getProductMedia();

    t getTokenizedEvent();

    long getWidgetId();
}
