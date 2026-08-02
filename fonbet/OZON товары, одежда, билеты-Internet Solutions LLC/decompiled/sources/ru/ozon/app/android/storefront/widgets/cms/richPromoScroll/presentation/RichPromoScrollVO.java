package ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation;

import G.g;
import Nh.a;
import Nh.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.catalogTile.view.CatalogTileScrollVO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/RichPromoScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "", "backgroundImage", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;", "catalogTileScroll", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/lang/String;", "getBackgroundImage", "Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;", "getCatalogTileScroll", "()Lru/ozon/app/android/storefront/widgets/cms/richPromoScroll/presentation/catalogTile/view/CatalogTileScrollVO;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RichPromoScrollVO implements c {

    @NotNull
    private final String backgroundImage;
    private final CatalogTileScrollVO catalogTileScroll;
    private final long id;

    @NotNull
    private final ImageDTO image;

    public RichPromoScrollVO(long j11, @NotNull ImageDTO image, @NotNull String backgroundImage, CatalogTileScrollVO catalogTileScrollVO) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.id = j11;
        this.image = image;
        this.backgroundImage = backgroundImage;
        this.catalogTileScroll = catalogTileScrollVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichPromoScrollVO)) {
            return false;
        }
        RichPromoScrollVO richPromoScrollVO = (RichPromoScrollVO) other;
        return this.id == richPromoScrollVO.id && Intrinsics.d(this.image, richPromoScrollVO.image) && Intrinsics.d(this.backgroundImage, richPromoScrollVO.backgroundImage) && Intrinsics.d(this.catalogTileScroll, richPromoScrollVO.catalogTileScroll);
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final CatalogTileScrollVO getCatalogTileScroll() {
        return this.catalogTileScroll;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
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
        int a11 = g.a(a.b(this.image, Long.hashCode(this.id) * 31, 31), 31, this.backgroundImage);
        CatalogTileScrollVO catalogTileScrollVO = this.catalogTileScroll;
        return a11 + (catalogTileScrollVO == null ? 0 : catalogTileScrollVO.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.image;
        String str = this.backgroundImage;
        CatalogTileScrollVO catalogTileScrollVO = this.catalogTileScroll;
        StringBuilder c11 = b.c("RichPromoScrollVO(id=", j11, ", image=", imageDTO);
        c11.append(", backgroundImage=");
        c11.append(str);
        c11.append(", catalogTileScroll=");
        c11.append(catalogTileScrollVO);
        c11.append(")");
        return c11.toString();
    }
}
