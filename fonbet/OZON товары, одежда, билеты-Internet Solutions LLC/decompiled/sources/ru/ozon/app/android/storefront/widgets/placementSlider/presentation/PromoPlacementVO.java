package ru.ozon.app.android.storefront.widgets.placementSlider.presentation;

import C.C2702w;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/PromoPlacementVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "scrollInterval", "", "Lru/ozon/app/android/storefront/widgets/placementSlider/presentation/BannerVO;", "items", "Ll20/d;", "widgetInfo", "<init>", "(JJLjava/util/List;Ll20/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getScrollInterval", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ll20/d;", "getWidgetInfo", "()Ll20/d;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoPlacementVO implements c {
    private final long id;

    @NotNull
    private final List<BannerVO> items;
    private final long scrollInterval;

    @NotNull
    private final d widgetInfo;

    public PromoPlacementVO(long j11, long j12, @NotNull List<BannerVO> items, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.id = j11;
        this.scrollInterval = j12;
        this.items = items;
        this.widgetInfo = widgetInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoPlacementVO)) {
            return false;
        }
        PromoPlacementVO promoPlacementVO = (PromoPlacementVO) other;
        return this.id == promoPlacementVO.id && this.scrollInterval == promoPlacementVO.scrollInterval && Intrinsics.d(this.items, promoPlacementVO.items) && Intrinsics.d(this.widgetInfo, promoPlacementVO.widgetInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<BannerVO> getItems() {
        return this.items;
    }

    public final long getScrollInterval() {
        return this.scrollInterval;
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
        return this.widgetInfo.hashCode() + g.b(Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.scrollInterval), 31, this.items);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.scrollInterval;
        List<BannerVO> list = this.items;
        d dVar = this.widgetInfo;
        StringBuilder d11 = C2702w.d(j11, "PromoPlacementVO(id=", ", scrollInterval=");
        d11.append(j12);
        d11.append(", items=");
        d11.append(list);
        d11.append(", widgetInfo=");
        d11.append(dVar);
        d11.append(")");
        return d11.toString();
    }
}
