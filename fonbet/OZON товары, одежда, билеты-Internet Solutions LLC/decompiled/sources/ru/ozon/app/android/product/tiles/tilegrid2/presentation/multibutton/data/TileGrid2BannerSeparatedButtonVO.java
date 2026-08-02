package ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data;

import B0.C2454a;
import C.C2702w;
import De.C2859b;
import G.g;
import Pk0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2ButtonsVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2BannerSeparatedButtonVO;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2ButtonsVO;", "", "id", "rootTileWidgetId", "", "accesibilityTileID", "", "index", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixel", "topOffsetPx", "<init>", "(JJLjava/lang/String;ILru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getRootTileWidgetId", "Ljava/lang/String;", "getAccesibilityTileID", "I", "getIndex", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/List;", "getPixel", "()Ljava/util/List;", "getTopOffsetPx", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileGrid2BannerSeparatedButtonVO implements TileGrid2ButtonsVO {

    @NotNull
    private final String accesibilityTileID;

    @NotNull
    private final ButtonV3DTO button;
    private final long id;
    private final int index;
    private final List<Pixel> pixel;
    private final long rootTileWidgetId;
    private final int topOffsetPx;

    public TileGrid2BannerSeparatedButtonVO(long j11, long j12, @NotNull String accesibilityTileID, int i11, @NotNull ButtonV3DTO button, List<Pixel> list, int i12) {
        Intrinsics.checkNotNullParameter(accesibilityTileID, "accesibilityTileID");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.rootTileWidgetId = j12;
        this.accesibilityTileID = accesibilityTileID;
        this.index = i11;
        this.button = button;
        this.pixel = list;
        this.topOffsetPx = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileGrid2BannerSeparatedButtonVO)) {
            return false;
        }
        TileGrid2BannerSeparatedButtonVO tileGrid2BannerSeparatedButtonVO = (TileGrid2BannerSeparatedButtonVO) other;
        return this.id == tileGrid2BannerSeparatedButtonVO.id && this.rootTileWidgetId == tileGrid2BannerSeparatedButtonVO.rootTileWidgetId && Intrinsics.d(this.accesibilityTileID, tileGrid2BannerSeparatedButtonVO.accesibilityTileID) && this.index == tileGrid2BannerSeparatedButtonVO.index && Intrinsics.d(this.button, tileGrid2BannerSeparatedButtonVO.button) && Intrinsics.d(this.pixel, tileGrid2BannerSeparatedButtonVO.pixel) && this.topOffsetPx == tileGrid2BannerSeparatedButtonVO.topOffsetPx;
    }

    @NotNull
    public final String getAccesibilityTileID() {
        return this.accesibilityTileID;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final List<Pixel> getPixel() {
        return this.pixel;
    }

    public long getRootTileWidgetId() {
        return this.rootTileWidgetId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return TileGrid2ButtonsVO.DefaultImpls.getScrollWidgetKey(this);
    }

    public final int getTopOffsetPx() {
        return this.topOffsetPx;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return TileGrid2ButtonsVO.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, C2454a.a(this.index, g.a(c.a(Long.hashCode(this.id) * 31, 31, this.rootTileWidgetId), 31, this.accesibilityTileID), 31), 31);
        List<Pixel> list = this.pixel;
        return Integer.hashCode(this.topOffsetPx) + ((c11 + (list == null ? 0 : list.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.rootTileWidgetId;
        String str = this.accesibilityTileID;
        int i11 = this.index;
        ButtonV3DTO buttonV3DTO = this.button;
        List<Pixel> list = this.pixel;
        int i12 = this.topOffsetPx;
        StringBuilder d11 = C2702w.d(j11, "TileGrid2BannerSeparatedButtonVO(id=", ", rootTileWidgetId=");
        d11.append(j12);
        d11.append(", accesibilityTileID=");
        d11.append(str);
        d11.append(", index=");
        d11.append(i11);
        d11.append(", button=");
        d11.append(buttonV3DTO);
        d11.append(", pixel=");
        d11.append(list);
        d11.append(", topOffsetPx=");
        d11.append(i12);
        d11.append(")");
        return d11.toString();
    }
}
