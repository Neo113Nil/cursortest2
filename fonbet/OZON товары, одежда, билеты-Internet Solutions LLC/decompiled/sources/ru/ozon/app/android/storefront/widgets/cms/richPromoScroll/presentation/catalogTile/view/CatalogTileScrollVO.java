package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view;

import Bi.a;
import G.g;
import Kk.C3532b;
import Lh.b;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogTile;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010\u0016R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTile$TileItemVO;", "tiles", "", "hasFirstItemSeparator", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/SpacersVO;", "spacers", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Landroid/os/Parcelable;", "scrollState", "<init>", "(JLjava/util/List;ZLru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/SpacersVO;Ljava/lang/String;LWZ/t;Landroid/os/Parcelable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTiles", "()Ljava/util/List;", "Z", "getHasFirstItemSeparator", "()Z", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/SpacersVO;", "getSpacers", "()Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/SpacersVO;", "Ljava/lang/String;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CatalogTileScrollVO implements c {
    private final String backgroundColor;
    private final boolean hasFirstItemSeparator;
    private final long id;
    private final Parcelable scrollState;

    @NotNull
    private final SpacersVO spacers;

    @NotNull
    private final List<CatalogTile.TileItemVO> tiles;
    private final t tokenizedEvent;

    public CatalogTileScrollVO(long j11, @NotNull List<CatalogTile.TileItemVO> tiles, boolean z11, @NotNull SpacersVO spacers, String str, t tVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.tiles = tiles;
        this.hasFirstItemSeparator = z11;
        this.spacers = spacers;
        this.backgroundColor = str;
        this.tokenizedEvent = tVar;
        this.scrollState = parcelable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogTileScrollVO)) {
            return false;
        }
        CatalogTileScrollVO catalogTileScrollVO = (CatalogTileScrollVO) other;
        return this.id == catalogTileScrollVO.id && Intrinsics.d(this.tiles, catalogTileScrollVO.tiles) && this.hasFirstItemSeparator == catalogTileScrollVO.hasFirstItemSeparator && Intrinsics.d(this.spacers, catalogTileScrollVO.spacers) && Intrinsics.d(this.backgroundColor, catalogTileScrollVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, catalogTileScrollVO.tokenizedEvent) && Intrinsics.d(this.scrollState, catalogTileScrollVO.scrollState);
    }

    public final boolean getHasFirstItemSeparator() {
        return this.hasFirstItemSeparator;
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
    public final SpacersVO getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final List<CatalogTile.TileItemVO> getTiles() {
        return this.tiles;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.spacers.hashCode() + C3532b.a(g.b(Long.hashCode(this.id) * 31, 31, this.tiles), 31, this.hasFirstItemSeparator)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Parcelable parcelable = this.scrollState;
        return hashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<CatalogTile.TileItemVO> list = this.tiles;
        boolean z11 = this.hasFirstItemSeparator;
        SpacersVO spacersVO = this.spacers;
        String str = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        Parcelable parcelable = this.scrollState;
        StringBuilder b11 = b.b(j11, "CatalogTileScrollVO(id=", ", tiles=", list);
        b11.append(", hasFirstItemSeparator=");
        b11.append(z11);
        b11.append(", spacers=");
        b11.append(spacersVO);
        a.f(b11, ", backgroundColor=", str, ", tokenizedEvent=", tVar);
        b11.append(", scrollState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ CatalogTileScrollVO(long j11, List list, boolean z11, SpacersVO spacersVO, String str, t tVar, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, z11, spacersVO, str, tVar, (i11 & 64) != 0 ? null : parcelable);
    }
}
