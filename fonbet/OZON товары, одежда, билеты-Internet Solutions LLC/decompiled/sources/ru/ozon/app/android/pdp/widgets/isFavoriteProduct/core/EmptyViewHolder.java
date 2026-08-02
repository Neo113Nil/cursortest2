package ru.ozon.app.android.pdp.widgets.isFavoriteProduct.core;

import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/core/EmptyViewHolder;", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/core/IsFavoriteProductVO;", "<init>", "()V", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/isFavoriteProduct/core/IsFavoriteProductVO;)V", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmptyViewHolder extends AbstractC6065b<IsFavoriteProductVO> {
    private final View metricView;

    @Override // d20.AbstractC6065b
    public void bind(@NotNull IsFavoriteProductVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }
}
