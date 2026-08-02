package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.multiplicity;

import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.PriceV2VOWrapper;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/multiplicity/PriceV2MultiplicityVO;", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/PriceV2VOWrapper;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "backgroundCornersConfig", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/utils/CornersConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/pdp/utils/CornersConfig;", "getBackgroundCornersConfig", "()Lru/ozon/app/android/pdp/utils/CornersConfig;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV2MultiplicityVO implements PriceV2VOWrapper {

    @NotNull
    private final CornersConfig backgroundCornersConfig;
    private final long id;

    @NotNull
    private final TextDTO text;

    public PriceV2MultiplicityVO(long j11, @NotNull TextDTO text, @NotNull CornersConfig backgroundCornersConfig) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundCornersConfig, "backgroundCornersConfig");
        this.id = j11;
        this.text = text;
        this.backgroundCornersConfig = backgroundCornersConfig;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV2MultiplicityVO)) {
            return false;
        }
        PriceV2MultiplicityVO priceV2MultiplicityVO = (PriceV2MultiplicityVO) other;
        return this.id == priceV2MultiplicityVO.id && Intrinsics.d(this.text, priceV2MultiplicityVO.text) && this.backgroundCornersConfig == priceV2MultiplicityVO.backgroundCornersConfig;
    }

    @NotNull
    public CornersConfig getBackgroundCornersConfig() {
        return this.backgroundCornersConfig;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return PriceV2VOWrapper.DefaultImpls.getScrollWidgetKey(this);
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return PriceV2VOWrapper.DefaultImpls.getViewItemKey(this);
    }

    public int hashCode() {
        return this.backgroundCornersConfig.hashCode() + b.a(this.text, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.text;
        CornersConfig cornersConfig = this.backgroundCornersConfig;
        StringBuilder b11 = a.b("PriceV2MultiplicityVO(id=", j11, ", text=", textDTO);
        b11.append(", backgroundCornersConfig=");
        b11.append(cornersConfig);
        b11.append(")");
        return b11.toString();
    }
}
