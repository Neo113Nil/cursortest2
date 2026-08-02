package ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BigPromoPDPView$rightButton$2 extends AbstractC7737t implements Function0<ButtonV3View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BigPromoPDPView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BigPromoPDPView$rightButton$2(Context context, BigPromoPDPView bigPromoPDPView) {
        super(0);
        this.$context = context;
        this.this$0 = bigPromoPDPView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3View invoke() {
        ButtonV3View buttonV3View = new ButtonV3View(this.$context, null, 0, 0, 14, null);
        this.this$0.addView(buttonV3View);
        return buttonV3View;
    }
}
