package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$drawable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DisclosureIconView$iconDown$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisclosureIconView$iconDown$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        return a.getDrawable(this.$context, R$drawable.ic_s_circle_chevron_down_filled);
    }
}
