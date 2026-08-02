package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.separator;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.PriceV2VOWrapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/separator/PriceV2SeparatorVO;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/PriceV2VOWrapper;", "", "id", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "backgroundCornersConfig", "<init>", "(JLru/ozon/app/android/pdp/utils/CornersConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "getBackgroundCornersConfig", "()Lru/ozon/app/android/pdp/utils/CornersConfig;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV2SeparatorVO implements PriceV2VOWrapper {

    @NotNull
    private final CornersConfig backgroundCornersConfig;
    private final long id;

    public PriceV2SeparatorVO(long j11, @NotNull CornersConfig backgroundCornersConfig) {
        Intrinsics.checkNotNullParameter(backgroundCornersConfig, "backgroundCornersConfig");
        this.id = j11;
        this.backgroundCornersConfig = backgroundCornersConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV2SeparatorVO)) {
            return false;
        }
        PriceV2SeparatorVO priceV2SeparatorVO = (PriceV2SeparatorVO) other;
        return this.id == priceV2SeparatorVO.id && this.backgroundCornersConfig == priceV2SeparatorVO.backgroundCornersConfig;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return PriceV2VOWrapper.DefaultImpls.getScrollWidgetKey(this);
    }

    @Override // l20.c
    public int getViewItemKey() {
        return PriceV2VOWrapper.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        return this.backgroundCornersConfig.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "PriceV2SeparatorVO(id=" + this.id + ", backgroundCornersConfig=" + this.backgroundCornersConfig + ")";
    }

    public /* synthetic */ PriceV2SeparatorVO(long j11, CornersConfig cornersConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? CornersConfig.NONE : cornersConfig);
    }
}
