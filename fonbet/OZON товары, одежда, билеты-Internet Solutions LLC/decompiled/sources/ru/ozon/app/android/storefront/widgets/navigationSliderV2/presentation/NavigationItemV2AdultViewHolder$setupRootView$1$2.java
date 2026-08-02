package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2VO;
import ru.ozon.app.android.tools.ItemAdapterCallback;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationItemV2AdultViewHolder$setupRootView$1$2 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ NavigationItemV2AdultViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationItemV2AdultViewHolder$setupRootView$1$2(NavigationItemV2AdultViewHolder navigationItemV2AdultViewHolder) {
        super(1);
        this.this$0 = navigationItemV2AdultViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        ItemAdapterCallback itemAdapterCallback;
        NavigationSliderV2VO.NavigationItemV2 navigationItemV2;
        Intrinsics.checkNotNullParameter(it, "it");
        itemAdapterCallback = this.this$0.adapterCallback;
        int adapterPosition = this.this$0.getAdapterPosition();
        navigationItemV2 = this.this$0.item;
        itemAdapterCallback.click(adapterPosition, navigationItemV2);
    }
}
