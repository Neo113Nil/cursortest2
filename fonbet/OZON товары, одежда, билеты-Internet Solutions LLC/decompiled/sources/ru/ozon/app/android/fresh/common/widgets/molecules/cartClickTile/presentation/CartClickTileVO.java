package ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation;

import Bi.b;
import Cm.e;
import G.g;
import Ve.C4598rp;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.presentation.ImageSkuClickVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u00011BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "skuImage", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "", "backgroundColor", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO$SpacersVO;", "spacers", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO$SpacersVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "copy", "(Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO$SpacersVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "getSkuImage", "()Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/presentation/ImageSkuClickVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO$SpacersVO;", "getSpacers", "()Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO$SpacersVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "SpacersVO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartClickTileVO {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final String backgroundColor;
    private final ButtonV3DTO button;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final ImageSkuClickVO skuImage;

    @NotNull
    private final SpacersVO spacers;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO$SpacersVO;", "", "", "horizontal", "between", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHorizontal", "getBetween", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpacersVO {
        private final int between;
        private final int horizontal;

        public SpacersVO(int i11, int i12) {
            this.horizontal = i11;
            this.between = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersVO)) {
                return false;
            }
            SpacersVO spacersVO = (SpacersVO) other;
            return this.horizontal == spacersVO.horizontal && this.between == spacersVO.between;
        }

        public final int getBetween() {
            return this.between;
        }

        public final int getHorizontal() {
            return this.horizontal;
        }

        public int hashCode() {
            return Integer.hashCode(this.between) + (Integer.hashCode(this.horizontal) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("SpacersVO(horizontal=", this.horizontal, ", between=", ")", this.between);
        }
    }

    public CartClickTileVO(@NotNull ImageSkuClickVO skuImage, @NotNull CellDTO cell, @NotNull String backgroundColor, @NotNull SpacersVO spacers, ButtonV3DTO buttonV3DTO, @NotNull AtomAction action, t tVar) {
        Intrinsics.checkNotNullParameter(skuImage, "skuImage");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(action, "action");
        this.skuImage = skuImage;
        this.cell = cell;
        this.backgroundColor = backgroundColor;
        this.spacers = spacers;
        this.button = buttonV3DTO;
        this.action = action;
        this.tokenizedEvent = tVar;
    }

    public static /* synthetic */ CartClickTileVO copy$default(CartClickTileVO cartClickTileVO, ImageSkuClickVO imageSkuClickVO, CellDTO cellDTO, String str, SpacersVO spacersVO, ButtonV3DTO buttonV3DTO, AtomAction atomAction, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageSkuClickVO = cartClickTileVO.skuImage;
        }
        if ((i11 & 2) != 0) {
            cellDTO = cartClickTileVO.cell;
        }
        if ((i11 & 4) != 0) {
            str = cartClickTileVO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            spacersVO = cartClickTileVO.spacers;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = cartClickTileVO.button;
        }
        if ((i11 & 32) != 0) {
            atomAction = cartClickTileVO.action;
        }
        if ((i11 & 64) != 0) {
            tVar = cartClickTileVO.tokenizedEvent;
        }
        AtomAction atomAction2 = atomAction;
        t tVar2 = tVar;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        String str2 = str;
        return cartClickTileVO.copy(imageSkuClickVO, cellDTO, str2, spacersVO, buttonV3DTO2, atomAction2, tVar2);
    }

    @NotNull
    public final CartClickTileVO copy(@NotNull ImageSkuClickVO skuImage, @NotNull CellDTO cell, @NotNull String backgroundColor, @NotNull SpacersVO spacers, ButtonV3DTO button, @NotNull AtomAction action, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(skuImage, "skuImage");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        Intrinsics.checkNotNullParameter(action, "action");
        return new CartClickTileVO(skuImage, cell, backgroundColor, spacers, button, action, tokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartClickTileVO)) {
            return false;
        }
        CartClickTileVO cartClickTileVO = (CartClickTileVO) other;
        return Intrinsics.d(this.skuImage, cartClickTileVO.skuImage) && Intrinsics.d(this.cell, cartClickTileVO.cell) && Intrinsics.d(this.backgroundColor, cartClickTileVO.backgroundColor) && Intrinsics.d(this.spacers, cartClickTileVO.spacers) && Intrinsics.d(this.button, cartClickTileVO.button) && Intrinsics.d(this.action, cartClickTileVO.action) && Intrinsics.d(this.tokenizedEvent, cartClickTileVO.tokenizedEvent);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final ImageSkuClickVO getSkuImage() {
        return this.skuImage;
    }

    @NotNull
    public final SpacersVO getSpacers() {
        return this.spacers;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = (this.spacers.hashCode() + g.a(b.c(this.cell, this.skuImage.hashCode() * 31, 31), 31, this.backgroundColor)) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int a11 = C4598rp.a(this.action, (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageSkuClickVO imageSkuClickVO = this.skuImage;
        CellDTO cellDTO = this.cell;
        String str = this.backgroundColor;
        SpacersVO spacersVO = this.spacers;
        ButtonV3DTO buttonV3DTO = this.button;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CartClickTileVO(skuImage=");
        sb2.append(imageSkuClickVO);
        sb2.append(", cell=");
        sb2.append(cellDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", spacers=");
        sb2.append(spacersVO);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", action=");
        sb2.append(atomAction);
        sb2.append(", tokenizedEvent=");
        return Tl.b.d(sb2, tVar, ")");
    }
}
