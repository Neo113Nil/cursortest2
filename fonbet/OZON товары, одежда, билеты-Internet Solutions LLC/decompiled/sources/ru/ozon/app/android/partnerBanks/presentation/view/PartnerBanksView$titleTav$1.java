package ru.ozon.app.android.partnerBanks.presentation.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PartnerBanksView$titleTav$1 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PartnerBanksView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartnerBanksView$titleTav$1(Context context, PartnerBanksView partnerBanksView) {
        super(0);
        this.$context = context;
        this.this$0 = partnerBanksView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View textAtomV2View = new TextAtomV2View(this.$context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        this.this$0.addView(textAtomV2View);
        return textAtomV2View;
    }
}
