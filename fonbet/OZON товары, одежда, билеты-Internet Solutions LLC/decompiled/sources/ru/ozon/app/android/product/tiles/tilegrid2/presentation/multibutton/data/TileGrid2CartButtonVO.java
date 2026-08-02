package ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data;

import B0.C2454a;
import E0.C2942q;
import G.g;
import P4.f;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.tiles.tilegrid2.domain.wishlist.WishlistTileKey;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2ButtonsVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.selections.subscriber.SelectionProductsTileKey;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2DTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ButtonsVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "getWishlistKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "wishlistKey", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "getSelectionKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "selectionKey", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "getOverlayItem", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "TileGrid2CartButtonSingleVO", "TileGrid2SingleCartContainerVO", "TileGrid2DoubleCartButtonVO", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO$TileGrid2CartButtonSingleVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO$TileGrid2DoubleCartButtonVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO$TileGrid2SingleCartContainerVO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileGrid2CartButtonVO extends TileGrid2ButtonsVO {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull TileGrid2CartButtonVO tileGrid2CartButtonVO) {
            return TileGrid2ButtonsVO.DefaultImpls.getScrollWidgetKey(tileGrid2CartButtonVO);
        }

        public static int getViewItemKey(@NotNull TileGrid2CartButtonVO tileGrid2CartButtonVO) {
            return TileGrid2ButtonsVO.DefaultImpls.getViewItemKey(tileGrid2CartButtonVO);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b4\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b=\u0010$¨\u0006>"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO$TileGrid2CartButtonSingleVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO;", "", "id", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;", "firstButton", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "wishlistKey", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "selectionKey", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "rootTileWidgetId", "", "accesibilityTileID", "", "index", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "relatedProductsCurtain", "tileId", "tileWidgetId", "<init>", "(JLru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/product/common/TileThemeConfigVO;JLjava/lang/String;ILru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;", "getFirstButton", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "getWishlistKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "getSelectionKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "getOverlayItem", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTheme", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getRootTileWidgetId", "Ljava/lang/String;", "getAccesibilityTileID", "I", "getIndex", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "getRelatedProductsCurtain", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "getTileId", "getTileWidgetId", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileGrid2CartButtonSingleVO implements TileGrid2CartButtonVO {

        @NotNull
        private final String accesibilityTileID;

        @NotNull
        private final AddToCartMultiButtonModel firstButton;
        private final long id;
        private final int index;
        private final TileGrid2DTO.OverlayItem overlayItem;
        private final TileRelatedProductsCurtainVO relatedProductsCurtain;
        private final long rootTileWidgetId;
        private final SelectionProductsTileKey selectionKey;

        @NotNull
        private final TileThemeConfigVO theme;

        @NotNull
        private final String tileId;
        private final long tileWidgetId;
        private final WishlistTileKey wishlistKey;

        public TileGrid2CartButtonSingleVO(long j11, @NotNull AddToCartMultiButtonModel firstButton, WishlistTileKey wishlistTileKey, SelectionProductsTileKey selectionProductsTileKey, TileGrid2DTO.OverlayItem overlayItem, @NotNull TileThemeConfigVO theme, long j12, @NotNull String accesibilityTileID, int i11, TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO, @NotNull String tileId, long j13) {
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(accesibilityTileID, "accesibilityTileID");
            Intrinsics.checkNotNullParameter(tileId, "tileId");
            this.id = j11;
            this.firstButton = firstButton;
            this.wishlistKey = wishlistTileKey;
            this.selectionKey = selectionProductsTileKey;
            this.overlayItem = overlayItem;
            this.theme = theme;
            this.rootTileWidgetId = j12;
            this.accesibilityTileID = accesibilityTileID;
            this.index = i11;
            this.relatedProductsCurtain = tileRelatedProductsCurtainVO;
            this.tileId = tileId;
            this.tileWidgetId = j13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileGrid2CartButtonSingleVO)) {
                return false;
            }
            TileGrid2CartButtonSingleVO tileGrid2CartButtonSingleVO = (TileGrid2CartButtonSingleVO) other;
            return this.id == tileGrid2CartButtonSingleVO.id && Intrinsics.d(this.firstButton, tileGrid2CartButtonSingleVO.firstButton) && Intrinsics.d(this.wishlistKey, tileGrid2CartButtonSingleVO.wishlistKey) && Intrinsics.d(this.selectionKey, tileGrid2CartButtonSingleVO.selectionKey) && Intrinsics.d(this.overlayItem, tileGrid2CartButtonSingleVO.overlayItem) && Intrinsics.d(this.theme, tileGrid2CartButtonSingleVO.theme) && this.rootTileWidgetId == tileGrid2CartButtonSingleVO.rootTileWidgetId && Intrinsics.d(this.accesibilityTileID, tileGrid2CartButtonSingleVO.accesibilityTileID) && this.index == tileGrid2CartButtonSingleVO.index && Intrinsics.d(this.relatedProductsCurtain, tileGrid2CartButtonSingleVO.relatedProductsCurtain) && Intrinsics.d(this.tileId, tileGrid2CartButtonSingleVO.tileId) && this.tileWidgetId == tileGrid2CartButtonSingleVO.tileWidgetId;
        }

        @NotNull
        public final String getAccesibilityTileID() {
            return this.accesibilityTileID;
        }

        @NotNull
        public AddToCartMultiButtonModel getFirstButton() {
            return this.firstButton;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public TileGrid2DTO.OverlayItem getOverlayItem() {
            return this.overlayItem;
        }

        public final TileRelatedProductsCurtainVO getRelatedProductsCurtain() {
            return this.relatedProductsCurtain;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public SelectionProductsTileKey getSelectionKey() {
            return this.selectionKey;
        }

        @NotNull
        public TileThemeConfigVO getTheme() {
            return this.theme;
        }

        @NotNull
        public final String getTileId() {
            return this.tileId;
        }

        public final long getTileWidgetId() {
            return this.tileWidgetId;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public WishlistTileKey getWishlistKey() {
            return this.wishlistKey;
        }

        public int hashCode() {
            int hashCode = (this.firstButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
            WishlistTileKey wishlistTileKey = this.wishlistKey;
            int hashCode2 = (hashCode + (wishlistTileKey == null ? 0 : wishlistTileKey.hashCode())) * 31;
            SelectionProductsTileKey selectionProductsTileKey = this.selectionKey;
            int hashCode3 = (hashCode2 + (selectionProductsTileKey == null ? 0 : selectionProductsTileKey.hashCode())) * 31;
            TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
            int a11 = C2454a.a(this.index, g.a(c.a((this.theme.hashCode() + ((hashCode3 + (overlayItem == null ? 0 : overlayItem.hashCode())) * 31)) * 31, 31, this.rootTileWidgetId), 31, this.accesibilityTileID), 31);
            TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO = this.relatedProductsCurtain;
            return Long.hashCode(this.tileWidgetId) + g.a((a11 + (tileRelatedProductsCurtainVO != null ? tileRelatedProductsCurtainVO.hashCode() : 0)) * 31, 31, this.tileId);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            AddToCartMultiButtonModel addToCartMultiButtonModel = this.firstButton;
            WishlistTileKey wishlistTileKey = this.wishlistKey;
            SelectionProductsTileKey selectionProductsTileKey = this.selectionKey;
            TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
            TileThemeConfigVO tileThemeConfigVO = this.theme;
            long j12 = this.rootTileWidgetId;
            String str = this.accesibilityTileID;
            int i11 = this.index;
            TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO = this.relatedProductsCurtain;
            String str2 = this.tileId;
            long j13 = this.tileWidgetId;
            StringBuilder sb2 = new StringBuilder("TileGrid2CartButtonSingleVO(id=");
            sb2.append(j11);
            sb2.append(", firstButton=");
            sb2.append(addToCartMultiButtonModel);
            sb2.append(", wishlistKey=");
            sb2.append(wishlistTileKey);
            sb2.append(", selectionKey=");
            sb2.append(selectionProductsTileKey);
            sb2.append(", overlayItem=");
            sb2.append(overlayItem);
            sb2.append(", theme=");
            sb2.append(tileThemeConfigVO);
            C2942q.f(sb2, ", rootTileWidgetId=", j12, ", accesibilityTileID=");
            Pk0.g.d(i11, str, ", index=", ", relatedProductsCurtain=", sb2);
            sb2.append(tileRelatedProductsCurtainVO);
            sb2.append(", tileId=");
            sb2.append(str2);
            sb2.append(", tileWidgetId=");
            return f.a(j13, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b5\u0010%R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u0010\u001bR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b:\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b>\u0010\u001bR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b?\u0010%¨\u0006@"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO$TileGrid2DoubleCartButtonVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO;", "", "id", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;", "firstButton", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "wishlistKey", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "selectionKey", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "rootTileWidgetId", "", "accesibilityTileID", "", "index", "secondButton", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "relatedProductsCurtain", "tileId", "tileWidgetId", "<init>", "(JLru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/product/common/TileThemeConfigVO;JLjava/lang/String;ILru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;", "getFirstButton", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartMultiButtonModel;", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "getWishlistKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "getSelectionKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "getOverlayItem", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTheme", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getRootTileWidgetId", "Ljava/lang/String;", "getAccesibilityTileID", "I", "getIndex", "getSecondButton", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "getRelatedProductsCurtain", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "getTileId", "getTileWidgetId", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileGrid2DoubleCartButtonVO implements TileGrid2CartButtonVO {

        @NotNull
        private final String accesibilityTileID;

        @NotNull
        private final AddToCartMultiButtonModel firstButton;
        private final long id;
        private final int index;
        private final TileGrid2DTO.OverlayItem overlayItem;
        private final TileRelatedProductsCurtainVO relatedProductsCurtain;
        private final long rootTileWidgetId;

        @NotNull
        private final AddToCartMultiButtonModel secondButton;
        private final SelectionProductsTileKey selectionKey;

        @NotNull
        private final TileThemeConfigVO theme;

        @NotNull
        private final String tileId;
        private final long tileWidgetId;
        private final WishlistTileKey wishlistKey;

        public TileGrid2DoubleCartButtonVO(long j11, @NotNull AddToCartMultiButtonModel firstButton, WishlistTileKey wishlistTileKey, SelectionProductsTileKey selectionProductsTileKey, TileGrid2DTO.OverlayItem overlayItem, @NotNull TileThemeConfigVO theme, long j12, @NotNull String accesibilityTileID, int i11, @NotNull AddToCartMultiButtonModel secondButton, TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO, @NotNull String tileId, long j13) {
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(accesibilityTileID, "accesibilityTileID");
            Intrinsics.checkNotNullParameter(secondButton, "secondButton");
            Intrinsics.checkNotNullParameter(tileId, "tileId");
            this.id = j11;
            this.firstButton = firstButton;
            this.wishlistKey = wishlistTileKey;
            this.selectionKey = selectionProductsTileKey;
            this.overlayItem = overlayItem;
            this.theme = theme;
            this.rootTileWidgetId = j12;
            this.accesibilityTileID = accesibilityTileID;
            this.index = i11;
            this.secondButton = secondButton;
            this.relatedProductsCurtain = tileRelatedProductsCurtainVO;
            this.tileId = tileId;
            this.tileWidgetId = j13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileGrid2DoubleCartButtonVO)) {
                return false;
            }
            TileGrid2DoubleCartButtonVO tileGrid2DoubleCartButtonVO = (TileGrid2DoubleCartButtonVO) other;
            return this.id == tileGrid2DoubleCartButtonVO.id && Intrinsics.d(this.firstButton, tileGrid2DoubleCartButtonVO.firstButton) && Intrinsics.d(this.wishlistKey, tileGrid2DoubleCartButtonVO.wishlistKey) && Intrinsics.d(this.selectionKey, tileGrid2DoubleCartButtonVO.selectionKey) && Intrinsics.d(this.overlayItem, tileGrid2DoubleCartButtonVO.overlayItem) && Intrinsics.d(this.theme, tileGrid2DoubleCartButtonVO.theme) && this.rootTileWidgetId == tileGrid2DoubleCartButtonVO.rootTileWidgetId && Intrinsics.d(this.accesibilityTileID, tileGrid2DoubleCartButtonVO.accesibilityTileID) && this.index == tileGrid2DoubleCartButtonVO.index && Intrinsics.d(this.secondButton, tileGrid2DoubleCartButtonVO.secondButton) && Intrinsics.d(this.relatedProductsCurtain, tileGrid2DoubleCartButtonVO.relatedProductsCurtain) && Intrinsics.d(this.tileId, tileGrid2DoubleCartButtonVO.tileId) && this.tileWidgetId == tileGrid2DoubleCartButtonVO.tileWidgetId;
        }

        @NotNull
        public final String getAccesibilityTileID() {
            return this.accesibilityTileID;
        }

        @NotNull
        public AddToCartMultiButtonModel getFirstButton() {
            return this.firstButton;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public TileGrid2DTO.OverlayItem getOverlayItem() {
            return this.overlayItem;
        }

        public final TileRelatedProductsCurtainVO getRelatedProductsCurtain() {
            return this.relatedProductsCurtain;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @NotNull
        public final AddToCartMultiButtonModel getSecondButton() {
            return this.secondButton;
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public SelectionProductsTileKey getSelectionKey() {
            return this.selectionKey;
        }

        @NotNull
        public TileThemeConfigVO getTheme() {
            return this.theme;
        }

        @NotNull
        public final String getTileId() {
            return this.tileId;
        }

        public final long getTileWidgetId() {
            return this.tileWidgetId;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public WishlistTileKey getWishlistKey() {
            return this.wishlistKey;
        }

        public int hashCode() {
            int hashCode = (this.firstButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
            WishlistTileKey wishlistTileKey = this.wishlistKey;
            int hashCode2 = (hashCode + (wishlistTileKey == null ? 0 : wishlistTileKey.hashCode())) * 31;
            SelectionProductsTileKey selectionProductsTileKey = this.selectionKey;
            int hashCode3 = (hashCode2 + (selectionProductsTileKey == null ? 0 : selectionProductsTileKey.hashCode())) * 31;
            TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
            int hashCode4 = (this.secondButton.hashCode() + C2454a.a(this.index, g.a(c.a((this.theme.hashCode() + ((hashCode3 + (overlayItem == null ? 0 : overlayItem.hashCode())) * 31)) * 31, 31, this.rootTileWidgetId), 31, this.accesibilityTileID), 31)) * 31;
            TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO = this.relatedProductsCurtain;
            return Long.hashCode(this.tileWidgetId) + g.a((hashCode4 + (tileRelatedProductsCurtainVO != null ? tileRelatedProductsCurtainVO.hashCode() : 0)) * 31, 31, this.tileId);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            AddToCartMultiButtonModel addToCartMultiButtonModel = this.firstButton;
            WishlistTileKey wishlistTileKey = this.wishlistKey;
            SelectionProductsTileKey selectionProductsTileKey = this.selectionKey;
            TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
            TileThemeConfigVO tileThemeConfigVO = this.theme;
            long j12 = this.rootTileWidgetId;
            String str = this.accesibilityTileID;
            int i11 = this.index;
            AddToCartMultiButtonModel addToCartMultiButtonModel2 = this.secondButton;
            TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO = this.relatedProductsCurtain;
            String str2 = this.tileId;
            long j13 = this.tileWidgetId;
            StringBuilder sb2 = new StringBuilder("TileGrid2DoubleCartButtonVO(id=");
            sb2.append(j11);
            sb2.append(", firstButton=");
            sb2.append(addToCartMultiButtonModel);
            sb2.append(", wishlistKey=");
            sb2.append(wishlistTileKey);
            sb2.append(", selectionKey=");
            sb2.append(selectionProductsTileKey);
            sb2.append(", overlayItem=");
            sb2.append(overlayItem);
            sb2.append(", theme=");
            sb2.append(tileThemeConfigVO);
            C2942q.f(sb2, ", rootTileWidgetId=", j12, ", accesibilityTileID=");
            Pk0.g.d(i11, str, ", index=", ", secondButton=", sb2);
            sb2.append(addToCartMultiButtonModel2);
            sb2.append(", relatedProductsCurtain=");
            sb2.append(tileRelatedProductsCurtainVO);
            sb2.append(", tileId=");
            sb2.append(str2);
            sb2.append(", tileWidgetId=");
            sb2.append(j13);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b4\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u0010\u001cR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b=\u0010$¨\u0006>"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO$TileGrid2SingleCartContainerVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2CartButtonVO;", "", "id", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartContainerMultiButtonModel;", "firstButton", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "wishlistKey", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "selectionKey", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "overlayItem", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "rootTileWidgetId", "", "accesibilityTileID", "", "index", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "relatedProductsCurtain", "tileId", "tileWidgetId", "<init>", "(JLru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartContainerMultiButtonModel;Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Lru/ozon/app/android/product/common/TileThemeConfigVO;JLjava/lang/String;ILru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartContainerMultiButtonModel;", "getFirstButton", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/AddToCartContainerMultiButtonModel;", "Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "getWishlistKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/domain/wishlist/WishlistTileKey;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "getSelectionKey", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/selections/subscriber/SelectionProductsTileKey;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "getOverlayItem", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getTheme", "()Lru/ozon/app/android/product/common/TileThemeConfigVO;", "getRootTileWidgetId", "Ljava/lang/String;", "getAccesibilityTileID", "I", "getIndex", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "getRelatedProductsCurtain", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileRelatedProductsCurtainVO;", "getTileId", "getTileWidgetId", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileGrid2SingleCartContainerVO implements TileGrid2CartButtonVO {

        @NotNull
        private final String accesibilityTileID;

        @NotNull
        private final AddToCartContainerMultiButtonModel firstButton;
        private final long id;
        private final int index;
        private final TileGrid2DTO.OverlayItem overlayItem;
        private final TileRelatedProductsCurtainVO relatedProductsCurtain;
        private final long rootTileWidgetId;
        private final SelectionProductsTileKey selectionKey;

        @NotNull
        private final TileThemeConfigVO theme;

        @NotNull
        private final String tileId;
        private final long tileWidgetId;
        private final WishlistTileKey wishlistKey;

        public TileGrid2SingleCartContainerVO(long j11, @NotNull AddToCartContainerMultiButtonModel firstButton, WishlistTileKey wishlistTileKey, SelectionProductsTileKey selectionProductsTileKey, TileGrid2DTO.OverlayItem overlayItem, @NotNull TileThemeConfigVO theme, long j12, @NotNull String accesibilityTileID, int i11, TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO, @NotNull String tileId, long j13) {
            Intrinsics.checkNotNullParameter(firstButton, "firstButton");
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(accesibilityTileID, "accesibilityTileID");
            Intrinsics.checkNotNullParameter(tileId, "tileId");
            this.id = j11;
            this.firstButton = firstButton;
            this.wishlistKey = wishlistTileKey;
            this.selectionKey = selectionProductsTileKey;
            this.overlayItem = overlayItem;
            this.theme = theme;
            this.rootTileWidgetId = j12;
            this.accesibilityTileID = accesibilityTileID;
            this.index = i11;
            this.relatedProductsCurtain = tileRelatedProductsCurtainVO;
            this.tileId = tileId;
            this.tileWidgetId = j13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileGrid2SingleCartContainerVO)) {
                return false;
            }
            TileGrid2SingleCartContainerVO tileGrid2SingleCartContainerVO = (TileGrid2SingleCartContainerVO) other;
            return this.id == tileGrid2SingleCartContainerVO.id && Intrinsics.d(this.firstButton, tileGrid2SingleCartContainerVO.firstButton) && Intrinsics.d(this.wishlistKey, tileGrid2SingleCartContainerVO.wishlistKey) && Intrinsics.d(this.selectionKey, tileGrid2SingleCartContainerVO.selectionKey) && Intrinsics.d(this.overlayItem, tileGrid2SingleCartContainerVO.overlayItem) && Intrinsics.d(this.theme, tileGrid2SingleCartContainerVO.theme) && this.rootTileWidgetId == tileGrid2SingleCartContainerVO.rootTileWidgetId && Intrinsics.d(this.accesibilityTileID, tileGrid2SingleCartContainerVO.accesibilityTileID) && this.index == tileGrid2SingleCartContainerVO.index && Intrinsics.d(this.relatedProductsCurtain, tileGrid2SingleCartContainerVO.relatedProductsCurtain) && Intrinsics.d(this.tileId, tileGrid2SingleCartContainerVO.tileId) && this.tileWidgetId == tileGrid2SingleCartContainerVO.tileWidgetId;
        }

        @NotNull
        public final String getAccesibilityTileID() {
            return this.accesibilityTileID;
        }

        @NotNull
        public AddToCartContainerMultiButtonModel getFirstButton() {
            return this.firstButton;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public TileGrid2DTO.OverlayItem getOverlayItem() {
            return this.overlayItem;
        }

        public final TileRelatedProductsCurtainVO getRelatedProductsCurtain() {
            return this.relatedProductsCurtain;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public SelectionProductsTileKey getSelectionKey() {
            return this.selectionKey;
        }

        @NotNull
        public TileThemeConfigVO getTheme() {
            return this.theme;
        }

        @NotNull
        public final String getTileId() {
            return this.tileId;
        }

        public final long getTileWidgetId() {
            return this.tileWidgetId;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2CartButtonVO
        public WishlistTileKey getWishlistKey() {
            return this.wishlistKey;
        }

        public int hashCode() {
            int hashCode = (this.firstButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
            WishlistTileKey wishlistTileKey = this.wishlistKey;
            int hashCode2 = (hashCode + (wishlistTileKey == null ? 0 : wishlistTileKey.hashCode())) * 31;
            SelectionProductsTileKey selectionProductsTileKey = this.selectionKey;
            int hashCode3 = (hashCode2 + (selectionProductsTileKey == null ? 0 : selectionProductsTileKey.hashCode())) * 31;
            TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
            int a11 = C2454a.a(this.index, g.a(c.a((this.theme.hashCode() + ((hashCode3 + (overlayItem == null ? 0 : overlayItem.hashCode())) * 31)) * 31, 31, this.rootTileWidgetId), 31, this.accesibilityTileID), 31);
            TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO = this.relatedProductsCurtain;
            return Long.hashCode(this.tileWidgetId) + g.a((a11 + (tileRelatedProductsCurtainVO != null ? tileRelatedProductsCurtainVO.hashCode() : 0)) * 31, 31, this.tileId);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            AddToCartContainerMultiButtonModel addToCartContainerMultiButtonModel = this.firstButton;
            WishlistTileKey wishlistTileKey = this.wishlistKey;
            SelectionProductsTileKey selectionProductsTileKey = this.selectionKey;
            TileGrid2DTO.OverlayItem overlayItem = this.overlayItem;
            TileThemeConfigVO tileThemeConfigVO = this.theme;
            long j12 = this.rootTileWidgetId;
            String str = this.accesibilityTileID;
            int i11 = this.index;
            TileRelatedProductsCurtainVO tileRelatedProductsCurtainVO = this.relatedProductsCurtain;
            String str2 = this.tileId;
            long j13 = this.tileWidgetId;
            StringBuilder sb2 = new StringBuilder("TileGrid2SingleCartContainerVO(id=");
            sb2.append(j11);
            sb2.append(", firstButton=");
            sb2.append(addToCartContainerMultiButtonModel);
            sb2.append(", wishlistKey=");
            sb2.append(wishlistTileKey);
            sb2.append(", selectionKey=");
            sb2.append(selectionProductsTileKey);
            sb2.append(", overlayItem=");
            sb2.append(overlayItem);
            sb2.append(", theme=");
            sb2.append(tileThemeConfigVO);
            C2942q.f(sb2, ", rootTileWidgetId=", j12, ", accesibilityTileID=");
            Pk0.g.d(i11, str, ", index=", ", relatedProductsCurtain=", sb2);
            sb2.append(tileRelatedProductsCurtainVO);
            sb2.append(", tileId=");
            sb2.append(str2);
            sb2.append(", tileWidgetId=");
            return f.a(j13, ")", sb2);
        }
    }

    TileGrid2DTO.OverlayItem getOverlayItem();

    SelectionProductsTileKey getSelectionKey();

    WishlistTileKey getWishlistKey();
}
