package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.priceList;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "", "isFlex", "Landroidx/recyclerview/widget/RecyclerView$o;", "createLayoutManager", "(Landroid/content/Context;Z)Landroidx/recyclerview/widget/RecyclerView$o;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PriceListVHV2Kt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView.o createLayoutManager(Context context, boolean z11) {
        if (!z11) {
            return new HorizontalPriceListLayoutManagerV2(context);
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        flexboxLayoutManager.setAlignItems(1);
        return flexboxLayoutManager;
    }
}
