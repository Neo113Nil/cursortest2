package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.commonwidgets.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/LargeBorderlessButtonView;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/LargeBorderlessButtonView;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class BorderlessButtonWidgetViewHolder$buttonView$2 extends AbstractC7737t implements Function0<LargeBorderlessButtonView> {
    final /* synthetic */ View $containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BorderlessButtonWidgetViewHolder$buttonView$2(View view) {
        super(0);
        this.$containerView = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LargeBorderlessButtonView invoke() {
        return (LargeBorderlessButtonView) this.$containerView.findViewById(R$id.borderlessBtn);
    }
}
