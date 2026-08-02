package ru.ozon.app.android.monetization.widgets.overlayButton.presentation;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "V", "invoke", "()Landroid/view/View;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
public final class OverlayButtonViewGroup$special$$inlined$lazyView$1 extends AbstractC7737t implements Function0<ButtonV3View> {
    final /* synthetic */ Context $context$inlined;
    final /* synthetic */ ViewGroup $parent;
    final /* synthetic */ OverlayButtonViewGroup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayButtonViewGroup$special$$inlined$lazyView$1(ViewGroup viewGroup, OverlayButtonViewGroup overlayButtonViewGroup, Context context) {
        super(0);
        this.$parent = viewGroup;
        this.this$0 = overlayButtonViewGroup;
        this.$context$inlined = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3View invoke() {
        ButtonV3View createButtonView;
        createButtonView = this.this$0.createButtonView(this.$context$inlined);
        createButtonView.setId(R$id.secondOverlayButtonView);
        ViewGroup viewGroup = this.$parent;
        if (viewGroup != null) {
            viewGroup.addView(createButtonView);
        }
        return createButtonView;
    }
}
