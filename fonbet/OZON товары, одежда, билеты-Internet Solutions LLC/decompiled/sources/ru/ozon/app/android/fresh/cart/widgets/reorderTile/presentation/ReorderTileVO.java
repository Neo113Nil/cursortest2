package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import Bi.a;
import G.g;
import Kk.C3532b;
import Lh.b;
import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.data.ReorderTileDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001dB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "tiles", "<init>", "(JLjava/util/List;)V", "copy", "(JLjava/util/List;)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTiles", "()Ljava/util/List;", "TileItem", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReorderTileVO implements c {
    private final long id;

    @NotNull
    private final List<TileItem> tiles;

    public ReorderTileVO(long j11, @NotNull List<TileItem> tiles) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.id = j11;
        this.tiles = tiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReorderTileVO copy$default(ReorderTileVO reorderTileVO, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = reorderTileVO.id;
        }
        if ((i11 & 2) != 0) {
            list = reorderTileVO.tiles;
        }
        return reorderTileVO.copy(j11, list);
    }

    @NotNull
    public final ReorderTileVO copy(long id2, @NotNull List<TileItem> tiles) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        return new ReorderTileVO(id2, tiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReorderTileVO)) {
            return false;
        }
        ReorderTileVO reorderTileVO = (ReorderTileVO) other;
        return this.id == reorderTileVO.id && Intrinsics.d(this.tiles, reorderTileVO.tiles);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TileItem> getTiles() {
        return this.tiles;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.tiles.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "ReorderTileVO(id=", ", tiles=", this.tiles);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001:\u0002KLB\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ´\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b>\u0010\"R\u001f\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010AR%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010E\u001a\u0004\bF\u0010GR\"\u0010\u001c\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010E\u001a\u0004\bH\u0010G\"\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "", "", "widgetId", "", "image", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "innerAtoms", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "tileControl", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "radius", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;", "spacers", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;", "separator", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "hasParanja", "shouldShowHint", "<init>", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;Lru/ozon/uni/atoms/af/AtomAction;ILru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;Ljava/lang/String;LWZ/t;Ljava/util/Map;ZZ)V", "copy", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;Lru/ozon/uni/atoms/af/AtomAction;ILru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;Ljava/lang/String;LWZ/t;Ljava/util/Map;ZZ)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Ljava/lang/String;", "getImage", "Ljava/util/List;", "getInnerAtoms", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "getTileControl", "()Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "I", "getRadius", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;", "getSeparator", "()Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Z", "getHasParanja", "()Z", "getShouldShowHint", "setShouldShowHint", "(Z)V", "TileControl", "Spacers", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileItem {
        private final AtomAction action;
        private final String backgroundColor;
        private final boolean hasParanja;

        @NotNull
        private final String image;

        @NotNull
        private final List<AtomDTO> innerAtoms;
        private final int radius;
        private final ReorderTileDTO.TileItem.Separator separator;
        private boolean shouldShowHint;

        @NotNull
        private final Spacers spacers;

        @NotNull
        private final TileControl tileControl;
        private final t tokenizedEvent;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final long widgetId;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;", "", "", "vertical", "horizontal", "between", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVertical", "getHorizontal", "getBetween", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            private final int between;
            private final int horizontal;
            private final int vertical;

            public Spacers(int i11, int i12, int i13) {
                this.vertical = i11;
                this.horizontal = i12;
                this.between = i13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spacers)) {
                    return false;
                }
                Spacers spacers = (Spacers) other;
                return this.vertical == spacers.vertical && this.horizontal == spacers.horizontal && this.between == spacers.between;
            }

            public final int getBetween() {
                return this.between;
            }

            public final int getHorizontal() {
                return this.horizontal;
            }

            public final int getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                return Integer.hashCode(this.between) + C2454a.a(this.horizontal, Integer.hashCode(this.vertical) * 31, 31);
            }

            @NotNull
            public String toString() {
                return K00.b.e(this.between, ")", C2438a.a("Spacers(vertical=", this.vertical, ", horizontal=", ", between=", this.horizontal));
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "", "AvailableControl", "UnavailableControl", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl$AvailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl$UnavailableControl;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface TileControl {

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl$AvailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "cartPicker", "Lru/ozon/uni/atoms/data/text/TextDTO;", "quantity", "<init>", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "copy", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl$AvailableControl;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "getCartPicker", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AvailableControl implements TileControl {
                private final CartPickerVO cartPicker;
                private final TextDTO quantity;

                /* JADX WARN: Multi-variable type inference failed */
                public AvailableControl() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ AvailableControl copy$default(AvailableControl availableControl, CartPickerVO cartPickerVO, TextDTO textDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        cartPickerVO = availableControl.cartPicker;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO = availableControl.quantity;
                    }
                    return availableControl.copy(cartPickerVO, textDTO);
                }

                @NotNull
                public final AvailableControl copy(CartPickerVO cartPicker, TextDTO quantity) {
                    return new AvailableControl(cartPicker, quantity);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AvailableControl)) {
                        return false;
                    }
                    AvailableControl availableControl = (AvailableControl) other;
                    return Intrinsics.d(this.cartPicker, availableControl.cartPicker) && Intrinsics.d(this.quantity, availableControl.quantity);
                }

                public final CartPickerVO getCartPicker() {
                    return this.cartPicker;
                }

                public final TextDTO getQuantity() {
                    return this.quantity;
                }

                public int hashCode() {
                    CartPickerVO cartPickerVO = this.cartPicker;
                    int hashCode = (cartPickerVO == null ? 0 : cartPickerVO.hashCode()) * 31;
                    TextDTO textDTO = this.quantity;
                    return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "AvailableControl(cartPicker=" + this.cartPicker + ", quantity=" + this.quantity + ")";
                }

                public AvailableControl(CartPickerVO cartPickerVO, TextDTO textDTO) {
                    this.cartPicker = cartPickerVO;
                    this.quantity = textDTO;
                }

                public /* synthetic */ AvailableControl(CartPickerVO cartPickerVO, TextDTO textDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : cartPickerVO, (i11 & 2) != 0 ? null : textDTO);
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl$UnavailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/text/TextDTO;", "quantity", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UnavailableControl implements TileControl {
                private final ButtonV3DTO button;
                private final TextDTO quantity;

                /* JADX WARN: Multi-variable type inference failed */
                public UnavailableControl() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UnavailableControl)) {
                        return false;
                    }
                    UnavailableControl unavailableControl = (UnavailableControl) other;
                    return Intrinsics.d(this.button, unavailableControl.button) && Intrinsics.d(this.quantity, unavailableControl.quantity);
                }

                public final ButtonV3DTO getButton() {
                    return this.button;
                }

                public final TextDTO getQuantity() {
                    return this.quantity;
                }

                public int hashCode() {
                    ButtonV3DTO buttonV3DTO = this.button;
                    int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
                    TextDTO textDTO = this.quantity;
                    return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "UnavailableControl(button=" + this.button + ", quantity=" + this.quantity + ")";
                }

                public UnavailableControl(ButtonV3DTO buttonV3DTO, TextDTO textDTO) {
                    this.button = buttonV3DTO;
                    this.quantity = textDTO;
                }

                public /* synthetic */ UnavailableControl(ButtonV3DTO buttonV3DTO, TextDTO textDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : buttonV3DTO, (i11 & 2) != 0 ? null : textDTO);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TileItem(long j11, @NotNull String image, @NotNull List<? extends AtomDTO> innerAtoms, @NotNull TileControl tileControl, AtomAction atomAction, int i11, @NotNull Spacers spacers, ReorderTileDTO.TileItem.Separator separator, String str, t tVar, Map<String, TokenizedTrackingInfo> map, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(innerAtoms, "innerAtoms");
            Intrinsics.checkNotNullParameter(tileControl, "tileControl");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            this.widgetId = j11;
            this.image = image;
            this.innerAtoms = innerAtoms;
            this.tileControl = tileControl;
            this.action = atomAction;
            this.radius = i11;
            this.spacers = spacers;
            this.separator = separator;
            this.backgroundColor = str;
            this.tokenizedEvent = tVar;
            this.trackingInfo = map;
            this.hasParanja = z11;
            this.shouldShowHint = z12;
        }

        @NotNull
        public final TileItem copy(long widgetId, @NotNull String image, @NotNull List<? extends AtomDTO> innerAtoms, @NotNull TileControl tileControl, AtomAction action, int radius, @NotNull Spacers spacers, ReorderTileDTO.TileItem.Separator separator, String backgroundColor, t tokenizedEvent, Map<String, TokenizedTrackingInfo> trackingInfo, boolean hasParanja, boolean shouldShowHint) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(innerAtoms, "innerAtoms");
            Intrinsics.checkNotNullParameter(tileControl, "tileControl");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            return new TileItem(widgetId, image, innerAtoms, tileControl, action, radius, spacers, separator, backgroundColor, tokenizedEvent, trackingInfo, hasParanja, shouldShowHint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileItem)) {
                return false;
            }
            TileItem tileItem = (TileItem) other;
            return this.widgetId == tileItem.widgetId && Intrinsics.d(this.image, tileItem.image) && Intrinsics.d(this.innerAtoms, tileItem.innerAtoms) && Intrinsics.d(this.tileControl, tileItem.tileControl) && Intrinsics.d(this.action, tileItem.action) && this.radius == tileItem.radius && Intrinsics.d(this.spacers, tileItem.spacers) && Intrinsics.d(this.separator, tileItem.separator) && Intrinsics.d(this.backgroundColor, tileItem.backgroundColor) && Intrinsics.d(this.tokenizedEvent, tileItem.tokenizedEvent) && Intrinsics.d(this.trackingInfo, tileItem.trackingInfo) && this.hasParanja == tileItem.hasParanja && this.shouldShowHint == tileItem.shouldShowHint;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final boolean getHasParanja() {
            return this.hasParanja;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final List<AtomDTO> getInnerAtoms() {
            return this.innerAtoms;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final ReorderTileDTO.TileItem.Separator getSeparator() {
            return this.separator;
        }

        @NotNull
        public final Spacers getSpacers() {
            return this.spacers;
        }

        @NotNull
        public final TileControl getTileControl() {
            return this.tileControl;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            int hashCode = (this.tileControl.hashCode() + g.b(g.a(Long.hashCode(this.widgetId) * 31, 31, this.image), 31, this.innerAtoms)) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (this.spacers.hashCode() + C2454a.a(this.radius, (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31)) * 31;
            ReorderTileDTO.TileItem.Separator separator = this.separator;
            int hashCode3 = (hashCode2 + (separator == null ? 0 : separator.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode5 = (hashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return Boolean.hashCode(this.shouldShowHint) + C3532b.a((hashCode5 + (map != null ? map.hashCode() : 0)) * 31, 31, this.hasParanja);
        }

        @NotNull
        public String toString() {
            long j11 = this.widgetId;
            String str = this.image;
            List<AtomDTO> list = this.innerAtoms;
            TileControl tileControl = this.tileControl;
            AtomAction atomAction = this.action;
            int i11 = this.radius;
            Spacers spacers = this.spacers;
            ReorderTileDTO.TileItem.Separator separator = this.separator;
            String str2 = this.backgroundColor;
            t tVar = this.tokenizedEvent;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            boolean z11 = this.hasParanja;
            boolean z12 = this.shouldShowHint;
            StringBuilder c11 = C2436a.c(j11, "TileItem(widgetId=", ", image=", str);
            c11.append(", innerAtoms=");
            c11.append(list);
            c11.append(", tileControl=");
            c11.append(tileControl);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", radius=");
            c11.append(i11);
            c11.append(", spacers=");
            c11.append(spacers);
            c11.append(", separator=");
            c11.append(separator);
            a.f(c11, ", backgroundColor=", str2, ", tokenizedEvent=", tVar);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(", hasParanja=");
            c11.append(z11);
            return Bi.b.f(c11, ", shouldShowHint=", z12, ")");
        }

        public /* synthetic */ TileItem(long j11, String str, List list, TileControl tileControl, AtomAction atomAction, int i11, Spacers spacers, ReorderTileDTO.TileItem.Separator separator, String str2, t tVar, Map map, boolean z11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, str, list, tileControl, atomAction, i11, spacers, separator, str2, tVar, map, z11, (i12 & 4096) != 0 ? false : z12);
        }
    }
}
