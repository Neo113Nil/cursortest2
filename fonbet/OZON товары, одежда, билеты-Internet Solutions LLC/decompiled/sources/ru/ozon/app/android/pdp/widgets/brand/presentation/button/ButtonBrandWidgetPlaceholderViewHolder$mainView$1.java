package ru.ozon.app.android.pdp.widgets.brand.presentation.button;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ButtonBrandWidgetPlaceholderViewHolder$mainView$1 extends AbstractC7737t implements Function0<ButtonV3View> {
    final /* synthetic */ ButtonBrandWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonBrandWidgetPlaceholderViewHolder$mainView$1(ButtonBrandWidgetPlaceholderViewHolder buttonBrandWidgetPlaceholderViewHolder) {
        super(0);
        this.this$0 = buttonBrandWidgetPlaceholderViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3View invoke() {
        return ButtonBrandViewHolder.INSTANCE.createView(this.this$0.getContext());
    }
}
