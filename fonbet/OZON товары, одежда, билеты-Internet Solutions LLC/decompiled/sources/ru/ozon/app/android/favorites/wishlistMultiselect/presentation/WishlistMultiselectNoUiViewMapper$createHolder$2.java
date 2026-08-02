package ru.ozon.app.android.favorites.wishlistMultiselect.presentation;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/view/View;", "it", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WishlistMultiselectNoUiViewMapper$createHolder$2 extends AbstractC7737t implements Function1<LinearLayout, View> {
    final /* synthetic */ i $container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WishlistMultiselectNoUiViewMapper$createHolder$2(i iVar) {
        super(1);
        this.$container = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context L11 = this.$container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return new WishlistMultiselectView(L11, null, 0, 6, null);
    }
}
