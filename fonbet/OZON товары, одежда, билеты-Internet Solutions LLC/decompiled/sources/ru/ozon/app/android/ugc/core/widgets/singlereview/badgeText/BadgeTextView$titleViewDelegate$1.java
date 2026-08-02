package ru.ozon.app.android.ugc.core.widgets.singlereview.badgeText;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BadgeTextView$titleViewDelegate$1 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BadgeTextView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BadgeTextView$titleViewDelegate$1(Context context, BadgeTextView badgeTextView) {
        super(0);
        this.$context = context;
        this.this$0 = badgeTextView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        View g10 = q.f64554a.g(N.b(TextAtomV2View.class), this.$context);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        this.this$0.addView(g10);
        return textAtomV2View;
    }
}
