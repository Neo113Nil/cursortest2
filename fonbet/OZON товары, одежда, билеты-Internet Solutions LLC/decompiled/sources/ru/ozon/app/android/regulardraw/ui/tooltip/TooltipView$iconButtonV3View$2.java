package ru.ozon.app.android.regulardraw.ui.tooltip;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TooltipView$iconButtonV3View$2 extends AbstractC7737t implements Function0<IconButtonV3View> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TooltipView$iconButtonV3View$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IconButtonV3View invoke() {
        IconButtonV3View iconButtonV3View = new IconButtonV3View(this.$context, null, 0, 0, 14, null);
        iconButtonV3View.setId(View.generateViewId());
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        return iconButtonV3View;
    }
}
