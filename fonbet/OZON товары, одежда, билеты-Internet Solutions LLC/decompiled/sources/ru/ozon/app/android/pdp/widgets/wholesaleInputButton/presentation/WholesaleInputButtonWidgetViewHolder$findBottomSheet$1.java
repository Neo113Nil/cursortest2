package ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation;

import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/ViewParent;", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholesaleInputButtonWidgetViewHolder$findBottomSheet$1 extends AbstractC7737t implements Function1<ViewParent, ViewParent> {
    public static final WholesaleInputButtonWidgetViewHolder$findBottomSheet$1 INSTANCE = new WholesaleInputButtonWidgetViewHolder$findBottomSheet$1();

    WholesaleInputButtonWidgetViewHolder$findBottomSheet$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getParent();
    }
}
