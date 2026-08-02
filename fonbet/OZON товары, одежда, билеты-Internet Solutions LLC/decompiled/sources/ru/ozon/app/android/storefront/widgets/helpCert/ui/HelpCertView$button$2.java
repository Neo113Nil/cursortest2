package ru.ozon.app.android.storefront.widgets.helpCert.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HelpCertView$button$2 extends AbstractC7737t implements Function0<ButtonV3View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ HelpCertView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCertView$button$2(HelpCertView helpCertView, Context context) {
        super(0);
        this.this$0 = helpCertView;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonV3View invoke() {
        HelpCertView helpCertView = this.this$0;
        Context context = this.$context;
        View i11 = q.f64554a.i(N.b(ButtonV3View.class), context);
        if (i11 == null) {
            i11 = new ButtonV3View(context, null, 0, 0, 14, null);
        }
        i11.setId(View.generateViewId());
        i11.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        helpCertView.addView(i11);
        return (ButtonV3View) i11;
    }
}
