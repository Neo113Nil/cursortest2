package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/view/View;", "Landroid/view/TouchDelegate;", "createNewHitAreaDelegate", "(Landroid/view/View;)Landroid/view/TouchDelegate;", "order_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceRowViewKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final TouchDelegate createNewHitAreaDelegate(View view) {
        Rect rect = new Rect();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context);
        view.getHitRect(rect);
        int i11 = -px;
        rect.inset(i11, i11);
        return new TouchDelegate(rect, view);
    }
}
