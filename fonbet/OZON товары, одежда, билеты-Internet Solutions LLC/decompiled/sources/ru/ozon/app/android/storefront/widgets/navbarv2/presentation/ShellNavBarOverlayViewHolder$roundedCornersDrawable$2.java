package ru.ozon.app.android.storefront.widgets.navbarv2.presentation;

import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.R$drawable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ShellNavBarOverlayViewHolder$roundedCornersDrawable$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ ShellNavBarOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShellNavBarOverlayViewHolder$roundedCornersDrawable$2(ShellNavBarOverlayViewHolder shellNavBarOverlayViewHolder) {
        super(0);
        this.this$0 = shellNavBarOverlayViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        Drawable drawable = a.getDrawable(this.this$0.getContainer().L(), R$drawable.bg_navbar_v2);
        Intrinsics.f(drawable);
        return drawable;
    }
}
