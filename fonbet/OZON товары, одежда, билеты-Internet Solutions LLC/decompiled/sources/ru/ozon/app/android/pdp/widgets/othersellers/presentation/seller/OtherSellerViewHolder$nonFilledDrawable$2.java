package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OtherSellerViewHolder$nonFilledDrawable$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ OtherSellerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtherSellerViewHolder$nonFilledDrawable$2(OtherSellerViewHolder otherSellerViewHolder) {
        super(0);
        this.this$0 = otherSellerViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        Drawable drawable = androidx.core.content.a.getDrawable(this.this$0.getContext(), R$drawable.ic_s_heart);
        if (drawable == null) {
            return null;
        }
        drawable.setTint(ThemeExtKt.themeColor(this.this$0.getContext(), R$attr.graphicKey));
        return drawable;
    }
}
