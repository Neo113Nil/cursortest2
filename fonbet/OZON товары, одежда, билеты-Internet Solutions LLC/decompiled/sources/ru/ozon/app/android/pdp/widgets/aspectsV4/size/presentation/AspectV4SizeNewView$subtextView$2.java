package ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation;

import android.content.Context;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectV4SizeNewView$subtextView$2 extends AbstractC7737t implements Function0<TextAtomV2View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AspectV4SizeNewView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectV4SizeNewView$subtextView$2(Context context, AspectV4SizeNewView aspectV4SizeNewView) {
        super(0);
        this.$context = context;
        this.this$0 = aspectV4SizeNewView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextAtomV2View invoke() {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), this.$context);
        if (textAtomV2View == null) {
            textAtomV2View = new TextAtomV2View(this.$context, null, 0, 6, null);
        }
        textAtomV2View.setId(R$id.aspectSizeSubtext);
        textAtomV2View.setTextIsSelectable(false);
        this.this$0.addView(textAtomV2View);
        return textAtomV2View;
    }
}
