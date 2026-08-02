package ru.ozon.app.android.product.tiles.tilegrid2.presentation.data;

import B0.A0;
import B0.C2454a;
import G.g;
import Nh.a;
import WZ.t;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B±\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b2\u0010#R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b3\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b>\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bE\u0010DR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\bI\u0010#R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\bJ\u0010#R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\bK\u0010%R\u001a\u0010\u001f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\bL\u0010%¨\u0006M"}, d2 = {"Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/BackgroundDecorated;", "", "id", "", "index", "", "accesibilityTileID", "imageUrl", "ratio", "Landroid/widget/ImageView$ScaleType;", "scaleType", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTO", "extraBadgeDTO", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "tokenizedEvent", "impressionTokenizedEvent", "", "Lru/ozon/app/android/ads/data/pixel/presentation/Pixel;", "pixel", "backgroundColor", "islandBackgroundColor", "bottomPadding", "topMargin", "<init>", "(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView$ScaleType;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;LWZ/t;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getIndex", "Ljava/lang/String;", "getAccesibilityTileID", "getImageUrl", "getRatio", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadgeDTO", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getExtraBadgeDTO", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getImpressionTokenizedEvent", "Ljava/util/List;", "getPixel", "()Ljava/util/List;", "getBackgroundColor", "getIslandBackgroundColor", "getBottomPadding", "getTopMargin", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileGrid2BannerVO implements c, BackgroundDecorated {

    @NotNull
    private final String accesibilityTileID;
    private final AtomAction atomAction;
    private final String backgroundColor;
    private final BadgeDTO badgeDTO;
    private final int bottomPadding;
    private final BadgeDTO extraBadgeDTO;
    private final long id;

    @NotNull
    private final String imageUrl;
    private final t impressionTokenizedEvent;
    private final int index;
    private final String islandBackgroundColor;
    private final List<Pixel> pixel;

    @NotNull
    private final String ratio;

    @NotNull
    private final ImageView.ScaleType scaleType;
    private final TextDTO text;
    private final TextDTO title;
    private final t tokenizedEvent;
    private final int topMargin;

    public TileGrid2BannerVO(long j11, int i11, @NotNull String accesibilityTileID, @NotNull String imageUrl, @NotNull String ratio, @NotNull ImageView.ScaleType scaleType, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, AtomAction atomAction, t tVar, t tVar2, List<Pixel> list, String str, String str2, int i12, int i13) {
        Intrinsics.checkNotNullParameter(accesibilityTileID, "accesibilityTileID");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.id = j11;
        this.index = i11;
        this.accesibilityTileID = accesibilityTileID;
        this.imageUrl = imageUrl;
        this.ratio = ratio;
        this.scaleType = scaleType;
        this.title = textDTO;
        this.text = textDTO2;
        this.badgeDTO = badgeDTO;
        this.extraBadgeDTO = badgeDTO2;
        this.atomAction = atomAction;
        this.tokenizedEvent = tVar;
        this.impressionTokenizedEvent = tVar2;
        this.pixel = list;
        this.backgroundColor = str;
        this.islandBackgroundColor = str2;
        this.bottomPadding = i12;
        this.topMargin = i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileGrid2BannerVO)) {
            return false;
        }
        TileGrid2BannerVO tileGrid2BannerVO = (TileGrid2BannerVO) other;
        return this.id == tileGrid2BannerVO.id && this.index == tileGrid2BannerVO.index && Intrinsics.d(this.accesibilityTileID, tileGrid2BannerVO.accesibilityTileID) && Intrinsics.d(this.imageUrl, tileGrid2BannerVO.imageUrl) && Intrinsics.d(this.ratio, tileGrid2BannerVO.ratio) && this.scaleType == tileGrid2BannerVO.scaleType && Intrinsics.d(this.title, tileGrid2BannerVO.title) && Intrinsics.d(this.text, tileGrid2BannerVO.text) && Intrinsics.d(this.badgeDTO, tileGrid2BannerVO.badgeDTO) && Intrinsics.d(this.extraBadgeDTO, tileGrid2BannerVO.extraBadgeDTO) && Intrinsics.d(this.atomAction, tileGrid2BannerVO.atomAction) && Intrinsics.d(this.tokenizedEvent, tileGrid2BannerVO.tokenizedEvent) && Intrinsics.d(this.impressionTokenizedEvent, tileGrid2BannerVO.impressionTokenizedEvent) && Intrinsics.d(this.pixel, tileGrid2BannerVO.pixel) && Intrinsics.d(this.backgroundColor, tileGrid2BannerVO.backgroundColor) && Intrinsics.d(this.islandBackgroundColor, tileGrid2BannerVO.islandBackgroundColor) && this.bottomPadding == tileGrid2BannerVO.bottomPadding && this.topMargin == tileGrid2BannerVO.topMargin;
    }

    @NotNull
    public final String getAccesibilityTileID() {
        return this.accesibilityTileID;
    }

    public final AtomAction getAtomAction() {
        return this.atomAction;
    }

    @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.BackgroundDecorated
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadgeDTO() {
        return this.badgeDTO;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final BadgeDTO getExtraBadgeDTO() {
        return this.extraBadgeDTO;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final t getImpressionTokenizedEvent() {
        return this.impressionTokenizedEvent;
    }

    @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.BackgroundDecorated
    public int getIndex() {
        return this.index;
    }

    public final String getIslandBackgroundColor() {
        return this.islandBackgroundColor;
    }

    public final List<Pixel> getPixel() {
        return this.pixel;
    }

    @NotNull
    public final String getRatio() {
        return this.ratio;
    }

    @NotNull
    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.BackgroundDecorated
    public int getTopMargin() {
        return this.topMargin;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.scaleType.hashCode() + g.a(g.a(g.a(C2454a.a(this.index, Long.hashCode(this.id) * 31, 31), 31, this.accesibilityTileID), 31, this.imageUrl), 31, this.ratio)) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.text;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badgeDTO;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.extraBadgeDTO;
        int hashCode5 = (hashCode4 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31;
        AtomAction atomAction = this.atomAction;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode7 = (hashCode6 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.impressionTokenizedEvent;
        int hashCode8 = (hashCode7 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        List<Pixel> list = this.pixel;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.islandBackgroundColor;
        return Integer.hashCode(this.topMargin) + C2454a.a(this.bottomPadding, (hashCode10 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.index;
        String str = this.accesibilityTileID;
        String str2 = this.imageUrl;
        String str3 = this.ratio;
        ImageView.ScaleType scaleType = this.scaleType;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.text;
        BadgeDTO badgeDTO = this.badgeDTO;
        BadgeDTO badgeDTO2 = this.extraBadgeDTO;
        AtomAction atomAction = this.atomAction;
        t tVar = this.tokenizedEvent;
        t tVar2 = this.impressionTokenizedEvent;
        List<Pixel> list = this.pixel;
        String str4 = this.backgroundColor;
        String str5 = this.islandBackgroundColor;
        int i12 = this.bottomPadding;
        int i13 = this.topMargin;
        StringBuilder b11 = Ql.c.b(j11, "TileGrid2BannerVO(id=", i11, ", index=");
        a.h(b11, ", accesibilityTileID=", str, ", imageUrl=", str2);
        b11.append(", ratio=");
        b11.append(str3);
        b11.append(", scaleType=");
        b11.append(scaleType);
        D3.g.i(", title=", ", text=", b11, textDTO, textDTO2);
        b11.append(", badgeDTO=");
        b11.append(badgeDTO);
        b11.append(", extraBadgeDTO=");
        b11.append(badgeDTO2);
        Fj.c.e(tVar, ", atomAction=", ", tokenizedEvent=", b11, atomAction);
        b11.append(", impressionTokenizedEvent=");
        b11.append(tVar2);
        b11.append(", pixel=");
        b11.append(list);
        a.h(b11, ", backgroundColor=", str4, ", islandBackgroundColor=", str5);
        A0.c(i12, i13, ", bottomPadding=", ", topMargin=", b11);
        b11.append(")");
        return b11.toString();
    }
}
