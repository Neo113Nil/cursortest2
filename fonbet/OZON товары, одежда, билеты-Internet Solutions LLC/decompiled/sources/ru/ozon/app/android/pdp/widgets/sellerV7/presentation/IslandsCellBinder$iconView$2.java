package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7View;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/icon/IconView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class IslandsCellBinder$iconView$2 extends AbstractC7737t implements Function0<IconView> {
    final /* synthetic */ IslandsCellBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IslandsCellBinder$iconView$2(IslandsCellBinder islandsCellBinder) {
        super(0);
        this.this$0 = islandsCellBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconView invoke() {
        SellerV7View sellerV7View;
        sellerV7View = this.this$0.view;
        View view = ViewGroupExtKt.get(sellerV7View.getCellView().getLeftBlock(), 0);
        if (view instanceof IconView) {
            return (IconView) view;
        }
        return null;
    }
}
