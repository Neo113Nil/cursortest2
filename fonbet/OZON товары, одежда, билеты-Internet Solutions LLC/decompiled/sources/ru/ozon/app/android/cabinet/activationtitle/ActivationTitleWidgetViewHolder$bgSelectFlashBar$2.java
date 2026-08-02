package ru.ozon.app.android.cabinet.activationtitle;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cabinet.activationtitle.ActivationTitleWidgetViewHolder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActivationTitleWidgetViewHolder$bgSelectFlashBar$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ ActivationTitleWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivationTitleWidgetViewHolder$bgSelectFlashBar$2(ActivationTitleWidgetViewHolder activationTitleWidgetViewHolder) {
        super(0);
        this.this$0 = activationTitleWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        ActivationTitleWidgetViewHolder.Companion companion;
        GradientDrawable gradientDrawable = new GradientDrawable();
        ActivationTitleWidgetViewHolder activationTitleWidgetViewHolder = this.this$0;
        companion = ActivationTitleWidgetViewHolder.Companion;
        gradientDrawable.setCornerRadius(companion.getBgSelectCornerRadius());
        gradientDrawable.setColor(ThemeExtKt.themeColor(activationTitleWidgetViewHolder.getContext(), R$attr.bgPrimaryInverted));
        return gradientDrawable;
    }
}
